package com.ironsource;

import xsna.epx;
import xsna.zcl;

/* loaded from: classes13.dex */
public final class N3 {
    private final C4301ee a;
    private final E9 b;
    private final U2 c;
    private final Qb d;
    private final C1 e;
    private final C4231ag f;
    private final com.ironsource.mediationsdk.adquality.a g;

    public static final class a {
        private C4301ee a;
        private E9 b;
        private U2 c;
        private Qb d;
        private C1 e;
        private C4231ag f;
        private com.ironsource.mediationsdk.adquality.a g;

        public a() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        public final a a(C4301ee c4301ee, E9 e9, U2 u2, Qb qb, C1 c1, C4231ag c4231ag, com.ironsource.mediationsdk.adquality.a aVar) {
            return new a(c4301ee, e9, u2, qb, c1, c4231ag, aVar);
        }

        public final C4301ee b() {
            return this.a;
        }

        public final E9 c() {
            return this.b;
        }

        public final U2 d() {
            return this.c;
        }

        public final Qb e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g);
        }

        public final C1 f() {
            return this.e;
        }

        public final C4231ag g() {
            return this.f;
        }

        public final com.ironsource.mediationsdk.adquality.a h() {
            return this.g;
        }

        public int hashCode() {
            C4301ee c4301ee = this.a;
            int hashCode = (c4301ee == null ? 0 : c4301ee.hashCode()) * 31;
            E9 e9 = this.b;
            int hashCode2 = (hashCode + (e9 == null ? 0 : e9.hashCode())) * 31;
            U2 u2 = this.c;
            int hashCode3 = (hashCode2 + (u2 == null ? 0 : u2.hashCode())) * 31;
            Qb qb = this.d;
            int hashCode4 = (hashCode3 + (qb == null ? 0 : qb.hashCode())) * 31;
            C1 c1 = this.e;
            int hashCode5 = (hashCode4 + (c1 == null ? 0 : c1.hashCode())) * 31;
            C4231ag c4231ag = this.f;
            int hashCode6 = (hashCode5 + (c4231ag == null ? 0 : c4231ag.hashCode())) * 31;
            com.ironsource.mediationsdk.adquality.a aVar = this.g;
            return hashCode6 + (aVar != null ? aVar.hashCode() : 0);
        }

        public final com.ironsource.mediationsdk.adquality.a i() {
            return this.g;
        }

        public final C1 j() {
            return this.e;
        }

        public final U2 k() {
            return this.c;
        }

        public final E9 l() {
            return this.b;
        }

        public final Qb m() {
            return this.d;
        }

        public final C4301ee n() {
            return this.a;
        }

        public final C4231ag o() {
            return this.f;
        }

        public String toString() {
            return "Builder(rewardedVideoConfigurations=" + this.a + ", interstitialConfigurations=" + this.b + ", bannerConfigurations=" + this.c + ", nativeAdConfigurations=" + this.d + ", applicationConfigurations=" + this.e + ", testSuiteSettings=" + this.f + ", adQualityConfigurations=" + this.g + ")";
        }

        public a(C4301ee c4301ee, E9 e9, U2 u2, Qb qb, C1 c1, C4231ag c4231ag, com.ironsource.mediationsdk.adquality.a aVar) {
            this.a = c4301ee;
            this.b = e9;
            this.c = u2;
            this.d = qb;
            this.e = c1;
            this.f = c4231ag;
            this.g = aVar;
        }

        public static /* synthetic */ a a(a aVar, C4301ee c4301ee, E9 e9, U2 u2, Qb qb, C1 c1, C4231ag c4231ag, com.ironsource.mediationsdk.adquality.a aVar2, int i, Object obj) {
            if ((i & 1) != 0) {
                c4301ee = aVar.a;
            }
            if ((i & 2) != 0) {
                e9 = aVar.b;
            }
            if ((i & 4) != 0) {
                u2 = aVar.c;
            }
            if ((i & 8) != 0) {
                qb = aVar.d;
            }
            if ((i & 16) != 0) {
                c1 = aVar.e;
            }
            if ((i & 32) != 0) {
                c4231ag = aVar.f;
            }
            if ((i & 64) != 0) {
                aVar2 = aVar.g;
            }
            C4231ag c4231ag2 = c4231ag;
            com.ironsource.mediationsdk.adquality.a aVar3 = aVar2;
            C1 c12 = c1;
            U2 u22 = u2;
            return aVar.a(c4301ee, e9, u22, qb, c12, c4231ag2, aVar3);
        }

        public final void b(C4301ee c4301ee) {
            this.a = c4301ee;
        }

        public final void a(C4231ag c4231ag) {
            this.f = c4231ag;
        }

        public final void b(E9 e9) {
            this.b = e9;
        }

        public final a a(C4301ee c4301ee) {
            this.a = c4301ee;
            return this;
        }

        public final void b(U2 u2) {
            this.c = u2;
        }

        public final a a(E9 e9) {
            this.b = e9;
            return this;
        }

        public final void b(Qb qb) {
            this.d = qb;
        }

        public final a a(U2 u2) {
            this.c = u2;
            return this;
        }

        public final void b(C1 c1) {
            this.e = c1;
        }

        public final a a(Qb qb) {
            this.d = qb;
            return this;
        }

        public final void b(com.ironsource.mediationsdk.adquality.a aVar) {
            this.g = aVar;
        }

        public final a a(C1 c1) {
            this.e = c1;
            return this;
        }

        public final a b(C4231ag c4231ag) {
            this.f = c4231ag;
            return this;
        }

        public final a a(com.ironsource.mediationsdk.adquality.a aVar) {
            this.g = aVar;
            return this;
        }

        public /* synthetic */ a(C4301ee c4301ee, E9 e9, U2 u2, Qb qb, C1 c1, C4231ag c4231ag, com.ironsource.mediationsdk.adquality.a aVar, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : c4301ee, (i & 2) != 0 ? null : e9, (i & 4) != 0 ? null : u2, (i & 8) != 0 ? null : qb, (i & 16) != 0 ? null : c1, (i & 32) != 0 ? null : c4231ag, (i & 64) != 0 ? null : aVar);
        }

        public final N3 a() {
            return new N3(this.a, this.b, this.c, this.d, this.e, this.f, this.g, null);
        }
    }

    public /* synthetic */ N3(C4301ee c4301ee, E9 e9, U2 u2, Qb qb, C1 c1, C4231ag c4231ag, com.ironsource.mediationsdk.adquality.a aVar, zcl zclVar) {
        this(c4301ee, e9, u2, qb, c1, c4231ag, aVar);
    }

    public final com.ironsource.mediationsdk.adquality.a a() {
        return this.g;
    }

    public final C1 b() {
        return this.e;
    }

    public final U2 c() {
        return this.c;
    }

    public final E9 d() {
        return this.b;
    }

    public final Qb e() {
        return this.d;
    }

    public final C4301ee f() {
        return this.a;
    }

    public final C4231ag g() {
        return this.f;
    }

    public String toString() {
        return "configurations(\n" + this.a + "\n" + this.b + "\n" + this.c + "\n" + this.d + ")";
    }

    private N3(C4301ee c4301ee, E9 e9, U2 u2, Qb qb, C1 c1, C4231ag c4231ag, com.ironsource.mediationsdk.adquality.a aVar) {
        this.a = c4301ee;
        this.b = e9;
        this.c = u2;
        this.d = qb;
        this.e = c1;
        this.f = c4231ag;
        this.g = aVar;
    }
}
