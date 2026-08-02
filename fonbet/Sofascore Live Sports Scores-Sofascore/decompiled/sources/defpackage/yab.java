package defpackage;

import android.content.Context;
import com.sofascore.model.newNetwork.topperformance.response.RugbyTopPlayersStatistics;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.RugbyTopPlayersStatisticsItem;
import com.sofascore.results.R;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class yab implements zab {
    public static final /* synthetic */ yab[] d;
    public static final /* synthetic */ kp5 e;
    public final int a;
    public final Function1 b;
    public final Function1 c;

    static {
        yab yabVar = new yab("POINTS", 0, R.string.rugby_points, new uab(15), new uab(17));
        final int i = 11;
        yab yabVar2 = new yab("TRIES", 1, R.string.rugby_tries, new uab(29), new Function1() { // from class: wab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i) {
                    case 0:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics.getClass();
                        return rugbyTopPlayersStatistics.getKicksFromHand();
                    case 1:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem.getKicksFromHand());
                    case 2:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics2 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics2.getClass();
                        return rugbyTopPlayersStatistics2.getPostContactMetres();
                    case 3:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem2 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem2.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem2.getPostContactMetres());
                    case 4:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics3 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics3.getClass();
                        return rugbyTopPlayersStatistics3.getTryAssist();
                    case 5:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem3 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem3.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem3.getTryAssist());
                    case 6:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics4 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics4.getClass();
                        return rugbyTopPlayersStatistics4.getTackles();
                    case 7:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem4 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem4.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem4.getPassesSuccessful());
                    case 8:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem5 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem5.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem5.getTackles());
                    case 9:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics5 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics5.getClass();
                        return rugbyTopPlayersStatistics5.getDominantTackles();
                    case 10:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem6 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem6.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem6.getDominantTackles());
                    case 11:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem7 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem7.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem7.getTries());
                    case 12:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics6 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics6.getClass();
                        return rugbyTopPlayersStatistics6.getPenDefs();
                    case 13:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem8 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem8.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem8.getPenDefs());
                    case 14:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics7 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics7.getClass();
                        return rugbyTopPlayersStatistics7.getPenOffs();
                    case 15:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem9 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem9.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem9.getPenOffs());
                    case 16:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics8 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics8.getClass();
                        return rugbyTopPlayersStatistics8.getLineoutsWon();
                    case 17:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem10 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem10.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem10.getLineoutsWon());
                    case 18:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics9 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics9.getClass();
                        return rugbyTopPlayersStatistics9.getOffloads();
                    case 19:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics10 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics10.getClass();
                        return rugbyTopPlayersStatistics10.getLineoutWonSteal();
                    case 20:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem11 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem11.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem11.getLineoutWonSteal());
                    case 21:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics11 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics11.getClass();
                        return rugbyTopPlayersStatistics11.getRuckArrival();
                    case 22:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem12 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem12.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem12.getRuckArrival());
                    case 23:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics12 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics12.getClass();
                        return rugbyTopPlayersStatistics12.getPenaltyGoals();
                    case 24:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics13 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics13.getClass();
                        return rugbyTopPlayersStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem13 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem13.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics14 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics14.getClass();
                        return rugbyTopPlayersStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem14 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem14.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem14.getRuckArrivalDefence());
                    case 28:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics15 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics15.getClass();
                        return rugbyTopPlayersStatistics15.getYellowCards();
                    default:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem15 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem15.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem15.getOffloads());
                }
            }
        });
        final int i2 = 23;
        yab yabVar3 = new yab("PENALTY_GOALS", 2, R.string.rugby_penalty_goals, new Function1() { // from class: wab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i2) {
                    case 0:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics.getClass();
                        return rugbyTopPlayersStatistics.getKicksFromHand();
                    case 1:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem.getKicksFromHand());
                    case 2:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics2 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics2.getClass();
                        return rugbyTopPlayersStatistics2.getPostContactMetres();
                    case 3:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem2 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem2.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem2.getPostContactMetres());
                    case 4:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics3 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics3.getClass();
                        return rugbyTopPlayersStatistics3.getTryAssist();
                    case 5:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem3 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem3.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem3.getTryAssist());
                    case 6:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics4 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics4.getClass();
                        return rugbyTopPlayersStatistics4.getTackles();
                    case 7:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem4 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem4.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem4.getPassesSuccessful());
                    case 8:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem5 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem5.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem5.getTackles());
                    case 9:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics5 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics5.getClass();
                        return rugbyTopPlayersStatistics5.getDominantTackles();
                    case 10:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem6 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem6.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem6.getDominantTackles());
                    case 11:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem7 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem7.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem7.getTries());
                    case 12:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics6 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics6.getClass();
                        return rugbyTopPlayersStatistics6.getPenDefs();
                    case 13:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem8 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem8.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem8.getPenDefs());
                    case 14:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics7 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics7.getClass();
                        return rugbyTopPlayersStatistics7.getPenOffs();
                    case 15:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem9 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem9.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem9.getPenOffs());
                    case 16:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics8 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics8.getClass();
                        return rugbyTopPlayersStatistics8.getLineoutsWon();
                    case 17:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem10 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem10.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem10.getLineoutsWon());
                    case 18:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics9 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics9.getClass();
                        return rugbyTopPlayersStatistics9.getOffloads();
                    case 19:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics10 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics10.getClass();
                        return rugbyTopPlayersStatistics10.getLineoutWonSteal();
                    case 20:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem11 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem11.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem11.getLineoutWonSteal());
                    case 21:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics11 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics11.getClass();
                        return rugbyTopPlayersStatistics11.getRuckArrival();
                    case 22:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem12 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem12.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem12.getRuckArrival());
                    case 23:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics12 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics12.getClass();
                        return rugbyTopPlayersStatistics12.getPenaltyGoals();
                    case 24:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics13 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics13.getClass();
                        return rugbyTopPlayersStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem13 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem13.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics14 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics14.getClass();
                        return rugbyTopPlayersStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem14 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem14.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem14.getRuckArrivalDefence());
                    case 28:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics15 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics15.getClass();
                        return rugbyTopPlayersStatistics15.getYellowCards();
                    default:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem15 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem15.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem15.getOffloads());
                }
            }
        }, new xab(3));
        yab yabVar4 = new yab("CONVERSIONS", 3, R.string.rugby_conversions, new xab(4), new xab(5));
        yab yabVar5 = new yab("DROP_GOALS", 4, R.string.rugby_drop_goals, new xab(6), new xab(7));
        final int i3 = 7;
        yab yabVar6 = new yab("PASSES_MADE", 5, R.string.rugby_passes_made, new uab(26), new Function1() { // from class: wab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i3) {
                    case 0:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics.getClass();
                        return rugbyTopPlayersStatistics.getKicksFromHand();
                    case 1:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem.getKicksFromHand());
                    case 2:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics2 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics2.getClass();
                        return rugbyTopPlayersStatistics2.getPostContactMetres();
                    case 3:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem2 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem2.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem2.getPostContactMetres());
                    case 4:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics3 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics3.getClass();
                        return rugbyTopPlayersStatistics3.getTryAssist();
                    case 5:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem3 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem3.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem3.getTryAssist());
                    case 6:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics4 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics4.getClass();
                        return rugbyTopPlayersStatistics4.getTackles();
                    case 7:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem4 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem4.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem4.getPassesSuccessful());
                    case 8:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem5 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem5.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem5.getTackles());
                    case 9:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics5 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics5.getClass();
                        return rugbyTopPlayersStatistics5.getDominantTackles();
                    case 10:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem6 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem6.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem6.getDominantTackles());
                    case 11:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem7 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem7.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem7.getTries());
                    case 12:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics6 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics6.getClass();
                        return rugbyTopPlayersStatistics6.getPenDefs();
                    case 13:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem8 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem8.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem8.getPenDefs());
                    case 14:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics7 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics7.getClass();
                        return rugbyTopPlayersStatistics7.getPenOffs();
                    case 15:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem9 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem9.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem9.getPenOffs());
                    case 16:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics8 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics8.getClass();
                        return rugbyTopPlayersStatistics8.getLineoutsWon();
                    case 17:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem10 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem10.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem10.getLineoutsWon());
                    case 18:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics9 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics9.getClass();
                        return rugbyTopPlayersStatistics9.getOffloads();
                    case 19:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics10 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics10.getClass();
                        return rugbyTopPlayersStatistics10.getLineoutWonSteal();
                    case 20:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem11 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem11.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem11.getLineoutWonSteal());
                    case 21:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics11 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics11.getClass();
                        return rugbyTopPlayersStatistics11.getRuckArrival();
                    case 22:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem12 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem12.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem12.getRuckArrival());
                    case 23:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics12 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics12.getClass();
                        return rugbyTopPlayersStatistics12.getPenaltyGoals();
                    case 24:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics13 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics13.getClass();
                        return rugbyTopPlayersStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem13 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem13.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics14 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics14.getClass();
                        return rugbyTopPlayersStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem14 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem14.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem14.getRuckArrivalDefence());
                    case 28:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics15 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics15.getClass();
                        return rugbyTopPlayersStatistics15.getYellowCards();
                    default:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem15 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem15.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem15.getOffloads());
                }
            }
        });
        final int i4 = 18;
        Function1 function1 = new Function1() { // from class: wab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i4) {
                    case 0:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics.getClass();
                        return rugbyTopPlayersStatistics.getKicksFromHand();
                    case 1:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem.getKicksFromHand());
                    case 2:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics2 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics2.getClass();
                        return rugbyTopPlayersStatistics2.getPostContactMetres();
                    case 3:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem2 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem2.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem2.getPostContactMetres());
                    case 4:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics3 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics3.getClass();
                        return rugbyTopPlayersStatistics3.getTryAssist();
                    case 5:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem3 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem3.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem3.getTryAssist());
                    case 6:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics4 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics4.getClass();
                        return rugbyTopPlayersStatistics4.getTackles();
                    case 7:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem4 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem4.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem4.getPassesSuccessful());
                    case 8:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem5 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem5.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem5.getTackles());
                    case 9:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics5 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics5.getClass();
                        return rugbyTopPlayersStatistics5.getDominantTackles();
                    case 10:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem6 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem6.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem6.getDominantTackles());
                    case 11:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem7 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem7.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem7.getTries());
                    case 12:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics6 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics6.getClass();
                        return rugbyTopPlayersStatistics6.getPenDefs();
                    case 13:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem8 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem8.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem8.getPenDefs());
                    case 14:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics7 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics7.getClass();
                        return rugbyTopPlayersStatistics7.getPenOffs();
                    case 15:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem9 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem9.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem9.getPenOffs());
                    case 16:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics8 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics8.getClass();
                        return rugbyTopPlayersStatistics8.getLineoutsWon();
                    case 17:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem10 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem10.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem10.getLineoutsWon());
                    case 18:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics9 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics9.getClass();
                        return rugbyTopPlayersStatistics9.getOffloads();
                    case 19:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics10 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics10.getClass();
                        return rugbyTopPlayersStatistics10.getLineoutWonSteal();
                    case 20:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem11 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem11.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem11.getLineoutWonSteal());
                    case 21:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics11 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics11.getClass();
                        return rugbyTopPlayersStatistics11.getRuckArrival();
                    case 22:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem12 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem12.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem12.getRuckArrival());
                    case 23:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics12 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics12.getClass();
                        return rugbyTopPlayersStatistics12.getPenaltyGoals();
                    case 24:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics13 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics13.getClass();
                        return rugbyTopPlayersStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem13 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem13.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics14 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics14.getClass();
                        return rugbyTopPlayersStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem14 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem14.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem14.getRuckArrivalDefence());
                    case 28:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics15 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics15.getClass();
                        return rugbyTopPlayersStatistics15.getYellowCards();
                    default:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem15 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem15.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem15.getOffloads());
                }
            }
        };
        final int i5 = 29;
        yab yabVar7 = new yab("OFFLOADS", 6, R.string.rugby_offloads, function1, new Function1() { // from class: wab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i5) {
                    case 0:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics.getClass();
                        return rugbyTopPlayersStatistics.getKicksFromHand();
                    case 1:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem.getKicksFromHand());
                    case 2:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics2 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics2.getClass();
                        return rugbyTopPlayersStatistics2.getPostContactMetres();
                    case 3:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem2 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem2.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem2.getPostContactMetres());
                    case 4:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics3 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics3.getClass();
                        return rugbyTopPlayersStatistics3.getTryAssist();
                    case 5:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem3 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem3.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem3.getTryAssist());
                    case 6:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics4 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics4.getClass();
                        return rugbyTopPlayersStatistics4.getTackles();
                    case 7:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem4 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem4.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem4.getPassesSuccessful());
                    case 8:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem5 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem5.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem5.getTackles());
                    case 9:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics5 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics5.getClass();
                        return rugbyTopPlayersStatistics5.getDominantTackles();
                    case 10:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem6 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem6.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem6.getDominantTackles());
                    case 11:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem7 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem7.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem7.getTries());
                    case 12:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics6 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics6.getClass();
                        return rugbyTopPlayersStatistics6.getPenDefs();
                    case 13:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem8 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem8.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem8.getPenDefs());
                    case 14:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics7 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics7.getClass();
                        return rugbyTopPlayersStatistics7.getPenOffs();
                    case 15:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem9 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem9.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem9.getPenOffs());
                    case 16:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics8 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics8.getClass();
                        return rugbyTopPlayersStatistics8.getLineoutsWon();
                    case 17:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem10 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem10.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem10.getLineoutsWon());
                    case 18:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics9 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics9.getClass();
                        return rugbyTopPlayersStatistics9.getOffloads();
                    case 19:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics10 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics10.getClass();
                        return rugbyTopPlayersStatistics10.getLineoutWonSteal();
                    case 20:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem11 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem11.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem11.getLineoutWonSteal());
                    case 21:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics11 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics11.getClass();
                        return rugbyTopPlayersStatistics11.getRuckArrival();
                    case 22:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem12 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem12.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem12.getRuckArrival());
                    case 23:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics12 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics12.getClass();
                        return rugbyTopPlayersStatistics12.getPenaltyGoals();
                    case 24:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics13 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics13.getClass();
                        return rugbyTopPlayersStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem13 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem13.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics14 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics14.getClass();
                        return rugbyTopPlayersStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem14 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem14.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem14.getRuckArrivalDefence());
                    case 28:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics15 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics15.getClass();
                        return rugbyTopPlayersStatistics15.getYellowCards();
                    default:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem15 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem15.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem15.getOffloads());
                }
            }
        });
        yab yabVar8 = new yab("CARRIES", 7, R.string.rugby_carries, new xab(8), new xab(9));
        yab yabVar9 = new yab("CLEAN_BREAKS", 8, R.string.rugby_clean_breaks, new xab(10), new xab(11));
        yab yabVar10 = new yab("DEFENDERS_BEATEN", 9, R.string.rugby_defenders_beaten, new xab(12), new uab(16));
        yab yabVar11 = new yab("METRES_MADE", 10, R.string.rugby_metres_gained, new uab(18), new uab(19));
        yab yabVar12 = new yab("HANDLING_ERROR", 11, R.string.rugby_handling_errors, new uab(20), new uab(21));
        yab yabVar13 = new yab("CARRIES_CROSSED_GAIN_LINE", 12, R.string.rugby_carries_crossed_gained_line, new uab(22), new uab(23));
        yab yabVar14 = new yab("CARRIES_NOT_MADE_GAIN_LINE", 13, R.string.rugby_carries_not_made_gain_line, new uab(24), new uab(25));
        yab yabVar15 = new yab("KICK_METRES", 14, R.string.rugby_kick_metres, new uab(27), new uab(28));
        final int i6 = 0;
        final int i7 = 1;
        yab yabVar16 = new yab("KICKS_FROM_HAND", 15, R.string.rugby_kicks_from_hand, new Function1() { // from class: wab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i6) {
                    case 0:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics.getClass();
                        return rugbyTopPlayersStatistics.getKicksFromHand();
                    case 1:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem.getKicksFromHand());
                    case 2:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics2 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics2.getClass();
                        return rugbyTopPlayersStatistics2.getPostContactMetres();
                    case 3:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem2 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem2.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem2.getPostContactMetres());
                    case 4:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics3 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics3.getClass();
                        return rugbyTopPlayersStatistics3.getTryAssist();
                    case 5:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem3 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem3.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem3.getTryAssist());
                    case 6:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics4 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics4.getClass();
                        return rugbyTopPlayersStatistics4.getTackles();
                    case 7:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem4 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem4.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem4.getPassesSuccessful());
                    case 8:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem5 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem5.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem5.getTackles());
                    case 9:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics5 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics5.getClass();
                        return rugbyTopPlayersStatistics5.getDominantTackles();
                    case 10:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem6 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem6.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem6.getDominantTackles());
                    case 11:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem7 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem7.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem7.getTries());
                    case 12:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics6 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics6.getClass();
                        return rugbyTopPlayersStatistics6.getPenDefs();
                    case 13:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem8 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem8.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem8.getPenDefs());
                    case 14:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics7 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics7.getClass();
                        return rugbyTopPlayersStatistics7.getPenOffs();
                    case 15:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem9 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem9.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem9.getPenOffs());
                    case 16:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics8 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics8.getClass();
                        return rugbyTopPlayersStatistics8.getLineoutsWon();
                    case 17:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem10 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem10.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem10.getLineoutsWon());
                    case 18:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics9 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics9.getClass();
                        return rugbyTopPlayersStatistics9.getOffloads();
                    case 19:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics10 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics10.getClass();
                        return rugbyTopPlayersStatistics10.getLineoutWonSteal();
                    case 20:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem11 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem11.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem11.getLineoutWonSteal());
                    case 21:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics11 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics11.getClass();
                        return rugbyTopPlayersStatistics11.getRuckArrival();
                    case 22:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem12 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem12.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem12.getRuckArrival());
                    case 23:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics12 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics12.getClass();
                        return rugbyTopPlayersStatistics12.getPenaltyGoals();
                    case 24:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics13 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics13.getClass();
                        return rugbyTopPlayersStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem13 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem13.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics14 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics14.getClass();
                        return rugbyTopPlayersStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem14 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem14.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem14.getRuckArrivalDefence());
                    case 28:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics15 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics15.getClass();
                        return rugbyTopPlayersStatistics15.getYellowCards();
                    default:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem15 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem15.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem15.getOffloads());
                }
            }
        }, new Function1() { // from class: wab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i7) {
                    case 0:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics.getClass();
                        return rugbyTopPlayersStatistics.getKicksFromHand();
                    case 1:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem.getKicksFromHand());
                    case 2:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics2 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics2.getClass();
                        return rugbyTopPlayersStatistics2.getPostContactMetres();
                    case 3:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem2 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem2.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem2.getPostContactMetres());
                    case 4:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics3 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics3.getClass();
                        return rugbyTopPlayersStatistics3.getTryAssist();
                    case 5:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem3 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem3.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem3.getTryAssist());
                    case 6:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics4 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics4.getClass();
                        return rugbyTopPlayersStatistics4.getTackles();
                    case 7:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem4 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem4.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem4.getPassesSuccessful());
                    case 8:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem5 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem5.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem5.getTackles());
                    case 9:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics5 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics5.getClass();
                        return rugbyTopPlayersStatistics5.getDominantTackles();
                    case 10:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem6 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem6.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem6.getDominantTackles());
                    case 11:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem7 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem7.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem7.getTries());
                    case 12:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics6 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics6.getClass();
                        return rugbyTopPlayersStatistics6.getPenDefs();
                    case 13:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem8 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem8.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem8.getPenDefs());
                    case 14:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics7 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics7.getClass();
                        return rugbyTopPlayersStatistics7.getPenOffs();
                    case 15:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem9 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem9.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem9.getPenOffs());
                    case 16:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics8 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics8.getClass();
                        return rugbyTopPlayersStatistics8.getLineoutsWon();
                    case 17:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem10 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem10.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem10.getLineoutsWon());
                    case 18:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics9 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics9.getClass();
                        return rugbyTopPlayersStatistics9.getOffloads();
                    case 19:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics10 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics10.getClass();
                        return rugbyTopPlayersStatistics10.getLineoutWonSteal();
                    case 20:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem11 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem11.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem11.getLineoutWonSteal());
                    case 21:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics11 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics11.getClass();
                        return rugbyTopPlayersStatistics11.getRuckArrival();
                    case 22:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem12 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem12.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem12.getRuckArrival());
                    case 23:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics12 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics12.getClass();
                        return rugbyTopPlayersStatistics12.getPenaltyGoals();
                    case 24:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics13 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics13.getClass();
                        return rugbyTopPlayersStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem13 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem13.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics14 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics14.getClass();
                        return rugbyTopPlayersStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem14 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem14.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem14.getRuckArrivalDefence());
                    case 28:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics15 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics15.getClass();
                        return rugbyTopPlayersStatistics15.getYellowCards();
                    default:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem15 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem15.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem15.getOffloads());
                }
            }
        });
        final int i8 = 2;
        final int i9 = 3;
        yab yabVar17 = new yab("POST_CONTACT_METRES", 16, R.string.rugby_post_contact_metres, new Function1() { // from class: wab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i8) {
                    case 0:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics.getClass();
                        return rugbyTopPlayersStatistics.getKicksFromHand();
                    case 1:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem.getKicksFromHand());
                    case 2:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics2 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics2.getClass();
                        return rugbyTopPlayersStatistics2.getPostContactMetres();
                    case 3:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem2 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem2.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem2.getPostContactMetres());
                    case 4:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics3 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics3.getClass();
                        return rugbyTopPlayersStatistics3.getTryAssist();
                    case 5:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem3 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem3.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem3.getTryAssist());
                    case 6:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics4 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics4.getClass();
                        return rugbyTopPlayersStatistics4.getTackles();
                    case 7:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem4 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem4.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem4.getPassesSuccessful());
                    case 8:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem5 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem5.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem5.getTackles());
                    case 9:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics5 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics5.getClass();
                        return rugbyTopPlayersStatistics5.getDominantTackles();
                    case 10:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem6 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem6.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem6.getDominantTackles());
                    case 11:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem7 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem7.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem7.getTries());
                    case 12:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics6 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics6.getClass();
                        return rugbyTopPlayersStatistics6.getPenDefs();
                    case 13:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem8 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem8.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem8.getPenDefs());
                    case 14:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics7 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics7.getClass();
                        return rugbyTopPlayersStatistics7.getPenOffs();
                    case 15:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem9 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem9.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem9.getPenOffs());
                    case 16:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics8 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics8.getClass();
                        return rugbyTopPlayersStatistics8.getLineoutsWon();
                    case 17:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem10 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem10.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem10.getLineoutsWon());
                    case 18:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics9 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics9.getClass();
                        return rugbyTopPlayersStatistics9.getOffloads();
                    case 19:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics10 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics10.getClass();
                        return rugbyTopPlayersStatistics10.getLineoutWonSteal();
                    case 20:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem11 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem11.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem11.getLineoutWonSteal());
                    case 21:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics11 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics11.getClass();
                        return rugbyTopPlayersStatistics11.getRuckArrival();
                    case 22:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem12 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem12.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem12.getRuckArrival());
                    case 23:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics12 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics12.getClass();
                        return rugbyTopPlayersStatistics12.getPenaltyGoals();
                    case 24:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics13 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics13.getClass();
                        return rugbyTopPlayersStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem13 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem13.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics14 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics14.getClass();
                        return rugbyTopPlayersStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem14 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem14.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem14.getRuckArrivalDefence());
                    case 28:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics15 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics15.getClass();
                        return rugbyTopPlayersStatistics15.getYellowCards();
                    default:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem15 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem15.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem15.getOffloads());
                }
            }
        }, new Function1() { // from class: wab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i9) {
                    case 0:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics.getClass();
                        return rugbyTopPlayersStatistics.getKicksFromHand();
                    case 1:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem.getKicksFromHand());
                    case 2:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics2 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics2.getClass();
                        return rugbyTopPlayersStatistics2.getPostContactMetres();
                    case 3:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem2 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem2.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem2.getPostContactMetres());
                    case 4:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics3 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics3.getClass();
                        return rugbyTopPlayersStatistics3.getTryAssist();
                    case 5:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem3 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem3.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem3.getTryAssist());
                    case 6:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics4 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics4.getClass();
                        return rugbyTopPlayersStatistics4.getTackles();
                    case 7:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem4 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem4.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem4.getPassesSuccessful());
                    case 8:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem5 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem5.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem5.getTackles());
                    case 9:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics5 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics5.getClass();
                        return rugbyTopPlayersStatistics5.getDominantTackles();
                    case 10:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem6 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem6.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem6.getDominantTackles());
                    case 11:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem7 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem7.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem7.getTries());
                    case 12:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics6 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics6.getClass();
                        return rugbyTopPlayersStatistics6.getPenDefs();
                    case 13:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem8 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem8.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem8.getPenDefs());
                    case 14:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics7 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics7.getClass();
                        return rugbyTopPlayersStatistics7.getPenOffs();
                    case 15:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem9 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem9.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem9.getPenOffs());
                    case 16:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics8 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics8.getClass();
                        return rugbyTopPlayersStatistics8.getLineoutsWon();
                    case 17:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem10 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem10.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem10.getLineoutsWon());
                    case 18:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics9 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics9.getClass();
                        return rugbyTopPlayersStatistics9.getOffloads();
                    case 19:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics10 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics10.getClass();
                        return rugbyTopPlayersStatistics10.getLineoutWonSteal();
                    case 20:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem11 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem11.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem11.getLineoutWonSteal());
                    case 21:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics11 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics11.getClass();
                        return rugbyTopPlayersStatistics11.getRuckArrival();
                    case 22:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem12 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem12.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem12.getRuckArrival());
                    case 23:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics12 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics12.getClass();
                        return rugbyTopPlayersStatistics12.getPenaltyGoals();
                    case 24:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics13 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics13.getClass();
                        return rugbyTopPlayersStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem13 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem13.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics14 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics14.getClass();
                        return rugbyTopPlayersStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem14 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem14.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem14.getRuckArrivalDefence());
                    case 28:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics15 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics15.getClass();
                        return rugbyTopPlayersStatistics15.getYellowCards();
                    default:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem15 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem15.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem15.getOffloads());
                }
            }
        });
        final int i10 = 4;
        final int i11 = 5;
        yab yabVar18 = new yab("TRY_ASSIST", 17, R.string.rugby_try_assists, new Function1() { // from class: wab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i10) {
                    case 0:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics.getClass();
                        return rugbyTopPlayersStatistics.getKicksFromHand();
                    case 1:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem.getKicksFromHand());
                    case 2:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics2 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics2.getClass();
                        return rugbyTopPlayersStatistics2.getPostContactMetres();
                    case 3:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem2 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem2.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem2.getPostContactMetres());
                    case 4:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics3 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics3.getClass();
                        return rugbyTopPlayersStatistics3.getTryAssist();
                    case 5:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem3 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem3.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem3.getTryAssist());
                    case 6:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics4 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics4.getClass();
                        return rugbyTopPlayersStatistics4.getTackles();
                    case 7:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem4 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem4.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem4.getPassesSuccessful());
                    case 8:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem5 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem5.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem5.getTackles());
                    case 9:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics5 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics5.getClass();
                        return rugbyTopPlayersStatistics5.getDominantTackles();
                    case 10:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem6 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem6.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem6.getDominantTackles());
                    case 11:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem7 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem7.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem7.getTries());
                    case 12:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics6 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics6.getClass();
                        return rugbyTopPlayersStatistics6.getPenDefs();
                    case 13:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem8 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem8.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem8.getPenDefs());
                    case 14:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics7 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics7.getClass();
                        return rugbyTopPlayersStatistics7.getPenOffs();
                    case 15:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem9 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem9.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem9.getPenOffs());
                    case 16:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics8 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics8.getClass();
                        return rugbyTopPlayersStatistics8.getLineoutsWon();
                    case 17:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem10 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem10.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem10.getLineoutsWon());
                    case 18:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics9 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics9.getClass();
                        return rugbyTopPlayersStatistics9.getOffloads();
                    case 19:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics10 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics10.getClass();
                        return rugbyTopPlayersStatistics10.getLineoutWonSteal();
                    case 20:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem11 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem11.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem11.getLineoutWonSteal());
                    case 21:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics11 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics11.getClass();
                        return rugbyTopPlayersStatistics11.getRuckArrival();
                    case 22:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem12 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem12.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem12.getRuckArrival());
                    case 23:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics12 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics12.getClass();
                        return rugbyTopPlayersStatistics12.getPenaltyGoals();
                    case 24:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics13 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics13.getClass();
                        return rugbyTopPlayersStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem13 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem13.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics14 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics14.getClass();
                        return rugbyTopPlayersStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem14 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem14.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem14.getRuckArrivalDefence());
                    case 28:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics15 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics15.getClass();
                        return rugbyTopPlayersStatistics15.getYellowCards();
                    default:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem15 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem15.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem15.getOffloads());
                }
            }
        }, new Function1() { // from class: wab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i11) {
                    case 0:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics.getClass();
                        return rugbyTopPlayersStatistics.getKicksFromHand();
                    case 1:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem.getKicksFromHand());
                    case 2:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics2 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics2.getClass();
                        return rugbyTopPlayersStatistics2.getPostContactMetres();
                    case 3:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem2 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem2.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem2.getPostContactMetres());
                    case 4:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics3 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics3.getClass();
                        return rugbyTopPlayersStatistics3.getTryAssist();
                    case 5:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem3 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem3.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem3.getTryAssist());
                    case 6:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics4 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics4.getClass();
                        return rugbyTopPlayersStatistics4.getTackles();
                    case 7:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem4 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem4.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem4.getPassesSuccessful());
                    case 8:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem5 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem5.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem5.getTackles());
                    case 9:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics5 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics5.getClass();
                        return rugbyTopPlayersStatistics5.getDominantTackles();
                    case 10:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem6 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem6.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem6.getDominantTackles());
                    case 11:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem7 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem7.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem7.getTries());
                    case 12:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics6 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics6.getClass();
                        return rugbyTopPlayersStatistics6.getPenDefs();
                    case 13:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem8 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem8.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem8.getPenDefs());
                    case 14:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics7 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics7.getClass();
                        return rugbyTopPlayersStatistics7.getPenOffs();
                    case 15:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem9 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem9.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem9.getPenOffs());
                    case 16:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics8 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics8.getClass();
                        return rugbyTopPlayersStatistics8.getLineoutsWon();
                    case 17:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem10 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem10.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem10.getLineoutsWon());
                    case 18:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics9 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics9.getClass();
                        return rugbyTopPlayersStatistics9.getOffloads();
                    case 19:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics10 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics10.getClass();
                        return rugbyTopPlayersStatistics10.getLineoutWonSteal();
                    case 20:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem11 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem11.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem11.getLineoutWonSteal());
                    case 21:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics11 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics11.getClass();
                        return rugbyTopPlayersStatistics11.getRuckArrival();
                    case 22:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem12 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem12.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem12.getRuckArrival());
                    case 23:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics12 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics12.getClass();
                        return rugbyTopPlayersStatistics12.getPenaltyGoals();
                    case 24:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics13 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics13.getClass();
                        return rugbyTopPlayersStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem13 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem13.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics14 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics14.getClass();
                        return rugbyTopPlayersStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem14 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem14.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem14.getRuckArrivalDefence());
                    case 28:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics15 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics15.getClass();
                        return rugbyTopPlayersStatistics15.getYellowCards();
                    default:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem15 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem15.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem15.getOffloads());
                }
            }
        });
        final int i12 = 6;
        final int i13 = 8;
        yab yabVar19 = new yab("TACKLES", 18, R.string.rugby_tackles, new Function1() { // from class: wab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i12) {
                    case 0:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics.getClass();
                        return rugbyTopPlayersStatistics.getKicksFromHand();
                    case 1:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem.getKicksFromHand());
                    case 2:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics2 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics2.getClass();
                        return rugbyTopPlayersStatistics2.getPostContactMetres();
                    case 3:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem2 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem2.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem2.getPostContactMetres());
                    case 4:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics3 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics3.getClass();
                        return rugbyTopPlayersStatistics3.getTryAssist();
                    case 5:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem3 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem3.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem3.getTryAssist());
                    case 6:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics4 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics4.getClass();
                        return rugbyTopPlayersStatistics4.getTackles();
                    case 7:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem4 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem4.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem4.getPassesSuccessful());
                    case 8:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem5 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem5.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem5.getTackles());
                    case 9:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics5 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics5.getClass();
                        return rugbyTopPlayersStatistics5.getDominantTackles();
                    case 10:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem6 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem6.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem6.getDominantTackles());
                    case 11:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem7 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem7.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem7.getTries());
                    case 12:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics6 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics6.getClass();
                        return rugbyTopPlayersStatistics6.getPenDefs();
                    case 13:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem8 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem8.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem8.getPenDefs());
                    case 14:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics7 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics7.getClass();
                        return rugbyTopPlayersStatistics7.getPenOffs();
                    case 15:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem9 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem9.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem9.getPenOffs());
                    case 16:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics8 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics8.getClass();
                        return rugbyTopPlayersStatistics8.getLineoutsWon();
                    case 17:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem10 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem10.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem10.getLineoutsWon());
                    case 18:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics9 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics9.getClass();
                        return rugbyTopPlayersStatistics9.getOffloads();
                    case 19:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics10 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics10.getClass();
                        return rugbyTopPlayersStatistics10.getLineoutWonSteal();
                    case 20:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem11 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem11.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem11.getLineoutWonSteal());
                    case 21:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics11 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics11.getClass();
                        return rugbyTopPlayersStatistics11.getRuckArrival();
                    case 22:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem12 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem12.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem12.getRuckArrival());
                    case 23:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics12 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics12.getClass();
                        return rugbyTopPlayersStatistics12.getPenaltyGoals();
                    case 24:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics13 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics13.getClass();
                        return rugbyTopPlayersStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem13 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem13.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics14 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics14.getClass();
                        return rugbyTopPlayersStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem14 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem14.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem14.getRuckArrivalDefence());
                    case 28:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics15 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics15.getClass();
                        return rugbyTopPlayersStatistics15.getYellowCards();
                    default:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem15 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem15.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem15.getOffloads());
                }
            }
        }, new Function1() { // from class: wab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i13) {
                    case 0:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics.getClass();
                        return rugbyTopPlayersStatistics.getKicksFromHand();
                    case 1:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem.getKicksFromHand());
                    case 2:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics2 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics2.getClass();
                        return rugbyTopPlayersStatistics2.getPostContactMetres();
                    case 3:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem2 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem2.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem2.getPostContactMetres());
                    case 4:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics3 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics3.getClass();
                        return rugbyTopPlayersStatistics3.getTryAssist();
                    case 5:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem3 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem3.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem3.getTryAssist());
                    case 6:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics4 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics4.getClass();
                        return rugbyTopPlayersStatistics4.getTackles();
                    case 7:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem4 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem4.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem4.getPassesSuccessful());
                    case 8:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem5 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem5.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem5.getTackles());
                    case 9:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics5 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics5.getClass();
                        return rugbyTopPlayersStatistics5.getDominantTackles();
                    case 10:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem6 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem6.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem6.getDominantTackles());
                    case 11:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem7 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem7.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem7.getTries());
                    case 12:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics6 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics6.getClass();
                        return rugbyTopPlayersStatistics6.getPenDefs();
                    case 13:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem8 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem8.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem8.getPenDefs());
                    case 14:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics7 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics7.getClass();
                        return rugbyTopPlayersStatistics7.getPenOffs();
                    case 15:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem9 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem9.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem9.getPenOffs());
                    case 16:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics8 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics8.getClass();
                        return rugbyTopPlayersStatistics8.getLineoutsWon();
                    case 17:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem10 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem10.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem10.getLineoutsWon());
                    case 18:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics9 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics9.getClass();
                        return rugbyTopPlayersStatistics9.getOffloads();
                    case 19:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics10 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics10.getClass();
                        return rugbyTopPlayersStatistics10.getLineoutWonSteal();
                    case 20:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem11 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem11.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem11.getLineoutWonSteal());
                    case 21:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics11 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics11.getClass();
                        return rugbyTopPlayersStatistics11.getRuckArrival();
                    case 22:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem12 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem12.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem12.getRuckArrival());
                    case 23:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics12 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics12.getClass();
                        return rugbyTopPlayersStatistics12.getPenaltyGoals();
                    case 24:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics13 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics13.getClass();
                        return rugbyTopPlayersStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem13 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem13.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics14 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics14.getClass();
                        return rugbyTopPlayersStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem14 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem14.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem14.getRuckArrivalDefence());
                    case 28:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics15 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics15.getClass();
                        return rugbyTopPlayersStatistics15.getYellowCards();
                    default:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem15 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem15.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem15.getOffloads());
                }
            }
        });
        final int i14 = 9;
        final int i15 = 10;
        yab yabVar20 = new yab("DOMINANT_TACKLES", 19, R.string.rugby_dominant_tackles, new Function1() { // from class: wab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics.getClass();
                        return rugbyTopPlayersStatistics.getKicksFromHand();
                    case 1:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem.getKicksFromHand());
                    case 2:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics2 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics2.getClass();
                        return rugbyTopPlayersStatistics2.getPostContactMetres();
                    case 3:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem2 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem2.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem2.getPostContactMetres());
                    case 4:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics3 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics3.getClass();
                        return rugbyTopPlayersStatistics3.getTryAssist();
                    case 5:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem3 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem3.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem3.getTryAssist());
                    case 6:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics4 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics4.getClass();
                        return rugbyTopPlayersStatistics4.getTackles();
                    case 7:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem4 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem4.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem4.getPassesSuccessful());
                    case 8:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem5 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem5.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem5.getTackles());
                    case 9:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics5 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics5.getClass();
                        return rugbyTopPlayersStatistics5.getDominantTackles();
                    case 10:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem6 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem6.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem6.getDominantTackles());
                    case 11:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem7 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem7.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem7.getTries());
                    case 12:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics6 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics6.getClass();
                        return rugbyTopPlayersStatistics6.getPenDefs();
                    case 13:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem8 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem8.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem8.getPenDefs());
                    case 14:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics7 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics7.getClass();
                        return rugbyTopPlayersStatistics7.getPenOffs();
                    case 15:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem9 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem9.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem9.getPenOffs());
                    case 16:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics8 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics8.getClass();
                        return rugbyTopPlayersStatistics8.getLineoutsWon();
                    case 17:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem10 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem10.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem10.getLineoutsWon());
                    case 18:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics9 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics9.getClass();
                        return rugbyTopPlayersStatistics9.getOffloads();
                    case 19:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics10 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics10.getClass();
                        return rugbyTopPlayersStatistics10.getLineoutWonSteal();
                    case 20:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem11 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem11.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem11.getLineoutWonSteal());
                    case 21:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics11 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics11.getClass();
                        return rugbyTopPlayersStatistics11.getRuckArrival();
                    case 22:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem12 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem12.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem12.getRuckArrival());
                    case 23:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics12 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics12.getClass();
                        return rugbyTopPlayersStatistics12.getPenaltyGoals();
                    case 24:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics13 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics13.getClass();
                        return rugbyTopPlayersStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem13 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem13.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics14 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics14.getClass();
                        return rugbyTopPlayersStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem14 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem14.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem14.getRuckArrivalDefence());
                    case 28:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics15 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics15.getClass();
                        return rugbyTopPlayersStatistics15.getYellowCards();
                    default:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem15 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem15.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem15.getOffloads());
                }
            }
        }, new Function1() { // from class: wab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i15) {
                    case 0:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics.getClass();
                        return rugbyTopPlayersStatistics.getKicksFromHand();
                    case 1:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem.getKicksFromHand());
                    case 2:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics2 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics2.getClass();
                        return rugbyTopPlayersStatistics2.getPostContactMetres();
                    case 3:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem2 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem2.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem2.getPostContactMetres());
                    case 4:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics3 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics3.getClass();
                        return rugbyTopPlayersStatistics3.getTryAssist();
                    case 5:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem3 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem3.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem3.getTryAssist());
                    case 6:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics4 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics4.getClass();
                        return rugbyTopPlayersStatistics4.getTackles();
                    case 7:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem4 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem4.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem4.getPassesSuccessful());
                    case 8:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem5 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem5.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem5.getTackles());
                    case 9:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics5 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics5.getClass();
                        return rugbyTopPlayersStatistics5.getDominantTackles();
                    case 10:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem6 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem6.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem6.getDominantTackles());
                    case 11:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem7 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem7.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem7.getTries());
                    case 12:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics6 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics6.getClass();
                        return rugbyTopPlayersStatistics6.getPenDefs();
                    case 13:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem8 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem8.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem8.getPenDefs());
                    case 14:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics7 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics7.getClass();
                        return rugbyTopPlayersStatistics7.getPenOffs();
                    case 15:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem9 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem9.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem9.getPenOffs());
                    case 16:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics8 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics8.getClass();
                        return rugbyTopPlayersStatistics8.getLineoutsWon();
                    case 17:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem10 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem10.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem10.getLineoutsWon());
                    case 18:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics9 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics9.getClass();
                        return rugbyTopPlayersStatistics9.getOffloads();
                    case 19:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics10 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics10.getClass();
                        return rugbyTopPlayersStatistics10.getLineoutWonSteal();
                    case 20:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem11 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem11.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem11.getLineoutWonSteal());
                    case 21:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics11 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics11.getClass();
                        return rugbyTopPlayersStatistics11.getRuckArrival();
                    case 22:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem12 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem12.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem12.getRuckArrival());
                    case 23:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics12 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics12.getClass();
                        return rugbyTopPlayersStatistics12.getPenaltyGoals();
                    case 24:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics13 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics13.getClass();
                        return rugbyTopPlayersStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem13 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem13.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics14 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics14.getClass();
                        return rugbyTopPlayersStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem14 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem14.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem14.getRuckArrivalDefence());
                    case 28:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics15 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics15.getClass();
                        return rugbyTopPlayersStatistics15.getYellowCards();
                    default:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem15 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem15.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem15.getOffloads());
                }
            }
        });
        final int i16 = 12;
        final int i17 = 13;
        yab yabVar21 = new yab("PEN_DEFS", 20, R.string.rugby_defensive_penalties_conceded, new Function1() { // from class: wab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i16) {
                    case 0:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics.getClass();
                        return rugbyTopPlayersStatistics.getKicksFromHand();
                    case 1:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem.getKicksFromHand());
                    case 2:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics2 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics2.getClass();
                        return rugbyTopPlayersStatistics2.getPostContactMetres();
                    case 3:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem2 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem2.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem2.getPostContactMetres());
                    case 4:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics3 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics3.getClass();
                        return rugbyTopPlayersStatistics3.getTryAssist();
                    case 5:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem3 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem3.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem3.getTryAssist());
                    case 6:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics4 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics4.getClass();
                        return rugbyTopPlayersStatistics4.getTackles();
                    case 7:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem4 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem4.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem4.getPassesSuccessful());
                    case 8:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem5 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem5.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem5.getTackles());
                    case 9:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics5 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics5.getClass();
                        return rugbyTopPlayersStatistics5.getDominantTackles();
                    case 10:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem6 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem6.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem6.getDominantTackles());
                    case 11:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem7 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem7.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem7.getTries());
                    case 12:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics6 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics6.getClass();
                        return rugbyTopPlayersStatistics6.getPenDefs();
                    case 13:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem8 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem8.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem8.getPenDefs());
                    case 14:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics7 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics7.getClass();
                        return rugbyTopPlayersStatistics7.getPenOffs();
                    case 15:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem9 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem9.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem9.getPenOffs());
                    case 16:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics8 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics8.getClass();
                        return rugbyTopPlayersStatistics8.getLineoutsWon();
                    case 17:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem10 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem10.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem10.getLineoutsWon());
                    case 18:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics9 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics9.getClass();
                        return rugbyTopPlayersStatistics9.getOffloads();
                    case 19:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics10 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics10.getClass();
                        return rugbyTopPlayersStatistics10.getLineoutWonSteal();
                    case 20:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem11 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem11.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem11.getLineoutWonSteal());
                    case 21:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics11 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics11.getClass();
                        return rugbyTopPlayersStatistics11.getRuckArrival();
                    case 22:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem12 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem12.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem12.getRuckArrival());
                    case 23:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics12 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics12.getClass();
                        return rugbyTopPlayersStatistics12.getPenaltyGoals();
                    case 24:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics13 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics13.getClass();
                        return rugbyTopPlayersStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem13 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem13.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics14 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics14.getClass();
                        return rugbyTopPlayersStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem14 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem14.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem14.getRuckArrivalDefence());
                    case 28:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics15 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics15.getClass();
                        return rugbyTopPlayersStatistics15.getYellowCards();
                    default:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem15 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem15.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem15.getOffloads());
                }
            }
        }, new Function1() { // from class: wab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i17) {
                    case 0:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics.getClass();
                        return rugbyTopPlayersStatistics.getKicksFromHand();
                    case 1:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem.getKicksFromHand());
                    case 2:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics2 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics2.getClass();
                        return rugbyTopPlayersStatistics2.getPostContactMetres();
                    case 3:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem2 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem2.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem2.getPostContactMetres());
                    case 4:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics3 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics3.getClass();
                        return rugbyTopPlayersStatistics3.getTryAssist();
                    case 5:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem3 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem3.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem3.getTryAssist());
                    case 6:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics4 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics4.getClass();
                        return rugbyTopPlayersStatistics4.getTackles();
                    case 7:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem4 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem4.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem4.getPassesSuccessful());
                    case 8:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem5 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem5.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem5.getTackles());
                    case 9:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics5 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics5.getClass();
                        return rugbyTopPlayersStatistics5.getDominantTackles();
                    case 10:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem6 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem6.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem6.getDominantTackles());
                    case 11:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem7 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem7.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem7.getTries());
                    case 12:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics6 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics6.getClass();
                        return rugbyTopPlayersStatistics6.getPenDefs();
                    case 13:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem8 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem8.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem8.getPenDefs());
                    case 14:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics7 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics7.getClass();
                        return rugbyTopPlayersStatistics7.getPenOffs();
                    case 15:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem9 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem9.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem9.getPenOffs());
                    case 16:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics8 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics8.getClass();
                        return rugbyTopPlayersStatistics8.getLineoutsWon();
                    case 17:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem10 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem10.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem10.getLineoutsWon());
                    case 18:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics9 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics9.getClass();
                        return rugbyTopPlayersStatistics9.getOffloads();
                    case 19:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics10 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics10.getClass();
                        return rugbyTopPlayersStatistics10.getLineoutWonSteal();
                    case 20:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem11 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem11.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem11.getLineoutWonSteal());
                    case 21:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics11 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics11.getClass();
                        return rugbyTopPlayersStatistics11.getRuckArrival();
                    case 22:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem12 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem12.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem12.getRuckArrival());
                    case 23:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics12 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics12.getClass();
                        return rugbyTopPlayersStatistics12.getPenaltyGoals();
                    case 24:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics13 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics13.getClass();
                        return rugbyTopPlayersStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem13 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem13.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics14 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics14.getClass();
                        return rugbyTopPlayersStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem14 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem14.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem14.getRuckArrivalDefence());
                    case 28:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics15 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics15.getClass();
                        return rugbyTopPlayersStatistics15.getYellowCards();
                    default:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem15 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem15.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem15.getOffloads());
                }
            }
        });
        final int i18 = 14;
        final int i19 = 15;
        yab yabVar22 = new yab("PEN_OFFS", 21, R.string.rugby_offensive_penalties_conceded, new Function1() { // from class: wab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i18) {
                    case 0:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics.getClass();
                        return rugbyTopPlayersStatistics.getKicksFromHand();
                    case 1:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem.getKicksFromHand());
                    case 2:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics2 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics2.getClass();
                        return rugbyTopPlayersStatistics2.getPostContactMetres();
                    case 3:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem2 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem2.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem2.getPostContactMetres());
                    case 4:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics3 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics3.getClass();
                        return rugbyTopPlayersStatistics3.getTryAssist();
                    case 5:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem3 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem3.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem3.getTryAssist());
                    case 6:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics4 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics4.getClass();
                        return rugbyTopPlayersStatistics4.getTackles();
                    case 7:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem4 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem4.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem4.getPassesSuccessful());
                    case 8:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem5 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem5.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem5.getTackles());
                    case 9:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics5 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics5.getClass();
                        return rugbyTopPlayersStatistics5.getDominantTackles();
                    case 10:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem6 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem6.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem6.getDominantTackles());
                    case 11:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem7 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem7.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem7.getTries());
                    case 12:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics6 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics6.getClass();
                        return rugbyTopPlayersStatistics6.getPenDefs();
                    case 13:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem8 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem8.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem8.getPenDefs());
                    case 14:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics7 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics7.getClass();
                        return rugbyTopPlayersStatistics7.getPenOffs();
                    case 15:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem9 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem9.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem9.getPenOffs());
                    case 16:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics8 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics8.getClass();
                        return rugbyTopPlayersStatistics8.getLineoutsWon();
                    case 17:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem10 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem10.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem10.getLineoutsWon());
                    case 18:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics9 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics9.getClass();
                        return rugbyTopPlayersStatistics9.getOffloads();
                    case 19:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics10 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics10.getClass();
                        return rugbyTopPlayersStatistics10.getLineoutWonSteal();
                    case 20:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem11 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem11.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem11.getLineoutWonSteal());
                    case 21:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics11 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics11.getClass();
                        return rugbyTopPlayersStatistics11.getRuckArrival();
                    case 22:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem12 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem12.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem12.getRuckArrival());
                    case 23:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics12 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics12.getClass();
                        return rugbyTopPlayersStatistics12.getPenaltyGoals();
                    case 24:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics13 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics13.getClass();
                        return rugbyTopPlayersStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem13 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem13.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics14 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics14.getClass();
                        return rugbyTopPlayersStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem14 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem14.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem14.getRuckArrivalDefence());
                    case 28:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics15 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics15.getClass();
                        return rugbyTopPlayersStatistics15.getYellowCards();
                    default:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem15 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem15.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem15.getOffloads());
                }
            }
        }, new Function1() { // from class: wab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i19) {
                    case 0:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics.getClass();
                        return rugbyTopPlayersStatistics.getKicksFromHand();
                    case 1:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem.getKicksFromHand());
                    case 2:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics2 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics2.getClass();
                        return rugbyTopPlayersStatistics2.getPostContactMetres();
                    case 3:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem2 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem2.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem2.getPostContactMetres());
                    case 4:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics3 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics3.getClass();
                        return rugbyTopPlayersStatistics3.getTryAssist();
                    case 5:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem3 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem3.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem3.getTryAssist());
                    case 6:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics4 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics4.getClass();
                        return rugbyTopPlayersStatistics4.getTackles();
                    case 7:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem4 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem4.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem4.getPassesSuccessful());
                    case 8:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem5 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem5.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem5.getTackles());
                    case 9:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics5 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics5.getClass();
                        return rugbyTopPlayersStatistics5.getDominantTackles();
                    case 10:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem6 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem6.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem6.getDominantTackles());
                    case 11:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem7 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem7.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem7.getTries());
                    case 12:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics6 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics6.getClass();
                        return rugbyTopPlayersStatistics6.getPenDefs();
                    case 13:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem8 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem8.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem8.getPenDefs());
                    case 14:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics7 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics7.getClass();
                        return rugbyTopPlayersStatistics7.getPenOffs();
                    case 15:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem9 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem9.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem9.getPenOffs());
                    case 16:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics8 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics8.getClass();
                        return rugbyTopPlayersStatistics8.getLineoutsWon();
                    case 17:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem10 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem10.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem10.getLineoutsWon());
                    case 18:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics9 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics9.getClass();
                        return rugbyTopPlayersStatistics9.getOffloads();
                    case 19:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics10 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics10.getClass();
                        return rugbyTopPlayersStatistics10.getLineoutWonSteal();
                    case 20:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem11 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem11.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem11.getLineoutWonSteal());
                    case 21:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics11 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics11.getClass();
                        return rugbyTopPlayersStatistics11.getRuckArrival();
                    case 22:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem12 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem12.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem12.getRuckArrival());
                    case 23:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics12 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics12.getClass();
                        return rugbyTopPlayersStatistics12.getPenaltyGoals();
                    case 24:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics13 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics13.getClass();
                        return rugbyTopPlayersStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem13 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem13.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics14 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics14.getClass();
                        return rugbyTopPlayersStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem14 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem14.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem14.getRuckArrivalDefence());
                    case 28:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics15 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics15.getClass();
                        return rugbyTopPlayersStatistics15.getYellowCards();
                    default:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem15 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem15.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem15.getOffloads());
                }
            }
        });
        final int i20 = 16;
        final int i21 = 17;
        yab yabVar23 = new yab("LINEOUTS_WON", 22, R.string.rugby_lineouts_won, new Function1() { // from class: wab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i20) {
                    case 0:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics.getClass();
                        return rugbyTopPlayersStatistics.getKicksFromHand();
                    case 1:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem.getKicksFromHand());
                    case 2:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics2 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics2.getClass();
                        return rugbyTopPlayersStatistics2.getPostContactMetres();
                    case 3:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem2 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem2.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem2.getPostContactMetres());
                    case 4:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics3 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics3.getClass();
                        return rugbyTopPlayersStatistics3.getTryAssist();
                    case 5:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem3 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem3.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem3.getTryAssist());
                    case 6:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics4 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics4.getClass();
                        return rugbyTopPlayersStatistics4.getTackles();
                    case 7:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem4 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem4.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem4.getPassesSuccessful());
                    case 8:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem5 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem5.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem5.getTackles());
                    case 9:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics5 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics5.getClass();
                        return rugbyTopPlayersStatistics5.getDominantTackles();
                    case 10:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem6 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem6.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem6.getDominantTackles());
                    case 11:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem7 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem7.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem7.getTries());
                    case 12:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics6 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics6.getClass();
                        return rugbyTopPlayersStatistics6.getPenDefs();
                    case 13:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem8 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem8.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem8.getPenDefs());
                    case 14:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics7 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics7.getClass();
                        return rugbyTopPlayersStatistics7.getPenOffs();
                    case 15:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem9 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem9.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem9.getPenOffs());
                    case 16:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics8 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics8.getClass();
                        return rugbyTopPlayersStatistics8.getLineoutsWon();
                    case 17:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem10 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem10.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem10.getLineoutsWon());
                    case 18:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics9 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics9.getClass();
                        return rugbyTopPlayersStatistics9.getOffloads();
                    case 19:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics10 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics10.getClass();
                        return rugbyTopPlayersStatistics10.getLineoutWonSteal();
                    case 20:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem11 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem11.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem11.getLineoutWonSteal());
                    case 21:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics11 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics11.getClass();
                        return rugbyTopPlayersStatistics11.getRuckArrival();
                    case 22:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem12 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem12.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem12.getRuckArrival());
                    case 23:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics12 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics12.getClass();
                        return rugbyTopPlayersStatistics12.getPenaltyGoals();
                    case 24:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics13 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics13.getClass();
                        return rugbyTopPlayersStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem13 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem13.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics14 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics14.getClass();
                        return rugbyTopPlayersStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem14 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem14.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem14.getRuckArrivalDefence());
                    case 28:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics15 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics15.getClass();
                        return rugbyTopPlayersStatistics15.getYellowCards();
                    default:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem15 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem15.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem15.getOffloads());
                }
            }
        }, new Function1() { // from class: wab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i21) {
                    case 0:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics.getClass();
                        return rugbyTopPlayersStatistics.getKicksFromHand();
                    case 1:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem.getKicksFromHand());
                    case 2:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics2 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics2.getClass();
                        return rugbyTopPlayersStatistics2.getPostContactMetres();
                    case 3:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem2 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem2.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem2.getPostContactMetres());
                    case 4:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics3 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics3.getClass();
                        return rugbyTopPlayersStatistics3.getTryAssist();
                    case 5:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem3 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem3.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem3.getTryAssist());
                    case 6:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics4 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics4.getClass();
                        return rugbyTopPlayersStatistics4.getTackles();
                    case 7:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem4 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem4.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem4.getPassesSuccessful());
                    case 8:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem5 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem5.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem5.getTackles());
                    case 9:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics5 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics5.getClass();
                        return rugbyTopPlayersStatistics5.getDominantTackles();
                    case 10:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem6 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem6.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem6.getDominantTackles());
                    case 11:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem7 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem7.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem7.getTries());
                    case 12:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics6 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics6.getClass();
                        return rugbyTopPlayersStatistics6.getPenDefs();
                    case 13:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem8 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem8.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem8.getPenDefs());
                    case 14:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics7 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics7.getClass();
                        return rugbyTopPlayersStatistics7.getPenOffs();
                    case 15:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem9 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem9.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem9.getPenOffs());
                    case 16:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics8 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics8.getClass();
                        return rugbyTopPlayersStatistics8.getLineoutsWon();
                    case 17:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem10 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem10.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem10.getLineoutsWon());
                    case 18:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics9 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics9.getClass();
                        return rugbyTopPlayersStatistics9.getOffloads();
                    case 19:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics10 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics10.getClass();
                        return rugbyTopPlayersStatistics10.getLineoutWonSteal();
                    case 20:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem11 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem11.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem11.getLineoutWonSteal());
                    case 21:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics11 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics11.getClass();
                        return rugbyTopPlayersStatistics11.getRuckArrival();
                    case 22:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem12 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem12.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem12.getRuckArrival());
                    case 23:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics12 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics12.getClass();
                        return rugbyTopPlayersStatistics12.getPenaltyGoals();
                    case 24:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics13 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics13.getClass();
                        return rugbyTopPlayersStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem13 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem13.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics14 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics14.getClass();
                        return rugbyTopPlayersStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem14 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem14.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem14.getRuckArrivalDefence());
                    case 28:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics15 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics15.getClass();
                        return rugbyTopPlayersStatistics15.getYellowCards();
                    default:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem15 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem15.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem15.getOffloads());
                }
            }
        });
        final int i22 = 19;
        final int i23 = 20;
        yab yabVar24 = new yab("LINEOUT_WON_STEAL", 23, R.string.rugby_lineout_steals, new Function1() { // from class: wab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i22) {
                    case 0:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics.getClass();
                        return rugbyTopPlayersStatistics.getKicksFromHand();
                    case 1:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem.getKicksFromHand());
                    case 2:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics2 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics2.getClass();
                        return rugbyTopPlayersStatistics2.getPostContactMetres();
                    case 3:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem2 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem2.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem2.getPostContactMetres());
                    case 4:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics3 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics3.getClass();
                        return rugbyTopPlayersStatistics3.getTryAssist();
                    case 5:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem3 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem3.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem3.getTryAssist());
                    case 6:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics4 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics4.getClass();
                        return rugbyTopPlayersStatistics4.getTackles();
                    case 7:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem4 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem4.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem4.getPassesSuccessful());
                    case 8:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem5 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem5.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem5.getTackles());
                    case 9:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics5 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics5.getClass();
                        return rugbyTopPlayersStatistics5.getDominantTackles();
                    case 10:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem6 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem6.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem6.getDominantTackles());
                    case 11:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem7 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem7.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem7.getTries());
                    case 12:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics6 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics6.getClass();
                        return rugbyTopPlayersStatistics6.getPenDefs();
                    case 13:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem8 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem8.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem8.getPenDefs());
                    case 14:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics7 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics7.getClass();
                        return rugbyTopPlayersStatistics7.getPenOffs();
                    case 15:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem9 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem9.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem9.getPenOffs());
                    case 16:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics8 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics8.getClass();
                        return rugbyTopPlayersStatistics8.getLineoutsWon();
                    case 17:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem10 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem10.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem10.getLineoutsWon());
                    case 18:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics9 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics9.getClass();
                        return rugbyTopPlayersStatistics9.getOffloads();
                    case 19:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics10 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics10.getClass();
                        return rugbyTopPlayersStatistics10.getLineoutWonSteal();
                    case 20:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem11 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem11.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem11.getLineoutWonSteal());
                    case 21:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics11 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics11.getClass();
                        return rugbyTopPlayersStatistics11.getRuckArrival();
                    case 22:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem12 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem12.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem12.getRuckArrival());
                    case 23:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics12 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics12.getClass();
                        return rugbyTopPlayersStatistics12.getPenaltyGoals();
                    case 24:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics13 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics13.getClass();
                        return rugbyTopPlayersStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem13 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem13.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics14 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics14.getClass();
                        return rugbyTopPlayersStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem14 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem14.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem14.getRuckArrivalDefence());
                    case 28:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics15 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics15.getClass();
                        return rugbyTopPlayersStatistics15.getYellowCards();
                    default:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem15 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem15.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem15.getOffloads());
                }
            }
        }, new Function1() { // from class: wab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i23) {
                    case 0:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics.getClass();
                        return rugbyTopPlayersStatistics.getKicksFromHand();
                    case 1:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem.getKicksFromHand());
                    case 2:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics2 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics2.getClass();
                        return rugbyTopPlayersStatistics2.getPostContactMetres();
                    case 3:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem2 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem2.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem2.getPostContactMetres());
                    case 4:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics3 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics3.getClass();
                        return rugbyTopPlayersStatistics3.getTryAssist();
                    case 5:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem3 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem3.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem3.getTryAssist());
                    case 6:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics4 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics4.getClass();
                        return rugbyTopPlayersStatistics4.getTackles();
                    case 7:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem4 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem4.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem4.getPassesSuccessful());
                    case 8:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem5 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem5.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem5.getTackles());
                    case 9:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics5 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics5.getClass();
                        return rugbyTopPlayersStatistics5.getDominantTackles();
                    case 10:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem6 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem6.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem6.getDominantTackles());
                    case 11:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem7 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem7.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem7.getTries());
                    case 12:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics6 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics6.getClass();
                        return rugbyTopPlayersStatistics6.getPenDefs();
                    case 13:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem8 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem8.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem8.getPenDefs());
                    case 14:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics7 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics7.getClass();
                        return rugbyTopPlayersStatistics7.getPenOffs();
                    case 15:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem9 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem9.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem9.getPenOffs());
                    case 16:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics8 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics8.getClass();
                        return rugbyTopPlayersStatistics8.getLineoutsWon();
                    case 17:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem10 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem10.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem10.getLineoutsWon());
                    case 18:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics9 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics9.getClass();
                        return rugbyTopPlayersStatistics9.getOffloads();
                    case 19:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics10 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics10.getClass();
                        return rugbyTopPlayersStatistics10.getLineoutWonSteal();
                    case 20:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem11 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem11.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem11.getLineoutWonSteal());
                    case 21:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics11 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics11.getClass();
                        return rugbyTopPlayersStatistics11.getRuckArrival();
                    case 22:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem12 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem12.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem12.getRuckArrival());
                    case 23:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics12 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics12.getClass();
                        return rugbyTopPlayersStatistics12.getPenaltyGoals();
                    case 24:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics13 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics13.getClass();
                        return rugbyTopPlayersStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem13 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem13.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics14 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics14.getClass();
                        return rugbyTopPlayersStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem14 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem14.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem14.getRuckArrivalDefence());
                    case 28:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics15 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics15.getClass();
                        return rugbyTopPlayersStatistics15.getYellowCards();
                    default:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem15 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem15.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem15.getOffloads());
                }
            }
        });
        final int i24 = 21;
        final int i25 = 22;
        yab yabVar25 = new yab("RUCK_ARRIVAL", 24, R.string.rugby_ruck_arrivals, new Function1() { // from class: wab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i24) {
                    case 0:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics.getClass();
                        return rugbyTopPlayersStatistics.getKicksFromHand();
                    case 1:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem.getKicksFromHand());
                    case 2:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics2 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics2.getClass();
                        return rugbyTopPlayersStatistics2.getPostContactMetres();
                    case 3:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem2 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem2.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem2.getPostContactMetres());
                    case 4:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics3 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics3.getClass();
                        return rugbyTopPlayersStatistics3.getTryAssist();
                    case 5:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem3 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem3.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem3.getTryAssist());
                    case 6:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics4 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics4.getClass();
                        return rugbyTopPlayersStatistics4.getTackles();
                    case 7:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem4 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem4.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem4.getPassesSuccessful());
                    case 8:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem5 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem5.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem5.getTackles());
                    case 9:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics5 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics5.getClass();
                        return rugbyTopPlayersStatistics5.getDominantTackles();
                    case 10:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem6 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem6.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem6.getDominantTackles());
                    case 11:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem7 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem7.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem7.getTries());
                    case 12:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics6 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics6.getClass();
                        return rugbyTopPlayersStatistics6.getPenDefs();
                    case 13:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem8 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem8.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem8.getPenDefs());
                    case 14:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics7 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics7.getClass();
                        return rugbyTopPlayersStatistics7.getPenOffs();
                    case 15:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem9 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem9.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem9.getPenOffs());
                    case 16:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics8 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics8.getClass();
                        return rugbyTopPlayersStatistics8.getLineoutsWon();
                    case 17:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem10 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem10.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem10.getLineoutsWon());
                    case 18:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics9 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics9.getClass();
                        return rugbyTopPlayersStatistics9.getOffloads();
                    case 19:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics10 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics10.getClass();
                        return rugbyTopPlayersStatistics10.getLineoutWonSteal();
                    case 20:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem11 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem11.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem11.getLineoutWonSteal());
                    case 21:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics11 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics11.getClass();
                        return rugbyTopPlayersStatistics11.getRuckArrival();
                    case 22:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem12 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem12.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem12.getRuckArrival());
                    case 23:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics12 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics12.getClass();
                        return rugbyTopPlayersStatistics12.getPenaltyGoals();
                    case 24:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics13 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics13.getClass();
                        return rugbyTopPlayersStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem13 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem13.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics14 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics14.getClass();
                        return rugbyTopPlayersStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem14 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem14.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem14.getRuckArrivalDefence());
                    case 28:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics15 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics15.getClass();
                        return rugbyTopPlayersStatistics15.getYellowCards();
                    default:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem15 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem15.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem15.getOffloads());
                }
            }
        }, new Function1() { // from class: wab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i25) {
                    case 0:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics.getClass();
                        return rugbyTopPlayersStatistics.getKicksFromHand();
                    case 1:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem.getKicksFromHand());
                    case 2:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics2 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics2.getClass();
                        return rugbyTopPlayersStatistics2.getPostContactMetres();
                    case 3:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem2 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem2.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem2.getPostContactMetres());
                    case 4:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics3 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics3.getClass();
                        return rugbyTopPlayersStatistics3.getTryAssist();
                    case 5:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem3 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem3.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem3.getTryAssist());
                    case 6:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics4 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics4.getClass();
                        return rugbyTopPlayersStatistics4.getTackles();
                    case 7:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem4 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem4.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem4.getPassesSuccessful());
                    case 8:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem5 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem5.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem5.getTackles());
                    case 9:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics5 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics5.getClass();
                        return rugbyTopPlayersStatistics5.getDominantTackles();
                    case 10:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem6 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem6.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem6.getDominantTackles());
                    case 11:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem7 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem7.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem7.getTries());
                    case 12:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics6 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics6.getClass();
                        return rugbyTopPlayersStatistics6.getPenDefs();
                    case 13:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem8 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem8.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem8.getPenDefs());
                    case 14:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics7 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics7.getClass();
                        return rugbyTopPlayersStatistics7.getPenOffs();
                    case 15:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem9 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem9.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem9.getPenOffs());
                    case 16:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics8 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics8.getClass();
                        return rugbyTopPlayersStatistics8.getLineoutsWon();
                    case 17:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem10 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem10.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem10.getLineoutsWon());
                    case 18:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics9 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics9.getClass();
                        return rugbyTopPlayersStatistics9.getOffloads();
                    case 19:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics10 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics10.getClass();
                        return rugbyTopPlayersStatistics10.getLineoutWonSteal();
                    case 20:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem11 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem11.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem11.getLineoutWonSteal());
                    case 21:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics11 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics11.getClass();
                        return rugbyTopPlayersStatistics11.getRuckArrival();
                    case 22:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem12 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem12.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem12.getRuckArrival());
                    case 23:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics12 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics12.getClass();
                        return rugbyTopPlayersStatistics12.getPenaltyGoals();
                    case 24:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics13 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics13.getClass();
                        return rugbyTopPlayersStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem13 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem13.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics14 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics14.getClass();
                        return rugbyTopPlayersStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem14 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem14.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem14.getRuckArrivalDefence());
                    case 28:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics15 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics15.getClass();
                        return rugbyTopPlayersStatistics15.getYellowCards();
                    default:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem15 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem15.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem15.getOffloads());
                }
            }
        });
        final int i26 = 24;
        final int i27 = 25;
        yab yabVar26 = new yab("RUCK_ARRIVAL_ATTACK", 25, R.string.rugby_attacking_ruck_arrivals, new Function1() { // from class: wab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i26) {
                    case 0:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics.getClass();
                        return rugbyTopPlayersStatistics.getKicksFromHand();
                    case 1:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem.getKicksFromHand());
                    case 2:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics2 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics2.getClass();
                        return rugbyTopPlayersStatistics2.getPostContactMetres();
                    case 3:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem2 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem2.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem2.getPostContactMetres());
                    case 4:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics3 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics3.getClass();
                        return rugbyTopPlayersStatistics3.getTryAssist();
                    case 5:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem3 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem3.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem3.getTryAssist());
                    case 6:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics4 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics4.getClass();
                        return rugbyTopPlayersStatistics4.getTackles();
                    case 7:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem4 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem4.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem4.getPassesSuccessful());
                    case 8:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem5 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem5.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem5.getTackles());
                    case 9:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics5 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics5.getClass();
                        return rugbyTopPlayersStatistics5.getDominantTackles();
                    case 10:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem6 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem6.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem6.getDominantTackles());
                    case 11:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem7 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem7.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem7.getTries());
                    case 12:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics6 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics6.getClass();
                        return rugbyTopPlayersStatistics6.getPenDefs();
                    case 13:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem8 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem8.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem8.getPenDefs());
                    case 14:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics7 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics7.getClass();
                        return rugbyTopPlayersStatistics7.getPenOffs();
                    case 15:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem9 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem9.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem9.getPenOffs());
                    case 16:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics8 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics8.getClass();
                        return rugbyTopPlayersStatistics8.getLineoutsWon();
                    case 17:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem10 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem10.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem10.getLineoutsWon());
                    case 18:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics9 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics9.getClass();
                        return rugbyTopPlayersStatistics9.getOffloads();
                    case 19:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics10 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics10.getClass();
                        return rugbyTopPlayersStatistics10.getLineoutWonSteal();
                    case 20:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem11 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem11.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem11.getLineoutWonSteal());
                    case 21:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics11 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics11.getClass();
                        return rugbyTopPlayersStatistics11.getRuckArrival();
                    case 22:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem12 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem12.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem12.getRuckArrival());
                    case 23:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics12 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics12.getClass();
                        return rugbyTopPlayersStatistics12.getPenaltyGoals();
                    case 24:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics13 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics13.getClass();
                        return rugbyTopPlayersStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem13 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem13.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics14 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics14.getClass();
                        return rugbyTopPlayersStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem14 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem14.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem14.getRuckArrivalDefence());
                    case 28:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics15 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics15.getClass();
                        return rugbyTopPlayersStatistics15.getYellowCards();
                    default:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem15 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem15.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem15.getOffloads());
                }
            }
        }, new Function1() { // from class: wab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i27) {
                    case 0:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics.getClass();
                        return rugbyTopPlayersStatistics.getKicksFromHand();
                    case 1:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem.getKicksFromHand());
                    case 2:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics2 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics2.getClass();
                        return rugbyTopPlayersStatistics2.getPostContactMetres();
                    case 3:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem2 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem2.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem2.getPostContactMetres());
                    case 4:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics3 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics3.getClass();
                        return rugbyTopPlayersStatistics3.getTryAssist();
                    case 5:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem3 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem3.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem3.getTryAssist());
                    case 6:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics4 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics4.getClass();
                        return rugbyTopPlayersStatistics4.getTackles();
                    case 7:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem4 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem4.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem4.getPassesSuccessful());
                    case 8:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem5 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem5.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem5.getTackles());
                    case 9:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics5 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics5.getClass();
                        return rugbyTopPlayersStatistics5.getDominantTackles();
                    case 10:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem6 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem6.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem6.getDominantTackles());
                    case 11:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem7 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem7.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem7.getTries());
                    case 12:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics6 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics6.getClass();
                        return rugbyTopPlayersStatistics6.getPenDefs();
                    case 13:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem8 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem8.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem8.getPenDefs());
                    case 14:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics7 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics7.getClass();
                        return rugbyTopPlayersStatistics7.getPenOffs();
                    case 15:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem9 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem9.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem9.getPenOffs());
                    case 16:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics8 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics8.getClass();
                        return rugbyTopPlayersStatistics8.getLineoutsWon();
                    case 17:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem10 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem10.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem10.getLineoutsWon());
                    case 18:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics9 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics9.getClass();
                        return rugbyTopPlayersStatistics9.getOffloads();
                    case 19:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics10 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics10.getClass();
                        return rugbyTopPlayersStatistics10.getLineoutWonSteal();
                    case 20:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem11 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem11.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem11.getLineoutWonSteal());
                    case 21:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics11 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics11.getClass();
                        return rugbyTopPlayersStatistics11.getRuckArrival();
                    case 22:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem12 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem12.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem12.getRuckArrival());
                    case 23:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics12 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics12.getClass();
                        return rugbyTopPlayersStatistics12.getPenaltyGoals();
                    case 24:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics13 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics13.getClass();
                        return rugbyTopPlayersStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem13 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem13.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics14 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics14.getClass();
                        return rugbyTopPlayersStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem14 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem14.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem14.getRuckArrivalDefence());
                    case 28:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics15 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics15.getClass();
                        return rugbyTopPlayersStatistics15.getYellowCards();
                    default:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem15 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem15.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem15.getOffloads());
                }
            }
        });
        final int i28 = 26;
        final int i29 = 27;
        yab yabVar27 = new yab("RUCK_ARRIVAL_DEFENCE", 26, R.string.rugby_defensive_ruck_arrivals, new Function1() { // from class: wab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i28) {
                    case 0:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics.getClass();
                        return rugbyTopPlayersStatistics.getKicksFromHand();
                    case 1:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem.getKicksFromHand());
                    case 2:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics2 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics2.getClass();
                        return rugbyTopPlayersStatistics2.getPostContactMetres();
                    case 3:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem2 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem2.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem2.getPostContactMetres());
                    case 4:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics3 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics3.getClass();
                        return rugbyTopPlayersStatistics3.getTryAssist();
                    case 5:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem3 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem3.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem3.getTryAssist());
                    case 6:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics4 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics4.getClass();
                        return rugbyTopPlayersStatistics4.getTackles();
                    case 7:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem4 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem4.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem4.getPassesSuccessful());
                    case 8:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem5 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem5.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem5.getTackles());
                    case 9:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics5 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics5.getClass();
                        return rugbyTopPlayersStatistics5.getDominantTackles();
                    case 10:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem6 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem6.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem6.getDominantTackles());
                    case 11:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem7 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem7.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem7.getTries());
                    case 12:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics6 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics6.getClass();
                        return rugbyTopPlayersStatistics6.getPenDefs();
                    case 13:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem8 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem8.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem8.getPenDefs());
                    case 14:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics7 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics7.getClass();
                        return rugbyTopPlayersStatistics7.getPenOffs();
                    case 15:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem9 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem9.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem9.getPenOffs());
                    case 16:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics8 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics8.getClass();
                        return rugbyTopPlayersStatistics8.getLineoutsWon();
                    case 17:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem10 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem10.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem10.getLineoutsWon());
                    case 18:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics9 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics9.getClass();
                        return rugbyTopPlayersStatistics9.getOffloads();
                    case 19:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics10 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics10.getClass();
                        return rugbyTopPlayersStatistics10.getLineoutWonSteal();
                    case 20:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem11 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem11.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem11.getLineoutWonSteal());
                    case 21:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics11 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics11.getClass();
                        return rugbyTopPlayersStatistics11.getRuckArrival();
                    case 22:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem12 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem12.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem12.getRuckArrival());
                    case 23:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics12 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics12.getClass();
                        return rugbyTopPlayersStatistics12.getPenaltyGoals();
                    case 24:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics13 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics13.getClass();
                        return rugbyTopPlayersStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem13 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem13.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics14 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics14.getClass();
                        return rugbyTopPlayersStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem14 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem14.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem14.getRuckArrivalDefence());
                    case 28:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics15 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics15.getClass();
                        return rugbyTopPlayersStatistics15.getYellowCards();
                    default:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem15 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem15.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem15.getOffloads());
                }
            }
        }, new Function1() { // from class: wab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i29) {
                    case 0:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics.getClass();
                        return rugbyTopPlayersStatistics.getKicksFromHand();
                    case 1:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem.getKicksFromHand());
                    case 2:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics2 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics2.getClass();
                        return rugbyTopPlayersStatistics2.getPostContactMetres();
                    case 3:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem2 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem2.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem2.getPostContactMetres());
                    case 4:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics3 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics3.getClass();
                        return rugbyTopPlayersStatistics3.getTryAssist();
                    case 5:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem3 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem3.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem3.getTryAssist());
                    case 6:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics4 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics4.getClass();
                        return rugbyTopPlayersStatistics4.getTackles();
                    case 7:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem4 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem4.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem4.getPassesSuccessful());
                    case 8:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem5 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem5.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem5.getTackles());
                    case 9:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics5 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics5.getClass();
                        return rugbyTopPlayersStatistics5.getDominantTackles();
                    case 10:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem6 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem6.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem6.getDominantTackles());
                    case 11:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem7 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem7.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem7.getTries());
                    case 12:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics6 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics6.getClass();
                        return rugbyTopPlayersStatistics6.getPenDefs();
                    case 13:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem8 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem8.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem8.getPenDefs());
                    case 14:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics7 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics7.getClass();
                        return rugbyTopPlayersStatistics7.getPenOffs();
                    case 15:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem9 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem9.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem9.getPenOffs());
                    case 16:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics8 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics8.getClass();
                        return rugbyTopPlayersStatistics8.getLineoutsWon();
                    case 17:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem10 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem10.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem10.getLineoutsWon());
                    case 18:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics9 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics9.getClass();
                        return rugbyTopPlayersStatistics9.getOffloads();
                    case 19:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics10 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics10.getClass();
                        return rugbyTopPlayersStatistics10.getLineoutWonSteal();
                    case 20:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem11 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem11.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem11.getLineoutWonSteal());
                    case 21:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics11 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics11.getClass();
                        return rugbyTopPlayersStatistics11.getRuckArrival();
                    case 22:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem12 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem12.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem12.getRuckArrival());
                    case 23:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics12 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics12.getClass();
                        return rugbyTopPlayersStatistics12.getPenaltyGoals();
                    case 24:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics13 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics13.getClass();
                        return rugbyTopPlayersStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem13 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem13.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics14 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics14.getClass();
                        return rugbyTopPlayersStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem14 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem14.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem14.getRuckArrivalDefence());
                    case 28:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics15 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics15.getClass();
                        return rugbyTopPlayersStatistics15.getYellowCards();
                    default:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem15 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem15.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem15.getOffloads());
                }
            }
        });
        final int i30 = 28;
        yab[] yabVarArr = {yabVar, yabVar2, yabVar3, yabVar4, yabVar5, yabVar6, yabVar7, yabVar8, yabVar9, yabVar10, yabVar11, yabVar12, yabVar13, yabVar14, yabVar15, yabVar16, yabVar17, yabVar18, yabVar19, yabVar20, yabVar21, yabVar22, yabVar23, yabVar24, yabVar25, yabVar26, yabVar27, new yab("YELLOW_CARDS", 27, R.string.rugby_yellow_cards, new Function1() { // from class: wab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i30) {
                    case 0:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics.getClass();
                        return rugbyTopPlayersStatistics.getKicksFromHand();
                    case 1:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem.getKicksFromHand());
                    case 2:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics2 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics2.getClass();
                        return rugbyTopPlayersStatistics2.getPostContactMetres();
                    case 3:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem2 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem2.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem2.getPostContactMetres());
                    case 4:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics3 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics3.getClass();
                        return rugbyTopPlayersStatistics3.getTryAssist();
                    case 5:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem3 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem3.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem3.getTryAssist());
                    case 6:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics4 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics4.getClass();
                        return rugbyTopPlayersStatistics4.getTackles();
                    case 7:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem4 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem4.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem4.getPassesSuccessful());
                    case 8:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem5 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem5.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem5.getTackles());
                    case 9:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics5 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics5.getClass();
                        return rugbyTopPlayersStatistics5.getDominantTackles();
                    case 10:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem6 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem6.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem6.getDominantTackles());
                    case 11:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem7 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem7.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem7.getTries());
                    case 12:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics6 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics6.getClass();
                        return rugbyTopPlayersStatistics6.getPenDefs();
                    case 13:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem8 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem8.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem8.getPenDefs());
                    case 14:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics7 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics7.getClass();
                        return rugbyTopPlayersStatistics7.getPenOffs();
                    case 15:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem9 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem9.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem9.getPenOffs());
                    case 16:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics8 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics8.getClass();
                        return rugbyTopPlayersStatistics8.getLineoutsWon();
                    case 17:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem10 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem10.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem10.getLineoutsWon());
                    case 18:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics9 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics9.getClass();
                        return rugbyTopPlayersStatistics9.getOffloads();
                    case 19:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics10 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics10.getClass();
                        return rugbyTopPlayersStatistics10.getLineoutWonSteal();
                    case 20:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem11 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem11.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem11.getLineoutWonSteal());
                    case 21:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics11 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics11.getClass();
                        return rugbyTopPlayersStatistics11.getRuckArrival();
                    case 22:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem12 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem12.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem12.getRuckArrival());
                    case 23:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics12 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics12.getClass();
                        return rugbyTopPlayersStatistics12.getPenaltyGoals();
                    case 24:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics13 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics13.getClass();
                        return rugbyTopPlayersStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem13 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem13.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics14 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics14.getClass();
                        return rugbyTopPlayersStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem14 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem14.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem14.getRuckArrivalDefence());
                    case 28:
                        RugbyTopPlayersStatistics rugbyTopPlayersStatistics15 = (RugbyTopPlayersStatistics) obj;
                        rugbyTopPlayersStatistics15.getClass();
                        return rugbyTopPlayersStatistics15.getYellowCards();
                    default:
                        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem15 = (RugbyTopPlayersStatisticsItem) obj;
                        rugbyTopPlayersStatisticsItem15.getClass();
                        return yid.j(rugbyTopPlayersStatisticsItem15.getOffloads());
                }
            }
        }, new xab(0)), new yab("RED_CARDS", 28, R.string.rugby_red_cards, new xab(1), new xab(2))};
        d = yabVarArr;
        e = new kp5(yabVarArr);
    }

    public yab(String str, int i, int i2, Function1 function1, Function1 function12) {
        this.a = i2;
        this.b = function1;
        this.c = function12;
    }

    public static yab valueOf(String str) {
        return (yab) Enum.valueOf(yab.class, str);
    }

    public static yab[] values() {
        return (yab[]) d.clone();
    }

    @Override // defpackage.zab
    public final String a(Object obj) {
        RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem = (RugbyTopPlayersStatisticsItem) obj;
        rugbyTopPlayersStatisticsItem.getClass();
        return (String) this.c.invoke(rugbyTopPlayersStatisticsItem);
    }

    @Override // defpackage.zab
    public final List b(Object obj) {
        RugbyTopPlayersStatistics rugbyTopPlayersStatistics = (RugbyTopPlayersStatistics) obj;
        rugbyTopPlayersStatistics.getClass();
        return (List) this.b.invoke(rugbyTopPlayersStatistics);
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
