package defpackage;

import android.content.Context;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ty9 implements yx9 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ long b;
    public final /* synthetic */ uy9 c;

    public ty9(uy9 uy9Var, Context context, long j) {
        this.c = uy9Var;
        this.a = context;
        this.b = j;
    }

    @Override // defpackage.yx9
    public final void a(AdError adError) {
        adError.toString();
        MediationAdLoadCallback mediationAdLoadCallback = this.c.b;
        if (mediationAdLoadCallback != null) {
            mediationAdLoadCallback.onFailure(adError);
        }
    }

    @Override // defpackage.yx9
    public final void b() {
        Context context = this.a;
        this.c.a(this.b, context);
    }
}
