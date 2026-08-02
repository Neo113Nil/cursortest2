package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qk7 extends hoi implements Function2 {
    public /* synthetic */ Object r;
    public final /* synthetic */ q50 s;
    public final /* synthetic */ f93 t;
    public final /* synthetic */ long u;
    public final /* synthetic */ q50 v;
    public final /* synthetic */ long w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk7(q50 q50Var, f93 f93Var, long j, q50 q50Var2, long j2, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = q50Var;
        this.t = f93Var;
        this.u = j;
        this.v = q50Var2;
        this.w = j2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        qk7 qk7Var = new qk7(this.s, this.t, this.u, this.v, this.w, rq3Var);
        qk7Var.r = obj;
        return qk7Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((qk7) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        ku3 ku3Var = (ku3) this.r;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        q50 q50Var = this.s;
        f93 f93Var = this.t;
        xw3.L(ku3Var, null, null, new pk7(q50Var, f93Var, this.u, null, 0), 3);
        xw3.L(ku3Var, null, null, new pk7(this.v, f93Var, this.w, null, 1), 3);
        return Unit.a;
    }
}
