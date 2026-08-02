package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class uzh extends hoi implements Function2 {
    public final /* synthetic */ Function2 A;
    public final /* synthetic */ z69 B;
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ ksa t;
    public final /* synthetic */ e1d u;
    public final /* synthetic */ float v;
    public final /* synthetic */ float w;
    public final /* synthetic */ float x;
    public final /* synthetic */ xnh y;
    public final /* synthetic */ List z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uzh(ksa ksaVar, e1d e1dVar, float f, float f2, float f3, xnh xnhVar, List list, Function2 function2, z69 z69Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.t = ksaVar;
        this.u = e1dVar;
        this.v = f;
        this.w = f2;
        this.x = f3;
        this.y = xnhVar;
        this.z = list;
        this.A = function2;
        this.B = z69Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        uzh uzhVar = new uzh(this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, rq3Var);
        uzhVar.s = obj;
        return uzhVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((uzh) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        ku3 ku3Var = (ku3) this.s;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            e1d e1dVar = this.u;
            if (((Integer) e1dVar.getValue()) == null) {
                return Unit.a;
            }
            z69 z69Var = this.B;
            ksa ksaVar = this.t;
            tzh tzhVar = new tzh(ku3Var, ksaVar, this.v, this.w, this.x, e1dVar, this.y, this.z, this.A, z69Var, null);
            this.s = null;
            this.r = 1;
            if (ksaVar.a(m1d.a, tzhVar, this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }
}
