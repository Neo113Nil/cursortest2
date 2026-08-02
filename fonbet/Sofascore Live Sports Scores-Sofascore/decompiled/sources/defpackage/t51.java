package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class t51 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ t51(int i, xtc xtcVar, String str, Function0 function0, Function0 function02, boolean z, boolean z2) {
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = function0;
        this.f = function02;
        this.g = xtcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.g;
        Object obj4 = this.e;
        Object obj5 = this.b;
        Object obj6 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(1);
                fkf.s(K, (of3) obj, (xtc) obj3, (String) obj5, (Function0) obj4, (Function0) obj6, this.c, this.d);
                break;
            case 1:
                ((Integer) obj2).getClass();
                fu6.a((hu6) obj4, (String) obj5, this.c, this.d, (il8) obj6, (Function1) obj3, (of3) obj, aba.K(1));
                break;
            case 2:
                c9b c9bVar = (c9b) obj5;
                r8b r8bVar = (r8b) obj4;
                bnf bnfVar = (bnf) obj6;
                Function1 function1 = (Function1) obj3;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    utc utcVar = utc.a;
                    xtc d = bkh.d(bkh.e(utcVar, 844.0f), 1.0f);
                    k1c c = e12.c(uxf.c, false);
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
                    waa.K(av8Var, c, hf3.g);
                    waa.K(av8Var, m, hf3.f);
                    waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var, hf3.k);
                    waa.K(av8Var, C, hf3.d);
                    wnn.o(n12.a.b(utcVar), true, 0L, false, false, av8Var, 48, 28);
                    v9g.m(c9bVar, r8bVar, bnfVar, this.c, null, this.d, function1, av8Var, 0);
                    av8Var.s(true);
                } else {
                    av8Var.W();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                fyg.h((Integer) obj6, (String) obj5, this.c, this.d, (Function0) obj4, (xtc) obj3, (of3) obj, aba.K(196609));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ t51(hu6 hu6Var, String str, boolean z, boolean z2, il8 il8Var, Function1 function1, int i) {
        this.e = hu6Var;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.f = il8Var;
        this.g = function1;
    }

    public /* synthetic */ t51(c9b c9bVar, r8b r8bVar, bnf bnfVar, boolean z, boolean z2, Function1 function1) {
        this.b = c9bVar;
        this.e = r8bVar;
        this.f = bnfVar;
        this.c = z;
        this.d = z2;
        this.g = function1;
    }

    public /* synthetic */ t51(Integer num, String str, boolean z, boolean z2, Function0 function0, xtc xtcVar, int i) {
        this.f = num;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = function0;
        this.g = xtcVar;
    }
}
