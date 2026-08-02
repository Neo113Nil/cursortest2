package com.ironsource;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.g6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2433g6 {
    private final Map<String, List<String>> a;
    private final int b;
    private final boolean c;
    private final long d;
    private final List<C2547md> e;
    private final C2587p f;
    private final int g;
    private final Integer h;

    /* JADX WARN: Multi-variable type inference failed */
    public C2433g6(Map<String, ? extends List<String>> providerOrder, int i, boolean z, long j, List<C2547md> placements, C2587p auction, int i2, Integer num) {
        Intrinsics.checkNotNullParameter(providerOrder, "providerOrder");
        Intrinsics.checkNotNullParameter(placements, "placements");
        Intrinsics.checkNotNullParameter(auction, "auction");
        this.a = providerOrder;
        this.b = i;
        this.c = z;
        this.d = j;
        this.e = placements;
        this.f = auction;
        this.g = i2;
        this.h = num;
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
        if (!(obj instanceof C2433g6)) {
            return false;
        }
        C2433g6 c2433g6 = (C2433g6) obj;
        return Intrinsics.areEqual(this.a, c2433g6.a) && this.b == c2433g6.b && this.c == c2433g6.c && this.d == c2433g6.d && Intrinsics.areEqual(this.e, c2433g6.e) && Intrinsics.areEqual(this.f, c2433g6.f) && this.g == c2433g6.g && Intrinsics.areEqual(this.h, c2433g6.h);
    }

    public final C2587p f() {
        return this.f;
    }

    public final int g() {
        return this.g;
    }

    public final Integer h() {
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
        int hashCode2 = (((((((((hashCode + i) * 31) + Long.hashCode(this.d)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + Integer.hashCode(this.g)) * 31;
        Integer num = this.h;
        return hashCode2 + (num == null ? 0 : num.hashCode());
    }

    public final int i() {
        return this.g;
    }

    public final boolean j() {
        return this.c;
    }

    public final C2587p k() {
        return this.f;
    }

    public final long l() {
        return this.d;
    }

    public final Integer m() {
        return this.h;
    }

    public final int n() {
        return this.b;
    }

    public final List<C2547md> o() {
        return this.e;
    }

    public final Map<String, List<String>> p() {
        return this.a;
    }

    public String toString() {
        return "FullscreenAdFormatConfig2(providerOrder=" + this.a + ", parallelLoad=" + this.b + ", advancedLoading=" + this.c + ", collectBiddingDataTimeout=" + this.d + ", placements=" + this.e + ", auction=" + this.f + ", adapterTimeoutSecs=" + this.g + ", expiredDurationMins=" + this.h + ")";
    }

    public final C2433g6 a(Map<String, ? extends List<String>> providerOrder, int i, boolean z, long j, List<C2547md> placements, C2587p auction, int i2, Integer num) {
        Intrinsics.checkNotNullParameter(providerOrder, "providerOrder");
        Intrinsics.checkNotNullParameter(placements, "placements");
        Intrinsics.checkNotNullParameter(auction, "auction");
        return new C2433g6(providerOrder, i, z, j, placements, auction, i2, num);
    }

    public static /* synthetic */ C2433g6 a(C2433g6 c2433g6, Map map, int i, boolean z, long j, List list, C2587p c2587p, int i2, Integer num, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            map = c2433g6.a;
        }
        if ((i3 & 2) != 0) {
            i = c2433g6.b;
        }
        if ((i3 & 4) != 0) {
            z = c2433g6.c;
        }
        if ((i3 & 8) != 0) {
            j = c2433g6.d;
        }
        if ((i3 & 16) != 0) {
            list = c2433g6.e;
        }
        if ((i3 & 32) != 0) {
            c2587p = c2433g6.f;
        }
        if ((i3 & 64) != 0) {
            i2 = c2433g6.g;
        }
        if ((i3 & 128) != 0) {
            num = c2433g6.h;
        }
        long j2 = j;
        boolean z2 = z;
        return c2433g6.a(map, i, z2, j2, list, c2587p, i2, num);
    }
}
