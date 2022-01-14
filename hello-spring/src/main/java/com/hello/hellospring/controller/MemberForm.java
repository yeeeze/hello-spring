package com.hello.hellospring.controller;

public class MemberForm {
    private String name;    // form에서 넘어오면 spring이 html에 name="name"과 매칭

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
