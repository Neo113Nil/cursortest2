package defpackage;

import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class yb4 implements OnFyberMarketplaceInitializedListener {
    public final /* synthetic */ zb4 a;
    public final /* synthetic */ MediationBannerAdConfiguration b;
    public final /* synthetic */ String c;

    public yb4(zb4 zb4Var, MediationBannerAdConfiguration mediationBannerAdConfiguration, String str) {
        this.a = zb4Var;
        this.b = mediationBannerAdConfiguration;
        this.c = str;
    }

    @Override // com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener
    public final void onFyberMarketplaceInitialized(OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus) {
        fyberInitStatus.getClass();
        OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus2 = OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY;
        zb4 zb4Var = this.a;
        if (fyberInitStatus != fyberInitStatus2) {
            AdError b = qb4.b(fyberInitStatus);
            int i = zb4.f;
            b.toString();
            zb4Var.a.onFailure(b);
            return;
        }
        InneractiveAdSpot createSpot = InneractiveAdSpotManager.get().createSpot();
        createSpot.getClass();
        zb4Var.d = createSpot;
        InneractiveAdViewUnitController inneractiveAdViewUnitController = new InneractiveAdViewUnitController();
        InneractiveAdSpot inneractiveAdSpot = zb4Var.d;
        if (inneractiveAdSpot == null) {
            Intrinsics.i("bannerSpot");
            throw null;
        }
        inneractiveAdSpot.addUnitController(inneractiveAdViewUnitController);
        MediationBannerAdConfiguration mediationBannerAdConfiguration = this.b;
        zb4Var.e = new RelativeLayout(mediationBannerAdConfiguration.getContext());
        InneractiveAdSpot inneractiveAdSpot2 = zb4Var.d;
        if (inneractiveAdSpot2 == null) {
            Intrinsics.i("bannerSpot");
            throw null;
        }
        inneractiveAdSpot2.setRequestListener(zb4Var);
        AdSize adSize = mediationBannerAdConfiguration.getAdSize();
        adSize.getClass();
        zb4Var.c = adSize;
        kik.h0(mediationBannerAdConfiguration.getMediationExtras());
        InneractiveAdRequest inneractiveAdRequest = new InneractiveAdRequest(this.c);
        InneractiveAdSpot inneractiveAdSpot3 = zb4Var.d;
        if (inneractiveAdSpot3 != null) {
            inneractiveAdSpot3.requestAd(inneractiveAdRequest);
        } else {
            Intrinsics.i("bannerSpot");
            throw null;
        }
    }
}
