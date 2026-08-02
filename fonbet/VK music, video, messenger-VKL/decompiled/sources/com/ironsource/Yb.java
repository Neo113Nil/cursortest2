package com.ironsource;

import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes13.dex */
public final class Yb extends L0 {
    private final InternalNativeAdListener a;

    public Yb(InternalNativeAdListener internalNativeAdListener) {
        this.a = internalNativeAdListener;
    }

    @Override // com.ironsource.L0
    public void a(AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder adapterNativeAdViewBinder, AdInfo adInfo) {
        this.a.onNativeAdLoaded(adInfo, adapterNativeAdData, adapterNativeAdViewBinder);
    }

    @Override // com.ironsource.L0
    public void d(AdInfo adInfo) {
        this.a.onNativeAdImpression(adInfo);
    }

    @Override // com.ironsource.L0
    public void a(IronSourceError ironSourceError) {
        this.a.onNativeAdLoadFailed(ironSourceError);
    }

    @Override // com.ironsource.L0
    public void a(C4336gd c4336gd, AdInfo adInfo) {
        this.a.onNativeAdClicked(adInfo);
    }
}
