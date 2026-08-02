package com.ironsource;

import java.util.List;
import java.util.Map;
import xsna.bh10;
import xsna.epx;
import xsna.fw3;
import xsna.shy;

/* renamed from: com.ironsource.i6, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4365i6 {
    private final Map<String, List<String>> a;
    private final int b;
    private final boolean c;
    private final long d;
    private final List<C4443md> e;
    private final C4483p f;
    private final int g;
    private final Integer h;

    /* JADX WARN: Multi-variable type inference failed */
    public C4365i6(Map<String, ? extends List<String>> map, int i, boolean z, long j, List<C4443md> list, C4483p c4483p, int i2, Integer num) {
        this.a = map;
        this.b = i;
        this.c = z;
        this.d = j;
        this.e = list;
        this.f = c4483p;
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

    public final List<C4443md> e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4365i6)) {
            return false;
        }
        C4365i6 c4365i6 = (C4365i6) obj;
        return epx.f(this.a, c4365i6.a) && this.b == c4365i6.b && this.c == c4365i6.c && this.d == c4365i6.d && epx.f(this.e, c4365i6.e) && epx.f(this.f, c4365i6.f) && this.g == c4365i6.g && epx.f(this.h, c4365i6.h);
    }

    public final C4483p f() {
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
        int a = shy.a(this.b, this.a.hashCode() * 31, 31);
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int a2 = shy.a(this.g, (this.f.hashCode() + fw3.a(bh10.a((a + i) * 31, 31, this.d), 31, this.e)) * 31, 31);
        Integer num = this.h;
        return a2 + (num == null ? 0 : num.hashCode());
    }

    public final int i() {
        return this.g;
    }

    public final boolean j() {
        return this.c;
    }

    public final C4483p k() {
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

    public final List<C4443md> o() {
        return this.e;
    }

    public final Map<String, List<String>> p() {
        return this.a;
    }

    public String toString() {
        return "FullscreenAdFormatConfig2(providerOrder=" + this.a + ", parallelLoad=" + this.b + ", advancedLoading=" + this.c + ", collectBiddingDataTimeout=" + this.d + ", placements=" + this.e + ", auction=" + this.f + ", adapterTimeoutSecs=" + this.g + ", expiredDurationMins=" + this.h + ")";
    }

    public final C4365i6 a(Map<String, ? extends List<String>> map, int i, boolean z, long j, List<C4443md> list, C4483p c4483p, int i2, Integer num) {
        return new C4365i6(map, i, z, j, list, c4483p, i2, num);
    }

    public static /* synthetic */ C4365i6 a(C4365i6 c4365i6, Map map, int i, boolean z, long j, List list, C4483p c4483p, int i2, Integer num, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            map = c4365i6.a;
        }
        if ((i3 & 2) != 0) {
            i = c4365i6.b;
        }
        if ((i3 & 4) != 0) {
            z = c4365i6.c;
        }
        if ((i3 & 8) != 0) {
            j = c4365i6.d;
        }
        if ((i3 & 16) != 0) {
            list = c4365i6.e;
        }
        if ((i3 & 32) != 0) {
            c4483p = c4365i6.f;
        }
        if ((i3 & 64) != 0) {
            i2 = c4365i6.g;
        }
        if ((i3 & 128) != 0) {
            num = c4365i6.h;
        }
        long j2 = j;
        boolean z2 = z;
        return c4365i6.a(map, i, z2, j2, list, c4483p, i2, num);
    }
}
