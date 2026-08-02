package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2587p {
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

    public C2587p(String auctionData, String auctioneerURL, String extAuctioneerURL, int i, long j, int i2, boolean z, boolean z2, int i3, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        Intrinsics.checkNotNullParameter(auctioneerURL, "auctioneerURL");
        Intrinsics.checkNotNullParameter(extAuctioneerURL, "extAuctioneerURL");
        this.a = auctionData;
        this.b = auctioneerURL;
        this.c = extAuctioneerURL;
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
        if (!(obj instanceof C2587p)) {
            return false;
        }
        C2587p c2587p = (C2587p) obj;
        return Intrinsics.areEqual(this.a, c2587p.a) && Intrinsics.areEqual(this.b, c2587p.b) && Intrinsics.areEqual(this.c, c2587p.c) && this.d == c2587p.d && this.e == c2587p.e && this.f == c2587p.f && this.g == c2587p.g && this.h == c2587p.h && this.i == c2587p.i && this.j == c2587p.j && this.k == c2587p.k;
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
        int hashCode = ((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + Integer.hashCode(this.d)) * 31) + Long.hashCode(this.e)) * 31) + Integer.hashCode(this.f)) * 31;
        boolean z = this.g;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.h;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int hashCode2 = (((i2 + i3) * 31) + Integer.hashCode(this.i)) * 31;
        boolean z3 = this.j;
        int i4 = z3;
        if (z3 != 0) {
            i4 = 1;
        }
        int i5 = (hashCode2 + i4) * 31;
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
        return "AdFormatAuctionConfig2(auctionData=" + this.a + ", auctioneerURL=" + this.b + ", extAuctioneerURL=" + this.c + ", auctionTrials=" + this.d + ", auctionTimeout=" + this.e + ", auctionSavedHistoryLimit=" + this.f + ", compressAuctionRequest=" + this.g + ", compressAuctionResponse=" + this.h + ", encryptionVersion=" + this.i + ", tokenPerAdapter=" + this.j + ", enableAuctionFallback=" + this.k + ")";
    }

    public final String u() {
        return this.c;
    }

    public final boolean v() {
        return this.j;
    }

    public final C2587p a(String auctionData, String auctioneerURL, String extAuctioneerURL, int i, long j, int i2, boolean z, boolean z2, int i3, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        Intrinsics.checkNotNullParameter(auctioneerURL, "auctioneerURL");
        Intrinsics.checkNotNullParameter(extAuctioneerURL, "extAuctioneerURL");
        return new C2587p(auctionData, auctioneerURL, extAuctioneerURL, i, j, i2, z, z2, i3, z3, z4);
    }

    public static /* synthetic */ C2587p a(C2587p c2587p, String str, String str2, String str3, int i, long j, int i2, boolean z, boolean z2, int i3, boolean z3, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = c2587p.a;
        }
        if ((i4 & 2) != 0) {
            str2 = c2587p.b;
        }
        if ((i4 & 4) != 0) {
            str3 = c2587p.c;
        }
        if ((i4 & 8) != 0) {
            i = c2587p.d;
        }
        if ((i4 & 16) != 0) {
            j = c2587p.e;
        }
        if ((i4 & 32) != 0) {
            i2 = c2587p.f;
        }
        if ((i4 & 64) != 0) {
            z = c2587p.g;
        }
        if ((i4 & 128) != 0) {
            z2 = c2587p.h;
        }
        if ((i4 & 256) != 0) {
            i3 = c2587p.i;
        }
        if ((i4 & 512) != 0) {
            z3 = c2587p.j;
        }
        if ((i4 & 1024) != 0) {
            z4 = c2587p.k;
        }
        boolean z5 = z3;
        boolean z6 = z4;
        long j2 = j;
        String str4 = str3;
        int i5 = i;
        return c2587p.a(str, str2, str4, i5, j2, i2, z, z2, i3, z5, z6);
    }
}
