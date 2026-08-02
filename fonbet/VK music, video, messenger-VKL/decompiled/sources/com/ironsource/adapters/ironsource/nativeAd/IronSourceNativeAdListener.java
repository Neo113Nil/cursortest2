package com.ironsource.adapters.ironsource.nativeAd;

import com.ironsource.D8;
import com.ironsource.F8;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes13.dex */
public final class IronSourceNativeAdListener implements F8.a {
    private final IronSourceNativeAdViewBinder binder;
    private final NativeAdSmashListener smashListener;

    public IronSourceNativeAdListener(IronSourceNativeAdViewBinder ironSourceNativeAdViewBinder, NativeAdSmashListener nativeAdSmashListener) {
        this.binder = ironSourceNativeAdViewBinder;
        this.smashListener = nativeAdSmashListener;
    }

    @Override // com.ironsource.F8.a
    public void onNativeAdClicked() {
        this.smashListener.onNativeAdClicked();
    }

    @Override // com.ironsource.F8.a
    public void onNativeAdLoadFailed(String str) {
        this.smashListener.onNativeAdLoadFailed(new IronSourceError(510, "Load failed - ".concat(str)));
    }

    @Override // com.ironsource.F8.a
    public void onNativeAdLoadSuccess(D8 d8) {
        this.smashListener.onNativeAdLoaded(new IronSourceNativeAdData(d8), this.binder);
    }

    @Override // com.ironsource.F8.a
    public void onNativeAdShown() {
        this.smashListener.onNativeAdShown();
    }
}
