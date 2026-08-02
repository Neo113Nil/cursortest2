package defpackage;

import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.inmobi.ads.InMobiBanner;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class qy9 extends vx9 {
    @Override // defpackage.vx9
    public final void b(wx9 wx9Var, MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        HashMap hashMap = f5p.t(mediationBannerAdConfiguration.getContext(), "c_admob", mediationBannerAdConfiguration.getMediationExtras()).a;
        InMobiBanner inMobiBanner = wx9Var.a;
        inMobiBanner.setExtras(hashMap);
        inMobiBanner.setKeywords("");
        inMobiBanner.load();
    }
}
