package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class mcj extends hoi implements ct8 {
    public int r;
    public /* synthetic */ g6f s;
    public /* synthetic */ long t;
    public final /* synthetic */ wzc u;
    public final /* synthetic */ lcj v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mcj(wzc wzcVar, lcj lcjVar, rq3 rq3Var) {
        super(3, rq3Var);
        this.u = wzcVar;
        this.v = lcjVar;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((dnd) obj2).a;
        mcj mcjVar = new mcj(this.u, this.v, (rq3) obj3);
        mcjVar.s = (g6f) obj;
        mcjVar.t = j;
        return mcjVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            g6f g6fVar = this.s;
            long j = this.t;
            wzc wzcVar = this.u;
            if (wzcVar != null) {
                vo3 vo3Var = new vo3(g6fVar, this.v, j, wzcVar, (rq3) null);
                this.r = 1;
                if (s9a.r(vo3Var, this) == lu3Var) {
                    return lu3Var;
                }
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
