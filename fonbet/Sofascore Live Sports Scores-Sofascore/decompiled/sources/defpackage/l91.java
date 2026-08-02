package defpackage;

import com.sofascore.model.newNetwork.commentary.BaseballActionOutcome;
import com.sofascore.results.R;
import java.util.Set;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class l91 {
    public static final k03 e;
    public static final l91 f;
    public static final l91 g;
    public static final l91 h;
    public static final l91 i;
    public static final l91 j;
    public static final l91 k;
    public static final l91 l;
    public static final l91 m;
    public static final l91 n;
    public static final /* synthetic */ l91[] o;
    public static final /* synthetic */ kp5 p;
    public final Set a;
    public final int b;
    public final int c;
    public final int d;

    static {
        l91 l91Var = new l91("Single", 0, ph0.a0(new BaseballActionOutcome[]{BaseballActionOutcome.Single, BaseballActionOutcome.SingleAdv2nd, BaseballActionOutcome.SingleAdv3rd, BaseballActionOutcome.SingleAdvHome, BaseballActionOutcome.SingleTaggedOut1st, BaseballActionOutcome.SingleOut2nd, BaseballActionOutcome.SingleOut3rd, BaseballActionOutcome.SingleOutHome}), R.string.baseball_singles_short, R.string.baseball_outcome_single, R.color.secondary_default);
        f = l91Var;
        l91 l91Var2 = new l91("Double", 1, ph0.a0(new BaseballActionOutcome[]{BaseballActionOutcome.Double, BaseballActionOutcome.DoubleAdv3rd, BaseballActionOutcome.DoubleAdvHome}), R.string.baseball_doubles_short, R.string.baseball_outcome_double, R.color.rating_80);
        g = l91Var2;
        l91 l91Var3 = new l91("Triple", 2, ph0.a0(new BaseballActionOutcome[]{BaseballActionOutcome.Triple, BaseballActionOutcome.TripleAdvHome, BaseballActionOutcome.TripleTaggedOut3rd, BaseballActionOutcome.TripleOutHome}), R.string.baseball_triples_short, R.string.baseball_outcome_triple, R.color.rating_65);
        h = l91Var3;
        l91 l91Var4 = new l91("Homerun", 3, w9h.b(BaseballActionOutcome.Homerun), R.string.baseball_home_runs_short, R.string.baseball_outcome_home_run, R.color.primary_default);
        i = l91Var4;
        l91 l91Var5 = new l91("Walk", 4, ph0.a0(new BaseballActionOutcome[]{BaseballActionOutcome.IntentionalWalk, BaseballActionOutcome.Walk}), R.string.baseball_walks_short, R.string.baseball_outcome_walk, R.color.away_variant);
        l91 l91Var6 = new l91("HitByPitch", 5, w9h.b(BaseballActionOutcome.HitByPitch), R.string.baseball_hit_by_pitch_short, R.string.baseball_outcome_hit_by_pitch, R.color.n_lv_1);
        l91 l91Var7 = new l91("Error", 6, ph0.a0(new BaseballActionOutcome[]{BaseballActionOutcome.ReachedOnError, BaseballActionOutcome.ReachedOnErrorAdv2nd, BaseballActionOutcome.ReachedOnErrorAdv3rd, BaseballActionOutcome.ReachedOnErrorAdvHome, BaseballActionOutcome.ReachedOnErrorOut2nd, BaseballActionOutcome.ReachedOnErrorOut3rd, BaseballActionOutcome.ReachedOnErrorOutHome}), R.string.baseball_errors_short, R.string.baseball_outcome_error, R.color.moto_2);
        j = l91Var7;
        l91 l91Var8 = new l91("Sacrifice", 7, ph0.a0(new BaseballActionOutcome[]{BaseballActionOutcome.SacrificeBuntAdv1st, BaseballActionOutcome.SacrificeBuntAdv2nd, BaseballActionOutcome.SacrificeBuntAdv3rd, BaseballActionOutcome.SacrificeBuntAdvHome, BaseballActionOutcome.SacrificeBunt, BaseballActionOutcome.SacrificeBuntOut2nd, BaseballActionOutcome.SacrificeBuntOut3rd, BaseballActionOutcome.SacrificeBuntOutHome, BaseballActionOutcome.SacrificeFlyAdv1st, BaseballActionOutcome.SacrificeFlyAdv2nd, BaseballActionOutcome.SacrificeFlyAdv3rd, BaseballActionOutcome.SacrificeFlyAdvHome, BaseballActionOutcome.SacrificeFly, BaseballActionOutcome.SacrificeFlyOut2nd, BaseballActionOutcome.SacrificeFlyOut3rd, BaseballActionOutcome.SacrificeFlyOutHome}), R.string.baseball_total_sacrifices_short, R.string.baseball_outcome_sacrifice_hit, R.color.cricket_6s);
        l91 l91Var9 = new l91("FieldOut", 8, ph0.a0(new BaseballActionOutcome[]{BaseballActionOutcome.FieldersChoiceAdv2nd, BaseballActionOutcome.FieldersChoiceAdv3rd, BaseballActionOutcome.FieldersChoiceAdvHome, BaseballActionOutcome.DoubleTaggedOut2nd, BaseballActionOutcome.DoubleOut3rd, BaseballActionOutcome.DoubleOutHome, BaseballActionOutcome.FlyOut, BaseballActionOutcome.GroundOut, BaseballActionOutcome.LineOut, BaseballActionOutcome.PopOut, BaseballActionOutcome.TagOut1st, BaseballActionOutcome.TagOut2nd, BaseballActionOutcome.TagOut3rd, BaseballActionOutcome.TagOutHome, BaseballActionOutcome.ForceOut1st, BaseballActionOutcome.ForceOut2nd, BaseballActionOutcome.ForceOut3rd, BaseballActionOutcome.ForceOutHome}), R.string.baseball_field_out_short, R.string.baseball_outcome_field_out, R.color.neutral_default);
        k = l91Var9;
        l91 l91Var10 = new l91("Strikeout", 9, ph0.a0(new BaseballActionOutcome[]{BaseballActionOutcome.StrikeLookingAdv1st, BaseballActionOutcome.StrikeLookingAdv2nd, BaseballActionOutcome.StrikeLookingAdv3rd, BaseballActionOutcome.StrikeLookingAdvHome, BaseballActionOutcome.StrikeSwingingAdv1st, BaseballActionOutcome.StrikeSwingingAdv2nd, BaseballActionOutcome.StrikeSwingingAdv3rd, BaseballActionOutcome.StrikeSwingingAdvHome, BaseballActionOutcome.StrikeLookingOut1st, BaseballActionOutcome.StrikeLookingOut2nd, BaseballActionOutcome.StrikeLookingOut3rd, BaseballActionOutcome.StrikeLookingOutHome, BaseballActionOutcome.StrikeSwingingOut1st, BaseballActionOutcome.StrikeSwingingOut2nd, BaseballActionOutcome.StrikeSwingingOut3rd, BaseballActionOutcome.StrikeSwingingOutHome}), R.string.baseball_strikeouts_short, R.string.baseball_outcome_strikeout, R.color.error);
        l = l91Var10;
        l91 l91Var11 = new l91("FoulBall", 10, ph0.a0(new BaseballActionOutcome[]{BaseballActionOutcome.FoulBall, BaseballActionOutcome.FoulTip}), R.string.baseball_outcome_foul_ball_short, R.string.baseball_outcome_foul_ball, R.color.neutral_variant);
        l91 l91Var12 = new l91("Ball", 11, ph0.a0(new BaseballActionOutcome[]{BaseballActionOutcome.EnforcedBall, BaseballActionOutcome.BallAutomaticPitchTimerViolationPitcher, BaseballActionOutcome.BallAutomaticPitchTimerViolationCatcher, BaseballActionOutcome.BallAutomaticShiftViolation, BaseballActionOutcome.Ball, BaseballActionOutcome.DirtBall, BaseballActionOutcome.IntentionalBall, BaseballActionOutcome.Pitchout}), R.string.baseball_balls_short, R.string.baseball_outcome_ball, R.color.cricket_drs);
        m = l91Var12;
        l91 l91Var13 = new l91("Strike", 12, ph0.a0(new BaseballActionOutcome[]{BaseballActionOutcome.EnforcedStrike, BaseballActionOutcome.StrikeAutomaticPitchTimerViolation, BaseballActionOutcome.StrikeAutomaticBatterTimeoutViolation, BaseballActionOutcome.StrikeLooking, BaseballActionOutcome.StrikeSwinging}), R.string.baseball_strikes_short, R.string.baseball_outcome_strike, R.color.baseball_pitch_outcome_strike);
        n = l91Var13;
        l91[] l91VarArr = {l91Var, l91Var2, l91Var3, l91Var4, l91Var5, l91Var6, l91Var7, l91Var8, l91Var9, l91Var10, l91Var11, l91Var12, l91Var13};
        o = l91VarArr;
        p = new kp5(l91VarArr);
        e = new k03();
    }

    public l91(String str, int i2, Set set, int i3, int i4, int i5) {
        this.a = set;
        this.b = i3;
        this.c = i4;
        this.d = i5;
    }

    public static l91 valueOf(String str) {
        return (l91) Enum.valueOf(l91.class, str);
    }

    public static l91[] values() {
        return (l91[]) o.clone();
    }
}
