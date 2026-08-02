package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class c27 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ e1d t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c27(int i, e1d e1dVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 2;
        this.s = i;
        this.t = e1dVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new c27(this.t, rq3Var, 0);
            case 1:
                return new c27(this.t, rq3Var, 1);
            case 2:
                return new c27(this.s, this.t, rq3Var);
            case 3:
                return new c27(this.t, rq3Var, 3);
            default:
                return new c27(this.t, rq3Var, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((c27) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        e1d e1dVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    wd5 wd5Var = xd5.b;
                    long R = wkn.R(300, be5.MILLISECONDS);
                    this.s = 1;
                    if (n4o.z(R, this) == lu3Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                e1dVar.setValue(Boolean.TRUE);
                break;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (n4o.y(1000L, this) == lu3Var2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                e1dVar.setValue(Boolean.FALSE);
                break;
            case 2:
                lu3 lu3Var3 = lu3.a;
                y6a.M(obj);
                if (this.s > 0) {
                    e1dVar.setValue(null);
                }
                break;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (n4o.y(500L, this) == lu3Var4) {
                        break;
                    }
                } else if (i4 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                e1dVar.setValue(Boolean.TRUE);
                break;
            default:
                lu3 lu3Var5 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (n4o.y(1000L, this) == lu3Var5) {
                        break;
                    }
                } else if (i5 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                e1dVar.setValue(Boolean.FALSE);
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c27(e1d e1dVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = e1dVar;
    }
}
