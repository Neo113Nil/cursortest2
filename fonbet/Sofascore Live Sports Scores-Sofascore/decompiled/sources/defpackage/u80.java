package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class u80 {
    public static final u80 a;
    public static final u80 b;
    public static final u80 c;
    public static final u80 d;
    public static final u80 e;
    public static final u80 f;
    public static final u80 g;
    public static final /* synthetic */ u80[] h;

    static {
        u80 u80Var = new u80("Paragraph", 0);
        a = u80Var;
        u80 u80Var2 = new u80("Span", 1);
        b = u80Var2;
        u80 u80Var3 = new u80("VerbatimTts", 2);
        c = u80Var3;
        u80 u80Var4 = new u80("Url", 3);
        d = u80Var4;
        u80 u80Var5 = new u80("Link", 4);
        e = u80Var5;
        u80 u80Var6 = new u80("Clickable", 5);
        f = u80Var6;
        u80 u80Var7 = new u80("String", 6);
        g = u80Var7;
        h = new u80[]{u80Var, u80Var2, u80Var3, u80Var4, u80Var5, u80Var6, u80Var7};
    }

    public static u80 valueOf(String str) {
        return (u80) Enum.valueOf(u80.class, str);
    }

    public static u80[] values() {
        return (u80[]) h.clone();
    }
}
