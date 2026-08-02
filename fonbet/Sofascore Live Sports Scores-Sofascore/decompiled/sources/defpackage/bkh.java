package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class bkh {
    public static final g28 a;
    public static final g28 b;
    public static final g28 c;
    public static final ull d;
    public static final ull e;
    public static final ull f;
    public static final ull g;
    public static final ull h;
    public static final ull i;

    static {
        l35 l35Var = l35.b;
        a = new g28(l35Var, 1.0f);
        l35 l35Var2 = l35.a;
        b = new g28(l35Var2, 1.0f);
        l35 l35Var3 = l35.c;
        c = new g28(l35Var3, 1.0f);
        kv1 kv1Var = uxf.p;
        int i2 = 24;
        d = new ull(l35Var, false, new lqj(kv1Var, i2), kv1Var);
        kv1 kv1Var2 = uxf.o;
        e = new ull(l35Var, false, new lqj(kv1Var2, i2), kv1Var2);
        lv1 lv1Var = uxf.m;
        int i3 = 25;
        f = new ull(l35Var2, false, new lqj(lv1Var, i3), lv1Var);
        lv1 lv1Var2 = uxf.l;
        g = new ull(l35Var2, false, new lqj(lv1Var2, i3), lv1Var2);
        mv1 mv1Var = uxf.g;
        int i4 = 26;
        h = new ull(l35Var3, false, new lqj(mv1Var, i4), mv1Var);
        mv1 mv1Var2 = uxf.c;
        i = new ull(l35Var3, false, new lqj(mv1Var2, i4), mv1Var2);
    }

    public static final xtc a(xtc xtcVar, float f2, float f3) {
        return xtcVar.z(new zck(f2, f3));
    }

    public static xtc b(xtc xtcVar, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        return a(xtcVar, f2, f3);
    }

    public static final xtc c(xtc xtcVar, float f2) {
        return xtcVar.z(f2 == 1.0f ? b : new g28(l35.a, f2));
    }

    public static final xtc d(xtc xtcVar, float f2) {
        return xtcVar.z(f2 == 1.0f ? a : new g28(l35.b, f2));
    }

    public static final xtc e(xtc xtcVar, float f2) {
        return xtcVar.z(new zjh(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, true, 5));
    }

    public static final xtc f(xtc xtcVar, float f2, float f3) {
        return xtcVar.z(new zjh(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, true, 5));
    }

    public static xtc g(xtc xtcVar, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        return f(xtcVar, f2, f3);
    }

    public static final xtc h(xtc xtcVar, float f2) {
        return xtcVar.z(new zjh(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, false, 5));
    }

    public static final xtc i(xtc xtcVar, float f2) {
        return xtcVar.z(new zjh(f2, f2, f2, f2, false));
    }

    public static final xtc j(float f2, float f3) {
        return new zjh(f2, f3, f2, f3, false);
    }

    public static xtc k(xtc xtcVar, float f2, float f3, float f4, float f5, int i2) {
        return xtcVar.z(new zjh((i2 & 1) != 0 ? Float.NaN : f2, (i2 & 2) != 0 ? Float.NaN : f3, (i2 & 4) != 0 ? Float.NaN : f4, (i2 & 8) != 0 ? Float.NaN : f5, false));
    }

    public static final xtc l(xtc xtcVar, float f2) {
        return xtcVar.z(new zjh(f2, f2, f2, f2, true));
    }

    public static final xtc m(xtc xtcVar, float f2, float f3) {
        return xtcVar.z(new zjh(f2, f3, f2, f3, true));
    }

    public static final xtc n(xtc xtcVar, float f2, float f3, float f4, float f5) {
        return xtcVar.z(new zjh(f2, f3, f4, f5, true));
    }

    public static xtc o(xtc xtcVar, float f2, float f3, float f4, float f5, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        if ((i2 & 4) != 0) {
            f4 = Float.NaN;
        }
        if ((i2 & 8) != 0) {
            f5 = Float.NaN;
        }
        return n(xtcVar, f2, f3, f4, f5);
    }

    public static final xtc p(xtc xtcVar, float f2) {
        return xtcVar.z(new zjh(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true, 10));
    }

    public static xtc q(xtc xtcVar, float f2, float f3, int i2) {
        return xtcVar.z(new zjh((i2 & 1) != 0 ? Float.NaN : f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (i2 & 2) != 0 ? Float.NaN : f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true, 10));
    }

    public static xtc r(xtc xtcVar, lv1 lv1Var, int i2) {
        lv1 lv1Var2 = uxf.m;
        if ((i2 & 1) != 0) {
            lv1Var = lv1Var2;
        }
        return xtcVar.z(lv1Var.equals(lv1Var2) ? f : lv1Var.equals(uxf.l) ? g : new ull(l35.a, false, new lqj(lv1Var, 25), lv1Var));
    }

    public static xtc s(xtc xtcVar, int i2) {
        mv1 mv1Var = uxf.g;
        return xtcVar.z(mv1Var.equals(mv1Var) ? h : mv1Var.equals(uxf.c) ? i : new ull(l35.c, false, new lqj(mv1Var, 26), mv1Var));
    }

    public static xtc t(xtc xtcVar, int i2) {
        kv1 kv1Var = uxf.p;
        boolean z = (i2 & 2) == 0;
        return xtcVar.z((!kv1Var.equals(kv1Var) || z) ? (!kv1Var.equals(uxf.o) || z) ? new ull(l35.b, z, new lqj(kv1Var, 24), kv1Var) : e : d);
    }
}
