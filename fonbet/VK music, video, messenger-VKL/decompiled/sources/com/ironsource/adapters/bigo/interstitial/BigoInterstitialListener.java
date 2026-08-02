package com.ironsource.adapters.bigo.interstitial;

import com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.logger.IronLog;
import java.lang.ref.WeakReference;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.InterstitialAd;
import xsna.v11;

/* compiled from: BigoInterstitialListener.kt */
/* loaded from: classes13.dex */
public final class BigoInterstitialListener implements AdInteractionListener, AdLoadListener<InterstitialAd> {
    private final WeakReference<BigoInterstitialAdapter> adapter;
    private final InterstitialAdListener listener;

    public BigoInterstitialListener(InterstitialAdListener interstitialAdListener, WeakReference<BigoInterstitialAdapter> weakReference) {
        this.listener = interstitialAdListener;
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

    @Override // sg.bigo.ads.api.AdLoadListener
    public void onError(AdError adError) {
        v11.d(new Object[]{Integer.valueOf(adError.getCode()), adError.getMessage()}, 2, "Failed to load, errorCode = %s, errorMessage = %s", IronLog.ADAPTER_CALLBACK);
        this.listener.onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, adError.getCode(), adError.getMessage());
    }

    @Override // sg.bigo.ads.api.AdLoadListener
    public void onAdLoaded(InterstitialAd interstitialAd) {
        IronLog.ADAPTER_CALLBACK.verbose();
        BigoInterstitialAdapter bigoInterstitialAdapter = this.adapter.get();
        if (bigoInterstitialAdapter != null) {
            bigoInterstitialAdapter.setInterstitialAd$bigoadapter_release(interstitialAd);
        }
        this.listener.onAdLoadSuccess();
    }
}
