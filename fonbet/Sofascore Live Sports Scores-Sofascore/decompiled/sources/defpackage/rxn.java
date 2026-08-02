package defpackage;

import com.google.android.gms.internal.ads.zzefb;
import com.google.android.gms.internal.ads.zzeux;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class rxn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p03 b;

    public /* synthetic */ rxn(p03 p03Var, int i) {
        this.a = i;
        this.b = p03Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        p03 p03Var = this.b;
        switch (i) {
            case 0:
                p03Var.zza(new zzefb(3));
                break;
            default:
                ((zzeux) p03Var.f).d.b.zzg();
                break;
        }
    }
}
