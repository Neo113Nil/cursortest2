package defpackage;

import androidx.compose.runtime.e;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class whf extends bw4 implements e9d {
    public boolean q;
    public Function0 r;
    public xhf t;
    public float u;
    public boolean s = true;
    public final m9d v = new m9d(this, null);
    public final xnh w = e.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    public final xnh x = e.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);

    public whf(boolean z, Function0 function0, xhf xhfVar, float f) {
        this.q = z;
        this.r = function0;
        this.t = xhfVar;
        this.u = f;
    }

    @Override // defpackage.e9d
    public final long P(int i, long j) {
        if (!this.t.a.e() && this.s && i == 1 && Float.intBitsToFloat((int) (4294967295L & j)) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return p1(j);
        }
        return 0L;
    }

    @Override // defpackage.wtc
    public final boolean Z0() {
        return false;
    }

    @Override // defpackage.e9d
    public final long b0(int i, long j, long j2) {
        if (this.t.a.e() || !this.s) {
            return 0L;
        }
        int i2 = 1;
        if (i != 1) {
            return 0L;
        }
        long p1 = p1(j2);
        xw3.L(Y0(), null, null, new thf(this, null, i2), 3);
        return p1;
    }

    @Override // defpackage.wtc
    public final void c1() {
        k1(this.v);
        xw3.L(Y0(), null, null, new thf(this, null, 0), 3);
        t1(this.q ? q1() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n1(sq3 sq3Var) {
        rhf rhfVar;
        int i;
        try {
            if (sq3Var instanceof rhf) {
                rhfVar = (rhf) sq3Var;
                int i2 = rhfVar.t;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    rhfVar.t = i2 - Integer.MIN_VALUE;
                    rhf rhfVar2 = rhfVar;
                    Object obj = rhfVar2.r;
                    Object obj2 = lu3.a;
                    i = rhfVar2.t;
                    if (i != 0) {
                        y6a.M(obj);
                        xhf xhfVar = this.t;
                        rhfVar2.t = 1;
                        Object a = q50.a(xhfVar.a, new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), null, null, rhfVar2, 14);
                        if (a != obj2) {
                            a = Unit.a;
                        }
                        if (a == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                    }
                    s1(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    t1(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    return Unit.a;
                }
            }
            if (i != 0) {
            }
            s1(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            t1(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            return Unit.a;
        } catch (Throwable th) {
            s1(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            t1(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            throw th;
        }
        rhfVar = new rhf(this, sq3Var);
        rhf rhfVar22 = rhfVar;
        Object obj3 = rhfVar22.r;
        Object obj22 = lu3.a;
        i = rhfVar22.t;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o1(sq3 sq3Var) {
        shf shfVar;
        int i;
        try {
            if (sq3Var instanceof shf) {
                shfVar = (shf) sq3Var;
                int i2 = shfVar.t;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    shfVar.t = i2 - Integer.MIN_VALUE;
                    shf shfVar2 = shfVar;
                    Object obj = shfVar2.r;
                    Object obj2 = lu3.a;
                    i = shfVar2.t;
                    if (i != 0) {
                        y6a.M(obj);
                        xhf xhfVar = this.t;
                        shfVar2.t = 1;
                        Object a = q50.a(xhfVar.a, new Float(1.0f), null, null, shfVar2, 14);
                        if (a != obj2) {
                            a = Unit.a;
                        }
                        if (a == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                    }
                    if (this.n) {
                        s1(q1());
                        t1(q1());
                    }
                    return Unit.a;
                }
            }
            if (i != 0) {
            }
            if (this.n) {
            }
            return Unit.a;
        } finally {
        }
        shfVar = new shf(this, sq3Var);
        shf shfVar22 = shfVar;
        Object obj3 = shfVar22.r;
        Object obj22 = lu3.a;
        i = shfVar22.t;
    }

    public final long p1(long j) {
        float h;
        float q1;
        if (this.q) {
            h = 0.0f;
        } else {
            xnh xnhVar = this.x;
            float intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L)) + xnhVar.h();
            if (intBitsToFloat < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                intBitsToFloat = 0.0f;
            }
            h = intBitsToFloat - xnhVar.h();
            s1(intBitsToFloat);
            if (xnhVar.h() * 0.5f <= q1()) {
                q1 = xnhVar.h() * 0.5f;
            } else {
                float b = llf.b(Math.abs((xnhVar.h() * 0.5f) / q1()) - 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2.0f);
                q1 = q1() + (q1() * (b - (((float) Math.pow(b, 2.0d)) / 4.0f)));
            }
            t1(q1);
        }
        return (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(h) & 4294967295L);
    }

    public final int q1() {
        return c6o.c0(this).y.e0(this.u);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r1(float f, sq3 sq3Var) {
        vhf vhfVar;
        int i;
        if (sq3Var instanceof vhf) {
            vhfVar = (vhf) sq3Var;
            int i2 = vhfVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vhfVar.u = i2 - Integer.MIN_VALUE;
                Object obj = vhfVar.s;
                Object obj2 = lu3.a;
                i = vhfVar.u;
                if (i != 0) {
                    y6a.M(obj);
                    if (this.q) {
                        return new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                    xnh xnhVar = this.x;
                    if (xnhVar.h() * 0.5f > q1()) {
                        this.r.invoke();
                    }
                    if (xnhVar.h() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f = 0.0f;
                    }
                    vhfVar.r = f;
                    vhfVar.u = 1;
                    if (n1(vhfVar) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f = vhfVar.r;
                    y6a.M(obj);
                }
                s1(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return new Float(f);
            }
        }
        vhfVar = new vhf(this, sq3Var);
        Object obj3 = vhfVar.s;
        Object obj22 = lu3.a;
        i = vhfVar.u;
        if (i != 0) {
        }
        s1(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        return new Float(f);
    }

    public final void s1(float f) {
        this.x.i(f);
    }

    public final void t1(float f) {
        this.w.i(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.e9d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x0(long j, rq3 rq3Var) {
        uhf uhfVar;
        int i;
        if (rq3Var instanceof uhf) {
            uhfVar = (uhf) rq3Var;
            int i2 = uhfVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uhfVar.t = i2 - Integer.MIN_VALUE;
                Object obj = uhfVar.r;
                Object obj2 = lu3.a;
                i = uhfVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    float c = vmk.c(j);
                    uhfVar.t = 1;
                    obj = r1(c, uhfVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return new vmk(t6a.i(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((Number) obj).floatValue()));
            }
        }
        uhfVar = new uhf(this, (sq3) rq3Var);
        Object obj3 = uhfVar.r;
        Object obj22 = lu3.a;
        i = uhfVar.t;
        if (i != 0) {
        }
        return new vmk(t6a.i(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((Number) obj3).floatValue()));
    }
}
