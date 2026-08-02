package com.unity3d.ironsourceads.interstitial;

import android.app.Activity;
import com.ironsource.C4618w9;
import com.ironsource.InterfaceC4636x9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes14.dex */
public final class InterstitialAd implements InterfaceC4636x9 {
    private final C4618w9 a;
    private InterstitialAdListener b;

    public InterstitialAd(C4618w9 c4618w9) {
        this.a = c4618w9;
        c4618w9.a(this);
    }

    public final InterstitialAdInfo getAdInfo() {
        return this.a.b();
    }

    public final InterstitialAdListener getListener() {
        return this.b;
    }

    public final boolean isReadyToShow() {
        IronLog.API.info();
        return this.a.d();
    }

    @Override // com.ironsource.InterfaceC4636x9
    public void onAdInstanceDidBecomeVisible() {
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdShown adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdShown(this);
        }
    }

    @Override // com.ironsource.InterfaceC4636x9
    public void onAdInstanceDidClick() {
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdClicked adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdClicked(this);
        }
    }

    @Override // com.ironsource.InterfaceC4636x9
    public void onAdInstanceDidDismiss() {
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdDismissed adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdDismissed(this);
        }
    }

    @Override // com.ironsource.InterfaceC4636x9
    public void onAdInstanceDidFailedToShow(IronSourceError ironSourceError) {
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdFailedToShow error : " + ironSourceError + " adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdFailedToShow(this, ironSourceError);
        }
    }

    @Override // com.ironsource.InterfaceC4636x9
    public void onAdInstanceDidShow() {
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdShown adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdShown(this);
        }
    }

    public final void setListener(InterstitialAdListener interstitialAdListener) {
        this.b = interstitialAdListener;
    }

    public final void show(Activity activity) {
        IronLog.API.info();
        this.a.a(activity);
    }

    @Override // com.ironsource.InterfaceC4636x9
    public void onAdInstanceDidReward(String str, int i) {
    }
}
