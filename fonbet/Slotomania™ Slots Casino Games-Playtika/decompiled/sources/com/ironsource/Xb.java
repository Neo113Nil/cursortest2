package com.ironsource;

import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class Xb extends L0 {
    private final InternalNativeAdListener a;

    public Xb(InternalNativeAdListener mNativeAdListener) {
        Intrinsics.checkNotNullParameter(mNativeAdListener, "mNativeAdListener");
        this.a = mNativeAdListener;
    }

    @Override // com.ironsource.L0
    public void a(AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder nativeAdViewBinder, AdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adapterNativeAdData, "adapterNativeAdData");
        Intrinsics.checkNotNullParameter(nativeAdViewBinder, "nativeAdViewBinder");
        this.a.onNativeAdLoaded(adInfo, adapterNativeAdData, nativeAdViewBinder);
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
    public void a(C2440gd placement, AdInfo adInfo) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        this.a.onNativeAdClicked(adInfo);
    }
}
