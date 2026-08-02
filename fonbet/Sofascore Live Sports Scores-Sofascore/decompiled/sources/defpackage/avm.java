package defpackage;

import defpackage.ltl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class avm extends hoi implements Function2 {
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ syl t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avm(syl sylVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.t = sylVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        avm avmVar = new avm(this.t, rq3Var);
        avmVar.s = obj;
        return avmVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        avm avmVar = new avm(this.t, (rq3) obj2);
        avmVar.s = (ltl) obj;
        return avmVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            ltl ltlVar = (ltl) this.s;
            if (ltlVar instanceof ltl.c) {
                n4m n4mVar = ((ltl.c) ltlVar).a;
                this.r = 1;
                if (syl.B(this.t, n4mVar, this) == lu3Var) {
                    return lu3Var;
                }
            } else if (!(ltlVar instanceof ltl.a) && !(ltlVar instanceof ltl.b)) {
                zzl.b();
                return null;
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
