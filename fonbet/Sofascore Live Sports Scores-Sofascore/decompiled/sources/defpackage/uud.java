package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class uud extends cvd {
    public static final uud c;

    static {
        int i = 1;
        c = new uud(0, i, i);
    }

    @Override // defpackage.cvd
    public final void a(zz0 zz0Var, qf0 qf0Var, mlh mlhVar, qn2 qn2Var, dvd dvdVar) {
        eqf eqfVar = (eqf) zz0Var.h(0);
        x0d x0dVar = (x0d) qn2Var.i;
        gce gceVar = x0dVar != null ? (gce) x0dVar.g(eqfVar) : null;
        if (gceVar != null) {
            ArrayList arrayList = (ArrayList) qn2Var.j;
            if (arrayList == null) {
                arrayList = new ArrayList();
                qn2Var.j = arrayList;
            }
            arrayList.add((i1d) qn2Var.e);
            qn2Var.e = gceVar.b;
        }
    }
}
