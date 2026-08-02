package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class j73 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gv9 b;
    public final /* synthetic */ xtc c;
    public final /* synthetic */ int d;

    public /* synthetic */ j73(gv9 gv9Var, xtc xtcVar, int i, int i2) {
        this.a = i2;
        this.b = gv9Var;
        this.c = xtcVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.d;
        xtc xtcVar = this.c;
        gv9 gv9Var = this.b;
        of3 of3Var = (of3) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                xw3.j(gv9Var, xtcVar, of3Var, aba.K(i2 | 1));
                break;
            case 1:
                xw3.o(gv9Var, xtcVar, of3Var, aba.K(i2 | 1));
                break;
            case 2:
                xw3.b(gv9Var, xtcVar, of3Var, aba.K(i2 | 1));
                break;
            case 3:
                s9a.d(gv9Var, xtcVar, of3Var, aba.K(i2 | 1));
                break;
            case 4:
                fqj.j(gv9Var, xtcVar, of3Var, aba.K(i2 | 1));
                break;
            default:
                cga.i(gv9Var, xtcVar, of3Var, aba.K(i2 | 1));
                break;
        }
        return Unit.a;
    }
}
