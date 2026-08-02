package defpackage;

import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class y71 implements e1 {
    public static final /* synthetic */ y71[] f;
    public static final /* synthetic */ kp5 g;
    public final int a;
    public final int b;
    public final Function1 c;
    public final Function1 d;
    public final Function1 e;

    static {
        y71[] y71VarArr = {new y71("PUTOUTS", 0, R.string.baseball_putouts_short, R.string.baseball_putouts, new w71(3), new w71(20), new w71(4)), new y71("ASSISTS", 1, R.string.baseball_assists_short, R.string.baseball_assists, new w71(5), new w71(6), new w71(7)), new y71("ERRORS", 2, R.string.baseball_errors_short, R.string.baseball_errors, new w71(8), new w71(9), new w71(10)), new y71("DOUBLE_PLAYS", 3, R.string.baseball_double_plays_short, R.string.baseball_double_plays, new w71(11), new w71(12), new w71(13)), new y71("CAUGHT_STEALING", 4, R.string.baseball_outcome_caught_stealing_short, R.string.baseball_outcome_caught_stealing, new w71(14), new w71(15), new w71(16)), new y71("STOLEN_BASES_ALLOWED", 5, R.string.baseball_stolen_bases_short, R.string.baseball_stolen_bases_allowed, new w71(17), new w71(18), new w71(19))};
        f = y71VarArr;
        g = new kp5(y71VarArr);
    }

    public y71(String str, int i, int i2, int i3, Function1 function1, Function1 function12, Function1 function13) {
        this.a = i2;
        this.b = i3;
        this.c = function1;
        this.d = function12;
        this.e = function13;
    }

    public static y71 valueOf(String str) {
        return (y71) Enum.valueOf(y71.class, str);
    }

    public static y71[] values() {
        return (y71[]) f.clone();
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
}
