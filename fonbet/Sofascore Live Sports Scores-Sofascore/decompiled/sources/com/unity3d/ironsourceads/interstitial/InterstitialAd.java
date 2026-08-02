package com.unity3d.ironsourceads.interstitial;

import android.app.Activity;
import com.ironsource.C4359v9;
import com.ironsource.InterfaceC4377w9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class InterstitialAd implements InterfaceC4377w9 {

    @NotNull
    private final C4359v9 a;

    @Nullable
    private InterstitialAdListener b;

    public InterstitialAd(@NotNull C4359v9 c4359v9) {
        c4359v9.getClass();
        this.a = c4359v9;
        c4359v9.a(this);
    }

    @NotNull
    public final InterstitialAdInfo getAdInfo() {
        return this.a.b();
    }

    @Nullable
    public final InterstitialAdListener getListener() {
        return this.b;
    }

    public final boolean isReadyToShow() {
        IronLog.API.info();
        return this.a.d();
    }

    @Override // com.ironsource.InterfaceC4377w9
    public void onAdInstanceDidBecomeVisible() {
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdShown adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdShown(this);
        }
    }

    @Override // com.ironsource.InterfaceC4377w9
    public void onAdInstanceDidClick() {
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdClicked adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdClicked(this);
        }
    }

    @Override // com.ironsource.InterfaceC4377w9
    public void onAdInstanceDidDismiss() {
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdDismissed adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdDismissed(this);
        }
    }

    @Override // com.ironsource.InterfaceC4377w9
    public void onAdInstanceDidFailedToShow(@NotNull IronSourceError ironSourceError) {
        ironSourceError.getClass();
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdFailedToShow error : " + ironSourceError + " adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdFailedToShow(this, ironSourceError);
        }
    }

    @Override // com.ironsource.InterfaceC4377w9
    public void onAdInstanceDidShow() {
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdShown adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdShown(this);
        }
    }

    public final void setListener(@Nullable InterstitialAdListener interstitialAdListener) {
        this.b = interstitialAdListener;
    }

    public final void show(@NotNull Activity activity) {
        activity.getClass();
        IronLog.API.info();
        this.a.a(activity);
    }

    @Override // com.ironsource.InterfaceC4377w9
    public void onAdInstanceDidReward(@Nullable String str, int i) {
    }
}
