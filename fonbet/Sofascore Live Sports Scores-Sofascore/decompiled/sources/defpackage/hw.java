package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hw extends hoi implements et8 {
    public int r;
    public /* synthetic */ ax s;
    public /* synthetic */ lo4 t;
    public /* synthetic */ Object u;
    public final /* synthetic */ dx v;
    public final /* synthetic */ float w;
    public final /* synthetic */ c80 x;
    public final /* synthetic */ csf y;
    public final /* synthetic */ ol4 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hw(dx dxVar, float f, c80 c80Var, csf csfVar, ol4 ol4Var, rq3 rq3Var) {
        super(4, rq3Var);
        this.v = dxVar;
        this.w = f;
        this.x = c80Var;
        this.y = csfVar;
        this.z = ol4Var;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        csf csfVar = this.y;
        ol4 ol4Var = this.z;
        hw hwVar = new hw(this.v, this.w, this.x, csfVar, ol4Var, (rq3) obj4);
        hwVar.s = (ax) obj;
        hwVar.t = (lo4) obj2;
        hwVar.u = obj3;
        return hwVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b8, code lost:
    
        if (defpackage.zm2.h(r16.v, r14, r11, r3, r5, r16.x, r16) == r7) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a5, code lost:
    
        if (defpackage.d2a.n(r1, r0, false, r8, r16) == r7) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ce, code lost:
    
        if (defpackage.zm2.h(r16.v, r15, r11, r3, r5, r16.x, r16) == r7) goto L43;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        csf csfVar = this.y;
        if (i == 0) {
            y6a.M(obj);
            ax axVar = this.s;
            lo4 lo4Var = this.t;
            Object obj2 = this.u;
            float c = lo4Var.c(obj2);
            if (!Float.isNaN(c)) {
                csf csfVar2 = new csf();
                dx dxVar = this.v;
                float h = Float.isNaN(((xnh) dxVar.f).h()) ? 0.0f : ((xnh) dxVar.f).h();
                csfVar2.a = h;
                if (h != c) {
                    float f = this.w;
                    if ((c - h) * f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        this.s = null;
                        this.t = null;
                        this.r = 1;
                    } else {
                        ol4 ol4Var = this.z;
                        float t = tgj.t(ol4Var, h, f);
                        float f2 = this.w;
                        if (f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? t > c : t < c) {
                            this.s = null;
                            this.t = null;
                            this.r = 3;
                        } else {
                            d80 a = t62.a(28, csfVar2.a, f2);
                            hnh hnhVar = new hnh(c, csfVar2, axVar, csfVar, 2);
                            this.s = null;
                            this.t = null;
                            this.r = 2;
                        }
                    }
                    return lu3Var;
                }
            }
        } else if (i == 1) {
            y6a.M(obj);
            csfVar.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        } else if (i == 2) {
            y6a.M(obj);
        } else {
            if (i != 3) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
            csfVar.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return Unit.a;
    }
}
