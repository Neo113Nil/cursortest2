package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qf5 extends hoi implements Function2 {
    public /* synthetic */ long r;

    public qf5(rq3 rq3Var) {
        super(2, rq3Var);
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        qf5 qf5Var = new qf5(rq3Var);
        qf5Var.r = ((Number) obj).longValue();
        return qf5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long longValue = ((Number) obj).longValue();
        qf5 qf5Var = new qf5((rq3) obj2);
        qf5Var.r = longValue;
        return qf5Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        long j = this.r;
        hs4 hs4Var = z45.a;
        hq4 hq4Var = hq4.c;
        ljd ljdVar = ljd.a;
        return xw3.L(s9a.c(hq4Var.plus(new gu3(ljd.class.getSimpleName())).plus(new bb4(bu3.a))), null, null, new oc2(j, null), 3);
    }
}
