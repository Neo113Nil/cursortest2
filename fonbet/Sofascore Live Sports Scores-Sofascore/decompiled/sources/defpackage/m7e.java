package defpackage;

import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class m7e implements MediationAppOpenAd {
    public final MediationAdLoadCallback a;
    public final b8e b;
    public final q7e c;
    public MediationAppOpenAdCallback d;
    public PAGAppOpenAd e;

    public m7e(MediationAdLoadCallback mediationAdLoadCallback, s7e s7eVar, b8e b8eVar, q7e q7eVar) {
        this.a = mediationAdLoadCallback;
        this.b = b8eVar;
        this.c = q7eVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAppOpenAd
    public final void showAd(Context context) {
        this.e.setAdInteractionListener(new bka(this, 10));
        boolean z = context instanceof Activity;
        PAGAppOpenAd pAGAppOpenAd = this.e;
        if (z) {
            pAGAppOpenAd.show((Activity) context);
        } else {
            pAGAppOpenAd.show(null);
        }
    }
}
