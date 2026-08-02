package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jud extends cvd {
    public static final jud c = new jud(0, 3, 1);

    @Override // defpackage.cvd
    public final void a(zz0 zz0Var, qf0 qf0Var, mlh mlhVar, qn2 qn2Var, dvd dvdVar) {
        k1d k1dVar;
        jlh jlhVar = (jlh) zz0Var.h(1);
        vu8 vu8Var = (vu8) zz0Var.h(0);
        t68 t68Var = (t68) zz0Var.h(2);
        mlh n = jlhVar.n();
        if (dvdVar != null) {
            try {
                k1dVar = new k1d(8, dvdVar, mlhVar);
            } catch (Throwable th) {
                n.e(false);
                throw th;
            }
        } else {
            k1dVar = null;
        }
        if (!t68Var.d.k0()) {
            sf3.a("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        t68Var.c.j0(qf0Var, n, qn2Var, k1dVar);
        Unit unit = Unit.a;
        n.e(true);
        mlhVar.d();
        vu8Var.getClass();
        mlhVar.z(jlhVar, jlhVar.a(vu8Var));
        mlhVar.j();
    }
}
