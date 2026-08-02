package defpackage;

import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class tp9 {
    public static final q1f c;
    public static final /* synthetic */ tp9[] d;
    public static final /* synthetic */ kp5 e;
    public final String a;
    public final Integer b;

    static {
        tp9[] tp9VarArr = {new tp9(0, "MINOR", "minor", Integer.valueOf(R.string.penalty_minor)), new tp9(1, "DOUBLE_MINOR", "doubleMinor", Integer.valueOf(R.string.penalty_double_minor)), new tp9(2, "MAJOR", "major", Integer.valueOf(R.string.penalty_major)), new tp9(3, "BENCH", "bench", Integer.valueOf(R.string.penalty_bench)), new tp9(4, "GAME", "game", null)};
        d = tp9VarArr;
        e = new kp5(tp9VarArr);
        c = new q1f(25);
    }

    public tp9(int i, String str, String str2, Integer num) {
        this.a = str2;
        this.b = num;
    }

    public static tp9 valueOf(String str) {
        return (tp9) Enum.valueOf(tp9.class, str);
    }

    public static tp9[] values() {
        return (tp9[]) d.clone();
    }
}
