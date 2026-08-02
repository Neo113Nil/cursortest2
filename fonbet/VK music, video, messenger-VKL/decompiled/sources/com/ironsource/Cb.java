package com.ironsource;

import xsna.bh10;
import xsna.epx;
import xsna.urd0;
import xsna.zcl;

/* loaded from: classes13.dex */
public final class Cb {
    private final EnumC4493p9 a;
    private final String b;
    private final long c;
    private final boolean d;
    private final boolean e;

    public Cb(EnumC4493p9 enumC4493p9, String str, long j, boolean z, boolean z2) {
        this.a = enumC4493p9;
        this.b = str;
        this.c = j;
        this.d = z;
        this.e = z2;
    }

    public final EnumC4493p9 a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cb)) {
            return false;
        }
        Cb cb = (Cb) obj;
        return this.a == cb.a && epx.f(this.b, cb.b) && this.c == cb.c && this.d == cb.d && this.e == cb.e;
    }

    public final String f() {
        return this.b;
    }

    public final EnumC4493p9 g() {
        return this.a;
    }

    public final long h() {
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int a = bh10.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        boolean z = this.d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (a + i) * 31;
        boolean z2 = this.e;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final boolean i() {
        return this.e;
    }

    public final boolean j() {
        return this.d;
    }

    public String toString() {
        return "LoadTaskConfig(instanceType=" + this.a + ", adSourceNameForEvents=" + this.b + ", loadTimeoutInMills=" + this.c + ", isOneFlow=" + this.d + ", isMultipleAdObjects=" + this.e + ")";
    }

    public final Cb a(EnumC4493p9 enumC4493p9, String str, long j, boolean z, boolean z2) {
        return new Cb(enumC4493p9, str, j, z, z2);
    }

    public static /* synthetic */ Cb a(Cb cb, EnumC4493p9 enumC4493p9, String str, long j, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC4493p9 = cb.a;
        }
        if ((i & 2) != 0) {
            str = cb.b;
        }
        if ((i & 4) != 0) {
            j = cb.c;
        }
        if ((i & 8) != 0) {
            z = cb.d;
        }
        if ((i & 16) != 0) {
            z2 = cb.e;
        }
        long j2 = j;
        return cb.a(enumC4493p9, str, j2, z, z2);
    }

    public /* synthetic */ Cb(EnumC4493p9 enumC4493p9, String str, long j, boolean z, boolean z2, int i, zcl zclVar) {
        this(enumC4493p9, str, j, z, (i & 16) != 0 ? true : z2);
    }
}
