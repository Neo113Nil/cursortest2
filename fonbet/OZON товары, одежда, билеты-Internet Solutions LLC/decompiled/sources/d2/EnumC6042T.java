package d2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: d2.T, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC6042T {
    private static final /* synthetic */ EnumC6042T[] $VALUES;
    public static final EnumC6042T Inherit;
    public static final EnumC6042T SecureOff;
    public static final EnumC6042T SecureOn;

    static {
        EnumC6042T enumC6042T = new EnumC6042T("Inherit", 0);
        Inherit = enumC6042T;
        EnumC6042T enumC6042T2 = new EnumC6042T("SecureOn", 1);
        SecureOn = enumC6042T2;
        EnumC6042T enumC6042T3 = new EnumC6042T("SecureOff", 2);
        SecureOff = enumC6042T3;
        $VALUES = new EnumC6042T[]{enumC6042T, enumC6042T2, enumC6042T3};
    }

    private EnumC6042T() {
        throw null;
    }

    public static EnumC6042T valueOf(String str) {
        return (EnumC6042T) Enum.valueOf(EnumC6042T.class, str);
    }

    public static EnumC6042T[] values() {
        return (EnumC6042T[]) $VALUES.clone();
    }
}
