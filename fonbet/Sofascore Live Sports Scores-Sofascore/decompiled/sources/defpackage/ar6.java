package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final /* synthetic */ class ar6 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ do7 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ xtc d;

    public /* synthetic */ ar6(do7 do7Var, Function0 function0, xtc xtcVar, int i, int i2) {
        this.a = i2;
        this.b = do7Var;
        this.c = function0;
        this.d = xtcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        xtc xtcVar = this.d;
        Function0 function0 = this.c;
        do7 do7Var = this.b;
        of3 of3Var = (of3) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                s02.f(do7Var, function0, xtcVar, of3Var, aba.K(1));
                break;
            default:
                s02.q(do7Var, function0, xtcVar, of3Var, aba.K(1));
                break;
        }
        return Unit.a;
    }
}
