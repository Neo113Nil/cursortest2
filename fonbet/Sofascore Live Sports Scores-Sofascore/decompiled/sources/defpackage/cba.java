package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class cba extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ q50 t;
    public final /* synthetic */ float u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cba(q50 q50Var, float f, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = q50Var;
        this.u = f;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        float f = this.u;
        q50 q50Var = this.t;
        switch (i) {
            case 0:
                return new cba(q50Var, f, rq3Var, 0);
            case 1:
                return new cba(q50Var, f, rq3Var, 1);
            case 2:
                return new cba(q50Var, f, rq3Var, 2);
            case 3:
                return new cba(q50Var, f, rq3Var, 3);
            case 4:
                return new cba(q50Var, f, rq3Var, 4);
            case 5:
                return new cba(q50Var, f, rq3Var, 5);
            default:
                return new cba(q50Var, f, rq3Var, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((cba) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        q50 q50Var = this.t;
        float f = this.u;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    Float f2 = new Float(f);
                    i4k i4kVar = new i4k(400, (ig5) null, 6);
                    this.s = 1;
                    if (q50.a(this.t, f2, i4kVar, null, this, 12) == lu3Var) {
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
                    Float f3 = new Float(f);
                    i4k h0 = s02.h0(400, 0, null, 6);
                    this.s = 1;
                    if (q50.a(this.t, f3, h0, null, this, 12) == lu3Var2) {
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
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    Float f4 = new Float(f);
                    i4k h02 = s02.h0(400, 0, null, 6);
                    this.s = 1;
                    if (q50.a(this.t, f4, h02, null, this, 12) == lu3Var3) {
                        break;
                    }
                } else if (i4 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    Float f5 = new Float(f);
                    i4k h03 = s02.h0(400, 0, null, 6);
                    this.s = 1;
                    if (q50.a(this.t, f5, h03, null, this, 12) == lu3Var4) {
                        break;
                    }
                } else if (i5 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    Float f6 = new Float(f);
                    this.s = 1;
                    if (q50Var.f(this, f6) == lu3Var5) {
                        break;
                    }
                } else if (i6 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 5:
                lu3 lu3Var6 = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    Float f7 = new Float(f);
                    this.s = 1;
                    if (q50Var.f(this, f7) == lu3Var6) {
                        break;
                    }
                } else if (i7 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            default:
                lu3 lu3Var7 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    Float f8 = new Float(f);
                    this.s = 1;
                    if (q50Var.f(this, f8) == lu3Var7) {
                        break;
                    }
                } else if (i8 != 1) {
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
