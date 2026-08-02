package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ztd extends cvd {
    public static final ztd c = new ztd(0, 2, 1);

    @Override // defpackage.cvd
    public final void a(zz0 zz0Var, qf0 qf0Var, mlh mlhVar, qn2 qn2Var, dvd dvdVar) {
        int i;
        z6a z6aVar = (z6a) zz0Var.h(0);
        int c2 = mlhVar.c((vu8) zz0Var.h(1));
        if (mlhVar.t >= c2) {
            sf3.a("Check failed");
        }
        tba.I(mlhVar, qf0Var, c2);
        int i2 = mlhVar.t;
        int i3 = mlhVar.v;
        while (i3 >= 0 && !mlhVar.x(i3)) {
            i3 = mlhVar.F(i3, mlhVar.b);
        }
        int i4 = i3 + 1;
        int i5 = 0;
        while (i4 < i2) {
            if (mlhVar.u(i2, i4)) {
                if (mlhVar.x(i4)) {
                    i5 = 0;
                }
                i4++;
            } else {
                i5 += mlhVar.x(i4) ? 1 : mlhVar.E(i4);
                i4 += mlhVar.t(i4);
            }
        }
        while (true) {
            i = mlhVar.t;
            if (i >= c2) {
                break;
            }
            if (mlhVar.u(c2, i)) {
                int i6 = mlhVar.t;
                if (i6 < mlhVar.u && (mlhVar.b[(mlhVar.q(i6) * 5) + 1] & 1073741824) != 0) {
                    qf0Var.x(mlhVar.D(mlhVar.t));
                    i5 = 0;
                }
                mlhVar.Q();
            } else {
                i5 += mlhVar.M();
            }
        }
        if (i != c2) {
            sf3.a("Check failed");
        }
        z6aVar.a = i5;
    }
}
