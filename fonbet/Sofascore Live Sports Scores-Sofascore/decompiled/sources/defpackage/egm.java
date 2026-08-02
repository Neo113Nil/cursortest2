package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class egm extends hoi implements Function2 {
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ hoi t;
    public final /* synthetic */ rum u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public egm(ct8 ct8Var, rum rumVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.t = (hoi) ct8Var;
        this.u = rumVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ct8, hoi] */
    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        egm egmVar = new egm(this.t, this.u, rq3Var);
        egmVar.s = obj;
        return egmVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((egm) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ct8, hoi] */
    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            ku3 ku3Var = (ku3) this.s;
            this.r = 1;
            if (this.t.invoke(ku3Var, this.u, this) == lu3Var) {
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
