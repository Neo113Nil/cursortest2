package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final /* synthetic */ class ok7 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f93 b;
    public final /* synthetic */ xtc c;

    public /* synthetic */ ok7(f93 f93Var, xtc xtcVar, int i, int i2) {
        this.a = i2;
        this.b = f93Var;
        this.c = xtcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        xtc xtcVar = this.c;
        f93 f93Var = this.b;
        of3 of3Var = (of3) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                t62.l(f93Var, xtcVar, of3Var, aba.K(1));
                break;
            default:
                j72.k(f93Var, xtcVar, of3Var, aba.K(1));
                break;
        }
        return Unit.a;
    }
}
