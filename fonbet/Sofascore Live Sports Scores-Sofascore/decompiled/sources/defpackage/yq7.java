package defpackage;

import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class yq7 {
    public static final f8h b;
    public static final yq7 c;
    public static final yq7 d;
    public static final yq7 e;
    public static final yq7 f;
    public static final /* synthetic */ yq7[] g;
    public static final /* synthetic */ kp5 h;
    public final int a;

    static {
        yq7 yq7Var = new yq7("ALL", 0, R.string.all);
        c = yq7Var;
        yq7 yq7Var2 = new yq7("TEAM", 1, R.string.teams);
        d = yq7Var2;
        yq7 yq7Var3 = new yq7("COMPETITION", 2, R.string.competitions);
        e = yq7Var3;
        yq7 yq7Var4 = new yq7("ATHLETES", 3, R.string.athletes);
        f = yq7Var4;
        yq7[] yq7VarArr = {yq7Var, yq7Var2, yq7Var3, yq7Var4};
        g = yq7VarArr;
        h = new kp5(yq7VarArr);
        b = new f8h(23);
    }

    public yq7(String str, int i, int i2) {
        this.a = i2;
    }

    public static yq7 valueOf(String str) {
        return (yq7) Enum.valueOf(yq7.class, str);
    }

    public static yq7[] values() {
        return (yq7[]) g.clone();
    }
}
