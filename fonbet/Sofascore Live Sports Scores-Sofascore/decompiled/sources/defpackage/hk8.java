package defpackage;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.sofascore.model.mvvm.model.CustomizableDivider;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.sofascore.model.network.response.EventStatisticsItem;
import com.sofascore.model.network.response.FootballPlayerEventStatistics;
import com.sofascore.results.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class hk8 implements epe {
    public final Context a;
    public final boolean b;
    public final FootballPlayerEventStatistics c;
    public final FootballPlayerEventStatistics d;
    public final String e;
    public final String f;
    public final yzd g;
    public final mzd h;
    public final Gender i;
    public final dpe j;
    public final boolean k;
    public final boolean l;

    public hk8(Context context, boolean z, FootballPlayerEventStatistics footballPlayerEventStatistics, FootballPlayerEventStatistics footballPlayerEventStatistics2, String str, String str2, yzd yzdVar, mzd mzdVar, Gender gender) {
        context.getClass();
        this.a = context;
        this.b = z;
        this.c = footballPlayerEventStatistics;
        this.d = footballPlayerEventStatistics2;
        this.e = str;
        this.f = str2;
        this.g = yzdVar;
        this.h = mzdVar;
        this.i = gender;
        this.j = new dpe(footballPlayerEventStatistics2 != null, z);
        this.k = Intrinsics.c(str, "G");
        this.l = Intrinsics.c(str2, "G");
    }

    public static int b(FootballPlayerEventStatistics footballPlayerEventStatistics) {
        return yid.m(footballPlayerEventStatistics.getOutfielderBlock()) + yid.m(footballPlayerEventStatistics.getTotalClearance()) + yid.m(footballPlayerEventStatistics.getInterceptionWon()) + yid.m(footballPlayerEventStatistics.getTotalTackle());
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x03b4  */
    @Override // defpackage.epe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List a() {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        int i = gk8.b[this.g.ordinal()];
        if (i == 1) {
            ArrayList arrayList3 = new ArrayList();
            boolean z = this.b;
            FootballPlayerEventStatistics footballPlayerEventStatistics = this.d;
            FootballPlayerEventStatistics footballPlayerEventStatistics2 = this.c;
            Context context = this.a;
            dpe dpeVar = this.j;
            if (z) {
                String string = context.getString(R.string.football_minutes_played);
                string.getClass();
                Serializable h = dpe.h(dpeVar, string, footballPlayerEventStatistics2.getMinutesPlayed(), footballPlayerEventStatistics != null ? footballPlayerEventStatistics.getMinutesPlayed() : null, false, false, null, new s26(1, rei.a, rei.class, "minutesPlayed", "minutesPlayed(I)Ljava/lang/String;", 0, 16), 56);
                if (h != null) {
                    arrayList3.add(h);
                }
            }
            String string2 = context.getString(R.string.goals);
            string2.getClass();
            Integer goals = footballPlayerEventStatistics2.getGoals();
            Integer goals2 = footballPlayerEventStatistics != null ? footballPlayerEventStatistics.getGoals() : null;
            boolean z2 = !this.k;
            boolean z3 = !this.l;
            Serializable h2 = dpe.h(dpeVar, string2, goals, goals2, z2, z3, null, null, 96);
            if (h2 != null) {
                arrayList3.add(h2);
            }
            String string3 = context.getString(R.string.football_expected_goals);
            string3.getClass();
            Serializable j = dpe.j(dpeVar, string3, footballPlayerEventStatistics2.getExpectedGoals(), footballPlayerEventStatistics != null ? footballPlayerEventStatistics.getExpectedGoals() : null, 2, this.k, this.l, EventStatisticsItem.SpecialEventStatisticType.ExpectedGoals, null, 272);
            if (j != null) {
                arrayList3.add(j);
            }
            String string4 = context.getString(R.string.goal_assist);
            string4.getClass();
            Serializable h3 = dpe.h(dpeVar, string4, footballPlayerEventStatistics2.getGoalAssist(), footballPlayerEventStatistics != null ? footballPlayerEventStatistics.getGoalAssist() : null, z2, z3, null, null, 96);
            if (h3 != null) {
                arrayList3.add(h3);
            }
            String string5 = context.getString(R.string.football_expected_assists);
            string5.getClass();
            Serializable j2 = dpe.j(dpeVar, string5, footballPlayerEventStatistics2.getExpectedAssists(), footballPlayerEventStatistics != null ? footballPlayerEventStatistics.getExpectedAssists() : null, 2, this.k, this.l, null, null, 400);
            if (j2 != null) {
                arrayList3.add(j2);
            }
            arrayList2.addAll(arrayList3);
            arrayList2.add(new CustomizableDivider(true, 0, false, null, 14, null));
            String str = this.e;
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != 68) {
                    if (hashCode != 77) {
                        if (hashCode != 70) {
                            if (hashCode == 71 && str.equals("G")) {
                                arrayList2.addAll(e());
                                arrayList2.add(new CustomizableDivider(true, 0, false, null, 14, null));
                                arrayList2.addAll(f(true));
                                arrayList2.add(new CustomizableDivider(true, 0, false, null, 14, null));
                                ArrayList g = g();
                                arrayList = g.isEmpty() ? null : g;
                                if (arrayList != null) {
                                    arrayList2.addAll(arrayList);
                                    arrayList2.add(new CustomizableDivider(true, 0, false, null, 14, null));
                                }
                                arrayList2.addAll(c());
                                arrayList2.add(new CustomizableDivider(true, 0, false, null, 14, null));
                                arrayList2.addAll(d());
                                arrayList2.add(new CustomizableDivider(true, 0, false, null, 14, null));
                                arrayList2.addAll(h(true));
                                if (!Intrinsics.c(str, "G") && Intrinsics.c(this.f, "G")) {
                                    arrayList2.add(new CustomizableDivider(true, 0, false, null, 14, null));
                                    arrayList2.addAll(e());
                                }
                            }
                        } else if (str.equals("F")) {
                            arrayList2.addAll(h(true));
                            arrayList2.add(new CustomizableDivider(true, 0, false, null, 14, null));
                            arrayList2.addAll(d());
                            arrayList2.add(new CustomizableDivider(true, 0, false, null, 14, null));
                            ArrayList g2 = g();
                            arrayList = g2.isEmpty() ? null : g2;
                            if (arrayList != null) {
                                arrayList2.addAll(arrayList);
                                arrayList2.add(new CustomizableDivider(true, 0, false, null, 14, null));
                            }
                            arrayList2.addAll(f(true));
                            arrayList2.add(new CustomizableDivider(true, 0, false, null, 14, null));
                            arrayList2.addAll(c());
                            if (!Intrinsics.c(str, "G")) {
                                arrayList2.add(new CustomizableDivider(true, 0, false, null, 14, null));
                                arrayList2.addAll(e());
                            }
                        }
                    } else if (str.equals(PlayerKt.FOOTBALL_MIDFIELDER)) {
                        arrayList2.addAll(f(true));
                        arrayList2.add(new CustomizableDivider(true, 0, false, null, 14, null));
                        ArrayList g3 = g();
                        arrayList = g3.isEmpty() ? null : g3;
                        if (arrayList != null) {
                            arrayList2.addAll(arrayList);
                            arrayList2.add(new CustomizableDivider(true, 0, false, null, 14, null));
                        }
                        arrayList2.addAll(h(true));
                        arrayList2.add(new CustomizableDivider(true, 0, false, null, 14, null));
                        arrayList2.addAll(d());
                        arrayList2.add(new CustomizableDivider(true, 0, false, null, 14, null));
                        arrayList2.addAll(c());
                        if (!Intrinsics.c(str, "G")) {
                        }
                    }
                } else if (str.equals("D")) {
                    arrayList2.addAll(c());
                    arrayList2.add(new CustomizableDivider(true, 0, false, null, 14, null));
                    ArrayList g4 = g();
                    arrayList = g4.isEmpty() ? null : g4;
                    if (arrayList != null) {
                        arrayList2.addAll(arrayList);
                        arrayList2.add(new CustomizableDivider(true, 0, false, null, 14, null));
                    }
                    arrayList2.addAll(f(true));
                    arrayList2.add(new CustomizableDivider(true, 0, false, null, 14, null));
                    arrayList2.addAll(d());
                    arrayList2.add(new CustomizableDivider(true, 0, false, null, 14, null));
                    arrayList2.addAll(h(true));
                    if (!Intrinsics.c(str, "G")) {
                    }
                }
            }
            arrayList2.addAll(f(true));
            arrayList2.add(new CustomizableDivider(true, 0, false, null, 14, null));
            ArrayList g5 = g();
            arrayList = g5.isEmpty() ? null : g5;
            if (arrayList != null) {
                arrayList2.addAll(arrayList);
                arrayList2.add(new CustomizableDivider(true, 0, false, null, 14, null));
            }
            arrayList2.addAll(d());
            arrayList2.add(new CustomizableDivider(true, 0, false, null, 14, null));
            arrayList2.addAll(h(true));
            arrayList2.add(new CustomizableDivider(true, 0, false, null, 14, null));
            arrayList2.addAll(c());
            if (!Intrinsics.c(str, "G")) {
            }
        } else if (i == 2) {
            mzd mzdVar = this.h;
            switch (mzdVar == null ? -1 : gk8.a[mzdVar.ordinal()]) {
                case 1:
                    arrayList2.addAll(h(false));
                    break;
                case 2:
                    arrayList2.addAll(f(false));
                    break;
                case 3:
                    arrayList2.addAll(c());
                    break;
                case 4:
                    arrayList2.addAll(d());
                    break;
                case 5:
                    arrayList2.addAll(g());
                    break;
                case 6:
                    arrayList2.addAll(e());
                    break;
            }
            return arrayList2;
        }
        return arrayList2;
    }

    public final ArrayList c() {
        Integer num;
        Integer num2;
        String Q;
        String str;
        Integer aerialLost;
        Integer duelLost;
        Integer aerialWon;
        Integer duelWon;
        ArrayList arrayList = new ArrayList();
        Context context = this.a;
        String string = context.getString(R.string.football_defensive_contributions);
        string.getClass();
        FootballPlayerEventStatistics footballPlayerEventStatistics = this.c;
        Integer valueOf = Integer.valueOf(b(footballPlayerEventStatistics));
        FootballPlayerEventStatistics footballPlayerEventStatistics2 = this.d;
        Integer valueOf2 = footballPlayerEventStatistics2 != null ? Integer.valueOf(b(footballPlayerEventStatistics2)) : null;
        dpe dpeVar = this.j;
        Serializable h = dpe.h(dpeVar, string, valueOf, valueOf2, false, false, null, null, 120);
        if (h != null) {
            arrayList.add(h);
        }
        String string2 = context.getString(R.string.football_tackles_won_in_brackets);
        string2.getClass();
        Serializable o = dpe.o(dpeVar, string2, footballPlayerEventStatistics.getWonTackle(), footballPlayerEventStatistics.getTotalTackle(), footballPlayerEventStatistics2 != null ? footballPlayerEventStatistics2.getWonTackle() : null, footballPlayerEventStatistics2 != null ? footballPlayerEventStatistics2.getTotalTackle() : null, true, false, false, true, IronSourceError.ERROR_NT_LOAD_PLACEMENT_CAPPED);
        if (o != null) {
            arrayList.add(o);
        }
        String string3 = context.getString(R.string.football_interceptions);
        string3.getClass();
        Serializable h2 = dpe.h(dpeVar, string3, footballPlayerEventStatistics.getInterceptionWon(), footballPlayerEventStatistics2 != null ? footballPlayerEventStatistics2.getInterceptionWon() : null, false, false, null, null, 120);
        if (h2 != null) {
            arrayList.add(h2);
        }
        String string4 = context.getString(R.string.football_clearances);
        string4.getClass();
        Serializable h3 = dpe.h(dpeVar, string4, footballPlayerEventStatistics.getTotalClearance(), footballPlayerEventStatistics2 != null ? footballPlayerEventStatistics2.getTotalClearance() : null, false, false, null, null, 120);
        if (h3 != null) {
            arrayList.add(h3);
        }
        String string5 = context.getString(R.string.blocked_shots);
        string5.getClass();
        Serializable h4 = dpe.h(dpeVar, string5, footballPlayerEventStatistics.getOutfielderBlock(), footballPlayerEventStatistics2 != null ? footballPlayerEventStatistics2.getOutfielderBlock() : null, false, false, null, null, 120);
        if (h4 != null) {
            arrayList.add(h4);
        }
        String string6 = context.getString(R.string.football_recoveries);
        string6.getClass();
        Serializable k = dpeVar.k(string6, footballPlayerEventStatistics.getBallRecovery(), footballPlayerEventStatistics2 != null ? footballPlayerEventStatistics2.getBallRecovery() : null, true, true);
        if (k != null) {
            arrayList.add(k);
        }
        Integer duelWon2 = footballPlayerEventStatistics.getDuelWon();
        int i = 0;
        int intValue = duelWon2 != null ? duelWon2.intValue() : 0;
        Integer aerialWon2 = footballPlayerEventStatistics.getAerialWon();
        int intValue2 = intValue - (aerialWon2 != null ? aerialWon2.intValue() : 0);
        Integer duelLost2 = footballPlayerEventStatistics.getDuelLost();
        int intValue3 = duelLost2 != null ? duelLost2.intValue() : 0;
        Integer aerialLost2 = footballPlayerEventStatistics.getAerialLost();
        int intValue4 = intValue3 - (aerialLost2 != null ? aerialLost2.intValue() : 0);
        boolean z = this.b;
        if (z) {
            num = Integer.valueOf(((footballPlayerEventStatistics2 == null || (duelWon = footballPlayerEventStatistics2.getDuelWon()) == null) ? 0 : duelWon.intValue()) - ((footballPlayerEventStatistics2 == null || (aerialWon = footballPlayerEventStatistics2.getAerialWon()) == null) ? 0 : aerialWon.intValue()));
        } else {
            num = null;
        }
        if (z) {
            int intValue5 = (footballPlayerEventStatistics2 == null || (duelLost = footballPlayerEventStatistics2.getDuelLost()) == null) ? 0 : duelLost.intValue();
            if (footballPlayerEventStatistics2 != null && (aerialLost = footballPlayerEventStatistics2.getAerialLost()) != null) {
                i = aerialLost.intValue();
            }
            num2 = Integer.valueOf(intValue5 - i);
        } else {
            num2 = null;
        }
        String string7 = context.getString(R.string.football_ground_duels_won_in_brackets);
        string7.getClass();
        Serializable o2 = dpe.o(dpeVar, string7, Integer.valueOf(intValue2), Integer.valueOf(intValue4), num, num2, false, false, false, true, IronSourceError.ERROR_NT_LOAD_PLACEMENT_CAPPED);
        if (o2 != null) {
            arrayList.add(o2);
        }
        String string8 = context.getString(R.string.football_aerial_duels_won_in_brackets);
        string8.getClass();
        Serializable o3 = dpe.o(dpeVar, string8, footballPlayerEventStatistics.getAerialWon(), footballPlayerEventStatistics.getAerialLost(), footballPlayerEventStatistics2 != null ? footballPlayerEventStatistics2.getAerialWon() : null, footballPlayerEventStatistics2 != null ? footballPlayerEventStatistics2.getAerialLost() : null, false, false, false, true, IronSourceError.ERROR_NT_LOAD_PLACEMENT_CAPPED);
        if (o3 != null) {
            arrayList.add(o3);
        }
        String string9 = context.getString(R.string.clearance_off_line);
        string9.getClass();
        Serializable k2 = dpeVar.k(string9, footballPlayerEventStatistics.getClearanceOffLine(), footballPlayerEventStatistics2 != null ? footballPlayerEventStatistics2.getClearanceOffLine() : null, true, true);
        if (k2 != null) {
            arrayList.add(k2);
        }
        String string10 = context.getString(R.string.last_man_tackle);
        string10.getClass();
        Serializable k3 = dpeVar.k(string10, footballPlayerEventStatistics.getLastManTackle(), footballPlayerEventStatistics2 != null ? footballPlayerEventStatistics2.getLastManTackle() : null, true, true);
        if (k3 != null) {
            arrayList.add(k3);
        }
        String string11 = context.getString(R.string.football_fouls);
        string11.getClass();
        Serializable h5 = dpe.h(dpeVar, string11, footballPlayerEventStatistics.getFouls(), footballPlayerEventStatistics2 != null ? footballPlayerEventStatistics2.getFouls() : null, false, false, null, null, 120);
        if (h5 != null) {
            arrayList.add(h5);
        }
        Q = hkg.Q(context, R.string.football_dribbled_past, this.i, new Object[0]);
        Serializable h6 = dpe.h(dpeVar, Q, footballPlayerEventStatistics.getChallengeLost(), footballPlayerEventStatistics2 != null ? footballPlayerEventStatistics2.getChallengeLost() : null, false, false, null, null, 120);
        if (h6 != null) {
            arrayList.add(h6);
        }
        String str2 = this.e;
        if ((str2 != null && !str2.equals("G")) || ((str = this.f) != null && !str.equals("G"))) {
            String string12 = context.getString(R.string.error_lead_to_shot);
            string12.getClass();
            Serializable k4 = dpeVar.k(string12, footballPlayerEventStatistics.getErrorLeadToAShot(), footballPlayerEventStatistics2 != null ? footballPlayerEventStatistics2.getErrorLeadToAShot() : null, true, true);
            if (k4 != null) {
                arrayList.add(k4);
            }
            String string13 = context.getString(R.string.errors_leading_to_goal);
            string13.getClass();
            Serializable k5 = dpeVar.k(string13, footballPlayerEventStatistics.getErrorLeadToAGoal(), footballPlayerEventStatistics2 != null ? footballPlayerEventStatistics2.getErrorLeadToAGoal() : null, true, true);
            if (k5 != null) {
                arrayList.add(k5);
            }
        }
        String string14 = context.getString(R.string.own_goals);
        string14.getClass();
        Serializable k6 = dpeVar.k(string14, footballPlayerEventStatistics.getOwnGoals(), footballPlayerEventStatistics2 != null ? footballPlayerEventStatistics2.getOwnGoals() : null, true, true);
        if (k6 != null) {
            arrayList.add(k6);
        }
        String string15 = context.getString(R.string.penalty_conceded);
        string15.getClass();
        Serializable k7 = dpeVar.k(string15, footballPlayerEventStatistics.getPenaltyConceded(), footballPlayerEventStatistics2 != null ? footballPlayerEventStatistics2.getPenaltyConceded() : null, true, true);
        if (k7 != null) {
            arrayList.add(k7);
        }
        return arrayList;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        Context context = this.a;
        String string = context.getString(R.string.football_touches);
        string.getClass();
        FootballPlayerEventStatistics footballPlayerEventStatistics = this.c;
        Integer touches = footballPlayerEventStatistics.getTouches();
        FootballPlayerEventStatistics footballPlayerEventStatistics2 = this.d;
        Integer touches2 = footballPlayerEventStatistics2 != null ? footballPlayerEventStatistics2.getTouches() : null;
        dpe dpeVar = this.j;
        Serializable h = dpe.h(dpeVar, string, touches, touches2, false, false, null, null, 120);
        if (h != null) {
            arrayList.add(h);
        }
        String string2 = context.getString(R.string.football_unsuccessful_touches);
        string2.getClass();
        Serializable k = dpeVar.k(string2, footballPlayerEventStatistics.getUnsuccessfulTouch(), footballPlayerEventStatistics2 != null ? footballPlayerEventStatistics2.getUnsuccessfulTouch() : null, true, true);
        if (k != null) {
            arrayList.add(k);
        }
        String string3 = context.getString(R.string.football_dribble_attempts);
        string3.getClass();
        Serializable o = dpe.o(dpeVar, string3, footballPlayerEventStatistics.getWonContest(), footballPlayerEventStatistics.getTotalContest(), footballPlayerEventStatistics2 != null ? footballPlayerEventStatistics2.getWonContest() : null, footballPlayerEventStatistics2 != null ? footballPlayerEventStatistics2.getTotalContest() : null, true, false, false, false, IronSourceError.ERROR_NT_LOAD_PLACEMENT_CAPPED);
        if (o != null) {
            arrayList.add(o);
        }
        String string4 = context.getString(R.string.football_was_fouled);
        string4.getClass();
        Serializable h2 = dpe.h(dpeVar, string4, footballPlayerEventStatistics.getWasFouled(), footballPlayerEventStatistics2 != null ? footballPlayerEventStatistics2.getWasFouled() : null, false, false, null, null, 120);
        if (h2 != null) {
            arrayList.add(h2);
        }
        String string5 = context.getString(R.string.football_penalties_won);
        string5.getClass();
        Serializable k2 = dpeVar.k(string5, footballPlayerEventStatistics.getPenaltyWon(), footballPlayerEventStatistics2 != null ? footballPlayerEventStatistics2.getPenaltyWon() : null, true, true);
        if (k2 != null) {
            arrayList.add(k2);
        }
        boolean z = this.l;
        boolean z2 = this.k;
        if (!z2 || !z) {
            String string6 = context.getString(R.string.football_possession_lost);
            string6.getClass();
            Serializable h3 = dpe.h(dpeVar, string6, !z2 ? footballPlayerEventStatistics.getPossessionLostCtrl() : null, (z || footballPlayerEventStatistics2 == null) ? null : footballPlayerEventStatistics2.getPossessionLostCtrl(), !z2, !z, null, null, 96);
            if (h3 != null) {
                arrayList.add(h3);
            }
        }
        String string7 = context.getString(R.string.football_total_carrying_distance);
        string7.getClass();
        Serializable j = dpe.j(dpeVar, string7, footballPlayerEventStatistics.getTotalBallCarriesDistance(), footballPlayerEventStatistics2 != null ? footballPlayerEventStatistics2.getTotalBallCarriesDistance() : null, 0, false, false, null, new fk8(this, 0), 248);
        if (j != null) {
            arrayList.add(j);
        }
        String string8 = context.getString(R.string.football_ball_carries);
        string8.getClass();
        Serializable k3 = dpeVar.k(string8, footballPlayerEventStatistics.getBallCarriesCount(), footballPlayerEventStatistics2 != null ? footballPlayerEventStatistics2.getBallCarriesCount() : null, true, true);
        if (k3 != null) {
            arrayList.add(k3);
        }
        String string9 = context.getString(R.string.football_progressive_carries);
        string9.getClass();
        Serializable k4 = dpeVar.k(string9, footballPlayerEventStatistics.getProgressiveBallCarriesCount(), footballPlayerEventStatistics2 != null ? footballPlayerEventStatistics2.getProgressiveBallCarriesCount() : null, true, true);
        if (k4 != null) {
            arrayList.add(k4);
        }
        String string10 = context.getString(R.string.football_total_progression);
        string10.getClass();
        Serializable j2 = dpe.j(dpeVar, string10, footballPlayerEventStatistics.getTotalProgression(), footballPlayerEventStatistics2 != null ? footballPlayerEventStatistics2.getTotalProgression() : null, 0, false, false, null, new fk8(this, 1), 232);
        if (j2 != null) {
            arrayList.add(j2);
        }
        String string11 = context.getString(R.string.football_progressive_carrying_distance);
        string11.getClass();
        Serializable j3 = dpe.j(dpeVar, string11, footballPlayerEventStatistics.getTotalProgressiveBallCarriesDistance(), footballPlayerEventStatistics2 != null ? footballPlayerEventStatistics2.getTotalProgressiveBallCarriesDistance() : null, 0, false, false, null, new fk8(this, 2), 248);
        if (j3 != null) {
            arrayList.add(j3);
        }
        String string12 = context.getString(R.string.football_longest_progressive_carry);
        string12.getClass();
        Serializable j4 = dpe.j(dpeVar, string12, footballPlayerEventStatistics.getBestBallCarryProgression(), footballPlayerEventStatistics2 != null ? footballPlayerEventStatistics2.getBestBallCarryProgression() : null, 0, false, false, null, new fk8(this, 3), 248);
        if (j4 != null) {
            arrayList.add(j4);
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if (defpackage.yid.m(r6 != null ? r6.getPenaltyFaced() : null) > 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        FootballPlayerEventStatistics footballPlayerEventStatistics = this.c;
        int m = yid.m(footballPlayerEventStatistics.getPenaltyFaced());
        Context context = this.a;
        FootballPlayerEventStatistics footballPlayerEventStatistics2 = this.d;
        dpe dpeVar = this.j;
        if (m <= 0) {
        }
        String string = context.getString(R.string.football_penalties_faced_saved_in_brackets);
        string.getClass();
        Serializable o = dpe.o(dpeVar, string, footballPlayerEventStatistics.getPenaltySave(), footballPlayerEventStatistics.getPenaltyFaced(), footballPlayerEventStatistics2 != null ? footballPlayerEventStatistics2.getPenaltySave() : null, footballPlayerEventStatistics2 != null ? footballPlayerEventStatistics2.getPenaltyFaced() : null, true, true, true, true, 512);
        if (o != null) {
            arrayList.add(o);
        }
        String string2 = context.getString(R.string.football_penalty_shootout_save);
        string2.getClass();
        Serializable k = dpeVar.k(string2, footballPlayerEventStatistics.getPenaltyShootoutSave(), footballPlayerEventStatistics2 != null ? footballPlayerEventStatistics2.getPenaltyShootoutSave() : null, true, true);
        if (k != null) {
            arrayList.add(k);
        }
        String string3 = context.getString(R.string.football_total_saves);
        string3.getClass();
        Serializable h = dpe.h(dpeVar, string3, footballPlayerEventStatistics.getSaves(), footballPlayerEventStatistics2 != null ? footballPlayerEventStatistics2.getSaves() : null, this.k, this.l, null, null, 96);
        if (h != null) {
            arrayList.add(h);
        }
        String string4 = context.getString(R.string.football_goals_prevented);
        string4.getClass();
        Serializable j = dpe.j(dpeVar, string4, footballPlayerEventStatistics.getGoalsPrevented(), footballPlayerEventStatistics2 != null ? footballPlayerEventStatistics2.getGoalsPrevented() : null, 2, !this.k, !this.l, EventStatisticsItem.SpecialEventStatisticType.GoalsPrevented, null, NotificationCompat.FLAG_LOCAL_ONLY);
        if (j != null) {
            arrayList.add(j);
        }
        String string5 = context.getString(R.string.football_saves_from_inside_box);
        string5.getClass();
        Serializable h2 = dpe.h(dpeVar, string5, footballPlayerEventStatistics.getSavedShotsFromInsideTheBox(), footballPlayerEventStatistics2 != null ? footballPlayerEventStatistics2.getSavedShotsFromInsideTheBox() : null, this.k, this.l, null, null, 96);
        if (h2 != null) {
            arrayList.add(h2);
        }
        String string6 = context.getString(R.string.football_goalkeeper_punches);
        string6.getClass();
        Serializable h3 = dpe.h(dpeVar, string6, footballPlayerEventStatistics.getPunches(), footballPlayerEventStatistics2 != null ? footballPlayerEventStatistics2.getPunches() : null, this.k, this.l, null, null, 96);
        if (h3 != null) {
            arrayList.add(h3);
        }
        String string7 = context.getString(R.string.football_runs_out);
        string7.getClass();
        Serializable o2 = dpe.o(dpeVar, string7, footballPlayerEventStatistics.getAccurateKeeperSweeper(), footballPlayerEventStatistics.getTotalKeeperSweeper(), footballPlayerEventStatistics2 != null ? footballPlayerEventStatistics2.getAccurateKeeperSweeper() : null, footballPlayerEventStatistics2 != null ? footballPlayerEventStatistics2.getTotalKeeperSweeper() : null, true, this.k, this.l, false, 512);
        if (o2 != null) {
            arrayList.add(o2);
        }
        String string8 = context.getString(R.string.football_high_claims);
        string8.getClass();
        Serializable h4 = dpe.h(dpeVar, string8, footballPlayerEventStatistics.getGoodHighClaim(), footballPlayerEventStatistics2 != null ? footballPlayerEventStatistics2.getGoodHighClaim() : null, this.k, this.l, null, null, 96);
        if (h4 != null) {
            arrayList.add(h4);
        }
        String string9 = context.getString(R.string.error_lead_to_shot);
        string9.getClass();
        Serializable k2 = dpeVar.k(string9, footballPlayerEventStatistics.getErrorLeadToAShot(), footballPlayerEventStatistics2 != null ? footballPlayerEventStatistics2.getErrorLeadToAShot() : null, true, true);
        if (k2 != null) {
            arrayList.add(k2);
        }
        String string10 = context.getString(R.string.errors_leading_to_goal);
        string10.getClass();
        Serializable k3 = dpeVar.k(string10, footballPlayerEventStatistics.getErrorLeadToAGoal(), footballPlayerEventStatistics2 != null ? footballPlayerEventStatistics2.getErrorLeadToAGoal() : null, true, true);
        if (k3 != null) {
            arrayList.add(k3);
        }
        String string11 = context.getString(R.string.football_goalkeeper_crosses_not_claimed);
        string11.getClass();
        Serializable k4 = dpeVar.k(string11, footballPlayerEventStatistics.getCrossNotClaimed(), footballPlayerEventStatistics2 != null ? footballPlayerEventStatistics2.getCrossNotClaimed() : null, true, true);
        if (k4 != null) {
            arrayList.add(k4);
        }
        return arrayList;
    }

    public final ArrayList f(boolean z) {
        Integer totalLongBalls;
        Integer accurateLongBalls;
        Integer totalOwnHalfPasses;
        Integer accurateOwnHalfPasses;
        Integer totalOppositionHalfPasses;
        Integer accurateOppositionHalfPasses;
        Integer totalPass;
        Integer accuratePass;
        ArrayList arrayList = new ArrayList();
        Context context = this.a;
        FootballPlayerEventStatistics footballPlayerEventStatistics = this.d;
        FootballPlayerEventStatistics footballPlayerEventStatistics2 = this.c;
        dpe dpeVar = this.j;
        if (!z) {
            String string = context.getString(R.string.goal_assist);
            string.getClass();
            Serializable h = dpe.h(dpeVar, string, footballPlayerEventStatistics2.getGoalAssist(), footballPlayerEventStatistics != null ? footballPlayerEventStatistics.getGoalAssist() : null, !this.k, !this.l, null, null, 96);
            if (h != null) {
                arrayList.add(h);
            }
            String string2 = context.getString(R.string.football_expected_assists);
            string2.getClass();
            Serializable j = dpe.j(dpeVar, string2, footballPlayerEventStatistics2.getExpectedAssists(), footballPlayerEventStatistics != null ? footballPlayerEventStatistics.getExpectedAssists() : null, 2, this.k, this.l, null, null, 400);
            if (j != null) {
                arrayList.add(j);
            }
        }
        String string3 = context.getString(R.string.football_big_chances_created);
        string3.getClass();
        Serializable k = dpeVar.k(string3, footballPlayerEventStatistics2.getBigChanceCreated(), footballPlayerEventStatistics != null ? footballPlayerEventStatistics.getBigChanceCreated() : null, true, true);
        if (k != null) {
            arrayList.add(k);
        }
        String string4 = context.getString(R.string.football_key_passes);
        string4.getClass();
        Serializable h2 = dpe.h(dpeVar, string4, footballPlayerEventStatistics2.getKeyPass(), footballPlayerEventStatistics != null ? footballPlayerEventStatistics.getKeyPass() : null, false, false, EventStatisticsItem.SpecialEventStatisticType.KeyPasses, null, 88);
        if (h2 != null) {
            arrayList.add(h2);
        }
        String string5 = context.getString(R.string.football_total_crosses);
        string5.getClass();
        Serializable o = dpe.o(dpeVar, string5, footballPlayerEventStatistics2.getAccurateCross(), footballPlayerEventStatistics2.getTotalCross(), footballPlayerEventStatistics != null ? footballPlayerEventStatistics.getAccurateCross() : null, footballPlayerEventStatistics != null ? footballPlayerEventStatistics.getTotalCross() : null, true, false, false, false, IronSourceError.ERROR_NT_LOAD_PLACEMENT_CAPPED);
        if (o != null) {
            arrayList.add(o);
        }
        String string6 = context.getString(R.string.football_accurate_passes);
        string6.getClass();
        String i = rei.i(8, footballPlayerEventStatistics2.getAccuratePass(), footballPlayerEventStatistics2.getTotalPass(), true);
        String i2 = rei.i(8, footballPlayerEventStatistics != null ? footballPlayerEventStatistics.getAccuratePass() : null, footballPlayerEventStatistics != null ? footballPlayerEventStatistics.getTotalPass() : null, true);
        Integer accuratePass2 = footballPlayerEventStatistics2.getAccuratePass();
        Integer valueOf = Integer.valueOf(accuratePass2 != null ? accuratePass2.intValue() : 0);
        Integer totalPass2 = footballPlayerEventStatistics2.getTotalPass();
        Serializable n = dpeVar.n(string6, i, i2, dpe.b(new Pair(valueOf, Integer.valueOf(totalPass2 != null ? totalPass2.intValue() : 0)), new Pair(Integer.valueOf((footballPlayerEventStatistics == null || (accuratePass = footballPlayerEventStatistics.getAccuratePass()) == null) ? 0 : accuratePass.intValue()), Integer.valueOf((footballPlayerEventStatistics == null || (totalPass = footballPlayerEventStatistics.getTotalPass()) == null) ? 0 : totalPass.intValue())), true, false), null);
        if (n != null) {
            arrayList.add(n);
        }
        String string7 = context.getString(R.string.football_passes_in_opposition_half_accurate);
        string7.getClass();
        String i3 = rei.i(8, footballPlayerEventStatistics2.getAccurateOppositionHalfPasses(), footballPlayerEventStatistics2.getTotalOppositionHalfPasses(), true);
        String i4 = rei.i(8, footballPlayerEventStatistics != null ? footballPlayerEventStatistics.getAccurateOppositionHalfPasses() : null, footballPlayerEventStatistics != null ? footballPlayerEventStatistics.getTotalOppositionHalfPasses() : null, true);
        Integer accurateOppositionHalfPasses2 = footballPlayerEventStatistics2.getAccurateOppositionHalfPasses();
        Integer valueOf2 = Integer.valueOf(accurateOppositionHalfPasses2 != null ? accurateOppositionHalfPasses2.intValue() : 0);
        Integer totalOppositionHalfPasses2 = footballPlayerEventStatistics2.getTotalOppositionHalfPasses();
        Serializable n2 = dpeVar.n(string7, i3, i4, dpe.b(new Pair(valueOf2, Integer.valueOf(totalOppositionHalfPasses2 != null ? totalOppositionHalfPasses2.intValue() : 0)), new Pair(Integer.valueOf((footballPlayerEventStatistics == null || (accurateOppositionHalfPasses = footballPlayerEventStatistics.getAccurateOppositionHalfPasses()) == null) ? 0 : accurateOppositionHalfPasses.intValue()), Integer.valueOf((footballPlayerEventStatistics == null || (totalOppositionHalfPasses = footballPlayerEventStatistics.getTotalOppositionHalfPasses()) == null) ? 0 : totalOppositionHalfPasses.intValue())), true, false), null);
        if (n2 != null) {
            arrayList.add(n2);
        }
        String string8 = context.getString(R.string.football_passes_in_own_half_accurate);
        string8.getClass();
        String i5 = rei.i(8, footballPlayerEventStatistics2.getAccurateOwnHalfPasses(), footballPlayerEventStatistics2.getTotalOwnHalfPasses(), true);
        String i6 = rei.i(8, footballPlayerEventStatistics != null ? footballPlayerEventStatistics.getAccurateOwnHalfPasses() : null, footballPlayerEventStatistics != null ? footballPlayerEventStatistics.getTotalOwnHalfPasses() : null, true);
        Integer accurateOwnHalfPasses2 = footballPlayerEventStatistics2.getAccurateOwnHalfPasses();
        Integer valueOf3 = Integer.valueOf(accurateOwnHalfPasses2 != null ? accurateOwnHalfPasses2.intValue() : 0);
        Integer totalOwnHalfPasses2 = footballPlayerEventStatistics2.getTotalOwnHalfPasses();
        Serializable n3 = dpeVar.n(string8, i5, i6, dpe.b(new Pair(valueOf3, Integer.valueOf(totalOwnHalfPasses2 != null ? totalOwnHalfPasses2.intValue() : 0)), new Pair(Integer.valueOf((footballPlayerEventStatistics == null || (accurateOwnHalfPasses = footballPlayerEventStatistics.getAccurateOwnHalfPasses()) == null) ? 0 : accurateOwnHalfPasses.intValue()), Integer.valueOf((footballPlayerEventStatistics == null || (totalOwnHalfPasses = footballPlayerEventStatistics.getTotalOwnHalfPasses()) == null) ? 0 : totalOwnHalfPasses.intValue())), true, false), null);
        if (n3 != null) {
            arrayList.add(n3);
        }
        String string9 = context.getString(R.string.football_total_long_balls);
        string9.getClass();
        String i7 = rei.i(8, footballPlayerEventStatistics2.getAccurateLongBalls(), footballPlayerEventStatistics2.getTotalLongBalls(), true);
        String i8 = rei.i(8, footballPlayerEventStatistics != null ? footballPlayerEventStatistics.getAccurateLongBalls() : null, footballPlayerEventStatistics != null ? footballPlayerEventStatistics.getTotalLongBalls() : null, true);
        Integer accurateLongBalls2 = footballPlayerEventStatistics2.getAccurateLongBalls();
        Integer valueOf4 = Integer.valueOf(accurateLongBalls2 != null ? accurateLongBalls2.intValue() : 0);
        Integer totalLongBalls2 = footballPlayerEventStatistics2.getTotalLongBalls();
        Serializable n4 = dpeVar.n(string9, i7, i8, dpe.b(new Pair(valueOf4, Integer.valueOf(totalLongBalls2 != null ? totalLongBalls2.intValue() : 0)), new Pair(Integer.valueOf((footballPlayerEventStatistics == null || (accurateLongBalls = footballPlayerEventStatistics.getAccurateLongBalls()) == null) ? 0 : accurateLongBalls.intValue()), Integer.valueOf((footballPlayerEventStatistics == null || (totalLongBalls = footballPlayerEventStatistics.getTotalLongBalls()) == null) ? 0 : totalLongBalls.intValue())), true, false), null);
        if (n4 != null) {
            arrayList.add(n4);
        }
        return arrayList;
    }

    public final ArrayList g() {
        ArrayList arrayList = new ArrayList();
        Context context = this.a;
        String string = context.getString(R.string.football_running_distance_covered);
        string.getClass();
        FootballPlayerEventStatistics footballPlayerEventStatistics = this.c;
        Double kilometersCovered = footballPlayerEventStatistics.getKilometersCovered();
        FootballPlayerEventStatistics footballPlayerEventStatistics2 = this.d;
        Double kilometersCovered2 = footballPlayerEventStatistics2 != null ? footballPlayerEventStatistics2.getKilometersCovered() : null;
        EventStatisticsItem.SpecialEventStatisticType specialEventStatisticType = EventStatisticsItem.SpecialEventStatisticType.DistanceCovered;
        fk8 fk8Var = new fk8(this, 4);
        dpe dpeVar = this.j;
        Serializable j = dpe.j(dpeVar, string, kilometersCovered, kilometersCovered2, 1, true, true, specialEventStatisticType, fk8Var, 16);
        if (j != null) {
            arrayList.add(j);
        }
        String string2 = context.getString(R.string.football_running_number_of_sprints);
        string2.getClass();
        Serializable k = dpeVar.k(string2, footballPlayerEventStatistics.getNumberOfSprints(), footballPlayerEventStatistics2 != null ? footballPlayerEventStatistics2.getNumberOfSprints() : null, true, true);
        if (k != null) {
            arrayList.add(k);
        }
        String string3 = context.getString(R.string.football_running_top_speed);
        string3.getClass();
        Serializable j2 = dpe.j(dpeVar, string3, footballPlayerEventStatistics.getTopSpeed(), footballPlayerEventStatistics2 != null ? footballPlayerEventStatistics2.getTopSpeed() : null, 1, true, true, null, new fk8(this, 5), 144);
        if (j2 != null) {
            arrayList.add(j2);
        }
        String string4 = context.getString(R.string.football_walking_jogging);
        string4.getClass();
        double k2 = yid.k(footballPlayerEventStatistics.getMetersCoveredJoggingKm()) + yid.k(footballPlayerEventStatistics.getMetersCoveredWalkingKm());
        Double valueOf = k2 > 0.0d ? Double.valueOf(k2) : null;
        Double kilometersCovered3 = footballPlayerEventStatistics.getKilometersCovered();
        double k3 = yid.k(footballPlayerEventStatistics.getMetersCoveredJoggingKm()) + yid.k(footballPlayerEventStatistics2 != null ? footballPlayerEventStatistics2.getMetersCoveredWalkingKm() : null);
        Serializable f = dpe.f(dpeVar, string4, valueOf, kilometersCovered3, k3 > 0.0d ? Double.valueOf(k3) : null, footballPlayerEventStatistics2 != null ? footballPlayerEventStatistics2.getKilometersCovered() : null, new fk8(this, 6));
        if (f != null) {
            arrayList.add(f);
        }
        String string5 = context.getString(R.string.football_running);
        string5.getClass();
        Serializable f2 = dpe.f(dpeVar, string5, footballPlayerEventStatistics.getMetersCoveredRunningKm(), footballPlayerEventStatistics.getKilometersCovered(), footballPlayerEventStatistics2 != null ? footballPlayerEventStatistics2.getMetersCoveredRunningKm() : null, footballPlayerEventStatistics2 != null ? footballPlayerEventStatistics2.getKilometersCovered() : null, new fk8(this, 7));
        if (f2 != null) {
            arrayList.add(f2);
        }
        String string6 = context.getString(R.string.football_high_speed_running);
        string6.getClass();
        Serializable f3 = dpe.f(dpeVar, string6, footballPlayerEventStatistics.getMetersCoveredHighSpeedRunningKm(), footballPlayerEventStatistics.getKilometersCovered(), footballPlayerEventStatistics2 != null ? footballPlayerEventStatistics2.getMetersCoveredHighSpeedRunningKm() : null, footballPlayerEventStatistics2 != null ? footballPlayerEventStatistics2.getKilometersCovered() : null, new fk8(this, 8));
        if (f3 != null) {
            arrayList.add(f3);
        }
        String string7 = context.getString(R.string.football_sprinting);
        string7.getClass();
        Serializable f4 = dpe.f(dpeVar, string7, footballPlayerEventStatistics.getMetersCoveredSprintingKm(), footballPlayerEventStatistics.getKilometersCovered(), footballPlayerEventStatistics2 != null ? footballPlayerEventStatistics2.getMetersCoveredSprintingKm() : null, footballPlayerEventStatistics2 != null ? footballPlayerEventStatistics2.getKilometersCovered() : null, new fk8(this, 9));
        if (f4 != null) {
            arrayList.add(f4);
        }
        return arrayList;
    }

    public final ArrayList h(boolean z) {
        ArrayList arrayList = new ArrayList();
        FootballPlayerEventStatistics footballPlayerEventStatistics = this.d;
        FootballPlayerEventStatistics footballPlayerEventStatistics2 = this.c;
        Context context = this.a;
        dpe dpeVar = this.j;
        if (!z) {
            String string = context.getString(R.string.goals);
            string.getClass();
            Serializable h = dpe.h(dpeVar, string, footballPlayerEventStatistics2.getGoals(), footballPlayerEventStatistics != null ? footballPlayerEventStatistics.getGoals() : null, !this.k, !this.l, null, null, 96);
            if (h != null) {
                arrayList.add(h);
            }
            String string2 = context.getString(R.string.football_expected_goals);
            string2.getClass();
            Serializable j = dpe.j(dpeVar, string2, footballPlayerEventStatistics2.getExpectedGoals(), footballPlayerEventStatistics != null ? footballPlayerEventStatistics.getExpectedGoals() : null, 2, this.k, this.l, EventStatisticsItem.SpecialEventStatisticType.ExpectedGoals, null, 272);
            if (j != null) {
                arrayList.add(j);
            }
        }
        String string3 = context.getString(R.string.football_total_shots);
        string3.getClass();
        Serializable h2 = dpe.h(dpeVar, string3, footballPlayerEventStatistics2.getTotalShots(), footballPlayerEventStatistics != null ? footballPlayerEventStatistics.getTotalShots() : null, false, false, null, null, 120);
        if (h2 != null) {
            arrayList.add(h2);
        }
        String string4 = context.getString(R.string.football_expected_goals_on_target);
        string4.getClass();
        Serializable j2 = dpe.j(dpeVar, string4, footballPlayerEventStatistics2.getExpectedGoalsOnTarget(), footballPlayerEventStatistics != null ? footballPlayerEventStatistics.getExpectedGoalsOnTarget() : null, 2, this.k, this.l, EventStatisticsItem.SpecialEventStatisticType.ExpectedGoalsOnTarget, null, 272);
        if (j2 != null) {
            arrayList.add(j2);
        }
        String string5 = context.getString(R.string.football_shots_on_goal);
        string5.getClass();
        Serializable h3 = dpe.h(dpeVar, string5, footballPlayerEventStatistics2.getOnTargetScoringAttempt(), footballPlayerEventStatistics != null ? footballPlayerEventStatistics.getOnTargetScoringAttempt() : null, false, false, null, null, 120);
        if (h3 != null) {
            arrayList.add(h3);
        }
        String string6 = context.getString(R.string.football_hit_woodwork);
        string6.getClass();
        Serializable k = dpeVar.k(string6, footballPlayerEventStatistics2.getHitWoodwork(), footballPlayerEventStatistics != null ? footballPlayerEventStatistics.getHitWoodwork() : null, true, true);
        if (k != null) {
            arrayList.add(k);
        }
        String string7 = context.getString(R.string.football_shots_blocked);
        string7.getClass();
        Serializable h4 = dpe.h(dpeVar, string7, footballPlayerEventStatistics2.getBlockedScoringAttempt(), footballPlayerEventStatistics != null ? footballPlayerEventStatistics.getBlockedScoringAttempt() : null, false, false, null, null, 120);
        if (h4 != null) {
            arrayList.add(h4);
        }
        String string8 = context.getString(R.string.football_big_chances_missed);
        string8.getClass();
        Serializable k2 = dpeVar.k(string8, footballPlayerEventStatistics2.getBigChanceMissed(), footballPlayerEventStatistics != null ? footballPlayerEventStatistics.getBigChanceMissed() : null, true, true);
        if (k2 != null) {
            arrayList.add(k2);
        }
        String string9 = context.getString(R.string.penalty_miss);
        string9.getClass();
        Serializable k3 = dpeVar.k(string9, footballPlayerEventStatistics2.getPenaltyMiss(), footballPlayerEventStatistics != null ? footballPlayerEventStatistics.getPenaltyMiss() : null, true, true);
        if (k3 != null) {
            arrayList.add(k3);
        }
        String string10 = context.getString(R.string.football_offsides);
        string10.getClass();
        Serializable k4 = dpeVar.k(string10, footballPlayerEventStatistics2.getTotalOffside(), footballPlayerEventStatistics != null ? footballPlayerEventStatistics.getTotalOffside() : null, true, true);
        if (k4 != null) {
            arrayList.add(k4);
        }
        String string11 = context.getString(R.string.football_penalty_shootout_goals);
        string11.getClass();
        Serializable k5 = dpeVar.k(string11, footballPlayerEventStatistics2.getPenaltyShootoutGoal(), footballPlayerEventStatistics != null ? footballPlayerEventStatistics.getPenaltyShootoutGoal() : null, true, true);
        if (k5 != null) {
            arrayList.add(k5);
        }
        String string12 = context.getString(R.string.football_penalty_shootout_misses);
        string12.getClass();
        Serializable k6 = dpeVar.k(string12, footballPlayerEventStatistics2.getPenaltyShootoutMiss(), footballPlayerEventStatistics != null ? footballPlayerEventStatistics.getPenaltyShootoutMiss() : null, true, true);
        if (k6 != null) {
            arrayList.add(k6);
        }
        return arrayList;
    }
}
