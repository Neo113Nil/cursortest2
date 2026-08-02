package com.unity3d.ironsourceads.interstitial;

import android.app.Activity;
import com.ironsource.C2704v9;
import com.ironsource.InterfaceC2722w9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InterstitialAd implements InterfaceC2722w9 {
    private final C2704v9 a;
    private InterstitialAdListener b;

    public InterstitialAd(C2704v9 interstitialAdInternal) {
        Intrinsics.checkNotNullParameter(interstitialAdInternal, "interstitialAdInternal");
        this.a = interstitialAdInternal;
        interstitialAdInternal.a(this);
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

    @Override // com.ironsource.InterfaceC2722w9
    public void onAdInstanceDidBecomeVisible() {
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdShown adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdShown(this);
        }
    }

    @Override // com.ironsource.InterfaceC2722w9
    public void onAdInstanceDidClick() {
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdClicked adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdClicked(this);
        }
    }

    @Override // com.ironsource.InterfaceC2722w9
    public void onAdInstanceDidDismiss() {
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdDismissed adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdDismissed(this);
        }
    }

    @Override // com.ironsource.InterfaceC2722w9
    public void onAdInstanceDidFailedToShow(IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdFailedToShow error : " + error + " adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdFailedToShow(this, error);
        }
    }

    @Override // com.ironsource.InterfaceC2722w9
    public void onAdInstanceDidReward(String str, int i) {
    }

    @Override // com.ironsource.InterfaceC2722w9
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
        Intrinsics.checkNotNullParameter(activity, "activity");
        IronLog.API.info();
        this.a.a(activity);
    }
}
