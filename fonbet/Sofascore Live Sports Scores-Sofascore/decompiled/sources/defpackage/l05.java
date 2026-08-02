package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class l05 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ xtc c;

    public /* synthetic */ l05(Function1 function1, xtc xtcVar, int i, int i2) {
        this.a = i2;
        this.b = function1;
        this.c = xtcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        of3 of3Var = (of3) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                m05.b(aba.K(1), of3Var, this.c, this.b);
                break;
            case 1:
                ok3.e(aba.K(49), of3Var, this.c, this.b);
                break;
            case 2:
                aza.c(aba.K(1), of3Var, this.c, this.b);
                break;
            default:
                t6a.j(aba.K(1), of3Var, this.c, this.b);
                break;
        }
        return Unit.a;
    }
}
