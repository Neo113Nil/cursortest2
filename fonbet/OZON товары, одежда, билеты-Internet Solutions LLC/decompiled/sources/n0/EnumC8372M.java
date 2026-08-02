package n0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: n0.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC8372M {
    private static final /* synthetic */ EnumC8372M[] $VALUES;
    public static final EnumC8372M Default;
    public static final EnumC8372M PreventUserInput;
    public static final EnumC8372M UserInput;

    static {
        EnumC8372M enumC8372M = new EnumC8372M("Default", 0);
        Default = enumC8372M;
        EnumC8372M enumC8372M2 = new EnumC8372M("UserInput", 1);
        UserInput = enumC8372M2;
        EnumC8372M enumC8372M3 = new EnumC8372M("PreventUserInput", 2);
        PreventUserInput = enumC8372M3;
        $VALUES = new EnumC8372M[]{enumC8372M, enumC8372M2, enumC8372M3};
    }

    private EnumC8372M() {
        throw null;
    }

    public static EnumC8372M valueOf(String str) {
        return (EnumC8372M) Enum.valueOf(EnumC8372M.class, str);
    }

    public static EnumC8372M[] values() {
        return (EnumC8372M[]) $VALUES.clone();
    }
}
