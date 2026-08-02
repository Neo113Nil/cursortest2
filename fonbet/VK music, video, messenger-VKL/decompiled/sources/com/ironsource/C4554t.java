package com.ironsource;

import xsna.efz;
import xsna.epx;
import xsna.urd0;

/* renamed from: com.ironsource.t, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4554t {
    private final String a;
    private final EnumC4493p9 b;
    private final boolean c;
    private final String d;
    private final long e;

    public C4554t(String str, EnumC4493p9 enumC4493p9, boolean z, String str2, long j) {
        this.a = str;
        this.b = enumC4493p9;
        this.c = z;
        this.d = str2;
        this.e = j;
    }

    public final String a() {
        return this.a;
    }

    public final EnumC4493p9 b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final long e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4554t)) {
            return false;
        }
        C4554t c4554t = (C4554t) obj;
        return epx.f(this.a, c4554t.a) && this.b == c4554t.b && this.c == c4554t.c && epx.f(this.d, c4554t.d) && this.e == c4554t.e;
    }

    public final String f() {
        return this.a;
    }

    public final EnumC4493p9 g() {
        return this.b;
    }

    public final long h() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return Long.hashCode(this.e) + urd0.a((hashCode + i) * 31, 31, this.d);
    }

    public final String i() {
        return this.d;
    }

    public final boolean j() {
        return this.c;
    }

    public String toString() {
        String str = this.a;
        EnumC4493p9 enumC4493p9 = this.b;
        boolean z = this.c;
        String str2 = this.d;
        long j = this.e;
        StringBuilder sb = new StringBuilder("AdFormatConfig(adSourceNameForEvents=");
        sb.append(str);
        sb.append(", instanceType=");
        sb.append(enumC4493p9);
        sb.append(", isOneFlow=");
        sb.append(z);
        sb.append(", providerName=");
        sb.append(str2);
        sb.append(", loadTimeoutInMillis=");
        return efz.b(j, ")", sb);
    }

    public final C4554t a(String str, EnumC4493p9 enumC4493p9, boolean z, String str2, long j) {
        return new C4554t(str, enumC4493p9, z, str2, j);
    }

    public static /* synthetic */ C4554t a(C4554t c4554t, String str, EnumC4493p9 enumC4493p9, boolean z, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4554t.a;
        }
        if ((i & 2) != 0) {
            enumC4493p9 = c4554t.b;
        }
        if ((i & 4) != 0) {
            z = c4554t.c;
        }
        if ((i & 8) != 0) {
            str2 = c4554t.d;
        }
        if ((i & 16) != 0) {
            j = c4554t.e;
        }
        long j2 = j;
        return c4554t.a(str, enumC4493p9, z, str2, j2);
    }
}
