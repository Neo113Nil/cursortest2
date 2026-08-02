package defpackage;

import android.content.Context;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.sofascore.model.newNetwork.topperformance.response.FootballTopPlayersStatistics;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.FootballTopPlayersStatisticsItem;
import com.sofascore.results.R;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class qab implements zab {
    public static final /* synthetic */ qab[] h;
    public static final /* synthetic */ kp5 i;
    public final int a;
    public final Function1 b;
    public final Function1 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final Integer g;

    static {
        final int i2 = 7;
        qab qabVar = new qab(NativeAdContent.ViewTag.RATING, 0, R.string.average_sofascore_rating, new mab(5), new mab(7), Integer.valueOf(R.drawable.ic_sofascore_logomark), 8);
        final int i3 = 19;
        final int i4 = 1;
        qab qabVar2 = new qab("GOALS", 1, R.string.goals, new mab(19), new Function1() { // from class: oab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i4) {
                    case 0:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem.getClass();
                        return rei.o(footballTopPlayersStatisticsItem.getSuccessfulDribbles(), footballTopPlayersStatisticsItem.getAppearances(), footballTopPlayersStatisticsItem.getSuccessfulDribblesPercentage(), 0);
                    case 1:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem2 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem2.getClass();
                        return yid.j(footballTopPlayersStatisticsItem2.getGoals());
                    case 2:
                        FootballTopPlayersStatistics footballTopPlayersStatistics = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics.getClass();
                        return footballTopPlayersStatistics.getPenaltyWon();
                    case 3:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem3 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem3.getClass();
                        return yid.j(footballTopPlayersStatisticsItem3.getPenaltyWon());
                    case 4:
                        FootballTopPlayersStatistics footballTopPlayersStatistics2 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics2.getClass();
                        return footballTopPlayersStatistics2.getTackles();
                    case 5:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem4 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem4.getClass();
                        return rei.m(footballTopPlayersStatisticsItem4.getTackles(), footballTopPlayersStatisticsItem4.getAppearances());
                    case 6:
                        FootballTopPlayersStatistics footballTopPlayersStatistics3 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics3.getClass();
                        return footballTopPlayersStatistics3.getInterceptions();
                    case 7:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem5 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem5.getClass();
                        return rei.m(footballTopPlayersStatisticsItem5.getInterceptions(), footballTopPlayersStatisticsItem5.getAppearances());
                    case 8:
                        FootballTopPlayersStatistics footballTopPlayersStatistics4 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics4.getClass();
                        return footballTopPlayersStatistics4.getKilometersCovered();
                    case 9:
                        FootballTopPlayersStatistics footballTopPlayersStatistics5 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics5.getClass();
                        return footballTopPlayersStatistics5.getClearances();
                    case 10:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem6 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem6.getClass();
                        return rei.m(footballTopPlayersStatisticsItem6.getClearances(), footballTopPlayersStatisticsItem6.getAppearances());
                    case 11:
                        FootballTopPlayersStatistics footballTopPlayersStatistics6 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics6.getClass();
                        return footballTopPlayersStatistics6.getPossessionLost();
                    case 12:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem7 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem7.getClass();
                        return rei.m(footballTopPlayersStatisticsItem7.getPossessionLost(), footballTopPlayersStatisticsItem7.getAppearances());
                    case 13:
                        FootballTopPlayersStatistics footballTopPlayersStatistics7 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics7.getClass();
                        return footballTopPlayersStatistics7.getExpectedGoals();
                    case 14:
                        FootballTopPlayersStatistics footballTopPlayersStatistics8 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics8.getClass();
                        return footballTopPlayersStatistics8.getYellowCards();
                    case 15:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem8 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem8.getClass();
                        return yid.j(footballTopPlayersStatisticsItem8.getYellowCards());
                    case 16:
                        FootballTopPlayersStatistics footballTopPlayersStatistics9 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics9.getClass();
                        return footballTopPlayersStatistics9.getRedCards();
                    case 17:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem9 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem9.getClass();
                        return yid.j(footballTopPlayersStatisticsItem9.getRedCards());
                    case 18:
                        FootballTopPlayersStatistics footballTopPlayersStatistics10 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics10.getClass();
                        return footballTopPlayersStatistics10.getSaves();
                    case 19:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem10 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem10.getClass();
                        Double kilometersCovered = footballTopPlayersStatisticsItem10.getKilometersCovered();
                        Double valueOf = Double.valueOf(kilometersCovered != null ? kilometersCovered.doubleValue() : 0.0d);
                        Integer minutesPlayed = footballTopPlayersStatisticsItem10.getMinutesPlayed();
                        return rei.q(minutesPlayed != null ? minutesPlayed.intValue() : 0, valueOf).concat(" km");
                    case 20:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem11 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem11.getClass();
                        return rei.m(footballTopPlayersStatisticsItem11.getSaves(), footballTopPlayersStatisticsItem11.getAppearances());
                    case 21:
                        FootballTopPlayersStatistics footballTopPlayersStatistics11 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics11.getClass();
                        return footballTopPlayersStatistics11.getGoalsPrevented();
                    case 22:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem12 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem12.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem12.getGoalsPrevented());
                    case 23:
                        FootballTopPlayersStatistics footballTopPlayersStatistics12 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics12.getClass();
                        return footballTopPlayersStatistics12.getMostConceded();
                    case 24:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem13 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem13.getClass();
                        return rei.m(footballTopPlayersStatisticsItem13.getGoalsConceded(), footballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem14 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem14.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem14.getExpectedGoals()) + " (" + footballTopPlayersStatisticsItem14.getGoals() + ")";
                    case 26:
                        FootballTopPlayersStatistics footballTopPlayersStatistics13 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics13.getClass();
                        return footballTopPlayersStatistics13.getLeastConceded();
                    case 27:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem15 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem15.getClass();
                        return rei.m(footballTopPlayersStatisticsItem15.getGoalsConceded(), footballTopPlayersStatisticsItem15.getAppearances());
                    case 28:
                        FootballTopPlayersStatistics footballTopPlayersStatistics14 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics14.getClass();
                        return footballTopPlayersStatistics14.getCleanSheet();
                    default:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem16 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem16.getClass();
                        return yid.j(footballTopPlayersStatisticsItem16.getCleanSheet());
                }
            }
        }, Integer.valueOf(R.drawable.ic_ball_football), 8);
        final int i5 = 13;
        final int i6 = 25;
        qab qabVar3 = new qab("XG", 2, R.string.football_stat_expected_goals_scored, new Function1() { // from class: oab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i5) {
                    case 0:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem.getClass();
                        return rei.o(footballTopPlayersStatisticsItem.getSuccessfulDribbles(), footballTopPlayersStatisticsItem.getAppearances(), footballTopPlayersStatisticsItem.getSuccessfulDribblesPercentage(), 0);
                    case 1:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem2 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem2.getClass();
                        return yid.j(footballTopPlayersStatisticsItem2.getGoals());
                    case 2:
                        FootballTopPlayersStatistics footballTopPlayersStatistics = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics.getClass();
                        return footballTopPlayersStatistics.getPenaltyWon();
                    case 3:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem3 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem3.getClass();
                        return yid.j(footballTopPlayersStatisticsItem3.getPenaltyWon());
                    case 4:
                        FootballTopPlayersStatistics footballTopPlayersStatistics2 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics2.getClass();
                        return footballTopPlayersStatistics2.getTackles();
                    case 5:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem4 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem4.getClass();
                        return rei.m(footballTopPlayersStatisticsItem4.getTackles(), footballTopPlayersStatisticsItem4.getAppearances());
                    case 6:
                        FootballTopPlayersStatistics footballTopPlayersStatistics3 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics3.getClass();
                        return footballTopPlayersStatistics3.getInterceptions();
                    case 7:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem5 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem5.getClass();
                        return rei.m(footballTopPlayersStatisticsItem5.getInterceptions(), footballTopPlayersStatisticsItem5.getAppearances());
                    case 8:
                        FootballTopPlayersStatistics footballTopPlayersStatistics4 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics4.getClass();
                        return footballTopPlayersStatistics4.getKilometersCovered();
                    case 9:
                        FootballTopPlayersStatistics footballTopPlayersStatistics5 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics5.getClass();
                        return footballTopPlayersStatistics5.getClearances();
                    case 10:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem6 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem6.getClass();
                        return rei.m(footballTopPlayersStatisticsItem6.getClearances(), footballTopPlayersStatisticsItem6.getAppearances());
                    case 11:
                        FootballTopPlayersStatistics footballTopPlayersStatistics6 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics6.getClass();
                        return footballTopPlayersStatistics6.getPossessionLost();
                    case 12:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem7 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem7.getClass();
                        return rei.m(footballTopPlayersStatisticsItem7.getPossessionLost(), footballTopPlayersStatisticsItem7.getAppearances());
                    case 13:
                        FootballTopPlayersStatistics footballTopPlayersStatistics7 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics7.getClass();
                        return footballTopPlayersStatistics7.getExpectedGoals();
                    case 14:
                        FootballTopPlayersStatistics footballTopPlayersStatistics8 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics8.getClass();
                        return footballTopPlayersStatistics8.getYellowCards();
                    case 15:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem8 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem8.getClass();
                        return yid.j(footballTopPlayersStatisticsItem8.getYellowCards());
                    case 16:
                        FootballTopPlayersStatistics footballTopPlayersStatistics9 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics9.getClass();
                        return footballTopPlayersStatistics9.getRedCards();
                    case 17:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem9 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem9.getClass();
                        return yid.j(footballTopPlayersStatisticsItem9.getRedCards());
                    case 18:
                        FootballTopPlayersStatistics footballTopPlayersStatistics10 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics10.getClass();
                        return footballTopPlayersStatistics10.getSaves();
                    case 19:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem10 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem10.getClass();
                        Double kilometersCovered = footballTopPlayersStatisticsItem10.getKilometersCovered();
                        Double valueOf = Double.valueOf(kilometersCovered != null ? kilometersCovered.doubleValue() : 0.0d);
                        Integer minutesPlayed = footballTopPlayersStatisticsItem10.getMinutesPlayed();
                        return rei.q(minutesPlayed != null ? minutesPlayed.intValue() : 0, valueOf).concat(" km");
                    case 20:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem11 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem11.getClass();
                        return rei.m(footballTopPlayersStatisticsItem11.getSaves(), footballTopPlayersStatisticsItem11.getAppearances());
                    case 21:
                        FootballTopPlayersStatistics footballTopPlayersStatistics11 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics11.getClass();
                        return footballTopPlayersStatistics11.getGoalsPrevented();
                    case 22:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem12 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem12.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem12.getGoalsPrevented());
                    case 23:
                        FootballTopPlayersStatistics footballTopPlayersStatistics12 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics12.getClass();
                        return footballTopPlayersStatistics12.getMostConceded();
                    case 24:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem13 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem13.getClass();
                        return rei.m(footballTopPlayersStatisticsItem13.getGoalsConceded(), footballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem14 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem14.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem14.getExpectedGoals()) + " (" + footballTopPlayersStatisticsItem14.getGoals() + ")";
                    case 26:
                        FootballTopPlayersStatistics footballTopPlayersStatistics13 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics13.getClass();
                        return footballTopPlayersStatistics13.getLeastConceded();
                    case 27:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem15 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem15.getClass();
                        return rei.m(footballTopPlayersStatisticsItem15.getGoalsConceded(), footballTopPlayersStatisticsItem15.getAppearances());
                    case 28:
                        FootballTopPlayersStatistics footballTopPlayersStatistics14 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics14.getClass();
                        return footballTopPlayersStatistics14.getCleanSheet();
                    default:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem16 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem16.getClass();
                        return yid.j(footballTopPlayersStatisticsItem16.getCleanSheet());
                }
            }
        }, new Function1() { // from class: oab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i6) {
                    case 0:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem.getClass();
                        return rei.o(footballTopPlayersStatisticsItem.getSuccessfulDribbles(), footballTopPlayersStatisticsItem.getAppearances(), footballTopPlayersStatisticsItem.getSuccessfulDribblesPercentage(), 0);
                    case 1:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem2 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem2.getClass();
                        return yid.j(footballTopPlayersStatisticsItem2.getGoals());
                    case 2:
                        FootballTopPlayersStatistics footballTopPlayersStatistics = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics.getClass();
                        return footballTopPlayersStatistics.getPenaltyWon();
                    case 3:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem3 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem3.getClass();
                        return yid.j(footballTopPlayersStatisticsItem3.getPenaltyWon());
                    case 4:
                        FootballTopPlayersStatistics footballTopPlayersStatistics2 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics2.getClass();
                        return footballTopPlayersStatistics2.getTackles();
                    case 5:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem4 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem4.getClass();
                        return rei.m(footballTopPlayersStatisticsItem4.getTackles(), footballTopPlayersStatisticsItem4.getAppearances());
                    case 6:
                        FootballTopPlayersStatistics footballTopPlayersStatistics3 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics3.getClass();
                        return footballTopPlayersStatistics3.getInterceptions();
                    case 7:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem5 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem5.getClass();
                        return rei.m(footballTopPlayersStatisticsItem5.getInterceptions(), footballTopPlayersStatisticsItem5.getAppearances());
                    case 8:
                        FootballTopPlayersStatistics footballTopPlayersStatistics4 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics4.getClass();
                        return footballTopPlayersStatistics4.getKilometersCovered();
                    case 9:
                        FootballTopPlayersStatistics footballTopPlayersStatistics5 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics5.getClass();
                        return footballTopPlayersStatistics5.getClearances();
                    case 10:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem6 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem6.getClass();
                        return rei.m(footballTopPlayersStatisticsItem6.getClearances(), footballTopPlayersStatisticsItem6.getAppearances());
                    case 11:
                        FootballTopPlayersStatistics footballTopPlayersStatistics6 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics6.getClass();
                        return footballTopPlayersStatistics6.getPossessionLost();
                    case 12:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem7 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem7.getClass();
                        return rei.m(footballTopPlayersStatisticsItem7.getPossessionLost(), footballTopPlayersStatisticsItem7.getAppearances());
                    case 13:
                        FootballTopPlayersStatistics footballTopPlayersStatistics7 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics7.getClass();
                        return footballTopPlayersStatistics7.getExpectedGoals();
                    case 14:
                        FootballTopPlayersStatistics footballTopPlayersStatistics8 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics8.getClass();
                        return footballTopPlayersStatistics8.getYellowCards();
                    case 15:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem8 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem8.getClass();
                        return yid.j(footballTopPlayersStatisticsItem8.getYellowCards());
                    case 16:
                        FootballTopPlayersStatistics footballTopPlayersStatistics9 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics9.getClass();
                        return footballTopPlayersStatistics9.getRedCards();
                    case 17:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem9 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem9.getClass();
                        return yid.j(footballTopPlayersStatisticsItem9.getRedCards());
                    case 18:
                        FootballTopPlayersStatistics footballTopPlayersStatistics10 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics10.getClass();
                        return footballTopPlayersStatistics10.getSaves();
                    case 19:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem10 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem10.getClass();
                        Double kilometersCovered = footballTopPlayersStatisticsItem10.getKilometersCovered();
                        Double valueOf = Double.valueOf(kilometersCovered != null ? kilometersCovered.doubleValue() : 0.0d);
                        Integer minutesPlayed = footballTopPlayersStatisticsItem10.getMinutesPlayed();
                        return rei.q(minutesPlayed != null ? minutesPlayed.intValue() : 0, valueOf).concat(" km");
                    case 20:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem11 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem11.getClass();
                        return rei.m(footballTopPlayersStatisticsItem11.getSaves(), footballTopPlayersStatisticsItem11.getAppearances());
                    case 21:
                        FootballTopPlayersStatistics footballTopPlayersStatistics11 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics11.getClass();
                        return footballTopPlayersStatistics11.getGoalsPrevented();
                    case 22:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem12 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem12.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem12.getGoalsPrevented());
                    case 23:
                        FootballTopPlayersStatistics footballTopPlayersStatistics12 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics12.getClass();
                        return footballTopPlayersStatistics12.getMostConceded();
                    case 24:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem13 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem13.getClass();
                        return rei.m(footballTopPlayersStatisticsItem13.getGoalsConceded(), footballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem14 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem14.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem14.getExpectedGoals()) + " (" + footballTopPlayersStatisticsItem14.getGoals() + ")";
                    case 26:
                        FootballTopPlayersStatistics footballTopPlayersStatistics13 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics13.getClass();
                        return footballTopPlayersStatistics13.getLeastConceded();
                    case 27:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem15 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem15.getClass();
                        return rei.m(footballTopPlayersStatisticsItem15.getGoalsConceded(), footballTopPlayersStatisticsItem15.getAppearances());
                    case 28:
                        FootballTopPlayersStatistics footballTopPlayersStatistics14 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics14.getClass();
                        return footballTopPlayersStatistics14.getCleanSheet();
                    default:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem16 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem16.getClass();
                        return yid.j(footballTopPlayersStatisticsItem16.getCleanSheet());
                }
            }
        }, Integer.valueOf(R.drawable.ic_goal_frame), 88);
        final int i7 = 2;
        qab qabVar4 = new qab("ASSISTS", 3, R.string.football_assists, new pab(1), new pab(2), Integer.valueOf(R.drawable.ic_football_assist_16), 8);
        final int i8 = 3;
        qab qabVar5 = new qab("EXPECTED_ASSISTS", 4, R.string.football_stat_expected_assists_assisted, new pab(3), new pab(4), null, 248);
        qab qabVar6 = new qab("GOALS_AND_ASSISTS", 5, R.string.football_goals_and_assists, new mab(16), new mab(27), null, 248);
        final int i9 = 8;
        qab qabVar7 = new qab("DISTANCE", 6, R.string.football_running_distance_covered_per_90, new Function1() { // from class: oab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i9) {
                    case 0:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem.getClass();
                        return rei.o(footballTopPlayersStatisticsItem.getSuccessfulDribbles(), footballTopPlayersStatisticsItem.getAppearances(), footballTopPlayersStatisticsItem.getSuccessfulDribblesPercentage(), 0);
                    case 1:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem2 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem2.getClass();
                        return yid.j(footballTopPlayersStatisticsItem2.getGoals());
                    case 2:
                        FootballTopPlayersStatistics footballTopPlayersStatistics = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics.getClass();
                        return footballTopPlayersStatistics.getPenaltyWon();
                    case 3:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem3 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem3.getClass();
                        return yid.j(footballTopPlayersStatisticsItem3.getPenaltyWon());
                    case 4:
                        FootballTopPlayersStatistics footballTopPlayersStatistics2 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics2.getClass();
                        return footballTopPlayersStatistics2.getTackles();
                    case 5:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem4 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem4.getClass();
                        return rei.m(footballTopPlayersStatisticsItem4.getTackles(), footballTopPlayersStatisticsItem4.getAppearances());
                    case 6:
                        FootballTopPlayersStatistics footballTopPlayersStatistics3 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics3.getClass();
                        return footballTopPlayersStatistics3.getInterceptions();
                    case 7:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem5 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem5.getClass();
                        return rei.m(footballTopPlayersStatisticsItem5.getInterceptions(), footballTopPlayersStatisticsItem5.getAppearances());
                    case 8:
                        FootballTopPlayersStatistics footballTopPlayersStatistics4 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics4.getClass();
                        return footballTopPlayersStatistics4.getKilometersCovered();
                    case 9:
                        FootballTopPlayersStatistics footballTopPlayersStatistics5 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics5.getClass();
                        return footballTopPlayersStatistics5.getClearances();
                    case 10:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem6 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem6.getClass();
                        return rei.m(footballTopPlayersStatisticsItem6.getClearances(), footballTopPlayersStatisticsItem6.getAppearances());
                    case 11:
                        FootballTopPlayersStatistics footballTopPlayersStatistics6 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics6.getClass();
                        return footballTopPlayersStatistics6.getPossessionLost();
                    case 12:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem7 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem7.getClass();
                        return rei.m(footballTopPlayersStatisticsItem7.getPossessionLost(), footballTopPlayersStatisticsItem7.getAppearances());
                    case 13:
                        FootballTopPlayersStatistics footballTopPlayersStatistics7 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics7.getClass();
                        return footballTopPlayersStatistics7.getExpectedGoals();
                    case 14:
                        FootballTopPlayersStatistics footballTopPlayersStatistics8 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics8.getClass();
                        return footballTopPlayersStatistics8.getYellowCards();
                    case 15:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem8 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem8.getClass();
                        return yid.j(footballTopPlayersStatisticsItem8.getYellowCards());
                    case 16:
                        FootballTopPlayersStatistics footballTopPlayersStatistics9 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics9.getClass();
                        return footballTopPlayersStatistics9.getRedCards();
                    case 17:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem9 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem9.getClass();
                        return yid.j(footballTopPlayersStatisticsItem9.getRedCards());
                    case 18:
                        FootballTopPlayersStatistics footballTopPlayersStatistics10 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics10.getClass();
                        return footballTopPlayersStatistics10.getSaves();
                    case 19:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem10 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem10.getClass();
                        Double kilometersCovered = footballTopPlayersStatisticsItem10.getKilometersCovered();
                        Double valueOf = Double.valueOf(kilometersCovered != null ? kilometersCovered.doubleValue() : 0.0d);
                        Integer minutesPlayed = footballTopPlayersStatisticsItem10.getMinutesPlayed();
                        return rei.q(minutesPlayed != null ? minutesPlayed.intValue() : 0, valueOf).concat(" km");
                    case 20:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem11 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem11.getClass();
                        return rei.m(footballTopPlayersStatisticsItem11.getSaves(), footballTopPlayersStatisticsItem11.getAppearances());
                    case 21:
                        FootballTopPlayersStatistics footballTopPlayersStatistics11 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics11.getClass();
                        return footballTopPlayersStatistics11.getGoalsPrevented();
                    case 22:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem12 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem12.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem12.getGoalsPrevented());
                    case 23:
                        FootballTopPlayersStatistics footballTopPlayersStatistics12 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics12.getClass();
                        return footballTopPlayersStatistics12.getMostConceded();
                    case 24:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem13 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem13.getClass();
                        return rei.m(footballTopPlayersStatisticsItem13.getGoalsConceded(), footballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem14 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem14.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem14.getExpectedGoals()) + " (" + footballTopPlayersStatisticsItem14.getGoals() + ")";
                    case 26:
                        FootballTopPlayersStatistics footballTopPlayersStatistics13 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics13.getClass();
                        return footballTopPlayersStatistics13.getLeastConceded();
                    case 27:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem15 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem15.getClass();
                        return rei.m(footballTopPlayersStatisticsItem15.getGoalsConceded(), footballTopPlayersStatisticsItem15.getAppearances());
                    case 28:
                        FootballTopPlayersStatistics footballTopPlayersStatistics14 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics14.getClass();
                        return footballTopPlayersStatistics14.getCleanSheet();
                    default:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem16 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem16.getClass();
                        return yid.j(footballTopPlayersStatisticsItem16.getCleanSheet());
                }
            }
        }, new Function1() { // from class: oab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i3) {
                    case 0:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem.getClass();
                        return rei.o(footballTopPlayersStatisticsItem.getSuccessfulDribbles(), footballTopPlayersStatisticsItem.getAppearances(), footballTopPlayersStatisticsItem.getSuccessfulDribblesPercentage(), 0);
                    case 1:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem2 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem2.getClass();
                        return yid.j(footballTopPlayersStatisticsItem2.getGoals());
                    case 2:
                        FootballTopPlayersStatistics footballTopPlayersStatistics = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics.getClass();
                        return footballTopPlayersStatistics.getPenaltyWon();
                    case 3:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem3 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem3.getClass();
                        return yid.j(footballTopPlayersStatisticsItem3.getPenaltyWon());
                    case 4:
                        FootballTopPlayersStatistics footballTopPlayersStatistics2 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics2.getClass();
                        return footballTopPlayersStatistics2.getTackles();
                    case 5:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem4 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem4.getClass();
                        return rei.m(footballTopPlayersStatisticsItem4.getTackles(), footballTopPlayersStatisticsItem4.getAppearances());
                    case 6:
                        FootballTopPlayersStatistics footballTopPlayersStatistics3 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics3.getClass();
                        return footballTopPlayersStatistics3.getInterceptions();
                    case 7:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem5 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem5.getClass();
                        return rei.m(footballTopPlayersStatisticsItem5.getInterceptions(), footballTopPlayersStatisticsItem5.getAppearances());
                    case 8:
                        FootballTopPlayersStatistics footballTopPlayersStatistics4 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics4.getClass();
                        return footballTopPlayersStatistics4.getKilometersCovered();
                    case 9:
                        FootballTopPlayersStatistics footballTopPlayersStatistics5 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics5.getClass();
                        return footballTopPlayersStatistics5.getClearances();
                    case 10:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem6 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem6.getClass();
                        return rei.m(footballTopPlayersStatisticsItem6.getClearances(), footballTopPlayersStatisticsItem6.getAppearances());
                    case 11:
                        FootballTopPlayersStatistics footballTopPlayersStatistics6 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics6.getClass();
                        return footballTopPlayersStatistics6.getPossessionLost();
                    case 12:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem7 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem7.getClass();
                        return rei.m(footballTopPlayersStatisticsItem7.getPossessionLost(), footballTopPlayersStatisticsItem7.getAppearances());
                    case 13:
                        FootballTopPlayersStatistics footballTopPlayersStatistics7 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics7.getClass();
                        return footballTopPlayersStatistics7.getExpectedGoals();
                    case 14:
                        FootballTopPlayersStatistics footballTopPlayersStatistics8 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics8.getClass();
                        return footballTopPlayersStatistics8.getYellowCards();
                    case 15:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem8 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem8.getClass();
                        return yid.j(footballTopPlayersStatisticsItem8.getYellowCards());
                    case 16:
                        FootballTopPlayersStatistics footballTopPlayersStatistics9 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics9.getClass();
                        return footballTopPlayersStatistics9.getRedCards();
                    case 17:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem9 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem9.getClass();
                        return yid.j(footballTopPlayersStatisticsItem9.getRedCards());
                    case 18:
                        FootballTopPlayersStatistics footballTopPlayersStatistics10 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics10.getClass();
                        return footballTopPlayersStatistics10.getSaves();
                    case 19:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem10 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem10.getClass();
                        Double kilometersCovered = footballTopPlayersStatisticsItem10.getKilometersCovered();
                        Double valueOf = Double.valueOf(kilometersCovered != null ? kilometersCovered.doubleValue() : 0.0d);
                        Integer minutesPlayed = footballTopPlayersStatisticsItem10.getMinutesPlayed();
                        return rei.q(minutesPlayed != null ? minutesPlayed.intValue() : 0, valueOf).concat(" km");
                    case 20:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem11 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem11.getClass();
                        return rei.m(footballTopPlayersStatisticsItem11.getSaves(), footballTopPlayersStatisticsItem11.getAppearances());
                    case 21:
                        FootballTopPlayersStatistics footballTopPlayersStatistics11 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics11.getClass();
                        return footballTopPlayersStatistics11.getGoalsPrevented();
                    case 22:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem12 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem12.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem12.getGoalsPrevented());
                    case 23:
                        FootballTopPlayersStatistics footballTopPlayersStatistics12 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics12.getClass();
                        return footballTopPlayersStatistics12.getMostConceded();
                    case 24:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem13 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem13.getClass();
                        return rei.m(footballTopPlayersStatisticsItem13.getGoalsConceded(), footballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem14 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem14.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem14.getExpectedGoals()) + " (" + footballTopPlayersStatisticsItem14.getGoals() + ")";
                    case 26:
                        FootballTopPlayersStatistics footballTopPlayersStatistics13 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics13.getClass();
                        return footballTopPlayersStatistics13.getLeastConceded();
                    case 27:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem15 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem15.getClass();
                        return rei.m(footballTopPlayersStatisticsItem15.getGoalsConceded(), footballTopPlayersStatisticsItem15.getAppearances());
                    case 28:
                        FootballTopPlayersStatistics footballTopPlayersStatistics14 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics14.getClass();
                        return footballTopPlayersStatistics14.getCleanSheet();
                    default:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem16 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem16.getClass();
                        return yid.j(footballTopPlayersStatisticsItem16.getCleanSheet());
                }
            }
        }, null, 248);
        final int i10 = 0;
        qab qabVar8 = new qab("NUMBER_OF_SPRINTS", 7, R.string.football_running_number_of_sprints_per_90, new pab(0), new pab(5), null, 248);
        final int i11 = 6;
        qab qabVar9 = new qab("TOP_SPEED", 8, R.string.football_running_top_speed, new pab(6), new pab(7), null, 248);
        qab qabVar10 = new qab("PENALTY_GOALS", 9, R.string.football_penalty_goals, new pab(8), new mab(6), null, 248);
        qab qabVar11 = new qab("FREE_KICK_GOALS", 10, R.string.football_free_kick_goals, new mab(8), new mab(9), null, 248);
        final int i12 = 11;
        qab qabVar12 = new qab("SCORING_FREQUENCY", 11, R.string.football_scoring_frequency_minutes, new mab(10), new mab(11), null, 248);
        qab qabVar13 = new qab("SHOTS_PER_GAME", 12, R.string.football_total_shots_per_game, new mab(12), new mab(13), null, 248);
        qab qabVar14 = new qab("SHOTS_ON_TARGET_PER_GAME", 13, R.string.football_shots_on_goal_per_game, new mab(14), new mab(15), Integer.valueOf(R.drawable.ic_penalty_shot), 88);
        qab qabVar15 = new qab("BIG_CHANCES_MISSED", 14, R.string.football_big_chances_missed, new mab(17), new mab(18), null, 248);
        qab qabVar16 = new qab("BIG_CHANCES_CREATED", 15, R.string.football_big_chances_created, new mab(20), new mab(21), Integer.valueOf(R.drawable.ic_on_loan_16), 88);
        qab qabVar17 = new qab("ACC_PASSES_PER_GAME", 16, R.string.football_accurate_passes_per_game, new mab(22), new mab(23), Integer.valueOf(R.drawable.ic_swap_16), 88);
        qab qabVar18 = new qab("KEY_PASSES_PER_GAME", 17, R.string.football_key_passes_per_game, new mab(24), new mab(25), null, 248);
        qab qabVar19 = new qab("ACC_LONG_BALLS_PER_GAME", 18, R.string.football_accurate_long_balls_per_game, new mab(26), new mab(28), null, 248);
        qab qabVar20 = new qab("SUCC_DRIBBLES_PER_GAME", 19, R.string.football_successful_dribbles_per_game, new mab(29), new Function1() { // from class: oab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i10) {
                    case 0:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem.getClass();
                        return rei.o(footballTopPlayersStatisticsItem.getSuccessfulDribbles(), footballTopPlayersStatisticsItem.getAppearances(), footballTopPlayersStatisticsItem.getSuccessfulDribblesPercentage(), 0);
                    case 1:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem2 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem2.getClass();
                        return yid.j(footballTopPlayersStatisticsItem2.getGoals());
                    case 2:
                        FootballTopPlayersStatistics footballTopPlayersStatistics = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics.getClass();
                        return footballTopPlayersStatistics.getPenaltyWon();
                    case 3:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem3 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem3.getClass();
                        return yid.j(footballTopPlayersStatisticsItem3.getPenaltyWon());
                    case 4:
                        FootballTopPlayersStatistics footballTopPlayersStatistics2 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics2.getClass();
                        return footballTopPlayersStatistics2.getTackles();
                    case 5:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem4 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem4.getClass();
                        return rei.m(footballTopPlayersStatisticsItem4.getTackles(), footballTopPlayersStatisticsItem4.getAppearances());
                    case 6:
                        FootballTopPlayersStatistics footballTopPlayersStatistics3 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics3.getClass();
                        return footballTopPlayersStatistics3.getInterceptions();
                    case 7:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem5 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem5.getClass();
                        return rei.m(footballTopPlayersStatisticsItem5.getInterceptions(), footballTopPlayersStatisticsItem5.getAppearances());
                    case 8:
                        FootballTopPlayersStatistics footballTopPlayersStatistics4 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics4.getClass();
                        return footballTopPlayersStatistics4.getKilometersCovered();
                    case 9:
                        FootballTopPlayersStatistics footballTopPlayersStatistics5 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics5.getClass();
                        return footballTopPlayersStatistics5.getClearances();
                    case 10:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem6 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem6.getClass();
                        return rei.m(footballTopPlayersStatisticsItem6.getClearances(), footballTopPlayersStatisticsItem6.getAppearances());
                    case 11:
                        FootballTopPlayersStatistics footballTopPlayersStatistics6 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics6.getClass();
                        return footballTopPlayersStatistics6.getPossessionLost();
                    case 12:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem7 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem7.getClass();
                        return rei.m(footballTopPlayersStatisticsItem7.getPossessionLost(), footballTopPlayersStatisticsItem7.getAppearances());
                    case 13:
                        FootballTopPlayersStatistics footballTopPlayersStatistics7 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics7.getClass();
                        return footballTopPlayersStatistics7.getExpectedGoals();
                    case 14:
                        FootballTopPlayersStatistics footballTopPlayersStatistics8 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics8.getClass();
                        return footballTopPlayersStatistics8.getYellowCards();
                    case 15:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem8 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem8.getClass();
                        return yid.j(footballTopPlayersStatisticsItem8.getYellowCards());
                    case 16:
                        FootballTopPlayersStatistics footballTopPlayersStatistics9 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics9.getClass();
                        return footballTopPlayersStatistics9.getRedCards();
                    case 17:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem9 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem9.getClass();
                        return yid.j(footballTopPlayersStatisticsItem9.getRedCards());
                    case 18:
                        FootballTopPlayersStatistics footballTopPlayersStatistics10 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics10.getClass();
                        return footballTopPlayersStatistics10.getSaves();
                    case 19:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem10 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem10.getClass();
                        Double kilometersCovered = footballTopPlayersStatisticsItem10.getKilometersCovered();
                        Double valueOf = Double.valueOf(kilometersCovered != null ? kilometersCovered.doubleValue() : 0.0d);
                        Integer minutesPlayed = footballTopPlayersStatisticsItem10.getMinutesPlayed();
                        return rei.q(minutesPlayed != null ? minutesPlayed.intValue() : 0, valueOf).concat(" km");
                    case 20:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem11 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem11.getClass();
                        return rei.m(footballTopPlayersStatisticsItem11.getSaves(), footballTopPlayersStatisticsItem11.getAppearances());
                    case 21:
                        FootballTopPlayersStatistics footballTopPlayersStatistics11 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics11.getClass();
                        return footballTopPlayersStatistics11.getGoalsPrevented();
                    case 22:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem12 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem12.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem12.getGoalsPrevented());
                    case 23:
                        FootballTopPlayersStatistics footballTopPlayersStatistics12 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics12.getClass();
                        return footballTopPlayersStatistics12.getMostConceded();
                    case 24:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem13 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem13.getClass();
                        return rei.m(footballTopPlayersStatisticsItem13.getGoalsConceded(), footballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem14 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem14.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem14.getExpectedGoals()) + " (" + footballTopPlayersStatisticsItem14.getGoals() + ")";
                    case 26:
                        FootballTopPlayersStatistics footballTopPlayersStatistics13 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics13.getClass();
                        return footballTopPlayersStatistics13.getLeastConceded();
                    case 27:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem15 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem15.getClass();
                        return rei.m(footballTopPlayersStatisticsItem15.getGoalsConceded(), footballTopPlayersStatisticsItem15.getAppearances());
                    case 28:
                        FootballTopPlayersStatistics footballTopPlayersStatistics14 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics14.getClass();
                        return footballTopPlayersStatistics14.getCleanSheet();
                    default:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem16 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem16.getClass();
                        return yid.j(footballTopPlayersStatisticsItem16.getCleanSheet());
                }
            }
        }, Integer.valueOf(R.drawable.ic_primary_tab), 88);
        qab qabVar21 = new qab("PENALTIES_WON", 20, R.string.football_penalties_won, new Function1() { // from class: oab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i7) {
                    case 0:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem.getClass();
                        return rei.o(footballTopPlayersStatisticsItem.getSuccessfulDribbles(), footballTopPlayersStatisticsItem.getAppearances(), footballTopPlayersStatisticsItem.getSuccessfulDribblesPercentage(), 0);
                    case 1:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem2 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem2.getClass();
                        return yid.j(footballTopPlayersStatisticsItem2.getGoals());
                    case 2:
                        FootballTopPlayersStatistics footballTopPlayersStatistics = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics.getClass();
                        return footballTopPlayersStatistics.getPenaltyWon();
                    case 3:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem3 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem3.getClass();
                        return yid.j(footballTopPlayersStatisticsItem3.getPenaltyWon());
                    case 4:
                        FootballTopPlayersStatistics footballTopPlayersStatistics2 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics2.getClass();
                        return footballTopPlayersStatistics2.getTackles();
                    case 5:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem4 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem4.getClass();
                        return rei.m(footballTopPlayersStatisticsItem4.getTackles(), footballTopPlayersStatisticsItem4.getAppearances());
                    case 6:
                        FootballTopPlayersStatistics footballTopPlayersStatistics3 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics3.getClass();
                        return footballTopPlayersStatistics3.getInterceptions();
                    case 7:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem5 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem5.getClass();
                        return rei.m(footballTopPlayersStatisticsItem5.getInterceptions(), footballTopPlayersStatisticsItem5.getAppearances());
                    case 8:
                        FootballTopPlayersStatistics footballTopPlayersStatistics4 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics4.getClass();
                        return footballTopPlayersStatistics4.getKilometersCovered();
                    case 9:
                        FootballTopPlayersStatistics footballTopPlayersStatistics5 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics5.getClass();
                        return footballTopPlayersStatistics5.getClearances();
                    case 10:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem6 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem6.getClass();
                        return rei.m(footballTopPlayersStatisticsItem6.getClearances(), footballTopPlayersStatisticsItem6.getAppearances());
                    case 11:
                        FootballTopPlayersStatistics footballTopPlayersStatistics6 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics6.getClass();
                        return footballTopPlayersStatistics6.getPossessionLost();
                    case 12:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem7 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem7.getClass();
                        return rei.m(footballTopPlayersStatisticsItem7.getPossessionLost(), footballTopPlayersStatisticsItem7.getAppearances());
                    case 13:
                        FootballTopPlayersStatistics footballTopPlayersStatistics7 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics7.getClass();
                        return footballTopPlayersStatistics7.getExpectedGoals();
                    case 14:
                        FootballTopPlayersStatistics footballTopPlayersStatistics8 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics8.getClass();
                        return footballTopPlayersStatistics8.getYellowCards();
                    case 15:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem8 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem8.getClass();
                        return yid.j(footballTopPlayersStatisticsItem8.getYellowCards());
                    case 16:
                        FootballTopPlayersStatistics footballTopPlayersStatistics9 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics9.getClass();
                        return footballTopPlayersStatistics9.getRedCards();
                    case 17:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem9 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem9.getClass();
                        return yid.j(footballTopPlayersStatisticsItem9.getRedCards());
                    case 18:
                        FootballTopPlayersStatistics footballTopPlayersStatistics10 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics10.getClass();
                        return footballTopPlayersStatistics10.getSaves();
                    case 19:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem10 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem10.getClass();
                        Double kilometersCovered = footballTopPlayersStatisticsItem10.getKilometersCovered();
                        Double valueOf = Double.valueOf(kilometersCovered != null ? kilometersCovered.doubleValue() : 0.0d);
                        Integer minutesPlayed = footballTopPlayersStatisticsItem10.getMinutesPlayed();
                        return rei.q(minutesPlayed != null ? minutesPlayed.intValue() : 0, valueOf).concat(" km");
                    case 20:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem11 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem11.getClass();
                        return rei.m(footballTopPlayersStatisticsItem11.getSaves(), footballTopPlayersStatisticsItem11.getAppearances());
                    case 21:
                        FootballTopPlayersStatistics footballTopPlayersStatistics11 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics11.getClass();
                        return footballTopPlayersStatistics11.getGoalsPrevented();
                    case 22:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem12 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem12.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem12.getGoalsPrevented());
                    case 23:
                        FootballTopPlayersStatistics footballTopPlayersStatistics12 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics12.getClass();
                        return footballTopPlayersStatistics12.getMostConceded();
                    case 24:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem13 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem13.getClass();
                        return rei.m(footballTopPlayersStatisticsItem13.getGoalsConceded(), footballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem14 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem14.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem14.getExpectedGoals()) + " (" + footballTopPlayersStatisticsItem14.getGoals() + ")";
                    case 26:
                        FootballTopPlayersStatistics footballTopPlayersStatistics13 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics13.getClass();
                        return footballTopPlayersStatistics13.getLeastConceded();
                    case 27:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem15 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem15.getClass();
                        return rei.m(footballTopPlayersStatisticsItem15.getGoalsConceded(), footballTopPlayersStatisticsItem15.getAppearances());
                    case 28:
                        FootballTopPlayersStatistics footballTopPlayersStatistics14 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics14.getClass();
                        return footballTopPlayersStatistics14.getCleanSheet();
                    default:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem16 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem16.getClass();
                        return yid.j(footballTopPlayersStatisticsItem16.getCleanSheet());
                }
            }
        }, new Function1() { // from class: oab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i8) {
                    case 0:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem.getClass();
                        return rei.o(footballTopPlayersStatisticsItem.getSuccessfulDribbles(), footballTopPlayersStatisticsItem.getAppearances(), footballTopPlayersStatisticsItem.getSuccessfulDribblesPercentage(), 0);
                    case 1:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem2 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem2.getClass();
                        return yid.j(footballTopPlayersStatisticsItem2.getGoals());
                    case 2:
                        FootballTopPlayersStatistics footballTopPlayersStatistics = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics.getClass();
                        return footballTopPlayersStatistics.getPenaltyWon();
                    case 3:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem3 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem3.getClass();
                        return yid.j(footballTopPlayersStatisticsItem3.getPenaltyWon());
                    case 4:
                        FootballTopPlayersStatistics footballTopPlayersStatistics2 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics2.getClass();
                        return footballTopPlayersStatistics2.getTackles();
                    case 5:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem4 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem4.getClass();
                        return rei.m(footballTopPlayersStatisticsItem4.getTackles(), footballTopPlayersStatisticsItem4.getAppearances());
                    case 6:
                        FootballTopPlayersStatistics footballTopPlayersStatistics3 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics3.getClass();
                        return footballTopPlayersStatistics3.getInterceptions();
                    case 7:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem5 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem5.getClass();
                        return rei.m(footballTopPlayersStatisticsItem5.getInterceptions(), footballTopPlayersStatisticsItem5.getAppearances());
                    case 8:
                        FootballTopPlayersStatistics footballTopPlayersStatistics4 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics4.getClass();
                        return footballTopPlayersStatistics4.getKilometersCovered();
                    case 9:
                        FootballTopPlayersStatistics footballTopPlayersStatistics5 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics5.getClass();
                        return footballTopPlayersStatistics5.getClearances();
                    case 10:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem6 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem6.getClass();
                        return rei.m(footballTopPlayersStatisticsItem6.getClearances(), footballTopPlayersStatisticsItem6.getAppearances());
                    case 11:
                        FootballTopPlayersStatistics footballTopPlayersStatistics6 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics6.getClass();
                        return footballTopPlayersStatistics6.getPossessionLost();
                    case 12:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem7 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem7.getClass();
                        return rei.m(footballTopPlayersStatisticsItem7.getPossessionLost(), footballTopPlayersStatisticsItem7.getAppearances());
                    case 13:
                        FootballTopPlayersStatistics footballTopPlayersStatistics7 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics7.getClass();
                        return footballTopPlayersStatistics7.getExpectedGoals();
                    case 14:
                        FootballTopPlayersStatistics footballTopPlayersStatistics8 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics8.getClass();
                        return footballTopPlayersStatistics8.getYellowCards();
                    case 15:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem8 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem8.getClass();
                        return yid.j(footballTopPlayersStatisticsItem8.getYellowCards());
                    case 16:
                        FootballTopPlayersStatistics footballTopPlayersStatistics9 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics9.getClass();
                        return footballTopPlayersStatistics9.getRedCards();
                    case 17:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem9 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem9.getClass();
                        return yid.j(footballTopPlayersStatisticsItem9.getRedCards());
                    case 18:
                        FootballTopPlayersStatistics footballTopPlayersStatistics10 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics10.getClass();
                        return footballTopPlayersStatistics10.getSaves();
                    case 19:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem10 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem10.getClass();
                        Double kilometersCovered = footballTopPlayersStatisticsItem10.getKilometersCovered();
                        Double valueOf = Double.valueOf(kilometersCovered != null ? kilometersCovered.doubleValue() : 0.0d);
                        Integer minutesPlayed = footballTopPlayersStatisticsItem10.getMinutesPlayed();
                        return rei.q(minutesPlayed != null ? minutesPlayed.intValue() : 0, valueOf).concat(" km");
                    case 20:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem11 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem11.getClass();
                        return rei.m(footballTopPlayersStatisticsItem11.getSaves(), footballTopPlayersStatisticsItem11.getAppearances());
                    case 21:
                        FootballTopPlayersStatistics footballTopPlayersStatistics11 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics11.getClass();
                        return footballTopPlayersStatistics11.getGoalsPrevented();
                    case 22:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem12 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem12.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem12.getGoalsPrevented());
                    case 23:
                        FootballTopPlayersStatistics footballTopPlayersStatistics12 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics12.getClass();
                        return footballTopPlayersStatistics12.getMostConceded();
                    case 24:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem13 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem13.getClass();
                        return rei.m(footballTopPlayersStatisticsItem13.getGoalsConceded(), footballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem14 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem14.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem14.getExpectedGoals()) + " (" + footballTopPlayersStatisticsItem14.getGoals() + ")";
                    case 26:
                        FootballTopPlayersStatistics footballTopPlayersStatistics13 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics13.getClass();
                        return footballTopPlayersStatistics13.getLeastConceded();
                    case 27:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem15 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem15.getClass();
                        return rei.m(footballTopPlayersStatisticsItem15.getGoalsConceded(), footballTopPlayersStatisticsItem15.getAppearances());
                    case 28:
                        FootballTopPlayersStatistics footballTopPlayersStatistics14 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics14.getClass();
                        return footballTopPlayersStatistics14.getCleanSheet();
                    default:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem16 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem16.getClass();
                        return yid.j(footballTopPlayersStatisticsItem16.getCleanSheet());
                }
            }
        }, null, 248);
        final int i13 = 4;
        final int i14 = 5;
        qab qabVar22 = new qab("TACKLES_PER_GAME", 21, R.string.football_tackles_per_game, new Function1() { // from class: oab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i13) {
                    case 0:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem.getClass();
                        return rei.o(footballTopPlayersStatisticsItem.getSuccessfulDribbles(), footballTopPlayersStatisticsItem.getAppearances(), footballTopPlayersStatisticsItem.getSuccessfulDribblesPercentage(), 0);
                    case 1:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem2 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem2.getClass();
                        return yid.j(footballTopPlayersStatisticsItem2.getGoals());
                    case 2:
                        FootballTopPlayersStatistics footballTopPlayersStatistics = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics.getClass();
                        return footballTopPlayersStatistics.getPenaltyWon();
                    case 3:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem3 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem3.getClass();
                        return yid.j(footballTopPlayersStatisticsItem3.getPenaltyWon());
                    case 4:
                        FootballTopPlayersStatistics footballTopPlayersStatistics2 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics2.getClass();
                        return footballTopPlayersStatistics2.getTackles();
                    case 5:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem4 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem4.getClass();
                        return rei.m(footballTopPlayersStatisticsItem4.getTackles(), footballTopPlayersStatisticsItem4.getAppearances());
                    case 6:
                        FootballTopPlayersStatistics footballTopPlayersStatistics3 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics3.getClass();
                        return footballTopPlayersStatistics3.getInterceptions();
                    case 7:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem5 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem5.getClass();
                        return rei.m(footballTopPlayersStatisticsItem5.getInterceptions(), footballTopPlayersStatisticsItem5.getAppearances());
                    case 8:
                        FootballTopPlayersStatistics footballTopPlayersStatistics4 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics4.getClass();
                        return footballTopPlayersStatistics4.getKilometersCovered();
                    case 9:
                        FootballTopPlayersStatistics footballTopPlayersStatistics5 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics5.getClass();
                        return footballTopPlayersStatistics5.getClearances();
                    case 10:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem6 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem6.getClass();
                        return rei.m(footballTopPlayersStatisticsItem6.getClearances(), footballTopPlayersStatisticsItem6.getAppearances());
                    case 11:
                        FootballTopPlayersStatistics footballTopPlayersStatistics6 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics6.getClass();
                        return footballTopPlayersStatistics6.getPossessionLost();
                    case 12:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem7 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem7.getClass();
                        return rei.m(footballTopPlayersStatisticsItem7.getPossessionLost(), footballTopPlayersStatisticsItem7.getAppearances());
                    case 13:
                        FootballTopPlayersStatistics footballTopPlayersStatistics7 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics7.getClass();
                        return footballTopPlayersStatistics7.getExpectedGoals();
                    case 14:
                        FootballTopPlayersStatistics footballTopPlayersStatistics8 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics8.getClass();
                        return footballTopPlayersStatistics8.getYellowCards();
                    case 15:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem8 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem8.getClass();
                        return yid.j(footballTopPlayersStatisticsItem8.getYellowCards());
                    case 16:
                        FootballTopPlayersStatistics footballTopPlayersStatistics9 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics9.getClass();
                        return footballTopPlayersStatistics9.getRedCards();
                    case 17:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem9 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem9.getClass();
                        return yid.j(footballTopPlayersStatisticsItem9.getRedCards());
                    case 18:
                        FootballTopPlayersStatistics footballTopPlayersStatistics10 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics10.getClass();
                        return footballTopPlayersStatistics10.getSaves();
                    case 19:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem10 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem10.getClass();
                        Double kilometersCovered = footballTopPlayersStatisticsItem10.getKilometersCovered();
                        Double valueOf = Double.valueOf(kilometersCovered != null ? kilometersCovered.doubleValue() : 0.0d);
                        Integer minutesPlayed = footballTopPlayersStatisticsItem10.getMinutesPlayed();
                        return rei.q(minutesPlayed != null ? minutesPlayed.intValue() : 0, valueOf).concat(" km");
                    case 20:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem11 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem11.getClass();
                        return rei.m(footballTopPlayersStatisticsItem11.getSaves(), footballTopPlayersStatisticsItem11.getAppearances());
                    case 21:
                        FootballTopPlayersStatistics footballTopPlayersStatistics11 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics11.getClass();
                        return footballTopPlayersStatistics11.getGoalsPrevented();
                    case 22:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem12 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem12.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem12.getGoalsPrevented());
                    case 23:
                        FootballTopPlayersStatistics footballTopPlayersStatistics12 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics12.getClass();
                        return footballTopPlayersStatistics12.getMostConceded();
                    case 24:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem13 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem13.getClass();
                        return rei.m(footballTopPlayersStatisticsItem13.getGoalsConceded(), footballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem14 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem14.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem14.getExpectedGoals()) + " (" + footballTopPlayersStatisticsItem14.getGoals() + ")";
                    case 26:
                        FootballTopPlayersStatistics footballTopPlayersStatistics13 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics13.getClass();
                        return footballTopPlayersStatistics13.getLeastConceded();
                    case 27:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem15 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem15.getClass();
                        return rei.m(footballTopPlayersStatisticsItem15.getGoalsConceded(), footballTopPlayersStatisticsItem15.getAppearances());
                    case 28:
                        FootballTopPlayersStatistics footballTopPlayersStatistics14 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics14.getClass();
                        return footballTopPlayersStatistics14.getCleanSheet();
                    default:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem16 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem16.getClass();
                        return yid.j(footballTopPlayersStatisticsItem16.getCleanSheet());
                }
            }
        }, new Function1() { // from class: oab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem.getClass();
                        return rei.o(footballTopPlayersStatisticsItem.getSuccessfulDribbles(), footballTopPlayersStatisticsItem.getAppearances(), footballTopPlayersStatisticsItem.getSuccessfulDribblesPercentage(), 0);
                    case 1:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem2 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem2.getClass();
                        return yid.j(footballTopPlayersStatisticsItem2.getGoals());
                    case 2:
                        FootballTopPlayersStatistics footballTopPlayersStatistics = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics.getClass();
                        return footballTopPlayersStatistics.getPenaltyWon();
                    case 3:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem3 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem3.getClass();
                        return yid.j(footballTopPlayersStatisticsItem3.getPenaltyWon());
                    case 4:
                        FootballTopPlayersStatistics footballTopPlayersStatistics2 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics2.getClass();
                        return footballTopPlayersStatistics2.getTackles();
                    case 5:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem4 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem4.getClass();
                        return rei.m(footballTopPlayersStatisticsItem4.getTackles(), footballTopPlayersStatisticsItem4.getAppearances());
                    case 6:
                        FootballTopPlayersStatistics footballTopPlayersStatistics3 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics3.getClass();
                        return footballTopPlayersStatistics3.getInterceptions();
                    case 7:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem5 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem5.getClass();
                        return rei.m(footballTopPlayersStatisticsItem5.getInterceptions(), footballTopPlayersStatisticsItem5.getAppearances());
                    case 8:
                        FootballTopPlayersStatistics footballTopPlayersStatistics4 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics4.getClass();
                        return footballTopPlayersStatistics4.getKilometersCovered();
                    case 9:
                        FootballTopPlayersStatistics footballTopPlayersStatistics5 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics5.getClass();
                        return footballTopPlayersStatistics5.getClearances();
                    case 10:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem6 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem6.getClass();
                        return rei.m(footballTopPlayersStatisticsItem6.getClearances(), footballTopPlayersStatisticsItem6.getAppearances());
                    case 11:
                        FootballTopPlayersStatistics footballTopPlayersStatistics6 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics6.getClass();
                        return footballTopPlayersStatistics6.getPossessionLost();
                    case 12:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem7 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem7.getClass();
                        return rei.m(footballTopPlayersStatisticsItem7.getPossessionLost(), footballTopPlayersStatisticsItem7.getAppearances());
                    case 13:
                        FootballTopPlayersStatistics footballTopPlayersStatistics7 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics7.getClass();
                        return footballTopPlayersStatistics7.getExpectedGoals();
                    case 14:
                        FootballTopPlayersStatistics footballTopPlayersStatistics8 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics8.getClass();
                        return footballTopPlayersStatistics8.getYellowCards();
                    case 15:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem8 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem8.getClass();
                        return yid.j(footballTopPlayersStatisticsItem8.getYellowCards());
                    case 16:
                        FootballTopPlayersStatistics footballTopPlayersStatistics9 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics9.getClass();
                        return footballTopPlayersStatistics9.getRedCards();
                    case 17:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem9 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem9.getClass();
                        return yid.j(footballTopPlayersStatisticsItem9.getRedCards());
                    case 18:
                        FootballTopPlayersStatistics footballTopPlayersStatistics10 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics10.getClass();
                        return footballTopPlayersStatistics10.getSaves();
                    case 19:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem10 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem10.getClass();
                        Double kilometersCovered = footballTopPlayersStatisticsItem10.getKilometersCovered();
                        Double valueOf = Double.valueOf(kilometersCovered != null ? kilometersCovered.doubleValue() : 0.0d);
                        Integer minutesPlayed = footballTopPlayersStatisticsItem10.getMinutesPlayed();
                        return rei.q(minutesPlayed != null ? minutesPlayed.intValue() : 0, valueOf).concat(" km");
                    case 20:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem11 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem11.getClass();
                        return rei.m(footballTopPlayersStatisticsItem11.getSaves(), footballTopPlayersStatisticsItem11.getAppearances());
                    case 21:
                        FootballTopPlayersStatistics footballTopPlayersStatistics11 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics11.getClass();
                        return footballTopPlayersStatistics11.getGoalsPrevented();
                    case 22:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem12 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem12.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem12.getGoalsPrevented());
                    case 23:
                        FootballTopPlayersStatistics footballTopPlayersStatistics12 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics12.getClass();
                        return footballTopPlayersStatistics12.getMostConceded();
                    case 24:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem13 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem13.getClass();
                        return rei.m(footballTopPlayersStatisticsItem13.getGoalsConceded(), footballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem14 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem14.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem14.getExpectedGoals()) + " (" + footballTopPlayersStatisticsItem14.getGoals() + ")";
                    case 26:
                        FootballTopPlayersStatistics footballTopPlayersStatistics13 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics13.getClass();
                        return footballTopPlayersStatistics13.getLeastConceded();
                    case 27:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem15 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem15.getClass();
                        return rei.m(footballTopPlayersStatisticsItem15.getGoalsConceded(), footballTopPlayersStatisticsItem15.getAppearances());
                    case 28:
                        FootballTopPlayersStatistics footballTopPlayersStatistics14 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics14.getClass();
                        return footballTopPlayersStatistics14.getCleanSheet();
                    default:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem16 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem16.getClass();
                        return yid.j(footballTopPlayersStatisticsItem16.getCleanSheet());
                }
            }
        }, Integer.valueOf(R.drawable.ic_mma_discipline), 88);
        qab qabVar23 = new qab("INTERCEPTIONS_PER_GAME", 22, R.string.football_interceptions_per_game, new Function1() { // from class: oab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i11) {
                    case 0:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem.getClass();
                        return rei.o(footballTopPlayersStatisticsItem.getSuccessfulDribbles(), footballTopPlayersStatisticsItem.getAppearances(), footballTopPlayersStatisticsItem.getSuccessfulDribblesPercentage(), 0);
                    case 1:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem2 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem2.getClass();
                        return yid.j(footballTopPlayersStatisticsItem2.getGoals());
                    case 2:
                        FootballTopPlayersStatistics footballTopPlayersStatistics = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics.getClass();
                        return footballTopPlayersStatistics.getPenaltyWon();
                    case 3:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem3 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem3.getClass();
                        return yid.j(footballTopPlayersStatisticsItem3.getPenaltyWon());
                    case 4:
                        FootballTopPlayersStatistics footballTopPlayersStatistics2 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics2.getClass();
                        return footballTopPlayersStatistics2.getTackles();
                    case 5:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem4 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem4.getClass();
                        return rei.m(footballTopPlayersStatisticsItem4.getTackles(), footballTopPlayersStatisticsItem4.getAppearances());
                    case 6:
                        FootballTopPlayersStatistics footballTopPlayersStatistics3 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics3.getClass();
                        return footballTopPlayersStatistics3.getInterceptions();
                    case 7:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem5 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem5.getClass();
                        return rei.m(footballTopPlayersStatisticsItem5.getInterceptions(), footballTopPlayersStatisticsItem5.getAppearances());
                    case 8:
                        FootballTopPlayersStatistics footballTopPlayersStatistics4 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics4.getClass();
                        return footballTopPlayersStatistics4.getKilometersCovered();
                    case 9:
                        FootballTopPlayersStatistics footballTopPlayersStatistics5 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics5.getClass();
                        return footballTopPlayersStatistics5.getClearances();
                    case 10:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem6 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem6.getClass();
                        return rei.m(footballTopPlayersStatisticsItem6.getClearances(), footballTopPlayersStatisticsItem6.getAppearances());
                    case 11:
                        FootballTopPlayersStatistics footballTopPlayersStatistics6 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics6.getClass();
                        return footballTopPlayersStatistics6.getPossessionLost();
                    case 12:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem7 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem7.getClass();
                        return rei.m(footballTopPlayersStatisticsItem7.getPossessionLost(), footballTopPlayersStatisticsItem7.getAppearances());
                    case 13:
                        FootballTopPlayersStatistics footballTopPlayersStatistics7 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics7.getClass();
                        return footballTopPlayersStatistics7.getExpectedGoals();
                    case 14:
                        FootballTopPlayersStatistics footballTopPlayersStatistics8 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics8.getClass();
                        return footballTopPlayersStatistics8.getYellowCards();
                    case 15:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem8 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem8.getClass();
                        return yid.j(footballTopPlayersStatisticsItem8.getYellowCards());
                    case 16:
                        FootballTopPlayersStatistics footballTopPlayersStatistics9 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics9.getClass();
                        return footballTopPlayersStatistics9.getRedCards();
                    case 17:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem9 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem9.getClass();
                        return yid.j(footballTopPlayersStatisticsItem9.getRedCards());
                    case 18:
                        FootballTopPlayersStatistics footballTopPlayersStatistics10 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics10.getClass();
                        return footballTopPlayersStatistics10.getSaves();
                    case 19:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem10 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem10.getClass();
                        Double kilometersCovered = footballTopPlayersStatisticsItem10.getKilometersCovered();
                        Double valueOf = Double.valueOf(kilometersCovered != null ? kilometersCovered.doubleValue() : 0.0d);
                        Integer minutesPlayed = footballTopPlayersStatisticsItem10.getMinutesPlayed();
                        return rei.q(minutesPlayed != null ? minutesPlayed.intValue() : 0, valueOf).concat(" km");
                    case 20:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem11 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem11.getClass();
                        return rei.m(footballTopPlayersStatisticsItem11.getSaves(), footballTopPlayersStatisticsItem11.getAppearances());
                    case 21:
                        FootballTopPlayersStatistics footballTopPlayersStatistics11 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics11.getClass();
                        return footballTopPlayersStatistics11.getGoalsPrevented();
                    case 22:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem12 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem12.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem12.getGoalsPrevented());
                    case 23:
                        FootballTopPlayersStatistics footballTopPlayersStatistics12 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics12.getClass();
                        return footballTopPlayersStatistics12.getMostConceded();
                    case 24:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem13 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem13.getClass();
                        return rei.m(footballTopPlayersStatisticsItem13.getGoalsConceded(), footballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem14 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem14.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem14.getExpectedGoals()) + " (" + footballTopPlayersStatisticsItem14.getGoals() + ")";
                    case 26:
                        FootballTopPlayersStatistics footballTopPlayersStatistics13 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics13.getClass();
                        return footballTopPlayersStatistics13.getLeastConceded();
                    case 27:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem15 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem15.getClass();
                        return rei.m(footballTopPlayersStatisticsItem15.getGoalsConceded(), footballTopPlayersStatisticsItem15.getAppearances());
                    case 28:
                        FootballTopPlayersStatistics footballTopPlayersStatistics14 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics14.getClass();
                        return footballTopPlayersStatistics14.getCleanSheet();
                    default:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem16 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem16.getClass();
                        return yid.j(footballTopPlayersStatisticsItem16.getCleanSheet());
                }
            }
        }, new Function1() { // from class: oab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i2) {
                    case 0:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem.getClass();
                        return rei.o(footballTopPlayersStatisticsItem.getSuccessfulDribbles(), footballTopPlayersStatisticsItem.getAppearances(), footballTopPlayersStatisticsItem.getSuccessfulDribblesPercentage(), 0);
                    case 1:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem2 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem2.getClass();
                        return yid.j(footballTopPlayersStatisticsItem2.getGoals());
                    case 2:
                        FootballTopPlayersStatistics footballTopPlayersStatistics = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics.getClass();
                        return footballTopPlayersStatistics.getPenaltyWon();
                    case 3:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem3 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem3.getClass();
                        return yid.j(footballTopPlayersStatisticsItem3.getPenaltyWon());
                    case 4:
                        FootballTopPlayersStatistics footballTopPlayersStatistics2 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics2.getClass();
                        return footballTopPlayersStatistics2.getTackles();
                    case 5:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem4 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem4.getClass();
                        return rei.m(footballTopPlayersStatisticsItem4.getTackles(), footballTopPlayersStatisticsItem4.getAppearances());
                    case 6:
                        FootballTopPlayersStatistics footballTopPlayersStatistics3 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics3.getClass();
                        return footballTopPlayersStatistics3.getInterceptions();
                    case 7:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem5 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem5.getClass();
                        return rei.m(footballTopPlayersStatisticsItem5.getInterceptions(), footballTopPlayersStatisticsItem5.getAppearances());
                    case 8:
                        FootballTopPlayersStatistics footballTopPlayersStatistics4 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics4.getClass();
                        return footballTopPlayersStatistics4.getKilometersCovered();
                    case 9:
                        FootballTopPlayersStatistics footballTopPlayersStatistics5 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics5.getClass();
                        return footballTopPlayersStatistics5.getClearances();
                    case 10:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem6 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem6.getClass();
                        return rei.m(footballTopPlayersStatisticsItem6.getClearances(), footballTopPlayersStatisticsItem6.getAppearances());
                    case 11:
                        FootballTopPlayersStatistics footballTopPlayersStatistics6 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics6.getClass();
                        return footballTopPlayersStatistics6.getPossessionLost();
                    case 12:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem7 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem7.getClass();
                        return rei.m(footballTopPlayersStatisticsItem7.getPossessionLost(), footballTopPlayersStatisticsItem7.getAppearances());
                    case 13:
                        FootballTopPlayersStatistics footballTopPlayersStatistics7 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics7.getClass();
                        return footballTopPlayersStatistics7.getExpectedGoals();
                    case 14:
                        FootballTopPlayersStatistics footballTopPlayersStatistics8 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics8.getClass();
                        return footballTopPlayersStatistics8.getYellowCards();
                    case 15:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem8 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem8.getClass();
                        return yid.j(footballTopPlayersStatisticsItem8.getYellowCards());
                    case 16:
                        FootballTopPlayersStatistics footballTopPlayersStatistics9 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics9.getClass();
                        return footballTopPlayersStatistics9.getRedCards();
                    case 17:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem9 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem9.getClass();
                        return yid.j(footballTopPlayersStatisticsItem9.getRedCards());
                    case 18:
                        FootballTopPlayersStatistics footballTopPlayersStatistics10 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics10.getClass();
                        return footballTopPlayersStatistics10.getSaves();
                    case 19:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem10 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem10.getClass();
                        Double kilometersCovered = footballTopPlayersStatisticsItem10.getKilometersCovered();
                        Double valueOf = Double.valueOf(kilometersCovered != null ? kilometersCovered.doubleValue() : 0.0d);
                        Integer minutesPlayed = footballTopPlayersStatisticsItem10.getMinutesPlayed();
                        return rei.q(minutesPlayed != null ? minutesPlayed.intValue() : 0, valueOf).concat(" km");
                    case 20:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem11 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem11.getClass();
                        return rei.m(footballTopPlayersStatisticsItem11.getSaves(), footballTopPlayersStatisticsItem11.getAppearances());
                    case 21:
                        FootballTopPlayersStatistics footballTopPlayersStatistics11 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics11.getClass();
                        return footballTopPlayersStatistics11.getGoalsPrevented();
                    case 22:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem12 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem12.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem12.getGoalsPrevented());
                    case 23:
                        FootballTopPlayersStatistics footballTopPlayersStatistics12 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics12.getClass();
                        return footballTopPlayersStatistics12.getMostConceded();
                    case 24:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem13 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem13.getClass();
                        return rei.m(footballTopPlayersStatisticsItem13.getGoalsConceded(), footballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem14 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem14.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem14.getExpectedGoals()) + " (" + footballTopPlayersStatisticsItem14.getGoals() + ")";
                    case 26:
                        FootballTopPlayersStatistics footballTopPlayersStatistics13 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics13.getClass();
                        return footballTopPlayersStatistics13.getLeastConceded();
                    case 27:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem15 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem15.getClass();
                        return rei.m(footballTopPlayersStatisticsItem15.getGoalsConceded(), footballTopPlayersStatisticsItem15.getAppearances());
                    case 28:
                        FootballTopPlayersStatistics footballTopPlayersStatistics14 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics14.getClass();
                        return footballTopPlayersStatistics14.getCleanSheet();
                    default:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem16 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem16.getClass();
                        return yid.j(footballTopPlayersStatisticsItem16.getCleanSheet());
                }
            }
        }, Integer.valueOf(R.drawable.ic_download), 88);
        final int i15 = 9;
        final int i16 = 10;
        qab qabVar24 = new qab("CLEARANCES_PER_GAME", 23, R.string.football_clearances_per_game, new Function1() { // from class: oab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i15) {
                    case 0:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem.getClass();
                        return rei.o(footballTopPlayersStatisticsItem.getSuccessfulDribbles(), footballTopPlayersStatisticsItem.getAppearances(), footballTopPlayersStatisticsItem.getSuccessfulDribblesPercentage(), 0);
                    case 1:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem2 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem2.getClass();
                        return yid.j(footballTopPlayersStatisticsItem2.getGoals());
                    case 2:
                        FootballTopPlayersStatistics footballTopPlayersStatistics = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics.getClass();
                        return footballTopPlayersStatistics.getPenaltyWon();
                    case 3:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem3 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem3.getClass();
                        return yid.j(footballTopPlayersStatisticsItem3.getPenaltyWon());
                    case 4:
                        FootballTopPlayersStatistics footballTopPlayersStatistics2 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics2.getClass();
                        return footballTopPlayersStatistics2.getTackles();
                    case 5:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem4 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem4.getClass();
                        return rei.m(footballTopPlayersStatisticsItem4.getTackles(), footballTopPlayersStatisticsItem4.getAppearances());
                    case 6:
                        FootballTopPlayersStatistics footballTopPlayersStatistics3 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics3.getClass();
                        return footballTopPlayersStatistics3.getInterceptions();
                    case 7:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem5 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem5.getClass();
                        return rei.m(footballTopPlayersStatisticsItem5.getInterceptions(), footballTopPlayersStatisticsItem5.getAppearances());
                    case 8:
                        FootballTopPlayersStatistics footballTopPlayersStatistics4 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics4.getClass();
                        return footballTopPlayersStatistics4.getKilometersCovered();
                    case 9:
                        FootballTopPlayersStatistics footballTopPlayersStatistics5 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics5.getClass();
                        return footballTopPlayersStatistics5.getClearances();
                    case 10:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem6 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem6.getClass();
                        return rei.m(footballTopPlayersStatisticsItem6.getClearances(), footballTopPlayersStatisticsItem6.getAppearances());
                    case 11:
                        FootballTopPlayersStatistics footballTopPlayersStatistics6 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics6.getClass();
                        return footballTopPlayersStatistics6.getPossessionLost();
                    case 12:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem7 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem7.getClass();
                        return rei.m(footballTopPlayersStatisticsItem7.getPossessionLost(), footballTopPlayersStatisticsItem7.getAppearances());
                    case 13:
                        FootballTopPlayersStatistics footballTopPlayersStatistics7 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics7.getClass();
                        return footballTopPlayersStatistics7.getExpectedGoals();
                    case 14:
                        FootballTopPlayersStatistics footballTopPlayersStatistics8 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics8.getClass();
                        return footballTopPlayersStatistics8.getYellowCards();
                    case 15:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem8 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem8.getClass();
                        return yid.j(footballTopPlayersStatisticsItem8.getYellowCards());
                    case 16:
                        FootballTopPlayersStatistics footballTopPlayersStatistics9 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics9.getClass();
                        return footballTopPlayersStatistics9.getRedCards();
                    case 17:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem9 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem9.getClass();
                        return yid.j(footballTopPlayersStatisticsItem9.getRedCards());
                    case 18:
                        FootballTopPlayersStatistics footballTopPlayersStatistics10 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics10.getClass();
                        return footballTopPlayersStatistics10.getSaves();
                    case 19:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem10 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem10.getClass();
                        Double kilometersCovered = footballTopPlayersStatisticsItem10.getKilometersCovered();
                        Double valueOf = Double.valueOf(kilometersCovered != null ? kilometersCovered.doubleValue() : 0.0d);
                        Integer minutesPlayed = footballTopPlayersStatisticsItem10.getMinutesPlayed();
                        return rei.q(minutesPlayed != null ? minutesPlayed.intValue() : 0, valueOf).concat(" km");
                    case 20:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem11 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem11.getClass();
                        return rei.m(footballTopPlayersStatisticsItem11.getSaves(), footballTopPlayersStatisticsItem11.getAppearances());
                    case 21:
                        FootballTopPlayersStatistics footballTopPlayersStatistics11 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics11.getClass();
                        return footballTopPlayersStatistics11.getGoalsPrevented();
                    case 22:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem12 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem12.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem12.getGoalsPrevented());
                    case 23:
                        FootballTopPlayersStatistics footballTopPlayersStatistics12 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics12.getClass();
                        return footballTopPlayersStatistics12.getMostConceded();
                    case 24:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem13 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem13.getClass();
                        return rei.m(footballTopPlayersStatisticsItem13.getGoalsConceded(), footballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem14 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem14.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem14.getExpectedGoals()) + " (" + footballTopPlayersStatisticsItem14.getGoals() + ")";
                    case 26:
                        FootballTopPlayersStatistics footballTopPlayersStatistics13 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics13.getClass();
                        return footballTopPlayersStatistics13.getLeastConceded();
                    case 27:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem15 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem15.getClass();
                        return rei.m(footballTopPlayersStatisticsItem15.getGoalsConceded(), footballTopPlayersStatisticsItem15.getAppearances());
                    case 28:
                        FootballTopPlayersStatistics footballTopPlayersStatistics14 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics14.getClass();
                        return footballTopPlayersStatistics14.getCleanSheet();
                    default:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem16 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem16.getClass();
                        return yid.j(footballTopPlayersStatisticsItem16.getCleanSheet());
                }
            }
        }, new Function1() { // from class: oab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i16) {
                    case 0:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem.getClass();
                        return rei.o(footballTopPlayersStatisticsItem.getSuccessfulDribbles(), footballTopPlayersStatisticsItem.getAppearances(), footballTopPlayersStatisticsItem.getSuccessfulDribblesPercentage(), 0);
                    case 1:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem2 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem2.getClass();
                        return yid.j(footballTopPlayersStatisticsItem2.getGoals());
                    case 2:
                        FootballTopPlayersStatistics footballTopPlayersStatistics = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics.getClass();
                        return footballTopPlayersStatistics.getPenaltyWon();
                    case 3:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem3 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem3.getClass();
                        return yid.j(footballTopPlayersStatisticsItem3.getPenaltyWon());
                    case 4:
                        FootballTopPlayersStatistics footballTopPlayersStatistics2 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics2.getClass();
                        return footballTopPlayersStatistics2.getTackles();
                    case 5:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem4 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem4.getClass();
                        return rei.m(footballTopPlayersStatisticsItem4.getTackles(), footballTopPlayersStatisticsItem4.getAppearances());
                    case 6:
                        FootballTopPlayersStatistics footballTopPlayersStatistics3 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics3.getClass();
                        return footballTopPlayersStatistics3.getInterceptions();
                    case 7:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem5 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem5.getClass();
                        return rei.m(footballTopPlayersStatisticsItem5.getInterceptions(), footballTopPlayersStatisticsItem5.getAppearances());
                    case 8:
                        FootballTopPlayersStatistics footballTopPlayersStatistics4 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics4.getClass();
                        return footballTopPlayersStatistics4.getKilometersCovered();
                    case 9:
                        FootballTopPlayersStatistics footballTopPlayersStatistics5 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics5.getClass();
                        return footballTopPlayersStatistics5.getClearances();
                    case 10:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem6 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem6.getClass();
                        return rei.m(footballTopPlayersStatisticsItem6.getClearances(), footballTopPlayersStatisticsItem6.getAppearances());
                    case 11:
                        FootballTopPlayersStatistics footballTopPlayersStatistics6 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics6.getClass();
                        return footballTopPlayersStatistics6.getPossessionLost();
                    case 12:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem7 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem7.getClass();
                        return rei.m(footballTopPlayersStatisticsItem7.getPossessionLost(), footballTopPlayersStatisticsItem7.getAppearances());
                    case 13:
                        FootballTopPlayersStatistics footballTopPlayersStatistics7 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics7.getClass();
                        return footballTopPlayersStatistics7.getExpectedGoals();
                    case 14:
                        FootballTopPlayersStatistics footballTopPlayersStatistics8 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics8.getClass();
                        return footballTopPlayersStatistics8.getYellowCards();
                    case 15:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem8 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem8.getClass();
                        return yid.j(footballTopPlayersStatisticsItem8.getYellowCards());
                    case 16:
                        FootballTopPlayersStatistics footballTopPlayersStatistics9 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics9.getClass();
                        return footballTopPlayersStatistics9.getRedCards();
                    case 17:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem9 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem9.getClass();
                        return yid.j(footballTopPlayersStatisticsItem9.getRedCards());
                    case 18:
                        FootballTopPlayersStatistics footballTopPlayersStatistics10 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics10.getClass();
                        return footballTopPlayersStatistics10.getSaves();
                    case 19:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem10 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem10.getClass();
                        Double kilometersCovered = footballTopPlayersStatisticsItem10.getKilometersCovered();
                        Double valueOf = Double.valueOf(kilometersCovered != null ? kilometersCovered.doubleValue() : 0.0d);
                        Integer minutesPlayed = footballTopPlayersStatisticsItem10.getMinutesPlayed();
                        return rei.q(minutesPlayed != null ? minutesPlayed.intValue() : 0, valueOf).concat(" km");
                    case 20:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem11 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem11.getClass();
                        return rei.m(footballTopPlayersStatisticsItem11.getSaves(), footballTopPlayersStatisticsItem11.getAppearances());
                    case 21:
                        FootballTopPlayersStatistics footballTopPlayersStatistics11 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics11.getClass();
                        return footballTopPlayersStatistics11.getGoalsPrevented();
                    case 22:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem12 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem12.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem12.getGoalsPrevented());
                    case 23:
                        FootballTopPlayersStatistics footballTopPlayersStatistics12 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics12.getClass();
                        return footballTopPlayersStatistics12.getMostConceded();
                    case 24:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem13 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem13.getClass();
                        return rei.m(footballTopPlayersStatisticsItem13.getGoalsConceded(), footballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem14 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem14.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem14.getExpectedGoals()) + " (" + footballTopPlayersStatisticsItem14.getGoals() + ")";
                    case 26:
                        FootballTopPlayersStatistics footballTopPlayersStatistics13 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics13.getClass();
                        return footballTopPlayersStatistics13.getLeastConceded();
                    case 27:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem15 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem15.getClass();
                        return rei.m(footballTopPlayersStatisticsItem15.getGoalsConceded(), footballTopPlayersStatisticsItem15.getAppearances());
                    case 28:
                        FootballTopPlayersStatistics footballTopPlayersStatistics14 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics14.getClass();
                        return footballTopPlayersStatistics14.getCleanSheet();
                    default:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem16 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem16.getClass();
                        return yid.j(footballTopPlayersStatisticsItem16.getCleanSheet());
                }
            }
        }, null, 248);
        final int i17 = 12;
        qab qabVar25 = new qab("POSS_LOST_PER_GAME", 24, R.string.football_possession_lost_per_game, new Function1() { // from class: oab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i12) {
                    case 0:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem.getClass();
                        return rei.o(footballTopPlayersStatisticsItem.getSuccessfulDribbles(), footballTopPlayersStatisticsItem.getAppearances(), footballTopPlayersStatisticsItem.getSuccessfulDribblesPercentage(), 0);
                    case 1:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem2 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem2.getClass();
                        return yid.j(footballTopPlayersStatisticsItem2.getGoals());
                    case 2:
                        FootballTopPlayersStatistics footballTopPlayersStatistics = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics.getClass();
                        return footballTopPlayersStatistics.getPenaltyWon();
                    case 3:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem3 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem3.getClass();
                        return yid.j(footballTopPlayersStatisticsItem3.getPenaltyWon());
                    case 4:
                        FootballTopPlayersStatistics footballTopPlayersStatistics2 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics2.getClass();
                        return footballTopPlayersStatistics2.getTackles();
                    case 5:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem4 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem4.getClass();
                        return rei.m(footballTopPlayersStatisticsItem4.getTackles(), footballTopPlayersStatisticsItem4.getAppearances());
                    case 6:
                        FootballTopPlayersStatistics footballTopPlayersStatistics3 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics3.getClass();
                        return footballTopPlayersStatistics3.getInterceptions();
                    case 7:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem5 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem5.getClass();
                        return rei.m(footballTopPlayersStatisticsItem5.getInterceptions(), footballTopPlayersStatisticsItem5.getAppearances());
                    case 8:
                        FootballTopPlayersStatistics footballTopPlayersStatistics4 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics4.getClass();
                        return footballTopPlayersStatistics4.getKilometersCovered();
                    case 9:
                        FootballTopPlayersStatistics footballTopPlayersStatistics5 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics5.getClass();
                        return footballTopPlayersStatistics5.getClearances();
                    case 10:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem6 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem6.getClass();
                        return rei.m(footballTopPlayersStatisticsItem6.getClearances(), footballTopPlayersStatisticsItem6.getAppearances());
                    case 11:
                        FootballTopPlayersStatistics footballTopPlayersStatistics6 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics6.getClass();
                        return footballTopPlayersStatistics6.getPossessionLost();
                    case 12:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem7 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem7.getClass();
                        return rei.m(footballTopPlayersStatisticsItem7.getPossessionLost(), footballTopPlayersStatisticsItem7.getAppearances());
                    case 13:
                        FootballTopPlayersStatistics footballTopPlayersStatistics7 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics7.getClass();
                        return footballTopPlayersStatistics7.getExpectedGoals();
                    case 14:
                        FootballTopPlayersStatistics footballTopPlayersStatistics8 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics8.getClass();
                        return footballTopPlayersStatistics8.getYellowCards();
                    case 15:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem8 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem8.getClass();
                        return yid.j(footballTopPlayersStatisticsItem8.getYellowCards());
                    case 16:
                        FootballTopPlayersStatistics footballTopPlayersStatistics9 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics9.getClass();
                        return footballTopPlayersStatistics9.getRedCards();
                    case 17:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem9 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem9.getClass();
                        return yid.j(footballTopPlayersStatisticsItem9.getRedCards());
                    case 18:
                        FootballTopPlayersStatistics footballTopPlayersStatistics10 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics10.getClass();
                        return footballTopPlayersStatistics10.getSaves();
                    case 19:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem10 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem10.getClass();
                        Double kilometersCovered = footballTopPlayersStatisticsItem10.getKilometersCovered();
                        Double valueOf = Double.valueOf(kilometersCovered != null ? kilometersCovered.doubleValue() : 0.0d);
                        Integer minutesPlayed = footballTopPlayersStatisticsItem10.getMinutesPlayed();
                        return rei.q(minutesPlayed != null ? minutesPlayed.intValue() : 0, valueOf).concat(" km");
                    case 20:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem11 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem11.getClass();
                        return rei.m(footballTopPlayersStatisticsItem11.getSaves(), footballTopPlayersStatisticsItem11.getAppearances());
                    case 21:
                        FootballTopPlayersStatistics footballTopPlayersStatistics11 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics11.getClass();
                        return footballTopPlayersStatistics11.getGoalsPrevented();
                    case 22:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem12 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem12.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem12.getGoalsPrevented());
                    case 23:
                        FootballTopPlayersStatistics footballTopPlayersStatistics12 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics12.getClass();
                        return footballTopPlayersStatistics12.getMostConceded();
                    case 24:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem13 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem13.getClass();
                        return rei.m(footballTopPlayersStatisticsItem13.getGoalsConceded(), footballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem14 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem14.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem14.getExpectedGoals()) + " (" + footballTopPlayersStatisticsItem14.getGoals() + ")";
                    case 26:
                        FootballTopPlayersStatistics footballTopPlayersStatistics13 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics13.getClass();
                        return footballTopPlayersStatistics13.getLeastConceded();
                    case 27:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem15 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem15.getClass();
                        return rei.m(footballTopPlayersStatisticsItem15.getGoalsConceded(), footballTopPlayersStatisticsItem15.getAppearances());
                    case 28:
                        FootballTopPlayersStatistics footballTopPlayersStatistics14 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics14.getClass();
                        return footballTopPlayersStatistics14.getCleanSheet();
                    default:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem16 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem16.getClass();
                        return yid.j(footballTopPlayersStatisticsItem16.getCleanSheet());
                }
            }
        }, new Function1() { // from class: oab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i17) {
                    case 0:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem.getClass();
                        return rei.o(footballTopPlayersStatisticsItem.getSuccessfulDribbles(), footballTopPlayersStatisticsItem.getAppearances(), footballTopPlayersStatisticsItem.getSuccessfulDribblesPercentage(), 0);
                    case 1:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem2 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem2.getClass();
                        return yid.j(footballTopPlayersStatisticsItem2.getGoals());
                    case 2:
                        FootballTopPlayersStatistics footballTopPlayersStatistics = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics.getClass();
                        return footballTopPlayersStatistics.getPenaltyWon();
                    case 3:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem3 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem3.getClass();
                        return yid.j(footballTopPlayersStatisticsItem3.getPenaltyWon());
                    case 4:
                        FootballTopPlayersStatistics footballTopPlayersStatistics2 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics2.getClass();
                        return footballTopPlayersStatistics2.getTackles();
                    case 5:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem4 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem4.getClass();
                        return rei.m(footballTopPlayersStatisticsItem4.getTackles(), footballTopPlayersStatisticsItem4.getAppearances());
                    case 6:
                        FootballTopPlayersStatistics footballTopPlayersStatistics3 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics3.getClass();
                        return footballTopPlayersStatistics3.getInterceptions();
                    case 7:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem5 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem5.getClass();
                        return rei.m(footballTopPlayersStatisticsItem5.getInterceptions(), footballTopPlayersStatisticsItem5.getAppearances());
                    case 8:
                        FootballTopPlayersStatistics footballTopPlayersStatistics4 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics4.getClass();
                        return footballTopPlayersStatistics4.getKilometersCovered();
                    case 9:
                        FootballTopPlayersStatistics footballTopPlayersStatistics5 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics5.getClass();
                        return footballTopPlayersStatistics5.getClearances();
                    case 10:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem6 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem6.getClass();
                        return rei.m(footballTopPlayersStatisticsItem6.getClearances(), footballTopPlayersStatisticsItem6.getAppearances());
                    case 11:
                        FootballTopPlayersStatistics footballTopPlayersStatistics6 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics6.getClass();
                        return footballTopPlayersStatistics6.getPossessionLost();
                    case 12:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem7 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem7.getClass();
                        return rei.m(footballTopPlayersStatisticsItem7.getPossessionLost(), footballTopPlayersStatisticsItem7.getAppearances());
                    case 13:
                        FootballTopPlayersStatistics footballTopPlayersStatistics7 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics7.getClass();
                        return footballTopPlayersStatistics7.getExpectedGoals();
                    case 14:
                        FootballTopPlayersStatistics footballTopPlayersStatistics8 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics8.getClass();
                        return footballTopPlayersStatistics8.getYellowCards();
                    case 15:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem8 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem8.getClass();
                        return yid.j(footballTopPlayersStatisticsItem8.getYellowCards());
                    case 16:
                        FootballTopPlayersStatistics footballTopPlayersStatistics9 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics9.getClass();
                        return footballTopPlayersStatistics9.getRedCards();
                    case 17:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem9 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem9.getClass();
                        return yid.j(footballTopPlayersStatisticsItem9.getRedCards());
                    case 18:
                        FootballTopPlayersStatistics footballTopPlayersStatistics10 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics10.getClass();
                        return footballTopPlayersStatistics10.getSaves();
                    case 19:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem10 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem10.getClass();
                        Double kilometersCovered = footballTopPlayersStatisticsItem10.getKilometersCovered();
                        Double valueOf = Double.valueOf(kilometersCovered != null ? kilometersCovered.doubleValue() : 0.0d);
                        Integer minutesPlayed = footballTopPlayersStatisticsItem10.getMinutesPlayed();
                        return rei.q(minutesPlayed != null ? minutesPlayed.intValue() : 0, valueOf).concat(" km");
                    case 20:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem11 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem11.getClass();
                        return rei.m(footballTopPlayersStatisticsItem11.getSaves(), footballTopPlayersStatisticsItem11.getAppearances());
                    case 21:
                        FootballTopPlayersStatistics footballTopPlayersStatistics11 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics11.getClass();
                        return footballTopPlayersStatistics11.getGoalsPrevented();
                    case 22:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem12 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem12.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem12.getGoalsPrevented());
                    case 23:
                        FootballTopPlayersStatistics footballTopPlayersStatistics12 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics12.getClass();
                        return footballTopPlayersStatistics12.getMostConceded();
                    case 24:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem13 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem13.getClass();
                        return rei.m(footballTopPlayersStatisticsItem13.getGoalsConceded(), footballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem14 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem14.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem14.getExpectedGoals()) + " (" + footballTopPlayersStatisticsItem14.getGoals() + ")";
                    case 26:
                        FootballTopPlayersStatistics footballTopPlayersStatistics13 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics13.getClass();
                        return footballTopPlayersStatistics13.getLeastConceded();
                    case 27:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem15 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem15.getClass();
                        return rei.m(footballTopPlayersStatisticsItem15.getGoalsConceded(), footballTopPlayersStatisticsItem15.getAppearances());
                    case 28:
                        FootballTopPlayersStatistics footballTopPlayersStatistics14 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics14.getClass();
                        return footballTopPlayersStatistics14.getCleanSheet();
                    default:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem16 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem16.getClass();
                        return yid.j(footballTopPlayersStatisticsItem16.getCleanSheet());
                }
            }
        }, null, 248);
        final int i18 = 14;
        final int i19 = 15;
        qab qabVar26 = new qab("YELLOW_CARDS", 25, R.string.football_yellow_cards, new Function1() { // from class: oab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i18) {
                    case 0:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem.getClass();
                        return rei.o(footballTopPlayersStatisticsItem.getSuccessfulDribbles(), footballTopPlayersStatisticsItem.getAppearances(), footballTopPlayersStatisticsItem.getSuccessfulDribblesPercentage(), 0);
                    case 1:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem2 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem2.getClass();
                        return yid.j(footballTopPlayersStatisticsItem2.getGoals());
                    case 2:
                        FootballTopPlayersStatistics footballTopPlayersStatistics = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics.getClass();
                        return footballTopPlayersStatistics.getPenaltyWon();
                    case 3:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem3 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem3.getClass();
                        return yid.j(footballTopPlayersStatisticsItem3.getPenaltyWon());
                    case 4:
                        FootballTopPlayersStatistics footballTopPlayersStatistics2 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics2.getClass();
                        return footballTopPlayersStatistics2.getTackles();
                    case 5:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem4 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem4.getClass();
                        return rei.m(footballTopPlayersStatisticsItem4.getTackles(), footballTopPlayersStatisticsItem4.getAppearances());
                    case 6:
                        FootballTopPlayersStatistics footballTopPlayersStatistics3 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics3.getClass();
                        return footballTopPlayersStatistics3.getInterceptions();
                    case 7:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem5 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem5.getClass();
                        return rei.m(footballTopPlayersStatisticsItem5.getInterceptions(), footballTopPlayersStatisticsItem5.getAppearances());
                    case 8:
                        FootballTopPlayersStatistics footballTopPlayersStatistics4 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics4.getClass();
                        return footballTopPlayersStatistics4.getKilometersCovered();
                    case 9:
                        FootballTopPlayersStatistics footballTopPlayersStatistics5 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics5.getClass();
                        return footballTopPlayersStatistics5.getClearances();
                    case 10:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem6 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem6.getClass();
                        return rei.m(footballTopPlayersStatisticsItem6.getClearances(), footballTopPlayersStatisticsItem6.getAppearances());
                    case 11:
                        FootballTopPlayersStatistics footballTopPlayersStatistics6 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics6.getClass();
                        return footballTopPlayersStatistics6.getPossessionLost();
                    case 12:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem7 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem7.getClass();
                        return rei.m(footballTopPlayersStatisticsItem7.getPossessionLost(), footballTopPlayersStatisticsItem7.getAppearances());
                    case 13:
                        FootballTopPlayersStatistics footballTopPlayersStatistics7 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics7.getClass();
                        return footballTopPlayersStatistics7.getExpectedGoals();
                    case 14:
                        FootballTopPlayersStatistics footballTopPlayersStatistics8 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics8.getClass();
                        return footballTopPlayersStatistics8.getYellowCards();
                    case 15:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem8 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem8.getClass();
                        return yid.j(footballTopPlayersStatisticsItem8.getYellowCards());
                    case 16:
                        FootballTopPlayersStatistics footballTopPlayersStatistics9 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics9.getClass();
                        return footballTopPlayersStatistics9.getRedCards();
                    case 17:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem9 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem9.getClass();
                        return yid.j(footballTopPlayersStatisticsItem9.getRedCards());
                    case 18:
                        FootballTopPlayersStatistics footballTopPlayersStatistics10 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics10.getClass();
                        return footballTopPlayersStatistics10.getSaves();
                    case 19:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem10 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem10.getClass();
                        Double kilometersCovered = footballTopPlayersStatisticsItem10.getKilometersCovered();
                        Double valueOf = Double.valueOf(kilometersCovered != null ? kilometersCovered.doubleValue() : 0.0d);
                        Integer minutesPlayed = footballTopPlayersStatisticsItem10.getMinutesPlayed();
                        return rei.q(minutesPlayed != null ? minutesPlayed.intValue() : 0, valueOf).concat(" km");
                    case 20:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem11 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem11.getClass();
                        return rei.m(footballTopPlayersStatisticsItem11.getSaves(), footballTopPlayersStatisticsItem11.getAppearances());
                    case 21:
                        FootballTopPlayersStatistics footballTopPlayersStatistics11 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics11.getClass();
                        return footballTopPlayersStatistics11.getGoalsPrevented();
                    case 22:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem12 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem12.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem12.getGoalsPrevented());
                    case 23:
                        FootballTopPlayersStatistics footballTopPlayersStatistics12 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics12.getClass();
                        return footballTopPlayersStatistics12.getMostConceded();
                    case 24:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem13 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem13.getClass();
                        return rei.m(footballTopPlayersStatisticsItem13.getGoalsConceded(), footballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem14 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem14.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem14.getExpectedGoals()) + " (" + footballTopPlayersStatisticsItem14.getGoals() + ")";
                    case 26:
                        FootballTopPlayersStatistics footballTopPlayersStatistics13 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics13.getClass();
                        return footballTopPlayersStatistics13.getLeastConceded();
                    case 27:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem15 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem15.getClass();
                        return rei.m(footballTopPlayersStatisticsItem15.getGoalsConceded(), footballTopPlayersStatisticsItem15.getAppearances());
                    case 28:
                        FootballTopPlayersStatistics footballTopPlayersStatistics14 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics14.getClass();
                        return footballTopPlayersStatistics14.getCleanSheet();
                    default:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem16 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem16.getClass();
                        return yid.j(footballTopPlayersStatisticsItem16.getCleanSheet());
                }
            }
        }, new Function1() { // from class: oab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i19) {
                    case 0:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem.getClass();
                        return rei.o(footballTopPlayersStatisticsItem.getSuccessfulDribbles(), footballTopPlayersStatisticsItem.getAppearances(), footballTopPlayersStatisticsItem.getSuccessfulDribblesPercentage(), 0);
                    case 1:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem2 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem2.getClass();
                        return yid.j(footballTopPlayersStatisticsItem2.getGoals());
                    case 2:
                        FootballTopPlayersStatistics footballTopPlayersStatistics = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics.getClass();
                        return footballTopPlayersStatistics.getPenaltyWon();
                    case 3:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem3 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem3.getClass();
                        return yid.j(footballTopPlayersStatisticsItem3.getPenaltyWon());
                    case 4:
                        FootballTopPlayersStatistics footballTopPlayersStatistics2 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics2.getClass();
                        return footballTopPlayersStatistics2.getTackles();
                    case 5:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem4 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem4.getClass();
                        return rei.m(footballTopPlayersStatisticsItem4.getTackles(), footballTopPlayersStatisticsItem4.getAppearances());
                    case 6:
                        FootballTopPlayersStatistics footballTopPlayersStatistics3 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics3.getClass();
                        return footballTopPlayersStatistics3.getInterceptions();
                    case 7:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem5 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem5.getClass();
                        return rei.m(footballTopPlayersStatisticsItem5.getInterceptions(), footballTopPlayersStatisticsItem5.getAppearances());
                    case 8:
                        FootballTopPlayersStatistics footballTopPlayersStatistics4 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics4.getClass();
                        return footballTopPlayersStatistics4.getKilometersCovered();
                    case 9:
                        FootballTopPlayersStatistics footballTopPlayersStatistics5 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics5.getClass();
                        return footballTopPlayersStatistics5.getClearances();
                    case 10:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem6 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem6.getClass();
                        return rei.m(footballTopPlayersStatisticsItem6.getClearances(), footballTopPlayersStatisticsItem6.getAppearances());
                    case 11:
                        FootballTopPlayersStatistics footballTopPlayersStatistics6 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics6.getClass();
                        return footballTopPlayersStatistics6.getPossessionLost();
                    case 12:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem7 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem7.getClass();
                        return rei.m(footballTopPlayersStatisticsItem7.getPossessionLost(), footballTopPlayersStatisticsItem7.getAppearances());
                    case 13:
                        FootballTopPlayersStatistics footballTopPlayersStatistics7 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics7.getClass();
                        return footballTopPlayersStatistics7.getExpectedGoals();
                    case 14:
                        FootballTopPlayersStatistics footballTopPlayersStatistics8 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics8.getClass();
                        return footballTopPlayersStatistics8.getYellowCards();
                    case 15:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem8 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem8.getClass();
                        return yid.j(footballTopPlayersStatisticsItem8.getYellowCards());
                    case 16:
                        FootballTopPlayersStatistics footballTopPlayersStatistics9 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics9.getClass();
                        return footballTopPlayersStatistics9.getRedCards();
                    case 17:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem9 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem9.getClass();
                        return yid.j(footballTopPlayersStatisticsItem9.getRedCards());
                    case 18:
                        FootballTopPlayersStatistics footballTopPlayersStatistics10 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics10.getClass();
                        return footballTopPlayersStatistics10.getSaves();
                    case 19:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem10 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem10.getClass();
                        Double kilometersCovered = footballTopPlayersStatisticsItem10.getKilometersCovered();
                        Double valueOf = Double.valueOf(kilometersCovered != null ? kilometersCovered.doubleValue() : 0.0d);
                        Integer minutesPlayed = footballTopPlayersStatisticsItem10.getMinutesPlayed();
                        return rei.q(minutesPlayed != null ? minutesPlayed.intValue() : 0, valueOf).concat(" km");
                    case 20:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem11 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem11.getClass();
                        return rei.m(footballTopPlayersStatisticsItem11.getSaves(), footballTopPlayersStatisticsItem11.getAppearances());
                    case 21:
                        FootballTopPlayersStatistics footballTopPlayersStatistics11 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics11.getClass();
                        return footballTopPlayersStatistics11.getGoalsPrevented();
                    case 22:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem12 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem12.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem12.getGoalsPrevented());
                    case 23:
                        FootballTopPlayersStatistics footballTopPlayersStatistics12 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics12.getClass();
                        return footballTopPlayersStatistics12.getMostConceded();
                    case 24:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem13 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem13.getClass();
                        return rei.m(footballTopPlayersStatisticsItem13.getGoalsConceded(), footballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem14 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem14.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem14.getExpectedGoals()) + " (" + footballTopPlayersStatisticsItem14.getGoals() + ")";
                    case 26:
                        FootballTopPlayersStatistics footballTopPlayersStatistics13 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics13.getClass();
                        return footballTopPlayersStatistics13.getLeastConceded();
                    case 27:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem15 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem15.getClass();
                        return rei.m(footballTopPlayersStatisticsItem15.getGoalsConceded(), footballTopPlayersStatisticsItem15.getAppearances());
                    case 28:
                        FootballTopPlayersStatistics footballTopPlayersStatistics14 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics14.getClass();
                        return footballTopPlayersStatistics14.getCleanSheet();
                    default:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem16 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem16.getClass();
                        return yid.j(footballTopPlayersStatisticsItem16.getCleanSheet());
                }
            }
        }, null, 248);
        final int i20 = 16;
        final int i21 = 17;
        qab qabVar27 = new qab("RED_CARDS", 26, R.string.football_red_cards, new Function1() { // from class: oab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i20) {
                    case 0:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem.getClass();
                        return rei.o(footballTopPlayersStatisticsItem.getSuccessfulDribbles(), footballTopPlayersStatisticsItem.getAppearances(), footballTopPlayersStatisticsItem.getSuccessfulDribblesPercentage(), 0);
                    case 1:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem2 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem2.getClass();
                        return yid.j(footballTopPlayersStatisticsItem2.getGoals());
                    case 2:
                        FootballTopPlayersStatistics footballTopPlayersStatistics = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics.getClass();
                        return footballTopPlayersStatistics.getPenaltyWon();
                    case 3:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem3 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem3.getClass();
                        return yid.j(footballTopPlayersStatisticsItem3.getPenaltyWon());
                    case 4:
                        FootballTopPlayersStatistics footballTopPlayersStatistics2 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics2.getClass();
                        return footballTopPlayersStatistics2.getTackles();
                    case 5:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem4 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem4.getClass();
                        return rei.m(footballTopPlayersStatisticsItem4.getTackles(), footballTopPlayersStatisticsItem4.getAppearances());
                    case 6:
                        FootballTopPlayersStatistics footballTopPlayersStatistics3 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics3.getClass();
                        return footballTopPlayersStatistics3.getInterceptions();
                    case 7:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem5 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem5.getClass();
                        return rei.m(footballTopPlayersStatisticsItem5.getInterceptions(), footballTopPlayersStatisticsItem5.getAppearances());
                    case 8:
                        FootballTopPlayersStatistics footballTopPlayersStatistics4 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics4.getClass();
                        return footballTopPlayersStatistics4.getKilometersCovered();
                    case 9:
                        FootballTopPlayersStatistics footballTopPlayersStatistics5 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics5.getClass();
                        return footballTopPlayersStatistics5.getClearances();
                    case 10:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem6 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem6.getClass();
                        return rei.m(footballTopPlayersStatisticsItem6.getClearances(), footballTopPlayersStatisticsItem6.getAppearances());
                    case 11:
                        FootballTopPlayersStatistics footballTopPlayersStatistics6 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics6.getClass();
                        return footballTopPlayersStatistics6.getPossessionLost();
                    case 12:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem7 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem7.getClass();
                        return rei.m(footballTopPlayersStatisticsItem7.getPossessionLost(), footballTopPlayersStatisticsItem7.getAppearances());
                    case 13:
                        FootballTopPlayersStatistics footballTopPlayersStatistics7 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics7.getClass();
                        return footballTopPlayersStatistics7.getExpectedGoals();
                    case 14:
                        FootballTopPlayersStatistics footballTopPlayersStatistics8 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics8.getClass();
                        return footballTopPlayersStatistics8.getYellowCards();
                    case 15:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem8 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem8.getClass();
                        return yid.j(footballTopPlayersStatisticsItem8.getYellowCards());
                    case 16:
                        FootballTopPlayersStatistics footballTopPlayersStatistics9 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics9.getClass();
                        return footballTopPlayersStatistics9.getRedCards();
                    case 17:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem9 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem9.getClass();
                        return yid.j(footballTopPlayersStatisticsItem9.getRedCards());
                    case 18:
                        FootballTopPlayersStatistics footballTopPlayersStatistics10 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics10.getClass();
                        return footballTopPlayersStatistics10.getSaves();
                    case 19:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem10 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem10.getClass();
                        Double kilometersCovered = footballTopPlayersStatisticsItem10.getKilometersCovered();
                        Double valueOf = Double.valueOf(kilometersCovered != null ? kilometersCovered.doubleValue() : 0.0d);
                        Integer minutesPlayed = footballTopPlayersStatisticsItem10.getMinutesPlayed();
                        return rei.q(minutesPlayed != null ? minutesPlayed.intValue() : 0, valueOf).concat(" km");
                    case 20:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem11 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem11.getClass();
                        return rei.m(footballTopPlayersStatisticsItem11.getSaves(), footballTopPlayersStatisticsItem11.getAppearances());
                    case 21:
                        FootballTopPlayersStatistics footballTopPlayersStatistics11 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics11.getClass();
                        return footballTopPlayersStatistics11.getGoalsPrevented();
                    case 22:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem12 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem12.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem12.getGoalsPrevented());
                    case 23:
                        FootballTopPlayersStatistics footballTopPlayersStatistics12 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics12.getClass();
                        return footballTopPlayersStatistics12.getMostConceded();
                    case 24:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem13 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem13.getClass();
                        return rei.m(footballTopPlayersStatisticsItem13.getGoalsConceded(), footballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem14 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem14.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem14.getExpectedGoals()) + " (" + footballTopPlayersStatisticsItem14.getGoals() + ")";
                    case 26:
                        FootballTopPlayersStatistics footballTopPlayersStatistics13 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics13.getClass();
                        return footballTopPlayersStatistics13.getLeastConceded();
                    case 27:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem15 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem15.getClass();
                        return rei.m(footballTopPlayersStatisticsItem15.getGoalsConceded(), footballTopPlayersStatisticsItem15.getAppearances());
                    case 28:
                        FootballTopPlayersStatistics footballTopPlayersStatistics14 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics14.getClass();
                        return footballTopPlayersStatistics14.getCleanSheet();
                    default:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem16 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem16.getClass();
                        return yid.j(footballTopPlayersStatisticsItem16.getCleanSheet());
                }
            }
        }, new Function1() { // from class: oab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i21) {
                    case 0:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem.getClass();
                        return rei.o(footballTopPlayersStatisticsItem.getSuccessfulDribbles(), footballTopPlayersStatisticsItem.getAppearances(), footballTopPlayersStatisticsItem.getSuccessfulDribblesPercentage(), 0);
                    case 1:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem2 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem2.getClass();
                        return yid.j(footballTopPlayersStatisticsItem2.getGoals());
                    case 2:
                        FootballTopPlayersStatistics footballTopPlayersStatistics = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics.getClass();
                        return footballTopPlayersStatistics.getPenaltyWon();
                    case 3:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem3 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem3.getClass();
                        return yid.j(footballTopPlayersStatisticsItem3.getPenaltyWon());
                    case 4:
                        FootballTopPlayersStatistics footballTopPlayersStatistics2 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics2.getClass();
                        return footballTopPlayersStatistics2.getTackles();
                    case 5:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem4 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem4.getClass();
                        return rei.m(footballTopPlayersStatisticsItem4.getTackles(), footballTopPlayersStatisticsItem4.getAppearances());
                    case 6:
                        FootballTopPlayersStatistics footballTopPlayersStatistics3 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics3.getClass();
                        return footballTopPlayersStatistics3.getInterceptions();
                    case 7:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem5 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem5.getClass();
                        return rei.m(footballTopPlayersStatisticsItem5.getInterceptions(), footballTopPlayersStatisticsItem5.getAppearances());
                    case 8:
                        FootballTopPlayersStatistics footballTopPlayersStatistics4 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics4.getClass();
                        return footballTopPlayersStatistics4.getKilometersCovered();
                    case 9:
                        FootballTopPlayersStatistics footballTopPlayersStatistics5 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics5.getClass();
                        return footballTopPlayersStatistics5.getClearances();
                    case 10:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem6 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem6.getClass();
                        return rei.m(footballTopPlayersStatisticsItem6.getClearances(), footballTopPlayersStatisticsItem6.getAppearances());
                    case 11:
                        FootballTopPlayersStatistics footballTopPlayersStatistics6 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics6.getClass();
                        return footballTopPlayersStatistics6.getPossessionLost();
                    case 12:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem7 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem7.getClass();
                        return rei.m(footballTopPlayersStatisticsItem7.getPossessionLost(), footballTopPlayersStatisticsItem7.getAppearances());
                    case 13:
                        FootballTopPlayersStatistics footballTopPlayersStatistics7 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics7.getClass();
                        return footballTopPlayersStatistics7.getExpectedGoals();
                    case 14:
                        FootballTopPlayersStatistics footballTopPlayersStatistics8 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics8.getClass();
                        return footballTopPlayersStatistics8.getYellowCards();
                    case 15:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem8 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem8.getClass();
                        return yid.j(footballTopPlayersStatisticsItem8.getYellowCards());
                    case 16:
                        FootballTopPlayersStatistics footballTopPlayersStatistics9 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics9.getClass();
                        return footballTopPlayersStatistics9.getRedCards();
                    case 17:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem9 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem9.getClass();
                        return yid.j(footballTopPlayersStatisticsItem9.getRedCards());
                    case 18:
                        FootballTopPlayersStatistics footballTopPlayersStatistics10 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics10.getClass();
                        return footballTopPlayersStatistics10.getSaves();
                    case 19:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem10 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem10.getClass();
                        Double kilometersCovered = footballTopPlayersStatisticsItem10.getKilometersCovered();
                        Double valueOf = Double.valueOf(kilometersCovered != null ? kilometersCovered.doubleValue() : 0.0d);
                        Integer minutesPlayed = footballTopPlayersStatisticsItem10.getMinutesPlayed();
                        return rei.q(minutesPlayed != null ? minutesPlayed.intValue() : 0, valueOf).concat(" km");
                    case 20:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem11 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem11.getClass();
                        return rei.m(footballTopPlayersStatisticsItem11.getSaves(), footballTopPlayersStatisticsItem11.getAppearances());
                    case 21:
                        FootballTopPlayersStatistics footballTopPlayersStatistics11 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics11.getClass();
                        return footballTopPlayersStatistics11.getGoalsPrevented();
                    case 22:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem12 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem12.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem12.getGoalsPrevented());
                    case 23:
                        FootballTopPlayersStatistics footballTopPlayersStatistics12 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics12.getClass();
                        return footballTopPlayersStatistics12.getMostConceded();
                    case 24:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem13 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem13.getClass();
                        return rei.m(footballTopPlayersStatisticsItem13.getGoalsConceded(), footballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem14 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem14.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem14.getExpectedGoals()) + " (" + footballTopPlayersStatisticsItem14.getGoals() + ")";
                    case 26:
                        FootballTopPlayersStatistics footballTopPlayersStatistics13 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics13.getClass();
                        return footballTopPlayersStatistics13.getLeastConceded();
                    case 27:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem15 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem15.getClass();
                        return rei.m(footballTopPlayersStatisticsItem15.getGoalsConceded(), footballTopPlayersStatisticsItem15.getAppearances());
                    case 28:
                        FootballTopPlayersStatistics footballTopPlayersStatistics14 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics14.getClass();
                        return footballTopPlayersStatistics14.getCleanSheet();
                    default:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem16 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem16.getClass();
                        return yid.j(footballTopPlayersStatisticsItem16.getCleanSheet());
                }
            }
        }, null, 248);
        final int i22 = 18;
        final int i23 = 20;
        qab qabVar28 = new qab("SAVES_PER_GAME", 27, R.string.football_saves_per_game, new Function1() { // from class: oab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i22) {
                    case 0:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem.getClass();
                        return rei.o(footballTopPlayersStatisticsItem.getSuccessfulDribbles(), footballTopPlayersStatisticsItem.getAppearances(), footballTopPlayersStatisticsItem.getSuccessfulDribblesPercentage(), 0);
                    case 1:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem2 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem2.getClass();
                        return yid.j(footballTopPlayersStatisticsItem2.getGoals());
                    case 2:
                        FootballTopPlayersStatistics footballTopPlayersStatistics = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics.getClass();
                        return footballTopPlayersStatistics.getPenaltyWon();
                    case 3:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem3 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem3.getClass();
                        return yid.j(footballTopPlayersStatisticsItem3.getPenaltyWon());
                    case 4:
                        FootballTopPlayersStatistics footballTopPlayersStatistics2 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics2.getClass();
                        return footballTopPlayersStatistics2.getTackles();
                    case 5:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem4 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem4.getClass();
                        return rei.m(footballTopPlayersStatisticsItem4.getTackles(), footballTopPlayersStatisticsItem4.getAppearances());
                    case 6:
                        FootballTopPlayersStatistics footballTopPlayersStatistics3 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics3.getClass();
                        return footballTopPlayersStatistics3.getInterceptions();
                    case 7:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem5 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem5.getClass();
                        return rei.m(footballTopPlayersStatisticsItem5.getInterceptions(), footballTopPlayersStatisticsItem5.getAppearances());
                    case 8:
                        FootballTopPlayersStatistics footballTopPlayersStatistics4 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics4.getClass();
                        return footballTopPlayersStatistics4.getKilometersCovered();
                    case 9:
                        FootballTopPlayersStatistics footballTopPlayersStatistics5 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics5.getClass();
                        return footballTopPlayersStatistics5.getClearances();
                    case 10:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem6 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem6.getClass();
                        return rei.m(footballTopPlayersStatisticsItem6.getClearances(), footballTopPlayersStatisticsItem6.getAppearances());
                    case 11:
                        FootballTopPlayersStatistics footballTopPlayersStatistics6 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics6.getClass();
                        return footballTopPlayersStatistics6.getPossessionLost();
                    case 12:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem7 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem7.getClass();
                        return rei.m(footballTopPlayersStatisticsItem7.getPossessionLost(), footballTopPlayersStatisticsItem7.getAppearances());
                    case 13:
                        FootballTopPlayersStatistics footballTopPlayersStatistics7 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics7.getClass();
                        return footballTopPlayersStatistics7.getExpectedGoals();
                    case 14:
                        FootballTopPlayersStatistics footballTopPlayersStatistics8 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics8.getClass();
                        return footballTopPlayersStatistics8.getYellowCards();
                    case 15:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem8 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem8.getClass();
                        return yid.j(footballTopPlayersStatisticsItem8.getYellowCards());
                    case 16:
                        FootballTopPlayersStatistics footballTopPlayersStatistics9 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics9.getClass();
                        return footballTopPlayersStatistics9.getRedCards();
                    case 17:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem9 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem9.getClass();
                        return yid.j(footballTopPlayersStatisticsItem9.getRedCards());
                    case 18:
                        FootballTopPlayersStatistics footballTopPlayersStatistics10 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics10.getClass();
                        return footballTopPlayersStatistics10.getSaves();
                    case 19:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem10 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem10.getClass();
                        Double kilometersCovered = footballTopPlayersStatisticsItem10.getKilometersCovered();
                        Double valueOf = Double.valueOf(kilometersCovered != null ? kilometersCovered.doubleValue() : 0.0d);
                        Integer minutesPlayed = footballTopPlayersStatisticsItem10.getMinutesPlayed();
                        return rei.q(minutesPlayed != null ? minutesPlayed.intValue() : 0, valueOf).concat(" km");
                    case 20:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem11 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem11.getClass();
                        return rei.m(footballTopPlayersStatisticsItem11.getSaves(), footballTopPlayersStatisticsItem11.getAppearances());
                    case 21:
                        FootballTopPlayersStatistics footballTopPlayersStatistics11 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics11.getClass();
                        return footballTopPlayersStatistics11.getGoalsPrevented();
                    case 22:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem12 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem12.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem12.getGoalsPrevented());
                    case 23:
                        FootballTopPlayersStatistics footballTopPlayersStatistics12 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics12.getClass();
                        return footballTopPlayersStatistics12.getMostConceded();
                    case 24:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem13 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem13.getClass();
                        return rei.m(footballTopPlayersStatisticsItem13.getGoalsConceded(), footballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem14 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem14.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem14.getExpectedGoals()) + " (" + footballTopPlayersStatisticsItem14.getGoals() + ")";
                    case 26:
                        FootballTopPlayersStatistics footballTopPlayersStatistics13 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics13.getClass();
                        return footballTopPlayersStatistics13.getLeastConceded();
                    case 27:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem15 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem15.getClass();
                        return rei.m(footballTopPlayersStatisticsItem15.getGoalsConceded(), footballTopPlayersStatisticsItem15.getAppearances());
                    case 28:
                        FootballTopPlayersStatistics footballTopPlayersStatistics14 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics14.getClass();
                        return footballTopPlayersStatistics14.getCleanSheet();
                    default:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem16 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem16.getClass();
                        return yid.j(footballTopPlayersStatisticsItem16.getCleanSheet());
                }
            }
        }, new Function1() { // from class: oab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i23) {
                    case 0:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem.getClass();
                        return rei.o(footballTopPlayersStatisticsItem.getSuccessfulDribbles(), footballTopPlayersStatisticsItem.getAppearances(), footballTopPlayersStatisticsItem.getSuccessfulDribblesPercentage(), 0);
                    case 1:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem2 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem2.getClass();
                        return yid.j(footballTopPlayersStatisticsItem2.getGoals());
                    case 2:
                        FootballTopPlayersStatistics footballTopPlayersStatistics = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics.getClass();
                        return footballTopPlayersStatistics.getPenaltyWon();
                    case 3:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem3 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem3.getClass();
                        return yid.j(footballTopPlayersStatisticsItem3.getPenaltyWon());
                    case 4:
                        FootballTopPlayersStatistics footballTopPlayersStatistics2 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics2.getClass();
                        return footballTopPlayersStatistics2.getTackles();
                    case 5:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem4 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem4.getClass();
                        return rei.m(footballTopPlayersStatisticsItem4.getTackles(), footballTopPlayersStatisticsItem4.getAppearances());
                    case 6:
                        FootballTopPlayersStatistics footballTopPlayersStatistics3 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics3.getClass();
                        return footballTopPlayersStatistics3.getInterceptions();
                    case 7:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem5 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem5.getClass();
                        return rei.m(footballTopPlayersStatisticsItem5.getInterceptions(), footballTopPlayersStatisticsItem5.getAppearances());
                    case 8:
                        FootballTopPlayersStatistics footballTopPlayersStatistics4 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics4.getClass();
                        return footballTopPlayersStatistics4.getKilometersCovered();
                    case 9:
                        FootballTopPlayersStatistics footballTopPlayersStatistics5 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics5.getClass();
                        return footballTopPlayersStatistics5.getClearances();
                    case 10:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem6 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem6.getClass();
                        return rei.m(footballTopPlayersStatisticsItem6.getClearances(), footballTopPlayersStatisticsItem6.getAppearances());
                    case 11:
                        FootballTopPlayersStatistics footballTopPlayersStatistics6 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics6.getClass();
                        return footballTopPlayersStatistics6.getPossessionLost();
                    case 12:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem7 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem7.getClass();
                        return rei.m(footballTopPlayersStatisticsItem7.getPossessionLost(), footballTopPlayersStatisticsItem7.getAppearances());
                    case 13:
                        FootballTopPlayersStatistics footballTopPlayersStatistics7 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics7.getClass();
                        return footballTopPlayersStatistics7.getExpectedGoals();
                    case 14:
                        FootballTopPlayersStatistics footballTopPlayersStatistics8 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics8.getClass();
                        return footballTopPlayersStatistics8.getYellowCards();
                    case 15:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem8 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem8.getClass();
                        return yid.j(footballTopPlayersStatisticsItem8.getYellowCards());
                    case 16:
                        FootballTopPlayersStatistics footballTopPlayersStatistics9 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics9.getClass();
                        return footballTopPlayersStatistics9.getRedCards();
                    case 17:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem9 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem9.getClass();
                        return yid.j(footballTopPlayersStatisticsItem9.getRedCards());
                    case 18:
                        FootballTopPlayersStatistics footballTopPlayersStatistics10 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics10.getClass();
                        return footballTopPlayersStatistics10.getSaves();
                    case 19:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem10 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem10.getClass();
                        Double kilometersCovered = footballTopPlayersStatisticsItem10.getKilometersCovered();
                        Double valueOf = Double.valueOf(kilometersCovered != null ? kilometersCovered.doubleValue() : 0.0d);
                        Integer minutesPlayed = footballTopPlayersStatisticsItem10.getMinutesPlayed();
                        return rei.q(minutesPlayed != null ? minutesPlayed.intValue() : 0, valueOf).concat(" km");
                    case 20:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem11 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem11.getClass();
                        return rei.m(footballTopPlayersStatisticsItem11.getSaves(), footballTopPlayersStatisticsItem11.getAppearances());
                    case 21:
                        FootballTopPlayersStatistics footballTopPlayersStatistics11 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics11.getClass();
                        return footballTopPlayersStatistics11.getGoalsPrevented();
                    case 22:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem12 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem12.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem12.getGoalsPrevented());
                    case 23:
                        FootballTopPlayersStatistics footballTopPlayersStatistics12 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics12.getClass();
                        return footballTopPlayersStatistics12.getMostConceded();
                    case 24:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem13 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem13.getClass();
                        return rei.m(footballTopPlayersStatisticsItem13.getGoalsConceded(), footballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem14 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem14.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem14.getExpectedGoals()) + " (" + footballTopPlayersStatisticsItem14.getGoals() + ")";
                    case 26:
                        FootballTopPlayersStatistics footballTopPlayersStatistics13 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics13.getClass();
                        return footballTopPlayersStatistics13.getLeastConceded();
                    case 27:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem15 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem15.getClass();
                        return rei.m(footballTopPlayersStatisticsItem15.getGoalsConceded(), footballTopPlayersStatisticsItem15.getAppearances());
                    case 28:
                        FootballTopPlayersStatistics footballTopPlayersStatistics14 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics14.getClass();
                        return footballTopPlayersStatistics14.getCleanSheet();
                    default:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem16 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem16.getClass();
                        return yid.j(footballTopPlayersStatisticsItem16.getCleanSheet());
                }
            }
        }, null, 248);
        final int i24 = 21;
        final int i25 = 22;
        qab qabVar29 = new qab("GOALS_PREVENTED", 28, R.string.football_goals_prevented, new Function1() { // from class: oab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i24) {
                    case 0:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem.getClass();
                        return rei.o(footballTopPlayersStatisticsItem.getSuccessfulDribbles(), footballTopPlayersStatisticsItem.getAppearances(), footballTopPlayersStatisticsItem.getSuccessfulDribblesPercentage(), 0);
                    case 1:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem2 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem2.getClass();
                        return yid.j(footballTopPlayersStatisticsItem2.getGoals());
                    case 2:
                        FootballTopPlayersStatistics footballTopPlayersStatistics = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics.getClass();
                        return footballTopPlayersStatistics.getPenaltyWon();
                    case 3:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem3 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem3.getClass();
                        return yid.j(footballTopPlayersStatisticsItem3.getPenaltyWon());
                    case 4:
                        FootballTopPlayersStatistics footballTopPlayersStatistics2 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics2.getClass();
                        return footballTopPlayersStatistics2.getTackles();
                    case 5:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem4 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem4.getClass();
                        return rei.m(footballTopPlayersStatisticsItem4.getTackles(), footballTopPlayersStatisticsItem4.getAppearances());
                    case 6:
                        FootballTopPlayersStatistics footballTopPlayersStatistics3 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics3.getClass();
                        return footballTopPlayersStatistics3.getInterceptions();
                    case 7:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem5 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem5.getClass();
                        return rei.m(footballTopPlayersStatisticsItem5.getInterceptions(), footballTopPlayersStatisticsItem5.getAppearances());
                    case 8:
                        FootballTopPlayersStatistics footballTopPlayersStatistics4 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics4.getClass();
                        return footballTopPlayersStatistics4.getKilometersCovered();
                    case 9:
                        FootballTopPlayersStatistics footballTopPlayersStatistics5 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics5.getClass();
                        return footballTopPlayersStatistics5.getClearances();
                    case 10:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem6 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem6.getClass();
                        return rei.m(footballTopPlayersStatisticsItem6.getClearances(), footballTopPlayersStatisticsItem6.getAppearances());
                    case 11:
                        FootballTopPlayersStatistics footballTopPlayersStatistics6 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics6.getClass();
                        return footballTopPlayersStatistics6.getPossessionLost();
                    case 12:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem7 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem7.getClass();
                        return rei.m(footballTopPlayersStatisticsItem7.getPossessionLost(), footballTopPlayersStatisticsItem7.getAppearances());
                    case 13:
                        FootballTopPlayersStatistics footballTopPlayersStatistics7 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics7.getClass();
                        return footballTopPlayersStatistics7.getExpectedGoals();
                    case 14:
                        FootballTopPlayersStatistics footballTopPlayersStatistics8 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics8.getClass();
                        return footballTopPlayersStatistics8.getYellowCards();
                    case 15:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem8 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem8.getClass();
                        return yid.j(footballTopPlayersStatisticsItem8.getYellowCards());
                    case 16:
                        FootballTopPlayersStatistics footballTopPlayersStatistics9 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics9.getClass();
                        return footballTopPlayersStatistics9.getRedCards();
                    case 17:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem9 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem9.getClass();
                        return yid.j(footballTopPlayersStatisticsItem9.getRedCards());
                    case 18:
                        FootballTopPlayersStatistics footballTopPlayersStatistics10 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics10.getClass();
                        return footballTopPlayersStatistics10.getSaves();
                    case 19:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem10 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem10.getClass();
                        Double kilometersCovered = footballTopPlayersStatisticsItem10.getKilometersCovered();
                        Double valueOf = Double.valueOf(kilometersCovered != null ? kilometersCovered.doubleValue() : 0.0d);
                        Integer minutesPlayed = footballTopPlayersStatisticsItem10.getMinutesPlayed();
                        return rei.q(minutesPlayed != null ? minutesPlayed.intValue() : 0, valueOf).concat(" km");
                    case 20:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem11 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem11.getClass();
                        return rei.m(footballTopPlayersStatisticsItem11.getSaves(), footballTopPlayersStatisticsItem11.getAppearances());
                    case 21:
                        FootballTopPlayersStatistics footballTopPlayersStatistics11 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics11.getClass();
                        return footballTopPlayersStatistics11.getGoalsPrevented();
                    case 22:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem12 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem12.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem12.getGoalsPrevented());
                    case 23:
                        FootballTopPlayersStatistics footballTopPlayersStatistics12 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics12.getClass();
                        return footballTopPlayersStatistics12.getMostConceded();
                    case 24:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem13 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem13.getClass();
                        return rei.m(footballTopPlayersStatisticsItem13.getGoalsConceded(), footballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem14 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem14.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem14.getExpectedGoals()) + " (" + footballTopPlayersStatisticsItem14.getGoals() + ")";
                    case 26:
                        FootballTopPlayersStatistics footballTopPlayersStatistics13 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics13.getClass();
                        return footballTopPlayersStatistics13.getLeastConceded();
                    case 27:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem15 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem15.getClass();
                        return rei.m(footballTopPlayersStatisticsItem15.getGoalsConceded(), footballTopPlayersStatisticsItem15.getAppearances());
                    case 28:
                        FootballTopPlayersStatistics footballTopPlayersStatistics14 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics14.getClass();
                        return footballTopPlayersStatistics14.getCleanSheet();
                    default:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem16 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem16.getClass();
                        return yid.j(footballTopPlayersStatisticsItem16.getCleanSheet());
                }
            }
        }, new Function1() { // from class: oab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i25) {
                    case 0:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem.getClass();
                        return rei.o(footballTopPlayersStatisticsItem.getSuccessfulDribbles(), footballTopPlayersStatisticsItem.getAppearances(), footballTopPlayersStatisticsItem.getSuccessfulDribblesPercentage(), 0);
                    case 1:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem2 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem2.getClass();
                        return yid.j(footballTopPlayersStatisticsItem2.getGoals());
                    case 2:
                        FootballTopPlayersStatistics footballTopPlayersStatistics = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics.getClass();
                        return footballTopPlayersStatistics.getPenaltyWon();
                    case 3:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem3 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem3.getClass();
                        return yid.j(footballTopPlayersStatisticsItem3.getPenaltyWon());
                    case 4:
                        FootballTopPlayersStatistics footballTopPlayersStatistics2 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics2.getClass();
                        return footballTopPlayersStatistics2.getTackles();
                    case 5:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem4 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem4.getClass();
                        return rei.m(footballTopPlayersStatisticsItem4.getTackles(), footballTopPlayersStatisticsItem4.getAppearances());
                    case 6:
                        FootballTopPlayersStatistics footballTopPlayersStatistics3 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics3.getClass();
                        return footballTopPlayersStatistics3.getInterceptions();
                    case 7:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem5 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem5.getClass();
                        return rei.m(footballTopPlayersStatisticsItem5.getInterceptions(), footballTopPlayersStatisticsItem5.getAppearances());
                    case 8:
                        FootballTopPlayersStatistics footballTopPlayersStatistics4 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics4.getClass();
                        return footballTopPlayersStatistics4.getKilometersCovered();
                    case 9:
                        FootballTopPlayersStatistics footballTopPlayersStatistics5 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics5.getClass();
                        return footballTopPlayersStatistics5.getClearances();
                    case 10:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem6 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem6.getClass();
                        return rei.m(footballTopPlayersStatisticsItem6.getClearances(), footballTopPlayersStatisticsItem6.getAppearances());
                    case 11:
                        FootballTopPlayersStatistics footballTopPlayersStatistics6 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics6.getClass();
                        return footballTopPlayersStatistics6.getPossessionLost();
                    case 12:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem7 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem7.getClass();
                        return rei.m(footballTopPlayersStatisticsItem7.getPossessionLost(), footballTopPlayersStatisticsItem7.getAppearances());
                    case 13:
                        FootballTopPlayersStatistics footballTopPlayersStatistics7 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics7.getClass();
                        return footballTopPlayersStatistics7.getExpectedGoals();
                    case 14:
                        FootballTopPlayersStatistics footballTopPlayersStatistics8 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics8.getClass();
                        return footballTopPlayersStatistics8.getYellowCards();
                    case 15:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem8 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem8.getClass();
                        return yid.j(footballTopPlayersStatisticsItem8.getYellowCards());
                    case 16:
                        FootballTopPlayersStatistics footballTopPlayersStatistics9 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics9.getClass();
                        return footballTopPlayersStatistics9.getRedCards();
                    case 17:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem9 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem9.getClass();
                        return yid.j(footballTopPlayersStatisticsItem9.getRedCards());
                    case 18:
                        FootballTopPlayersStatistics footballTopPlayersStatistics10 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics10.getClass();
                        return footballTopPlayersStatistics10.getSaves();
                    case 19:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem10 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem10.getClass();
                        Double kilometersCovered = footballTopPlayersStatisticsItem10.getKilometersCovered();
                        Double valueOf = Double.valueOf(kilometersCovered != null ? kilometersCovered.doubleValue() : 0.0d);
                        Integer minutesPlayed = footballTopPlayersStatisticsItem10.getMinutesPlayed();
                        return rei.q(minutesPlayed != null ? minutesPlayed.intValue() : 0, valueOf).concat(" km");
                    case 20:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem11 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem11.getClass();
                        return rei.m(footballTopPlayersStatisticsItem11.getSaves(), footballTopPlayersStatisticsItem11.getAppearances());
                    case 21:
                        FootballTopPlayersStatistics footballTopPlayersStatistics11 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics11.getClass();
                        return footballTopPlayersStatistics11.getGoalsPrevented();
                    case 22:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem12 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem12.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem12.getGoalsPrevented());
                    case 23:
                        FootballTopPlayersStatistics footballTopPlayersStatistics12 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics12.getClass();
                        return footballTopPlayersStatistics12.getMostConceded();
                    case 24:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem13 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem13.getClass();
                        return rei.m(footballTopPlayersStatisticsItem13.getGoalsConceded(), footballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem14 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem14.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem14.getExpectedGoals()) + " (" + footballTopPlayersStatisticsItem14.getGoals() + ")";
                    case 26:
                        FootballTopPlayersStatistics footballTopPlayersStatistics13 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics13.getClass();
                        return footballTopPlayersStatistics13.getLeastConceded();
                    case 27:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem15 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem15.getClass();
                        return rei.m(footballTopPlayersStatisticsItem15.getGoalsConceded(), footballTopPlayersStatisticsItem15.getAppearances());
                    case 28:
                        FootballTopPlayersStatistics footballTopPlayersStatistics14 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics14.getClass();
                        return footballTopPlayersStatistics14.getCleanSheet();
                    default:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem16 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem16.getClass();
                        return yid.j(footballTopPlayersStatisticsItem16.getCleanSheet());
                }
            }
        }, null, 248);
        final int i26 = 23;
        final int i27 = 24;
        qab qabVar30 = new qab("MOST_CONCEDED_PER_GAME", 29, R.string.football_most_conceded_per_game, new Function1() { // from class: oab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i26) {
                    case 0:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem.getClass();
                        return rei.o(footballTopPlayersStatisticsItem.getSuccessfulDribbles(), footballTopPlayersStatisticsItem.getAppearances(), footballTopPlayersStatisticsItem.getSuccessfulDribblesPercentage(), 0);
                    case 1:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem2 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem2.getClass();
                        return yid.j(footballTopPlayersStatisticsItem2.getGoals());
                    case 2:
                        FootballTopPlayersStatistics footballTopPlayersStatistics = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics.getClass();
                        return footballTopPlayersStatistics.getPenaltyWon();
                    case 3:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem3 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem3.getClass();
                        return yid.j(footballTopPlayersStatisticsItem3.getPenaltyWon());
                    case 4:
                        FootballTopPlayersStatistics footballTopPlayersStatistics2 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics2.getClass();
                        return footballTopPlayersStatistics2.getTackles();
                    case 5:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem4 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem4.getClass();
                        return rei.m(footballTopPlayersStatisticsItem4.getTackles(), footballTopPlayersStatisticsItem4.getAppearances());
                    case 6:
                        FootballTopPlayersStatistics footballTopPlayersStatistics3 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics3.getClass();
                        return footballTopPlayersStatistics3.getInterceptions();
                    case 7:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem5 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem5.getClass();
                        return rei.m(footballTopPlayersStatisticsItem5.getInterceptions(), footballTopPlayersStatisticsItem5.getAppearances());
                    case 8:
                        FootballTopPlayersStatistics footballTopPlayersStatistics4 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics4.getClass();
                        return footballTopPlayersStatistics4.getKilometersCovered();
                    case 9:
                        FootballTopPlayersStatistics footballTopPlayersStatistics5 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics5.getClass();
                        return footballTopPlayersStatistics5.getClearances();
                    case 10:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem6 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem6.getClass();
                        return rei.m(footballTopPlayersStatisticsItem6.getClearances(), footballTopPlayersStatisticsItem6.getAppearances());
                    case 11:
                        FootballTopPlayersStatistics footballTopPlayersStatistics6 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics6.getClass();
                        return footballTopPlayersStatistics6.getPossessionLost();
                    case 12:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem7 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem7.getClass();
                        return rei.m(footballTopPlayersStatisticsItem7.getPossessionLost(), footballTopPlayersStatisticsItem7.getAppearances());
                    case 13:
                        FootballTopPlayersStatistics footballTopPlayersStatistics7 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics7.getClass();
                        return footballTopPlayersStatistics7.getExpectedGoals();
                    case 14:
                        FootballTopPlayersStatistics footballTopPlayersStatistics8 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics8.getClass();
                        return footballTopPlayersStatistics8.getYellowCards();
                    case 15:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem8 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem8.getClass();
                        return yid.j(footballTopPlayersStatisticsItem8.getYellowCards());
                    case 16:
                        FootballTopPlayersStatistics footballTopPlayersStatistics9 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics9.getClass();
                        return footballTopPlayersStatistics9.getRedCards();
                    case 17:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem9 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem9.getClass();
                        return yid.j(footballTopPlayersStatisticsItem9.getRedCards());
                    case 18:
                        FootballTopPlayersStatistics footballTopPlayersStatistics10 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics10.getClass();
                        return footballTopPlayersStatistics10.getSaves();
                    case 19:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem10 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem10.getClass();
                        Double kilometersCovered = footballTopPlayersStatisticsItem10.getKilometersCovered();
                        Double valueOf = Double.valueOf(kilometersCovered != null ? kilometersCovered.doubleValue() : 0.0d);
                        Integer minutesPlayed = footballTopPlayersStatisticsItem10.getMinutesPlayed();
                        return rei.q(minutesPlayed != null ? minutesPlayed.intValue() : 0, valueOf).concat(" km");
                    case 20:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem11 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem11.getClass();
                        return rei.m(footballTopPlayersStatisticsItem11.getSaves(), footballTopPlayersStatisticsItem11.getAppearances());
                    case 21:
                        FootballTopPlayersStatistics footballTopPlayersStatistics11 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics11.getClass();
                        return footballTopPlayersStatistics11.getGoalsPrevented();
                    case 22:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem12 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem12.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem12.getGoalsPrevented());
                    case 23:
                        FootballTopPlayersStatistics footballTopPlayersStatistics12 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics12.getClass();
                        return footballTopPlayersStatistics12.getMostConceded();
                    case 24:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem13 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem13.getClass();
                        return rei.m(footballTopPlayersStatisticsItem13.getGoalsConceded(), footballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem14 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem14.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem14.getExpectedGoals()) + " (" + footballTopPlayersStatisticsItem14.getGoals() + ")";
                    case 26:
                        FootballTopPlayersStatistics footballTopPlayersStatistics13 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics13.getClass();
                        return footballTopPlayersStatistics13.getLeastConceded();
                    case 27:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem15 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem15.getClass();
                        return rei.m(footballTopPlayersStatisticsItem15.getGoalsConceded(), footballTopPlayersStatisticsItem15.getAppearances());
                    case 28:
                        FootballTopPlayersStatistics footballTopPlayersStatistics14 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics14.getClass();
                        return footballTopPlayersStatistics14.getCleanSheet();
                    default:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem16 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem16.getClass();
                        return yid.j(footballTopPlayersStatisticsItem16.getCleanSheet());
                }
            }
        }, new Function1() { // from class: oab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i27) {
                    case 0:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem.getClass();
                        return rei.o(footballTopPlayersStatisticsItem.getSuccessfulDribbles(), footballTopPlayersStatisticsItem.getAppearances(), footballTopPlayersStatisticsItem.getSuccessfulDribblesPercentage(), 0);
                    case 1:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem2 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem2.getClass();
                        return yid.j(footballTopPlayersStatisticsItem2.getGoals());
                    case 2:
                        FootballTopPlayersStatistics footballTopPlayersStatistics = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics.getClass();
                        return footballTopPlayersStatistics.getPenaltyWon();
                    case 3:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem3 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem3.getClass();
                        return yid.j(footballTopPlayersStatisticsItem3.getPenaltyWon());
                    case 4:
                        FootballTopPlayersStatistics footballTopPlayersStatistics2 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics2.getClass();
                        return footballTopPlayersStatistics2.getTackles();
                    case 5:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem4 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem4.getClass();
                        return rei.m(footballTopPlayersStatisticsItem4.getTackles(), footballTopPlayersStatisticsItem4.getAppearances());
                    case 6:
                        FootballTopPlayersStatistics footballTopPlayersStatistics3 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics3.getClass();
                        return footballTopPlayersStatistics3.getInterceptions();
                    case 7:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem5 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem5.getClass();
                        return rei.m(footballTopPlayersStatisticsItem5.getInterceptions(), footballTopPlayersStatisticsItem5.getAppearances());
                    case 8:
                        FootballTopPlayersStatistics footballTopPlayersStatistics4 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics4.getClass();
                        return footballTopPlayersStatistics4.getKilometersCovered();
                    case 9:
                        FootballTopPlayersStatistics footballTopPlayersStatistics5 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics5.getClass();
                        return footballTopPlayersStatistics5.getClearances();
                    case 10:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem6 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem6.getClass();
                        return rei.m(footballTopPlayersStatisticsItem6.getClearances(), footballTopPlayersStatisticsItem6.getAppearances());
                    case 11:
                        FootballTopPlayersStatistics footballTopPlayersStatistics6 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics6.getClass();
                        return footballTopPlayersStatistics6.getPossessionLost();
                    case 12:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem7 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem7.getClass();
                        return rei.m(footballTopPlayersStatisticsItem7.getPossessionLost(), footballTopPlayersStatisticsItem7.getAppearances());
                    case 13:
                        FootballTopPlayersStatistics footballTopPlayersStatistics7 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics7.getClass();
                        return footballTopPlayersStatistics7.getExpectedGoals();
                    case 14:
                        FootballTopPlayersStatistics footballTopPlayersStatistics8 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics8.getClass();
                        return footballTopPlayersStatistics8.getYellowCards();
                    case 15:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem8 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem8.getClass();
                        return yid.j(footballTopPlayersStatisticsItem8.getYellowCards());
                    case 16:
                        FootballTopPlayersStatistics footballTopPlayersStatistics9 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics9.getClass();
                        return footballTopPlayersStatistics9.getRedCards();
                    case 17:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem9 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem9.getClass();
                        return yid.j(footballTopPlayersStatisticsItem9.getRedCards());
                    case 18:
                        FootballTopPlayersStatistics footballTopPlayersStatistics10 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics10.getClass();
                        return footballTopPlayersStatistics10.getSaves();
                    case 19:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem10 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem10.getClass();
                        Double kilometersCovered = footballTopPlayersStatisticsItem10.getKilometersCovered();
                        Double valueOf = Double.valueOf(kilometersCovered != null ? kilometersCovered.doubleValue() : 0.0d);
                        Integer minutesPlayed = footballTopPlayersStatisticsItem10.getMinutesPlayed();
                        return rei.q(minutesPlayed != null ? minutesPlayed.intValue() : 0, valueOf).concat(" km");
                    case 20:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem11 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem11.getClass();
                        return rei.m(footballTopPlayersStatisticsItem11.getSaves(), footballTopPlayersStatisticsItem11.getAppearances());
                    case 21:
                        FootballTopPlayersStatistics footballTopPlayersStatistics11 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics11.getClass();
                        return footballTopPlayersStatistics11.getGoalsPrevented();
                    case 22:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem12 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem12.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem12.getGoalsPrevented());
                    case 23:
                        FootballTopPlayersStatistics footballTopPlayersStatistics12 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics12.getClass();
                        return footballTopPlayersStatistics12.getMostConceded();
                    case 24:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem13 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem13.getClass();
                        return rei.m(footballTopPlayersStatisticsItem13.getGoalsConceded(), footballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem14 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem14.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem14.getExpectedGoals()) + " (" + footballTopPlayersStatisticsItem14.getGoals() + ")";
                    case 26:
                        FootballTopPlayersStatistics footballTopPlayersStatistics13 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics13.getClass();
                        return footballTopPlayersStatistics13.getLeastConceded();
                    case 27:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem15 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem15.getClass();
                        return rei.m(footballTopPlayersStatisticsItem15.getGoalsConceded(), footballTopPlayersStatisticsItem15.getAppearances());
                    case 28:
                        FootballTopPlayersStatistics footballTopPlayersStatistics14 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics14.getClass();
                        return footballTopPlayersStatistics14.getCleanSheet();
                    default:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem16 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem16.getClass();
                        return yid.j(footballTopPlayersStatisticsItem16.getCleanSheet());
                }
            }
        }, null, 248);
        final int i28 = 26;
        final int i29 = 27;
        qab qabVar31 = new qab("LEAST_CONCEDED_PER_GAME", 30, R.string.football_least_conceded_per_game, new Function1() { // from class: oab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i28) {
                    case 0:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem.getClass();
                        return rei.o(footballTopPlayersStatisticsItem.getSuccessfulDribbles(), footballTopPlayersStatisticsItem.getAppearances(), footballTopPlayersStatisticsItem.getSuccessfulDribblesPercentage(), 0);
                    case 1:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem2 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem2.getClass();
                        return yid.j(footballTopPlayersStatisticsItem2.getGoals());
                    case 2:
                        FootballTopPlayersStatistics footballTopPlayersStatistics = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics.getClass();
                        return footballTopPlayersStatistics.getPenaltyWon();
                    case 3:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem3 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem3.getClass();
                        return yid.j(footballTopPlayersStatisticsItem3.getPenaltyWon());
                    case 4:
                        FootballTopPlayersStatistics footballTopPlayersStatistics2 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics2.getClass();
                        return footballTopPlayersStatistics2.getTackles();
                    case 5:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem4 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem4.getClass();
                        return rei.m(footballTopPlayersStatisticsItem4.getTackles(), footballTopPlayersStatisticsItem4.getAppearances());
                    case 6:
                        FootballTopPlayersStatistics footballTopPlayersStatistics3 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics3.getClass();
                        return footballTopPlayersStatistics3.getInterceptions();
                    case 7:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem5 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem5.getClass();
                        return rei.m(footballTopPlayersStatisticsItem5.getInterceptions(), footballTopPlayersStatisticsItem5.getAppearances());
                    case 8:
                        FootballTopPlayersStatistics footballTopPlayersStatistics4 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics4.getClass();
                        return footballTopPlayersStatistics4.getKilometersCovered();
                    case 9:
                        FootballTopPlayersStatistics footballTopPlayersStatistics5 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics5.getClass();
                        return footballTopPlayersStatistics5.getClearances();
                    case 10:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem6 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem6.getClass();
                        return rei.m(footballTopPlayersStatisticsItem6.getClearances(), footballTopPlayersStatisticsItem6.getAppearances());
                    case 11:
                        FootballTopPlayersStatistics footballTopPlayersStatistics6 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics6.getClass();
                        return footballTopPlayersStatistics6.getPossessionLost();
                    case 12:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem7 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem7.getClass();
                        return rei.m(footballTopPlayersStatisticsItem7.getPossessionLost(), footballTopPlayersStatisticsItem7.getAppearances());
                    case 13:
                        FootballTopPlayersStatistics footballTopPlayersStatistics7 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics7.getClass();
                        return footballTopPlayersStatistics7.getExpectedGoals();
                    case 14:
                        FootballTopPlayersStatistics footballTopPlayersStatistics8 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics8.getClass();
                        return footballTopPlayersStatistics8.getYellowCards();
                    case 15:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem8 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem8.getClass();
                        return yid.j(footballTopPlayersStatisticsItem8.getYellowCards());
                    case 16:
                        FootballTopPlayersStatistics footballTopPlayersStatistics9 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics9.getClass();
                        return footballTopPlayersStatistics9.getRedCards();
                    case 17:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem9 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem9.getClass();
                        return yid.j(footballTopPlayersStatisticsItem9.getRedCards());
                    case 18:
                        FootballTopPlayersStatistics footballTopPlayersStatistics10 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics10.getClass();
                        return footballTopPlayersStatistics10.getSaves();
                    case 19:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem10 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem10.getClass();
                        Double kilometersCovered = footballTopPlayersStatisticsItem10.getKilometersCovered();
                        Double valueOf = Double.valueOf(kilometersCovered != null ? kilometersCovered.doubleValue() : 0.0d);
                        Integer minutesPlayed = footballTopPlayersStatisticsItem10.getMinutesPlayed();
                        return rei.q(minutesPlayed != null ? minutesPlayed.intValue() : 0, valueOf).concat(" km");
                    case 20:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem11 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem11.getClass();
                        return rei.m(footballTopPlayersStatisticsItem11.getSaves(), footballTopPlayersStatisticsItem11.getAppearances());
                    case 21:
                        FootballTopPlayersStatistics footballTopPlayersStatistics11 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics11.getClass();
                        return footballTopPlayersStatistics11.getGoalsPrevented();
                    case 22:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem12 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem12.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem12.getGoalsPrevented());
                    case 23:
                        FootballTopPlayersStatistics footballTopPlayersStatistics12 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics12.getClass();
                        return footballTopPlayersStatistics12.getMostConceded();
                    case 24:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem13 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem13.getClass();
                        return rei.m(footballTopPlayersStatisticsItem13.getGoalsConceded(), footballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem14 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem14.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem14.getExpectedGoals()) + " (" + footballTopPlayersStatisticsItem14.getGoals() + ")";
                    case 26:
                        FootballTopPlayersStatistics footballTopPlayersStatistics13 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics13.getClass();
                        return footballTopPlayersStatistics13.getLeastConceded();
                    case 27:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem15 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem15.getClass();
                        return rei.m(footballTopPlayersStatisticsItem15.getGoalsConceded(), footballTopPlayersStatisticsItem15.getAppearances());
                    case 28:
                        FootballTopPlayersStatistics footballTopPlayersStatistics14 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics14.getClass();
                        return footballTopPlayersStatistics14.getCleanSheet();
                    default:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem16 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem16.getClass();
                        return yid.j(footballTopPlayersStatisticsItem16.getCleanSheet());
                }
            }
        }, new Function1() { // from class: oab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i29) {
                    case 0:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem.getClass();
                        return rei.o(footballTopPlayersStatisticsItem.getSuccessfulDribbles(), footballTopPlayersStatisticsItem.getAppearances(), footballTopPlayersStatisticsItem.getSuccessfulDribblesPercentage(), 0);
                    case 1:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem2 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem2.getClass();
                        return yid.j(footballTopPlayersStatisticsItem2.getGoals());
                    case 2:
                        FootballTopPlayersStatistics footballTopPlayersStatistics = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics.getClass();
                        return footballTopPlayersStatistics.getPenaltyWon();
                    case 3:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem3 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem3.getClass();
                        return yid.j(footballTopPlayersStatisticsItem3.getPenaltyWon());
                    case 4:
                        FootballTopPlayersStatistics footballTopPlayersStatistics2 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics2.getClass();
                        return footballTopPlayersStatistics2.getTackles();
                    case 5:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem4 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem4.getClass();
                        return rei.m(footballTopPlayersStatisticsItem4.getTackles(), footballTopPlayersStatisticsItem4.getAppearances());
                    case 6:
                        FootballTopPlayersStatistics footballTopPlayersStatistics3 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics3.getClass();
                        return footballTopPlayersStatistics3.getInterceptions();
                    case 7:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem5 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem5.getClass();
                        return rei.m(footballTopPlayersStatisticsItem5.getInterceptions(), footballTopPlayersStatisticsItem5.getAppearances());
                    case 8:
                        FootballTopPlayersStatistics footballTopPlayersStatistics4 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics4.getClass();
                        return footballTopPlayersStatistics4.getKilometersCovered();
                    case 9:
                        FootballTopPlayersStatistics footballTopPlayersStatistics5 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics5.getClass();
                        return footballTopPlayersStatistics5.getClearances();
                    case 10:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem6 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem6.getClass();
                        return rei.m(footballTopPlayersStatisticsItem6.getClearances(), footballTopPlayersStatisticsItem6.getAppearances());
                    case 11:
                        FootballTopPlayersStatistics footballTopPlayersStatistics6 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics6.getClass();
                        return footballTopPlayersStatistics6.getPossessionLost();
                    case 12:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem7 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem7.getClass();
                        return rei.m(footballTopPlayersStatisticsItem7.getPossessionLost(), footballTopPlayersStatisticsItem7.getAppearances());
                    case 13:
                        FootballTopPlayersStatistics footballTopPlayersStatistics7 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics7.getClass();
                        return footballTopPlayersStatistics7.getExpectedGoals();
                    case 14:
                        FootballTopPlayersStatistics footballTopPlayersStatistics8 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics8.getClass();
                        return footballTopPlayersStatistics8.getYellowCards();
                    case 15:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem8 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem8.getClass();
                        return yid.j(footballTopPlayersStatisticsItem8.getYellowCards());
                    case 16:
                        FootballTopPlayersStatistics footballTopPlayersStatistics9 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics9.getClass();
                        return footballTopPlayersStatistics9.getRedCards();
                    case 17:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem9 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem9.getClass();
                        return yid.j(footballTopPlayersStatisticsItem9.getRedCards());
                    case 18:
                        FootballTopPlayersStatistics footballTopPlayersStatistics10 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics10.getClass();
                        return footballTopPlayersStatistics10.getSaves();
                    case 19:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem10 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem10.getClass();
                        Double kilometersCovered = footballTopPlayersStatisticsItem10.getKilometersCovered();
                        Double valueOf = Double.valueOf(kilometersCovered != null ? kilometersCovered.doubleValue() : 0.0d);
                        Integer minutesPlayed = footballTopPlayersStatisticsItem10.getMinutesPlayed();
                        return rei.q(minutesPlayed != null ? minutesPlayed.intValue() : 0, valueOf).concat(" km");
                    case 20:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem11 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem11.getClass();
                        return rei.m(footballTopPlayersStatisticsItem11.getSaves(), footballTopPlayersStatisticsItem11.getAppearances());
                    case 21:
                        FootballTopPlayersStatistics footballTopPlayersStatistics11 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics11.getClass();
                        return footballTopPlayersStatistics11.getGoalsPrevented();
                    case 22:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem12 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem12.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem12.getGoalsPrevented());
                    case 23:
                        FootballTopPlayersStatistics footballTopPlayersStatistics12 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics12.getClass();
                        return footballTopPlayersStatistics12.getMostConceded();
                    case 24:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem13 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem13.getClass();
                        return rei.m(footballTopPlayersStatisticsItem13.getGoalsConceded(), footballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem14 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem14.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem14.getExpectedGoals()) + " (" + footballTopPlayersStatisticsItem14.getGoals() + ")";
                    case 26:
                        FootballTopPlayersStatistics footballTopPlayersStatistics13 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics13.getClass();
                        return footballTopPlayersStatistics13.getLeastConceded();
                    case 27:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem15 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem15.getClass();
                        return rei.m(footballTopPlayersStatisticsItem15.getGoalsConceded(), footballTopPlayersStatisticsItem15.getAppearances());
                    case 28:
                        FootballTopPlayersStatistics footballTopPlayersStatistics14 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics14.getClass();
                        return footballTopPlayersStatistics14.getCleanSheet();
                    default:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem16 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem16.getClass();
                        return yid.j(footballTopPlayersStatisticsItem16.getCleanSheet());
                }
            }
        }, null, 248);
        final int i30 = 28;
        final int i31 = 29;
        qab[] qabVarArr = {qabVar, qabVar2, qabVar3, qabVar4, qabVar5, qabVar6, qabVar7, qabVar8, qabVar9, qabVar10, qabVar11, qabVar12, qabVar13, qabVar14, qabVar15, qabVar16, qabVar17, qabVar18, qabVar19, qabVar20, qabVar21, qabVar22, qabVar23, qabVar24, qabVar25, qabVar26, qabVar27, qabVar28, qabVar29, qabVar30, qabVar31, new qab("CLEAN_SHEETS", 31, R.string.football_clean_sheets, new Function1() { // from class: oab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i30) {
                    case 0:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem.getClass();
                        return rei.o(footballTopPlayersStatisticsItem.getSuccessfulDribbles(), footballTopPlayersStatisticsItem.getAppearances(), footballTopPlayersStatisticsItem.getSuccessfulDribblesPercentage(), 0);
                    case 1:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem2 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem2.getClass();
                        return yid.j(footballTopPlayersStatisticsItem2.getGoals());
                    case 2:
                        FootballTopPlayersStatistics footballTopPlayersStatistics = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics.getClass();
                        return footballTopPlayersStatistics.getPenaltyWon();
                    case 3:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem3 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem3.getClass();
                        return yid.j(footballTopPlayersStatisticsItem3.getPenaltyWon());
                    case 4:
                        FootballTopPlayersStatistics footballTopPlayersStatistics2 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics2.getClass();
                        return footballTopPlayersStatistics2.getTackles();
                    case 5:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem4 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem4.getClass();
                        return rei.m(footballTopPlayersStatisticsItem4.getTackles(), footballTopPlayersStatisticsItem4.getAppearances());
                    case 6:
                        FootballTopPlayersStatistics footballTopPlayersStatistics3 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics3.getClass();
                        return footballTopPlayersStatistics3.getInterceptions();
                    case 7:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem5 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem5.getClass();
                        return rei.m(footballTopPlayersStatisticsItem5.getInterceptions(), footballTopPlayersStatisticsItem5.getAppearances());
                    case 8:
                        FootballTopPlayersStatistics footballTopPlayersStatistics4 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics4.getClass();
                        return footballTopPlayersStatistics4.getKilometersCovered();
                    case 9:
                        FootballTopPlayersStatistics footballTopPlayersStatistics5 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics5.getClass();
                        return footballTopPlayersStatistics5.getClearances();
                    case 10:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem6 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem6.getClass();
                        return rei.m(footballTopPlayersStatisticsItem6.getClearances(), footballTopPlayersStatisticsItem6.getAppearances());
                    case 11:
                        FootballTopPlayersStatistics footballTopPlayersStatistics6 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics6.getClass();
                        return footballTopPlayersStatistics6.getPossessionLost();
                    case 12:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem7 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem7.getClass();
                        return rei.m(footballTopPlayersStatisticsItem7.getPossessionLost(), footballTopPlayersStatisticsItem7.getAppearances());
                    case 13:
                        FootballTopPlayersStatistics footballTopPlayersStatistics7 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics7.getClass();
                        return footballTopPlayersStatistics7.getExpectedGoals();
                    case 14:
                        FootballTopPlayersStatistics footballTopPlayersStatistics8 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics8.getClass();
                        return footballTopPlayersStatistics8.getYellowCards();
                    case 15:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem8 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem8.getClass();
                        return yid.j(footballTopPlayersStatisticsItem8.getYellowCards());
                    case 16:
                        FootballTopPlayersStatistics footballTopPlayersStatistics9 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics9.getClass();
                        return footballTopPlayersStatistics9.getRedCards();
                    case 17:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem9 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem9.getClass();
                        return yid.j(footballTopPlayersStatisticsItem9.getRedCards());
                    case 18:
                        FootballTopPlayersStatistics footballTopPlayersStatistics10 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics10.getClass();
                        return footballTopPlayersStatistics10.getSaves();
                    case 19:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem10 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem10.getClass();
                        Double kilometersCovered = footballTopPlayersStatisticsItem10.getKilometersCovered();
                        Double valueOf = Double.valueOf(kilometersCovered != null ? kilometersCovered.doubleValue() : 0.0d);
                        Integer minutesPlayed = footballTopPlayersStatisticsItem10.getMinutesPlayed();
                        return rei.q(minutesPlayed != null ? minutesPlayed.intValue() : 0, valueOf).concat(" km");
                    case 20:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem11 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem11.getClass();
                        return rei.m(footballTopPlayersStatisticsItem11.getSaves(), footballTopPlayersStatisticsItem11.getAppearances());
                    case 21:
                        FootballTopPlayersStatistics footballTopPlayersStatistics11 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics11.getClass();
                        return footballTopPlayersStatistics11.getGoalsPrevented();
                    case 22:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem12 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem12.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem12.getGoalsPrevented());
                    case 23:
                        FootballTopPlayersStatistics footballTopPlayersStatistics12 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics12.getClass();
                        return footballTopPlayersStatistics12.getMostConceded();
                    case 24:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem13 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem13.getClass();
                        return rei.m(footballTopPlayersStatisticsItem13.getGoalsConceded(), footballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem14 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem14.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem14.getExpectedGoals()) + " (" + footballTopPlayersStatisticsItem14.getGoals() + ")";
                    case 26:
                        FootballTopPlayersStatistics footballTopPlayersStatistics13 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics13.getClass();
                        return footballTopPlayersStatistics13.getLeastConceded();
                    case 27:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem15 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem15.getClass();
                        return rei.m(footballTopPlayersStatisticsItem15.getGoalsConceded(), footballTopPlayersStatisticsItem15.getAppearances());
                    case 28:
                        FootballTopPlayersStatistics footballTopPlayersStatistics14 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics14.getClass();
                        return footballTopPlayersStatistics14.getCleanSheet();
                    default:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem16 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem16.getClass();
                        return yid.j(footballTopPlayersStatisticsItem16.getCleanSheet());
                }
            }
        }, new Function1() { // from class: oab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i31) {
                    case 0:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem.getClass();
                        return rei.o(footballTopPlayersStatisticsItem.getSuccessfulDribbles(), footballTopPlayersStatisticsItem.getAppearances(), footballTopPlayersStatisticsItem.getSuccessfulDribblesPercentage(), 0);
                    case 1:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem2 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem2.getClass();
                        return yid.j(footballTopPlayersStatisticsItem2.getGoals());
                    case 2:
                        FootballTopPlayersStatistics footballTopPlayersStatistics = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics.getClass();
                        return footballTopPlayersStatistics.getPenaltyWon();
                    case 3:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem3 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem3.getClass();
                        return yid.j(footballTopPlayersStatisticsItem3.getPenaltyWon());
                    case 4:
                        FootballTopPlayersStatistics footballTopPlayersStatistics2 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics2.getClass();
                        return footballTopPlayersStatistics2.getTackles();
                    case 5:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem4 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem4.getClass();
                        return rei.m(footballTopPlayersStatisticsItem4.getTackles(), footballTopPlayersStatisticsItem4.getAppearances());
                    case 6:
                        FootballTopPlayersStatistics footballTopPlayersStatistics3 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics3.getClass();
                        return footballTopPlayersStatistics3.getInterceptions();
                    case 7:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem5 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem5.getClass();
                        return rei.m(footballTopPlayersStatisticsItem5.getInterceptions(), footballTopPlayersStatisticsItem5.getAppearances());
                    case 8:
                        FootballTopPlayersStatistics footballTopPlayersStatistics4 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics4.getClass();
                        return footballTopPlayersStatistics4.getKilometersCovered();
                    case 9:
                        FootballTopPlayersStatistics footballTopPlayersStatistics5 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics5.getClass();
                        return footballTopPlayersStatistics5.getClearances();
                    case 10:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem6 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem6.getClass();
                        return rei.m(footballTopPlayersStatisticsItem6.getClearances(), footballTopPlayersStatisticsItem6.getAppearances());
                    case 11:
                        FootballTopPlayersStatistics footballTopPlayersStatistics6 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics6.getClass();
                        return footballTopPlayersStatistics6.getPossessionLost();
                    case 12:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem7 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem7.getClass();
                        return rei.m(footballTopPlayersStatisticsItem7.getPossessionLost(), footballTopPlayersStatisticsItem7.getAppearances());
                    case 13:
                        FootballTopPlayersStatistics footballTopPlayersStatistics7 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics7.getClass();
                        return footballTopPlayersStatistics7.getExpectedGoals();
                    case 14:
                        FootballTopPlayersStatistics footballTopPlayersStatistics8 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics8.getClass();
                        return footballTopPlayersStatistics8.getYellowCards();
                    case 15:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem8 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem8.getClass();
                        return yid.j(footballTopPlayersStatisticsItem8.getYellowCards());
                    case 16:
                        FootballTopPlayersStatistics footballTopPlayersStatistics9 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics9.getClass();
                        return footballTopPlayersStatistics9.getRedCards();
                    case 17:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem9 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem9.getClass();
                        return yid.j(footballTopPlayersStatisticsItem9.getRedCards());
                    case 18:
                        FootballTopPlayersStatistics footballTopPlayersStatistics10 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics10.getClass();
                        return footballTopPlayersStatistics10.getSaves();
                    case 19:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem10 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem10.getClass();
                        Double kilometersCovered = footballTopPlayersStatisticsItem10.getKilometersCovered();
                        Double valueOf = Double.valueOf(kilometersCovered != null ? kilometersCovered.doubleValue() : 0.0d);
                        Integer minutesPlayed = footballTopPlayersStatisticsItem10.getMinutesPlayed();
                        return rei.q(minutesPlayed != null ? minutesPlayed.intValue() : 0, valueOf).concat(" km");
                    case 20:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem11 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem11.getClass();
                        return rei.m(footballTopPlayersStatisticsItem11.getSaves(), footballTopPlayersStatisticsItem11.getAppearances());
                    case 21:
                        FootballTopPlayersStatistics footballTopPlayersStatistics11 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics11.getClass();
                        return footballTopPlayersStatistics11.getGoalsPrevented();
                    case 22:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem12 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem12.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem12.getGoalsPrevented());
                    case 23:
                        FootballTopPlayersStatistics footballTopPlayersStatistics12 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics12.getClass();
                        return footballTopPlayersStatistics12.getMostConceded();
                    case 24:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem13 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem13.getClass();
                        return rei.m(footballTopPlayersStatisticsItem13.getGoalsConceded(), footballTopPlayersStatisticsItem13.getAppearances());
                    case 25:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem14 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem14.getClass();
                        return rei.b(2, footballTopPlayersStatisticsItem14.getExpectedGoals()) + " (" + footballTopPlayersStatisticsItem14.getGoals() + ")";
                    case 26:
                        FootballTopPlayersStatistics footballTopPlayersStatistics13 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics13.getClass();
                        return footballTopPlayersStatistics13.getLeastConceded();
                    case 27:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem15 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem15.getClass();
                        return rei.m(footballTopPlayersStatisticsItem15.getGoalsConceded(), footballTopPlayersStatisticsItem15.getAppearances());
                    case 28:
                        FootballTopPlayersStatistics footballTopPlayersStatistics14 = (FootballTopPlayersStatistics) obj;
                        footballTopPlayersStatistics14.getClass();
                        return footballTopPlayersStatistics14.getCleanSheet();
                    default:
                        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem16 = (FootballTopPlayersStatisticsItem) obj;
                        footballTopPlayersStatisticsItem16.getClass();
                        return yid.j(footballTopPlayersStatisticsItem16.getCleanSheet());
                }
            }
        }, null, 248)};
        h = qabVarArr;
        i = new kp5(qabVarArr);
    }

    public qab(String str, int i2, int i3, Function1 function1, Function1 function12, Integer num, int i4) {
        boolean z = (i4 & 16) == 0;
        boolean z2 = (i4 & 32) == 0;
        boolean z3 = (i4 & 64) == 0;
        num = (i4 & 128) != 0 ? null : num;
        this.a = i3;
        this.b = function1;
        this.c = function12;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = num;
    }

    public static qab valueOf(String str) {
        return (qab) Enum.valueOf(qab.class, str);
    }

    public static qab[] values() {
        return (qab[]) h.clone();
    }

    @Override // defpackage.zab
    public final String a(Object obj) {
        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem = (FootballTopPlayersStatisticsItem) obj;
        footballTopPlayersStatisticsItem.getClass();
        return (String) this.c.invoke(footballTopPlayersStatisticsItem);
    }

    @Override // defpackage.zab
    public final List b(Object obj) {
        FootballTopPlayersStatistics footballTopPlayersStatistics = (FootballTopPlayersStatistics) obj;
        footballTopPlayersStatistics.getClass();
        return (List) this.b.invoke(footballTopPlayersStatistics);
    }

    @Override // defpackage.zab
    public final boolean c(hub hubVar) {
        hubVar.getClass();
        int ordinal = hubVar.ordinal();
        if (ordinal == 2) {
            return this.d;
        }
        if (ordinal == 3) {
            return this.e;
        }
        if (ordinal != 4) {
            return true;
        }
        return this.f;
    }

    @Override // defpackage.zab
    public final String d(Context context) {
        context.getClass();
        String string = context.getString(this.a);
        string.getClass();
        return string;
    }

    @Override // defpackage.zab
    public final Integer g() {
        return this.g;
    }

    @Override // defpackage.zab
    public final Integer h() {
        return null;
    }
}
