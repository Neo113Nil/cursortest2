package com.ironsource;

import java.util.Map;
import xsna.epx;

/* renamed from: com.ironsource.bb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4244bb {
    private final C4365i6 a;
    private final C4365i6 b;
    private final A2 c;
    private final Map<String, Bd> d;

    public C4244bb(C4365i6 c4365i6, C4365i6 c4365i62, A2 a2, Map<String, Bd> map) {
        this.a = c4365i6;
        this.b = c4365i62;
        this.c = a2;
        this.d = map;
    }

    public final C4365i6 a() {
        return this.a;
    }

    public final C4365i6 b() {
        return this.b;
    }

    public final A2 c() {
        return this.c;
    }

    public final Map<String, Bd> d() {
        return this.d;
    }

    public final A2 e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4244bb)) {
            return false;
        }
        C4244bb c4244bb = (C4244bb) obj;
        return epx.f(this.a, c4244bb.a) && epx.f(this.b, c4244bb.b) && epx.f(this.c, c4244bb.c) && epx.f(this.d, c4244bb.d);
    }

    public final C4365i6 f() {
        return this.b;
    }

    public final Map<String, Bd> g() {
        return this.d;
    }

    public final C4365i6 h() {
        return this.a;
    }

    public int hashCode() {
        C4365i6 c4365i6 = this.a;
        int hashCode = (c4365i6 == null ? 0 : c4365i6.hashCode()) * 31;
        C4365i6 c4365i62 = this.b;
        int hashCode2 = (hashCode + (c4365i62 == null ? 0 : c4365i62.hashCode())) * 31;
        A2 a2 = this.c;
        return this.d.hashCode() + ((hashCode2 + (a2 != null ? a2.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "LevelPlayInitConfig2(rewarded=" + this.a + ", interstitial=" + this.b + ", banner=" + this.c + ", providerConfig=" + this.d + ")";
    }

    public final C4244bb a(C4365i6 c4365i6, C4365i6 c4365i62, A2 a2, Map<String, Bd> map) {
        return new C4244bb(c4365i6, c4365i62, a2, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C4244bb a(C4244bb c4244bb, C4365i6 c4365i6, C4365i6 c4365i62, A2 a2, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            c4365i6 = c4244bb.a;
        }
        if ((i & 2) != 0) {
            c4365i62 = c4244bb.b;
        }
        if ((i & 4) != 0) {
            a2 = c4244bb.c;
        }
        if ((i & 8) != 0) {
            map = c4244bb.d;
        }
        return c4244bb.a(c4365i6, c4365i62, a2, map);
    }
}
