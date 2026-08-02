package com.unity3d.mediation.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.ironsource.C4303s7;
import com.ironsource.C4432za;
import com.ironsource.U2;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdSize;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import defpackage.mz1;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class LevelPlayBannerAdView extends FrameLayout {

    @NotNull
    private final C4432za a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(@NotNull Context context, @NotNull String str, @NotNull Config config) {
        super(context);
        context.getClass();
        str.getClass();
        config.getClass();
        IronLog.API.info("adUnitId: " + str + ", config: " + config + ", context: " + context.getClass().getSimpleName());
        this.a = a(str, config);
    }

    private final C4432za a(String str, Config config) {
        Context context = getContext();
        context.getClass();
        U2 a = a(context);
        addView(a);
        return new C4432za(C4303s7.a.a(), str, a, config, null, null, 48, null);
    }

    public final void destroy() {
        this.a.b();
    }

    @NotNull
    public final String getAdId() {
        String uuid = this.a.c().toString();
        uuid.getClass();
        return uuid;
    }

    @NotNull
    public final LevelPlayAdSize getAdSize() {
        return this.a.d();
    }

    @NotNull
    public final String getAdUnitId() {
        return this.a.e();
    }

    @Nullable
    public final LevelPlayBannerAdViewListener getBannerListener() {
        return this.a.f();
    }

    @NotNull
    public final String getPlacementName() {
        return this.a.g();
    }

    public final void loadAd() {
        this.a.i();
    }

    public final void pauseAutoRefresh() {
        this.a.j();
    }

    public final void resumeAutoRefresh() {
        this.a.k();
    }

    public final void setBannerListener(@Nullable LevelPlayBannerAdViewListener levelPlayBannerAdViewListener) {
        this.a.a(levelPlayBannerAdViewListener);
    }

    public final void setImpressionDataListener(@Nullable LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        this.a.a(levelPlayImpressionDataListener);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Config {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @Nullable
        private final LevelPlayAdSize a;

        @Nullable
        private final Double b;

        @Nullable
        private final String c;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class Builder {

            @Nullable
            private LevelPlayAdSize a;

            @Nullable
            private Double b;

            @Nullable
            private String c;

            @NotNull
            public final Config build() {
                return new Config(this.a, this.b, this.c);
            }

            @NotNull
            public final Builder setAdSize(@NotNull LevelPlayAdSize levelPlayAdSize) {
                levelPlayAdSize.getClass();
                this.a = levelPlayAdSize;
                return this;
            }

            @NotNull
            public final Builder setBidFloor(double d) {
                this.b = Double.valueOf(d);
                return this;
            }

            @NotNull
            public final Builder setPlacementName(@NotNull String str) {
                str.getClass();
                this.c = str;
                return this;
            }
        }

        public /* synthetic */ Config(LevelPlayAdSize levelPlayAdSize, Double d, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : levelPlayAdSize, (i & 2) != 0 ? null : d, (i & 4) != 0 ? null : str);
        }

        public static /* synthetic */ Config copy$default(Config config, LevelPlayAdSize levelPlayAdSize, Double d, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                levelPlayAdSize = config.a;
            }
            if ((i & 2) != 0) {
                d = config.b;
            }
            if ((i & 4) != 0) {
                str = config.c;
            }
            return config.copy(levelPlayAdSize, d, str);
        }

        @Nullable
        public final LevelPlayAdSize component1() {
            return this.a;
        }

        @Nullable
        public final Double component2() {
            return this.b;
        }

        @Nullable
        public final String component3() {
            return this.c;
        }

        @NotNull
        public final Config copy(@Nullable LevelPlayAdSize levelPlayAdSize, @Nullable Double d, @Nullable String str) {
            return new Config(levelPlayAdSize, d, str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return Intrinsics.c(this.a, config.a) && Intrinsics.c(this.b, config.b) && Intrinsics.c(this.c, config.c);
        }

        @Nullable
        public final LevelPlayAdSize getAdSize() {
            return this.a;
        }

        @Nullable
        public final Double getBidFloor() {
            return this.b;
        }

        @Nullable
        public final String getPlacementName() {
            return this.c;
        }

        public int hashCode() {
            LevelPlayAdSize levelPlayAdSize = this.a;
            int hashCode = (levelPlayAdSize == null ? 0 : levelPlayAdSize.hashCode()) * 31;
            Double d = this.b;
            int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
            String str = this.c;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            LevelPlayAdSize levelPlayAdSize = this.a;
            Double d = this.b;
            String str = this.c;
            StringBuilder sb = new StringBuilder("Config(adSize=");
            sb.append(levelPlayAdSize);
            sb.append(", bidFloor=");
            sb.append(d);
            sb.append(", placementName=");
            return mz1.o(sb, str, ")");
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final Config empty() {
                return new Config(null, null, null, 7, null);
            }

            private Companion() {
            }
        }

        public Config(@Nullable LevelPlayAdSize levelPlayAdSize, @Nullable Double d, @Nullable String str) {
            this.a = levelPlayAdSize;
            this.b = d;
            this.c = str;
        }

        public Config() {
            this(null, null, null, 7, null);
        }
    }

    private final U2 a(Context context) {
        U2 u2 = new U2(context);
        u2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return u2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ LevelPlayBannerAdView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        IronLog.API.info("context: ".concat(context.getClass().getSimpleName()));
        Pair<String, Config> a = C4432za.o.a(context, attributeSet);
        this.a = a((String) a.a, (Config) a.b);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(@NotNull Context context, @NotNull String str) {
        this(context, str, Config.Companion.empty());
        context.getClass();
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
