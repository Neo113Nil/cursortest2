package defpackage;

import com.fyber.inneractive.sdk.external.VideoContentListener;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class sb4 implements VideoContentListener {
    public final /* synthetic */ vb4 a;

    public sb4(vb4 vb4Var) {
        this.a = vb4Var;
    }

    @Override // com.fyber.inneractive.sdk.external.VideoContentListener
    public final void onCompleted() {
        MediationNativeAdCallback mediationNativeAdCallback = this.a.r;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onVideoComplete();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.VideoContentListener
    public final void onPlayerError() {
    }

    @Override // com.fyber.inneractive.sdk.external.VideoContentListener
    public final void onProgress(int i, int i2) {
    }
}
