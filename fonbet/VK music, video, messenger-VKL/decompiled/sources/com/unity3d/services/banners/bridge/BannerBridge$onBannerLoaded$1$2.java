package com.unity3d.services.banners.bridge;

import com.unity3d.ads.BannerShowListenerWithOnFailedToShow;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerView;

/* compiled from: BannerBridge.kt */
/* loaded from: classes14.dex */
public final class BannerBridge$onBannerLoaded$1$2 implements Listeners {
    final /* synthetic */ BannerView $bannerAdView;
    final /* synthetic */ BannerView.IListener $bannerListener;

    public BannerBridge$onBannerLoaded$1$2(BannerView.IListener iListener, BannerView bannerView) {
        this.$bannerListener = iListener;
        this.$bannerAdView = bannerView;
    }

    @Override // com.unity3d.ads.core.data.model.Listeners
    public void onClick(String str) {
        BannerView.IListener iListener = this.$bannerListener;
        if (iListener != null) {
            iListener.onBannerClick(this.$bannerAdView);
        }
    }

    @Override // com.unity3d.ads.core.data.model.Listeners
    public void onError(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
        if (this.$bannerListener instanceof BannerShowListenerWithOnFailedToShow) {
            ((BannerShowListenerWithOnFailedToShow) this.$bannerListener).onBannerFailedToShow(this.$bannerAdView, BannerErrorInfo.fromShowError(unityAdsShowError, str2));
        }
    }

    @Override // com.unity3d.ads.core.data.model.Listeners
    public void onLeftApplication(String str) {
        BannerView.IListener iListener = this.$bannerListener;
        if (iListener != null) {
            iListener.onBannerLeftApplication(this.$bannerAdView);
        }
    }

    @Override // com.unity3d.ads.core.data.model.Listeners
    public void onRewarded(String str) {
        Listeners.DefaultImpls.onRewarded(this, str);
    }

    @Override // com.unity3d.ads.core.data.model.Listeners
    public void onStart(String str) {
        BannerView.IListener iListener = this.$bannerListener;
        if (iListener != null) {
            iListener.onBannerShown(this.$bannerAdView);
        }
    }

    @Override // com.unity3d.ads.core.data.model.Listeners
    public void onComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
    }
}
