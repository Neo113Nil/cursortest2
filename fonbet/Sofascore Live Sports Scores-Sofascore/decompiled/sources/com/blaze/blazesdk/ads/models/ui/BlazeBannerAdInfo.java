package com.blaze.blazesdk.ads.models.ui;

import androidx.annotation.Keep;
import com.blaze.blazesdk.ads.banners.BlazeGAMBannerAdsRequestData;
import defpackage.dmi;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/blaze/blazesdk/ads/models/ui/BlazeBannerAdInfo;", "", "adUnitId", "", "size", "context", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getAdUnitId", "()Ljava/lang/String;", "getSize", "getContext", "()Ljava/util/Map;", "asRequestData", "Lcom/blaze/blazesdk/ads/banners/BlazeGAMBannerAdsRequestData;", "extraInfo", "Lcom/blaze/blazesdk/ads/models/ui/BlazeContentExtraInfo;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BlazeBannerAdInfo {
    public static final int $stable = 8;

    @Nullable
    private final String adUnitId;

    @NotNull
    private final Map<String, String> context;

    @Nullable
    private final String size;

    public BlazeBannerAdInfo(@Nullable String str, @Nullable String str2, @NotNull Map<String, String> map) {
        map.getClass();
        this.adUnitId = str;
        this.size = str2;
        this.context = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BlazeBannerAdInfo copy$default(BlazeBannerAdInfo blazeBannerAdInfo, String str, String str2, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = blazeBannerAdInfo.adUnitId;
        }
        if ((i & 2) != 0) {
            str2 = blazeBannerAdInfo.size;
        }
        if ((i & 4) != 0) {
            map = blazeBannerAdInfo.context;
        }
        return blazeBannerAdInfo.copy(str, str2, map);
    }

    @Nullable
    public final BlazeGAMBannerAdsRequestData asRequestData(@NotNull BlazeContentExtraInfo extraInfo) {
        extraInfo.getClass();
        String str = this.size;
        BlazeGAMBannerAdsRequestData.AdSize adSize = Intrinsics.c(str, "Banner") ? BlazeGAMBannerAdsRequestData.AdSize.Banner.INSTANCE : Intrinsics.c(str, "LargeBanner") ? BlazeGAMBannerAdsRequestData.AdSize.LargeBanner.INSTANCE : null;
        String str2 = this.adUnitId;
        if (str2 == null || adSize == null) {
            return null;
        }
        return new BlazeGAMBannerAdsRequestData(str2, adSize, this.context, extraInfo);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getAdUnitId() {
        return this.adUnitId;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getSize() {
        return this.size;
    }

    @NotNull
    public final Map<String, String> component3() {
        return this.context;
    }

    @NotNull
    public final BlazeBannerAdInfo copy(@Nullable String adUnitId, @Nullable String size, @NotNull Map<String, String> context) {
        context.getClass();
        return new BlazeBannerAdInfo(adUnitId, size, context);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeBannerAdInfo)) {
            return false;
        }
        BlazeBannerAdInfo blazeBannerAdInfo = (BlazeBannerAdInfo) other;
        return Intrinsics.c(this.adUnitId, blazeBannerAdInfo.adUnitId) && Intrinsics.c(this.size, blazeBannerAdInfo.size) && Intrinsics.c(this.context, blazeBannerAdInfo.context);
    }

    @Nullable
    public final String getAdUnitId() {
        return this.adUnitId;
    }

    @NotNull
    public final Map<String, String> getContext() {
        return this.context;
    }

    @Nullable
    public final String getSize() {
        return this.size;
    }

    public int hashCode() {
        String str = this.adUnitId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.size;
        return this.context.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("BlazeBannerAdInfo(adUnitId=");
        sb.append(this.adUnitId);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(", context=");
        return dmi.s(sb, this.context, ')');
    }
}
