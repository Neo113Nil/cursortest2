package com.ironsource.adapters.ironsource.nativeAd;

import com.appsflyer.internal.i;
import com.ironsource.A8;
import com.ironsource.C8;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class IronSourceNativeAdListener implements C8.a {

    @NotNull
    private final IronSourceNativeAdViewBinder binder;

    @NotNull
    private final NativeAdSmashListener smashListener;

    public IronSourceNativeAdListener(@NotNull IronSourceNativeAdViewBinder ironSourceNativeAdViewBinder, @NotNull NativeAdSmashListener nativeAdSmashListener) {
        ironSourceNativeAdViewBinder.getClass();
        nativeAdSmashListener.getClass();
        this.binder = ironSourceNativeAdViewBinder;
        this.smashListener = nativeAdSmashListener;
    }

    @Override // com.ironsource.C8.a
    public void onNativeAdClicked() {
        this.smashListener.onNativeAdClicked();
    }

    @Override // com.ironsource.C8.a
    public void onNativeAdLoadFailed(@NotNull String str) {
        this.smashListener.onNativeAdLoadFailed(new IronSourceError(510, i.h(str, "Load failed - ", str)));
    }

    @Override // com.ironsource.C8.a
    public void onNativeAdLoadSuccess(@NotNull A8 a8) {
        a8.getClass();
        this.smashListener.onNativeAdLoaded(new IronSourceNativeAdData(a8), this.binder);
    }

    @Override // com.ironsource.C8.a
    public void onNativeAdShown() {
        this.smashListener.onNativeAdShown();
    }
}
