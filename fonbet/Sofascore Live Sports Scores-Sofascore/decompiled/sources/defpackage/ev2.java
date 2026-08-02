package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ev2 extends hoi implements Function2 {
    public /* synthetic */ Object r;
    public final /* synthetic */ q50 s;
    public final /* synthetic */ long t;
    public final /* synthetic */ long u;
    public final /* synthetic */ q50 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ev2(q50 q50Var, long j, long j2, q50 q50Var2, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = q50Var;
        this.t = j;
        this.u = j2;
        this.v = q50Var2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        ev2 ev2Var = new ev2(this.s, this.t, this.u, this.v, rq3Var);
        ev2Var.r = obj;
        return ev2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ev2) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        ku3 ku3Var = (ku3) this.r;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        xw3.L(ku3Var, null, null, new dv2(this.s, this.t, null, 0), 3);
        xw3.L(ku3Var, null, null, new dv2(this.u, this.v, null), 3);
        return Unit.a;
    }
}
