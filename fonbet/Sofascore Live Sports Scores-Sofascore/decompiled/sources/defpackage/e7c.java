package defpackage;

import com.sofascore.results.R;
import com.sofascore.results.feed.MediaPostFeedbackBottomSheet;
import com.unity3d.services.UnityAdsConstants;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KFunction;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class e7c implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaPostFeedbackBottomSheet b;
    public final /* synthetic */ gv9 c;

    public /* synthetic */ e7c(MediaPostFeedbackBottomSheet mediaPostFeedbackBottomSheet, gv9 gv9Var, int i) {
        this.a = i;
        this.b = mediaPostFeedbackBottomSheet;
        this.c = gv9Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        MediaPostFeedbackBottomSheet mediaPostFeedbackBottomSheet = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    haa.f(yqo.H(-1923862651, av8Var, new e7c(mediaPostFeedbackBottomSheet, this.c, i2)), av8Var, 6);
                } else {
                    av8Var.W();
                }
                break;
            default:
                otk otkVar = mediaPostFeedbackBottomSheet.C;
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    utc utcVar = utc.a;
                    xtc f0 = l98.f0(hkg.u0(bkh.d(utcVar, 1.0f), hkg.o0(av8Var2), false, 14), 16.0f, 8.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8);
                    u23 a = t23.a(ww9.d, uxf.o, av8Var2, 0);
                    int hashCode = Long.hashCode(av8Var2.T);
                    aee m = av8Var2.m();
                    xtc C = fqj.C(av8Var2, f0);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, a, hf3.g);
                    waa.K(av8Var2, m, hf3.f);
                    waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var2, hf3.k);
                    waa.K(av8Var2, C, hf3.d);
                    String v = oea.v(R.string.feed_not_interested_description, av8Var2);
                    long D = lz.D(R.color.n_lv_1, av8Var2);
                    yf8 yf8Var = xth.a;
                    udj.c(v, null, D, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var2, 0, 0, 131066);
                    e1d x = rfo.x(((my7) otkVar.getValue()).h, av8Var2, 0);
                    xtc f02 = l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                    gv9 W = l6g.W((Set) x.getValue());
                    my7 my7Var = (my7) otkVar.getValue();
                    boolean i3 = av8Var2.i(my7Var);
                    Object O = av8Var2.O();
                    a99 a99Var = nf3.a;
                    if (i3 || O == a99Var) {
                        v9b v9bVar = new v9b(1, my7Var, my7.class, "onFeedbackChipSelected", "onFeedbackChipSelected(Lcom/sofascore/results/feed/compose/model/FeedbackType;)V", 0, 12);
                        av8Var2.n0(v9bVar);
                        O = v9bVar;
                    }
                    rha.e(this.c, W, (Function1) ((KFunction) O), f02, false, hrh.m, av8Var2, 199680);
                    xtc f03 = l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 5);
                    String v2 = oea.v(R.string.submit, av8Var2);
                    boolean z = !((Set) x.getValue()).isEmpty();
                    boolean i4 = av8Var2.i(mediaPostFeedbackBottomSheet);
                    Object O2 = av8Var2.O();
                    if (i4 || O2 == a99Var) {
                        O2 = new f7c(mediaPostFeedbackBottomSheet, i2);
                        av8Var2.n0(O2);
                    }
                    qx9.l(48, av8Var2, f03, v2, (Function0) O2, z);
                    av8Var2.s(true);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
