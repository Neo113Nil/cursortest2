package defpackage;

import com.sofascore.model.Sports;
import com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.AmericanFootballPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.BaseballPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.BasketballPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.FootballPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.FutsalPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.HandballPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.IceHockeyPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.MiniFootballPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.PlayerCareerStatisticSeasonRaw;
import com.sofascore.model.newNetwork.statistics.season.player.PlayerCareerStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.PlayerCareerStatisticsResponse;
import com.sofascore.model.newNetwork.statistics.season.player.PlayerSeasonStatisticsInfo;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class jse {
    public static PlayerCareerStatistics a(PlayerCareerStatisticsResponse playerCareerStatisticsResponse, String str) {
        KSerializer serializer;
        switch (str.hashCode()) {
            case -2002238939:
                if (!str.equals(Sports.ICE_HOCKEY)) {
                    return null;
                }
                serializer = IceHockeyPlayerSeasonStatistics.INSTANCE.serializer();
                break;
            case -1721090992:
                if (!str.equals(Sports.BASEBALL)) {
                    return null;
                }
                serializer = BaseballPlayerSeasonStatistics.INSTANCE.serializer();
                break;
            case -1263172551:
                if (!str.equals(Sports.FUTSAL)) {
                    return null;
                }
                serializer = FutsalPlayerSeasonStatistics.INSTANCE.serializer();
                break;
            case -83759494:
                if (!str.equals(Sports.AMERICAN_FOOTBALL)) {
                    return null;
                }
                serializer = AmericanFootballPlayerSeasonStatistics.INSTANCE.serializer();
                break;
            case 1767150:
                if (!str.equals(Sports.HANDBALL)) {
                    return null;
                }
                serializer = HandballPlayerSeasonStatistics.INSTANCE.serializer();
                break;
            case 394668909:
                if (!str.equals(Sports.FOOTBALL)) {
                    return null;
                }
                serializer = FootballPlayerSeasonStatistics.INSTANCE.serializer();
                break;
            case 727149765:
                if (!str.equals(Sports.BASKETBALL)) {
                    return null;
                }
                serializer = BasketballPlayerSeasonStatistics.INSTANCE.serializer();
                break;
            case 932645060:
                if (!str.equals(Sports.MINI_FOOTBALL)) {
                    return null;
                }
                serializer = MiniFootballPlayerSeasonStatistics.INSTANCE.serializer();
                break;
            default:
                return null;
        }
        List<PlayerCareerStatisticSeasonRaw> seasons = playerCareerStatisticsResponse.getSeasons();
        ArrayList arrayList = new ArrayList(k13.r(seasons, 10));
        for (PlayerCareerStatisticSeasonRaw playerCareerStatisticSeasonRaw : seasons) {
            arrayList.add(new PlayerSeasonStatisticsInfo((AbstractPlayerSeasonStatistics) vga.a.a(serializer, playerCareerStatisticSeasonRaw.getStatistics()), playerCareerStatisticSeasonRaw.getTeam(), playerCareerStatisticSeasonRaw.getPreviousTeams(), playerCareerStatisticSeasonRaw.getSeason(), playerCareerStatisticSeasonRaw.getStartYear(), playerCareerStatisticSeasonRaw.getEndYear(), playerCareerStatisticSeasonRaw.getYear(), playerCareerStatisticSeasonRaw.getUniqueTournament()));
        }
        return new PlayerCareerStatistics(arrayList);
    }
}
