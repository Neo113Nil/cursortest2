package com.ironsource.adapters.unityads.interstitial;

import com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.ads.InterstitialAd;
import com.unity3d.ads.InterstitialShowListener;
import com.unity3d.ads.ShowFinishState;
import com.unity3d.ads.UnityAdsError;
import xsna.v11;

/* compiled from: UnityAdsInterstitialShowListener.kt */
/* loaded from: classes13.dex */
public final class UnityAdsInterstitialShowListener implements InterstitialShowListener {
    private final InterstitialAdListener listener;

    public UnityAdsInterstitialShowListener(InterstitialAdListener interstitialAdListener) {
        this.listener = interstitialAdListener;
    }

    @Override // com.unity3d.ads.ShowListener
    public void onClicked(InterstitialAd interstitialAd) {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.listener.onAdClicked();
    }

    @Override // com.unity3d.ads.ShowListener
    public void onCompleted(InterstitialAd interstitialAd, ShowFinishState showFinishState) {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.listener.onAdClosed();
    }

    @Override // com.unity3d.ads.ShowListener
    public void onFailed(InterstitialAd interstitialAd, UnityAdsError unityAdsError) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        Integer valueOf = Integer.valueOf(unityAdsError.getCode());
        String message = unityAdsError.getMessage();
        if (message == null) {
            message = "";
        }
        v11.d(new Object[]{valueOf, message}, 2, "Failed to show, errorCode = %s, errorMessage = %s", ironLog);
        InterstitialAdListener interstitialAdListener = this.listener;
        int code = unityAdsError.getCode();
        String message2 = unityAdsError.getMessage();
        interstitialAdListener.onAdShowFailed(code, message2 != null ? message2 : "");
    }

    @Override // com.unity3d.ads.ShowListener
    public void onStarted(InterstitialAd interstitialAd) {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.listener.onAdOpened();
    }
}
