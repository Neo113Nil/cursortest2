package defpackage;

import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class u7e implements MediationInterstitialAd {
    public final MediationAdLoadCallback a;
    public final b8e b;
    public final q7e c;
    public MediationInterstitialAdCallback d;
    public PAGInterstitialAd e;

    public u7e(MediationAdLoadCallback mediationAdLoadCallback, s7e s7eVar, b8e b8eVar, q7e q7eVar) {
        this.a = mediationAdLoadCallback;
        this.b = b8eVar;
        this.c = q7eVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public final void showAd(Context context) {
        this.e.setAdInteractionListener(new d4a(this, 11));
        boolean z = context instanceof Activity;
        PAGInterstitialAd pAGInterstitialAd = this.e;
        if (z) {
            pAGInterstitialAd.show((Activity) context);
        } else {
            pAGInterstitialAd.show(null);
        }
    }
}
