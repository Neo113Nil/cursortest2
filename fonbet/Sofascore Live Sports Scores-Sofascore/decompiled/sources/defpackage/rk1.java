package defpackage;

import com.sofascore.model.mvvm.model.PlayerKt;
import com.sofascore.results.R;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class rk1 {
    public static final mx9 d;
    public static final Set e;
    public static final LinkedHashMap f;
    public static final rk1 g;
    public static final /* synthetic */ rk1[] h;
    public final String a;
    public final int b;
    public final int c;

    static {
        rk1 rk1Var = new rk1("Pitcher", 0, "P", R.string.baseball_position_pitcher, R.string.baseball_position_pitcher_short);
        rk1 rk1Var2 = new rk1("Catcher", 1, "C", R.string.baseball_position_catcher, R.string.baseball_position_catcher_short);
        rk1 rk1Var3 = new rk1("FirstBase", 2, "1B", R.string.baseball_position_first_baseman, R.string.baseball_position_first_baseman_short);
        rk1 rk1Var4 = new rk1("SecondBase", 3, "2B", R.string.baseball_position_second_baseman, R.string.baseball_position_second_baseman_short);
        rk1 rk1Var5 = new rk1("ThirdBase", 4, "3B", R.string.baseball_position_third_baseman, R.string.baseball_position_third_baseman_short);
        rk1 rk1Var6 = new rk1("Shortstop", 5, PlayerKt.AMERICAN_FOOTBALL_STRONG_SAFETY, R.string.baseball_position_shortstop, R.string.baseball_position_shortstop_short);
        rk1 rk1Var7 = new rk1("LeftField", 6, "LF", R.string.baseball_position_left_fielder, R.string.baseball_position_left_fielder_short);
        rk1 rk1Var8 = new rk1("CenterField", 7, "CF", R.string.baseball_position_center_fielder, R.string.baseball_position_center_fielder_short);
        rk1 rk1Var9 = new rk1("RightField", 8, "RF", R.string.baseball_position_right_fielder, R.string.baseball_position_right_fielder_short);
        rk1 rk1Var10 = new rk1("DesignatedHitter", 9, "DH", R.string.baseball_position_designated_hitter, R.string.baseball_position_designated_hitter_short);
        rk1 rk1Var11 = new rk1("StartingPitcher", 10, "SP", R.string.baseball_position_starting_pitcher, R.string.baseball_position_starting_pitcher_short);
        rk1 rk1Var12 = new rk1("Closer", 11, "CP", R.string.baseball_position_closer, R.string.baseball_position_closer_short);
        rk1 rk1Var13 = new rk1("PinchHitter", 12, "PH", R.string.baseball_position_pinch_hitter, R.string.baseball_position_pinch_hitter_short);
        rk1 rk1Var14 = new rk1("PinchRunner", 13, PlayerKt.AMERICAN_FOOTBALL_PUNT_RETURNER, R.string.baseball_position_pinch_runner, R.string.baseball_position_pinch_runner_short);
        rk1 rk1Var15 = new rk1("BaseRunner", 14, "BR", R.string.baseball_position_baserunner, R.string.baseball_position_baserunner_short);
        rk1 rk1Var16 = new rk1("Outfield", 15, "OF", R.string.baseball_position_outfielder, R.string.baseball_position_outfielder_short);
        rk1 rk1Var17 = new rk1("Infield", 16, "IF", R.string.baseball_position_infielder, R.string.baseball_position_infielder_short);
        rk1 rk1Var18 = new rk1("ReliefPitcher", 17, "RP", R.string.baseball_position_relief_pitcher, R.string.baseball_position_relief_pitcher_short);
        rk1 rk1Var19 = new rk1("Utility", 18, "UT", R.string.baseball_position_utility_player, R.string.baseball_position_utility_player_short);
        rk1 rk1Var20 = new rk1("UtilityInfielder", 19, "UI", R.string.baseball_position_utility_infielder, R.string.baseball_position_utility_infielder_short);
        rk1 rk1Var21 = new rk1("UtilityOutfielder", 20, "UO", R.string.baseball_position_utility_outfielder, R.string.baseball_position_utility_outfielder_short);
        rk1 rk1Var22 = new rk1("RightHandedPitcher", 21, "RHP", R.string.baseball_position_right_handed_pitcher, R.string.baseball_position_right_handed_pitcher_short);
        rk1 rk1Var23 = new rk1("LeftHandedPitcher", 22, "LHP", R.string.baseball_position_left_handed_pitcher, R.string.baseball_position_left_handed_pitcher_short);
        rk1 rk1Var24 = new rk1("RightHandedStarter", 23, "RHS", R.string.baseball_position_right_handed_starter, R.string.baseball_position_right_handed_starter_short);
        rk1 rk1Var25 = new rk1("LeftHandedStarter", 24, "LHS", R.string.baseball_position_left_handed_starter, R.string.baseball_position_left_handed_starter_short);
        rk1 rk1Var26 = new rk1("LeftHandedReliever", 25, "LHR", R.string.baseball_position_left_handed_reliever, R.string.baseball_position_left_handed_reliever_short);
        rk1 rk1Var27 = new rk1("RightHandedReliever", 26, "RHR", R.string.baseball_position_right_handed_reliever, R.string.baseball_position_right_handed_reliever_short);
        rk1 rk1Var28 = new rk1("Batter", 27, "B", R.string.baseball_position_batter, R.string.baseball_position_batter_short);
        rk1 rk1Var29 = new rk1("SetupMan", 28, "SU", R.string.baseball_position_setup_pitcher, R.string.baseball_position_setup_pitcher_short);
        rk1 rk1Var30 = new rk1("LongReliever", 29, "LR", R.string.baseball_position_long_reliever, R.string.baseball_position_long_reliever_short);
        rk1 rk1Var31 = new rk1("MiddleReliever", 30, "MR", R.string.baseball_position_middle_reliever, R.string.baseball_position_middle_reliever_short);
        rk1 rk1Var32 = new rk1("LeftHandedSpecialist", 31, "LSP", R.string.baseball_position_left_handed_specialist, R.string.baseball_position_left_handed_specialist_short);
        rk1 rk1Var33 = new rk1("RightHandedSpecialist", 32, "RSP", R.string.baseball_position_right_handed_specialist, R.string.baseball_position_right_handed_specialist_short);
        rk1 rk1Var34 = new rk1("EmergencyPitcher", 33, "EP", R.string.baseball_position_emergency_pitcher, R.string.baseball_position_emergency_pitcher_short);
        rk1 rk1Var35 = new rk1("TwoWayPlayer", 34, "TWP", R.string.baseball_position_two_way_player, R.string.baseball_position_two_way_player_short);
        g = rk1Var35;
        rk1[] rk1VarArr = {rk1Var, rk1Var2, rk1Var3, rk1Var4, rk1Var5, rk1Var6, rk1Var7, rk1Var8, rk1Var9, rk1Var10, rk1Var11, rk1Var12, rk1Var13, rk1Var14, rk1Var15, rk1Var16, rk1Var17, rk1Var18, rk1Var19, rk1Var20, rk1Var21, rk1Var22, rk1Var23, rk1Var24, rk1Var25, rk1Var26, rk1Var27, rk1Var28, rk1Var29, rk1Var30, rk1Var31, rk1Var32, rk1Var33, rk1Var34, rk1Var35};
        h = rk1VarArr;
        kp5 kp5Var = new kp5(rk1VarArr);
        d = new mx9();
        e = ph0.a0(new String[]{"2W", "TWP"});
        int c = sub.c(k13.r(kp5Var, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(c < 16 ? 16 : c);
        for (Object obj : kp5Var) {
            linkedHashMap.put(((rk1) obj).a, obj);
        }
        f = linkedHashMap;
    }

    public rk1(String str, int i, String str2, int i2, int i3) {
        this.a = str2;
        this.b = i2;
        this.c = i3;
    }

    public static rk1 valueOf(String str) {
        return (rk1) Enum.valueOf(rk1.class, str);
    }

    public static rk1[] values() {
        return (rk1[]) h.clone();
    }
}
