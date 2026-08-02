package defpackage;

import com.sofascore.results.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ip7 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ qp7 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ ip7(qp7 qp7Var, Function1 function1) {
        this.b = qp7Var;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Function1 function1 = this.c;
        qp7 qp7Var = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                yso.k(qp7Var, function1, (of3) obj, aba.K(1));
                break;
            default:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    xtc q = n9e.q(d2a.E(bkh.d(utc.a, 1.0f), 8.0f, null, false, 0L, 30), lz.D(R.color.surface_P, av8Var), oyn.e);
                    k1c c = e12.c(uxf.c, false);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, q);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, c, hf3.g);
                    waa.K(av8Var, m, hf3.f);
                    waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var, hf3.k);
                    waa.K(av8Var, C, hf3.d);
                    String v = oea.v(qp7Var.g ? R.string.cancel : R.string.fantasy_auto_select, av8Var);
                    String v2 = oea.v(R.string.confirm, av8Var);
                    boolean z = qp7Var.f;
                    boolean g = av8Var.g(function1) | av8Var.i(qp7Var);
                    Object O = av8Var.O();
                    a99 a99Var = nf3.a;
                    if (g || O == a99Var) {
                        O = new n37(23, (Object) qp7Var, function1);
                        av8Var.n0(O);
                    }
                    Function0 function0 = (Function0) O;
                    boolean g2 = av8Var.g(function1);
                    Object O2 = av8Var.O();
                    if (g2 || O2 == a99Var) {
                        O2 = new l77(15, function1);
                        av8Var.n0(O2);
                    }
                    o1j.b(v, v2, function0, (Function0) O2, null, false, z, false, av8Var, 0, 176);
                    av8Var.s(true);
                } else {
                    av8Var.W();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ip7(qp7 qp7Var, Function1 function1, int i) {
        this.b = qp7Var;
        this.c = function1;
    }
}
