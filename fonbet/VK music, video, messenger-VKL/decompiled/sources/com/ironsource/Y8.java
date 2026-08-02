package com.ironsource;

import xsna.epx;
import xsna.ss9;

/* loaded from: classes13.dex */
public final class Y8 {
    private final String a;
    private final String b;
    private X c;
    private boolean d;
    private String e;
    private String f;

    public Y8(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean c() {
        return this.d;
    }

    public final String d() {
        return this.a;
    }

    public final X e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y8)) {
            return false;
        }
        Y8 y8 = (Y8) obj;
        return epx.f(this.a, y8.a) && epx.f(this.b, y8.b);
    }

    public final String f() {
        return this.f;
    }

    public final String g() {
        return this.e;
    }

    public final String h() {
        return this.b;
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public String toString() {
        return ss9.a("InitConfig(appKey=", this.a, ", userId=", this.b, ")");
    }

    public final Y8 a(String str, String str2) {
        return new Y8(str, str2);
    }

    public final void b(String str) {
        this.e = str;
    }

    public static /* synthetic */ Y8 a(Y8 y8, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = y8.a;
        }
        if ((i & 2) != 0) {
            str2 = y8.b;
        }
        return y8.a(str, str2);
    }

    public final void a(X x) {
        this.c = x;
    }

    public final void a(boolean z) {
        this.d = z;
    }

    public final void a(String str) {
        this.f = str;
    }

    public final <T> T a(Jb<Y8, T> jb) {
        return jb.a(this);
    }
}
