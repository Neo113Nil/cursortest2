package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mf4 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public /* synthetic */ boolean t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ int v;
    public Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf4(sfi sfiVar, boolean z, int i, q50 q50Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 2;
        this.w = sfiVar;
        this.t = z;
        this.v = i;
        this.u = q50Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        int i2 = this.v;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                mf4 mf4Var = new mf4((qf4) obj2, i2, rq3Var, 0);
                mf4Var.t = ((Boolean) obj).booleanValue();
                return mf4Var;
            case 1:
                mf4 mf4Var2 = new mf4((qf4) obj2, i2, rq3Var, 1);
                mf4Var2.t = ((Boolean) obj).booleanValue();
                return mf4Var2;
            default:
                return new mf4((sfi) this.w, this.t, this.v, (q50) obj2, rq3Var);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((mf4) create(bool, (rq3) obj2)).invokeSuspend(Unit.a);
            case 1:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((mf4) create(bool2, (rq3) obj2)).invokeSuspend(Unit.a);
            default:
                return ((mf4) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        if (defpackage.q50.a((defpackage.q50) r9, r3, r2, null, r13, 12) == r10) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
    
        if (r0.g(r13) == r10) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007b, code lost:
    
        if (r0.f(r13, r3) == r10) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bb, code lost:
    
        if (r2 == r0) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dc  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        boolean z;
        Object d;
        Throwable th2;
        boolean z2;
        adi adiVar;
        Object h;
        boolean z3;
        Object e;
        Object d2;
        Object obj2;
        int i = this.r;
        ?? r2 = 3;
        int i2 = this.v;
        Object obj3 = this.u;
        switch (i) {
            case 0:
                qf4 qf4Var = (qf4) obj3;
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                try {
                } catch (Throwable th3) {
                    boolean z4 = r2;
                    th = th3;
                    z = z4;
                    if (z) {
                        h7a c = qf4Var.c();
                        this.w = th;
                        this.t = z;
                        this.s = 2;
                        d = c.d(this);
                        if (d != lu3Var) {
                            th2 = th;
                        }
                    }
                }
                if (i3 == 0) {
                    y6a.M(obj);
                    boolean z5 = this.t;
                    this.t = z5;
                    this.s = 1;
                    h = qf4Var.h(z5, this);
                    r2 = z5;
                    if (h == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = this.t;
                        th2 = (Throwable) this.w;
                        y6a.M(obj);
                        d = obj;
                        i2 = ((Number) d).intValue();
                        th = th2;
                        wnf wnfVar = new wnf(i2, th);
                        z2 = z;
                        adiVar = wnfVar;
                        return new Pair(adiVar, Boolean.valueOf(z2));
                    }
                    boolean z6 = this.t;
                    y6a.M(obj);
                    h = obj;
                    r2 = z6;
                }
                adiVar = (adi) h;
                z2 = r2;
                return new Pair(adiVar, Boolean.valueOf(z2));
            case 1:
                qf4 qf4Var2 = (qf4) obj3;
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    z3 = this.t;
                    this.t = z3;
                    this.s = 1;
                    e = ((lfi) qf4Var2.j.getValue()).e(new ff4(3, (rq3) null), this);
                    break;
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj2 = this.w;
                        y6a.M(obj);
                        d2 = obj;
                        i2 = ((Number) d2).intValue();
                        e = obj2;
                        return new od4(e, e != null ? e.hashCode() : 0, i2);
                    }
                    boolean z7 = this.t;
                    y6a.M(obj);
                    z3 = z7;
                    e = obj;
                }
                if (z3) {
                    h7a c2 = qf4Var2.c();
                    this.w = e;
                    this.s = 2;
                    d2 = c2.d(this);
                    if (d2 != lu3Var2) {
                        obj2 = e;
                        i2 = ((Number) d2).intValue();
                        e = obj2;
                    }
                    return lu3Var2;
                }
                return new od4(e, e != null ? e.hashCode() : 0, i2);
            default:
                q50 q50Var = (q50) obj3;
                lu3 lu3Var3 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    if (((sfi) this.w) != sfi.a) {
                        Float f = new Float(i2);
                        this.s = 3;
                        break;
                    } else if (!this.t) {
                        float f2 = i2;
                        float floatValue = f2 - ((Number) q50Var.d()).floatValue();
                        if (floatValue > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            Float f3 = new Float(f2);
                            i4k h0 = s02.h0((int) floatValue, 0, vsh.a, 2);
                            this.s = 1;
                            break;
                        }
                    } else {
                        this.s = 2;
                        break;
                    }
                } else {
                    if (i5 != 1 && i5 != 2 && i5 != 3) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mf4(qf4 qf4Var, int i, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.u = qf4Var;
        this.v = i;
    }
}
