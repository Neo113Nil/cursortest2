package defpackage;

import com.google.android.gms.internal.cast.zzbq;
import com.google.android.gms.internal.cast.zzby;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class con implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzbq b;

    public /* synthetic */ con(zzbq zzbqVar, int i) {
        this.a = i;
        this.b = zzbqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        zzbq zzbqVar = this.b;
        switch (i) {
            case 0:
                zzbqVar.q();
                break;
            default:
                zzby zzbyVar = zzbqVar.e;
                pbc pbcVar = zzbyVar.b;
                if (pbcVar == null) {
                    pbcVar = pbc.d(zzbyVar.a);
                    zzbyVar.b = pbcVar;
                }
                pbcVar.h(zzbqVar);
                break;
        }
    }
}
