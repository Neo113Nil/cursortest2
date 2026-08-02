package defpackage;

import com.appsflyer.sdk_base.referrer.Payload;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.mvvm.model.IncidentKt;
import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF4' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class j43 {
    public static final j43 e;
    public static final j43 f;
    public static final j43 g;
    public static final j43 h;
    public static final j43 i;
    public static final j43 j;
    public static final j43 k;
    public static final j43 l;
    public static final j43 m;
    public static final j43 n;
    public static final /* synthetic */ j43[] o;
    public final String a;
    public final Function1 b;
    public final boolean c;
    public final Integer d;

    /* JADX INFO: Fake field, exist only in values array */
    j43 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    j43 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    j43 EF2;

    /* JADX INFO: Fake field, exist only in values array */
    j43 EF3;

    /* JADX INFO: Fake field, exist only in values array */
    j43 EF4;

    static {
        j43 j43Var = new j43("INJURY", 0, "injury", new b42(20), true, Integer.valueOf(R.string.commentary_injury));
        j43 j43Var2 = new j43("INJURY_RETURN", 1, "injuryReturn", null, true, Integer.valueOf(R.string.commentary_injury_return));
        j43 j43Var3 = new j43("PERIOD_STARTED", 2, "periodStart", null, true, null);
        j43 j43Var4 = new j43("MATCH_STARTED", 3, "matchStarted", null, true, null);
        qa5 qa5Var = qa5.a;
        Class<qa5> cls = qa5.class;
        j43 j43Var5 = new j43("HALF_TIME", 4, "periodScore", new kj1(1, qa5Var, cls, "getHalfTimeIcon16", "getHalfTimeIcon16(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", 0, 21), true, Integer.valueOf(R.string.halftime));
        int i2 = 0;
        int i3 = 1;
        j43 j43Var6 = new j43("MATCH_ENDED", 5, "matchEnded", new kj1(i3, qa5Var, cls, "getFullTimeIcon16", "getFullTimeIcon16(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", i2, 22), true, null);
        e = j43Var6;
        j43 j43Var7 = new j43("YELLOW_CARD", 6, "yellowCard", new kj1(i3, qa5Var, cls, "getYellowCardIcon16", "getYellowCardIcon16(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", i2, 23), true, Integer.valueOf(R.string.yellow_card));
        kj1 kj1Var = new kj1(i3, qa5Var, cls, "getYellowRedCardIcon16", "getYellowRedCardIcon16(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", i2, 24);
        Integer valueOf = Integer.valueOf(R.string.red_card);
        j43 j43Var8 = new j43("YELLOW_RED_CARD", 7, "yellowRedCard", kj1Var, true, valueOf);
        j43 j43Var9 = new j43("RED_CARD", 8, "redCard", new kj1(i3, qa5Var, cls, "getRedCardIcon16", "getRedCardIcon16(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", i2, 25), true, valueOf);
        j43 j43Var10 = new j43("VIDEO_ASSISTANT_REFEREE", 9, "videoAssistantReferee", new i43(i3, qa5Var, cls, "getVarIcon16", "getVarIcon16(Landroid/content/Context;Z)Landroid/graphics/drawable/Drawable;", 0, 0), true, Integer.valueOf(R.string.football_var));
        j43 j43Var11 = new j43("VIDEO_ASSISTANT_REFEREE_OVER", 10, "videoAssistantRefereeOver", new i43(i3, qa5Var, cls, "getVarIcon16", "getVarIcon16(Landroid/content/Context;Z)Landroid/graphics/drawable/Drawable;", 0, 1), true, Integer.valueOf(R.string.commentary_var_check_over));
        j43 j43Var12 = new j43("PENALTY_AWARDED", 11, Incident.VarDecisionIncident.PENALTY_AWARDED, null, true, Integer.valueOf(R.string.commentary_penalty_awarded));
        j43 j43Var13 = new j43("PENALTY_MISSED", 12, "penaltyMissed", new kj1(i3, qa5Var, cls, "getPenaltyMissedIcon16", "getPenaltyMissedIcon16(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", 0, 26), true, Integer.valueOf(R.string.commentary_penalty_missed));
        j43 j43Var14 = new j43("PENALTY_SAVED", 13, "penaltySaved", new kj1(i3, qa5Var, cls, "getPenaltyMissedIcon16", "getPenaltyMissedIcon16(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", 0, 10), true, Integer.valueOf(R.string.football_commentary_penalty_saved));
        kj1 kj1Var2 = new kj1(1, qa5Var, cls, "getFootballPenaltyIcon16", "getFootballPenaltyIcon16(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", 0, 11);
        Integer valueOf2 = Integer.valueOf(R.string.commentary_goal);
        j43 j43Var15 = new j43("PENALTY_SCORED", 14, "penaltyScored", kj1Var2, true, valueOf2);
        j43 j43Var16 = new j43("SCORE_CHANGE", 15, "scoreChange", null, true, valueOf2);
        f = j43Var16;
        j43 j43Var17 = new j43("SHOT_ON_TARGET", 16, "shotOnTarget", null, true, Integer.valueOf(R.string.commentary_shot_on_target));
        j43 j43Var18 = new j43("SUBSTITUTION", 17, IncidentKt.TYPE_SUBSTITUTION, new b42(21), true, Integer.valueOf(R.string.substitution));
        g = j43Var18;
        j43 j43Var19 = new j43("CORNER_KICK", 18, "cornerKick", null, false, null);
        j43 j43Var20 = new j43("FREE_KICK", 19, "freeKick", null, false, null);
        j43 j43Var21 = new j43("GOAL_KICK", 20, "goalKick", null, false, null);
        j43 j43Var22 = new j43("SHOT_SAVED", 21, "shotSaved", null, false, null);
        j43 j43Var23 = new j43("POSSIBLE_GOAL", 22, "possibleGoal", null, false, null);
        j43 j43Var24 = new j43("THROW_IN", 23, "throwIn", null, false, null);
        j43 j43Var25 = new j43("SHOT_OFF_TARGET", 24, "shotOffTarget", null, false, null);
        j43 j43Var26 = new j43("OFFSIDE", 25, "offside", null, false, null);
        j43 j43Var27 = new j43("FOUL", 26, "foul", null, false, null);
        int i4 = 0;
        int i5 = 1;
        j43 j43Var28 = new j43("TOUCHDOWN", 27, Incident.GoalIncident.TYPE_TOUCHDOWN, new kj1(i5, qa5Var, cls, "getAmFootballTouchdownIcon16", "getAmFootballTouchdownIcon16(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", i4, 12), true, Integer.valueOf(R.string.commentary_touchdown));
        h = j43Var28;
        j43 j43Var29 = new j43("EXTRA_POINT", 28, Incident.GoalIncident.TYPE_EXTRA_POINT, new kj1(i5, qa5Var, cls, "getAmFootballExtraPointIcon16", "getAmFootballExtraPointIcon16(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", i4, 13), true, Integer.valueOf(R.string.commentary_extra_point));
        i = j43Var29;
        j43 j43Var30 = new j43("FIELD_GOAL", 29, Incident.GoalIncident.TYPE_FIELD_GOAL, new kj1(i5, qa5Var, cls, "getAmFootballFieldGoalIcon16", "getAmFootballFieldGoalIcon16(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", i4, 14), true, Integer.valueOf(R.string.commentary_field_goal));
        j43 j43Var31 = new j43("TWO_POINT_CONVERSION", 30, Incident.GoalIncident.TYPE_TWO_POINT_CONV, new kj1(1, qa5Var, cls, "getAmFootballTwoPointConversionIcon16", "getAmFootballTwoPointConversionIcon16(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", i4, 15), true, Integer.valueOf(R.string.commentary_two_pt_conversion));
        j43 j43Var32 = new j43("SAFETY", 31, Incident.GoalIncident.TYPE_SAFETY, new kj1(1, qa5Var, cls, "getAmFootballSafetyIcon16", "getAmFootballSafetyIcon16(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", i4, 16), true, Integer.valueOf(R.string.commentary_safety));
        int i6 = 1;
        j43 j43Var33 = new j43("PERIOD_END", 32, "periodEnd", new kj1(i6, qa5Var, cls, "getPeriodIcon16", "getPeriodIcon16(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", i4, 17), true, null);
        j = j43Var33;
        j43 j43Var34 = new j43("FOURTH_DOWN_CONVERSION", 33, "fourthDownConversion", null, true, Integer.valueOf(R.string.commentary_4th_down_conversion));
        j43 j43Var35 = new j43("FIELD_GOAL_MISS", 34, "fieldGoalMiss", null, true, Integer.valueOf(R.string.commentary_missed_field_goal));
        j43 j43Var36 = new j43("TURNOVER_ON_DOWNS", 35, "turnoverOnDowns", null, true, Integer.valueOf(R.string.commentary_turnover_on_downs));
        j43 j43Var37 = new j43("TEN_YARDS_PLAY", 36, "tenYardsPlay", null, true, null);
        k = j43Var37;
        j43 j43Var38 = new j43("TWO_MINUTE_WARNING", 37, "twoMinuteWarning", null, true, null);
        j43 j43Var39 = new j43("PASS_INTERCEPTION_RETURN", 38, "passInterceptionReturn", null, true, null);
        j43 j43Var40 = new j43("PENALTY", 39, "penalty", new kj1(i6, qa5Var, cls, "getAmFootballPenaltyIcon16", "getAmFootballPenaltyIcon16(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", i4, 18), false, null);
        j43 j43Var41 = new j43("FORCED_FUMBLE", 40, "forcedFumble", null, false, null);
        j43 j43Var42 = new j43("OPPONENT_FUMBLE_RECOVERY", 41, "opponentFumbleRecovery", null, false, null);
        j43 j43Var43 = new j43("PASS_INTERCEPTION", 42, "passInterception", null, false, null);
        j43 j43Var44 = new j43(Payload.RESPONSE_TIMEOUT, 43, "timeout", null, false, null);
        j43 j43Var45 = new j43("FREE_THROW_MISS", 44, "freeThrowMiss", null, false, null);
        j43 j43Var46 = new j43("HALF_INNING_PITCHER", 45, "baseballInningHalfPitcher", new kj1(i6, qa5Var, cls, "getBaseballPitchingIcon16", "getBaseballPitchingIcon16(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", i4, 19), false, null);
        l = j43Var46;
        j43 j43Var47 = new j43("AT_BAT", 46, "atBat", new kj1(i6, qa5Var, cls, "getBaseballBattingIcon16", "getBaseballBattingIcon16(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", i4, 20), false, null);
        m = j43Var47;
        j43 j43Var48 = new j43("LINEUP_CHANGE", 47, "baseballLineupChange", new b42(22), false, null);
        n = j43Var48;
        o = new j43[]{j43Var, j43Var2, j43Var3, j43Var4, j43Var5, j43Var6, j43Var7, j43Var8, j43Var9, j43Var10, j43Var11, j43Var12, j43Var13, j43Var14, j43Var15, j43Var16, j43Var17, j43Var18, j43Var19, j43Var20, j43Var21, j43Var22, j43Var23, j43Var24, j43Var25, j43Var26, j43Var27, j43Var28, j43Var29, j43Var30, j43Var31, j43Var32, j43Var33, j43Var34, j43Var35, j43Var36, j43Var37, j43Var38, j43Var39, j43Var40, j43Var41, j43Var42, j43Var43, j43Var44, j43Var45, j43Var46, j43Var47, j43Var48};
    }

    public j43(String str, int i2, String str2, Function1 function1, boolean z, Integer num) {
        this.a = str2;
        this.b = function1;
        this.c = z;
        this.d = num;
    }

    public static j43 valueOf(String str) {
        return (j43) Enum.valueOf(j43.class, str);
    }

    public static j43[] values() {
        return (j43[]) o.clone();
    }
}
