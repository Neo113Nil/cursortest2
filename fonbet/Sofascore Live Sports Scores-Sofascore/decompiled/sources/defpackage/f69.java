package defpackage;

import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class f69 implements e1 {
    public static final /* synthetic */ f69[] f;
    public static final /* synthetic */ kp5 g;
    public final int a;
    public final int b;
    public final Function1 c;
    public final Function1 d;
    public final Function1 e;

    static {
        f69[] f69VarArr = {new f69("GOALS", 0, R.string.handball_lineups_goals, R.string.legend_handball_goals, new c69(5), new c69(22), new c69(6)), new f69("SHOOTING_PCT", 1, R.string.handball_lineups_shooting_percentage, R.string.legend_handball_shot_accuracy, new c69(7), new c69(8), new c69(9)), new f69("ASSISTS", 2, R.string.handball_lineups_assists, R.string.legend_handball_assists, new c69(10), new c69(11), new c69(12)), new f69("STEALS", 3, R.string.handball_lineups_steals, R.string.legend_handball_steals, new c69(13), new c69(14), new c69(15)), new f69("BLOCKS", 4, R.string.handball_lineups_blocks, R.string.legend_handball_blocked_shots, new c69(16), new c69(17), new c69(18)), new f69("PENALTY", 5, R.string.handball_lineups_penalty, R.string.legend_handball_two_min_penalty, new c69(19), new c69(20), new c69(21))};
        f = f69VarArr;
        g = new kp5(f69VarArr);
    }

    public f69(String str, int i, int i2, int i3, Function1 function1, Function1 function12, Function1 function13) {
        this.a = i2;
        this.b = i3;
        this.c = function1;
        this.d = function12;
        this.e = function13;
    }

    public static f69 valueOf(String str) {
        return (f69) Enum.valueOf(f69.class, str);
    }

    public static f69[] values() {
        return (f69[]) f.clone();
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
