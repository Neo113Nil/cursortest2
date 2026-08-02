package defpackage;

import com.google.gson.Gson;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class imm extends hoi implements Function2 {
    public /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ e5f t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public imm(Object obj, e5f e5fVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = obj;
        this.t = e5fVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        imm immVar = new imm(this.s, this.t, rq3Var);
        immVar.r = obj;
        return immVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((imm) create((p0d) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        p0d p0dVar = (p0d) this.r;
        Object obj2 = this.s;
        e5f e5fVar = this.t;
        if (obj2 == null) {
            p0dVar.d(e5fVar);
        } else {
            p0dVar.e(e5fVar, ((Gson) vnm.d.getValue()).toJson(obj2));
        }
        return Unit.a;
    }
}
