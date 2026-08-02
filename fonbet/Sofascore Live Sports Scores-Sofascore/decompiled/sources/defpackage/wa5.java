package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class wa5 {
    public static final wa5 a;
    public static final wa5 b;
    public static final wa5 c;
    public static final wa5 d;
    public static final wa5 e;
    public static final wa5 f;
    public static final /* synthetic */ wa5[] g;

    static {
        wa5 wa5Var = new wa5("ENTER", 0);
        a = wa5Var;
        wa5 wa5Var2 = new wa5("EXIT", 1);
        b = wa5Var2;
        wa5 wa5Var3 = new wa5("MOVE", 2);
        c = wa5Var3;
        wa5 wa5Var4 = new wa5("START_POSITION", 3);
        d = wa5Var4;
        wa5 wa5Var5 = new wa5("END_POSITION", 4);
        e = wa5Var5;
        wa5 wa5Var6 = new wa5("INVISIBLE", 5);
        f = wa5Var6;
        g = new wa5[]{wa5Var, wa5Var2, wa5Var3, wa5Var4, wa5Var5, wa5Var6};
    }

    public static wa5 valueOf(String str) {
        return (wa5) Enum.valueOf(wa5.class, str);
    }

    public static wa5[] values() {
        return (wa5[]) g.clone();
    }
}
