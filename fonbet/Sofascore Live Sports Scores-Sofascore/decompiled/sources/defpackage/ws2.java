package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ws2 {
    public static final ws2 a;
    public static final ws2 b;
    public static final ws2 c;
    public static final ws2 d;
    public static final ws2 e;
    public static final /* synthetic */ ws2[] f;

    static {
        ws2 ws2Var = new ws2("HOME", 0);
        a = ws2Var;
        ws2 ws2Var2 = new ws2("AWAY", 1);
        b = ws2Var2;
        ws2 ws2Var3 = new ws2("TOURNAMENT", 2);
        c = ws2Var3;
        ws2 ws2Var4 = new ws2("SINGLES", 3);
        d = ws2Var4;
        ws2 ws2Var5 = new ws2("SURFACE", 4);
        e = ws2Var5;
        f = new ws2[]{ws2Var, ws2Var2, ws2Var3, ws2Var4, ws2Var5};
    }

    public static ws2 valueOf(String str) {
        return (ws2) Enum.valueOf(ws2.class, str);
    }

    public static ws2[] values() {
        return (ws2[]) f.clone();
    }
}
