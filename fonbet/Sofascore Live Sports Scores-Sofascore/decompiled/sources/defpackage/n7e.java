package defpackage;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class n7e implements PAGBannerAdLoadListener {
    public final /* synthetic */ o7e a;

    public n7e(o7e o7eVar) {
        this.a = o7eVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public final void onAdLoaded(PAGBannerAd pAGBannerAd) {
        PAGBannerAd pAGBannerAd2 = pAGBannerAd;
        p7e p7eVar = this.a.e;
        pAGBannerAd2.setAdInteractionListener(p7eVar);
        p7eVar.e.addView(pAGBannerAd2.getBannerView());
        p7eVar.d = (MediationBannerAdCallback) p7eVar.a.onSuccess(p7eVar);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.qf
    public final void onError(int i, String str) {
        AdError A = jaa.A(i, str);
        A.toString();
        this.a.e.a.onFailure(A);
    }
}
