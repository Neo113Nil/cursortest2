package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class c60 extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ flb s;
    public final /* synthetic */ plb t;
    public final /* synthetic */ int u;
    public final /* synthetic */ float v;
    public final /* synthetic */ olb w;
    public final /* synthetic */ e1d x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c60(flb flbVar, plb plbVar, int i, float f, olb olbVar, e1d e1dVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = flbVar;
        this.t = plbVar;
        this.u = i;
        this.v = f;
        this.w = olbVar;
        this.x = e1dVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new c60(this.s, this.t, this.u, this.v, this.w, this.x, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c60) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a0, code lost:
    
        if (defpackage.waa.p(r4, r12.t, r12.u, r12.v, r8, r12.w, r12, 514) == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a2, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0081, code lost:
    
        if (r13 == r0) goto L35;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2 = lu3.a;
        int i = this.r;
        e1d e1dVar = this.x;
        if (i == 0) {
            y6a.M(obj);
            if (!((Boolean) e1dVar.getValue()).booleanValue()) {
                this.r = 1;
                flb flbVar = this.s;
                plb plbVar = (plb) ((eoh) flbVar.i).getValue();
                flbVar.c();
                float f = flbVar.f();
                float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if ((f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && plbVar == null) || (plbVar != null && f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
                    f2 = 1.0f;
                }
                float f3 = f2;
                Object a = q1d.a(flbVar.o, new elb(flbVar, (plb) ((eoh) flbVar.i).getValue(), f3, !(f3 == flbVar.e()), null), this);
                if (a != obj2) {
                    a = Unit.a;
                }
                if (a != obj2) {
                    a = Unit.a;
                }
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    y6a.M(obj);
                    return Unit.a;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        e1dVar.setValue(Boolean.TRUE);
        flb flbVar2 = this.s;
        float e = flbVar2.e();
        this.r = 2;
    }
}
