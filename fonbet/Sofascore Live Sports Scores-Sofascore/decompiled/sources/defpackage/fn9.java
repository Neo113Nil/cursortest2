package defpackage;

import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class fn9 implements e1 {
    public static final /* synthetic */ fn9[] g;
    public static final /* synthetic */ kp5 h;
    public final int a;
    public final int b;
    public final boolean c;
    public final Function1 d;
    public final Function1 e;
    public final Function1 f;

    static {
        fn9[] fn9VarArr = {new fn9(0, R.string.ice_hockey_lineups_saves, R.string.legend_hockey_saves, "SAVES", new yh9(6), new yh9(23), new yh9(7), true), new fn9(1, R.string.ice_hockey_lineups_save_percentage, R.string.legend_hockey_save_pct, "SAVE_PERCENTAGE", new yh9(8), new yh9(9), new yh9(10), false), new fn9(2, R.string.ice_hockey_lineups_even_strength_saves, R.string.legend_hockey_ess, "EVEN_SAVES", new yh9(11), new yh9(12), new yh9(13), true), new fn9(3, R.string.ice_hockey_lineups_power_play_saves, R.string.legend_hockey_pps, "POWER_PLAY_SAVES", new yh9(14), new yh9(15), new yh9(16), true), new fn9(4, R.string.ice_hockey_lineups_short_handed_saves, R.string.legend_hockey_shs, "SHORT_HANDED_SAVES", new yh9(17), new yh9(18), new yh9(19), true), new fn9(5, R.string.hockey_time_on_ice_short, R.string.legend_hockey_goalies_time_on_ice, "TIME", new yh9(20), new yh9(21), new yh9(22), true)};
        g = fn9VarArr;
        h = new kp5(fn9VarArr);
    }

    public fn9(int i, int i2, int i3, String str, Function1 function1, Function1 function12, Function1 function13, boolean z) {
        this.a = i2;
        this.b = i3;
        this.c = z;
        this.d = function1;
        this.e = function12;
        this.f = function13;
    }

    public static fn9 valueOf(String str) {
        return (fn9) Enum.valueOf(fn9.class, str);
    }

    public static fn9[] values() {
        return (fn9[]) g.clone();
    }

    @Override // defpackage.e1
    public final Function1 d() {
        return this.d;
    }

    @Override // defpackage.e1
    public final int g() {
        return this.a;
    }

    @Override // defpackage.e1
    public final Function1 h() {
        return this.e;
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
    public final boolean k() {
        return this.c;
    }

    @Override // defpackage.e1
    public final int l() {
        return this.b;
    }

    @Override // defpackage.e1
    public final Function1 m() {
        return this.f;
    }
}
