package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pv2 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public float t;
    public /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pv2(float f, o0h o0hVar, d6d d6dVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 2;
        this.t = f;
        this.u = o0hVar;
        this.v = d6dVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.v;
        switch (i) {
            case 0:
                return new pv2((q50) this.u, this.t, (e1d) obj2, rq3Var, 0);
            case 1:
                return new pv2((o0h) this.u, this.t, (trg) obj2, rq3Var, 1);
            case 2:
                return new pv2(this.t, (o0h) this.u, (d6d) obj2, rq3Var);
            case 3:
                return new pv2((ksa) this.u, this.t, (xnh) obj2, rq3Var, 3);
            case 4:
                return new pv2((n72) this.u, this.t, (c80) obj2, rq3Var, 4);
            default:
                pv2 pv2Var = new pv2((axj) obj2, rq3Var);
                pv2Var.u = obj;
                return pv2Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((pv2) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0132, code lost:
    
        if (r13.b0((defpackage.d6d) r4, r13) == r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0123, code lost:
    
        if (r13.X(r0, ((defpackage.eoh) r13.c).getValue(), r13) == r1) goto L66;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        float w;
        ku3 ku3Var;
        int i = this.r;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        Object obj2 = this.v;
        int i2 = 1;
        switch (i) {
            case 0:
                e1d e1dVar = (e1d) obj2;
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    if (!((Boolean) e1dVar.getValue()).booleanValue()) {
                        q50 q50Var = (q50) this.u;
                        Float f2 = new Float(this.t);
                        i4k h0 = s02.h0(500, 0, null, 6);
                        this.s = 1;
                        if (q50.a(q50Var, f2, h0, null, this, 12) == lu3Var) {
                            break;
                        }
                    }
                    break;
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                e1dVar.setValue(Boolean.TRUE);
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (((o0h) this.u).X(this.t, (trg) obj2, this) == lu3Var2) {
                        break;
                    }
                } else if (i4 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 2:
                o0h o0hVar = (o0h) this.u;
                float f3 = this.t;
                lu3 lu3Var3 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    if (f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        this.s = 1;
                        break;
                    }
                } else if (i5 == 1) {
                    y6a.M(obj);
                } else if (i5 != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                    break;
                }
                if (f3 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    this.s = 2;
                    break;
                }
            case 3:
                xnh xnhVar = (xnh) obj2;
                float f4 = this.t;
                lu3 lu3Var4 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    if (!((ksa) this.u).j.b() && f4 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        float f5 = fyg.a;
                        float h = xnhVar.h();
                        float f6 = -f4;
                        if (h <= f6 / 2.0f) {
                            f = f6;
                        }
                        if (h != f) {
                            i4k h02 = s02.h0(100, 0, null, 6);
                            float f7 = f;
                            fvg fvgVar = new fvg(xnhVar, 3);
                            this.s = 1;
                            if (d2a.m(h, f7, h02, fvgVar, this, 4) == lu3Var4) {
                                break;
                            }
                        }
                    } else {
                        break;
                    }
                } else if (i6 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (q50.a((q50) ((n72) this.u).c, new Float(this.t), (c80) obj2, null, this, 12) == lu3Var5) {
                        break;
                    }
                } else if (i7 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            default:
                lu3 lu3Var6 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    ku3 ku3Var2 = (ku3) this.u;
                    w = d2a.w(ku3Var2.getCoroutineContext());
                    ku3Var = ku3Var2;
                } else if (i8 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    w = this.t;
                    ku3Var = (ku3) this.u;
                    y6a.M(obj);
                }
                while (s9a.w(ku3Var)) {
                    z6d z6dVar = new z6d((axj) obj2, w, i2);
                    this.u = ku3Var;
                    this.t = w;
                    this.s = 1;
                    if (bea.y(getContext()).p(z6dVar, this) == lu3Var6) {
                        break;
                    }
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pv2(axj axjVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 5;
        this.v = axjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pv2(Object obj, float f, Object obj2, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = obj;
        this.t = f;
        this.v = obj2;
    }
}
