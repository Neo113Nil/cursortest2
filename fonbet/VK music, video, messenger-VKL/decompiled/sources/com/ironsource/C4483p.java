package com.ironsource;

import xsna.bh10;
import xsna.epx;
import xsna.nyh0;
import xsna.shy;
import xsna.urd0;
import xsna.xe9;

/* renamed from: com.ironsource.p, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4483p {
    private final String a;
    private final String b;
    private final String c;
    private final int d;
    private final long e;
    private final int f;
    private final boolean g;
    private final boolean h;
    private final int i;
    private final boolean j;
    private final boolean k;

    public C4483p(String str, String str2, String str3, int i, long j, int i2, boolean z, boolean z2, int i3, boolean z3, boolean z4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = j;
        this.f = i2;
        this.g = z;
        this.h = z2;
        this.i = i3;
        this.j = z3;
        this.k = z4;
    }

    public final String a() {
        return this.a;
    }

    public final boolean b() {
        return this.j;
    }

    public final boolean c() {
        return this.k;
    }

    public final String d() {
        return this.b;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4483p)) {
            return false;
        }
        C4483p c4483p = (C4483p) obj;
        return epx.f(this.a, c4483p.a) && epx.f(this.b, c4483p.b) && epx.f(this.c, c4483p.c) && this.d == c4483p.d && this.e == c4483p.e && this.f == c4483p.f && this.g == c4483p.g && this.h == c4483p.h && this.i == c4483p.i && this.j == c4483p.j && this.k == c4483p.k;
    }

    public final int f() {
        return this.d;
    }

    public final long g() {
        return this.e;
    }

    public final int h() {
        return this.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int a = shy.a(this.f, bh10.a(shy.a(this.d, urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31);
        boolean z = this.g;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (a + i) * 31;
        boolean z2 = this.h;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int a2 = shy.a(this.i, (i2 + i3) * 31, 31);
        boolean z3 = this.j;
        int i4 = z3;
        if (z3 != 0) {
            i4 = 1;
        }
        int i5 = (a2 + i4) * 31;
        boolean z4 = this.k;
        return i5 + (z4 ? 1 : z4 ? 1 : 0);
    }

    public final boolean i() {
        return this.g;
    }

    public final boolean j() {
        return this.h;
    }

    public final int k() {
        return this.i;
    }

    public final String l() {
        return this.a;
    }

    public final int m() {
        return this.f;
    }

    public final long n() {
        return this.e;
    }

    public final int o() {
        return this.d;
    }

    public final String p() {
        return this.b;
    }

    public final boolean q() {
        return this.g;
    }

    public final boolean r() {
        return this.h;
    }

    public final boolean s() {
        return this.k;
    }

    public final int t() {
        return this.i;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        int i = this.d;
        long j = this.e;
        int i2 = this.f;
        boolean z = this.g;
        boolean z2 = this.h;
        int i3 = this.i;
        boolean z3 = this.j;
        boolean z4 = this.k;
        StringBuilder a = xe9.a("AdFormatAuctionConfig2(auctionData=", str, ", auctioneerURL=", str2, ", extAuctioneerURL=");
        nyh0.a(i, str3, ", auctionTrials=", ", auctionTimeout=", a);
        a.append(j);
        a.append(", auctionSavedHistoryLimit=");
        a.append(i2);
        a.append(", compressAuctionRequest=");
        a.append(z);
        a.append(", compressAuctionResponse=");
        a.append(z2);
        a.append(", encryptionVersion=");
        a.append(i3);
        a.append(", tokenPerAdapter=");
        a.append(z3);
        a.append(", enableAuctionFallback=");
        a.append(z4);
        a.append(")");
        return a.toString();
    }

    public final String u() {
        return this.c;
    }

    public final boolean v() {
        return this.j;
    }

    public final C4483p a(String str, String str2, String str3, int i, long j, int i2, boolean z, boolean z2, int i3, boolean z3, boolean z4) {
        return new C4483p(str, str2, str3, i, j, i2, z, z2, i3, z3, z4);
    }

    public static /* synthetic */ C4483p a(C4483p c4483p, String str, String str2, String str3, int i, long j, int i2, boolean z, boolean z2, int i3, boolean z3, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = c4483p.a;
        }
        if ((i4 & 2) != 0) {
            str2 = c4483p.b;
        }
        if ((i4 & 4) != 0) {
            str3 = c4483p.c;
        }
        if ((i4 & 8) != 0) {
            i = c4483p.d;
        }
        if ((i4 & 16) != 0) {
            j = c4483p.e;
        }
        if ((i4 & 32) != 0) {
            i2 = c4483p.f;
        }
        if ((i4 & 64) != 0) {
            z = c4483p.g;
        }
        if ((i4 & 128) != 0) {
            z2 = c4483p.h;
        }
        if ((i4 & 256) != 0) {
            i3 = c4483p.i;
        }
        if ((i4 & 512) != 0) {
            z3 = c4483p.j;
        }
        if ((i4 & 1024) != 0) {
            z4 = c4483p.k;
        }
        boolean z5 = z3;
        boolean z6 = z4;
        long j2 = j;
        String str4 = str3;
        int i5 = i;
        return c4483p.a(str, str2, str4, i5, j2, i2, z, z2, i3, z5, z6);
    }
}
