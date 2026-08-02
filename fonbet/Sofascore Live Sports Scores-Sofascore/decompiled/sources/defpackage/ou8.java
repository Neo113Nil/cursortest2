package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final /* synthetic */ class ou8 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qu8 b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ xtc d;
    public final /* synthetic */ int e;

    public /* synthetic */ ou8(qu8 qu8Var, Function1 function1, xtc xtcVar, int i, int i2) {
        this.a = i2;
        this.b = qu8Var;
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
        qu8 qu8Var = this.b;
        of3 of3Var = (of3) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                pd0.g(qu8Var, function1, xtcVar, of3Var, aba.K(i2 | 1));
                break;
            default:
                rd0.m(qu8Var, function1, xtcVar, of3Var, aba.K(i2 | 1));
                break;
        }
        return Unit.a;
    }
}
