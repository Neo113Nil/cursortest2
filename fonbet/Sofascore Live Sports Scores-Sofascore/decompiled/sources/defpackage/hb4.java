package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hb4 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ Function1 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb4(Function1 function1, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 2;
        this.u = function1;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                hb4 hb4Var = new hb4(rq3Var, this.u, 0);
                hb4Var.t = obj;
                return hb4Var;
            case 1:
                hb4 hb4Var2 = new hb4(rq3Var, this.u, 1);
                hb4Var2.t = obj;
                return hb4Var2;
            default:
                hb4 hb4Var3 = new hb4(this.u, rq3Var);
                hb4Var3.t = obj;
                return hb4Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return ((hb4) create((mae) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((hb4) create((mae) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            default:
                return ((hb4) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        Function1 function1 = this.u;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 != 0) {
                    if (i2 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                this.s = 1;
                Object invoke = function1.invoke(this);
                return invoke == lu3Var ? lu3Var : invoke;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 != 0) {
                    if (i3 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                this.s = 1;
                Object invoke2 = function1.invoke(this);
                return invoke2 == lu3Var2 ? lu3Var2 : invoke2;
            default:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    if (((ku3) this.t).getCoroutineContext().get(xuj.b) != null) {
                        this.s = 1;
                        Object invoke3 = function1.invoke(this);
                        return invoke3 == lu3Var3 ? lu3Var3 : invoke3;
                    }
                    a70.r("Expected a TransactionElement in the CoroutineContext but none was found.");
                } else {
                    if (i4 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hb4(rq3 rq3Var, Function1 function1, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = function1;
    }
}
