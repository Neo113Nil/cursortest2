package com.ironsource.adapters.bigo.rewarded;

import com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.logger.IronLog;
import java.lang.ref.WeakReference;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.RewardAdInteractionListener;
import sg.bigo.ads.api.RewardVideoAd;
import xsna.v11;

/* compiled from: BigoRewardedListener.kt */
/* loaded from: classes13.dex */
public final class BigoRewardedListener implements RewardAdInteractionListener, AdLoadListener<RewardVideoAd> {
    private final WeakReference<BigoRewardedAdapter> adapter;
    private final RewardedVideoAdListener listener;

    public BigoRewardedListener(RewardedVideoAdListener rewardedVideoAdListener, WeakReference<BigoRewardedAdapter> weakReference) {
        this.listener = rewardedVideoAdListener;
        this.adapter = weakReference;
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public void onAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.listener.onAdClicked();
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public void onAdClosed() {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.listener.onAdClosed();
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public void onAdError(AdError adError) {
        v11.d(new Object[]{Integer.valueOf(adError.getCode()), adError.getMessage()}, 2, "Failed to show, errorCode = %s, errorMessage = %s", IronLog.ADAPTER_CALLBACK);
        this.listener.onAdShowFailed(adError.getCode(), adError.getMessage());
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public void onAdImpression() {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.listener.onAdOpened();
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public void onAdOpened() {
        IronLog.ADAPTER_CALLBACK.verbose();
    }

    @Override // sg.bigo.ads.api.RewardAdInteractionListener
    public void onAdRewarded() {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.listener.onAdRewarded();
    }

    @Override // sg.bigo.ads.api.AdLoadListener
    public void onError(AdError adError) {
        v11.d(new Object[]{Integer.valueOf(adError.getCode()), adError.getMessage()}, 2, "Failed to load, errorCode = %s, errorMessage = %s", IronLog.ADAPTER_CALLBACK);
        this.listener.onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, adError.getCode(), adError.getMessage());
    }

    @Override // sg.bigo.ads.api.AdLoadListener
    public void onAdLoaded(RewardVideoAd rewardVideoAd) {
        IronLog.ADAPTER_CALLBACK.verbose();
        BigoRewardedAdapter bigoRewardedAdapter = this.adapter.get();
        if (bigoRewardedAdapter != null) {
            bigoRewardedAdapter.setRewardedAd$bigoadapter_release(rewardVideoAd);
        }
        this.listener.onAdLoadSuccess();
    }
}
