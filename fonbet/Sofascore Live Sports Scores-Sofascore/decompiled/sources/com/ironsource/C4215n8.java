package com.ironsource;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.n8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4215n8 {
    public static final int c = 1001;
    private String a;
    private int b;

    public C4215n8(int i, String str) {
        this.b = i;
        this.a = str == null ? "" : str;
    }

    public int a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }

    public String toString() {
        return "error - code:" + this.b + ", message:" + this.a;
    }
}
