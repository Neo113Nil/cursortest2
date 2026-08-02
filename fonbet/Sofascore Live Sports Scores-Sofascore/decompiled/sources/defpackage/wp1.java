package defpackage;

import com.sofascore.model.network.response.BasketballPlayerEventStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.BasketballPlayerSeasonStatistics;
import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class wp1 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ wp1(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String l;
        switch (this.a) {
            case 0:
                ((BasketballPlayerEventStatistics) obj).getClass();
                return Boolean.TRUE;
            case 1:
                BasketballPlayerEventStatistics basketballPlayerEventStatistics = (BasketballPlayerEventStatistics) obj;
                basketballPlayerEventStatistics.getClass();
                return String.valueOf(yid.m(basketballPlayerEventStatistics.getBlocks()));
            case 2:
                ((BasketballPlayerEventStatistics) obj).getClass();
                return Double.valueOf(yid.m(r3.getBlocks()));
            case 3:
                ((BasketballPlayerEventStatistics) obj).getClass();
                return Boolean.TRUE;
            case 4:
                BasketballPlayerEventStatistics basketballPlayerEventStatistics2 = (BasketballPlayerEventStatistics) obj;
                basketballPlayerEventStatistics2.getClass();
                return String.valueOf(yid.m(basketballPlayerEventStatistics2.getPersonalFouls()));
            case 5:
                return new q9k(R.string.basketball_lineups_assists);
            case 6:
                return new q9k(R.string.basketball_assists);
            case 7:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics.getClass();
                String y0 = o02.y0(basketballPlayerSeasonStatistics.getAssists());
                Regex regex = yid.a;
                return y0;
            case 8:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics2 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics2.getClass();
                Integer assists = basketballPlayerSeasonStatistics2.getAssists();
                l = assists != null ? rei.l(yid.m(basketballPlayerSeasonStatistics2.getAppearances()), Integer.valueOf(assists.intValue())) : null;
                Regex regex2 = yid.a;
                return l == null ? "-" : l;
            case 9:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics3 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics3.getClass();
                return Integer.valueOf(yid.m(basketballPlayerSeasonStatistics3.getAssists()));
            case 10:
                return new q9k(R.string.basketball_lineups_blocks);
            case 11:
                return new q9k(R.string.blocks);
            case 12:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics4 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics4.getClass();
                String y02 = o02.y0(basketballPlayerSeasonStatistics4.getBlocks());
                Regex regex3 = yid.a;
                return y02;
            case 13:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics5 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics5.getClass();
                Integer blocks = basketballPlayerSeasonStatistics5.getBlocks();
                l = blocks != null ? rei.l(yid.m(basketballPlayerSeasonStatistics5.getAppearances()), Integer.valueOf(blocks.intValue())) : null;
                Regex regex4 = yid.a;
                return l == null ? "-" : l;
            case 14:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics6 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics6.getClass();
                return Integer.valueOf(yid.m(basketballPlayerSeasonStatistics6.getBlocks()));
            case 15:
                return new q9k(R.string.basketball_lineups_def_rebounds);
            case 16:
                return new q9k(R.string.defensive_rebounds);
            case 17:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics7 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics7.getClass();
                String y03 = o02.y0(basketballPlayerSeasonStatistics7.getDefensiveRebounds());
                Regex regex5 = yid.a;
                return y03;
            case 18:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics8 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics8.getClass();
                Integer defensiveRebounds = basketballPlayerSeasonStatistics8.getDefensiveRebounds();
                l = defensiveRebounds != null ? rei.l(yid.m(basketballPlayerSeasonStatistics8.getAppearances()), Integer.valueOf(defensiveRebounds.intValue())) : null;
                Regex regex6 = yid.a;
                return l == null ? "-" : l;
            case 19:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics9 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics9.getClass();
                return Integer.valueOf(yid.m(basketballPlayerSeasonStatistics9.getDefensiveRebounds()));
            case 20:
                return new q9k(R.string.basketball_double_double_short);
            case 21:
                return new q9k(R.string.basketball_double_double);
            case 22:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics10 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics10.getClass();
                String y04 = o02.y0(basketballPlayerSeasonStatistics10.getDoubleDoubles());
                Regex regex7 = yid.a;
                return y04;
            case 23:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics11 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics11.getClass();
                String y05 = o02.y0(basketballPlayerSeasonStatistics11.getDoubleDoubles());
                Regex regex8 = yid.a;
                return y05;
            case 24:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics12 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics12.getClass();
                return Integer.valueOf(yid.m(basketballPlayerSeasonStatistics12.getDoubleDoubles()));
            case 25:
                return new q9k(R.string.basketball_field_goals_made_short);
            case 26:
                return new q9k(R.string.basketball_field_goals_made);
            case 27:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics13 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics13.getClass();
                String y06 = o02.y0(basketballPlayerSeasonStatistics13.getFieldGoalsMade());
                Regex regex9 = yid.a;
                return y06;
            case 28:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics14 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics14.getClass();
                Integer fieldGoalsMade = basketballPlayerSeasonStatistics14.getFieldGoalsMade();
                l = fieldGoalsMade != null ? rei.l(yid.m(basketballPlayerSeasonStatistics14.getAppearances()), Integer.valueOf(fieldGoalsMade.intValue())) : null;
                Regex regex10 = yid.a;
                return l == null ? "-" : l;
            default:
                BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics15 = (BasketballPlayerSeasonStatistics) obj;
                basketballPlayerSeasonStatistics15.getClass();
                return Integer.valueOf(yid.m(basketballPlayerSeasonStatistics15.getFieldGoalsMade()));
        }
    }
}
