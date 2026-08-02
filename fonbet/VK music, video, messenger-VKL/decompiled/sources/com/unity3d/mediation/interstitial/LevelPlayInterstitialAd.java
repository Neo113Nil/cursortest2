package com.unity3d.mediation.interstitial;

import android.app.Activity;
import com.ironsource.C4280db;
import com.ironsource.C4311f6;
import com.ironsource.C4484p0;
import com.ironsource.C4616w7;
import com.ironsource.F0;
import com.ironsource.InterfaceC4488p4;
import com.ironsource.Kb;
import com.ironsource.Ya;
import com.ironsource.Z0;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import xsna.epx;
import xsna.zcl;

/* loaded from: classes14.dex */
public final class LevelPlayInterstitialAd {
    public static final Companion Companion = new Companion(null);
    private final String a;
    private final C4280db b;

    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final boolean isPlacementCapped(String str) {
            return Ya.o.a(str, LevelPlay.AdFormat.INTERSTITIAL);
        }

        private Companion() {
        }
    }

    public static final class Config implements Ya.b {
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
            public /* synthetic */ Companion(zcl zclVar) {
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
            return (obj instanceof Config) && epx.f(this.a, ((Config) obj).a);
        }

        @Override // com.ironsource.Ya.b
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

        public /* synthetic */ Config(Double d, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : d);
        }
    }

    public LevelPlayInterstitialAd(String str) {
        this(str, Config.Companion.empty());
    }

    public static final boolean isPlacementCapped(String str) {
        return Companion.isPlacementCapped(str);
    }

    public static /* synthetic */ void showAd$default(LevelPlayInterstitialAd levelPlayInterstitialAd, Activity activity, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        levelPlayInterstitialAd.showAd(activity, str);
    }

    public final String getAdId() {
        return this.b.b();
    }

    public final String getAdUnitId() {
        return this.a;
    }

    public final boolean isAdReady() {
        return this.b.c();
    }

    public final void loadAd() {
        this.b.d();
    }

    public final void setListener(LevelPlayInterstitialAdListener levelPlayInterstitialAdListener) {
        this.b.a(levelPlayInterstitialAdListener);
    }

    public final void showAd(Activity activity) {
        showAd$default(this, activity, null, 2, null);
    }

    public LevelPlayInterstitialAd(String str, Config config) {
        this(str, new Ya.c(new C4484p0(IronSource.a.INTERSTITIAL, F0.b.MEDIATION), new C4311f6(), Kb.u.d(), new InterfaceC4488p4.a(), C4616w7.a, config, new Z0()));
    }

    public final void showAd(Activity activity, String str) {
        this.b.a(activity, str);
    }

    public LevelPlayInterstitialAd(String str, Ya.c cVar) {
        IronLog.API.info("adUnitId: " + str + ", config: " + cVar.d());
        this.a = str;
        this.b = new C4280db(str, cVar.d(), cVar.b(), cVar.a(), cVar.g(), cVar.e(), cVar.f(), cVar.c());
    }
}
