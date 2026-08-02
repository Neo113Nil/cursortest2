package com.unity3d.mediation.rewarded;

import android.app.Activity;
import com.ironsource.C2379d6;
import com.ironsource.C2581ob;
import com.ironsource.C2588p0;
import com.ironsource.C2702v7;
import com.ironsource.F0;
import com.ironsource.InterfaceC2592p4;
import com.ironsource.Jb;
import com.ironsource.Xa;
import com.ironsource.Z0;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class LevelPlayRewardedAd {
    public static final Companion Companion = new Companion(null);
    private final String a;
    private final C2581ob b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final boolean isPlacementCapped(String placementName) {
            Intrinsics.checkNotNullParameter(placementName, "placementName");
            return Xa.o.a(placementName, LevelPlay.AdFormat.REWARDED);
        }

        private Companion() {
        }
    }

    public static final class Config implements Xa.b {
        public static final Companion Companion = new Companion(null);
        private final Double a;

        public static final class Builder {
            private Double a;

            public final Config build() {
                return new Config(this.a);
            }

            public final Builder setBidFloor(double d) {
                this.a = Double.valueOf(d);
                return this;
            }
        }

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final Config empty() {
                return new Config(null, 1, 0 == true ? 1 : 0);
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Config() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Config copy$default(Config config, Double d, int i, Object obj) {
            if ((i & 1) != 0) {
                d = config.a;
            }
            return config.copy(d);
        }

        public final Double component1() {
            return this.a;
        }

        public final Config copy(Double d) {
            return new Config(d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Config) && Intrinsics.areEqual((Object) this.a, (Object) ((Config) obj).a);
        }

        @Override // com.ironsource.Xa.b
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

        public String toString() {
            return "Config(bidFloor=" + this.a + ")";
        }

        public Config(Double d) {
            this.a = d;
        }

        public /* synthetic */ Config(Double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : d);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayRewardedAd(String adUnitId) {
        this(adUnitId, Config.Companion.empty());
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
    }

    public static /* synthetic */ LevelPlayReward getReward$default(LevelPlayRewardedAd levelPlayRewardedAd, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return levelPlayRewardedAd.getReward(str);
    }

    @JvmStatic
    public static final boolean isPlacementCapped(String str) {
        return Companion.isPlacementCapped(str);
    }

    public static /* synthetic */ void showAd$default(LevelPlayRewardedAd levelPlayRewardedAd, Activity activity, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        levelPlayRewardedAd.showAd(activity, str);
    }

    public final String getAdId() {
        return this.b.a();
    }

    public final String getAdUnitId() {
        return this.a;
    }

    public final LevelPlayReward getReward() {
        return getReward$default(this, null, 1, null);
    }

    public final boolean isAdReady() {
        return this.b.b();
    }

    public final void loadAd() {
        this.b.c();
    }

    public final void setListener(LevelPlayRewardedAdListener levelPlayRewardedAdListener) {
        this.b.a(levelPlayRewardedAdListener);
    }

    public final void showAd(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        showAd$default(this, activity, null, 2, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayRewardedAd(String adUnitId, Config config) {
        this(adUnitId, new Xa.c(new C2588p0(IronSource.a.REWARDED_VIDEO, F0.b.MEDIATION), new C2379d6(), Jb.u.d(), new InterfaceC2592p4.a(), C2702v7.a, config, new Z0()));
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(config, "config");
    }

    public final LevelPlayReward getReward(String str) {
        return this.b.a(str);
    }

    public final void showAd(Activity activity, String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.b.a(activity, str);
    }

    public LevelPlayRewardedAd(String adUnitId, Xa.c payload) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(payload, "payload");
        IronLog.API.info("adUnitId: " + adUnitId + ", config: " + payload.d());
        this.a = adUnitId;
        this.b = new C2581ob(adUnitId, payload.d(), payload.b(), payload.a(), payload.g(), payload.e(), payload.f(), payload.c());
    }
}
