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
public final class rpj implements cqj {
    public static final /* synthetic */ rpj[] e;
    public static final /* synthetic */ kp5 f;
    public final int a;
    public final Function1 b;
    public final Function1 c;
    public final boolean d;

    static {
        rpj rpjVar = new rpj(0, R.string.average_sofascore_rating, NativeAdContent.ViewTag.RATING, new npj(23), new npj(25), false);
        final int i = 7;
        Function1 function1 = new Function1() { // from class: ppj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getYellowCards();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem.getYellowCards()));
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getRedCards();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem2.getRedCards()));
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getBigChances();
                    case 5:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getAverageBallPossession();
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return rei.e(footballTopTeamsStatisticsItem3.getAverageBallPossession(), 1, 4);
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getGoalsScored();
                    case 8:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getAccuratePasses();
                    case 9:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return String.valueOf(wzb.a((footballTopTeamsStatisticsItem4.getAccuratePasses() != null ? r2.intValue() : 0) / footballTopTeamsStatisticsItem4.getMatches()));
                    case 10:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getAccurateLongBalls();
                    case 11:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getAccurateLongBalls());
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getAccurateCrosses();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getAccurateCrosses());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getShots();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem7.getBigChances()));
                    case 16:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem8, footballTopTeamsStatisticsItem8.getShots());
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getShotsOnTarget();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem9, footballTopTeamsStatisticsItem9.getShotsOnTarget());
                    case 19:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getGoalsScored()));
                    case 20:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getSuccessfulDribbles();
                    case 21:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem11, footballTopTeamsStatisticsItem11.getSuccessfulDribbles());
                    case 22:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTackles();
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem12, footballTopTeamsStatisticsItem12.getTackles());
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getInterceptions();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem13, footballTopTeamsStatisticsItem13.getInterceptions());
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getBigChancesMissed();
                    case 27:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getClearances();
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem14, footballTopTeamsStatisticsItem14.getClearances());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics16 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics16.getClass();
                        return footballTopTeamsStatistics16.getCorners();
                }
            }
        };
        final int i2 = 19;
        rpj rpjVar2 = new rpj(1, R.string.football_goals_scored, "GOALS_SCORED", function1, new Function1() { // from class: ppj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i2) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getYellowCards();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem.getYellowCards()));
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getRedCards();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem2.getRedCards()));
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getBigChances();
                    case 5:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getAverageBallPossession();
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return rei.e(footballTopTeamsStatisticsItem3.getAverageBallPossession(), 1, 4);
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getGoalsScored();
                    case 8:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getAccuratePasses();
                    case 9:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return String.valueOf(wzb.a((footballTopTeamsStatisticsItem4.getAccuratePasses() != null ? r2.intValue() : 0) / footballTopTeamsStatisticsItem4.getMatches()));
                    case 10:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getAccurateLongBalls();
                    case 11:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getAccurateLongBalls());
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getAccurateCrosses();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getAccurateCrosses());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getShots();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem7.getBigChances()));
                    case 16:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem8, footballTopTeamsStatisticsItem8.getShots());
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getShotsOnTarget();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem9, footballTopTeamsStatisticsItem9.getShotsOnTarget());
                    case 19:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getGoalsScored()));
                    case 20:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getSuccessfulDribbles();
                    case 21:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem11, footballTopTeamsStatisticsItem11.getSuccessfulDribbles());
                    case 22:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTackles();
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem12, footballTopTeamsStatisticsItem12.getTackles());
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getInterceptions();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem13, footballTopTeamsStatisticsItem13.getInterceptions());
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getBigChancesMissed();
                    case 27:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getClearances();
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem14, footballTopTeamsStatisticsItem14.getClearances());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics16 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics16.getClass();
                        return footballTopTeamsStatistics16.getCorners();
                }
            }
        }, false);
        rpj rpjVar3 = new rpj(2, R.string.football_goals_conceded, "GOALS_CONCEDED", new qpj(1), new qpj(13), false);
        rpj rpjVar4 = new rpj(3, R.string.football_running_distance_covered_per_match, "DISTANCE", new qpj(14), new qpj(15), false);
        rpj rpjVar5 = new rpj(4, R.string.football_running_number_of_sprints_per_match, "NUMBER_OF_SPRINTS", new qpj(16), new qpj(17), false);
        final int i3 = 4;
        Function1 function12 = new Function1() { // from class: ppj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i3) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getYellowCards();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem.getYellowCards()));
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getRedCards();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem2.getRedCards()));
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getBigChances();
                    case 5:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getAverageBallPossession();
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return rei.e(footballTopTeamsStatisticsItem3.getAverageBallPossession(), 1, 4);
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getGoalsScored();
                    case 8:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getAccuratePasses();
                    case 9:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return String.valueOf(wzb.a((footballTopTeamsStatisticsItem4.getAccuratePasses() != null ? r2.intValue() : 0) / footballTopTeamsStatisticsItem4.getMatches()));
                    case 10:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getAccurateLongBalls();
                    case 11:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getAccurateLongBalls());
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getAccurateCrosses();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getAccurateCrosses());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getShots();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem7.getBigChances()));
                    case 16:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem8, footballTopTeamsStatisticsItem8.getShots());
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getShotsOnTarget();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem9, footballTopTeamsStatisticsItem9.getShotsOnTarget());
                    case 19:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getGoalsScored()));
                    case 20:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getSuccessfulDribbles();
                    case 21:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem11, footballTopTeamsStatisticsItem11.getSuccessfulDribbles());
                    case 22:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTackles();
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem12, footballTopTeamsStatisticsItem12.getTackles());
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getInterceptions();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem13, footballTopTeamsStatisticsItem13.getInterceptions());
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getBigChancesMissed();
                    case 27:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getClearances();
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem14, footballTopTeamsStatisticsItem14.getClearances());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics16 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics16.getClass();
                        return footballTopTeamsStatistics16.getCorners();
                }
            }
        };
        final int i4 = 15;
        rpj rpjVar6 = new rpj(5, R.string.football_big_chances, "BIG_CHANCES", function12, new Function1() { // from class: ppj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i4) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getYellowCards();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem.getYellowCards()));
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getRedCards();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem2.getRedCards()));
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getBigChances();
                    case 5:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getAverageBallPossession();
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return rei.e(footballTopTeamsStatisticsItem3.getAverageBallPossession(), 1, 4);
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getGoalsScored();
                    case 8:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getAccuratePasses();
                    case 9:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return String.valueOf(wzb.a((footballTopTeamsStatisticsItem4.getAccuratePasses() != null ? r2.intValue() : 0) / footballTopTeamsStatisticsItem4.getMatches()));
                    case 10:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getAccurateLongBalls();
                    case 11:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getAccurateLongBalls());
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getAccurateCrosses();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getAccurateCrosses());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getShots();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem7.getBigChances()));
                    case 16:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem8, footballTopTeamsStatisticsItem8.getShots());
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getShotsOnTarget();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem9, footballTopTeamsStatisticsItem9.getShotsOnTarget());
                    case 19:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getGoalsScored()));
                    case 20:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getSuccessfulDribbles();
                    case 21:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem11, footballTopTeamsStatisticsItem11.getSuccessfulDribbles());
                    case 22:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTackles();
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem12, footballTopTeamsStatisticsItem12.getTackles());
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getInterceptions();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem13, footballTopTeamsStatisticsItem13.getInterceptions());
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getBigChancesMissed();
                    case 27:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getClearances();
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem14, footballTopTeamsStatisticsItem14.getClearances());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics16 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics16.getClass();
                        return footballTopTeamsStatistics16.getCorners();
                }
            }
        }, false);
        final int i5 = 26;
        rpj rpjVar7 = new rpj(6, R.string.football_big_chances_missed, "BIG_CHANCES_MISSED", new Function1() { // from class: ppj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i5) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getYellowCards();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem.getYellowCards()));
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getRedCards();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem2.getRedCards()));
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getBigChances();
                    case 5:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getAverageBallPossession();
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return rei.e(footballTopTeamsStatisticsItem3.getAverageBallPossession(), 1, 4);
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getGoalsScored();
                    case 8:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getAccuratePasses();
                    case 9:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return String.valueOf(wzb.a((footballTopTeamsStatisticsItem4.getAccuratePasses() != null ? r2.intValue() : 0) / footballTopTeamsStatisticsItem4.getMatches()));
                    case 10:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getAccurateLongBalls();
                    case 11:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getAccurateLongBalls());
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getAccurateCrosses();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getAccurateCrosses());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getShots();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem7.getBigChances()));
                    case 16:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem8, footballTopTeamsStatisticsItem8.getShots());
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getShotsOnTarget();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem9, footballTopTeamsStatisticsItem9.getShotsOnTarget());
                    case 19:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getGoalsScored()));
                    case 20:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getSuccessfulDribbles();
                    case 21:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem11, footballTopTeamsStatisticsItem11.getSuccessfulDribbles());
                    case 22:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTackles();
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem12, footballTopTeamsStatisticsItem12.getTackles());
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getInterceptions();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem13, footballTopTeamsStatisticsItem13.getInterceptions());
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getBigChancesMissed();
                    case 27:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getClearances();
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem14, footballTopTeamsStatisticsItem14.getClearances());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics16 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics16.getClass();
                        return footballTopTeamsStatistics16.getCorners();
                }
            }
        }, new qpj(7), false);
        rpj rpjVar8 = new rpj(7, R.string.football_hit_woodwork, "HIT_WOODWORK", new qpj(18), new qpj(19), false);
        rpj rpjVar9 = new rpj(8, R.string.football_expected_goals, "EXPECTED_GOALS", new qpj(20), new qpj(21), false);
        rpj rpjVar10 = new rpj(9, R.string.football_expected_goals_on_target, "EXPECTED_GOALS_ON_TARGET", new qpj(22), new npj(24), false);
        rpj rpjVar11 = new rpj(10, R.string.football_expected_assists, "EXPECTED_ASSISTS", new npj(26), new npj(27), false);
        rpj rpjVar12 = new rpj(11, R.string.football_goals_prevented, "GOALS_PREVENTED", new npj(28), new npj(29), false);
        final int i6 = 0;
        final int i7 = 1;
        rpj rpjVar13 = new rpj(12, R.string.football_yellow_cards, "YELLOW_CARDS", new Function1() { // from class: ppj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i6) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getYellowCards();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem.getYellowCards()));
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getRedCards();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem2.getRedCards()));
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getBigChances();
                    case 5:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getAverageBallPossession();
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return rei.e(footballTopTeamsStatisticsItem3.getAverageBallPossession(), 1, 4);
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getGoalsScored();
                    case 8:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getAccuratePasses();
                    case 9:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return String.valueOf(wzb.a((footballTopTeamsStatisticsItem4.getAccuratePasses() != null ? r2.intValue() : 0) / footballTopTeamsStatisticsItem4.getMatches()));
                    case 10:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getAccurateLongBalls();
                    case 11:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getAccurateLongBalls());
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getAccurateCrosses();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getAccurateCrosses());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getShots();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem7.getBigChances()));
                    case 16:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem8, footballTopTeamsStatisticsItem8.getShots());
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getShotsOnTarget();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem9, footballTopTeamsStatisticsItem9.getShotsOnTarget());
                    case 19:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getGoalsScored()));
                    case 20:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getSuccessfulDribbles();
                    case 21:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem11, footballTopTeamsStatisticsItem11.getSuccessfulDribbles());
                    case 22:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTackles();
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem12, footballTopTeamsStatisticsItem12.getTackles());
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getInterceptions();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem13, footballTopTeamsStatisticsItem13.getInterceptions());
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getBigChancesMissed();
                    case 27:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getClearances();
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem14, footballTopTeamsStatisticsItem14.getClearances());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics16 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics16.getClass();
                        return footballTopTeamsStatistics16.getCorners();
                }
            }
        }, new Function1() { // from class: ppj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i7) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getYellowCards();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem.getYellowCards()));
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getRedCards();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem2.getRedCards()));
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getBigChances();
                    case 5:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getAverageBallPossession();
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return rei.e(footballTopTeamsStatisticsItem3.getAverageBallPossession(), 1, 4);
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getGoalsScored();
                    case 8:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getAccuratePasses();
                    case 9:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return String.valueOf(wzb.a((footballTopTeamsStatisticsItem4.getAccuratePasses() != null ? r2.intValue() : 0) / footballTopTeamsStatisticsItem4.getMatches()));
                    case 10:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getAccurateLongBalls();
                    case 11:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getAccurateLongBalls());
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getAccurateCrosses();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getAccurateCrosses());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getShots();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem7.getBigChances()));
                    case 16:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem8, footballTopTeamsStatisticsItem8.getShots());
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getShotsOnTarget();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem9, footballTopTeamsStatisticsItem9.getShotsOnTarget());
                    case 19:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getGoalsScored()));
                    case 20:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getSuccessfulDribbles();
                    case 21:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem11, footballTopTeamsStatisticsItem11.getSuccessfulDribbles());
                    case 22:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTackles();
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem12, footballTopTeamsStatisticsItem12.getTackles());
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getInterceptions();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem13, footballTopTeamsStatisticsItem13.getInterceptions());
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getBigChancesMissed();
                    case 27:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getClearances();
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem14, footballTopTeamsStatisticsItem14.getClearances());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics16 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics16.getClass();
                        return footballTopTeamsStatistics16.getCorners();
                }
            }
        }, false);
        final int i8 = 2;
        final int i9 = 3;
        rpj rpjVar14 = new rpj(13, R.string.football_red_cards, "RED_CARDS", new Function1() { // from class: ppj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i8) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getYellowCards();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem.getYellowCards()));
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getRedCards();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem2.getRedCards()));
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getBigChances();
                    case 5:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getAverageBallPossession();
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return rei.e(footballTopTeamsStatisticsItem3.getAverageBallPossession(), 1, 4);
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getGoalsScored();
                    case 8:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getAccuratePasses();
                    case 9:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return String.valueOf(wzb.a((footballTopTeamsStatisticsItem4.getAccuratePasses() != null ? r2.intValue() : 0) / footballTopTeamsStatisticsItem4.getMatches()));
                    case 10:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getAccurateLongBalls();
                    case 11:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getAccurateLongBalls());
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getAccurateCrosses();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getAccurateCrosses());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getShots();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem7.getBigChances()));
                    case 16:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem8, footballTopTeamsStatisticsItem8.getShots());
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getShotsOnTarget();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem9, footballTopTeamsStatisticsItem9.getShotsOnTarget());
                    case 19:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getGoalsScored()));
                    case 20:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getSuccessfulDribbles();
                    case 21:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem11, footballTopTeamsStatisticsItem11.getSuccessfulDribbles());
                    case 22:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTackles();
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem12, footballTopTeamsStatisticsItem12.getTackles());
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getInterceptions();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem13, footballTopTeamsStatisticsItem13.getInterceptions());
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getBigChancesMissed();
                    case 27:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getClearances();
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem14, footballTopTeamsStatisticsItem14.getClearances());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics16 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics16.getClass();
                        return footballTopTeamsStatistics16.getCorners();
                }
            }
        }, new Function1() { // from class: ppj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i9) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getYellowCards();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem.getYellowCards()));
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getRedCards();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem2.getRedCards()));
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getBigChances();
                    case 5:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getAverageBallPossession();
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return rei.e(footballTopTeamsStatisticsItem3.getAverageBallPossession(), 1, 4);
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getGoalsScored();
                    case 8:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getAccuratePasses();
                    case 9:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return String.valueOf(wzb.a((footballTopTeamsStatisticsItem4.getAccuratePasses() != null ? r2.intValue() : 0) / footballTopTeamsStatisticsItem4.getMatches()));
                    case 10:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getAccurateLongBalls();
                    case 11:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getAccurateLongBalls());
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getAccurateCrosses();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getAccurateCrosses());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getShots();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem7.getBigChances()));
                    case 16:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem8, footballTopTeamsStatisticsItem8.getShots());
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getShotsOnTarget();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem9, footballTopTeamsStatisticsItem9.getShotsOnTarget());
                    case 19:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getGoalsScored()));
                    case 20:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getSuccessfulDribbles();
                    case 21:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem11, footballTopTeamsStatisticsItem11.getSuccessfulDribbles());
                    case 22:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTackles();
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem12, footballTopTeamsStatisticsItem12.getTackles());
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getInterceptions();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem13, footballTopTeamsStatisticsItem13.getInterceptions());
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getBigChancesMissed();
                    case 27:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getClearances();
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem14, footballTopTeamsStatisticsItem14.getClearances());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics16 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics16.getClass();
                        return footballTopTeamsStatistics16.getCorners();
                }
            }
        }, false);
        final int i10 = 5;
        final int i11 = 6;
        rpj rpjVar15 = new rpj(14, R.string.football_ball_possession, "BALL_POSSESSION", new Function1() { // from class: ppj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i10) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getYellowCards();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem.getYellowCards()));
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getRedCards();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem2.getRedCards()));
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getBigChances();
                    case 5:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getAverageBallPossession();
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return rei.e(footballTopTeamsStatisticsItem3.getAverageBallPossession(), 1, 4);
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getGoalsScored();
                    case 8:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getAccuratePasses();
                    case 9:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return String.valueOf(wzb.a((footballTopTeamsStatisticsItem4.getAccuratePasses() != null ? r2.intValue() : 0) / footballTopTeamsStatisticsItem4.getMatches()));
                    case 10:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getAccurateLongBalls();
                    case 11:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getAccurateLongBalls());
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getAccurateCrosses();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getAccurateCrosses());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getShots();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem7.getBigChances()));
                    case 16:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem8, footballTopTeamsStatisticsItem8.getShots());
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getShotsOnTarget();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem9, footballTopTeamsStatisticsItem9.getShotsOnTarget());
                    case 19:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getGoalsScored()));
                    case 20:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getSuccessfulDribbles();
                    case 21:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem11, footballTopTeamsStatisticsItem11.getSuccessfulDribbles());
                    case 22:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTackles();
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem12, footballTopTeamsStatisticsItem12.getTackles());
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getInterceptions();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem13, footballTopTeamsStatisticsItem13.getInterceptions());
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getBigChancesMissed();
                    case 27:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getClearances();
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem14, footballTopTeamsStatisticsItem14.getClearances());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics16 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics16.getClass();
                        return footballTopTeamsStatistics16.getCorners();
                }
            }
        }, new Function1() { // from class: ppj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i11) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getYellowCards();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem.getYellowCards()));
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getRedCards();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem2.getRedCards()));
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getBigChances();
                    case 5:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getAverageBallPossession();
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return rei.e(footballTopTeamsStatisticsItem3.getAverageBallPossession(), 1, 4);
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getGoalsScored();
                    case 8:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getAccuratePasses();
                    case 9:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return String.valueOf(wzb.a((footballTopTeamsStatisticsItem4.getAccuratePasses() != null ? r2.intValue() : 0) / footballTopTeamsStatisticsItem4.getMatches()));
                    case 10:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getAccurateLongBalls();
                    case 11:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getAccurateLongBalls());
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getAccurateCrosses();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getAccurateCrosses());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getShots();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem7.getBigChances()));
                    case 16:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem8, footballTopTeamsStatisticsItem8.getShots());
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getShotsOnTarget();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem9, footballTopTeamsStatisticsItem9.getShotsOnTarget());
                    case 19:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getGoalsScored()));
                    case 20:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getSuccessfulDribbles();
                    case 21:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem11, footballTopTeamsStatisticsItem11.getSuccessfulDribbles());
                    case 22:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTackles();
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem12, footballTopTeamsStatisticsItem12.getTackles());
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getInterceptions();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem13, footballTopTeamsStatisticsItem13.getInterceptions());
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getBigChancesMissed();
                    case 27:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getClearances();
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem14, footballTopTeamsStatisticsItem14.getClearances());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics16 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics16.getClass();
                        return footballTopTeamsStatistics16.getCorners();
                }
            }
        }, false);
        final int i12 = 8;
        final int i13 = 9;
        rpj rpjVar16 = new rpj(15, R.string.football_accurate_passes_per_game, "ACCURATE_PASSES_PER_GAME", new Function1() { // from class: ppj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i12) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getYellowCards();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem.getYellowCards()));
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getRedCards();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem2.getRedCards()));
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getBigChances();
                    case 5:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getAverageBallPossession();
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return rei.e(footballTopTeamsStatisticsItem3.getAverageBallPossession(), 1, 4);
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getGoalsScored();
                    case 8:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getAccuratePasses();
                    case 9:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return String.valueOf(wzb.a((footballTopTeamsStatisticsItem4.getAccuratePasses() != null ? r2.intValue() : 0) / footballTopTeamsStatisticsItem4.getMatches()));
                    case 10:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getAccurateLongBalls();
                    case 11:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getAccurateLongBalls());
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getAccurateCrosses();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getAccurateCrosses());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getShots();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem7.getBigChances()));
                    case 16:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem8, footballTopTeamsStatisticsItem8.getShots());
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getShotsOnTarget();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem9, footballTopTeamsStatisticsItem9.getShotsOnTarget());
                    case 19:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getGoalsScored()));
                    case 20:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getSuccessfulDribbles();
                    case 21:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem11, footballTopTeamsStatisticsItem11.getSuccessfulDribbles());
                    case 22:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTackles();
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem12, footballTopTeamsStatisticsItem12.getTackles());
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getInterceptions();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem13, footballTopTeamsStatisticsItem13.getInterceptions());
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getBigChancesMissed();
                    case 27:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getClearances();
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem14, footballTopTeamsStatisticsItem14.getClearances());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics16 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics16.getClass();
                        return footballTopTeamsStatistics16.getCorners();
                }
            }
        }, new Function1() { // from class: ppj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i13) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getYellowCards();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem.getYellowCards()));
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getRedCards();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem2.getRedCards()));
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getBigChances();
                    case 5:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getAverageBallPossession();
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return rei.e(footballTopTeamsStatisticsItem3.getAverageBallPossession(), 1, 4);
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getGoalsScored();
                    case 8:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getAccuratePasses();
                    case 9:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return String.valueOf(wzb.a((footballTopTeamsStatisticsItem4.getAccuratePasses() != null ? r2.intValue() : 0) / footballTopTeamsStatisticsItem4.getMatches()));
                    case 10:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getAccurateLongBalls();
                    case 11:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getAccurateLongBalls());
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getAccurateCrosses();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getAccurateCrosses());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getShots();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem7.getBigChances()));
                    case 16:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem8, footballTopTeamsStatisticsItem8.getShots());
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getShotsOnTarget();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem9, footballTopTeamsStatisticsItem9.getShotsOnTarget());
                    case 19:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getGoalsScored()));
                    case 20:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getSuccessfulDribbles();
                    case 21:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem11, footballTopTeamsStatisticsItem11.getSuccessfulDribbles());
                    case 22:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTackles();
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem12, footballTopTeamsStatisticsItem12.getTackles());
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getInterceptions();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem13, footballTopTeamsStatisticsItem13.getInterceptions());
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getBigChancesMissed();
                    case 27:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getClearances();
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem14, footballTopTeamsStatisticsItem14.getClearances());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics16 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics16.getClass();
                        return footballTopTeamsStatistics16.getCorners();
                }
            }
        }, false);
        final int i14 = 10;
        final int i15 = 11;
        rpj rpjVar17 = new rpj(16, R.string.football_accurate_long_balls_per_game, "ACCURATE_LONG_BALLS_PER_GAME", new Function1() { // from class: ppj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getYellowCards();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem.getYellowCards()));
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getRedCards();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem2.getRedCards()));
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getBigChances();
                    case 5:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getAverageBallPossession();
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return rei.e(footballTopTeamsStatisticsItem3.getAverageBallPossession(), 1, 4);
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getGoalsScored();
                    case 8:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getAccuratePasses();
                    case 9:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return String.valueOf(wzb.a((footballTopTeamsStatisticsItem4.getAccuratePasses() != null ? r2.intValue() : 0) / footballTopTeamsStatisticsItem4.getMatches()));
                    case 10:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getAccurateLongBalls();
                    case 11:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getAccurateLongBalls());
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getAccurateCrosses();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getAccurateCrosses());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getShots();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem7.getBigChances()));
                    case 16:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem8, footballTopTeamsStatisticsItem8.getShots());
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getShotsOnTarget();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem9, footballTopTeamsStatisticsItem9.getShotsOnTarget());
                    case 19:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getGoalsScored()));
                    case 20:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getSuccessfulDribbles();
                    case 21:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem11, footballTopTeamsStatisticsItem11.getSuccessfulDribbles());
                    case 22:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTackles();
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem12, footballTopTeamsStatisticsItem12.getTackles());
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getInterceptions();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem13, footballTopTeamsStatisticsItem13.getInterceptions());
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getBigChancesMissed();
                    case 27:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getClearances();
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem14, footballTopTeamsStatisticsItem14.getClearances());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics16 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics16.getClass();
                        return footballTopTeamsStatistics16.getCorners();
                }
            }
        }, new Function1() { // from class: ppj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i15) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getYellowCards();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem.getYellowCards()));
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getRedCards();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem2.getRedCards()));
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getBigChances();
                    case 5:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getAverageBallPossession();
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return rei.e(footballTopTeamsStatisticsItem3.getAverageBallPossession(), 1, 4);
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getGoalsScored();
                    case 8:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getAccuratePasses();
                    case 9:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return String.valueOf(wzb.a((footballTopTeamsStatisticsItem4.getAccuratePasses() != null ? r2.intValue() : 0) / footballTopTeamsStatisticsItem4.getMatches()));
                    case 10:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getAccurateLongBalls();
                    case 11:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getAccurateLongBalls());
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getAccurateCrosses();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getAccurateCrosses());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getShots();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem7.getBigChances()));
                    case 16:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem8, footballTopTeamsStatisticsItem8.getShots());
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getShotsOnTarget();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem9, footballTopTeamsStatisticsItem9.getShotsOnTarget());
                    case 19:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getGoalsScored()));
                    case 20:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getSuccessfulDribbles();
                    case 21:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem11, footballTopTeamsStatisticsItem11.getSuccessfulDribbles());
                    case 22:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTackles();
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem12, footballTopTeamsStatisticsItem12.getTackles());
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getInterceptions();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem13, footballTopTeamsStatisticsItem13.getInterceptions());
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getBigChancesMissed();
                    case 27:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getClearances();
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem14, footballTopTeamsStatisticsItem14.getClearances());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics16 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics16.getClass();
                        return footballTopTeamsStatistics16.getCorners();
                }
            }
        }, false);
        final int i16 = 12;
        final int i17 = 13;
        rpj rpjVar18 = new rpj(17, R.string.football_accurate_crosses_per_game, "ACCURATE_CROSSES_PER_GAME", new Function1() { // from class: ppj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i16) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getYellowCards();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem.getYellowCards()));
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getRedCards();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem2.getRedCards()));
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getBigChances();
                    case 5:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getAverageBallPossession();
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return rei.e(footballTopTeamsStatisticsItem3.getAverageBallPossession(), 1, 4);
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getGoalsScored();
                    case 8:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getAccuratePasses();
                    case 9:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return String.valueOf(wzb.a((footballTopTeamsStatisticsItem4.getAccuratePasses() != null ? r2.intValue() : 0) / footballTopTeamsStatisticsItem4.getMatches()));
                    case 10:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getAccurateLongBalls();
                    case 11:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getAccurateLongBalls());
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getAccurateCrosses();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getAccurateCrosses());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getShots();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem7.getBigChances()));
                    case 16:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem8, footballTopTeamsStatisticsItem8.getShots());
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getShotsOnTarget();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem9, footballTopTeamsStatisticsItem9.getShotsOnTarget());
                    case 19:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getGoalsScored()));
                    case 20:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getSuccessfulDribbles();
                    case 21:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem11, footballTopTeamsStatisticsItem11.getSuccessfulDribbles());
                    case 22:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTackles();
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem12, footballTopTeamsStatisticsItem12.getTackles());
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getInterceptions();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem13, footballTopTeamsStatisticsItem13.getInterceptions());
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getBigChancesMissed();
                    case 27:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getClearances();
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem14, footballTopTeamsStatisticsItem14.getClearances());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics16 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics16.getClass();
                        return footballTopTeamsStatistics16.getCorners();
                }
            }
        }, new Function1() { // from class: ppj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i17) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getYellowCards();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem.getYellowCards()));
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getRedCards();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem2.getRedCards()));
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getBigChances();
                    case 5:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getAverageBallPossession();
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return rei.e(footballTopTeamsStatisticsItem3.getAverageBallPossession(), 1, 4);
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getGoalsScored();
                    case 8:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getAccuratePasses();
                    case 9:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return String.valueOf(wzb.a((footballTopTeamsStatisticsItem4.getAccuratePasses() != null ? r2.intValue() : 0) / footballTopTeamsStatisticsItem4.getMatches()));
                    case 10:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getAccurateLongBalls();
                    case 11:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getAccurateLongBalls());
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getAccurateCrosses();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getAccurateCrosses());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getShots();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem7.getBigChances()));
                    case 16:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem8, footballTopTeamsStatisticsItem8.getShots());
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getShotsOnTarget();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem9, footballTopTeamsStatisticsItem9.getShotsOnTarget());
                    case 19:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getGoalsScored()));
                    case 20:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getSuccessfulDribbles();
                    case 21:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem11, footballTopTeamsStatisticsItem11.getSuccessfulDribbles());
                    case 22:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTackles();
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem12, footballTopTeamsStatisticsItem12.getTackles());
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getInterceptions();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem13, footballTopTeamsStatisticsItem13.getInterceptions());
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getBigChancesMissed();
                    case 27:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getClearances();
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem14, footballTopTeamsStatisticsItem14.getClearances());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics16 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics16.getClass();
                        return footballTopTeamsStatistics16.getCorners();
                }
            }
        }, false);
        final int i18 = 14;
        final int i19 = 16;
        rpj rpjVar19 = new rpj(18, R.string.football_total_shots_per_game, "TOTAL_SHOTS_PER_GAME", new Function1() { // from class: ppj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i18) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getYellowCards();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem.getYellowCards()));
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getRedCards();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem2.getRedCards()));
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getBigChances();
                    case 5:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getAverageBallPossession();
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return rei.e(footballTopTeamsStatisticsItem3.getAverageBallPossession(), 1, 4);
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getGoalsScored();
                    case 8:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getAccuratePasses();
                    case 9:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return String.valueOf(wzb.a((footballTopTeamsStatisticsItem4.getAccuratePasses() != null ? r2.intValue() : 0) / footballTopTeamsStatisticsItem4.getMatches()));
                    case 10:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getAccurateLongBalls();
                    case 11:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getAccurateLongBalls());
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getAccurateCrosses();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getAccurateCrosses());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getShots();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem7.getBigChances()));
                    case 16:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem8, footballTopTeamsStatisticsItem8.getShots());
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getShotsOnTarget();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem9, footballTopTeamsStatisticsItem9.getShotsOnTarget());
                    case 19:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getGoalsScored()));
                    case 20:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getSuccessfulDribbles();
                    case 21:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem11, footballTopTeamsStatisticsItem11.getSuccessfulDribbles());
                    case 22:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTackles();
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem12, footballTopTeamsStatisticsItem12.getTackles());
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getInterceptions();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem13, footballTopTeamsStatisticsItem13.getInterceptions());
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getBigChancesMissed();
                    case 27:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getClearances();
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem14, footballTopTeamsStatisticsItem14.getClearances());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics16 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics16.getClass();
                        return footballTopTeamsStatistics16.getCorners();
                }
            }
        }, new Function1() { // from class: ppj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i19) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getYellowCards();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem.getYellowCards()));
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getRedCards();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem2.getRedCards()));
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getBigChances();
                    case 5:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getAverageBallPossession();
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return rei.e(footballTopTeamsStatisticsItem3.getAverageBallPossession(), 1, 4);
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getGoalsScored();
                    case 8:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getAccuratePasses();
                    case 9:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return String.valueOf(wzb.a((footballTopTeamsStatisticsItem4.getAccuratePasses() != null ? r2.intValue() : 0) / footballTopTeamsStatisticsItem4.getMatches()));
                    case 10:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getAccurateLongBalls();
                    case 11:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getAccurateLongBalls());
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getAccurateCrosses();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getAccurateCrosses());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getShots();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem7.getBigChances()));
                    case 16:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem8, footballTopTeamsStatisticsItem8.getShots());
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getShotsOnTarget();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem9, footballTopTeamsStatisticsItem9.getShotsOnTarget());
                    case 19:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getGoalsScored()));
                    case 20:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getSuccessfulDribbles();
                    case 21:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem11, footballTopTeamsStatisticsItem11.getSuccessfulDribbles());
                    case 22:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTackles();
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem12, footballTopTeamsStatisticsItem12.getTackles());
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getInterceptions();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem13, footballTopTeamsStatisticsItem13.getInterceptions());
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getBigChancesMissed();
                    case 27:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getClearances();
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem14, footballTopTeamsStatisticsItem14.getClearances());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics16 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics16.getClass();
                        return footballTopTeamsStatistics16.getCorners();
                }
            }
        }, false);
        final int i20 = 17;
        final int i21 = 18;
        rpj rpjVar20 = new rpj(19, R.string.football_shots_on_goal_per_game, "SHOTS_ON_GOAL_PER_GAME", new Function1() { // from class: ppj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i20) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getYellowCards();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem.getYellowCards()));
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getRedCards();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem2.getRedCards()));
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getBigChances();
                    case 5:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getAverageBallPossession();
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return rei.e(footballTopTeamsStatisticsItem3.getAverageBallPossession(), 1, 4);
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getGoalsScored();
                    case 8:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getAccuratePasses();
                    case 9:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return String.valueOf(wzb.a((footballTopTeamsStatisticsItem4.getAccuratePasses() != null ? r2.intValue() : 0) / footballTopTeamsStatisticsItem4.getMatches()));
                    case 10:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getAccurateLongBalls();
                    case 11:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getAccurateLongBalls());
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getAccurateCrosses();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getAccurateCrosses());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getShots();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem7.getBigChances()));
                    case 16:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem8, footballTopTeamsStatisticsItem8.getShots());
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getShotsOnTarget();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem9, footballTopTeamsStatisticsItem9.getShotsOnTarget());
                    case 19:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getGoalsScored()));
                    case 20:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getSuccessfulDribbles();
                    case 21:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem11, footballTopTeamsStatisticsItem11.getSuccessfulDribbles());
                    case 22:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTackles();
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem12, footballTopTeamsStatisticsItem12.getTackles());
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getInterceptions();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem13, footballTopTeamsStatisticsItem13.getInterceptions());
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getBigChancesMissed();
                    case 27:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getClearances();
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem14, footballTopTeamsStatisticsItem14.getClearances());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics16 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics16.getClass();
                        return footballTopTeamsStatistics16.getCorners();
                }
            }
        }, new Function1() { // from class: ppj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i21) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getYellowCards();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem.getYellowCards()));
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getRedCards();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem2.getRedCards()));
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getBigChances();
                    case 5:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getAverageBallPossession();
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return rei.e(footballTopTeamsStatisticsItem3.getAverageBallPossession(), 1, 4);
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getGoalsScored();
                    case 8:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getAccuratePasses();
                    case 9:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return String.valueOf(wzb.a((footballTopTeamsStatisticsItem4.getAccuratePasses() != null ? r2.intValue() : 0) / footballTopTeamsStatisticsItem4.getMatches()));
                    case 10:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getAccurateLongBalls();
                    case 11:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getAccurateLongBalls());
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getAccurateCrosses();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getAccurateCrosses());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getShots();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem7.getBigChances()));
                    case 16:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem8, footballTopTeamsStatisticsItem8.getShots());
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getShotsOnTarget();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem9, footballTopTeamsStatisticsItem9.getShotsOnTarget());
                    case 19:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getGoalsScored()));
                    case 20:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getSuccessfulDribbles();
                    case 21:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem11, footballTopTeamsStatisticsItem11.getSuccessfulDribbles());
                    case 22:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTackles();
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem12, footballTopTeamsStatisticsItem12.getTackles());
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getInterceptions();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem13, footballTopTeamsStatisticsItem13.getInterceptions());
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getBigChancesMissed();
                    case 27:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getClearances();
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem14, footballTopTeamsStatisticsItem14.getClearances());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics16 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics16.getClass();
                        return footballTopTeamsStatistics16.getCorners();
                }
            }
        }, false);
        final int i22 = 20;
        final int i23 = 21;
        rpj rpjVar21 = new rpj(20, R.string.football_successful_dribbles_per_game, "SUCCESSFUL_DRIBBLES_PER_GAME", new Function1() { // from class: ppj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i22) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getYellowCards();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem.getYellowCards()));
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getRedCards();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem2.getRedCards()));
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getBigChances();
                    case 5:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getAverageBallPossession();
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return rei.e(footballTopTeamsStatisticsItem3.getAverageBallPossession(), 1, 4);
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getGoalsScored();
                    case 8:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getAccuratePasses();
                    case 9:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return String.valueOf(wzb.a((footballTopTeamsStatisticsItem4.getAccuratePasses() != null ? r2.intValue() : 0) / footballTopTeamsStatisticsItem4.getMatches()));
                    case 10:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getAccurateLongBalls();
                    case 11:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getAccurateLongBalls());
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getAccurateCrosses();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getAccurateCrosses());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getShots();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem7.getBigChances()));
                    case 16:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem8, footballTopTeamsStatisticsItem8.getShots());
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getShotsOnTarget();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem9, footballTopTeamsStatisticsItem9.getShotsOnTarget());
                    case 19:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getGoalsScored()));
                    case 20:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getSuccessfulDribbles();
                    case 21:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem11, footballTopTeamsStatisticsItem11.getSuccessfulDribbles());
                    case 22:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTackles();
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem12, footballTopTeamsStatisticsItem12.getTackles());
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getInterceptions();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem13, footballTopTeamsStatisticsItem13.getInterceptions());
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getBigChancesMissed();
                    case 27:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getClearances();
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem14, footballTopTeamsStatisticsItem14.getClearances());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics16 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics16.getClass();
                        return footballTopTeamsStatistics16.getCorners();
                }
            }
        }, new Function1() { // from class: ppj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i23) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getYellowCards();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem.getYellowCards()));
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getRedCards();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem2.getRedCards()));
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getBigChances();
                    case 5:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getAverageBallPossession();
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return rei.e(footballTopTeamsStatisticsItem3.getAverageBallPossession(), 1, 4);
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getGoalsScored();
                    case 8:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getAccuratePasses();
                    case 9:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return String.valueOf(wzb.a((footballTopTeamsStatisticsItem4.getAccuratePasses() != null ? r2.intValue() : 0) / footballTopTeamsStatisticsItem4.getMatches()));
                    case 10:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getAccurateLongBalls();
                    case 11:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getAccurateLongBalls());
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getAccurateCrosses();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getAccurateCrosses());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getShots();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem7.getBigChances()));
                    case 16:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem8, footballTopTeamsStatisticsItem8.getShots());
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getShotsOnTarget();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem9, footballTopTeamsStatisticsItem9.getShotsOnTarget());
                    case 19:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getGoalsScored()));
                    case 20:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getSuccessfulDribbles();
                    case 21:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem11, footballTopTeamsStatisticsItem11.getSuccessfulDribbles());
                    case 22:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTackles();
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem12, footballTopTeamsStatisticsItem12.getTackles());
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getInterceptions();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem13, footballTopTeamsStatisticsItem13.getInterceptions());
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getBigChancesMissed();
                    case 27:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getClearances();
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem14, footballTopTeamsStatisticsItem14.getClearances());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics16 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics16.getClass();
                        return footballTopTeamsStatistics16.getCorners();
                }
            }
        }, false);
        final int i24 = 22;
        final int i25 = 23;
        rpj rpjVar22 = new rpj(21, R.string.football_tackles_per_game, "TACKLES_PER_GAME", new Function1() { // from class: ppj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i24) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getYellowCards();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem.getYellowCards()));
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getRedCards();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem2.getRedCards()));
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getBigChances();
                    case 5:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getAverageBallPossession();
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return rei.e(footballTopTeamsStatisticsItem3.getAverageBallPossession(), 1, 4);
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getGoalsScored();
                    case 8:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getAccuratePasses();
                    case 9:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return String.valueOf(wzb.a((footballTopTeamsStatisticsItem4.getAccuratePasses() != null ? r2.intValue() : 0) / footballTopTeamsStatisticsItem4.getMatches()));
                    case 10:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getAccurateLongBalls();
                    case 11:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getAccurateLongBalls());
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getAccurateCrosses();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getAccurateCrosses());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getShots();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem7.getBigChances()));
                    case 16:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem8, footballTopTeamsStatisticsItem8.getShots());
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getShotsOnTarget();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem9, footballTopTeamsStatisticsItem9.getShotsOnTarget());
                    case 19:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getGoalsScored()));
                    case 20:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getSuccessfulDribbles();
                    case 21:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem11, footballTopTeamsStatisticsItem11.getSuccessfulDribbles());
                    case 22:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTackles();
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem12, footballTopTeamsStatisticsItem12.getTackles());
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getInterceptions();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem13, footballTopTeamsStatisticsItem13.getInterceptions());
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getBigChancesMissed();
                    case 27:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getClearances();
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem14, footballTopTeamsStatisticsItem14.getClearances());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics16 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics16.getClass();
                        return footballTopTeamsStatistics16.getCorners();
                }
            }
        }, new Function1() { // from class: ppj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i25) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getYellowCards();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem.getYellowCards()));
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getRedCards();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem2.getRedCards()));
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getBigChances();
                    case 5:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getAverageBallPossession();
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return rei.e(footballTopTeamsStatisticsItem3.getAverageBallPossession(), 1, 4);
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getGoalsScored();
                    case 8:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getAccuratePasses();
                    case 9:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return String.valueOf(wzb.a((footballTopTeamsStatisticsItem4.getAccuratePasses() != null ? r2.intValue() : 0) / footballTopTeamsStatisticsItem4.getMatches()));
                    case 10:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getAccurateLongBalls();
                    case 11:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getAccurateLongBalls());
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getAccurateCrosses();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getAccurateCrosses());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getShots();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem7.getBigChances()));
                    case 16:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem8, footballTopTeamsStatisticsItem8.getShots());
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getShotsOnTarget();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem9, footballTopTeamsStatisticsItem9.getShotsOnTarget());
                    case 19:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getGoalsScored()));
                    case 20:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getSuccessfulDribbles();
                    case 21:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem11, footballTopTeamsStatisticsItem11.getSuccessfulDribbles());
                    case 22:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTackles();
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem12, footballTopTeamsStatisticsItem12.getTackles());
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getInterceptions();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem13, footballTopTeamsStatisticsItem13.getInterceptions());
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getBigChancesMissed();
                    case 27:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getClearances();
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem14, footballTopTeamsStatisticsItem14.getClearances());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics16 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics16.getClass();
                        return footballTopTeamsStatistics16.getCorners();
                }
            }
        }, false);
        final int i26 = 24;
        final int i27 = 25;
        rpj rpjVar23 = new rpj(22, R.string.football_interceptions_per_game, "INTERCEPTIONS_PER_GAME", new Function1() { // from class: ppj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i26) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getYellowCards();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem.getYellowCards()));
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getRedCards();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem2.getRedCards()));
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getBigChances();
                    case 5:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getAverageBallPossession();
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return rei.e(footballTopTeamsStatisticsItem3.getAverageBallPossession(), 1, 4);
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getGoalsScored();
                    case 8:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getAccuratePasses();
                    case 9:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return String.valueOf(wzb.a((footballTopTeamsStatisticsItem4.getAccuratePasses() != null ? r2.intValue() : 0) / footballTopTeamsStatisticsItem4.getMatches()));
                    case 10:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getAccurateLongBalls();
                    case 11:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getAccurateLongBalls());
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getAccurateCrosses();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getAccurateCrosses());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getShots();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem7.getBigChances()));
                    case 16:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem8, footballTopTeamsStatisticsItem8.getShots());
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getShotsOnTarget();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem9, footballTopTeamsStatisticsItem9.getShotsOnTarget());
                    case 19:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getGoalsScored()));
                    case 20:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getSuccessfulDribbles();
                    case 21:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem11, footballTopTeamsStatisticsItem11.getSuccessfulDribbles());
                    case 22:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTackles();
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem12, footballTopTeamsStatisticsItem12.getTackles());
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getInterceptions();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem13, footballTopTeamsStatisticsItem13.getInterceptions());
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getBigChancesMissed();
                    case 27:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getClearances();
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem14, footballTopTeamsStatisticsItem14.getClearances());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics16 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics16.getClass();
                        return footballTopTeamsStatistics16.getCorners();
                }
            }
        }, new Function1() { // from class: ppj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i27) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getYellowCards();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem.getYellowCards()));
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getRedCards();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem2.getRedCards()));
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getBigChances();
                    case 5:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getAverageBallPossession();
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return rei.e(footballTopTeamsStatisticsItem3.getAverageBallPossession(), 1, 4);
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getGoalsScored();
                    case 8:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getAccuratePasses();
                    case 9:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return String.valueOf(wzb.a((footballTopTeamsStatisticsItem4.getAccuratePasses() != null ? r2.intValue() : 0) / footballTopTeamsStatisticsItem4.getMatches()));
                    case 10:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getAccurateLongBalls();
                    case 11:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getAccurateLongBalls());
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getAccurateCrosses();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getAccurateCrosses());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getShots();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem7.getBigChances()));
                    case 16:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem8, footballTopTeamsStatisticsItem8.getShots());
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getShotsOnTarget();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem9, footballTopTeamsStatisticsItem9.getShotsOnTarget());
                    case 19:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getGoalsScored()));
                    case 20:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getSuccessfulDribbles();
                    case 21:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem11, footballTopTeamsStatisticsItem11.getSuccessfulDribbles());
                    case 22:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTackles();
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem12, footballTopTeamsStatisticsItem12.getTackles());
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getInterceptions();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem13, footballTopTeamsStatisticsItem13.getInterceptions());
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getBigChancesMissed();
                    case 27:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getClearances();
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem14, footballTopTeamsStatisticsItem14.getClearances());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics16 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics16.getClass();
                        return footballTopTeamsStatistics16.getCorners();
                }
            }
        }, false);
        final int i28 = 27;
        final int i29 = 28;
        rpj rpjVar24 = new rpj(23, R.string.football_clearances_per_game, "CLEARANCES_PER_GAME", new Function1() { // from class: ppj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i28) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getYellowCards();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem.getYellowCards()));
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getRedCards();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem2.getRedCards()));
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getBigChances();
                    case 5:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getAverageBallPossession();
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return rei.e(footballTopTeamsStatisticsItem3.getAverageBallPossession(), 1, 4);
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getGoalsScored();
                    case 8:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getAccuratePasses();
                    case 9:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return String.valueOf(wzb.a((footballTopTeamsStatisticsItem4.getAccuratePasses() != null ? r2.intValue() : 0) / footballTopTeamsStatisticsItem4.getMatches()));
                    case 10:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getAccurateLongBalls();
                    case 11:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getAccurateLongBalls());
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getAccurateCrosses();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getAccurateCrosses());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getShots();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem7.getBigChances()));
                    case 16:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem8, footballTopTeamsStatisticsItem8.getShots());
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getShotsOnTarget();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem9, footballTopTeamsStatisticsItem9.getShotsOnTarget());
                    case 19:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getGoalsScored()));
                    case 20:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getSuccessfulDribbles();
                    case 21:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem11, footballTopTeamsStatisticsItem11.getSuccessfulDribbles());
                    case 22:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTackles();
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem12, footballTopTeamsStatisticsItem12.getTackles());
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getInterceptions();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem13, footballTopTeamsStatisticsItem13.getInterceptions());
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getBigChancesMissed();
                    case 27:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getClearances();
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem14, footballTopTeamsStatisticsItem14.getClearances());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics16 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics16.getClass();
                        return footballTopTeamsStatistics16.getCorners();
                }
            }
        }, new Function1() { // from class: ppj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i29) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getYellowCards();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem.getYellowCards()));
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getRedCards();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem2.getRedCards()));
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getBigChances();
                    case 5:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getAverageBallPossession();
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return rei.e(footballTopTeamsStatisticsItem3.getAverageBallPossession(), 1, 4);
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getGoalsScored();
                    case 8:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getAccuratePasses();
                    case 9:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return String.valueOf(wzb.a((footballTopTeamsStatisticsItem4.getAccuratePasses() != null ? r2.intValue() : 0) / footballTopTeamsStatisticsItem4.getMatches()));
                    case 10:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getAccurateLongBalls();
                    case 11:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getAccurateLongBalls());
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getAccurateCrosses();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getAccurateCrosses());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getShots();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem7.getBigChances()));
                    case 16:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem8, footballTopTeamsStatisticsItem8.getShots());
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getShotsOnTarget();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem9, footballTopTeamsStatisticsItem9.getShotsOnTarget());
                    case 19:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getGoalsScored()));
                    case 20:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getSuccessfulDribbles();
                    case 21:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem11, footballTopTeamsStatisticsItem11.getSuccessfulDribbles());
                    case 22:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTackles();
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem12, footballTopTeamsStatisticsItem12.getTackles());
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getInterceptions();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem13, footballTopTeamsStatisticsItem13.getInterceptions());
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getBigChancesMissed();
                    case 27:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getClearances();
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem14, footballTopTeamsStatisticsItem14.getClearances());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics16 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics16.getClass();
                        return footballTopTeamsStatistics16.getCorners();
                }
            }
        }, false);
        final int i30 = 29;
        rpj[] rpjVarArr = {rpjVar, rpjVar2, rpjVar3, rpjVar4, rpjVar5, rpjVar6, rpjVar7, rpjVar8, rpjVar9, rpjVar10, rpjVar11, rpjVar12, rpjVar13, rpjVar14, rpjVar15, rpjVar16, rpjVar17, rpjVar18, rpjVar19, rpjVar20, rpjVar21, rpjVar22, rpjVar23, rpjVar24, new rpj(24, R.string.football_corners_per_game, "CORNERS_PER_GAME", new Function1() { // from class: ppj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i30) {
                    case 0:
                        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics.getClass();
                        return footballTopTeamsStatistics.getYellowCards();
                    case 1:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem.getYellowCards()));
                    case 2:
                        FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics2.getClass();
                        return footballTopTeamsStatistics2.getRedCards();
                    case 3:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem2.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem2.getRedCards()));
                    case 4:
                        FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics3.getClass();
                        return footballTopTeamsStatistics3.getBigChances();
                    case 5:
                        FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics4.getClass();
                        return footballTopTeamsStatistics4.getAverageBallPossession();
                    case 6:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem3.getClass();
                        return rei.e(footballTopTeamsStatisticsItem3.getAverageBallPossession(), 1, 4);
                    case 7:
                        FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics5.getClass();
                        return footballTopTeamsStatistics5.getGoalsScored();
                    case 8:
                        FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics6.getClass();
                        return footballTopTeamsStatistics6.getAccuratePasses();
                    case 9:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem4.getClass();
                        return String.valueOf(wzb.a((footballTopTeamsStatisticsItem4.getAccuratePasses() != null ? r2.intValue() : 0) / footballTopTeamsStatisticsItem4.getMatches()));
                    case 10:
                        FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics7.getClass();
                        return footballTopTeamsStatistics7.getAccurateLongBalls();
                    case 11:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem5.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem5, footballTopTeamsStatisticsItem5.getAccurateLongBalls());
                    case 12:
                        FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics8.getClass();
                        return footballTopTeamsStatistics8.getAccurateCrosses();
                    case 13:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem6.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem6, footballTopTeamsStatisticsItem6.getAccurateCrosses());
                    case 14:
                        FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics9.getClass();
                        return footballTopTeamsStatistics9.getShots();
                    case 15:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem7.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem7.getBigChances()));
                    case 16:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem8.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem8, footballTopTeamsStatisticsItem8.getShots());
                    case 17:
                        FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics10.getClass();
                        return footballTopTeamsStatistics10.getShotsOnTarget();
                    case 18:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem9.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem9, footballTopTeamsStatisticsItem9.getShotsOnTarget());
                    case 19:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem10.getClass();
                        return String.valueOf(yid.m(footballTopTeamsStatisticsItem10.getGoalsScored()));
                    case 20:
                        FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics11.getClass();
                        return footballTopTeamsStatistics11.getSuccessfulDribbles();
                    case 21:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem11.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem11, footballTopTeamsStatisticsItem11.getSuccessfulDribbles());
                    case 22:
                        FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics12.getClass();
                        return footballTopTeamsStatistics12.getTackles();
                    case 23:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem12.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem12, footballTopTeamsStatisticsItem12.getTackles());
                    case 24:
                        FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics13.getClass();
                        return footballTopTeamsStatistics13.getInterceptions();
                    case 25:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem13.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem13, footballTopTeamsStatisticsItem13.getInterceptions());
                    case 26:
                        FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics14.getClass();
                        return footballTopTeamsStatistics14.getBigChancesMissed();
                    case 27:
                        FootballTopTeamsStatistics footballTopTeamsStatistics15 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics15.getClass();
                        return footballTopTeamsStatistics15.getClearances();
                    case 28:
                        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem14 = (FootballTopTeamsStatisticsItem) obj;
                        footballTopTeamsStatisticsItem14.getClass();
                        return dmi.o(footballTopTeamsStatisticsItem14, footballTopTeamsStatisticsItem14.getClearances());
                    default:
                        FootballTopTeamsStatistics footballTopTeamsStatistics16 = (FootballTopTeamsStatistics) obj;
                        footballTopTeamsStatistics16.getClass();
                        return footballTopTeamsStatistics16.getCorners();
                }
            }
        }, new qpj(0), false), new rpj(25, R.string.football_fouls_per_game, "FOULS_PER_GAME", new qpj(2), new qpj(3), false), new rpj(26, R.string.football_penalty_goals, "PENALTY_GOALS", new qpj(4), new qpj(5), false), new rpj(27, R.string.football_penalties_conceded, "PENALTIES_CONCEDED", new qpj(6), new qpj(8), false), new rpj(28, R.string.football_clean_sheets, "CLEAN_SHEETS", new qpj(9), new qpj(10), false), new rpj(29, R.string.football_titles, "TITLES_WON", new qpj(11), new qpj(12), true)};
        e = rpjVarArr;
        f = new kp5(rpjVarArr);
    }

    public rpj(int i, int i2, String str, Function1 function1, Function1 function12, boolean z) {
        this.a = i2;
        this.b = function1;
        this.c = function12;
        this.d = z;
    }

    public static rpj valueOf(String str) {
        return (rpj) Enum.valueOf(rpj.class, str);
    }

    public static rpj[] values() {
        return (rpj[]) e.clone();
    }

    @Override // defpackage.cqj
    public final /* bridge */ String a(Object obj) {
        return super.a((FootballTopTeamsStatisticsItem) obj);
    }

    @Override // defpackage.cqj
    public final /* bridge */ List b(Object obj) {
        return super.b((FootballTopTeamsStatistics) obj);
    }

    @Override // defpackage.cqj
    public final boolean c(hub hubVar) {
        return this.d || hubVar != hub.c;
    }

    @Override // defpackage.cqj
    public final int d() {
        return this.a;
    }

    @Override // defpackage.cqj
    public final Function1 g() {
        return this.c;
    }

    @Override // defpackage.cqj
    public final Function1 h() {
        return this.b;
    }
}
