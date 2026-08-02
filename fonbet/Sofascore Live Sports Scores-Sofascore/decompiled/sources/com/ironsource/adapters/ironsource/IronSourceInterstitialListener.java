package com.ironsource.adapters.ironsource;

import android.text.TextUtils;
import com.ironsource.J9;
import com.ironsource.Jc;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import defpackage.bf3;
import defpackage.lnb;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class IronSourceInterstitialListener implements Jc {
    public final String AD_VISIBLE_EVENT_NAME = "impressions";
    private final String mDemandSourceName;
    private final InterstitialSmashListener mListener;

    public IronSourceInterstitialListener(InterstitialSmashListener interstitialSmashListener, String str) {
        this.mDemandSourceName = str;
        this.mListener = interstitialSmashListener;
    }

    @Override // com.ironsource.Jc
    public void onInterstitialAdRewarded(String str, int i) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        StringBuilder sb = new StringBuilder();
        bf3.v(sb, this.mDemandSourceName, " interstitialListener demandSourceId=", str, " amount=");
        sb.append(i);
        ironLog.verbose(sb.toString());
    }

    @Override // com.ironsource.Jc
    public void onInterstitialClick() {
        lnb.v(new StringBuilder(), this.mDemandSourceName, " interstitialListener", IronLog.ADAPTER_CALLBACK);
        this.mListener.onInterstitialAdClicked();
    }

    @Override // com.ironsource.Jc
    public void onInterstitialClose() {
        lnb.v(new StringBuilder(), this.mDemandSourceName, " interstitialListener", IronLog.ADAPTER_CALLBACK);
        this.mListener.onInterstitialAdClosed();
    }

    @Override // com.ironsource.Jc
    public void onInterstitialEventNotificationReceived(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " interstitialListener eventName = " + str);
        if ("impressions".equals(str)) {
            this.mListener.onInterstitialAdVisible();
        }
    }

    @Override // com.ironsource.Jc
    public void onInterstitialInitFailed(String str) {
        lnb.v(new StringBuilder(), this.mDemandSourceName, " interstitialListener", IronLog.ADAPTER_CALLBACK);
    }

    @Override // com.ironsource.Jc
    public void onInterstitialInitSuccess() {
        lnb.v(new StringBuilder(), this.mDemandSourceName, " interstitialListener", IronLog.ADAPTER_CALLBACK);
    }

    @Override // com.ironsource.Jc
    public void onInterstitialLoadFailed(String str) {
        IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " interstitialListener " + str);
        this.mListener.onInterstitialAdLoadFailed(ErrorBuilder.buildLoadFailedError(str));
    }

    @Override // com.ironsource.Jc
    public void onInterstitialLoadSuccess(J9 j9) {
        lnb.v(new StringBuilder(), this.mDemandSourceName, " interstitialListener", IronLog.ADAPTER_CALLBACK);
        this.mListener.onInterstitialAdReady();
    }

    @Override // com.ironsource.Jc
    public void onInterstitialOpen() {
        lnb.v(new StringBuilder(), this.mDemandSourceName, " interstitialListener", IronLog.ADAPTER_CALLBACK);
        this.mListener.onInterstitialAdOpened();
    }

    @Override // com.ironsource.Jc
    public void onInterstitialShowFailed(String str) {
        IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " interstitialListener " + str);
        this.mListener.onInterstitialAdShowFailed(ErrorBuilder.buildShowFailedError("Interstitial", str));
    }

    @Override // com.ironsource.Jc
    public void onInterstitialShowSuccess() {
        lnb.v(new StringBuilder(), this.mDemandSourceName, " interstitialListener", IronLog.ADAPTER_CALLBACK);
        this.mListener.onInterstitialAdShowSucceeded();
    }
}
