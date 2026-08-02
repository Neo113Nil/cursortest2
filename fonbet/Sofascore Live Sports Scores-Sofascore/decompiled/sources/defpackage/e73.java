package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class e73 {
    public static final e73 a;
    public static final e73 b;
    public static final /* synthetic */ e73[] c;

    static {
        e73 e73Var = new e73("Player", 0);
        a = e73Var;
        e73 e73Var2 = new e73("Team", 1);
        b = e73Var2;
        c = new e73[]{e73Var, e73Var2};
    }

    public static e73 valueOf(String str) {
        return (e73) Enum.valueOf(e73.class, str);
    }

    public static e73[] values() {
        return (e73[]) c.clone();
    }
}
