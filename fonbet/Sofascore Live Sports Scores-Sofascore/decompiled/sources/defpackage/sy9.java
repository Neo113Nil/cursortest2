package defpackage;

import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.inmobi.ads.InMobiInterstitial;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class sy9 extends ay9 {
    @Override // defpackage.ay9
    public final void b(by9 by9Var, MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        ((InMobiInterstitial) by9Var.a).setExtras(f5p.t(mediationInterstitialAdConfiguration.getContext(), "c_admob", mediationInterstitialAdConfiguration.getMediationExtras()).a);
        InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) by9Var.a;
        inMobiInterstitial.setKeywords("");
        inMobiInterstitial.load();
    }
}
