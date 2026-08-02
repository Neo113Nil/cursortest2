package defpackage;

import com.sofascore.model.newNetwork.statistics.season.player.AmericanFootballPlayerSeasonStatistics;
import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class sq implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ sq(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String k;
        switch (this.a) {
            case 0:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics.getClass();
                Integer kickingFgMade30to39 = americanFootballPlayerSeasonStatistics.getKickingFgMade30to39();
                k = kickingFgMade30to39 != null ? wt3.k(americanFootballPlayerSeasonStatistics, Integer.valueOf(kickingFgMade30to39.intValue())) : null;
                Regex regex = yid.a;
                return k == null ? "-" : k;
            case 1:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics2 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics2.getClass();
                return Integer.valueOf(yid.m(americanFootballPlayerSeasonStatistics2.getKickingFgMade30to39()));
            case 2:
                return new q9k(R.string.am_football_40_49_yard_field_goals_short);
            case 3:
                return new q9k(R.string.am_football_40_49_yard_field_goals_long);
            case 4:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics3 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics3.getClass();
                String y0 = o02.y0(americanFootballPlayerSeasonStatistics3.getKickingFgMade40to49());
                Regex regex2 = yid.a;
                return y0;
            case 5:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics4 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics4.getClass();
                Integer kickingFgMade40to49 = americanFootballPlayerSeasonStatistics4.getKickingFgMade40to49();
                k = kickingFgMade40to49 != null ? wt3.k(americanFootballPlayerSeasonStatistics4, Integer.valueOf(kickingFgMade40to49.intValue())) : null;
                Regex regex3 = yid.a;
                return k == null ? "-" : k;
            case 6:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics5 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics5.getClass();
                return Integer.valueOf(yid.m(americanFootballPlayerSeasonStatistics5.getKickingFgMade40to49()));
            case 7:
                return new q9k(R.string.am_football_over_50_yard_field_goals_short);
            case 8:
                return new q9k(R.string.am_football_over_50_yard_field_goals_long);
            case 9:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics6 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics6.getClass();
                String y02 = o02.y0(americanFootballPlayerSeasonStatistics6.getKickingFgMade50plus());
                Regex regex4 = yid.a;
                return y02;
            case 10:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics7 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics7.getClass();
                Integer kickingFgMade50plus = americanFootballPlayerSeasonStatistics7.getKickingFgMade50plus();
                k = kickingFgMade50plus != null ? wt3.k(americanFootballPlayerSeasonStatistics7, Integer.valueOf(kickingFgMade50plus.intValue())) : null;
                Regex regex5 = yid.a;
                return k == null ? "-" : k;
            case 11:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics8 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics8.getClass();
                return Integer.valueOf(yid.m(americanFootballPlayerSeasonStatistics8.getKickingFgMade50plus()));
            case 12:
                return new q9k(R.string.am_football_extra_points_attempted_short);
            case 13:
                return new q9k(R.string.am_football_extra_points_attempted_long);
            case 14:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics9 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics9.getClass();
                String y03 = o02.y0(americanFootballPlayerSeasonStatistics9.getKickingExtraAttempts());
                Regex regex6 = yid.a;
                return y03;
            case 15:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics10 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics10.getClass();
                Integer kickingExtraAttempts = americanFootballPlayerSeasonStatistics10.getKickingExtraAttempts();
                k = kickingExtraAttempts != null ? wt3.k(americanFootballPlayerSeasonStatistics10, Integer.valueOf(kickingExtraAttempts.intValue())) : null;
                Regex regex7 = yid.a;
                return k == null ? "-" : k;
            case 16:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics11 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics11.getClass();
                return Integer.valueOf(yid.m(americanFootballPlayerSeasonStatistics11.getKickingExtraAttempts()));
            case 17:
                return new q9k(R.string.am_football_extra_points_made_short);
            case 18:
                return new q9k(R.string.am_football_extra_points_made_long);
            case 19:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics12 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics12.getClass();
                String y04 = o02.y0(americanFootballPlayerSeasonStatistics12.getKickingExtraMade());
                Regex regex8 = yid.a;
                return y04;
            case 20:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics13 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics13.getClass();
                Integer kickingExtraMade = americanFootballPlayerSeasonStatistics13.getKickingExtraMade();
                k = kickingExtraMade != null ? wt3.k(americanFootballPlayerSeasonStatistics13, Integer.valueOf(kickingExtraMade.intValue())) : null;
                Regex regex9 = yid.a;
                return k == null ? "-" : k;
            case 21:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics14 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics14.getClass();
                return Integer.valueOf(yid.m(americanFootballPlayerSeasonStatistics14.getKickingExtraMade()));
            case 22:
                return new q9k(R.string.am_football_field_goals_attempted_short);
            case 23:
                return new q9k(R.string.am_football_field_goals_attempted_long);
            case 24:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics15 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics15.getClass();
                String y05 = o02.y0(americanFootballPlayerSeasonStatistics15.getKickingFgAttempts());
                Regex regex10 = yid.a;
                return y05;
            case 25:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics16 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics16.getClass();
                Integer kickingFgAttempts = americanFootballPlayerSeasonStatistics16.getKickingFgAttempts();
                k = kickingFgAttempts != null ? wt3.k(americanFootballPlayerSeasonStatistics16, Integer.valueOf(kickingFgAttempts.intValue())) : null;
                Regex regex11 = yid.a;
                return k == null ? "-" : k;
            case 26:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics17 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics17.getClass();
                return Integer.valueOf(yid.m(americanFootballPlayerSeasonStatistics17.getKickingFgAttempts()));
            case 27:
                return new q9k(R.string.am_football_field_goals_made_short);
            case 28:
                return new q9k(R.string.am_football_field_goals_made_long);
            default:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics18 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics18.getClass();
                String y06 = o02.y0(americanFootballPlayerSeasonStatistics18.getKickingFgMade());
                Regex regex12 = yid.a;
                return y06;
        }
    }
}
