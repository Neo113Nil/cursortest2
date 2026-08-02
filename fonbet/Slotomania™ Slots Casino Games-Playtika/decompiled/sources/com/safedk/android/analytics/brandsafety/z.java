package com.safedk.android.analytics.brandsafety;

/* loaded from: classes4.dex */
public class z {
    private String a;
    private String b;
    private String c;
    private String d;
    private w e;
    private c f;
    private boolean g = false;

    public z(String str, String str2, String str3, w wVar, c cVar) {
        this.a = str;
        this.b = str2;
        this.d = str3;
        this.e = wVar;
        this.f = cVar;
    }

    public String a() {
        return this.b;
    }

    public void a(String str) {
        this.c = str;
    }

    public String b() {
        return this.c;
    }

    public String c() {
        return this.d;
    }

    public String d() {
        return this.a;
    }

    public void e() {
        this.g = true;
    }

    public void a(w wVar) {
        this.e = wVar;
    }

    public w f() {
        return this.e;
    }

    public void a(c cVar) {
        this.f = cVar;
    }

    public c g() {
        return this.f;
    }

    public String toString() {
        return "WebviewNavigationTracker{ " + this.a + ", " + this.c + ", " + this.d + " }";
    }
}
