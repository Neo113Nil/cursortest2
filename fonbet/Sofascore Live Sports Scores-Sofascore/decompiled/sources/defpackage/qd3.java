package defpackage;

import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Locale;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class qd3 implements ct8 {
    public final /* synthetic */ int a;

    public /* synthetic */ qd3(int i) {
        this.a = i;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Integer num = null;
        utc utcVar = utc.a;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((n8g) obj).getClass();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
                    xtc f0 = l98.f0(utc.a, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
                    String upperCase = oea.v(R.string.ok_got_it_button, av8Var).toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    yf8 yf8Var = xth.a;
                    udj.c(upperCase, f0, 0L, null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.a(), av8Var, 48, 0, 130044);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                    nq8.h(av8Var2, bkh.e(utcVar, 16.0f));
                } else {
                    av8Var2.W();
                }
                break;
            case 2:
                rw0 rw0Var = (rw0) obj;
                of3 of3Var3 = (of3) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                rw0Var.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((av8) of3Var3).g(rw0Var) ? 4 : 2;
                }
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 19) != 18)) {
                    td4.G(rw0Var.a, bkh.l(utcVar, 40.0f), false, 0L, av8Var3, 48, 12);
                } else {
                    av8Var3.W();
                }
                break;
            case 3:
                vw0 vw0Var = (vw0) obj;
                of3 of3Var4 = (of3) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                vw0Var.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((av8) of3Var4).g(vw0Var) ? 4 : 2;
                }
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(intValue4 & 1, (intValue4 & 19) != 18)) {
                    k1c c = e12.c(uxf.c, false);
                    int hashCode = Long.hashCode(av8Var4.T);
                    aee m = av8Var4.m();
                    xtc C = fqj.C(av8Var4, utcVar);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var4.h0();
                    if (av8Var4.S) {
                        av8Var4.l(zg3Var);
                    } else {
                        av8Var4.q0();
                    }
                    waa.K(av8Var4, c, hf3.g);
                    waa.K(av8Var4, m, hf3.f);
                    waa.K(av8Var4, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var4, hf3.k);
                    waa.K(av8Var4, C, hf3.d);
                    if (vw0Var instanceof uw0) {
                        av8Var4.d0(-1318244728);
                        uw0 uw0Var = (uw0) vw0Var;
                        num = uw0Var.d;
                        td4.C(uw0Var.a, bkh.l(utcVar, 40.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var4, 48, 12);
                        av8Var4.s(false);
                    } else if (vw0Var instanceof tw0) {
                        av8Var4.d0(-1317874650);
                        tw0 tw0Var = (tw0) vw0Var;
                        num = tw0Var.d;
                        td4.z(Integer.valueOf(tw0Var.a), bkh.l(utcVar, 40.0f), av8Var4, 48);
                        av8Var4.s(false);
                    } else {
                        av8Var4.d0(1620066982);
                        av8Var4.s(false);
                    }
                    if (num != null) {
                        av8Var4.d0(-1317405713);
                        td4.G(num.intValue(), n12.a.a(bkh.l(utcVar, 16.0f), uxf.k), false, 0L, av8Var4, 0, 12);
                        av8Var4.s(false);
                    } else {
                        av8Var4.d0(-1317113600);
                        av8Var4.s(false);
                    }
                    av8Var4.s(true);
                } else {
                    av8Var4.W();
                }
                break;
            case 4:
                of3 of3Var5 = (of3) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var5 = (av8) of3Var5;
                if (av8Var5.T(1 & intValue5, (intValue5 & 17) != 16)) {
                    tz9.c(0, av8Var5, n9e.q(l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.surface_1, av8Var5), oyn.e), oea.v(R.string.traded_from, av8Var5));
                } else {
                    av8Var5.W();
                }
                break;
            case 5:
                xpa xpaVar = (xpa) obj;
                of3 of3Var6 = (of3) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                xpaVar.getClass();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((av8) of3Var6).g(xpaVar) ? 4 : 2;
                }
                av8 av8Var6 = (av8) of3Var6;
                if (av8Var6.T(1 & intValue6, (intValue6 & 19) != 18)) {
                    j72.h(n9e.q(xpa.a(xpaVar, l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 7), lz.D(R.color.surface_1, av8Var6), o7g.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 16.0f, 3)), Integer.valueOf(R.drawable.no_data), Integer.valueOf(R.string.empty_search_title), Integer.valueOf(R.string.empty_adjust_search_text), false, null, 0, 0L, av8Var6, 0, 240);
                } else {
                    av8Var6.W();
                }
                break;
            case 6:
                xpa xpaVar2 = (xpa) obj;
                of3 of3Var7 = (of3) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                xpaVar2.getClass();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= ((av8) of3Var7).g(xpaVar2) ? 4 : 2;
                }
                av8 av8Var7 = (av8) of3Var7;
                if (av8Var7.T(1 & intValue7, (intValue7 & 19) != 18)) {
                    nq8.h(av8Var7, bkh.e(xpa.a(xpaVar2, utcVar, 7), 8.0f));
                } else {
                    av8Var7.W();
                }
                break;
            case 7:
                of3 of3Var8 = (of3) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var8 = (av8) of3Var8;
                if (av8Var8.T(intValue8 & 1, (intValue8 & 17) != 16)) {
                    j72.h(bkh.e(l98.d0(utcVar, 32.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 400.0f), Integer.valueOf(R.drawable.no_data), Integer.valueOf(R.string.no_results_for_this_selection), Integer.valueOf(R.string.no_results_for_this_selection_body), false, null, 0, 0L, av8Var8, 24582, 224);
                } else {
                    av8Var8.W();
                }
                break;
            case 8:
                of3 of3Var9 = (of3) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((m12) obj).getClass();
                av8 av8Var9 = (av8) of3Var9;
                if (av8Var9.T(intValue9 & 1, (intValue9 & 17) != 16)) {
                    l8g a = k8g.a(new ng0(8.0f, true, new a70(6)), uxf.m, av8Var9, 54);
                    int hashCode2 = Long.hashCode(av8Var9.T);
                    aee m2 = av8Var9.m();
                    xtc C2 = fqj.C(av8Var9, utcVar);
                    if3.k7.getClass();
                    zg3 zg3Var2 = hf3.b;
                    av8Var9.h0();
                    if (av8Var9.S) {
                        av8Var9.l(zg3Var2);
                    } else {
                        av8Var9.q0();
                    }
                    waa.K(av8Var9, a, hf3.g);
                    waa.K(av8Var9, m2, hf3.f);
                    waa.K(av8Var9, Integer.valueOf(hashCode2), hf3.j);
                    waa.J(av8Var9, hf3.k);
                    waa.K(av8Var9, C2, hf3.d);
                    jgb.c(bkh.m(utcVar, 80.0f, 8.0f), null, av8Var9, 6, 2);
                    jgb.c(bkh.m(utcVar, 6.0f, 8.0f), null, av8Var9, 6, 2);
                    jgb.c(bkh.m(utcVar, 100.0f, 8.0f), null, av8Var9, 6, 2);
                    av8Var9.s(true);
                } else {
                    av8Var9.W();
                }
                break;
            case 9:
                of3 of3Var10 = (of3) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var10 = (av8) of3Var10;
                if (av8Var10.T(intValue10 & 1, (intValue10 & 17) != 16)) {
                    utc utcVar2 = utc.a;
                    xtc f02 = l98.f0(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                    u23 a2 = t23.a(new ng0(8.0f, true, new a70(6)), uxf.p, av8Var10, 54);
                    int hashCode3 = Long.hashCode(av8Var10.T);
                    aee m3 = av8Var10.m();
                    xtc C3 = fqj.C(av8Var10, f02);
                    if3.k7.getClass();
                    zg3 zg3Var3 = hf3.b;
                    av8Var10.h0();
                    if (av8Var10.S) {
                        av8Var10.l(zg3Var3);
                    } else {
                        av8Var10.q0();
                    }
                    f50 f50Var = hf3.g;
                    waa.K(av8Var10, a2, f50Var);
                    ff3 ff3Var = hf3.f;
                    waa.K(av8Var10, m3, ff3Var);
                    Integer valueOf = Integer.valueOf(hashCode3);
                    f50 f50Var2 = hf3.j;
                    waa.K(av8Var10, valueOf, f50Var2);
                    ry ryVar = hf3.k;
                    waa.J(av8Var10, ryVar);
                    f50 f50Var3 = hf3.d;
                    waa.K(av8Var10, C3, f50Var3);
                    xtc d = bkh.d(utcVar2, 1.0f);
                    kg0 kg0Var = ww9.g;
                    lv1 lv1Var = uxf.m;
                    l8g a3 = k8g.a(kg0Var, lv1Var, av8Var10, 54);
                    int hashCode4 = Long.hashCode(av8Var10.T);
                    aee m4 = av8Var10.m();
                    xtc C4 = fqj.C(av8Var10, d);
                    av8Var10.h0();
                    if (av8Var10.S) {
                        av8Var10.l(zg3Var3);
                    } else {
                        av8Var10.q0();
                    }
                    waa.K(av8Var10, a3, f50Var);
                    waa.K(av8Var10, m4, ff3Var);
                    bf3.s(hashCode4, av8Var10, f50Var2, av8Var10, ryVar);
                    waa.K(av8Var10, C4, f50Var3);
                    jgb.e(0, av8Var10);
                    jgb.b(0, av8Var10);
                    jgb.e(0, av8Var10);
                    av8Var10.s(true);
                    jgb.d(0, av8Var10);
                    jgb.d(0, av8Var10);
                    jgb.d(0, av8Var10);
                    xtc f03 = l98.f0(bkh.d(utcVar2, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, 5);
                    l8g a4 = k8g.a(new ng0(8.0f, true, new a70(6)), lv1Var, av8Var10, 54);
                    int hashCode5 = Long.hashCode(av8Var10.T);
                    aee m5 = av8Var10.m();
                    xtc C5 = fqj.C(av8Var10, f03);
                    av8Var10.h0();
                    if (av8Var10.S) {
                        av8Var10.l(zg3Var3);
                    } else {
                        av8Var10.q0();
                    }
                    waa.K(av8Var10, a4, f50Var);
                    waa.K(av8Var10, m5, ff3Var);
                    bf3.s(hashCode5, av8Var10, f50Var2, av8Var10, ryVar);
                    waa.K(av8Var10, C5, f50Var3);
                    jgb.c(bkh.l(utcVar2, 24.0f), o7g.a(4.0f), av8Var10, 6, 0);
                    jgb.c(bkh.m(utcVar2, 40.0f, 12.0f), o7g.a(16.0f), av8Var10, 6, 0);
                    jgb.c(bkh.l(utcVar2, 24.0f), o7g.a(4.0f), av8Var10, 6, 0);
                    jgb.c(bkh.m(utcVar2, 40.0f, 12.0f), o7g.a(16.0f), av8Var10, 6, 0);
                    av8Var10.s(true);
                    av8Var10.s(true);
                } else {
                    av8Var10.W();
                }
                break;
            case 10:
                of3 of3Var11 = (of3) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var11 = (av8) of3Var11;
                if (av8Var11.T(intValue11 & 1, (intValue11 & 17) != 16)) {
                    xtc b0 = l98.b0(tol.m(utcVar), 16.0f);
                    k1c c2 = e12.c(uxf.c, false);
                    int hashCode6 = Long.hashCode(av8Var11.T);
                    aee m6 = av8Var11.m();
                    xtc C6 = fqj.C(av8Var11, b0);
                    if3.k7.getClass();
                    zg3 zg3Var4 = hf3.b;
                    av8Var11.h0();
                    if (av8Var11.S) {
                        av8Var11.l(zg3Var4);
                    } else {
                        av8Var11.q0();
                    }
                    waa.K(av8Var11, c2, hf3.g);
                    waa.K(av8Var11, m6, hf3.f);
                    waa.K(av8Var11, Integer.valueOf(hashCode6), hf3.j);
                    waa.J(av8Var11, hf3.k);
                    waa.K(av8Var11, C6, hf3.d);
                    ncf.a(bkh.l(utcVar, 40.0f), lz.D(R.color.primary_default, av8Var11), 6.0f, lz.D(R.color.primary_highlight, av8Var11), 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var11, 390, 32);
                    av8Var11.s(true);
                } else {
                    av8Var11.W();
                }
                break;
            case 11:
                mnb mnbVar = (mnb) obj;
                of3 of3Var12 = (of3) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                mnbVar.getClass();
                if ((intValue12 & 6) == 0) {
                    intValue12 |= ((av8) of3Var12).g(mnbVar) ? 4 : 2;
                }
                av8 av8Var12 = (av8) of3Var12;
                if (av8Var12.T(intValue12 & 1, (intValue12 & 19) != 18)) {
                    sha.c(mnbVar, null, av8Var12, intValue12 & 14);
                } else {
                    av8Var12.W();
                }
                break;
            case 12:
                of3 of3Var13 = (of3) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var13 = (av8) of3Var13;
                if (av8Var13.T(intValue13 & 1, (intValue13 & 17) != 16)) {
                    xtc c0 = l98.c0(bkh.d(utcVar, 1.0f), 16.0f, 12.0f);
                    l8g a5 = k8g.a(new ng0(16.0f, true, new a70(6)), uxf.m, av8Var13, 54);
                    int hashCode7 = Long.hashCode(av8Var13.T);
                    aee m7 = av8Var13.m();
                    xtc C7 = fqj.C(av8Var13, c0);
                    if3.k7.getClass();
                    zg3 zg3Var5 = hf3.b;
                    av8Var13.h0();
                    if (av8Var13.S) {
                        av8Var13.l(zg3Var5);
                    } else {
                        av8Var13.q0();
                    }
                    waa.K(av8Var13, a5, hf3.g);
                    waa.K(av8Var13, m7, hf3.f);
                    waa.K(av8Var13, Integer.valueOf(hashCode7), hf3.j);
                    waa.J(av8Var13, hf3.k);
                    waa.K(av8Var13, C7, hf3.d);
                    kq9.b(s6a.N(R.drawable.ic_tv_channel_checkmark_16, 6, av8Var13), null, l98.b0(n9e.q(wnn.A(bkh.l(utcVar, 24.0f), o7g.a), lz.D(R.color.secondary_highlight, av8Var13), oyn.e), 4.0f), lz.D(R.color.secondary_default, av8Var13), av8Var13, 48, 0);
                    String v = oea.v(R.string.feed_empty_swipe_refresh, av8Var13);
                    yf8 yf8Var2 = xth.a;
                    udj.c(v, null, lz.D(R.color.n_lv_1, av8Var13), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), av8Var13, 0, 0, 131066);
                    av8Var13.s(true);
                } else {
                    av8Var13.W();
                }
                break;
            case 13:
                of3 of3Var14 = (of3) obj2;
                ((Integer) obj3).getClass();
                ((r70) obj).getClass();
                kq9.b(s6a.N(R.drawable.ic_star_filled_16, 6, of3Var14), null, bkh.l(utcVar, 16.0f), lz.D(R.color.primary_default, of3Var14), of3Var14, 432, 0);
                break;
            case 14:
                ((Integer) obj3).getClass();
                ((r70) obj).getClass();
                t62.q(6, (of3) obj2, bkh.l(utcVar, 80.0f));
                break;
            case 15:
                of3 of3Var15 = (of3) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((bpa) obj).getClass();
                av8 av8Var14 = (av8) of3Var15;
                if (av8Var14.T(intValue14 & 1, (intValue14 & 17) != 16)) {
                    j72.h(null, null, null, Integer.valueOf(R.string.onboarding_search_hint), false, null, 0, 0L, av8Var14, 0, 247);
                } else {
                    av8Var14.W();
                }
                break;
            case 16:
                of3 of3Var16 = (of3) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                ((bpa) obj).getClass();
                av8 av8Var15 = (av8) of3Var16;
                if (av8Var15.T(intValue15 & 1, (intValue15 & 17) != 16)) {
                    j72.h(null, Integer.valueOf(R.drawable.no_data), Integer.valueOf(R.string.empty_search_title), Integer.valueOf(R.string.onboarding_search_hint), false, new t3e(32.0f, 48.0f, 32.0f, 48.0f), 0, 0L, av8Var15, 196608, Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE);
                } else {
                    av8Var15.W();
                }
                break;
            case 17:
                of3 of3Var17 = (of3) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var16 = (av8) of3Var17;
                if (av8Var16.T(intValue16 & 1, (intValue16 & 17) != 16)) {
                    j72.h(null, Integer.valueOf(R.drawable.no_data), Integer.valueOf(R.string.empty_search_title), Integer.valueOf(R.string.empty_filters_text), false, null, 0, 0L, av8Var16, 0, 241);
                } else {
                    av8Var16.W();
                }
                break;
            case 18:
                of3 of3Var18 = (of3) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var17 = (av8) of3Var18;
                if (av8Var17.T(intValue17 & 1, (intValue17 & 17) != 16)) {
                    x2a.d(oea.v(R.string.player_of_the_season_disclaimer, av8Var17), l98.b0(n9e.q(utcVar, lz.D(R.color.surface_1, av8Var17), oyn.e), 8.0f), null, 0L, 0L, lz.D(R.color.surface_2, av8Var17), null, null, null, 8.0f, uxf.l, av8Var17, 805306368, 6, 476);
                } else {
                    av8Var17.W();
                }
                break;
            case 19:
                of3 of3Var19 = (of3) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var18 = (av8) of3Var19;
                if (av8Var18.T(intValue18 & 1, (intValue18 & 17) != 16)) {
                    nq8.h(av8Var18, bkh.e(utcVar, 4.0f));
                } else {
                    av8Var18.W();
                }
                break;
            case 20:
                of3 of3Var20 = (of3) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var19 = (av8) of3Var20;
                if (av8Var19.T(intValue19 & 1, (intValue19 & 17) != 16)) {
                    gz8.j(null, 0L, 0L, 4.0f, 0, av8Var19, 3072, 23);
                } else {
                    av8Var19.W();
                }
                break;
            case 21:
                of3 of3Var21 = (of3) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var20 = (av8) of3Var21;
                if (av8Var20.T(intValue20 & 1, (intValue20 & 17) != 16)) {
                    nq8.h(av8Var20, bkh.e(utcVar, 4.0f));
                } else {
                    av8Var20.W();
                }
                break;
            case 22:
                of3 of3Var22 = (of3) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var21 = (av8) of3Var22;
                if (av8Var21.T(intValue21 & 1, (intValue21 & 17) != 16)) {
                    gz8.j(null, 0L, 0L, 4.0f, 0, av8Var21, 3072, 23);
                } else {
                    av8Var21.W();
                }
                break;
            case 23:
                of3 of3Var23 = (of3) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var22 = (av8) of3Var23;
                if (av8Var22.T(1 & intValue22, (intValue22 & 17) != 16)) {
                    sha.a(48, 0, av8Var22, l98.d0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), oea.v(R.string.player_of_the_season_awards, av8Var22));
                } else {
                    av8Var22.W();
                }
                break;
            case 24:
                xtc xtcVar = (xtc) obj;
                of3 of3Var24 = (of3) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                xtcVar.getClass();
                if ((intValue23 & 6) == 0) {
                    intValue23 |= ((av8) of3Var24).g(xtcVar) ? 4 : 2;
                }
                av8 av8Var23 = (av8) of3Var24;
                if (av8Var23.T(intValue23 & 1, (intValue23 & 19) != 18)) {
                    kq9.b(s6a.N(R.drawable.team_logo_placeholder, 6, av8Var23), null, xtcVar, lz.D(R.color.neutral_default, av8Var23), av8Var23, ((intValue23 << 6) & 896) | 48, 0);
                } else {
                    av8Var23.W();
                }
                break;
            case 25:
                xpa xpaVar3 = (xpa) obj;
                of3 of3Var25 = (of3) obj2;
                int intValue24 = ((Integer) obj3).intValue();
                xpaVar3.getClass();
                if ((intValue24 & 6) == 0) {
                    intValue24 |= ((av8) of3Var25).g(xpaVar3) ? 4 : 2;
                }
                av8 av8Var24 = (av8) of3Var25;
                if (av8Var24.T(1 & intValue24, (intValue24 & 19) != 18)) {
                    sha.a(0, 0, av8Var24, l98.d0(n9e.q(wnn.A(l98.d0(xpa.a(xpaVar3, utcVar, 7), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), o7g.c(16.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12)), lz.D(R.color.surface_1, av8Var24), oyn.e), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), oea.v(R.string.results, av8Var24));
                } else {
                    av8Var24.W();
                }
                break;
            case 26:
                of3 of3Var26 = (of3) obj2;
                int intValue25 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var25 = (av8) of3Var26;
                if (av8Var25.T(intValue25 & 1, (intValue25 & 17) != 16)) {
                    fz8.m(R.string.view_performance, 0L, av8Var25, 0, 2);
                } else {
                    av8Var25.W();
                }
                break;
            case 27:
                of3 of3Var27 = (of3) obj2;
                int intValue26 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var26 = (av8) of3Var27;
                if (av8Var26.T(intValue26 & 1, (intValue26 & 17) != 16)) {
                    fz8.m(R.string.view_all_stats, 0L, av8Var26, 0, 2);
                } else {
                    av8Var26.W();
                }
                break;
            case 28:
                of3 of3Var28 = (of3) obj2;
                int intValue27 = ((Integer) obj3).intValue();
                ((m12) obj).getClass();
                av8 av8Var27 = (av8) of3Var28;
                if (av8Var27.T(1 & intValue27, (intValue27 & 17) != 16)) {
                    waa.f(l6g.K(new l9f(new q9k(R.string.profile_added_matches), null), new l9f(new q9k(R.string.profile_match_openings), null), new l9f(new q9k(R.string.profile_leaderboard_position), null), new l9f(new q9k(R.string.profile_leaderboard_points), null)), null, av8Var27, 0);
                } else {
                    av8Var27.W();
                }
                break;
            default:
                of3 of3Var29 = (of3) obj2;
                int intValue28 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var28 = (av8) of3Var29;
                if (av8Var28.T(intValue28 & 1, (intValue28 & 17) != 16)) {
                    String v2 = oea.v(R.string.profile_edited_competitions, av8Var28);
                    long D = lz.D(R.color.n_lv_1, av8Var28);
                    yf8 yf8Var3 = xth.a;
                    udj.c(v2, l98.f0(n9e.q(bkh.d(l98.f0(utc.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 1.0f), lz.D(R.color.surface_1, av8Var28), o7g.c(16.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6.0f, 5), D, null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.j(), av8Var28, 0, 0, 130040);
                } else {
                    av8Var28.W();
                }
                break;
        }
        return Unit.a;
    }
}
