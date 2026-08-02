package defpackage;

import com.google.ads.mediation.ironsource.IronSourceMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class nba implements ISDemandOnlyInterstitialListener {
    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public final void onInterstitialAdClicked(String str) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback;
        new StringBuilder("IronSource interstitial ad clicked for instance ID: ").append(str);
        mba a = mba.a(str);
        if (a == null || (mediationInterstitialAdCallback = a.a) == null) {
            return;
        }
        mediationInterstitialAdCallback.reportAdClicked();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public final void onInterstitialAdClosed(String str) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback;
        mba a = mba.a(str);
        if (a != null && (mediationInterstitialAdCallback = a.a) != null) {
            mediationInterstitialAdCallback.onAdClosed();
        }
        mba.d.remove(str);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public final void onInterstitialAdLoadFailed(String str, IronSourceError ironSourceError) {
        MediationAdLoadCallback mediationAdLoadCallback;
        AdError adError = new AdError(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), IronSourceMediationAdapter.IRONSOURCE_SDK_ERROR_DOMAIN);
        adError.toString();
        mba a = mba.a(str);
        if (a != null && (mediationAdLoadCallback = a.b) != null) {
            mediationAdLoadCallback.onFailure(adError);
        }
        mba.d.remove(str);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public final void onInterstitialAdOpened(String str) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback;
        new StringBuilder("IronSource interstitial ad opened for instance ID: ").append(str);
        mba a = mba.a(str);
        if (a == null || (mediationInterstitialAdCallback = a.a) == null) {
            return;
        }
        mediationInterstitialAdCallback.onAdOpened();
        mediationInterstitialAdCallback.reportAdImpression();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public final void onInterstitialAdReady(String str) {
        MediationAdLoadCallback mediationAdLoadCallback;
        new StringBuilder("IronSource interstitial ad is ready for instance ID: ").append(str);
        mba a = mba.a(str);
        if (a == null || (mediationAdLoadCallback = a.b) == null) {
            return;
        }
        a.a = (MediationInterstitialAdCallback) mediationAdLoadCallback.onSuccess(a);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public final void onInterstitialAdShowFailed(String str, IronSourceError ironSourceError) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback;
        AdError adError = new AdError(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), IronSourceMediationAdapter.IRONSOURCE_SDK_ERROR_DOMAIN);
        adError.toString();
        mba a = mba.a(str);
        if (a != null && (mediationInterstitialAdCallback = a.a) != null) {
            mediationInterstitialAdCallback.onAdFailedToShow(adError);
        }
        mba.d.remove(str);
    }
}
