package defpackage;

import android.content.Context;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class iic implements MediationAppOpenAd, InterstitialAdExtendedListener {
    public final MediationAdLoadCallback a;
    public InterstitialAd b;
    public MediationAppOpenAdCallback c;
    public final AtomicBoolean d;
    public final AtomicBoolean e;

    public iic(MediationAdLoadCallback mediationAdLoadCallback, k03 k03Var) {
        mediationAdLoadCallback.getClass();
        k03Var.getClass();
        this.a = mediationAdLoadCallback;
        this.d = new AtomicBoolean();
        this.e = new AtomicBoolean();
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad) {
        ad.getClass();
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.c;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.reportAdClicked();
        }
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad) {
        ad.getClass();
        this.c = (MediationAppOpenAdCallback) this.a.onSuccess(this);
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad, AdError adError) {
        ad.getClass();
        adError.getClass();
        com.google.android.gms.ads.AdError adError2 = FacebookMediationAdapter.getAdError(adError);
        adError2.getClass();
        adError2.getMessage();
        if (!this.d.get()) {
            this.a.onFailure(adError2);
            return;
        }
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.c;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdFailedToShow(adError2);
        }
    }

    @Override // com.facebook.ads.InterstitialAdExtendedListener
    public final void onInterstitialActivityDestroyed() {
        MediationAppOpenAdCallback mediationAppOpenAdCallback;
        if (this.e.getAndSet(true) || (mediationAppOpenAdCallback = this.c) == null) {
            return;
        }
        mediationAppOpenAdCallback.onAdClosed();
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDismissed(Ad ad) {
        MediationAppOpenAdCallback mediationAppOpenAdCallback;
        ad.getClass();
        if (this.e.getAndSet(true) || (mediationAppOpenAdCallback = this.c) == null) {
            return;
        }
        mediationAppOpenAdCallback.onAdClosed();
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDisplayed(Ad ad) {
        ad.getClass();
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.c;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdOpened();
        }
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad) {
        ad.getClass();
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.c;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.reportAdImpression();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAppOpenAd
    public final void showAd(Context context) {
        context.getClass();
        this.d.set(true);
        InterstitialAd interstitialAd = this.b;
        if (interstitialAd == null || interstitialAd.show()) {
            return;
        }
        com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(110, "Failed to present app open ad.", FacebookMediationAdapter.ERROR_DOMAIN);
        adError.toString();
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.c;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.facebook.ads.RewardedAdListener
    public final void onRewardedAdCompleted() {
    }

    @Override // com.facebook.ads.RewardedAdListener
    public final void onRewardedAdServerFailed() {
    }

    @Override // com.facebook.ads.RewardedAdListener
    public final void onRewardedAdServerSucceeded() {
    }
}
