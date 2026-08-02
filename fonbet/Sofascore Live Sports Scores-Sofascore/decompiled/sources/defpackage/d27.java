package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class d27 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public e1d s;
    public int t;
    public final /* synthetic */ n29 u;
    public final /* synthetic */ e1d v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d27(n29 n29Var, e1d e1dVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = n29Var;
        this.v = e1dVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new d27(this.u, this.v, rq3Var, 0);
            case 1:
                return new d27(this.u, this.v, rq3Var, 1);
            default:
                return new d27(this.u, this.v, rq3Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((d27) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        n29 n29Var = this.u;
        e1d e1dVar = this.v;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.t;
                if (i2 == 0) {
                    y6a.M(obj);
                    this.s = e1dVar;
                    this.t = 1;
                    obj = n29Var.i(this);
                    if (obj == lu3Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    e1dVar = this.s;
                    y6a.M(obj);
                }
                e1dVar.setValue(c6o.z((a10) obj));
                break;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.t;
                if (i3 == 0) {
                    y6a.M(obj);
                    this.s = e1dVar;
                    this.t = 1;
                    obj = n29Var.i(this);
                    if (obj == lu3Var2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    e1dVar = this.s;
                    y6a.M(obj);
                }
                e1dVar.setValue(c6o.z((a10) obj));
                break;
            default:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.t;
                if (i4 == 0) {
                    y6a.M(obj);
                    this.s = e1dVar;
                    this.t = 1;
                    obj = n29Var.i(this);
                    if (obj == lu3Var3) {
                        break;
                    }
                } else if (i4 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    e1dVar = this.s;
                    y6a.M(obj);
                }
                e1dVar.setValue(c6o.z((a10) obj));
                break;
        }
        return Unit.a;
    }
}
