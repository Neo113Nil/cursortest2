package com.ironsource;

import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Xb extends K0 {

    @NotNull
    private final InternalNativeAdListener a;

    public Xb(@NotNull InternalNativeAdListener internalNativeAdListener) {
        internalNativeAdListener.getClass();
        this.a = internalNativeAdListener;
    }

    @Override // com.ironsource.K0
    public void a(@NotNull AdapterNativeAdData adapterNativeAdData, @NotNull AdapterNativeAdViewBinder adapterNativeAdViewBinder, @Nullable AdInfo adInfo) {
        adapterNativeAdData.getClass();
        adapterNativeAdViewBinder.getClass();
        this.a.onNativeAdLoaded(adInfo, adapterNativeAdData, adapterNativeAdViewBinder);
    }

    @Override // com.ironsource.K0
    public void d(@Nullable AdInfo adInfo) {
        this.a.onNativeAdImpression(adInfo);
    }

    @Override // com.ironsource.K0
    public void a(@Nullable IronSourceError ironSourceError) {
        this.a.onNativeAdLoadFailed(ironSourceError);
    }

    @Override // com.ironsource.K0
    public void a(@NotNull C4077fd c4077fd, @Nullable AdInfo adInfo) {
        c4077fd.getClass();
        this.a.onNativeAdClicked(adInfo);
    }
}
