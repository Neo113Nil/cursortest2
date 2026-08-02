package defpackage;

import com.sofascore.results.R;
import com.sofascore.results.dialog.InfoBottomSheet;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class o2a implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c51 b;
    public final /* synthetic */ InfoBottomSheet c;

    public /* synthetic */ o2a(c51 c51Var, InfoBottomSheet infoBottomSheet, int i) {
        this.a = i;
        this.b = c51Var;
        this.c = infoBottomSheet;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        float f;
        int i = this.a;
        InfoBottomSheet infoBottomSheet = this.c;
        c51 c51Var = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    haa.f(yqo.H(1335050975, av8Var, new o2a(c51Var, infoBottomSheet, i2)), av8Var, 6);
                } else {
                    av8Var.W();
                }
                break;
            default:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    qug o0 = hkg.o0(av8Var2);
                    Integer valueOf = Integer.valueOf(o0.a.h());
                    boolean g = av8Var2.g(c51Var) | av8Var2.g(o0);
                    Object O = av8Var2.O();
                    rq3 rq3Var = null;
                    if (g || O == nf3.a) {
                        O = new iv6(c51Var, o0, rq3Var, 5);
                        av8Var2.n0(O);
                    }
                    hz8.o(av8Var2, valueOf, (Function2) O);
                    j9d L = jaa.L(av8Var2);
                    utc utcVar = utc.a;
                    xtc f0 = l98.f0(l98.d0(hkg.u0(lz.J(utcVar, L, null), o0, false, 14), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48.0f, 5);
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
                    CharSequence charSequence = (CharSequence) infoBottomSheet.C.getValue();
                    if (charSequence == null) {
                        av8Var2.d0(-793593148);
                        av8Var2.s(false);
                        f = 16.0f;
                    } else {
                        av8Var2.d0(-793593147);
                        q80 Q = hda.Q(charSequence, (kx4) av8Var2.k(dh3.h));
                        yf8 yf8Var = xth.a;
                        f = 16.0f;
                        udj.d(Q, null, lz.D(R.color.n_lv_1, av8Var2), null, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, xth.f(), av8Var2, 0, 0, 262138);
                        av8Var2.s(false);
                    }
                    CharSequence charSequence2 = (CharSequence) infoBottomSheet.D.getValue();
                    if (charSequence2 == null) {
                        av8Var2.d0(-793264610);
                        av8Var2.s(false);
                    } else {
                        av8Var2.d0(-793264609);
                        q80 Q2 = hda.Q(charSequence2, (kx4) av8Var2.k(dh3.h));
                        yf8 yf8Var2 = xth.a;
                        udj.d(Q2, l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), lz.D(R.color.n_lv_1, av8Var2), null, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, xth.f(), av8Var2, 48, 0, 262136);
                        av8Var2.s(false);
                    }
                    av8Var2.s(true);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
