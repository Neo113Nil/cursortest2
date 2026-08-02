package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class lu3 {
    public static final lu3 a;
    public static final lu3 b;
    public static final lu3 c;
    public static final /* synthetic */ lu3[] d;

    static {
        lu3 lu3Var = new lu3("COROUTINE_SUSPENDED", 0);
        a = lu3Var;
        lu3 lu3Var2 = new lu3("UNDECIDED", 1);
        b = lu3Var2;
        lu3 lu3Var3 = new lu3("RESUMED", 2);
        c = lu3Var3;
        d = new lu3[]{lu3Var, lu3Var2, lu3Var3};
    }

    public static lu3 valueOf(String str) {
        return (lu3) Enum.valueOf(lu3.class, str);
    }

    public static lu3[] values() {
        return (lu3[]) d.clone();
    }
}
