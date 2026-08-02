package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hfh extends hoi implements Function2 {
    public int r;
    public int s;
    public final /* synthetic */ int t;
    public final /* synthetic */ int u;
    public final /* synthetic */ q50 v;
    public final /* synthetic */ float w;
    public final /* synthetic */ e1d x;
    public final /* synthetic */ e1d y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hfh(int i, int i2, q50 q50Var, float f, e1d e1dVar, e1d e1dVar2, rq3 rq3Var) {
        super(2, rq3Var);
        this.t = i;
        this.u = i2;
        this.v = q50Var;
        this.w = f;
        this.x = e1dVar;
        this.y = e1dVar2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new hfh(this.t, this.u, this.v, this.w, this.x, this.y, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((hfh) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006d, code lost:
    
        if (r8.v.f(r8, r10) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        if (defpackage.q50.a(r10.v, r5, r6, null, r8, 12) == r0) goto L20;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        hfh hfhVar;
        lu3 lu3Var = lu3.a;
        int i3 = this.s;
        if (i3 == 0) {
            y6a.M(obj);
            e1d e1dVar = this.x;
            if (((Boolean) e1dVar.getValue()).booleanValue()) {
                e1dVar.setValue(Boolean.FALSE);
                i = this.t;
            } else {
                i = this.u;
            }
            i2 = i;
            Float f = new Float(this.w);
            i4k i4kVar = new i4k(800, i2, jg5.d);
            this.r = i2;
            this.s = 1;
            hfhVar = this;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                hfhVar = this;
                hfhVar.y.setValue(Boolean.valueOf(!((Boolean) r10.getValue()).booleanValue()));
                return Unit.a;
            }
            i2 = this.r;
            y6a.M(obj);
            hfhVar = this;
        }
        Float f2 = new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        hfhVar.r = i2;
        hfhVar.s = 2;
    }
}
