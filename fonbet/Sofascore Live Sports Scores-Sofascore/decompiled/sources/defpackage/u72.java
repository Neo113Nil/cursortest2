package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class u72 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ q50 t;
    public final /* synthetic */ float u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ i7a w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u72(q50 q50Var, float f, boolean z, Object obj, i7a i7aVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = q50Var;
        this.u = f;
        this.v = z;
        this.x = obj;
        this.w = i7aVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.x;
        switch (i) {
            case 0:
                return new u72(this.t, this.u, this.v, (v72) obj2, this.w, rq3Var, 0);
            case 1:
                return new u72(this.t, this.u, this.v, (gk2) obj2, this.w, rq3Var, 1);
            default:
                return new u72(this.t, this.u, this.v, (vn4) obj2, this.w, rq3Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((u72) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x01aa, code lost:
    
        if (r11.f(r14, r15) == r0) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01e4, code lost:
    
        if (defpackage.aj5.a(r11, r8, r12, r3, r14) == r0) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r11.f(r14, r15) == r0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e4, code lost:
    
        if (r14 == r0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00bc, code lost:
    
        if ((r15 instanceof defpackage.rd8) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0124, code lost:
    
        if (r11.f(r14, r15) == r0) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x016c, code lost:
    
        if (defpackage.aj5.a(r11, r8, r12, r3, r14) == r0) goto L96;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object f;
        int i = this.r;
        Object obj2 = this.x;
        i7a i7aVar = this.w;
        boolean z = this.v;
        float f2 = this.u;
        q50 q50Var = this.t;
        i7a i7aVar2 = null;
        r12 = null;
        r12 = null;
        i4k i4kVar = null;
        i7a m95Var = null;
        switch (i) {
            case 0:
                v72 v72Var = (v72) obj2;
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    if (!p75.b(((p75) ((eoh) q50Var.e).getValue()).a, f2)) {
                        if (!z) {
                            p75 p75Var = new p75(f2);
                            this.s = 1;
                            break;
                        } else {
                            float f3 = ((p75) ((eoh) q50Var.e).getValue()).a;
                            if (p75.b(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
                                i7aVar2 = new l6f(0L);
                            } else if (p75.b(f3, v72Var.b)) {
                                i7aVar2 = new sf9();
                            } else if (p75.b(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
                                i7aVar2 = new rd8();
                            }
                            this.s = 2;
                            break;
                        }
                    }
                } else if (i2 != 1 && i2 != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 1:
                gk2 gk2Var = (gk2) obj2;
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    if (!p75.b(((p75) ((eoh) q50Var.e).getValue()).a, f2)) {
                        if (!z) {
                            p75 p75Var2 = new p75(f2);
                            this.s = 1;
                            break;
                        } else {
                            float f4 = ((p75) ((eoh) q50Var.e).getValue()).a;
                            if (p75.b(f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
                                m95Var = new l6f(0L);
                            } else if (p75.b(f4, gk2Var.b)) {
                                m95Var = new sf9();
                            } else if (p75.b(f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
                                m95Var = new rd8();
                            } else if (p75.b(f4, gk2Var.c)) {
                                m95Var = new m95();
                            }
                            this.s = 2;
                            break;
                        }
                    }
                } else if (i3 != 1 && i3 != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            default:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    if (!p75.b(((p75) ((eoh) q50Var.e).getValue()).a, f2)) {
                        if (!z) {
                            p75 p75Var3 = new p75(f2);
                            this.s = 1;
                            break;
                        } else {
                            float f5 = ((p75) ((eoh) q50Var.e).getValue()).a;
                            i7a l6fVar = p75.b(f5, 8.0f) ? new l6f(0L) : p75.b(f5, 4.0f) ? new sf9() : p75.b(f5, 4.0f) ? new rd8() : null;
                            this.s = 2;
                            i4k i4kVar2 = bj5.b;
                            i4k i4kVar3 = bj5.a;
                            if (i7aVar != null) {
                                if ((i7aVar instanceof l6f) || (i7aVar instanceof m95) || (i7aVar instanceof sf9) || (i7aVar instanceof rd8)) {
                                    i4kVar = i4kVar3;
                                }
                            } else if (l6fVar != null) {
                                if (!(l6fVar instanceof l6f) && !(l6fVar instanceof m95)) {
                                    if (!(l6fVar instanceof sf9)) {
                                        break;
                                    } else {
                                        i4kVar = bj5.c;
                                    }
                                }
                                i4kVar = i4kVar2;
                            }
                            i4k i4kVar4 = i4kVar;
                            q50 q50Var2 = this.t;
                            if (i4kVar4 == null) {
                                f = q50Var2.f(this, new p75(f2));
                                if (f != lu3Var3) {
                                    f = Unit.a;
                                    break;
                                }
                            } else {
                                f = q50.a(q50Var2, new p75(f2), i4kVar4, null, this, 12);
                                if (f != lu3Var3) {
                                    f = Unit.a;
                                    break;
                                }
                            }
                        }
                    }
                } else if (i4 != 1 && i4 != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
        }
        return Unit.a;
    }
}
