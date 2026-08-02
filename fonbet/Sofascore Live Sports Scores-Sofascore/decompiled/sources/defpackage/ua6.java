package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class ua6 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wa6 b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ xtc d;
    public final /* synthetic */ int e;

    public /* synthetic */ ua6(wa6 wa6Var, Function1 function1, xtc xtcVar, int i, int i2) {
        this.a = i2;
        this.b = wa6Var;
        this.c = function1;
        this.d = xtcVar;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.e;
        xtc xtcVar = this.d;
        Function1 function1 = this.c;
        wa6 wa6Var = this.b;
        of3 of3Var = (of3) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                fcp.N(wa6Var, function1, xtcVar, of3Var, aba.K(i2 | 1));
                break;
            default:
                k53.I(wa6Var, function1, xtcVar, of3Var, aba.K(i2 | 1));
                break;
        }
        return Unit.a;
    }
}
