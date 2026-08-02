package defpackage;

import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class t7e implements PAGInterstitialAdLoadListener {
    public final /* synthetic */ l7e a;

    public t7e(l7e l7eVar) {
        this.a = l7eVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public final void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
        u7e u7eVar = (u7e) this.a.e;
        u7eVar.d = (MediationInterstitialAdCallback) u7eVar.a.onSuccess(u7eVar);
        u7eVar.e = pAGInterstitialAd;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.qf
    public final void onError(int i, String str) {
        AdError A = jaa.A(i, str);
        A.toString();
        ((u7e) this.a.e).a.onFailure(A);
    }
}
