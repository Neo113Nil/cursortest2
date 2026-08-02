package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.ads.mediation.ironsource.IronSourceMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import com.unity3d.ironsourceads.interstitial.InterstitialAdListener;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class rba implements MediationInterstitialAd, InterstitialAdLoaderListener, InterstitialAdListener {
    public MediationInterstitialAdCallback a;
    public final MediationAdLoadCallback b;
    public InterstitialAd c = null;

    public rba(MediationAdLoadCallback mediationAdLoadCallback) {
        this.b = mediationAdLoadCallback;
    }

    @Override // com.unity3d.ironsourceads.interstitial.InterstitialAdListener
    public final void onInterstitialAdClicked(InterstitialAd interstitialAd) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.a;
        if (mediationInterstitialAdCallback == null) {
            return;
        }
        mediationInterstitialAdCallback.reportAdClicked();
    }

    @Override // com.unity3d.ironsourceads.interstitial.InterstitialAdListener
    public final void onInterstitialAdDismissed(InterstitialAd interstitialAd) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.a;
        if (mediationInterstitialAdCallback == null) {
            return;
        }
        mediationInterstitialAdCallback.onAdClosed();
    }

    @Override // com.unity3d.ironsourceads.interstitial.InterstitialAdListener
    public final void onInterstitialAdFailedToShow(InterstitialAd interstitialAd, IronSourceError ironSourceError) {
        AdError adError = new AdError(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), IronSourceMediationAdapter.IRONSOURCE_SDK_ERROR_DOMAIN);
        adError.toString();
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.a;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener
    public final void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        ironSourceError.toString();
        this.b.onFailure(new AdError(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), IronSourceMediationAdapter.IRONSOURCE_SDK_ERROR_DOMAIN));
    }

    @Override // com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener
    public final void onInterstitialAdLoaded(InterstitialAd interstitialAd) {
        this.c = interstitialAd;
        this.a = (MediationInterstitialAdCallback) this.b.onSuccess(this);
    }

    @Override // com.unity3d.ironsourceads.interstitial.InterstitialAdListener
    public final void onInterstitialAdShown(InterstitialAd interstitialAd) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.a;
        if (mediationInterstitialAdCallback == null) {
            return;
        }
        mediationInterstitialAdCallback.onAdOpened();
        this.a.reportAdImpression();
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public final void showAd(Context context) {
        InterstitialAd interstitialAd = this.c;
        if (interstitialAd == null) {
            AdError u = nq8.u(107, "ad is null");
            u.toString();
            MediationInterstitialAdCallback mediationInterstitialAdCallback = this.a;
            if (mediationInterstitialAdCallback != null) {
                mediationInterstitialAdCallback.onAdFailedToShow(u);
                return;
            }
            return;
        }
        try {
            interstitialAd.setListener(this);
            this.c.show((Activity) context);
        } catch (ClassCastException unused) {
            AdError u2 = nq8.u(102, "IronSource requires an Activity context to load ads.");
            u2.toString();
            MediationInterstitialAdCallback mediationInterstitialAdCallback2 = this.a;
            if (mediationInterstitialAdCallback2 != null) {
                mediationInterstitialAdCallback2.onAdFailedToShow(u2);
            }
        }
    }
}
