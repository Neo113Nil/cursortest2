package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.inmobi.ads.InMobiInterstitial;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class vy9 extends hy9 {
    @Override // defpackage.hy9
    public final void b(by9 by9Var, MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        ((InMobiInterstitial) by9Var.a).setExtras(f5p.t(mediationRewardedAdConfiguration.getContext(), "c_admob", mediationRewardedAdConfiguration.getMediationExtras()).a);
        InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) by9Var.a;
        inMobiInterstitial.setKeywords("");
        inMobiInterstitial.load();
    }

    public final void c(MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        Context context = mediationRewardedAdConfiguration.getContext();
        Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        String string = serverParameters.getString("accountid");
        AdError f = ux9.f(ux9.d(serverParameters), string);
        if (f != null) {
            this.b.onFailure(f);
        } else {
            this.c.a(context, string, new ry9(this, context, mediationRewardedAdConfiguration, 1));
        }
    }
}
