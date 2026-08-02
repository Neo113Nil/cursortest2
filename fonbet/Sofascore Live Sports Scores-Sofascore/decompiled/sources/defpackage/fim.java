package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fim extends hoi implements Function2 {
    public /* synthetic */ Object r;
    public final /* synthetic */ u6b s;
    public final /* synthetic */ xa3 t;
    public final /* synthetic */ hoi u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public fim(u6b u6bVar, xa3 xa3Var, ct8 ct8Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = u6bVar;
        this.t = xa3Var;
        this.u = (hoi) ct8Var;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [ct8, hoi] */
    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        fim fimVar = new fim(this.s, this.t, this.u, rq3Var);
        fimVar.r = obj;
        return fimVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((fim) create((rum) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [ct8, hoi] */
    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        rum rumVar = (rum) this.r;
        k6b E = hda.E(this.s);
        hs4 hs4Var = z45.a;
        xw3.L(E, rob.a.plus(this.t), null, new egm(this.u, rumVar, null), 2);
        return Unit.a;
    }
}
