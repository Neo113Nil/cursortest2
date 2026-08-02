package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class y55 implements z88 {
    public final z88 a;
    public final Function1 b;
    public final Function2 c;

    public y55(z88 z88Var, Function1 function1, Function2 function2) {
        this.a = z88Var;
        this.b = function1;
        this.c = function2;
    }

    @Override // defpackage.z88
    public final Object collect(b98 b98Var, rq3 rq3Var) {
        fsf fsfVar = new fsf();
        fsfVar.a = rid.a;
        Object collect = this.a.collect(new m70(2, this, fsfVar, b98Var), rq3Var);
        return collect == lu3.a ? collect : Unit.a;
    }
}
