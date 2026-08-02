package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rw extends hoi implements ct8 {
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ sw t;
    public final /* synthetic */ csf u;
    public final /* synthetic */ float v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rw(sw swVar, csf csfVar, float f, rq3 rq3Var) {
        super(3, rq3Var);
        this.t = swVar;
        this.u = csfVar;
        this.v = f;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        csf csfVar = this.u;
        float f = this.v;
        rw rwVar = new rw(this.t, csfVar, f, (rq3) obj3);
        rwVar.s = (ax) obj;
        return rwVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        csf csfVar;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            ax axVar = (ax) this.s;
            sw swVar = this.t;
            qw qwVar = new qw(0, swVar, axVar);
            p78 p78Var = swVar.L;
            if (p78Var == null) {
                Intrinsics.i("resolvedFlingBehavior");
                throw null;
            }
            csf csfVar2 = this.u;
            this.s = csfVar2;
            this.r = 1;
            obj = p78Var.a(qwVar, this.v, this);
            if (obj == lu3Var) {
                return lu3Var;
            }
            csfVar = csfVar2;
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            csfVar = (csf) this.s;
            y6a.M(obj);
        }
        csfVar.a = ((Number) obj).floatValue();
        return Unit.a;
    }
}
