package com.mbridge.msdk.splash.request;

import androidx.annotation.NonNull;
import defpackage.wv8;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class f {
    private int a;
    private String b;
    private int c;
    private int d;
    private int e;

    public void a(String str) {
        this.b = str;
    }

    public int b() {
        return this.d;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.a;
    }

    public String e() {
        return this.b;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("NativeAdvancedV3ParamsEntity{reqType=");
        sb.append(this.a);
        sb.append(", session_id='");
        sb.append(this.b);
        sb.append("', offset=");
        sb.append(this.c);
        sb.append(", expectWidth=");
        sb.append(this.d);
        sb.append(", expectHeight=");
        return wv8.j(sb, this.e, '}');
    }

    public int a() {
        return this.e;
    }

    public void b(int i) {
        this.d = i;
    }

    public void c(int i) {
        this.c = i;
    }

    public void d(int i) {
        this.a = i;
    }

    public void a(int i) {
        this.e = i;
    }
}
