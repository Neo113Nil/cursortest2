package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class wec {
    public static final float a = agc.b;
    public static final t3e b = new t3e(12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);

    public static cfc a(g23 g23Var) {
        cfc cfcVar = g23Var.d0;
        if (cfcVar != null) {
            return cfcVar;
        }
        cfc cfcVar2 = new cfc(i23.c(g23Var, wcb.g), i23.c(g23Var, wcb.h), i23.c(g23Var, wcb.j), r13.c(i23.c(g23Var, wcb.a), wcb.b), r13.c(i23.c(g23Var, wcb.c), wcb.d), r13.c(i23.c(g23Var, wcb.e), wcb.f));
        g23Var.d0 = cfcVar2;
        return cfcVar2;
    }
}
