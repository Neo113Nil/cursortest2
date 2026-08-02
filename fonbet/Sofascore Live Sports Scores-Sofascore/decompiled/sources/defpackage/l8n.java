package defpackage;

import com.google.android.gms.internal.ads.zzxl;
import com.google.android.gms.internal.ads.zzzf;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class l8n implements Runnable {
    public final /* synthetic */ int a;
    public final kep b;

    public /* synthetic */ l8n(kep kepVar, int i) {
        this.a = i;
        this.b = kepVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        kep kepVar = this.b;
        switch (i) {
            case 0:
                for (zzzf zzzfVar : kepVar.s) {
                    zzzfVar.k(true);
                    if (zzzfVar.g != null) {
                        zzzfVar.g = null;
                        zzzfVar.f = null;
                    }
                }
                kepVar.k.zzb();
                break;
            case 1:
                if (!kepVar.N) {
                    zzxl zzxlVar = kepVar.p;
                    zzxlVar.getClass();
                    zzxlVar.c(kepVar);
                    break;
                }
                break;
            case 2:
                kepVar.H = true;
                break;
            default:
                kepVar.o();
                break;
        }
    }
}
