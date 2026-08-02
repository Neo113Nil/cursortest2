package com.ironsource.adapters.vungle.banner;

import android.content.Context;
import android.widget.FrameLayout;
import com.ironsource.adapters.vungle.VungleAdapter;
import com.ironsource.adapters.vungle.VungleConstants;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.vungle.ads.BannerAdListener;
import com.vungle.ads.BaseAd;
import com.vungle.ads.VungleBannerView;
import com.vungle.ads.VungleError;
import xsna.dt;
import xsna.t11;
import xsna.v11;

/* compiled from: VungleBannerListener.kt */
/* loaded from: classes13.dex */
public final class VungleBannerListener implements BannerAdListener {
    private final VungleBannerView bannerView;
    private final com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener listener;

    public VungleBannerListener(com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener bannerAdListener, VungleBannerView vungleBannerView) {
        this.listener = bannerAdListener;
        this.bannerView = vungleBannerView;
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdClicked(BaseAd baseAd) {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.listener.onAdClicked();
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdEnd(BaseAd baseAd) {
        IronLog.ADAPTER_CALLBACK.verbose();
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
        v11.d(new Object[]{Integer.valueOf(vungleError.getCode()), vungleError.getErrorMessage()}, 2, "Failed to load, errorCode = %s, errorMessage = %s", IronLog.ADAPTER_CALLBACK);
        this.listener.onAdLoadFailed(VungleAdapter.Companion.getLoadErrorType(vungleError), vungleError.getCode(), vungleError.getErrorMessage());
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
        v11.d(new Object[]{Integer.valueOf(vungleError.getCode()), vungleError.getErrorMessage()}, 2, VungleConstants.Logs.FAILED_TO_PLAY, IronLog.ADAPTER_CALLBACK);
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdImpression(BaseAd baseAd) {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.listener.onAdOpened();
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLeftApplication(BaseAd baseAd) {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.listener.onAdLeftApplication();
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLoaded(BaseAd baseAd) {
        Context context = this.bannerView.getContext();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AdapterUtils.dpToPixels(context, this.bannerView.getAdViewSize().getWidth()), AdapterUtils.dpToPixels(context, this.bannerView.getAdViewSize().getHeight()), 17);
        String creativeId = baseAd.getCreativeId();
        t11.c(new Object[]{creativeId == null ? "" : creativeId}, 1, "creativeId = %s", IronLog.ADAPTER_CALLBACK);
        if (creativeId == null || creativeId.length() == 0) {
            this.listener.onAdLoadSuccess(this.bannerView, layoutParams);
        } else {
            this.listener.onAdLoadSuccess(this.bannerView, layoutParams, dt.b("creativeId", creativeId));
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdStart(BaseAd baseAd) {
        IronLog.ADAPTER_CALLBACK.verbose();
    }
}
