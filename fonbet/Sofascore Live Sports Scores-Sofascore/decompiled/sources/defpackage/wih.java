package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class wih {
    public static final g0i a = s02.e0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 7);

    public static final cdi a(long j, j38 j38Var, String str, of3 of3Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            j38Var = a;
        }
        j38 j38Var2 = j38Var;
        if ((i2 & 4) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        av8 av8Var = (av8) of3Var;
        boolean g = av8Var.g(r13.f(j));
        Object O = av8Var.O();
        if (g || O == nf3.a) {
            q4k q4kVar = new q4k(ry.H, new oo(r13.f(j), 9));
            av8Var.n0(q4kVar);
            O = q4kVar;
        }
        return a60.c(new r13(j), (q4k) O, j38Var2, null, str2, null, av8Var, ((i << 3) & 896) | ((i << 6) & 57344), 8);
    }
}
