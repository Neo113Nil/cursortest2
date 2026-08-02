package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class eud extends cvd {
    public static final eud c;

    static {
        int i = 1;
        c = new eud(0, i, i);
    }

    @Override // defpackage.cvd
    public final void a(zz0 zz0Var, qf0 qf0Var, mlh mlhVar, qn2 qn2Var, dvd dvdVar) {
        i1d i1dVar;
        eqf eqfVar = (eqf) zz0Var.h(0);
        x0d x0dVar = (x0d) qn2Var.i;
        if (x0dVar == null || ((gce) x0dVar.g(eqfVar)) == null) {
            return;
        }
        ArrayList arrayList = (ArrayList) qn2Var.j;
        if (arrayList != null && (i1dVar = (i1d) arrayList.remove(arrayList.size() - 1)) != null) {
            qn2Var.e = i1dVar;
        }
        x0dVar.k(eqfVar);
    }
}
