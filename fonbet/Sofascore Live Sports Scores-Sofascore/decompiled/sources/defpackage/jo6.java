package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.ironsource.W3;
import com.sofascore.model.chat.Message;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.competition.chat.FantasyCompetitionChatFragment;
import com.sofascore.results.fantasy.competition.home.FantasyCompetitionHomeFragment;
import com.sofascore.results.fantasy.competition.home.bottomsheet.playeroftheround.FantasyPlayersOfTheRoundBottomSheet;
import com.sofascore.results.fantasy.competition.leaderboard.FantasyCompetitionLeaderboardFragment;
import com.sofascore.results.fantasy.competition.leagues.FantasyCompetitionLeaguesFragment;
import com.sofascore.results.fantasy.competition.selector.FantasyCompetitionSelectorBottomSheet;
import com.sofascore.results.fantasy.competition.statistics.FantasyCompetitionStatisticsFragment;
import com.sofascore.results.fantasy.competition.team.FantasyCompetitionMyTeamFragment;
import com.sofascore.results.fantasy.finished.FantasyFinishedCompetitionsActivity;
import com.sofascore.results.fantasy.highlights.gameweek.points.FantasyGameweekHighlightsPointsFragment;
import com.sofascore.results.fantasy.highlights.gameweek.potgw.FantasyGameweekHighlightsPOTGWFragment;
import com.sofascore.results.fantasy.highlights.gameweek.rankings.FantasyGameweekHighlightsRankingsFragment;
import com.sofascore.results.fantasy.highlights.gameweek.totgw.FantasyGameweekHighlightsTOTGWFragment;
import com.sofascore.results.fantasy.league.leaderboard.FantasyLeagueLeaderboardFragment;
import com.sofascore.results.fantasy.league.leaderboard.components.FantasyLeaderboardLegendBottomSheet;
import com.sofascore.results.fantasy.league.matchups.FantasyLeagueMatchupsFragment;
import com.sofascore.results.fantasy.league.settings.bottomsheet.invite.FantasyInviteToLeagueBottomSheet;
import com.sofascore.results.fantasy.ui.components.FantasyLeaderboardStatistic;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.sofascore.results.fantasy.userteam.FantasyUserSquadActivity;
import com.sofascore.results.main.fantasy.center.elitefaceoff.FantasyEliteFaceoffIntroBottomSheet;
import com.sofascore.results.player.PlayerActivity;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class jo6 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jo6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        rz6 rz6Var;
        int i = this.a;
        utc utcVar = utc.a;
        a99 a99Var = nf3.a;
        String str = null;
        Object obj3 = this.b;
        final int i2 = 1;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                pco.h((lo6) obj3, (of3) obj, aba.K(1));
                break;
            case 1:
                FantasyCompetitionChatFragment fantasyCompetitionChatFragment = (FantasyCompetitionChatFragment) obj3;
                Message message = (Message) obj;
                bq2 bq2Var = (bq2) obj2;
                message.getClass();
                bq2Var.getClass();
                Context requireContext = fantasyCompetitionChatFragment.requireContext();
                requireContext.getClass();
                ur2.a(requireContext, fantasyCompetitionChatFragment.L(), bq2Var, message, fantasyCompetitionChatFragment.K());
                break;
            case 2:
                FantasyCompetitionHomeFragment fantasyCompetitionHomeFragment = (FantasyCompetitionHomeFragment) obj3;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    gr6.b((nr6) fantasyCompetitionHomeFragment.r.getValue(), (hp6) fantasyCompetitionHomeFragment.s.getValue(), av8Var, 0);
                } else {
                    av8Var.W();
                }
                break;
            case 3:
                final FantasyCompetitionLeaderboardFragment fantasyCompetitionLeaderboardFragment = (FantasyCompetitionLeaderboardFragment) obj3;
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    osa a = rsa.a(fantasyCompetitionLeaderboardFragment.D().j, av8Var2);
                    a37 n = fantasyCompetitionLeaderboardFragment.D().n();
                    ev6 ev6Var = fantasyCompetitionLeaderboardFragment.D().k;
                    boolean z = fantasyCompetitionLeaderboardFragment.D().k.o < yaa.w();
                    qr6 D = fantasyCompetitionLeaderboardFragment.D();
                    boolean i3 = av8Var2.i(D);
                    Object O = av8Var2.O();
                    if (i3 || O == a99Var) {
                        s26 s26Var = new s26(1, D, qr6.class, "changeRound", "changeRound(Lcom/sofascore/results/fantasy/shared/BasicRoundData;)V", 0, 3);
                        av8Var2.n0(s26Var);
                        O = s26Var;
                    }
                    Function1 function1 = (Function1) ((KFunction) O);
                    boolean i4 = av8Var2.i(fantasyCompetitionLeaderboardFragment);
                    Object O2 = av8Var2.O();
                    if (i4 || O2 == a99Var) {
                        final int i5 = r9 ? 1 : 0;
                        O2 = new Function1() { // from class: or6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                int i6 = i5;
                                rq3 rq3Var = null;
                                FantasyCompetitionLeaderboardFragment fantasyCompetitionLeaderboardFragment2 = fantasyCompetitionLeaderboardFragment;
                                switch (i6) {
                                    case 0:
                                        eo7 eo7Var = (eo7) obj4;
                                        eo7Var.getClass();
                                        int i7 = FantasyUserSquadActivity.N;
                                        Context requireContext2 = fantasyCompetitionLeaderboardFragment2.requireContext();
                                        requireContext2.getClass();
                                        p4h.y(requireContext2, fantasyCompetitionLeaderboardFragment2.D().k.c, fantasyCompetitionLeaderboardFragment2.D().k.d, eo7Var.e, null);
                                        break;
                                    default:
                                        gv9 gv9Var = (gv9) obj4;
                                        gv9Var.getClass();
                                        FragmentActivity requireActivity = fantasyCompetitionLeaderboardFragment2.requireActivity();
                                        requireActivity.getClass();
                                        FantasyLeaderboardLegendBottomSheet fantasyLeaderboardLegendBottomSheet = new FantasyLeaderboardLegendBottomSheet();
                                        Bundle bundle = new Bundle();
                                        bundle.putParcelableArrayList("COLUMNS_EXTRA", new ArrayList<>(gv9Var));
                                        fantasyLeaderboardLegendBottomSheet.setArguments(bundle);
                                        AppCompatActivity appCompatActivity = requireActivity instanceof AppCompatActivity ? (AppCompatActivity) requireActivity : null;
                                        if (appCompatActivity != null) {
                                            wca.x(appCompatActivity.getLifecycle()).b(new r1(fantasyLeaderboardLegendBottomSheet, appCompatActivity, rq3Var, 3));
                                        }
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        av8Var2.n0(O2);
                    }
                    Function1 function12 = (Function1) O2;
                    boolean i6 = av8Var2.i(fantasyCompetitionLeaderboardFragment);
                    Object O3 = av8Var2.O();
                    if (i6 || O3 == a99Var) {
                        O3 = new Function1() { // from class: or6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                int i62 = i2;
                                rq3 rq3Var = null;
                                FantasyCompetitionLeaderboardFragment fantasyCompetitionLeaderboardFragment2 = fantasyCompetitionLeaderboardFragment;
                                switch (i62) {
                                    case 0:
                                        eo7 eo7Var = (eo7) obj4;
                                        eo7Var.getClass();
                                        int i7 = FantasyUserSquadActivity.N;
                                        Context requireContext2 = fantasyCompetitionLeaderboardFragment2.requireContext();
                                        requireContext2.getClass();
                                        p4h.y(requireContext2, fantasyCompetitionLeaderboardFragment2.D().k.c, fantasyCompetitionLeaderboardFragment2.D().k.d, eo7Var.e, null);
                                        break;
                                    default:
                                        gv9 gv9Var = (gv9) obj4;
                                        gv9Var.getClass();
                                        FragmentActivity requireActivity = fantasyCompetitionLeaderboardFragment2.requireActivity();
                                        requireActivity.getClass();
                                        FantasyLeaderboardLegendBottomSheet fantasyLeaderboardLegendBottomSheet = new FantasyLeaderboardLegendBottomSheet();
                                        Bundle bundle = new Bundle();
                                        bundle.putParcelableArrayList("COLUMNS_EXTRA", new ArrayList<>(gv9Var));
                                        fantasyLeaderboardLegendBottomSheet.setArguments(bundle);
                                        AppCompatActivity appCompatActivity = requireActivity instanceof AppCompatActivity ? (AppCompatActivity) requireActivity : null;
                                        if (appCompatActivity != null) {
                                            wca.x(appCompatActivity.getLifecycle()).b(new r1(fantasyLeaderboardLegendBottomSheet, appCompatActivity, rq3Var, 3));
                                        }
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        av8Var2.n0(O3);
                    }
                    tol.g(a, n, z, ev6Var, function1, function12, (Function1) O3, null, null, true, av8Var2, 805306376, 384);
                } else {
                    av8Var2.W();
                }
                break;
            case 4:
                FantasyCompetitionLeaguesFragment fantasyCompetitionLeaguesFragment = (FantasyCompetitionLeaguesFragment) obj3;
                of3 of3Var3 = (of3) obj;
                int intValue3 = ((Integer) obj2).intValue();
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 3) != 2)) {
                    ml4.r((is6) fantasyCompetitionLeaguesFragment.r.getValue(), (hp6) fantasyCompetitionLeaguesFragment.s.getValue(), av8Var3, 0);
                } else {
                    av8Var3.W();
                }
                break;
            case 5:
                final FantasyCompetitionMyTeamFragment fantasyCompetitionMyTeamFragment = (FantasyCompetitionMyTeamFragment) obj3;
                of3 of3Var4 = (of3) obj;
                int intValue4 = ((Integer) obj2).intValue();
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(intValue4 & 1, (intValue4 & 3) != 2)) {
                    boolean i7 = av8Var4.i(fantasyCompetitionMyTeamFragment);
                    Object O4 = av8Var4.O();
                    Object obj4 = O4;
                    if (i7 || O4 == a99Var) {
                        qo6 qo6Var = new qo6(fantasyCompetitionMyTeamFragment, 1);
                        av8Var4.n0(qo6Var);
                        obj4 = qo6Var;
                    }
                    final Function0 function0 = (Function0) obj4;
                    boolean g = av8Var4.g(function0) | av8Var4.i(fantasyCompetitionMyTeamFragment);
                    Object O5 = av8Var4.O();
                    Object obj5 = O5;
                    if (g || O5 == a99Var) {
                        final int i8 = r9 ? 1 : 0;
                        Function1 function13 = new Function1() { // from class: mt6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                int i9 = i8;
                                FantasyCompetitionMyTeamFragment fantasyCompetitionMyTeamFragment2 = fantasyCompetitionMyTeamFragment;
                                Function0 function02 = function0;
                                Intent intent = (Intent) obj6;
                                switch (i9) {
                                    case 0:
                                        intent.getClass();
                                        function02.invoke();
                                        fantasyCompetitionMyTeamFragment2.w.a(intent, null);
                                        break;
                                    default:
                                        intent.getClass();
                                        function02.invoke();
                                        fantasyCompetitionMyTeamFragment2.x.a(intent, null);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        av8Var4.n0(function13);
                        obj5 = function13;
                    }
                    Function1 function14 = (Function1) obj5;
                    boolean g2 = av8Var4.g(function0) | av8Var4.i(fantasyCompetitionMyTeamFragment);
                    Object O6 = av8Var4.O();
                    Object obj6 = O6;
                    if (g2 || O6 == a99Var) {
                        Function1 function15 = new Function1() { // from class: mt6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj62) {
                                int i9 = i2;
                                FantasyCompetitionMyTeamFragment fantasyCompetitionMyTeamFragment2 = fantasyCompetitionMyTeamFragment;
                                Function0 function02 = function0;
                                Intent intent = (Intent) obj62;
                                switch (i9) {
                                    case 0:
                                        intent.getClass();
                                        function02.invoke();
                                        fantasyCompetitionMyTeamFragment2.w.a(intent, null);
                                        break;
                                    default:
                                        intent.getClass();
                                        function02.invoke();
                                        fantasyCompetitionMyTeamFragment2.x.a(intent, null);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        av8Var4.n0(function15);
                        obj6 = function15;
                    }
                    Function1 function16 = (Function1) obj6;
                    pu6 D2 = fantasyCompetitionMyTeamFragment.D();
                    hp6 hp6Var = (hp6) fantasyCompetitionMyTeamFragment.s.getValue();
                    g9a g9aVar = (g9a) fantasyCompetitionMyTeamFragment.t.getValue();
                    boolean i9 = av8Var4.i(fantasyCompetitionMyTeamFragment);
                    Object O7 = av8Var4.O();
                    if (i9 || O7 == a99Var) {
                        ny nyVar = new ny(0, fantasyCompetitionMyTeamFragment, FantasyCompetitionMyTeamFragment.class, "showInterstitialAd", "showInterstitialAd()V", 0, 28);
                        av8Var4.n0(nyVar);
                        O7 = nyVar;
                    }
                    KFunction kFunction = (KFunction) O7;
                    boolean g3 = av8Var4.g(function0) | av8Var4.i(fantasyCompetitionMyTeamFragment);
                    Object O8 = av8Var4.O();
                    Object obj7 = O8;
                    if (g3 || O8 == a99Var) {
                        h84 h84Var = new h84(22, function0, fantasyCompetitionMyTeamFragment);
                        av8Var4.n0(h84Var);
                        obj7 = h84Var;
                    }
                    fu6.b(D2, hp6Var, g9aVar, function14, function16, (Function0) obj7, (Function0) kFunction, av8Var4, 0);
                } else {
                    av8Var4.W();
                }
                break;
            case 6:
                FantasyCompetitionSelectorBottomSheet fantasyCompetitionSelectorBottomSheet = (FantasyCompetitionSelectorBottomSheet) obj3;
                of3 of3Var5 = (of3) obj;
                int intValue5 = ((Integer) obj2).intValue();
                av8 av8Var5 = (av8) of3Var5;
                if (av8Var5.T(intValue5 & 1, (intValue5 & 3) != 2)) {
                    xu6 xu6Var = (xu6) fantasyCompetitionSelectorBottomSheet.C.getValue();
                    boolean i10 = av8Var5.i(fantasyCompetitionSelectorBottomSheet);
                    Object O9 = av8Var5.O();
                    if (i10 || O9 == a99Var) {
                        ny nyVar2 = new ny(0, fantasyCompetitionSelectorBottomSheet, FantasyCompetitionSelectorBottomSheet.class, "dismiss", "dismiss()V", 0, 29);
                        av8Var5.n0(nyVar2);
                        O9 = nyVar2;
                    }
                    rz8.k(xu6Var, (Function0) ((KFunction) O9), av8Var5, 0);
                } else {
                    av8Var5.W();
                }
                break;
            case 7:
                final FantasyCompetitionStatisticsFragment fantasyCompetitionStatisticsFragment = (FantasyCompetitionStatisticsFragment) obj3;
                of3 of3Var6 = (of3) obj;
                int intValue6 = ((Integer) obj2).intValue();
                av8 av8Var6 = (av8) of3Var6;
                if (av8Var6.T(intValue6 & 1, (intValue6 & 3) != 2)) {
                    Context context = (Context) av8Var6.k(nz.b);
                    osa a2 = rsa.a(fantasyCompetitionStatisticsFragment.D().t, av8Var6);
                    e1d v = rfo.v(fantasyCompetitionStatisticsFragment.D().m, Boolean.FALSE, av8Var6, 48);
                    e1d x = rfo.x(fantasyCompetitionStatisticsFragment.D().i, av8Var6, 0);
                    e1d x2 = rfo.x(fantasyCompetitionStatisticsFragment.D().o, av8Var6, 0);
                    e1d x3 = rfo.x(fantasyCompetitionStatisticsFragment.D().p, av8Var6, 0);
                    e1d x4 = rfo.x(fantasyCompetitionStatisticsFragment.D().q, av8Var6, 0);
                    e1d x5 = rfo.x(fantasyCompetitionStatisticsFragment.D().r, av8Var6, 0);
                    e1d x6 = rfo.x(fantasyCompetitionStatisticsFragment.D().s, av8Var6, 0);
                    w28 w28Var = (w28) x.getValue();
                    boolean booleanValue = ((Boolean) v.getValue()).booleanValue();
                    boolean z2 = fantasyCompetitionStatisticsFragment.D().u.c.A;
                    ho1 ho1Var = (ho1) x2.getValue();
                    Float f = (Float) x3.getValue();
                    String str2 = (String) x4.getValue();
                    if (str2 != null) {
                        rz6.g.getClass();
                        rz6Var = f7a.g(str2);
                    } else {
                        rz6Var = null;
                    }
                    cv6 D3 = fantasyCompetitionStatisticsFragment.D();
                    boolean i11 = av8Var6.i(D3);
                    Object O10 = av8Var6.O();
                    if (i11 || O10 == a99Var) {
                        O10 = new av6(0, D3, cv6.class, "clearFilters", "clearFilters()V", 0, 0);
                        av8Var6.n0(O10);
                    }
                    KFunction kFunction2 = (KFunction) O10;
                    mei meiVar = (mei) x5.getValue();
                    nei neiVar = (nei) x6.getValue();
                    boolean i12 = av8Var6.i(fantasyCompetitionStatisticsFragment);
                    Object O11 = av8Var6.O();
                    Object obj8 = O11;
                    if (i12 || O11 == a99Var) {
                        final int i13 = r9 ? 1 : 0;
                        Function1 function17 = new Function1() { // from class: zu6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj9) {
                                int i14 = i13;
                                FantasyCompetitionStatisticsFragment fantasyCompetitionStatisticsFragment2 = fantasyCompetitionStatisticsFragment;
                                switch (i14) {
                                    case 0:
                                        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = (FantasyRoundPlayerUiModel) obj9;
                                        fantasyRoundPlayerUiModel.getClass();
                                        Context requireContext2 = fantasyCompetitionStatisticsFragment2.requireContext();
                                        requireContext2.getClass();
                                        nv.A(requireContext2, "open_player", null);
                                        int i15 = PlayerActivity.Z;
                                        Context requireContext3 = fantasyCompetitionStatisticsFragment2.requireContext();
                                        requireContext3.getClass();
                                        jle.q(requireContext3, fantasyRoundPlayerUiModel.g.b, 0, null, null, false, Integer.valueOf(fantasyCompetitionStatisticsFragment2.D().w), null, 444);
                                        break;
                                    case 1:
                                        fantasyCompetitionStatisticsFragment2.D().o.l((ho1) obj9);
                                        break;
                                    case 2:
                                        fantasyCompetitionStatisticsFragment2.D().p.l((Float) obj9);
                                        break;
                                    default:
                                        rz6 rz6Var2 = (rz6) obj9;
                                        fantasyCompetitionStatisticsFragment2.D().q.l(rz6Var2 != null ? rz6Var2.b : null);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        av8Var6.n0(function17);
                        obj8 = function17;
                    }
                    Function1 function18 = (Function1) obj8;
                    boolean i14 = av8Var6.i(context) | av8Var6.i(fantasyCompetitionStatisticsFragment);
                    Object O12 = av8Var6.O();
                    Object obj9 = O12;
                    if (i14 || O12 == a99Var) {
                        xw5 xw5Var = new xw5(28, context, fantasyCompetitionStatisticsFragment);
                        av8Var6.n0(xw5Var);
                        obj9 = xw5Var;
                    }
                    Function1 function19 = (Function1) obj9;
                    boolean i15 = av8Var6.i(fantasyCompetitionStatisticsFragment);
                    Object O13 = av8Var6.O();
                    Object obj10 = O13;
                    if (i15 || O13 == a99Var) {
                        Function1 function110 = new Function1() { // from class: zu6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj92) {
                                int i142 = i2;
                                FantasyCompetitionStatisticsFragment fantasyCompetitionStatisticsFragment2 = fantasyCompetitionStatisticsFragment;
                                switch (i142) {
                                    case 0:
                                        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = (FantasyRoundPlayerUiModel) obj92;
                                        fantasyRoundPlayerUiModel.getClass();
                                        Context requireContext2 = fantasyCompetitionStatisticsFragment2.requireContext();
                                        requireContext2.getClass();
                                        nv.A(requireContext2, "open_player", null);
                                        int i152 = PlayerActivity.Z;
                                        Context requireContext3 = fantasyCompetitionStatisticsFragment2.requireContext();
                                        requireContext3.getClass();
                                        jle.q(requireContext3, fantasyRoundPlayerUiModel.g.b, 0, null, null, false, Integer.valueOf(fantasyCompetitionStatisticsFragment2.D().w), null, 444);
                                        break;
                                    case 1:
                                        fantasyCompetitionStatisticsFragment2.D().o.l((ho1) obj92);
                                        break;
                                    case 2:
                                        fantasyCompetitionStatisticsFragment2.D().p.l((Float) obj92);
                                        break;
                                    default:
                                        rz6 rz6Var2 = (rz6) obj92;
                                        fantasyCompetitionStatisticsFragment2.D().q.l(rz6Var2 != null ? rz6Var2.b : null);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        av8Var6.n0(function110);
                        obj10 = function110;
                    }
                    Function1 function111 = (Function1) obj10;
                    boolean i16 = av8Var6.i(fantasyCompetitionStatisticsFragment);
                    Object O14 = av8Var6.O();
                    Object obj11 = O14;
                    if (i16 || O14 == a99Var) {
                        final int i17 = 2;
                        Function1 function112 = new Function1() { // from class: zu6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj92) {
                                int i142 = i17;
                                FantasyCompetitionStatisticsFragment fantasyCompetitionStatisticsFragment2 = fantasyCompetitionStatisticsFragment;
                                switch (i142) {
                                    case 0:
                                        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = (FantasyRoundPlayerUiModel) obj92;
                                        fantasyRoundPlayerUiModel.getClass();
                                        Context requireContext2 = fantasyCompetitionStatisticsFragment2.requireContext();
                                        requireContext2.getClass();
                                        nv.A(requireContext2, "open_player", null);
                                        int i152 = PlayerActivity.Z;
                                        Context requireContext3 = fantasyCompetitionStatisticsFragment2.requireContext();
                                        requireContext3.getClass();
                                        jle.q(requireContext3, fantasyRoundPlayerUiModel.g.b, 0, null, null, false, Integer.valueOf(fantasyCompetitionStatisticsFragment2.D().w), null, 444);
                                        break;
                                    case 1:
                                        fantasyCompetitionStatisticsFragment2.D().o.l((ho1) obj92);
                                        break;
                                    case 2:
                                        fantasyCompetitionStatisticsFragment2.D().p.l((Float) obj92);
                                        break;
                                    default:
                                        rz6 rz6Var2 = (rz6) obj92;
                                        fantasyCompetitionStatisticsFragment2.D().q.l(rz6Var2 != null ? rz6Var2.b : null);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        av8Var6.n0(function112);
                        obj11 = function112;
                    }
                    Function1 function113 = (Function1) obj11;
                    boolean i18 = av8Var6.i(fantasyCompetitionStatisticsFragment);
                    Object O15 = av8Var6.O();
                    Object obj12 = O15;
                    if (i18 || O15 == a99Var) {
                        final int i19 = 3;
                        Function1 function114 = new Function1() { // from class: zu6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj92) {
                                int i142 = i19;
                                FantasyCompetitionStatisticsFragment fantasyCompetitionStatisticsFragment2 = fantasyCompetitionStatisticsFragment;
                                switch (i142) {
                                    case 0:
                                        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = (FantasyRoundPlayerUiModel) obj92;
                                        fantasyRoundPlayerUiModel.getClass();
                                        Context requireContext2 = fantasyCompetitionStatisticsFragment2.requireContext();
                                        requireContext2.getClass();
                                        nv.A(requireContext2, "open_player", null);
                                        int i152 = PlayerActivity.Z;
                                        Context requireContext3 = fantasyCompetitionStatisticsFragment2.requireContext();
                                        requireContext3.getClass();
                                        jle.q(requireContext3, fantasyRoundPlayerUiModel.g.b, 0, null, null, false, Integer.valueOf(fantasyCompetitionStatisticsFragment2.D().w), null, 444);
                                        break;
                                    case 1:
                                        fantasyCompetitionStatisticsFragment2.D().o.l((ho1) obj92);
                                        break;
                                    case 2:
                                        fantasyCompetitionStatisticsFragment2.D().p.l((Float) obj92);
                                        break;
                                    default:
                                        rz6 rz6Var2 = (rz6) obj92;
                                        fantasyCompetitionStatisticsFragment2.D().q.l(rz6Var2 != null ? rz6Var2.b : null);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        av8Var6.n0(function114);
                        obj12 = function114;
                    }
                    Function1 function115 = (Function1) obj12;
                    Function0 function02 = (Function0) kFunction2;
                    boolean i20 = av8Var6.i(fantasyCompetitionStatisticsFragment) | av8Var6.g(x5) | av8Var6.g(x6);
                    Object O16 = av8Var6.O();
                    Object obj13 = O16;
                    if (i20 || O16 == a99Var) {
                        dr6 dr6Var = new dr6(3, fantasyCompetitionStatisticsFragment, x5, x6);
                        av8Var6.n0(dr6Var);
                        obj13 = dr6Var;
                    }
                    pe7.a(a2, w28Var, booleanValue, true, function18, function19, ho1Var, function111, f, function113, rz6Var, function115, function02, meiVar, neiVar, (Function1) obj13, z2, null, "FantasyCompetitionStatisticsFragment", null, av8Var6, 3080, 100663296, 655360);
                } else {
                    av8Var6.W();
                }
                break;
            case 8:
                FantasyEliteFaceoffIntroBottomSheet fantasyEliteFaceoffIntroBottomSheet = (FantasyEliteFaceoffIntroBottomSheet) obj3;
                of3 of3Var7 = (of3) obj;
                int intValue7 = ((Integer) obj2).intValue();
                av8 av8Var7 = (av8) of3Var7;
                if (av8Var7.T(intValue7 & 1, (intValue7 & 3) != 2)) {
                    xtc J = lz.J(gz8.x(bkh.d(utcVar, 1.0f), null, null, 3), jaa.L(av8Var7), null);
                    k1c c = e12.c(uxf.c, false);
                    int hashCode = Long.hashCode(av8Var7.T);
                    aee m = av8Var7.m();
                    xtc C = fqj.C(av8Var7, J);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var7.h0();
                    if (av8Var7.S) {
                        av8Var7.l(zg3Var);
                    } else {
                        av8Var7.q0();
                    }
                    waa.K(av8Var7, c, hf3.g);
                    waa.K(av8Var7, m, hf3.f);
                    waa.K(av8Var7, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var7, hf3.k);
                    waa.K(av8Var7, C, hf3.d);
                    Long l = (Long) ((eoh) ((kw6) fantasyEliteFaceoffIntroBottomSheet.B.getValue()).g).getValue();
                    boolean i21 = av8Var7.i(fantasyEliteFaceoffIntroBottomSheet);
                    Object O17 = av8Var7.O();
                    if (i21 || O17 == a99Var) {
                        O17 = new qo6(fantasyEliteFaceoffIntroBottomSheet, 3);
                        av8Var7.n0(O17);
                    }
                    wkn.e(l, (Function0) O17, av8Var7, 0);
                    av8Var7.s(true);
                } else {
                    av8Var7.W();
                }
                break;
            case 9:
                ((Integer) obj2).getClass();
                hkg.j((ay6) obj3, (of3) obj, aba.K(1));
                break;
            case 10:
                FantasyFinishedCompetitionsActivity fantasyFinishedCompetitionsActivity = (FantasyFinishedCompetitionsActivity) obj3;
                of3 of3Var8 = (of3) obj;
                int intValue8 = ((Integer) obj2).intValue();
                int i22 = FantasyFinishedCompetitionsActivity.M;
                av8 av8Var8 = (av8) of3Var8;
                if (av8Var8.T(intValue8 & 1, (intValue8 & 3) != 2)) {
                    hkg.j((ay6) fantasyFinishedCompetitionsActivity.L.getValue(), av8Var8, 0);
                } else {
                    av8Var8.W();
                }
                break;
            case 11:
                FantasyGameweekHighlightsPOTGWFragment fantasyGameweekHighlightsPOTGWFragment = (FantasyGameweekHighlightsPOTGWFragment) obj3;
                of3 of3Var9 = (of3) obj;
                int intValue9 = ((Integer) obj2).intValue();
                av8 av8Var9 = (av8) of3Var9;
                if (av8Var9.T(intValue9 & 1, (intValue9 & 3) != 2)) {
                    o07 o07Var = (o07) ((eoh) fantasyGameweekHighlightsPOTGWFragment.D().j).getValue();
                    FantasyCompetitionType fantasyCompetitionType = fantasyGameweekHighlightsPOTGWFragment.D().h;
                    boolean i23 = av8Var9.i(fantasyGameweekHighlightsPOTGWFragment);
                    Object O18 = av8Var9.O();
                    if (i23 || O18 == a99Var) {
                        O18 = new qo6(fantasyGameweekHighlightsPOTGWFragment, 7);
                        av8Var9.n0(O18);
                    }
                    hz8.k(o07Var, fantasyCompetitionType, (Function0) O18, av8Var9, 0);
                } else {
                    av8Var9.W();
                }
                break;
            case 12:
                FantasyGameweekHighlightsPointsFragment fantasyGameweekHighlightsPointsFragment = (FantasyGameweekHighlightsPointsFragment) obj3;
                of3 of3Var10 = (of3) obj;
                int intValue10 = ((Integer) obj2).intValue();
                av8 av8Var10 = (av8) of3Var10;
                if (av8Var10.T(intValue10 & 1, (intValue10 & 3) != 2)) {
                    ww9.e((x07) ((eoh) ((y07) fantasyGameweekHighlightsPointsFragment.r.getValue()).f).getValue(), av8Var10, 0);
                } else {
                    av8Var10.W();
                }
                break;
            case 13:
                ((Integer) obj2).getClass();
                ww9.e((x07) obj3, (of3) obj, aba.K(1));
                break;
            case 14:
                FantasyGameweekHighlightsRankingsFragment fantasyGameweekHighlightsRankingsFragment = (FantasyGameweekHighlightsRankingsFragment) obj3;
                of3 of3Var11 = (of3) obj;
                int intValue11 = ((Integer) obj2).intValue();
                av8 av8Var11 = (av8) of3Var11;
                if (av8Var11.T(intValue11 & 1, (intValue11 & 3) != 2)) {
                    gvd.g((c17) ((eoh) ((e17) fantasyGameweekHighlightsRankingsFragment.r.getValue()).f).getValue(), av8Var11, 0);
                } else {
                    av8Var11.W();
                }
                break;
            case 15:
                ((Integer) obj2).getClass();
                gvd.g((c17) obj3, (of3) obj, aba.K(1));
                break;
            case 16:
                FantasyGameweekHighlightsTOTGWFragment fantasyGameweekHighlightsTOTGWFragment = (FantasyGameweekHighlightsTOTGWFragment) obj3;
                of3 of3Var12 = (of3) obj;
                int intValue12 = ((Integer) obj2).intValue();
                av8 av8Var12 = (av8) of3Var12;
                if (av8Var12.T(intValue12 & 1, (intValue12 & 3) != 2)) {
                    fkf.e((j17) ((eoh) ((k17) fantasyGameweekHighlightsTOTGWFragment.r.getValue()).g).getValue(), av8Var12, 0);
                } else {
                    av8Var12.W();
                }
                break;
            case 17:
                ((Integer) obj2).getClass();
                fkf.e((j17) obj3, (of3) obj, aba.K(1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                ktm.i((h27) obj3, (of3) obj, aba.K(1));
                break;
            case 19:
                FantasyInviteToLeagueBottomSheet fantasyInviteToLeagueBottomSheet = (FantasyInviteToLeagueBottomSheet) obj3;
                of3 of3Var13 = (of3) obj;
                int intValue13 = ((Integer) obj2).intValue();
                av8 av8Var13 = (av8) of3Var13;
                if (av8Var13.T(intValue13 & 1, (intValue13 & 3) != 2)) {
                    ktm.i((h27) fantasyInviteToLeagueBottomSheet.C.getValue(), av8Var13, 0);
                } else {
                    av8Var13.W();
                }
                break;
            case 20:
                FantasyLeaderboardLegendBottomSheet fantasyLeaderboardLegendBottomSheet = (FantasyLeaderboardLegendBottomSheet) obj3;
                of3 of3Var14 = (of3) obj;
                int intValue14 = ((Integer) obj2).intValue();
                av8 av8Var14 = (av8) of3Var14;
                if (av8Var14.T(intValue14 & 1, (intValue14 & 3) != 2)) {
                    Iterable L = gz8.L(fantasyLeaderboardLegendBottomSheet.requireArguments(), "COLUMNS_EXTRA", FantasyLeaderboardStatistic.class);
                    if (L == null) {
                        L = km5.a;
                    }
                    pco.i(l6g.W(L), null, av8Var14, 0);
                } else {
                    av8Var14.W();
                }
                break;
            case 21:
                j67 j67Var = (j67) obj3;
                of3 of3Var15 = (of3) obj;
                int intValue15 = ((Integer) obj2).intValue();
                av8 av8Var15 = (av8) of3Var15;
                if (av8Var15.T(intValue15 & 1, (intValue15 & 3) != 2)) {
                    if (j67Var != null) {
                        int i24 = j67Var.f;
                        List list = dla.a;
                        str = dla.i(Integer.valueOf(i24));
                    }
                    Regex regex = yid.a;
                    if (str == null) {
                        str = "-";
                    }
                    yf8 yf8Var = xth.a;
                    q5a.w(str, null, lz.D(R.color.n_lv_1, av8Var15), null, 0L, 0L, null, 0L, 0, false, 1, 0, xth.j(), av8Var15, 0, 24576, 114682);
                } else {
                    av8Var15.W();
                }
                break;
            case 22:
                final FantasyLeagueLeaderboardFragment fantasyLeagueLeaderboardFragment = (FantasyLeagueLeaderboardFragment) obj3;
                of3 of3Var16 = (of3) obj;
                int intValue16 = ((Integer) obj2).intValue();
                av8 av8Var16 = (av8) of3Var16;
                if (av8Var16.T(intValue16 & 1, (intValue16 & 3) != 2)) {
                    osa a3 = rsa.a(fantasyLeagueLeaderboardFragment.D().j, av8Var16);
                    a37 n2 = fantasyLeagueLeaderboardFragment.D().n();
                    ev6 ev6Var2 = fantasyLeagueLeaderboardFragment.D().k;
                    boolean z3 = fantasyLeagueLeaderboardFragment.D().k.o < yaa.w();
                    m47 D4 = fantasyLeagueLeaderboardFragment.D();
                    boolean i25 = av8Var16.i(D4);
                    Object O19 = av8Var16.O();
                    if (i25 || O19 == a99Var) {
                        s26 s26Var2 = new s26(1, D4, m47.class, "changeRound", "changeRound(Lcom/sofascore/results/fantasy/shared/BasicRoundData;)V", 0, 5);
                        av8Var16.n0(s26Var2);
                        O19 = s26Var2;
                    }
                    KFunction kFunction3 = (KFunction) O19;
                    boolean i26 = av8Var16.i(fantasyLeagueLeaderboardFragment);
                    Object O20 = av8Var16.O();
                    if (i26 || O20 == a99Var) {
                        O20 = new qo6(fantasyLeagueLeaderboardFragment, 9);
                        av8Var16.n0(O20);
                    }
                    Function0 function03 = !fantasyLeagueLeaderboardFragment.D().k.w ? (Function0) O20 : null;
                    Function1 function116 = (Function1) kFunction3;
                    boolean i27 = av8Var16.i(fantasyLeagueLeaderboardFragment);
                    Object O21 = av8Var16.O();
                    if (i27 || O21 == a99Var) {
                        final int i28 = r9 ? 1 : 0;
                        O21 = new Function1() { // from class: k47
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj14) {
                                int i29 = i28;
                                rq3 rq3Var = null;
                                FantasyLeagueLeaderboardFragment fantasyLeagueLeaderboardFragment2 = fantasyLeagueLeaderboardFragment;
                                switch (i29) {
                                    case 0:
                                        eo7 eo7Var = (eo7) obj14;
                                        eo7Var.getClass();
                                        int i30 = FantasyUserSquadActivity.N;
                                        Context requireContext2 = fantasyLeagueLeaderboardFragment2.requireContext();
                                        requireContext2.getClass();
                                        p4h.y(requireContext2, fantasyLeagueLeaderboardFragment2.D().k.c, fantasyLeagueLeaderboardFragment2.D().k.d, eo7Var.e, null);
                                        break;
                                    default:
                                        gv9 gv9Var = (gv9) obj14;
                                        gv9Var.getClass();
                                        FragmentActivity requireActivity = fantasyLeagueLeaderboardFragment2.requireActivity();
                                        requireActivity.getClass();
                                        FantasyLeaderboardLegendBottomSheet fantasyLeaderboardLegendBottomSheet2 = new FantasyLeaderboardLegendBottomSheet();
                                        Bundle bundle = new Bundle();
                                        bundle.putParcelableArrayList("COLUMNS_EXTRA", new ArrayList<>(gv9Var));
                                        fantasyLeaderboardLegendBottomSheet2.setArguments(bundle);
                                        AppCompatActivity appCompatActivity = requireActivity instanceof AppCompatActivity ? (AppCompatActivity) requireActivity : null;
                                        if (appCompatActivity != null) {
                                            wca.x(appCompatActivity.getLifecycle()).b(new r1(fantasyLeaderboardLegendBottomSheet2, appCompatActivity, rq3Var, 3));
                                        }
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        av8Var16.n0(O21);
                    }
                    Function1 function117 = (Function1) O21;
                    boolean i29 = av8Var16.i(fantasyLeagueLeaderboardFragment);
                    Object O22 = av8Var16.O();
                    if (i29 || O22 == a99Var) {
                        O22 = new Function1() { // from class: k47
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj14) {
                                int i292 = i2;
                                rq3 rq3Var = null;
                                FantasyLeagueLeaderboardFragment fantasyLeagueLeaderboardFragment2 = fantasyLeagueLeaderboardFragment;
                                switch (i292) {
                                    case 0:
                                        eo7 eo7Var = (eo7) obj14;
                                        eo7Var.getClass();
                                        int i30 = FantasyUserSquadActivity.N;
                                        Context requireContext2 = fantasyLeagueLeaderboardFragment2.requireContext();
                                        requireContext2.getClass();
                                        p4h.y(requireContext2, fantasyLeagueLeaderboardFragment2.D().k.c, fantasyLeagueLeaderboardFragment2.D().k.d, eo7Var.e, null);
                                        break;
                                    default:
                                        gv9 gv9Var = (gv9) obj14;
                                        gv9Var.getClass();
                                        FragmentActivity requireActivity = fantasyLeagueLeaderboardFragment2.requireActivity();
                                        requireActivity.getClass();
                                        FantasyLeaderboardLegendBottomSheet fantasyLeaderboardLegendBottomSheet2 = new FantasyLeaderboardLegendBottomSheet();
                                        Bundle bundle = new Bundle();
                                        bundle.putParcelableArrayList("COLUMNS_EXTRA", new ArrayList<>(gv9Var));
                                        fantasyLeaderboardLegendBottomSheet2.setArguments(bundle);
                                        AppCompatActivity appCompatActivity = requireActivity instanceof AppCompatActivity ? (AppCompatActivity) requireActivity : null;
                                        if (appCompatActivity != null) {
                                            wca.x(appCompatActivity.getLifecycle()).b(new r1(fantasyLeaderboardLegendBottomSheet2, appCompatActivity, rq3Var, 3));
                                        }
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        av8Var16.n0(O22);
                    }
                    tol.g(a3, n2, z3, ev6Var2, function116, function117, (Function1) O22, null, function03, false, av8Var16, 8, 640);
                } else {
                    av8Var16.W();
                }
                break;
            case 23:
                s77 s77Var = (s77) obj3;
                of3 of3Var17 = (of3) obj;
                int intValue17 = ((Integer) obj2).intValue();
                av8 av8Var17 = (av8) of3Var17;
                if (av8Var17.T(intValue17 & 1, (intValue17 & 3) != 2)) {
                    String str3 = s77Var.d;
                    yf8 yf8Var2 = xth.a;
                    udj.c(str3, bkh.p(utcVar, 28.0f), lz.D(R.color.n_lv_1, av8Var17), new es0(v8a.v(8), v8a.v(12), v8a.u(0.25d)), 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, xth.k(), av8Var17, 48, 24960, 109552);
                } else {
                    av8Var17.W();
                }
                break;
            case 24:
                FantasyLeagueMatchupsFragment fantasyLeagueMatchupsFragment = (FantasyLeagueMatchupsFragment) obj3;
                of3 of3Var18 = (of3) obj;
                int intValue18 = ((Integer) obj2).intValue();
                av8 av8Var18 = (av8) of3Var18;
                if (av8Var18.T(intValue18 & 1, (intValue18 & 3) != 2)) {
                    zm2.c((e57) fantasyLeagueMatchupsFragment.r.getValue(), null, av8Var18, 0);
                } else {
                    av8Var18.W();
                }
                break;
            case 25:
                pb7 pb7Var = (pb7) obj3;
                of3 of3Var19 = (of3) obj;
                int intValue19 = ((Integer) obj2).intValue();
                av8 av8Var19 = (av8) of3Var19;
                if (av8Var19.T(intValue19 & 1, (intValue19 & 3) != 2)) {
                    ng0 ng0Var = new ng0(8.0f, true, new a70(6));
                    xtc f0 = l98.f0(l98.d0(hkg.Z(bkh.d(utcVar, 1.0f), hkg.o0(av8Var19), false, 14), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                    l8g a4 = k8g.a(ng0Var, uxf.l, av8Var19, 6);
                    int hashCode2 = Long.hashCode(av8Var19.T);
                    aee m2 = av8Var19.m();
                    xtc C2 = fqj.C(av8Var19, f0);
                    if3.k7.getClass();
                    zg3 zg3Var2 = hf3.b;
                    av8Var19.h0();
                    if (av8Var19.S) {
                        av8Var19.l(zg3Var2);
                    } else {
                        av8Var19.q0();
                    }
                    waa.K(av8Var19, a4, hf3.g);
                    waa.K(av8Var19, m2, hf3.f);
                    waa.K(av8Var19, Integer.valueOf(hashCode2), hf3.j);
                    waa.J(av8Var19, hf3.k);
                    waa.K(av8Var19, C2, hf3.d);
                    av8Var19.d0(1691262592);
                    for (e47 e47Var : pb7Var.h) {
                        String str4 = e47Var.a;
                        int i30 = e47Var.b;
                        ArrayList arrayList = e47Var.c;
                        ev6 ev6Var3 = pb7Var.f;
                        i2a.e(str4, i30, arrayList, Intrinsics.c(ev6Var3 != null ? Boolean.valueOf(ev6Var3.A) : null, Boolean.TRUE), null, true, av8Var19, 196608, 16);
                    }
                    av8Var19.s(false);
                    av8Var19.s(true);
                } else {
                    av8Var19.W();
                }
                break;
            case 26:
                ((Integer) obj2).getClass();
                dy0.f((k7d) obj3, (of3) obj, aba.K(1));
                break;
            case 27:
                ob7 ob7Var = (ob7) obj3;
                of3 of3Var20 = (of3) obj;
                int intValue20 = ((Integer) obj2).intValue();
                av8 av8Var20 = (av8) of3Var20;
                if (av8Var20.T(intValue20 & 1, (intValue20 & 3) != 2)) {
                    String v2 = oea.v(R.string.fantasy_placeholder_round_message_title, av8Var20);
                    String v3 = oea.v(R.string.fantasy_placeholder_round_message_body, av8Var20);
                    boolean i31 = av8Var20.i(ob7Var);
                    Object O23 = av8Var20.O();
                    if (i31 || O23 == a99Var) {
                        O23 = new ib7(ob7Var, 2);
                        av8Var20.n0(O23);
                    }
                    dy0.n(v2, v3, (Function0) O23, null, false, false, av8Var20, 0, W3.l);
                } else {
                    av8Var20.W();
                }
                break;
            case 28:
                FantasyPlayersOfTheRoundBottomSheet fantasyPlayersOfTheRoundBottomSheet = (FantasyPlayersOfTheRoundBottomSheet) obj3;
                of3 of3Var21 = (of3) obj;
                int intValue21 = ((Integer) obj2).intValue();
                av8 av8Var21 = (av8) of3Var21;
                if (av8Var21.T(intValue21 & 1, (intValue21 & 3) != 2)) {
                    av8Var21.d0(-1464798067);
                    ksa a5 = msa.a(0, 0, av8Var21, 0, 3);
                    fantasyPlayersOfTheRoundBottomSheet.F(a5, null, av8Var21, 0);
                    av8Var21.s(false);
                    oyn.h((te7) fantasyPlayersOfTheRoundBottomSheet.C.getValue(), ((Boolean) fantasyPlayersOfTheRoundBottomSheet.D.getValue()).booleanValue(), a5, av8Var21, 0);
                } else {
                    av8Var21.W();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                oyn.j((if7) obj3, (of3) obj, aba.K(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ jo6(Object obj, int i, int i2) {
        this.a = i2;
        this.b = obj;
    }
}
