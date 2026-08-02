package com.unity3d.mediation.rewarded;

import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface LevelPlayRewardedAdListener {
    default void onAdClicked(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
    }

    default void onAdClosed(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
    }

    default void onAdDisplayFailed(@NotNull LevelPlayAdError levelPlayAdError, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdError.getClass();
        levelPlayAdInfo.getClass();
    }

    void onAdDisplayed(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    default void onAdInfoChanged(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
    }

    void onAdLoadFailed(@NotNull LevelPlayAdError levelPlayAdError);

    void onAdLoaded(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    void onAdRewarded(@NotNull LevelPlayReward levelPlayReward, @NotNull LevelPlayAdInfo levelPlayAdInfo);
}
