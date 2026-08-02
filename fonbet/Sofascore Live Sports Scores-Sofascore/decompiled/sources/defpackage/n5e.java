package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class n5e extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ a6e t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n5e(a6e a6eVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = a6eVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new n5e(this.t, rq3Var, 0);
            case 1:
                return new n5e(this.t, rq3Var, 1);
            case 2:
                return new n5e(this.t, rq3Var, 2);
            default:
                return new n5e(this.t, rq3Var, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((n5e) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        int i = this.r;
        a6e a6eVar = this.t;
        rq3 rq3Var = null;
        switch (i) {
            case 0:
                Object obj4 = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    b6e b6eVar = c6e.a;
                    if (a6eVar.k() - 1 >= 0) {
                        obj2 = a6e.g(a6eVar, a6eVar.k() - 1, null, this, 6);
                        if (obj2 != obj4) {
                            obj2 = Unit.a;
                        }
                    } else {
                        obj2 = Unit.a;
                    }
                    if (obj2 == obj4) {
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
                Object obj5 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    b6e b6eVar2 = c6e.a;
                    if (a6eVar.k() + 1 < a6eVar.n()) {
                        obj3 = a6e.g(a6eVar, a6eVar.k() + 1, null, this, 6);
                        if (obj3 != obj5) {
                            obj3 = Unit.a;
                        }
                    } else {
                        obj3 = Unit.a;
                    }
                    if (obj3 == obj5) {
                        break;
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 2:
                Object obj6 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    m1d m1dVar = m1d.a;
                    i40 i40Var = new i40(2, rq3Var, 8);
                    a6eVar.getClass();
                    Object s = a6e.s(a6eVar, m1dVar, i40Var, this);
                    if (s != obj6) {
                        s = Unit.a;
                    }
                    if (s == obj6) {
                        break;
                    }
                } else if (i4 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            default:
                lu3 lu3Var = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (a6e.g(a6eVar, 0, null, this, 6) == lu3Var) {
                        break;
                    }
                } else if (i5 != 1) {
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
