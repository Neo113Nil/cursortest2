package defpackage;

import com.ironsource.V2;
import com.sofascore.model.Sports;
import com.sofascore.model.firebase.AdType;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Pair;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ed3 implements ct8 {
    public final /* synthetic */ int a;

    public /* synthetic */ ed3(int i) {
        this.a = i;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        utc utcVar = utc.a;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((m12) obj).getClass();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
                    lv1 lv1Var = uxf.m;
                    utc utcVar2 = utc.a;
                    xtc f0 = l98.f0(utcVar2, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
                    l8g a = k8g.a(ww9.b, lv1Var, av8Var, 48);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, f0);
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
                    kq9.a(haa.t(R.drawable.ic_compare_players, 0, av8Var), null, null, lz.D(R.color.primary_default, av8Var), av8Var, 56, 4);
                    String f = fc6.f(8.0f, R.string.select_player, av8Var, av8Var, utcVar2);
                    yf8 yf8Var = xth.a;
                    udj.c(f, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var, 0, 24960, 110586);
                    av8Var.s(true);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                xpa xpaVar = (xpa) obj;
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                xpaVar.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((av8) of3Var2).g(xpaVar) ? 4 : 2;
                }
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(1 & intValue2, (intValue2 & 19) != 18)) {
                    rz0.a(new sz0(AdType.Banner.FantasySmall, l6g.L(new Pair(SearchResponseKt.SPORT_ENTITY, Sports.FOOTBALL), new Pair("page", "fantasy"))), xpa.a(xpaVar, utcVar, 7), 0, 0, false, av8Var2, 384, 24);
                } else {
                    av8Var2.W();
                }
                break;
            case 2:
                xpa xpaVar2 = (xpa) obj;
                of3 of3Var3 = (of3) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                xpaVar2.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((av8) of3Var3).g(xpaVar2) ? 4 : 2;
                }
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(1 & intValue3, (intValue3 & 19) != 18)) {
                    rz0.a(new sz0(AdType.Banner.FantasyBig, l6g.L(new Pair(SearchResponseKt.SPORT_ENTITY, Sports.FOOTBALL), new Pair("page", "fantasy"))), xpa.a(xpaVar2, utcVar, 7), 0, 0, false, av8Var3, 384, 24);
                } else {
                    av8Var3.W();
                }
                break;
            case 3:
                ((Integer) obj3).getClass();
                ((r70) obj).getClass();
                td4.r(6, (of3) obj2, l98.d0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2));
                break;
            case 4:
                of3 of3Var4 = (of3) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(intValue4 & 1, (intValue4 & 17) != 16)) {
                    String g = bf3.g(16.0f, R.string.popular_competitions, av8Var4, av8Var4, utcVar);
                    long D = lz.D(R.color.n_lv_1, av8Var4);
                    yf8 yf8Var2 = xth.a;
                    udj.c(g, l98.d0(l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6.0f, 5), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), D, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.j(), av8Var4, 48, 24960, 110584);
                } else {
                    av8Var4.W();
                }
                break;
            case 5:
                xpa xpaVar3 = (xpa) obj;
                of3 of3Var5 = (of3) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                xpaVar3.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((av8) of3Var5).g(xpaVar3) ? 4 : 2;
                }
                av8 av8Var5 = (av8) of3Var5;
                if (av8Var5.T(1 & intValue5, (intValue5 & 19) != 18)) {
                    j72.h(n9e.q(xpa.a(xpaVar3, utcVar, 7), lz.D(R.color.surface_1, av8Var5), oyn.e), Integer.valueOf(R.drawable.no_standings), Integer.valueOf(R.string.no_data_available), null, true, null, 0, 0L, av8Var5, 24576, 232);
                } else {
                    av8Var5.W();
                }
                break;
            case 6:
                xpa xpaVar4 = (xpa) obj;
                of3 of3Var6 = (of3) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                xpaVar4.getClass();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((av8) of3Var6).g(xpaVar4) ? 4 : 2;
                }
                av8 av8Var6 = (av8) of3Var6;
                if (av8Var6.T(1 & intValue6, (intValue6 & 19) != 18)) {
                    j72.h(n9e.q(l98.f0(xpa.a(xpaVar4, utcVar, 7), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), lz.D(R.color.surface_1, av8Var6), o7g.a(16.0f)), Integer.valueOf(R.drawable.no_standings), Integer.valueOf(R.string.fantasy_matchups_empty_title), Integer.valueOf(R.string.fantasy_matchups_empty_text), true, null, 0, 0L, av8Var6, 24576, 224);
                } else {
                    av8Var6.W();
                }
                break;
            case 7:
                xpa xpaVar5 = (xpa) obj;
                of3 of3Var7 = (of3) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                xpaVar5.getClass();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= ((av8) of3Var7).g(xpaVar5) ? 4 : 2;
                }
                av8 av8Var7 = (av8) of3Var7;
                if (av8Var7.T(1 & intValue7, (intValue7 & 19) != 18)) {
                    sha.a(0, 0, av8Var7, l98.d0(u0a.F(l98.f0(xpa.a(xpaVar5, utcVar, 7), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), icb.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var7, 38), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), oea.v(R.string.your_match, av8Var7));
                } else {
                    av8Var7.W();
                }
                break;
            case 8:
                xpa xpaVar6 = (xpa) obj;
                of3 of3Var8 = (of3) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                xpaVar6.getClass();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= ((av8) of3Var8).g(xpaVar6) ? 4 : 2;
                }
                av8 av8Var8 = (av8) of3Var8;
                if (av8Var8.T(1 & intValue8, (intValue8 & 19) != 18)) {
                    sha.a(0, 0, av8Var8, l98.d0(u0a.F(xpa.a(xpaVar6, utcVar, 7), icb.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var8, 38), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), oea.v(R.string.other_matches, av8Var8));
                } else {
                    av8Var8.W();
                }
                break;
            case 9:
                of3 of3Var9 = (of3) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var9 = (av8) of3Var9;
                if (av8Var9.T(intValue9 & 1, (intValue9 & 17) != 16)) {
                    s6a.f(42.0f, 4.0f, 432, 57, 0L, 0L, av8Var9, null);
                } else {
                    av8Var9.W();
                }
                break;
            case 10:
                of3 of3Var10 = (of3) obj2;
                ((Integer) obj3).getClass();
                ((r70) obj).getClass();
                kq9.b(s6a.N(R.drawable.ic_badge_selected, 6, of3Var10), null, bkh.l(utcVar, 16.0f), r13.i, of3Var10, V2.b.f, 0);
                break;
            case 11:
                of3 of3Var11 = (of3) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((bpa) obj).getClass();
                av8 av8Var10 = (av8) of3Var11;
                if (av8Var10.T(intValue10 & 1, (intValue10 & 17) != 16)) {
                    tba.e(0, 4, av8Var10, null, oea.v(R.string.fantasy_choose_competition_title, av8Var10), oea.v(R.string.fantasy_choose_competition_body, av8Var10));
                } else {
                    av8Var10.W();
                }
                break;
            case 12:
                of3 of3Var12 = (of3) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var11 = (av8) of3Var12;
                if (av8Var11.T(intValue11 & 1, (intValue11 & 17) != 16)) {
                    yso.d(6, av8Var11, l98.f0(utc.a, 8.0f, 8.0f, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8));
                } else {
                    av8Var11.W();
                }
                break;
            case 13:
                xpa xpaVar7 = (xpa) obj;
                of3 of3Var13 = (of3) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                xpaVar7.getClass();
                if ((intValue12 & 6) == 0) {
                    intValue12 |= ((av8) of3Var13).g(xpaVar7) ? 4 : 2;
                }
                av8 av8Var12 = (av8) of3Var13;
                if (av8Var12.T(1 & intValue12, (intValue12 & 19) != 18)) {
                    ktm.n(0, 0, av8Var12, xpa.a(xpaVar7, utcVar, 7));
                } else {
                    av8Var12.W();
                }
                break;
            case 14:
                xpa xpaVar8 = (xpa) obj;
                of3 of3Var14 = (of3) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                xpaVar8.getClass();
                if ((intValue13 & 6) == 0) {
                    intValue13 |= ((av8) of3Var14).g(xpaVar8) ? 4 : 2;
                }
                av8 av8Var13 = (av8) of3Var14;
                if (av8Var13.T(1 & intValue13, (intValue13 & 19) != 18)) {
                    String v = oea.v(R.string.fantasy_stats_not_counted, av8Var13);
                    yf8 yf8Var3 = xth.a;
                    udj.c(v, l98.b0(xpa.a(xpaVar8, utcVar, 3), 16.0f), lz.D(R.color.n_lv_3, av8Var13), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.g(), av8Var13, 0, 24960, 110584);
                } else {
                    av8Var13.W();
                }
                break;
            case 15:
                of3 of3Var15 = (of3) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((m12) obj).getClass();
                av8 av8Var14 = (av8) of3Var15;
                if (av8Var14.T(intValue14 & 1, (intValue14 & 17) != 16)) {
                    xtc f02 = l98.f0(utc.a, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
                    String v2 = oea.v(R.string.players, av8Var14);
                    yf8 yf8Var4 = xth.a;
                    udj.c(v2, f02, lz.D(R.color.n_lv_1, av8Var14), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.j(), av8Var14, 48, 24960, 110584);
                } else {
                    av8Var14.W();
                }
                break;
            case 16:
                xpa xpaVar9 = (xpa) obj;
                of3 of3Var16 = (of3) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                xpaVar9.getClass();
                if ((intValue15 & 6) == 0) {
                    intValue15 |= ((av8) of3Var16).g(xpaVar9) ? 4 : 2;
                }
                av8 av8Var15 = (av8) of3Var16;
                if (av8Var15.T(1 & intValue15, (intValue15 & 19) != 18)) {
                    j72.h(n9e.q(xpa.a(xpaVar9, utcVar, 7), lz.D(R.color.surface_1, av8Var15), oyn.e), Integer.valueOf(R.drawable.no_data), null, Integer.valueOf(R.string.fantasy_empty_state_player_filter), false, null, 0, 0L, av8Var15, 0, 244);
                } else {
                    av8Var15.W();
                }
                break;
            case 17:
                xpa xpaVar10 = (xpa) obj;
                of3 of3Var17 = (of3) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                xpaVar10.getClass();
                if ((intValue16 & 6) == 0) {
                    intValue16 |= ((av8) of3Var17).g(xpaVar10) ? 4 : 2;
                }
                av8 av8Var16 = (av8) of3Var17;
                if (av8Var16.T(1 & intValue16, (intValue16 & 19) != 18)) {
                    s6a.f(42.0f, 4.0f, 432, 56, 0L, 0L, av8Var16, xpa.a(xpaVar10, utcVar, 7));
                } else {
                    av8Var16.W();
                }
                break;
            case 18:
                of3 of3Var18 = (of3) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                ((m12) obj).getClass();
                av8 av8Var17 = (av8) of3Var18;
                if (av8Var17.T(1 & intValue17, (intValue17 & 17) != 16)) {
                    i9a.l(3136, lz.D(R.color.success, av8Var17), av8Var17, l98.f0(utc.a, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), haa.t(R.drawable.ic_transfer_in, 0, av8Var17), oea.v(R.string.squad_change_player_in, av8Var17));
                } else {
                    av8Var17.W();
                }
                break;
            case 19:
                of3 of3Var19 = (of3) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                ((m12) obj).getClass();
                av8 av8Var18 = (av8) of3Var19;
                if (av8Var18.T(1 & intValue18, (intValue18 & 17) != 16)) {
                    i9a.l(3136, lz.D(R.color.success, av8Var18), av8Var18, l98.f0(utc.a, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), haa.t(R.drawable.ic_transfer_in, 0, av8Var18), oea.v(R.string.squad_change_player_in, av8Var18));
                } else {
                    av8Var18.W();
                }
                break;
            case 20:
                xpa xpaVar11 = (xpa) obj;
                of3 of3Var20 = (of3) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                xpaVar11.getClass();
                if ((intValue19 & 6) == 0) {
                    intValue19 |= ((av8) of3Var20).g(xpaVar11) ? 4 : 2;
                }
                av8 av8Var19 = (av8) of3Var20;
                if (av8Var19.T(1 & intValue19, (intValue19 & 19) != 18)) {
                    j72.h(n9e.q(xpa.a(xpaVar11, utcVar, 7), lz.D(R.color.surface_1, av8Var19), oyn.e), Integer.valueOf(R.drawable.no_data), null, Integer.valueOf(R.string.fantasy_empty_state_player_filter), false, null, 0, 0L, av8Var19, 0, 244);
                } else {
                    av8Var19.W();
                }
                break;
            case 21:
                xpa xpaVar12 = (xpa) obj;
                of3 of3Var21 = (of3) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                xpaVar12.getClass();
                if ((intValue20 & 6) == 0) {
                    intValue20 |= ((av8) of3Var21).g(xpaVar12) ? 4 : 2;
                }
                av8 av8Var20 = (av8) of3Var21;
                if (av8Var20.T(1 & intValue20, (intValue20 & 19) != 18)) {
                    s6a.f(42.0f, 4.0f, 432, 56, 0L, 0L, av8Var20, xpa.a(xpaVar12, utcVar, 7));
                } else {
                    av8Var20.W();
                }
                break;
            case 22:
                ((Integer) obj3).intValue();
                ((r70) obj).getClass();
                s6a.g(0, 1, (of3) obj2, null);
                break;
            case 23:
                of3 of3Var22 = (of3) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var21 = (av8) of3Var22;
                if (av8Var21.T(intValue21 & 1, (intValue21 & 17) != 16)) {
                    rha.b(oea.v(R.string.fantasy_transfers_by_round, av8Var21), l98.f0(utc.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 7), 0L, av8Var21, 48, 4);
                } else {
                    av8Var21.W();
                }
                break;
            case 24:
                of3 of3Var23 = (of3) obj2;
                ((Integer) obj3).getClass();
                ((r70) obj).getClass();
                xtc f03 = l98.f0(utc.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                u23 a2 = t23.a(new ng0(8.0f, true, new a70(6)), uxf.o, of3Var23, 6);
                av8 av8Var22 = (av8) of3Var23;
                int hashCode2 = Long.hashCode(av8Var22.T);
                aee m2 = av8Var22.m();
                xtc C2 = fqj.C(of3Var23, f03);
                if3.k7.getClass();
                zg3 zg3Var2 = hf3.b;
                av8 av8Var23 = (av8) of3Var23;
                av8Var23.h0();
                if (av8Var23.S) {
                    av8Var23.l(zg3Var2);
                } else {
                    av8Var23.q0();
                }
                waa.K(of3Var23, a2, hf3.g);
                waa.K(of3Var23, m2, hf3.f);
                waa.K(of3Var23, Integer.valueOf(hashCode2), hf3.j);
                waa.J(of3Var23, hf3.k);
                waa.K(of3Var23, C2, hf3.d);
                jgb.a(0, of3Var23);
                jgb.a(0, of3Var23);
                av8Var23.s(true);
                break;
            case 25:
                of3 of3Var24 = (of3) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var24 = (av8) of3Var24;
                if (av8Var24.T(intValue22 & 1, (intValue22 & 17) != 16)) {
                    ncf.a(l98.f0(bkh.t(bkh.d(utcVar, 1.0f), 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), lz.D(R.color.primary_default, av8Var24), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, r13.h, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var24, 3078, 52);
                } else {
                    av8Var24.W();
                }
                break;
            case 26:
                of3 of3Var25 = (of3) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var25 = (av8) of3Var25;
                if (av8Var25.T(intValue23 & 1, (intValue23 & 17) != 16)) {
                    fz8.m(R.string.view_all_stats, 0L, av8Var25, 0, 2);
                } else {
                    av8Var25.W();
                }
                break;
            case 27:
                of3 of3Var26 = (of3) obj2;
                int intValue24 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var26 = (av8) of3Var26;
                if (av8Var26.T(intValue24 & 1, (intValue24 & 17) != 16)) {
                    String v3 = oea.v(R.string.referral_program_plus_more, av8Var26);
                    yf8 yf8Var5 = xth.a;
                    udj.c(v3, null, lz.D(R.color.n_lv_3, av8Var26), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.g(), av8Var26, 0, 0, 131066);
                } else {
                    av8Var26.W();
                }
                break;
            case 28:
                of3 of3Var27 = (of3) obj2;
                int intValue25 = ((Integer) obj3).intValue();
                ((n8g) obj).getClass();
                av8 av8Var27 = (av8) of3Var27;
                if (av8Var27.T(intValue25 & 1, (intValue25 & 17) != 16)) {
                    String v4 = oea.v(R.string.button_invite_more_friends, av8Var27);
                    yf8 yf8Var6 = xth.a;
                    udj.c(v4, null, lz.D(R.color.primary_default, av8Var27), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var27, 0, 0, 131066);
                    kq9.b(s6a.N(R.drawable.ic_add_member, 6, av8Var27), null, bkh.l(utcVar, 16.0f), lz.D(R.color.primary_default, av8Var27), av8Var27, 432, 0);
                } else {
                    av8Var27.W();
                }
                break;
            default:
                of3 of3Var28 = (of3) obj2;
                int intValue26 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var28 = (av8) of3Var28;
                if (av8Var28.T(intValue26 & 1, (intValue26 & 17) != 16)) {
                    utc utcVar3 = utc.a;
                    xtc d0 = l98.d0(utcVar3, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                    u23 a3 = t23.a(ww9.d, uxf.o, av8Var28, 0);
                    int hashCode3 = Long.hashCode(av8Var28.T);
                    aee m3 = av8Var28.m();
                    xtc C3 = fqj.C(av8Var28, d0);
                    if3.k7.getClass();
                    zg3 zg3Var3 = hf3.b;
                    av8Var28.h0();
                    if (av8Var28.S) {
                        av8Var28.l(zg3Var3);
                    } else {
                        av8Var28.q0();
                    }
                    waa.K(av8Var28, a3, hf3.g);
                    waa.K(av8Var28, m3, hf3.f);
                    waa.K(av8Var28, Integer.valueOf(hashCode3), hf3.j);
                    waa.J(av8Var28, hf3.k);
                    waa.K(av8Var28, C3, hf3.d);
                    xtc f04 = l98.f0(utcVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 5);
                    String v5 = oea.v(R.string.what_are_the_rules, av8Var28);
                    yf8 yf8Var7 = xth.a;
                    udj.c(v5, f04, lz.D(R.color.n_lv_1, av8Var28), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var28, 48, 0, 131064);
                    udj.c(oea.v(R.string.referral_program_rules, av8Var28), l98.f0(utcVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 5), lz.D(R.color.n_lv_1, av8Var28), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var28, 48, 0, 131064);
                    av8Var28.s(true);
                } else {
                    av8Var28.W();
                }
                break;
        }
        return Unit.a;
    }
}
