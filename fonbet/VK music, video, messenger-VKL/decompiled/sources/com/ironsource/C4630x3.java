package com.ironsource;

import xsna.epx;
import xsna.i5s;
import xsna.urd0;
import xsna.xe9;

/* renamed from: com.ironsource.x3, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4630x3 {
    private String a;
    private String b;
    private String c;

    public C4630x3(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.a;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4630x3)) {
            return false;
        }
        C4630x3 c4630x3 = (C4630x3) obj;
        return epx.f(this.a, c4630x3.a) && epx.f(this.b, c4630x3.b) && epx.f(this.c, c4630x3.c);
    }

    public final String f() {
        return this.b;
    }

    public int hashCode() {
        return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        return i5s.a(xe9.a("CachedResponse(cachedAppKey=", str, ", cachedUserId=", str2, ", cachedSettings="), this.c, ")");
    }

    public final C4630x3 a(String str, String str2, String str3) {
        return new C4630x3(str, str2, str3);
    }

    public final void b(String str) {
        this.c = str;
    }

    public final void c(String str) {
        this.b = str;
    }

    public static /* synthetic */ C4630x3 a(C4630x3 c4630x3, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4630x3.a;
        }
        if ((i & 2) != 0) {
            str2 = c4630x3.b;
        }
        if ((i & 4) != 0) {
            str3 = c4630x3.c;
        }
        return c4630x3.a(str, str2, str3);
    }

    public final void a(String str) {
        this.a = str;
    }
}
