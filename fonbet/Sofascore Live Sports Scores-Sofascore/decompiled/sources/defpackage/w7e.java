package defpackage;

import android.net.Uri;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class w7e implements PAGNativeAdLoadListener {
    public final /* synthetic */ l7e a;

    public w7e(l7e l7eVar) {
        this.a = l7eVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public final void onAdLoaded(PAGNativeAd pAGNativeAd) {
        PAGNativeAd pAGNativeAd2 = pAGNativeAd;
        y7e y7eVar = (y7e) this.a.e;
        y7eVar.x = pAGNativeAd2;
        PAGNativeAdData nativeAdData = pAGNativeAd2.getNativeAdData();
        y7eVar.setHeadline(nativeAdData.getTitle());
        y7eVar.setBody(nativeAdData.getDescription());
        y7eVar.setCallToAction(nativeAdData.getButtonText());
        if (nativeAdData.getIcon() != null) {
            y7eVar.setIcon(new x7e(Uri.parse(nativeAdData.getIcon().getImageUrl())));
        }
        y7eVar.setOverrideClickHandling(true);
        y7eVar.setMediaView(nativeAdData.getMediaView());
        y7eVar.setAdChoicesContent(nativeAdData.getAdLogoView());
        y7eVar.w = (MediationNativeAdCallback) y7eVar.s.onSuccess(y7eVar);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.qf
    public final void onError(int i, String str) {
        AdError A = jaa.A(i, str);
        A.toString();
        ((y7e) this.a.e).s.onFailure(A);
    }
}
