package defpackage;

import android.app.RemoteAction;
import android.content.ClipData;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.textclassifier.TextClassification;
import com.ironsource.W3;
import com.sofascore.model.Country;
import com.sofascore.model.SeasonSpinnerData;
import com.sofascore.model.Sports;
import com.sofascore.model.UniqueTournamentSeasonsSpinnerData;
import com.sofascore.model.UniqueTournamentSpinnerData;
import com.sofascore.model.mvvm.model.StageSeason;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.newNetwork.TeamTransfersResponse;
import com.sofascore.results.R;
import com.sofascore.results.bettingtips.fragment.TeamStreaksFragment;
import com.sofascore.results.dialog.TeamRatingCalculationInfoBottomSheet;
import com.sofascore.results.dialog.TopStatsCategoryBottomSheet;
import com.sofascore.results.featureWalkthrough.FeatureWalkthroughFullScreenDialog;
import com.sofascore.results.league.fragment.details.compose.model.TeamOfTheWeekFieldUIData;
import com.sofascore.results.league.fragment.details.compose.totr.share.TeamOfTheRoundShareBottomSheet;
import com.sofascore.results.league.fragment.details.compose.totr.share.TotrSharePayload;
import com.sofascore.results.league.fragment.topStats.TopStatsFragment;
import com.sofascore.results.stagesport.fragments.team.StageTeamRankingsFragment;
import com.sofascore.results.team.details.view.TeamAchievementsView;
import com.sofascore.results.team.details.view.TeamInfoView;
import com.sofascore.results.team.details.view.TeamRecentFormView;
import com.sofascore.results.team.details.view.TennisGrandSlamPerformanceView;
import com.sofascore.results.team.lastnext.calendar.monthpicker.TeamEventsCalendarMonthPickerBottomSheet;
import com.sofascore.results.team.squad.TeamSquadFragment;
import com.sofascore.results.team.statistics.TeamSeasonStatisticsFragment;
import com.sofascore.results.team.topplayers.TeamTopPlayersFragment;
import com.sofascore.results.team.transfers.TeamTransfersModal;
import com.sofascore.results.tv.TVChannelEditorActivity;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class q8i implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q8i(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        UniqueTournamentSpinnerData uniqueTournament;
        int i2 = this.a;
        utc utcVar = utc.a;
        a99 a99Var = nf3.a;
        int i3 = 2;
        final int i4 = 1;
        Object obj3 = this.b;
        switch (i2) {
            case 0:
                StageTeamRankingsFragment stageTeamRankingsFragment = (StageTeamRankingsFragment) obj3;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    List<StageSeason> list = (List) ((eoh) stageTeamRankingsFragment.A).getValue();
                    ArrayList arrayList = new ArrayList(k13.r(list, 10));
                    for (StageSeason stageSeason : list) {
                        arrayList.add(new oxh(stageSeason, c.r(stageSeason.getDescription(), dmi.q(" ", stageSeason.getYear()), " • " + stageSeason.getYear(), false), null, null, null, false, 252));
                    }
                    gv9 W = l6g.W(arrayList);
                    Iterator<E> it = W.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (Intrinsics.c(((oxh) next).a, (StageSeason) ((eoh) stageTeamRankingsFragment.B).getValue())) {
                                r8 = next;
                            }
                        }
                    }
                    oxh oxhVar = (oxh) r8;
                    boolean i5 = av8Var.i(stageTeamRankingsFragment);
                    Object O = av8Var.O();
                    if (i5 || O == a99Var) {
                        O = new p8i(stageTeamRankingsFragment, i3);
                        av8Var.n0(O);
                    }
                    r4a.j(W, oxhVar, (Function1) O, null, null, false, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 0, W3.l);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                cai caiVar = (cai) obj3;
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    int ordinal = caiVar.ordinal();
                    if (ordinal == 0) {
                        i = R.string.standings_short;
                    } else if (ordinal == 1) {
                        i = R.string.standings_full;
                    } else if (ordinal != 2) {
                        zzl.b();
                        break;
                    } else {
                        i = R.string.standings_form;
                    }
                    g7a.a(i, 0, av8Var2);
                } else {
                    av8Var2.W();
                }
                break;
            case 2:
                String str = (String) obj;
                List list2 = (List) obj2;
                str.getClass();
                list2.getClass();
                ((t01) obj3).r(str, list2);
                break;
            case 3:
                p95 p95Var = new p95(0);
                float f = (int) (((c7a) obj).a >> 32);
                p95Var.a(fpi.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                p95Var.a(fpi.a, f);
                p95Var.a(fpi.b, -f);
                Unit unit = Unit.a;
                ArrayList arrayList2 = p95Var.a;
                float[] fArr = p95Var.b;
                int size = arrayList2.size();
                jh0.a(size, fArr.length);
                float[] copyOfRange = Arrays.copyOfRange(fArr, 0, size);
                copyOfRange.getClass();
                break;
            case 4:
                TVChannelEditorActivity tVChannelEditorActivity = (TVChannelEditorActivity) obj3;
                e1d e1dVar = tVChannelEditorActivity.M;
                of3 of3Var3 = (of3) obj;
                int intValue3 = ((Integer) obj2).intValue();
                int i6 = TVChannelEditorActivity.N;
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Country country = (Country) ((eoh) e1dVar).getValue();
                    Country country2 = (Country) ((eoh) e1dVar).getValue();
                    oxh oxhVar2 = new oxh(country, tv3.c(tVChannelEditorActivity, country2 != null ? country2.getName() : null), yqo.H(-644478455, av8Var3, new rri(tVChannelEditorActivity, 1)), null, null, false, 248);
                    boolean i7 = av8Var3.i(tVChannelEditorActivity);
                    Object O2 = av8Var3.O();
                    if (i7 || O2 == a99Var) {
                        O2 = new pri(tVChannelEditorActivity, i3);
                        av8Var3.n0(O2);
                    }
                    r4a.k(oxhVar2, (Function0) O2, null, null, false, new t3e(8.0f, 8.0f, 8.0f, 8.0f), av8Var3, 196608, 28);
                } else {
                    av8Var3.W();
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                int i8 = TeamAchievementsView.m;
                ((TeamAchievementsView) obj3).a(aba.K(1), (of3) obj);
                break;
            case 6:
                TeamEventsCalendarMonthPickerBottomSheet teamEventsCalendarMonthPickerBottomSheet = (TeamEventsCalendarMonthPickerBottomSheet) obj3;
                of3 of3Var4 = (of3) obj;
                int intValue4 = ((Integer) obj2).intValue();
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(intValue4 & 1, (intValue4 & 3) != 2)) {
                    jwi jwiVar = (jwi) teamEventsCalendarMonthPickerBottomSheet.C.getValue();
                    boolean i9 = av8Var4.i(teamEventsCalendarMonthPickerBottomSheet);
                    Object O3 = av8Var4.O();
                    if (i9 || O3 == a99Var) {
                        O3 = new g2i(teamEventsCalendarMonthPickerBottomSheet, 18);
                        av8Var4.n0(O3);
                    }
                    wba.h(jwiVar, (Function1) O3, null, av8Var4, 0);
                } else {
                    av8Var4.W();
                }
                break;
            case 7:
                jxi jxiVar = (jxi) obj3;
                of3 of3Var5 = (of3) obj;
                int intValue5 = ((Integer) obj2).intValue();
                av8 av8Var5 = (av8) of3Var5;
                if (av8Var5.T(intValue5 & 1, (intValue5 & 3) != 2)) {
                    td4.z(jxiVar.a, bkh.l(utcVar, 32.0f), av8Var5, 48);
                } else {
                    av8Var5.W();
                }
                break;
            case 8:
                ixi ixiVar = (ixi) obj3;
                of3 of3Var6 = (of3) obj;
                int intValue6 = ((Integer) obj2).intValue();
                av8 av8Var6 = (av8) of3Var6;
                if (av8Var6.T(intValue6 & 1, (intValue6 & 3) != 2)) {
                    td4.k(ixiVar.b, bkh.l(utcVar, 32.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, av8Var6, 48, 12);
                } else {
                    av8Var6.W();
                }
                break;
            case 9:
                ((Integer) obj2).getClass();
                int i10 = TeamInfoView.l;
                ((TeamInfoView) obj3).a(aba.K(1), (of3) obj);
                break;
            case 10:
                final TeamOfTheRoundShareBottomSheet teamOfTheRoundShareBottomSheet = (TeamOfTheRoundShareBottomSheet) obj3;
                of3 of3Var7 = (of3) obj;
                int intValue7 = ((Integer) obj2).intValue();
                av8 av8Var7 = (av8) of3Var7;
                if (av8Var7.T(intValue7 & 1, (intValue7 & 3) != 2)) {
                    TotrSharePayload totrSharePayload = (TotrSharePayload) teamOfTheRoundShareBottomSheet.x.getValue();
                    boolean i11 = av8Var7.i(teamOfTheRoundShareBottomSheet);
                    Object O4 = av8Var7.O();
                    if (i11 || O4 == a99Var) {
                        final int i12 = r10 ? 1 : 0;
                        O4 = new Function1() { // from class: vxi
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                switch (i12) {
                                    case 0:
                                        Bitmap bitmap = (Bitmap) obj4;
                                        bitmap.getClass();
                                        TeamOfTheRoundShareBottomSheet teamOfTheRoundShareBottomSheet2 = teamOfTheRoundShareBottomSheet;
                                        TotrSharePayload totrSharePayload2 = (TotrSharePayload) teamOfTheRoundShareBottomSheet2.x.getValue();
                                        Context requireContext = teamOfTheRoundShareBottomSheet2.requireContext();
                                        requireContext.getClass();
                                        String str2 = totrSharePayload2.g;
                                        int i13 = totrSharePayload2.e;
                                        nv.t0(requireContext, str2, StatusKt.STATUS_FINISHED, i13, "team_of_the_period");
                                        String string = requireContext.getString(R.string.share_link);
                                        string.getClass();
                                        List j = b.j(totrSharePayload2.h, "tournament", totrSharePayload2.i, totrSharePayload2.j, String.valueOf(i13));
                                        ArrayList arrayList3 = new ArrayList();
                                        for (Object obj5 : j) {
                                            if (!StringsKt.R((String) obj5)) {
                                                arrayList3.add(obj5);
                                            }
                                        }
                                        String f0 = CollectionsKt.f0(arrayList3, "/", null, null, null, 62);
                                        String W2 = StringsKt.W(string, "/");
                                        int i14 = totrSharePayload2.k;
                                        int i15 = totrSharePayload2.l;
                                        StringBuilder sb = new StringBuilder(W2);
                                        sb.append("/");
                                        sb.append(f0);
                                        sb.append("#id:");
                                        sb.append(i14);
                                        xw3.L(wca.x(teamOfTheRoundShareBottomSheet2.getLifecycle()), null, null, new h10(requireContext, bitmap, totrSharePayload2, me4.g(i15, ",pid:", sb), teamOfTheRoundShareBottomSheet2, null, 29), 3);
                                        break;
                                    default:
                                        Bitmap bitmap2 = (Bitmap) obj4;
                                        bitmap2.getClass();
                                        TeamOfTheRoundShareBottomSheet teamOfTheRoundShareBottomSheet3 = teamOfTheRoundShareBottomSheet;
                                        Context requireContext2 = teamOfTheRoundShareBottomSheet3.requireContext();
                                        requireContext2.getClass();
                                        joa joaVar = teamOfTheRoundShareBottomSheet3.x;
                                        nv.x(requireContext2, ((TotrSharePayload) joaVar.getValue()).g, StatusKt.STATUS_FINISHED, ((TotrSharePayload) joaVar.getValue()).e, "team_of_the_period");
                                        xw3.L(wca.x(teamOfTheRoundShareBottomSheet3.getLifecycle()), null, null, new h4i(requireContext2, bitmap2, teamOfTheRoundShareBottomSheet3, (rq3) null, 12), 3);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        av8Var7.n0(O4);
                    }
                    Function1 function1 = (Function1) O4;
                    boolean i13 = av8Var7.i(teamOfTheRoundShareBottomSheet);
                    Object O5 = av8Var7.O();
                    if (i13 || O5 == a99Var) {
                        final int i14 = 1;
                        O5 = new Function1() { // from class: vxi
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                switch (i14) {
                                    case 0:
                                        Bitmap bitmap = (Bitmap) obj4;
                                        bitmap.getClass();
                                        TeamOfTheRoundShareBottomSheet teamOfTheRoundShareBottomSheet2 = teamOfTheRoundShareBottomSheet;
                                        TotrSharePayload totrSharePayload2 = (TotrSharePayload) teamOfTheRoundShareBottomSheet2.x.getValue();
                                        Context requireContext = teamOfTheRoundShareBottomSheet2.requireContext();
                                        requireContext.getClass();
                                        String str2 = totrSharePayload2.g;
                                        int i132 = totrSharePayload2.e;
                                        nv.t0(requireContext, str2, StatusKt.STATUS_FINISHED, i132, "team_of_the_period");
                                        String string = requireContext.getString(R.string.share_link);
                                        string.getClass();
                                        List j = b.j(totrSharePayload2.h, "tournament", totrSharePayload2.i, totrSharePayload2.j, String.valueOf(i132));
                                        ArrayList arrayList3 = new ArrayList();
                                        for (Object obj5 : j) {
                                            if (!StringsKt.R((String) obj5)) {
                                                arrayList3.add(obj5);
                                            }
                                        }
                                        String f0 = CollectionsKt.f0(arrayList3, "/", null, null, null, 62);
                                        String W2 = StringsKt.W(string, "/");
                                        int i142 = totrSharePayload2.k;
                                        int i15 = totrSharePayload2.l;
                                        StringBuilder sb = new StringBuilder(W2);
                                        sb.append("/");
                                        sb.append(f0);
                                        sb.append("#id:");
                                        sb.append(i142);
                                        xw3.L(wca.x(teamOfTheRoundShareBottomSheet2.getLifecycle()), null, null, new h10(requireContext, bitmap, totrSharePayload2, me4.g(i15, ",pid:", sb), teamOfTheRoundShareBottomSheet2, null, 29), 3);
                                        break;
                                    default:
                                        Bitmap bitmap2 = (Bitmap) obj4;
                                        bitmap2.getClass();
                                        TeamOfTheRoundShareBottomSheet teamOfTheRoundShareBottomSheet3 = teamOfTheRoundShareBottomSheet;
                                        Context requireContext2 = teamOfTheRoundShareBottomSheet3.requireContext();
                                        requireContext2.getClass();
                                        joa joaVar = teamOfTheRoundShareBottomSheet3.x;
                                        nv.x(requireContext2, ((TotrSharePayload) joaVar.getValue()).g, StatusKt.STATUS_FINISHED, ((TotrSharePayload) joaVar.getValue()).e, "team_of_the_period");
                                        xw3.L(wca.x(teamOfTheRoundShareBottomSheet3.getLifecycle()), null, null, new h4i(requireContext2, bitmap2, teamOfTheRoundShareBottomSheet3, (rq3) null, 12), 3);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        av8Var7.n0(O5);
                    }
                    mha.g(totrSharePayload, function1, (Function1) O5, av8Var7, 0);
                } else {
                    av8Var7.W();
                }
                break;
            case 11:
                TotrSharePayload totrSharePayload2 = (TotrSharePayload) obj3;
                of3 of3Var8 = (of3) obj;
                int intValue8 = ((Integer) obj2).intValue();
                av8 av8Var8 = (av8) of3Var8;
                if (av8Var8.T(intValue8 & 1, (intValue8 & 3) != 2)) {
                    xtc q = n9e.q(bkh.d(utcVar, 1.0f), lz.D(R.color.surface_1, av8Var8), oyn.e);
                    TeamOfTheWeekFieldUIData teamOfTheWeekFieldUIData = totrSharePayload2.a;
                    String str2 = teamOfTheWeekFieldUIData.a;
                    String str3 = teamOfTheWeekFieldUIData.a;
                    if (Intrinsics.c(str2, Sports.FOOTBALL)) {
                        q = q.z(bkh.e(utcVar, 422.0f));
                    }
                    if (Intrinsics.c(str3, Sports.BASKETBALL)) {
                        q = q.z(qx9.p(utcVar, 1.089f));
                    }
                    k1c c = e12.c(uxf.c, false);
                    int hashCode = Long.hashCode(av8Var8.T);
                    aee m = av8Var8.m();
                    xtc C = fqj.C(av8Var8, q);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var8.h0();
                    if (av8Var8.S) {
                        av8Var8.l(zg3Var);
                    } else {
                        av8Var8.q0();
                    }
                    waa.K(av8Var8, c, hf3.g);
                    waa.K(av8Var8, m, hf3.f);
                    waa.K(av8Var8, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var8, hf3.k);
                    waa.K(av8Var8, C, hf3.d);
                    if (Intrinsics.c(str3, Sports.FOOTBALL)) {
                        av8Var8.d0(933706137);
                        wnn.o(n12.a.b(utcVar), false, lz.D(R.color.surface_1, av8Var8), false, false, av8Var8, 48, 24);
                        av8Var8.s(false);
                    } else if (Intrinsics.c(str3, Sports.BASKETBALL)) {
                        av8Var8.d0(933713863);
                        ktm.b(0, av8Var8);
                        av8Var8.s(false);
                    } else {
                        av8Var8.d0(-1119591748);
                        av8Var8.s(false);
                    }
                    Object O6 = av8Var8.O();
                    if (O6 == a99Var) {
                        O6 = new rfi(28);
                        av8Var8.n0(O6);
                    }
                    rha.h(teamOfTheWeekFieldUIData, (Function1) O6, av8Var8, 48);
                    av8Var8.s(true);
                } else {
                    av8Var8.W();
                }
                break;
            case 12:
                final TeamRatingCalculationInfoBottomSheet teamRatingCalculationInfoBottomSheet = (TeamRatingCalculationInfoBottomSheet) obj3;
                of3 of3Var9 = (of3) obj;
                int intValue9 = ((Integer) obj2).intValue();
                av8 av8Var9 = (av8) of3Var9;
                if (av8Var9.T(intValue9 & 1, (intValue9 & 3) != 2)) {
                    boolean i15 = av8Var9.i(teamRatingCalculationInfoBottomSheet);
                    Object O7 = av8Var9.O();
                    if (i15 || O7 == a99Var) {
                        final int i16 = r10 ? 1 : 0;
                        O7 = new Function0() { // from class: uyi
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i17 = i16;
                                TeamRatingCalculationInfoBottomSheet teamRatingCalculationInfoBottomSheet2 = teamRatingCalculationInfoBottomSheet;
                                switch (i17) {
                                    case 0:
                                        ut7 ut7Var = ut7.a;
                                        FeatureWalkthroughFullScreenDialog featureWalkthroughFullScreenDialog = new FeatureWalkthroughFullScreenDialog();
                                        featureWalkthroughFullScreenDialog.setArguments(hz8.E(new Pair("TYPE", ut7.e)));
                                        featureWalkthroughFullScreenDialog.p(teamRatingCalculationInfoBottomSheet2.requireActivity().k(), "FeatureWalkthroughFullScreenDialog");
                                        teamRatingCalculationInfoBottomSheet2.j();
                                        break;
                                    default:
                                        teamRatingCalculationInfoBottomSheet2.j();
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        av8Var9.n0(O7);
                    }
                    Function0 function0 = (Function0) O7;
                    boolean i17 = av8Var9.i(teamRatingCalculationInfoBottomSheet);
                    Object O8 = av8Var9.O();
                    if (i17 || O8 == a99Var) {
                        O8 = new Function0() { // from class: uyi
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i172 = i4;
                                TeamRatingCalculationInfoBottomSheet teamRatingCalculationInfoBottomSheet2 = teamRatingCalculationInfoBottomSheet;
                                switch (i172) {
                                    case 0:
                                        ut7 ut7Var = ut7.a;
                                        FeatureWalkthroughFullScreenDialog featureWalkthroughFullScreenDialog = new FeatureWalkthroughFullScreenDialog();
                                        featureWalkthroughFullScreenDialog.setArguments(hz8.E(new Pair("TYPE", ut7.e)));
                                        featureWalkthroughFullScreenDialog.p(teamRatingCalculationInfoBottomSheet2.requireActivity().k(), "FeatureWalkthroughFullScreenDialog");
                                        teamRatingCalculationInfoBottomSheet2.j();
                                        break;
                                    default:
                                        teamRatingCalculationInfoBottomSheet2.j();
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        av8Var9.n0(O8);
                    }
                    tz9.p(0, av8Var9, null, function0, (Function0) O8);
                } else {
                    av8Var9.W();
                }
                break;
            case 13:
                ((Integer) obj2).getClass();
                int i18 = TeamRecentFormView.l;
                ((TeamRecentFormView) obj3).a(aba.K(1), (of3) obj);
                break;
            case 14:
                TeamSeasonStatisticsFragment teamSeasonStatisticsFragment = (TeamSeasonStatisticsFragment) obj3;
                String str4 = (String) obj;
                ((Integer) obj2).getClass();
                str4.getClass();
                teamSeasonStatisticsFragment.E().s();
                UniqueTournamentSeasonsSpinnerData G = teamSeasonStatisticsFragment.G();
                Integer valueOf = (G == null || (uniqueTournament = G.getUniqueTournament()) == null) ? null : Integer.valueOf(uniqueTournament.getId());
                SeasonSpinnerData F = teamSeasonStatisticsFragment.F();
                Integer valueOf2 = F != null ? Integer.valueOf(F.getId()) : null;
                if (valueOf != null && valueOf2 != null) {
                    int intValue10 = valueOf2.intValue();
                    int intValue11 = valueOf.intValue();
                    y0j L = teamSeasonStatisticsFragment.L();
                    String H = teamSeasonStatisticsFragment.H();
                    int id = teamSeasonStatisticsFragment.I().getId();
                    SeasonSpinnerData F2 = teamSeasonStatisticsFragment.F();
                    String year = F2 != null ? F2.getYear() : null;
                    H.getClass();
                    L.k.j(km5.a);
                    xw3.L(un0.z(L), null, null, new x0j(year, L, intValue11, intValue10, H, id, str4, null), 3);
                    teamSeasonStatisticsFragment.D().v = Integer.valueOf(intValue11);
                    teamSeasonStatisticsFragment.D().w = Integer.valueOf(intValue10);
                    teamSeasonStatisticsFragment.D().x = str4;
                }
                break;
            case 15:
                TeamSquadFragment teamSquadFragment = (TeamSquadFragment) obj3;
                of3 of3Var10 = (of3) obj;
                int intValue12 = ((Integer) obj2).intValue();
                av8 av8Var10 = (av8) of3Var10;
                if (av8Var10.T(intValue12 & 1, (intValue12 & 3) != 2)) {
                    x2a.m((g2j) teamSquadFragment.r.getValue(), (n52) teamSquadFragment.s.getValue(), av8Var10, 0);
                } else {
                    av8Var10.W();
                }
                break;
            case 16:
                ((Integer) obj2).getClass();
                i2a.j((o0) obj3, (of3) obj, aba.K(1));
                break;
            case 17:
                TeamStreaksFragment teamStreaksFragment = (TeamStreaksFragment) obj3;
                of3 of3Var11 = (of3) obj;
                int intValue13 = ((Integer) obj2).intValue();
                av8 av8Var11 = (av8) of3Var11;
                if (av8Var11.T(intValue13 & 1, (intValue13 & 3) != 2)) {
                    List<m2j> list3 = (List) ((eoh) teamStreaksFragment.z).getValue();
                    ArrayList arrayList3 = new ArrayList(k13.r(list3, 10));
                    for (m2j m2jVar : list3) {
                        Context requireContext = teamStreaksFragment.requireContext();
                        requireContext.getClass();
                        arrayList3.add(new oxh(m2jVar, v8a.z(requireContext, m2jVar.b), null, null, null, false, 252));
                    }
                    gv9 W2 = l6g.W(arrayList3);
                    Iterator<E> it2 = W2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Object next2 = it2.next();
                            if (Intrinsics.c(((oxh) next2).a, (m2j) ((eoh) teamStreaksFragment.A).getValue())) {
                                r8 = next2;
                            }
                        }
                    }
                    oxh oxhVar3 = (oxh) r8;
                    boolean i19 = av8Var11.i(teamStreaksFragment);
                    Object O9 = av8Var11.O();
                    if (i19 || O9 == a99Var) {
                        O9 = new q2j(teamStreaksFragment, i4);
                        av8Var11.n0(O9);
                    }
                    r4a.j(W2, oxhVar3, (Function1) O9, null, null, false, new t3e(8.0f, 8.0f, 8.0f, 8.0f), false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var11, 12582912, 888);
                } else {
                    av8Var11.W();
                }
                break;
            case 18:
                TeamTopPlayersFragment teamTopPlayersFragment = (TeamTopPlayersFragment) obj3;
                of3 of3Var12 = (of3) obj;
                int intValue14 = ((Integer) obj2).intValue();
                av8 av8Var12 = (av8) of3Var12;
                if (av8Var12.T(intValue14 & 1, (intValue14 & 3) != 2)) {
                    n3j n3jVar = (n3j) teamTopPlayersFragment.r.getValue();
                    String str5 = (String) teamTopPlayersFragment.t.getValue();
                    str5.getClass();
                    l3j.b(str5, n3jVar, (n52) teamTopPlayersFragment.w.getValue(), (String) teamTopPlayersFragment.u.getValue(), av8Var12, 0);
                } else {
                    av8Var12.W();
                }
                break;
            case 19:
                String str6 = (String) obj;
                ((Integer) obj2).getClass();
                str6.getClass();
                q3j q3jVar = (q3j) ((TeamTransfersModal) obj3).B.getValue();
                q3jVar.h = Boolean.parseBoolean(str6);
                TeamTransfersResponse teamTransfersResponse = q3jVar.g;
                if (teamTransfersResponse != null) {
                    q3jVar.i.j(q3jVar.l(teamTransfersResponse));
                } else {
                    q3jVar.k();
                }
                break;
            case 20:
                ((Integer) obj2).getClass();
                y6a.j((l4j) obj3, (of3) obj, aba.K(1));
                break;
            case 21:
                h4j h4jVar = (h4j) obj3;
                of3 of3Var13 = (of3) obj;
                int intValue15 = ((Integer) obj2).intValue();
                av8 av8Var13 = (av8) of3Var13;
                if (av8Var13.T(intValue15 & 1, (intValue15 & 3) != 2)) {
                    td4.y(h4jVar.c, 48, 12, av8Var13, bkh.l(utcVar, 24.0f), null, false);
                } else {
                    av8Var13.W();
                }
                break;
            case 22:
                ((Integer) obj2).getClass();
                y6a.n((Integer) obj3, (of3) obj, aba.K(1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                int i20 = TennisGrandSlamPerformanceView.l;
                ((TennisGrandSlamPerformanceView) obj3).a(aba.K(1), (of3) obj);
                break;
            case 24:
                ((Integer) obj2).getClass();
                av8 av8Var14 = (av8) ((of3) obj);
                av8Var14.d0(950061013);
                String valueOf3 = String.valueOf(((TextClassification) obj3).getLabel());
                av8Var14.s(false);
                break;
            case 25:
                ((Integer) obj2).intValue();
                av8 av8Var15 = (av8) ((of3) obj);
                av8Var15.d0(-1376593684);
                String obj4 = ((RemoteAction) obj3).getTitle().toString();
                av8Var15.s(false);
                break;
            case 26:
                caj cajVar = (caj) obj3;
                cajVar.p1();
                cajVar.s.b();
                ClipData clipData = ((gy2) obj).a;
                int itemCount = clipData.getItemCount();
                int i21 = 0;
                boolean z = false;
                while (i21 < itemCount) {
                    boolean z2 = z || clipData.getItemAt(i21).getText() != null;
                    i21++;
                    z = z2;
                }
                if (z) {
                    StringBuilder sb = new StringBuilder();
                    int itemCount2 = clipData.getItemCount();
                    int i22 = 0;
                    boolean z3 = false;
                    while (i22 < itemCount2) {
                        CharSequence text = clipData.getItemAt(i22).getText();
                        if (text != null) {
                            if (z3) {
                                sb.append("\n");
                            }
                            sb.append(text);
                            z3 = true;
                        }
                        i22++;
                        z3 = z3;
                    }
                    r8 = sb.toString();
                }
                upf.a(cajVar);
                if (r8 != null) {
                    jwj.h(cajVar.q, r8, false, 14);
                }
                break;
            case 27:
                ((Integer) obj2).getClass();
                ((hej) obj3).a(aba.K(1), (of3) obj);
                break;
            case 28:
                TopStatsCategoryBottomSheet topStatsCategoryBottomSheet = (TopStatsCategoryBottomSheet) obj3;
                of3 of3Var14 = (of3) obj;
                int intValue16 = ((Integer) obj2).intValue();
                av8 av8Var16 = (av8) of3Var14;
                if (av8Var16.T(intValue16 & 1, (intValue16 & 3) != 2)) {
                    ktm.t((vnb) rfo.x(topStatsCategoryBottomSheet.N().f, av8Var16, 0).getValue(), null, false, null, null, yqo.H(1129049922, av8Var16, new uri(topStatsCategoryBottomSheet, 12)), av8Var16, 196608, 30);
                } else {
                    av8Var16.W();
                }
                break;
            default:
                TopStatsFragment topStatsFragment = (TopStatsFragment) obj3;
                of3 of3Var15 = (of3) obj;
                int intValue17 = ((Integer) obj2).intValue();
                av8 av8Var17 = (av8) of3Var15;
                if (av8Var17.T(intValue17 & 1, (intValue17 & 3) != 2)) {
                    vha.e((String) topStatsFragment.u.getValue(), (koj) topStatsFragment.s.getValue(), ((Boolean) topStatsFragment.v.getValue()).booleanValue(), av8Var17, 0);
                } else {
                    av8Var17.W();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ q8i(Object obj, int i, int i2) {
        this.a = i2;
        this.b = obj;
    }
}
