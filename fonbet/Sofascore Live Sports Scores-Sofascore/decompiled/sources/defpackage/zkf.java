package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class zkf implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ukf b;
    public final /* synthetic */ xtc c;
    public final /* synthetic */ int d;

    public /* synthetic */ zkf(ukf ukfVar, xtc xtcVar, int i, int i2) {
        this.a = i2;
        this.b = ukfVar;
        this.c = xtcVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.d;
        xtc xtcVar = this.c;
        ukf ukfVar = this.b;
        of3 of3Var = (of3) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                s6a.j(ukfVar, xtcVar, of3Var, aba.K(i2 | 1));
                break;
            default:
                s6a.i(ukfVar, xtcVar, of3Var, aba.K(i2 | 1));
                break;
        }
        return Unit.a;
    }
}
