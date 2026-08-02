package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class bug extends hoi implements Function2 {
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ float t;
    public final /* synthetic */ c80 u;
    public final /* synthetic */ csf v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bug(float f, c80 c80Var, csf csfVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.t = f;
        this.u = c80Var;
        this.v = csfVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        bug bugVar = new bug(this.t, this.u, this.v, rq3Var);
        bugVar.s = obj;
        return bugVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((bug) create((oug) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            gme gmeVar = new gme(26, this.v, (oug) this.s);
            this.r = 1;
            if (d2a.m(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.t, this.u, gmeVar, this, 4) == lu3Var) {
                return lu3Var;
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
