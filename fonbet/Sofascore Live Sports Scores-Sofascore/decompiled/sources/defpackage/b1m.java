package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class b1m extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ ksa s;
    public final /* synthetic */ e1d t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1m(ksa ksaVar, e1d e1dVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = ksaVar;
        this.t = e1dVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new b1m(this.s, this.t, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new b1m(this.s, this.t, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        e1d e1dVar = this.t;
        if (i == 0) {
            y6a.M(obj);
            if (this.s.j.b()) {
                e1dVar.setValue(Boolean.TRUE);
                return Unit.a;
            }
            wd5 wd5Var = xd5.b;
            long R = wkn.R(1, be5.SECONDS);
            this.r = 1;
            if (n4o.z(R, this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        e1dVar.setValue(Boolean.FALSE);
        return Unit.a;
    }
}
