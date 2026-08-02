package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener;
import defpackage.wem;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.z9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4431z9 implements V<InterstitialAd> {

    @NotNull
    private final InterfaceC4080fg a;

    @NotNull
    private final InterstitialAdLoaderListener b;

    public C4431z9(@NotNull InterfaceC4080fg interfaceC4080fg, @NotNull InterstitialAdLoaderListener interstitialAdLoaderListener) {
        interfaceC4080fg.getClass();
        interstitialAdLoaderListener.getClass();
        this.a = interfaceC4080fg;
        this.b = interstitialAdLoaderListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterstitialAd interstitialAd, C4431z9 c4431z9) {
        interstitialAd.getClass();
        c4431z9.getClass();
        IronLog.CALLBACK.info("InterstitialAdLoaderListener.onInterstitialAdLoaded adInfo: " + interstitialAd.getAdInfo());
        c4431z9.b.onInterstitialAdLoaded(interstitialAd);
    }

    @Override // com.ironsource.V
    public void a(@NotNull InterstitialAd interstitialAd) {
        interstitialAd.getClass();
        this.a.a(new wem(25, interstitialAd, this));
    }

    @Override // com.ironsource.V
    public void a(@NotNull IronSourceError ironSourceError) {
        ironSourceError.getClass();
        this.a.a(new wem(24, ironSourceError, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(IronSourceError ironSourceError, C4431z9 c4431z9) {
        ironSourceError.getClass();
        c4431z9.getClass();
        IronLog.CALLBACK.info("InterstitialAdLoaderListener.onInterstitialAdLoadFailed error: " + ironSourceError);
        c4431z9.b.onInterstitialAdLoadFailed(ironSourceError);
    }
}
