package defpackage;

import android.content.res.Resources;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class u91 {
    public static final void a(r91 r91Var, Function1 function1, of3 of3Var, int i) {
        String w;
        float f;
        e1d e1dVar;
        utc utcVar;
        a99 a99Var;
        float f2;
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1506151153);
        int i2 = i | (av8Var.i(r91Var) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16);
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            Resources resources = (Resources) av8Var.k(nz.c);
            Object[] objArr = new Object[0];
            boolean i3 = av8Var.i(r91Var);
            Object O = av8Var.O();
            a99 a99Var2 = nf3.a;
            if (i3 || O == a99Var2) {
                O = new z0(r91Var, 29);
                av8Var.n0(O);
            }
            e1d e1dVar2 = (e1d) o3a.N(objArr, (Function0) O, av8Var, 0);
            wj1 wj1Var = (wj1) e1dVar2.getValue();
            boolean e = av8Var.e(wj1Var == null ? -1 : wj1Var.ordinal());
            Object O2 = av8Var.O();
            if (e || O2 == a99Var2) {
                wj1 wj1Var2 = (wj1) e1dVar2.getValue();
                tee teeVar = r91Var.e;
                List list = teeVar != null ? (List) teeVar.get(wj1Var2) : null;
                if (list == null) {
                    list = km5.a;
                }
                O2 = list;
                av8Var.n0(O2);
            }
            List list2 = (List) O2;
            utc utcVar2 = utc.a;
            xtc d0 = l98.d0(n9e.q(bkh.d(l98.c0(utcVar2, 8.0f, 4.0f), 1.0f), lz.D(R.color.surface_1, av8Var), o7g.a(16.0f)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 1);
            u23 a = t23.a(ww9.d, uxf.p, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, d0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            String str = r91Var.b;
            String str2 = r91Var.f;
            if (str == null || StringsKt.R(str)) {
                str = null;
            }
            if (str == null) {
                av8Var.d0(-158759180);
                av8Var.s(false);
                w = null;
            } else {
                av8Var.d0(-158759179);
                if (str.equals(Season.SubSeasonType.REGULAR_SEASON.getLabel())) {
                    av8Var.d0(-1827937927);
                    w = oea.w(R.string.year_regular_season, new Object[]{str2 != null ? str2 : ""}, av8Var);
                    av8Var.s(false);
                } else {
                    av8Var.d0(-1827935019);
                    w = oea.w(R.string.year_postseason, new Object[]{str2 != null ? str2 : ""}, av8Var);
                    av8Var.s(false);
                }
                av8Var.s(false);
            }
            if (w == null) {
                av8Var.d0(-158464369);
                StringBuilder sb = new StringBuilder();
                sb.append(oea.v(R.string.share_card_key_stats, av8Var));
                if (str2 != null) {
                    String str3 = StringsKt.R(str2) ? null : str2;
                    if (str3 != null) {
                        sb.append(" ".concat(str3));
                        Unit unit = Unit.a;
                    }
                }
                w = sb.toString();
                av8Var.s(false);
            } else {
                av8Var.d0(964708783);
                av8Var.s(false);
            }
            yf8 yf8Var = xth.a;
            udj.c(w, l98.f0(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 7), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, new p7j(5), 0L, 0, false, 0, 0, null, xth.j(), av8Var, 48, 0, 130040);
            av8Var = av8Var;
            gv9<wj1> gv9Var = r91Var.c;
            if (gv9Var == null || gv9Var.size() <= 1) {
                f = 16.0f;
                e1dVar = e1dVar2;
                utcVar = utcVar2;
                a99Var = a99Var2;
                f2 = 1.0f;
                av8Var.d0(-157242659);
                av8Var.s(false);
            } else {
                av8Var.d0(-157900944);
                boolean g = av8Var.g(gv9Var);
                Object O3 = av8Var.O();
                a99Var = a99Var2;
                if (g || O3 == a99Var) {
                    ArrayList arrayList = new ArrayList(k13.r(gv9Var, 10));
                    for (wj1 wj1Var3 : gv9Var) {
                        String string = resources.getString(wj1Var3.a);
                        string.getClass();
                        arrayList.add(new s1h(wj1Var3, string, true));
                    }
                    O3 = l6g.W(arrayList);
                    av8Var.n0(O3);
                }
                gv9 gv9Var2 = (gv9) O3;
                Object value = e1dVar2.getValue();
                e1dVar = e1dVar2;
                boolean g2 = av8Var.g(e1dVar);
                Object O4 = av8Var.O();
                if (g2 || O4 == a99Var) {
                    O4 = new w30(4, e1dVar);
                    av8Var.n0(O4);
                }
                utcVar = utcVar2;
                f2 = 1.0f;
                f = 16.0f;
                l4a.a(gv9Var2, value, (Function1) O4, l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 7), null, false, av8Var, 3072, 48);
                av8Var = av8Var;
                av8Var.s(false);
            }
            s02.n(l98.d0(bkh.d(utcVar, f2), f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), ww9.h, new ng0(8.0f, true, new a70(6)), null, 5, 0, yqo.H(-1693234774, av8Var, new kr1(list2, 12)), av8Var, 1597878, 40);
            xtc f0 = l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 20.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 5);
            String v = oea.v(R.string.see_all, av8Var);
            yf8 yf8Var2 = xth.a;
            dfj l = xth.l();
            bqh bqhVar = new bqh(s6a.N(R.drawable.ic_chevron_right_large_16, 6, av8Var), uxf.q);
            boolean g3 = ((i2 & 112) == 32) | av8Var.g(e1dVar);
            Object O5 = av8Var.O();
            if (g3 || O5 == a99Var) {
                O5 = new s91(function1, e1dVar, 0);
                av8Var.n0(O5);
            }
            r4a.c(v, f0, l, 0L, bqhVar, (Function0) O5, av8Var, 48);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new vn6(r91Var, function1, i, 9);
        }
    }

    public static final void b(bm1 bm1Var, of3 of3Var, int i) {
        int i2;
        boolean z;
        long f;
        r13 e;
        long j;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1380643733);
        int i3 = i | (av8Var.g(bm1Var) ? 4 : 2);
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            Object O = av8Var.O();
            if (O == nf3.a) {
                O = new rph();
                av8Var.n0(O);
            }
            rph rphVar = (rph) O;
            utc utcVar = utc.a;
            xtc l = bkh.l(utcVar, 56.0f);
            kv1 kv1Var = uxf.p;
            u23 a = t23.a(ww9.d, kv1Var, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, l);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            int i4 = bm1Var.a;
            Integer num = bm1Var.d;
            String str = bm1Var.c;
            String v = oea.v(i4, av8Var);
            yf8 yf8Var = xth.a;
            q5a.w(v, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, 0L, null, 0L, 0, false, 0, 0, xth.c(), av8Var, 0, 0, 131066);
            xtc e2 = bkh.e(vxd.f(utcVar, 4.0f, av8Var, utcVar, 1.0f), 40.0f);
            Float f2 = bm1Var.f;
            if (f2 == null || str == null) {
                f2 = null;
            }
            if (f2 == null) {
                av8Var.d0(1597583674);
                av8Var.s(false);
                z = false;
                e = null;
            } else {
                av8Var.d0(1597583675);
                float floatValue = f2.floatValue();
                if (0.6666667f > floatValue || floatValue > 1.0f) {
                    z = false;
                    f = (0.33333334f > floatValue || floatValue > 0.6666667f) ? ljg.f(av8Var, -1848383794, R.color.sentiment_positive_highlight, av8Var, false) : ljg.f(av8Var, -1848385427, R.color.sentiment_neutral_highlight, av8Var, false);
                } else {
                    z = false;
                    f = ljg.f(av8Var, -1848387506, R.color.sentiment_negative_highlight, av8Var, false);
                }
                e = vxd.e(av8Var, z, f);
            }
            if (e == null) {
                j = ljg.f(av8Var, 1991204502, R.color.n_lv_5, av8Var, z);
            } else {
                av8Var.d0(1991196101);
                av8Var.s(z);
                j = e.a;
            }
            xtc b0 = l98.b0(n9e.q(n9e.q(e2, j, oyn.e), lz.D(R.color.n_lv_4, av8Var), rphVar), 2.0f);
            u23 a2 = t23.a(ww9.f, kv1Var, av8Var, 54);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, b0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            Regex regex = yid.a;
            q5a.w(str == null ? "-" : str, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, 0L, null, 0L, 0, false, 1, 0, xth.j(), av8Var, 0, 24576, 114682);
            av8Var = av8Var;
            if (((num == null || str == null) ? null : num) == null) {
                av8Var.d0(1843495885);
                i2 = 0;
                av8Var.s(false);
            } else {
                av8Var.d0(1843495886);
                q5a.w("#" + num, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, 0L, null, 0L, 0, false, 0, 0, xth.g(), av8Var, 0, 0, 131066);
                av8Var = av8Var;
                i2 = 0;
                av8Var.s(false);
            }
            av8Var.s(true);
            av8Var.s(true);
        } else {
            i2 = 0;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new t91(bm1Var, i, i2);
        }
    }
}
