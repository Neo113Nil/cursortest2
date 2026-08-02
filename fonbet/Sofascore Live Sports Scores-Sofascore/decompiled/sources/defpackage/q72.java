package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class q72 {
    public static final t3e a;
    public static final t3e b;
    public static final float c;
    public static final float d;
    public static final float e;

    static {
        float f = qn1.a;
        float f2 = qn1.b;
        hbh hbhVar = a82.a;
        a = new t3e(f, 8.0f, f2, 8.0f);
        if (!(f2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
            p3a.a("Padding must be non-negative");
        }
        b = new t3e(12.0f, 8.0f, 12.0f, 8.0f);
        if (!((8.0f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & (8.0f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))) {
            p3a.a("Padding must be non-negative");
        }
        c = 58.0f;
        d = 40.0f;
        e = a82.b;
    }

    public static p72 a(long j, long j2, long j3, long j4, of3 of3Var, int i) {
        p72 p72Var;
        long j5 = (i & 2) != 0 ? r13.i : j2;
        long j6 = (i & 4) != 0 ? r13.i : j3;
        long j7 = (i & 8) != 0 ? r13.i : j4;
        g23 g23Var = (g23) ((av8) of3Var).k(i23.a);
        p72 p72Var2 = g23Var.W;
        if (p72Var2 == null) {
            p72 p72Var3 = new p72(i23.c(g23Var, i28.a), i23.c(g23Var, i28.g), r13.c(i23.c(g23Var, i28.b), i28.c), r13.c(i23.c(g23Var, i28.d), i28.e));
            g23Var.W = p72Var3;
            p72Var = p72Var3;
        } else {
            p72Var = p72Var2;
        }
        return p72Var.a(j, j5, j6, j7);
    }

    public static v72 b(float f, int i) {
        if ((i & 1) != 0) {
            h23 h23Var = i28.a;
            f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return new v72(f, i28.f);
    }
}
