package com.ironsource;

import android.content.Context;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class V4 {
    private static V4 h;
    private String a;
    private String b;
    private String c;
    private String d;
    private int e;
    private String f;
    private final InterfaceC4339u7 g;

    private V4(Context context) {
        InterfaceC4339u7 a = Ib.a0().a();
        this.g = a;
        this.a = a.q();
        this.b = a.l();
        this.c = a.f();
        this.d = a.i();
        this.e = a.e();
        this.f = a.v(context);
    }

    public static V4 b(Context context) {
        V4 v4 = h;
        if (v4 != null) {
            return v4;
        }
        V4 v42 = new V4(context);
        h = v42;
        return v42;
    }

    public static void g() {
        h = null;
    }

    public float a(Context context) {
        return this.g.F(context);
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.a;
    }

    public String e() {
        return this.c;
    }

    public String f() {
        return this.d;
    }

    public int a() {
        return this.e;
    }

    public String b() {
        return this.f;
    }
}
