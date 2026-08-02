package defpackage;

import defpackage.w3m;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pjm extends hoi implements Function1 {
    public int r;
    public final /* synthetic */ w3m s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pjm(w3m w3mVar, rq3 rq3Var) {
        super(1, rq3Var);
        this.s = w3mVar;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new pjm(this.s, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new pjm(this.s, (rq3) obj).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        w3m w3mVar = this.s;
        if (i == 0) {
            y6a.M(obj);
            long j = w3mVar.J0;
            this.r = 1;
            if (n4o.y(j, this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        w3mVar.h0(((wpm) w3mVar.H0.getValue()).a ? new w3m.a.C1357a(false) : new w3m.a.b(true));
        return Unit.a;
    }
}
