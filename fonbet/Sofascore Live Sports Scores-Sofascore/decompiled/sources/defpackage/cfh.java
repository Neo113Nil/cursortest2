package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cfh extends hoi implements et8 {
    public int r;
    public /* synthetic */ zw s;
    public /* synthetic */ ptb t;
    public /* synthetic */ efh u;
    public final /* synthetic */ dfh v;
    public final /* synthetic */ float w;
    public final /* synthetic */ j38 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfh(dfh dfhVar, float f, j38 j38Var, rq3 rq3Var) {
        super(4, rq3Var);
        this.v = dfhVar;
        this.w = f;
        this.x = j38Var;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        float f = this.w;
        j38 j38Var = this.x;
        cfh cfhVar = new cfh(this.v, f, j38Var, (rq3) obj4);
        cfhVar.s = (zw) obj;
        cfhVar.t = (ptb) obj2;
        cfhVar.u = (efh) obj3;
        return cfhVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        int i2 = 1;
        if (i == 0) {
            y6a.M(obj);
            zw zwVar = this.s;
            float d = this.t.d(this.u);
            if (!Float.isNaN(d)) {
                csf csfVar = new csf();
                dfh dfhVar = this.v;
                float h = Float.isNaN(((xnh) dfhVar.d.f).h()) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : ((xnh) dfhVar.d.f).h();
                csfVar.a = h;
                ew ewVar = new ew(zwVar, csfVar, i2);
                this.s = null;
                this.t = null;
                this.r = 1;
                if (d2a.k(h, d, this.w, this.x, ewVar, this) == lu3Var) {
                    return lu3Var;
                }
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }
}
