package defpackage;

import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class np implements e1 {
    public static final /* synthetic */ np[] f;
    public static final /* synthetic */ kp5 g;
    public final int a;
    public final int b;
    public final Function1 c;
    public final Function1 d;
    public final Function1 e;

    static {
        np[] npVarArr = {new np("TACKLES", 0, R.string.am_football_combined_tackles_short, R.string.legend_am_foot_combined_tackles, new ia(19), new ia(21), new ia(23)), new np("ASSISTED", 1, R.string.am_football_lineups_assisted, R.string.am_football_assisted_tackles_long, new ia(24), new ia(25), new ia(26)), new np("SACKS", 2, R.string.am_football_sacks_short, R.string.legend_am_foot_sacks, new ia(27), new ia(28), new ia(29)), new np("PASSES_DEFLECTED", 3, R.string.am_football_lineups_passes_deflected, R.string.legend_am_foot_passes_defended, new mp(1), new mp(0), new mp(2)), new np("BATTED_PASSES", 4, R.string.am_football_batted_pass_short, R.string.legend_am_foot_batted_passes, new mp(3), new mp(4), new mp(5)), new np("DEFENSIVE_TARGETS", 5, R.string.am_football_lineups_targets, R.string.legend_am_foot_lineups_targets, new mp(6), new mp(7), new mp(8)), new np("TACKLES_FOR_LOST_YARDS", 6, R.string.am_football_tackles_loss_short, R.string.legend_am_foot_tackles_for_loss, new mp(9), new ia(20), new ia(22))};
        f = npVarArr;
        g = new kp5(npVarArr);
    }

    public np(String str, int i, int i2, int i3, Function1 function1, Function1 function12, Function1 function13) {
        this.a = i2;
        this.b = i3;
        this.c = function1;
        this.d = function12;
        this.e = function13;
    }

    public static np valueOf(String str) {
        return (np) Enum.valueOf(np.class, str);
    }

    public static np[] values() {
        return (np[]) f.clone();
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
