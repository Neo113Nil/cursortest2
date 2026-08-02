package com.applovin.impl;

import java.util.Map;

/* loaded from: classes3.dex */
public class q4 {
    private final String a;
    private Map b;

    private q4(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public static q4 a(String str) {
        return a(str, null);
    }

    public String b() {
        return this.a;
    }

    public String toString() {
        return "PendingReward{result='" + this.a + "'params='" + this.b + "'}";
    }

    public static q4 a(String str, Map map) {
        return new q4(str, map);
    }

    public Map a() {
        return this.b;
    }
}
