package defpackage;

import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.Locale;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class d82 implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ d82(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        int i = this.a;
        String str2 = this.b;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((n8g) obj).getClass();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
                    Locale locale = Locale.getDefault();
                    locale.getClass();
                    String upperCase = str2.toUpperCase(locale);
                    upperCase.getClass();
                    yf8 yf8Var = xth.a;
                    udj.c(upperCase, utc.a, 0L, null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, xth.a(), av8Var, 48, 24960, 109564);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((n8g) obj).getClass();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                    xtc c0 = l98.c0(utc.a, 12.0f, 4.0f);
                    l8g a = k8g.a(ww9.b, uxf.l, av8Var2, 0);
                    int hashCode = Long.hashCode(av8Var2.T);
                    aee m = av8Var2.m();
                    xtc C = fqj.C(av8Var2, c0);
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
                    yf8 yf8Var2 = xth.a;
                    udj.c(this.b, null, lz.D(R.color.surface_1, av8Var2), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.b(), av8Var2, 0, 0, 130042);
                    av8Var2.d0(-1830796382);
                    av8Var2.s(false);
                    av8Var2.s(true);
                } else {
                    av8Var2.W();
                }
                break;
            case 2:
                of3 of3Var3 = (of3) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((n8g) obj).getClass();
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 17) != 16)) {
                    Locale locale2 = Locale.getDefault();
                    locale2.getClass();
                    String upperCase2 = str2.toUpperCase(locale2);
                    upperCase2.getClass();
                    yf8 yf8Var3 = xth.a;
                    udj.c(upperCase2, utc.a, 0L, null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.a(), av8Var3, 48, 0, 130044);
                } else {
                    av8Var3.W();
                }
                break;
            case 3:
                of3 of3Var4 = (of3) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((xtc) obj).getClass();
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(intValue4 & 1, (intValue4 & 17) != 16)) {
                    yf8 yf8Var4 = xth.a;
                    udj.c(this.b, null, lz.D(R.color.n_lv_1, av8Var4), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.d(), av8Var4, 0, 0, 131066);
                } else {
                    av8Var4.W();
                }
                break;
            case 4:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                of3 of3Var5 = (of3) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((av8) of3Var5).h(booleanValue) ? 4 : 2;
                }
                av8 av8Var5 = (av8) of3Var5;
                if (av8Var5.T(intValue5 & 1, (intValue5 & 19) != 18)) {
                    yf8 yf8Var5 = xth.a;
                    dfj b = xth.b();
                    if (booleanValue) {
                        str = ljg.k(av8Var5, 58168286, R.string.cast_your_vote, av8Var5, false);
                    } else {
                        av8Var5.d0(58279390);
                        str = oea.v(R.string.prediction_total_votes, av8Var5) + " " + str2;
                        av8Var5.s(false);
                    }
                    udj.c(str, null, lz.D(R.color.n_lv_3, av8Var5), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, b, av8Var5, 0, 0, 131066);
                } else {
                    av8Var5.W();
                }
                break;
            case 5:
                xtc xtcVar = (xtc) obj;
                of3 of3Var6 = (of3) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                xtcVar.getClass();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((av8) of3Var6).g(xtcVar) ? 4 : 2;
                }
                av8 av8Var6 = (av8) of3Var6;
                if (av8Var6.T(intValue6 & 1, (intValue6 & 19) != 18)) {
                    td4.k(this.b, xtcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, av8Var6, (intValue6 << 3) & 112, 12);
                } else {
                    av8Var6.W();
                }
                break;
            case 6:
                ((Integer) obj3).getClass();
                ((xra) obj).getClass();
                nq8.p(str2, null, (of3) obj2, 0);
                break;
            case 7:
                of3 of3Var7 = (of3) obj2;
                ((Integer) obj3).getClass();
                ((o8g) obj).getClass();
                nq8.g(c5n.t(gz8.E(nq8.A(ty8.a), 16.0f), new h1g(R.color.surface_2)).d(new n3e(h5a.T(16.0f), h5a.T(4.0f), h5a.T(16.0f), h5a.T(4.0f))), 1, 1, yqo.H(1531367813, of3Var7, new d82(str2, 8)), of3Var7, 3072, 0);
                break;
            default:
                of3 of3Var8 = (of3) obj2;
                ((Integer) obj3).getClass();
                ((o8g) obj).getClass();
                yf8 yf8Var6 = xth.a;
                o3a.i(this.b, null, l98.j0(xth.c(), Integer.valueOf(R.color.n_lv_1), of3Var8), 0, of3Var8, 0, 10);
                break;
        }
        return Unit.a;
    }
}
