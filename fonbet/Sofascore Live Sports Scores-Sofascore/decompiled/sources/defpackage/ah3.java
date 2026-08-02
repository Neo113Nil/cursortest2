package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ah3 extends xka implements Function2 {
    public final /* synthetic */ int i = 0;
    public final /* synthetic */ tc3 j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah3(xtc xtcVar, tc3 tc3Var, k1c k1cVar, int i) {
        super(2);
        this.k = xtcVar;
        this.j = tc3Var;
        this.l = k1cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.i;
        tc3 tc3Var = this.j;
        Object obj3 = this.l;
        Object obj4 = this.k;
        int i2 = 1;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                dh3.a((ryd) obj4, (p40) obj3, tc3Var, (of3) obj, aba.K(1));
                break;
            case 1:
                ((Number) obj2).intValue();
                s6a.h((xtc) obj4, tc3Var, (k1c) obj3, (of3) obj, aba.K(49));
                break;
            default:
                of3 of3Var = (of3) obj;
                int intValue = ((Number) obj2).intValue();
                xll xllVar = (xll) obj4;
                int i3 = 0;
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    xy xyVar = xllVar.a;
                    boolean i4 = av8Var.i(xllVar);
                    Object O = av8Var.O();
                    rq3 rq3Var = null;
                    a99 a99Var = nf3.a;
                    if (i4 || O == a99Var) {
                        O = new wll(xllVar, rq3Var, i3);
                        av8Var.n0(O);
                    }
                    hz8.o(av8Var, xyVar, (Function2) O);
                    boolean i5 = av8Var.i(xllVar);
                    Object O2 = av8Var.O();
                    if (i5 || O2 == a99Var) {
                        O2 = new wll(xllVar, rq3Var, i2);
                        av8Var.n0(O2);
                    }
                    hz8.o(av8Var, xyVar, (Function2) O2);
                    ((lf3) obj3).a(xyVar, tc3Var, av8Var, 0);
                } else {
                    av8Var.W();
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah3(ryd rydVar, p40 p40Var, tc3 tc3Var, int i) {
        super(2);
        this.k = rydVar;
        this.l = p40Var;
        this.j = tc3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah3(xll xllVar, lf3 lf3Var, tc3 tc3Var) {
        super(2);
        this.k = xllVar;
        this.l = lf3Var;
        this.j = tc3Var;
    }
}
