package defpackage;

import com.google.android.gms.internal.ads.zzfvq;
import com.google.android.gms.internal.ads.zzfwg;
import com.google.android.gms.internal.ads.zzfwk;
import com.google.android.gms.internal.ads.zzfwr;
import com.google.android.gms.internal.ads.zzfws;
import com.google.android.gms.internal.ads.zzfxa;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class mrn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ mrn(Runnable runnable, float f, int i) {
        this.a = i;
        this.b = f;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        float f = this.b;
        Runnable runnable = this.c;
        switch (i) {
            case 0:
                avn avnVar = ((rrn) ((f2n) runnable).b).g;
                avnVar.a = f;
                tsn tsnVar = avnVar.c;
                if (tsnVar == null) {
                    tsnVar = tsn.c;
                    avnVar.c = tsnVar;
                }
                Iterator it = Collections.unmodifiableCollection(tsnVar.b).iterator();
                while (it.hasNext()) {
                    d7n d7nVar = ((i2o) it.next()).d;
                    d7nVar.getClass();
                    nun.a.a(d7nVar.a(), "setDeviceVolume", Float.valueOf(f), (String) d7nVar.c);
                }
                break;
            default:
                zzfws zzfwsVar = ((zzfwg) ((x3o) runnable).b).g;
                zzfwsVar.a = f;
                zzfwk zzfwkVar = zzfwsVar.c;
                if (zzfwkVar == null) {
                    zzfwkVar = zzfwk.c;
                    zzfwsVar.c = zzfwkVar;
                }
                Iterator it2 = Collections.unmodifiableCollection(zzfwkVar.b).iterator();
                while (it2.hasNext()) {
                    zzfxa zzfxaVar = ((zzfvq) it2.next()).d;
                    zzfxaVar.getClass();
                    zzfwr.a.a(zzfxaVar.c(), "setDeviceVolume", Float.valueOf(f), zzfxaVar.a);
                }
                break;
        }
    }
}
