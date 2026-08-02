package defpackage;

import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.inmobi.ads.InMobiNative;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class uy9 extends fy9 {
    @Override // defpackage.fy9
    public final void b(t9d t9dVar) {
        MediationNativeAdConfiguration mediationNativeAdConfiguration = this.a;
        ((InMobiNative) t9dVar.a).setExtras(f5p.t(mediationNativeAdConfiguration.getContext(), "c_admob", mediationNativeAdConfiguration.getMediationExtras()).a);
        InMobiNative inMobiNative = (InMobiNative) t9dVar.a;
        inMobiNative.setKeywords("");
        inMobiNative.load();
    }
}
