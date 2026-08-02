package defpackage;

import com.sofascore.model.fantasy.FantasyNewsArticle;
import com.sofascore.model.newNetwork.statistics.BaseballSeasonPitchesPerspective;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.competition.articles.FantasyNewsArticlesActivity;
import com.sofascore.results.fantasy.competition.home.bottomsheet.topplayers.FantasyTopPlayersBottomSheet;
import com.sofascore.results.league.fragment.details.view.TournamentPreviousWinnersBottomSheet;
import com.sofascore.results.pots.mostAwards.bottomSheet.POTSPlayerAwardsBottomSheet;
import com.sofascore.results.profile.editor.ProfileEditorTournamentsModal;
import com.sofascore.results.weeklyChallenge.WeeklyChallengeViewModel;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class aj implements et8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public aj(List list, ek ekVar) {
        this.a = 2;
        vmd vmdVar = vmd.EVENT_DETAILS;
        this.b = list;
        this.c = ekVar;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = this.a;
        Object obj5 = nf3.a;
        utc utcVar = utc.a;
        Object obj6 = this.b;
        Object obj7 = this.c;
        switch (i19) {
            case 0:
                xpa xpaVar = (xpa) obj;
                int intValue = ((Number) obj2).intValue();
                of3 of3Var = (of3) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i = intValue2 | (((av8) of3Var).g(xpaVar) ? 4 : 2);
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= ((av8) of3Var).e(intValue) ? 32 : 16;
                }
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(i & 1, (i & 147) != 146)) {
                    eld eldVar = (eld) ((List) obj6).get(intValue);
                    av8Var.d0(-642395043);
                    hi.a(eldVar, ((cj) obj7).e, av8Var, 0);
                    av8Var.s(false);
                } else {
                    av8Var.W();
                }
                return Unit.a;
            case 1:
                xpa xpaVar2 = (xpa) obj;
                int intValue3 = ((Number) obj2).intValue();
                of3 of3Var2 = (of3) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    i2 = intValue4 | (((av8) of3Var2).g(xpaVar2) ? 4 : 2);
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i2 |= ((av8) of3Var2).e(intValue3) ? 32 : 16;
                }
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(i2 & 1, (i2 & 147) != 146)) {
                    qj qjVar = (qj) ((List) obj6).get(intValue3);
                    av8Var2.d0(-1396634045);
                    uj ujVar = (uj) obj7;
                    hi.c(qjVar, ujVar.b, ujVar.c, vmd.ADDITIONAL_ODDS, null, av8Var2, 3072, 16);
                    av8Var2.s(false);
                } else {
                    av8Var2.W();
                }
                return Unit.a;
            case 2:
                xpa xpaVar3 = (xpa) obj;
                int intValue5 = ((Number) obj2).intValue();
                of3 of3Var3 = (of3) obj3;
                int intValue6 = ((Number) obj4).intValue();
                if ((intValue6 & 6) == 0) {
                    i3 = intValue6 | (((av8) of3Var3).g(xpaVar3) ? 4 : 2);
                } else {
                    i3 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    i3 |= ((av8) of3Var3).e(intValue5) ? 32 : 16;
                }
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(i3 & 1, (i3 & 147) != 146)) {
                    qj qjVar2 = (qj) ((List) obj6).get(intValue5);
                    av8Var3.d0(-1298764192);
                    ek ekVar = (ek) obj7;
                    hi.c(qjVar2, ekVar.b, ekVar.a, vmd.MONETIZED_ODDS_TAB, l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), av8Var3, 24576, 0);
                    av8Var3.s(false);
                } else {
                    av8Var3.W();
                }
                return Unit.a;
            case 3:
                xpa xpaVar4 = (xpa) obj;
                int intValue7 = ((Number) obj2).intValue();
                of3 of3Var4 = (of3) obj3;
                int intValue8 = ((Number) obj4).intValue();
                if ((intValue8 & 6) == 0) {
                    i4 = intValue8 | (((av8) of3Var4).g(xpaVar4) ? 4 : 2);
                } else {
                    i4 = intValue8;
                }
                if ((intValue8 & 48) == 0) {
                    i4 |= ((av8) of3Var4).e(intValue7) ? 32 : 16;
                }
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(i4 & 1, (i4 & 147) != 146)) {
                    Pair pair = (Pair) ((gv9) obj6).get(intValue7);
                    av8Var4.d0(-1203511821);
                    fqj.d(pair, u0a.F(utcVar, intValue7 == b.i((gv9) obj7) ? icb.c : icb.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var4, 62), av8Var4, 0);
                    av8Var4.s(false);
                } else {
                    av8Var4.W();
                }
                return Unit.a;
            case 4:
                xtc xtcVar = (xtc) obj;
                long j = ((r13) obj2).a;
                of3 of3Var5 = (of3) obj3;
                int intValue9 = ((Number) obj4).intValue();
                xtcVar.getClass();
                if ((intValue9 & 6) == 0) {
                    i5 = intValue9 | (((av8) of3Var5).g(xtcVar) ? 4 : 2);
                } else {
                    i5 = intValue9;
                }
                if ((intValue9 & 48) == 0) {
                    i5 |= ((av8) of3Var5).f(j) ? 32 : 16;
                }
                av8 av8Var5 = (av8) of3Var5;
                if (av8Var5.T(i5 & 1, (i5 & 147) != 146)) {
                    kq9.b(s6a.N(o02.a0((kl1) obj6, (BaseballSeasonPitchesPerspective) obj7), 6, av8Var5), null, l98.c0(utcVar, 16.0f, 2.0f).z(xtcVar), j, av8Var5, ((i5 << 6) & 7168) | 48, 0);
                } else {
                    av8Var5.W();
                }
                return Unit.a;
            case 5:
                xpa xpaVar5 = (xpa) obj;
                int intValue10 = ((Number) obj2).intValue();
                of3 of3Var6 = (of3) obj3;
                int intValue11 = ((Number) obj4).intValue();
                Function1 function1 = (Function1) obj7;
                if ((intValue11 & 6) == 0) {
                    i6 = intValue11 | (((av8) of3Var6).g(xpaVar5) ? 4 : 2);
                } else {
                    i6 = intValue11;
                }
                if ((intValue11 & 48) == 0) {
                    i6 |= ((av8) of3Var6).e(intValue10) ? 32 : 16;
                }
                av8 av8Var6 = (av8) of3Var6;
                if (av8Var6.T(i6 & 1, (i6 & 147) != 146)) {
                    mp6 mp6Var = (mp6) ((ArrayList) obj6).get(intValue10);
                    av8Var6.d0(-930094946);
                    boolean g = av8Var6.g(function1);
                    Object O = av8Var6.O();
                    if (g || O == obj5) {
                        O = new zn6(3, function1);
                        av8Var6.n0(O);
                    }
                    n9e.f(mp6Var, (Function1) O, bkh.l(utcVar, 96.0f), 0L, av8Var6, 384, 8);
                    av8Var6.s(false);
                } else {
                    av8Var6.W();
                }
                return Unit.a;
            case 6:
                xpa xpaVar6 = (xpa) obj;
                int intValue12 = ((Number) obj2).intValue();
                of3 of3Var7 = (of3) obj3;
                int intValue13 = ((Number) obj4).intValue();
                FantasyNewsArticlesActivity fantasyNewsArticlesActivity = (FantasyNewsArticlesActivity) obj7;
                if ((intValue13 & 6) == 0) {
                    i7 = intValue13 | (((av8) of3Var7).g(xpaVar6) ? 4 : 2);
                } else {
                    i7 = intValue13;
                }
                if ((intValue13 & 48) == 0) {
                    i7 |= ((av8) of3Var7).e(intValue12) ? 32 : 16;
                }
                av8 av8Var7 = (av8) of3Var7;
                if (av8Var7.T(i7 & 1, (i7 & 147) != 146)) {
                    FantasyNewsArticle fantasyNewsArticle = (FantasyNewsArticle) ((gv9) obj6).get(intValue12);
                    av8Var7.d0(-1125466862);
                    boolean i20 = av8Var7.i(fantasyNewsArticlesActivity) | av8Var7.i(fantasyNewsArticle);
                    Object O2 = av8Var7.O();
                    if (i20 || O2 == obj5) {
                        O2 = new zi(29, fantasyNewsArticlesActivity, fantasyNewsArticle);
                        av8Var7.n0(O2);
                    }
                    o1j.h(fantasyNewsArticle, (Function1) O2, null, av8Var7, 0);
                    av8Var7.s(false);
                } else {
                    av8Var7.W();
                }
                return Unit.a;
            case 7:
                xpa xpaVar7 = (xpa) obj;
                int intValue14 = ((Number) obj2).intValue();
                of3 of3Var8 = (of3) obj3;
                int intValue15 = ((Number) obj4).intValue();
                if ((intValue15 & 6) == 0) {
                    i8 = intValue15 | (((av8) of3Var8).g(xpaVar7) ? 4 : 2);
                } else {
                    i8 = intValue15;
                }
                if ((intValue15 & 48) == 0) {
                    i8 |= ((av8) of3Var8).e(intValue14) ? 32 : 16;
                }
                av8 av8Var8 = (av8) of3Var8;
                if (av8Var8.T(i8 & 1, (i8 & 147) != 146)) {
                    wn1 wn1Var = (wn1) ((List) obj6).get(intValue14);
                    av8Var8.d0(-1803223806);
                    jca.s(wn1Var, lz.D(R.color.surface_P, av8Var8), ((ll7) obj7).b.A, null, av8Var8, 24576, 8);
                    av8Var8.s(false);
                } else {
                    av8Var8.W();
                }
                return Unit.a;
            case 8:
                xpa xpaVar8 = (xpa) obj;
                int intValue16 = ((Number) obj2).intValue();
                of3 of3Var9 = (of3) obj3;
                int intValue17 = ((Number) obj4).intValue();
                if ((intValue17 & 6) == 0) {
                    i9 = intValue17 | (((av8) of3Var9).g(xpaVar8) ? 4 : 2);
                } else {
                    i9 = intValue17;
                }
                if ((intValue17 & 48) == 0) {
                    i9 |= ((av8) of3Var9).e(intValue16) ? 32 : 16;
                }
                av8 av8Var9 = (av8) of3Var9;
                if (av8Var9.T(i9 & 1, (i9 & 147) != 146)) {
                    dm7 dm7Var = (dm7) ((List) obj6).get(intValue16);
                    av8Var9.d0(435945277);
                    gvd.i(dm7Var, intValue16 + 1, ((Boolean) ((FantasyTopPlayersBottomSheet) obj7).E.getValue()).booleanValue(), xpa.a(xpaVar8, utcVar, 7), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var9, 0, 16);
                    av8Var9.s(false);
                } else {
                    av8Var9.W();
                }
                return Unit.a;
            case 9:
                xpa xpaVar9 = (xpa) obj;
                int intValue18 = ((Number) obj2).intValue();
                of3 of3Var10 = (of3) obj3;
                int intValue19 = ((Number) obj4).intValue();
                rm7 rm7Var = (rm7) obj7;
                if ((intValue19 & 6) == 0) {
                    i10 = intValue19 | (((av8) of3Var10).g(xpaVar9) ? 4 : 2);
                } else {
                    i10 = intValue19;
                }
                if ((intValue19 & 48) == 0) {
                    i10 |= ((av8) of3Var10).e(intValue18) ? 32 : 16;
                }
                av8 av8Var10 = (av8) of3Var10;
                if (av8Var10.T(i10 & 1, (i10 & 147) != 146)) {
                    lj7 lj7Var = (lj7) ((List) obj6).get(intValue18);
                    av8Var10.d0(1789166978);
                    z8e.j(lj7Var, rm7Var.a, rm7Var.e, l98.f0(l98.d0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intValue18 == b.i(rm7Var.b) ? 0.0f : 8.0f, 7), av8Var10, 0);
                    av8Var10.s(false);
                } else {
                    av8Var10.W();
                }
                return Unit.a;
            case 10:
                boolean z = true;
                znh znhVar = (znh) obj7;
                bpa bpaVar = (bpa) obj;
                int intValue20 = ((Number) obj2).intValue();
                of3 of3Var11 = (of3) obj3;
                int intValue21 = ((Number) obj4).intValue();
                if ((intValue21 & 6) == 0) {
                    i11 = intValue21 | (((av8) of3Var11).g(bpaVar) ? 4 : 2);
                } else {
                    i11 = intValue21;
                }
                if ((intValue21 & 48) == 0) {
                    i11 |= ((av8) of3Var11).e(intValue20) ? 32 : 16;
                }
                av8 av8Var11 = (av8) of3Var11;
                if (av8Var11.T(i11 & 1, (i11 & 147) != 146)) {
                    jrj jrjVar = (jrj) ((List) obj6).get(intValue20);
                    av8Var11.d0(1482414836);
                    int i21 = jrjVar.a;
                    String str = jrjVar.b;
                    if (i21 != znhVar.h()) {
                        z = false;
                    }
                    xtc A = wnn.A(bkh.d(utcVar, 1.0f), o7g.a(8.0f));
                    long D = lz.D(R.color.n_lv_4, av8Var11);
                    Object O3 = av8Var11.O();
                    if (O3 == obj5) {
                        O3 = mz1.e(av8Var11);
                    }
                    wzc wzcVar = (wzc) O3;
                    Object[] objArr = new Object[0];
                    Object O4 = av8Var11.O();
                    if (O4 == obj5) {
                        O4 = o67.E;
                        av8Var11.n0(O4);
                    }
                    l4a.b(i21, str, z, tol.y(A, true, true, true, D, wzcVar, new gi(16, (boh) o3a.N(objArr, (Function0) O4, av8Var11, 48), jrjVar, znhVar), av8Var11, 0), av8Var11, 0);
                    av8Var11.s(false);
                } else {
                    av8Var11.W();
                }
                return Unit.a;
            case 11:
                xpa xpaVar10 = (xpa) obj;
                int intValue22 = ((Number) obj2).intValue();
                of3 of3Var12 = (of3) obj3;
                int intValue23 = ((Number) obj4).intValue();
                Function2 function2 = (Function2) obj7;
                if ((intValue23 & 6) == 0) {
                    i12 = intValue23 | (((av8) of3Var12).g(xpaVar10) ? 4 : 2);
                } else {
                    i12 = intValue23;
                }
                if ((intValue23 & 48) == 0) {
                    i12 |= ((av8) of3Var12).e(intValue22) ? 32 : 16;
                }
                av8 av8Var12 = (av8) of3Var12;
                if (av8Var12.T(i12 & 1, (i12 & 147) != 146)) {
                    u28 u28Var = (u28) ((List) obj6).get(intValue22);
                    av8Var12.d0(147787417);
                    boolean g2 = av8Var12.g(function2) | av8Var12.g(u28Var);
                    Object O5 = av8Var12.O();
                    if (g2 || O5 == obj5) {
                        O5 = new j87(26, function2, u28Var);
                        av8Var12.n0(O5);
                    }
                    tol.i(u28Var, (Function1) O5, l98.d0(bkh.d(utcVar, 1.0f), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), av8Var12, 384);
                    w1l.s(utcVar, 16.0f, av8Var12, false);
                } else {
                    av8Var12.W();
                }
                return Unit.a;
            case 12:
                xpa xpaVar11 = (xpa) obj;
                int intValue24 = ((Number) obj2).intValue();
                of3 of3Var13 = (of3) obj3;
                int intValue25 = ((Number) obj4).intValue();
                POTSPlayerAwardsBottomSheet pOTSPlayerAwardsBottomSheet = (POTSPlayerAwardsBottomSheet) obj7;
                if ((intValue25 & 6) == 0) {
                    i13 = intValue25 | (((av8) of3Var13).g(xpaVar11) ? 4 : 2);
                } else {
                    i13 = intValue25;
                }
                if ((intValue25 & 48) == 0) {
                    i13 |= ((av8) of3Var13).e(intValue24) ? 32 : 16;
                }
                av8 av8Var13 = (av8) of3Var13;
                if (av8Var13.T(i13 & 1, (i13 & 147) != 146)) {
                    n2e n2eVar = (n2e) ((gv9) obj6).get(intValue24);
                    av8Var13.d0(-236991146);
                    boolean i22 = av8Var13.i(pOTSPlayerAwardsBottomSheet) | av8Var13.g(n2eVar);
                    Object O6 = av8Var13.O();
                    if (i22 || O6 == obj5) {
                        O6 = new pi(25, pOTSPlayerAwardsBottomSheet, n2eVar);
                        av8Var13.n0(O6);
                    }
                    d2a.d(n2eVar, (Function0) O6, av8Var13, 0);
                    av8Var13.s(false);
                } else {
                    av8Var13.W();
                }
                return Unit.a;
            case 13:
                xpa xpaVar12 = (xpa) obj;
                int intValue26 = ((Number) obj2).intValue();
                of3 of3Var14 = (of3) obj3;
                int intValue27 = ((Number) obj4).intValue();
                Object obj8 = (ProfileEditorTournamentsModal) obj7;
                if ((intValue27 & 6) == 0) {
                    i14 = intValue27 | (((av8) of3Var14).g(xpaVar12) ? 4 : 2);
                } else {
                    i14 = intValue27;
                }
                if ((intValue27 & 48) == 0) {
                    i14 |= ((av8) of3Var14).e(intValue26) ? 32 : 16;
                }
                av8 av8Var14 = (av8) of3Var14;
                if (av8Var14.T(i14 & 1, (i14 & 147) != 146)) {
                    ri5 ri5Var = (ri5) ((List) obj6).get(intValue26);
                    av8Var14.d0(-1979893808);
                    xtc d = bkh.d(n9e.q(utcVar, lz.D(R.color.surface_1, av8Var14), oyn.e), 1.0f);
                    boolean i23 = av8Var14.i(obj8) | av8Var14.g(ri5Var);
                    Object O7 = av8Var14.O();
                    if (i23 || O7 == obj5) {
                        O7 = new pi(28, obj8, ri5Var);
                        av8Var14.n0(O7);
                    }
                    yaa.e(ri5Var, l98.e0(tol.y(d, false, false, false, 0L, null, (Function0) O7, av8Var14, 31), 16.0f, 12.0f, 8.0f, 12.0f), av8Var14, 0);
                    av8Var14.s(false);
                } else {
                    av8Var14.W();
                }
                return Unit.a;
            case 14:
                xpa xpaVar13 = (xpa) obj;
                int intValue28 = ((Number) obj2).intValue();
                of3 of3Var15 = (of3) obj3;
                int intValue29 = ((Number) obj4).intValue();
                if ((intValue29 & 6) == 0) {
                    i15 = intValue29 | (((av8) of3Var15).g(xpaVar13) ? 4 : 2);
                } else {
                    i15 = intValue29;
                }
                if ((intValue29 & 48) == 0) {
                    i15 |= ((av8) of3Var15).e(intValue28) ? 32 : 16;
                }
                av8 av8Var15 = (av8) of3Var15;
                if (av8Var15.T(i15 & 1, (i15 & 147) != 146)) {
                    qbf qbfVar = (qbf) ((List) obj6).get(intValue28);
                    av8Var15.d0(553601912);
                    bea.e((gta) obj7, qbfVar, null, av8Var15, 0);
                    av8Var15.s(false);
                } else {
                    av8Var15.W();
                }
                return Unit.a;
            case 15:
                xpa xpaVar14 = (xpa) obj;
                int intValue30 = ((Number) obj2).intValue();
                of3 of3Var16 = (of3) obj3;
                int intValue31 = ((Number) obj4).intValue();
                rnj rnjVar = ((ynj) obj7).d;
                if ((intValue31 & 6) == 0) {
                    i16 = intValue31 | (((av8) of3Var16).g(xpaVar14) ? 4 : 2);
                } else {
                    i16 = intValue31;
                }
                if ((intValue31 & 48) == 0) {
                    i16 |= ((av8) of3Var16).e(intValue30) ? 32 : 16;
                }
                av8 av8Var16 = (av8) of3Var16;
                if (av8Var16.T(i16 & 1, (i16 & 147) != 146)) {
                    Object obj9 = ((List) obj6).get(intValue30);
                    int i24 = i16 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
                    c71 c71Var = (c71) obj9;
                    av8Var16.d0(1490276590);
                    if (c71Var instanceof vnj) {
                        av8Var16.d0(1490344541);
                        sha.m(((vnj) c71Var).a, null, rnjVar.c, xpa.a(xpaVar14, utcVar, 7), Integer.valueOf(intValue30), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var16, ((i24 << 12) & 458752) | 48, Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE);
                        av8Var16.s(false);
                    } else if (c71Var instanceof tnj) {
                        av8Var16.d0(1490785237);
                        tnj tnjVar = (tnj) c71Var;
                        sha.m(tnjVar.a, tnjVar.b, rnjVar.c, xpa.a(xpaVar14, utcVar, 7), Integer.valueOf(intValue30), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var16, (i24 << 12) & 458752, Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE);
                        av8Var16.s(false);
                    } else {
                        if (!(c71Var instanceof aoj)) {
                            throw dmi.h(av8Var16, -1337399883, false);
                        }
                        av8Var16.d0(1491192701);
                        tz9.q((aoj) c71Var, xpa.a(xpaVar14, utcVar, 7), Integer.valueOf(intValue30), null, av8Var16, (i24 << 3) & 896, 8);
                        av8Var16.s(false);
                    }
                    av8Var16.s(false);
                } else {
                    av8Var16.W();
                }
                return Unit.a;
            case 16:
                xpa xpaVar15 = (xpa) obj;
                int intValue32 = ((Number) obj2).intValue();
                of3 of3Var17 = (of3) obj3;
                int intValue33 = ((Number) obj4).intValue();
                if ((intValue33 & 6) == 0) {
                    i17 = intValue33 | (((av8) of3Var17).g(xpaVar15) ? 4 : 2);
                } else {
                    i17 = intValue33;
                }
                if ((intValue33 & 48) == 0) {
                    i17 |= ((av8) of3Var17).e(intValue32) ? 32 : 16;
                }
                av8 av8Var17 = (av8) of3Var17;
                if (av8Var17.T(i17 & 1, (i17 & 147) != 146)) {
                    xrj xrjVar = (xrj) ((gv9) obj6).get(intValue32);
                    av8Var17.d0(-2051850365);
                    boolean z2 = intValue32 == 0;
                    String str2 = xrjVar.d;
                    String str3 = (String) ((TournamentPreviousWinnersBottomSheet) obj7).y.getValue();
                    str3.getClass();
                    rrj.d(xrjVar, z2, str2, str3, av8Var17, 0);
                    av8Var17.s(false);
                } else {
                    av8Var17.W();
                }
                return Unit.a;
            default:
                xpa xpaVar16 = (xpa) obj;
                int intValue34 = ((Number) obj2).intValue();
                of3 of3Var18 = (of3) obj3;
                int intValue35 = ((Number) obj4).intValue();
                WeeklyChallengeViewModel weeklyChallengeViewModel = (WeeklyChallengeViewModel) obj7;
                if ((intValue35 & 6) == 0) {
                    i18 = intValue35 | (((av8) of3Var18).g(xpaVar16) ? 4 : 2);
                } else {
                    i18 = intValue35;
                }
                if ((intValue35 & 48) == 0) {
                    i18 |= ((av8) of3Var18).e(intValue34) ? 32 : 16;
                }
                av8 av8Var18 = (av8) of3Var18;
                if (av8Var18.T(i18 & 1, (i18 & 147) != 146)) {
                    edk edkVar = (edk) ((ArrayList) obj6).get(intValue34);
                    av8Var18.d0(1726928125);
                    boolean i25 = av8Var18.i(weeklyChallengeViewModel) | av8Var18.g(edkVar);
                    Object O8 = av8Var18.O();
                    if (i25 || O8 == obj5) {
                        O8 = new kmj(1, weeklyChallengeViewModel, edkVar);
                        av8Var18.n0(O8);
                    }
                    jaa.n(edkVar, (Function0) O8, av8Var18, 0);
                    av8Var18.s(false);
                } else {
                    av8Var18.W();
                }
                return Unit.a;
        }
    }

    public /* synthetic */ aj(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
