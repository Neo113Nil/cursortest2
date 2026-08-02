package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ca9 {
    public static final ca9 b;
    public static final /* synthetic */ ca9[] c;
    public static final /* synthetic */ kp5 d;
    public final String a;

    static {
        ca9 ca9Var = new ca9("TEAM_STREAKS", 0, "general");
        b = ca9Var;
        ca9[] ca9VarArr = {ca9Var, new ca9("H2H_STREAK", 1, "head2head")};
        c = ca9VarArr;
        d = new kp5(ca9VarArr);
    }

    public ca9(String str, int i, String str2) {
        this.a = str2;
    }

    public static ca9 valueOf(String str) {
        return (ca9) Enum.valueOf(ca9.class, str);
    }

    public static ca9[] values() {
        return (ca9[]) c.clone();
    }
}
