package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hud extends cvd {
    public static final hud d;
    public static final hud e;
    public static final hud f;
    public static final hud g;
    public final /* synthetic */ int c;

    static {
        int i = 1;
        d = new hud(i, 2, 0);
        int i2 = 1;
        e = new hud(i2, i2, 1);
        f = new hud(i, 2, 2);
        int i3 = 1;
        g = new hud(i3, i3, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hud(int i, int i2, int i3) {
        super(i, i2);
        this.c = i3;
    }

    @Override // defpackage.cvd
    public final void a(zz0 zz0Var, qf0 qf0Var, mlh mlhVar, qn2 qn2Var, dvd dvdVar) {
        switch (this.c) {
            case 0:
                Object invoke = ((Function0) zz0Var.h(0)).invoke();
                vu8 vu8Var = (vu8) zz0Var.h(1);
                int g2 = zz0Var.g(0);
                vu8Var.getClass();
                mlhVar.W(mlhVar.c(vu8Var), invoke);
                qf0Var.s(g2, invoke);
                qf0Var.x(invoke);
                break;
            case 1:
                vu8 vu8Var2 = (vu8) zz0Var.h(0);
                int g3 = zz0Var.g(0);
                qf0Var.A();
                vu8Var2.getClass();
                qf0Var.w(g3, mlhVar.D(mlhVar.c(vu8Var2)));
                break;
            case 2:
                Object h = zz0Var.h(0);
                vu8 vu8Var3 = (vu8) zz0Var.h(1);
                int g4 = zz0Var.g(0);
                if (h instanceof ev8) {
                    ev8 ev8Var = (ev8) h;
                    ((i1d) qn2Var.e).b(ev8Var);
                    ((y0d) qn2Var.d).a(ev8Var);
                }
                Object L = mlhVar.L(mlhVar.c(vu8Var3), g4, h);
                if (!(L instanceof ev8)) {
                    if (L instanceof eqf) {
                        ((eqf) L).c();
                        break;
                    }
                } else {
                    qn2Var.i((ev8) L);
                    break;
                }
                break;
            default:
                Object h2 = zz0Var.h(0);
                int g5 = zz0Var.g(0);
                if (h2 instanceof ev8) {
                    ev8 ev8Var2 = (ev8) h2;
                    ((i1d) qn2Var.e).b(ev8Var2);
                    ((y0d) qn2Var.d).a(ev8Var2);
                }
                Object L2 = mlhVar.L(mlhVar.t, g5, h2);
                if (!(L2 instanceof ev8)) {
                    if (L2 instanceof eqf) {
                        ((eqf) L2).c();
                        break;
                    }
                } else {
                    qn2Var.i((ev8) L2);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.cvd
    public vu8 b(zz0 zz0Var) {
        switch (this.c) {
            case 0:
                return (vu8) zz0Var.h(1);
            case 1:
                return (vu8) zz0Var.h(0);
            default:
                return super.b(zz0Var);
        }
    }
}
