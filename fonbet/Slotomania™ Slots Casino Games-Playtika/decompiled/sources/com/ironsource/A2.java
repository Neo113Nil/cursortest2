package com.ironsource;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class A2 {
    private final Map<String, List<String>> a;
    private final int b;
    private final boolean c;
    private final long d;
    private final List<C2547md> e;
    private final C2587p f;
    private final long g;
    private final int h;
    private final long i;

    /* JADX WARN: Multi-variable type inference failed */
    public A2(Map<String, ? extends List<String>> providerOrder, int i, boolean z, long j, List<C2547md> placements, C2587p auction, long j2, int i2, long j3) {
        Intrinsics.checkNotNullParameter(providerOrder, "providerOrder");
        Intrinsics.checkNotNullParameter(placements, "placements");
        Intrinsics.checkNotNullParameter(auction, "auction");
        this.a = providerOrder;
        this.b = i;
        this.c = z;
        this.d = j;
        this.e = placements;
        this.f = auction;
        this.g = j2;
        this.h = i2;
        this.i = j3;
    }

    public final Map<String, List<String>> a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final long d() {
        return this.d;
    }

    public final List<C2547md> e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A2)) {
            return false;
        }
        A2 a2 = (A2) obj;
        return Intrinsics.areEqual(this.a, a2.a) && this.b == a2.b && this.c == a2.c && this.d == a2.d && Intrinsics.areEqual(this.e, a2.e) && Intrinsics.areEqual(this.f, a2.f) && this.g == a2.g && this.h == a2.h && this.i == a2.i;
    }

    public final C2587p f() {
        return this.f;
    }

    public final long g() {
        return this.g;
    }

    public final int h() {
        return this.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + Integer.hashCode(this.b)) * 31;
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((((((((((((hashCode + i) * 31) + Long.hashCode(this.d)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + Long.hashCode(this.g)) * 31) + Integer.hashCode(this.h)) * 31) + Long.hashCode(this.i);
    }

    public final long i() {
        return this.i;
    }

    public final long j() {
        return this.g;
    }

    public final boolean k() {
        return this.c;
    }

    public final C2587p l() {
        return this.f;
    }

    public final int m() {
        return this.h;
    }

    public final long n() {
        return this.d;
    }

    public final long o() {
        return this.i;
    }

    public final int p() {
        return this.b;
    }

    public final List<C2547md> q() {
        return this.e;
    }

    public final Map<String, List<String>> r() {
        return this.a;
    }

    public String toString() {
        return "BannerAdFormatConfig2(providerOrder=" + this.a + ", parallelLoad=" + this.b + ", advancedLoading=" + this.c + ", collectBiddingDataTimeout=" + this.d + ", placements=" + this.e + ", auction=" + this.f + ", adapterTimeoutMillis=" + this.g + ", bannerInterval=" + this.h + ", impressionTimeout=" + this.i + ")";
    }

    public final A2 a(Map<String, ? extends List<String>> providerOrder, int i, boolean z, long j, List<C2547md> placements, C2587p auction, long j2, int i2, long j3) {
        Intrinsics.checkNotNullParameter(providerOrder, "providerOrder");
        Intrinsics.checkNotNullParameter(placements, "placements");
        Intrinsics.checkNotNullParameter(auction, "auction");
        return new A2(providerOrder, i, z, j, placements, auction, j2, i2, j3);
    }

    public static /* synthetic */ A2 a(A2 a2, Map map, int i, boolean z, long j, List list, C2587p c2587p, long j2, int i2, long j3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            map = a2.a;
        }
        if ((i3 & 2) != 0) {
            i = a2.b;
        }
        if ((i3 & 4) != 0) {
            z = a2.c;
        }
        if ((i3 & 8) != 0) {
            j = a2.d;
        }
        if ((i3 & 16) != 0) {
            list = a2.e;
        }
        if ((i3 & 32) != 0) {
            c2587p = a2.f;
        }
        if ((i3 & 64) != 0) {
            j2 = a2.g;
        }
        if ((i3 & 128) != 0) {
            i2 = a2.h;
        }
        if ((i3 & 256) != 0) {
            j3 = a2.i;
        }
        int i4 = i2;
        long j4 = j2;
        List list2 = list;
        long j5 = j;
        boolean z2 = z;
        return a2.a(map, i, z2, j5, list2, c2587p, j4, i4, j3);
    }
}
