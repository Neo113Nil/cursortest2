package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class dv2 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ long t;
    public final /* synthetic */ q50 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dv2(long j, q50 q50Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 1;
        this.t = j;
        this.u = q50Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new dv2(this.u, this.t, rq3Var, 0);
            case 1:
                return new dv2(this.t, this.u, rq3Var);
            default:
                return new dv2(this.u, this.t, rq3Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((dv2) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
    
        if (defpackage.q50.a(r14.u, r1, r15, null, r14, 12) == r14) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005b, code lost:
    
        if (defpackage.n4o.y(r3, r14) == r14) goto L27;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        long j = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    Float f = new Float(270.0f);
                    i4k h0 = s02.h0((int) j, 0, jg5.d, 2);
                    this.s = 1;
                    if (q50.a(this.u, f, h0, null, this, 12) == lu3Var) {
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
                    this.s = 1;
                    break;
                } else if (i3 == 1) {
                    y6a.M(obj);
                } else if (i3 != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                    break;
                }
                Float f2 = new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                i4k h02 = s02.h0(250, 0, null, 6);
                this.s = 2;
                break;
            default:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    dnd dndVar = new dnd(j);
                    g0i g0iVar = g3h.d;
                    this.s = 1;
                    if (q50.a(this.u, dndVar, g0iVar, null, this, 12) == lu3Var3) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dv2(q50 q50Var, long j, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = q50Var;
        this.t = j;
    }
}
