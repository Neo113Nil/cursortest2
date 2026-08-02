package com.ironsource.mediationsdk.ads.nativead.internal;

import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface InternalNativeAdListener {
    void onNativeAdClicked(@Nullable AdInfo adInfo);

    void onNativeAdImpression(@Nullable AdInfo adInfo);

    void onNativeAdLoadFailed(@Nullable IronSourceError ironSourceError);

    void onNativeAdLoaded(@Nullable AdInfo adInfo, @NotNull AdapterNativeAdData adapterNativeAdData, @NotNull AdapterNativeAdViewBinder adapterNativeAdViewBinder);
}
