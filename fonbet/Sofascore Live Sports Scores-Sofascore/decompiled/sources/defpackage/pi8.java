package defpackage;

import com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.FootballPlayerSeasonStatistics;
import com.sofascore.results.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class pi8 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ pi8(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        wyg wygVar;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics;
        wyg wygVar2;
        FootballPlayerSeasonStatistics B;
        wyg wygVar3;
        FootballPlayerSeasonStatistics B2;
        wyg wygVar4;
        FootballPlayerSeasonStatistics B3;
        wyg wygVar5;
        FootballPlayerSeasonStatistics B4;
        wyg wygVar6;
        FootballPlayerSeasonStatistics B5;
        Integer goals;
        wyg wygVar7;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics2;
        r2 = null;
        r2 = null;
        Integer num = null;
        r2 = null;
        r2 = null;
        Integer num2 = null;
        switch (this.a) {
            case 0:
                return new q9k(R.string.average_sofascore_rating);
            case 1:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics.getClass();
                Double totalRating = footballPlayerSeasonStatistics.getTotalRating();
                return dti.n(yid.k(totalRating != null ? yid.b(totalRating, Integer.valueOf(yid.m(footballPlayerSeasonStatistics.getCountRating()))) : null), 2);
            case 2:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics2 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics2.getClass();
                Double totalRating2 = footballPlayerSeasonStatistics2.getTotalRating();
                return dti.n(yid.k(totalRating2 != null ? yid.b(totalRating2, Integer.valueOf(yid.m(footballPlayerSeasonStatistics2.getCountRating()))) : null), 2);
            case 3:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics3 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics3.getClass();
                Double totalRating3 = footballPlayerSeasonStatistics3.getTotalRating();
                return Double.valueOf(yid.k(totalRating3 != null ? yid.b(totalRating3, Integer.valueOf(yid.m(footballPlayerSeasonStatistics3.getCountRating()))) : null));
            case 4:
                return new q9k(R.string.football_successful_dribbles_short);
            case 5:
                return new q9k(R.string.football_successful_dribbles);
            case 6:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics4 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics4.getClass();
                String y0 = o02.y0(footballPlayerSeasonStatistics4.getSuccessfulDribbles());
                Regex regex = yid.a;
                return y0;
            case 7:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics5 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics5.getClass();
                Integer successfulDribbles = footballPlayerSeasonStatistics5.getSuccessfulDribbles();
                String j = successfulDribbles != null ? fc6.j(footballPlayerSeasonStatistics5, Integer.valueOf(successfulDribbles.intValue())) : null;
                Regex regex2 = yid.a;
                return j == null ? "-" : j;
            case 8:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics6 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics6.getClass();
                return Integer.valueOf(yid.m(footballPlayerSeasonStatistics6.getSuccessfulDribbles()));
            case 9:
                return new q9k(R.string.am_football_combined_tackles_short);
            case 10:
                return new q9k(R.string.football_tackles);
            case 11:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics7 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics7.getClass();
                String y02 = o02.y0(footballPlayerSeasonStatistics7.getTackles());
                Regex regex3 = yid.a;
                return y02;
            case 12:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics8 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics8.getClass();
                Integer tackles = footballPlayerSeasonStatistics8.getTackles();
                String j2 = tackles != null ? fc6.j(footballPlayerSeasonStatistics8, Integer.valueOf(tackles.intValue())) : null;
                Regex regex4 = yid.a;
                return j2 == null ? "-" : j2;
            case 13:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics9 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics9.getClass();
                return Integer.valueOf(yid.m(footballPlayerSeasonStatistics9.getTackles()));
            case 14:
                return new q9k(R.string.football_total_shots_short);
            case 15:
                return new q9k(R.string.football_total_shots);
            case 16:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics10 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics10.getClass();
                String y03 = o02.y0(footballPlayerSeasonStatistics10.getTotalShots());
                Regex regex5 = yid.a;
                return y03;
            case 17:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics11 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics11.getClass();
                Integer totalShots = footballPlayerSeasonStatistics11.getTotalShots();
                String j3 = totalShots != null ? fc6.j(footballPlayerSeasonStatistics11, Integer.valueOf(totalShots.intValue())) : null;
                Regex regex6 = yid.a;
                return j3 == null ? "-" : j3;
            case 18:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics12 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics12.getClass();
                return Integer.valueOf(yid.m(footballPlayerSeasonStatistics12.getTotalShots()));
            case 19:
                return new q9k(R.string.football_yellow_cards_short);
            case 20:
                return new q9k(R.string.football_yellow_cards);
            case 21:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics13 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics13.getClass();
                String y04 = o02.y0(footballPlayerSeasonStatistics13.getYellowCards());
                Regex regex7 = yid.a;
                return y04;
            case 22:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics14 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics14.getClass();
                Integer yellowCards = footballPlayerSeasonStatistics14.getYellowCards();
                String j4 = yellowCards != null ? fc6.j(footballPlayerSeasonStatistics14, Integer.valueOf(yellowCards.intValue())) : null;
                Regex regex8 = yid.a;
                return j4 == null ? "-" : j4;
            case 23:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics15 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics15.getClass();
                return Integer.valueOf(yid.m(footballPlayerSeasonStatistics15.getYellowCards()));
            case 24:
                c73 c73Var = (c73) obj;
                c73Var.getClass();
                d73 d73Var = c73Var.c;
                Integer accuratePasses = (d73Var == null || (wygVar2 = d73Var.c) == null || (B = o1j.B(wygVar2)) == null) ? null : B.getAccuratePasses();
                if (d73Var != null && (wygVar = d73Var.c) != null && (abstractPlayerSeasonStatistics = wygVar.a) != null) {
                    num2 = abstractPlayerSeasonStatistics.getAppearances();
                }
                return td4.n0(accuratePasses, num2);
            case 25:
                c73 c73Var2 = (c73) obj;
                c73Var2.getClass();
                d73 d73Var2 = c73Var2.c;
                if (d73Var2 == null || (wygVar3 = d73Var2.c) == null || (B2 = o1j.B(wygVar3)) == null) {
                    return null;
                }
                return B2.getAppearances();
            case 26:
                o73 o73Var = (o73) obj;
                o73Var.getClass();
                o73Var.b(new q9k(R.string.goalkeeping));
                o73Var.a(new q9k(R.string.football_goals_conceded), new sc6(21), new mk8(8), null);
                o73Var.a(new q9k(R.string.football_saves), new lk8(13), new mk8(20), null);
                int i = 24;
                o73Var.a(new q9k(R.string.football_goals_prevented), new lk8(i), new mk8(28), null);
                o73Var.a(new q9k(R.string.football_clean_sheets), new lk8(27), new mk8(29), null);
                o73Var.a(new q9k(R.string.football_accurate_passes), new sc6(22), new pi8(i), null);
                o73Var.a(new q9k(R.string.accurate_long_passes), new sc6(27), new mk8(3), null);
                return Unit.a;
            case 27:
                c73 c73Var3 = (c73) obj;
                c73Var3.getClass();
                d73 d73Var3 = c73Var3.c;
                if (d73Var3 == null || (wygVar4 = d73Var3.c) == null || (B3 = o1j.B(wygVar4)) == null) {
                    return null;
                }
                return B3.getGoals();
            case 28:
                c73 c73Var4 = (c73) obj;
                c73Var4.getClass();
                d73 d73Var4 = c73Var4.c;
                if (d73Var4 == null || (wygVar5 = d73Var4.c) == null || (B4 = o1j.B(wygVar5)) == null) {
                    return null;
                }
                return B4.getExpectedGoals();
            default:
                c73 c73Var5 = (c73) obj;
                c73Var5.getClass();
                d73 d73Var5 = c73Var5.c;
                if (d73Var5 == null || (wygVar6 = d73Var5.c) == null || (B5 = o1j.B(wygVar6)) == null || (goals = B5.getGoals()) == null) {
                    return null;
                }
                if (d73Var5 != null && (wygVar7 = d73Var5.c) != null && (abstractPlayerSeasonStatistics2 = wygVar7.a) != null) {
                    num = abstractPlayerSeasonStatistics2.getAppearances();
                }
                return td4.n0(goals, num);
        }
    }
}
