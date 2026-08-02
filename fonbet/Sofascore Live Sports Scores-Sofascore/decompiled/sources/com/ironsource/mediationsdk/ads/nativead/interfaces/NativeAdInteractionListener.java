package com.ironsource.mediationsdk.ads.nativead.interfaces;

import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface NativeAdInteractionListener {
    void onAdClicked(@Nullable LevelPlayNativeAd levelPlayNativeAd, @Nullable AdInfo adInfo);

    void onAdImpression(@Nullable LevelPlayNativeAd levelPlayNativeAd, @Nullable AdInfo adInfo);
}
