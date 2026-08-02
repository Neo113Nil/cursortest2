package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ibj extends hoi implements ct8 {
    public int r;
    public /* synthetic */ g6f s;
    public /* synthetic */ long t;
    public final /* synthetic */ ku3 u;
    public final /* synthetic */ e1d v;
    public final /* synthetic */ wzc w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ibj(ku3 ku3Var, e1d e1dVar, wzc wzcVar, rq3 rq3Var) {
        super(3, rq3Var);
        this.u = ku3Var;
        this.v = e1dVar;
        this.w = wzcVar;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((dnd) obj2).a;
        e1d e1dVar = this.v;
        wzc wzcVar = this.w;
        ibj ibjVar = new ibj(this.u, e1dVar, wzcVar, (rq3) obj3);
        ibjVar.s = (g6f) obj;
        ibjVar.t = j;
        return ibjVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Object E;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        ku3 ku3Var = this.u;
        rq3 rq3Var = null;
        if (i == 0) {
            y6a.M(obj);
            g6f g6fVar = this.s;
            xw3.L(ku3Var, null, null, new h2(this.v, this.t, this.w, (rq3) null, 6), 3);
            this.r = 1;
            E = g6fVar.E(this);
            if (E == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
            E = obj;
        }
        xw3.L(ku3Var, null, null, new w21(this.v, ((Boolean) E).booleanValue(), this.w, rq3Var, 6), 3);
        return Unit.a;
    }
}
