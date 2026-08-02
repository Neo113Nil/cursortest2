package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class d7e {
    public gtj a;
    public boolean b;
    public ay1 c;
    public float d = 1.0f;
    public ema e = ema.a;

    public static /* synthetic */ void h(d7e d7eVar, ha5 ha5Var, long j, float f, ay1 ay1Var, int i) {
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 4) != 0) {
            ay1Var = null;
        }
        d7eVar.g(ha5Var, j, f2, ay1Var);
    }

    public boolean c(float f) {
        return false;
    }

    public boolean e(ay1 ay1Var) {
        return false;
    }

    public final void g(ha5 ha5Var, long j, float f, ay1 ay1Var) {
        if (this.d != f) {
            if (!c(f)) {
                gtj gtjVar = this.a;
                if (f == 1.0f) {
                    if (gtjVar != null) {
                        gtjVar.t(f);
                    }
                    this.b = false;
                } else {
                    if (gtjVar == null) {
                        gtjVar = yqo.n();
                        this.a = gtjVar;
                    }
                    gtjVar.t(f);
                    this.b = true;
                }
            }
            this.d = f;
        }
        if (!Intrinsics.c(this.c, ay1Var)) {
            if (!e(ay1Var)) {
                gtj gtjVar2 = this.a;
                if (ay1Var == null) {
                    if (gtjVar2 != null) {
                        gtjVar2.w(null);
                    }
                    this.b = false;
                } else {
                    if (gtjVar2 == null) {
                        gtjVar2 = yqo.n();
                        this.a = gtjVar2;
                    }
                    gtjVar2.w(ay1Var);
                    this.b = true;
                }
            }
            this.c = ay1Var;
        }
        ema layoutDirection = ha5Var.getLayoutDirection();
        if (this.e != layoutDirection) {
            f(layoutDirection);
            this.e = layoutDirection;
        }
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat((int) (ha5Var.n() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L)) - Float.intBitsToFloat(i2);
        ((hpo) ha5Var.L0().a).y(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intBitsToFloat, intBitsToFloat2);
        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            try {
                if (Float.intBitsToFloat(i) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && Float.intBitsToFloat(i2) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    if (this.b) {
                        float intBitsToFloat3 = Float.intBitsToFloat(i);
                        float intBitsToFloat4 = Float.intBitsToFloat(i2);
                        oqf r = jca.r(0L, (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat3) << 32));
                        uj2 t = ha5Var.L0().t();
                        gtj gtjVar3 = this.a;
                        if (gtjVar3 == null) {
                            gtjVar3 = yqo.n();
                            this.a = gtjVar3;
                        }
                        try {
                            t.k(r, gtjVar3);
                            j(ha5Var);
                            t.h();
                        } catch (Throwable th) {
                            t.h();
                            throw th;
                        }
                    } else {
                        j(ha5Var);
                    }
                }
            } catch (Throwable th2) {
                ((hpo) ha5Var.L0().a).y(-0.0f, -0.0f, -intBitsToFloat, -intBitsToFloat2);
                throw th2;
            }
        }
        ((hpo) ha5Var.L0().a).y(-0.0f, -0.0f, -intBitsToFloat, -intBitsToFloat2);
    }

    public abstract long i();

    public abstract void j(ha5 ha5Var);

    public void f(ema emaVar) {
    }
}
