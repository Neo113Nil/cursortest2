package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class e0 {
    public static final e0 LENIENT;
    public static final e0 SMART;
    public static final e0 STRICT;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ e0[] f17392a;

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) f17392a.clone();
    }

    static {
        e0 e0Var = new e0("STRICT", 0);
        STRICT = e0Var;
        e0 e0Var2 = new e0("SMART", 1);
        SMART = e0Var2;
        e0 e0Var3 = new e0("LENIENT", 2);
        LENIENT = e0Var3;
        f17392a = new e0[]{e0Var, e0Var2, e0Var3};
    }
}
