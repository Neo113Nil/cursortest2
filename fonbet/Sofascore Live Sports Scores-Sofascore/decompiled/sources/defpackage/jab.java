package defpackage;

import com.sofascore.model.newNetwork.topperformance.response.BaseballTopPlayersStatistics;
import com.sofascore.model.newNetwork.topperformance.response.BasketballTopPlayersStatistics;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.BaseballTopPlayersStatisticsItem;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.BasketballTopPlayersStatisticsItem;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class jab implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                BaseballTopPlayersStatistics baseballTopPlayersStatistics = (BaseballTopPlayersStatistics) obj;
                baseballTopPlayersStatistics.getClass();
                return baseballTopPlayersStatistics.getFieldingChances();
            case 1:
                BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem = (BaseballTopPlayersStatisticsItem) obj;
                baseballTopPlayersStatisticsItem.getClass();
                return yid.j(baseballTopPlayersStatisticsItem.getFieldingChances());
            case 2:
                BaseballTopPlayersStatistics baseballTopPlayersStatistics2 = (BaseballTopPlayersStatistics) obj;
                baseballTopPlayersStatistics2.getClass();
                return baseballTopPlayersStatistics2.getFieldingDoublePlays();
            case 3:
                BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem2 = (BaseballTopPlayersStatisticsItem) obj;
                baseballTopPlayersStatisticsItem2.getClass();
                return yid.j(baseballTopPlayersStatisticsItem2.getFieldingDoublePlays());
            case 4:
                BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem3 = (BaseballTopPlayersStatisticsItem) obj;
                baseballTopPlayersStatisticsItem3.getClass();
                return yid.j(baseballTopPlayersStatisticsItem3.getBattingHomeRuns());
            case 5:
                BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem4 = (BaseballTopPlayersStatisticsItem) obj;
                baseballTopPlayersStatisticsItem4.getClass();
                return yid.j(baseballTopPlayersStatisticsItem4.getBattingStolenBases());
            case 6:
                BaseballTopPlayersStatistics baseballTopPlayersStatistics3 = (BaseballTopPlayersStatistics) obj;
                baseballTopPlayersStatistics3.getClass();
                return baseballTopPlayersStatistics3.getBattingAvg();
            case 7:
                BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem5 = (BaseballTopPlayersStatisticsItem) obj;
                baseballTopPlayersStatisticsItem5.getClass();
                Double battingAvg = baseballTopPlayersStatisticsItem5.getBattingAvg();
                yid.k(battingAvg);
                String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(battingAvg));
                format.getClass();
                return format;
            case 8:
                BaseballTopPlayersStatistics baseballTopPlayersStatistics4 = (BaseballTopPlayersStatistics) obj;
                baseballTopPlayersStatistics4.getClass();
                return baseballTopPlayersStatistics4.getBattingRuns();
            case 9:
                BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem6 = (BaseballTopPlayersStatisticsItem) obj;
                baseballTopPlayersStatisticsItem6.getClass();
                return yid.j(baseballTopPlayersStatisticsItem6.getBattingRuns());
            case 10:
                BaseballTopPlayersStatistics baseballTopPlayersStatistics5 = (BaseballTopPlayersStatistics) obj;
                baseballTopPlayersStatistics5.getClass();
                return baseballTopPlayersStatistics5.getBattingOnBasePercentage();
            case 11:
                BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem7 = (BaseballTopPlayersStatisticsItem) obj;
                baseballTopPlayersStatisticsItem7.getClass();
                Double battingOnBasePercentage = baseballTopPlayersStatisticsItem7.getBattingOnBasePercentage();
                yid.k(battingOnBasePercentage);
                String format2 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(battingOnBasePercentage));
                format2.getClass();
                return format2;
            case 12:
                BaseballTopPlayersStatistics baseballTopPlayersStatistics6 = (BaseballTopPlayersStatistics) obj;
                baseballTopPlayersStatistics6.getClass();
                return baseballTopPlayersStatistics6.getBattingSluggingPercentage();
            case 13:
                BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem8 = (BaseballTopPlayersStatisticsItem) obj;
                baseballTopPlayersStatisticsItem8.getClass();
                Double battingSluggingPercentage = baseballTopPlayersStatisticsItem8.getBattingSluggingPercentage();
                yid.k(battingSluggingPercentage);
                String format3 = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(battingSluggingPercentage));
                format3.getClass();
                return format3;
            case 14:
                BaseballTopPlayersStatistics baseballTopPlayersStatistics7 = (BaseballTopPlayersStatistics) obj;
                baseballTopPlayersStatistics7.getClass();
                return baseballTopPlayersStatistics7.getWar();
            case 15:
                BasketballTopPlayersStatistics basketballTopPlayersStatistics = (BasketballTopPlayersStatistics) obj;
                basketballTopPlayersStatistics.getClass();
                return basketballTopPlayersStatistics.getRating();
            case 16:
                BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem = (BasketballTopPlayersStatisticsItem) obj;
                basketballTopPlayersStatisticsItem.getClass();
                return rei.m(basketballTopPlayersStatisticsItem.getDefensiveRebounds(), basketballTopPlayersStatisticsItem.getAppearances());
            case 17:
                BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem2 = (BasketballTopPlayersStatisticsItem) obj;
                basketballTopPlayersStatisticsItem2.getClass();
                return rei.b(2, basketballTopPlayersStatisticsItem2.getRating());
            case 18:
                BasketballTopPlayersStatistics basketballTopPlayersStatistics2 = (BasketballTopPlayersStatistics) obj;
                basketballTopPlayersStatistics2.getClass();
                return basketballTopPlayersStatistics2.getOffensiveRebounds();
            case 19:
                BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem3 = (BasketballTopPlayersStatisticsItem) obj;
                basketballTopPlayersStatisticsItem3.getClass();
                return rei.m(basketballTopPlayersStatisticsItem3.getOffensiveRebounds(), basketballTopPlayersStatisticsItem3.getAppearances());
            case 20:
                BasketballTopPlayersStatistics basketballTopPlayersStatistics3 = (BasketballTopPlayersStatistics) obj;
                basketballTopPlayersStatistics3.getClass();
                return basketballTopPlayersStatistics3.getSteals();
            case 21:
                BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem4 = (BasketballTopPlayersStatisticsItem) obj;
                basketballTopPlayersStatisticsItem4.getClass();
                return rei.m(basketballTopPlayersStatisticsItem4.getSteals(), basketballTopPlayersStatisticsItem4.getAppearances());
            case 22:
                BasketballTopPlayersStatistics basketballTopPlayersStatistics4 = (BasketballTopPlayersStatistics) obj;
                basketballTopPlayersStatistics4.getClass();
                return basketballTopPlayersStatistics4.getTurnovers();
            case 23:
                BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem5 = (BasketballTopPlayersStatisticsItem) obj;
                basketballTopPlayersStatisticsItem5.getClass();
                return rei.m(basketballTopPlayersStatisticsItem5.getTurnovers(), basketballTopPlayersStatisticsItem5.getAppearances());
            case 24:
                BasketballTopPlayersStatistics basketballTopPlayersStatistics5 = (BasketballTopPlayersStatistics) obj;
                basketballTopPlayersStatistics5.getClass();
                return basketballTopPlayersStatistics5.getBlocks();
            case 25:
                BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem6 = (BasketballTopPlayersStatisticsItem) obj;
                basketballTopPlayersStatisticsItem6.getClass();
                return rei.m(basketballTopPlayersStatisticsItem6.getBlocks(), basketballTopPlayersStatisticsItem6.getAppearances());
            case 26:
                BasketballTopPlayersStatistics basketballTopPlayersStatistics6 = (BasketballTopPlayersStatistics) obj;
                basketballTopPlayersStatistics6.getClass();
                return basketballTopPlayersStatistics6.getFieldGoalsPercentage();
            case 27:
                BasketballTopPlayersStatistics basketballTopPlayersStatistics7 = (BasketballTopPlayersStatistics) obj;
                basketballTopPlayersStatistics7.getClass();
                return basketballTopPlayersStatistics7.getAssistTurnoverRatio();
            case 28:
                BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem7 = (BasketballTopPlayersStatisticsItem) obj;
                basketballTopPlayersStatisticsItem7.getClass();
                return rei.b(2, basketballTopPlayersStatisticsItem7.getAssistTurnoverRatio());
            default:
                BasketballTopPlayersStatistics basketballTopPlayersStatistics8 = (BasketballTopPlayersStatistics) obj;
                basketballTopPlayersStatistics8.getClass();
                return basketballTopPlayersStatistics8.getPoints();
        }
    }
}
