package defpackage;

import com.moloco.sdk.internal.publisher.h0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class q9j extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ float t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q9j(Object obj, float f, boolean z, Object obj2, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.v = obj;
        this.t = f;
        this.u = z;
        this.w = obj2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.w;
        Object obj3 = this.v;
        switch (i) {
            case 0:
                return new q9j((r9j) obj3, this.t, this.u, (oqf) obj2, rq3Var, 0);
            default:
                return new q9j((q50) obj3, this.t, this.u, (o) obj2, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((q9j) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        if (defpackage.q50.a(r0, r1, r2, null, r12, 12) == r8) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
    
        if (r0.g(r12) == r8) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0042, code lost:
    
        if (r0.f(r12, r3) == r8) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cc, code lost:
    
        if (r8.s.g.a((defpackage.oqf) r9, r12) == r0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00bb, code lost:
    
        if (defpackage.v8a.G(r3, r2, r12) == r0) goto L51;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        boolean z = this.u;
        float f = this.t;
        Object obj2 = this.v;
        Object obj3 = this.w;
        switch (i) {
            case 0:
                r9j r9jVar = (r9j) obj2;
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    qug qugVar = r9jVar.x;
                    if (!Float.isNaN(f) && !Float.isInfinite(f)) {
                        f = (float) (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Math.ceil(f) : Math.floor(f));
                    }
                    this.s = 1;
                    break;
                } else if (i2 == 1) {
                    y6a.M(obj);
                } else if (i2 != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                    break;
                }
                if (z) {
                    this.s = 2;
                    break;
                }
                break;
            default:
                o oVar = (o) obj3;
                q50 q50Var = (q50) obj2;
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    Float f2 = new Float(f);
                    this.s = 1;
                    break;
                } else if (i3 == 1) {
                    y6a.M(obj);
                } else if (i3 == 2) {
                    y6a.M(obj);
                } else if (i3 != 3) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                    Unit unit = Unit.a;
                    break;
                }
                if (!z || !(oVar instanceof m)) {
                    this.s = 3;
                    break;
                } else {
                    Float f3 = new Float(1.0f);
                    i4k h0 = s02.h0(h0.u(oVar), 0, jg5.d, 2);
                    this.s = 2;
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
