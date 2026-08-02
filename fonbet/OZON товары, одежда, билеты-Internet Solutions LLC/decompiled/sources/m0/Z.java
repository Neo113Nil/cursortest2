package m0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class Z {
    private static final /* synthetic */ Z[] $VALUES;
    public static final Z Default;
    public static final Z PreventUserInput;
    public static final Z UserInput;

    static {
        Z z11 = new Z("Default", 0);
        Default = z11;
        Z z12 = new Z("UserInput", 1);
        UserInput = z12;
        Z z13 = new Z("PreventUserInput", 2);
        PreventUserInput = z13;
        $VALUES = new Z[]{z11, z12, z13};
    }

    private Z() {
        throw null;
    }

    public static Z valueOf(String str) {
        return (Z) Enum.valueOf(Z.class, str);
    }

    public static Z[] values() {
        return (Z[]) $VALUES.clone();
    }
}
