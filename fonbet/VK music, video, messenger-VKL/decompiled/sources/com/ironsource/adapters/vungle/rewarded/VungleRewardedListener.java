package com.ironsource.adapters.vungle.rewarded;

import com.ironsource.adapters.vungle.VungleAdapter;
import com.ironsource.adapters.vungle.VungleConstants;
import com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.vungle.ads.BaseAd;
import com.vungle.ads.RewardedAdListener;
import com.vungle.ads.VungleError;
import xsna.dt;
import xsna.t11;
import xsna.v11;

/* compiled from: VungleRewardedListener.kt */
/* loaded from: classes13.dex */
public final class VungleRewardedListener implements RewardedAdListener {
    private final RewardedVideoAdListener listener;

    public VungleRewardedListener(RewardedVideoAdListener rewardedVideoAdListener) {
        this.listener = rewardedVideoAdListener;
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdClicked(BaseAd baseAd) {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.listener.onAdClicked();
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdEnd(BaseAd baseAd) {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.listener.onAdClosed();
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
        v11.d(new Object[]{Integer.valueOf(vungleError.getCode()), vungleError.getErrorMessage()}, 2, "Failed to load, errorCode = %s, errorMessage = %s", IronLog.ADAPTER_CALLBACK);
        this.listener.onAdLoadFailed(VungleAdapter.Companion.getLoadErrorType(vungleError), vungleError.getCode(), vungleError.getErrorMessage());
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
        v11.d(new Object[]{Integer.valueOf(vungleError.getCode()), vungleError.getErrorMessage()}, 2, VungleConstants.Logs.FAILED_TO_PLAY, IronLog.ADAPTER_CALLBACK);
        this.listener.onAdShowFailed(vungleError.getCode(), vungleError.getErrorMessage());
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdImpression(BaseAd baseAd) {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.listener.onAdOpened();
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLeftApplication(BaseAd baseAd) {
        IronLog.ADAPTER_CALLBACK.verbose();
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLoaded(BaseAd baseAd) {
        String creativeId = baseAd.getCreativeId();
        t11.c(new Object[]{creativeId == null ? "" : creativeId}, 1, "creativeId = %s", IronLog.ADAPTER_CALLBACK);
        if (creativeId == null || creativeId.length() == 0) {
            this.listener.onAdLoadSuccess();
        } else {
            this.listener.onAdLoadSuccess(dt.b("creativeId", creativeId));
        }
    }

    @Override // com.vungle.ads.RewardedAdListener
    public void onAdRewarded(BaseAd baseAd) {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.listener.onAdRewarded();
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdStart(BaseAd baseAd) {
        IronLog.ADAPTER_CALLBACK.verbose();
    }
}
