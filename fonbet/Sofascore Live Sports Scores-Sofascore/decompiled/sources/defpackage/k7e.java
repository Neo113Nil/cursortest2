package defpackage;

import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class k7e implements PAGAppOpenAdLoadListener {
    public final /* synthetic */ l7e a;

    public k7e(l7e l7eVar) {
        this.a = l7eVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public final void onAdLoaded(PAGAppOpenAd pAGAppOpenAd) {
        m7e m7eVar = (m7e) this.a.e;
        m7eVar.d = (MediationAppOpenAdCallback) m7eVar.a.onSuccess(m7eVar);
        m7eVar.e = pAGAppOpenAd;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.qf
    public final void onError(int i, String str) {
        AdError A = jaa.A(i, str);
        A.toString();
        ((m7e) this.a.e).a.onFailure(A);
    }
}
