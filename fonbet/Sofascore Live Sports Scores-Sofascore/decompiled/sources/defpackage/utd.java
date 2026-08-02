package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class utd extends cvd {
    public static final utd c = new utd(0, 2, 1);

    @Override // defpackage.cvd
    public final void a(zz0 zz0Var, qf0 qf0Var, mlh mlhVar, qn2 qn2Var, dvd dvdVar) {
        vu8 vu8Var = (vu8) zz0Var.h(0);
        Object h = zz0Var.h(1);
        if (h instanceof ev8) {
            ev8 ev8Var = (ev8) h;
            ((i1d) qn2Var.e).b(ev8Var);
            ((y0d) qn2Var.d).a(ev8Var);
        }
        if (mlhVar.n != 0) {
            sf3.a("Can only append a slot if not current inserting");
        }
        int i = mlhVar.i;
        int i2 = mlhVar.j;
        int c2 = mlhVar.c(vu8Var);
        int f = mlhVar.f(mlhVar.q(c2 + 1), mlhVar.b);
        mlhVar.i = f;
        mlhVar.j = f;
        mlhVar.w(1, c2);
        if (i >= f) {
            i++;
            i2++;
        }
        mlhVar.c[f] = h;
        mlhVar.i = i;
        mlhVar.j = i2;
    }
}
