package com.ironsource.adapters.mintegral.banner;

import android.widget.FrameLayout;
import com.ironsource.adapters.mintegral.MintegralConstants;
import com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.logger.IronLog;
import com.mbridge.msdk.out.BannerAdWithCodeListener;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.out.MBridgeIds;
import xsna.dt;
import xsna.t11;

/* compiled from: MintegralBannerListener.kt */
/* loaded from: classes13.dex */
public final class MintegralBannerListener extends BannerAdWithCodeListener {
    private final MBBannerView bannerView;
    private final FrameLayout.LayoutParams layoutParams;
    private final BannerAdListener listener;

    public MintegralBannerListener(BannerAdListener bannerAdListener, MBBannerView mBBannerView, FrameLayout.LayoutParams layoutParams) {
        this.listener = bannerAdListener;
        this.bannerView = mBBannerView;
        this.layoutParams = layoutParams;
    }

    @Override // com.mbridge.msdk.out.BannerAdListener
    public void closeFullScreen(MBridgeIds mBridgeIds) {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.listener.onAdScreenDismissed();
    }

    @Override // com.mbridge.msdk.out.BannerAdListener
    public void onClick(MBridgeIds mBridgeIds) {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.listener.onAdClicked();
    }

    @Override // com.mbridge.msdk.out.BannerAdListener
    public void onCloseBanner(MBridgeIds mBridgeIds) {
        IronLog.ADAPTER_CALLBACK.verbose();
    }

    @Override // com.mbridge.msdk.out.BannerAdListener
    public void onLeaveApp(MBridgeIds mBridgeIds) {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.listener.onAdLeftApplication();
    }

    @Override // com.mbridge.msdk.out.BannerAdWithCodeListener
    public void onLoadFailedWithCode(MBridgeIds mBridgeIds, int i, String str) {
        t11.c(new Object[]{Integer.valueOf(i), str}, 2, MintegralConstants.Logs.ERROR_CODE_MSG, IronLog.ADAPTER_CALLBACK);
        this.listener.onAdLoadFailed(i == 708 ? AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL : AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, i, str);
    }

    @Override // com.mbridge.msdk.out.BannerAdListener
    public void onLoadSuccessed(MBridgeIds mBridgeIds) {
        String creativeIdWithUnitId = this.bannerView.getCreativeIdWithUnitId();
        t11.c(new Object[]{creativeIdWithUnitId}, 1, "creativeId = %s", IronLog.ADAPTER_CALLBACK);
        if (creativeIdWithUnitId == null || creativeIdWithUnitId.length() == 0) {
            this.listener.onAdLoadSuccess(this.bannerView, this.layoutParams);
        } else {
            this.listener.onAdLoadSuccess(this.bannerView, this.layoutParams, dt.b("creativeId", creativeIdWithUnitId));
        }
    }

    @Override // com.mbridge.msdk.out.BannerAdListener
    public void onLogImpression(MBridgeIds mBridgeIds) {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.listener.onAdOpened();
    }

    @Override // com.mbridge.msdk.out.BannerAdListener
    public void showFullScreen(MBridgeIds mBridgeIds) {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.listener.onAdScreenPresented();
    }
}
