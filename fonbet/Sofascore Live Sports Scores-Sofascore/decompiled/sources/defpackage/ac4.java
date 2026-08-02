package defpackage;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener;
import com.google.ads.mediation.fyber.FyberMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ac4 implements OnFyberMarketplaceInitializedListener {
    public final /* synthetic */ MediationAdLoadCallback a;
    public final /* synthetic */ bc4 b;
    public final /* synthetic */ MediationInterstitialAdConfiguration c;
    public final /* synthetic */ String d;

    public ac4(MediationAdLoadCallback mediationAdLoadCallback, bc4 bc4Var, MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, String str) {
        this.a = mediationAdLoadCallback;
        this.b = bc4Var;
        this.c = mediationInterstitialAdConfiguration;
        this.d = str;
    }

    @Override // com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener
    public final void onFyberMarketplaceInitialized(OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus) {
        fyberInitStatus.getClass();
        if (fyberInitStatus != OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY) {
            AdError b = qb4.b(fyberInitStatus);
            InneractiveMediationName inneractiveMediationName = FyberMediationAdapter.c;
            b.getMessage();
            this.a.onFailure(b);
            return;
        }
        InneractiveAdSpot createSpot = InneractiveAdSpotManager.get().createSpot();
        createSpot.getClass();
        bc4 bc4Var = this.b;
        bc4Var.b = createSpot;
        InneractiveFullscreenUnitController inneractiveFullscreenUnitController = new InneractiveFullscreenUnitController();
        InneractiveAdSpot inneractiveAdSpot = bc4Var.b;
        if (inneractiveAdSpot == null) {
            Intrinsics.i("interstitialSpot");
            throw null;
        }
        inneractiveAdSpot.addUnitController(inneractiveFullscreenUnitController);
        InneractiveAdSpot inneractiveAdSpot2 = bc4Var.b;
        if (inneractiveAdSpot2 == null) {
            Intrinsics.i("interstitialSpot");
            throw null;
        }
        inneractiveAdSpot2.setRequestListener(bc4Var);
        kik.h0(this.c.getMediationExtras());
        InneractiveAdRequest inneractiveAdRequest = new InneractiveAdRequest(this.d);
        InneractiveAdSpot inneractiveAdSpot3 = bc4Var.b;
        if (inneractiveAdSpot3 != null) {
            inneractiveAdSpot3.requestAd(inneractiveAdRequest);
        } else {
            Intrinsics.i("interstitialSpot");
            throw null;
        }
    }
}
