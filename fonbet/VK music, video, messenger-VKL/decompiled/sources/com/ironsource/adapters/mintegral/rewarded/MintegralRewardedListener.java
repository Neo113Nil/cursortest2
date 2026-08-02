package com.ironsource.adapters.mintegral.rewarded;

import com.ironsource.adapters.mintegral.MintegralConstants;
import com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.logger.IronLog;
import com.mbridge.msdk.out.MBBidRewardVideoHandler;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.out.RewardVideoWithCodeListener;
import xsna.dt;
import xsna.t11;

/* compiled from: MintegralRewardedListener.kt */
/* loaded from: classes13.dex */
public final class MintegralRewardedListener extends RewardVideoWithCodeListener {
    private final RewardedVideoAdListener listener;
    private final MBBidRewardVideoHandler rewardedVideoHandler;

    public MintegralRewardedListener(RewardedVideoAdListener rewardedVideoAdListener, MBBidRewardVideoHandler mBBidRewardVideoHandler) {
        this.listener = rewardedVideoAdListener;
        this.rewardedVideoHandler = mBBidRewardVideoHandler;
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        t11.c(new Object[]{rewardInfo != null ? Boolean.valueOf(rewardInfo.isCompleteView()) : null}, 1, MintegralConstants.Logs.REWARDED_INFO, IronLog.ADAPTER_CALLBACK);
        if (rewardInfo != null && rewardInfo.isCompleteView()) {
            this.listener.onAdRewarded();
        }
        this.listener.onAdClosed();
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onAdShow(MBridgeIds mBridgeIds) {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.listener.onAdOpened();
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onEndcardShow(MBridgeIds mBridgeIds) {
        IronLog.ADAPTER_CALLBACK.verbose();
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onLoadSuccess(MBridgeIds mBridgeIds) {
        IronLog.ADAPTER_CALLBACK.verbose();
    }

    @Override // com.mbridge.msdk.out.RewardVideoWithCodeListener
    public void onShowFailWithCode(MBridgeIds mBridgeIds, int i, String str) {
        t11.c(new Object[]{Integer.valueOf(i), str}, 2, MintegralConstants.Logs.ERROR_CODE_MSG, IronLog.ADAPTER_CALLBACK);
        this.listener.onAdShowFailed(i, str);
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onVideoAdClicked(MBridgeIds mBridgeIds) {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.listener.onAdClicked();
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onVideoComplete(MBridgeIds mBridgeIds) {
        IronLog.ADAPTER_CALLBACK.verbose();
    }

    @Override // com.mbridge.msdk.out.RewardVideoWithCodeListener
    public void onVideoLoadFailWithCode(MBridgeIds mBridgeIds, int i, String str) {
        t11.c(new Object[]{Integer.valueOf(i), str}, 2, MintegralConstants.Logs.ERROR_CODE_MSG, IronLog.ADAPTER_CALLBACK);
        this.listener.onAdLoadFailed(i == 708 ? AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL : AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, i, str);
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onVideoLoadSuccess(MBridgeIds mBridgeIds) {
        String creativeIdWithUnitId = this.rewardedVideoHandler.getCreativeIdWithUnitId();
        t11.c(new Object[]{creativeIdWithUnitId}, 1, "creativeId = %s", IronLog.ADAPTER_CALLBACK);
        if (creativeIdWithUnitId == null || creativeIdWithUnitId.length() == 0) {
            this.listener.onAdLoadSuccess();
        } else {
            this.listener.onAdLoadSuccess(dt.b("creativeId", creativeIdWithUnitId));
        }
    }
}
