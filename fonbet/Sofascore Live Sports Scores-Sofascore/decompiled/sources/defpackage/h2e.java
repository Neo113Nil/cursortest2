package defpackage;

import android.content.Context;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class h2e implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ e1d c;

    public /* synthetic */ h2e(int i, e1d e1dVar, Context context) {
        this.a = i;
        this.b = context;
        this.c = e1dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        e1d e1dVar = this.c;
        Context context = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    x2a.d(oea.v(R.string.awards_won, av8Var), l98.b0(utc.a, 8.0f), s6a.N(R.drawable.ic_pots_trophy, 6, av8Var), lz.D(R.color.rating_90, av8Var), 0L, lz.D(R.color.surface_2, av8Var), null, yqo.H(-1928991729, av8Var, new h2e(i2, e1dVar, context)), uxf.l, 8.0f, null, av8Var, 918552624, 0, 1104);
                } else {
                    av8Var.W();
                }
                break;
            default:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(1 & intValue2, (intValue2 & 3) != 2)) {
                    xtc l = bkh.l(l98.f0(utc.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 16.0f);
                    long D = lz.D(R.color.n_lv_4, av8Var2);
                    Object O = av8Var2.O();
                    a99 a99Var = nf3.a;
                    if (O == a99Var) {
                        O = mz1.e(av8Var2);
                    }
                    wzc wzcVar = (wzc) O;
                    Object[] objArr = new Object[0];
                    Object O2 = av8Var2.O();
                    if (O2 == a99Var) {
                        O2 = jxa.x;
                        av8Var2.n0(O2);
                    }
                    kq9.b(s6a.N(R.drawable.ic_close, 6, av8Var2), null, tol.y(l, true, false, true, D, wzcVar, new gi(21, (boh) o3a.N(objArr, (Function0) O2, av8Var2, 48), context, e1dVar), av8Var2, 0), lz.D(R.color.n_lv_1, av8Var2), av8Var2, 48, 0);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
