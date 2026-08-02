package defpackage;

import androidx.compose.runtime.e;
import com.sofascore.model.FirebaseNonGoogleAdsCountry;
import com.sofascore.model.Sports;
import com.sofascore.model.fantasy.FantasyUserLeaguesResponse;
import com.sofascore.model.fantasy.FantasyUserRoundRankingsResponse;
import com.sofascore.model.fantasy.FantasyUserRoundsResponse;
import com.sofascore.model.fantasy.FantasyUserSquad;
import com.sofascore.model.mvvm.model.FieldTranslations;
import com.sofascore.model.mvvm.model.FootballEvent;
import com.sofascore.model.newNetwork.FeaturedEventsResponse;
import com.sofascore.model.newNetwork.FeaturedOddsResponse;
import com.sofascore.model.newNetwork.FeaturedPrematchOddsResponse;
import com.sofascore.model.newNetwork.FirstTeamToScoreOptions;
import com.sofascore.model.odds.ProviderOdds;
import com.sofascore.results.R;
import com.sofascore.results.event.details.view.odds.FeaturedOddsView;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class go7 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ go7(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KSerializer _childSerializers$_anonymous_;
        KSerializer _childSerializers$_anonymous_2;
        KSerializer _childSerializers$_anonymous_3;
        KSerializer _childSerializers$_anonymous_4;
        KSerializer _childSerializers$_anonymous_5;
        KSerializer _childSerializers$_anonymous_6;
        KSerializer _childSerializers$_anonymous_7;
        KSerializer _childSerializers$_anonymous_8;
        KSerializer _childSerializers$_anonymous_$0;
        KSerializer _childSerializers$_anonymous_9;
        KSerializer _init_$_anonymous_;
        KSerializer _childSerializers$_anonymous_10;
        KSerializer _childSerializers$_anonymous_$02;
        KSerializer _childSerializers$_anonymous_$1;
        switch (this.a) {
            case 0:
                _childSerializers$_anonymous_ = FantasyUserLeaguesResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 1:
                _childSerializers$_anonymous_2 = FantasyUserRoundRankingsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
            case 2:
                _childSerializers$_anonymous_3 = FantasyUserRoundsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_3;
            case 3:
                _childSerializers$_anonymous_4 = FantasyUserSquad._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_4;
            case 4:
                return Unit.a;
            case 5:
                return Unit.a;
            case 6:
                return Unit.a;
            case 7:
                return 3;
            case 8:
                return e.f(Boolean.FALSE);
            case 9:
                _childSerializers$_anonymous_5 = FeaturedEventsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_5;
            case 10:
                return new and((old) hi.a.getValue(), (fgf) iu7.a.getValue());
            case 11:
                return new fgf(1, (r9k) new m9k("Full time"), 1, true, l6g.W(b.j(new dld(new m9k("1"), -1, "23 / 20"), new dld(new m9k("X"), -1, "5 / 2"), new dld(new m9k("2"), 1, "21 / 10"))), ProviderOdds.Type.STANDARD, (String) null, 128);
            case 12:
                _childSerializers$_anonymous_6 = FeaturedOddsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_6;
            case 13:
                int i = FeaturedOddsView.p;
                yea yeaVar = j58.a;
                e58 f = e58.f();
                f.getClass();
                return Boolean.valueOf(f.c("event_analytics_count_odds_view"));
            case 14:
                _childSerializers$_anonymous_7 = FeaturedPrematchOddsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_7;
            case 15:
                return Unit.a;
            case 16:
                return Unit.a;
            case 17:
                return new bx7(1, 1, 1, "Premier League", "", Sports.FOOTBALL, new fy7(1, "Barcelona", "Barcelona", null, null, Double.valueOf(6.6d), 3952), new fy7(2, "Real Madrid", "Real Madrid", null, null, Double.valueOf(8.6d), 3952), null, "FT", "Finished", null, 4, 1, null, null, 1, false, false, 182528);
            case 18:
                joa joaVar = sx7.b;
                return new bx7(1, 1, 1, "Premier League", "", Sports.FOOTBALL, (fy7) joaVar.getValue(), (fy7) joaVar.getValue(), null, null, null, null, 4, 1, null, null, 1, false, true, 184064);
            case 19:
                joa joaVar2 = sx7.c;
                return new fy7(1, "Novak Djokovic", "N.Djokovic", (ey7) joaVar2.getValue(), (ey7) joaVar2.getValue(), null, 2688);
            case 20:
                return new fy7(1, "Manchester City", "Man.City", null, null, Double.valueOf(8.9d), 3952);
            case 21:
                return new ey7(1, "I.Karlovic", "HR");
            case 22:
                joa joaVar3 = sx7.a;
                bx7 bx7Var = (bx7) joaVar3.getValue();
                ux7 ux7Var = new ux7(1, "Player name");
                fy7 fy7Var = new fy7(1, "Abc", "Abc", null, null, null, 4080);
                Integer valueOf = Integer.valueOf(R.string.football_minutes_played);
                Pair pair = new Pair(valueOf, "88'");
                Integer valueOf2 = Integer.valueOf(R.string.goals);
                Pair pair2 = new Pair(valueOf2, "2");
                Integer valueOf3 = Integer.valueOf(R.string.football_expected_goals);
                Pair pair3 = new Pair(valueOf3, "1.21");
                Integer valueOf4 = Integer.valueOf(R.string.football_total_shots);
                List j = b.j(pair, pair2, pair3, new Pair(valueOf4, "4"));
                Double valueOf5 = Double.valueOf(8.5d);
                List j2 = b.j(new c56(1, "Title", "Body", 0L, Sports.FOOTBALL, bx7Var, ux7Var, fy7Var, valueOf5, j), new c56(2, null, null, 0L, Sports.FOOTBALL, (bx7) joaVar3.getValue(), new ux7(1, "Player name"), new fy7(1, "Abc", "Abc", null, null, null, 4080), valueOf5, b.j(new Pair(valueOf, "88'"), new Pair(valueOf2, "2"), new Pair(valueOf3, "1.21"), new Pair(valueOf4, "4"))));
                j2.getClass();
                return j2;
            case 23:
                _childSerializers$_anonymous_8 = FieldTranslations._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_8;
            case 24:
                _childSerializers$_anonymous_$0 = FieldTranslations._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$0;
            case 25:
                _childSerializers$_anonymous_9 = FirebaseNonGoogleAdsCountry._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_9;
            case 26:
                _init_$_anonymous_ = FirstTeamToScoreOptions._init_$_anonymous_();
                return _init_$_anonymous_;
            case 27:
                _childSerializers$_anonymous_10 = FootballEvent._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_10;
            case 28:
                _childSerializers$_anonymous_$02 = FootballEvent._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$02;
            default:
                _childSerializers$_anonymous_$1 = FootballEvent._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$1;
        }
    }
}
