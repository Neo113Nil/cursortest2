package defpackage;

import com.sofascore.model.newNetwork.statistics.season.player.AmericanFootballPlayerSeasonStatistics;
import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class nr implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ nr(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String k;
        switch (this.a) {
            case 0:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics.getClass();
                String o = yid.o(americanFootballPlayerSeasonStatistics.getPassingCompletions(), americanFootballPlayerSeasonStatistics.getPassingAttempts());
                return o == null ? "-" : o;
            case 1:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics2 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics2.getClass();
                return Double.valueOf(yid.k(yid.b(americanFootballPlayerSeasonStatistics2.getPassingCompletions(), americanFootballPlayerSeasonStatistics2.getPassingAttempts())));
            case 2:
                return new q9k(R.string.am_football_passing_first_downs_short);
            case 3:
                return new q9k(R.string.american_football_passing_first_downs);
            case 4:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics3 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics3.getClass();
                String y0 = o02.y0(americanFootballPlayerSeasonStatistics3.getPassingFirstDowns());
                Regex regex = yid.a;
                return y0;
            case 5:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics4 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics4.getClass();
                Integer passingFirstDowns = americanFootballPlayerSeasonStatistics4.getPassingFirstDowns();
                k = passingFirstDowns != null ? wt3.k(americanFootballPlayerSeasonStatistics4, Integer.valueOf(passingFirstDowns.intValue())) : null;
                Regex regex2 = yid.a;
                return k == null ? "-" : k;
            case 6:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics5 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics5.getClass();
                return Integer.valueOf(yid.m(americanFootballPlayerSeasonStatistics5.getPassingFirstDowns()));
            case 7:
                return new q9k(R.string.am_football_interceptions_thrown_short);
            case 8:
                return new q9k(R.string.am_football_interceptions_thrown_long);
            case 9:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics6 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics6.getClass();
                String y02 = o02.y0(americanFootballPlayerSeasonStatistics6.getPassingInterceptions());
                Regex regex3 = yid.a;
                return y02;
            case 10:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics7 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics7.getClass();
                Integer passingInterceptions = americanFootballPlayerSeasonStatistics7.getPassingInterceptions();
                k = passingInterceptions != null ? wt3.k(americanFootballPlayerSeasonStatistics7, Integer.valueOf(passingInterceptions.intValue())) : null;
                Regex regex4 = yid.a;
                return k == null ? "-" : k;
            case 11:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics8 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics8.getClass();
                return Integer.valueOf(yid.m(americanFootballPlayerSeasonStatistics8.getPassingInterceptions()));
            case 12:
                return new q9k(R.string.am_football_longest_pass_short);
            case 13:
                return new q9k(R.string.am_football_longest_pass_long);
            case 14:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics9 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics9.getClass();
                String y03 = o02.y0(americanFootballPlayerSeasonStatistics9.getPassingLongest());
                Regex regex5 = yid.a;
                return y03;
            case 15:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics10 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics10.getClass();
                String y04 = o02.y0(americanFootballPlayerSeasonStatistics10.getPassingLongest());
                Regex regex6 = yid.a;
                return y04;
            case 16:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics11 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics11.getClass();
                return Integer.valueOf(yid.m(americanFootballPlayerSeasonStatistics11.getPassingLongest()));
            case 17:
                return new q9k(R.string.am_football_passer_rating_short);
            case 18:
                return new q9k(R.string.legend_am_foot_pass_rating);
            case 19:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics12 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics12.getClass();
                Double passerRating = americanFootballPlayerSeasonStatistics12.getPasserRating();
                k = passerRating != null ? o02.P(passerRating.doubleValue(), false) : null;
                Regex regex7 = yid.a;
                return k == null ? "-" : k;
            case 20:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics13 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics13.getClass();
                Double passerRating2 = americanFootballPlayerSeasonStatistics13.getPasserRating();
                k = passerRating2 != null ? o02.P(passerRating2.doubleValue(), false) : null;
                Regex regex8 = yid.a;
                return k == null ? "-" : k;
            case 21:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics14 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics14.getClass();
                return Double.valueOf(yid.k(americanFootballPlayerSeasonStatistics14.getPasserRating()));
            case 22:
                return new q9k(R.string.am_football_quarterback_sacked_short);
            case 23:
                return new q9k(R.string.am_football_quarterback_sacked_long);
            case 24:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics15 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics15.getClass();
                String y05 = o02.y0(americanFootballPlayerSeasonStatistics15.getPassingSacked());
                Regex regex9 = yid.a;
                return y05;
            case 25:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics16 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics16.getClass();
                Integer passingSacked = americanFootballPlayerSeasonStatistics16.getPassingSacked();
                k = passingSacked != null ? wt3.k(americanFootballPlayerSeasonStatistics16, Integer.valueOf(passingSacked.intValue())) : null;
                Regex regex10 = yid.a;
                return k == null ? "-" : k;
            case 26:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics17 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics17.getClass();
                return Integer.valueOf(yid.m(americanFootballPlayerSeasonStatistics17.getPassingSacked()));
            case 27:
                return new q9k(R.string.am_football_passing_touchdowns_short);
            case 28:
                return new q9k(R.string.am_football_passing_touchdowns_long);
            default:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics18 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics18.getClass();
                String y06 = o02.y0(americanFootballPlayerSeasonStatistics18.getPassingTouchdowns());
                Regex regex11 = yid.a;
                return y06;
        }
    }
}
