package com.facebook.ads.internal.api;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeAdsManager;
import com.facebook.proguard.annotations.DoNotStripAny;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@DoNotStripAny
/* loaded from: classes2.dex */
public interface NativeAdsManagerApi {
    void disableAutoRefresh();

    int getUniqueNativeAdCount();

    boolean isLoaded();

    void loadAds();

    void loadAds(NativeAdBase.MediaCacheFlag mediaCacheFlag);

    @Nullable
    NativeAd nextNativeAd();

    @Nullable
    NativeAd nextNativeAd(NativeAdListener nativeAdListener);

    void setExtraHints(String str);

    void setListener(NativeAdsManager.Listener listener);

    void setNativeOption(@Nullable NativeAd.NativeOptions nativeOptions);
}
