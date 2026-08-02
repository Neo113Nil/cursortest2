package defpackage;

import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.moloco.sdk.publisher.NativeAd;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ruc implements NativeAd.InteractionListener {
    public final /* synthetic */ MediationNativeAdCallback a;

    public ruc(MediationNativeAdCallback mediationNativeAdCallback) {
        this.a = mediationNativeAdCallback;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.InteractionListener
    public final void onGeneralClickHandled() {
        this.a.reportAdClicked();
    }

    @Override // com.moloco.sdk.publisher.NativeAd.InteractionListener
    public final void onImpressionHandled() {
    }
}
