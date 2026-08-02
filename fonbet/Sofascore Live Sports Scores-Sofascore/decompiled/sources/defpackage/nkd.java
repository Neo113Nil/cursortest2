package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class nkd extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ z88 t;
    public final /* synthetic */ Function1 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nkd(z88 z88Var, Function1 function1, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = z88Var;
        this.u = function1;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new nkd(this.t, this.u, rq3Var, 0);
            default:
                return new nkd(this.t, this.u, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((nkd) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        Function1 function1 = this.u;
        z88 z88Var = this.t;
        rq3 rq3Var = null;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    tj0 tj0Var = new tj0(function1, 1);
                    this.s = 1;
                    if (z88Var.collect(tj0Var, this) == lu3Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            default:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    hs4 hs4Var = z45.a;
                    r69 r69Var = rob.a.f;
                    nkd nkdVar = new nkd(z88Var, function1, rq3Var, 0);
                    this.s = 1;
                    if (xw3.R(r69Var, nkdVar, this) == lu3Var2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
        }
        return Unit.a;
    }
}
