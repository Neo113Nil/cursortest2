package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class arm extends hoi implements Function2 {
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ w3m t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arm(w3m w3mVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.t = w3mVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        arm armVar = new arm(this.t, rq3Var);
        armVar.s = obj;
        return armVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        arm armVar = new arm(this.t, (rq3) obj2);
        armVar.s = (Pair) obj;
        return armVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            Pair pair = (Pair) this.s;
            w3m w3mVar = this.t;
            n4m D = w3mVar.D();
            this.r = 1;
            if (w3m.X(w3mVar, D, pair, false, this) == lu3Var) {
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
