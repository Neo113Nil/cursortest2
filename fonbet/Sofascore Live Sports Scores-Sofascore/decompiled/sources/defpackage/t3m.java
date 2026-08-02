package defpackage;

import java.util.Date;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class t3m extends hoi implements Function2 {
    public /* synthetic */ Object r;
    public final /* synthetic */ lom s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3m(lom lomVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = lomVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        t3m t3mVar = new t3m(this.s, rq3Var);
        t3mVar.r = obj;
        return t3mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        t3m t3mVar = new t3m(this.s, (rq3) obj2);
        t3mVar.r = (HashMap) obj;
        return t3mVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        HashMap hashMap = (HashMap) this.r;
        lom lomVar = this.s;
        Date date = (Date) hashMap.get(lomVar.w());
        if (date != null && date.before(new Date())) {
            lomVar.n();
        }
        return Unit.a;
    }
}
