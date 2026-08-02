package defpackage;

import com.sofascore.results.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class sr6 implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gv9 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ sr6(gv9 gv9Var, Function1 function1, int i) {
        this.a = i;
        this.b = gv9Var;
        this.c = function1;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        utc utcVar = utc.a;
        int i2 = 16;
        Function1 function1 = this.c;
        gv9<hwi> gv9Var = this.b;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
                    xtc d = bkh.d(utcVar, 1.0f);
                    u23 a = t23.a(ww9.d, uxf.o, av8Var, 0);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, d);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, a, hf3.g);
                    waa.K(av8Var, m, hf3.f);
                    waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var, hf3.k);
                    waa.K(av8Var, C, hf3.d);
                    rha.b(oea.v(R.string.public_leagues, av8Var), null, 0L, av8Var, 0, 6);
                    ok3.d(0, av8Var, gv9Var, null, function1);
                    av8Var.s(true);
                } else {
                    av8Var.W();
                }
                break;
            default:
                kb8 kb8Var = (kb8) obj;
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                kb8Var.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((av8) of3Var2).g(kb8Var) ? 4 : 2;
                }
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 19) != 18)) {
                    for (hwi hwiVar : gv9Var) {
                        av8Var2.a0(2126984277, Integer.valueOf(hwiVar.a));
                        boolean g = av8Var2.g(function1) | av8Var2.g(hwiVar);
                        Object O = av8Var2.O();
                        if (g || O == nf3.a) {
                            O = new deh(i2, function1, hwiVar);
                            av8Var2.n0(O);
                        }
                        wba.b(hwiVar, (Function0) O, kb8Var.a(1.0f, utcVar, true), av8Var2, 0);
                        av8Var2.s(false);
                    }
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
