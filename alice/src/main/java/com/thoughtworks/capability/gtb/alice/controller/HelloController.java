package com.thoughtworks.capability.gtb.alice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    private RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/hello")
    public String sayHello(){
        String url = "http://bob:8081/hello";
        return restTemplate.getForObject(url, String.class);
    }
}
