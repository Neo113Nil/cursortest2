package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class bce extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ q50 t;
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bce(q50 q50Var, int i, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.t = q50Var;
        this.u = i;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new bce(this.t, this.u, rq3Var, 0);
            case 1:
                return new bce(this.t, this.u, rq3Var, 1);
            case 2:
                return new bce(this.t, this.u, rq3Var, 2);
            case 3:
                return new bce(this.t, this.u, rq3Var, 3);
            default:
                return new bce(this.t, this.u, rq3Var, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((bce) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        int i2 = this.u;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    Float f = new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    i4k h0 = s02.h0(i2, 0, vsh.a, 2);
                    this.s = 1;
                    if (q50.a(this.t, f, h0, null, this, 12) == lu3Var) {
                        break;
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    Float f2 = new Float(1.0f);
                    i4k h02 = s02.h0(i2, 0, vsh.a, 2);
                    this.s = 1;
                    if (q50.a(this.t, f2, h02, null, this, 12) == lu3Var2) {
                        break;
                    }
                } else if (i4 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    Float f3 = new Float(1.0f);
                    i4k h03 = s02.h0(i2, 0, vsh.a, 2);
                    this.s = 1;
                    if (q50.a(this.t, f3, h03, null, this, 12) == lu3Var3) {
                        break;
                    }
                } else if (i5 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    if (((Number) this.t.d()).floatValue() < 1.0f) {
                        Float f4 = new Float(1.0f);
                        i4k h04 = s02.h0(224, (i2 * 80) + 96, null, 4);
                        this.s = 1;
                        if (q50.a(this.t, f4, h04, null, this, 12) == lu3Var4) {
                            break;
                        }
                    }
                } else if (i6 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            default:
                lu3 lu3Var5 = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    Float f5 = new Float(1.0f);
                    i4k h05 = s02.h0(i2, 0, null, 6);
                    this.s = 1;
                    if (q50.a(this.t, f5, h05, null, this, 12) == lu3Var5) {
                        break;
                    }
                } else if (i7 != 1) {
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
