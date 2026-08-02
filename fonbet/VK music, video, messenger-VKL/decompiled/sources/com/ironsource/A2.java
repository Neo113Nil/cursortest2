package com.ironsource;

import java.util.List;
import java.util.Map;
import xsna.bh10;
import xsna.epx;
import xsna.fw3;
import xsna.shy;
import xsna.tj0;

/* loaded from: classes13.dex */
public final class A2 {
    private final Map<String, List<String>> a;
    private final int b;
    private final boolean c;
    private final long d;
    private final List<C4443md> e;
    private final C4483p f;
    private final long g;
    private final int h;
    private final long i;

    /* JADX WARN: Multi-variable type inference failed */
    public A2(Map<String, ? extends List<String>> map, int i, boolean z, long j, List<C4443md> list, C4483p c4483p, long j2, int i2, long j3) {
        this.a = map;
        this.b = i;
        this.c = z;
        this.d = j;
        this.e = list;
        this.f = c4483p;
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

    public final List<C4443md> e() {
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
        return epx.f(this.a, a2.a) && this.b == a2.b && this.c == a2.c && this.d == a2.d && epx.f(this.e, a2.e) && epx.f(this.f, a2.f) && this.g == a2.g && this.h == a2.h && this.i == a2.i;
    }

    public final C4483p f() {
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
        int a = shy.a(this.b, this.a.hashCode() * 31, 31);
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return Long.hashCode(this.i) + shy.a(this.h, bh10.a((this.f.hashCode() + fw3.a(bh10.a((a + i) * 31, 31, this.d), 31, this.e)) * 31, 31, this.g), 31);
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

    public final C4483p l() {
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

    public final List<C4443md> q() {
        return this.e;
    }

    public final Map<String, List<String>> r() {
        return this.a;
    }

    public String toString() {
        Map<String, List<String>> map = this.a;
        int i = this.b;
        boolean z = this.c;
        long j = this.d;
        List<C4443md> list = this.e;
        C4483p c4483p = this.f;
        long j2 = this.g;
        int i2 = this.h;
        long j3 = this.i;
        StringBuilder sb = new StringBuilder("BannerAdFormatConfig2(providerOrder=");
        sb.append(map);
        sb.append(", parallelLoad=");
        sb.append(i);
        sb.append(", advancedLoading=");
        sb.append(z);
        sb.append(", collectBiddingDataTimeout=");
        sb.append(j);
        sb.append(", placements=");
        sb.append(list);
        sb.append(", auction=");
        sb.append(c4483p);
        tj0.d(sb, ", adapterTimeoutMillis=", j2, ", bannerInterval=");
        sb.append(i2);
        sb.append(", impressionTimeout=");
        sb.append(j3);
        sb.append(")");
        return sb.toString();
    }

    public final A2 a(Map<String, ? extends List<String>> map, int i, boolean z, long j, List<C4443md> list, C4483p c4483p, long j2, int i2, long j3) {
        return new A2(map, i, z, j, list, c4483p, j2, i2, j3);
    }

    public static /* synthetic */ A2 a(A2 a2, Map map, int i, boolean z, long j, List list, C4483p c4483p, long j2, int i2, long j3, int i3, Object obj) {
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
            c4483p = a2.f;
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
        return a2.a(map, i, z2, j5, list2, c4483p, j4, i4, j3);
    }
}
