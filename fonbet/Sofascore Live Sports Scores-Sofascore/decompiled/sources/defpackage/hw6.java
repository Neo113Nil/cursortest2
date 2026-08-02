package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class hw6 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ e1d u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hw6(boolean z, e1d e1dVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = z;
        this.u = e1dVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new hw6(this.t, this.u, rq3Var, 0);
            case 1:
                return new hw6(this.t, this.u, rq3Var, 1);
            default:
                return new hw6(this.t, this.u, rq3Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((hw6) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        boolean z = this.t;
        e1d e1dVar = this.u;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    if (!z) {
                        wd5 wd5Var = xd5.b;
                        long R = wkn.R(3, be5.SECONDS);
                        this.s = 1;
                        if (n4o.z(R, this) == lu3Var) {
                            break;
                        }
                    }
                    break;
                } else if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                e1dVar.setValue(Boolean.FALSE);
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    if (!z) {
                        e1dVar.setValue(Boolean.FALSE);
                    } else if (!((Boolean) e1dVar.getValue()).booleanValue()) {
                        wd5 wd5Var2 = xd5.b;
                        long R2 = wkn.R(150, be5.MILLISECONDS);
                        this.s = 1;
                        if (n4o.z(R2, this) == lu3Var2) {
                            break;
                        }
                    }
                    break;
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                e1dVar.setValue(Boolean.TRUE);
            default:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    if (!z) {
                        this.s = 1;
                        if (n4o.y(1500L, this) == lu3Var3) {
                            break;
                        }
                    } else {
                        e1dVar.setValue(Boolean.TRUE);
                        break;
                    }
                } else if (i4 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                e1dVar.setValue(Boolean.FALSE);
        }
        return Unit.a;
    }
}
