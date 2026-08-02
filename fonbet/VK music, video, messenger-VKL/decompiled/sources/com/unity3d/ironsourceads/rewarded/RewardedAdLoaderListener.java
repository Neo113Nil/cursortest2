package com.unity3d.ironsourceads.rewarded;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes14.dex */
public interface RewardedAdLoaderListener {
    void onRewardedAdLoadFailed(IronSourceError ironSourceError);

    void onRewardedAdLoaded(RewardedAd rewardedAd);
}
