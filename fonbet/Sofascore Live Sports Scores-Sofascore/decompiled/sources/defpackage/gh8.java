package defpackage;

import com.sofascore.model.newNetwork.statistics.season.player.FootballPlayerSeasonStatistics;
import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class gh8 implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String j;
        switch (this.a) {
            case 0:
                return new q9k(R.string.football_accurate_passes);
            case 1:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics.getClass();
                String y0 = o02.y0(footballPlayerSeasonStatistics.getAccuratePasses());
                Regex regex = yid.a;
                return y0;
            case 2:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics2 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics2.getClass();
                Integer accuratePasses = footballPlayerSeasonStatistics2.getAccuratePasses();
                j = accuratePasses != null ? fc6.j(footballPlayerSeasonStatistics2, Integer.valueOf(accuratePasses.intValue())) : null;
                Regex regex2 = yid.a;
                return j == null ? "-" : j;
            case 3:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics3 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics3.getClass();
                return Integer.valueOf(yid.m(footballPlayerSeasonStatistics3.getAccuratePasses()));
            case 4:
                return new q9k(R.string.football_aerial_duels_won_short);
            case 5:
                return new q9k(R.string.aerial_duels_won);
            case 6:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics4 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics4.getClass();
                String y02 = o02.y0(footballPlayerSeasonStatistics4.getAerialDuelsWon());
                Regex regex3 = yid.a;
                return y02;
            case 7:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics5 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics5.getClass();
                Integer aerialDuelsWon = footballPlayerSeasonStatistics5.getAerialDuelsWon();
                j = aerialDuelsWon != null ? fc6.j(footballPlayerSeasonStatistics5, Integer.valueOf(aerialDuelsWon.intValue())) : null;
                Regex regex4 = yid.a;
                return j == null ? "-" : j;
            case 8:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics6 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics6.getClass();
                return Integer.valueOf(yid.m(footballPlayerSeasonStatistics6.getAerialDuelsWon()));
            case 9:
                return new q9k(R.string.basketball_lineups_assists);
            case 10:
                return new q9k(R.string.football_assists);
            case 11:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics7 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics7.getClass();
                String y03 = o02.y0(footballPlayerSeasonStatistics7.getAssists());
                Regex regex5 = yid.a;
                return y03;
            case 12:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics8 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics8.getClass();
                Integer assists = footballPlayerSeasonStatistics8.getAssists();
                j = assists != null ? fc6.j(footballPlayerSeasonStatistics8, Integer.valueOf(assists.intValue())) : null;
                Regex regex6 = yid.a;
                return j == null ? "-" : j;
            case 13:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics9 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics9.getClass();
                return Integer.valueOf(yid.m(footballPlayerSeasonStatistics9.getAssists()));
            case 14:
                return new q9k(R.string.football_big_chances_created_short);
            case 15:
                return new q9k(R.string.football_big_chances_created);
            case 16:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics10 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics10.getClass();
                String y04 = o02.y0(footballPlayerSeasonStatistics10.getBigChancesCreated());
                Regex regex7 = yid.a;
                return y04;
            case 17:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics11 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics11.getClass();
                Integer bigChancesCreated = footballPlayerSeasonStatistics11.getBigChancesCreated();
                j = bigChancesCreated != null ? fc6.j(footballPlayerSeasonStatistics11, Integer.valueOf(bigChancesCreated.intValue())) : null;
                Regex regex8 = yid.a;
                return j == null ? "-" : j;
            case 18:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics12 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics12.getClass();
                return Integer.valueOf(yid.m(footballPlayerSeasonStatistics12.getBigChancesCreated()));
            case 19:
                return new q9k(R.string.football_big_chances_missed_short);
            case 20:
                return new q9k(R.string.football_big_chances_missed);
            case 21:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics13 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics13.getClass();
                String y05 = o02.y0(footballPlayerSeasonStatistics13.getBigChancesMissed());
                Regex regex9 = yid.a;
                return y05;
            case 22:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics14 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics14.getClass();
                Integer bigChancesMissed = footballPlayerSeasonStatistics14.getBigChancesMissed();
                j = bigChancesMissed != null ? fc6.j(footballPlayerSeasonStatistics14, Integer.valueOf(bigChancesMissed.intValue())) : null;
                Regex regex10 = yid.a;
                return j == null ? "-" : j;
            case 23:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics15 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics15.getClass();
                return Integer.valueOf(yid.m(footballPlayerSeasonStatistics15.getBigChancesMissed()));
            case 24:
                return new q9k(R.string.football_blocked_shots_short);
            case 25:
                return new q9k(R.string.blocked_shots);
            case 26:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics16 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics16.getClass();
                String y06 = o02.y0(footballPlayerSeasonStatistics16.getOutfielderBlocks());
                Regex regex11 = yid.a;
                return y06;
            case 27:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics17 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics17.getClass();
                Integer outfielderBlocks = footballPlayerSeasonStatistics17.getOutfielderBlocks();
                j = outfielderBlocks != null ? fc6.j(footballPlayerSeasonStatistics17, Integer.valueOf(outfielderBlocks.intValue())) : null;
                Regex regex12 = yid.a;
                return j == null ? "-" : j;
            case 28:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics18 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics18.getClass();
                return Integer.valueOf(yid.m(footballPlayerSeasonStatistics18.getOutfielderBlocks()));
            default:
                return new q9k(R.string.football_clean_sheets_short);
        }
    }
}
