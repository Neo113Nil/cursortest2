package com.blaze.gam.banner;

import androidx.annotation.Keep;
import com.blaze.blazesdk.ads.models.ui.BlazeContentExtraInfo;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/blaze/gam/banner/BlazeGAMBannerAdsAdData;", "", "bannerView", "Lcom/google/android/gms/ads/admanager/AdManagerAdView;", "extraInfo", "Lcom/blaze/blazesdk/ads/models/ui/BlazeContentExtraInfo;", "<init>", "(Lcom/google/android/gms/ads/admanager/AdManagerAdView;Lcom/blaze/blazesdk/ads/models/ui/BlazeContentExtraInfo;)V", "getBannerView", "()Lcom/google/android/gms/ads/admanager/AdManagerAdView;", "getExtraInfo", "()Lcom/blaze/blazesdk/ads/models/ui/BlazeContentExtraInfo;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "blaze_gam_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeGAMBannerAdsAdData {

    @NotNull
    private final AdManagerAdView bannerView;

    @NotNull
    private final BlazeContentExtraInfo extraInfo;

    public BlazeGAMBannerAdsAdData(@NotNull AdManagerAdView adManagerAdView, @NotNull BlazeContentExtraInfo blazeContentExtraInfo) {
        adManagerAdView.getClass();
        blazeContentExtraInfo.getClass();
        this.bannerView = adManagerAdView;
        this.extraInfo = blazeContentExtraInfo;
    }

    public static /* synthetic */ BlazeGAMBannerAdsAdData copy$default(BlazeGAMBannerAdsAdData blazeGAMBannerAdsAdData, AdManagerAdView adManagerAdView, BlazeContentExtraInfo blazeContentExtraInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            adManagerAdView = blazeGAMBannerAdsAdData.bannerView;
        }
        if ((i & 2) != 0) {
            blazeContentExtraInfo = blazeGAMBannerAdsAdData.extraInfo;
        }
        return blazeGAMBannerAdsAdData.copy(adManagerAdView, blazeContentExtraInfo);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final AdManagerAdView getBannerView() {
        return this.bannerView;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final BlazeContentExtraInfo getExtraInfo() {
        return this.extraInfo;
    }

    @NotNull
    public final BlazeGAMBannerAdsAdData copy(@NotNull AdManagerAdView bannerView, @NotNull BlazeContentExtraInfo extraInfo) {
        bannerView.getClass();
        extraInfo.getClass();
        return new BlazeGAMBannerAdsAdData(bannerView, extraInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeGAMBannerAdsAdData)) {
            return false;
        }
        BlazeGAMBannerAdsAdData blazeGAMBannerAdsAdData = (BlazeGAMBannerAdsAdData) other;
        return Intrinsics.c(this.bannerView, blazeGAMBannerAdsAdData.bannerView) && Intrinsics.c(this.extraInfo, blazeGAMBannerAdsAdData.extraInfo);
    }

    @NotNull
    public final AdManagerAdView getBannerView() {
        return this.bannerView;
    }

    @NotNull
    public final BlazeContentExtraInfo getExtraInfo() {
        return this.extraInfo;
    }

    public int hashCode() {
        return this.extraInfo.hashCode() + (this.bannerView.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "BlazeGAMBannerAdsAdData(bannerView=" + this.bannerView + ", extraInfo=" + this.extraInfo + ')';
    }
}
