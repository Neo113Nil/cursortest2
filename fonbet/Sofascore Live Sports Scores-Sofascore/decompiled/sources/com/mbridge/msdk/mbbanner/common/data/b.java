package com.mbridge.msdk.mbbanner.common.data;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class b {
    private String a;
    private String b;
    private String c = "";
    private int d;
    private int e;

    public b(String str, String str2, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.d = i;
        this.e = i2;
    }

    public void a(int i) {
        this.d = i;
    }

    public void b(String str) {
        this.b = str;
    }

    public int c() {
        return this.d;
    }

    public String d() {
        return this.b;
    }

    public String a() {
        return this.c;
    }

    public int b() {
        return this.e;
    }

    public void a(String str) {
        this.c = str;
    }
}
