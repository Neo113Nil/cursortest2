package com.unity3d.services.banners.bridge;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.unity3d.ads.BannerShowListenerWithOnFailedToShow;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerView;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005H\u0016¨\u0006\u000f"}, d2 = {"com/unity3d/services/banners/bridge/BannerBridge$onBannerLoaded$1$2", "Lcom/unity3d/ads/core/data/model/Listeners;", "onLeftApplication", "", "placementId", "", "onComplete", "state", "Lcom/unity3d/ads/UnityAds$UnityAdsShowCompletionState;", "onClick", "onStart", "onError", "error", "Lcom/unity3d/ads/UnityAds$UnityAdsShowError;", PglCryptUtils.KEY_MESSAGE, "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BannerBridge$onBannerLoaded$1$2 implements Listeners {
    final /* synthetic */ BannerView $bannerAdView;
    final /* synthetic */ BannerView.IListener $bannerListener;

    public BannerBridge$onBannerLoaded$1$2(BannerView.IListener iListener, BannerView bannerView) {
        this.$bannerListener = iListener;
        this.$bannerAdView = bannerView;
    }

    @Override // com.unity3d.ads.core.data.model.Listeners
    public void onClick(String placementId) {
        placementId.getClass();
        BannerView.IListener iListener = this.$bannerListener;
        if (iListener != null) {
            iListener.onBannerClick(this.$bannerAdView);
        }
    }

    @Override // com.unity3d.ads.core.data.model.Listeners
    public void onComplete(String placementId, UnityAds.UnityAdsShowCompletionState state) {
        placementId.getClass();
        state.getClass();
    }

    @Override // com.unity3d.ads.core.data.model.Listeners
    public void onError(String placementId, UnityAds.UnityAdsShowError error, String message) {
        placementId.getClass();
        error.getClass();
        message.getClass();
        if (this.$bannerListener instanceof BannerShowListenerWithOnFailedToShow) {
            BannerErrorInfo fromShowError = BannerErrorInfo.fromShowError(error, message);
            BannerView.IListener iListener = this.$bannerListener;
            iListener.getClass();
            BannerView bannerView = this.$bannerAdView;
            fromShowError.getClass();
            ((BannerShowListenerWithOnFailedToShow) iListener).onBannerFailedToShow(bannerView, fromShowError);
        }
    }

    @Override // com.unity3d.ads.core.data.model.Listeners
    public void onLeftApplication(String placementId) {
        placementId.getClass();
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
    public void onStart(String placementId) {
        placementId.getClass();
        BannerView.IListener iListener = this.$bannerListener;
        if (iListener != null) {
            iListener.onBannerShown(this.$bannerAdView);
        }
    }
}
