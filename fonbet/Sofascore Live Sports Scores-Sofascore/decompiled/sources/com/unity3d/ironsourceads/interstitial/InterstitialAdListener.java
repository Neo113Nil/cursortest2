package com.unity3d.ironsourceads.interstitial;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface InterstitialAdListener {
    void onInterstitialAdClicked(@NotNull InterstitialAd interstitialAd);

    void onInterstitialAdDismissed(@NotNull InterstitialAd interstitialAd);

    void onInterstitialAdFailedToShow(@NotNull InterstitialAd interstitialAd, @NotNull IronSourceError ironSourceError);

    void onInterstitialAdShown(@NotNull InterstitialAd interstitialAd);
}
