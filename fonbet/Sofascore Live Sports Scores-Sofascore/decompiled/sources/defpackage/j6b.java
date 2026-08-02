package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class j6b extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ k6b t;
    public final /* synthetic */ Function2 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j6b(k6b k6bVar, Function2 function2, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = k6bVar;
        this.u = function2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Function2 function2 = this.u;
        k6b k6bVar = this.t;
        switch (i) {
            case 0:
                return new j6b(k6bVar, function2, rq3Var, 0);
            case 1:
                return new j6b(k6bVar, function2, rq3Var, 1);
            default:
                return new j6b(k6bVar, function2, rq3Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((j6b) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        Function2 function2 = this.u;
        k6b k6bVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    g6b g6bVar = k6bVar.a;
                    this.s = 1;
                    if (kda.W(g6bVar, e6b.c, function2, this) == lu3Var) {
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
                    g6b g6bVar2 = k6bVar.a;
                    this.s = 1;
                    if (kda.W(g6bVar2, e6b.e, function2, this) == lu3Var2) {
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
                    g6b g6bVar3 = k6bVar.a;
                    this.s = 1;
                    if (kda.W(g6bVar3, e6b.d, function2, this) == lu3Var3) {
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
