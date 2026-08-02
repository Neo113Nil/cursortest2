package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class i0h extends hoi implements Function1 {
    public final /* synthetic */ int r = 0;
    public int s;
    public final /* synthetic */ o0h t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ axj v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0h(axj axjVar, o0h o0hVar, Object obj, rq3 rq3Var) {
        super(1, rq3Var);
        this.v = axjVar;
        this.t = o0hVar;
        this.u = obj;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        int i = this.r;
        axj axjVar = this.v;
        Object obj = this.u;
        o0h o0hVar = this.t;
        switch (i) {
            case 0:
                return new i0h(axjVar, o0hVar, obj, rq3Var);
            default:
                return new i0h(o0hVar, obj, axjVar, rq3Var);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((i0h) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        o0h o0hVar = this.t;
        Object obj2 = this.u;
        axj axjVar = this.v;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    h10 h10Var = new h10(o0hVar, obj2, axjVar, (rq3) null);
                    this.s = 1;
                    if (s9a.r(h10Var, this) == lu3Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                axjVar.k();
                break;
            default:
                e1d e1dVar = o0hVar.c;
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    o0hVar.T();
                    o0hVar.n = Long.MIN_VALUE;
                    o0hVar.Z(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    float f = Intrinsics.c(obj2, ((eoh) o0hVar.d).getValue()) ? -4.0f : Intrinsics.c(obj2, ((eoh) e1dVar).getValue()) ? -5.0f : -3.0f;
                    axjVar.r(obj2);
                    axjVar.p(0L);
                    ((eoh) e1dVar).setValue(obj2);
                    o0hVar.Z(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    o0hVar.I(obj2);
                    axjVar.l(f);
                    if (f == -3.0f) {
                        this.s = 1;
                        if (o0hVar.d0(this) == lu3Var2) {
                            break;
                        }
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                axjVar.k();
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0h(o0h o0hVar, Object obj, axj axjVar, rq3 rq3Var) {
        super(1, rq3Var);
        this.t = o0hVar;
        this.u = obj;
        this.v = axjVar;
    }
}
