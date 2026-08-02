package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class N3 {
    private final C2405ee a;
    private final D9 b;
    private final U2 c;
    private final Pb d;
    private final C1 e;
    private final Xf f;
    private final com.ironsource.mediationsdk.adquality.a g;

    public static final class a {
        private C2405ee a;
        private D9 b;
        private U2 c;
        private Pb d;
        private C1 e;
        private Xf f;
        private com.ironsource.mediationsdk.adquality.a g;

        public a() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        public final a a(C2405ee c2405ee, D9 d9, U2 u2, Pb pb, C1 c1, Xf xf, com.ironsource.mediationsdk.adquality.a aVar) {
            return new a(c2405ee, d9, u2, pb, c1, xf, aVar);
        }

        public final C2405ee b() {
            return this.a;
        }

        public final D9 c() {
            return this.b;
        }

        public final U2 d() {
            return this.c;
        }

        public final Pb e() {
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
            return Intrinsics.areEqual(this.a, aVar.a) && Intrinsics.areEqual(this.b, aVar.b) && Intrinsics.areEqual(this.c, aVar.c) && Intrinsics.areEqual(this.d, aVar.d) && Intrinsics.areEqual(this.e, aVar.e) && Intrinsics.areEqual(this.f, aVar.f) && Intrinsics.areEqual(this.g, aVar.g);
        }

        public final C1 f() {
            return this.e;
        }

        public final Xf g() {
            return this.f;
        }

        public final com.ironsource.mediationsdk.adquality.a h() {
            return this.g;
        }

        public int hashCode() {
            C2405ee c2405ee = this.a;
            int hashCode = (c2405ee == null ? 0 : c2405ee.hashCode()) * 31;
            D9 d9 = this.b;
            int hashCode2 = (hashCode + (d9 == null ? 0 : d9.hashCode())) * 31;
            U2 u2 = this.c;
            int hashCode3 = (hashCode2 + (u2 == null ? 0 : u2.hashCode())) * 31;
            Pb pb = this.d;
            int hashCode4 = (hashCode3 + (pb == null ? 0 : pb.hashCode())) * 31;
            C1 c1 = this.e;
            int hashCode5 = (hashCode4 + (c1 == null ? 0 : c1.hashCode())) * 31;
            Xf xf = this.f;
            int hashCode6 = (hashCode5 + (xf == null ? 0 : xf.hashCode())) * 31;
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

        public final D9 l() {
            return this.b;
        }

        public final Pb m() {
            return this.d;
        }

        public final C2405ee n() {
            return this.a;
        }

        public final Xf o() {
            return this.f;
        }

        public String toString() {
            return "Builder(rewardedVideoConfigurations=" + this.a + ", interstitialConfigurations=" + this.b + ", bannerConfigurations=" + this.c + ", nativeAdConfigurations=" + this.d + ", applicationConfigurations=" + this.e + ", testSuiteSettings=" + this.f + ", adQualityConfigurations=" + this.g + ")";
        }

        public a(C2405ee c2405ee, D9 d9, U2 u2, Pb pb, C1 c1, Xf xf, com.ironsource.mediationsdk.adquality.a aVar) {
            this.a = c2405ee;
            this.b = d9;
            this.c = u2;
            this.d = pb;
            this.e = c1;
            this.f = xf;
            this.g = aVar;
        }

        public static /* synthetic */ a a(a aVar, C2405ee c2405ee, D9 d9, U2 u2, Pb pb, C1 c1, Xf xf, com.ironsource.mediationsdk.adquality.a aVar2, int i, Object obj) {
            if ((i & 1) != 0) {
                c2405ee = aVar.a;
            }
            if ((i & 2) != 0) {
                d9 = aVar.b;
            }
            if ((i & 4) != 0) {
                u2 = aVar.c;
            }
            if ((i & 8) != 0) {
                pb = aVar.d;
            }
            if ((i & 16) != 0) {
                c1 = aVar.e;
            }
            if ((i & 32) != 0) {
                xf = aVar.f;
            }
            if ((i & 64) != 0) {
                aVar2 = aVar.g;
            }
            Xf xf2 = xf;
            com.ironsource.mediationsdk.adquality.a aVar3 = aVar2;
            C1 c12 = c1;
            U2 u22 = u2;
            return aVar.a(c2405ee, d9, u22, pb, c12, xf2, aVar3);
        }

        public final void b(C2405ee c2405ee) {
            this.a = c2405ee;
        }

        public final void a(Xf xf) {
            this.f = xf;
        }

        public final void b(D9 d9) {
            this.b = d9;
        }

        public final a a(C2405ee c2405ee) {
            this.a = c2405ee;
            return this;
        }

        public final void b(U2 u2) {
            this.c = u2;
        }

        public final a a(D9 d9) {
            this.b = d9;
            return this;
        }

        public final void b(Pb pb) {
            this.d = pb;
        }

        public final a a(U2 u2) {
            this.c = u2;
            return this;
        }

        public final void b(C1 c1) {
            this.e = c1;
        }

        public final a a(Pb pb) {
            this.d = pb;
            return this;
        }

        public final void b(com.ironsource.mediationsdk.adquality.a aVar) {
            this.g = aVar;
        }

        public final a a(C1 c1) {
            this.e = c1;
            return this;
        }

        public final a b(Xf xf) {
            this.f = xf;
            return this;
        }

        public final a a(com.ironsource.mediationsdk.adquality.a aVar) {
            this.g = aVar;
            return this;
        }

        public /* synthetic */ a(C2405ee c2405ee, D9 d9, U2 u2, Pb pb, C1 c1, Xf xf, com.ironsource.mediationsdk.adquality.a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : c2405ee, (i & 2) != 0 ? null : d9, (i & 4) != 0 ? null : u2, (i & 8) != 0 ? null : pb, (i & 16) != 0 ? null : c1, (i & 32) != 0 ? null : xf, (i & 64) != 0 ? null : aVar);
        }

        public final N3 a() {
            return new N3(this.a, this.b, this.c, this.d, this.e, this.f, this.g, null);
        }
    }

    public /* synthetic */ N3(C2405ee c2405ee, D9 d9, U2 u2, Pb pb, C1 c1, Xf xf, com.ironsource.mediationsdk.adquality.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(c2405ee, d9, u2, pb, c1, xf, aVar);
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

    public final D9 d() {
        return this.b;
    }

    public final Pb e() {
        return this.d;
    }

    public final C2405ee f() {
        return this.a;
    }

    public final Xf g() {
        return this.f;
    }

    public String toString() {
        return "configurations(\n" + this.a + "\n" + this.b + "\n" + this.c + "\n" + this.d + ")";
    }

    private N3(C2405ee c2405ee, D9 d9, U2 u2, Pb pb, C1 c1, Xf xf, com.ironsource.mediationsdk.adquality.a aVar) {
        this.a = c2405ee;
        this.b = d9;
        this.c = u2;
        this.d = pb;
        this.e = c1;
        this.f = xf;
        this.g = aVar;
    }
}
