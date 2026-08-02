package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class we3 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public /* synthetic */ float t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ we3(Object obj, float f, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = obj;
        this.t = f;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                we3 we3Var = new we3((xe3) obj2, rq3Var);
                we3Var.t = ((Number) obj).floatValue();
                return we3Var;
            case 1:
                return new we3((dfh) obj2, this.t, rq3Var, 1);
            default:
                return new we3((ghf) obj2, this.t, rq3Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                break;
        }
        return ((we3) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Object c;
        int i = this.r;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                xe3 xe3Var = (xe3) obj2;
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    float f = this.t;
                    Object g = xe3Var.a.d.a.g(k3h.e);
                    Function2 function2 = (Function2) (g != null ? g : null);
                    if (function2 == null) {
                        throw wt3.j("Required value was null.");
                    }
                    dnd dndVar = new dnd((Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
                    this.s = 1;
                    obj = function2.invoke(dndVar, this);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return new Float(Float.intBitsToFloat((int) (((dnd) obj).a & 4294967295L)));
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    float f2 = this.t;
                    this.s = 1;
                    dx dxVar = ((dfh) obj2).d;
                    Object value = ((eoh) ((e1d) dxVar.c)).getValue();
                    Object e = dxVar.e(dxVar.k(), f2, value);
                    if (((Boolean) ((Function1) dxVar.b).invoke(e)).booleanValue()) {
                        c = dxVar.c(e, m1d.a, new fw(dxVar, f2, null), this);
                        if (c != lu3Var2) {
                            c = Unit.a;
                        }
                        if (c != lu3Var2) {
                            c = Unit.a;
                        }
                    } else {
                        c = dxVar.c(value, m1d.a, new fw(dxVar, f2, null), this);
                        if (c != lu3Var2) {
                            c = Unit.a;
                        }
                        if (c != lu3Var2) {
                            c = Unit.a;
                        }
                    }
                    if (c != lu3Var2) {
                        c = Unit.a;
                    }
                    if (c == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            default:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    ghf ghfVar = (ghf) obj2;
                    q1d q1dVar = ghfVar.i;
                    fhf fhfVar = new fhf(ghfVar, this.t, null);
                    this.s = 1;
                    if (q1d.a(q1dVar, fhfVar, this) == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i4 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public we3(xe3 xe3Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 0;
        this.u = xe3Var;
    }
}
