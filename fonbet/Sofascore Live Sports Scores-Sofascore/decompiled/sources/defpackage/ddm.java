package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ddm extends hoi implements Function2 {
    public /* synthetic */ long r;

    public ddm(rq3 rq3Var) {
        super(2, rq3Var);
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        ddm ddmVar = new ddm(rq3Var);
        ddmVar.r = ((Number) obj).longValue();
        return ddmVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long longValue = ((Number) obj).longValue();
        ddm ddmVar = new ddm((rq3) obj2);
        ddmVar.r = longValue;
        return ddmVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        long j = this.r;
        hs4 hs4Var = z45.a;
        hq4 hq4Var = hq4.c;
        mgm mgmVar = mgm.a;
        return xw3.L(s9a.c(hq4Var.plus(new gu3(mgm.class.getSimpleName())).plus(new qam(bu3.a))), null, null, new a8m(j, null), 3);
    }
}
