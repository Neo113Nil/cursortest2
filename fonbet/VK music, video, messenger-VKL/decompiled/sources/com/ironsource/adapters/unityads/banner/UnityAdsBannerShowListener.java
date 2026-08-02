package com.ironsource.adapters.unityads.banner;

import com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.ads.BannerAd;
import com.unity3d.ads.BannerShowListener;
import com.unity3d.ads.UnityAdsError;
import xsna.v11;

/* compiled from: UnityAdsBannerShowListener.kt */
/* loaded from: classes13.dex */
public final class UnityAdsBannerShowListener implements BannerShowListener {
    private final BannerAdListener listener;

    public UnityAdsBannerShowListener(BannerAdListener bannerAdListener) {
        this.listener = bannerAdListener;
    }

    @Override // com.unity3d.ads.BannerShowListener
    public void onClicked(BannerAd bannerAd) {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.listener.onAdClicked();
    }

    @Override // com.unity3d.ads.BannerShowListener
    public void onFailedToShow(BannerAd bannerAd, UnityAdsError unityAdsError) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        Integer valueOf = Integer.valueOf(unityAdsError.getCode());
        String message = unityAdsError.getMessage();
        if (message == null) {
            message = "";
        }
        v11.d(new Object[]{valueOf, message}, 2, "Failed to show, errorCode = %s, errorMessage = %s", ironLog);
    }

    @Override // com.unity3d.ads.BannerShowListener
    public void onImpression(BannerAd bannerAd) {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.listener.onAdOpened();
    }
}
