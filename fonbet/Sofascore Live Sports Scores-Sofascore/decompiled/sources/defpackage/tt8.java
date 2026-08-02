package defpackage;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener;
import com.google.ads.mediation.fyber.FyberMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class tt8 implements OnFyberMarketplaceInitializedListener {
    public final /* synthetic */ MediationAdLoadCallback a;
    public final /* synthetic */ MediationRewardedAdConfiguration b;
    public final /* synthetic */ FyberMediationAdapter c;

    public tt8(FyberMediationAdapter fyberMediationAdapter, MediationAdLoadCallback mediationAdLoadCallback, MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        this.c = fyberMediationAdapter;
        this.a = mediationAdLoadCallback;
        this.b = mediationRewardedAdConfiguration;
    }

    @Override // com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener
    public final void onFyberMarketplaceInitialized(OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus) {
        OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus2 = OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY;
        MediationAdLoadCallback mediationAdLoadCallback = this.a;
        if (fyberInitStatus != fyberInitStatus2) {
            AdError b = qb4.b(fyberInitStatus);
            InneractiveMediationName inneractiveMediationName = FyberMediationAdapter.c;
            b.getMessage();
            mediationAdLoadCallback.onFailure(b);
            return;
        }
        vt8 vt8Var = new vt8(mediationAdLoadCallback);
        this.c.a = vt8Var;
        MediationRewardedAdConfiguration mediationRewardedAdConfiguration = this.b;
        String string = mediationRewardedAdConfiguration.getServerParameters().getString("spotId");
        if (!TextUtils.isEmpty(string)) {
            vt8Var.a(mediationRewardedAdConfiguration);
            vt8Var.c.requestAd(new InneractiveAdRequest(string));
        } else {
            AdError adError = new AdError(101, "Spot ID is null or empty.", "com.google.ads.mediation.dtexchange");
            InneractiveMediationName inneractiveMediationName2 = FyberMediationAdapter.c;
            adError.getMessage();
            mediationAdLoadCallback.onFailure(adError);
        }
    }
}
