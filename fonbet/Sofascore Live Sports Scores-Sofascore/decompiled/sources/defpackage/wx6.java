package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class wx6 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ do7 b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ xtc d;

    public /* synthetic */ wx6(do7 do7Var, Function1 function1, xtc xtcVar, int i, int i2) {
        this.a = i2;
        this.b = do7Var;
        this.c = function1;
        this.d = xtcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        xtc xtcVar = this.d;
        Function1 function1 = this.c;
        do7 do7Var = this.b;
        of3 of3Var = (of3) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                k53.K(do7Var, function1, xtcVar, of3Var, aba.K(1));
                break;
            default:
                oyn.k(do7Var, function1, xtcVar, of3Var, aba.K(1));
                break;
        }
        return Unit.a;
    }
}
