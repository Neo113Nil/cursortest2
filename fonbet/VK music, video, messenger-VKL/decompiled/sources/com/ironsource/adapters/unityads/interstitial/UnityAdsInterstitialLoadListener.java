package com.ironsource.adapters.unityads.interstitial;

import com.ironsource.adapters.unityads.UnityAdsAdapter;
import com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.ads.InterstitialAd;
import com.unity3d.ads.LoadListener;
import com.unity3d.ads.UnityAdsError;
import java.lang.ref.WeakReference;
import xsna.v11;

/* compiled from: UnityAdsInterstitialLoadListener.kt */
/* loaded from: classes13.dex */
public final class UnityAdsInterstitialLoadListener implements LoadListener<InterstitialAd> {
    private final WeakReference<UnityAdsInterstitialAdapter> adapter;
    private final InterstitialAdListener listener;

    public UnityAdsInterstitialLoadListener(InterstitialAdListener interstitialAdListener, WeakReference<UnityAdsInterstitialAdapter> weakReference) {
        this.listener = interstitialAdListener;
        this.adapter = weakReference;
    }

    @Override // com.unity3d.ads.LoadListener
    public void onAdLoaded(InterstitialAd interstitialAd, UnityAdsError unityAdsError) {
        if (interstitialAd != null) {
            IronLog.ADAPTER_CALLBACK.verbose();
            UnityAdsInterstitialAdapter unityAdsInterstitialAdapter = this.adapter.get();
            if (unityAdsInterstitialAdapter != null) {
                unityAdsInterstitialAdapter.setInterstitialAd$unityadsadapter_release(interstitialAd);
            }
            this.listener.onAdLoadSuccess();
            return;
        }
        int code = unityAdsError != null ? unityAdsError.getCode() : 1000;
        String message = unityAdsError != null ? unityAdsError.getMessage() : null;
        if (message == null) {
            message = "";
        }
        v11.d(new Object[]{Integer.valueOf(code), message}, 2, "Failed to load, errorCode = %s, errorMessage = %s", IronLog.ADAPTER_CALLBACK);
        this.listener.onAdLoadFailed(UnityAdsAdapter.Companion.getLoadErrorType(unityAdsError), code, message);
    }
}
