package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class u88 implements Function2 {
    public final /* synthetic */ long a;
    public final /* synthetic */ dfj b;
    public final /* synthetic */ float c;
    public final /* synthetic */ tc3 d;

    public u88(long j, dfj dfjVar, float f, tc3 tc3Var) {
        this.a = j;
        this.b = dfjVar;
        this.c = f;
        this.d = tc3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        of3 of3Var = (of3) obj;
        int intValue = ((Number) obj2).intValue();
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
            w1a.f(this.a, this.b, yqo.H(-1767363041, av8Var, new t88(this.c, this.d)), av8Var, 384);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }
}
