package defpackage;

import com.sofascore.model.newNetwork.statistics.season.player.BasketballPlayerSeasonStatistics;
import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class kq1 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ kq1(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        r2 = null;
        String str = null;
        switch (this.a) {
            case 0:
                return new q9k(R.string.basketball_lineups_minutes_played);
            case 1:
                return new q9k(R.string.minutes);
            case 2:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics.getClass();
                Double b = yid.b(basketballPlayerSeasonStatistics.getSecondsPlayed(), 60);
                return o02.y0(b != null ? Integer.valueOf(wzb.a(b.doubleValue())) : null);
            case 3:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics2 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics2.getClass();
                Integer secondsPlayed = basketballPlayerSeasonStatistics2.getSecondsPlayed();
                if (secondsPlayed != null) {
                    if (secondsPlayed.intValue() <= 0) {
                        secondsPlayed = null;
                    }
                    if (secondsPlayed != null) {
                        str = rei.l(yid.m(basketballPlayerSeasonStatistics2.getAppearances()) * 60, Integer.valueOf(secondsPlayed.intValue()));
                    }
                }
                Regex regex = yid.a;
                return str == null ? "-" : str;
            case 4:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics3 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics3.getClass();
                return Integer.valueOf(yid.m(basketballPlayerSeasonStatistics3.getSecondsPlayed()));
            case 5:
                return new q9k(R.string.basketball_lineups_off_rebounds);
            case 6:
                return new q9k(R.string.offensive_rebounds);
            case 7:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics4 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics4.getClass();
                String y0 = o02.y0(basketballPlayerSeasonStatistics4.getOffensiveRebounds());
                Regex regex2 = yid.a;
                return y0;
            case 8:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics5 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics5.getClass();
                Integer offensiveRebounds = basketballPlayerSeasonStatistics5.getOffensiveRebounds();
                String l = offensiveRebounds != null ? rei.l(yid.m(basketballPlayerSeasonStatistics5.getAppearances()), Integer.valueOf(offensiveRebounds.intValue())) : null;
                Regex regex3 = yid.a;
                return l == null ? "-" : l;
            case 9:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics6 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics6.getClass();
                return Integer.valueOf(yid.m(basketballPlayerSeasonStatistics6.getOffensiveRebounds()));
            case 10:
                return new q9k(R.string.basketball_personal_fouls_short);
            case 11:
                return new q9k(R.string.basketball_personal_fouls);
            case 12:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics7 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics7.getClass();
                String y02 = o02.y0(basketballPlayerSeasonStatistics7.getPersonalFouls());
                Regex regex4 = yid.a;
                return y02;
            case 13:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics8 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics8.getClass();
                Integer personalFouls = basketballPlayerSeasonStatistics8.getPersonalFouls();
                String l2 = personalFouls != null ? rei.l(yid.m(basketballPlayerSeasonStatistics8.getAppearances()), Integer.valueOf(personalFouls.intValue())) : null;
                Regex regex5 = yid.a;
                return l2 == null ? "-" : l2;
            case 14:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics9 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics9.getClass();
                return Integer.valueOf(yid.m(basketballPlayerSeasonStatistics9.getPersonalFouls()));
            case 15:
                return new q9k(R.string.performance_index_rating_short);
            case 16:
                return new q9k(R.string.legend_bball_performance_index_rating);
            case 17:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics10 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics10.getClass();
                Integer pir = basketballPlayerSeasonStatistics10.getPir();
                String l3 = pir != null ? rei.l(yid.m(basketballPlayerSeasonStatistics10.getAppearances()), Integer.valueOf(pir.intValue())) : null;
                Regex regex6 = yid.a;
                return l3 == null ? "-" : l3;
            case 18:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics11 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics11.getClass();
                Integer pir2 = basketballPlayerSeasonStatistics11.getPir();
                String l4 = pir2 != null ? rei.l(yid.m(basketballPlayerSeasonStatistics11.getAppearances()), Integer.valueOf(pir2.intValue())) : null;
                Regex regex7 = yid.a;
                return l4 == null ? "-" : l4;
            case 19:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics12 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics12.getClass();
                return Integer.valueOf(yid.m(basketballPlayerSeasonStatistics12.getPir()));
            case 20:
                return new q9k(R.string.basketball_plus_minus_short);
            case 21:
                return new q9k(R.string.basketball_plus_minus);
            case 22:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics13 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics13.getClass();
                Integer plusMinus = basketballPlayerSeasonStatistics13.getPlusMinus();
                String l5 = plusMinus != null ? rei.l(yid.m(basketballPlayerSeasonStatistics13.getAppearances()), Integer.valueOf(plusMinus.intValue())) : null;
                Regex regex8 = yid.a;
                return l5 == null ? "-" : l5;
            case 23:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics14 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics14.getClass();
                Integer plusMinus2 = basketballPlayerSeasonStatistics14.getPlusMinus();
                String l6 = plusMinus2 != null ? rei.l(yid.m(basketballPlayerSeasonStatistics14.getAppearances()), Integer.valueOf(plusMinus2.intValue())) : null;
                Regex regex9 = yid.a;
                return l6 == null ? "-" : l6;
            case 24:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics15 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics15.getClass();
                return Integer.valueOf(yid.m(basketballPlayerSeasonStatistics15.getPlusMinus()));
            case 25:
                return new q9k(R.string.basketball_lineups_points);
            case 26:
                return new q9k(R.string.points);
            case 27:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics16 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics16.getClass();
                String y03 = o02.y0(basketballPlayerSeasonStatistics16.getPoints());
                Regex regex10 = yid.a;
                return y03;
            case 28:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics17 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics17.getClass();
                Integer points = basketballPlayerSeasonStatistics17.getPoints();
                String l7 = points != null ? rei.l(yid.m(basketballPlayerSeasonStatistics17.getAppearances()), Integer.valueOf(points.intValue())) : null;
                Regex regex11 = yid.a;
                return l7 == null ? "-" : l7;
            default:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics18 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics18.getClass();
                return Integer.valueOf(yid.m(basketballPlayerSeasonStatistics18.getPoints()));
        }
    }
}
