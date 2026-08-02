package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class msa {
    public static final csa a = new csa(null, 0, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new spa(1), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, s9a.c(g.a), yqo.c(), cn3.b(0, 0, 0, 0, 15), km5.a, 0, 0, 0, ewd.a, 0, 0);

    public static final ksa a(final int i, final int i2, of3 of3Var, int i3, int i4) {
        if ((i4 & 1) != 0) {
            i = 0;
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        Object[] objArr = new Object[0];
        y3g y3gVar = ksa.y;
        boolean e = ((((i3 & 14) ^ 6) > 4 && ((av8) of3Var).e(i)) || (i3 & 6) == 4) | ((av8) of3Var).e(i2);
        av8 av8Var = (av8) of3Var;
        Object O = av8Var.O();
        if (e || O == nf3.a) {
            O = new Function0() { // from class: lsa
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return new ksa(i, i2);
                }
            };
            av8Var.n0(O);
        }
        return (ksa) o3a.M(objArr, y3gVar, (Function0) O, av8Var, 0);
    }
}
