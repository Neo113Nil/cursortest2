package defpackage;

import android.app.Activity;
import android.content.Context;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveFullScreenAdRewardedListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.google.ads.mediation.fyber.FyberMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class vt8 implements MediationRewardedAd, InneractiveAdSpot.RequestListener, InneractiveFullscreenAdEventsListener, InneractiveFullScreenAdRewardedListener {
    public final MediationAdLoadCallback a;
    public MediationRewardedAdCallback b;
    public InneractiveAdSpot c;
    public InneractiveFullscreenUnitController d;

    public vt8(MediationAdLoadCallback mediationAdLoadCallback) {
        this.a = mediationAdLoadCallback;
    }

    public final void a(MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        InneractiveAdSpot createSpot = InneractiveAdSpotManager.get().createSpot();
        createSpot.getClass();
        this.c = createSpot;
        InneractiveFullscreenUnitController inneractiveFullscreenUnitController = new InneractiveFullscreenUnitController();
        this.d = inneractiveFullscreenUnitController;
        this.c.addUnitController(inneractiveFullscreenUnitController);
        this.c.setRequestListener(this);
        kik.h0(mediationRewardedAdConfiguration.getMediationExtras());
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public final void onAdClicked(InneractiveAdSpot inneractiveAdSpot) {
        this.b.reportAdClicked();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener
    public final void onAdDismissed(InneractiveAdSpot inneractiveAdSpot) {
        this.b.onAdClosed();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public final void onAdImpression(InneractiveAdSpot inneractiveAdSpot) {
        this.b.onAdOpened();
        InneractiveFullscreenUnitController inneractiveFullscreenUnitController = this.d;
        if (inneractiveFullscreenUnitController != null && inneractiveFullscreenUnitController.getSelectedContentController() != null && (inneractiveFullscreenUnitController.getSelectedContentController() instanceof InneractiveFullscreenVideoContentController)) {
            this.b.onVideoStart();
        }
        this.b.reportAdImpression();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullScreenAdRewardedListener
    public final void onAdRewarded(InneractiveAdSpot inneractiveAdSpot) {
        this.b.onUserEarnedReward();
        this.b.onVideoComplete();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
    public final void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
        AdError a = qb4.a(inneractiveErrorCode);
        InneractiveMediationName inneractiveMediationName = FyberMediationAdapter.c;
        a.getMessage();
        this.a.onFailure(a);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
    public final void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot) {
        this.b = (MediationRewardedAdCallback) this.a.onSuccess(this);
        this.d.setEventsListener(this);
        this.d.setRewardedListener(this);
        this.d.addContentController(new InneractiveFullscreenVideoContentController());
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public final void showAd(Context context) {
        if (!(context instanceof Activity)) {
            AdError adError = new AdError(107, "Cannot show a rewarded ad without an activity context.", "com.google.ads.mediation.dtexchange");
            InneractiveMediationName inneractiveMediationName = FyberMediationAdapter.c;
            adError.getMessage();
            MediationRewardedAdCallback mediationRewardedAdCallback = this.b;
            if (mediationRewardedAdCallback != null) {
                mediationRewardedAdCallback.onAdFailedToShow(adError);
                return;
            }
            return;
        }
        InneractiveAdSpot inneractiveAdSpot = this.c;
        if (inneractiveAdSpot != null && this.d != null && inneractiveAdSpot.isReady()) {
            this.d.show((Activity) context);
        } else if (this.b != null) {
            AdError adError2 = new AdError(106, "DT Exchange's rewarded spot is not ready.", "com.google.ads.mediation.dtexchange");
            InneractiveMediationName inneractiveMediationName2 = FyberMediationAdapter.c;
            adError2.getMessage();
            this.b.onAdFailedToShow(adError2);
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public final void onAdWillCloseInternalBrowser(InneractiveAdSpot inneractiveAdSpot) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public final void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public final void onAdEnteredErrorState(InneractiveAdSpot inneractiveAdSpot, InneractiveUnitController.AdDisplayError adDisplayError) {
    }
}
