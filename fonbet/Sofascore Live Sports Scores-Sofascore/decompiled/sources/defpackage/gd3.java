package defpackage;

import android.content.Context;
import androidx.compose.runtime.e;
import com.ironsource.V2;
import com.sofascore.model.Country;
import com.sofascore.model.Sports;
import com.sofascore.model.firebase.AdType;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.ui.components.FantasyLeaderboardStatistic;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class gd3 implements ct8 {
    public final /* synthetic */ int a;

    public /* synthetic */ gd3(int i) {
        this.a = i;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        utc utcVar = utc.a;
        switch (i) {
            case 0:
                s22 s22Var = (s22) obj;
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                s22Var.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((av8) of3Var).g(s22Var) ? 4 : 2;
                }
                av8 av8Var = (av8) of3Var;
                if (!av8Var.T(intValue & 1, (intValue & 19) != 18)) {
                    av8Var.W();
                } else if (p75.a(s22Var.b(), 304.0f) >= 0) {
                    av8Var.d0(1946347920);
                    float b = (s22Var.b() * 0.7f) + 64.0f;
                    b7 K = l6g.K(FantasyLeaderboardStatistic.RoundPoints, FantasyLeaderboardStatistic.Points);
                    wkn.l(s6a.N(R.drawable.phone_frame, 6, av8Var), bkh.c, uxf.g, mp3.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 28080, 96);
                    utc utcVar2 = utc.a;
                    xtc m = tol.m(bkh.d(utcVar2, 1.0f));
                    u23 a = t23.a(new ng0(4.0f, true, new a70(6)), uxf.p, av8Var, 54);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m2 = av8Var.m();
                    xtc C = fqj.C(av8Var, m);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, a, hf3.g);
                    waa.K(av8Var, m2, hf3.f);
                    waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var, hf3.k);
                    waa.K(av8Var, C, hf3.d);
                    Object O = av8Var.O();
                    if (O == nf3.a) {
                        O = new t63(2);
                        av8Var.n0(O);
                    }
                    xtc E = d2a.E(bkh.p(l98.f0(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 7), b), 4.0f, o7g.a(16.0f), false, 0L, 28);
                    long D = lz.D(R.color.surface_P, av8Var);
                    jf9 jf9Var = oyn.e;
                    rfo.e(K, (Function0) O, tol.m(n9e.q(E, D, jf9Var)), av8Var, 54);
                    eo7 eo7Var = eo7.r;
                    yso.g(eo7.a(eo7Var, 1, 1, 356, "Michael", "The Quiet Storm"), K, false, false, n9e.q(d2a.E(bkh.p(utcVar2, b), 4.0f, o7g.a(16.0f), false, 0L, 28), lz.D(R.color.surface_P, av8Var), jf9Var), 0L, 0L, null, false, true, true, av8Var, 817892784, 6, 352);
                    yso.g(eo7.a(eo7Var, 2, 4, 234, "Mateus", "Joga Bonito FC"), K, false, false, n9e.q(d2a.E(l98.d0(bkh.p(utcVar2, b), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 4.0f, o7g.a(16.0f), false, 0L, 28), lz.D(R.color.surface_P, av8Var), jf9Var), 0L, 0L, null, false, false, true, av8Var, 12586416, 6, 864);
                    yso.g(eo7.a(eo7Var, 3, 2, 177, "Pablo", "Barrio Control"), K, false, false, n9e.q(d2a.E(l98.d0(bkh.p(utcVar2, b), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 4.0f, o7g.a(16.0f), false, 0L, 28), lz.D(R.color.surface_P, av8Var), jf9Var), 0L, 0L, null, false, false, true, av8Var, 12586416, 6, 864);
                    av8Var.s(true);
                    av8Var.s(false);
                } else {
                    av8Var.d0(1950538841);
                    av8Var.s(false);
                }
                break;
            case 1:
                ((Integer) obj3).getClass();
                ((r70) obj).getClass();
                s6a.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 62, 0L, 0L, (of3) obj2, bkh.c);
                break;
            case 2:
                ((Integer) obj3).getClass();
                ((r70) obj).getClass();
                s6a.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 62, 0L, 0L, (of3) obj2, bkh.c);
                break;
            case 3:
                ((Integer) obj3).getClass();
                ((r70) obj).getClass();
                s6a.g(6, 0, (of3) obj2, bkh.c);
                break;
            case 4:
                of3 of3Var2 = (of3) obj2;
                ((Integer) obj3).getClass();
                ((r70) obj).getClass();
                e12.a(0, of3Var2, n9e.q(bkh.c, lz.D(R.color.graphics_dark, of3Var2), oyn.e));
                break;
            case 5:
                m1c m1cVar = (m1c) obj;
                int e0 = m1cVar.e0(10.0f);
                int i2 = e0 * 2;
                qhe J = ((g1c) obj2).J(cn3.i(i2, 0, ((an3) obj3).a));
                break;
            case 6:
                m1c m1cVar2 = (m1c) obj;
                int e02 = m1cVar2.e0(10.0f);
                int i3 = e02 * 2;
                qhe J2 = ((g1c) obj2).J(cn3.i(0, i3, ((an3) obj3).a));
                break;
            case 7:
                xtc xtcVar = (xtc) obj;
                ((Integer) obj3).getClass();
                xtcVar.getClass();
                av8 av8Var2 = (av8) ((of3) obj2);
                av8Var2.d0(115864864);
                wd8 wd8Var = (wd8) av8Var2.k(dh3.i);
                Object O2 = av8Var2.O();
                Object obj4 = nf3.a;
                if (O2 == obj4) {
                    O2 = mz1.e(av8Var2);
                }
                wzc wzcVar = (wzc) O2;
                boolean i4 = av8Var2.i(wd8Var);
                Object O3 = av8Var2.O();
                if (i4 || O3 == obj4) {
                    O3 = new kw2(wd8Var, 0);
                    av8Var2.n0(O3);
                }
                xtc u = oyn.u(xtcVar, wzcVar, null, false, null, null, (Function0) O3, 28);
                av8Var2.s(false);
                break;
            case 8:
                gq3 gq3Var = (gq3) obj;
                of3 of3Var3 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((av8) of3Var3).g(gq3Var) ? 4 : 2;
                }
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue2 & 1, (intValue2 & 19) != 18)) {
                    e12.a(0, av8Var3, n9e.q(bkh.e(bkh.d(l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, jq3.g, 1), 1.0f), jq3.f), gq3Var.c, oyn.e));
                } else {
                    av8Var3.W();
                }
                break;
            case 9:
                of3 of3Var4 = (of3) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((m12) obj).getClass();
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(intValue3 & 1, (intValue3 & 17) != 16)) {
                    j72.d(l6g.K(new fs3(R.drawable.ic_contribution_match_start, new q9k(R.string.start_times), ""), new fs3(R.drawable.ic_contribution_score, new q9k(R.string.number_of_scores), ""), new fs3(R.drawable.ic_contribution_scorer, new q9k(R.string.number_of_scorers), ""), new fs3(R.drawable.ic_contribution_assistant, new q9k(R.string.number_of_score_assistants), "")), null, av8Var4, 0);
                } else {
                    av8Var4.W();
                }
                break;
            case 10:
                of3 of3Var5 = (of3) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((m12) obj).getClass();
                av8 av8Var5 = (av8) of3Var5;
                if (av8Var5.T(intValue4 & 1, (intValue4 & 17) != 16)) {
                    xw3.c(null, null, null, av8Var5, 54, 4);
                } else {
                    av8Var5.W();
                }
                break;
            case 11:
                of3 of3Var6 = (of3) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var6 = (av8) of3Var6;
                if (av8Var6.T(intValue5 & 1, (intValue5 & 17) != 16)) {
                    utc utcVar3 = utc.a;
                    xtc d0 = l98.d0(n9e.q(bkh.d(utcVar3, 1.0f), lz.D(R.color.surface_1, av8Var6), o7g.c(16.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12)), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                    u23 a2 = t23.a(new ng0(8.0f, true, new a70(6)), uxf.o, av8Var6, 6);
                    int hashCode2 = Long.hashCode(av8Var6.T);
                    aee m3 = av8Var6.m();
                    xtc C2 = fqj.C(av8Var6, d0);
                    if3.k7.getClass();
                    zg3 zg3Var2 = hf3.b;
                    av8Var6.h0();
                    if (av8Var6.S) {
                        av8Var6.l(zg3Var2);
                    } else {
                        av8Var6.q0();
                    }
                    waa.K(av8Var6, a2, hf3.g);
                    waa.K(av8Var6, m3, hf3.f);
                    waa.K(av8Var6, Integer.valueOf(hashCode2), hf3.j);
                    waa.J(av8Var6, hf3.k);
                    waa.K(av8Var6, C2, hf3.d);
                    xtc d = bkh.d(l98.f0(utcVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 1.0f);
                    String v = oea.v(R.string.contributions_log, av8Var6);
                    yf8 yf8Var = xth.a;
                    udj.c(v, d, lz.D(R.color.n_lv_1, av8Var6), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.j(), av8Var6, 48, 0, 130040);
                    udj.c(oea.v(R.string.recent, av8Var6), l98.d0(utcVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, 1), lz.D(R.color.n_lv_1, av8Var6), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var6, 48, 0, 131064);
                    av8Var6.s(true);
                } else {
                    av8Var6.W();
                }
                break;
            case 12:
                xpa xpaVar = (xpa) obj;
                of3 of3Var7 = (of3) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                xpaVar.getClass();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((av8) of3Var7).g(xpaVar) ? 4 : 2;
                }
                av8 av8Var7 = (av8) of3Var7;
                if (av8Var7.T(intValue6 & 1, (intValue6 & 19) != 18)) {
                    e12.a(0, av8Var7, n9e.q(bkh.d(bkh.e(xpa.a(xpaVar, utcVar, 7), 16.0f), 1.0f), lz.D(R.color.surface_1, av8Var7), o7g.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 16.0f, 3)));
                } else {
                    av8Var7.W();
                }
                break;
            case 13:
                of3 of3Var8 = (of3) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var8 = (av8) of3Var8;
                if (av8Var8.T(intValue7 & 1, (intValue7 & 17) != 16)) {
                    nq8.h(av8Var8, bkh.e(utcVar, 8.0f));
                } else {
                    av8Var8.W();
                }
                break;
            case 14:
                of3 of3Var9 = (of3) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var9 = (av8) of3Var9;
                if (av8Var9.T(intValue8 & 1, (intValue8 & 17) != 16)) {
                    nq8.h(av8Var9, bkh.e(utcVar, 16.0f));
                } else {
                    av8Var9.W();
                }
                break;
            case 15:
                of3 of3Var10 = (of3) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var10 = (av8) of3Var10;
                if (av8Var10.T(intValue9 & 1, (intValue9 & 17) != 16)) {
                    String g = bf3.g(8.0f, R.string.crowdsourcing_suggestion_check_status, av8Var10, av8Var10, utcVar);
                    yf8 yf8Var2 = xth.a;
                    udj.c(g, l98.c0(yso.o(utcVar, 1.0f, lz.D(R.color.n_lv_4, av8Var10), o7g.a(8.0f)), 16.0f, 8.0f), lz.D(R.color.n_lv_2, av8Var10), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var10, 0, 0, 131064);
                } else {
                    av8Var10.W();
                }
                break;
            case 16:
                of3 of3Var11 = (of3) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var11 = (av8) of3Var11;
                if (av8Var11.T(intValue10 & 1, (intValue10 & 17) != 16)) {
                    nq8.h(av8Var11, bkh.e(utcVar, 28.0f));
                } else {
                    av8Var11.W();
                }
                break;
            case 17:
                String str = (String) obj;
                of3 of3Var12 = (of3) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                str.getClass();
                if ((intValue11 & 6) == 0) {
                    intValue11 |= ((av8) of3Var12).g(str) ? 4 : 2;
                }
                av8 av8Var12 = (av8) of3Var12;
                if (av8Var12.T(intValue11 & 1, (intValue11 & 19) != 18)) {
                    kq9.b(s6a.N(StringsKt.J(str, "api.sofascore", false) ? R.drawable.ic_home : StringsKt.J(str, "master.dev", false) ? R.drawable.ic_menu_list_settings : R.drawable.ic_sofascore_2, 6, av8Var12), null, bkh.l(utcVar, 20.0f), lz.D(R.color.primary_default, av8Var12), av8Var12, 432, 0);
                } else {
                    av8Var12.W();
                }
                break;
            case 18:
                Country country = (Country) obj;
                of3 of3Var13 = (of3) obj2;
                ((Integer) obj3).getClass();
                td4.k(country != null ? country.getIso2Alpha() : null, bkh.l(utcVar, 24.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, of3Var13, 48, 12);
                break;
            case 19:
                of3 of3Var14 = (of3) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var13 = (av8) of3Var14;
                if (av8Var13.T(intValue12 & 1, (intValue12 & 17) != 16)) {
                    kv1 kv1Var = uxf.p;
                    xtc f0 = l98.f0(l98.d0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 7);
                    u23 a3 = t23.a(ww9.d, kv1Var, av8Var13, 48);
                    int hashCode3 = Long.hashCode(av8Var13.T);
                    aee m4 = av8Var13.m();
                    xtc C3 = fqj.C(av8Var13, f0);
                    if3.k7.getClass();
                    zg3 zg3Var3 = hf3.b;
                    av8Var13.h0();
                    if (av8Var13.S) {
                        av8Var13.l(zg3Var3);
                    } else {
                        av8Var13.q0();
                    }
                    waa.K(av8Var13, a3, hf3.g);
                    waa.K(av8Var13, m4, hf3.f);
                    waa.K(av8Var13, Integer.valueOf(hashCode3), hf3.j);
                    waa.J(av8Var13, hf3.k);
                    waa.K(av8Var13, C3, hf3.d);
                    sha.a(6, 2, av8Var13, null, "Open Screen");
                    Context context = (Context) av8Var13.k(nz.b);
                    Object O4 = av8Var13.O();
                    a99 a99Var = nf3.a;
                    if (O4 == a99Var) {
                        O4 = e.f("");
                        av8Var13.n0(O4);
                    }
                    e1d e1dVar = (e1d) O4;
                    String str2 = (String) e1dVar.getValue();
                    Object O5 = av8Var13.O();
                    if (O5 == a99Var) {
                        O5 = new w30(14, e1dVar);
                        av8Var13.n0(O5);
                    }
                    t62.t(str2, (Function1) O5, l98.d0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 1), av8Var13, V2.b.f);
                    boolean z = StringsKt.toIntOrNull((String) e1dVar.getValue()) != null;
                    xtc d02 = l98.d0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 1);
                    boolean i5 = av8Var13.i(context);
                    Object O6 = av8Var13.O();
                    if (i5 || O6 == a99Var) {
                        O6 = new ix1(22, e1dVar, context);
                        av8Var13.n0(O6);
                    }
                    mha.h("OPEN EVENT", (Function0) O6, d02, null, null, z, false, false, 0L, 0, 0, av8Var13, 390, 0, 2008);
                    av8Var13.s(true);
                } else {
                    av8Var13.W();
                }
                break;
            case 20:
                xpa xpaVar2 = (xpa) obj;
                of3 of3Var15 = (of3) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                xpaVar2.getClass();
                if ((intValue13 & 6) == 0) {
                    intValue13 |= ((av8) of3Var15).g(xpaVar2) ? 4 : 2;
                }
                av8 av8Var14 = (av8) of3Var15;
                if (av8Var14.T(intValue13 & 1, (intValue13 & 19) != 18)) {
                    un0.a(xpa.a(xpaVar2, utcVar, 7), o7g.a(16.0f), rd0.t(lz.D(R.color.surface_1, av8Var14), av8Var14, 0), null, null, t62.e, av8Var14, 196608, 24);
                } else {
                    av8Var14.W();
                }
                break;
            case 21:
                of3 of3Var16 = (of3) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var15 = (av8) of3Var16;
                if (av8Var15.T(intValue14 & 1, (intValue14 & 17) != 16)) {
                    nq8.h(av8Var15, bkh.e(utcVar, 4.0f));
                } else {
                    av8Var15.W();
                }
                break;
            case 22:
                of3 of3Var17 = (of3) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var16 = (av8) of3Var17;
                if (av8Var16.T(intValue15 & 1, (intValue15 & 17) != 16)) {
                    nq8.h(av8Var16, bkh.e(utcVar, 4.0f));
                } else {
                    av8Var16.W();
                }
                break;
            case 23:
                of3 of3Var18 = (of3) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                ((bpa) obj).getClass();
                av8 av8Var17 = (av8) of3Var18;
                if (av8Var17.T(intValue16 & 1, (intValue16 & 17) != 16)) {
                    vha.a(oea.v(R.string.next_up, av8Var17), null, null, null, null, null, null, av8Var17, 0, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                } else {
                    av8Var17.W();
                }
                break;
            case 24:
                of3 of3Var19 = (of3) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                ((bpa) obj).getClass();
                av8 av8Var18 = (av8) of3Var19;
                if (av8Var18.T(intValue17 & 1, (intValue17 & 17) != 16)) {
                    rz0.a(new sz0(AdType.Banner.FantasySmall, l6g.L(new Pair(SearchResponseKt.SPORT_ENTITY, Sports.FOOTBALL), new Pair("page", "fantasy"))), null, 0, 0, false, av8Var18, 0, 30);
                } else {
                    av8Var18.W();
                }
                break;
            case 25:
                of3 of3Var20 = (of3) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                ((bpa) obj).getClass();
                av8 av8Var19 = (av8) of3Var20;
                if (av8Var19.T(intValue18 & 1, (intValue18 & 17) != 16)) {
                    vha.a(oea.v(R.string.available_now, av8Var19), null, null, null, null, null, null, av8Var19, 0, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                } else {
                    av8Var19.W();
                }
                break;
            case 26:
                of3 of3Var21 = (of3) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                ((bpa) obj).getClass();
                av8 av8Var20 = (av8) of3Var21;
                if (av8Var20.T(intValue19 & 1, (intValue19 & 17) != 16)) {
                    rz0.a(new sz0(AdType.Banner.FantasyBig, l6g.L(new Pair(SearchResponseKt.SPORT_ENTITY, Sports.FOOTBALL), new Pair("page", "fantasy"))), null, 0, 0, false, av8Var20, 0, 30);
                } else {
                    av8Var20.W();
                }
                break;
            case 27:
                xpa xpaVar3 = (xpa) obj;
                of3 of3Var22 = (of3) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                xpaVar3.getClass();
                if ((intValue20 & 6) == 0) {
                    intValue20 |= ((av8) of3Var22).g(xpaVar3) ? 4 : 2;
                }
                av8 av8Var21 = (av8) of3Var22;
                if (av8Var21.T(intValue20 & 1, (intValue20 & 19) != 18)) {
                    kik.b(0, av8Var21, l98.b0(xpa.a(xpaVar3, utcVar, 7), 8.0f));
                } else {
                    av8Var21.W();
                }
                break;
            case 28:
                xpa xpaVar4 = (xpa) obj;
                of3 of3Var23 = (of3) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                xpaVar4.getClass();
                if ((intValue21 & 6) == 0) {
                    intValue21 |= ((av8) of3Var23).g(xpaVar4) ? 4 : 2;
                }
                av8 av8Var22 = (av8) of3Var23;
                if (av8Var22.T(intValue21 & 1, (intValue21 & 19) != 18)) {
                    rz0.a(new sz0(AdType.Banner.FantasyBig, l6g.L(new Pair(SearchResponseKt.SPORT_ENTITY, Sports.FOOTBALL), new Pair("page", "fantasy"))), xpa.a(xpaVar4, utcVar, 7), 0, 0, false, av8Var22, 0, 28);
                } else {
                    av8Var22.W();
                }
                break;
            default:
                of3 of3Var24 = (of3) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var23 = (av8) of3Var24;
                if (av8Var23.T(intValue22 & 1, (intValue22 & 17) != 16)) {
                    kv1 kv1Var2 = uxf.p;
                    xtc c0 = l98.c0(n9e.q(bkh.d(utcVar, 1.0f), lz.D(R.color.surface_1, av8Var23), oyn.e), 16.0f, 16.0f);
                    u23 a4 = t23.a(ww9.d, kv1Var2, av8Var23, 48);
                    int hashCode4 = Long.hashCode(av8Var23.T);
                    aee m5 = av8Var23.m();
                    xtc C4 = fqj.C(av8Var23, c0);
                    if3.k7.getClass();
                    zg3 zg3Var4 = hf3.b;
                    av8Var23.h0();
                    if (av8Var23.S) {
                        av8Var23.l(zg3Var4);
                    } else {
                        av8Var23.q0();
                    }
                    waa.K(av8Var23, a4, hf3.g);
                    waa.K(av8Var23, m5, hf3.f);
                    waa.K(av8Var23, Integer.valueOf(hashCode4), hf3.j);
                    waa.J(av8Var23, hf3.k);
                    waa.K(av8Var23, C4, hf3.d);
                    j72.h(null, Integer.valueOf(R.drawable.match_shotmap), Integer.valueOf(R.string.fantasy_player_comparison_empty_title), Integer.valueOf(R.string.fantasy_player_comparison_empty_text), false, null, 0, 0L, av8Var23, 24576, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE);
                    av8Var23.s(true);
                } else {
                    av8Var23.W();
                }
                break;
        }
        return Unit.a;
    }
}
