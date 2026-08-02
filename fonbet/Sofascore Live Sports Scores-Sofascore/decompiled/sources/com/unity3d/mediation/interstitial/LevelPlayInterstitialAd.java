package com.unity3d.mediation.interstitial;

import android.app.Activity;
import com.ironsource.C3960ab;
import com.ironsource.C4016c6;
import com.ironsource.C4243p0;
import com.ironsource.C4303s7;
import com.ironsource.E0;
import com.ironsource.Ib;
import com.ironsource.InterfaceC4193m4;
import com.ironsource.Va;
import com.ironsource.X0;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class LevelPlayInterstitialAd {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final String a;

    @NotNull
    private final C3960ab b;

    public LevelPlayInterstitialAd(@NotNull String str, @NotNull Va.c cVar) {
        str.getClass();
        cVar.getClass();
        IronLog.API.info("adUnitId: " + str + ", config: " + cVar.d());
        this.a = str;
        this.b = new C3960ab(str, cVar.d(), cVar.b(), cVar.a(), cVar.g(), cVar.e(), cVar.f(), cVar.c());
    }

    public static final boolean isPlacementCapped(@NotNull String str) {
        return Companion.isPlacementCapped(str);
    }

    public static /* synthetic */ void showAd$default(LevelPlayInterstitialAd levelPlayInterstitialAd, Activity activity, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        levelPlayInterstitialAd.showAd(activity, str);
    }

    @NotNull
    public final String getAdId() {
        return this.b.b();
    }

    @NotNull
    public final String getAdUnitId() {
        return this.a;
    }

    public final boolean isAdReady() {
        return this.b.c();
    }

    public final void loadAd() {
        this.b.d();
    }

    public final void setImpressionDataListener(@Nullable LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        this.b.a(levelPlayImpressionDataListener);
    }

    public final void setListener(@Nullable LevelPlayInterstitialAdListener levelPlayInterstitialAdListener) {
        this.b.a(levelPlayInterstitialAdListener);
    }

    public final void showAd(@NotNull Activity activity) {
        activity.getClass();
        showAd$default(this, activity, null, 2, null);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Config implements Va.b {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @Nullable
        private final Double a;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class Builder {

            @Nullable
            private Double a;

            @NotNull
            public final Config build() {
                return new Config(this.a);
            }

            @NotNull
            public final Builder setBidFloor(double d) {
                this.a = Double.valueOf(d);
                return this;
            }
        }

        public /* synthetic */ Config(Double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : d);
        }

        public static /* synthetic */ Config copy$default(Config config, Double d, int i, Object obj) {
            if ((i & 1) != 0) {
                d = config.a;
            }
            return config.copy(d);
        }

        @Nullable
        public final Double component1() {
            return this.a;
        }

        @NotNull
        public final Config copy(@Nullable Double d) {
            return new Config(d);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Config) && Intrinsics.c(this.a, ((Config) obj).a);
        }

        @Override // com.ironsource.Va.b
        @Nullable
        public Double getBidFloor() {
            return this.a;
        }

        public int hashCode() {
            Double d = this.a;
            if (d == null) {
                return 0;
            }
            return d.hashCode();
        }

        @NotNull
        public String toString() {
            return "Config(bidFloor=" + this.a + ")";
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @NotNull
            public final Config empty() {
                return new Config(null, 1, 0 == true ? 1 : 0);
            }

            private Companion() {
            }
        }

        public Config(@Nullable Double d) {
            this.a = d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Config() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isPlacementCapped(@NotNull String str) {
            str.getClass();
            return Va.p.a(str, LevelPlay.AdFormat.INTERSTITIAL);
        }

        private Companion() {
        }
    }

    public final void showAd(@NotNull Activity activity, @Nullable String str) {
        activity.getClass();
        this.b.a(activity, str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayInterstitialAd(@NotNull String str, @NotNull Config config) {
        this(str, new Va.c(new C4243p0(IronSource.a.INTERSTITIAL, E0.b.MEDIATION), new C4016c6(), Ib.v.d(), new InterfaceC4193m4.a(), C4303s7.a, config, new X0()));
        str.getClass();
        config.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayInterstitialAd(@NotNull String str) {
        this(str, Config.Companion.empty());
        str.getClass();
    }
}
