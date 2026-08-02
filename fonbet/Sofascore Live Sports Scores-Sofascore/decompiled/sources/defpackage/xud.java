package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xud extends cvd {
    public static final xud c = new xud(1, 0, 2);

    @Override // defpackage.cvd
    public final void a(zz0 zz0Var, qf0 qf0Var, mlh mlhVar, qn2 qn2Var, dvd dvdVar) {
        int g = zz0Var.g(0);
        int i = mlhVar.v;
        int O = mlhVar.O(mlhVar.q(i), mlhVar.b);
        int f = mlhVar.f(mlhVar.q(i + 1), mlhVar.b);
        for (int max = Math.max(O, f - g); max < f; max++) {
            Object obj = mlhVar.c[mlhVar.g(max)];
            if (obj instanceof ev8) {
                qn2Var.i((ev8) obj);
            } else if (obj instanceof eqf) {
                ((eqf) obj).c();
            }
        }
        if (g <= 0) {
            sf3.a("Check failed");
        }
        int i2 = mlhVar.v;
        int O2 = mlhVar.O(mlhVar.q(i2), mlhVar.b);
        int f2 = mlhVar.f(mlhVar.q(i2 + 1), mlhVar.b) - g;
        if (f2 < O2) {
            sf3.a("Check failed");
        }
        mlhVar.K(f2, g, i2);
        int i3 = mlhVar.i;
        if (i3 >= O2) {
            mlhVar.i = i3 - g;
        }
    }
}
