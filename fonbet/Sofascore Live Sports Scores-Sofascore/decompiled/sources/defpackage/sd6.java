package defpackage;

import androidx.fragment.app.Fragment;
import com.sofascore.model.Sports;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.R;
import com.sofascore.results.crowdsourcing.EventContributeFragment;
import com.sofascore.results.event.aiInsights.EventAiInsightsFragment;
import com.sofascore.results.event.baseballPrematchLineups.EventBaseballPrematchLineupsFragment;
import com.sofascore.results.event.boxscore.EventBoxScoreFragment;
import com.sofascore.results.event.boxscoreAnimation.EventBoxScoreFragmentNew;
import com.sofascore.results.event.commentary.EventCommentaryFragment;
import com.sofascore.results.event.cuptree.EventCupTreeFragment;
import com.sofascore.results.event.details.EventDetailsFragment;
import com.sofascore.results.event.games.EventEsportsGamesFragment;
import com.sofascore.results.event.graphs.EventGraphsFragment;
import com.sofascore.results.event.hockeyplaybyplay.EventHockeyPlayByPlayFragment;
import com.sofascore.results.event.lineups.EventPreMatchLineupsFragment;
import com.sofascore.results.event.lineups.cricket.EventCricketLineupsFragment;
import com.sofascore.results.event.lineups.football.EventFootballLineupsFragment;
import com.sofascore.results.event.lineups.othersports.EventOtherSportsLineupsFragment;
import com.sofascore.results.event.matches.EventMatchesFragment;
import com.sofascore.results.event.media.EventMediaFragment;
import com.sofascore.results.event.mmastatistics.EventMmaStatisticsFragment;
import com.sofascore.results.event.odds.additionalodds.AdditionalOddsFragment;
import com.sofascore.results.event.odds.eventrecomended.EventRecommendedOddsFragment;
import com.sofascore.results.event.odds.oddscomparison.AdditionalOddsComparisonFragment;
import com.sofascore.results.event.overs.EventOversFragment;
import com.sofascore.results.event.scorecard.EventScorecardFragment;
import com.sofascore.results.event.standings.EventStandingsFragment;
import com.sofascore.results.event.statistics.EventStatisticsFragment;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class sd6 extends s8 {
    public String r;
    public Integer s;
    public String t;
    public String u;

    @Override // defpackage.d41
    public final Fragment C(Enum r2) {
        rd6 rd6Var = (rd6) r2;
        rd6Var.getClass();
        switch (rd6Var.ordinal()) {
            case 0:
                return new EventDetailsFragment();
            case 1:
                return new EventAiInsightsFragment();
            case 2:
                return new EventContributeFragment();
            case 3:
                return new AdditionalOddsFragment();
            case 4:
                return new AdditionalOddsComparisonFragment();
            case 5:
                return new EventCommentaryFragment();
            case 6:
                return new EventOversFragment();
            case 7:
                return new EventScorecardFragment();
            case 8:
                return new EventEsportsGamesFragment();
            case 9:
                String J = J();
                return J.equals(Sports.FOOTBALL) ? new EventFootballLineupsFragment() : J.equals(Sports.CRICKET) ? new EventCricketLineupsFragment() : new EventOtherSportsLineupsFragment();
            case 10:
                return new EventPreMatchLineupsFragment();
            case 11:
                return new EventBaseballPrematchLineupsFragment();
            case 12:
                yea yeaVar = j58.a;
                e58 f = e58.f();
                f.getClass();
                nxf[] nxfVarArr = nxf.a;
                if (f.c("new_box_score_enabled")) {
                    Set set = xt5.a;
                    if (xt5.a.contains(J())) {
                        return new EventBoxScoreFragmentNew();
                    }
                }
                return new EventBoxScoreFragment();
            case 13:
                return new EventStatisticsFragment();
            case 14:
                return new EventMmaStatisticsFragment();
            case 15:
                return new EventHockeyPlayByPlayFragment();
            case 16:
                return new EventStandingsFragment();
            case 17:
                return new EventGraphsFragment();
            case 18:
                return new EventCupTreeFragment();
            case 19:
                return new EventRecommendedOddsFragment();
            case 20:
                return new EventMatchesFragment();
            case 21:
                return new EventMediaFragment();
            default:
                zzl.b();
                return null;
        }
    }

    @Override // defpackage.s8
    public final String H(Enum r4) {
        int i;
        rd6 rd6Var = (rd6) r4;
        rd6Var.getClass();
        int ordinal = rd6Var.ordinal();
        if (ordinal == 5) {
            mqi mqiVar = bii.a;
            i = J().equals(Sports.BASEBALL) ? R.string.baseball_play_by_play : R.string.commentary;
        } else if (ordinal == 9) {
            i = J().equals(Sports.CRICKET) ? R.string.squads : R.string.lineups;
        } else if (ordinal == 12) {
            mqi mqiVar2 = bii.a;
            i = J().equals(Sports.RUGBY) ? R.string.rugby_box_score : R.string.box_score;
        } else if (ordinal == 18) {
            mqi mqiVar3 = bii.a;
            i = bii.a(J(), this.s, this.u, this.t);
        } else if (ordinal != 20) {
            i = rd6Var.a;
        } else {
            mqi mqiVar4 = bii.a;
            i = bii.b(J(), false);
        }
        String string = y().getString(i);
        string.getClass();
        return string;
    }

    public final String J() {
        String str = this.r;
        if (str != null) {
            return str;
        }
        Intrinsics.i(SearchResponseKt.SPORT_ENTITY);
        throw null;
    }
}
