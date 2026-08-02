package defpackage;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzfvk;
import com.google.android.gms.internal.ads.zzfvq;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class u4o implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzfvq b;

    public /* synthetic */ u4o(zzfvq zzfvqVar, int i) {
        this.a = i;
        this.b = zzfvqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        zzfvq zzfvqVar = this.b;
        switch (i) {
            case 0:
                zzfvqVar.d();
                break;
            default:
                if (((Boolean) zzba.zzc().a(zzbjg.q6)).booleanValue() && zzfvk.a.a) {
                    zzfvqVar.b();
                    break;
                }
                break;
        }
    }
}
