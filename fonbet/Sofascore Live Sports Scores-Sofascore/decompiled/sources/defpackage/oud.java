package defpackage;

import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class oud extends cvd {
    public static final oud c;

    static {
        int i = 1;
        c = new oud(0, i, i);
    }

    @Override // defpackage.cvd
    public final void a(zz0 zz0Var, qf0 qf0Var, mlh mlhVar, qn2 qn2Var, dvd dvdVar) {
        eqf eqfVar = (eqf) zz0Var.h(0);
        Set set = (Set) qn2Var.a;
        if (set == null) {
            return;
        }
        gce gceVar = new gce(set);
        x0d x0dVar = (x0d) qn2Var.i;
        if (x0dVar == null) {
            long[] jArr = qrg.a;
            x0dVar = new x0d();
            qn2Var.i = x0dVar;
        }
        x0dVar.m(eqfVar, gceVar);
        ((i1d) qn2Var.e).b(new ev8(gceVar, -1));
    }
}
