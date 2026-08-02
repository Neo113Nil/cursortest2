package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wo4 {
    public static final wo4 a = new wo4();

    public static long a(float f, int i, long j, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        av8Var.d0(-1687113661);
        p23 p23Var = (p23) av8Var.k(q23.a);
        if (p75.a(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) <= 0 || p23Var.d()) {
            av8Var.d0(-1095489470);
            av8Var.s(false);
        } else {
            av8Var.d0(-1095627978);
            ff5 ff5Var = cj5.a;
            j = hkg.B(r13.c(q23.b(j, av8Var), ((((float) Math.log(f + 1.0f)) * 4.5f) + 2.0f) / 100.0f), j);
            av8Var.s(false);
        }
        av8Var.s(false);
        return j;
    }
}
