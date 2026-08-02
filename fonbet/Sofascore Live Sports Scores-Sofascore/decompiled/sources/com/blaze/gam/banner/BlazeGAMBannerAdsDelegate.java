package com.blaze.gam.banner;

import androidx.annotation.Keep;
import com.blaze.blazesdk.ads.banners.BlazeGAMBannerHandlerEventType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\u000b"}, d2 = {"Lcom/blaze/gam/banner/BlazeGAMBannerAdsDelegate;", "", "onGAMBannerAdsAdEvent", "", "eventType", "Lcom/blaze/blazesdk/ads/banners/BlazeGAMBannerHandlerEventType;", "adData", "Lcom/blaze/gam/banner/BlazeGAMBannerAdsAdData;", "onGAMBannerAdsAdError", "errorMsg", "", "blaze_gam_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface BlazeGAMBannerAdsDelegate {
    void onGAMBannerAdsAdError(@NotNull String errorMsg, @NotNull BlazeGAMBannerAdsAdData adData);

    void onGAMBannerAdsAdEvent(@NotNull BlazeGAMBannerHandlerEventType eventType, @NotNull BlazeGAMBannerAdsAdData adData);
}
