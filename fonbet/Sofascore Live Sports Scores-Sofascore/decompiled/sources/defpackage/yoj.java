package defpackage;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.sofascore.model.newNetwork.topperformance.response.FootballTopTeamsStatistics;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.FootballTopTeamsStatisticsItem;
import com.sofascore.results.R;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class yoj implements ipj {
    public static final /* synthetic */ yoj[] d;
    public static final /* synthetic */ kp5 e;
    public final int a;
    public final Function1 b;
    public final Function1 c;

    static {
        yoj yojVar = new yoj(NativeAdContent.ViewTag.RATING, 0, R.string.average_sofascore_rating, new uoj(13), new uoj(5));
        yoj yojVar2 = new yoj("GOALS_SCORED", 1, R.string.football_goals_scored, new uoj(17), new uoj(29));
        final int i = 11;
        Function1 function1 = new Function1() { // from class: woj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getSuccessfulDribbles();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem, footballTopTeamsStatisticsItem.getSuccessfulDribbles());
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getTackles();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem2, footballTopTeamsStatisticsItem2.getTackles());
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getInterceptions();
                    case 5:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem3.getBigChances()));
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem4, footballTopTeamsStatisticsItem4.getInterceptions());
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getClearances();
                    case 8:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getClearances());
                    case 9:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getCorners();
                    case 10:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getCorners());
                    case 11:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getGoalsConceded();
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getFouls();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem7, footballTopTeamsStatisticsItem7.getFouls());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getPenaltyGoals();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        Integer penaltyGoals = footballTopTeamsStatisticsItem8.getPenaltyGoals();
                        int intValue = penaltyGoals != null ? penaltyGoals.intValue() : 0;
                        Integer penaltiesTaken = footballTopTeamsStatisticsItem8.getPenaltiesTaken();
                        return penaltiesTaken != null ? fc6.g(intValue, penaltiesTaken.intValue(), "/") : String.valueOf(intValue);
                    case 16:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getBigChancesMissed();
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getPenaltyGoalsConceded();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return rei.i(8, footballTopTeamsStatisticsItem9.getPenaltyGoalsConceded(), footballTopTeamsStatisticsItem9.getPenaltiesCommited(), false);
                    case 19:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getCleanSheets();
                    case 20:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getCleanSheets()));
                    case 21:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTitlesWon();
                    case 22:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem11.getTitlesWon()));
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem12.getGoalsConceded()));
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getKilometersCovered();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return rei.m(footballTopTeamsStatisticsItem13.getKilometersCovered(), Integer.valueOf(footballTopTeamsStatisticsItem13.getMatches())).concat(" km");
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getNumberOfSprints();
                    case 27:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem14.getBigChancesMissed()));
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem15 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem15.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem15, footballTopTeamsStatisticsItem15.getNumberOfSprints());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getHitWoodwork();
                }
            }
        };
        final int i2 = 23;
        yoj yojVar3 = new yoj("GOALS_CONCEDED", 2, R.string.football_goals_conceded, function1, new Function1() { // from class: woj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i2) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getSuccessfulDribbles();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem, footballTopTeamsStatisticsItem.getSuccessfulDribbles());
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getTackles();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem2, footballTopTeamsStatisticsItem2.getTackles());
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getInterceptions();
                    case 5:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem3.getBigChances()));
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem4, footballTopTeamsStatisticsItem4.getInterceptions());
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getClearances();
                    case 8:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getClearances());
                    case 9:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getCorners();
                    case 10:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getCorners());
                    case 11:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getGoalsConceded();
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getFouls();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem7, footballTopTeamsStatisticsItem7.getFouls());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getPenaltyGoals();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        Integer penaltyGoals = footballTopTeamsStatisticsItem8.getPenaltyGoals();
                        int intValue = penaltyGoals != null ? penaltyGoals.intValue() : 0;
                        Integer penaltiesTaken = footballTopTeamsStatisticsItem8.getPenaltiesTaken();
                        return penaltiesTaken != null ? fc6.g(intValue, penaltiesTaken.intValue(), "/") : String.valueOf(intValue);
                    case 16:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getBigChancesMissed();
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getPenaltyGoalsConceded();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return rei.i(8, footballTopTeamsStatisticsItem9.getPenaltyGoalsConceded(), footballTopTeamsStatisticsItem9.getPenaltiesCommited(), false);
                    case 19:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getCleanSheets();
                    case 20:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getCleanSheets()));
                    case 21:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTitlesWon();
                    case 22:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem11.getTitlesWon()));
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem12.getGoalsConceded()));
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getKilometersCovered();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return rei.m(footballTopTeamsStatisticsItem13.getKilometersCovered(), Integer.valueOf(footballTopTeamsStatisticsItem13.getMatches())).concat(" km");
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getNumberOfSprints();
                    case 27:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem14.getBigChancesMissed()));
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem15 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem15.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem15, footballTopTeamsStatisticsItem15.getNumberOfSprints());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getHitWoodwork();
                }
            }
        });
        final int i3 = 24;
        Function1 function12 = new Function1() { // from class: woj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i3) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getSuccessfulDribbles();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem, footballTopTeamsStatisticsItem.getSuccessfulDribbles());
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getTackles();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem2, footballTopTeamsStatisticsItem2.getTackles());
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getInterceptions();
                    case 5:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem3.getBigChances()));
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem4, footballTopTeamsStatisticsItem4.getInterceptions());
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getClearances();
                    case 8:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getClearances());
                    case 9:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getCorners();
                    case 10:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getCorners());
                    case 11:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getGoalsConceded();
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getFouls();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem7, footballTopTeamsStatisticsItem7.getFouls());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getPenaltyGoals();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        Integer penaltyGoals = footballTopTeamsStatisticsItem8.getPenaltyGoals();
                        int intValue = penaltyGoals != null ? penaltyGoals.intValue() : 0;
                        Integer penaltiesTaken = footballTopTeamsStatisticsItem8.getPenaltiesTaken();
                        return penaltiesTaken != null ? fc6.g(intValue, penaltiesTaken.intValue(), "/") : String.valueOf(intValue);
                    case 16:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getBigChancesMissed();
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getPenaltyGoalsConceded();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return rei.i(8, footballTopTeamsStatisticsItem9.getPenaltyGoalsConceded(), footballTopTeamsStatisticsItem9.getPenaltiesCommited(), false);
                    case 19:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getCleanSheets();
                    case 20:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getCleanSheets()));
                    case 21:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTitlesWon();
                    case 22:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem11.getTitlesWon()));
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem12.getGoalsConceded()));
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getKilometersCovered();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return rei.m(footballTopTeamsStatisticsItem13.getKilometersCovered(), Integer.valueOf(footballTopTeamsStatisticsItem13.getMatches())).concat(" km");
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getNumberOfSprints();
                    case 27:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem14.getBigChancesMissed()));
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem15 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem15.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem15, footballTopTeamsStatisticsItem15.getNumberOfSprints());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getHitWoodwork();
                }
            }
        };
        final int i4 = 25;
        yoj yojVar4 = new yoj("DISTANCE", 3, R.string.football_running_distance_covered_per_match, function12, new Function1() { // from class: woj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i4) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getSuccessfulDribbles();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem, footballTopTeamsStatisticsItem.getSuccessfulDribbles());
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getTackles();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem2, footballTopTeamsStatisticsItem2.getTackles());
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getInterceptions();
                    case 5:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem3.getBigChances()));
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem4, footballTopTeamsStatisticsItem4.getInterceptions());
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getClearances();
                    case 8:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getClearances());
                    case 9:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getCorners();
                    case 10:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getCorners());
                    case 11:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getGoalsConceded();
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getFouls();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem7, footballTopTeamsStatisticsItem7.getFouls());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getPenaltyGoals();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        Integer penaltyGoals = footballTopTeamsStatisticsItem8.getPenaltyGoals();
                        int intValue = penaltyGoals != null ? penaltyGoals.intValue() : 0;
                        Integer penaltiesTaken = footballTopTeamsStatisticsItem8.getPenaltiesTaken();
                        return penaltiesTaken != null ? fc6.g(intValue, penaltiesTaken.intValue(), "/") : String.valueOf(intValue);
                    case 16:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getBigChancesMissed();
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getPenaltyGoalsConceded();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return rei.i(8, footballTopTeamsStatisticsItem9.getPenaltyGoalsConceded(), footballTopTeamsStatisticsItem9.getPenaltiesCommited(), false);
                    case 19:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getCleanSheets();
                    case 20:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getCleanSheets()));
                    case 21:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTitlesWon();
                    case 22:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem11.getTitlesWon()));
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem12.getGoalsConceded()));
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getKilometersCovered();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return rei.m(footballTopTeamsStatisticsItem13.getKilometersCovered(), Integer.valueOf(footballTopTeamsStatisticsItem13.getMatches())).concat(" km");
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getNumberOfSprints();
                    case 27:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem14.getBigChancesMissed()));
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem15 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem15.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem15, footballTopTeamsStatisticsItem15.getNumberOfSprints());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getHitWoodwork();
                }
            }
        });
        final int i5 = 26;
        Function1 function13 = new Function1() { // from class: woj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i5) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getSuccessfulDribbles();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem, footballTopTeamsStatisticsItem.getSuccessfulDribbles());
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getTackles();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem2, footballTopTeamsStatisticsItem2.getTackles());
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getInterceptions();
                    case 5:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem3.getBigChances()));
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem4, footballTopTeamsStatisticsItem4.getInterceptions());
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getClearances();
                    case 8:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getClearances());
                    case 9:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getCorners();
                    case 10:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getCorners());
                    case 11:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getGoalsConceded();
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getFouls();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem7, footballTopTeamsStatisticsItem7.getFouls());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getPenaltyGoals();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        Integer penaltyGoals = footballTopTeamsStatisticsItem8.getPenaltyGoals();
                        int intValue = penaltyGoals != null ? penaltyGoals.intValue() : 0;
                        Integer penaltiesTaken = footballTopTeamsStatisticsItem8.getPenaltiesTaken();
                        return penaltiesTaken != null ? fc6.g(intValue, penaltiesTaken.intValue(), "/") : String.valueOf(intValue);
                    case 16:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getBigChancesMissed();
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getPenaltyGoalsConceded();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return rei.i(8, footballTopTeamsStatisticsItem9.getPenaltyGoalsConceded(), footballTopTeamsStatisticsItem9.getPenaltiesCommited(), false);
                    case 19:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getCleanSheets();
                    case 20:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getCleanSheets()));
                    case 21:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTitlesWon();
                    case 22:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem11.getTitlesWon()));
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem12.getGoalsConceded()));
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getKilometersCovered();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return rei.m(footballTopTeamsStatisticsItem13.getKilometersCovered(), Integer.valueOf(footballTopTeamsStatisticsItem13.getMatches())).concat(" km");
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getNumberOfSprints();
                    case 27:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem14.getBigChancesMissed()));
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem15 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem15.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem15, footballTopTeamsStatisticsItem15.getNumberOfSprints());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getHitWoodwork();
                }
            }
        };
        final int i6 = 28;
        yoj yojVar5 = new yoj("NUMBER_OF_SPRINTS", 4, R.string.football_running_number_of_sprints_per_match, function13, new Function1() { // from class: woj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i6) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getSuccessfulDribbles();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem, footballTopTeamsStatisticsItem.getSuccessfulDribbles());
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getTackles();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem2, footballTopTeamsStatisticsItem2.getTackles());
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getInterceptions();
                    case 5:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem3.getBigChances()));
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem4, footballTopTeamsStatisticsItem4.getInterceptions());
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getClearances();
                    case 8:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getClearances());
                    case 9:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getCorners();
                    case 10:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getCorners());
                    case 11:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getGoalsConceded();
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getFouls();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem7, footballTopTeamsStatisticsItem7.getFouls());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getPenaltyGoals();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        Integer penaltyGoals = footballTopTeamsStatisticsItem8.getPenaltyGoals();
                        int intValue = penaltyGoals != null ? penaltyGoals.intValue() : 0;
                        Integer penaltiesTaken = footballTopTeamsStatisticsItem8.getPenaltiesTaken();
                        return penaltiesTaken != null ? fc6.g(intValue, penaltiesTaken.intValue(), "/") : String.valueOf(intValue);
                    case 16:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getBigChancesMissed();
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getPenaltyGoalsConceded();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return rei.i(8, footballTopTeamsStatisticsItem9.getPenaltyGoalsConceded(), footballTopTeamsStatisticsItem9.getPenaltiesCommited(), false);
                    case 19:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getCleanSheets();
                    case 20:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getCleanSheets()));
                    case 21:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTitlesWon();
                    case 22:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem11.getTitlesWon()));
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem12.getGoalsConceded()));
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getKilometersCovered();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return rei.m(footballTopTeamsStatisticsItem13.getKilometersCovered(), Integer.valueOf(footballTopTeamsStatisticsItem13.getMatches())).concat(" km");
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getNumberOfSprints();
                    case 27:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem14.getBigChancesMissed()));
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem15 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem15.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem15, footballTopTeamsStatisticsItem15.getNumberOfSprints());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getHitWoodwork();
                }
            }
        });
        final int i7 = 5;
        yoj yojVar6 = new yoj("BIG_CHANCES", 5, R.string.football_big_chances, new uoj(24), new Function1() { // from class: woj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i7) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getSuccessfulDribbles();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem, footballTopTeamsStatisticsItem.getSuccessfulDribbles());
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getTackles();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem2, footballTopTeamsStatisticsItem2.getTackles());
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getInterceptions();
                    case 5:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem3.getBigChances()));
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem4, footballTopTeamsStatisticsItem4.getInterceptions());
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getClearances();
                    case 8:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getClearances());
                    case 9:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getCorners();
                    case 10:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getCorners());
                    case 11:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getGoalsConceded();
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getFouls();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem7, footballTopTeamsStatisticsItem7.getFouls());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getPenaltyGoals();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        Integer penaltyGoals = footballTopTeamsStatisticsItem8.getPenaltyGoals();
                        int intValue = penaltyGoals != null ? penaltyGoals.intValue() : 0;
                        Integer penaltiesTaken = footballTopTeamsStatisticsItem8.getPenaltiesTaken();
                        return penaltiesTaken != null ? fc6.g(intValue, penaltiesTaken.intValue(), "/") : String.valueOf(intValue);
                    case 16:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getBigChancesMissed();
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getPenaltyGoalsConceded();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return rei.i(8, footballTopTeamsStatisticsItem9.getPenaltyGoalsConceded(), footballTopTeamsStatisticsItem9.getPenaltiesCommited(), false);
                    case 19:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getCleanSheets();
                    case 20:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getCleanSheets()));
                    case 21:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTitlesWon();
                    case 22:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem11.getTitlesWon()));
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem12.getGoalsConceded()));
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getKilometersCovered();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return rei.m(footballTopTeamsStatisticsItem13.getKilometersCovered(), Integer.valueOf(footballTopTeamsStatisticsItem13.getMatches())).concat(" km");
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getNumberOfSprints();
                    case 27:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem14.getBigChancesMissed()));
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem15 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem15.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem15, footballTopTeamsStatisticsItem15.getNumberOfSprints());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getHitWoodwork();
                }
            }
        });
        final int i8 = 16;
        Function1 function14 = new Function1() { // from class: woj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i8) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getSuccessfulDribbles();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem, footballTopTeamsStatisticsItem.getSuccessfulDribbles());
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getTackles();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem2, footballTopTeamsStatisticsItem2.getTackles());
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getInterceptions();
                    case 5:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem3.getBigChances()));
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem4, footballTopTeamsStatisticsItem4.getInterceptions());
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getClearances();
                    case 8:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getClearances());
                    case 9:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getCorners();
                    case 10:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getCorners());
                    case 11:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getGoalsConceded();
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getFouls();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem7, footballTopTeamsStatisticsItem7.getFouls());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getPenaltyGoals();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        Integer penaltyGoals = footballTopTeamsStatisticsItem8.getPenaltyGoals();
                        int intValue = penaltyGoals != null ? penaltyGoals.intValue() : 0;
                        Integer penaltiesTaken = footballTopTeamsStatisticsItem8.getPenaltiesTaken();
                        return penaltiesTaken != null ? fc6.g(intValue, penaltiesTaken.intValue(), "/") : String.valueOf(intValue);
                    case 16:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getBigChancesMissed();
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getPenaltyGoalsConceded();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return rei.i(8, footballTopTeamsStatisticsItem9.getPenaltyGoalsConceded(), footballTopTeamsStatisticsItem9.getPenaltiesCommited(), false);
                    case 19:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getCleanSheets();
                    case 20:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getCleanSheets()));
                    case 21:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTitlesWon();
                    case 22:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem11.getTitlesWon()));
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem12.getGoalsConceded()));
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getKilometersCovered();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return rei.m(footballTopTeamsStatisticsItem13.getKilometersCovered(), Integer.valueOf(footballTopTeamsStatisticsItem13.getMatches())).concat(" km");
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getNumberOfSprints();
                    case 27:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem14.getBigChancesMissed()));
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem15 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem15.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem15, footballTopTeamsStatisticsItem15.getNumberOfSprints());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getHitWoodwork();
                }
            }
        };
        final int i9 = 27;
        yoj yojVar7 = new yoj("BIG_CHANCES_MISSED", 6, R.string.football_big_chances_missed, function14, new Function1() { // from class: woj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i9) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getSuccessfulDribbles();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem, footballTopTeamsStatisticsItem.getSuccessfulDribbles());
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getTackles();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem2, footballTopTeamsStatisticsItem2.getTackles());
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getInterceptions();
                    case 5:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem3.getBigChances()));
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem4, footballTopTeamsStatisticsItem4.getInterceptions());
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getClearances();
                    case 8:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getClearances());
                    case 9:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getCorners();
                    case 10:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getCorners());
                    case 11:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getGoalsConceded();
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getFouls();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem7, footballTopTeamsStatisticsItem7.getFouls());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getPenaltyGoals();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        Integer penaltyGoals = footballTopTeamsStatisticsItem8.getPenaltyGoals();
                        int intValue = penaltyGoals != null ? penaltyGoals.intValue() : 0;
                        Integer penaltiesTaken = footballTopTeamsStatisticsItem8.getPenaltiesTaken();
                        return penaltiesTaken != null ? fc6.g(intValue, penaltiesTaken.intValue(), "/") : String.valueOf(intValue);
                    case 16:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getBigChancesMissed();
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getPenaltyGoalsConceded();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return rei.i(8, footballTopTeamsStatisticsItem9.getPenaltyGoalsConceded(), footballTopTeamsStatisticsItem9.getPenaltiesCommited(), false);
                    case 19:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getCleanSheets();
                    case 20:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getCleanSheets()));
                    case 21:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTitlesWon();
                    case 22:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem11.getTitlesWon()));
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem12.getGoalsConceded()));
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getKilometersCovered();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return rei.m(footballTopTeamsStatisticsItem13.getKilometersCovered(), Integer.valueOf(footballTopTeamsStatisticsItem13.getMatches())).concat(" km");
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getNumberOfSprints();
                    case 27:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem14.getBigChancesMissed()));
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem15 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem15.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem15, footballTopTeamsStatisticsItem15.getNumberOfSprints());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getHitWoodwork();
                }
            }
        });
        final int i10 = 29;
        yoj yojVar8 = new yoj("HIT_WOODWORK", 7, R.string.football_hit_woodwork, new Function1() { // from class: woj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i10) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getSuccessfulDribbles();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem, footballTopTeamsStatisticsItem.getSuccessfulDribbles());
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getTackles();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem2, footballTopTeamsStatisticsItem2.getTackles());
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getInterceptions();
                    case 5:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem3.getBigChances()));
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem4, footballTopTeamsStatisticsItem4.getInterceptions());
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getClearances();
                    case 8:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getClearances());
                    case 9:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getCorners();
                    case 10:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getCorners());
                    case 11:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getGoalsConceded();
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getFouls();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem7, footballTopTeamsStatisticsItem7.getFouls());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getPenaltyGoals();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        Integer penaltyGoals = footballTopTeamsStatisticsItem8.getPenaltyGoals();
                        int intValue = penaltyGoals != null ? penaltyGoals.intValue() : 0;
                        Integer penaltiesTaken = footballTopTeamsStatisticsItem8.getPenaltiesTaken();
                        return penaltiesTaken != null ? fc6.g(intValue, penaltiesTaken.intValue(), "/") : String.valueOf(intValue);
                    case 16:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getBigChancesMissed();
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getPenaltyGoalsConceded();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return rei.i(8, footballTopTeamsStatisticsItem9.getPenaltyGoalsConceded(), footballTopTeamsStatisticsItem9.getPenaltiesCommited(), false);
                    case 19:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getCleanSheets();
                    case 20:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getCleanSheets()));
                    case 21:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTitlesWon();
                    case 22:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem11.getTitlesWon()));
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem12.getGoalsConceded()));
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getKilometersCovered();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return rei.m(footballTopTeamsStatisticsItem13.getKilometersCovered(), Integer.valueOf(footballTopTeamsStatisticsItem13.getMatches())).concat(" km");
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getNumberOfSprints();
                    case 27:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem14.getBigChancesMissed()));
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem15 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem15.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem15, footballTopTeamsStatisticsItem15.getNumberOfSprints());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getHitWoodwork();
                }
            }
        }, new xoj(0));
        yoj yojVar9 = new yoj("EXPECTED_GOALS", 8, R.string.football_expected_goals, new xoj(1), new xoj(2));
        yoj yojVar10 = new yoj("EXPECTED_GOALS_ON_TARGET", 9, R.string.football_expected_goals_on_target, new uoj(3), new uoj(4));
        yoj yojVar11 = new yoj("EXPECTED_ASSISTS", 10, R.string.football_expected_assists, new uoj(6), new uoj(7));
        yoj yojVar12 = new yoj("GOALS_PREVENTED", 11, R.string.football_goals_prevented, new uoj(8), new uoj(9));
        yoj yojVar13 = new yoj("YELLOW_CARDS", 12, R.string.football_yellow_cards, new uoj(10), new uoj(11));
        yoj yojVar14 = new yoj("RED_CARDS", 13, R.string.football_red_cards, new uoj(12), new uoj(14));
        yoj yojVar15 = new yoj("BALL_POSSESSION", 14, R.string.football_ball_possession, new uoj(15), new uoj(16));
        yoj yojVar16 = new yoj("ACCURATE_PASSES_PER_GAME", 15, R.string.football_accurate_passes_per_game, new uoj(18), new uoj(19));
        yoj yojVar17 = new yoj("ACCURATE_LONG_BALLS_PER_GAME", 16, R.string.football_accurate_long_balls_per_game, new uoj(20), new uoj(21));
        yoj yojVar18 = new yoj("ACCURATE_CROSSES_PER_GAME", 17, R.string.football_accurate_crosses_per_game, new uoj(22), new uoj(23));
        yoj yojVar19 = new yoj("TOTAL_SHOTS_PER_GAME", 18, R.string.football_total_shots_per_game, new uoj(25), new uoj(26));
        yoj yojVar20 = new yoj("SHOTS_ON_GOAL_PER_GAME", 19, R.string.football_shots_on_goal_per_game, new uoj(27), new uoj(28));
        final int i11 = 0;
        final int i12 = 1;
        yoj yojVar21 = new yoj("SUCCESSFUL_DRIBBLES_PER_GAME", 20, R.string.football_successful_dribbles_per_game, new Function1() { // from class: woj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i11) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getSuccessfulDribbles();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem, footballTopTeamsStatisticsItem.getSuccessfulDribbles());
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getTackles();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem2, footballTopTeamsStatisticsItem2.getTackles());
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getInterceptions();
                    case 5:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem3.getBigChances()));
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem4, footballTopTeamsStatisticsItem4.getInterceptions());
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getClearances();
                    case 8:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getClearances());
                    case 9:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getCorners();
                    case 10:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getCorners());
                    case 11:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getGoalsConceded();
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getFouls();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem7, footballTopTeamsStatisticsItem7.getFouls());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getPenaltyGoals();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        Integer penaltyGoals = footballTopTeamsStatisticsItem8.getPenaltyGoals();
                        int intValue = penaltyGoals != null ? penaltyGoals.intValue() : 0;
                        Integer penaltiesTaken = footballTopTeamsStatisticsItem8.getPenaltiesTaken();
                        return penaltiesTaken != null ? fc6.g(intValue, penaltiesTaken.intValue(), "/") : String.valueOf(intValue);
                    case 16:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getBigChancesMissed();
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getPenaltyGoalsConceded();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return rei.i(8, footballTopTeamsStatisticsItem9.getPenaltyGoalsConceded(), footballTopTeamsStatisticsItem9.getPenaltiesCommited(), false);
                    case 19:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getCleanSheets();
                    case 20:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getCleanSheets()));
                    case 21:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTitlesWon();
                    case 22:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem11.getTitlesWon()));
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem12.getGoalsConceded()));
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getKilometersCovered();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return rei.m(footballTopTeamsStatisticsItem13.getKilometersCovered(), Integer.valueOf(footballTopTeamsStatisticsItem13.getMatches())).concat(" km");
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getNumberOfSprints();
                    case 27:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem14.getBigChancesMissed()));
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem15 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem15.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem15, footballTopTeamsStatisticsItem15.getNumberOfSprints());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getHitWoodwork();
                }
            }
        }, new Function1() { // from class: woj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i12) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getSuccessfulDribbles();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem, footballTopTeamsStatisticsItem.getSuccessfulDribbles());
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getTackles();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem2, footballTopTeamsStatisticsItem2.getTackles());
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getInterceptions();
                    case 5:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem3.getBigChances()));
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem4, footballTopTeamsStatisticsItem4.getInterceptions());
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getClearances();
                    case 8:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getClearances());
                    case 9:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getCorners();
                    case 10:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getCorners());
                    case 11:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getGoalsConceded();
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getFouls();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem7, footballTopTeamsStatisticsItem7.getFouls());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getPenaltyGoals();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        Integer penaltyGoals = footballTopTeamsStatisticsItem8.getPenaltyGoals();
                        int intValue = penaltyGoals != null ? penaltyGoals.intValue() : 0;
                        Integer penaltiesTaken = footballTopTeamsStatisticsItem8.getPenaltiesTaken();
                        return penaltiesTaken != null ? fc6.g(intValue, penaltiesTaken.intValue(), "/") : String.valueOf(intValue);
                    case 16:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getBigChancesMissed();
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getPenaltyGoalsConceded();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return rei.i(8, footballTopTeamsStatisticsItem9.getPenaltyGoalsConceded(), footballTopTeamsStatisticsItem9.getPenaltiesCommited(), false);
                    case 19:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getCleanSheets();
                    case 20:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getCleanSheets()));
                    case 21:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTitlesWon();
                    case 22:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem11.getTitlesWon()));
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem12.getGoalsConceded()));
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getKilometersCovered();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return rei.m(footballTopTeamsStatisticsItem13.getKilometersCovered(), Integer.valueOf(footballTopTeamsStatisticsItem13.getMatches())).concat(" km");
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getNumberOfSprints();
                    case 27:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem14.getBigChancesMissed()));
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem15 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem15.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem15, footballTopTeamsStatisticsItem15.getNumberOfSprints());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getHitWoodwork();
                }
            }
        });
        final int i13 = 2;
        final int i14 = 3;
        yoj yojVar22 = new yoj("TACKLES_PER_GAME", 21, R.string.football_tackles_per_game, new Function1() { // from class: woj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i13) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getSuccessfulDribbles();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem, footballTopTeamsStatisticsItem.getSuccessfulDribbles());
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getTackles();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem2, footballTopTeamsStatisticsItem2.getTackles());
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getInterceptions();
                    case 5:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem3.getBigChances()));
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem4, footballTopTeamsStatisticsItem4.getInterceptions());
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getClearances();
                    case 8:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getClearances());
                    case 9:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getCorners();
                    case 10:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getCorners());
                    case 11:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getGoalsConceded();
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getFouls();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem7, footballTopTeamsStatisticsItem7.getFouls());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getPenaltyGoals();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        Integer penaltyGoals = footballTopTeamsStatisticsItem8.getPenaltyGoals();
                        int intValue = penaltyGoals != null ? penaltyGoals.intValue() : 0;
                        Integer penaltiesTaken = footballTopTeamsStatisticsItem8.getPenaltiesTaken();
                        return penaltiesTaken != null ? fc6.g(intValue, penaltiesTaken.intValue(), "/") : String.valueOf(intValue);
                    case 16:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getBigChancesMissed();
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getPenaltyGoalsConceded();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return rei.i(8, footballTopTeamsStatisticsItem9.getPenaltyGoalsConceded(), footballTopTeamsStatisticsItem9.getPenaltiesCommited(), false);
                    case 19:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getCleanSheets();
                    case 20:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getCleanSheets()));
                    case 21:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTitlesWon();
                    case 22:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem11.getTitlesWon()));
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem12.getGoalsConceded()));
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getKilometersCovered();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return rei.m(footballTopTeamsStatisticsItem13.getKilometersCovered(), Integer.valueOf(footballTopTeamsStatisticsItem13.getMatches())).concat(" km");
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getNumberOfSprints();
                    case 27:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem14.getBigChancesMissed()));
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem15 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem15.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem15, footballTopTeamsStatisticsItem15.getNumberOfSprints());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getHitWoodwork();
                }
            }
        }, new Function1() { // from class: woj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getSuccessfulDribbles();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem, footballTopTeamsStatisticsItem.getSuccessfulDribbles());
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getTackles();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem2, footballTopTeamsStatisticsItem2.getTackles());
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getInterceptions();
                    case 5:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem3.getBigChances()));
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem4, footballTopTeamsStatisticsItem4.getInterceptions());
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getClearances();
                    case 8:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getClearances());
                    case 9:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getCorners();
                    case 10:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getCorners());
                    case 11:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getGoalsConceded();
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getFouls();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem7, footballTopTeamsStatisticsItem7.getFouls());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getPenaltyGoals();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        Integer penaltyGoals = footballTopTeamsStatisticsItem8.getPenaltyGoals();
                        int intValue = penaltyGoals != null ? penaltyGoals.intValue() : 0;
                        Integer penaltiesTaken = footballTopTeamsStatisticsItem8.getPenaltiesTaken();
                        return penaltiesTaken != null ? fc6.g(intValue, penaltiesTaken.intValue(), "/") : String.valueOf(intValue);
                    case 16:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getBigChancesMissed();
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getPenaltyGoalsConceded();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return rei.i(8, footballTopTeamsStatisticsItem9.getPenaltyGoalsConceded(), footballTopTeamsStatisticsItem9.getPenaltiesCommited(), false);
                    case 19:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getCleanSheets();
                    case 20:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getCleanSheets()));
                    case 21:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTitlesWon();
                    case 22:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem11.getTitlesWon()));
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem12.getGoalsConceded()));
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getKilometersCovered();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return rei.m(footballTopTeamsStatisticsItem13.getKilometersCovered(), Integer.valueOf(footballTopTeamsStatisticsItem13.getMatches())).concat(" km");
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getNumberOfSprints();
                    case 27:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem14.getBigChancesMissed()));
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem15 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem15.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem15, footballTopTeamsStatisticsItem15.getNumberOfSprints());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getHitWoodwork();
                }
            }
        });
        final int i15 = 4;
        final int i16 = 6;
        yoj yojVar23 = new yoj("INTERCEPTIONS_PER_GAME", 22, R.string.football_interceptions_per_game, new Function1() { // from class: woj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i15) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getSuccessfulDribbles();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem, footballTopTeamsStatisticsItem.getSuccessfulDribbles());
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getTackles();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem2, footballTopTeamsStatisticsItem2.getTackles());
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getInterceptions();
                    case 5:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem3.getBigChances()));
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem4, footballTopTeamsStatisticsItem4.getInterceptions());
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getClearances();
                    case 8:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getClearances());
                    case 9:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getCorners();
                    case 10:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getCorners());
                    case 11:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getGoalsConceded();
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getFouls();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem7, footballTopTeamsStatisticsItem7.getFouls());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getPenaltyGoals();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        Integer penaltyGoals = footballTopTeamsStatisticsItem8.getPenaltyGoals();
                        int intValue = penaltyGoals != null ? penaltyGoals.intValue() : 0;
                        Integer penaltiesTaken = footballTopTeamsStatisticsItem8.getPenaltiesTaken();
                        return penaltiesTaken != null ? fc6.g(intValue, penaltiesTaken.intValue(), "/") : String.valueOf(intValue);
                    case 16:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getBigChancesMissed();
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getPenaltyGoalsConceded();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return rei.i(8, footballTopTeamsStatisticsItem9.getPenaltyGoalsConceded(), footballTopTeamsStatisticsItem9.getPenaltiesCommited(), false);
                    case 19:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getCleanSheets();
                    case 20:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getCleanSheets()));
                    case 21:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTitlesWon();
                    case 22:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem11.getTitlesWon()));
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem12.getGoalsConceded()));
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getKilometersCovered();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return rei.m(footballTopTeamsStatisticsItem13.getKilometersCovered(), Integer.valueOf(footballTopTeamsStatisticsItem13.getMatches())).concat(" km");
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getNumberOfSprints();
                    case 27:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem14.getBigChancesMissed()));
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem15 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem15.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem15, footballTopTeamsStatisticsItem15.getNumberOfSprints());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getHitWoodwork();
                }
            }
        }, new Function1() { // from class: woj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i16) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getSuccessfulDribbles();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem, footballTopTeamsStatisticsItem.getSuccessfulDribbles());
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getTackles();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem2, footballTopTeamsStatisticsItem2.getTackles());
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getInterceptions();
                    case 5:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem3.getBigChances()));
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem4, footballTopTeamsStatisticsItem4.getInterceptions());
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getClearances();
                    case 8:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getClearances());
                    case 9:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getCorners();
                    case 10:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getCorners());
                    case 11:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getGoalsConceded();
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getFouls();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem7, footballTopTeamsStatisticsItem7.getFouls());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getPenaltyGoals();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        Integer penaltyGoals = footballTopTeamsStatisticsItem8.getPenaltyGoals();
                        int intValue = penaltyGoals != null ? penaltyGoals.intValue() : 0;
                        Integer penaltiesTaken = footballTopTeamsStatisticsItem8.getPenaltiesTaken();
                        return penaltiesTaken != null ? fc6.g(intValue, penaltiesTaken.intValue(), "/") : String.valueOf(intValue);
                    case 16:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getBigChancesMissed();
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getPenaltyGoalsConceded();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return rei.i(8, footballTopTeamsStatisticsItem9.getPenaltyGoalsConceded(), footballTopTeamsStatisticsItem9.getPenaltiesCommited(), false);
                    case 19:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getCleanSheets();
                    case 20:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getCleanSheets()));
                    case 21:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTitlesWon();
                    case 22:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem11.getTitlesWon()));
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem12.getGoalsConceded()));
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getKilometersCovered();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return rei.m(footballTopTeamsStatisticsItem13.getKilometersCovered(), Integer.valueOf(footballTopTeamsStatisticsItem13.getMatches())).concat(" km");
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getNumberOfSprints();
                    case 27:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem14.getBigChancesMissed()));
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem15 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem15.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem15, footballTopTeamsStatisticsItem15.getNumberOfSprints());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getHitWoodwork();
                }
            }
        });
        final int i17 = 7;
        final int i18 = 8;
        yoj yojVar24 = new yoj("CLEARANCES_PER_GAME", 23, R.string.football_clearances_per_game, new Function1() { // from class: woj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i17) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getSuccessfulDribbles();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem, footballTopTeamsStatisticsItem.getSuccessfulDribbles());
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getTackles();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem2, footballTopTeamsStatisticsItem2.getTackles());
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getInterceptions();
                    case 5:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem3.getBigChances()));
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem4, footballTopTeamsStatisticsItem4.getInterceptions());
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getClearances();
                    case 8:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getClearances());
                    case 9:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getCorners();
                    case 10:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getCorners());
                    case 11:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getGoalsConceded();
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getFouls();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem7, footballTopTeamsStatisticsItem7.getFouls());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getPenaltyGoals();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        Integer penaltyGoals = footballTopTeamsStatisticsItem8.getPenaltyGoals();
                        int intValue = penaltyGoals != null ? penaltyGoals.intValue() : 0;
                        Integer penaltiesTaken = footballTopTeamsStatisticsItem8.getPenaltiesTaken();
                        return penaltiesTaken != null ? fc6.g(intValue, penaltiesTaken.intValue(), "/") : String.valueOf(intValue);
                    case 16:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getBigChancesMissed();
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getPenaltyGoalsConceded();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return rei.i(8, footballTopTeamsStatisticsItem9.getPenaltyGoalsConceded(), footballTopTeamsStatisticsItem9.getPenaltiesCommited(), false);
                    case 19:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getCleanSheets();
                    case 20:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getCleanSheets()));
                    case 21:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTitlesWon();
                    case 22:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem11.getTitlesWon()));
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem12.getGoalsConceded()));
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getKilometersCovered();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return rei.m(footballTopTeamsStatisticsItem13.getKilometersCovered(), Integer.valueOf(footballTopTeamsStatisticsItem13.getMatches())).concat(" km");
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getNumberOfSprints();
                    case 27:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem14.getBigChancesMissed()));
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem15 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem15.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem15, footballTopTeamsStatisticsItem15.getNumberOfSprints());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getHitWoodwork();
                }
            }
        }, new Function1() { // from class: woj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i18) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getSuccessfulDribbles();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem, footballTopTeamsStatisticsItem.getSuccessfulDribbles());
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getTackles();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem2, footballTopTeamsStatisticsItem2.getTackles());
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getInterceptions();
                    case 5:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem3.getBigChances()));
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem4, footballTopTeamsStatisticsItem4.getInterceptions());
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getClearances();
                    case 8:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getClearances());
                    case 9:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getCorners();
                    case 10:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getCorners());
                    case 11:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getGoalsConceded();
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getFouls();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem7, footballTopTeamsStatisticsItem7.getFouls());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getPenaltyGoals();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        Integer penaltyGoals = footballTopTeamsStatisticsItem8.getPenaltyGoals();
                        int intValue = penaltyGoals != null ? penaltyGoals.intValue() : 0;
                        Integer penaltiesTaken = footballTopTeamsStatisticsItem8.getPenaltiesTaken();
                        return penaltiesTaken != null ? fc6.g(intValue, penaltiesTaken.intValue(), "/") : String.valueOf(intValue);
                    case 16:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getBigChancesMissed();
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getPenaltyGoalsConceded();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return rei.i(8, footballTopTeamsStatisticsItem9.getPenaltyGoalsConceded(), footballTopTeamsStatisticsItem9.getPenaltiesCommited(), false);
                    case 19:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getCleanSheets();
                    case 20:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getCleanSheets()));
                    case 21:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTitlesWon();
                    case 22:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem11.getTitlesWon()));
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem12.getGoalsConceded()));
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getKilometersCovered();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return rei.m(footballTopTeamsStatisticsItem13.getKilometersCovered(), Integer.valueOf(footballTopTeamsStatisticsItem13.getMatches())).concat(" km");
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getNumberOfSprints();
                    case 27:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem14.getBigChancesMissed()));
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem15 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem15.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem15, footballTopTeamsStatisticsItem15.getNumberOfSprints());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getHitWoodwork();
                }
            }
        });
        final int i19 = 9;
        final int i20 = 10;
        yoj yojVar25 = new yoj("CORNERS_PER_GAME", 24, R.string.football_corners_per_game, new Function1() { // from class: woj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i19) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getSuccessfulDribbles();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem, footballTopTeamsStatisticsItem.getSuccessfulDribbles());
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getTackles();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem2, footballTopTeamsStatisticsItem2.getTackles());
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getInterceptions();
                    case 5:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem3.getBigChances()));
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem4, footballTopTeamsStatisticsItem4.getInterceptions());
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getClearances();
                    case 8:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getClearances());
                    case 9:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getCorners();
                    case 10:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getCorners());
                    case 11:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getGoalsConceded();
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getFouls();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem7, footballTopTeamsStatisticsItem7.getFouls());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getPenaltyGoals();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        Integer penaltyGoals = footballTopTeamsStatisticsItem8.getPenaltyGoals();
                        int intValue = penaltyGoals != null ? penaltyGoals.intValue() : 0;
                        Integer penaltiesTaken = footballTopTeamsStatisticsItem8.getPenaltiesTaken();
                        return penaltiesTaken != null ? fc6.g(intValue, penaltiesTaken.intValue(), "/") : String.valueOf(intValue);
                    case 16:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getBigChancesMissed();
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getPenaltyGoalsConceded();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return rei.i(8, footballTopTeamsStatisticsItem9.getPenaltyGoalsConceded(), footballTopTeamsStatisticsItem9.getPenaltiesCommited(), false);
                    case 19:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getCleanSheets();
                    case 20:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getCleanSheets()));
                    case 21:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTitlesWon();
                    case 22:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem11.getTitlesWon()));
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem12.getGoalsConceded()));
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getKilometersCovered();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return rei.m(footballTopTeamsStatisticsItem13.getKilometersCovered(), Integer.valueOf(footballTopTeamsStatisticsItem13.getMatches())).concat(" km");
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getNumberOfSprints();
                    case 27:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem14.getBigChancesMissed()));
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem15 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem15.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem15, footballTopTeamsStatisticsItem15.getNumberOfSprints());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getHitWoodwork();
                }
            }
        }, new Function1() { // from class: woj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i20) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getSuccessfulDribbles();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem, footballTopTeamsStatisticsItem.getSuccessfulDribbles());
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getTackles();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem2, footballTopTeamsStatisticsItem2.getTackles());
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getInterceptions();
                    case 5:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem3.getBigChances()));
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem4, footballTopTeamsStatisticsItem4.getInterceptions());
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getClearances();
                    case 8:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getClearances());
                    case 9:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getCorners();
                    case 10:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getCorners());
                    case 11:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getGoalsConceded();
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getFouls();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem7, footballTopTeamsStatisticsItem7.getFouls());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getPenaltyGoals();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        Integer penaltyGoals = footballTopTeamsStatisticsItem8.getPenaltyGoals();
                        int intValue = penaltyGoals != null ? penaltyGoals.intValue() : 0;
                        Integer penaltiesTaken = footballTopTeamsStatisticsItem8.getPenaltiesTaken();
                        return penaltiesTaken != null ? fc6.g(intValue, penaltiesTaken.intValue(), "/") : String.valueOf(intValue);
                    case 16:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getBigChancesMissed();
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getPenaltyGoalsConceded();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return rei.i(8, footballTopTeamsStatisticsItem9.getPenaltyGoalsConceded(), footballTopTeamsStatisticsItem9.getPenaltiesCommited(), false);
                    case 19:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getCleanSheets();
                    case 20:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getCleanSheets()));
                    case 21:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTitlesWon();
                    case 22:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem11.getTitlesWon()));
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem12.getGoalsConceded()));
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getKilometersCovered();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return rei.m(footballTopTeamsStatisticsItem13.getKilometersCovered(), Integer.valueOf(footballTopTeamsStatisticsItem13.getMatches())).concat(" km");
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getNumberOfSprints();
                    case 27:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem14.getBigChancesMissed()));
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem15 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem15.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem15, footballTopTeamsStatisticsItem15.getNumberOfSprints());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getHitWoodwork();
                }
            }
        });
        final int i21 = 12;
        final int i22 = 13;
        yoj yojVar26 = new yoj("FOULS_PER_GAME", 25, R.string.football_fouls_per_game, new Function1() { // from class: woj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i21) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getSuccessfulDribbles();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem, footballTopTeamsStatisticsItem.getSuccessfulDribbles());
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getTackles();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem2, footballTopTeamsStatisticsItem2.getTackles());
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getInterceptions();
                    case 5:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem3.getBigChances()));
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem4, footballTopTeamsStatisticsItem4.getInterceptions());
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getClearances();
                    case 8:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getClearances());
                    case 9:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getCorners();
                    case 10:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getCorners());
                    case 11:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getGoalsConceded();
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getFouls();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem7, footballTopTeamsStatisticsItem7.getFouls());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getPenaltyGoals();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        Integer penaltyGoals = footballTopTeamsStatisticsItem8.getPenaltyGoals();
                        int intValue = penaltyGoals != null ? penaltyGoals.intValue() : 0;
                        Integer penaltiesTaken = footballTopTeamsStatisticsItem8.getPenaltiesTaken();
                        return penaltiesTaken != null ? fc6.g(intValue, penaltiesTaken.intValue(), "/") : String.valueOf(intValue);
                    case 16:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getBigChancesMissed();
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getPenaltyGoalsConceded();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return rei.i(8, footballTopTeamsStatisticsItem9.getPenaltyGoalsConceded(), footballTopTeamsStatisticsItem9.getPenaltiesCommited(), false);
                    case 19:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getCleanSheets();
                    case 20:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getCleanSheets()));
                    case 21:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTitlesWon();
                    case 22:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem11.getTitlesWon()));
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem12.getGoalsConceded()));
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getKilometersCovered();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return rei.m(footballTopTeamsStatisticsItem13.getKilometersCovered(), Integer.valueOf(footballTopTeamsStatisticsItem13.getMatches())).concat(" km");
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getNumberOfSprints();
                    case 27:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem14.getBigChancesMissed()));
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem15 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem15.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem15, footballTopTeamsStatisticsItem15.getNumberOfSprints());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getHitWoodwork();
                }
            }
        }, new Function1() { // from class: woj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i22) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getSuccessfulDribbles();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem, footballTopTeamsStatisticsItem.getSuccessfulDribbles());
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getTackles();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem2, footballTopTeamsStatisticsItem2.getTackles());
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getInterceptions();
                    case 5:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem3.getBigChances()));
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem4, footballTopTeamsStatisticsItem4.getInterceptions());
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getClearances();
                    case 8:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getClearances());
                    case 9:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getCorners();
                    case 10:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getCorners());
                    case 11:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getGoalsConceded();
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getFouls();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem7, footballTopTeamsStatisticsItem7.getFouls());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getPenaltyGoals();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        Integer penaltyGoals = footballTopTeamsStatisticsItem8.getPenaltyGoals();
                        int intValue = penaltyGoals != null ? penaltyGoals.intValue() : 0;
                        Integer penaltiesTaken = footballTopTeamsStatisticsItem8.getPenaltiesTaken();
                        return penaltiesTaken != null ? fc6.g(intValue, penaltiesTaken.intValue(), "/") : String.valueOf(intValue);
                    case 16:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getBigChancesMissed();
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getPenaltyGoalsConceded();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return rei.i(8, footballTopTeamsStatisticsItem9.getPenaltyGoalsConceded(), footballTopTeamsStatisticsItem9.getPenaltiesCommited(), false);
                    case 19:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getCleanSheets();
                    case 20:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getCleanSheets()));
                    case 21:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTitlesWon();
                    case 22:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem11.getTitlesWon()));
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem12.getGoalsConceded()));
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getKilometersCovered();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return rei.m(footballTopTeamsStatisticsItem13.getKilometersCovered(), Integer.valueOf(footballTopTeamsStatisticsItem13.getMatches())).concat(" km");
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getNumberOfSprints();
                    case 27:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem14.getBigChancesMissed()));
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem15 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem15.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem15, footballTopTeamsStatisticsItem15.getNumberOfSprints());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getHitWoodwork();
                }
            }
        });
        final int i23 = 14;
        final int i24 = 15;
        yoj yojVar27 = new yoj("PENALTY_GOALS", 26, R.string.football_penalty_goals, new Function1() { // from class: woj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i23) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getSuccessfulDribbles();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem, footballTopTeamsStatisticsItem.getSuccessfulDribbles());
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getTackles();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem2, footballTopTeamsStatisticsItem2.getTackles());
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getInterceptions();
                    case 5:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem3.getBigChances()));
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem4, footballTopTeamsStatisticsItem4.getInterceptions());
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getClearances();
                    case 8:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getClearances());
                    case 9:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getCorners();
                    case 10:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getCorners());
                    case 11:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getGoalsConceded();
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getFouls();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem7, footballTopTeamsStatisticsItem7.getFouls());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getPenaltyGoals();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        Integer penaltyGoals = footballTopTeamsStatisticsItem8.getPenaltyGoals();
                        int intValue = penaltyGoals != null ? penaltyGoals.intValue() : 0;
                        Integer penaltiesTaken = footballTopTeamsStatisticsItem8.getPenaltiesTaken();
                        return penaltiesTaken != null ? fc6.g(intValue, penaltiesTaken.intValue(), "/") : String.valueOf(intValue);
                    case 16:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getBigChancesMissed();
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getPenaltyGoalsConceded();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return rei.i(8, footballTopTeamsStatisticsItem9.getPenaltyGoalsConceded(), footballTopTeamsStatisticsItem9.getPenaltiesCommited(), false);
                    case 19:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getCleanSheets();
                    case 20:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getCleanSheets()));
                    case 21:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTitlesWon();
                    case 22:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem11.getTitlesWon()));
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem12.getGoalsConceded()));
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getKilometersCovered();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return rei.m(footballTopTeamsStatisticsItem13.getKilometersCovered(), Integer.valueOf(footballTopTeamsStatisticsItem13.getMatches())).concat(" km");
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getNumberOfSprints();
                    case 27:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem14.getBigChancesMissed()));
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem15 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem15.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem15, footballTopTeamsStatisticsItem15.getNumberOfSprints());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getHitWoodwork();
                }
            }
        }, new Function1() { // from class: woj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i24) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getSuccessfulDribbles();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem, footballTopTeamsStatisticsItem.getSuccessfulDribbles());
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getTackles();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem2, footballTopTeamsStatisticsItem2.getTackles());
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getInterceptions();
                    case 5:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem3.getBigChances()));
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem4, footballTopTeamsStatisticsItem4.getInterceptions());
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getClearances();
                    case 8:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getClearances());
                    case 9:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getCorners();
                    case 10:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getCorners());
                    case 11:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getGoalsConceded();
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getFouls();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem7, footballTopTeamsStatisticsItem7.getFouls());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getPenaltyGoals();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        Integer penaltyGoals = footballTopTeamsStatisticsItem8.getPenaltyGoals();
                        int intValue = penaltyGoals != null ? penaltyGoals.intValue() : 0;
                        Integer penaltiesTaken = footballTopTeamsStatisticsItem8.getPenaltiesTaken();
                        return penaltiesTaken != null ? fc6.g(intValue, penaltiesTaken.intValue(), "/") : String.valueOf(intValue);
                    case 16:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getBigChancesMissed();
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getPenaltyGoalsConceded();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return rei.i(8, footballTopTeamsStatisticsItem9.getPenaltyGoalsConceded(), footballTopTeamsStatisticsItem9.getPenaltiesCommited(), false);
                    case 19:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getCleanSheets();
                    case 20:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getCleanSheets()));
                    case 21:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTitlesWon();
                    case 22:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem11.getTitlesWon()));
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem12.getGoalsConceded()));
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getKilometersCovered();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return rei.m(footballTopTeamsStatisticsItem13.getKilometersCovered(), Integer.valueOf(footballTopTeamsStatisticsItem13.getMatches())).concat(" km");
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getNumberOfSprints();
                    case 27:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem14.getBigChancesMissed()));
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem15 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem15.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem15, footballTopTeamsStatisticsItem15.getNumberOfSprints());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getHitWoodwork();
                }
            }
        });
        final int i25 = 17;
        final int i26 = 18;
        yoj yojVar28 = new yoj("PENALTIES_CONCEDED", 27, R.string.football_penalties_conceded, new Function1() { // from class: woj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i25) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getSuccessfulDribbles();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem, footballTopTeamsStatisticsItem.getSuccessfulDribbles());
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getTackles();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem2, footballTopTeamsStatisticsItem2.getTackles());
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getInterceptions();
                    case 5:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem3.getBigChances()));
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem4, footballTopTeamsStatisticsItem4.getInterceptions());
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getClearances();
                    case 8:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getClearances());
                    case 9:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getCorners();
                    case 10:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getCorners());
                    case 11:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getGoalsConceded();
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getFouls();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem7, footballTopTeamsStatisticsItem7.getFouls());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getPenaltyGoals();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        Integer penaltyGoals = footballTopTeamsStatisticsItem8.getPenaltyGoals();
                        int intValue = penaltyGoals != null ? penaltyGoals.intValue() : 0;
                        Integer penaltiesTaken = footballTopTeamsStatisticsItem8.getPenaltiesTaken();
                        return penaltiesTaken != null ? fc6.g(intValue, penaltiesTaken.intValue(), "/") : String.valueOf(intValue);
                    case 16:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getBigChancesMissed();
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getPenaltyGoalsConceded();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return rei.i(8, footballTopTeamsStatisticsItem9.getPenaltyGoalsConceded(), footballTopTeamsStatisticsItem9.getPenaltiesCommited(), false);
                    case 19:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getCleanSheets();
                    case 20:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getCleanSheets()));
                    case 21:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTitlesWon();
                    case 22:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem11.getTitlesWon()));
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem12.getGoalsConceded()));
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getKilometersCovered();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return rei.m(footballTopTeamsStatisticsItem13.getKilometersCovered(), Integer.valueOf(footballTopTeamsStatisticsItem13.getMatches())).concat(" km");
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getNumberOfSprints();
                    case 27:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem14.getBigChancesMissed()));
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem15 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem15.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem15, footballTopTeamsStatisticsItem15.getNumberOfSprints());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getHitWoodwork();
                }
            }
        }, new Function1() { // from class: woj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i26) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getSuccessfulDribbles();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem, footballTopTeamsStatisticsItem.getSuccessfulDribbles());
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getTackles();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem2, footballTopTeamsStatisticsItem2.getTackles());
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getInterceptions();
                    case 5:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem3.getBigChances()));
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem4, footballTopTeamsStatisticsItem4.getInterceptions());
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getClearances();
                    case 8:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getClearances());
                    case 9:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getCorners();
                    case 10:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getCorners());
                    case 11:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getGoalsConceded();
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getFouls();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem7, footballTopTeamsStatisticsItem7.getFouls());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getPenaltyGoals();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        Integer penaltyGoals = footballTopTeamsStatisticsItem8.getPenaltyGoals();
                        int intValue = penaltyGoals != null ? penaltyGoals.intValue() : 0;
                        Integer penaltiesTaken = footballTopTeamsStatisticsItem8.getPenaltiesTaken();
                        return penaltiesTaken != null ? fc6.g(intValue, penaltiesTaken.intValue(), "/") : String.valueOf(intValue);
                    case 16:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getBigChancesMissed();
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getPenaltyGoalsConceded();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return rei.i(8, footballTopTeamsStatisticsItem9.getPenaltyGoalsConceded(), footballTopTeamsStatisticsItem9.getPenaltiesCommited(), false);
                    case 19:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getCleanSheets();
                    case 20:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getCleanSheets()));
                    case 21:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTitlesWon();
                    case 22:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem11.getTitlesWon()));
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem12.getGoalsConceded()));
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getKilometersCovered();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return rei.m(footballTopTeamsStatisticsItem13.getKilometersCovered(), Integer.valueOf(footballTopTeamsStatisticsItem13.getMatches())).concat(" km");
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getNumberOfSprints();
                    case 27:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem14.getBigChancesMissed()));
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem15 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem15.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem15, footballTopTeamsStatisticsItem15.getNumberOfSprints());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getHitWoodwork();
                }
            }
        });
        final int i27 = 19;
        final int i28 = 20;
        yoj yojVar29 = new yoj("CLEAN_SHEETS", 28, R.string.football_clean_sheets, new Function1() { // from class: woj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i27) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getSuccessfulDribbles();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem, footballTopTeamsStatisticsItem.getSuccessfulDribbles());
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getTackles();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem2, footballTopTeamsStatisticsItem2.getTackles());
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getInterceptions();
                    case 5:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem3.getBigChances()));
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem4, footballTopTeamsStatisticsItem4.getInterceptions());
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getClearances();
                    case 8:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getClearances());
                    case 9:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getCorners();
                    case 10:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getCorners());
                    case 11:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getGoalsConceded();
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getFouls();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem7, footballTopTeamsStatisticsItem7.getFouls());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getPenaltyGoals();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        Integer penaltyGoals = footballTopTeamsStatisticsItem8.getPenaltyGoals();
                        int intValue = penaltyGoals != null ? penaltyGoals.intValue() : 0;
                        Integer penaltiesTaken = footballTopTeamsStatisticsItem8.getPenaltiesTaken();
                        return penaltiesTaken != null ? fc6.g(intValue, penaltiesTaken.intValue(), "/") : String.valueOf(intValue);
                    case 16:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getBigChancesMissed();
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getPenaltyGoalsConceded();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return rei.i(8, footballTopTeamsStatisticsItem9.getPenaltyGoalsConceded(), footballTopTeamsStatisticsItem9.getPenaltiesCommited(), false);
                    case 19:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getCleanSheets();
                    case 20:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getCleanSheets()));
                    case 21:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTitlesWon();
                    case 22:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem11.getTitlesWon()));
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem12.getGoalsConceded()));
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getKilometersCovered();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return rei.m(footballTopTeamsStatisticsItem13.getKilometersCovered(), Integer.valueOf(footballTopTeamsStatisticsItem13.getMatches())).concat(" km");
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getNumberOfSprints();
                    case 27:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem14.getBigChancesMissed()));
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem15 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem15.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem15, footballTopTeamsStatisticsItem15.getNumberOfSprints());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getHitWoodwork();
                }
            }
        }, new Function1() { // from class: woj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i28) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getSuccessfulDribbles();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem, footballTopTeamsStatisticsItem.getSuccessfulDribbles());
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getTackles();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem2, footballTopTeamsStatisticsItem2.getTackles());
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getInterceptions();
                    case 5:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem3.getBigChances()));
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem4, footballTopTeamsStatisticsItem4.getInterceptions());
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getClearances();
                    case 8:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getClearances());
                    case 9:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getCorners();
                    case 10:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getCorners());
                    case 11:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getGoalsConceded();
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getFouls();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem7, footballTopTeamsStatisticsItem7.getFouls());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getPenaltyGoals();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        Integer penaltyGoals = footballTopTeamsStatisticsItem8.getPenaltyGoals();
                        int intValue = penaltyGoals != null ? penaltyGoals.intValue() : 0;
                        Integer penaltiesTaken = footballTopTeamsStatisticsItem8.getPenaltiesTaken();
                        return penaltiesTaken != null ? fc6.g(intValue, penaltiesTaken.intValue(), "/") : String.valueOf(intValue);
                    case 16:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getBigChancesMissed();
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getPenaltyGoalsConceded();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return rei.i(8, footballTopTeamsStatisticsItem9.getPenaltyGoalsConceded(), footballTopTeamsStatisticsItem9.getPenaltiesCommited(), false);
                    case 19:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getCleanSheets();
                    case 20:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getCleanSheets()));
                    case 21:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTitlesWon();
                    case 22:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem11.getTitlesWon()));
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem12.getGoalsConceded()));
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getKilometersCovered();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return rei.m(footballTopTeamsStatisticsItem13.getKilometersCovered(), Integer.valueOf(footballTopTeamsStatisticsItem13.getMatches())).concat(" km");
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getNumberOfSprints();
                    case 27:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem14.getBigChancesMissed()));
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem15 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem15.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem15, footballTopTeamsStatisticsItem15.getNumberOfSprints());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getHitWoodwork();
                }
            }
        });
        final int i29 = 21;
        final int i30 = 22;
        yoj[] yojVarArr = {yojVar, yojVar2, yojVar3, yojVar4, yojVar5, yojVar6, yojVar7, yojVar8, yojVar9, yojVar10, yojVar11, yojVar12, yojVar13, yojVar14, yojVar15, yojVar16, yojVar17, yojVar18, yojVar19, yojVar20, yojVar21, yojVar22, yojVar23, yojVar24, yojVar25, yojVar26, yojVar27, yojVar28, yojVar29, new yoj("TITLES_WON", 29, R.string.football_titles, new Function1() { // from class: woj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i29) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getSuccessfulDribbles();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem, footballTopTeamsStatisticsItem.getSuccessfulDribbles());
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getTackles();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem2, footballTopTeamsStatisticsItem2.getTackles());
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getInterceptions();
                    case 5:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem3.getBigChances()));
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem4, footballTopTeamsStatisticsItem4.getInterceptions());
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getClearances();
                    case 8:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getClearances());
                    case 9:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getCorners();
                    case 10:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getCorners());
                    case 11:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getGoalsConceded();
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getFouls();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem7, footballTopTeamsStatisticsItem7.getFouls());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getPenaltyGoals();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        Integer penaltyGoals = footballTopTeamsStatisticsItem8.getPenaltyGoals();
                        int intValue = penaltyGoals != null ? penaltyGoals.intValue() : 0;
                        Integer penaltiesTaken = footballTopTeamsStatisticsItem8.getPenaltiesTaken();
                        return penaltiesTaken != null ? fc6.g(intValue, penaltiesTaken.intValue(), "/") : String.valueOf(intValue);
                    case 16:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getBigChancesMissed();
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getPenaltyGoalsConceded();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return rei.i(8, footballTopTeamsStatisticsItem9.getPenaltyGoalsConceded(), footballTopTeamsStatisticsItem9.getPenaltiesCommited(), false);
                    case 19:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getCleanSheets();
                    case 20:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getCleanSheets()));
                    case 21:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTitlesWon();
                    case 22:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem11.getTitlesWon()));
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem12.getGoalsConceded()));
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getKilometersCovered();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return rei.m(footballTopTeamsStatisticsItem13.getKilometersCovered(), Integer.valueOf(footballTopTeamsStatisticsItem13.getMatches())).concat(" km");
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getNumberOfSprints();
                    case 27:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem14.getBigChancesMissed()));
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem15 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem15.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem15, footballTopTeamsStatisticsItem15.getNumberOfSprints());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getHitWoodwork();
                }
            }
        }, new Function1() { // from class: woj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i30) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getSuccessfulDribbles();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem, footballTopTeamsStatisticsItem.getSuccessfulDribbles());
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getTackles();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem2, footballTopTeamsStatisticsItem2.getTackles());
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getInterceptions();
                    case 5:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem3.getBigChances()));
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem4, footballTopTeamsStatisticsItem4.getInterceptions());
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getClearances();
                    case 8:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getClearances());
                    case 9:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getCorners();
                    case 10:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getCorners());
                    case 11:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getGoalsConceded();
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getFouls();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem7, footballTopTeamsStatisticsItem7.getFouls());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getPenaltyGoals();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        Integer penaltyGoals = footballTopTeamsStatisticsItem8.getPenaltyGoals();
                        int intValue = penaltyGoals != null ? penaltyGoals.intValue() : 0;
                        Integer penaltiesTaken = footballTopTeamsStatisticsItem8.getPenaltiesTaken();
                        return penaltiesTaken != null ? fc6.g(intValue, penaltiesTaken.intValue(), "/") : String.valueOf(intValue);
                    case 16:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getBigChancesMissed();
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getPenaltyGoalsConceded();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return rei.i(8, footballTopTeamsStatisticsItem9.getPenaltyGoalsConceded(), footballTopTeamsStatisticsItem9.getPenaltiesCommited(), false);
                    case 19:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getCleanSheets();
                    case 20:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getCleanSheets()));
                    case 21:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTitlesWon();
                    case 22:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem11.getTitlesWon()));
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem12.getGoalsConceded()));
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getKilometersCovered();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return rei.m(footballTopTeamsStatisticsItem13.getKilometersCovered(), Integer.valueOf(footballTopTeamsStatisticsItem13.getMatches())).concat(" km");
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getNumberOfSprints();
                    case 27:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem14.getBigChancesMissed()));
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem15 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem15.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem15, footballTopTeamsStatisticsItem15.getNumberOfSprints());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getHitWoodwork();
                }
            }
        })};
        d = yojVarArr;
        e = new kp5(yojVarArr);
    }

    public yoj(String str, int i, int i2, Function1 function1, Function1 function12) {
        this.a = i2;
        this.b = function1;
        this.c = function12;
    }

    public static yoj valueOf(String str) {
        return (yoj) Enum.valueOf(yoj.class, str);
    }

    public static yoj[] values() {
        return (yoj[]) d.clone();
    }

    @Override // defpackage.ipj
    public final /* bridge */ String a(Object obj) {
        return super.a((FootballTopTeamsStatisticsItem) obj);
    }

    @Override // defpackage.ipj
    public final /* bridge */ List b(Object obj) {
        return super.b((FootballTopTeamsStatistics) obj);
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
