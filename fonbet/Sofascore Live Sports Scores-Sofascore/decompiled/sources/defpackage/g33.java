package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class g33 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ z88 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g33(z88 z88Var, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = z88Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                g33 g33Var = new g33(this.u, rq3Var, 0);
                g33Var.t = obj;
                return g33Var;
            case 1:
                g33 g33Var2 = new g33(this.u, rq3Var, 1);
                g33Var2.t = obj;
                return g33Var2;
            default:
                g33 g33Var3 = new g33(this.u, rq3Var, 2);
                g33Var3.t = obj;
                return g33Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return ((g33) create((k8f) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((g33) create((k8f) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            default:
                return ((g33) create((meb) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        z88 z88Var = this.u;
        switch (i) {
            case 0:
                k8f k8fVar = (k8f) this.t;
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    f33 f33Var = new f33(k8fVar, 0);
                    this.t = null;
                    this.s = 1;
                    if (z88Var.collect(f33Var, this) == lu3Var) {
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
                k8f k8fVar2 = (k8f) this.t;
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    f33 f33Var2 = new f33(k8fVar2, 2);
                    this.t = null;
                    this.s = 1;
                    if (z88Var.collect(f33Var2, this) == lu3Var2) {
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
                    f10 f10Var = new f10((meb) this.t, 10);
                    this.s = 1;
                    if (z88Var.collect(f10Var, this) == lu3Var3) {
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
