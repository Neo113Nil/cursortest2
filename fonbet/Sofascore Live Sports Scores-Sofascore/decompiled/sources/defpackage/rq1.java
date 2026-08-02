package defpackage;

import com.sofascore.model.newNetwork.statistics.season.player.BasketballPlayerSeasonStatistics;
import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class rq1 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ rq1(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Double d = null;
        Double d2 = null;
        Double d3 = null;
        switch (this.a) {
            case 0:
                return new q9k(R.string.basketball_lineups_rebounds);
            case 1:
                return new q9k(R.string.rebounds);
            case 2:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics.getClass();
                String y0 = o02.y0(basketballPlayerSeasonStatistics.getRebounds());
                Regex regex = yid.a;
                return y0;
            case 3:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics2 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics2.getClass();
                Integer rebounds = basketballPlayerSeasonStatistics2.getRebounds();
                String l = rebounds != null ? rei.l(yid.m(basketballPlayerSeasonStatistics2.getAppearances()), Integer.valueOf(rebounds.intValue())) : null;
                Regex regex2 = yid.a;
                return l == null ? "-" : l;
            case 4:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics3 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics3.getClass();
                return Integer.valueOf(yid.m(basketballPlayerSeasonStatistics3.getRebounds()));
            case 5:
                return new q9k(R.string.average_sofascore_rating_short);
            case 6:
                return new q9k(R.string.average_sofascore_rating);
            case 7:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics4 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics4.getClass();
                Double totalRating = basketballPlayerSeasonStatistics4.getTotalRating();
                if (totalRating != null) {
                    Integer countRating = basketballPlayerSeasonStatistics4.getCountRating();
                    d3 = yid.b(totalRating, Integer.valueOf(countRating != null ? countRating.intValue() : 0));
                }
                return dti.n(yid.k(d3), 2);
            case 8:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics5 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics5.getClass();
                Double totalRating2 = basketballPlayerSeasonStatistics5.getTotalRating();
                if (totalRating2 != null) {
                    Integer countRating2 = basketballPlayerSeasonStatistics5.getCountRating();
                    d2 = yid.b(totalRating2, Integer.valueOf(countRating2 != null ? countRating2.intValue() : 0));
                }
                return dti.n(yid.k(d2), 2);
            case 9:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics6 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics6.getClass();
                Double totalRating3 = basketballPlayerSeasonStatistics6.getTotalRating();
                if (totalRating3 != null) {
                    Integer countRating3 = basketballPlayerSeasonStatistics6.getCountRating();
                    d = yid.b(totalRating3, Integer.valueOf(countRating3 != null ? countRating3.intValue() : 0));
                }
                return Double.valueOf(yid.k(d));
            case 10:
                return new q9k(R.string.basketball_lineups_steals);
            case 11:
                return new q9k(R.string.steals);
            case 12:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics7 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics7.getClass();
                String y02 = o02.y0(basketballPlayerSeasonStatistics7.getSteals());
                Regex regex3 = yid.a;
                return y02;
            case 13:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics8 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics8.getClass();
                Integer steals = basketballPlayerSeasonStatistics8.getSteals();
                String l2 = steals != null ? rei.l(yid.m(basketballPlayerSeasonStatistics8.getAppearances()), Integer.valueOf(steals.intValue())) : null;
                Regex regex4 = yid.a;
                return l2 == null ? "-" : l2;
            case 14:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics9 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics9.getClass();
                return Integer.valueOf(yid.m(basketballPlayerSeasonStatistics9.getSteals()));
            case 15:
                return new q9k(R.string.basketball_three_pointers_made_short);
            case 16:
                return new q9k(R.string.basketball_three_pointers_made);
            case 17:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics10 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics10.getClass();
                String y03 = o02.y0(basketballPlayerSeasonStatistics10.getThreePointsMade());
                Regex regex5 = yid.a;
                return y03;
            case 18:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics11 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics11.getClass();
                Integer threePointsMade = basketballPlayerSeasonStatistics11.getThreePointsMade();
                String l3 = threePointsMade != null ? rei.l(yid.m(basketballPlayerSeasonStatistics11.getAppearances()), Integer.valueOf(threePointsMade.intValue())) : null;
                Regex regex6 = yid.a;
                return l3 == null ? "-" : l3;
            case 19:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics12 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics12.getClass();
                return Integer.valueOf(yid.m(basketballPlayerSeasonStatistics12.getThreePointsMade()));
            case 20:
                return new q9k(R.string.basketball_three_points_attempted_short);
            case 21:
                return new q9k(R.string.basketball_three_pointers_attempted);
            case 22:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics13 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics13.getClass();
                String y04 = o02.y0(basketballPlayerSeasonStatistics13.getThreePointAttempts());
                Regex regex7 = yid.a;
                return y04;
            case 23:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics14 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics14.getClass();
                Integer threePointAttempts = basketballPlayerSeasonStatistics14.getThreePointAttempts();
                String l4 = threePointAttempts != null ? rei.l(yid.m(basketballPlayerSeasonStatistics14.getAppearances()), Integer.valueOf(threePointAttempts.intValue())) : null;
                Regex regex8 = yid.a;
                return l4 == null ? "-" : l4;
            case 24:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics15 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics15.getClass();
                return Integer.valueOf(yid.m(basketballPlayerSeasonStatistics15.getThreePointAttempts()));
            case 25:
                return new q9k(R.string.basketball_lineups_three_point_pct);
            case 26:
                return new q9k(R.string.basketball_three_point_percentage);
            case 27:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics16 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics16.getClass();
                String o = yid.o(basketballPlayerSeasonStatistics16.getThreePointsMade(), basketballPlayerSeasonStatistics16.getThreePointAttempts());
                return o == null ? "-" : o;
            case 28:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics17 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics17.getClass();
                String o2 = yid.o(basketballPlayerSeasonStatistics17.getThreePointsMade(), basketballPlayerSeasonStatistics17.getThreePointAttempts());
                return o2 == null ? "-" : o2;
            default:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics18 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics18.getClass();
                return Double.valueOf(yid.k(yid.b(basketballPlayerSeasonStatistics18.getThreePointsMade(), basketballPlayerSeasonStatistics18.getThreePointAttempts())));
        }
    }
}
