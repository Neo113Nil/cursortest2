package com.unity3d.ironsourceads.rewarded;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface RewardedAdLoaderListener {
    void onRewardedAdLoadFailed(@NotNull IronSourceError ironSourceError);

    void onRewardedAdLoaded(@NotNull RewardedAd rewardedAd);
}
