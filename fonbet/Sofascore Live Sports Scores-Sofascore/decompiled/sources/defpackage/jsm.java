package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jsm extends hoi implements Function1 {
    public int r;
    public final /* synthetic */ w3m s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jsm(w3m w3mVar, rq3 rq3Var) {
        super(1, rq3Var);
        this.s = w3mVar;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new jsm(this.s, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new jsm(this.s, (rq3) obj).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            w3m w3mVar = this.s;
            hof hofVar = w3mVar.p;
            arm armVar = new arm(w3mVar, null);
            this.r = 1;
            if (fcp.c0(hofVar, armVar, this) == lu3Var) {
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
