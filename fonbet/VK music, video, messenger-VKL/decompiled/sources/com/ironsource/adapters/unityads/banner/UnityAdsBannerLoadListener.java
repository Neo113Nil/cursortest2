package com.ironsource.adapters.unityads.banner;

import android.widget.FrameLayout;
import com.ironsource.adapters.unityads.UnityAdsAdapter;
import com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.ads.BannerAd;
import com.unity3d.ads.LoadListener;
import com.unity3d.ads.UnityAdsError;
import java.lang.ref.WeakReference;
import xsna.v11;

/* compiled from: UnityAdsBannerLoadListener.kt */
/* loaded from: classes13.dex */
public final class UnityAdsBannerLoadListener implements LoadListener<BannerAd> {
    private final WeakReference<UnityAdsBannerAdapter> adapter;
    private final FrameLayout.LayoutParams layoutParams;
    private final BannerAdListener listener;

    public UnityAdsBannerLoadListener(BannerAdListener bannerAdListener, FrameLayout.LayoutParams layoutParams, WeakReference<UnityAdsBannerAdapter> weakReference) {
        this.listener = bannerAdListener;
        this.layoutParams = layoutParams;
        this.adapter = weakReference;
    }

    @Override // com.unity3d.ads.LoadListener
    public void onAdLoaded(BannerAd bannerAd, UnityAdsError unityAdsError) {
        if (bannerAd != null) {
            IronLog.ADAPTER_CALLBACK.verbose();
            UnityAdsBannerAdapter unityAdsBannerAdapter = this.adapter.get();
            if (unityAdsBannerAdapter != null) {
                unityAdsBannerAdapter.setBannerAdView$unityadsadapter_release(bannerAd);
            }
            this.listener.onAdLoadSuccess(bannerAd.getView(), this.layoutParams);
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
