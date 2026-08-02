package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener;

/* loaded from: classes13.dex */
public final class A9 implements V<InterstitialAd> {
    private final InterfaceC4357hg a;
    private final InterstitialAdLoaderListener b;

    public A9(InterfaceC4357hg interfaceC4357hg, InterstitialAdLoaderListener interstitialAdLoaderListener) {
        this.a = interfaceC4357hg;
        this.b = interstitialAdLoaderListener;
    }

    @Override // com.ironsource.V
    public void a(InterstitialAd interstitialAd) {
        this.a.a(new xsna.i(0, interstitialAd, this));
    }

    @Override // com.ironsource.V
    public void b(IronSourceError ironSourceError) {
        this.a.a(new xsna.h(0, ironSourceError, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterstitialAd interstitialAd, A9 a9) {
        IronLog.CALLBACK.info("InterstitialAdLoaderListener.onInterstitialAdLoaded adInfo: " + interstitialAd.getAdInfo());
        a9.b.onInterstitialAdLoaded(interstitialAd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(IronSourceError ironSourceError, A9 a9) {
        IronLog.CALLBACK.info("InterstitialAdLoaderListener.onInterstitialAdLoadFailed error: " + ironSourceError);
        a9.b.onInterstitialAdLoadFailed(ironSourceError);
    }
}
