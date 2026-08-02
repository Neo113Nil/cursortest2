package com.ironsource;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class K3 {

    @Nullable
    private final C4042de a;

    @Nullable
    private final D9 b;

    @Nullable
    private final S2 c;

    @Nullable
    private final Pb d;

    @Nullable
    private final A1 e;

    @Nullable
    private final Yf f;

    @Nullable
    private final com.ironsource.mediationsdk.adquality.a g;

    private K3(C4042de c4042de, D9 d9, S2 s2, Pb pb, A1 a1, Yf yf, com.ironsource.mediationsdk.adquality.a aVar) {
        this.a = c4042de;
        this.b = d9;
        this.c = s2;
        this.d = pb;
        this.e = a1;
        this.f = yf;
        this.g = aVar;
    }

    @Nullable
    public final com.ironsource.mediationsdk.adquality.a a() {
        return this.g;
    }

    @Nullable
    public final A1 b() {
        return this.e;
    }

    @Nullable
    public final S2 c() {
        return this.c;
    }

    @Nullable
    public final D9 d() {
        return this.b;
    }

    @Nullable
    public final Pb e() {
        return this.d;
    }

    @Nullable
    public final C4042de f() {
        return this.a;
    }

    @Nullable
    public final Yf g() {
        return this.f;
    }

    @NotNull
    public String toString() {
        return "configurations(\n" + this.a + "\n" + this.b + "\n" + this.c + "\n" + this.d + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {

        @Nullable
        private C4042de a;

        @Nullable
        private D9 b;

        @Nullable
        private S2 c;

        @Nullable
        private Pb d;

        @Nullable
        private A1 e;

        @Nullable
        private Yf f;

        @Nullable
        private com.ironsource.mediationsdk.adquality.a g;

        public /* synthetic */ a(C4042de c4042de, D9 d9, S2 s2, Pb pb, A1 a1, Yf yf, com.ironsource.mediationsdk.adquality.a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : c4042de, (i & 2) != 0 ? null : d9, (i & 4) != 0 ? null : s2, (i & 8) != 0 ? null : pb, (i & 16) != 0 ? null : a1, (i & 32) != 0 ? null : yf, (i & 64) != 0 ? null : aVar);
        }

        public static /* synthetic */ a a(a aVar, C4042de c4042de, D9 d9, S2 s2, Pb pb, A1 a1, Yf yf, com.ironsource.mediationsdk.adquality.a aVar2, int i, Object obj) {
            if ((i & 1) != 0) {
                c4042de = aVar.a;
            }
            if ((i & 2) != 0) {
                d9 = aVar.b;
            }
            if ((i & 4) != 0) {
                s2 = aVar.c;
            }
            if ((i & 8) != 0) {
                pb = aVar.d;
            }
            if ((i & 16) != 0) {
                a1 = aVar.e;
            }
            if ((i & 32) != 0) {
                yf = aVar.f;
            }
            if ((i & 64) != 0) {
                aVar2 = aVar.g;
            }
            Yf yf2 = yf;
            com.ironsource.mediationsdk.adquality.a aVar3 = aVar2;
            A1 a12 = a1;
            S2 s22 = s2;
            return aVar.a(c4042de, d9, s22, pb, a12, yf2, aVar3);
        }

        @Nullable
        public final C4042de b() {
            return this.a;
        }

        @Nullable
        public final D9 c() {
            return this.b;
        }

        @Nullable
        public final S2 d() {
            return this.c;
        }

        @Nullable
        public final Pb e() {
            return this.d;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.c(this.a, aVar.a) && Intrinsics.c(this.b, aVar.b) && Intrinsics.c(this.c, aVar.c) && Intrinsics.c(this.d, aVar.d) && Intrinsics.c(this.e, aVar.e) && Intrinsics.c(this.f, aVar.f) && Intrinsics.c(this.g, aVar.g);
        }

        @Nullable
        public final A1 f() {
            return this.e;
        }

        @Nullable
        public final Yf g() {
            return this.f;
        }

        @Nullable
        public final com.ironsource.mediationsdk.adquality.a h() {
            return this.g;
        }

        public int hashCode() {
            C4042de c4042de = this.a;
            int hashCode = (c4042de == null ? 0 : c4042de.hashCode()) * 31;
            D9 d9 = this.b;
            int hashCode2 = (hashCode + (d9 == null ? 0 : d9.hashCode())) * 31;
            S2 s2 = this.c;
            int hashCode3 = (hashCode2 + (s2 == null ? 0 : s2.hashCode())) * 31;
            Pb pb = this.d;
            int hashCode4 = (hashCode3 + (pb == null ? 0 : pb.hashCode())) * 31;
            A1 a1 = this.e;
            int hashCode5 = (hashCode4 + (a1 == null ? 0 : a1.hashCode())) * 31;
            Yf yf = this.f;
            int hashCode6 = (hashCode5 + (yf == null ? 0 : yf.hashCode())) * 31;
            com.ironsource.mediationsdk.adquality.a aVar = this.g;
            return hashCode6 + (aVar != null ? aVar.hashCode() : 0);
        }

        @Nullable
        public final com.ironsource.mediationsdk.adquality.a i() {
            return this.g;
        }

        @Nullable
        public final A1 j() {
            return this.e;
        }

        @Nullable
        public final S2 k() {
            return this.c;
        }

        @Nullable
        public final D9 l() {
            return this.b;
        }

        @Nullable
        public final Pb m() {
            return this.d;
        }

        @Nullable
        public final C4042de n() {
            return this.a;
        }

        @Nullable
        public final Yf o() {
            return this.f;
        }

        @NotNull
        public String toString() {
            return "Builder(rewardedVideoConfigurations=" + this.a + ", interstitialConfigurations=" + this.b + ", bannerConfigurations=" + this.c + ", nativeAdConfigurations=" + this.d + ", applicationConfigurations=" + this.e + ", testSuiteSettings=" + this.f + ", adQualityConfigurations=" + this.g + ")";
        }

        public final void b(@Nullable C4042de c4042de) {
            this.a = c4042de;
        }

        public final void b(@Nullable D9 d9) {
            this.b = d9;
        }

        public final void b(@Nullable S2 s2) {
            this.c = s2;
        }

        public final void b(@Nullable Pb pb) {
            this.d = pb;
        }

        public final void b(@Nullable A1 a1) {
            this.e = a1;
        }

        public final void b(@Nullable com.ironsource.mediationsdk.adquality.a aVar) {
            this.g = aVar;
        }

        @NotNull
        public final a b(@Nullable Yf yf) {
            this.f = yf;
            return this;
        }

        public a(@Nullable C4042de c4042de, @Nullable D9 d9, @Nullable S2 s2, @Nullable Pb pb, @Nullable A1 a1, @Nullable Yf yf, @Nullable com.ironsource.mediationsdk.adquality.a aVar) {
            this.a = c4042de;
            this.b = d9;
            this.c = s2;
            this.d = pb;
            this.e = a1;
            this.f = yf;
            this.g = aVar;
        }

        public a() {
            this(null, null, null, null, null, null, null, Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, null);
        }

        @NotNull
        public final a a(@Nullable C4042de c4042de, @Nullable D9 d9, @Nullable S2 s2, @Nullable Pb pb, @Nullable A1 a1, @Nullable Yf yf, @Nullable com.ironsource.mediationsdk.adquality.a aVar) {
            return new a(c4042de, d9, s2, pb, a1, yf, aVar);
        }

        public final void a(@Nullable Yf yf) {
            this.f = yf;
        }

        @NotNull
        public final a a(@Nullable C4042de c4042de) {
            this.a = c4042de;
            return this;
        }

        @NotNull
        public final a a(@Nullable D9 d9) {
            this.b = d9;
            return this;
        }

        @NotNull
        public final a a(@Nullable S2 s2) {
            this.c = s2;
            return this;
        }

        @NotNull
        public final a a(@Nullable Pb pb) {
            this.d = pb;
            return this;
        }

        @NotNull
        public final a a(@Nullable A1 a1) {
            this.e = a1;
            return this;
        }

        @NotNull
        public final a a(@Nullable com.ironsource.mediationsdk.adquality.a aVar) {
            this.g = aVar;
            return this;
        }

        @NotNull
        public final K3 a() {
            return new K3(this.a, this.b, this.c, this.d, this.e, this.f, this.g, null);
        }
    }

    public /* synthetic */ K3(C4042de c4042de, D9 d9, S2 s2, Pb pb, A1 a1, Yf yf, com.ironsource.mediationsdk.adquality.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(c4042de, d9, s2, pb, a1, yf, aVar);
    }
}
