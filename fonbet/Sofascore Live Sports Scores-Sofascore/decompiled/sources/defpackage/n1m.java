package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class n1m extends hoi implements Function2 {
    public /* synthetic */ long r;

    public n1m(rq3 rq3Var) {
        super(2, rq3Var);
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        n1m n1mVar = new n1m(rq3Var);
        n1mVar.r = ((Number) obj).longValue();
        return n1mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long longValue = ((Number) obj).longValue();
        n1m n1mVar = new n1m((rq3) obj2);
        n1mVar.r = longValue;
        return n1mVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        long j = this.r;
        hs4 hs4Var = z45.a;
        hq4 hq4Var = hq4.c;
        int i = z4m.a;
        return xw3.L(s9a.c(hq4Var.plus(new gu3(z4m.class.getSimpleName())).plus(new oxl(bu3.a))), null, null, new ttl(j, null), 3);
    }
}
