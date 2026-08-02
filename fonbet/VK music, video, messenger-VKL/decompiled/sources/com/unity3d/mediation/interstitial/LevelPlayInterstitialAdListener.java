package com.unity3d.mediation.interstitial;

import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* loaded from: classes14.dex */
public interface LevelPlayInterstitialAdListener {
    void onAdDisplayed(LevelPlayAdInfo levelPlayAdInfo);

    void onAdLoadFailed(LevelPlayAdError levelPlayAdError);

    void onAdLoaded(LevelPlayAdInfo levelPlayAdInfo);

    default void onAdClicked(LevelPlayAdInfo levelPlayAdInfo) {
    }

    default void onAdClosed(LevelPlayAdInfo levelPlayAdInfo) {
    }

    default void onAdInfoChanged(LevelPlayAdInfo levelPlayAdInfo) {
    }

    default void onAdDisplayFailed(LevelPlayAdError levelPlayAdError, LevelPlayAdInfo levelPlayAdInfo) {
    }
}
