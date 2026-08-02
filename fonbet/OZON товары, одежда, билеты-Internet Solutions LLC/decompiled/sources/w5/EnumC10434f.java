package w5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: w5.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC10434f {
    private static final /* synthetic */ EnumC10434f[] $VALUES;
    public static final EnumC10434f FILL;
    public static final EnumC10434f FIT;

    static {
        EnumC10434f enumC10434f = new EnumC10434f("FILL", 0);
        FILL = enumC10434f;
        EnumC10434f enumC10434f2 = new EnumC10434f("FIT", 1);
        FIT = enumC10434f2;
        $VALUES = new EnumC10434f[]{enumC10434f, enumC10434f2};
    }

    private EnumC10434f() {
        throw null;
    }

    public static EnumC10434f valueOf(String str) {
        return (EnumC10434f) Enum.valueOf(EnumC10434f.class, str);
    }

    public static EnumC10434f[] values() {
        return (EnumC10434f[]) $VALUES.clone();
    }
}
