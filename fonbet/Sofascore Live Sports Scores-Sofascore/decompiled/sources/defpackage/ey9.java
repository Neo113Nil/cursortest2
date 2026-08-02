package defpackage;

import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.inmobi.ads.InMobiNative;
import com.inmobi.ads.listeners.VideoEventListener;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ey9 extends VideoEventListener {
    public final /* synthetic */ fy9 a;

    public ey9(fy9 fy9Var) {
        this.a = fy9Var;
    }

    @Override // com.inmobi.ads.listeners.VideoEventListener
    public final void onVideoCompleted(InMobiNative inMobiNative) {
        super.onVideoCompleted(inMobiNative);
        MediationNativeAdCallback mediationNativeAdCallback = this.a.d;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onVideoComplete();
        }
    }

    @Override // com.inmobi.ads.listeners.VideoEventListener
    public final void onVideoSkipped(InMobiNative inMobiNative) {
        super.onVideoSkipped(inMobiNative);
    }
}
