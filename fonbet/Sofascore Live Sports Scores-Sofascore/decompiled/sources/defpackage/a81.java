package defpackage;

import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class a81 implements e1 {
    public static final /* synthetic */ a81[] g;
    public static final /* synthetic */ kp5 h;
    public final int a;
    public final int b;
    public final Function1 c;
    public final Function1 d;
    public final Function1 e;
    public final boolean f;

    static {
        a81[] a81VarArr = {new a81(0, R.string.baseball_innings_pitched_short, R.string.baseball_innings_pitched, "INNINGS_PITCHED", new w71(21), new w71(23), new z71(5), true), new a81(1, R.string.baseball_earned_run_average_short, R.string.baseball_earned_run_average, "ERA", new z71(9), new z71(10), new z71(11), false), new a81(2, R.string.baseball_hits_short, R.string.baseball_hits_allowed, "HITS_ALLOWED", new z71(12), new z71(14), new z71(15), true), new a81(3, R.string.baseball_runs_short, R.string.baseball_runs_allowed, "RUNS", new z71(16), new z71(2), new z71(13), true), new a81(4, R.string.baseball_earned_runs_short, R.string.baseball_earned_runs, "EARNED_RUNS", new z71(17), new z71(18), new z71(19), true), new a81(5, R.string.baseball_walks_short, R.string.baseball_walks_allowed, "WALKS_ALLOWED", new z71(20), new z71(21), new z71(22), true), new a81(6, R.string.baseball_strikeouts_short, R.string.baseball_strikeouts, "STRIKEOUTS", new z71(23), new w71(22), new w71(24), true), new a81(7, R.string.baseball_home_runs_short, R.string.baseball_home_runs_allowed, "HOME_RUNS_ALLOWED", new w71(25), new w71(26), new w71(27), true), new a81(8, R.string.baseball_number_of_pitches_short, R.string.baseball_number_of_pitches, "PITCHES_THROWN", new w71(28), new w71(29), new z71(0), true), new a81(9, R.string.baseball_strikes_thrown_short, R.string.baseball_strikes_thrown, "STRIKES_THROWN", new z71(1), new z71(3), new z71(4), true), new a81(10, R.string.baseball_walks_hits_per_inning_pitched_short, R.string.baseball_walks_hits_per_inning_pitched, "WHIP", new z71(6), new z71(7), new z71(8), false)};
        g = a81VarArr;
        h = new kp5(a81VarArr);
    }

    public a81(int i, int i2, int i3, String str, Function1 function1, Function1 function12, Function1 function13, boolean z) {
        this.a = i2;
        this.b = i3;
        this.c = function1;
        this.d = function12;
        this.e = function13;
        this.f = z;
    }

    public static a81 valueOf(String str) {
        return (a81) Enum.valueOf(a81.class, str);
    }

    public static a81[] values() {
        return (a81[]) g.clone();
    }

    @Override // defpackage.e1
    public final Function1 d() {
        return this.c;
    }

    @Override // defpackage.e1
    public final int g() {
        return this.a;
    }

    @Override // defpackage.e1
    public final Function1 h() {
        return this.d;
    }

    @Override // defpackage.e1
    public final boolean i() {
        return false;
    }

    @Override // defpackage.e1
    public final boolean j() {
        return false;
    }

    @Override // defpackage.e1
    public final int l() {
        return this.b;
    }

    @Override // defpackage.e1
    public final Function1 m() {
        return this.e;
    }

    @Override // defpackage.e1
    public final boolean n() {
        return this.f;
    }
}
