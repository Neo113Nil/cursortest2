package defpackage;

import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class z7e implements PAGRewardedAdLoadListener {
    public final /* synthetic */ l7e a;

    public z7e(l7e l7eVar) {
        this.a = l7eVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public final void onAdLoaded(PAGRewardedAd pAGRewardedAd) {
        a8e a8eVar = (a8e) this.a.e;
        a8eVar.d = (MediationRewardedAdCallback) a8eVar.a.onSuccess(a8eVar);
        a8eVar.e = pAGRewardedAd;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.qf
    public final void onError(int i, String str) {
        AdError A = jaa.A(i, str);
        A.toString();
        ((a8e) this.a.e).a.onFailure(A);
    }
}
