package com.ironsource;

import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener;

/* loaded from: classes13.dex */
public final class Qf implements LevelPlayInterstitialAdListener {
    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public void onAdClicked(LevelPlayAdInfo levelPlayAdInfo) {
        C4277d8.a().b(C4249bg.a.a(levelPlayAdInfo));
    }

    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public void onAdClosed(LevelPlayAdInfo levelPlayAdInfo) {
        C4277d8.a().c(C4249bg.a.a(levelPlayAdInfo));
    }

    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public void onAdDisplayFailed(LevelPlayAdError levelPlayAdError, LevelPlayAdInfo levelPlayAdInfo) {
        C4277d8 a = C4277d8.a();
        C4249bg c4249bg = C4249bg.a;
        a.a(c4249bg.a(levelPlayAdError), c4249bg.a(levelPlayAdInfo));
    }

    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public void onAdDisplayed(LevelPlayAdInfo levelPlayAdInfo) {
        C4277d8.a().f(C4249bg.a.a(levelPlayAdInfo));
    }

    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public void onAdLoadFailed(LevelPlayAdError levelPlayAdError) {
        C4277d8.a().a(C4249bg.a.a(levelPlayAdError));
    }

    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public void onAdLoaded(LevelPlayAdInfo levelPlayAdInfo) {
        C4277d8.a().e(C4249bg.a.a(levelPlayAdInfo));
    }
}
