package defpackage;

import com.sofascore.model.newNetwork.statistics.season.player.BasketballPlayerSeasonStatistics;
import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class dq1 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ dq1(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String l;
        switch (this.a) {
            case 0:
                return new q9k(R.string.basketball_field_goals_attempted_short);
            case 1:
                return new q9k(R.string.field_goal_attempts);
            case 2:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics.getClass();
                String y0 = o02.y0(basketballPlayerSeasonStatistics.getFieldGoalAttempts());
                Regex regex = yid.a;
                return y0;
            case 3:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics2 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics2.getClass();
                Integer fieldGoalAttempts = basketballPlayerSeasonStatistics2.getFieldGoalAttempts();
                l = fieldGoalAttempts != null ? rei.l(yid.m(basketballPlayerSeasonStatistics2.getAppearances()), Integer.valueOf(fieldGoalAttempts.intValue())) : null;
                Regex regex2 = yid.a;
                return l == null ? "-" : l;
            case 4:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics3 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics3.getClass();
                return Integer.valueOf(yid.m(basketballPlayerSeasonStatistics3.getFieldGoalAttempts()));
            case 5:
                return new q9k(R.string.basketball_lineups_field_goals_pct);
            case 6:
                return new q9k(R.string.field_goals_percentage);
            case 7:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics4 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics4.getClass();
                String o = yid.o(basketballPlayerSeasonStatistics4.getFieldGoalsMade(), basketballPlayerSeasonStatistics4.getFieldGoalAttempts());
                return o == null ? "-" : o;
            case 8:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics5 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics5.getClass();
                String o2 = yid.o(basketballPlayerSeasonStatistics5.getFieldGoalsMade(), basketballPlayerSeasonStatistics5.getFieldGoalAttempts());
                return o2 == null ? "-" : o2;
            case 9:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics6 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics6.getClass();
                return Double.valueOf(yid.k(yid.b(basketballPlayerSeasonStatistics6.getFieldGoalsMade(), basketballPlayerSeasonStatistics6.getFieldGoalAttempts())));
            case 10:
                return new q9k(R.string.basketball_free_throws_made_short);
            case 11:
                return new q9k(R.string.basketball_free_throws_made);
            case 12:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics7 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics7.getClass();
                String y02 = o02.y0(basketballPlayerSeasonStatistics7.getFreeThrowsMade());
                Regex regex3 = yid.a;
                return y02;
            case 13:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics8 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics8.getClass();
                Integer freeThrowsMade = basketballPlayerSeasonStatistics8.getFreeThrowsMade();
                l = freeThrowsMade != null ? rei.l(yid.m(basketballPlayerSeasonStatistics8.getAppearances()), Integer.valueOf(freeThrowsMade.intValue())) : null;
                Regex regex4 = yid.a;
                return l == null ? "-" : l;
            case 14:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics9 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics9.getClass();
                return Integer.valueOf(yid.m(basketballPlayerSeasonStatistics9.getFreeThrowsMade()));
            case 15:
                return new q9k(R.string.basketball_free_throws_attempted_short);
            case 16:
                return new q9k(R.string.basketball_free_throws_attempted);
            case 17:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics10 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics10.getClass();
                String y03 = o02.y0(basketballPlayerSeasonStatistics10.getFreeThrowAttempts());
                Regex regex5 = yid.a;
                return y03;
            case 18:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics11 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics11.getClass();
                Integer freeThrowAttempts = basketballPlayerSeasonStatistics11.getFreeThrowAttempts();
                l = freeThrowAttempts != null ? rei.l(yid.m(basketballPlayerSeasonStatistics11.getAppearances()), Integer.valueOf(freeThrowAttempts.intValue())) : null;
                Regex regex6 = yid.a;
                return l == null ? "-" : l;
            case 19:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics12 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics12.getClass();
                return Integer.valueOf(yid.m(basketballPlayerSeasonStatistics12.getFreeThrowAttempts()));
            case 20:
                return new q9k(R.string.basketball_lineups_free_throw_pct);
            case 21:
                return new q9k(R.string.free_throws_percentage);
            case 22:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics13 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics13.getClass();
                String o3 = yid.o(basketballPlayerSeasonStatistics13.getFreeThrowsMade(), basketballPlayerSeasonStatistics13.getFreeThrowAttempts());
                return o3 == null ? "-" : o3;
            case 23:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics14 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics14.getClass();
                String o4 = yid.o(basketballPlayerSeasonStatistics14.getFreeThrowsMade(), basketballPlayerSeasonStatistics14.getFreeThrowAttempts());
                return o4 == null ? "-" : o4;
            case 24:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics15 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics15.getClass();
                return Double.valueOf(yid.k(yid.b(basketballPlayerSeasonStatistics15.getFreeThrowsMade(), basketballPlayerSeasonStatistics15.getFreeThrowAttempts())));
            case 25:
                return new q9k(R.string.basketball_games_played_short);
            case 26:
                return new q9k(R.string.basketball_games_played);
            case 27:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics16 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics16.getClass();
                String y04 = o02.y0(basketballPlayerSeasonStatistics16.getAppearances());
                Regex regex7 = yid.a;
                return y04;
            case 28:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics17 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics17.getClass();
                String y05 = o02.y0(basketballPlayerSeasonStatistics17.getAppearances());
                Regex regex8 = yid.a;
                return y05;
            default:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics18 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics18.getClass();
                return Integer.valueOf(yid.m(basketballPlayerSeasonStatistics18.getAppearances()));
        }
    }
}
