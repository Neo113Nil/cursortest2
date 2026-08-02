package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class zk1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xtc b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ int d;

    public /* synthetic */ zk1(int i, Function0 function0, xtc xtcVar, int i2) {
        this.a = 2;
        this.d = i;
        this.c = function0;
        this.b = xtcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        of3 of3Var = (of3) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                o02.r(aba.K(this.d | 1), of3Var, this.b, this.c);
                break;
            case 1:
                yqo.b(aba.K(this.d | 1), of3Var, this.b, this.c);
                break;
            case 2:
                fcp.J(this.d, this.c, this.b, of3Var, aba.K(1));
                break;
            case 3:
                l6g.g(aba.K(this.d | 1), of3Var, this.b, this.c);
                break;
            default:
                s7m.c(aba.K(this.d | 1), of3Var, this.b, this.c);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ zk1(xtc xtcVar, Function0 function0, int i) {
        this.a = 1;
        this.b = xtcVar;
        this.c = function0;
        this.d = i;
    }

    public /* synthetic */ zk1(Function0 function0, xtc xtcVar, int i, int i2) {
        this.a = i2;
        this.c = function0;
        this.b = xtcVar;
        this.d = i;
    }
}
