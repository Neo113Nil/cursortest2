package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class tr6 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gv9 b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ xtc d;

    public /* synthetic */ tr6(xtc xtcVar, gv9 gv9Var, Function1 function1, int i) {
        this.a = 6;
        this.d = xtcVar;
        this.b = gv9Var;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Function1 function1 = this.c;
        gv9 gv9Var = this.b;
        xtc xtcVar = this.d;
        of3 of3Var = (of3) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ok3.c(aba.K(1), of3Var, gv9Var, xtcVar, function1);
                break;
            case 1:
                ok3.d(aba.K(1), of3Var, gv9Var, xtcVar, function1);
                break;
            case 2:
                aik.o(aba.K(1), of3Var, gv9Var, xtcVar, function1);
                break;
            case 3:
                wba.c(aba.K(385), of3Var, gv9Var, xtcVar, function1);
                break;
            case 4:
                b0a.u(aba.K(385), of3Var, gv9Var, xtcVar, function1);
                break;
            case 5:
                w3a.j(aba.K(1), of3Var, gv9Var, xtcVar, function1);
                break;
            default:
                waa.n(aba.K(1), of3Var, gv9Var, xtcVar, function1);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ tr6(gv9 gv9Var, Function1 function1, xtc xtcVar, int i, int i2) {
        this.a = i2;
        this.b = gv9Var;
        this.c = function1;
        this.d = xtcVar;
    }
}
