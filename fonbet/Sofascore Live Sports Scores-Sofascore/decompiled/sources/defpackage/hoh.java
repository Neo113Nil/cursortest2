package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hoh extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ Function2 u;
    public final /* synthetic */ e1d v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hoh(Function2 function2, e1d e1dVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = function2;
        this.v = e1dVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                hoh hohVar = new hoh(this.u, this.v, rq3Var, 0);
                hohVar.t = obj;
                return hohVar;
            case 1:
                hoh hohVar2 = new hoh(this.u, this.v, rq3Var, 1);
                hohVar2.t = obj;
                return hohVar2;
            default:
                hoh hohVar3 = new hoh(this.u, this.v, rq3Var, 2);
                hohVar3.t = obj;
                return hohVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((hoh) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        e1d e1dVar = this.v;
        Function2 function2 = this.u;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    i8f i8fVar = new i8f(e1dVar, ((ku3) this.t).getCoroutineContext());
                    this.s = 1;
                    if (function2.invoke(i8fVar, this) == lu3Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    i8f i8fVar2 = new i8f(e1dVar, ((ku3) this.t).getCoroutineContext());
                    this.s = 1;
                    if (function2.invoke(i8fVar2, this) == lu3Var2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            default:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    i8f i8fVar3 = new i8f(e1dVar, ((ku3) this.t).getCoroutineContext());
                    this.s = 1;
                    if (function2.invoke(i8fVar3, this) == lu3Var3) {
                        break;
                    }
                } else if (i4 != 1) {
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
