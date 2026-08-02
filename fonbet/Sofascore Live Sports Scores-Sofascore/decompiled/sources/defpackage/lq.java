package defpackage;

import com.sofascore.model.newNetwork.statistics.season.player.AmericanFootballPlayerSeasonStatistics;
import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class lq implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ lq(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String l;
        switch (this.a) {
            case 0:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics.getClass();
                Double defensiveSacks = americanFootballPlayerSeasonStatistics.getDefensiveSacks();
                l = defensiveSacks != null ? rei.l(yid.m(americanFootballPlayerSeasonStatistics.getAppearances()), Double.valueOf(defensiveSacks.doubleValue())) : null;
                Regex regex = yid.a;
                return l == null ? "-" : l;
            case 1:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics2 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics2.getClass();
                return Double.valueOf(yid.k(americanFootballPlayerSeasonStatistics2.getDefensiveSacks()));
            case 2:
                return new q9k(R.string.am_football_solo_tackles_short);
            case 3:
                return new q9k(R.string.am_football_solo_tackles_long);
            case 4:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics3 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics3.getClass();
                String y0 = o02.y0(americanFootballPlayerSeasonStatistics3.getDefensiveTotalTackles());
                Regex regex2 = yid.a;
                return y0;
            case 5:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics4 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics4.getClass();
                Integer defensiveTotalTackles = americanFootballPlayerSeasonStatistics4.getDefensiveTotalTackles();
                l = defensiveTotalTackles != null ? wt3.k(americanFootballPlayerSeasonStatistics4, Integer.valueOf(defensiveTotalTackles.intValue())) : null;
                Regex regex3 = yid.a;
                return l == null ? "-" : l;
            case 6:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics5 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics5.getClass();
                return Integer.valueOf(yid.m(americanFootballPlayerSeasonStatistics5.getDefensiveTotalTackles()));
            case 7:
                return new q9k(R.string.am_football_total_tackles_short);
            case 8:
                return new q9k(R.string.am_football_total_tackles_long);
            case 9:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics6 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics6.getClass();
                String y02 = o02.y0(americanFootballPlayerSeasonStatistics6.getDefensiveCombineTackles());
                Regex regex4 = yid.a;
                return y02;
            case 10:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics7 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics7.getClass();
                Integer defensiveCombineTackles = americanFootballPlayerSeasonStatistics7.getDefensiveCombineTackles();
                l = defensiveCombineTackles != null ? wt3.k(americanFootballPlayerSeasonStatistics7, Integer.valueOf(defensiveCombineTackles.intValue())) : null;
                Regex regex5 = yid.a;
                return l == null ? "-" : l;
            case 11:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics8 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics8.getClass();
                return Integer.valueOf(yid.m(americanFootballPlayerSeasonStatistics8.getDefensiveCombineTackles()));
            case 12:
                return new q9k(R.string.am_foot_games_played_short);
            case 13:
                return new q9k(R.string.am_foot_games_played);
            case 14:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics9 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics9.getClass();
                String y03 = o02.y0(americanFootballPlayerSeasonStatistics9.getAppearances());
                Regex regex6 = yid.a;
                return y03;
            case 15:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics10 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics10.getClass();
                String y04 = o02.y0(americanFootballPlayerSeasonStatistics10.getAppearances());
                Regex regex7 = yid.a;
                return y04;
            case 16:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics11 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics11.getClass();
                return Integer.valueOf(yid.m(americanFootballPlayerSeasonStatistics11.getAppearances()));
            case 17:
                return new q9k(R.string.am_football_1_19_yard_field_goals_short);
            case 18:
                return new q9k(R.string.am_football_1_19_yard_field_goals_long);
            case 19:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics12 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics12.getClass();
                String y05 = o02.y0(americanFootballPlayerSeasonStatistics12.getKickingFgMade1to19());
                Regex regex8 = yid.a;
                return y05;
            case 20:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics13 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics13.getClass();
                Integer kickingFgMade1to19 = americanFootballPlayerSeasonStatistics13.getKickingFgMade1to19();
                l = kickingFgMade1to19 != null ? wt3.k(americanFootballPlayerSeasonStatistics13, Integer.valueOf(kickingFgMade1to19.intValue())) : null;
                Regex regex9 = yid.a;
                return l == null ? "-" : l;
            case 21:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics14 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics14.getClass();
                return Integer.valueOf(yid.m(americanFootballPlayerSeasonStatistics14.getKickingFgMade1to19()));
            case 22:
                return new q9k(R.string.am_football_20_29_yard_field_goals_short);
            case 23:
                return new q9k(R.string.am_football_20_29_yard_field_goals_long);
            case 24:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics15 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics15.getClass();
                String y06 = o02.y0(americanFootballPlayerSeasonStatistics15.getKickingFgMade20to29());
                Regex regex10 = yid.a;
                return y06;
            case 25:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics16 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics16.getClass();
                Integer kickingFgMade20to29 = americanFootballPlayerSeasonStatistics16.getKickingFgMade20to29();
                l = kickingFgMade20to29 != null ? wt3.k(americanFootballPlayerSeasonStatistics16, Integer.valueOf(kickingFgMade20to29.intValue())) : null;
                Regex regex11 = yid.a;
                return l == null ? "-" : l;
            case 26:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics17 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics17.getClass();
                return Integer.valueOf(yid.m(americanFootballPlayerSeasonStatistics17.getKickingFgMade20to29()));
            case 27:
                return new q9k(R.string.am_football_30_39_yard_field_goals_short);
            case 28:
                return new q9k(R.string.am_football_30_39_yard_field_goals_long);
            default:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics18 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics18.getClass();
                String y07 = o02.y0(americanFootballPlayerSeasonStatistics18.getKickingFgMade30to39());
                Regex regex12 = yid.a;
                return y07;
        }
    }
}
