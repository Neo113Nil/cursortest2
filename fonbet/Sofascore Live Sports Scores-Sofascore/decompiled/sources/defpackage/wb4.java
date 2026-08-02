package defpackage;

import android.view.View;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class wb4 implements MediationBannerAd, InneractiveAdSpot.RequestListener, InneractiveAdViewEventsListener {
    public final MediationAdLoadCallback a;
    public InneractiveAdSpot b;
    public RelativeLayout c;
    public MediationBannerAdCallback d;

    static {
        duf.a.getOrCreateKotlinClass(wb4.class).getSimpleName();
    }

    public wb4(MediationAdLoadCallback mediationAdLoadCallback) {
        mediationAdLoadCallback.getClass();
        this.a = mediationAdLoadCallback;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public final View getView() {
        RelativeLayout relativeLayout = this.c;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.i("wrapperView");
        throw null;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public final void onAdClicked(InneractiveAdSpot inneractiveAdSpot) {
        MediationBannerAdCallback mediationBannerAdCallback = this.d;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public final void onAdImpression(InneractiveAdSpot inneractiveAdSpot) {
        MediationBannerAdCallback mediationBannerAdCallback = this.d;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public final void onAdWillCloseInternalBrowser(InneractiveAdSpot inneractiveAdSpot) {
        MediationBannerAdCallback mediationBannerAdCallback = this.d;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdClosed();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public final void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot) {
        MediationBannerAdCallback mediationBannerAdCallback = this.d;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdOpened();
            mediationBannerAdCallback.onAdLeftApplication();
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
        if (!isReady) {
            AdError adError = new AdError(106, "DT Exchange's banner ad spot is not ready.", "com.google.ads.mediation.dtexchange");
            adError.getMessage();
            mediationAdLoadCallback.onFailure(adError);
            InneractiveAdSpot inneractiveAdSpot3 = this.b;
            if (inneractiveAdSpot3 != null) {
                inneractiveAdSpot3.destroy();
                return;
            } else {
                Intrinsics.i("adSpot");
                throw null;
            }
        }
        InneractiveAdSpot inneractiveAdSpot4 = this.b;
        if (inneractiveAdSpot4 == null) {
            Intrinsics.i("adSpot");
            throw null;
        }
        InneractiveUnitController selectedUnitController = inneractiveAdSpot4.getSelectedUnitController();
        InneractiveAdViewUnitController inneractiveAdViewUnitController = selectedUnitController instanceof InneractiveAdViewUnitController ? (InneractiveAdViewUnitController) selectedUnitController : null;
        if (inneractiveAdViewUnitController != null) {
            RelativeLayout relativeLayout = this.c;
            if (relativeLayout == null) {
                Intrinsics.i("wrapperView");
                throw null;
            }
            inneractiveAdViewUnitController.bindView(relativeLayout);
            this.d = (MediationBannerAdCallback) mediationAdLoadCallback.onSuccess(this);
            return;
        }
        AdError adError2 = new AdError(105, "Unexpected controller type.", "com.google.ads.mediation.dtexchange");
        adError2.getMessage();
        mediationAdLoadCallback.onFailure(adError2);
        InneractiveAdSpot inneractiveAdSpot5 = this.b;
        if (inneractiveAdSpot5 != null) {
            inneractiveAdSpot5.destroy();
        } else {
            Intrinsics.i("adSpot");
            throw null;
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener
    public final void onAdCollapsed(InneractiveAdSpot inneractiveAdSpot) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener
    public final void onAdExpanded(InneractiveAdSpot inneractiveAdSpot) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener
    public final void onAdResized(InneractiveAdSpot inneractiveAdSpot) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public final void onAdEnteredErrorState(InneractiveAdSpot inneractiveAdSpot, InneractiveUnitController.AdDisplayError adDisplayError) {
    }
}
