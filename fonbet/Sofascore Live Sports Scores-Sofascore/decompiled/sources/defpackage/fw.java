package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fw extends hoi implements et8 {
    public int r;
    public /* synthetic */ zw s;
    public /* synthetic */ ptb t;
    public /* synthetic */ Object u;
    public final /* synthetic */ dx v;
    public final /* synthetic */ float w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw(dx dxVar, float f, rq3 rq3Var) {
        super(4, rq3Var);
        this.v = dxVar;
        this.w = f;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        fw fwVar = new fw(this.v, this.w, (rq3) obj4);
        fwVar.s = (zw) obj;
        fwVar.t = (ptb) obj2;
        fwVar.u = obj3;
        return fwVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            zw zwVar = this.s;
            float d = this.t.d(this.u);
            if (!Float.isNaN(d)) {
                csf csfVar = new csf();
                dx dxVar = this.v;
                float h = Float.isNaN(((xnh) dxVar.f).h()) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : ((xnh) dxVar.f).h();
                csfVar.a = h;
                j38 j38Var = ((dfh) ((e6g) dxVar.k).b).c;
                ew ewVar = new ew(zwVar, csfVar, 0);
                this.s = null;
                this.t = null;
                this.r = 1;
                if (d2a.k(h, d, this.w, j38Var, ewVar, this) == lu3Var) {
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
