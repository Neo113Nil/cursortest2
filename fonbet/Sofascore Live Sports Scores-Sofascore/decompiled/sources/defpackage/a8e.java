package defpackage;

import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class a8e implements MediationRewardedAd {
    public final MediationAdLoadCallback a;
    public final b8e b;
    public final q7e c;
    public MediationRewardedAdCallback d;
    public PAGRewardedAd e;

    public a8e(MediationAdLoadCallback mediationAdLoadCallback, s7e s7eVar, b8e b8eVar, q7e q7eVar) {
        this.a = mediationAdLoadCallback;
        this.b = b8eVar;
        this.c = q7eVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public final void showAd(Context context) {
        this.e.setAdInteractionListener(new cqa(this));
        boolean z = context instanceof Activity;
        PAGRewardedAd pAGRewardedAd = this.e;
        if (z) {
            pAGRewardedAd.show((Activity) context);
        } else {
            pAGRewardedAd.show(null);
        }
    }
}
