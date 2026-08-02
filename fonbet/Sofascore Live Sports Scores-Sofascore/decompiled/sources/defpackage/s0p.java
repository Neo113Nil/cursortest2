package defpackage;

import com.google.android.gms.internal.measurement.zzaef;
import com.google.android.gms.internal.measurement.zzpe;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.gms.internal.measurement.zzqc;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class s0p implements zzqc {
    public static final /* synthetic */ s0p a = new s0p();

    @Override // com.google.android.gms.internal.measurement.zzqc
    public final boolean a(zzaef zzaefVar) {
        zzpe zzpeVar = zzpg.h;
        zzpeVar.getClass();
        if (zzaefVar == null || zzaefVar.isEmpty()) {
            return false;
        }
        Iterator<E> it = zzaefVar.iterator();
        boolean z = false;
        while (it.hasNext()) {
            k0p k0pVar = (k0p) zzpeVar.a.get((String) it.next());
            if (k0pVar != null) {
                zzpg zzpgVar = k0pVar.a;
                boolean z2 = true;
                if (zzpgVar.d) {
                    n72 n72Var = zzpgVar.a;
                    if (n72Var != null && (n72Var.a || ((uif) n72Var.e).b == 3 || zzpgVar.g.b())) {
                        synchronized (zzpgVar) {
                            try {
                                n72 n72Var2 = zzpgVar.a;
                                if (n72Var2 != null) {
                                    if (!n72Var2.a) {
                                        if (((uif) n72Var2.e).b != 3) {
                                            z2 = false;
                                        }
                                        if (!z2) {
                                            if (zzpgVar.g.b()) {
                                            }
                                        }
                                    }
                                    zzpgVar.a = null;
                                    zzpgVar.f.a.incrementAndGet();
                                }
                            } finally {
                            }
                        }
                    }
                    z2 = false;
                }
                z |= z2;
            }
        }
        return z;
    }
}
