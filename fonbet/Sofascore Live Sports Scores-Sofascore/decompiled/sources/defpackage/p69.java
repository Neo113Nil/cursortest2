package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class p69 {
    public static final p69 a;
    public static final p69 b;
    public static final p69 c;
    public static final /* synthetic */ p69[] d;

    static {
        p69 p69Var = new p69("None", 0);
        a = p69Var;
        p69 p69Var2 = new p69("Selection", 1);
        b = p69Var2;
        p69 p69Var3 = new p69("Cursor", 2);
        c = p69Var3;
        d = new p69[]{p69Var, p69Var2, p69Var3};
    }

    public static p69 valueOf(String str) {
        return (p69) Enum.valueOf(p69.class, str);
    }

    public static p69[] values() {
        return (p69[]) d.clone();
    }
}
