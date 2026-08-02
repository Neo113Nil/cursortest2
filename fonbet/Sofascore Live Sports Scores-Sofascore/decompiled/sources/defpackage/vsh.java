package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class vsh {
    public static final h74 a = new h74(0.42f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.58f, 1.0f);

    public static final void a(hth hthVar, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1574860569);
        int i2 = (av8Var.g(hthVar) ? 4 : 2) | i;
        int i3 = 14;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            hda.c(hthVar, bkh.c, yqo.H(-574634586, av8Var, new kr1(hthVar, 5)), av8Var, (i2 & 14) | 432);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new fvg(hthVar, i, i3);
        }
    }
}
