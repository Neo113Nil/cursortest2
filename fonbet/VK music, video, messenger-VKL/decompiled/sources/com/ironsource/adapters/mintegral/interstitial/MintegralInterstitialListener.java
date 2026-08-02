package com.ironsource.adapters.mintegral.interstitial;

import com.ironsource.adapters.mintegral.MintegralConstants;
import com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.logger.IronLog;
import com.mbridge.msdk.newinterstitial.out.MBBidNewInterstitialHandler;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialWithCodeListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import xsna.dt;
import xsna.t11;

/* compiled from: MintegralInterstitialListener.kt */
/* loaded from: classes13.dex */
public final class MintegralInterstitialListener extends NewInterstitialWithCodeListener {
    private final MBBidNewInterstitialHandler interstitialHandler;
    private final InterstitialAdListener listener;

    public MintegralInterstitialListener(InterstitialAdListener interstitialAdListener, MBBidNewInterstitialHandler mBBidNewInterstitialHandler) {
        this.listener = interstitialAdListener;
        this.interstitialHandler = mBBidNewInterstitialHandler;
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onAdClicked(MBridgeIds mBridgeIds) {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.listener.onAdClicked();
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.listener.onAdClosed();
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onAdCloseWithNIReward(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        IronLog.ADAPTER_CALLBACK.verbose();
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onAdShow(MBridgeIds mBridgeIds) {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.listener.onAdOpened();
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onEndcardShow(MBridgeIds mBridgeIds) {
        IronLog.ADAPTER_CALLBACK.verbose();
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onLoadCampaignSuccess(MBridgeIds mBridgeIds) {
        IronLog.ADAPTER_CALLBACK.verbose();
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialWithCodeListener
    public void onResourceLoadFailWithCode(MBridgeIds mBridgeIds, int i, String str) {
        t11.c(new Object[]{Integer.valueOf(i), str}, 2, MintegralConstants.Logs.ERROR_CODE_MSG, IronLog.ADAPTER_CALLBACK);
        this.listener.onAdLoadFailed(i == 708 ? AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL : AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, i, str);
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onResourceLoadSuccess(MBridgeIds mBridgeIds) {
        String creativeIdWithUnitId = this.interstitialHandler.getCreativeIdWithUnitId();
        t11.c(new Object[]{creativeIdWithUnitId}, 1, "creativeId = %s", IronLog.ADAPTER_CALLBACK);
        if (creativeIdWithUnitId == null || creativeIdWithUnitId.length() == 0) {
            this.listener.onAdLoadSuccess();
        } else {
            this.listener.onAdLoadSuccess(dt.b("creativeId", creativeIdWithUnitId));
        }
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialWithCodeListener
    public void onShowFailWithCode(MBridgeIds mBridgeIds, int i, String str) {
        t11.c(new Object[]{Integer.valueOf(i), str}, 2, MintegralConstants.Logs.ERROR_CODE_MSG, IronLog.ADAPTER_CALLBACK);
        this.listener.onAdShowFailed(i, str);
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onVideoComplete(MBridgeIds mBridgeIds) {
        IronLog.ADAPTER_CALLBACK.verbose();
    }
}
