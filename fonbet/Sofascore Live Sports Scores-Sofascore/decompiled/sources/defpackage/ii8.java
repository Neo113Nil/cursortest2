package defpackage;

import com.sofascore.model.newNetwork.statistics.season.player.FootballPlayerSeasonStatistics;
import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ii8 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ ii8(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return new q9k(R.string.football_penalties_saved);
            case 1:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics.getClass();
                String y0 = o02.y0(footballPlayerSeasonStatistics.getPenaltySave());
                Regex regex = yid.a;
                return y0;
            case 2:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics2 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics2.getClass();
                Integer penaltySave = footballPlayerSeasonStatistics2.getPenaltySave();
                String j = penaltySave != null ? fc6.j(footballPlayerSeasonStatistics2, Integer.valueOf(penaltySave.intValue())) : null;
                Regex regex2 = yid.a;
                return j == null ? "-" : j;
            case 3:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics3 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics3.getClass();
                return Integer.valueOf(yid.m(footballPlayerSeasonStatistics3.getPenaltySave()));
            case 4:
                return new q9k(R.string.football_penalty_save_percentage_short);
            case 5:
                return new q9k(R.string.football_penalty_save_percentage);
            case 6:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics4 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics4.getClass();
                String o = yid.o(footballPlayerSeasonStatistics4.getPenaltySave(), footballPlayerSeasonStatistics4.getPenaltyFaced());
                return o == null ? "-" : o;
            case 7:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics5 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics5.getClass();
                String o2 = yid.o(footballPlayerSeasonStatistics5.getPenaltySave(), footballPlayerSeasonStatistics5.getPenaltyFaced());
                return o2 == null ? "-" : o2;
            case 8:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics6 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics6.getClass();
                return Double.valueOf(yid.k(yid.b(footballPlayerSeasonStatistics6.getPenaltySave(), footballPlayerSeasonStatistics6.getPenaltyFaced())));
            case 9:
                return new q9k(R.string.football_red_cards_short);
            case 10:
                return new q9k(R.string.football_red_cards);
            case 11:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics7 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics7.getClass();
                String y02 = o02.y0(footballPlayerSeasonStatistics7.getRedCards());
                Regex regex3 = yid.a;
                return y02;
            case 12:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics8 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics8.getClass();
                Integer redCards = footballPlayerSeasonStatistics8.getRedCards();
                String j2 = redCards != null ? fc6.j(footballPlayerSeasonStatistics8, Integer.valueOf(redCards.intValue())) : null;
                Regex regex4 = yid.a;
                return j2 == null ? "-" : j2;
            case 13:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics9 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics9.getClass();
                return Integer.valueOf(yid.m(footballPlayerSeasonStatistics9.getRedCards()));
            case 14:
                return new q9k(R.string.ice_hockey_lineups_saves);
            case 15:
                return new q9k(R.string.football_saves);
            case 16:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics10 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics10.getClass();
                String y03 = o02.y0(footballPlayerSeasonStatistics10.getSaves());
                Regex regex5 = yid.a;
                return y03;
            case 17:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics11 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics11.getClass();
                Integer saves = footballPlayerSeasonStatistics11.getSaves();
                String j3 = saves != null ? fc6.j(footballPlayerSeasonStatistics11, Integer.valueOf(saves.intValue())) : null;
                Regex regex6 = yid.a;
                return j3 == null ? "-" : j3;
            case 18:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics12 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics12.getClass();
                return Integer.valueOf(yid.m(footballPlayerSeasonStatistics12.getSaves()));
            case 19:
                return new q9k(R.string.football_saves_percentage_short);
            case 20:
                return new q9k(R.string.football_saves_percentage);
            case 21:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics13 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics13.getClass();
                Integer saves2 = footballPlayerSeasonStatistics13.getSaves();
                Integer saves3 = footballPlayerSeasonStatistics13.getSaves();
                String o3 = yid.o(saves2, saves3 != null ? Integer.valueOf(yid.m(footballPlayerSeasonStatistics13.getGoalsConceded()) + saves3.intValue()) : null);
                return o3 == null ? "-" : o3;
            case 22:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics14 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics14.getClass();
                Integer saves4 = footballPlayerSeasonStatistics14.getSaves();
                Integer saves5 = footballPlayerSeasonStatistics14.getSaves();
                String o4 = yid.o(saves4, saves5 != null ? Integer.valueOf(yid.m(footballPlayerSeasonStatistics14.getGoalsConceded()) + saves5.intValue()) : null);
                return o4 == null ? "-" : o4;
            case 23:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics15 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics15.getClass();
                Integer saves6 = footballPlayerSeasonStatistics15.getSaves();
                Integer saves7 = footballPlayerSeasonStatistics15.getSaves();
                return Double.valueOf(yid.k(yid.b(saves6, saves7 != null ? Integer.valueOf(yid.m(footballPlayerSeasonStatistics15.getGoalsConceded()) + saves7.intValue()) : null)));
            case 24:
                return new q9k(R.string.football_shots_on_target_short);
            case 25:
                return new q9k(R.string.football_shots_on_goal);
            case 26:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics16 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics16.getClass();
                String y04 = o02.y0(footballPlayerSeasonStatistics16.getShotsOnTarget());
                Regex regex7 = yid.a;
                return y04;
            case 27:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics17 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics17.getClass();
                Integer shotsOnTarget = footballPlayerSeasonStatistics17.getShotsOnTarget();
                String j4 = shotsOnTarget != null ? fc6.j(footballPlayerSeasonStatistics17, Integer.valueOf(shotsOnTarget.intValue())) : null;
                Regex regex8 = yid.a;
                return j4 == null ? "-" : j4;
            case 28:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics18 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics18.getClass();
                return Integer.valueOf(yid.m(footballPlayerSeasonStatistics18.getShotsOnTarget()));
            default:
                return new q9k(R.string.average_sofascore_rating_short);
        }
    }
}
