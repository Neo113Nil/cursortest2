package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.newNetwork.PlayerPenaltyHistoryResponse;
import com.sofascore.results.R;
import com.sofascore.results.event.aiInsights.SofascoreAnalystTennisPromoBottomSheet;
import com.sofascore.results.event.aiInsights.SofascoreAnalystWorldCupOfferBottomSheet;
import com.sofascore.results.event.statistics.view.football.FootballShotmapView;
import com.sofascore.results.featureWalkthrough.FeatureWalkthroughFullScreenDialog;
import com.sofascore.results.league.fragment.details.LeagueDetailsFragment;
import com.sofascore.results.league.fragment.details.PopularPlayersModal;
import com.sofascore.results.league.fragment.details.compose.goat.LeagueGoatVoteBottomSheet;
import com.sofascore.results.league.fragment.details.view.PlayerOfTheSeasonInfoBottomSheet;
import com.sofascore.results.main.matches.redesign.filter.MatchesFilterBottomSheetDialog;
import com.sofascore.results.main.matches.redesign.sportreorder.SportReorderComposeDialogFragment;
import com.sofascore.results.player.statistics.compare.seasonpicker.SeasonPickerBottomSheet;
import com.sofascore.results.pots.highestRated.bottomSheet.POTSHighestRatedPlayersFilterBottomSheet;
import com.sofascore.results.stagesport.StageFeaturedOddsView;
import com.sofascore.results.stagesport.StageTeamOddsView;
import com.sofascore.results.team.details.TeamDetailsFragment;
import com.sofascore.results.team.details.view.TeamAchievementsView;
import com.sofascore.results.team.lastnext.TeamEventsFragment;
import com.sofascore.results.team.lastnext.calendar.monthpicker.TeamEventsCalendarMonthPickerBottomSheet;
import com.sofascore.results.team.trophy.TeamTrophyCompareActivity;
import java.time.YearMonth;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class fl8 extends ot8 implements Function0 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fl8(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.b = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.view.View, androidx.recyclerview.widget.RecyclerView] */
    /* JADX WARN: Type inference failed for: r6v3, types: [androidx.recyclerview.widget.RecyclerView] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SharedPreferences d;
        YearMonth yearMonth;
        YearMonth yearMonth2;
        int i = 3;
        ?? r6 = 0;
        vt7 vt7Var = null;
        xce xceVar = null;
        switch (this.b) {
            case 0:
                FootballShotmapView footballShotmapView = (FootballShotmapView) this.receiver;
                int i2 = FootballShotmapView.O;
                footballShotmapView.b();
                return Unit.a;
            case 1:
                FootballShotmapView footballShotmapView2 = (FootballShotmapView) this.receiver;
                int i3 = FootballShotmapView.O;
                footballShotmapView2.a();
                return Unit.a;
            case 2:
                xy9 xy9Var = (xy9) this.receiver;
                ez0 ez0Var = xy9Var.c;
                mqi mqiVar = xy9Var.e;
                FrameLayout frameLayout = (FrameLayout) ez0Var.b;
                frameLayout.getClass();
                ViewParent parent = frameLayout.getParent();
                while (true) {
                    if (parent != null) {
                        if (frameLayout.getParent() instanceof RecyclerView) {
                            r6 = (RecyclerView) parent;
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
                if (r6 != 0) {
                    r6.getLocationInWindow((int[]) mqiVar.getValue());
                    int height = (r6.getHeight() / 2) + ((int[]) mqiVar.getValue())[1];
                    frameLayout.getLocationInWindow((int[]) mqiVar.getValue());
                    int height2 = (frameLayout.getHeight() + ((int[]) mqiVar.getValue())[1]) - height;
                    if (height2 > 0) {
                        r6.smoothScrollBy(0, height2);
                    }
                }
                return Unit.a;
            case 3:
                FragmentActivity requireActivity = ((LeagueDetailsFragment) this.receiver).requireActivity();
                requireActivity.getClass();
                PopularPlayersModal popularPlayersModal = new PopularPlayersModal();
                AppCompatActivity appCompatActivity = requireActivity instanceof AppCompatActivity ? (AppCompatActivity) requireActivity : null;
                if (appCompatActivity != null) {
                    wca.x(appCompatActivity.getLifecycle()).b(new r1(popularPlayersModal, appCompatActivity, r6, i));
                }
                return Unit.a;
            case 4:
                LeagueDetailsFragment leagueDetailsFragment = (LeagueDetailsFragment) this.receiver;
                Context requireContext = leagueDetailsFragment.requireContext();
                requireContext.getClass();
                String string = leagueDetailsFragment.getString(R.string.sofa_power_rankings);
                string.getClass();
                String string2 = leagueDetailsFragment.getString(R.string.power_rankings_description);
                string2.getClass();
                f7a.w(requireContext, string, string2, "PowerRankingsModal", null);
                return Unit.a;
            case 5:
                ((dsi) ((LeagueDetailsFragment) this.receiver).t.getValue()).f(y4b.h);
                return Unit.a;
            case 6:
                ((LeagueGoatVoteBottomSheet) this.receiver).j();
                return Unit.a;
            case 7:
                ((MatchesFilterBottomSheetDialog) this.receiver).j();
                return Unit.a;
            case 8:
                dyb dybVar = (dyb) this.receiver;
                dybVar.getClass();
                xw3.L(un0.z(dybVar), null, null, new ppa(dybVar, r6, 10), 3);
                return Unit.a;
            case 9:
                ((POTSHighestRatedPlayersFilterBottomSheet) this.receiver).j();
                return Unit.a;
            case 10:
                ((k4e) this.receiver).c.y(new g4e(false, h4e.h));
                return Unit.a;
            case 11:
                ((k4e) this.receiver).c.y(new g4e(false, h4e.h));
                return Unit.a;
            case 12:
                ade adeVar = (ade) this.receiver;
                Context i4 = adeVar.i();
                SharedPreferences sharedPreferences = uic.j;
                if (sharedPreferences == null) {
                    Context applicationContext = i4.getApplicationContext();
                    synchronized (uic.i) {
                        d = a5f.d(applicationContext);
                        uic.j = d;
                    }
                    d.getClass();
                    sharedPreferences = d;
                }
                SharedPreferences.Editor i5 = dmi.i(sharedPreferences, "showPenaltyHistoryDataDisclaimer", false);
                Unit unit = Unit.a;
                i5.apply();
                fdi fdiVar = adeVar.j;
                xce xceVar2 = (xce) fdiVar.getValue();
                if (xceVar2 != null) {
                    Player player = xceVar2.a;
                    Player player2 = xceVar2.b;
                    int i6 = xceVar2.c;
                    Integer num = xceVar2.d;
                    PlayerPenaltyHistoryResponse playerPenaltyHistoryResponse = xceVar2.e;
                    PlayerPenaltyHistoryResponse playerPenaltyHistoryResponse2 = xceVar2.f;
                    player.getClass();
                    xceVar = new xce(player, player2, i6, num, playerPenaltyHistoryResponse, playerPenaltyHistoryResponse2, false);
                }
                fdiVar.l(xceVar);
                return Unit.a;
            case 13:
                g9i g9iVar = ((roe) this.receiver).p;
                if (g9iVar != null) {
                    g9iVar.e(null);
                }
                return Unit.a;
            case 14:
                PlayerOfTheSeasonInfoBottomSheet playerOfTheSeasonInfoBottomSheet = (PlayerOfTheSeasonInfoBottomSheet) this.receiver;
                playerOfTheSeasonInfoBottomSheet.getClass();
                String str = (String) playerOfTheSeasonInfoBottomSheet.y.getValue();
                str.getClass();
                if (str.equals(Sports.FOOTBALL)) {
                    vt7Var = ut7.a;
                } else if (str.equals(Sports.BASKETBALL)) {
                    vt7Var = tt7.a;
                }
                if (vt7Var != null) {
                    FeatureWalkthroughFullScreenDialog featureWalkthroughFullScreenDialog = new FeatureWalkthroughFullScreenDialog();
                    featureWalkthroughFullScreenDialog.setArguments(hz8.E(new Pair("TYPE", vt7Var.getKey())));
                    featureWalkthroughFullScreenDialog.p(playerOfTheSeasonInfoBottomSheet.requireActivity().k(), "FeatureWalkthroughFullScreenDialog");
                }
                playerOfTheSeasonInfoBottomSheet.j();
                return Unit.a;
            case 15:
                k6g.access$onClosed((k6g) this.receiver);
                return Unit.a;
            case 16:
                tfg tfgVar = (tfg) this.receiver;
                int ordinal = tfgVar.M.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        tfgVar.j();
                    }
                } else if (tfgVar.e.k) {
                    tfgVar.j();
                } else {
                    xag xagVar = tfgVar.z;
                    if (xagVar != null) {
                        tfgVar.l(jfg.c);
                        tbg tbgVar = ((zag) xagVar).j;
                        if (tbgVar == null) {
                            Intrinsics.i("adViewController");
                            throw null;
                        }
                        tbgVar.expandAdView(true);
                    }
                }
                return Unit.a;
            case 17:
                ((SeasonPickerBottomSheet) this.receiver).j();
                return Unit.a;
            case 18:
                ((SofascoreAnalystTennisPromoBottomSheet) this.receiver).j();
                return Unit.a;
            case 19:
                ((SofascoreAnalystWorldCupOfferBottomSheet) this.receiver).j();
                return Unit.a;
            case 20:
                ((SportReorderComposeDialogFragment) this.receiver).k(false, false);
                return Unit.a;
            case 21:
                StageFeaturedOddsView stageFeaturedOddsView = (StageFeaturedOddsView) this.receiver;
                int i7 = StageFeaturedOddsView.m;
                stageFeaturedOddsView.m();
                return Unit.a;
            case 22:
                StageTeamOddsView stageTeamOddsView = (StageTeamOddsView) this.receiver;
                int i8 = StageTeamOddsView.n;
                stageTeamOddsView.m();
                return Unit.a;
            case 23:
                Function0 function0 = ((jai) this.receiver).w;
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.a;
            case 24:
                bhi bhiVar = (bhi) this.receiver;
                uyf uyfVar = bhiVar.r;
                if (uyfVar != null) {
                    uyfVar.cancel();
                }
                uyf uyfVar2 = new uyf(bhiVar);
                bhiVar.r = uyfVar2;
                uyfVar2.start();
                return Unit.a;
            case 25:
                TeamAchievementsView teamAchievementsView = (TeamAchievementsView) this.receiver;
                int i9 = TeamAchievementsView.m;
                Function0 function02 = teamAchievementsView.showTrophyComparisonClickListener;
                if (function02 != null) {
                    function02.invoke();
                }
                return Unit.a;
            case 26:
                TeamDetailsFragment teamDetailsFragment = (TeamDetailsFragment) this.receiver;
                teamDetailsFragment.getClass();
                int i10 = TeamTrophyCompareActivity.M;
                Context requireContext2 = teamDetailsFragment.requireContext();
                requireContext2.getClass();
                Team C = teamDetailsFragment.C();
                C.getClass();
                Intent intent = new Intent(requireContext2, (Class<?>) TeamTrophyCompareActivity.class);
                intent.putExtra("teamId", C.getId());
                intent.putExtra(SearchResponseKt.SPORT_ENTITY, C.getSportSlug());
                requireContext2.startActivity(intent);
                return Unit.a;
            case 27:
                xwi xwiVar = (xwi) this.receiver;
                lwi lwiVar = (lwi) xwiVar.o.getValue();
                if (lwiVar != null) {
                    YearMonth yearMonth3 = lwiVar.a;
                    YearMonth yearMonth4 = lwiVar.f;
                    if (yearMonth4 != null && yearMonth3.compareTo(yearMonth4) > 0) {
                        YearMonth minusMonths = yearMonth3.minusMonths(1L);
                        minusMonths.getClass();
                        xwiVar.m(minusMonths);
                    }
                }
                return Unit.a;
            case 28:
                xwi xwiVar2 = (xwi) this.receiver;
                lwi lwiVar2 = (lwi) xwiVar2.o.getValue();
                if (lwiVar2 != null) {
                    YearMonth yearMonth5 = lwiVar2.a;
                    YearMonth yearMonth6 = lwiVar2.g;
                    if (yearMonth6 != null && yearMonth5.compareTo(yearMonth6) < 0) {
                        YearMonth plusMonths = yearMonth5.plusMonths(1L);
                        plusMonths.getClass();
                        xwiVar2.m(plusMonths);
                    }
                }
                return Unit.a;
            default:
                TeamEventsFragment teamEventsFragment = (TeamEventsFragment) this.receiver;
                lwi lwiVar3 = (lwi) teamEventsFragment.E().p.a.getValue();
                if (lwiVar3 != null && (yearMonth = lwiVar3.f) != null && (yearMonth2 = lwiVar3.g) != null) {
                    YearMonth yearMonth7 = lwiVar3.a;
                    yearMonth7.getClass();
                    TeamEventsCalendarMonthPickerBottomSheet teamEventsCalendarMonthPickerBottomSheet = new TeamEventsCalendarMonthPickerBottomSheet();
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("ARG_FIRST_AVAILABLE_MONTH", yearMonth);
                    bundle.putSerializable("ARG_LAST_AVAILABLE_MONTH", yearMonth2);
                    bundle.putSerializable("ARG_SELECTED_YEAR_MONTH", yearMonth7);
                    teamEventsCalendarMonthPickerBottomSheet.setArguments(bundle);
                    teamEventsCalendarMonthPickerBottomSheet.p(teamEventsFragment.getChildFragmentManager(), "TeamEventsCalendarMonthPickerBottomSheet");
                }
                return Unit.a;
        }
    }
}
