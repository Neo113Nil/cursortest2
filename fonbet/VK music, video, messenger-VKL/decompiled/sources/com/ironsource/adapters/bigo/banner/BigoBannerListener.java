package com.ironsource.adapters.bigo.banner;

import android.widget.FrameLayout;
import com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.logger.IronLog;
import java.lang.ref.WeakReference;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.BannerAd;
import xsna.v11;

/* compiled from: BigoBannerListener.kt */
/* loaded from: classes13.dex */
public final class BigoBannerListener implements AdInteractionListener, AdLoadListener<BannerAd> {
    private final WeakReference<BigoBannerAdapter> adapter;
    private final FrameLayout.LayoutParams layoutParams;
    private final BannerAdListener listener;

    public BigoBannerListener(BannerAdListener bannerAdListener, WeakReference<BigoBannerAdapter> weakReference, FrameLayout.LayoutParams layoutParams) {
        this.listener = bannerAdListener;
        this.adapter = weakReference;
        this.layoutParams = layoutParams;
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public void onAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.listener.onAdClicked();
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public void onAdClosed() {
        IronLog.ADAPTER_CALLBACK.verbose();
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public void onAdError(AdError adError) {
        v11.d(new Object[]{Integer.valueOf(adError.getCode()), adError.getMessage()}, 2, "Failed to show, errorCode = %s, errorMessage = %s", IronLog.ADAPTER_CALLBACK);
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
    public void onAdLoaded(BannerAd bannerAd) {
        IronLog.ADAPTER_CALLBACK.verbose();
        BigoBannerAdapter bigoBannerAdapter = this.adapter.get();
        if (bigoBannerAdapter != null) {
            bigoBannerAdapter.setBannerAd$bigoadapter_release(bannerAd);
        }
        this.listener.onAdLoadSuccess(bannerAd.adView(), this.layoutParams);
    }
}
