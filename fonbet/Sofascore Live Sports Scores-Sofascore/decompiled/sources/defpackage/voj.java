package defpackage;

import com.sofascore.model.newNetwork.topperformance.response.BasketballTopTeamsStatistics;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.BasketballTopTeamsStatisticsItem;
import com.sofascore.results.R;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class voj implements ipj {
    public static final /* synthetic */ voj[] d;
    public static final /* synthetic */ kp5 e;
    public final int a;
    public final Function1 b;
    public final Function1 c;

    static {
        voj vojVar = new voj("POINTS", 0, R.string.points_basketball, new qaj(27), new qaj(19));
        final int i = 1;
        Function1 function1 = new Function1() { // from class: toj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i) {
                    case 0:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem, basketballTopTeamsStatisticsItem.getTurnovers());
                    case 1:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics.getClass();
                        return basketballTopTeamsStatistics.getPointsAgainst();
                    case 2:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics2 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics2.getClass();
                        return basketballTopTeamsStatistics2.getBlocks();
                    case 3:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem2 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem2.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem2, basketballTopTeamsStatisticsItem2.getBlocks());
                    case 4:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics3 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics3.getClass();
                        return basketballTopTeamsStatistics3.getFastbreakPoints();
                    case 5:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem3 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem3.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem3, basketballTopTeamsStatisticsItem3.getFastbreakPoints());
                    case 6:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics4 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics4.getClass();
                        return basketballTopTeamsStatistics4.getTrueShootingPercentage();
                    case 7:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem4 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem4.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem4.getTrueShootingPercentage(), 0, 6);
                    case 8:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics5 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics5.getClass();
                        return basketballTopTeamsStatistics5.getFreeThrowsPercentage();
                    case 9:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics6 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics6.getClass();
                        return basketballTopTeamsStatistics6.getEffectiveFieldGoalPercentage();
                    case 10:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem5 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem5.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem5.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 11:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics7 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics7.getClass();
                        return basketballTopTeamsStatistics7.getPace();
                    case 12:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem6 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem6.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem6.getPace());
                    case 13:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem7 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem7.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem7, basketballTopTeamsStatisticsItem7.getPointsAgainst());
                    case 14:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics8 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics8.getClass();
                        return basketballTopTeamsStatistics8.getOffensiveRating();
                    case 15:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem8 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem8.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem8.getOffensiveRating());
                    case 16:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics9 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics9.getClass();
                        return basketballTopTeamsStatistics9.getDefensiveRating();
                    case 17:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem9 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem9.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem9.getDefensiveRating());
                    case 18:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics10 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics10.getClass();
                        return basketballTopTeamsStatistics10.getNetRating();
                    case 19:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem10 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem10.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem10.getFreeThrowsPercentage(), 0, 6);
                    case 20:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem11 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem11.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem11.getNetRating());
                    case 21:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics11 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics11.getClass();
                        return basketballTopTeamsStatistics11.getPlusMinus();
                    case 22:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem12 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem12.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem12, basketballTopTeamsStatisticsItem12.getPlusMinus());
                    case 23:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics12 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics12.getClass();
                        return basketballTopTeamsStatistics12.getFieldGoalsPercentage();
                    case 24:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem13 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem13.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem13.getFieldGoalsPercentage(), 0, 6);
                    case 25:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics13 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics13.getClass();
                        return basketballTopTeamsStatistics13.getFieldGoalsPercentageAgainst();
                    case 26:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem14 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem14.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem14.getFieldGoalsPercentageAgainst(), 0, 6);
                    case 27:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics14 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics14.getClass();
                        return basketballTopTeamsStatistics14.getThreePointsPercentage();
                    case 28:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem15 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem15.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem15.getThreePointsPercentage(), 0, 6);
                    default:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics15 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics15.getClass();
                        return basketballTopTeamsStatistics15.getThreePointsPercentageAgainst();
                }
            }
        };
        final int i2 = 13;
        voj vojVar2 = new voj("POINTS_ALLOWED", 1, R.string.points_allowed, function1, new Function1() { // from class: toj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i2) {
                    case 0:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem, basketballTopTeamsStatisticsItem.getTurnovers());
                    case 1:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics.getClass();
                        return basketballTopTeamsStatistics.getPointsAgainst();
                    case 2:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics2 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics2.getClass();
                        return basketballTopTeamsStatistics2.getBlocks();
                    case 3:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem2 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem2.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem2, basketballTopTeamsStatisticsItem2.getBlocks());
                    case 4:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics3 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics3.getClass();
                        return basketballTopTeamsStatistics3.getFastbreakPoints();
                    case 5:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem3 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem3.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem3, basketballTopTeamsStatisticsItem3.getFastbreakPoints());
                    case 6:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics4 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics4.getClass();
                        return basketballTopTeamsStatistics4.getTrueShootingPercentage();
                    case 7:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem4 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem4.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem4.getTrueShootingPercentage(), 0, 6);
                    case 8:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics5 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics5.getClass();
                        return basketballTopTeamsStatistics5.getFreeThrowsPercentage();
                    case 9:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics6 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics6.getClass();
                        return basketballTopTeamsStatistics6.getEffectiveFieldGoalPercentage();
                    case 10:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem5 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem5.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem5.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 11:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics7 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics7.getClass();
                        return basketballTopTeamsStatistics7.getPace();
                    case 12:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem6 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem6.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem6.getPace());
                    case 13:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem7 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem7.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem7, basketballTopTeamsStatisticsItem7.getPointsAgainst());
                    case 14:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics8 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics8.getClass();
                        return basketballTopTeamsStatistics8.getOffensiveRating();
                    case 15:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem8 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem8.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem8.getOffensiveRating());
                    case 16:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics9 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics9.getClass();
                        return basketballTopTeamsStatistics9.getDefensiveRating();
                    case 17:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem9 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem9.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem9.getDefensiveRating());
                    case 18:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics10 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics10.getClass();
                        return basketballTopTeamsStatistics10.getNetRating();
                    case 19:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem10 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem10.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem10.getFreeThrowsPercentage(), 0, 6);
                    case 20:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem11 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem11.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem11.getNetRating());
                    case 21:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics11 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics11.getClass();
                        return basketballTopTeamsStatistics11.getPlusMinus();
                    case 22:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem12 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem12.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem12, basketballTopTeamsStatisticsItem12.getPlusMinus());
                    case 23:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics12 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics12.getClass();
                        return basketballTopTeamsStatistics12.getFieldGoalsPercentage();
                    case 24:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem13 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem13.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem13.getFieldGoalsPercentage(), 0, 6);
                    case 25:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics13 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics13.getClass();
                        return basketballTopTeamsStatistics13.getFieldGoalsPercentageAgainst();
                    case 26:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem14 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem14.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem14.getFieldGoalsPercentageAgainst(), 0, 6);
                    case 27:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics14 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics14.getClass();
                        return basketballTopTeamsStatistics14.getThreePointsPercentage();
                    case 28:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem15 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem15.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem15.getThreePointsPercentage(), 0, 6);
                    default:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics15 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics15.getClass();
                        return basketballTopTeamsStatistics15.getThreePointsPercentageAgainst();
                }
            }
        });
        final int i3 = 21;
        Function1 function12 = new Function1() { // from class: toj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i3) {
                    case 0:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem, basketballTopTeamsStatisticsItem.getTurnovers());
                    case 1:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics.getClass();
                        return basketballTopTeamsStatistics.getPointsAgainst();
                    case 2:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics2 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics2.getClass();
                        return basketballTopTeamsStatistics2.getBlocks();
                    case 3:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem2 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem2.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem2, basketballTopTeamsStatisticsItem2.getBlocks());
                    case 4:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics3 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics3.getClass();
                        return basketballTopTeamsStatistics3.getFastbreakPoints();
                    case 5:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem3 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem3.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem3, basketballTopTeamsStatisticsItem3.getFastbreakPoints());
                    case 6:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics4 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics4.getClass();
                        return basketballTopTeamsStatistics4.getTrueShootingPercentage();
                    case 7:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem4 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem4.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem4.getTrueShootingPercentage(), 0, 6);
                    case 8:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics5 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics5.getClass();
                        return basketballTopTeamsStatistics5.getFreeThrowsPercentage();
                    case 9:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics6 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics6.getClass();
                        return basketballTopTeamsStatistics6.getEffectiveFieldGoalPercentage();
                    case 10:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem5 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem5.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem5.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 11:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics7 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics7.getClass();
                        return basketballTopTeamsStatistics7.getPace();
                    case 12:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem6 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem6.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem6.getPace());
                    case 13:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem7 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem7.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem7, basketballTopTeamsStatisticsItem7.getPointsAgainst());
                    case 14:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics8 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics8.getClass();
                        return basketballTopTeamsStatistics8.getOffensiveRating();
                    case 15:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem8 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem8.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem8.getOffensiveRating());
                    case 16:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics9 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics9.getClass();
                        return basketballTopTeamsStatistics9.getDefensiveRating();
                    case 17:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem9 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem9.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem9.getDefensiveRating());
                    case 18:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics10 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics10.getClass();
                        return basketballTopTeamsStatistics10.getNetRating();
                    case 19:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem10 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem10.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem10.getFreeThrowsPercentage(), 0, 6);
                    case 20:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem11 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem11.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem11.getNetRating());
                    case 21:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics11 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics11.getClass();
                        return basketballTopTeamsStatistics11.getPlusMinus();
                    case 22:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem12 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem12.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem12, basketballTopTeamsStatisticsItem12.getPlusMinus());
                    case 23:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics12 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics12.getClass();
                        return basketballTopTeamsStatistics12.getFieldGoalsPercentage();
                    case 24:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem13 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem13.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem13.getFieldGoalsPercentage(), 0, 6);
                    case 25:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics13 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics13.getClass();
                        return basketballTopTeamsStatistics13.getFieldGoalsPercentageAgainst();
                    case 26:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem14 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem14.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem14.getFieldGoalsPercentageAgainst(), 0, 6);
                    case 27:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics14 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics14.getClass();
                        return basketballTopTeamsStatistics14.getThreePointsPercentage();
                    case 28:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem15 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem15.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem15.getThreePointsPercentage(), 0, 6);
                    default:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics15 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics15.getClass();
                        return basketballTopTeamsStatistics15.getThreePointsPercentageAgainst();
                }
            }
        };
        final int i4 = 22;
        voj vojVar3 = new voj("PLUS_MINUS", 2, R.string.plus_minus_per_game, function12, new Function1() { // from class: toj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i4) {
                    case 0:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem, basketballTopTeamsStatisticsItem.getTurnovers());
                    case 1:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics.getClass();
                        return basketballTopTeamsStatistics.getPointsAgainst();
                    case 2:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics2 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics2.getClass();
                        return basketballTopTeamsStatistics2.getBlocks();
                    case 3:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem2 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem2.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem2, basketballTopTeamsStatisticsItem2.getBlocks());
                    case 4:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics3 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics3.getClass();
                        return basketballTopTeamsStatistics3.getFastbreakPoints();
                    case 5:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem3 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem3.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem3, basketballTopTeamsStatisticsItem3.getFastbreakPoints());
                    case 6:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics4 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics4.getClass();
                        return basketballTopTeamsStatistics4.getTrueShootingPercentage();
                    case 7:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem4 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem4.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem4.getTrueShootingPercentage(), 0, 6);
                    case 8:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics5 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics5.getClass();
                        return basketballTopTeamsStatistics5.getFreeThrowsPercentage();
                    case 9:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics6 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics6.getClass();
                        return basketballTopTeamsStatistics6.getEffectiveFieldGoalPercentage();
                    case 10:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem5 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem5.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem5.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 11:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics7 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics7.getClass();
                        return basketballTopTeamsStatistics7.getPace();
                    case 12:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem6 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem6.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem6.getPace());
                    case 13:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem7 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem7.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem7, basketballTopTeamsStatisticsItem7.getPointsAgainst());
                    case 14:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics8 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics8.getClass();
                        return basketballTopTeamsStatistics8.getOffensiveRating();
                    case 15:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem8 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem8.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem8.getOffensiveRating());
                    case 16:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics9 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics9.getClass();
                        return basketballTopTeamsStatistics9.getDefensiveRating();
                    case 17:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem9 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem9.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem9.getDefensiveRating());
                    case 18:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics10 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics10.getClass();
                        return basketballTopTeamsStatistics10.getNetRating();
                    case 19:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem10 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem10.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem10.getFreeThrowsPercentage(), 0, 6);
                    case 20:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem11 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem11.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem11.getNetRating());
                    case 21:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics11 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics11.getClass();
                        return basketballTopTeamsStatistics11.getPlusMinus();
                    case 22:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem12 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem12.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem12, basketballTopTeamsStatisticsItem12.getPlusMinus());
                    case 23:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics12 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics12.getClass();
                        return basketballTopTeamsStatistics12.getFieldGoalsPercentage();
                    case 24:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem13 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem13.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem13.getFieldGoalsPercentage(), 0, 6);
                    case 25:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics13 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics13.getClass();
                        return basketballTopTeamsStatistics13.getFieldGoalsPercentageAgainst();
                    case 26:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem14 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem14.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem14.getFieldGoalsPercentageAgainst(), 0, 6);
                    case 27:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics14 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics14.getClass();
                        return basketballTopTeamsStatistics14.getThreePointsPercentage();
                    case 28:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem15 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem15.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem15.getThreePointsPercentage(), 0, 6);
                    default:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics15 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics15.getClass();
                        return basketballTopTeamsStatistics15.getThreePointsPercentageAgainst();
                }
            }
        });
        final int i5 = 23;
        Function1 function13 = new Function1() { // from class: toj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i5) {
                    case 0:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem, basketballTopTeamsStatisticsItem.getTurnovers());
                    case 1:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics.getClass();
                        return basketballTopTeamsStatistics.getPointsAgainst();
                    case 2:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics2 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics2.getClass();
                        return basketballTopTeamsStatistics2.getBlocks();
                    case 3:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem2 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem2.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem2, basketballTopTeamsStatisticsItem2.getBlocks());
                    case 4:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics3 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics3.getClass();
                        return basketballTopTeamsStatistics3.getFastbreakPoints();
                    case 5:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem3 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem3.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem3, basketballTopTeamsStatisticsItem3.getFastbreakPoints());
                    case 6:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics4 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics4.getClass();
                        return basketballTopTeamsStatistics4.getTrueShootingPercentage();
                    case 7:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem4 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem4.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem4.getTrueShootingPercentage(), 0, 6);
                    case 8:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics5 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics5.getClass();
                        return basketballTopTeamsStatistics5.getFreeThrowsPercentage();
                    case 9:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics6 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics6.getClass();
                        return basketballTopTeamsStatistics6.getEffectiveFieldGoalPercentage();
                    case 10:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem5 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem5.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem5.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 11:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics7 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics7.getClass();
                        return basketballTopTeamsStatistics7.getPace();
                    case 12:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem6 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem6.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem6.getPace());
                    case 13:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem7 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem7.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem7, basketballTopTeamsStatisticsItem7.getPointsAgainst());
                    case 14:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics8 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics8.getClass();
                        return basketballTopTeamsStatistics8.getOffensiveRating();
                    case 15:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem8 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem8.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem8.getOffensiveRating());
                    case 16:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics9 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics9.getClass();
                        return basketballTopTeamsStatistics9.getDefensiveRating();
                    case 17:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem9 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem9.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem9.getDefensiveRating());
                    case 18:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics10 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics10.getClass();
                        return basketballTopTeamsStatistics10.getNetRating();
                    case 19:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem10 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem10.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem10.getFreeThrowsPercentage(), 0, 6);
                    case 20:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem11 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem11.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem11.getNetRating());
                    case 21:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics11 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics11.getClass();
                        return basketballTopTeamsStatistics11.getPlusMinus();
                    case 22:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem12 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem12.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem12, basketballTopTeamsStatisticsItem12.getPlusMinus());
                    case 23:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics12 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics12.getClass();
                        return basketballTopTeamsStatistics12.getFieldGoalsPercentage();
                    case 24:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem13 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem13.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem13.getFieldGoalsPercentage(), 0, 6);
                    case 25:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics13 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics13.getClass();
                        return basketballTopTeamsStatistics13.getFieldGoalsPercentageAgainst();
                    case 26:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem14 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem14.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem14.getFieldGoalsPercentageAgainst(), 0, 6);
                    case 27:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics14 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics14.getClass();
                        return basketballTopTeamsStatistics14.getThreePointsPercentage();
                    case 28:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem15 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem15.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem15.getThreePointsPercentage(), 0, 6);
                    default:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics15 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics15.getClass();
                        return basketballTopTeamsStatistics15.getThreePointsPercentageAgainst();
                }
            }
        };
        final int i6 = 24;
        voj vojVar4 = new voj("FIELD_GOALS_PERCENT", 3, R.string.field_goals_percentage, function13, new Function1() { // from class: toj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i6) {
                    case 0:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem, basketballTopTeamsStatisticsItem.getTurnovers());
                    case 1:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics.getClass();
                        return basketballTopTeamsStatistics.getPointsAgainst();
                    case 2:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics2 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics2.getClass();
                        return basketballTopTeamsStatistics2.getBlocks();
                    case 3:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem2 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem2.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem2, basketballTopTeamsStatisticsItem2.getBlocks());
                    case 4:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics3 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics3.getClass();
                        return basketballTopTeamsStatistics3.getFastbreakPoints();
                    case 5:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem3 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem3.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem3, basketballTopTeamsStatisticsItem3.getFastbreakPoints());
                    case 6:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics4 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics4.getClass();
                        return basketballTopTeamsStatistics4.getTrueShootingPercentage();
                    case 7:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem4 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem4.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem4.getTrueShootingPercentage(), 0, 6);
                    case 8:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics5 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics5.getClass();
                        return basketballTopTeamsStatistics5.getFreeThrowsPercentage();
                    case 9:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics6 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics6.getClass();
                        return basketballTopTeamsStatistics6.getEffectiveFieldGoalPercentage();
                    case 10:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem5 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem5.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem5.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 11:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics7 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics7.getClass();
                        return basketballTopTeamsStatistics7.getPace();
                    case 12:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem6 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem6.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem6.getPace());
                    case 13:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem7 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem7.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem7, basketballTopTeamsStatisticsItem7.getPointsAgainst());
                    case 14:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics8 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics8.getClass();
                        return basketballTopTeamsStatistics8.getOffensiveRating();
                    case 15:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem8 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem8.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem8.getOffensiveRating());
                    case 16:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics9 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics9.getClass();
                        return basketballTopTeamsStatistics9.getDefensiveRating();
                    case 17:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem9 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem9.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem9.getDefensiveRating());
                    case 18:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics10 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics10.getClass();
                        return basketballTopTeamsStatistics10.getNetRating();
                    case 19:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem10 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem10.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem10.getFreeThrowsPercentage(), 0, 6);
                    case 20:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem11 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem11.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem11.getNetRating());
                    case 21:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics11 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics11.getClass();
                        return basketballTopTeamsStatistics11.getPlusMinus();
                    case 22:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem12 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem12.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem12, basketballTopTeamsStatisticsItem12.getPlusMinus());
                    case 23:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics12 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics12.getClass();
                        return basketballTopTeamsStatistics12.getFieldGoalsPercentage();
                    case 24:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem13 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem13.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem13.getFieldGoalsPercentage(), 0, 6);
                    case 25:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics13 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics13.getClass();
                        return basketballTopTeamsStatistics13.getFieldGoalsPercentageAgainst();
                    case 26:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem14 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem14.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem14.getFieldGoalsPercentageAgainst(), 0, 6);
                    case 27:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics14 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics14.getClass();
                        return basketballTopTeamsStatistics14.getThreePointsPercentage();
                    case 28:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem15 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem15.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem15.getThreePointsPercentage(), 0, 6);
                    default:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics15 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics15.getClass();
                        return basketballTopTeamsStatistics15.getThreePointsPercentageAgainst();
                }
            }
        });
        final int i7 = 25;
        Function1 function14 = new Function1() { // from class: toj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i7) {
                    case 0:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem, basketballTopTeamsStatisticsItem.getTurnovers());
                    case 1:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics.getClass();
                        return basketballTopTeamsStatistics.getPointsAgainst();
                    case 2:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics2 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics2.getClass();
                        return basketballTopTeamsStatistics2.getBlocks();
                    case 3:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem2 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem2.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem2, basketballTopTeamsStatisticsItem2.getBlocks());
                    case 4:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics3 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics3.getClass();
                        return basketballTopTeamsStatistics3.getFastbreakPoints();
                    case 5:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem3 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem3.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem3, basketballTopTeamsStatisticsItem3.getFastbreakPoints());
                    case 6:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics4 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics4.getClass();
                        return basketballTopTeamsStatistics4.getTrueShootingPercentage();
                    case 7:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem4 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem4.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem4.getTrueShootingPercentage(), 0, 6);
                    case 8:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics5 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics5.getClass();
                        return basketballTopTeamsStatistics5.getFreeThrowsPercentage();
                    case 9:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics6 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics6.getClass();
                        return basketballTopTeamsStatistics6.getEffectiveFieldGoalPercentage();
                    case 10:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem5 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem5.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem5.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 11:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics7 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics7.getClass();
                        return basketballTopTeamsStatistics7.getPace();
                    case 12:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem6 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem6.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem6.getPace());
                    case 13:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem7 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem7.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem7, basketballTopTeamsStatisticsItem7.getPointsAgainst());
                    case 14:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics8 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics8.getClass();
                        return basketballTopTeamsStatistics8.getOffensiveRating();
                    case 15:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem8 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem8.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem8.getOffensiveRating());
                    case 16:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics9 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics9.getClass();
                        return basketballTopTeamsStatistics9.getDefensiveRating();
                    case 17:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem9 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem9.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem9.getDefensiveRating());
                    case 18:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics10 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics10.getClass();
                        return basketballTopTeamsStatistics10.getNetRating();
                    case 19:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem10 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem10.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem10.getFreeThrowsPercentage(), 0, 6);
                    case 20:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem11 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem11.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem11.getNetRating());
                    case 21:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics11 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics11.getClass();
                        return basketballTopTeamsStatistics11.getPlusMinus();
                    case 22:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem12 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem12.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem12, basketballTopTeamsStatisticsItem12.getPlusMinus());
                    case 23:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics12 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics12.getClass();
                        return basketballTopTeamsStatistics12.getFieldGoalsPercentage();
                    case 24:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem13 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem13.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem13.getFieldGoalsPercentage(), 0, 6);
                    case 25:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics13 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics13.getClass();
                        return basketballTopTeamsStatistics13.getFieldGoalsPercentageAgainst();
                    case 26:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem14 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem14.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem14.getFieldGoalsPercentageAgainst(), 0, 6);
                    case 27:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics14 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics14.getClass();
                        return basketballTopTeamsStatistics14.getThreePointsPercentage();
                    case 28:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem15 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem15.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem15.getThreePointsPercentage(), 0, 6);
                    default:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics15 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics15.getClass();
                        return basketballTopTeamsStatistics15.getThreePointsPercentageAgainst();
                }
            }
        };
        final int i8 = 26;
        voj vojVar5 = new voj("FIELD_GOALS_PERCENT_ALLOWED", 4, R.string.field_goals_percent_allowed, function14, new Function1() { // from class: toj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i8) {
                    case 0:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem, basketballTopTeamsStatisticsItem.getTurnovers());
                    case 1:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics.getClass();
                        return basketballTopTeamsStatistics.getPointsAgainst();
                    case 2:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics2 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics2.getClass();
                        return basketballTopTeamsStatistics2.getBlocks();
                    case 3:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem2 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem2.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem2, basketballTopTeamsStatisticsItem2.getBlocks());
                    case 4:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics3 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics3.getClass();
                        return basketballTopTeamsStatistics3.getFastbreakPoints();
                    case 5:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem3 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem3.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem3, basketballTopTeamsStatisticsItem3.getFastbreakPoints());
                    case 6:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics4 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics4.getClass();
                        return basketballTopTeamsStatistics4.getTrueShootingPercentage();
                    case 7:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem4 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem4.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem4.getTrueShootingPercentage(), 0, 6);
                    case 8:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics5 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics5.getClass();
                        return basketballTopTeamsStatistics5.getFreeThrowsPercentage();
                    case 9:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics6 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics6.getClass();
                        return basketballTopTeamsStatistics6.getEffectiveFieldGoalPercentage();
                    case 10:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem5 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem5.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem5.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 11:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics7 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics7.getClass();
                        return basketballTopTeamsStatistics7.getPace();
                    case 12:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem6 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem6.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem6.getPace());
                    case 13:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem7 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem7.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem7, basketballTopTeamsStatisticsItem7.getPointsAgainst());
                    case 14:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics8 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics8.getClass();
                        return basketballTopTeamsStatistics8.getOffensiveRating();
                    case 15:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem8 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem8.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem8.getOffensiveRating());
                    case 16:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics9 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics9.getClass();
                        return basketballTopTeamsStatistics9.getDefensiveRating();
                    case 17:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem9 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem9.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem9.getDefensiveRating());
                    case 18:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics10 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics10.getClass();
                        return basketballTopTeamsStatistics10.getNetRating();
                    case 19:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem10 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem10.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem10.getFreeThrowsPercentage(), 0, 6);
                    case 20:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem11 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem11.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem11.getNetRating());
                    case 21:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics11 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics11.getClass();
                        return basketballTopTeamsStatistics11.getPlusMinus();
                    case 22:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem12 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem12.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem12, basketballTopTeamsStatisticsItem12.getPlusMinus());
                    case 23:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics12 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics12.getClass();
                        return basketballTopTeamsStatistics12.getFieldGoalsPercentage();
                    case 24:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem13 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem13.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem13.getFieldGoalsPercentage(), 0, 6);
                    case 25:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics13 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics13.getClass();
                        return basketballTopTeamsStatistics13.getFieldGoalsPercentageAgainst();
                    case 26:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem14 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem14.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem14.getFieldGoalsPercentageAgainst(), 0, 6);
                    case 27:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics14 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics14.getClass();
                        return basketballTopTeamsStatistics14.getThreePointsPercentage();
                    case 28:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem15 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem15.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem15.getThreePointsPercentage(), 0, 6);
                    default:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics15 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics15.getClass();
                        return basketballTopTeamsStatistics15.getThreePointsPercentageAgainst();
                }
            }
        });
        final int i9 = 8;
        Function1 function15 = new Function1() { // from class: toj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i9) {
                    case 0:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem, basketballTopTeamsStatisticsItem.getTurnovers());
                    case 1:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics.getClass();
                        return basketballTopTeamsStatistics.getPointsAgainst();
                    case 2:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics2 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics2.getClass();
                        return basketballTopTeamsStatistics2.getBlocks();
                    case 3:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem2 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem2.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem2, basketballTopTeamsStatisticsItem2.getBlocks());
                    case 4:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics3 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics3.getClass();
                        return basketballTopTeamsStatistics3.getFastbreakPoints();
                    case 5:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem3 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem3.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem3, basketballTopTeamsStatisticsItem3.getFastbreakPoints());
                    case 6:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics4 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics4.getClass();
                        return basketballTopTeamsStatistics4.getTrueShootingPercentage();
                    case 7:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem4 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem4.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem4.getTrueShootingPercentage(), 0, 6);
                    case 8:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics5 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics5.getClass();
                        return basketballTopTeamsStatistics5.getFreeThrowsPercentage();
                    case 9:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics6 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics6.getClass();
                        return basketballTopTeamsStatistics6.getEffectiveFieldGoalPercentage();
                    case 10:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem5 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem5.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem5.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 11:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics7 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics7.getClass();
                        return basketballTopTeamsStatistics7.getPace();
                    case 12:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem6 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem6.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem6.getPace());
                    case 13:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem7 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem7.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem7, basketballTopTeamsStatisticsItem7.getPointsAgainst());
                    case 14:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics8 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics8.getClass();
                        return basketballTopTeamsStatistics8.getOffensiveRating();
                    case 15:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem8 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem8.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem8.getOffensiveRating());
                    case 16:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics9 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics9.getClass();
                        return basketballTopTeamsStatistics9.getDefensiveRating();
                    case 17:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem9 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem9.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem9.getDefensiveRating());
                    case 18:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics10 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics10.getClass();
                        return basketballTopTeamsStatistics10.getNetRating();
                    case 19:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem10 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem10.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem10.getFreeThrowsPercentage(), 0, 6);
                    case 20:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem11 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem11.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem11.getNetRating());
                    case 21:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics11 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics11.getClass();
                        return basketballTopTeamsStatistics11.getPlusMinus();
                    case 22:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem12 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem12.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem12, basketballTopTeamsStatisticsItem12.getPlusMinus());
                    case 23:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics12 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics12.getClass();
                        return basketballTopTeamsStatistics12.getFieldGoalsPercentage();
                    case 24:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem13 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem13.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem13.getFieldGoalsPercentage(), 0, 6);
                    case 25:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics13 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics13.getClass();
                        return basketballTopTeamsStatistics13.getFieldGoalsPercentageAgainst();
                    case 26:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem14 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem14.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem14.getFieldGoalsPercentageAgainst(), 0, 6);
                    case 27:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics14 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics14.getClass();
                        return basketballTopTeamsStatistics14.getThreePointsPercentage();
                    case 28:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem15 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem15.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem15.getThreePointsPercentage(), 0, 6);
                    default:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics15 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics15.getClass();
                        return basketballTopTeamsStatistics15.getThreePointsPercentageAgainst();
                }
            }
        };
        final int i10 = 19;
        voj vojVar6 = new voj("FREE_THROWS_PERCENT", 5, R.string.free_throws_percentage, function15, new Function1() { // from class: toj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i10) {
                    case 0:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem, basketballTopTeamsStatisticsItem.getTurnovers());
                    case 1:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics.getClass();
                        return basketballTopTeamsStatistics.getPointsAgainst();
                    case 2:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics2 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics2.getClass();
                        return basketballTopTeamsStatistics2.getBlocks();
                    case 3:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem2 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem2.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem2, basketballTopTeamsStatisticsItem2.getBlocks());
                    case 4:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics3 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics3.getClass();
                        return basketballTopTeamsStatistics3.getFastbreakPoints();
                    case 5:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem3 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem3.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem3, basketballTopTeamsStatisticsItem3.getFastbreakPoints());
                    case 6:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics4 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics4.getClass();
                        return basketballTopTeamsStatistics4.getTrueShootingPercentage();
                    case 7:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem4 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem4.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem4.getTrueShootingPercentage(), 0, 6);
                    case 8:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics5 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics5.getClass();
                        return basketballTopTeamsStatistics5.getFreeThrowsPercentage();
                    case 9:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics6 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics6.getClass();
                        return basketballTopTeamsStatistics6.getEffectiveFieldGoalPercentage();
                    case 10:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem5 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem5.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem5.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 11:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics7 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics7.getClass();
                        return basketballTopTeamsStatistics7.getPace();
                    case 12:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem6 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem6.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem6.getPace());
                    case 13:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem7 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem7.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem7, basketballTopTeamsStatisticsItem7.getPointsAgainst());
                    case 14:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics8 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics8.getClass();
                        return basketballTopTeamsStatistics8.getOffensiveRating();
                    case 15:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem8 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem8.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem8.getOffensiveRating());
                    case 16:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics9 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics9.getClass();
                        return basketballTopTeamsStatistics9.getDefensiveRating();
                    case 17:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem9 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem9.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem9.getDefensiveRating());
                    case 18:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics10 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics10.getClass();
                        return basketballTopTeamsStatistics10.getNetRating();
                    case 19:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem10 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem10.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem10.getFreeThrowsPercentage(), 0, 6);
                    case 20:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem11 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem11.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem11.getNetRating());
                    case 21:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics11 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics11.getClass();
                        return basketballTopTeamsStatistics11.getPlusMinus();
                    case 22:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem12 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem12.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem12, basketballTopTeamsStatisticsItem12.getPlusMinus());
                    case 23:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics12 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics12.getClass();
                        return basketballTopTeamsStatistics12.getFieldGoalsPercentage();
                    case 24:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem13 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem13.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem13.getFieldGoalsPercentage(), 0, 6);
                    case 25:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics13 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics13.getClass();
                        return basketballTopTeamsStatistics13.getFieldGoalsPercentageAgainst();
                    case 26:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem14 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem14.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem14.getFieldGoalsPercentageAgainst(), 0, 6);
                    case 27:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics14 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics14.getClass();
                        return basketballTopTeamsStatistics14.getThreePointsPercentage();
                    case 28:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem15 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem15.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem15.getThreePointsPercentage(), 0, 6);
                    default:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics15 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics15.getClass();
                        return basketballTopTeamsStatistics15.getThreePointsPercentageAgainst();
                }
            }
        });
        final int i11 = 27;
        Function1 function16 = new Function1() { // from class: toj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i11) {
                    case 0:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem, basketballTopTeamsStatisticsItem.getTurnovers());
                    case 1:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics.getClass();
                        return basketballTopTeamsStatistics.getPointsAgainst();
                    case 2:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics2 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics2.getClass();
                        return basketballTopTeamsStatistics2.getBlocks();
                    case 3:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem2 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem2.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem2, basketballTopTeamsStatisticsItem2.getBlocks());
                    case 4:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics3 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics3.getClass();
                        return basketballTopTeamsStatistics3.getFastbreakPoints();
                    case 5:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem3 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem3.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem3, basketballTopTeamsStatisticsItem3.getFastbreakPoints());
                    case 6:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics4 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics4.getClass();
                        return basketballTopTeamsStatistics4.getTrueShootingPercentage();
                    case 7:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem4 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem4.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem4.getTrueShootingPercentage(), 0, 6);
                    case 8:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics5 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics5.getClass();
                        return basketballTopTeamsStatistics5.getFreeThrowsPercentage();
                    case 9:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics6 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics6.getClass();
                        return basketballTopTeamsStatistics6.getEffectiveFieldGoalPercentage();
                    case 10:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem5 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem5.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem5.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 11:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics7 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics7.getClass();
                        return basketballTopTeamsStatistics7.getPace();
                    case 12:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem6 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem6.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem6.getPace());
                    case 13:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem7 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem7.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem7, basketballTopTeamsStatisticsItem7.getPointsAgainst());
                    case 14:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics8 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics8.getClass();
                        return basketballTopTeamsStatistics8.getOffensiveRating();
                    case 15:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem8 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem8.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem8.getOffensiveRating());
                    case 16:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics9 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics9.getClass();
                        return basketballTopTeamsStatistics9.getDefensiveRating();
                    case 17:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem9 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem9.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem9.getDefensiveRating());
                    case 18:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics10 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics10.getClass();
                        return basketballTopTeamsStatistics10.getNetRating();
                    case 19:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem10 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem10.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem10.getFreeThrowsPercentage(), 0, 6);
                    case 20:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem11 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem11.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem11.getNetRating());
                    case 21:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics11 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics11.getClass();
                        return basketballTopTeamsStatistics11.getPlusMinus();
                    case 22:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem12 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem12.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem12, basketballTopTeamsStatisticsItem12.getPlusMinus());
                    case 23:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics12 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics12.getClass();
                        return basketballTopTeamsStatistics12.getFieldGoalsPercentage();
                    case 24:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem13 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem13.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem13.getFieldGoalsPercentage(), 0, 6);
                    case 25:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics13 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics13.getClass();
                        return basketballTopTeamsStatistics13.getFieldGoalsPercentageAgainst();
                    case 26:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem14 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem14.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem14.getFieldGoalsPercentageAgainst(), 0, 6);
                    case 27:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics14 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics14.getClass();
                        return basketballTopTeamsStatistics14.getThreePointsPercentage();
                    case 28:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem15 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem15.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem15.getThreePointsPercentage(), 0, 6);
                    default:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics15 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics15.getClass();
                        return basketballTopTeamsStatistics15.getThreePointsPercentageAgainst();
                }
            }
        };
        final int i12 = 28;
        voj vojVar7 = new voj("THREE_POINTS_PERCENT", 6, R.string.three_points_percentage, function16, new Function1() { // from class: toj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i12) {
                    case 0:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem, basketballTopTeamsStatisticsItem.getTurnovers());
                    case 1:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics.getClass();
                        return basketballTopTeamsStatistics.getPointsAgainst();
                    case 2:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics2 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics2.getClass();
                        return basketballTopTeamsStatistics2.getBlocks();
                    case 3:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem2 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem2.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem2, basketballTopTeamsStatisticsItem2.getBlocks());
                    case 4:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics3 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics3.getClass();
                        return basketballTopTeamsStatistics3.getFastbreakPoints();
                    case 5:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem3 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem3.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem3, basketballTopTeamsStatisticsItem3.getFastbreakPoints());
                    case 6:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics4 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics4.getClass();
                        return basketballTopTeamsStatistics4.getTrueShootingPercentage();
                    case 7:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem4 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem4.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem4.getTrueShootingPercentage(), 0, 6);
                    case 8:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics5 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics5.getClass();
                        return basketballTopTeamsStatistics5.getFreeThrowsPercentage();
                    case 9:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics6 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics6.getClass();
                        return basketballTopTeamsStatistics6.getEffectiveFieldGoalPercentage();
                    case 10:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem5 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem5.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem5.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 11:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics7 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics7.getClass();
                        return basketballTopTeamsStatistics7.getPace();
                    case 12:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem6 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem6.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem6.getPace());
                    case 13:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem7 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem7.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem7, basketballTopTeamsStatisticsItem7.getPointsAgainst());
                    case 14:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics8 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics8.getClass();
                        return basketballTopTeamsStatistics8.getOffensiveRating();
                    case 15:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem8 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem8.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem8.getOffensiveRating());
                    case 16:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics9 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics9.getClass();
                        return basketballTopTeamsStatistics9.getDefensiveRating();
                    case 17:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem9 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem9.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem9.getDefensiveRating());
                    case 18:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics10 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics10.getClass();
                        return basketballTopTeamsStatistics10.getNetRating();
                    case 19:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem10 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem10.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem10.getFreeThrowsPercentage(), 0, 6);
                    case 20:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem11 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem11.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem11.getNetRating());
                    case 21:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics11 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics11.getClass();
                        return basketballTopTeamsStatistics11.getPlusMinus();
                    case 22:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem12 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem12.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem12, basketballTopTeamsStatisticsItem12.getPlusMinus());
                    case 23:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics12 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics12.getClass();
                        return basketballTopTeamsStatistics12.getFieldGoalsPercentage();
                    case 24:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem13 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem13.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem13.getFieldGoalsPercentage(), 0, 6);
                    case 25:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics13 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics13.getClass();
                        return basketballTopTeamsStatistics13.getFieldGoalsPercentageAgainst();
                    case 26:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem14 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem14.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem14.getFieldGoalsPercentageAgainst(), 0, 6);
                    case 27:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics14 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics14.getClass();
                        return basketballTopTeamsStatistics14.getThreePointsPercentage();
                    case 28:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem15 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem15.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem15.getThreePointsPercentage(), 0, 6);
                    default:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics15 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics15.getClass();
                        return basketballTopTeamsStatistics15.getThreePointsPercentageAgainst();
                }
            }
        });
        final int i13 = 29;
        voj vojVar8 = new voj("THREE_POINTS_PERCENT_ALLOWED", 7, R.string.three_points_percent_allowed, new Function1() { // from class: toj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i13) {
                    case 0:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem, basketballTopTeamsStatisticsItem.getTurnovers());
                    case 1:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics.getClass();
                        return basketballTopTeamsStatistics.getPointsAgainst();
                    case 2:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics2 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics2.getClass();
                        return basketballTopTeamsStatistics2.getBlocks();
                    case 3:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem2 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem2.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem2, basketballTopTeamsStatisticsItem2.getBlocks());
                    case 4:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics3 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics3.getClass();
                        return basketballTopTeamsStatistics3.getFastbreakPoints();
                    case 5:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem3 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem3.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem3, basketballTopTeamsStatisticsItem3.getFastbreakPoints());
                    case 6:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics4 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics4.getClass();
                        return basketballTopTeamsStatistics4.getTrueShootingPercentage();
                    case 7:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem4 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem4.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem4.getTrueShootingPercentage(), 0, 6);
                    case 8:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics5 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics5.getClass();
                        return basketballTopTeamsStatistics5.getFreeThrowsPercentage();
                    case 9:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics6 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics6.getClass();
                        return basketballTopTeamsStatistics6.getEffectiveFieldGoalPercentage();
                    case 10:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem5 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem5.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem5.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 11:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics7 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics7.getClass();
                        return basketballTopTeamsStatistics7.getPace();
                    case 12:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem6 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem6.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem6.getPace());
                    case 13:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem7 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem7.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem7, basketballTopTeamsStatisticsItem7.getPointsAgainst());
                    case 14:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics8 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics8.getClass();
                        return basketballTopTeamsStatistics8.getOffensiveRating();
                    case 15:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem8 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem8.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem8.getOffensiveRating());
                    case 16:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics9 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics9.getClass();
                        return basketballTopTeamsStatistics9.getDefensiveRating();
                    case 17:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem9 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem9.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem9.getDefensiveRating());
                    case 18:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics10 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics10.getClass();
                        return basketballTopTeamsStatistics10.getNetRating();
                    case 19:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem10 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem10.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem10.getFreeThrowsPercentage(), 0, 6);
                    case 20:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem11 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem11.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem11.getNetRating());
                    case 21:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics11 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics11.getClass();
                        return basketballTopTeamsStatistics11.getPlusMinus();
                    case 22:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem12 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem12.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem12, basketballTopTeamsStatisticsItem12.getPlusMinus());
                    case 23:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics12 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics12.getClass();
                        return basketballTopTeamsStatistics12.getFieldGoalsPercentage();
                    case 24:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem13 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem13.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem13.getFieldGoalsPercentage(), 0, 6);
                    case 25:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics13 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics13.getClass();
                        return basketballTopTeamsStatistics13.getFieldGoalsPercentageAgainst();
                    case 26:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem14 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem14.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem14.getFieldGoalsPercentageAgainst(), 0, 6);
                    case 27:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics14 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics14.getClass();
                        return basketballTopTeamsStatistics14.getThreePointsPercentage();
                    case 28:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem15 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem15.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem15.getThreePointsPercentage(), 0, 6);
                    default:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics15 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics15.getClass();
                        return basketballTopTeamsStatistics15.getThreePointsPercentageAgainst();
                }
            }
        }, new uoj(0));
        voj vojVar9 = new voj("THREE_POINTERS", 8, R.string.three_pointers, new uoj(1), new uoj(2));
        voj vojVar10 = new voj("ASSISTS", 9, R.string.basketball_assists, new qaj(17), new qaj(18));
        voj vojVar11 = new voj("REBOUNDS", 10, R.string.rebounds, new qaj(20), new qaj(21));
        voj vojVar12 = new voj("DEFENSIVE_REBOUNDS", 11, R.string.defensive_rebounds, new qaj(22), new qaj(23));
        voj vojVar13 = new voj("OFFENSIVE_REBOUNDS", 12, R.string.offensive_rebounds, new qaj(24), new qaj(25));
        voj vojVar14 = new voj("STEALS", 13, R.string.steals, new qaj(26), new qaj(28));
        final int i14 = 0;
        voj vojVar15 = new voj("TURNOVERS", 14, R.string.turnovers, new qaj(29), new Function1() { // from class: toj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem, basketballTopTeamsStatisticsItem.getTurnovers());
                    case 1:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics.getClass();
                        return basketballTopTeamsStatistics.getPointsAgainst();
                    case 2:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics2 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics2.getClass();
                        return basketballTopTeamsStatistics2.getBlocks();
                    case 3:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem2 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem2.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem2, basketballTopTeamsStatisticsItem2.getBlocks());
                    case 4:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics3 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics3.getClass();
                        return basketballTopTeamsStatistics3.getFastbreakPoints();
                    case 5:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem3 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem3.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem3, basketballTopTeamsStatisticsItem3.getFastbreakPoints());
                    case 6:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics4 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics4.getClass();
                        return basketballTopTeamsStatistics4.getTrueShootingPercentage();
                    case 7:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem4 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem4.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem4.getTrueShootingPercentage(), 0, 6);
                    case 8:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics5 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics5.getClass();
                        return basketballTopTeamsStatistics5.getFreeThrowsPercentage();
                    case 9:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics6 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics6.getClass();
                        return basketballTopTeamsStatistics6.getEffectiveFieldGoalPercentage();
                    case 10:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem5 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem5.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem5.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 11:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics7 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics7.getClass();
                        return basketballTopTeamsStatistics7.getPace();
                    case 12:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem6 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem6.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem6.getPace());
                    case 13:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem7 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem7.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem7, basketballTopTeamsStatisticsItem7.getPointsAgainst());
                    case 14:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics8 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics8.getClass();
                        return basketballTopTeamsStatistics8.getOffensiveRating();
                    case 15:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem8 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem8.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem8.getOffensiveRating());
                    case 16:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics9 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics9.getClass();
                        return basketballTopTeamsStatistics9.getDefensiveRating();
                    case 17:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem9 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem9.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem9.getDefensiveRating());
                    case 18:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics10 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics10.getClass();
                        return basketballTopTeamsStatistics10.getNetRating();
                    case 19:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem10 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem10.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem10.getFreeThrowsPercentage(), 0, 6);
                    case 20:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem11 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem11.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem11.getNetRating());
                    case 21:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics11 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics11.getClass();
                        return basketballTopTeamsStatistics11.getPlusMinus();
                    case 22:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem12 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem12.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem12, basketballTopTeamsStatisticsItem12.getPlusMinus());
                    case 23:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics12 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics12.getClass();
                        return basketballTopTeamsStatistics12.getFieldGoalsPercentage();
                    case 24:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem13 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem13.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem13.getFieldGoalsPercentage(), 0, 6);
                    case 25:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics13 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics13.getClass();
                        return basketballTopTeamsStatistics13.getFieldGoalsPercentageAgainst();
                    case 26:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem14 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem14.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem14.getFieldGoalsPercentageAgainst(), 0, 6);
                    case 27:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics14 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics14.getClass();
                        return basketballTopTeamsStatistics14.getThreePointsPercentage();
                    case 28:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem15 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem15.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem15.getThreePointsPercentage(), 0, 6);
                    default:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics15 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics15.getClass();
                        return basketballTopTeamsStatistics15.getThreePointsPercentageAgainst();
                }
            }
        });
        final int i15 = 2;
        final int i16 = 3;
        voj vojVar16 = new voj("BLOCKS", 15, R.string.blocks, new Function1() { // from class: toj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i15) {
                    case 0:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem, basketballTopTeamsStatisticsItem.getTurnovers());
                    case 1:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics.getClass();
                        return basketballTopTeamsStatistics.getPointsAgainst();
                    case 2:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics2 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics2.getClass();
                        return basketballTopTeamsStatistics2.getBlocks();
                    case 3:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem2 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem2.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem2, basketballTopTeamsStatisticsItem2.getBlocks());
                    case 4:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics3 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics3.getClass();
                        return basketballTopTeamsStatistics3.getFastbreakPoints();
                    case 5:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem3 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem3.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem3, basketballTopTeamsStatisticsItem3.getFastbreakPoints());
                    case 6:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics4 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics4.getClass();
                        return basketballTopTeamsStatistics4.getTrueShootingPercentage();
                    case 7:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem4 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem4.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem4.getTrueShootingPercentage(), 0, 6);
                    case 8:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics5 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics5.getClass();
                        return basketballTopTeamsStatistics5.getFreeThrowsPercentage();
                    case 9:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics6 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics6.getClass();
                        return basketballTopTeamsStatistics6.getEffectiveFieldGoalPercentage();
                    case 10:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem5 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem5.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem5.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 11:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics7 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics7.getClass();
                        return basketballTopTeamsStatistics7.getPace();
                    case 12:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem6 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem6.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem6.getPace());
                    case 13:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem7 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem7.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem7, basketballTopTeamsStatisticsItem7.getPointsAgainst());
                    case 14:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics8 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics8.getClass();
                        return basketballTopTeamsStatistics8.getOffensiveRating();
                    case 15:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem8 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem8.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem8.getOffensiveRating());
                    case 16:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics9 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics9.getClass();
                        return basketballTopTeamsStatistics9.getDefensiveRating();
                    case 17:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem9 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem9.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem9.getDefensiveRating());
                    case 18:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics10 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics10.getClass();
                        return basketballTopTeamsStatistics10.getNetRating();
                    case 19:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem10 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem10.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem10.getFreeThrowsPercentage(), 0, 6);
                    case 20:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem11 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem11.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem11.getNetRating());
                    case 21:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics11 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics11.getClass();
                        return basketballTopTeamsStatistics11.getPlusMinus();
                    case 22:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem12 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem12.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem12, basketballTopTeamsStatisticsItem12.getPlusMinus());
                    case 23:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics12 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics12.getClass();
                        return basketballTopTeamsStatistics12.getFieldGoalsPercentage();
                    case 24:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem13 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem13.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem13.getFieldGoalsPercentage(), 0, 6);
                    case 25:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics13 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics13.getClass();
                        return basketballTopTeamsStatistics13.getFieldGoalsPercentageAgainst();
                    case 26:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem14 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem14.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem14.getFieldGoalsPercentageAgainst(), 0, 6);
                    case 27:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics14 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics14.getClass();
                        return basketballTopTeamsStatistics14.getThreePointsPercentage();
                    case 28:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem15 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem15.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem15.getThreePointsPercentage(), 0, 6);
                    default:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics15 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics15.getClass();
                        return basketballTopTeamsStatistics15.getThreePointsPercentageAgainst();
                }
            }
        }, new Function1() { // from class: toj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i16) {
                    case 0:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem, basketballTopTeamsStatisticsItem.getTurnovers());
                    case 1:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics.getClass();
                        return basketballTopTeamsStatistics.getPointsAgainst();
                    case 2:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics2 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics2.getClass();
                        return basketballTopTeamsStatistics2.getBlocks();
                    case 3:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem2 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem2.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem2, basketballTopTeamsStatisticsItem2.getBlocks());
                    case 4:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics3 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics3.getClass();
                        return basketballTopTeamsStatistics3.getFastbreakPoints();
                    case 5:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem3 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem3.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem3, basketballTopTeamsStatisticsItem3.getFastbreakPoints());
                    case 6:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics4 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics4.getClass();
                        return basketballTopTeamsStatistics4.getTrueShootingPercentage();
                    case 7:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem4 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem4.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem4.getTrueShootingPercentage(), 0, 6);
                    case 8:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics5 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics5.getClass();
                        return basketballTopTeamsStatistics5.getFreeThrowsPercentage();
                    case 9:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics6 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics6.getClass();
                        return basketballTopTeamsStatistics6.getEffectiveFieldGoalPercentage();
                    case 10:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem5 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem5.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem5.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 11:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics7 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics7.getClass();
                        return basketballTopTeamsStatistics7.getPace();
                    case 12:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem6 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem6.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem6.getPace());
                    case 13:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem7 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem7.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem7, basketballTopTeamsStatisticsItem7.getPointsAgainst());
                    case 14:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics8 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics8.getClass();
                        return basketballTopTeamsStatistics8.getOffensiveRating();
                    case 15:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem8 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem8.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem8.getOffensiveRating());
                    case 16:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics9 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics9.getClass();
                        return basketballTopTeamsStatistics9.getDefensiveRating();
                    case 17:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem9 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem9.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem9.getDefensiveRating());
                    case 18:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics10 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics10.getClass();
                        return basketballTopTeamsStatistics10.getNetRating();
                    case 19:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem10 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem10.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem10.getFreeThrowsPercentage(), 0, 6);
                    case 20:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem11 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem11.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem11.getNetRating());
                    case 21:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics11 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics11.getClass();
                        return basketballTopTeamsStatistics11.getPlusMinus();
                    case 22:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem12 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem12.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem12, basketballTopTeamsStatisticsItem12.getPlusMinus());
                    case 23:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics12 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics12.getClass();
                        return basketballTopTeamsStatistics12.getFieldGoalsPercentage();
                    case 24:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem13 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem13.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem13.getFieldGoalsPercentage(), 0, 6);
                    case 25:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics13 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics13.getClass();
                        return basketballTopTeamsStatistics13.getFieldGoalsPercentageAgainst();
                    case 26:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem14 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem14.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem14.getFieldGoalsPercentageAgainst(), 0, 6);
                    case 27:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics14 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics14.getClass();
                        return basketballTopTeamsStatistics14.getThreePointsPercentage();
                    case 28:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem15 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem15.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem15.getThreePointsPercentage(), 0, 6);
                    default:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics15 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics15.getClass();
                        return basketballTopTeamsStatistics15.getThreePointsPercentageAgainst();
                }
            }
        });
        final int i17 = 4;
        final int i18 = 5;
        voj vojVar17 = new voj("FASTBREAK_POINTS", 16, R.string.basketball_fast_break_points, new Function1() { // from class: toj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i17) {
                    case 0:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem, basketballTopTeamsStatisticsItem.getTurnovers());
                    case 1:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics.getClass();
                        return basketballTopTeamsStatistics.getPointsAgainst();
                    case 2:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics2 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics2.getClass();
                        return basketballTopTeamsStatistics2.getBlocks();
                    case 3:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem2 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem2.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem2, basketballTopTeamsStatisticsItem2.getBlocks());
                    case 4:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics3 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics3.getClass();
                        return basketballTopTeamsStatistics3.getFastbreakPoints();
                    case 5:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem3 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem3.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem3, basketballTopTeamsStatisticsItem3.getFastbreakPoints());
                    case 6:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics4 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics4.getClass();
                        return basketballTopTeamsStatistics4.getTrueShootingPercentage();
                    case 7:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem4 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem4.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem4.getTrueShootingPercentage(), 0, 6);
                    case 8:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics5 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics5.getClass();
                        return basketballTopTeamsStatistics5.getFreeThrowsPercentage();
                    case 9:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics6 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics6.getClass();
                        return basketballTopTeamsStatistics6.getEffectiveFieldGoalPercentage();
                    case 10:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem5 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem5.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem5.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 11:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics7 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics7.getClass();
                        return basketballTopTeamsStatistics7.getPace();
                    case 12:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem6 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem6.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem6.getPace());
                    case 13:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem7 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem7.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem7, basketballTopTeamsStatisticsItem7.getPointsAgainst());
                    case 14:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics8 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics8.getClass();
                        return basketballTopTeamsStatistics8.getOffensiveRating();
                    case 15:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem8 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem8.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem8.getOffensiveRating());
                    case 16:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics9 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics9.getClass();
                        return basketballTopTeamsStatistics9.getDefensiveRating();
                    case 17:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem9 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem9.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem9.getDefensiveRating());
                    case 18:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics10 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics10.getClass();
                        return basketballTopTeamsStatistics10.getNetRating();
                    case 19:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem10 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem10.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem10.getFreeThrowsPercentage(), 0, 6);
                    case 20:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem11 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem11.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem11.getNetRating());
                    case 21:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics11 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics11.getClass();
                        return basketballTopTeamsStatistics11.getPlusMinus();
                    case 22:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem12 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem12.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem12, basketballTopTeamsStatisticsItem12.getPlusMinus());
                    case 23:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics12 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics12.getClass();
                        return basketballTopTeamsStatistics12.getFieldGoalsPercentage();
                    case 24:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem13 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem13.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem13.getFieldGoalsPercentage(), 0, 6);
                    case 25:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics13 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics13.getClass();
                        return basketballTopTeamsStatistics13.getFieldGoalsPercentageAgainst();
                    case 26:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem14 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem14.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem14.getFieldGoalsPercentageAgainst(), 0, 6);
                    case 27:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics14 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics14.getClass();
                        return basketballTopTeamsStatistics14.getThreePointsPercentage();
                    case 28:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem15 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem15.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem15.getThreePointsPercentage(), 0, 6);
                    default:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics15 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics15.getClass();
                        return basketballTopTeamsStatistics15.getThreePointsPercentageAgainst();
                }
            }
        }, new Function1() { // from class: toj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i18) {
                    case 0:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem, basketballTopTeamsStatisticsItem.getTurnovers());
                    case 1:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics.getClass();
                        return basketballTopTeamsStatistics.getPointsAgainst();
                    case 2:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics2 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics2.getClass();
                        return basketballTopTeamsStatistics2.getBlocks();
                    case 3:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem2 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem2.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem2, basketballTopTeamsStatisticsItem2.getBlocks());
                    case 4:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics3 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics3.getClass();
                        return basketballTopTeamsStatistics3.getFastbreakPoints();
                    case 5:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem3 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem3.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem3, basketballTopTeamsStatisticsItem3.getFastbreakPoints());
                    case 6:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics4 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics4.getClass();
                        return basketballTopTeamsStatistics4.getTrueShootingPercentage();
                    case 7:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem4 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem4.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem4.getTrueShootingPercentage(), 0, 6);
                    case 8:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics5 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics5.getClass();
                        return basketballTopTeamsStatistics5.getFreeThrowsPercentage();
                    case 9:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics6 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics6.getClass();
                        return basketballTopTeamsStatistics6.getEffectiveFieldGoalPercentage();
                    case 10:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem5 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem5.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem5.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 11:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics7 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics7.getClass();
                        return basketballTopTeamsStatistics7.getPace();
                    case 12:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem6 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem6.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem6.getPace());
                    case 13:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem7 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem7.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem7, basketballTopTeamsStatisticsItem7.getPointsAgainst());
                    case 14:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics8 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics8.getClass();
                        return basketballTopTeamsStatistics8.getOffensiveRating();
                    case 15:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem8 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem8.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem8.getOffensiveRating());
                    case 16:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics9 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics9.getClass();
                        return basketballTopTeamsStatistics9.getDefensiveRating();
                    case 17:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem9 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem9.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem9.getDefensiveRating());
                    case 18:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics10 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics10.getClass();
                        return basketballTopTeamsStatistics10.getNetRating();
                    case 19:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem10 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem10.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem10.getFreeThrowsPercentage(), 0, 6);
                    case 20:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem11 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem11.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem11.getNetRating());
                    case 21:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics11 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics11.getClass();
                        return basketballTopTeamsStatistics11.getPlusMinus();
                    case 22:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem12 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem12.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem12, basketballTopTeamsStatisticsItem12.getPlusMinus());
                    case 23:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics12 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics12.getClass();
                        return basketballTopTeamsStatistics12.getFieldGoalsPercentage();
                    case 24:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem13 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem13.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem13.getFieldGoalsPercentage(), 0, 6);
                    case 25:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics13 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics13.getClass();
                        return basketballTopTeamsStatistics13.getFieldGoalsPercentageAgainst();
                    case 26:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem14 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem14.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem14.getFieldGoalsPercentageAgainst(), 0, 6);
                    case 27:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics14 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics14.getClass();
                        return basketballTopTeamsStatistics14.getThreePointsPercentage();
                    case 28:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem15 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem15.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem15.getThreePointsPercentage(), 0, 6);
                    default:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics15 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics15.getClass();
                        return basketballTopTeamsStatistics15.getThreePointsPercentageAgainst();
                }
            }
        });
        final int i19 = 6;
        final int i20 = 7;
        voj vojVar18 = new voj("TRUE_SH_PCT", 17, R.string.basketball_true_shooting_percentage, new Function1() { // from class: toj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i19) {
                    case 0:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem, basketballTopTeamsStatisticsItem.getTurnovers());
                    case 1:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics.getClass();
                        return basketballTopTeamsStatistics.getPointsAgainst();
                    case 2:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics2 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics2.getClass();
                        return basketballTopTeamsStatistics2.getBlocks();
                    case 3:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem2 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem2.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem2, basketballTopTeamsStatisticsItem2.getBlocks());
                    case 4:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics3 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics3.getClass();
                        return basketballTopTeamsStatistics3.getFastbreakPoints();
                    case 5:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem3 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem3.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem3, basketballTopTeamsStatisticsItem3.getFastbreakPoints());
                    case 6:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics4 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics4.getClass();
                        return basketballTopTeamsStatistics4.getTrueShootingPercentage();
                    case 7:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem4 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem4.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem4.getTrueShootingPercentage(), 0, 6);
                    case 8:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics5 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics5.getClass();
                        return basketballTopTeamsStatistics5.getFreeThrowsPercentage();
                    case 9:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics6 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics6.getClass();
                        return basketballTopTeamsStatistics6.getEffectiveFieldGoalPercentage();
                    case 10:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem5 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem5.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem5.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 11:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics7 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics7.getClass();
                        return basketballTopTeamsStatistics7.getPace();
                    case 12:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem6 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem6.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem6.getPace());
                    case 13:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem7 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem7.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem7, basketballTopTeamsStatisticsItem7.getPointsAgainst());
                    case 14:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics8 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics8.getClass();
                        return basketballTopTeamsStatistics8.getOffensiveRating();
                    case 15:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem8 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem8.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem8.getOffensiveRating());
                    case 16:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics9 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics9.getClass();
                        return basketballTopTeamsStatistics9.getDefensiveRating();
                    case 17:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem9 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem9.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem9.getDefensiveRating());
                    case 18:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics10 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics10.getClass();
                        return basketballTopTeamsStatistics10.getNetRating();
                    case 19:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem10 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem10.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem10.getFreeThrowsPercentage(), 0, 6);
                    case 20:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem11 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem11.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem11.getNetRating());
                    case 21:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics11 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics11.getClass();
                        return basketballTopTeamsStatistics11.getPlusMinus();
                    case 22:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem12 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem12.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem12, basketballTopTeamsStatisticsItem12.getPlusMinus());
                    case 23:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics12 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics12.getClass();
                        return basketballTopTeamsStatistics12.getFieldGoalsPercentage();
                    case 24:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem13 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem13.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem13.getFieldGoalsPercentage(), 0, 6);
                    case 25:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics13 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics13.getClass();
                        return basketballTopTeamsStatistics13.getFieldGoalsPercentageAgainst();
                    case 26:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem14 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem14.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem14.getFieldGoalsPercentageAgainst(), 0, 6);
                    case 27:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics14 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics14.getClass();
                        return basketballTopTeamsStatistics14.getThreePointsPercentage();
                    case 28:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem15 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem15.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem15.getThreePointsPercentage(), 0, 6);
                    default:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics15 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics15.getClass();
                        return basketballTopTeamsStatistics15.getThreePointsPercentageAgainst();
                }
            }
        }, new Function1() { // from class: toj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i20) {
                    case 0:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem, basketballTopTeamsStatisticsItem.getTurnovers());
                    case 1:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics.getClass();
                        return basketballTopTeamsStatistics.getPointsAgainst();
                    case 2:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics2 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics2.getClass();
                        return basketballTopTeamsStatistics2.getBlocks();
                    case 3:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem2 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem2.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem2, basketballTopTeamsStatisticsItem2.getBlocks());
                    case 4:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics3 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics3.getClass();
                        return basketballTopTeamsStatistics3.getFastbreakPoints();
                    case 5:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem3 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem3.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem3, basketballTopTeamsStatisticsItem3.getFastbreakPoints());
                    case 6:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics4 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics4.getClass();
                        return basketballTopTeamsStatistics4.getTrueShootingPercentage();
                    case 7:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem4 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem4.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem4.getTrueShootingPercentage(), 0, 6);
                    case 8:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics5 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics5.getClass();
                        return basketballTopTeamsStatistics5.getFreeThrowsPercentage();
                    case 9:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics6 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics6.getClass();
                        return basketballTopTeamsStatistics6.getEffectiveFieldGoalPercentage();
                    case 10:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem5 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem5.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem5.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 11:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics7 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics7.getClass();
                        return basketballTopTeamsStatistics7.getPace();
                    case 12:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem6 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem6.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem6.getPace());
                    case 13:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem7 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem7.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem7, basketballTopTeamsStatisticsItem7.getPointsAgainst());
                    case 14:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics8 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics8.getClass();
                        return basketballTopTeamsStatistics8.getOffensiveRating();
                    case 15:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem8 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem8.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem8.getOffensiveRating());
                    case 16:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics9 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics9.getClass();
                        return basketballTopTeamsStatistics9.getDefensiveRating();
                    case 17:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem9 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem9.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem9.getDefensiveRating());
                    case 18:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics10 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics10.getClass();
                        return basketballTopTeamsStatistics10.getNetRating();
                    case 19:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem10 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem10.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem10.getFreeThrowsPercentage(), 0, 6);
                    case 20:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem11 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem11.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem11.getNetRating());
                    case 21:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics11 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics11.getClass();
                        return basketballTopTeamsStatistics11.getPlusMinus();
                    case 22:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem12 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem12.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem12, basketballTopTeamsStatisticsItem12.getPlusMinus());
                    case 23:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics12 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics12.getClass();
                        return basketballTopTeamsStatistics12.getFieldGoalsPercentage();
                    case 24:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem13 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem13.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem13.getFieldGoalsPercentage(), 0, 6);
                    case 25:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics13 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics13.getClass();
                        return basketballTopTeamsStatistics13.getFieldGoalsPercentageAgainst();
                    case 26:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem14 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem14.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem14.getFieldGoalsPercentageAgainst(), 0, 6);
                    case 27:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics14 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics14.getClass();
                        return basketballTopTeamsStatistics14.getThreePointsPercentage();
                    case 28:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem15 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem15.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem15.getThreePointsPercentage(), 0, 6);
                    default:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics15 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics15.getClass();
                        return basketballTopTeamsStatistics15.getThreePointsPercentageAgainst();
                }
            }
        });
        final int i21 = 9;
        final int i22 = 10;
        voj vojVar19 = new voj("EFF_FG_PCT", 18, R.string.basketball_effective_field_goal_percentage, new Function1() { // from class: toj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i21) {
                    case 0:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem, basketballTopTeamsStatisticsItem.getTurnovers());
                    case 1:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics.getClass();
                        return basketballTopTeamsStatistics.getPointsAgainst();
                    case 2:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics2 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics2.getClass();
                        return basketballTopTeamsStatistics2.getBlocks();
                    case 3:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem2 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem2.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem2, basketballTopTeamsStatisticsItem2.getBlocks());
                    case 4:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics3 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics3.getClass();
                        return basketballTopTeamsStatistics3.getFastbreakPoints();
                    case 5:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem3 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem3.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem3, basketballTopTeamsStatisticsItem3.getFastbreakPoints());
                    case 6:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics4 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics4.getClass();
                        return basketballTopTeamsStatistics4.getTrueShootingPercentage();
                    case 7:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem4 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem4.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem4.getTrueShootingPercentage(), 0, 6);
                    case 8:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics5 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics5.getClass();
                        return basketballTopTeamsStatistics5.getFreeThrowsPercentage();
                    case 9:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics6 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics6.getClass();
                        return basketballTopTeamsStatistics6.getEffectiveFieldGoalPercentage();
                    case 10:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem5 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem5.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem5.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 11:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics7 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics7.getClass();
                        return basketballTopTeamsStatistics7.getPace();
                    case 12:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem6 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem6.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem6.getPace());
                    case 13:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem7 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem7.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem7, basketballTopTeamsStatisticsItem7.getPointsAgainst());
                    case 14:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics8 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics8.getClass();
                        return basketballTopTeamsStatistics8.getOffensiveRating();
                    case 15:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem8 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem8.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem8.getOffensiveRating());
                    case 16:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics9 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics9.getClass();
                        return basketballTopTeamsStatistics9.getDefensiveRating();
                    case 17:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem9 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem9.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem9.getDefensiveRating());
                    case 18:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics10 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics10.getClass();
                        return basketballTopTeamsStatistics10.getNetRating();
                    case 19:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem10 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem10.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem10.getFreeThrowsPercentage(), 0, 6);
                    case 20:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem11 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem11.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem11.getNetRating());
                    case 21:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics11 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics11.getClass();
                        return basketballTopTeamsStatistics11.getPlusMinus();
                    case 22:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem12 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem12.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem12, basketballTopTeamsStatisticsItem12.getPlusMinus());
                    case 23:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics12 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics12.getClass();
                        return basketballTopTeamsStatistics12.getFieldGoalsPercentage();
                    case 24:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem13 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem13.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem13.getFieldGoalsPercentage(), 0, 6);
                    case 25:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics13 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics13.getClass();
                        return basketballTopTeamsStatistics13.getFieldGoalsPercentageAgainst();
                    case 26:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem14 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem14.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem14.getFieldGoalsPercentageAgainst(), 0, 6);
                    case 27:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics14 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics14.getClass();
                        return basketballTopTeamsStatistics14.getThreePointsPercentage();
                    case 28:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem15 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem15.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem15.getThreePointsPercentage(), 0, 6);
                    default:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics15 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics15.getClass();
                        return basketballTopTeamsStatistics15.getThreePointsPercentageAgainst();
                }
            }
        }, new Function1() { // from class: toj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i22) {
                    case 0:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem, basketballTopTeamsStatisticsItem.getTurnovers());
                    case 1:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics.getClass();
                        return basketballTopTeamsStatistics.getPointsAgainst();
                    case 2:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics2 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics2.getClass();
                        return basketballTopTeamsStatistics2.getBlocks();
                    case 3:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem2 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem2.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem2, basketballTopTeamsStatisticsItem2.getBlocks());
                    case 4:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics3 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics3.getClass();
                        return basketballTopTeamsStatistics3.getFastbreakPoints();
                    case 5:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem3 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem3.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem3, basketballTopTeamsStatisticsItem3.getFastbreakPoints());
                    case 6:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics4 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics4.getClass();
                        return basketballTopTeamsStatistics4.getTrueShootingPercentage();
                    case 7:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem4 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem4.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem4.getTrueShootingPercentage(), 0, 6);
                    case 8:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics5 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics5.getClass();
                        return basketballTopTeamsStatistics5.getFreeThrowsPercentage();
                    case 9:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics6 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics6.getClass();
                        return basketballTopTeamsStatistics6.getEffectiveFieldGoalPercentage();
                    case 10:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem5 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem5.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem5.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 11:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics7 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics7.getClass();
                        return basketballTopTeamsStatistics7.getPace();
                    case 12:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem6 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem6.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem6.getPace());
                    case 13:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem7 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem7.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem7, basketballTopTeamsStatisticsItem7.getPointsAgainst());
                    case 14:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics8 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics8.getClass();
                        return basketballTopTeamsStatistics8.getOffensiveRating();
                    case 15:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem8 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem8.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem8.getOffensiveRating());
                    case 16:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics9 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics9.getClass();
                        return basketballTopTeamsStatistics9.getDefensiveRating();
                    case 17:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem9 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem9.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem9.getDefensiveRating());
                    case 18:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics10 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics10.getClass();
                        return basketballTopTeamsStatistics10.getNetRating();
                    case 19:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem10 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem10.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem10.getFreeThrowsPercentage(), 0, 6);
                    case 20:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem11 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem11.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem11.getNetRating());
                    case 21:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics11 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics11.getClass();
                        return basketballTopTeamsStatistics11.getPlusMinus();
                    case 22:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem12 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem12.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem12, basketballTopTeamsStatisticsItem12.getPlusMinus());
                    case 23:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics12 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics12.getClass();
                        return basketballTopTeamsStatistics12.getFieldGoalsPercentage();
                    case 24:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem13 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem13.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem13.getFieldGoalsPercentage(), 0, 6);
                    case 25:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics13 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics13.getClass();
                        return basketballTopTeamsStatistics13.getFieldGoalsPercentageAgainst();
                    case 26:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem14 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem14.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem14.getFieldGoalsPercentageAgainst(), 0, 6);
                    case 27:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics14 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics14.getClass();
                        return basketballTopTeamsStatistics14.getThreePointsPercentage();
                    case 28:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem15 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem15.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem15.getThreePointsPercentage(), 0, 6);
                    default:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics15 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics15.getClass();
                        return basketballTopTeamsStatistics15.getThreePointsPercentageAgainst();
                }
            }
        });
        final int i23 = 11;
        final int i24 = 12;
        voj vojVar20 = new voj("PACE", 19, R.string.basketball_pace_factor, new Function1() { // from class: toj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i23) {
                    case 0:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem, basketballTopTeamsStatisticsItem.getTurnovers());
                    case 1:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics.getClass();
                        return basketballTopTeamsStatistics.getPointsAgainst();
                    case 2:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics2 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics2.getClass();
                        return basketballTopTeamsStatistics2.getBlocks();
                    case 3:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem2 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem2.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem2, basketballTopTeamsStatisticsItem2.getBlocks());
                    case 4:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics3 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics3.getClass();
                        return basketballTopTeamsStatistics3.getFastbreakPoints();
                    case 5:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem3 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem3.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem3, basketballTopTeamsStatisticsItem3.getFastbreakPoints());
                    case 6:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics4 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics4.getClass();
                        return basketballTopTeamsStatistics4.getTrueShootingPercentage();
                    case 7:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem4 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem4.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem4.getTrueShootingPercentage(), 0, 6);
                    case 8:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics5 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics5.getClass();
                        return basketballTopTeamsStatistics5.getFreeThrowsPercentage();
                    case 9:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics6 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics6.getClass();
                        return basketballTopTeamsStatistics6.getEffectiveFieldGoalPercentage();
                    case 10:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem5 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem5.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem5.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 11:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics7 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics7.getClass();
                        return basketballTopTeamsStatistics7.getPace();
                    case 12:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem6 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem6.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem6.getPace());
                    case 13:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem7 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem7.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem7, basketballTopTeamsStatisticsItem7.getPointsAgainst());
                    case 14:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics8 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics8.getClass();
                        return basketballTopTeamsStatistics8.getOffensiveRating();
                    case 15:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem8 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem8.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem8.getOffensiveRating());
                    case 16:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics9 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics9.getClass();
                        return basketballTopTeamsStatistics9.getDefensiveRating();
                    case 17:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem9 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem9.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem9.getDefensiveRating());
                    case 18:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics10 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics10.getClass();
                        return basketballTopTeamsStatistics10.getNetRating();
                    case 19:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem10 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem10.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem10.getFreeThrowsPercentage(), 0, 6);
                    case 20:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem11 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem11.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem11.getNetRating());
                    case 21:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics11 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics11.getClass();
                        return basketballTopTeamsStatistics11.getPlusMinus();
                    case 22:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem12 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem12.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem12, basketballTopTeamsStatisticsItem12.getPlusMinus());
                    case 23:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics12 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics12.getClass();
                        return basketballTopTeamsStatistics12.getFieldGoalsPercentage();
                    case 24:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem13 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem13.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem13.getFieldGoalsPercentage(), 0, 6);
                    case 25:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics13 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics13.getClass();
                        return basketballTopTeamsStatistics13.getFieldGoalsPercentageAgainst();
                    case 26:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem14 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem14.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem14.getFieldGoalsPercentageAgainst(), 0, 6);
                    case 27:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics14 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics14.getClass();
                        return basketballTopTeamsStatistics14.getThreePointsPercentage();
                    case 28:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem15 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem15.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem15.getThreePointsPercentage(), 0, 6);
                    default:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics15 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics15.getClass();
                        return basketballTopTeamsStatistics15.getThreePointsPercentageAgainst();
                }
            }
        }, new Function1() { // from class: toj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i24) {
                    case 0:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem, basketballTopTeamsStatisticsItem.getTurnovers());
                    case 1:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics.getClass();
                        return basketballTopTeamsStatistics.getPointsAgainst();
                    case 2:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics2 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics2.getClass();
                        return basketballTopTeamsStatistics2.getBlocks();
                    case 3:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem2 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem2.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem2, basketballTopTeamsStatisticsItem2.getBlocks());
                    case 4:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics3 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics3.getClass();
                        return basketballTopTeamsStatistics3.getFastbreakPoints();
                    case 5:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem3 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem3.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem3, basketballTopTeamsStatisticsItem3.getFastbreakPoints());
                    case 6:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics4 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics4.getClass();
                        return basketballTopTeamsStatistics4.getTrueShootingPercentage();
                    case 7:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem4 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem4.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem4.getTrueShootingPercentage(), 0, 6);
                    case 8:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics5 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics5.getClass();
                        return basketballTopTeamsStatistics5.getFreeThrowsPercentage();
                    case 9:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics6 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics6.getClass();
                        return basketballTopTeamsStatistics6.getEffectiveFieldGoalPercentage();
                    case 10:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem5 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem5.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem5.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 11:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics7 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics7.getClass();
                        return basketballTopTeamsStatistics7.getPace();
                    case 12:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem6 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem6.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem6.getPace());
                    case 13:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem7 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem7.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem7, basketballTopTeamsStatisticsItem7.getPointsAgainst());
                    case 14:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics8 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics8.getClass();
                        return basketballTopTeamsStatistics8.getOffensiveRating();
                    case 15:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem8 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem8.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem8.getOffensiveRating());
                    case 16:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics9 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics9.getClass();
                        return basketballTopTeamsStatistics9.getDefensiveRating();
                    case 17:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem9 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem9.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem9.getDefensiveRating());
                    case 18:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics10 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics10.getClass();
                        return basketballTopTeamsStatistics10.getNetRating();
                    case 19:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem10 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem10.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem10.getFreeThrowsPercentage(), 0, 6);
                    case 20:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem11 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem11.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem11.getNetRating());
                    case 21:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics11 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics11.getClass();
                        return basketballTopTeamsStatistics11.getPlusMinus();
                    case 22:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem12 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem12.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem12, basketballTopTeamsStatisticsItem12.getPlusMinus());
                    case 23:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics12 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics12.getClass();
                        return basketballTopTeamsStatistics12.getFieldGoalsPercentage();
                    case 24:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem13 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem13.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem13.getFieldGoalsPercentage(), 0, 6);
                    case 25:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics13 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics13.getClass();
                        return basketballTopTeamsStatistics13.getFieldGoalsPercentageAgainst();
                    case 26:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem14 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem14.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem14.getFieldGoalsPercentageAgainst(), 0, 6);
                    case 27:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics14 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics14.getClass();
                        return basketballTopTeamsStatistics14.getThreePointsPercentage();
                    case 28:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem15 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem15.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem15.getThreePointsPercentage(), 0, 6);
                    default:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics15 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics15.getClass();
                        return basketballTopTeamsStatistics15.getThreePointsPercentageAgainst();
                }
            }
        });
        final int i25 = 14;
        final int i26 = 15;
        voj vojVar21 = new voj("OFF_RATING", 20, R.string.basketball_offensive_rating, new Function1() { // from class: toj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i25) {
                    case 0:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem, basketballTopTeamsStatisticsItem.getTurnovers());
                    case 1:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics.getClass();
                        return basketballTopTeamsStatistics.getPointsAgainst();
                    case 2:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics2 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics2.getClass();
                        return basketballTopTeamsStatistics2.getBlocks();
                    case 3:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem2 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem2.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem2, basketballTopTeamsStatisticsItem2.getBlocks());
                    case 4:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics3 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics3.getClass();
                        return basketballTopTeamsStatistics3.getFastbreakPoints();
                    case 5:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem3 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem3.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem3, basketballTopTeamsStatisticsItem3.getFastbreakPoints());
                    case 6:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics4 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics4.getClass();
                        return basketballTopTeamsStatistics4.getTrueShootingPercentage();
                    case 7:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem4 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem4.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem4.getTrueShootingPercentage(), 0, 6);
                    case 8:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics5 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics5.getClass();
                        return basketballTopTeamsStatistics5.getFreeThrowsPercentage();
                    case 9:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics6 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics6.getClass();
                        return basketballTopTeamsStatistics6.getEffectiveFieldGoalPercentage();
                    case 10:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem5 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem5.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem5.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 11:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics7 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics7.getClass();
                        return basketballTopTeamsStatistics7.getPace();
                    case 12:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem6 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem6.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem6.getPace());
                    case 13:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem7 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem7.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem7, basketballTopTeamsStatisticsItem7.getPointsAgainst());
                    case 14:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics8 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics8.getClass();
                        return basketballTopTeamsStatistics8.getOffensiveRating();
                    case 15:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem8 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem8.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem8.getOffensiveRating());
                    case 16:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics9 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics9.getClass();
                        return basketballTopTeamsStatistics9.getDefensiveRating();
                    case 17:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem9 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem9.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem9.getDefensiveRating());
                    case 18:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics10 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics10.getClass();
                        return basketballTopTeamsStatistics10.getNetRating();
                    case 19:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem10 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem10.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem10.getFreeThrowsPercentage(), 0, 6);
                    case 20:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem11 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem11.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem11.getNetRating());
                    case 21:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics11 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics11.getClass();
                        return basketballTopTeamsStatistics11.getPlusMinus();
                    case 22:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem12 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem12.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem12, basketballTopTeamsStatisticsItem12.getPlusMinus());
                    case 23:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics12 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics12.getClass();
                        return basketballTopTeamsStatistics12.getFieldGoalsPercentage();
                    case 24:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem13 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem13.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem13.getFieldGoalsPercentage(), 0, 6);
                    case 25:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics13 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics13.getClass();
                        return basketballTopTeamsStatistics13.getFieldGoalsPercentageAgainst();
                    case 26:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem14 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem14.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem14.getFieldGoalsPercentageAgainst(), 0, 6);
                    case 27:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics14 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics14.getClass();
                        return basketballTopTeamsStatistics14.getThreePointsPercentage();
                    case 28:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem15 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem15.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem15.getThreePointsPercentage(), 0, 6);
                    default:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics15 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics15.getClass();
                        return basketballTopTeamsStatistics15.getThreePointsPercentageAgainst();
                }
            }
        }, new Function1() { // from class: toj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i26) {
                    case 0:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem, basketballTopTeamsStatisticsItem.getTurnovers());
                    case 1:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics.getClass();
                        return basketballTopTeamsStatistics.getPointsAgainst();
                    case 2:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics2 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics2.getClass();
                        return basketballTopTeamsStatistics2.getBlocks();
                    case 3:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem2 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem2.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem2, basketballTopTeamsStatisticsItem2.getBlocks());
                    case 4:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics3 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics3.getClass();
                        return basketballTopTeamsStatistics3.getFastbreakPoints();
                    case 5:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem3 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem3.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem3, basketballTopTeamsStatisticsItem3.getFastbreakPoints());
                    case 6:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics4 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics4.getClass();
                        return basketballTopTeamsStatistics4.getTrueShootingPercentage();
                    case 7:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem4 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem4.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem4.getTrueShootingPercentage(), 0, 6);
                    case 8:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics5 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics5.getClass();
                        return basketballTopTeamsStatistics5.getFreeThrowsPercentage();
                    case 9:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics6 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics6.getClass();
                        return basketballTopTeamsStatistics6.getEffectiveFieldGoalPercentage();
                    case 10:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem5 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem5.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem5.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 11:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics7 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics7.getClass();
                        return basketballTopTeamsStatistics7.getPace();
                    case 12:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem6 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem6.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem6.getPace());
                    case 13:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem7 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem7.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem7, basketballTopTeamsStatisticsItem7.getPointsAgainst());
                    case 14:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics8 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics8.getClass();
                        return basketballTopTeamsStatistics8.getOffensiveRating();
                    case 15:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem8 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem8.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem8.getOffensiveRating());
                    case 16:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics9 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics9.getClass();
                        return basketballTopTeamsStatistics9.getDefensiveRating();
                    case 17:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem9 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem9.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem9.getDefensiveRating());
                    case 18:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics10 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics10.getClass();
                        return basketballTopTeamsStatistics10.getNetRating();
                    case 19:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem10 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem10.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem10.getFreeThrowsPercentage(), 0, 6);
                    case 20:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem11 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem11.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem11.getNetRating());
                    case 21:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics11 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics11.getClass();
                        return basketballTopTeamsStatistics11.getPlusMinus();
                    case 22:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem12 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem12.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem12, basketballTopTeamsStatisticsItem12.getPlusMinus());
                    case 23:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics12 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics12.getClass();
                        return basketballTopTeamsStatistics12.getFieldGoalsPercentage();
                    case 24:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem13 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem13.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem13.getFieldGoalsPercentage(), 0, 6);
                    case 25:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics13 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics13.getClass();
                        return basketballTopTeamsStatistics13.getFieldGoalsPercentageAgainst();
                    case 26:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem14 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem14.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem14.getFieldGoalsPercentageAgainst(), 0, 6);
                    case 27:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics14 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics14.getClass();
                        return basketballTopTeamsStatistics14.getThreePointsPercentage();
                    case 28:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem15 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem15.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem15.getThreePointsPercentage(), 0, 6);
                    default:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics15 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics15.getClass();
                        return basketballTopTeamsStatistics15.getThreePointsPercentageAgainst();
                }
            }
        });
        final int i27 = 16;
        final int i28 = 17;
        voj vojVar22 = new voj("DEF_RATING", 21, R.string.basketball_defensive_rating, new Function1() { // from class: toj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i27) {
                    case 0:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem, basketballTopTeamsStatisticsItem.getTurnovers());
                    case 1:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics.getClass();
                        return basketballTopTeamsStatistics.getPointsAgainst();
                    case 2:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics2 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics2.getClass();
                        return basketballTopTeamsStatistics2.getBlocks();
                    case 3:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem2 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem2.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem2, basketballTopTeamsStatisticsItem2.getBlocks());
                    case 4:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics3 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics3.getClass();
                        return basketballTopTeamsStatistics3.getFastbreakPoints();
                    case 5:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem3 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem3.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem3, basketballTopTeamsStatisticsItem3.getFastbreakPoints());
                    case 6:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics4 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics4.getClass();
                        return basketballTopTeamsStatistics4.getTrueShootingPercentage();
                    case 7:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem4 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem4.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem4.getTrueShootingPercentage(), 0, 6);
                    case 8:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics5 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics5.getClass();
                        return basketballTopTeamsStatistics5.getFreeThrowsPercentage();
                    case 9:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics6 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics6.getClass();
                        return basketballTopTeamsStatistics6.getEffectiveFieldGoalPercentage();
                    case 10:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem5 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem5.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem5.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 11:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics7 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics7.getClass();
                        return basketballTopTeamsStatistics7.getPace();
                    case 12:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem6 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem6.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem6.getPace());
                    case 13:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem7 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem7.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem7, basketballTopTeamsStatisticsItem7.getPointsAgainst());
                    case 14:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics8 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics8.getClass();
                        return basketballTopTeamsStatistics8.getOffensiveRating();
                    case 15:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem8 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem8.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem8.getOffensiveRating());
                    case 16:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics9 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics9.getClass();
                        return basketballTopTeamsStatistics9.getDefensiveRating();
                    case 17:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem9 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem9.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem9.getDefensiveRating());
                    case 18:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics10 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics10.getClass();
                        return basketballTopTeamsStatistics10.getNetRating();
                    case 19:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem10 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem10.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem10.getFreeThrowsPercentage(), 0, 6);
                    case 20:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem11 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem11.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem11.getNetRating());
                    case 21:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics11 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics11.getClass();
                        return basketballTopTeamsStatistics11.getPlusMinus();
                    case 22:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem12 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem12.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem12, basketballTopTeamsStatisticsItem12.getPlusMinus());
                    case 23:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics12 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics12.getClass();
                        return basketballTopTeamsStatistics12.getFieldGoalsPercentage();
                    case 24:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem13 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem13.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem13.getFieldGoalsPercentage(), 0, 6);
                    case 25:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics13 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics13.getClass();
                        return basketballTopTeamsStatistics13.getFieldGoalsPercentageAgainst();
                    case 26:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem14 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem14.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem14.getFieldGoalsPercentageAgainst(), 0, 6);
                    case 27:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics14 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics14.getClass();
                        return basketballTopTeamsStatistics14.getThreePointsPercentage();
                    case 28:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem15 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem15.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem15.getThreePointsPercentage(), 0, 6);
                    default:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics15 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics15.getClass();
                        return basketballTopTeamsStatistics15.getThreePointsPercentageAgainst();
                }
            }
        }, new Function1() { // from class: toj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i28) {
                    case 0:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem, basketballTopTeamsStatisticsItem.getTurnovers());
                    case 1:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics.getClass();
                        return basketballTopTeamsStatistics.getPointsAgainst();
                    case 2:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics2 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics2.getClass();
                        return basketballTopTeamsStatistics2.getBlocks();
                    case 3:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem2 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem2.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem2, basketballTopTeamsStatisticsItem2.getBlocks());
                    case 4:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics3 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics3.getClass();
                        return basketballTopTeamsStatistics3.getFastbreakPoints();
                    case 5:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem3 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem3.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem3, basketballTopTeamsStatisticsItem3.getFastbreakPoints());
                    case 6:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics4 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics4.getClass();
                        return basketballTopTeamsStatistics4.getTrueShootingPercentage();
                    case 7:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem4 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem4.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem4.getTrueShootingPercentage(), 0, 6);
                    case 8:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics5 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics5.getClass();
                        return basketballTopTeamsStatistics5.getFreeThrowsPercentage();
                    case 9:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics6 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics6.getClass();
                        return basketballTopTeamsStatistics6.getEffectiveFieldGoalPercentage();
                    case 10:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem5 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem5.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem5.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 11:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics7 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics7.getClass();
                        return basketballTopTeamsStatistics7.getPace();
                    case 12:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem6 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem6.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem6.getPace());
                    case 13:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem7 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem7.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem7, basketballTopTeamsStatisticsItem7.getPointsAgainst());
                    case 14:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics8 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics8.getClass();
                        return basketballTopTeamsStatistics8.getOffensiveRating();
                    case 15:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem8 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem8.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem8.getOffensiveRating());
                    case 16:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics9 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics9.getClass();
                        return basketballTopTeamsStatistics9.getDefensiveRating();
                    case 17:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem9 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem9.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem9.getDefensiveRating());
                    case 18:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics10 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics10.getClass();
                        return basketballTopTeamsStatistics10.getNetRating();
                    case 19:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem10 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem10.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem10.getFreeThrowsPercentage(), 0, 6);
                    case 20:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem11 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem11.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem11.getNetRating());
                    case 21:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics11 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics11.getClass();
                        return basketballTopTeamsStatistics11.getPlusMinus();
                    case 22:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem12 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem12.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem12, basketballTopTeamsStatisticsItem12.getPlusMinus());
                    case 23:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics12 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics12.getClass();
                        return basketballTopTeamsStatistics12.getFieldGoalsPercentage();
                    case 24:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem13 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem13.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem13.getFieldGoalsPercentage(), 0, 6);
                    case 25:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics13 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics13.getClass();
                        return basketballTopTeamsStatistics13.getFieldGoalsPercentageAgainst();
                    case 26:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem14 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem14.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem14.getFieldGoalsPercentageAgainst(), 0, 6);
                    case 27:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics14 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics14.getClass();
                        return basketballTopTeamsStatistics14.getThreePointsPercentage();
                    case 28:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem15 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem15.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem15.getThreePointsPercentage(), 0, 6);
                    default:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics15 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics15.getClass();
                        return basketballTopTeamsStatistics15.getThreePointsPercentageAgainst();
                }
            }
        });
        final int i29 = 18;
        final int i30 = 20;
        voj[] vojVarArr = {vojVar, vojVar2, vojVar3, vojVar4, vojVar5, vojVar6, vojVar7, vojVar8, vojVar9, vojVar10, vojVar11, vojVar12, vojVar13, vojVar14, vojVar15, vojVar16, vojVar17, vojVar18, vojVar19, vojVar20, vojVar21, vojVar22, new voj("NET_RATING", 22, R.string.basketball_net_rating, new Function1() { // from class: toj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i29) {
                    case 0:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem, basketballTopTeamsStatisticsItem.getTurnovers());
                    case 1:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics.getClass();
                        return basketballTopTeamsStatistics.getPointsAgainst();
                    case 2:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics2 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics2.getClass();
                        return basketballTopTeamsStatistics2.getBlocks();
                    case 3:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem2 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem2.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem2, basketballTopTeamsStatisticsItem2.getBlocks());
                    case 4:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics3 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics3.getClass();
                        return basketballTopTeamsStatistics3.getFastbreakPoints();
                    case 5:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem3 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem3.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem3, basketballTopTeamsStatisticsItem3.getFastbreakPoints());
                    case 6:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics4 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics4.getClass();
                        return basketballTopTeamsStatistics4.getTrueShootingPercentage();
                    case 7:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem4 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem4.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem4.getTrueShootingPercentage(), 0, 6);
                    case 8:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics5 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics5.getClass();
                        return basketballTopTeamsStatistics5.getFreeThrowsPercentage();
                    case 9:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics6 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics6.getClass();
                        return basketballTopTeamsStatistics6.getEffectiveFieldGoalPercentage();
                    case 10:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem5 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem5.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem5.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 11:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics7 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics7.getClass();
                        return basketballTopTeamsStatistics7.getPace();
                    case 12:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem6 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem6.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem6.getPace());
                    case 13:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem7 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem7.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem7, basketballTopTeamsStatisticsItem7.getPointsAgainst());
                    case 14:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics8 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics8.getClass();
                        return basketballTopTeamsStatistics8.getOffensiveRating();
                    case 15:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem8 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem8.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem8.getOffensiveRating());
                    case 16:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics9 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics9.getClass();
                        return basketballTopTeamsStatistics9.getDefensiveRating();
                    case 17:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem9 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem9.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem9.getDefensiveRating());
                    case 18:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics10 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics10.getClass();
                        return basketballTopTeamsStatistics10.getNetRating();
                    case 19:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem10 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem10.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem10.getFreeThrowsPercentage(), 0, 6);
                    case 20:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem11 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem11.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem11.getNetRating());
                    case 21:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics11 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics11.getClass();
                        return basketballTopTeamsStatistics11.getPlusMinus();
                    case 22:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem12 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem12.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem12, basketballTopTeamsStatisticsItem12.getPlusMinus());
                    case 23:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics12 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics12.getClass();
                        return basketballTopTeamsStatistics12.getFieldGoalsPercentage();
                    case 24:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem13 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem13.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem13.getFieldGoalsPercentage(), 0, 6);
                    case 25:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics13 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics13.getClass();
                        return basketballTopTeamsStatistics13.getFieldGoalsPercentageAgainst();
                    case 26:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem14 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem14.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem14.getFieldGoalsPercentageAgainst(), 0, 6);
                    case 27:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics14 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics14.getClass();
                        return basketballTopTeamsStatistics14.getThreePointsPercentage();
                    case 28:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem15 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem15.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem15.getThreePointsPercentage(), 0, 6);
                    default:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics15 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics15.getClass();
                        return basketballTopTeamsStatistics15.getThreePointsPercentageAgainst();
                }
            }
        }, new Function1() { // from class: toj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i30) {
                    case 0:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem, basketballTopTeamsStatisticsItem.getTurnovers());
                    case 1:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics.getClass();
                        return basketballTopTeamsStatistics.getPointsAgainst();
                    case 2:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics2 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics2.getClass();
                        return basketballTopTeamsStatistics2.getBlocks();
                    case 3:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem2 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem2.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem2, basketballTopTeamsStatisticsItem2.getBlocks());
                    case 4:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics3 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics3.getClass();
                        return basketballTopTeamsStatistics3.getFastbreakPoints();
                    case 5:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem3 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem3.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem3, basketballTopTeamsStatisticsItem3.getFastbreakPoints());
                    case 6:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics4 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics4.getClass();
                        return basketballTopTeamsStatistics4.getTrueShootingPercentage();
                    case 7:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem4 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem4.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem4.getTrueShootingPercentage(), 0, 6);
                    case 8:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics5 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics5.getClass();
                        return basketballTopTeamsStatistics5.getFreeThrowsPercentage();
                    case 9:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics6 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics6.getClass();
                        return basketballTopTeamsStatistics6.getEffectiveFieldGoalPercentage();
                    case 10:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem5 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem5.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem5.getEffectiveFieldGoalPercentage(), 0, 6);
                    case 11:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics7 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics7.getClass();
                        return basketballTopTeamsStatistics7.getPace();
                    case 12:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem6 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem6.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem6.getPace());
                    case 13:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem7 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem7.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem7, basketballTopTeamsStatisticsItem7.getPointsAgainst());
                    case 14:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics8 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics8.getClass();
                        return basketballTopTeamsStatistics8.getOffensiveRating();
                    case 15:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem8 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem8.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem8.getOffensiveRating());
                    case 16:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics9 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics9.getClass();
                        return basketballTopTeamsStatistics9.getDefensiveRating();
                    case 17:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem9 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem9.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem9.getDefensiveRating());
                    case 18:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics10 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics10.getClass();
                        return basketballTopTeamsStatistics10.getNetRating();
                    case 19:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem10 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem10.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem10.getFreeThrowsPercentage(), 0, 6);
                    case 20:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem11 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem11.getClass();
                        return rei.b(1, basketballTopTeamsStatisticsItem11.getNetRating());
                    case 21:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics11 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics11.getClass();
                        return basketballTopTeamsStatistics11.getPlusMinus();
                    case 22:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem12 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem12.getClass();
                        return dmi.n(basketballTopTeamsStatisticsItem12, basketballTopTeamsStatisticsItem12.getPlusMinus());
                    case 23:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics12 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics12.getClass();
                        return basketballTopTeamsStatistics12.getFieldGoalsPercentage();
                    case 24:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem13 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem13.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem13.getFieldGoalsPercentage(), 0, 6);
                    case 25:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics13 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics13.getClass();
                        return basketballTopTeamsStatistics13.getFieldGoalsPercentageAgainst();
                    case 26:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem14 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem14.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem14.getFieldGoalsPercentageAgainst(), 0, 6);
                    case 27:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics14 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics14.getClass();
                        return basketballTopTeamsStatistics14.getThreePointsPercentage();
                    case 28:
                        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem15 = (BasketballTopTeamsStatisticsItem) obj;
                        basketballTopTeamsStatisticsItem15.getClass();
                        return rei.e(basketballTopTeamsStatisticsItem15.getThreePointsPercentage(), 0, 6);
                    default:
                        BasketballTopTeamsStatistics basketballTopTeamsStatistics15 = (BasketballTopTeamsStatistics) obj;
                        basketballTopTeamsStatistics15.getClass();
                        return basketballTopTeamsStatistics15.getThreePointsPercentageAgainst();
                }
            }
        })};
        d = vojVarArr;
        e = new kp5(vojVarArr);
    }

    public voj(String str, int i, int i2, Function1 function1, Function1 function12) {
        this.a = i2;
        this.b = function1;
        this.c = function12;
    }

    public static voj valueOf(String str) {
        return (voj) Enum.valueOf(voj.class, str);
    }

    public static voj[] values() {
        return (voj[]) d.clone();
    }

    @Override // defpackage.ipj
    public final /* bridge */ String a(Object obj) {
        return super.a((BasketballTopTeamsStatisticsItem) obj);
    }

    @Override // defpackage.ipj
    public final /* bridge */ List b(Object obj) {
        return super.b((BasketballTopTeamsStatistics) obj);
    }

    @Override // defpackage.ipj
    public final int d() {
        return this.a;
    }

    @Override // defpackage.ipj
    public final Function1 g() {
        return this.c;
    }

    @Override // defpackage.ipj
    public final Function1 h() {
        return this.b;
    }
}
