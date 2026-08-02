package com.unity3d.ironsourceads.rewarded;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface RewardedAdListener {
    void onRewardedAdClicked(@NotNull RewardedAd rewardedAd);

    void onRewardedAdDismissed(@NotNull RewardedAd rewardedAd);

    void onRewardedAdFailedToShow(@NotNull RewardedAd rewardedAd, @NotNull IronSourceError ironSourceError);

    void onRewardedAdShown(@NotNull RewardedAd rewardedAd);

    void onUserEarnedReward(@NotNull RewardedAd rewardedAd);
}
