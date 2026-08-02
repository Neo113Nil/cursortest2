package com.unity3d.mediation.banner;

import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* loaded from: classes14.dex */
public interface LevelPlayBannerAdViewListener {
    void onAdLoadFailed(LevelPlayAdError levelPlayAdError);

    void onAdLoaded(LevelPlayAdInfo levelPlayAdInfo);

    default void onAdClicked(LevelPlayAdInfo levelPlayAdInfo) {
    }

    default void onAdCollapsed(LevelPlayAdInfo levelPlayAdInfo) {
    }

    default void onAdDisplayed(LevelPlayAdInfo levelPlayAdInfo) {
    }

    default void onAdExpanded(LevelPlayAdInfo levelPlayAdInfo) {
    }

    default void onAdLeftApplication(LevelPlayAdInfo levelPlayAdInfo) {
    }

    default void onAdDisplayFailed(LevelPlayAdInfo levelPlayAdInfo, LevelPlayAdError levelPlayAdError) {
    }
}
