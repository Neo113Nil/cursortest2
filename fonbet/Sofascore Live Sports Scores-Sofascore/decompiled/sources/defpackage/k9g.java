package defpackage;

import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class k9g implements e1 {
    public static final /* synthetic */ k9g[] f;
    public static final /* synthetic */ kp5 g;
    public final int a;
    public final int b;
    public final Function1 c;
    public final Function1 d;
    public final Function1 e;

    static {
        k9g[] k9gVarArr = {new k9g("POINTS", 0, R.string.rugby_boxscore_points, R.string.rugby_points, new osf(13), new osf(15), new osf(27)), new k9g("TRIES", 1, R.string.rugby_boxscore_tries, R.string.rugby_tries, new j9g(8), new j9g(9), new j9g(10)), new k9g("TACKLES", 2, R.string.rugby_boxscore_tackles, R.string.legend_rugby_tackles, new j9g(11), new j9g(12), new j9g(13)), new k9g("PENALTY_GOALS", 3, R.string.rugby_boxscore_penalty_goals, R.string.legend_rugby_penalty_goals, new j9g(14), new osf(24), new j9g(5)), new k9g("PASSES", 4, R.string.rugby_boxscore_passes, R.string.legend_rugby_passes, new j9g(15), new j9g(16), new j9g(17)), new k9g("CARRIES", 5, R.string.rugby_boxscore_carries, R.string.legend_rugby_carries, new j9g(18), new j9g(19), new j9g(20)), new k9g("CLEAN_BREAKS", 6, R.string.rugby_boxscore_clean_breaks, R.string.legend_rugby_clean_breaks, new j9g(21), new osf(14), new osf(16)), new k9g("DROP_GOALS", 7, R.string.rugby_boxscore_drop_goals, R.string.legend_rugby_drop_goals, new osf(17), new osf(18), new osf(19)), new k9g("METERS_RUN", 8, R.string.rugby_boxscore_meters_run, R.string.legend_rugby_meters_run, new osf(20), new osf(21), new osf(22)), new k9g("OFFLOADS", 9, R.string.rugby_boxscore_offloads, R.string.legend_rugby_offloads, new osf(23), new osf(25), new osf(26)), new k9g("TACKLES_MISSED", 10, R.string.rugby_boxscore_tackles_missed, R.string.legend_rugby_tackles_missed, new osf(28), new osf(29), new j9g(0)), new k9g("TRY_ASSIST", 11, R.string.rugby_boxscore_try_assist, R.string.rugby_try_assists, new j9g(1), new j9g(2), new j9g(3)), new k9g("TURNOVERS_WON", 12, R.string.rugby_boxscore_turnovers_won, R.string.legend_rugby_turnovers_won, new j9g(4), new j9g(6), new j9g(7))};
        f = k9gVarArr;
        g = new kp5(k9gVarArr);
    }

    public k9g(String str, int i, int i2, int i3, Function1 function1, Function1 function12, Function1 function13) {
        this.a = i2;
        this.b = i3;
        this.c = function1;
        this.d = function12;
        this.e = function13;
    }

    public static k9g valueOf(String str) {
        return (k9g) Enum.valueOf(k9g.class, str);
    }

    public static k9g[] values() {
        return (k9g[]) f.clone();
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
    public final boolean k() {
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
}
