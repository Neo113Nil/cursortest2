package defpackage;

import android.app.Activity;
import android.content.Context;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class xb4 implements MediationInterstitialAd, InneractiveAdSpot.RequestListener, InneractiveFullscreenAdEventsListener {
    public final MediationAdLoadCallback a;
    public InneractiveAdSpot b;
    public MediationInterstitialAdCallback c;

    static {
        duf.a.getOrCreateKotlinClass(xb4.class).getSimpleName();
    }

    public xb4(MediationAdLoadCallback mediationAdLoadCallback) {
        mediationAdLoadCallback.getClass();
        this.a = mediationAdLoadCallback;
    }

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
        inneractiveErrorCode.getClass();
        this.a.onFailure(qb4.a(inneractiveErrorCode));
        if (inneractiveAdSpot != null) {
            inneractiveAdSpot.destroy();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
    public final void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot) {
        InneractiveAdSpot inneractiveAdSpot2 = this.b;
        if (inneractiveAdSpot2 == null) {
            Intrinsics.i("adSpot");
            throw null;
        }
        boolean isReady = inneractiveAdSpot2.isReady();
        MediationAdLoadCallback mediationAdLoadCallback = this.a;
        if (isReady) {
            this.c = (MediationInterstitialAdCallback) mediationAdLoadCallback.onSuccess(this);
            return;
        }
        AdError adError = new AdError(106, "DT Exchange's interstitial ad spot is not ready.", "com.google.ads.mediation.dtexchange");
        adError.getMessage();
        mediationAdLoadCallback.onFailure(adError);
        InneractiveAdSpot inneractiveAdSpot3 = this.b;
        if (inneractiveAdSpot3 != null) {
            inneractiveAdSpot3.destroy();
        } else {
            Intrinsics.i("adSpot");
            throw null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public final void showAd(Context context) {
        context.getClass();
        InneractiveAdSpot inneractiveAdSpot = this.b;
        if (inneractiveAdSpot == null) {
            Intrinsics.i("adSpot");
            throw null;
        }
        InneractiveUnitController selectedUnitController = inneractiveAdSpot.getSelectedUnitController();
        InneractiveFullscreenUnitController inneractiveFullscreenUnitController = selectedUnitController instanceof InneractiveFullscreenUnitController ? (InneractiveFullscreenUnitController) selectedUnitController : null;
        if (inneractiveFullscreenUnitController != null) {
            inneractiveFullscreenUnitController.show((Activity) context);
            return;
        }
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdOpened();
        }
        MediationInterstitialAdCallback mediationInterstitialAdCallback2 = this.c;
        if (mediationInterstitialAdCallback2 != null) {
            mediationInterstitialAdCallback2.onAdClosed();
        }
        InneractiveAdSpot inneractiveAdSpot2 = this.b;
        if (inneractiveAdSpot2 != null) {
            inneractiveAdSpot2.destroy();
        } else {
            Intrinsics.i("adSpot");
            throw null;
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public final void onAdWillCloseInternalBrowser(InneractiveAdSpot inneractiveAdSpot) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public final void onAdEnteredErrorState(InneractiveAdSpot inneractiveAdSpot, InneractiveUnitController.AdDisplayError adDisplayError) {
    }
}
