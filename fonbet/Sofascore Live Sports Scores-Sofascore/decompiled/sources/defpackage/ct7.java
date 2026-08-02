package defpackage;

import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ct7 {
    public static final ct7 c;
    public static final ct7 d;
    public static final ct7 e;
    public static final ct7 f;
    public static final /* synthetic */ ct7[] g;
    public static final /* synthetic */ kp5 h;
    public final int a;
    public final hwg b;

    static {
        ct7 ct7Var = new ct7("EVENTS", 0, R.string.events, hwg.c);
        c = ct7Var;
        ct7 ct7Var2 = new ct7("TEAMS", 1, R.string.teams, hwg.d);
        d = ct7Var2;
        ct7 ct7Var3 = new ct7("COMPETITIONS", 2, R.string.competitions, hwg.f);
        e = ct7Var3;
        ct7 ct7Var4 = new ct7("ATHLETES", 3, R.string.athletes, hwg.e);
        f = ct7Var4;
        ct7[] ct7VarArr = {ct7Var, ct7Var2, ct7Var3, ct7Var4};
        g = ct7VarArr;
        h = new kp5(ct7VarArr);
    }

    public ct7(String str, int i, int i2, hwg hwgVar) {
        this.a = i2;
        this.b = hwgVar;
    }

    public static ct7 valueOf(String str) {
        return (ct7) Enum.valueOf(ct7.class, str);
    }

    public static ct7[] values() {
        return (ct7[]) g.clone();
    }
}
