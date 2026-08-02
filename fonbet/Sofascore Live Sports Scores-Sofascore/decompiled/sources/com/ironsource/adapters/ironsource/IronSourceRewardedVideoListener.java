package com.ironsource.adapters.ironsource;

import android.text.TextUtils;
import com.ironsource.J9;
import com.ironsource.Jc;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.bf3;
import defpackage.lnb;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class IronSourceRewardedVideoListener implements Jc {
    public final String AD_VISIBLE_EVENT_NAME = "impressions";
    private final String mDemandSourceName;
    boolean mIsRvDemandOnly;
    RewardedVideoSmashListener mListener;

    public IronSourceRewardedVideoListener(RewardedVideoSmashListener rewardedVideoSmashListener, String str, boolean z) {
        this.mDemandSourceName = str;
        this.mListener = rewardedVideoSmashListener;
        this.mIsRvDemandOnly = z;
    }

    @Override // com.ironsource.Jc
    public void onInterstitialAdRewarded(String str, int i) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        StringBuilder sb = new StringBuilder();
        bf3.v(sb, this.mDemandSourceName, " rewardedVideoListener demandSourceId=", str, " amount=");
        sb.append(i);
        ironLog.verbose(sb.toString());
        this.mListener.onRewardedVideoAdRewarded();
    }

    @Override // com.ironsource.Jc
    public void onInterstitialClick() {
        lnb.v(new StringBuilder(), this.mDemandSourceName, " rewardedVideoListener", IronLog.ADAPTER_CALLBACK);
        this.mListener.onRewardedVideoAdClicked();
    }

    @Override // com.ironsource.Jc
    public void onInterstitialClose() {
        lnb.v(new StringBuilder(), this.mDemandSourceName, " rewardedVideoListener", IronLog.ADAPTER_CALLBACK);
        this.mListener.onRewardedVideoAdClosed();
    }

    @Override // com.ironsource.Jc
    public void onInterstitialEventNotificationReceived(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " rewardedVideoListener eventName = " + str);
        if ("impressions".equals(str)) {
            this.mListener.onRewardedVideoAdVisible();
        }
    }

    @Override // com.ironsource.Jc
    public void onInterstitialInitFailed(String str) {
        lnb.v(new StringBuilder(), this.mDemandSourceName, " rewardedVideoListener", IronLog.ADAPTER_CALLBACK);
    }

    @Override // com.ironsource.Jc
    public void onInterstitialInitSuccess() {
        lnb.v(new StringBuilder(), this.mDemandSourceName, " rewardedVideoListener", IronLog.ADAPTER_CALLBACK);
    }

    @Override // com.ironsource.Jc
    public void onInterstitialLoadFailed(String str) {
        IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " rewardedVideoListener " + str);
        this.mListener.onRewardedVideoLoadFailed(ErrorBuilder.buildLoadFailedError(str));
        if (this.mIsRvDemandOnly) {
            return;
        }
        this.mListener.onRewardedVideoAvailabilityChanged(false);
    }

    @Override // com.ironsource.Jc
    public void onInterstitialLoadSuccess(J9 j9) {
        lnb.v(new StringBuilder(), this.mDemandSourceName, " rewardedVideoListener", IronLog.ADAPTER_CALLBACK);
        boolean z = this.mIsRvDemandOnly;
        RewardedVideoSmashListener rewardedVideoSmashListener = this.mListener;
        if (z) {
            rewardedVideoSmashListener.onRewardedVideoLoadSuccess();
        } else {
            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(true);
        }
    }

    @Override // com.ironsource.Jc
    public void onInterstitialOpen() {
        lnb.v(new StringBuilder(), this.mDemandSourceName, " rewardedVideoListener", IronLog.ADAPTER_CALLBACK);
        this.mListener.onRewardedVideoAdOpened();
    }

    @Override // com.ironsource.Jc
    public void onInterstitialShowFailed(String str) {
        IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + "rewardedVideoListener " + str);
        this.mListener.onRewardedVideoAdShowFailed(ErrorBuilder.buildShowFailedError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT, str));
    }

    @Override // com.ironsource.Jc
    public void onInterstitialShowSuccess() {
        lnb.v(new StringBuilder(), this.mDemandSourceName, " rewardedVideoListener", IronLog.ADAPTER_CALLBACK);
    }
}
