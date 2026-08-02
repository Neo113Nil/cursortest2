package defpackage;

import android.content.Context;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class py9 implements yx9 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ AdSize b;
    public final /* synthetic */ MediationBannerAdConfiguration c;
    public final /* synthetic */ qy9 d;

    public py9(qy9 qy9Var, Context context, AdSize adSize, MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        this.d = qy9Var;
        this.a = context;
        this.b = adSize;
        this.c = mediationBannerAdConfiguration;
    }

    @Override // defpackage.yx9
    public final void a(AdError adError) {
        adError.toString();
        this.d.a.onFailure(adError);
    }

    @Override // defpackage.yx9
    public final void b() {
        this.d.a(this.a, this.b, this.c);
    }
}
