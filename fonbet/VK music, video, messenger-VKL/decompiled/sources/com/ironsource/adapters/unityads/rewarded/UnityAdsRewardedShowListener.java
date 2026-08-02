package com.ironsource.adapters.unityads.rewarded;

import com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.ads.RewardedAd;
import com.unity3d.ads.RewardedShowListener;
import com.unity3d.ads.ShowFinishState;
import com.unity3d.ads.UnityAdsError;
import xsna.v11;

/* compiled from: UnityAdsRewardedShowListener.kt */
/* loaded from: classes13.dex */
public final class UnityAdsRewardedShowListener implements RewardedShowListener {
    private final RewardedVideoAdListener listener;

    public UnityAdsRewardedShowListener(RewardedVideoAdListener rewardedVideoAdListener) {
        this.listener = rewardedVideoAdListener;
    }

    @Override // com.unity3d.ads.RewardedShowListener
    public void onRewarded(RewardedAd rewardedAd) {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.listener.onAdRewarded();
    }

    @Override // com.unity3d.ads.ShowListener
    public void onClicked(RewardedAd rewardedAd) {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.listener.onAdClicked();
    }

    @Override // com.unity3d.ads.ShowListener
    public void onCompleted(RewardedAd rewardedAd, ShowFinishState showFinishState) {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.listener.onAdClosed();
    }

    @Override // com.unity3d.ads.ShowListener
    public void onFailed(RewardedAd rewardedAd, UnityAdsError unityAdsError) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        Integer valueOf = Integer.valueOf(unityAdsError.getCode());
        String message = unityAdsError.getMessage();
        if (message == null) {
            message = "";
        }
        v11.d(new Object[]{valueOf, message}, 2, "Failed to show, errorCode = %s, errorMessage = %s", ironLog);
        RewardedVideoAdListener rewardedVideoAdListener = this.listener;
        int code = unityAdsError.getCode();
        String message2 = unityAdsError.getMessage();
        rewardedVideoAdListener.onAdShowFailed(code, message2 != null ? message2 : "");
    }

    @Override // com.unity3d.ads.ShowListener
    public void onStarted(RewardedAd rewardedAd) {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.listener.onAdOpened();
    }
}
