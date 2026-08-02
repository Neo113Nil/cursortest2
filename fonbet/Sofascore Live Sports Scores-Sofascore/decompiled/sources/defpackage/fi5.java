package defpackage;

import androidx.fragment.app.Fragment;
import com.sofascore.results.dialog.EventListBottomSheet;
import com.sofascore.results.event.baseballPrematchLineups.EventBaseballPrematchLineupsFragment;
import com.sofascore.results.event.boxscore.EventBoxScoreFragment;
import com.sofascore.results.event.commentary.EventCommentaryFragment;
import com.sofascore.results.event.games.EventEsportsGamesFragment;
import com.sofascore.results.event.graphs.EventGraphsFragment;
import com.sofascore.results.event.hockeyplaybyplay.EventHockeyPlayByPlayFragment;
import com.sofascore.results.event.lineups.EventPreMatchLineupsFragment;
import com.sofascore.results.event.lineups.cricket.EventCricketLineupsFragment;
import com.sofascore.results.event.lineups.othersports.EventOtherSportsLineupsFragment;
import com.sofascore.results.event.matches.EventMatchesFragment;
import com.sofascore.results.event.media.EventMediaFragment;
import com.sofascore.results.event.scorecard.EventScorecardFragment;
import com.sofascore.results.event.standings.EventStandingsFragment;
import com.sofascore.results.event.statistics.EventStatisticsFragment;
import com.sofascore.results.fantasy.comparison.selectplayer.FantasyComparisonPlayersDialogFragment;
import com.sofascore.results.fantasy.competition.fixtures.FantasyCompetitionFixturesFragment;
import com.sofascore.results.fantasy.competition.home.FantasyCompetitionHomeFragment;
import com.sofascore.results.fantasy.competition.home.bottomsheet.chat.FantasyChatsBottomSheet;
import com.sofascore.results.fantasy.competition.leaderboard.FantasyCompetitionLeaderboardFragment;
import com.sofascore.results.fantasy.competition.leagues.bottomsheet.FantasyCreateLeagueBottomSheet;
import com.sofascore.results.fantasy.competition.selector.FantasyCompetitionSelectorBottomSheet;
import com.sofascore.results.fantasy.competition.statistics.FantasyCompetitionStatisticsFragment;
import com.sofascore.results.fantasy.competition.team.player.FantasyFootballPlayerBottomSheet;
import com.sofascore.results.fantasy.highlights.gameweek.points.FantasyGameweekHighlightsPointsFragment;
import com.sofascore.results.fantasy.highlights.gameweek.potgw.FantasyGameweekHighlightsPOTGWFragment;
import com.sofascore.results.fantasy.league.settings.bottomsheet.edit.FantasyEditLeagueBottomSheet;
import com.sofascore.results.fantasy.weekly.FantasyEliteFaceoffRevealDialog;
import com.sofascore.results.main.fantasy.center.elitefaceoff.FantasyEliteFaceoffIntroBottomSheet;
import com.sofascore.results.venue.editvenue.EditVenueDialog;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class fi5 extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ joa j;
    public final /* synthetic */ Fragment k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fi5(Fragment fragment, joa joaVar, int i) {
        super(0);
        this.i = i;
        this.k = fragment;
        this.j = joaVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        h79 h79Var;
        qtk defaultViewModelProviderFactory;
        qtk defaultViewModelProviderFactory2;
        qtk defaultViewModelProviderFactory3;
        qtk defaultViewModelProviderFactory4;
        qtk defaultViewModelProviderFactory5;
        qtk defaultViewModelProviderFactory6;
        qtk defaultViewModelProviderFactory7;
        qtk defaultViewModelProviderFactory8;
        qtk defaultViewModelProviderFactory9;
        qtk defaultViewModelProviderFactory10;
        qtk defaultViewModelProviderFactory11;
        qtk defaultViewModelProviderFactory12;
        qtk defaultViewModelProviderFactory13;
        qtk defaultViewModelProviderFactory14;
        qtk defaultViewModelProviderFactory15;
        qtk defaultViewModelProviderFactory16;
        qtk defaultViewModelProviderFactory17;
        qtk defaultViewModelProviderFactory18;
        qtk defaultViewModelProviderFactory19;
        qtk defaultViewModelProviderFactory20;
        qtk defaultViewModelProviderFactory21;
        qtk defaultViewModelProviderFactory22;
        qtk defaultViewModelProviderFactory23;
        qtk defaultViewModelProviderFactory24;
        qtk defaultViewModelProviderFactory25;
        qtk defaultViewModelProviderFactory26;
        qtk defaultViewModelProviderFactory27;
        qtk defaultViewModelProviderFactory28;
        qtk defaultViewModelProviderFactory29;
        qtk defaultViewModelProviderFactory30;
        int i = this.i;
        Fragment fragment = this.k;
        joa joaVar = this.j;
        switch (i) {
            case 0:
                ttk ttkVar = (ttk) joaVar.getValue();
                h79Var = ttkVar instanceof h79 ? (h79) ttkVar : null;
                return (h79Var == null || (defaultViewModelProviderFactory = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((EditVenueDialog) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            case 1:
                ttk ttkVar2 = (ttk) joaVar.getValue();
                h79Var = ttkVar2 instanceof h79 ? (h79) ttkVar2 : null;
                return (h79Var == null || (defaultViewModelProviderFactory2 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((EventBaseballPrematchLineupsFragment) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory2;
            case 2:
                ttk ttkVar3 = (ttk) joaVar.getValue();
                h79Var = ttkVar3 instanceof h79 ? (h79) ttkVar3 : null;
                return (h79Var == null || (defaultViewModelProviderFactory3 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((EventBoxScoreFragment) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory3;
            case 3:
                ttk ttkVar4 = (ttk) joaVar.getValue();
                h79Var = ttkVar4 instanceof h79 ? (h79) ttkVar4 : null;
                return (h79Var == null || (defaultViewModelProviderFactory4 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((EventCommentaryFragment) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory4;
            case 4:
                ttk ttkVar5 = (ttk) joaVar.getValue();
                h79Var = ttkVar5 instanceof h79 ? (h79) ttkVar5 : null;
                return (h79Var == null || (defaultViewModelProviderFactory5 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((EventCricketLineupsFragment) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory5;
            case 5:
                ttk ttkVar6 = (ttk) joaVar.getValue();
                h79Var = ttkVar6 instanceof h79 ? (h79) ttkVar6 : null;
                return (h79Var == null || (defaultViewModelProviderFactory6 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((EventEsportsGamesFragment) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory6;
            case 6:
                ttk ttkVar7 = (ttk) joaVar.getValue();
                h79Var = ttkVar7 instanceof h79 ? (h79) ttkVar7 : null;
                return (h79Var == null || (defaultViewModelProviderFactory7 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((EventGraphsFragment) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory7;
            case 7:
                ttk ttkVar8 = (ttk) joaVar.getValue();
                h79Var = ttkVar8 instanceof h79 ? (h79) ttkVar8 : null;
                return (h79Var == null || (defaultViewModelProviderFactory8 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((EventHockeyPlayByPlayFragment) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory8;
            case 8:
                ttk ttkVar9 = (ttk) joaVar.getValue();
                h79Var = ttkVar9 instanceof h79 ? (h79) ttkVar9 : null;
                return (h79Var == null || (defaultViewModelProviderFactory9 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((EventListBottomSheet) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory9;
            case 9:
                ttk ttkVar10 = (ttk) joaVar.getValue();
                h79Var = ttkVar10 instanceof h79 ? (h79) ttkVar10 : null;
                return (h79Var == null || (defaultViewModelProviderFactory10 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((EventMatchesFragment) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory10;
            case 10:
                ttk ttkVar11 = (ttk) joaVar.getValue();
                h79Var = ttkVar11 instanceof h79 ? (h79) ttkVar11 : null;
                return (h79Var == null || (defaultViewModelProviderFactory11 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((EventMediaFragment) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory11;
            case 11:
                ttk ttkVar12 = (ttk) joaVar.getValue();
                h79Var = ttkVar12 instanceof h79 ? (h79) ttkVar12 : null;
                return (h79Var == null || (defaultViewModelProviderFactory12 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((EventOtherSportsLineupsFragment) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory12;
            case 12:
                ttk ttkVar13 = (ttk) joaVar.getValue();
                h79Var = ttkVar13 instanceof h79 ? (h79) ttkVar13 : null;
                return (h79Var == null || (defaultViewModelProviderFactory13 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((EventPreMatchLineupsFragment) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory13;
            case 13:
                ttk ttkVar14 = (ttk) joaVar.getValue();
                h79Var = ttkVar14 instanceof h79 ? (h79) ttkVar14 : null;
                return (h79Var == null || (defaultViewModelProviderFactory14 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((EventScorecardFragment) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory14;
            case 14:
                ttk ttkVar15 = (ttk) joaVar.getValue();
                h79Var = ttkVar15 instanceof h79 ? (h79) ttkVar15 : null;
                return (h79Var == null || (defaultViewModelProviderFactory15 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((EventStandingsFragment) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory15;
            case 15:
                ttk ttkVar16 = (ttk) joaVar.getValue();
                h79Var = ttkVar16 instanceof h79 ? (h79) ttkVar16 : null;
                return (h79Var == null || (defaultViewModelProviderFactory16 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((EventStatisticsFragment) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory16;
            case 16:
                ttk ttkVar17 = (ttk) joaVar.getValue();
                h79Var = ttkVar17 instanceof h79 ? (h79) ttkVar17 : null;
                return (h79Var == null || (defaultViewModelProviderFactory17 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((FantasyChatsBottomSheet) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory17;
            case 17:
                ttk ttkVar18 = (ttk) joaVar.getValue();
                h79Var = ttkVar18 instanceof h79 ? (h79) ttkVar18 : null;
                return (h79Var == null || (defaultViewModelProviderFactory18 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((FantasyComparisonPlayersDialogFragment) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory18;
            case 18:
                ttk ttkVar19 = (ttk) joaVar.getValue();
                h79Var = ttkVar19 instanceof h79 ? (h79) ttkVar19 : null;
                return (h79Var == null || (defaultViewModelProviderFactory19 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((FantasyCompetitionFixturesFragment) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory19;
            case 19:
                ttk ttkVar20 = (ttk) joaVar.getValue();
                h79Var = ttkVar20 instanceof h79 ? (h79) ttkVar20 : null;
                return (h79Var == null || (defaultViewModelProviderFactory20 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((FantasyCompetitionHomeFragment) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory20;
            case 20:
                ttk ttkVar21 = (ttk) joaVar.getValue();
                h79Var = ttkVar21 instanceof h79 ? (h79) ttkVar21 : null;
                return (h79Var == null || (defaultViewModelProviderFactory21 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((FantasyCompetitionLeaderboardFragment) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory21;
            case 21:
                ttk ttkVar22 = (ttk) joaVar.getValue();
                h79Var = ttkVar22 instanceof h79 ? (h79) ttkVar22 : null;
                return (h79Var == null || (defaultViewModelProviderFactory22 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((FantasyCompetitionSelectorBottomSheet) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory22;
            case 22:
                ttk ttkVar23 = (ttk) joaVar.getValue();
                h79Var = ttkVar23 instanceof h79 ? (h79) ttkVar23 : null;
                return (h79Var == null || (defaultViewModelProviderFactory23 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((FantasyCompetitionStatisticsFragment) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory23;
            case 23:
                ttk ttkVar24 = (ttk) joaVar.getValue();
                h79Var = ttkVar24 instanceof h79 ? (h79) ttkVar24 : null;
                return (h79Var == null || (defaultViewModelProviderFactory24 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((FantasyCreateLeagueBottomSheet) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory24;
            case 24:
                ttk ttkVar25 = (ttk) joaVar.getValue();
                h79Var = ttkVar25 instanceof h79 ? (h79) ttkVar25 : null;
                return (h79Var == null || (defaultViewModelProviderFactory25 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((FantasyEditLeagueBottomSheet) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory25;
            case 25:
                ttk ttkVar26 = (ttk) joaVar.getValue();
                h79Var = ttkVar26 instanceof h79 ? (h79) ttkVar26 : null;
                return (h79Var == null || (defaultViewModelProviderFactory26 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((FantasyEliteFaceoffIntroBottomSheet) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory26;
            case 26:
                ttk ttkVar27 = (ttk) joaVar.getValue();
                h79Var = ttkVar27 instanceof h79 ? (h79) ttkVar27 : null;
                return (h79Var == null || (defaultViewModelProviderFactory27 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((FantasyEliteFaceoffRevealDialog) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory27;
            case 27:
                ttk ttkVar28 = (ttk) joaVar.getValue();
                h79Var = ttkVar28 instanceof h79 ? (h79) ttkVar28 : null;
                return (h79Var == null || (defaultViewModelProviderFactory28 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((FantasyFootballPlayerBottomSheet) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory28;
            case 28:
                ttk ttkVar29 = (ttk) joaVar.getValue();
                h79Var = ttkVar29 instanceof h79 ? (h79) ttkVar29 : null;
                return (h79Var == null || (defaultViewModelProviderFactory29 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((FantasyGameweekHighlightsPOTGWFragment) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory29;
            default:
                ttk ttkVar30 = (ttk) joaVar.getValue();
                h79Var = ttkVar30 instanceof h79 ? (h79) ttkVar30 : null;
                return (h79Var == null || (defaultViewModelProviderFactory30 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((FantasyGameweekHighlightsPointsFragment) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory30;
        }
    }
}
