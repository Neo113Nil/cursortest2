package com.vk.dto.common.data;

import java.util.ArrayList;

/* loaded from: classes18.dex */
public class VKFromList<T> extends ArrayList<T> {
    private String from;

    public VKFromList(String str) {
        this.from = str;
    }

    public final String i() {
        return this.from;
    }

    public String s1() {
        return i();
    }
}
