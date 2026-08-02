package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class oqj implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xtc b;

    public /* synthetic */ oqj(xtc xtcVar, int i, int i2) {
        this.a = i2;
        this.b = xtcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        of3 of3Var = (of3) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                d2a.g(aba.K(7), of3Var, this.b);
                break;
            case 1:
                xzj.e(aba.K(1), of3Var, this.b);
                break;
            case 2:
                kjl.a(aba.K(7), of3Var, this.b);
                break;
            case 3:
                nq8.m(aba.K(7), of3Var, this.b);
                break;
            default:
                gz8.o(aba.K(1), of3Var, this.b);
                break;
        }
        return Unit.a;
    }
}
