package com.blaze.blazesdk.ads.banners;

import androidx.annotation.Keep;
import com.blaze.blazesdk.ads.models.ui.BlazeContentExtraInfo;
import com.ironsource.U3;
import defpackage.dmi;
import defpackage.wv8;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001fB3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J=\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/blaze/blazesdk/ads/banners/BlazeGAMBannerAdsRequestData;", "", "adUnitId", "", U3.i.O, "Lcom/blaze/blazesdk/ads/banners/BlazeGAMBannerAdsRequestData$AdSize;", "context", "", "extraInfo", "Lcom/blaze/blazesdk/ads/models/ui/BlazeContentExtraInfo;", "<init>", "(Ljava/lang/String;Lcom/blaze/blazesdk/ads/banners/BlazeGAMBannerAdsRequestData$AdSize;Ljava/util/Map;Lcom/blaze/blazesdk/ads/models/ui/BlazeContentExtraInfo;)V", "getAdUnitId", "()Ljava/lang/String;", "getAdSize", "()Lcom/blaze/blazesdk/ads/banners/BlazeGAMBannerAdsRequestData$AdSize;", "getContext", "()Ljava/util/Map;", "getExtraInfo", "()Lcom/blaze/blazesdk/ads/models/ui/BlazeContentExtraInfo;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "AdSize", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeGAMBannerAdsRequestData {
    public static final int $stable = 8;

    @NotNull
    private final AdSize adSize;

    @NotNull
    private final String adUnitId;

    @NotNull
    private final Map<String, String> context;

    @NotNull
    private final BlazeContentExtraInfo extraInfo;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/blaze/blazesdk/ads/banners/BlazeGAMBannerAdsRequestData$AdSize;", "", "name", "", "getName", "()Ljava/lang/String;", "Banner", "LargeBanner", "Custom", "Lcom/blaze/blazesdk/ads/banners/BlazeGAMBannerAdsRequestData$AdSize$Banner;", "Lcom/blaze/blazesdk/ads/banners/BlazeGAMBannerAdsRequestData$AdSize$Custom;", "Lcom/blaze/blazesdk/ads/banners/BlazeGAMBannerAdsRequestData$AdSize$LargeBanner;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface AdSize {

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Keep
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/blaze/blazesdk/ads/banners/BlazeGAMBannerAdsRequestData$AdSize$Banner;", "Lcom/blaze/blazesdk/ads/banners/BlazeGAMBannerAdsRequestData$AdSize;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Banner implements AdSize {
            public static final int $stable = 0;

            @NotNull
            public static final Banner INSTANCE = new Banner();

            @NotNull
            private static final String name = "Banner";

            private Banner() {
            }

            @Override // com.blaze.blazesdk.ads.banners.BlazeGAMBannerAdsRequestData.AdSize
            @NotNull
            public String getName() {
                return name;
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Keep
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/blaze/blazesdk/ads/banners/BlazeGAMBannerAdsRequestData$AdSize$Custom;", "Lcom/blaze/blazesdk/ads/banners/BlazeGAMBannerAdsRequestData$AdSize;", "width", "", "height", "<init>", "(II)V", "getWidth", "()I", "getHeight", "name", "", "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Custom implements AdSize {
            public static final int $stable = 0;
            private final int height;

            @NotNull
            private final String name = "Custom";
            private final int width;

            public Custom(int i, int i2) {
                this.width = i;
                this.height = i2;
            }

            public static /* synthetic */ Custom copy$default(Custom custom, int i, int i2, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    i = custom.width;
                }
                if ((i3 & 2) != 0) {
                    i2 = custom.height;
                }
                return custom.copy(i, i2);
            }

            /* renamed from: component1, reason: from getter */
            public final int getWidth() {
                return this.width;
            }

            /* renamed from: component2, reason: from getter */
            public final int getHeight() {
                return this.height;
            }

            @NotNull
            public final Custom copy(int width, int height) {
                return new Custom(width, height);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Custom)) {
                    return false;
                }
                Custom custom = (Custom) other;
                return this.width == custom.width && this.height == custom.height;
            }

            public final int getHeight() {
                return this.height;
            }

            @Override // com.blaze.blazesdk.ads.banners.BlazeGAMBannerAdsRequestData.AdSize
            @NotNull
            public String getName() {
                return this.name;
            }

            public final int getWidth() {
                return this.width;
            }

            public int hashCode() {
                return Integer.hashCode(this.height) + (Integer.hashCode(this.width) * 31);
            }

            @NotNull
            public String toString() {
                StringBuilder sb = new StringBuilder("Custom(width=");
                sb.append(this.width);
                sb.append(", height=");
                return wv8.j(sb, this.height, ')');
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Keep
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/blaze/blazesdk/ads/banners/BlazeGAMBannerAdsRequestData$AdSize$LargeBanner;", "Lcom/blaze/blazesdk/ads/banners/BlazeGAMBannerAdsRequestData$AdSize;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class LargeBanner implements AdSize {
            public static final int $stable = 0;

            @NotNull
            public static final LargeBanner INSTANCE = new LargeBanner();

            @NotNull
            private static final String name = "LargeBanner";

            private LargeBanner() {
            }

            @Override // com.blaze.blazesdk.ads.banners.BlazeGAMBannerAdsRequestData.AdSize
            @NotNull
            public String getName() {
                return name;
            }
        }

        @NotNull
        String getName();
    }

    public BlazeGAMBannerAdsRequestData(@NotNull String str, @NotNull AdSize adSize, @NotNull Map<String, String> map, @NotNull BlazeContentExtraInfo blazeContentExtraInfo) {
        str.getClass();
        adSize.getClass();
        map.getClass();
        blazeContentExtraInfo.getClass();
        this.adUnitId = str;
        this.adSize = adSize;
        this.context = map;
        this.extraInfo = blazeContentExtraInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BlazeGAMBannerAdsRequestData copy$default(BlazeGAMBannerAdsRequestData blazeGAMBannerAdsRequestData, String str, AdSize adSize, Map map, BlazeContentExtraInfo blazeContentExtraInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = blazeGAMBannerAdsRequestData.adUnitId;
        }
        if ((i & 2) != 0) {
            adSize = blazeGAMBannerAdsRequestData.adSize;
        }
        if ((i & 4) != 0) {
            map = blazeGAMBannerAdsRequestData.context;
        }
        if ((i & 8) != 0) {
            blazeContentExtraInfo = blazeGAMBannerAdsRequestData.extraInfo;
        }
        return blazeGAMBannerAdsRequestData.copy(str, adSize, map, blazeContentExtraInfo);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getAdUnitId() {
        return this.adUnitId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final AdSize getAdSize() {
        return this.adSize;
    }

    @NotNull
    public final Map<String, String> component3() {
        return this.context;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final BlazeContentExtraInfo getExtraInfo() {
        return this.extraInfo;
    }

    @NotNull
    public final BlazeGAMBannerAdsRequestData copy(@NotNull String adUnitId, @NotNull AdSize adSize, @NotNull Map<String, String> context, @NotNull BlazeContentExtraInfo extraInfo) {
        adUnitId.getClass();
        adSize.getClass();
        context.getClass();
        extraInfo.getClass();
        return new BlazeGAMBannerAdsRequestData(adUnitId, adSize, context, extraInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeGAMBannerAdsRequestData)) {
            return false;
        }
        BlazeGAMBannerAdsRequestData blazeGAMBannerAdsRequestData = (BlazeGAMBannerAdsRequestData) other;
        return Intrinsics.c(this.adUnitId, blazeGAMBannerAdsRequestData.adUnitId) && Intrinsics.c(this.adSize, blazeGAMBannerAdsRequestData.adSize) && Intrinsics.c(this.context, blazeGAMBannerAdsRequestData.context) && Intrinsics.c(this.extraInfo, blazeGAMBannerAdsRequestData.extraInfo);
    }

    @NotNull
    public final AdSize getAdSize() {
        return this.adSize;
    }

    @NotNull
    public final String getAdUnitId() {
        return this.adUnitId;
    }

    @NotNull
    public final Map<String, String> getContext() {
        return this.context;
    }

    @NotNull
    public final BlazeContentExtraInfo getExtraInfo() {
        return this.extraInfo;
    }

    public int hashCode() {
        return this.extraInfo.hashCode() + dmi.g(this.context, (this.adSize.hashCode() + (this.adUnitId.hashCode() * 31)) * 31, 31);
    }

    @NotNull
    public String toString() {
        return "BlazeGAMBannerAdsRequestData(adUnitId=" + this.adUnitId + ", adSize=" + this.adSize + ", context=" + this.context + ", extraInfo=" + this.extraInfo + ')';
    }
}
