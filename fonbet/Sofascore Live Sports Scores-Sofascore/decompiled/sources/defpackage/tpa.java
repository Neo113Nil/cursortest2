package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class tpa {
    public static final fpa a;

    static {
        spa spaVar = new spa(0);
        km5 km5Var = km5.a;
        ewd ewdVar = ewd.a;
        a = new fpa(null, 0, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, spaVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, s9a.c(g.a), yqo.c(), 0, new yo9(26), new yo9(27), km5Var, 0, 0, 0, ewdVar, 0, 0);
    }

    public static final qpa a(int i, int i2, of3 of3Var) {
        int i3 = 0;
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Object[] objArr = new Object[0];
        y3g y3gVar = qpa.w;
        boolean e = ((av8) of3Var).e(i) | ((av8) of3Var).e(0);
        av8 av8Var = (av8) of3Var;
        Object O = av8Var.O();
        if (e || O == nf3.a) {
            O = new rpa(i, i3);
            av8Var.n0(O);
        }
        return (qpa) o3a.M(objArr, y3gVar, (Function0) O, av8Var, 0);
    }
}
