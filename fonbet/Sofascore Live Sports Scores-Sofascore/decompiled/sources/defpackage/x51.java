package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class x51 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xtc b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function0 d;

    public /* synthetic */ x51(xtc xtcVar, Function0 function0, Function0 function02, int i) {
        this.a = 1;
        this.b = xtcVar;
        this.c = function0;
        this.d = function02;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        of3 of3Var = (of3) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                fkf.r(aba.K(1), of3Var, this.b, this.c, this.d);
                break;
            case 1:
                ww9.j(aba.K(1), of3Var, this.b, this.c, this.d);
                break;
            case 2:
                d7a.k(aba.K(1), of3Var, this.b, this.c, this.d);
                break;
            default:
                tz9.p(aba.K(1), of3Var, this.b, this.c, this.d);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ x51(Function0 function0, Function0 function02, xtc xtcVar, int i, int i2) {
        this.a = i2;
        this.c = function0;
        this.d = function02;
        this.b = xtcVar;
    }
}
