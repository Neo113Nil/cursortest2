package defpackage;

import android.content.Context;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.sofascore.model.newNetwork.topperformance.response.BasketballTopPlayersStatistics;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.BasketballTopPlayersStatisticsItem;
import com.sofascore.results.R;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class nab implements zab {
    public static final /* synthetic */ nab[] d;
    public static final /* synthetic */ kp5 e;
    public final int a;
    public final Function1 b;
    public final Function1 c;

    static {
        nab nabVar = new nab(NativeAdContent.ViewTag.RATING, 0, R.string.average_sofascore_rating, new jab(15), new jab(17));
        final int i = 11;
        nab nabVar2 = new nab("POINTS", 1, R.string.points_basketball, new jab(29), new Function1() { // from class: lab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i) {
                    case 0:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics.getClass();
                        return basketballTopPlayersStatistics.getPlusMinus();
                    case 1:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem.getPlusMinus(), basketballTopPlayersStatisticsItem.getAppearances());
                    case 2:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics2 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics2.getClass();
                        return basketballTopPlayersStatistics2.getPir();
                    case 3:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem2 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem2.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem2.getPir(), basketballTopPlayersStatisticsItem2.getAppearances());
                    case 4:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics3 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics3.getClass();
                        return basketballTopPlayersStatistics3.getDoubleDoubles();
                    case 5:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem3 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem3.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem3.getDoubleDoubles());
                    case 6:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics4 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics4.getClass();
                        return basketballTopPlayersStatistics4.getTripleDoubles();
                    case 7:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem4 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem4.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem4.getFieldGoalsPercentage(), basketballTopPlayersStatisticsItem4.getFieldGoalsMade(), basketballTopPlayersStatisticsItem4.getAppearances());
                    case 8:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem5 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem5.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem5.getTripleDoubles());
                    case 9:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics5 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics5.getClass();
                        return basketballTopPlayersStatistics5.getTrueShootingPercentage();
                    case 10:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem6 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem6.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem6.getTrueShootingPercentage(), 0, 6);
                    case 11:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem7 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem7.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem7.getPoints(), basketballTopPlayersStatisticsItem7.getAppearances());
                    case 12:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics6 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics6.getClass();
                        return basketballTopPlayersStatistics6.getEffectiveFieldGoalPercentage();
                    case 13:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem8 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem8.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem8.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 14:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics7 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics7.getClass();
                        return basketballTopPlayersStatistics7.getUsage();
                    case 15:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem9 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem9.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem9.getUsage(), 0, 6);
                    case 16:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics8 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics8.getClass();
                        return basketballTopPlayersStatistics8.getIndividualOffensiveRating();
                    case 17:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem10 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem10.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem10.getIndividualOffensiveRating());
                    case 18:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics9 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics9.getClass();
                        return basketballTopPlayersStatistics9.getFreeThrowsPercentage();
                    case 19:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics10 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics10.getClass();
                        return basketballTopPlayersStatistics10.getIndividualDefensiveRating();
                    case 20:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem11 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem11.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem11.getIndividualDefensiveRating());
                    case 21:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics11 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics11.getClass();
                        return basketballTopPlayersStatistics11.getPlayerEfficiencyRating();
                    case 22:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem12 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem12.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem12.getPlayerEfficiencyRating());
                    case 23:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics12 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics12.getClass();
                        return basketballTopPlayersStatistics12.getRebounds();
                    case 24:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem13 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem13.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem13.getRebounds(), basketballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics13 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics13.getClass();
                        return basketballTopPlayersStatistics13.getAssists();
                    case 26:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem14 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem14.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem14.getAssists(), basketballTopPlayersStatisticsItem14.getAppearances());
                    case 27:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics14 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics14.getClass();
                        return basketballTopPlayersStatistics14.getSecondsPlayed();
                    case 28:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem15 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem15.getClass();
                        return rei.j(basketballTopPlayersStatisticsItem15.getSecondsPlayed(), basketballTopPlayersStatisticsItem15.getAppearances());
                    default:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem16 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem16.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem16.getFreeThrowsPercentage(), basketballTopPlayersStatisticsItem16.getFreeThrowsMade(), basketballTopPlayersStatisticsItem16.getAppearances());
                }
            }
        });
        final int i2 = 23;
        Function1 function1 = new Function1() { // from class: lab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i2) {
                    case 0:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics.getClass();
                        return basketballTopPlayersStatistics.getPlusMinus();
                    case 1:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem.getPlusMinus(), basketballTopPlayersStatisticsItem.getAppearances());
                    case 2:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics2 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics2.getClass();
                        return basketballTopPlayersStatistics2.getPir();
                    case 3:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem2 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem2.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem2.getPir(), basketballTopPlayersStatisticsItem2.getAppearances());
                    case 4:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics3 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics3.getClass();
                        return basketballTopPlayersStatistics3.getDoubleDoubles();
                    case 5:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem3 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem3.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem3.getDoubleDoubles());
                    case 6:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics4 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics4.getClass();
                        return basketballTopPlayersStatistics4.getTripleDoubles();
                    case 7:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem4 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem4.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem4.getFieldGoalsPercentage(), basketballTopPlayersStatisticsItem4.getFieldGoalsMade(), basketballTopPlayersStatisticsItem4.getAppearances());
                    case 8:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem5 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem5.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem5.getTripleDoubles());
                    case 9:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics5 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics5.getClass();
                        return basketballTopPlayersStatistics5.getTrueShootingPercentage();
                    case 10:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem6 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem6.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem6.getTrueShootingPercentage(), 0, 6);
                    case 11:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem7 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem7.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem7.getPoints(), basketballTopPlayersStatisticsItem7.getAppearances());
                    case 12:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics6 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics6.getClass();
                        return basketballTopPlayersStatistics6.getEffectiveFieldGoalPercentage();
                    case 13:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem8 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem8.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem8.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 14:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics7 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics7.getClass();
                        return basketballTopPlayersStatistics7.getUsage();
                    case 15:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem9 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem9.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem9.getUsage(), 0, 6);
                    case 16:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics8 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics8.getClass();
                        return basketballTopPlayersStatistics8.getIndividualOffensiveRating();
                    case 17:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem10 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem10.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem10.getIndividualOffensiveRating());
                    case 18:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics9 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics9.getClass();
                        return basketballTopPlayersStatistics9.getFreeThrowsPercentage();
                    case 19:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics10 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics10.getClass();
                        return basketballTopPlayersStatistics10.getIndividualDefensiveRating();
                    case 20:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem11 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem11.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem11.getIndividualDefensiveRating());
                    case 21:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics11 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics11.getClass();
                        return basketballTopPlayersStatistics11.getPlayerEfficiencyRating();
                    case 22:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem12 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem12.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem12.getPlayerEfficiencyRating());
                    case 23:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics12 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics12.getClass();
                        return basketballTopPlayersStatistics12.getRebounds();
                    case 24:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem13 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem13.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem13.getRebounds(), basketballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics13 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics13.getClass();
                        return basketballTopPlayersStatistics13.getAssists();
                    case 26:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem14 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem14.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem14.getAssists(), basketballTopPlayersStatisticsItem14.getAppearances());
                    case 27:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics14 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics14.getClass();
                        return basketballTopPlayersStatistics14.getSecondsPlayed();
                    case 28:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem15 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem15.getClass();
                        return rei.j(basketballTopPlayersStatisticsItem15.getSecondsPlayed(), basketballTopPlayersStatisticsItem15.getAppearances());
                    default:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem16 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem16.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem16.getFreeThrowsPercentage(), basketballTopPlayersStatisticsItem16.getFreeThrowsMade(), basketballTopPlayersStatisticsItem16.getAppearances());
                }
            }
        };
        final int i3 = 24;
        nab nabVar3 = new nab("REBOUNDS", 2, R.string.rebounds, function1, new Function1() { // from class: lab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i3) {
                    case 0:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics.getClass();
                        return basketballTopPlayersStatistics.getPlusMinus();
                    case 1:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem.getPlusMinus(), basketballTopPlayersStatisticsItem.getAppearances());
                    case 2:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics2 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics2.getClass();
                        return basketballTopPlayersStatistics2.getPir();
                    case 3:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem2 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem2.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem2.getPir(), basketballTopPlayersStatisticsItem2.getAppearances());
                    case 4:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics3 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics3.getClass();
                        return basketballTopPlayersStatistics3.getDoubleDoubles();
                    case 5:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem3 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem3.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem3.getDoubleDoubles());
                    case 6:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics4 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics4.getClass();
                        return basketballTopPlayersStatistics4.getTripleDoubles();
                    case 7:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem4 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem4.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem4.getFieldGoalsPercentage(), basketballTopPlayersStatisticsItem4.getFieldGoalsMade(), basketballTopPlayersStatisticsItem4.getAppearances());
                    case 8:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem5 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem5.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem5.getTripleDoubles());
                    case 9:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics5 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics5.getClass();
                        return basketballTopPlayersStatistics5.getTrueShootingPercentage();
                    case 10:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem6 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem6.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem6.getTrueShootingPercentage(), 0, 6);
                    case 11:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem7 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem7.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem7.getPoints(), basketballTopPlayersStatisticsItem7.getAppearances());
                    case 12:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics6 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics6.getClass();
                        return basketballTopPlayersStatistics6.getEffectiveFieldGoalPercentage();
                    case 13:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem8 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem8.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem8.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 14:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics7 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics7.getClass();
                        return basketballTopPlayersStatistics7.getUsage();
                    case 15:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem9 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem9.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem9.getUsage(), 0, 6);
                    case 16:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics8 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics8.getClass();
                        return basketballTopPlayersStatistics8.getIndividualOffensiveRating();
                    case 17:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem10 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem10.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem10.getIndividualOffensiveRating());
                    case 18:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics9 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics9.getClass();
                        return basketballTopPlayersStatistics9.getFreeThrowsPercentage();
                    case 19:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics10 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics10.getClass();
                        return basketballTopPlayersStatistics10.getIndividualDefensiveRating();
                    case 20:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem11 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem11.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem11.getIndividualDefensiveRating());
                    case 21:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics11 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics11.getClass();
                        return basketballTopPlayersStatistics11.getPlayerEfficiencyRating();
                    case 22:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem12 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem12.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem12.getPlayerEfficiencyRating());
                    case 23:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics12 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics12.getClass();
                        return basketballTopPlayersStatistics12.getRebounds();
                    case 24:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem13 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem13.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem13.getRebounds(), basketballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics13 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics13.getClass();
                        return basketballTopPlayersStatistics13.getAssists();
                    case 26:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem14 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem14.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem14.getAssists(), basketballTopPlayersStatisticsItem14.getAppearances());
                    case 27:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics14 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics14.getClass();
                        return basketballTopPlayersStatistics14.getSecondsPlayed();
                    case 28:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem15 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem15.getClass();
                        return rei.j(basketballTopPlayersStatisticsItem15.getSecondsPlayed(), basketballTopPlayersStatisticsItem15.getAppearances());
                    default:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem16 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem16.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem16.getFreeThrowsPercentage(), basketballTopPlayersStatisticsItem16.getFreeThrowsMade(), basketballTopPlayersStatisticsItem16.getAppearances());
                }
            }
        });
        final int i4 = 25;
        Function1 function12 = new Function1() { // from class: lab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i4) {
                    case 0:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics.getClass();
                        return basketballTopPlayersStatistics.getPlusMinus();
                    case 1:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem.getPlusMinus(), basketballTopPlayersStatisticsItem.getAppearances());
                    case 2:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics2 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics2.getClass();
                        return basketballTopPlayersStatistics2.getPir();
                    case 3:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem2 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem2.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem2.getPir(), basketballTopPlayersStatisticsItem2.getAppearances());
                    case 4:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics3 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics3.getClass();
                        return basketballTopPlayersStatistics3.getDoubleDoubles();
                    case 5:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem3 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem3.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem3.getDoubleDoubles());
                    case 6:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics4 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics4.getClass();
                        return basketballTopPlayersStatistics4.getTripleDoubles();
                    case 7:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem4 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem4.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem4.getFieldGoalsPercentage(), basketballTopPlayersStatisticsItem4.getFieldGoalsMade(), basketballTopPlayersStatisticsItem4.getAppearances());
                    case 8:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem5 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem5.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem5.getTripleDoubles());
                    case 9:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics5 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics5.getClass();
                        return basketballTopPlayersStatistics5.getTrueShootingPercentage();
                    case 10:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem6 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem6.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem6.getTrueShootingPercentage(), 0, 6);
                    case 11:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem7 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem7.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem7.getPoints(), basketballTopPlayersStatisticsItem7.getAppearances());
                    case 12:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics6 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics6.getClass();
                        return basketballTopPlayersStatistics6.getEffectiveFieldGoalPercentage();
                    case 13:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem8 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem8.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem8.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 14:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics7 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics7.getClass();
                        return basketballTopPlayersStatistics7.getUsage();
                    case 15:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem9 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem9.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem9.getUsage(), 0, 6);
                    case 16:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics8 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics8.getClass();
                        return basketballTopPlayersStatistics8.getIndividualOffensiveRating();
                    case 17:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem10 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem10.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem10.getIndividualOffensiveRating());
                    case 18:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics9 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics9.getClass();
                        return basketballTopPlayersStatistics9.getFreeThrowsPercentage();
                    case 19:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics10 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics10.getClass();
                        return basketballTopPlayersStatistics10.getIndividualDefensiveRating();
                    case 20:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem11 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem11.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem11.getIndividualDefensiveRating());
                    case 21:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics11 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics11.getClass();
                        return basketballTopPlayersStatistics11.getPlayerEfficiencyRating();
                    case 22:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem12 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem12.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem12.getPlayerEfficiencyRating());
                    case 23:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics12 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics12.getClass();
                        return basketballTopPlayersStatistics12.getRebounds();
                    case 24:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem13 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem13.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem13.getRebounds(), basketballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics13 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics13.getClass();
                        return basketballTopPlayersStatistics13.getAssists();
                    case 26:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem14 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem14.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem14.getAssists(), basketballTopPlayersStatisticsItem14.getAppearances());
                    case 27:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics14 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics14.getClass();
                        return basketballTopPlayersStatistics14.getSecondsPlayed();
                    case 28:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem15 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem15.getClass();
                        return rei.j(basketballTopPlayersStatisticsItem15.getSecondsPlayed(), basketballTopPlayersStatisticsItem15.getAppearances());
                    default:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem16 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem16.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem16.getFreeThrowsPercentage(), basketballTopPlayersStatisticsItem16.getFreeThrowsMade(), basketballTopPlayersStatisticsItem16.getAppearances());
                }
            }
        };
        final int i5 = 26;
        nab nabVar4 = new nab("ASSISTS", 3, R.string.basketball_assists, function12, new Function1() { // from class: lab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i5) {
                    case 0:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics.getClass();
                        return basketballTopPlayersStatistics.getPlusMinus();
                    case 1:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem.getPlusMinus(), basketballTopPlayersStatisticsItem.getAppearances());
                    case 2:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics2 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics2.getClass();
                        return basketballTopPlayersStatistics2.getPir();
                    case 3:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem2 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem2.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem2.getPir(), basketballTopPlayersStatisticsItem2.getAppearances());
                    case 4:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics3 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics3.getClass();
                        return basketballTopPlayersStatistics3.getDoubleDoubles();
                    case 5:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem3 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem3.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem3.getDoubleDoubles());
                    case 6:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics4 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics4.getClass();
                        return basketballTopPlayersStatistics4.getTripleDoubles();
                    case 7:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem4 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem4.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem4.getFieldGoalsPercentage(), basketballTopPlayersStatisticsItem4.getFieldGoalsMade(), basketballTopPlayersStatisticsItem4.getAppearances());
                    case 8:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem5 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem5.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem5.getTripleDoubles());
                    case 9:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics5 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics5.getClass();
                        return basketballTopPlayersStatistics5.getTrueShootingPercentage();
                    case 10:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem6 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem6.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem6.getTrueShootingPercentage(), 0, 6);
                    case 11:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem7 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem7.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem7.getPoints(), basketballTopPlayersStatisticsItem7.getAppearances());
                    case 12:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics6 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics6.getClass();
                        return basketballTopPlayersStatistics6.getEffectiveFieldGoalPercentage();
                    case 13:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem8 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem8.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem8.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 14:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics7 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics7.getClass();
                        return basketballTopPlayersStatistics7.getUsage();
                    case 15:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem9 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem9.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem9.getUsage(), 0, 6);
                    case 16:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics8 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics8.getClass();
                        return basketballTopPlayersStatistics8.getIndividualOffensiveRating();
                    case 17:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem10 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem10.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem10.getIndividualOffensiveRating());
                    case 18:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics9 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics9.getClass();
                        return basketballTopPlayersStatistics9.getFreeThrowsPercentage();
                    case 19:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics10 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics10.getClass();
                        return basketballTopPlayersStatistics10.getIndividualDefensiveRating();
                    case 20:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem11 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem11.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem11.getIndividualDefensiveRating());
                    case 21:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics11 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics11.getClass();
                        return basketballTopPlayersStatistics11.getPlayerEfficiencyRating();
                    case 22:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem12 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem12.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem12.getPlayerEfficiencyRating());
                    case 23:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics12 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics12.getClass();
                        return basketballTopPlayersStatistics12.getRebounds();
                    case 24:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem13 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem13.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem13.getRebounds(), basketballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics13 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics13.getClass();
                        return basketballTopPlayersStatistics13.getAssists();
                    case 26:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem14 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem14.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem14.getAssists(), basketballTopPlayersStatisticsItem14.getAppearances());
                    case 27:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics14 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics14.getClass();
                        return basketballTopPlayersStatistics14.getSecondsPlayed();
                    case 28:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem15 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem15.getClass();
                        return rei.j(basketballTopPlayersStatisticsItem15.getSecondsPlayed(), basketballTopPlayersStatisticsItem15.getAppearances());
                    default:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem16 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem16.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem16.getFreeThrowsPercentage(), basketballTopPlayersStatisticsItem16.getFreeThrowsMade(), basketballTopPlayersStatisticsItem16.getAppearances());
                }
            }
        });
        final int i6 = 27;
        Function1 function13 = new Function1() { // from class: lab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i6) {
                    case 0:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics.getClass();
                        return basketballTopPlayersStatistics.getPlusMinus();
                    case 1:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem.getPlusMinus(), basketballTopPlayersStatisticsItem.getAppearances());
                    case 2:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics2 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics2.getClass();
                        return basketballTopPlayersStatistics2.getPir();
                    case 3:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem2 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem2.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem2.getPir(), basketballTopPlayersStatisticsItem2.getAppearances());
                    case 4:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics3 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics3.getClass();
                        return basketballTopPlayersStatistics3.getDoubleDoubles();
                    case 5:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem3 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem3.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem3.getDoubleDoubles());
                    case 6:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics4 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics4.getClass();
                        return basketballTopPlayersStatistics4.getTripleDoubles();
                    case 7:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem4 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem4.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem4.getFieldGoalsPercentage(), basketballTopPlayersStatisticsItem4.getFieldGoalsMade(), basketballTopPlayersStatisticsItem4.getAppearances());
                    case 8:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem5 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem5.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem5.getTripleDoubles());
                    case 9:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics5 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics5.getClass();
                        return basketballTopPlayersStatistics5.getTrueShootingPercentage();
                    case 10:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem6 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem6.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem6.getTrueShootingPercentage(), 0, 6);
                    case 11:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem7 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem7.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem7.getPoints(), basketballTopPlayersStatisticsItem7.getAppearances());
                    case 12:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics6 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics6.getClass();
                        return basketballTopPlayersStatistics6.getEffectiveFieldGoalPercentage();
                    case 13:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem8 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem8.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem8.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 14:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics7 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics7.getClass();
                        return basketballTopPlayersStatistics7.getUsage();
                    case 15:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem9 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem9.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem9.getUsage(), 0, 6);
                    case 16:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics8 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics8.getClass();
                        return basketballTopPlayersStatistics8.getIndividualOffensiveRating();
                    case 17:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem10 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem10.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem10.getIndividualOffensiveRating());
                    case 18:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics9 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics9.getClass();
                        return basketballTopPlayersStatistics9.getFreeThrowsPercentage();
                    case 19:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics10 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics10.getClass();
                        return basketballTopPlayersStatistics10.getIndividualDefensiveRating();
                    case 20:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem11 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem11.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem11.getIndividualDefensiveRating());
                    case 21:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics11 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics11.getClass();
                        return basketballTopPlayersStatistics11.getPlayerEfficiencyRating();
                    case 22:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem12 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem12.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem12.getPlayerEfficiencyRating());
                    case 23:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics12 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics12.getClass();
                        return basketballTopPlayersStatistics12.getRebounds();
                    case 24:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem13 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem13.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem13.getRebounds(), basketballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics13 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics13.getClass();
                        return basketballTopPlayersStatistics13.getAssists();
                    case 26:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem14 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem14.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem14.getAssists(), basketballTopPlayersStatisticsItem14.getAppearances());
                    case 27:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics14 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics14.getClass();
                        return basketballTopPlayersStatistics14.getSecondsPlayed();
                    case 28:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem15 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem15.getClass();
                        return rei.j(basketballTopPlayersStatisticsItem15.getSecondsPlayed(), basketballTopPlayersStatisticsItem15.getAppearances());
                    default:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem16 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem16.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem16.getFreeThrowsPercentage(), basketballTopPlayersStatisticsItem16.getFreeThrowsMade(), basketballTopPlayersStatisticsItem16.getAppearances());
                }
            }
        };
        final int i7 = 28;
        nab nabVar5 = new nab("MINUTES", 4, R.string.basketball_minutes_per_game, function13, new Function1() { // from class: lab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i7) {
                    case 0:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics.getClass();
                        return basketballTopPlayersStatistics.getPlusMinus();
                    case 1:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem.getPlusMinus(), basketballTopPlayersStatisticsItem.getAppearances());
                    case 2:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics2 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics2.getClass();
                        return basketballTopPlayersStatistics2.getPir();
                    case 3:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem2 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem2.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem2.getPir(), basketballTopPlayersStatisticsItem2.getAppearances());
                    case 4:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics3 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics3.getClass();
                        return basketballTopPlayersStatistics3.getDoubleDoubles();
                    case 5:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem3 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem3.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem3.getDoubleDoubles());
                    case 6:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics4 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics4.getClass();
                        return basketballTopPlayersStatistics4.getTripleDoubles();
                    case 7:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem4 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem4.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem4.getFieldGoalsPercentage(), basketballTopPlayersStatisticsItem4.getFieldGoalsMade(), basketballTopPlayersStatisticsItem4.getAppearances());
                    case 8:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem5 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem5.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem5.getTripleDoubles());
                    case 9:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics5 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics5.getClass();
                        return basketballTopPlayersStatistics5.getTrueShootingPercentage();
                    case 10:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem6 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem6.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem6.getTrueShootingPercentage(), 0, 6);
                    case 11:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem7 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem7.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem7.getPoints(), basketballTopPlayersStatisticsItem7.getAppearances());
                    case 12:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics6 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics6.getClass();
                        return basketballTopPlayersStatistics6.getEffectiveFieldGoalPercentage();
                    case 13:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem8 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem8.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem8.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 14:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics7 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics7.getClass();
                        return basketballTopPlayersStatistics7.getUsage();
                    case 15:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem9 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem9.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem9.getUsage(), 0, 6);
                    case 16:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics8 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics8.getClass();
                        return basketballTopPlayersStatistics8.getIndividualOffensiveRating();
                    case 17:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem10 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem10.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem10.getIndividualOffensiveRating());
                    case 18:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics9 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics9.getClass();
                        return basketballTopPlayersStatistics9.getFreeThrowsPercentage();
                    case 19:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics10 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics10.getClass();
                        return basketballTopPlayersStatistics10.getIndividualDefensiveRating();
                    case 20:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem11 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem11.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem11.getIndividualDefensiveRating());
                    case 21:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics11 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics11.getClass();
                        return basketballTopPlayersStatistics11.getPlayerEfficiencyRating();
                    case 22:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem12 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem12.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem12.getPlayerEfficiencyRating());
                    case 23:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics12 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics12.getClass();
                        return basketballTopPlayersStatistics12.getRebounds();
                    case 24:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem13 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem13.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem13.getRebounds(), basketballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics13 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics13.getClass();
                        return basketballTopPlayersStatistics13.getAssists();
                    case 26:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem14 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem14.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem14.getAssists(), basketballTopPlayersStatisticsItem14.getAppearances());
                    case 27:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics14 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics14.getClass();
                        return basketballTopPlayersStatistics14.getSecondsPlayed();
                    case 28:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem15 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem15.getClass();
                        return rei.j(basketballTopPlayersStatisticsItem15.getSecondsPlayed(), basketballTopPlayersStatisticsItem15.getAppearances());
                    default:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem16 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem16.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem16.getFreeThrowsPercentage(), basketballTopPlayersStatisticsItem16.getFreeThrowsMade(), basketballTopPlayersStatisticsItem16.getAppearances());
                }
            }
        });
        final int i8 = 7;
        nab nabVar6 = new nab("FIELD_GOALS_PCT", 5, R.string.field_goals_percentage_made, new jab(26), new Function1() { // from class: lab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i8) {
                    case 0:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics.getClass();
                        return basketballTopPlayersStatistics.getPlusMinus();
                    case 1:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem.getPlusMinus(), basketballTopPlayersStatisticsItem.getAppearances());
                    case 2:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics2 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics2.getClass();
                        return basketballTopPlayersStatistics2.getPir();
                    case 3:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem2 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem2.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem2.getPir(), basketballTopPlayersStatisticsItem2.getAppearances());
                    case 4:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics3 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics3.getClass();
                        return basketballTopPlayersStatistics3.getDoubleDoubles();
                    case 5:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem3 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem3.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem3.getDoubleDoubles());
                    case 6:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics4 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics4.getClass();
                        return basketballTopPlayersStatistics4.getTripleDoubles();
                    case 7:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem4 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem4.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem4.getFieldGoalsPercentage(), basketballTopPlayersStatisticsItem4.getFieldGoalsMade(), basketballTopPlayersStatisticsItem4.getAppearances());
                    case 8:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem5 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem5.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem5.getTripleDoubles());
                    case 9:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics5 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics5.getClass();
                        return basketballTopPlayersStatistics5.getTrueShootingPercentage();
                    case 10:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem6 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem6.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem6.getTrueShootingPercentage(), 0, 6);
                    case 11:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem7 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem7.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem7.getPoints(), basketballTopPlayersStatisticsItem7.getAppearances());
                    case 12:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics6 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics6.getClass();
                        return basketballTopPlayersStatistics6.getEffectiveFieldGoalPercentage();
                    case 13:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem8 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem8.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem8.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 14:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics7 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics7.getClass();
                        return basketballTopPlayersStatistics7.getUsage();
                    case 15:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem9 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem9.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem9.getUsage(), 0, 6);
                    case 16:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics8 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics8.getClass();
                        return basketballTopPlayersStatistics8.getIndividualOffensiveRating();
                    case 17:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem10 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem10.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem10.getIndividualOffensiveRating());
                    case 18:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics9 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics9.getClass();
                        return basketballTopPlayersStatistics9.getFreeThrowsPercentage();
                    case 19:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics10 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics10.getClass();
                        return basketballTopPlayersStatistics10.getIndividualDefensiveRating();
                    case 20:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem11 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem11.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem11.getIndividualDefensiveRating());
                    case 21:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics11 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics11.getClass();
                        return basketballTopPlayersStatistics11.getPlayerEfficiencyRating();
                    case 22:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem12 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem12.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem12.getPlayerEfficiencyRating());
                    case 23:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics12 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics12.getClass();
                        return basketballTopPlayersStatistics12.getRebounds();
                    case 24:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem13 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem13.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem13.getRebounds(), basketballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics13 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics13.getClass();
                        return basketballTopPlayersStatistics13.getAssists();
                    case 26:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem14 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem14.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem14.getAssists(), basketballTopPlayersStatisticsItem14.getAppearances());
                    case 27:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics14 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics14.getClass();
                        return basketballTopPlayersStatistics14.getSecondsPlayed();
                    case 28:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem15 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem15.getClass();
                        return rei.j(basketballTopPlayersStatisticsItem15.getSecondsPlayed(), basketballTopPlayersStatisticsItem15.getAppearances());
                    default:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem16 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem16.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem16.getFreeThrowsPercentage(), basketballTopPlayersStatisticsItem16.getFreeThrowsMade(), basketballTopPlayersStatisticsItem16.getAppearances());
                }
            }
        });
        final int i9 = 18;
        Function1 function14 = new Function1() { // from class: lab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i9) {
                    case 0:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics.getClass();
                        return basketballTopPlayersStatistics.getPlusMinus();
                    case 1:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem.getPlusMinus(), basketballTopPlayersStatisticsItem.getAppearances());
                    case 2:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics2 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics2.getClass();
                        return basketballTopPlayersStatistics2.getPir();
                    case 3:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem2 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem2.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem2.getPir(), basketballTopPlayersStatisticsItem2.getAppearances());
                    case 4:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics3 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics3.getClass();
                        return basketballTopPlayersStatistics3.getDoubleDoubles();
                    case 5:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem3 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem3.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem3.getDoubleDoubles());
                    case 6:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics4 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics4.getClass();
                        return basketballTopPlayersStatistics4.getTripleDoubles();
                    case 7:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem4 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem4.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem4.getFieldGoalsPercentage(), basketballTopPlayersStatisticsItem4.getFieldGoalsMade(), basketballTopPlayersStatisticsItem4.getAppearances());
                    case 8:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem5 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem5.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem5.getTripleDoubles());
                    case 9:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics5 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics5.getClass();
                        return basketballTopPlayersStatistics5.getTrueShootingPercentage();
                    case 10:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem6 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem6.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem6.getTrueShootingPercentage(), 0, 6);
                    case 11:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem7 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem7.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem7.getPoints(), basketballTopPlayersStatisticsItem7.getAppearances());
                    case 12:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics6 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics6.getClass();
                        return basketballTopPlayersStatistics6.getEffectiveFieldGoalPercentage();
                    case 13:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem8 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem8.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem8.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 14:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics7 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics7.getClass();
                        return basketballTopPlayersStatistics7.getUsage();
                    case 15:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem9 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem9.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem9.getUsage(), 0, 6);
                    case 16:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics8 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics8.getClass();
                        return basketballTopPlayersStatistics8.getIndividualOffensiveRating();
                    case 17:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem10 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem10.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem10.getIndividualOffensiveRating());
                    case 18:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics9 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics9.getClass();
                        return basketballTopPlayersStatistics9.getFreeThrowsPercentage();
                    case 19:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics10 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics10.getClass();
                        return basketballTopPlayersStatistics10.getIndividualDefensiveRating();
                    case 20:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem11 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem11.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem11.getIndividualDefensiveRating());
                    case 21:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics11 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics11.getClass();
                        return basketballTopPlayersStatistics11.getPlayerEfficiencyRating();
                    case 22:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem12 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem12.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem12.getPlayerEfficiencyRating());
                    case 23:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics12 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics12.getClass();
                        return basketballTopPlayersStatistics12.getRebounds();
                    case 24:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem13 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem13.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem13.getRebounds(), basketballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics13 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics13.getClass();
                        return basketballTopPlayersStatistics13.getAssists();
                    case 26:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem14 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem14.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem14.getAssists(), basketballTopPlayersStatisticsItem14.getAppearances());
                    case 27:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics14 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics14.getClass();
                        return basketballTopPlayersStatistics14.getSecondsPlayed();
                    case 28:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem15 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem15.getClass();
                        return rei.j(basketballTopPlayersStatisticsItem15.getSecondsPlayed(), basketballTopPlayersStatisticsItem15.getAppearances());
                    default:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem16 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem16.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem16.getFreeThrowsPercentage(), basketballTopPlayersStatisticsItem16.getFreeThrowsMade(), basketballTopPlayersStatisticsItem16.getAppearances());
                }
            }
        };
        final int i10 = 29;
        nab nabVar7 = new nab("FREE_THROWS_PCT", 6, R.string.free_throws_percentage_made, function14, new Function1() { // from class: lab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i10) {
                    case 0:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics.getClass();
                        return basketballTopPlayersStatistics.getPlusMinus();
                    case 1:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem.getPlusMinus(), basketballTopPlayersStatisticsItem.getAppearances());
                    case 2:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics2 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics2.getClass();
                        return basketballTopPlayersStatistics2.getPir();
                    case 3:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem2 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem2.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem2.getPir(), basketballTopPlayersStatisticsItem2.getAppearances());
                    case 4:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics3 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics3.getClass();
                        return basketballTopPlayersStatistics3.getDoubleDoubles();
                    case 5:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem3 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem3.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem3.getDoubleDoubles());
                    case 6:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics4 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics4.getClass();
                        return basketballTopPlayersStatistics4.getTripleDoubles();
                    case 7:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem4 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem4.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem4.getFieldGoalsPercentage(), basketballTopPlayersStatisticsItem4.getFieldGoalsMade(), basketballTopPlayersStatisticsItem4.getAppearances());
                    case 8:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem5 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem5.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem5.getTripleDoubles());
                    case 9:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics5 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics5.getClass();
                        return basketballTopPlayersStatistics5.getTrueShootingPercentage();
                    case 10:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem6 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem6.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem6.getTrueShootingPercentage(), 0, 6);
                    case 11:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem7 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem7.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem7.getPoints(), basketballTopPlayersStatisticsItem7.getAppearances());
                    case 12:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics6 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics6.getClass();
                        return basketballTopPlayersStatistics6.getEffectiveFieldGoalPercentage();
                    case 13:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem8 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem8.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem8.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 14:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics7 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics7.getClass();
                        return basketballTopPlayersStatistics7.getUsage();
                    case 15:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem9 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem9.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem9.getUsage(), 0, 6);
                    case 16:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics8 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics8.getClass();
                        return basketballTopPlayersStatistics8.getIndividualOffensiveRating();
                    case 17:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem10 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem10.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem10.getIndividualOffensiveRating());
                    case 18:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics9 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics9.getClass();
                        return basketballTopPlayersStatistics9.getFreeThrowsPercentage();
                    case 19:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics10 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics10.getClass();
                        return basketballTopPlayersStatistics10.getIndividualDefensiveRating();
                    case 20:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem11 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem11.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem11.getIndividualDefensiveRating());
                    case 21:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics11 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics11.getClass();
                        return basketballTopPlayersStatistics11.getPlayerEfficiencyRating();
                    case 22:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem12 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem12.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem12.getPlayerEfficiencyRating());
                    case 23:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics12 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics12.getClass();
                        return basketballTopPlayersStatistics12.getRebounds();
                    case 24:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem13 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem13.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem13.getRebounds(), basketballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics13 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics13.getClass();
                        return basketballTopPlayersStatistics13.getAssists();
                    case 26:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem14 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem14.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem14.getAssists(), basketballTopPlayersStatisticsItem14.getAppearances());
                    case 27:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics14 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics14.getClass();
                        return basketballTopPlayersStatistics14.getSecondsPlayed();
                    case 28:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem15 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem15.getClass();
                        return rei.j(basketballTopPlayersStatisticsItem15.getSecondsPlayed(), basketballTopPlayersStatisticsItem15.getAppearances());
                    default:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem16 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem16.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem16.getFreeThrowsPercentage(), basketballTopPlayersStatisticsItem16.getFreeThrowsMade(), basketballTopPlayersStatisticsItem16.getAppearances());
                }
            }
        });
        nab nabVar8 = new nab("THREE_PT_PCT", 7, R.string.three_points_percentage_made, new mab(0), new mab(1));
        nab nabVar9 = new nab("THREE_PT_MADE", 8, R.string.three_pointers, new mab(2), new mab(3));
        nab nabVar10 = new nab("DEF_REBOUNDS", 9, R.string.defensive_rebounds, new mab(4), new jab(16));
        nab nabVar11 = new nab("OFF_REBOUNDS", 10, R.string.offensive_rebounds, new jab(18), new jab(19));
        nab nabVar12 = new nab("STEALS", 11, R.string.steals, new jab(20), new jab(21));
        nab nabVar13 = new nab("TURNOVERS", 12, R.string.turnovers, new jab(22), new jab(23));
        nab nabVar14 = new nab("BLOCKS", 13, R.string.blocks, new jab(24), new jab(25));
        nab nabVar15 = new nab("AST_TO_RATIO", 14, R.string.assist_to_turnover_ratio, new jab(27), new jab(28));
        final int i11 = 0;
        final int i12 = 1;
        nab nabVar16 = new nab("PLUS_MINUS", 15, R.string.plus_minus_per_game, new Function1() { // from class: lab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i11) {
                    case 0:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics.getClass();
                        return basketballTopPlayersStatistics.getPlusMinus();
                    case 1:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem.getPlusMinus(), basketballTopPlayersStatisticsItem.getAppearances());
                    case 2:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics2 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics2.getClass();
                        return basketballTopPlayersStatistics2.getPir();
                    case 3:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem2 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem2.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem2.getPir(), basketballTopPlayersStatisticsItem2.getAppearances());
                    case 4:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics3 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics3.getClass();
                        return basketballTopPlayersStatistics3.getDoubleDoubles();
                    case 5:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem3 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem3.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem3.getDoubleDoubles());
                    case 6:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics4 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics4.getClass();
                        return basketballTopPlayersStatistics4.getTripleDoubles();
                    case 7:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem4 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem4.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem4.getFieldGoalsPercentage(), basketballTopPlayersStatisticsItem4.getFieldGoalsMade(), basketballTopPlayersStatisticsItem4.getAppearances());
                    case 8:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem5 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem5.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem5.getTripleDoubles());
                    case 9:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics5 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics5.getClass();
                        return basketballTopPlayersStatistics5.getTrueShootingPercentage();
                    case 10:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem6 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem6.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem6.getTrueShootingPercentage(), 0, 6);
                    case 11:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem7 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem7.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem7.getPoints(), basketballTopPlayersStatisticsItem7.getAppearances());
                    case 12:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics6 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics6.getClass();
                        return basketballTopPlayersStatistics6.getEffectiveFieldGoalPercentage();
                    case 13:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem8 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem8.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem8.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 14:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics7 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics7.getClass();
                        return basketballTopPlayersStatistics7.getUsage();
                    case 15:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem9 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem9.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem9.getUsage(), 0, 6);
                    case 16:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics8 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics8.getClass();
                        return basketballTopPlayersStatistics8.getIndividualOffensiveRating();
                    case 17:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem10 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem10.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem10.getIndividualOffensiveRating());
                    case 18:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics9 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics9.getClass();
                        return basketballTopPlayersStatistics9.getFreeThrowsPercentage();
                    case 19:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics10 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics10.getClass();
                        return basketballTopPlayersStatistics10.getIndividualDefensiveRating();
                    case 20:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem11 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem11.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem11.getIndividualDefensiveRating());
                    case 21:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics11 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics11.getClass();
                        return basketballTopPlayersStatistics11.getPlayerEfficiencyRating();
                    case 22:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem12 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem12.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem12.getPlayerEfficiencyRating());
                    case 23:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics12 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics12.getClass();
                        return basketballTopPlayersStatistics12.getRebounds();
                    case 24:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem13 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem13.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem13.getRebounds(), basketballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics13 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics13.getClass();
                        return basketballTopPlayersStatistics13.getAssists();
                    case 26:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem14 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem14.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem14.getAssists(), basketballTopPlayersStatisticsItem14.getAppearances());
                    case 27:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics14 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics14.getClass();
                        return basketballTopPlayersStatistics14.getSecondsPlayed();
                    case 28:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem15 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem15.getClass();
                        return rei.j(basketballTopPlayersStatisticsItem15.getSecondsPlayed(), basketballTopPlayersStatisticsItem15.getAppearances());
                    default:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem16 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem16.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem16.getFreeThrowsPercentage(), basketballTopPlayersStatisticsItem16.getFreeThrowsMade(), basketballTopPlayersStatisticsItem16.getAppearances());
                }
            }
        }, new Function1() { // from class: lab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i12) {
                    case 0:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics.getClass();
                        return basketballTopPlayersStatistics.getPlusMinus();
                    case 1:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem.getPlusMinus(), basketballTopPlayersStatisticsItem.getAppearances());
                    case 2:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics2 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics2.getClass();
                        return basketballTopPlayersStatistics2.getPir();
                    case 3:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem2 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem2.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem2.getPir(), basketballTopPlayersStatisticsItem2.getAppearances());
                    case 4:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics3 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics3.getClass();
                        return basketballTopPlayersStatistics3.getDoubleDoubles();
                    case 5:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem3 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem3.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem3.getDoubleDoubles());
                    case 6:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics4 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics4.getClass();
                        return basketballTopPlayersStatistics4.getTripleDoubles();
                    case 7:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem4 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem4.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem4.getFieldGoalsPercentage(), basketballTopPlayersStatisticsItem4.getFieldGoalsMade(), basketballTopPlayersStatisticsItem4.getAppearances());
                    case 8:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem5 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem5.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem5.getTripleDoubles());
                    case 9:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics5 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics5.getClass();
                        return basketballTopPlayersStatistics5.getTrueShootingPercentage();
                    case 10:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem6 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem6.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem6.getTrueShootingPercentage(), 0, 6);
                    case 11:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem7 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem7.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem7.getPoints(), basketballTopPlayersStatisticsItem7.getAppearances());
                    case 12:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics6 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics6.getClass();
                        return basketballTopPlayersStatistics6.getEffectiveFieldGoalPercentage();
                    case 13:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem8 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem8.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem8.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 14:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics7 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics7.getClass();
                        return basketballTopPlayersStatistics7.getUsage();
                    case 15:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem9 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem9.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem9.getUsage(), 0, 6);
                    case 16:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics8 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics8.getClass();
                        return basketballTopPlayersStatistics8.getIndividualOffensiveRating();
                    case 17:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem10 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem10.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem10.getIndividualOffensiveRating());
                    case 18:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics9 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics9.getClass();
                        return basketballTopPlayersStatistics9.getFreeThrowsPercentage();
                    case 19:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics10 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics10.getClass();
                        return basketballTopPlayersStatistics10.getIndividualDefensiveRating();
                    case 20:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem11 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem11.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem11.getIndividualDefensiveRating());
                    case 21:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics11 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics11.getClass();
                        return basketballTopPlayersStatistics11.getPlayerEfficiencyRating();
                    case 22:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem12 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem12.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem12.getPlayerEfficiencyRating());
                    case 23:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics12 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics12.getClass();
                        return basketballTopPlayersStatistics12.getRebounds();
                    case 24:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem13 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem13.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem13.getRebounds(), basketballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics13 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics13.getClass();
                        return basketballTopPlayersStatistics13.getAssists();
                    case 26:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem14 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem14.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem14.getAssists(), basketballTopPlayersStatisticsItem14.getAppearances());
                    case 27:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics14 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics14.getClass();
                        return basketballTopPlayersStatistics14.getSecondsPlayed();
                    case 28:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem15 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem15.getClass();
                        return rei.j(basketballTopPlayersStatisticsItem15.getSecondsPlayed(), basketballTopPlayersStatisticsItem15.getAppearances());
                    default:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem16 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem16.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem16.getFreeThrowsPercentage(), basketballTopPlayersStatisticsItem16.getFreeThrowsMade(), basketballTopPlayersStatisticsItem16.getAppearances());
                }
            }
        });
        final int i13 = 2;
        final int i14 = 3;
        nab nabVar17 = new nab("INDEX_RATING", 16, R.string.performance_index_rating_long, new Function1() { // from class: lab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i13) {
                    case 0:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics.getClass();
                        return basketballTopPlayersStatistics.getPlusMinus();
                    case 1:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem.getPlusMinus(), basketballTopPlayersStatisticsItem.getAppearances());
                    case 2:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics2 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics2.getClass();
                        return basketballTopPlayersStatistics2.getPir();
                    case 3:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem2 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem2.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem2.getPir(), basketballTopPlayersStatisticsItem2.getAppearances());
                    case 4:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics3 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics3.getClass();
                        return basketballTopPlayersStatistics3.getDoubleDoubles();
                    case 5:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem3 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem3.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem3.getDoubleDoubles());
                    case 6:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics4 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics4.getClass();
                        return basketballTopPlayersStatistics4.getTripleDoubles();
                    case 7:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem4 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem4.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem4.getFieldGoalsPercentage(), basketballTopPlayersStatisticsItem4.getFieldGoalsMade(), basketballTopPlayersStatisticsItem4.getAppearances());
                    case 8:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem5 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem5.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem5.getTripleDoubles());
                    case 9:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics5 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics5.getClass();
                        return basketballTopPlayersStatistics5.getTrueShootingPercentage();
                    case 10:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem6 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem6.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem6.getTrueShootingPercentage(), 0, 6);
                    case 11:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem7 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem7.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem7.getPoints(), basketballTopPlayersStatisticsItem7.getAppearances());
                    case 12:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics6 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics6.getClass();
                        return basketballTopPlayersStatistics6.getEffectiveFieldGoalPercentage();
                    case 13:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem8 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem8.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem8.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 14:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics7 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics7.getClass();
                        return basketballTopPlayersStatistics7.getUsage();
                    case 15:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem9 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem9.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem9.getUsage(), 0, 6);
                    case 16:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics8 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics8.getClass();
                        return basketballTopPlayersStatistics8.getIndividualOffensiveRating();
                    case 17:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem10 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem10.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem10.getIndividualOffensiveRating());
                    case 18:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics9 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics9.getClass();
                        return basketballTopPlayersStatistics9.getFreeThrowsPercentage();
                    case 19:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics10 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics10.getClass();
                        return basketballTopPlayersStatistics10.getIndividualDefensiveRating();
                    case 20:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem11 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem11.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem11.getIndividualDefensiveRating());
                    case 21:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics11 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics11.getClass();
                        return basketballTopPlayersStatistics11.getPlayerEfficiencyRating();
                    case 22:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem12 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem12.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem12.getPlayerEfficiencyRating());
                    case 23:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics12 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics12.getClass();
                        return basketballTopPlayersStatistics12.getRebounds();
                    case 24:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem13 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem13.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem13.getRebounds(), basketballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics13 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics13.getClass();
                        return basketballTopPlayersStatistics13.getAssists();
                    case 26:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem14 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem14.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem14.getAssists(), basketballTopPlayersStatisticsItem14.getAppearances());
                    case 27:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics14 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics14.getClass();
                        return basketballTopPlayersStatistics14.getSecondsPlayed();
                    case 28:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem15 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem15.getClass();
                        return rei.j(basketballTopPlayersStatisticsItem15.getSecondsPlayed(), basketballTopPlayersStatisticsItem15.getAppearances());
                    default:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem16 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem16.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem16.getFreeThrowsPercentage(), basketballTopPlayersStatisticsItem16.getFreeThrowsMade(), basketballTopPlayersStatisticsItem16.getAppearances());
                }
            }
        }, new Function1() { // from class: lab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics.getClass();
                        return basketballTopPlayersStatistics.getPlusMinus();
                    case 1:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem.getPlusMinus(), basketballTopPlayersStatisticsItem.getAppearances());
                    case 2:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics2 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics2.getClass();
                        return basketballTopPlayersStatistics2.getPir();
                    case 3:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem2 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem2.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem2.getPir(), basketballTopPlayersStatisticsItem2.getAppearances());
                    case 4:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics3 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics3.getClass();
                        return basketballTopPlayersStatistics3.getDoubleDoubles();
                    case 5:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem3 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem3.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem3.getDoubleDoubles());
                    case 6:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics4 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics4.getClass();
                        return basketballTopPlayersStatistics4.getTripleDoubles();
                    case 7:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem4 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem4.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem4.getFieldGoalsPercentage(), basketballTopPlayersStatisticsItem4.getFieldGoalsMade(), basketballTopPlayersStatisticsItem4.getAppearances());
                    case 8:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem5 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem5.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem5.getTripleDoubles());
                    case 9:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics5 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics5.getClass();
                        return basketballTopPlayersStatistics5.getTrueShootingPercentage();
                    case 10:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem6 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem6.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem6.getTrueShootingPercentage(), 0, 6);
                    case 11:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem7 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem7.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem7.getPoints(), basketballTopPlayersStatisticsItem7.getAppearances());
                    case 12:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics6 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics6.getClass();
                        return basketballTopPlayersStatistics6.getEffectiveFieldGoalPercentage();
                    case 13:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem8 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem8.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem8.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 14:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics7 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics7.getClass();
                        return basketballTopPlayersStatistics7.getUsage();
                    case 15:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem9 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem9.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem9.getUsage(), 0, 6);
                    case 16:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics8 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics8.getClass();
                        return basketballTopPlayersStatistics8.getIndividualOffensiveRating();
                    case 17:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem10 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem10.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem10.getIndividualOffensiveRating());
                    case 18:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics9 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics9.getClass();
                        return basketballTopPlayersStatistics9.getFreeThrowsPercentage();
                    case 19:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics10 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics10.getClass();
                        return basketballTopPlayersStatistics10.getIndividualDefensiveRating();
                    case 20:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem11 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem11.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem11.getIndividualDefensiveRating());
                    case 21:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics11 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics11.getClass();
                        return basketballTopPlayersStatistics11.getPlayerEfficiencyRating();
                    case 22:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem12 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem12.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem12.getPlayerEfficiencyRating());
                    case 23:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics12 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics12.getClass();
                        return basketballTopPlayersStatistics12.getRebounds();
                    case 24:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem13 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem13.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem13.getRebounds(), basketballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics13 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics13.getClass();
                        return basketballTopPlayersStatistics13.getAssists();
                    case 26:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem14 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem14.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem14.getAssists(), basketballTopPlayersStatisticsItem14.getAppearances());
                    case 27:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics14 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics14.getClass();
                        return basketballTopPlayersStatistics14.getSecondsPlayed();
                    case 28:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem15 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem15.getClass();
                        return rei.j(basketballTopPlayersStatisticsItem15.getSecondsPlayed(), basketballTopPlayersStatisticsItem15.getAppearances());
                    default:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem16 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem16.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem16.getFreeThrowsPercentage(), basketballTopPlayersStatisticsItem16.getFreeThrowsMade(), basketballTopPlayersStatisticsItem16.getAppearances());
                }
            }
        });
        final int i15 = 4;
        final int i16 = 5;
        nab nabVar18 = new nab("DOUBLE_DOUBLES", 17, R.string.basketball_double_double, new Function1() { // from class: lab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i15) {
                    case 0:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics.getClass();
                        return basketballTopPlayersStatistics.getPlusMinus();
                    case 1:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem.getPlusMinus(), basketballTopPlayersStatisticsItem.getAppearances());
                    case 2:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics2 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics2.getClass();
                        return basketballTopPlayersStatistics2.getPir();
                    case 3:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem2 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem2.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem2.getPir(), basketballTopPlayersStatisticsItem2.getAppearances());
                    case 4:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics3 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics3.getClass();
                        return basketballTopPlayersStatistics3.getDoubleDoubles();
                    case 5:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem3 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem3.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem3.getDoubleDoubles());
                    case 6:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics4 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics4.getClass();
                        return basketballTopPlayersStatistics4.getTripleDoubles();
                    case 7:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem4 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem4.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem4.getFieldGoalsPercentage(), basketballTopPlayersStatisticsItem4.getFieldGoalsMade(), basketballTopPlayersStatisticsItem4.getAppearances());
                    case 8:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem5 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem5.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem5.getTripleDoubles());
                    case 9:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics5 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics5.getClass();
                        return basketballTopPlayersStatistics5.getTrueShootingPercentage();
                    case 10:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem6 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem6.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem6.getTrueShootingPercentage(), 0, 6);
                    case 11:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem7 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem7.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem7.getPoints(), basketballTopPlayersStatisticsItem7.getAppearances());
                    case 12:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics6 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics6.getClass();
                        return basketballTopPlayersStatistics6.getEffectiveFieldGoalPercentage();
                    case 13:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem8 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem8.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem8.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 14:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics7 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics7.getClass();
                        return basketballTopPlayersStatistics7.getUsage();
                    case 15:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem9 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem9.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem9.getUsage(), 0, 6);
                    case 16:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics8 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics8.getClass();
                        return basketballTopPlayersStatistics8.getIndividualOffensiveRating();
                    case 17:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem10 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem10.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem10.getIndividualOffensiveRating());
                    case 18:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics9 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics9.getClass();
                        return basketballTopPlayersStatistics9.getFreeThrowsPercentage();
                    case 19:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics10 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics10.getClass();
                        return basketballTopPlayersStatistics10.getIndividualDefensiveRating();
                    case 20:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem11 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem11.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem11.getIndividualDefensiveRating());
                    case 21:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics11 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics11.getClass();
                        return basketballTopPlayersStatistics11.getPlayerEfficiencyRating();
                    case 22:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem12 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem12.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem12.getPlayerEfficiencyRating());
                    case 23:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics12 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics12.getClass();
                        return basketballTopPlayersStatistics12.getRebounds();
                    case 24:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem13 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem13.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem13.getRebounds(), basketballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics13 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics13.getClass();
                        return basketballTopPlayersStatistics13.getAssists();
                    case 26:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem14 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem14.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem14.getAssists(), basketballTopPlayersStatisticsItem14.getAppearances());
                    case 27:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics14 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics14.getClass();
                        return basketballTopPlayersStatistics14.getSecondsPlayed();
                    case 28:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem15 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem15.getClass();
                        return rei.j(basketballTopPlayersStatisticsItem15.getSecondsPlayed(), basketballTopPlayersStatisticsItem15.getAppearances());
                    default:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem16 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem16.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem16.getFreeThrowsPercentage(), basketballTopPlayersStatisticsItem16.getFreeThrowsMade(), basketballTopPlayersStatisticsItem16.getAppearances());
                }
            }
        }, new Function1() { // from class: lab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i16) {
                    case 0:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics.getClass();
                        return basketballTopPlayersStatistics.getPlusMinus();
                    case 1:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem.getPlusMinus(), basketballTopPlayersStatisticsItem.getAppearances());
                    case 2:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics2 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics2.getClass();
                        return basketballTopPlayersStatistics2.getPir();
                    case 3:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem2 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem2.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem2.getPir(), basketballTopPlayersStatisticsItem2.getAppearances());
                    case 4:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics3 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics3.getClass();
                        return basketballTopPlayersStatistics3.getDoubleDoubles();
                    case 5:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem3 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem3.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem3.getDoubleDoubles());
                    case 6:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics4 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics4.getClass();
                        return basketballTopPlayersStatistics4.getTripleDoubles();
                    case 7:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem4 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem4.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem4.getFieldGoalsPercentage(), basketballTopPlayersStatisticsItem4.getFieldGoalsMade(), basketballTopPlayersStatisticsItem4.getAppearances());
                    case 8:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem5 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem5.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem5.getTripleDoubles());
                    case 9:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics5 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics5.getClass();
                        return basketballTopPlayersStatistics5.getTrueShootingPercentage();
                    case 10:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem6 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem6.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem6.getTrueShootingPercentage(), 0, 6);
                    case 11:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem7 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem7.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem7.getPoints(), basketballTopPlayersStatisticsItem7.getAppearances());
                    case 12:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics6 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics6.getClass();
                        return basketballTopPlayersStatistics6.getEffectiveFieldGoalPercentage();
                    case 13:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem8 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem8.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem8.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 14:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics7 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics7.getClass();
                        return basketballTopPlayersStatistics7.getUsage();
                    case 15:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem9 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem9.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem9.getUsage(), 0, 6);
                    case 16:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics8 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics8.getClass();
                        return basketballTopPlayersStatistics8.getIndividualOffensiveRating();
                    case 17:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem10 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem10.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem10.getIndividualOffensiveRating());
                    case 18:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics9 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics9.getClass();
                        return basketballTopPlayersStatistics9.getFreeThrowsPercentage();
                    case 19:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics10 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics10.getClass();
                        return basketballTopPlayersStatistics10.getIndividualDefensiveRating();
                    case 20:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem11 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem11.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem11.getIndividualDefensiveRating());
                    case 21:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics11 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics11.getClass();
                        return basketballTopPlayersStatistics11.getPlayerEfficiencyRating();
                    case 22:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem12 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem12.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem12.getPlayerEfficiencyRating());
                    case 23:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics12 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics12.getClass();
                        return basketballTopPlayersStatistics12.getRebounds();
                    case 24:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem13 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem13.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem13.getRebounds(), basketballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics13 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics13.getClass();
                        return basketballTopPlayersStatistics13.getAssists();
                    case 26:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem14 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem14.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem14.getAssists(), basketballTopPlayersStatisticsItem14.getAppearances());
                    case 27:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics14 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics14.getClass();
                        return basketballTopPlayersStatistics14.getSecondsPlayed();
                    case 28:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem15 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem15.getClass();
                        return rei.j(basketballTopPlayersStatisticsItem15.getSecondsPlayed(), basketballTopPlayersStatisticsItem15.getAppearances());
                    default:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem16 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem16.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem16.getFreeThrowsPercentage(), basketballTopPlayersStatisticsItem16.getFreeThrowsMade(), basketballTopPlayersStatisticsItem16.getAppearances());
                }
            }
        });
        final int i17 = 6;
        final int i18 = 8;
        nab nabVar19 = new nab("TRIPLE_DOUBLES", 18, R.string.basketball_triple_double, new Function1() { // from class: lab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i17) {
                    case 0:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics.getClass();
                        return basketballTopPlayersStatistics.getPlusMinus();
                    case 1:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem.getPlusMinus(), basketballTopPlayersStatisticsItem.getAppearances());
                    case 2:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics2 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics2.getClass();
                        return basketballTopPlayersStatistics2.getPir();
                    case 3:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem2 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem2.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem2.getPir(), basketballTopPlayersStatisticsItem2.getAppearances());
                    case 4:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics3 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics3.getClass();
                        return basketballTopPlayersStatistics3.getDoubleDoubles();
                    case 5:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem3 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem3.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem3.getDoubleDoubles());
                    case 6:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics4 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics4.getClass();
                        return basketballTopPlayersStatistics4.getTripleDoubles();
                    case 7:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem4 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem4.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem4.getFieldGoalsPercentage(), basketballTopPlayersStatisticsItem4.getFieldGoalsMade(), basketballTopPlayersStatisticsItem4.getAppearances());
                    case 8:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem5 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem5.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem5.getTripleDoubles());
                    case 9:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics5 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics5.getClass();
                        return basketballTopPlayersStatistics5.getTrueShootingPercentage();
                    case 10:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem6 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem6.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem6.getTrueShootingPercentage(), 0, 6);
                    case 11:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem7 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem7.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem7.getPoints(), basketballTopPlayersStatisticsItem7.getAppearances());
                    case 12:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics6 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics6.getClass();
                        return basketballTopPlayersStatistics6.getEffectiveFieldGoalPercentage();
                    case 13:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem8 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem8.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem8.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 14:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics7 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics7.getClass();
                        return basketballTopPlayersStatistics7.getUsage();
                    case 15:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem9 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem9.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem9.getUsage(), 0, 6);
                    case 16:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics8 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics8.getClass();
                        return basketballTopPlayersStatistics8.getIndividualOffensiveRating();
                    case 17:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem10 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem10.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem10.getIndividualOffensiveRating());
                    case 18:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics9 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics9.getClass();
                        return basketballTopPlayersStatistics9.getFreeThrowsPercentage();
                    case 19:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics10 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics10.getClass();
                        return basketballTopPlayersStatistics10.getIndividualDefensiveRating();
                    case 20:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem11 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem11.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem11.getIndividualDefensiveRating());
                    case 21:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics11 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics11.getClass();
                        return basketballTopPlayersStatistics11.getPlayerEfficiencyRating();
                    case 22:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem12 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem12.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem12.getPlayerEfficiencyRating());
                    case 23:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics12 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics12.getClass();
                        return basketballTopPlayersStatistics12.getRebounds();
                    case 24:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem13 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem13.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem13.getRebounds(), basketballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics13 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics13.getClass();
                        return basketballTopPlayersStatistics13.getAssists();
                    case 26:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem14 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem14.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem14.getAssists(), basketballTopPlayersStatisticsItem14.getAppearances());
                    case 27:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics14 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics14.getClass();
                        return basketballTopPlayersStatistics14.getSecondsPlayed();
                    case 28:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem15 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem15.getClass();
                        return rei.j(basketballTopPlayersStatisticsItem15.getSecondsPlayed(), basketballTopPlayersStatisticsItem15.getAppearances());
                    default:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem16 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem16.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem16.getFreeThrowsPercentage(), basketballTopPlayersStatisticsItem16.getFreeThrowsMade(), basketballTopPlayersStatisticsItem16.getAppearances());
                }
            }
        }, new Function1() { // from class: lab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i18) {
                    case 0:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics.getClass();
                        return basketballTopPlayersStatistics.getPlusMinus();
                    case 1:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem.getPlusMinus(), basketballTopPlayersStatisticsItem.getAppearances());
                    case 2:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics2 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics2.getClass();
                        return basketballTopPlayersStatistics2.getPir();
                    case 3:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem2 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem2.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem2.getPir(), basketballTopPlayersStatisticsItem2.getAppearances());
                    case 4:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics3 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics3.getClass();
                        return basketballTopPlayersStatistics3.getDoubleDoubles();
                    case 5:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem3 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem3.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem3.getDoubleDoubles());
                    case 6:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics4 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics4.getClass();
                        return basketballTopPlayersStatistics4.getTripleDoubles();
                    case 7:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem4 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem4.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem4.getFieldGoalsPercentage(), basketballTopPlayersStatisticsItem4.getFieldGoalsMade(), basketballTopPlayersStatisticsItem4.getAppearances());
                    case 8:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem5 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem5.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem5.getTripleDoubles());
                    case 9:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics5 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics5.getClass();
                        return basketballTopPlayersStatistics5.getTrueShootingPercentage();
                    case 10:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem6 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem6.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem6.getTrueShootingPercentage(), 0, 6);
                    case 11:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem7 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem7.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem7.getPoints(), basketballTopPlayersStatisticsItem7.getAppearances());
                    case 12:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics6 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics6.getClass();
                        return basketballTopPlayersStatistics6.getEffectiveFieldGoalPercentage();
                    case 13:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem8 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem8.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem8.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 14:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics7 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics7.getClass();
                        return basketballTopPlayersStatistics7.getUsage();
                    case 15:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem9 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem9.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem9.getUsage(), 0, 6);
                    case 16:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics8 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics8.getClass();
                        return basketballTopPlayersStatistics8.getIndividualOffensiveRating();
                    case 17:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem10 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem10.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem10.getIndividualOffensiveRating());
                    case 18:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics9 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics9.getClass();
                        return basketballTopPlayersStatistics9.getFreeThrowsPercentage();
                    case 19:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics10 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics10.getClass();
                        return basketballTopPlayersStatistics10.getIndividualDefensiveRating();
                    case 20:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem11 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem11.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem11.getIndividualDefensiveRating());
                    case 21:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics11 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics11.getClass();
                        return basketballTopPlayersStatistics11.getPlayerEfficiencyRating();
                    case 22:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem12 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem12.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem12.getPlayerEfficiencyRating());
                    case 23:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics12 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics12.getClass();
                        return basketballTopPlayersStatistics12.getRebounds();
                    case 24:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem13 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem13.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem13.getRebounds(), basketballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics13 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics13.getClass();
                        return basketballTopPlayersStatistics13.getAssists();
                    case 26:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem14 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem14.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem14.getAssists(), basketballTopPlayersStatisticsItem14.getAppearances());
                    case 27:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics14 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics14.getClass();
                        return basketballTopPlayersStatistics14.getSecondsPlayed();
                    case 28:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem15 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem15.getClass();
                        return rei.j(basketballTopPlayersStatisticsItem15.getSecondsPlayed(), basketballTopPlayersStatisticsItem15.getAppearances());
                    default:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem16 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem16.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem16.getFreeThrowsPercentage(), basketballTopPlayersStatisticsItem16.getFreeThrowsMade(), basketballTopPlayersStatisticsItem16.getAppearances());
                }
            }
        });
        final int i19 = 9;
        final int i20 = 10;
        nab nabVar20 = new nab("TRUE_SHOOTING_PCT", 19, R.string.basketball_true_shooting_percentage, new Function1() { // from class: lab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i19) {
                    case 0:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics.getClass();
                        return basketballTopPlayersStatistics.getPlusMinus();
                    case 1:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem.getPlusMinus(), basketballTopPlayersStatisticsItem.getAppearances());
                    case 2:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics2 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics2.getClass();
                        return basketballTopPlayersStatistics2.getPir();
                    case 3:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem2 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem2.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem2.getPir(), basketballTopPlayersStatisticsItem2.getAppearances());
                    case 4:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics3 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics3.getClass();
                        return basketballTopPlayersStatistics3.getDoubleDoubles();
                    case 5:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem3 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem3.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem3.getDoubleDoubles());
                    case 6:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics4 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics4.getClass();
                        return basketballTopPlayersStatistics4.getTripleDoubles();
                    case 7:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem4 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem4.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem4.getFieldGoalsPercentage(), basketballTopPlayersStatisticsItem4.getFieldGoalsMade(), basketballTopPlayersStatisticsItem4.getAppearances());
                    case 8:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem5 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem5.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem5.getTripleDoubles());
                    case 9:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics5 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics5.getClass();
                        return basketballTopPlayersStatistics5.getTrueShootingPercentage();
                    case 10:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem6 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem6.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem6.getTrueShootingPercentage(), 0, 6);
                    case 11:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem7 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem7.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem7.getPoints(), basketballTopPlayersStatisticsItem7.getAppearances());
                    case 12:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics6 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics6.getClass();
                        return basketballTopPlayersStatistics6.getEffectiveFieldGoalPercentage();
                    case 13:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem8 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem8.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem8.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 14:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics7 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics7.getClass();
                        return basketballTopPlayersStatistics7.getUsage();
                    case 15:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem9 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem9.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem9.getUsage(), 0, 6);
                    case 16:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics8 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics8.getClass();
                        return basketballTopPlayersStatistics8.getIndividualOffensiveRating();
                    case 17:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem10 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem10.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem10.getIndividualOffensiveRating());
                    case 18:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics9 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics9.getClass();
                        return basketballTopPlayersStatistics9.getFreeThrowsPercentage();
                    case 19:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics10 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics10.getClass();
                        return basketballTopPlayersStatistics10.getIndividualDefensiveRating();
                    case 20:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem11 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem11.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem11.getIndividualDefensiveRating());
                    case 21:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics11 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics11.getClass();
                        return basketballTopPlayersStatistics11.getPlayerEfficiencyRating();
                    case 22:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem12 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem12.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem12.getPlayerEfficiencyRating());
                    case 23:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics12 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics12.getClass();
                        return basketballTopPlayersStatistics12.getRebounds();
                    case 24:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem13 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem13.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem13.getRebounds(), basketballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics13 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics13.getClass();
                        return basketballTopPlayersStatistics13.getAssists();
                    case 26:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem14 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem14.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem14.getAssists(), basketballTopPlayersStatisticsItem14.getAppearances());
                    case 27:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics14 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics14.getClass();
                        return basketballTopPlayersStatistics14.getSecondsPlayed();
                    case 28:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem15 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem15.getClass();
                        return rei.j(basketballTopPlayersStatisticsItem15.getSecondsPlayed(), basketballTopPlayersStatisticsItem15.getAppearances());
                    default:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem16 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem16.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem16.getFreeThrowsPercentage(), basketballTopPlayersStatisticsItem16.getFreeThrowsMade(), basketballTopPlayersStatisticsItem16.getAppearances());
                }
            }
        }, new Function1() { // from class: lab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i20) {
                    case 0:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics.getClass();
                        return basketballTopPlayersStatistics.getPlusMinus();
                    case 1:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem.getPlusMinus(), basketballTopPlayersStatisticsItem.getAppearances());
                    case 2:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics2 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics2.getClass();
                        return basketballTopPlayersStatistics2.getPir();
                    case 3:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem2 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem2.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem2.getPir(), basketballTopPlayersStatisticsItem2.getAppearances());
                    case 4:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics3 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics3.getClass();
                        return basketballTopPlayersStatistics3.getDoubleDoubles();
                    case 5:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem3 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem3.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem3.getDoubleDoubles());
                    case 6:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics4 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics4.getClass();
                        return basketballTopPlayersStatistics4.getTripleDoubles();
                    case 7:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem4 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem4.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem4.getFieldGoalsPercentage(), basketballTopPlayersStatisticsItem4.getFieldGoalsMade(), basketballTopPlayersStatisticsItem4.getAppearances());
                    case 8:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem5 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem5.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem5.getTripleDoubles());
                    case 9:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics5 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics5.getClass();
                        return basketballTopPlayersStatistics5.getTrueShootingPercentage();
                    case 10:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem6 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem6.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem6.getTrueShootingPercentage(), 0, 6);
                    case 11:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem7 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem7.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem7.getPoints(), basketballTopPlayersStatisticsItem7.getAppearances());
                    case 12:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics6 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics6.getClass();
                        return basketballTopPlayersStatistics6.getEffectiveFieldGoalPercentage();
                    case 13:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem8 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem8.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem8.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 14:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics7 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics7.getClass();
                        return basketballTopPlayersStatistics7.getUsage();
                    case 15:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem9 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem9.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem9.getUsage(), 0, 6);
                    case 16:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics8 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics8.getClass();
                        return basketballTopPlayersStatistics8.getIndividualOffensiveRating();
                    case 17:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem10 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem10.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem10.getIndividualOffensiveRating());
                    case 18:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics9 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics9.getClass();
                        return basketballTopPlayersStatistics9.getFreeThrowsPercentage();
                    case 19:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics10 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics10.getClass();
                        return basketballTopPlayersStatistics10.getIndividualDefensiveRating();
                    case 20:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem11 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem11.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem11.getIndividualDefensiveRating());
                    case 21:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics11 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics11.getClass();
                        return basketballTopPlayersStatistics11.getPlayerEfficiencyRating();
                    case 22:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem12 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem12.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem12.getPlayerEfficiencyRating());
                    case 23:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics12 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics12.getClass();
                        return basketballTopPlayersStatistics12.getRebounds();
                    case 24:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem13 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem13.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem13.getRebounds(), basketballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics13 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics13.getClass();
                        return basketballTopPlayersStatistics13.getAssists();
                    case 26:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem14 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem14.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem14.getAssists(), basketballTopPlayersStatisticsItem14.getAppearances());
                    case 27:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics14 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics14.getClass();
                        return basketballTopPlayersStatistics14.getSecondsPlayed();
                    case 28:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem15 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem15.getClass();
                        return rei.j(basketballTopPlayersStatisticsItem15.getSecondsPlayed(), basketballTopPlayersStatisticsItem15.getAppearances());
                    default:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem16 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem16.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem16.getFreeThrowsPercentage(), basketballTopPlayersStatisticsItem16.getFreeThrowsMade(), basketballTopPlayersStatisticsItem16.getAppearances());
                }
            }
        });
        final int i21 = 12;
        final int i22 = 13;
        nab nabVar21 = new nab("EFF_FG_PCT", 20, R.string.basketball_effective_field_goal_percentage, new Function1() { // from class: lab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i21) {
                    case 0:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics.getClass();
                        return basketballTopPlayersStatistics.getPlusMinus();
                    case 1:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem.getPlusMinus(), basketballTopPlayersStatisticsItem.getAppearances());
                    case 2:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics2 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics2.getClass();
                        return basketballTopPlayersStatistics2.getPir();
                    case 3:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem2 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem2.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem2.getPir(), basketballTopPlayersStatisticsItem2.getAppearances());
                    case 4:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics3 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics3.getClass();
                        return basketballTopPlayersStatistics3.getDoubleDoubles();
                    case 5:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem3 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem3.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem3.getDoubleDoubles());
                    case 6:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics4 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics4.getClass();
                        return basketballTopPlayersStatistics4.getTripleDoubles();
                    case 7:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem4 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem4.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem4.getFieldGoalsPercentage(), basketballTopPlayersStatisticsItem4.getFieldGoalsMade(), basketballTopPlayersStatisticsItem4.getAppearances());
                    case 8:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem5 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem5.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem5.getTripleDoubles());
                    case 9:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics5 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics5.getClass();
                        return basketballTopPlayersStatistics5.getTrueShootingPercentage();
                    case 10:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem6 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem6.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem6.getTrueShootingPercentage(), 0, 6);
                    case 11:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem7 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem7.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem7.getPoints(), basketballTopPlayersStatisticsItem7.getAppearances());
                    case 12:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics6 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics6.getClass();
                        return basketballTopPlayersStatistics6.getEffectiveFieldGoalPercentage();
                    case 13:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem8 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem8.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem8.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 14:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics7 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics7.getClass();
                        return basketballTopPlayersStatistics7.getUsage();
                    case 15:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem9 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem9.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem9.getUsage(), 0, 6);
                    case 16:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics8 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics8.getClass();
                        return basketballTopPlayersStatistics8.getIndividualOffensiveRating();
                    case 17:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem10 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem10.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem10.getIndividualOffensiveRating());
                    case 18:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics9 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics9.getClass();
                        return basketballTopPlayersStatistics9.getFreeThrowsPercentage();
                    case 19:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics10 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics10.getClass();
                        return basketballTopPlayersStatistics10.getIndividualDefensiveRating();
                    case 20:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem11 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem11.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem11.getIndividualDefensiveRating());
                    case 21:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics11 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics11.getClass();
                        return basketballTopPlayersStatistics11.getPlayerEfficiencyRating();
                    case 22:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem12 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem12.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem12.getPlayerEfficiencyRating());
                    case 23:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics12 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics12.getClass();
                        return basketballTopPlayersStatistics12.getRebounds();
                    case 24:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem13 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem13.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem13.getRebounds(), basketballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics13 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics13.getClass();
                        return basketballTopPlayersStatistics13.getAssists();
                    case 26:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem14 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem14.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem14.getAssists(), basketballTopPlayersStatisticsItem14.getAppearances());
                    case 27:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics14 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics14.getClass();
                        return basketballTopPlayersStatistics14.getSecondsPlayed();
                    case 28:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem15 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem15.getClass();
                        return rei.j(basketballTopPlayersStatisticsItem15.getSecondsPlayed(), basketballTopPlayersStatisticsItem15.getAppearances());
                    default:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem16 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem16.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem16.getFreeThrowsPercentage(), basketballTopPlayersStatisticsItem16.getFreeThrowsMade(), basketballTopPlayersStatisticsItem16.getAppearances());
                }
            }
        }, new Function1() { // from class: lab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i22) {
                    case 0:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics.getClass();
                        return basketballTopPlayersStatistics.getPlusMinus();
                    case 1:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem.getPlusMinus(), basketballTopPlayersStatisticsItem.getAppearances());
                    case 2:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics2 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics2.getClass();
                        return basketballTopPlayersStatistics2.getPir();
                    case 3:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem2 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem2.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem2.getPir(), basketballTopPlayersStatisticsItem2.getAppearances());
                    case 4:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics3 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics3.getClass();
                        return basketballTopPlayersStatistics3.getDoubleDoubles();
                    case 5:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem3 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem3.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem3.getDoubleDoubles());
                    case 6:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics4 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics4.getClass();
                        return basketballTopPlayersStatistics4.getTripleDoubles();
                    case 7:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem4 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem4.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem4.getFieldGoalsPercentage(), basketballTopPlayersStatisticsItem4.getFieldGoalsMade(), basketballTopPlayersStatisticsItem4.getAppearances());
                    case 8:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem5 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem5.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem5.getTripleDoubles());
                    case 9:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics5 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics5.getClass();
                        return basketballTopPlayersStatistics5.getTrueShootingPercentage();
                    case 10:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem6 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem6.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem6.getTrueShootingPercentage(), 0, 6);
                    case 11:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem7 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem7.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem7.getPoints(), basketballTopPlayersStatisticsItem7.getAppearances());
                    case 12:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics6 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics6.getClass();
                        return basketballTopPlayersStatistics6.getEffectiveFieldGoalPercentage();
                    case 13:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem8 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem8.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem8.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 14:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics7 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics7.getClass();
                        return basketballTopPlayersStatistics7.getUsage();
                    case 15:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem9 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem9.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem9.getUsage(), 0, 6);
                    case 16:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics8 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics8.getClass();
                        return basketballTopPlayersStatistics8.getIndividualOffensiveRating();
                    case 17:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem10 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem10.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem10.getIndividualOffensiveRating());
                    case 18:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics9 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics9.getClass();
                        return basketballTopPlayersStatistics9.getFreeThrowsPercentage();
                    case 19:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics10 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics10.getClass();
                        return basketballTopPlayersStatistics10.getIndividualDefensiveRating();
                    case 20:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem11 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem11.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem11.getIndividualDefensiveRating());
                    case 21:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics11 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics11.getClass();
                        return basketballTopPlayersStatistics11.getPlayerEfficiencyRating();
                    case 22:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem12 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem12.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem12.getPlayerEfficiencyRating());
                    case 23:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics12 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics12.getClass();
                        return basketballTopPlayersStatistics12.getRebounds();
                    case 24:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem13 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem13.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem13.getRebounds(), basketballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics13 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics13.getClass();
                        return basketballTopPlayersStatistics13.getAssists();
                    case 26:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem14 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem14.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem14.getAssists(), basketballTopPlayersStatisticsItem14.getAppearances());
                    case 27:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics14 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics14.getClass();
                        return basketballTopPlayersStatistics14.getSecondsPlayed();
                    case 28:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem15 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem15.getClass();
                        return rei.j(basketballTopPlayersStatisticsItem15.getSecondsPlayed(), basketballTopPlayersStatisticsItem15.getAppearances());
                    default:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem16 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem16.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem16.getFreeThrowsPercentage(), basketballTopPlayersStatisticsItem16.getFreeThrowsMade(), basketballTopPlayersStatisticsItem16.getAppearances());
                }
            }
        });
        final int i23 = 14;
        final int i24 = 15;
        nab nabVar22 = new nab("USAGE", 21, R.string.basketball_usage_percentage, new Function1() { // from class: lab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i23) {
                    case 0:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics.getClass();
                        return basketballTopPlayersStatistics.getPlusMinus();
                    case 1:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem.getPlusMinus(), basketballTopPlayersStatisticsItem.getAppearances());
                    case 2:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics2 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics2.getClass();
                        return basketballTopPlayersStatistics2.getPir();
                    case 3:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem2 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem2.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem2.getPir(), basketballTopPlayersStatisticsItem2.getAppearances());
                    case 4:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics3 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics3.getClass();
                        return basketballTopPlayersStatistics3.getDoubleDoubles();
                    case 5:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem3 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem3.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem3.getDoubleDoubles());
                    case 6:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics4 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics4.getClass();
                        return basketballTopPlayersStatistics4.getTripleDoubles();
                    case 7:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem4 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem4.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem4.getFieldGoalsPercentage(), basketballTopPlayersStatisticsItem4.getFieldGoalsMade(), basketballTopPlayersStatisticsItem4.getAppearances());
                    case 8:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem5 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem5.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem5.getTripleDoubles());
                    case 9:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics5 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics5.getClass();
                        return basketballTopPlayersStatistics5.getTrueShootingPercentage();
                    case 10:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem6 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem6.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem6.getTrueShootingPercentage(), 0, 6);
                    case 11:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem7 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem7.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem7.getPoints(), basketballTopPlayersStatisticsItem7.getAppearances());
                    case 12:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics6 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics6.getClass();
                        return basketballTopPlayersStatistics6.getEffectiveFieldGoalPercentage();
                    case 13:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem8 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem8.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem8.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 14:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics7 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics7.getClass();
                        return basketballTopPlayersStatistics7.getUsage();
                    case 15:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem9 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem9.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem9.getUsage(), 0, 6);
                    case 16:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics8 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics8.getClass();
                        return basketballTopPlayersStatistics8.getIndividualOffensiveRating();
                    case 17:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem10 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem10.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem10.getIndividualOffensiveRating());
                    case 18:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics9 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics9.getClass();
                        return basketballTopPlayersStatistics9.getFreeThrowsPercentage();
                    case 19:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics10 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics10.getClass();
                        return basketballTopPlayersStatistics10.getIndividualDefensiveRating();
                    case 20:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem11 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem11.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem11.getIndividualDefensiveRating());
                    case 21:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics11 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics11.getClass();
                        return basketballTopPlayersStatistics11.getPlayerEfficiencyRating();
                    case 22:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem12 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem12.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem12.getPlayerEfficiencyRating());
                    case 23:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics12 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics12.getClass();
                        return basketballTopPlayersStatistics12.getRebounds();
                    case 24:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem13 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem13.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem13.getRebounds(), basketballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics13 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics13.getClass();
                        return basketballTopPlayersStatistics13.getAssists();
                    case 26:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem14 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem14.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem14.getAssists(), basketballTopPlayersStatisticsItem14.getAppearances());
                    case 27:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics14 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics14.getClass();
                        return basketballTopPlayersStatistics14.getSecondsPlayed();
                    case 28:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem15 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem15.getClass();
                        return rei.j(basketballTopPlayersStatisticsItem15.getSecondsPlayed(), basketballTopPlayersStatisticsItem15.getAppearances());
                    default:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem16 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem16.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem16.getFreeThrowsPercentage(), basketballTopPlayersStatisticsItem16.getFreeThrowsMade(), basketballTopPlayersStatisticsItem16.getAppearances());
                }
            }
        }, new Function1() { // from class: lab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i24) {
                    case 0:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics.getClass();
                        return basketballTopPlayersStatistics.getPlusMinus();
                    case 1:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem.getPlusMinus(), basketballTopPlayersStatisticsItem.getAppearances());
                    case 2:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics2 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics2.getClass();
                        return basketballTopPlayersStatistics2.getPir();
                    case 3:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem2 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem2.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem2.getPir(), basketballTopPlayersStatisticsItem2.getAppearances());
                    case 4:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics3 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics3.getClass();
                        return basketballTopPlayersStatistics3.getDoubleDoubles();
                    case 5:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem3 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem3.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem3.getDoubleDoubles());
                    case 6:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics4 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics4.getClass();
                        return basketballTopPlayersStatistics4.getTripleDoubles();
                    case 7:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem4 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem4.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem4.getFieldGoalsPercentage(), basketballTopPlayersStatisticsItem4.getFieldGoalsMade(), basketballTopPlayersStatisticsItem4.getAppearances());
                    case 8:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem5 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem5.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem5.getTripleDoubles());
                    case 9:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics5 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics5.getClass();
                        return basketballTopPlayersStatistics5.getTrueShootingPercentage();
                    case 10:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem6 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem6.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem6.getTrueShootingPercentage(), 0, 6);
                    case 11:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem7 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem7.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem7.getPoints(), basketballTopPlayersStatisticsItem7.getAppearances());
                    case 12:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics6 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics6.getClass();
                        return basketballTopPlayersStatistics6.getEffectiveFieldGoalPercentage();
                    case 13:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem8 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem8.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem8.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 14:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics7 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics7.getClass();
                        return basketballTopPlayersStatistics7.getUsage();
                    case 15:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem9 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem9.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem9.getUsage(), 0, 6);
                    case 16:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics8 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics8.getClass();
                        return basketballTopPlayersStatistics8.getIndividualOffensiveRating();
                    case 17:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem10 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem10.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem10.getIndividualOffensiveRating());
                    case 18:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics9 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics9.getClass();
                        return basketballTopPlayersStatistics9.getFreeThrowsPercentage();
                    case 19:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics10 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics10.getClass();
                        return basketballTopPlayersStatistics10.getIndividualDefensiveRating();
                    case 20:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem11 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem11.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem11.getIndividualDefensiveRating());
                    case 21:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics11 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics11.getClass();
                        return basketballTopPlayersStatistics11.getPlayerEfficiencyRating();
                    case 22:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem12 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem12.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem12.getPlayerEfficiencyRating());
                    case 23:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics12 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics12.getClass();
                        return basketballTopPlayersStatistics12.getRebounds();
                    case 24:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem13 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem13.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem13.getRebounds(), basketballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics13 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics13.getClass();
                        return basketballTopPlayersStatistics13.getAssists();
                    case 26:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem14 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem14.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem14.getAssists(), basketballTopPlayersStatisticsItem14.getAppearances());
                    case 27:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics14 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics14.getClass();
                        return basketballTopPlayersStatistics14.getSecondsPlayed();
                    case 28:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem15 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem15.getClass();
                        return rei.j(basketballTopPlayersStatisticsItem15.getSecondsPlayed(), basketballTopPlayersStatisticsItem15.getAppearances());
                    default:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem16 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem16.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem16.getFreeThrowsPercentage(), basketballTopPlayersStatisticsItem16.getFreeThrowsMade(), basketballTopPlayersStatisticsItem16.getAppearances());
                }
            }
        });
        final int i25 = 16;
        final int i26 = 17;
        nab nabVar23 = new nab("OFF_RATING", 22, R.string.basketball_offensive_rating, new Function1() { // from class: lab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i25) {
                    case 0:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics.getClass();
                        return basketballTopPlayersStatistics.getPlusMinus();
                    case 1:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem.getPlusMinus(), basketballTopPlayersStatisticsItem.getAppearances());
                    case 2:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics2 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics2.getClass();
                        return basketballTopPlayersStatistics2.getPir();
                    case 3:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem2 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem2.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem2.getPir(), basketballTopPlayersStatisticsItem2.getAppearances());
                    case 4:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics3 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics3.getClass();
                        return basketballTopPlayersStatistics3.getDoubleDoubles();
                    case 5:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem3 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem3.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem3.getDoubleDoubles());
                    case 6:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics4 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics4.getClass();
                        return basketballTopPlayersStatistics4.getTripleDoubles();
                    case 7:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem4 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem4.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem4.getFieldGoalsPercentage(), basketballTopPlayersStatisticsItem4.getFieldGoalsMade(), basketballTopPlayersStatisticsItem4.getAppearances());
                    case 8:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem5 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem5.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem5.getTripleDoubles());
                    case 9:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics5 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics5.getClass();
                        return basketballTopPlayersStatistics5.getTrueShootingPercentage();
                    case 10:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem6 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem6.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem6.getTrueShootingPercentage(), 0, 6);
                    case 11:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem7 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem7.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem7.getPoints(), basketballTopPlayersStatisticsItem7.getAppearances());
                    case 12:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics6 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics6.getClass();
                        return basketballTopPlayersStatistics6.getEffectiveFieldGoalPercentage();
                    case 13:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem8 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem8.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem8.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 14:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics7 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics7.getClass();
                        return basketballTopPlayersStatistics7.getUsage();
                    case 15:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem9 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem9.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem9.getUsage(), 0, 6);
                    case 16:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics8 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics8.getClass();
                        return basketballTopPlayersStatistics8.getIndividualOffensiveRating();
                    case 17:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem10 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem10.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem10.getIndividualOffensiveRating());
                    case 18:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics9 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics9.getClass();
                        return basketballTopPlayersStatistics9.getFreeThrowsPercentage();
                    case 19:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics10 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics10.getClass();
                        return basketballTopPlayersStatistics10.getIndividualDefensiveRating();
                    case 20:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem11 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem11.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem11.getIndividualDefensiveRating());
                    case 21:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics11 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics11.getClass();
                        return basketballTopPlayersStatistics11.getPlayerEfficiencyRating();
                    case 22:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem12 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem12.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem12.getPlayerEfficiencyRating());
                    case 23:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics12 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics12.getClass();
                        return basketballTopPlayersStatistics12.getRebounds();
                    case 24:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem13 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem13.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem13.getRebounds(), basketballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics13 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics13.getClass();
                        return basketballTopPlayersStatistics13.getAssists();
                    case 26:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem14 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem14.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem14.getAssists(), basketballTopPlayersStatisticsItem14.getAppearances());
                    case 27:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics14 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics14.getClass();
                        return basketballTopPlayersStatistics14.getSecondsPlayed();
                    case 28:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem15 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem15.getClass();
                        return rei.j(basketballTopPlayersStatisticsItem15.getSecondsPlayed(), basketballTopPlayersStatisticsItem15.getAppearances());
                    default:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem16 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem16.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem16.getFreeThrowsPercentage(), basketballTopPlayersStatisticsItem16.getFreeThrowsMade(), basketballTopPlayersStatisticsItem16.getAppearances());
                }
            }
        }, new Function1() { // from class: lab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i26) {
                    case 0:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics.getClass();
                        return basketballTopPlayersStatistics.getPlusMinus();
                    case 1:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem.getPlusMinus(), basketballTopPlayersStatisticsItem.getAppearances());
                    case 2:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics2 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics2.getClass();
                        return basketballTopPlayersStatistics2.getPir();
                    case 3:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem2 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem2.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem2.getPir(), basketballTopPlayersStatisticsItem2.getAppearances());
                    case 4:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics3 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics3.getClass();
                        return basketballTopPlayersStatistics3.getDoubleDoubles();
                    case 5:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem3 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem3.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem3.getDoubleDoubles());
                    case 6:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics4 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics4.getClass();
                        return basketballTopPlayersStatistics4.getTripleDoubles();
                    case 7:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem4 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem4.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem4.getFieldGoalsPercentage(), basketballTopPlayersStatisticsItem4.getFieldGoalsMade(), basketballTopPlayersStatisticsItem4.getAppearances());
                    case 8:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem5 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem5.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem5.getTripleDoubles());
                    case 9:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics5 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics5.getClass();
                        return basketballTopPlayersStatistics5.getTrueShootingPercentage();
                    case 10:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem6 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem6.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem6.getTrueShootingPercentage(), 0, 6);
                    case 11:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem7 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem7.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem7.getPoints(), basketballTopPlayersStatisticsItem7.getAppearances());
                    case 12:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics6 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics6.getClass();
                        return basketballTopPlayersStatistics6.getEffectiveFieldGoalPercentage();
                    case 13:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem8 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem8.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem8.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 14:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics7 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics7.getClass();
                        return basketballTopPlayersStatistics7.getUsage();
                    case 15:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem9 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem9.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem9.getUsage(), 0, 6);
                    case 16:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics8 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics8.getClass();
                        return basketballTopPlayersStatistics8.getIndividualOffensiveRating();
                    case 17:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem10 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem10.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem10.getIndividualOffensiveRating());
                    case 18:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics9 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics9.getClass();
                        return basketballTopPlayersStatistics9.getFreeThrowsPercentage();
                    case 19:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics10 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics10.getClass();
                        return basketballTopPlayersStatistics10.getIndividualDefensiveRating();
                    case 20:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem11 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem11.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem11.getIndividualDefensiveRating());
                    case 21:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics11 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics11.getClass();
                        return basketballTopPlayersStatistics11.getPlayerEfficiencyRating();
                    case 22:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem12 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem12.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem12.getPlayerEfficiencyRating());
                    case 23:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics12 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics12.getClass();
                        return basketballTopPlayersStatistics12.getRebounds();
                    case 24:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem13 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem13.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem13.getRebounds(), basketballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics13 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics13.getClass();
                        return basketballTopPlayersStatistics13.getAssists();
                    case 26:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem14 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem14.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem14.getAssists(), basketballTopPlayersStatisticsItem14.getAppearances());
                    case 27:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics14 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics14.getClass();
                        return basketballTopPlayersStatistics14.getSecondsPlayed();
                    case 28:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem15 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem15.getClass();
                        return rei.j(basketballTopPlayersStatisticsItem15.getSecondsPlayed(), basketballTopPlayersStatisticsItem15.getAppearances());
                    default:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem16 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem16.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem16.getFreeThrowsPercentage(), basketballTopPlayersStatisticsItem16.getFreeThrowsMade(), basketballTopPlayersStatisticsItem16.getAppearances());
                }
            }
        });
        final int i27 = 19;
        final int i28 = 20;
        nab nabVar24 = new nab("DEF_RATING", 23, R.string.basketball_defensive_rating, new Function1() { // from class: lab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i27) {
                    case 0:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics.getClass();
                        return basketballTopPlayersStatistics.getPlusMinus();
                    case 1:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem.getPlusMinus(), basketballTopPlayersStatisticsItem.getAppearances());
                    case 2:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics2 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics2.getClass();
                        return basketballTopPlayersStatistics2.getPir();
                    case 3:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem2 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem2.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem2.getPir(), basketballTopPlayersStatisticsItem2.getAppearances());
                    case 4:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics3 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics3.getClass();
                        return basketballTopPlayersStatistics3.getDoubleDoubles();
                    case 5:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem3 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem3.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem3.getDoubleDoubles());
                    case 6:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics4 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics4.getClass();
                        return basketballTopPlayersStatistics4.getTripleDoubles();
                    case 7:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem4 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem4.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem4.getFieldGoalsPercentage(), basketballTopPlayersStatisticsItem4.getFieldGoalsMade(), basketballTopPlayersStatisticsItem4.getAppearances());
                    case 8:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem5 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem5.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem5.getTripleDoubles());
                    case 9:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics5 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics5.getClass();
                        return basketballTopPlayersStatistics5.getTrueShootingPercentage();
                    case 10:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem6 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem6.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem6.getTrueShootingPercentage(), 0, 6);
                    case 11:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem7 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem7.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem7.getPoints(), basketballTopPlayersStatisticsItem7.getAppearances());
                    case 12:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics6 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics6.getClass();
                        return basketballTopPlayersStatistics6.getEffectiveFieldGoalPercentage();
                    case 13:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem8 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem8.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem8.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 14:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics7 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics7.getClass();
                        return basketballTopPlayersStatistics7.getUsage();
                    case 15:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem9 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem9.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem9.getUsage(), 0, 6);
                    case 16:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics8 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics8.getClass();
                        return basketballTopPlayersStatistics8.getIndividualOffensiveRating();
                    case 17:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem10 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem10.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem10.getIndividualOffensiveRating());
                    case 18:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics9 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics9.getClass();
                        return basketballTopPlayersStatistics9.getFreeThrowsPercentage();
                    case 19:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics10 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics10.getClass();
                        return basketballTopPlayersStatistics10.getIndividualDefensiveRating();
                    case 20:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem11 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem11.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem11.getIndividualDefensiveRating());
                    case 21:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics11 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics11.getClass();
                        return basketballTopPlayersStatistics11.getPlayerEfficiencyRating();
                    case 22:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem12 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem12.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem12.getPlayerEfficiencyRating());
                    case 23:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics12 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics12.getClass();
                        return basketballTopPlayersStatistics12.getRebounds();
                    case 24:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem13 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem13.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem13.getRebounds(), basketballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics13 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics13.getClass();
                        return basketballTopPlayersStatistics13.getAssists();
                    case 26:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem14 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem14.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem14.getAssists(), basketballTopPlayersStatisticsItem14.getAppearances());
                    case 27:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics14 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics14.getClass();
                        return basketballTopPlayersStatistics14.getSecondsPlayed();
                    case 28:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem15 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem15.getClass();
                        return rei.j(basketballTopPlayersStatisticsItem15.getSecondsPlayed(), basketballTopPlayersStatisticsItem15.getAppearances());
                    default:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem16 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem16.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem16.getFreeThrowsPercentage(), basketballTopPlayersStatisticsItem16.getFreeThrowsMade(), basketballTopPlayersStatisticsItem16.getAppearances());
                }
            }
        }, new Function1() { // from class: lab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i28) {
                    case 0:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics.getClass();
                        return basketballTopPlayersStatistics.getPlusMinus();
                    case 1:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem.getPlusMinus(), basketballTopPlayersStatisticsItem.getAppearances());
                    case 2:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics2 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics2.getClass();
                        return basketballTopPlayersStatistics2.getPir();
                    case 3:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem2 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem2.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem2.getPir(), basketballTopPlayersStatisticsItem2.getAppearances());
                    case 4:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics3 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics3.getClass();
                        return basketballTopPlayersStatistics3.getDoubleDoubles();
                    case 5:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem3 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem3.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem3.getDoubleDoubles());
                    case 6:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics4 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics4.getClass();
                        return basketballTopPlayersStatistics4.getTripleDoubles();
                    case 7:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem4 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem4.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem4.getFieldGoalsPercentage(), basketballTopPlayersStatisticsItem4.getFieldGoalsMade(), basketballTopPlayersStatisticsItem4.getAppearances());
                    case 8:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem5 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem5.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem5.getTripleDoubles());
                    case 9:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics5 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics5.getClass();
                        return basketballTopPlayersStatistics5.getTrueShootingPercentage();
                    case 10:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem6 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem6.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem6.getTrueShootingPercentage(), 0, 6);
                    case 11:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem7 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem7.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem7.getPoints(), basketballTopPlayersStatisticsItem7.getAppearances());
                    case 12:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics6 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics6.getClass();
                        return basketballTopPlayersStatistics6.getEffectiveFieldGoalPercentage();
                    case 13:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem8 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem8.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem8.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 14:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics7 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics7.getClass();
                        return basketballTopPlayersStatistics7.getUsage();
                    case 15:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem9 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem9.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem9.getUsage(), 0, 6);
                    case 16:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics8 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics8.getClass();
                        return basketballTopPlayersStatistics8.getIndividualOffensiveRating();
                    case 17:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem10 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem10.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem10.getIndividualOffensiveRating());
                    case 18:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics9 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics9.getClass();
                        return basketballTopPlayersStatistics9.getFreeThrowsPercentage();
                    case 19:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics10 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics10.getClass();
                        return basketballTopPlayersStatistics10.getIndividualDefensiveRating();
                    case 20:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem11 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem11.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem11.getIndividualDefensiveRating());
                    case 21:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics11 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics11.getClass();
                        return basketballTopPlayersStatistics11.getPlayerEfficiencyRating();
                    case 22:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem12 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem12.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem12.getPlayerEfficiencyRating());
                    case 23:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics12 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics12.getClass();
                        return basketballTopPlayersStatistics12.getRebounds();
                    case 24:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem13 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem13.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem13.getRebounds(), basketballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics13 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics13.getClass();
                        return basketballTopPlayersStatistics13.getAssists();
                    case 26:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem14 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem14.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem14.getAssists(), basketballTopPlayersStatisticsItem14.getAppearances());
                    case 27:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics14 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics14.getClass();
                        return basketballTopPlayersStatistics14.getSecondsPlayed();
                    case 28:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem15 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem15.getClass();
                        return rei.j(basketballTopPlayersStatisticsItem15.getSecondsPlayed(), basketballTopPlayersStatisticsItem15.getAppearances());
                    default:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem16 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem16.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem16.getFreeThrowsPercentage(), basketballTopPlayersStatisticsItem16.getFreeThrowsMade(), basketballTopPlayersStatisticsItem16.getAppearances());
                }
            }
        });
        final int i29 = 21;
        final int i30 = 22;
        nab[] nabVarArr = {nabVar, nabVar2, nabVar3, nabVar4, nabVar5, nabVar6, nabVar7, nabVar8, nabVar9, nabVar10, nabVar11, nabVar12, nabVar13, nabVar14, nabVar15, nabVar16, nabVar17, nabVar18, nabVar19, nabVar20, nabVar21, nabVar22, nabVar23, nabVar24, new nab("PER", 24, R.string.basketball_player_efficiency_rating_long, new Function1() { // from class: lab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i29) {
                    case 0:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics.getClass();
                        return basketballTopPlayersStatistics.getPlusMinus();
                    case 1:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem.getPlusMinus(), basketballTopPlayersStatisticsItem.getAppearances());
                    case 2:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics2 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics2.getClass();
                        return basketballTopPlayersStatistics2.getPir();
                    case 3:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem2 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem2.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem2.getPir(), basketballTopPlayersStatisticsItem2.getAppearances());
                    case 4:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics3 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics3.getClass();
                        return basketballTopPlayersStatistics3.getDoubleDoubles();
                    case 5:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem3 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem3.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem3.getDoubleDoubles());
                    case 6:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics4 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics4.getClass();
                        return basketballTopPlayersStatistics4.getTripleDoubles();
                    case 7:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem4 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem4.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem4.getFieldGoalsPercentage(), basketballTopPlayersStatisticsItem4.getFieldGoalsMade(), basketballTopPlayersStatisticsItem4.getAppearances());
                    case 8:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem5 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem5.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem5.getTripleDoubles());
                    case 9:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics5 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics5.getClass();
                        return basketballTopPlayersStatistics5.getTrueShootingPercentage();
                    case 10:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem6 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem6.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem6.getTrueShootingPercentage(), 0, 6);
                    case 11:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem7 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem7.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem7.getPoints(), basketballTopPlayersStatisticsItem7.getAppearances());
                    case 12:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics6 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics6.getClass();
                        return basketballTopPlayersStatistics6.getEffectiveFieldGoalPercentage();
                    case 13:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem8 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem8.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem8.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 14:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics7 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics7.getClass();
                        return basketballTopPlayersStatistics7.getUsage();
                    case 15:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem9 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem9.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem9.getUsage(), 0, 6);
                    case 16:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics8 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics8.getClass();
                        return basketballTopPlayersStatistics8.getIndividualOffensiveRating();
                    case 17:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem10 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem10.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem10.getIndividualOffensiveRating());
                    case 18:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics9 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics9.getClass();
                        return basketballTopPlayersStatistics9.getFreeThrowsPercentage();
                    case 19:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics10 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics10.getClass();
                        return basketballTopPlayersStatistics10.getIndividualDefensiveRating();
                    case 20:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem11 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem11.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem11.getIndividualDefensiveRating());
                    case 21:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics11 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics11.getClass();
                        return basketballTopPlayersStatistics11.getPlayerEfficiencyRating();
                    case 22:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem12 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem12.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem12.getPlayerEfficiencyRating());
                    case 23:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics12 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics12.getClass();
                        return basketballTopPlayersStatistics12.getRebounds();
                    case 24:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem13 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem13.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem13.getRebounds(), basketballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics13 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics13.getClass();
                        return basketballTopPlayersStatistics13.getAssists();
                    case 26:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem14 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem14.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem14.getAssists(), basketballTopPlayersStatisticsItem14.getAppearances());
                    case 27:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics14 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics14.getClass();
                        return basketballTopPlayersStatistics14.getSecondsPlayed();
                    case 28:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem15 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem15.getClass();
                        return rei.j(basketballTopPlayersStatisticsItem15.getSecondsPlayed(), basketballTopPlayersStatisticsItem15.getAppearances());
                    default:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem16 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem16.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem16.getFreeThrowsPercentage(), basketballTopPlayersStatisticsItem16.getFreeThrowsMade(), basketballTopPlayersStatisticsItem16.getAppearances());
                }
            }
        }, new Function1() { // from class: lab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i30) {
                    case 0:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics.getClass();
                        return basketballTopPlayersStatistics.getPlusMinus();
                    case 1:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem.getPlusMinus(), basketballTopPlayersStatisticsItem.getAppearances());
                    case 2:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics2 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics2.getClass();
                        return basketballTopPlayersStatistics2.getPir();
                    case 3:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem2 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem2.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem2.getPir(), basketballTopPlayersStatisticsItem2.getAppearances());
                    case 4:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics3 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics3.getClass();
                        return basketballTopPlayersStatistics3.getDoubleDoubles();
                    case 5:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem3 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem3.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem3.getDoubleDoubles());
                    case 6:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics4 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics4.getClass();
                        return basketballTopPlayersStatistics4.getTripleDoubles();
                    case 7:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem4 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem4.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem4.getFieldGoalsPercentage(), basketballTopPlayersStatisticsItem4.getFieldGoalsMade(), basketballTopPlayersStatisticsItem4.getAppearances());
                    case 8:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem5 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem5.getClass();
                        return yid.j(basketballTopPlayersStatisticsItem5.getTripleDoubles());
                    case 9:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics5 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics5.getClass();
                        return basketballTopPlayersStatistics5.getTrueShootingPercentage();
                    case 10:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem6 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem6.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem6.getTrueShootingPercentage(), 0, 6);
                    case 11:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem7 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem7.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem7.getPoints(), basketballTopPlayersStatisticsItem7.getAppearances());
                    case 12:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics6 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics6.getClass();
                        return basketballTopPlayersStatistics6.getEffectiveFieldGoalPercentage();
                    case 13:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem8 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem8.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem8.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 14:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics7 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics7.getClass();
                        return basketballTopPlayersStatistics7.getUsage();
                    case 15:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem9 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem9.getClass();
                        return rei.e(basketballTopPlayersStatisticsItem9.getUsage(), 0, 6);
                    case 16:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics8 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics8.getClass();
                        return basketballTopPlayersStatistics8.getIndividualOffensiveRating();
                    case 17:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem10 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem10.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem10.getIndividualOffensiveRating());
                    case 18:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics9 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics9.getClass();
                        return basketballTopPlayersStatistics9.getFreeThrowsPercentage();
                    case 19:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics10 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics10.getClass();
                        return basketballTopPlayersStatistics10.getIndividualDefensiveRating();
                    case 20:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem11 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem11.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem11.getIndividualDefensiveRating());
                    case 21:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics11 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics11.getClass();
                        return basketballTopPlayersStatistics11.getPlayerEfficiencyRating();
                    case 22:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem12 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem12.getClass();
                        return rei.b(1, basketballTopPlayersStatisticsItem12.getPlayerEfficiencyRating());
                    case 23:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics12 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics12.getClass();
                        return basketballTopPlayersStatistics12.getRebounds();
                    case 24:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem13 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem13.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem13.getRebounds(), basketballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics13 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics13.getClass();
                        return basketballTopPlayersStatistics13.getAssists();
                    case 26:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem14 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem14.getClass();
                        return rei.m(basketballTopPlayersStatisticsItem14.getAssists(), basketballTopPlayersStatisticsItem14.getAppearances());
                    case 27:
                        BasketballTopPlayersStatistics basketballTopPlayersStatistics14 = (BasketballTopPlayersStatistics) obj;
                        basketballTopPlayersStatistics14.getClass();
                        return basketballTopPlayersStatistics14.getSecondsPlayed();
                    case 28:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem15 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem15.getClass();
                        return rei.j(basketballTopPlayersStatisticsItem15.getSecondsPlayed(), basketballTopPlayersStatisticsItem15.getAppearances());
                    default:
                        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem16 = (BasketballTopPlayersStatisticsItem) obj;
                        basketballTopPlayersStatisticsItem16.getClass();
                        return rei.s(basketballTopPlayersStatisticsItem16.getFreeThrowsPercentage(), basketballTopPlayersStatisticsItem16.getFreeThrowsMade(), basketballTopPlayersStatisticsItem16.getAppearances());
                }
            }
        })};
        d = nabVarArr;
        e = new kp5(nabVarArr);
    }

    public nab(String str, int i, int i2, Function1 function1, Function1 function12) {
        this.a = i2;
        this.b = function1;
        this.c = function12;
    }

    public static nab valueOf(String str) {
        return (nab) Enum.valueOf(nab.class, str);
    }

    public static nab[] values() {
        return (nab[]) d.clone();
    }

    @Override // defpackage.zab
    public final String a(Object obj) {
        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem = (BasketballTopPlayersStatisticsItem) obj;
        basketballTopPlayersStatisticsItem.getClass();
        return (String) this.c.invoke(basketballTopPlayersStatisticsItem);
    }

    @Override // defpackage.zab
    public final List b(Object obj) {
        BasketballTopPlayersStatistics basketballTopPlayersStatistics = (BasketballTopPlayersStatistics) obj;
        basketballTopPlayersStatistics.getClass();
        return (List) this.b.invoke(basketballTopPlayersStatistics);
    }

    @Override // defpackage.zab
    public final boolean c(hub hubVar) {
        hubVar.getClass();
        return true;
    }

    @Override // defpackage.zab
    public final String d(Context context) {
        context.getClass();
        String string = context.getString(this.a);
        string.getClass();
        return string;
    }
}
