package defpackage;

import android.app.Activity;
import android.content.Context;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.google.ads.mediation.fyber.FyberMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class bc4 implements MediationInterstitialAd, InneractiveAdSpot.RequestListener, InneractiveFullscreenAdEventsListener {
    public MediationAdLoadCallback a;
    public InneractiveAdSpot b;
    public MediationInterstitialAdCallback c;

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public final void onAdClicked(InneractiveAdSpot inneractiveAdSpot) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdClicked();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener
    public final void onAdDismissed(InneractiveAdSpot inneractiveAdSpot) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdClosed();
        }
        InneractiveAdSpot inneractiveAdSpot2 = this.b;
        if (inneractiveAdSpot2 != null) {
            inneractiveAdSpot2.destroy();
        } else {
            Intrinsics.i("interstitialSpot");
            throw null;
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public final void onAdEnteredErrorState(InneractiveAdSpot inneractiveAdSpot, InneractiveUnitController.AdDisplayError adDisplayError) {
        String str;
        if (adDisplayError == null || (str = adDisplayError.getMessage()) == null) {
            str = "";
        }
        AdError adError = new AdError(108, str, "com.google.ads.mediation.dtexchange");
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdFailedToShow(adError);
        }
        InneractiveAdSpot inneractiveAdSpot2 = this.b;
        if (inneractiveAdSpot2 != null) {
            inneractiveAdSpot2.destroy();
        } else {
            Intrinsics.i("interstitialSpot");
            throw null;
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public final void onAdImpression(InneractiveAdSpot inneractiveAdSpot) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdOpened();
        }
        MediationInterstitialAdCallback mediationInterstitialAdCallback2 = this.c;
        if (mediationInterstitialAdCallback2 != null) {
            mediationInterstitialAdCallback2.reportAdImpression();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public final void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
    public final void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
        AdError a = qb4.a(inneractiveErrorCode);
        InneractiveMediationName inneractiveMediationName = FyberMediationAdapter.c;
        a.getMessage();
        this.a.onFailure(a);
        InneractiveAdSpot inneractiveAdSpot2 = this.b;
        if (inneractiveAdSpot2 != null) {
            inneractiveAdSpot2.destroy();
        } else {
            Intrinsics.i("interstitialSpot");
            throw null;
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
    public final void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot) {
        InneractiveAdSpot inneractiveAdSpot2 = this.b;
        if (inneractiveAdSpot2 == null) {
            Intrinsics.i("interstitialSpot");
            throw null;
        }
        boolean z = inneractiveAdSpot2.getSelectedUnitController() instanceof InneractiveFullscreenUnitController;
        InneractiveAdSpot inneractiveAdSpot3 = this.b;
        if (z) {
            if (inneractiveAdSpot3 == null) {
                Intrinsics.i("interstitialSpot");
                throw null;
            }
            InneractiveUnitController selectedUnitController = inneractiveAdSpot3.getSelectedUnitController();
            selectedUnitController.getClass();
            ((InneractiveFullscreenUnitController) selectedUnitController).setEventsListener(this);
            this.c = (MediationInterstitialAdCallback) this.a.onSuccess(this);
            return;
        }
        String name = InneractiveUnitController.class.getName();
        if (inneractiveAdSpot3 == null) {
            Intrinsics.i("interstitialSpot");
            throw null;
        }
        AdError adError = new AdError(105, fc6.n("Unexpected controller type. Expected: ", name, ". Actual: ", inneractiveAdSpot3.getSelectedUnitController().getClass().getName()), "com.google.ads.mediation.dtexchange");
        InneractiveMediationName inneractiveMediationName = FyberMediationAdapter.c;
        adError.getMessage();
        this.a.onFailure(adError);
        InneractiveAdSpot inneractiveAdSpot4 = this.b;
        if (inneractiveAdSpot4 != null) {
            inneractiveAdSpot4.destroy();
        } else {
            Intrinsics.i("interstitialSpot");
            throw null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public final void showAd(Context context) {
        context.getClass();
        InneractiveAdSpot inneractiveAdSpot = this.b;
        if (inneractiveAdSpot == null) {
            Intrinsics.i("interstitialSpot");
            throw null;
        }
        if (!(inneractiveAdSpot.getSelectedUnitController() instanceof InneractiveFullscreenUnitController)) {
            InneractiveMediationName inneractiveMediationName = FyberMediationAdapter.c;
            AdError adError = new AdError(105, "showInterstitial called, but wrong spot has been used (should not happen).", "com.google.ads.mediation.dtexchange");
            MediationInterstitialAdCallback mediationInterstitialAdCallback = this.c;
            if (mediationInterstitialAdCallback != null) {
                mediationInterstitialAdCallback.onAdFailedToShow(adError);
            }
            InneractiveAdSpot inneractiveAdSpot2 = this.b;
            if (inneractiveAdSpot2 != null) {
                inneractiveAdSpot2.destroy();
                return;
            } else {
                Intrinsics.i("interstitialSpot");
                throw null;
            }
        }
        InneractiveAdSpot inneractiveAdSpot3 = this.b;
        if (inneractiveAdSpot3 == null) {
            Intrinsics.i("interstitialSpot");
            throw null;
        }
        InneractiveUnitController selectedUnitController = inneractiveAdSpot3.getSelectedUnitController();
        selectedUnitController.getClass();
        InneractiveFullscreenUnitController inneractiveFullscreenUnitController = (InneractiveFullscreenUnitController) selectedUnitController;
        InneractiveAdSpot inneractiveAdSpot4 = this.b;
        if (inneractiveAdSpot4 == null) {
            Intrinsics.i("interstitialSpot");
            throw null;
        }
        if (inneractiveAdSpot4.isReady()) {
            inneractiveFullscreenUnitController.show((Activity) context);
            return;
        }
        InneractiveMediationName inneractiveMediationName2 = FyberMediationAdapter.c;
        AdError adError2 = new AdError(106, "showInterstitial called, but the ad is not ready.", "com.google.ads.mediation.dtexchange");
        MediationInterstitialAdCallback mediationInterstitialAdCallback2 = this.c;
        if (mediationInterstitialAdCallback2 != null) {
            mediationInterstitialAdCallback2.onAdFailedToShow(adError2);
        }
        InneractiveAdSpot inneractiveAdSpot5 = this.b;
        if (inneractiveAdSpot5 != null) {
            inneractiveAdSpot5.destroy();
        } else {
            Intrinsics.i("interstitialSpot");
            throw null;
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public final void onAdWillCloseInternalBrowser(InneractiveAdSpot inneractiveAdSpot) {
    }
}
