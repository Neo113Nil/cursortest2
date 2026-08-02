package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class w95 {
    public static final xf2 a;
    public static final xf2 b;

    static {
        int i = 3;
        rq3 rq3Var = null;
        a = new xf2(i, rq3Var, 1);
        b = new xf2(i, rq3Var, 2);
    }

    public static final long a(long j) {
        boolean isNaN = Float.isNaN(vmk.b(j));
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float b2 = isNaN ? 0.0f : vmk.b(j);
        if (!Float.isNaN(vmk.c(j))) {
            f = vmk.c(j);
        }
        return t6a.i(b2, f);
    }
}
