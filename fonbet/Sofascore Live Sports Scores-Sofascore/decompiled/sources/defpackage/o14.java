package defpackage;

import com.ironsource.U3;
import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class o14 {
    public static final inb d;
    public static final o14 e;
    public static final /* synthetic */ o14[] f;
    public static final /* synthetic */ kp5 g;
    public final String a;
    public final int b;
    public final Integer c;

    static {
        o14 o14Var = new o14(0, R.string.total, null, "TOTAL", U3.i.l);
        e = o14Var;
        o14[] o14VarArr = {o14Var, new o14(1, R.string.cricket_singles_and_threes, Integer.valueOf(R.color.cricket_single_runs), "RUNS", "regular"), new o14(2, R.string.cricket_fours_short, Integer.valueOf(R.color.cricket_4s), "FOURS", "4"), new o14(3, R.string.cricket_sixes_short, Integer.valueOf(R.color.cricket_6s), "SIXES", "6")};
        f = o14VarArr;
        g = new kp5(o14VarArr);
        d = new inb(20);
    }

    public o14(int i, int i2, Integer num, String str, String str2) {
        this.a = str2;
        this.b = i2;
        this.c = num;
    }

    public static o14 valueOf(String str) {
        return (o14) Enum.valueOf(o14.class, str);
    }

    public static o14[] values() {
        return (o14[]) f.clone();
    }
}
