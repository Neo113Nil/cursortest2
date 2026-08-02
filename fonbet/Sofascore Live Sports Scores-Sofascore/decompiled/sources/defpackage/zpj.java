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
public final class zpj implements cqj {
    public static final /* synthetic */ zpj[] d;
    public static final /* synthetic */ kp5 e;
    public final int a;
    public final Function1 b;
    public final Function1 c;

    static {
        zpj zpjVar = new zpj("POINTS", 0, R.string.rugby_points, new vpj(13), new vpj(15));
        final int i = 9;
        zpj zpjVar2 = new zpj("TRIES", 1, R.string.rugby_tries, new vpj(27), new Function1() { // from class: xpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getCarriesNotMadeGainLine();
                    case 1:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getCarriesNotMadeGainLine());
                    case 2:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getKickMetres();
                    case 3:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getKickMetres());
                    case 4:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getKickFromHand();
                    case 5:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem3.getDropGoals());
                    case 6:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getKickFromHand());
                    case 7:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getPostContactMetres();
                    case 8:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getPostContactMetres());
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem6.getTries());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getTackles();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getTackles());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getDominantTackles();
                    case 13:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem8, rugbyTopTeamsStatisticsItem8.getDominantTackles());
                    case 14:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getPenDefs();
                    case 15:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem9.getPenDefs());
                    case 16:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getScrumsWon();
                    case 17:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getPenOffs();
                    case 18:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem10.getPenOffs());
                    case 19:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getRucksWon();
                    case 20:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem11, rugbyTopTeamsStatisticsItem11.getRucksWon());
                    case 21:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getPenaltyTries();
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getRuckArrival();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem12, rugbyTopTeamsStatisticsItem12.getRuckArrival());
                    case 24:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem13, rugbyTopTeamsStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem14.getScrumsWon());
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem15 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem15.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem15, rugbyTopTeamsStatisticsItem15.getRuckArrivalDefence());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRuckSpeed03();
                }
            }
        });
        final int i2 = 21;
        zpj zpjVar3 = new zpj("PENALTY_TRIES", 2, R.string.rugby_penalty_tries, new Function1() { // from class: xpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i2) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getCarriesNotMadeGainLine();
                    case 1:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getCarriesNotMadeGainLine());
                    case 2:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getKickMetres();
                    case 3:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getKickMetres());
                    case 4:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getKickFromHand();
                    case 5:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem3.getDropGoals());
                    case 6:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getKickFromHand());
                    case 7:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getPostContactMetres();
                    case 8:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getPostContactMetres());
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem6.getTries());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getTackles();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getTackles());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getDominantTackles();
                    case 13:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem8, rugbyTopTeamsStatisticsItem8.getDominantTackles());
                    case 14:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getPenDefs();
                    case 15:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem9.getPenDefs());
                    case 16:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getScrumsWon();
                    case 17:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getPenOffs();
                    case 18:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem10.getPenOffs());
                    case 19:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getRucksWon();
                    case 20:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem11, rugbyTopTeamsStatisticsItem11.getRucksWon());
                    case 21:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getPenaltyTries();
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getRuckArrival();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem12, rugbyTopTeamsStatisticsItem12.getRuckArrival());
                    case 24:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem13, rugbyTopTeamsStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem14.getScrumsWon());
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem15 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem15.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem15, rugbyTopTeamsStatisticsItem15.getRuckArrivalDefence());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRuckSpeed03();
                }
            }
        }, new ypj(3));
        zpj zpjVar4 = new zpj("PENALTY_GOALS", 3, R.string.rugby_penalty_goals, new ypj(13), new ypj(14));
        zpj zpjVar5 = new zpj("CONVERSIONS", 4, R.string.rugby_conversions, new ypj(15), new ypj(16));
        final int i3 = 5;
        zpj zpjVar6 = new zpj("DROP_GOALS", 5, R.string.rugby_drop_goals, new vpj(24), new Function1() { // from class: xpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i3) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getCarriesNotMadeGainLine();
                    case 1:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getCarriesNotMadeGainLine());
                    case 2:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getKickMetres();
                    case 3:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getKickMetres());
                    case 4:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getKickFromHand();
                    case 5:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem3.getDropGoals());
                    case 6:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getKickFromHand());
                    case 7:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getPostContactMetres();
                    case 8:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getPostContactMetres());
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem6.getTries());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getTackles();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getTackles());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getDominantTackles();
                    case 13:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem8, rugbyTopTeamsStatisticsItem8.getDominantTackles());
                    case 14:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getPenDefs();
                    case 15:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem9.getPenDefs());
                    case 16:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getScrumsWon();
                    case 17:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getPenOffs();
                    case 18:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem10.getPenOffs());
                    case 19:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getRucksWon();
                    case 20:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem11, rugbyTopTeamsStatisticsItem11.getRucksWon());
                    case 21:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getPenaltyTries();
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getRuckArrival();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem12, rugbyTopTeamsStatisticsItem12.getRuckArrival());
                    case 24:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem13, rugbyTopTeamsStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem14.getScrumsWon());
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem15 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem15.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem15, rugbyTopTeamsStatisticsItem15.getRuckArrivalDefence());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRuckSpeed03();
                }
            }
        });
        final int i4 = 16;
        Function1 function1 = new Function1() { // from class: xpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i4) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getCarriesNotMadeGainLine();
                    case 1:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getCarriesNotMadeGainLine());
                    case 2:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getKickMetres();
                    case 3:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getKickMetres());
                    case 4:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getKickFromHand();
                    case 5:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem3.getDropGoals());
                    case 6:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getKickFromHand());
                    case 7:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getPostContactMetres();
                    case 8:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getPostContactMetres());
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem6.getTries());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getTackles();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getTackles());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getDominantTackles();
                    case 13:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem8, rugbyTopTeamsStatisticsItem8.getDominantTackles());
                    case 14:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getPenDefs();
                    case 15:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem9.getPenDefs());
                    case 16:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getScrumsWon();
                    case 17:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getPenOffs();
                    case 18:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem10.getPenOffs());
                    case 19:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getRucksWon();
                    case 20:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem11, rugbyTopTeamsStatisticsItem11.getRucksWon());
                    case 21:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getPenaltyTries();
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getRuckArrival();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem12, rugbyTopTeamsStatisticsItem12.getRuckArrival());
                    case 24:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem13, rugbyTopTeamsStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem14.getScrumsWon());
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem15 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem15.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem15, rugbyTopTeamsStatisticsItem15.getRuckArrivalDefence());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRuckSpeed03();
                }
            }
        };
        final int i5 = 27;
        zpj zpjVar7 = new zpj("SCRUMS_WON", 6, R.string.rugby_scrums_won, function1, new Function1() { // from class: xpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i5) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getCarriesNotMadeGainLine();
                    case 1:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getCarriesNotMadeGainLine());
                    case 2:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getKickMetres();
                    case 3:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getKickMetres());
                    case 4:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getKickFromHand();
                    case 5:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem3.getDropGoals());
                    case 6:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getKickFromHand());
                    case 7:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getPostContactMetres();
                    case 8:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getPostContactMetres());
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem6.getTries());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getTackles();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getTackles());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getDominantTackles();
                    case 13:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem8, rugbyTopTeamsStatisticsItem8.getDominantTackles());
                    case 14:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getPenDefs();
                    case 15:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem9.getPenDefs());
                    case 16:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getScrumsWon();
                    case 17:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getPenOffs();
                    case 18:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem10.getPenOffs());
                    case 19:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getRucksWon();
                    case 20:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem11, rugbyTopTeamsStatisticsItem11.getRucksWon());
                    case 21:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getPenaltyTries();
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getRuckArrival();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem12, rugbyTopTeamsStatisticsItem12.getRuckArrival());
                    case 24:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem13, rugbyTopTeamsStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem14.getScrumsWon());
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem15 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem15.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem15, rugbyTopTeamsStatisticsItem15.getRuckArrivalDefence());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRuckSpeed03();
                }
            }
        });
        zpj zpjVar8 = new zpj("LINEOUTS_WON", 7, R.string.rugby_lineouts_won, new ypj(8), new ypj(17));
        zpj zpjVar9 = new zpj("PASSES_MADE", 8, R.string.rugby_passes_made_per_game, new ypj(18), new ypj(19));
        zpj zpjVar10 = new zpj("OFFLOADS", 9, R.string.rugby_offloads, new ypj(20), new vpj(14));
        zpj zpjVar11 = new zpj("CARRIES", 10, R.string.rugby_carries_per_game, new vpj(16), new vpj(17));
        zpj zpjVar12 = new zpj("CLEAN_BREAKS", 11, R.string.rugby_clean_breaks_per_game, new vpj(18), new vpj(19));
        zpj zpjVar13 = new zpj("DEFENDERS_BEATEN", 12, R.string.rugby_defenders_beaten_per_game, new vpj(20), new vpj(21));
        zpj zpjVar14 = new zpj("METRES_MADE", 13, R.string.rugby_metres_gained_per_game, new vpj(22), new vpj(23));
        zpj zpjVar15 = new zpj("HANDLING_ERROR", 14, R.string.rugby_handling_errors_per_game, new vpj(25), new vpj(26));
        zpj zpjVar16 = new zpj("CARRIES_CROSSED_GAIN_LINE", 15, R.string.rugby_carries_crossed_gained_line_per_game, new vpj(28), new vpj(29));
        final int i6 = 0;
        final int i7 = 1;
        zpj zpjVar17 = new zpj("CARRIES_NOT_MADE_GAIN_LINE", 16, R.string.rugby_carries_not_made_gain_line_per_game, new Function1() { // from class: xpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i6) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getCarriesNotMadeGainLine();
                    case 1:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getCarriesNotMadeGainLine());
                    case 2:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getKickMetres();
                    case 3:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getKickMetres());
                    case 4:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getKickFromHand();
                    case 5:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem3.getDropGoals());
                    case 6:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getKickFromHand());
                    case 7:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getPostContactMetres();
                    case 8:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getPostContactMetres());
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem6.getTries());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getTackles();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getTackles());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getDominantTackles();
                    case 13:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem8, rugbyTopTeamsStatisticsItem8.getDominantTackles());
                    case 14:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getPenDefs();
                    case 15:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem9.getPenDefs());
                    case 16:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getScrumsWon();
                    case 17:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getPenOffs();
                    case 18:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem10.getPenOffs());
                    case 19:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getRucksWon();
                    case 20:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem11, rugbyTopTeamsStatisticsItem11.getRucksWon());
                    case 21:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getPenaltyTries();
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getRuckArrival();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem12, rugbyTopTeamsStatisticsItem12.getRuckArrival());
                    case 24:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem13, rugbyTopTeamsStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem14.getScrumsWon());
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem15 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem15.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem15, rugbyTopTeamsStatisticsItem15.getRuckArrivalDefence());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRuckSpeed03();
                }
            }
        }, new Function1() { // from class: xpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i7) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getCarriesNotMadeGainLine();
                    case 1:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getCarriesNotMadeGainLine());
                    case 2:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getKickMetres();
                    case 3:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getKickMetres());
                    case 4:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getKickFromHand();
                    case 5:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem3.getDropGoals());
                    case 6:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getKickFromHand());
                    case 7:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getPostContactMetres();
                    case 8:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getPostContactMetres());
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem6.getTries());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getTackles();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getTackles());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getDominantTackles();
                    case 13:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem8, rugbyTopTeamsStatisticsItem8.getDominantTackles());
                    case 14:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getPenDefs();
                    case 15:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem9.getPenDefs());
                    case 16:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getScrumsWon();
                    case 17:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getPenOffs();
                    case 18:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem10.getPenOffs());
                    case 19:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getRucksWon();
                    case 20:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem11, rugbyTopTeamsStatisticsItem11.getRucksWon());
                    case 21:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getPenaltyTries();
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getRuckArrival();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem12, rugbyTopTeamsStatisticsItem12.getRuckArrival());
                    case 24:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem13, rugbyTopTeamsStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem14.getScrumsWon());
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem15 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem15.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem15, rugbyTopTeamsStatisticsItem15.getRuckArrivalDefence());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRuckSpeed03();
                }
            }
        });
        final int i8 = 2;
        final int i9 = 3;
        zpj zpjVar18 = new zpj("KICK_METRES", 17, R.string.rugby_kick_metres_per_game, new Function1() { // from class: xpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i8) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getCarriesNotMadeGainLine();
                    case 1:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getCarriesNotMadeGainLine());
                    case 2:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getKickMetres();
                    case 3:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getKickMetres());
                    case 4:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getKickFromHand();
                    case 5:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem3.getDropGoals());
                    case 6:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getKickFromHand());
                    case 7:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getPostContactMetres();
                    case 8:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getPostContactMetres());
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem6.getTries());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getTackles();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getTackles());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getDominantTackles();
                    case 13:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem8, rugbyTopTeamsStatisticsItem8.getDominantTackles());
                    case 14:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getPenDefs();
                    case 15:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem9.getPenDefs());
                    case 16:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getScrumsWon();
                    case 17:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getPenOffs();
                    case 18:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem10.getPenOffs());
                    case 19:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getRucksWon();
                    case 20:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem11, rugbyTopTeamsStatisticsItem11.getRucksWon());
                    case 21:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getPenaltyTries();
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getRuckArrival();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem12, rugbyTopTeamsStatisticsItem12.getRuckArrival());
                    case 24:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem13, rugbyTopTeamsStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem14.getScrumsWon());
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem15 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem15.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem15, rugbyTopTeamsStatisticsItem15.getRuckArrivalDefence());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRuckSpeed03();
                }
            }
        }, new Function1() { // from class: xpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i9) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getCarriesNotMadeGainLine();
                    case 1:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getCarriesNotMadeGainLine());
                    case 2:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getKickMetres();
                    case 3:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getKickMetres());
                    case 4:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getKickFromHand();
                    case 5:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem3.getDropGoals());
                    case 6:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getKickFromHand());
                    case 7:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getPostContactMetres();
                    case 8:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getPostContactMetres());
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem6.getTries());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getTackles();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getTackles());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getDominantTackles();
                    case 13:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem8, rugbyTopTeamsStatisticsItem8.getDominantTackles());
                    case 14:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getPenDefs();
                    case 15:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem9.getPenDefs());
                    case 16:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getScrumsWon();
                    case 17:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getPenOffs();
                    case 18:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem10.getPenOffs());
                    case 19:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getRucksWon();
                    case 20:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem11, rugbyTopTeamsStatisticsItem11.getRucksWon());
                    case 21:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getPenaltyTries();
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getRuckArrival();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem12, rugbyTopTeamsStatisticsItem12.getRuckArrival());
                    case 24:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem13, rugbyTopTeamsStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem14.getScrumsWon());
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem15 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem15.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem15, rugbyTopTeamsStatisticsItem15.getRuckArrivalDefence());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRuckSpeed03();
                }
            }
        });
        final int i10 = 4;
        final int i11 = 6;
        zpj zpjVar19 = new zpj("KICKS_FROM_HAND", 18, R.string.rugby_kicks_from_hand_per_game, new Function1() { // from class: xpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i10) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getCarriesNotMadeGainLine();
                    case 1:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getCarriesNotMadeGainLine());
                    case 2:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getKickMetres();
                    case 3:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getKickMetres());
                    case 4:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getKickFromHand();
                    case 5:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem3.getDropGoals());
                    case 6:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getKickFromHand());
                    case 7:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getPostContactMetres();
                    case 8:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getPostContactMetres());
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem6.getTries());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getTackles();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getTackles());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getDominantTackles();
                    case 13:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem8, rugbyTopTeamsStatisticsItem8.getDominantTackles());
                    case 14:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getPenDefs();
                    case 15:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem9.getPenDefs());
                    case 16:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getScrumsWon();
                    case 17:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getPenOffs();
                    case 18:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem10.getPenOffs());
                    case 19:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getRucksWon();
                    case 20:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem11, rugbyTopTeamsStatisticsItem11.getRucksWon());
                    case 21:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getPenaltyTries();
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getRuckArrival();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem12, rugbyTopTeamsStatisticsItem12.getRuckArrival());
                    case 24:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem13, rugbyTopTeamsStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem14.getScrumsWon());
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem15 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem15.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem15, rugbyTopTeamsStatisticsItem15.getRuckArrivalDefence());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRuckSpeed03();
                }
            }
        }, new Function1() { // from class: xpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i11) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getCarriesNotMadeGainLine();
                    case 1:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getCarriesNotMadeGainLine());
                    case 2:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getKickMetres();
                    case 3:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getKickMetres());
                    case 4:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getKickFromHand();
                    case 5:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem3.getDropGoals());
                    case 6:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getKickFromHand());
                    case 7:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getPostContactMetres();
                    case 8:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getPostContactMetres());
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem6.getTries());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getTackles();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getTackles());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getDominantTackles();
                    case 13:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem8, rugbyTopTeamsStatisticsItem8.getDominantTackles());
                    case 14:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getPenDefs();
                    case 15:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem9.getPenDefs());
                    case 16:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getScrumsWon();
                    case 17:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getPenOffs();
                    case 18:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem10.getPenOffs());
                    case 19:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getRucksWon();
                    case 20:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem11, rugbyTopTeamsStatisticsItem11.getRucksWon());
                    case 21:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getPenaltyTries();
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getRuckArrival();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem12, rugbyTopTeamsStatisticsItem12.getRuckArrival());
                    case 24:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem13, rugbyTopTeamsStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem14.getScrumsWon());
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem15 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem15.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem15, rugbyTopTeamsStatisticsItem15.getRuckArrivalDefence());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRuckSpeed03();
                }
            }
        });
        final int i12 = 7;
        final int i13 = 8;
        zpj zpjVar20 = new zpj("POST_CONTACT_METRES", 19, R.string.rugby_post_contact_metres_per_game, new Function1() { // from class: xpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i12) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getCarriesNotMadeGainLine();
                    case 1:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getCarriesNotMadeGainLine());
                    case 2:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getKickMetres();
                    case 3:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getKickMetres());
                    case 4:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getKickFromHand();
                    case 5:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem3.getDropGoals());
                    case 6:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getKickFromHand());
                    case 7:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getPostContactMetres();
                    case 8:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getPostContactMetres());
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem6.getTries());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getTackles();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getTackles());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getDominantTackles();
                    case 13:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem8, rugbyTopTeamsStatisticsItem8.getDominantTackles());
                    case 14:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getPenDefs();
                    case 15:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem9.getPenDefs());
                    case 16:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getScrumsWon();
                    case 17:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getPenOffs();
                    case 18:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem10.getPenOffs());
                    case 19:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getRucksWon();
                    case 20:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem11, rugbyTopTeamsStatisticsItem11.getRucksWon());
                    case 21:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getPenaltyTries();
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getRuckArrival();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem12, rugbyTopTeamsStatisticsItem12.getRuckArrival());
                    case 24:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem13, rugbyTopTeamsStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem14.getScrumsWon());
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem15 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem15.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem15, rugbyTopTeamsStatisticsItem15.getRuckArrivalDefence());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRuckSpeed03();
                }
            }
        }, new Function1() { // from class: xpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i13) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getCarriesNotMadeGainLine();
                    case 1:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getCarriesNotMadeGainLine());
                    case 2:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getKickMetres();
                    case 3:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getKickMetres());
                    case 4:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getKickFromHand();
                    case 5:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem3.getDropGoals());
                    case 6:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getKickFromHand());
                    case 7:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getPostContactMetres();
                    case 8:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getPostContactMetres());
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem6.getTries());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getTackles();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getTackles());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getDominantTackles();
                    case 13:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem8, rugbyTopTeamsStatisticsItem8.getDominantTackles());
                    case 14:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getPenDefs();
                    case 15:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem9.getPenDefs());
                    case 16:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getScrumsWon();
                    case 17:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getPenOffs();
                    case 18:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem10.getPenOffs());
                    case 19:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getRucksWon();
                    case 20:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem11, rugbyTopTeamsStatisticsItem11.getRucksWon());
                    case 21:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getPenaltyTries();
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getRuckArrival();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem12, rugbyTopTeamsStatisticsItem12.getRuckArrival());
                    case 24:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem13, rugbyTopTeamsStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem14.getScrumsWon());
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem15 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem15.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem15, rugbyTopTeamsStatisticsItem15.getRuckArrivalDefence());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRuckSpeed03();
                }
            }
        });
        final int i14 = 10;
        final int i15 = 11;
        zpj zpjVar21 = new zpj("TACKLES", 20, R.string.rugby_tackles_made_per_game, new Function1() { // from class: xpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getCarriesNotMadeGainLine();
                    case 1:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getCarriesNotMadeGainLine());
                    case 2:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getKickMetres();
                    case 3:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getKickMetres());
                    case 4:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getKickFromHand();
                    case 5:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem3.getDropGoals());
                    case 6:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getKickFromHand());
                    case 7:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getPostContactMetres();
                    case 8:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getPostContactMetres());
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem6.getTries());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getTackles();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getTackles());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getDominantTackles();
                    case 13:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem8, rugbyTopTeamsStatisticsItem8.getDominantTackles());
                    case 14:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getPenDefs();
                    case 15:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem9.getPenDefs());
                    case 16:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getScrumsWon();
                    case 17:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getPenOffs();
                    case 18:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem10.getPenOffs());
                    case 19:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getRucksWon();
                    case 20:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem11, rugbyTopTeamsStatisticsItem11.getRucksWon());
                    case 21:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getPenaltyTries();
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getRuckArrival();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem12, rugbyTopTeamsStatisticsItem12.getRuckArrival());
                    case 24:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem13, rugbyTopTeamsStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem14.getScrumsWon());
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem15 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem15.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem15, rugbyTopTeamsStatisticsItem15.getRuckArrivalDefence());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRuckSpeed03();
                }
            }
        }, new Function1() { // from class: xpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i15) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getCarriesNotMadeGainLine();
                    case 1:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getCarriesNotMadeGainLine());
                    case 2:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getKickMetres();
                    case 3:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getKickMetres());
                    case 4:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getKickFromHand();
                    case 5:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem3.getDropGoals());
                    case 6:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getKickFromHand());
                    case 7:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getPostContactMetres();
                    case 8:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getPostContactMetres());
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem6.getTries());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getTackles();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getTackles());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getDominantTackles();
                    case 13:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem8, rugbyTopTeamsStatisticsItem8.getDominantTackles());
                    case 14:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getPenDefs();
                    case 15:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem9.getPenDefs());
                    case 16:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getScrumsWon();
                    case 17:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getPenOffs();
                    case 18:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem10.getPenOffs());
                    case 19:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getRucksWon();
                    case 20:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem11, rugbyTopTeamsStatisticsItem11.getRucksWon());
                    case 21:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getPenaltyTries();
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getRuckArrival();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem12, rugbyTopTeamsStatisticsItem12.getRuckArrival());
                    case 24:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem13, rugbyTopTeamsStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem14.getScrumsWon());
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem15 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem15.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem15, rugbyTopTeamsStatisticsItem15.getRuckArrivalDefence());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRuckSpeed03();
                }
            }
        });
        final int i16 = 12;
        final int i17 = 13;
        zpj zpjVar22 = new zpj("DOMINANT_TACKLES", 21, R.string.rugby_dominant_tackles_per_game, new Function1() { // from class: xpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i16) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getCarriesNotMadeGainLine();
                    case 1:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getCarriesNotMadeGainLine());
                    case 2:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getKickMetres();
                    case 3:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getKickMetres());
                    case 4:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getKickFromHand();
                    case 5:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem3.getDropGoals());
                    case 6:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getKickFromHand());
                    case 7:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getPostContactMetres();
                    case 8:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getPostContactMetres());
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem6.getTries());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getTackles();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getTackles());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getDominantTackles();
                    case 13:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem8, rugbyTopTeamsStatisticsItem8.getDominantTackles());
                    case 14:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getPenDefs();
                    case 15:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem9.getPenDefs());
                    case 16:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getScrumsWon();
                    case 17:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getPenOffs();
                    case 18:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem10.getPenOffs());
                    case 19:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getRucksWon();
                    case 20:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem11, rugbyTopTeamsStatisticsItem11.getRucksWon());
                    case 21:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getPenaltyTries();
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getRuckArrival();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem12, rugbyTopTeamsStatisticsItem12.getRuckArrival());
                    case 24:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem13, rugbyTopTeamsStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem14.getScrumsWon());
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem15 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem15.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem15, rugbyTopTeamsStatisticsItem15.getRuckArrivalDefence());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRuckSpeed03();
                }
            }
        }, new Function1() { // from class: xpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i17) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getCarriesNotMadeGainLine();
                    case 1:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getCarriesNotMadeGainLine());
                    case 2:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getKickMetres();
                    case 3:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getKickMetres());
                    case 4:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getKickFromHand();
                    case 5:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem3.getDropGoals());
                    case 6:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getKickFromHand());
                    case 7:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getPostContactMetres();
                    case 8:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getPostContactMetres());
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem6.getTries());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getTackles();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getTackles());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getDominantTackles();
                    case 13:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem8, rugbyTopTeamsStatisticsItem8.getDominantTackles());
                    case 14:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getPenDefs();
                    case 15:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem9.getPenDefs());
                    case 16:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getScrumsWon();
                    case 17:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getPenOffs();
                    case 18:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem10.getPenOffs());
                    case 19:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getRucksWon();
                    case 20:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem11, rugbyTopTeamsStatisticsItem11.getRucksWon());
                    case 21:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getPenaltyTries();
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getRuckArrival();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem12, rugbyTopTeamsStatisticsItem12.getRuckArrival());
                    case 24:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem13, rugbyTopTeamsStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem14.getScrumsWon());
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem15 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem15.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem15, rugbyTopTeamsStatisticsItem15.getRuckArrivalDefence());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRuckSpeed03();
                }
            }
        });
        final int i18 = 14;
        final int i19 = 15;
        zpj zpjVar23 = new zpj("PEN_DEFS", 22, R.string.rugby_defensive_penalties_conceded, new Function1() { // from class: xpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i18) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getCarriesNotMadeGainLine();
                    case 1:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getCarriesNotMadeGainLine());
                    case 2:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getKickMetres();
                    case 3:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getKickMetres());
                    case 4:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getKickFromHand();
                    case 5:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem3.getDropGoals());
                    case 6:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getKickFromHand());
                    case 7:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getPostContactMetres();
                    case 8:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getPostContactMetres());
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem6.getTries());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getTackles();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getTackles());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getDominantTackles();
                    case 13:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem8, rugbyTopTeamsStatisticsItem8.getDominantTackles());
                    case 14:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getPenDefs();
                    case 15:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem9.getPenDefs());
                    case 16:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getScrumsWon();
                    case 17:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getPenOffs();
                    case 18:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem10.getPenOffs());
                    case 19:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getRucksWon();
                    case 20:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem11, rugbyTopTeamsStatisticsItem11.getRucksWon());
                    case 21:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getPenaltyTries();
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getRuckArrival();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem12, rugbyTopTeamsStatisticsItem12.getRuckArrival());
                    case 24:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem13, rugbyTopTeamsStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem14.getScrumsWon());
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem15 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem15.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem15, rugbyTopTeamsStatisticsItem15.getRuckArrivalDefence());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRuckSpeed03();
                }
            }
        }, new Function1() { // from class: xpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i19) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getCarriesNotMadeGainLine();
                    case 1:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getCarriesNotMadeGainLine());
                    case 2:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getKickMetres();
                    case 3:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getKickMetres());
                    case 4:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getKickFromHand();
                    case 5:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem3.getDropGoals());
                    case 6:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getKickFromHand());
                    case 7:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getPostContactMetres();
                    case 8:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getPostContactMetres());
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem6.getTries());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getTackles();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getTackles());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getDominantTackles();
                    case 13:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem8, rugbyTopTeamsStatisticsItem8.getDominantTackles());
                    case 14:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getPenDefs();
                    case 15:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem9.getPenDefs());
                    case 16:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getScrumsWon();
                    case 17:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getPenOffs();
                    case 18:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem10.getPenOffs());
                    case 19:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getRucksWon();
                    case 20:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem11, rugbyTopTeamsStatisticsItem11.getRucksWon());
                    case 21:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getPenaltyTries();
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getRuckArrival();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem12, rugbyTopTeamsStatisticsItem12.getRuckArrival());
                    case 24:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem13, rugbyTopTeamsStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem14.getScrumsWon());
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem15 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem15.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem15, rugbyTopTeamsStatisticsItem15.getRuckArrivalDefence());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRuckSpeed03();
                }
            }
        });
        final int i20 = 17;
        final int i21 = 18;
        zpj zpjVar24 = new zpj("PEN_OFFS", 23, R.string.rugby_offensive_penalties_conceded, new Function1() { // from class: xpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i20) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getCarriesNotMadeGainLine();
                    case 1:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getCarriesNotMadeGainLine());
                    case 2:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getKickMetres();
                    case 3:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getKickMetres());
                    case 4:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getKickFromHand();
                    case 5:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem3.getDropGoals());
                    case 6:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getKickFromHand());
                    case 7:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getPostContactMetres();
                    case 8:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getPostContactMetres());
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem6.getTries());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getTackles();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getTackles());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getDominantTackles();
                    case 13:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem8, rugbyTopTeamsStatisticsItem8.getDominantTackles());
                    case 14:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getPenDefs();
                    case 15:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem9.getPenDefs());
                    case 16:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getScrumsWon();
                    case 17:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getPenOffs();
                    case 18:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem10.getPenOffs());
                    case 19:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getRucksWon();
                    case 20:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem11, rugbyTopTeamsStatisticsItem11.getRucksWon());
                    case 21:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getPenaltyTries();
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getRuckArrival();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem12, rugbyTopTeamsStatisticsItem12.getRuckArrival());
                    case 24:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem13, rugbyTopTeamsStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem14.getScrumsWon());
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem15 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem15.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem15, rugbyTopTeamsStatisticsItem15.getRuckArrivalDefence());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRuckSpeed03();
                }
            }
        }, new Function1() { // from class: xpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i21) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getCarriesNotMadeGainLine();
                    case 1:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getCarriesNotMadeGainLine());
                    case 2:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getKickMetres();
                    case 3:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getKickMetres());
                    case 4:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getKickFromHand();
                    case 5:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem3.getDropGoals());
                    case 6:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getKickFromHand());
                    case 7:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getPostContactMetres();
                    case 8:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getPostContactMetres());
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem6.getTries());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getTackles();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getTackles());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getDominantTackles();
                    case 13:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem8, rugbyTopTeamsStatisticsItem8.getDominantTackles());
                    case 14:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getPenDefs();
                    case 15:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem9.getPenDefs());
                    case 16:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getScrumsWon();
                    case 17:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getPenOffs();
                    case 18:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem10.getPenOffs());
                    case 19:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getRucksWon();
                    case 20:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem11, rugbyTopTeamsStatisticsItem11.getRucksWon());
                    case 21:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getPenaltyTries();
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getRuckArrival();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem12, rugbyTopTeamsStatisticsItem12.getRuckArrival());
                    case 24:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem13, rugbyTopTeamsStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem14.getScrumsWon());
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem15 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem15.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem15, rugbyTopTeamsStatisticsItem15.getRuckArrivalDefence());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRuckSpeed03();
                }
            }
        });
        final int i22 = 19;
        final int i23 = 20;
        zpj zpjVar25 = new zpj("RUCKS_WON", 24, R.string.rugby_rucks_won_per_game, new Function1() { // from class: xpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i22) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getCarriesNotMadeGainLine();
                    case 1:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getCarriesNotMadeGainLine());
                    case 2:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getKickMetres();
                    case 3:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getKickMetres());
                    case 4:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getKickFromHand();
                    case 5:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem3.getDropGoals());
                    case 6:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getKickFromHand());
                    case 7:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getPostContactMetres();
                    case 8:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getPostContactMetres());
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem6.getTries());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getTackles();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getTackles());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getDominantTackles();
                    case 13:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem8, rugbyTopTeamsStatisticsItem8.getDominantTackles());
                    case 14:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getPenDefs();
                    case 15:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem9.getPenDefs());
                    case 16:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getScrumsWon();
                    case 17:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getPenOffs();
                    case 18:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem10.getPenOffs());
                    case 19:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getRucksWon();
                    case 20:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem11, rugbyTopTeamsStatisticsItem11.getRucksWon());
                    case 21:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getPenaltyTries();
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getRuckArrival();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem12, rugbyTopTeamsStatisticsItem12.getRuckArrival());
                    case 24:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem13, rugbyTopTeamsStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem14.getScrumsWon());
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem15 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem15.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem15, rugbyTopTeamsStatisticsItem15.getRuckArrivalDefence());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRuckSpeed03();
                }
            }
        }, new Function1() { // from class: xpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i23) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getCarriesNotMadeGainLine();
                    case 1:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getCarriesNotMadeGainLine());
                    case 2:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getKickMetres();
                    case 3:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getKickMetres());
                    case 4:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getKickFromHand();
                    case 5:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem3.getDropGoals());
                    case 6:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getKickFromHand());
                    case 7:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getPostContactMetres();
                    case 8:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getPostContactMetres());
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem6.getTries());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getTackles();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getTackles());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getDominantTackles();
                    case 13:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem8, rugbyTopTeamsStatisticsItem8.getDominantTackles());
                    case 14:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getPenDefs();
                    case 15:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem9.getPenDefs());
                    case 16:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getScrumsWon();
                    case 17:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getPenOffs();
                    case 18:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem10.getPenOffs());
                    case 19:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getRucksWon();
                    case 20:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem11, rugbyTopTeamsStatisticsItem11.getRucksWon());
                    case 21:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getPenaltyTries();
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getRuckArrival();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem12, rugbyTopTeamsStatisticsItem12.getRuckArrival());
                    case 24:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem13, rugbyTopTeamsStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem14.getScrumsWon());
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem15 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem15.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem15, rugbyTopTeamsStatisticsItem15.getRuckArrivalDefence());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRuckSpeed03();
                }
            }
        });
        final int i24 = 22;
        final int i25 = 23;
        zpj zpjVar26 = new zpj("RUCK_ARRIVAL", 25, R.string.rugby_ruck_arrivals_per_game, new Function1() { // from class: xpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i24) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getCarriesNotMadeGainLine();
                    case 1:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getCarriesNotMadeGainLine());
                    case 2:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getKickMetres();
                    case 3:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getKickMetres());
                    case 4:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getKickFromHand();
                    case 5:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem3.getDropGoals());
                    case 6:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getKickFromHand());
                    case 7:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getPostContactMetres();
                    case 8:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getPostContactMetres());
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem6.getTries());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getTackles();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getTackles());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getDominantTackles();
                    case 13:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem8, rugbyTopTeamsStatisticsItem8.getDominantTackles());
                    case 14:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getPenDefs();
                    case 15:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem9.getPenDefs());
                    case 16:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getScrumsWon();
                    case 17:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getPenOffs();
                    case 18:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem10.getPenOffs());
                    case 19:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getRucksWon();
                    case 20:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem11, rugbyTopTeamsStatisticsItem11.getRucksWon());
                    case 21:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getPenaltyTries();
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getRuckArrival();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem12, rugbyTopTeamsStatisticsItem12.getRuckArrival());
                    case 24:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem13, rugbyTopTeamsStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem14.getScrumsWon());
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem15 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem15.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem15, rugbyTopTeamsStatisticsItem15.getRuckArrivalDefence());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRuckSpeed03();
                }
            }
        }, new Function1() { // from class: xpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i25) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getCarriesNotMadeGainLine();
                    case 1:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getCarriesNotMadeGainLine());
                    case 2:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getKickMetres();
                    case 3:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getKickMetres());
                    case 4:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getKickFromHand();
                    case 5:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem3.getDropGoals());
                    case 6:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getKickFromHand());
                    case 7:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getPostContactMetres();
                    case 8:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getPostContactMetres());
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem6.getTries());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getTackles();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getTackles());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getDominantTackles();
                    case 13:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem8, rugbyTopTeamsStatisticsItem8.getDominantTackles());
                    case 14:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getPenDefs();
                    case 15:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem9.getPenDefs());
                    case 16:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getScrumsWon();
                    case 17:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getPenOffs();
                    case 18:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem10.getPenOffs());
                    case 19:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getRucksWon();
                    case 20:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem11, rugbyTopTeamsStatisticsItem11.getRucksWon());
                    case 21:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getPenaltyTries();
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getRuckArrival();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem12, rugbyTopTeamsStatisticsItem12.getRuckArrival());
                    case 24:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem13, rugbyTopTeamsStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem14.getScrumsWon());
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem15 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem15.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem15, rugbyTopTeamsStatisticsItem15.getRuckArrivalDefence());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRuckSpeed03();
                }
            }
        });
        final int i26 = 24;
        final int i27 = 25;
        zpj zpjVar27 = new zpj("RUCK_ARRIVAL_ATTACK", 26, R.string.rugby_attacking_ruck_arrivals_per_game, new Function1() { // from class: xpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i26) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getCarriesNotMadeGainLine();
                    case 1:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getCarriesNotMadeGainLine());
                    case 2:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getKickMetres();
                    case 3:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getKickMetres());
                    case 4:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getKickFromHand();
                    case 5:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem3.getDropGoals());
                    case 6:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getKickFromHand());
                    case 7:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getPostContactMetres();
                    case 8:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getPostContactMetres());
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem6.getTries());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getTackles();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getTackles());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getDominantTackles();
                    case 13:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem8, rugbyTopTeamsStatisticsItem8.getDominantTackles());
                    case 14:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getPenDefs();
                    case 15:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem9.getPenDefs());
                    case 16:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getScrumsWon();
                    case 17:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getPenOffs();
                    case 18:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem10.getPenOffs());
                    case 19:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getRucksWon();
                    case 20:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem11, rugbyTopTeamsStatisticsItem11.getRucksWon());
                    case 21:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getPenaltyTries();
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getRuckArrival();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem12, rugbyTopTeamsStatisticsItem12.getRuckArrival());
                    case 24:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem13, rugbyTopTeamsStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem14.getScrumsWon());
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem15 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem15.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem15, rugbyTopTeamsStatisticsItem15.getRuckArrivalDefence());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRuckSpeed03();
                }
            }
        }, new Function1() { // from class: xpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i27) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getCarriesNotMadeGainLine();
                    case 1:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getCarriesNotMadeGainLine());
                    case 2:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getKickMetres();
                    case 3:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getKickMetres());
                    case 4:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getKickFromHand();
                    case 5:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem3.getDropGoals());
                    case 6:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getKickFromHand());
                    case 7:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getPostContactMetres();
                    case 8:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getPostContactMetres());
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem6.getTries());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getTackles();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getTackles());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getDominantTackles();
                    case 13:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem8, rugbyTopTeamsStatisticsItem8.getDominantTackles());
                    case 14:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getPenDefs();
                    case 15:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem9.getPenDefs());
                    case 16:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getScrumsWon();
                    case 17:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getPenOffs();
                    case 18:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem10.getPenOffs());
                    case 19:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getRucksWon();
                    case 20:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem11, rugbyTopTeamsStatisticsItem11.getRucksWon());
                    case 21:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getPenaltyTries();
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getRuckArrival();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem12, rugbyTopTeamsStatisticsItem12.getRuckArrival());
                    case 24:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem13, rugbyTopTeamsStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem14.getScrumsWon());
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem15 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem15.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem15, rugbyTopTeamsStatisticsItem15.getRuckArrivalDefence());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRuckSpeed03();
                }
            }
        });
        final int i28 = 26;
        final int i29 = 28;
        zpj zpjVar28 = new zpj("RUCK_ARRIVAL_DEFENCE", 27, R.string.rugby_defensive_ruck_arrivals_per_game, new Function1() { // from class: xpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i28) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getCarriesNotMadeGainLine();
                    case 1:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getCarriesNotMadeGainLine());
                    case 2:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getKickMetres();
                    case 3:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getKickMetres());
                    case 4:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getKickFromHand();
                    case 5:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem3.getDropGoals());
                    case 6:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getKickFromHand());
                    case 7:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getPostContactMetres();
                    case 8:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getPostContactMetres());
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem6.getTries());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getTackles();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getTackles());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getDominantTackles();
                    case 13:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem8, rugbyTopTeamsStatisticsItem8.getDominantTackles());
                    case 14:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getPenDefs();
                    case 15:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem9.getPenDefs());
                    case 16:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getScrumsWon();
                    case 17:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getPenOffs();
                    case 18:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem10.getPenOffs());
                    case 19:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getRucksWon();
                    case 20:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem11, rugbyTopTeamsStatisticsItem11.getRucksWon());
                    case 21:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getPenaltyTries();
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getRuckArrival();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem12, rugbyTopTeamsStatisticsItem12.getRuckArrival());
                    case 24:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem13, rugbyTopTeamsStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem14.getScrumsWon());
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem15 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem15.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem15, rugbyTopTeamsStatisticsItem15.getRuckArrivalDefence());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRuckSpeed03();
                }
            }
        }, new Function1() { // from class: xpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i29) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getCarriesNotMadeGainLine();
                    case 1:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getCarriesNotMadeGainLine());
                    case 2:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getKickMetres();
                    case 3:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getKickMetres());
                    case 4:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getKickFromHand();
                    case 5:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem3.getDropGoals());
                    case 6:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getKickFromHand());
                    case 7:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getPostContactMetres();
                    case 8:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getPostContactMetres());
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem6.getTries());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getTackles();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getTackles());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getDominantTackles();
                    case 13:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem8, rugbyTopTeamsStatisticsItem8.getDominantTackles());
                    case 14:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getPenDefs();
                    case 15:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem9.getPenDefs());
                    case 16:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getScrumsWon();
                    case 17:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getPenOffs();
                    case 18:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem10.getPenOffs());
                    case 19:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getRucksWon();
                    case 20:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem11, rugbyTopTeamsStatisticsItem11.getRucksWon());
                    case 21:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getPenaltyTries();
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getRuckArrival();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem12, rugbyTopTeamsStatisticsItem12.getRuckArrival());
                    case 24:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem13, rugbyTopTeamsStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem14.getScrumsWon());
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem15 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem15.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem15, rugbyTopTeamsStatisticsItem15.getRuckArrivalDefence());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRuckSpeed03();
                }
            }
        });
        final int i30 = 29;
        zpj[] zpjVarArr = {zpjVar, zpjVar2, zpjVar3, zpjVar4, zpjVar5, zpjVar6, zpjVar7, zpjVar8, zpjVar9, zpjVar10, zpjVar11, zpjVar12, zpjVar13, zpjVar14, zpjVar15, zpjVar16, zpjVar17, zpjVar18, zpjVar19, zpjVar20, zpjVar21, zpjVar22, zpjVar23, zpjVar24, zpjVar25, zpjVar26, zpjVar27, zpjVar28, new zpj("RUCK_SPEED_0_3", 28, R.string.rugby_rucks_0_3_sec_per_game, new Function1() { // from class: xpj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i30) {
                    case 0:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics.getClass();
                        return rugbyTopTeamsStatistics.getCarriesNotMadeGainLine();
                    case 1:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem, rugbyTopTeamsStatisticsItem.getCarriesNotMadeGainLine());
                    case 2:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics2.getClass();
                        return rugbyTopTeamsStatistics2.getKickMetres();
                    case 3:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem2.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem2, rugbyTopTeamsStatisticsItem2.getKickMetres());
                    case 4:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics3.getClass();
                        return rugbyTopTeamsStatistics3.getKickFromHand();
                    case 5:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem3.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem3.getDropGoals());
                    case 6:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem4.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getKickFromHand());
                    case 7:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics4.getClass();
                        return rugbyTopTeamsStatistics4.getPostContactMetres();
                    case 8:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem5.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getPostContactMetres());
                    case 9:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem6.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem6.getTries());
                    case 10:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics5.getClass();
                        return rugbyTopTeamsStatistics5.getTackles();
                    case 11:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem7.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getTackles());
                    case 12:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics6.getClass();
                        return rugbyTopTeamsStatistics6.getDominantTackles();
                    case 13:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem8.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem8, rugbyTopTeamsStatisticsItem8.getDominantTackles());
                    case 14:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics7.getClass();
                        return rugbyTopTeamsStatistics7.getPenDefs();
                    case 15:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem9 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem9.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem9.getPenDefs());
                    case 16:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics8.getClass();
                        return rugbyTopTeamsStatistics8.getScrumsWon();
                    case 17:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics9.getClass();
                        return rugbyTopTeamsStatistics9.getPenOffs();
                    case 18:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem10 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem10.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem10.getPenOffs());
                    case 19:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics10 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics10.getClass();
                        return rugbyTopTeamsStatistics10.getRucksWon();
                    case 20:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem11 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem11.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem11, rugbyTopTeamsStatisticsItem11.getRucksWon());
                    case 21:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics11 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics11.getClass();
                        return rugbyTopTeamsStatistics11.getPenaltyTries();
                    case 22:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics12 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics12.getClass();
                        return rugbyTopTeamsStatistics12.getRuckArrival();
                    case 23:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem12 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem12.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem12, rugbyTopTeamsStatisticsItem12.getRuckArrival());
                    case 24:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics13 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics13.getClass();
                        return rugbyTopTeamsStatistics13.getRuckArrivalAttack();
                    case 25:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem13 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem13.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem13, rugbyTopTeamsStatisticsItem13.getRuckArrivalAttack());
                    case 26:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics14 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics14.getClass();
                        return rugbyTopTeamsStatistics14.getRuckArrivalDefence();
                    case 27:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem14 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem14.getClass();
                        return yid.j(rugbyTopTeamsStatisticsItem14.getScrumsWon());
                    case 28:
                        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem15 = (RugbyTopTeamsStatisticsItem) obj;
                        rugbyTopTeamsStatisticsItem15.getClass();
                        return dmi.p(rugbyTopTeamsStatisticsItem15, rugbyTopTeamsStatisticsItem15.getRuckArrivalDefence());
                    default:
                        RugbyTopTeamsStatistics rugbyTopTeamsStatistics15 = (RugbyTopTeamsStatistics) obj;
                        rugbyTopTeamsStatistics15.getClass();
                        return rugbyTopTeamsStatistics15.getRuckSpeed03();
                }
            }
        }, new ypj(0)), new zpj("RUCK_SPEED_3_6", 29, R.string.rugby_rucks_3_6_sec_per_game, new ypj(1), new ypj(2)), new zpj("RUCK_SPEED_6_PLUS", 30, R.string.rugby_rucks_over_6_sec_per_game, new ypj(4), new ypj(5)), new zpj("YELLOW_CARDS", 31, R.string.rugby_yellow_cards, new ypj(6), new ypj(7)), new zpj("RED_CARDS", 32, R.string.rugby_red_cards, new ypj(9), new ypj(10)), new zpj("PENALTIES_CONCEDED", 33, R.string.rugby_penalty_conceded, new ypj(11), new ypj(12))};
        d = zpjVarArr;
        e = new kp5(zpjVarArr);
    }

    public zpj(String str, int i, int i2, Function1 function1, Function1 function12) {
        this.a = i2;
        this.b = function1;
        this.c = function12;
    }

    public static zpj valueOf(String str) {
        return (zpj) Enum.valueOf(zpj.class, str);
    }

    public static zpj[] values() {
        return (zpj[]) d.clone();
    }

    @Override // defpackage.cqj
    public final /* bridge */ String a(Object obj) {
        return super.a((RugbyTopTeamsStatisticsItem) obj);
    }

    @Override // defpackage.cqj
    public final /* bridge */ List b(Object obj) {
        return super.b((RugbyTopTeamsStatistics) obj);
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
