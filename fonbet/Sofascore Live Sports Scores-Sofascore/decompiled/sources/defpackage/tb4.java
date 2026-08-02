package defpackage;

import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.NativeAdEventsListener;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class tb4 extends NativeAdEventsListener {
    public final /* synthetic */ vb4 a;

    public tb4(vb4 vb4Var) {
        this.a = vb4Var;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public final void onAdClicked(InneractiveAdSpot inneractiveAdSpot) {
        inneractiveAdSpot.getClass();
        vb4 vb4Var = this.a;
        MediationNativeAdCallback mediationNativeAdCallback = vb4Var.r;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdClicked();
        }
        MediationNativeAdCallback mediationNativeAdCallback2 = vb4Var.r;
        if (mediationNativeAdCallback2 != null) {
            mediationNativeAdCallback2.onAdOpened();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public final void onAdImpression(InneractiveAdSpot inneractiveAdSpot) {
        inneractiveAdSpot.getClass();
        vb4 vb4Var = this.a;
        MediationNativeAdCallback mediationNativeAdCallback = vb4Var.r;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onAdOpened();
        }
        MediationNativeAdCallback mediationNativeAdCallback2 = vb4Var.r;
        if (mediationNativeAdCallback2 != null) {
            mediationNativeAdCallback2.reportAdImpression();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public final void onAdWillCloseInternalBrowser(InneractiveAdSpot inneractiveAdSpot) {
        inneractiveAdSpot.getClass();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public final void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot) {
        inneractiveAdSpot.getClass();
        MediationNativeAdCallback mediationNativeAdCallback = this.a.r;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onAdLeftApplication();
        }
    }
}
