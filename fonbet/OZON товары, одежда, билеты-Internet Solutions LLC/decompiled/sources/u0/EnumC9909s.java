package u0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: u0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC9909s {
    private static final /* synthetic */ EnumC9909s[] $VALUES;
    public static final EnumC9909s Max;
    public static final EnumC9909s Min;

    static {
        EnumC9909s enumC9909s = new EnumC9909s("Min", 0);
        Min = enumC9909s;
        EnumC9909s enumC9909s2 = new EnumC9909s("Max", 1);
        Max = enumC9909s2;
        $VALUES = new EnumC9909s[]{enumC9909s, enumC9909s2};
    }

    private EnumC9909s() {
        throw null;
    }

    public static EnumC9909s valueOf(String str) {
        return (EnumC9909s) Enum.valueOf(EnumC9909s.class, str);
    }

    public static EnumC9909s[] values() {
        return (EnumC9909s[]) $VALUES.clone();
    }
}
