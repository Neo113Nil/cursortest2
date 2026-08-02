package defpackage;

import com.sofascore.model.newNetwork.topperformance.response.RugbyTopTeamsStatistics;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.RugbyTopTeamsStatisticsItem;
import com.sofascore.results.R;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class fpj implements ipj {
    public static final /* synthetic */ fpj[] d;
    public static final /* synthetic */ kp5 e;
    public final int a;
    public final Function1 b;
    public final Function1 c;

    static {
        final int i = 1;
        fpj fpjVar = new fpj("POINTS", 0, R.string.rugby_points, new Function1() { // from class: dpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getMetresMade();
                    case 1:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getPoints();
                    case 2:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getMetresMade());
                    case 3:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getHandlingError();
                    case 4:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getHandlingError());
                    case 5:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getTries();
                    case 6:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getCarriesCrossedGainLine();
                    case 7:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem3, rugbyTopTeamsStatisticsItem3.getCarriesCrossedGainLine());
                    case 8:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getCarriesNotMadeGainLine();
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getCarriesNotMadeGainLine());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getKickMetres();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getKickMetres());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getDropGoals();
                    case 13:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getKickFromHand();
                    case 14:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem6, rugbyTopTeamsStatisticsItem6.getKickFromHand());
                    case 15:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getPostContactMetres();
                    case 16:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getPostContactMetres());
                    case 17:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem8.getTries());
                    case 18:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getTackles();
                    case 19:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem9, rugbyTopTeamsStatisticsItem9.getTackles());
                    case 20:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getDominantTackles();
                    case 21:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem10, rugbyTopTeamsStatisticsItem10.getDominantTackles());
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getPenDefs();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem11.getDropGoals());
                    case 24:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem12.getPenDefs());
                    case 25:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getPenOffs();
                    case 26:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem13.getPenOffs());
                    case 27:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRucksWon();
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem14, rugbyTopTeamsStatisticsItem14.getRucksWon());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics16 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics16.getClass();
                        return rugbyTopTeamsStatistics16.getPenaltyTries();
                }
            }
        }, new apj(23));
        final int i2 = 5;
        Function1 function1 = new Function1() { // from class: dpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i2) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getMetresMade();
                    case 1:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getPoints();
                    case 2:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getMetresMade());
                    case 3:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getHandlingError();
                    case 4:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getHandlingError());
                    case 5:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getTries();
                    case 6:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getCarriesCrossedGainLine();
                    case 7:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem3, rugbyTopTeamsStatisticsItem3.getCarriesCrossedGainLine());
                    case 8:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getCarriesNotMadeGainLine();
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getCarriesNotMadeGainLine());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getKickMetres();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getKickMetres());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getDropGoals();
                    case 13:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getKickFromHand();
                    case 14:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem6, rugbyTopTeamsStatisticsItem6.getKickFromHand());
                    case 15:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getPostContactMetres();
                    case 16:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getPostContactMetres());
                    case 17:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem8.getTries());
                    case 18:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getTackles();
                    case 19:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem9, rugbyTopTeamsStatisticsItem9.getTackles());
                    case 20:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getDominantTackles();
                    case 21:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem10, rugbyTopTeamsStatisticsItem10.getDominantTackles());
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getPenDefs();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem11.getDropGoals());
                    case 24:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem12.getPenDefs());
                    case 25:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getPenOffs();
                    case 26:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem13.getPenOffs());
                    case 27:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRucksWon();
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem14, rugbyTopTeamsStatisticsItem14.getRucksWon());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics16 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics16.getClass();
                        return rugbyTopTeamsStatistics16.getPenaltyTries();
                }
            }
        };
        final int i3 = 17;
        fpj fpjVar2 = new fpj("TRIES", 1, R.string.rugby_tries, function1, new Function1() { // from class: dpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i3) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getMetresMade();
                    case 1:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getPoints();
                    case 2:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getMetresMade());
                    case 3:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getHandlingError();
                    case 4:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getHandlingError());
                    case 5:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getTries();
                    case 6:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getCarriesCrossedGainLine();
                    case 7:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem3, rugbyTopTeamsStatisticsItem3.getCarriesCrossedGainLine());
                    case 8:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getCarriesNotMadeGainLine();
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getCarriesNotMadeGainLine());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getKickMetres();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getKickMetres());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getDropGoals();
                    case 13:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getKickFromHand();
                    case 14:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem6, rugbyTopTeamsStatisticsItem6.getKickFromHand());
                    case 15:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getPostContactMetres();
                    case 16:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getPostContactMetres());
                    case 17:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem8.getTries());
                    case 18:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getTackles();
                    case 19:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem9, rugbyTopTeamsStatisticsItem9.getTackles());
                    case 20:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getDominantTackles();
                    case 21:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem10, rugbyTopTeamsStatisticsItem10.getDominantTackles());
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getPenDefs();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem11.getDropGoals());
                    case 24:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem12.getPenDefs());
                    case 25:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getPenOffs();
                    case 26:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem13.getPenOffs());
                    case 27:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRucksWon();
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem14, rugbyTopTeamsStatisticsItem14.getRucksWon());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics16 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics16.getClass();
                        return rugbyTopTeamsStatistics16.getPenaltyTries();
                }
            }
        });
        final int i4 = 29;
        fpj fpjVar3 = new fpj("PENALTY_TRIES", 2, R.string.rugby_penalty_tries, new Function1() { // from class: dpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i4) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getMetresMade();
                    case 1:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getPoints();
                    case 2:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getMetresMade());
                    case 3:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getHandlingError();
                    case 4:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getHandlingError());
                    case 5:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getTries();
                    case 6:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getCarriesCrossedGainLine();
                    case 7:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem3, rugbyTopTeamsStatisticsItem3.getCarriesCrossedGainLine());
                    case 8:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getCarriesNotMadeGainLine();
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getCarriesNotMadeGainLine());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getKickMetres();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getKickMetres());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getDropGoals();
                    case 13:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getKickFromHand();
                    case 14:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem6, rugbyTopTeamsStatisticsItem6.getKickFromHand());
                    case 15:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getPostContactMetres();
                    case 16:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getPostContactMetres());
                    case 17:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem8.getTries());
                    case 18:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getTackles();
                    case 19:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem9, rugbyTopTeamsStatisticsItem9.getTackles());
                    case 20:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getDominantTackles();
                    case 21:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem10, rugbyTopTeamsStatisticsItem10.getDominantTackles());
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getPenDefs();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem11.getDropGoals());
                    case 24:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem12.getPenDefs());
                    case 25:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getPenOffs();
                    case 26:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem13.getPenOffs());
                    case 27:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRucksWon();
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem14, rugbyTopTeamsStatisticsItem14.getRucksWon());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics16 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics16.getClass();
                        return rugbyTopTeamsStatistics16.getPenaltyTries();
                }
            }
        }, new epj(11));
        fpj fpjVar4 = new fpj("PENALTY_GOALS", 3, R.string.rugby_penalty_goals, new epj(21), new epj(22));
        fpj fpjVar5 = new fpj("CONVERSIONS", 4, R.string.rugby_conversions, new epj(23), new epj(24));
        final int i5 = 12;
        Function1 function12 = new Function1() { // from class: dpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i5) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getMetresMade();
                    case 1:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getPoints();
                    case 2:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getMetresMade());
                    case 3:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getHandlingError();
                    case 4:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getHandlingError());
                    case 5:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getTries();
                    case 6:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getCarriesCrossedGainLine();
                    case 7:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem3, rugbyTopTeamsStatisticsItem3.getCarriesCrossedGainLine());
                    case 8:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getCarriesNotMadeGainLine();
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getCarriesNotMadeGainLine());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getKickMetres();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getKickMetres());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getDropGoals();
                    case 13:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getKickFromHand();
                    case 14:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem6, rugbyTopTeamsStatisticsItem6.getKickFromHand());
                    case 15:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getPostContactMetres();
                    case 16:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getPostContactMetres());
                    case 17:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem8.getTries());
                    case 18:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getTackles();
                    case 19:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem9, rugbyTopTeamsStatisticsItem9.getTackles());
                    case 20:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getDominantTackles();
                    case 21:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem10, rugbyTopTeamsStatisticsItem10.getDominantTackles());
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getPenDefs();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem11.getDropGoals());
                    case 24:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem12.getPenDefs());
                    case 25:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getPenOffs();
                    case 26:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem13.getPenOffs());
                    case 27:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRucksWon();
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem14, rugbyTopTeamsStatisticsItem14.getRucksWon());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics16 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics16.getClass();
                        return rugbyTopTeamsStatistics16.getPenaltyTries();
                }
            }
        };
        final int i6 = 23;
        fpj fpjVar6 = new fpj("DROP_GOALS", 5, R.string.rugby_drop_goals, function12, new Function1() { // from class: dpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i6) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getMetresMade();
                    case 1:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getPoints();
                    case 2:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getMetresMade());
                    case 3:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getHandlingError();
                    case 4:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getHandlingError());
                    case 5:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getTries();
                    case 6:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getCarriesCrossedGainLine();
                    case 7:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem3, rugbyTopTeamsStatisticsItem3.getCarriesCrossedGainLine());
                    case 8:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getCarriesNotMadeGainLine();
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getCarriesNotMadeGainLine());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getKickMetres();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getKickMetres());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getDropGoals();
                    case 13:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getKickFromHand();
                    case 14:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem6, rugbyTopTeamsStatisticsItem6.getKickFromHand());
                    case 15:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getPostContactMetres();
                    case 16:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getPostContactMetres());
                    case 17:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem8.getTries());
                    case 18:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getTackles();
                    case 19:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem9, rugbyTopTeamsStatisticsItem9.getTackles());
                    case 20:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getDominantTackles();
                    case 21:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem10, rugbyTopTeamsStatisticsItem10.getDominantTackles());
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getPenDefs();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem11.getDropGoals());
                    case 24:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem12.getPenDefs());
                    case 25:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getPenOffs();
                    case 26:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem13.getPenOffs());
                    case 27:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRucksWon();
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem14, rugbyTopTeamsStatisticsItem14.getRucksWon());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics16 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics16.getClass();
                        return rugbyTopTeamsStatistics16.getPenaltyTries();
                }
            }
        });
        fpj fpjVar7 = new fpj("SCRUMS_WON", 6, R.string.rugby_scrums_won, new epj(4), new epj(15));
        fpj fpjVar8 = new fpj("LINEOUTS_WON", 7, R.string.rugby_lineouts_won, new epj(25), new epj(26));
        fpj fpjVar9 = new fpj("PASSES_MADE", 8, R.string.rugby_passes_made_per_game, new epj(27), new epj(28));
        fpj fpjVar10 = new fpj("OFFLOADS", 9, R.string.rugby_offloads, new apj(21), new apj(22));
        fpj fpjVar11 = new fpj("CARRIES", 10, R.string.rugby_carries_per_game, new apj(24), new apj(25));
        fpj fpjVar12 = new fpj("CLEAN_BREAKS", 11, R.string.rugby_clean_breaks_per_game, new apj(26), new apj(27));
        fpj fpjVar13 = new fpj("DEFENDERS_BEATEN", 12, R.string.rugby_defenders_beaten_per_game, new apj(28), new apj(29));
        final int i7 = 0;
        final int i8 = 2;
        fpj fpjVar14 = new fpj("METRES_MADE", 13, R.string.rugby_metres_gained_per_game, new Function1() { // from class: dpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i7) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getMetresMade();
                    case 1:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getPoints();
                    case 2:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getMetresMade());
                    case 3:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getHandlingError();
                    case 4:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getHandlingError());
                    case 5:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getTries();
                    case 6:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getCarriesCrossedGainLine();
                    case 7:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem3, rugbyTopTeamsStatisticsItem3.getCarriesCrossedGainLine());
                    case 8:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getCarriesNotMadeGainLine();
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getCarriesNotMadeGainLine());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getKickMetres();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getKickMetres());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getDropGoals();
                    case 13:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getKickFromHand();
                    case 14:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem6, rugbyTopTeamsStatisticsItem6.getKickFromHand());
                    case 15:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getPostContactMetres();
                    case 16:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getPostContactMetres());
                    case 17:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem8.getTries());
                    case 18:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getTackles();
                    case 19:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem9, rugbyTopTeamsStatisticsItem9.getTackles());
                    case 20:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getDominantTackles();
                    case 21:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem10, rugbyTopTeamsStatisticsItem10.getDominantTackles());
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getPenDefs();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem11.getDropGoals());
                    case 24:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem12.getPenDefs());
                    case 25:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getPenOffs();
                    case 26:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem13.getPenOffs());
                    case 27:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRucksWon();
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem14, rugbyTopTeamsStatisticsItem14.getRucksWon());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics16 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics16.getClass();
                        return rugbyTopTeamsStatistics16.getPenaltyTries();
                }
            }
        }, new Function1() { // from class: dpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i8) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getMetresMade();
                    case 1:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getPoints();
                    case 2:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getMetresMade());
                    case 3:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getHandlingError();
                    case 4:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getHandlingError());
                    case 5:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getTries();
                    case 6:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getCarriesCrossedGainLine();
                    case 7:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem3, rugbyTopTeamsStatisticsItem3.getCarriesCrossedGainLine());
                    case 8:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getCarriesNotMadeGainLine();
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getCarriesNotMadeGainLine());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getKickMetres();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getKickMetres());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getDropGoals();
                    case 13:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getKickFromHand();
                    case 14:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem6, rugbyTopTeamsStatisticsItem6.getKickFromHand());
                    case 15:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getPostContactMetres();
                    case 16:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getPostContactMetres());
                    case 17:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem8.getTries());
                    case 18:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getTackles();
                    case 19:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem9, rugbyTopTeamsStatisticsItem9.getTackles());
                    case 20:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getDominantTackles();
                    case 21:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem10, rugbyTopTeamsStatisticsItem10.getDominantTackles());
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getPenDefs();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem11.getDropGoals());
                    case 24:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem12.getPenDefs());
                    case 25:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getPenOffs();
                    case 26:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem13.getPenOffs());
                    case 27:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRucksWon();
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem14, rugbyTopTeamsStatisticsItem14.getRucksWon());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics16 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics16.getClass();
                        return rugbyTopTeamsStatistics16.getPenaltyTries();
                }
            }
        });
        final int i9 = 3;
        final int i10 = 4;
        fpj fpjVar15 = new fpj("HANDLING_ERROR", 14, R.string.rugby_handling_errors_per_game, new Function1() { // from class: dpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i9) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getMetresMade();
                    case 1:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getPoints();
                    case 2:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getMetresMade());
                    case 3:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getHandlingError();
                    case 4:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getHandlingError());
                    case 5:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getTries();
                    case 6:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getCarriesCrossedGainLine();
                    case 7:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem3, rugbyTopTeamsStatisticsItem3.getCarriesCrossedGainLine());
                    case 8:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getCarriesNotMadeGainLine();
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getCarriesNotMadeGainLine());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getKickMetres();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getKickMetres());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getDropGoals();
                    case 13:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getKickFromHand();
                    case 14:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem6, rugbyTopTeamsStatisticsItem6.getKickFromHand());
                    case 15:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getPostContactMetres();
                    case 16:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getPostContactMetres());
                    case 17:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem8.getTries());
                    case 18:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getTackles();
                    case 19:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem9, rugbyTopTeamsStatisticsItem9.getTackles());
                    case 20:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getDominantTackles();
                    case 21:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem10, rugbyTopTeamsStatisticsItem10.getDominantTackles());
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getPenDefs();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem11.getDropGoals());
                    case 24:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem12.getPenDefs());
                    case 25:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getPenOffs();
                    case 26:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem13.getPenOffs());
                    case 27:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRucksWon();
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem14, rugbyTopTeamsStatisticsItem14.getRucksWon());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics16 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics16.getClass();
                        return rugbyTopTeamsStatistics16.getPenaltyTries();
                }
            }
        }, new Function1() { // from class: dpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i10) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getMetresMade();
                    case 1:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getPoints();
                    case 2:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getMetresMade());
                    case 3:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getHandlingError();
                    case 4:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getHandlingError());
                    case 5:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getTries();
                    case 6:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getCarriesCrossedGainLine();
                    case 7:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem3, rugbyTopTeamsStatisticsItem3.getCarriesCrossedGainLine());
                    case 8:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getCarriesNotMadeGainLine();
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getCarriesNotMadeGainLine());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getKickMetres();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getKickMetres());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getDropGoals();
                    case 13:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getKickFromHand();
                    case 14:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem6, rugbyTopTeamsStatisticsItem6.getKickFromHand());
                    case 15:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getPostContactMetres();
                    case 16:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getPostContactMetres());
                    case 17:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem8.getTries());
                    case 18:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getTackles();
                    case 19:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem9, rugbyTopTeamsStatisticsItem9.getTackles());
                    case 20:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getDominantTackles();
                    case 21:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem10, rugbyTopTeamsStatisticsItem10.getDominantTackles());
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getPenDefs();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem11.getDropGoals());
                    case 24:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem12.getPenDefs());
                    case 25:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getPenOffs();
                    case 26:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem13.getPenOffs());
                    case 27:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRucksWon();
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem14, rugbyTopTeamsStatisticsItem14.getRucksWon());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics16 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics16.getClass();
                        return rugbyTopTeamsStatistics16.getPenaltyTries();
                }
            }
        });
        final int i11 = 6;
        final int i12 = 7;
        fpj fpjVar16 = new fpj("CARRIES_CROSSED_GAIN_LINE", 15, R.string.rugby_carries_crossed_gained_line_per_game, new Function1() { // from class: dpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i11) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getMetresMade();
                    case 1:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getPoints();
                    case 2:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getMetresMade());
                    case 3:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getHandlingError();
                    case 4:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getHandlingError());
                    case 5:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getTries();
                    case 6:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getCarriesCrossedGainLine();
                    case 7:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem3, rugbyTopTeamsStatisticsItem3.getCarriesCrossedGainLine());
                    case 8:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getCarriesNotMadeGainLine();
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getCarriesNotMadeGainLine());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getKickMetres();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getKickMetres());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getDropGoals();
                    case 13:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getKickFromHand();
                    case 14:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem6, rugbyTopTeamsStatisticsItem6.getKickFromHand());
                    case 15:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getPostContactMetres();
                    case 16:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getPostContactMetres());
                    case 17:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem8.getTries());
                    case 18:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getTackles();
                    case 19:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem9, rugbyTopTeamsStatisticsItem9.getTackles());
                    case 20:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getDominantTackles();
                    case 21:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem10, rugbyTopTeamsStatisticsItem10.getDominantTackles());
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getPenDefs();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem11.getDropGoals());
                    case 24:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem12.getPenDefs());
                    case 25:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getPenOffs();
                    case 26:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem13.getPenOffs());
                    case 27:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRucksWon();
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem14, rugbyTopTeamsStatisticsItem14.getRucksWon());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics16 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics16.getClass();
                        return rugbyTopTeamsStatistics16.getPenaltyTries();
                }
            }
        }, new Function1() { // from class: dpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i12) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getMetresMade();
                    case 1:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getPoints();
                    case 2:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getMetresMade());
                    case 3:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getHandlingError();
                    case 4:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getHandlingError());
                    case 5:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getTries();
                    case 6:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getCarriesCrossedGainLine();
                    case 7:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem3, rugbyTopTeamsStatisticsItem3.getCarriesCrossedGainLine());
                    case 8:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getCarriesNotMadeGainLine();
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getCarriesNotMadeGainLine());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getKickMetres();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getKickMetres());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getDropGoals();
                    case 13:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getKickFromHand();
                    case 14:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem6, rugbyTopTeamsStatisticsItem6.getKickFromHand());
                    case 15:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getPostContactMetres();
                    case 16:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getPostContactMetres());
                    case 17:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem8.getTries());
                    case 18:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getTackles();
                    case 19:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem9, rugbyTopTeamsStatisticsItem9.getTackles());
                    case 20:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getDominantTackles();
                    case 21:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem10, rugbyTopTeamsStatisticsItem10.getDominantTackles());
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getPenDefs();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem11.getDropGoals());
                    case 24:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem12.getPenDefs());
                    case 25:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getPenOffs();
                    case 26:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem13.getPenOffs());
                    case 27:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRucksWon();
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem14, rugbyTopTeamsStatisticsItem14.getRucksWon());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics16 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics16.getClass();
                        return rugbyTopTeamsStatistics16.getPenaltyTries();
                }
            }
        });
        final int i13 = 8;
        final int i14 = 9;
        fpj fpjVar17 = new fpj("CARRIES_NOT_MADE_GAIN_LINE", 16, R.string.rugby_carries_not_made_gain_line_per_game, new Function1() { // from class: dpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i13) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getMetresMade();
                    case 1:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getPoints();
                    case 2:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getMetresMade());
                    case 3:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getHandlingError();
                    case 4:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getHandlingError());
                    case 5:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getTries();
                    case 6:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getCarriesCrossedGainLine();
                    case 7:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem3, rugbyTopTeamsStatisticsItem3.getCarriesCrossedGainLine());
                    case 8:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getCarriesNotMadeGainLine();
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getCarriesNotMadeGainLine());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getKickMetres();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getKickMetres());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getDropGoals();
                    case 13:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getKickFromHand();
                    case 14:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem6, rugbyTopTeamsStatisticsItem6.getKickFromHand());
                    case 15:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getPostContactMetres();
                    case 16:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getPostContactMetres());
                    case 17:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem8.getTries());
                    case 18:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getTackles();
                    case 19:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem9, rugbyTopTeamsStatisticsItem9.getTackles());
                    case 20:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getDominantTackles();
                    case 21:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem10, rugbyTopTeamsStatisticsItem10.getDominantTackles());
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getPenDefs();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem11.getDropGoals());
                    case 24:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem12.getPenDefs());
                    case 25:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getPenOffs();
                    case 26:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem13.getPenOffs());
                    case 27:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRucksWon();
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem14, rugbyTopTeamsStatisticsItem14.getRucksWon());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics16 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics16.getClass();
                        return rugbyTopTeamsStatistics16.getPenaltyTries();
                }
            }
        }, new Function1() { // from class: dpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getMetresMade();
                    case 1:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getPoints();
                    case 2:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getMetresMade());
                    case 3:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getHandlingError();
                    case 4:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getHandlingError());
                    case 5:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getTries();
                    case 6:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getCarriesCrossedGainLine();
                    case 7:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem3, rugbyTopTeamsStatisticsItem3.getCarriesCrossedGainLine());
                    case 8:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getCarriesNotMadeGainLine();
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getCarriesNotMadeGainLine());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getKickMetres();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getKickMetres());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getDropGoals();
                    case 13:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getKickFromHand();
                    case 14:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem6, rugbyTopTeamsStatisticsItem6.getKickFromHand());
                    case 15:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getPostContactMetres();
                    case 16:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getPostContactMetres());
                    case 17:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem8.getTries());
                    case 18:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getTackles();
                    case 19:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem9, rugbyTopTeamsStatisticsItem9.getTackles());
                    case 20:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getDominantTackles();
                    case 21:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem10, rugbyTopTeamsStatisticsItem10.getDominantTackles());
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getPenDefs();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem11.getDropGoals());
                    case 24:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem12.getPenDefs());
                    case 25:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getPenOffs();
                    case 26:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem13.getPenOffs());
                    case 27:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRucksWon();
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem14, rugbyTopTeamsStatisticsItem14.getRucksWon());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics16 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics16.getClass();
                        return rugbyTopTeamsStatistics16.getPenaltyTries();
                }
            }
        });
        final int i15 = 10;
        final int i16 = 11;
        fpj fpjVar18 = new fpj("KICK_METRES", 17, R.string.rugby_kick_metres_per_game, new Function1() { // from class: dpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i15) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getMetresMade();
                    case 1:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getPoints();
                    case 2:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getMetresMade());
                    case 3:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getHandlingError();
                    case 4:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getHandlingError());
                    case 5:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getTries();
                    case 6:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getCarriesCrossedGainLine();
                    case 7:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem3, rugbyTopTeamsStatisticsItem3.getCarriesCrossedGainLine());
                    case 8:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getCarriesNotMadeGainLine();
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getCarriesNotMadeGainLine());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getKickMetres();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getKickMetres());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getDropGoals();
                    case 13:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getKickFromHand();
                    case 14:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem6, rugbyTopTeamsStatisticsItem6.getKickFromHand());
                    case 15:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getPostContactMetres();
                    case 16:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getPostContactMetres());
                    case 17:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem8.getTries());
                    case 18:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getTackles();
                    case 19:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem9, rugbyTopTeamsStatisticsItem9.getTackles());
                    case 20:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getDominantTackles();
                    case 21:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem10, rugbyTopTeamsStatisticsItem10.getDominantTackles());
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getPenDefs();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem11.getDropGoals());
                    case 24:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem12.getPenDefs());
                    case 25:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getPenOffs();
                    case 26:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem13.getPenOffs());
                    case 27:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRucksWon();
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem14, rugbyTopTeamsStatisticsItem14.getRucksWon());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics16 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics16.getClass();
                        return rugbyTopTeamsStatistics16.getPenaltyTries();
                }
            }
        }, new Function1() { // from class: dpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i16) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getMetresMade();
                    case 1:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getPoints();
                    case 2:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getMetresMade());
                    case 3:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getHandlingError();
                    case 4:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getHandlingError());
                    case 5:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getTries();
                    case 6:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getCarriesCrossedGainLine();
                    case 7:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem3, rugbyTopTeamsStatisticsItem3.getCarriesCrossedGainLine());
                    case 8:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getCarriesNotMadeGainLine();
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getCarriesNotMadeGainLine());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getKickMetres();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getKickMetres());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getDropGoals();
                    case 13:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getKickFromHand();
                    case 14:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem6, rugbyTopTeamsStatisticsItem6.getKickFromHand());
                    case 15:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getPostContactMetres();
                    case 16:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getPostContactMetres());
                    case 17:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem8.getTries());
                    case 18:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getTackles();
                    case 19:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem9, rugbyTopTeamsStatisticsItem9.getTackles());
                    case 20:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getDominantTackles();
                    case 21:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem10, rugbyTopTeamsStatisticsItem10.getDominantTackles());
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getPenDefs();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem11.getDropGoals());
                    case 24:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem12.getPenDefs());
                    case 25:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getPenOffs();
                    case 26:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem13.getPenOffs());
                    case 27:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRucksWon();
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem14, rugbyTopTeamsStatisticsItem14.getRucksWon());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics16 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics16.getClass();
                        return rugbyTopTeamsStatistics16.getPenaltyTries();
                }
            }
        });
        final int i17 = 13;
        final int i18 = 14;
        fpj fpjVar19 = new fpj("KICKS_FROM_HAND", 18, R.string.rugby_kicks_from_hand_per_game, new Function1() { // from class: dpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i17) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getMetresMade();
                    case 1:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getPoints();
                    case 2:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getMetresMade());
                    case 3:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getHandlingError();
                    case 4:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getHandlingError());
                    case 5:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getTries();
                    case 6:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getCarriesCrossedGainLine();
                    case 7:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem3, rugbyTopTeamsStatisticsItem3.getCarriesCrossedGainLine());
                    case 8:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getCarriesNotMadeGainLine();
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getCarriesNotMadeGainLine());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getKickMetres();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getKickMetres());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getDropGoals();
                    case 13:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getKickFromHand();
                    case 14:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem6, rugbyTopTeamsStatisticsItem6.getKickFromHand());
                    case 15:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getPostContactMetres();
                    case 16:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getPostContactMetres());
                    case 17:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem8.getTries());
                    case 18:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getTackles();
                    case 19:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem9, rugbyTopTeamsStatisticsItem9.getTackles());
                    case 20:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getDominantTackles();
                    case 21:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem10, rugbyTopTeamsStatisticsItem10.getDominantTackles());
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getPenDefs();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem11.getDropGoals());
                    case 24:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem12.getPenDefs());
                    case 25:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getPenOffs();
                    case 26:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem13.getPenOffs());
                    case 27:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRucksWon();
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem14, rugbyTopTeamsStatisticsItem14.getRucksWon());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics16 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics16.getClass();
                        return rugbyTopTeamsStatistics16.getPenaltyTries();
                }
            }
        }, new Function1() { // from class: dpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i18) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getMetresMade();
                    case 1:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getPoints();
                    case 2:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getMetresMade());
                    case 3:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getHandlingError();
                    case 4:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getHandlingError());
                    case 5:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getTries();
                    case 6:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getCarriesCrossedGainLine();
                    case 7:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem3, rugbyTopTeamsStatisticsItem3.getCarriesCrossedGainLine());
                    case 8:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getCarriesNotMadeGainLine();
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getCarriesNotMadeGainLine());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getKickMetres();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getKickMetres());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getDropGoals();
                    case 13:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getKickFromHand();
                    case 14:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem6, rugbyTopTeamsStatisticsItem6.getKickFromHand());
                    case 15:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getPostContactMetres();
                    case 16:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getPostContactMetres());
                    case 17:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem8.getTries());
                    case 18:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getTackles();
                    case 19:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem9, rugbyTopTeamsStatisticsItem9.getTackles());
                    case 20:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getDominantTackles();
                    case 21:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem10, rugbyTopTeamsStatisticsItem10.getDominantTackles());
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getPenDefs();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem11.getDropGoals());
                    case 24:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem12.getPenDefs());
                    case 25:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getPenOffs();
                    case 26:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem13.getPenOffs());
                    case 27:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRucksWon();
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem14, rugbyTopTeamsStatisticsItem14.getRucksWon());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics16 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics16.getClass();
                        return rugbyTopTeamsStatistics16.getPenaltyTries();
                }
            }
        });
        final int i19 = 15;
        final int i20 = 16;
        fpj fpjVar20 = new fpj("POST_CONTACT_METRES", 19, R.string.rugby_post_contact_metres_per_game, new Function1() { // from class: dpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i19) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getMetresMade();
                    case 1:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getPoints();
                    case 2:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getMetresMade());
                    case 3:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getHandlingError();
                    case 4:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getHandlingError());
                    case 5:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getTries();
                    case 6:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getCarriesCrossedGainLine();
                    case 7:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem3, rugbyTopTeamsStatisticsItem3.getCarriesCrossedGainLine());
                    case 8:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getCarriesNotMadeGainLine();
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getCarriesNotMadeGainLine());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getKickMetres();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getKickMetres());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getDropGoals();
                    case 13:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getKickFromHand();
                    case 14:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem6, rugbyTopTeamsStatisticsItem6.getKickFromHand());
                    case 15:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getPostContactMetres();
                    case 16:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getPostContactMetres());
                    case 17:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem8.getTries());
                    case 18:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getTackles();
                    case 19:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem9, rugbyTopTeamsStatisticsItem9.getTackles());
                    case 20:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getDominantTackles();
                    case 21:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem10, rugbyTopTeamsStatisticsItem10.getDominantTackles());
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getPenDefs();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem11.getDropGoals());
                    case 24:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem12.getPenDefs());
                    case 25:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getPenOffs();
                    case 26:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem13.getPenOffs());
                    case 27:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRucksWon();
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem14, rugbyTopTeamsStatisticsItem14.getRucksWon());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics16 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics16.getClass();
                        return rugbyTopTeamsStatistics16.getPenaltyTries();
                }
            }
        }, new Function1() { // from class: dpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i20) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getMetresMade();
                    case 1:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getPoints();
                    case 2:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getMetresMade());
                    case 3:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getHandlingError();
                    case 4:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getHandlingError());
                    case 5:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getTries();
                    case 6:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getCarriesCrossedGainLine();
                    case 7:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem3, rugbyTopTeamsStatisticsItem3.getCarriesCrossedGainLine());
                    case 8:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getCarriesNotMadeGainLine();
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getCarriesNotMadeGainLine());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getKickMetres();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getKickMetres());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getDropGoals();
                    case 13:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getKickFromHand();
                    case 14:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem6, rugbyTopTeamsStatisticsItem6.getKickFromHand());
                    case 15:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getPostContactMetres();
                    case 16:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getPostContactMetres());
                    case 17:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem8.getTries());
                    case 18:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getTackles();
                    case 19:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem9, rugbyTopTeamsStatisticsItem9.getTackles());
                    case 20:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getDominantTackles();
                    case 21:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem10, rugbyTopTeamsStatisticsItem10.getDominantTackles());
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getPenDefs();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem11.getDropGoals());
                    case 24:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem12.getPenDefs());
                    case 25:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getPenOffs();
                    case 26:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem13.getPenOffs());
                    case 27:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRucksWon();
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem14, rugbyTopTeamsStatisticsItem14.getRucksWon());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics16 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics16.getClass();
                        return rugbyTopTeamsStatistics16.getPenaltyTries();
                }
            }
        });
        final int i21 = 18;
        final int i22 = 19;
        fpj fpjVar21 = new fpj("TACKLES", 20, R.string.rugby_tackles_made_per_game, new Function1() { // from class: dpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i21) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getMetresMade();
                    case 1:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getPoints();
                    case 2:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getMetresMade());
                    case 3:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getHandlingError();
                    case 4:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getHandlingError());
                    case 5:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getTries();
                    case 6:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getCarriesCrossedGainLine();
                    case 7:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem3, rugbyTopTeamsStatisticsItem3.getCarriesCrossedGainLine());
                    case 8:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getCarriesNotMadeGainLine();
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getCarriesNotMadeGainLine());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getKickMetres();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getKickMetres());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getDropGoals();
                    case 13:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getKickFromHand();
                    case 14:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem6, rugbyTopTeamsStatisticsItem6.getKickFromHand());
                    case 15:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getPostContactMetres();
                    case 16:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getPostContactMetres());
                    case 17:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem8.getTries());
                    case 18:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getTackles();
                    case 19:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem9, rugbyTopTeamsStatisticsItem9.getTackles());
                    case 20:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getDominantTackles();
                    case 21:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem10, rugbyTopTeamsStatisticsItem10.getDominantTackles());
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getPenDefs();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem11.getDropGoals());
                    case 24:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem12.getPenDefs());
                    case 25:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getPenOffs();
                    case 26:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem13.getPenOffs());
                    case 27:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRucksWon();
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem14, rugbyTopTeamsStatisticsItem14.getRucksWon());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics16 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics16.getClass();
                        return rugbyTopTeamsStatistics16.getPenaltyTries();
                }
            }
        }, new Function1() { // from class: dpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i22) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getMetresMade();
                    case 1:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getPoints();
                    case 2:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getMetresMade());
                    case 3:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getHandlingError();
                    case 4:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getHandlingError());
                    case 5:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getTries();
                    case 6:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getCarriesCrossedGainLine();
                    case 7:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem3, rugbyTopTeamsStatisticsItem3.getCarriesCrossedGainLine());
                    case 8:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getCarriesNotMadeGainLine();
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getCarriesNotMadeGainLine());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getKickMetres();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getKickMetres());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getDropGoals();
                    case 13:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getKickFromHand();
                    case 14:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem6, rugbyTopTeamsStatisticsItem6.getKickFromHand());
                    case 15:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getPostContactMetres();
                    case 16:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getPostContactMetres());
                    case 17:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem8.getTries());
                    case 18:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getTackles();
                    case 19:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem9, rugbyTopTeamsStatisticsItem9.getTackles());
                    case 20:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getDominantTackles();
                    case 21:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem10, rugbyTopTeamsStatisticsItem10.getDominantTackles());
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getPenDefs();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem11.getDropGoals());
                    case 24:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem12.getPenDefs());
                    case 25:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getPenOffs();
                    case 26:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem13.getPenOffs());
                    case 27:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRucksWon();
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem14, rugbyTopTeamsStatisticsItem14.getRucksWon());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics16 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics16.getClass();
                        return rugbyTopTeamsStatistics16.getPenaltyTries();
                }
            }
        });
        final int i23 = 20;
        final int i24 = 21;
        fpj fpjVar22 = new fpj("DOMINANT_TACKLES", 21, R.string.rugby_dominant_tackles_per_game, new Function1() { // from class: dpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i23) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getMetresMade();
                    case 1:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getPoints();
                    case 2:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getMetresMade());
                    case 3:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getHandlingError();
                    case 4:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getHandlingError());
                    case 5:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getTries();
                    case 6:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getCarriesCrossedGainLine();
                    case 7:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem3, rugbyTopTeamsStatisticsItem3.getCarriesCrossedGainLine());
                    case 8:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getCarriesNotMadeGainLine();
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getCarriesNotMadeGainLine());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getKickMetres();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getKickMetres());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getDropGoals();
                    case 13:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getKickFromHand();
                    case 14:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem6, rugbyTopTeamsStatisticsItem6.getKickFromHand());
                    case 15:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getPostContactMetres();
                    case 16:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getPostContactMetres());
                    case 17:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem8.getTries());
                    case 18:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getTackles();
                    case 19:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem9, rugbyTopTeamsStatisticsItem9.getTackles());
                    case 20:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getDominantTackles();
                    case 21:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem10, rugbyTopTeamsStatisticsItem10.getDominantTackles());
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getPenDefs();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem11.getDropGoals());
                    case 24:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem12.getPenDefs());
                    case 25:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getPenOffs();
                    case 26:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem13.getPenOffs());
                    case 27:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRucksWon();
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem14, rugbyTopTeamsStatisticsItem14.getRucksWon());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics16 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics16.getClass();
                        return rugbyTopTeamsStatistics16.getPenaltyTries();
                }
            }
        }, new Function1() { // from class: dpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i24) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getMetresMade();
                    case 1:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getPoints();
                    case 2:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getMetresMade());
                    case 3:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getHandlingError();
                    case 4:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getHandlingError());
                    case 5:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getTries();
                    case 6:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getCarriesCrossedGainLine();
                    case 7:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem3, rugbyTopTeamsStatisticsItem3.getCarriesCrossedGainLine());
                    case 8:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getCarriesNotMadeGainLine();
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getCarriesNotMadeGainLine());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getKickMetres();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getKickMetres());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getDropGoals();
                    case 13:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getKickFromHand();
                    case 14:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem6, rugbyTopTeamsStatisticsItem6.getKickFromHand());
                    case 15:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getPostContactMetres();
                    case 16:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getPostContactMetres());
                    case 17:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem8.getTries());
                    case 18:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getTackles();
                    case 19:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem9, rugbyTopTeamsStatisticsItem9.getTackles());
                    case 20:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getDominantTackles();
                    case 21:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem10, rugbyTopTeamsStatisticsItem10.getDominantTackles());
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getPenDefs();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem11.getDropGoals());
                    case 24:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem12.getPenDefs());
                    case 25:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getPenOffs();
                    case 26:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem13.getPenOffs());
                    case 27:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRucksWon();
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem14, rugbyTopTeamsStatisticsItem14.getRucksWon());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics16 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics16.getClass();
                        return rugbyTopTeamsStatistics16.getPenaltyTries();
                }
            }
        });
        final int i25 = 22;
        final int i26 = 24;
        fpj fpjVar23 = new fpj("PEN_DEFS", 22, R.string.rugby_defensive_penalties_conceded, new Function1() { // from class: dpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i25) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getMetresMade();
                    case 1:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getPoints();
                    case 2:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getMetresMade());
                    case 3:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getHandlingError();
                    case 4:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getHandlingError());
                    case 5:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getTries();
                    case 6:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getCarriesCrossedGainLine();
                    case 7:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem3, rugbyTopTeamsStatisticsItem3.getCarriesCrossedGainLine());
                    case 8:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getCarriesNotMadeGainLine();
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getCarriesNotMadeGainLine());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getKickMetres();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getKickMetres());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getDropGoals();
                    case 13:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getKickFromHand();
                    case 14:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem6, rugbyTopTeamsStatisticsItem6.getKickFromHand());
                    case 15:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getPostContactMetres();
                    case 16:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getPostContactMetres());
                    case 17:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem8.getTries());
                    case 18:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getTackles();
                    case 19:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem9, rugbyTopTeamsStatisticsItem9.getTackles());
                    case 20:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getDominantTackles();
                    case 21:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem10, rugbyTopTeamsStatisticsItem10.getDominantTackles());
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getPenDefs();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem11.getDropGoals());
                    case 24:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem12.getPenDefs());
                    case 25:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getPenOffs();
                    case 26:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem13.getPenOffs());
                    case 27:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRucksWon();
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem14, rugbyTopTeamsStatisticsItem14.getRucksWon());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics16 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics16.getClass();
                        return rugbyTopTeamsStatistics16.getPenaltyTries();
                }
            }
        }, new Function1() { // from class: dpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i26) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getMetresMade();
                    case 1:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getPoints();
                    case 2:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getMetresMade());
                    case 3:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getHandlingError();
                    case 4:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getHandlingError());
                    case 5:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getTries();
                    case 6:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getCarriesCrossedGainLine();
                    case 7:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem3, rugbyTopTeamsStatisticsItem3.getCarriesCrossedGainLine());
                    case 8:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getCarriesNotMadeGainLine();
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getCarriesNotMadeGainLine());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getKickMetres();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getKickMetres());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getDropGoals();
                    case 13:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getKickFromHand();
                    case 14:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem6, rugbyTopTeamsStatisticsItem6.getKickFromHand());
                    case 15:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getPostContactMetres();
                    case 16:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getPostContactMetres());
                    case 17:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem8.getTries());
                    case 18:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getTackles();
                    case 19:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem9, rugbyTopTeamsStatisticsItem9.getTackles());
                    case 20:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getDominantTackles();
                    case 21:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem10, rugbyTopTeamsStatisticsItem10.getDominantTackles());
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getPenDefs();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem11.getDropGoals());
                    case 24:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem12.getPenDefs());
                    case 25:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getPenOffs();
                    case 26:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem13.getPenOffs());
                    case 27:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRucksWon();
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem14, rugbyTopTeamsStatisticsItem14.getRucksWon());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics16 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics16.getClass();
                        return rugbyTopTeamsStatistics16.getPenaltyTries();
                }
            }
        });
        final int i27 = 25;
        final int i28 = 26;
        fpj fpjVar24 = new fpj("PEN_OFFS", 23, R.string.rugby_offensive_penalties_conceded, new Function1() { // from class: dpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i27) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getMetresMade();
                    case 1:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getPoints();
                    case 2:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getMetresMade());
                    case 3:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getHandlingError();
                    case 4:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getHandlingError());
                    case 5:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getTries();
                    case 6:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getCarriesCrossedGainLine();
                    case 7:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem3, rugbyTopTeamsStatisticsItem3.getCarriesCrossedGainLine());
                    case 8:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getCarriesNotMadeGainLine();
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getCarriesNotMadeGainLine());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getKickMetres();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getKickMetres());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getDropGoals();
                    case 13:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getKickFromHand();
                    case 14:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem6, rugbyTopTeamsStatisticsItem6.getKickFromHand());
                    case 15:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getPostContactMetres();
                    case 16:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getPostContactMetres());
                    case 17:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem8.getTries());
                    case 18:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getTackles();
                    case 19:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem9, rugbyTopTeamsStatisticsItem9.getTackles());
                    case 20:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getDominantTackles();
                    case 21:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem10, rugbyTopTeamsStatisticsItem10.getDominantTackles());
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getPenDefs();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem11.getDropGoals());
                    case 24:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem12.getPenDefs());
                    case 25:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getPenOffs();
                    case 26:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem13.getPenOffs());
                    case 27:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRucksWon();
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem14, rugbyTopTeamsStatisticsItem14.getRucksWon());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics16 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics16.getClass();
                        return rugbyTopTeamsStatistics16.getPenaltyTries();
                }
            }
        }, new Function1() { // from class: dpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i28) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getMetresMade();
                    case 1:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getPoints();
                    case 2:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getMetresMade());
                    case 3:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getHandlingError();
                    case 4:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getHandlingError());
                    case 5:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getTries();
                    case 6:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getCarriesCrossedGainLine();
                    case 7:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem3, rugbyTopTeamsStatisticsItem3.getCarriesCrossedGainLine());
                    case 8:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getCarriesNotMadeGainLine();
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getCarriesNotMadeGainLine());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getKickMetres();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getKickMetres());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getDropGoals();
                    case 13:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getKickFromHand();
                    case 14:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem6, rugbyTopTeamsStatisticsItem6.getKickFromHand());
                    case 15:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getPostContactMetres();
                    case 16:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getPostContactMetres());
                    case 17:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem8.getTries());
                    case 18:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getTackles();
                    case 19:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem9, rugbyTopTeamsStatisticsItem9.getTackles());
                    case 20:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getDominantTackles();
                    case 21:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem10, rugbyTopTeamsStatisticsItem10.getDominantTackles());
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getPenDefs();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem11.getDropGoals());
                    case 24:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem12.getPenDefs());
                    case 25:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getPenOffs();
                    case 26:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem13.getPenOffs());
                    case 27:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRucksWon();
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem14, rugbyTopTeamsStatisticsItem14.getRucksWon());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics16 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics16.getClass();
                        return rugbyTopTeamsStatistics16.getPenaltyTries();
                }
            }
        });
        final int i29 = 27;
        final int i30 = 28;
        fpj[] fpjVarArr = {fpjVar, fpjVar2, fpjVar3, fpjVar4, fpjVar5, fpjVar6, fpjVar7, fpjVar8, fpjVar9, fpjVar10, fpjVar11, fpjVar12, fpjVar13, fpjVar14, fpjVar15, fpjVar16, fpjVar17, fpjVar18, fpjVar19, fpjVar20, fpjVar21, fpjVar22, fpjVar23, fpjVar24, new fpj("RUCKS_WON", 24, R.string.rugby_rucks_won_per_game, new Function1() { // from class: dpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i29) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getMetresMade();
                    case 1:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getPoints();
                    case 2:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getMetresMade());
                    case 3:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getHandlingError();
                    case 4:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getHandlingError());
                    case 5:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getTries();
                    case 6:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getCarriesCrossedGainLine();
                    case 7:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem3, rugbyTopTeamsStatisticsItem3.getCarriesCrossedGainLine());
                    case 8:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getCarriesNotMadeGainLine();
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getCarriesNotMadeGainLine());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getKickMetres();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getKickMetres());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getDropGoals();
                    case 13:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getKickFromHand();
                    case 14:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem6, rugbyTopTeamsStatisticsItem6.getKickFromHand());
                    case 15:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getPostContactMetres();
                    case 16:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getPostContactMetres());
                    case 17:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem8.getTries());
                    case 18:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getTackles();
                    case 19:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem9, rugbyTopTeamsStatisticsItem9.getTackles());
                    case 20:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getDominantTackles();
                    case 21:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem10, rugbyTopTeamsStatisticsItem10.getDominantTackles());
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getPenDefs();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem11.getDropGoals());
                    case 24:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem12.getPenDefs());
                    case 25:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getPenOffs();
                    case 26:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem13.getPenOffs());
                    case 27:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRucksWon();
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem14, rugbyTopTeamsStatisticsItem14.getRucksWon());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics16 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics16.getClass();
                        return rugbyTopTeamsStatistics16.getPenaltyTries();
                }
            }
        }, new Function1() { // from class: dpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i30) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getMetresMade();
                    case 1:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getPoints();
                    case 2:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getMetresMade());
                    case 3:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getHandlingError();
                    case 4:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getHandlingError());
                    case 5:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getTries();
                    case 6:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getCarriesCrossedGainLine();
                    case 7:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem3, rugbyTopTeamsStatisticsItem3.getCarriesCrossedGainLine());
                    case 8:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getCarriesNotMadeGainLine();
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getCarriesNotMadeGainLine());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getKickMetres();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getKickMetres());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getDropGoals();
                    case 13:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getKickFromHand();
                    case 14:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem6, rugbyTopTeamsStatisticsItem6.getKickFromHand());
                    case 15:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getPostContactMetres();
                    case 16:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getPostContactMetres());
                    case 17:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem8.getTries());
                    case 18:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getTackles();
                    case 19:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem9, rugbyTopTeamsStatisticsItem9.getTackles());
                    case 20:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getDominantTackles();
                    case 21:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem10, rugbyTopTeamsStatisticsItem10.getDominantTackles());
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getPenDefs();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem11.getDropGoals());
                    case 24:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem12.getPenDefs());
                    case 25:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getPenOffs();
                    case 26:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem13.getPenOffs());
                    case 27:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRucksWon();
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem14, rugbyTopTeamsStatisticsItem14.getRucksWon());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics16 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics16.getClass();
                        return rugbyTopTeamsStatistics16.getPenaltyTries();
                }
            }
        }), new fpj("RUCK_ARRIVAL", 25, R.string.rugby_ruck_arrivals_per_game, new epj(0), new epj(1)), new fpj("RUCK_ARRIVAL_ATTACK", 26, R.string.rugby_attacking_ruck_arrivals_per_game, new epj(2), new epj(3)), new fpj("RUCK_ARRIVAL_DEFENCE", 27, R.string.rugby_defensive_ruck_arrivals_per_game, new epj(5), new epj(6)), new fpj("RUCK_SPEED_0_3", 28, R.string.rugby_rucks_0_3_sec_per_game, new epj(7), new epj(8)), new fpj("RUCK_SPEED_3_6", 29, R.string.rugby_rucks_3_6_sec_per_game, new epj(9), new epj(10)), new fpj("RUCK_SPEED_6_PLUS", 30, R.string.rugby_rucks_over_6_sec_per_game, new epj(12), new epj(13)), new fpj("YELLOW_CARDS", 31, R.string.rugby_yellow_cards, new epj(14), new epj(16)), new fpj("RED_CARDS", 32, R.string.rugby_red_cards, new epj(17), new epj(18)), new fpj("PENALTIES_CONCEDED", 33, R.string.rugby_penalty_conceded, new epj(19), new epj(20))};
        d = fpjVarArr;
        e = new kp5(fpjVarArr);
    }

    public fpj(String str, int i, int i2, Function1 function1, Function1 function12) {
        this.a = i2;
        this.b = function1;
        this.c = function12;
    }

    public static fpj valueOf(String str) {
        return (fpj) Enum.valueOf(fpj.class, str);
    }

    public static fpj[] values() {
        return (fpj[]) d.clone();
    }

    @Override // defpackage.ipj
    public final /* bridge */ String a(Object obj) {
        return super.a((RugbyTopTeamsStatisticsItem) obj);
    }

    @Override // defpackage.ipj
    public final /* bridge */ List b(Object obj) {
        return super.b((RugbyTopTeamsStatistics) obj);
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
