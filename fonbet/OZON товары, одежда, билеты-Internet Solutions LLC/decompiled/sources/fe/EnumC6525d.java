package fe;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: fe.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC6525d {
    private static final /* synthetic */ EnumC6525d[] $VALUES;
    public static final EnumC6525d FUNCTION;
    public static final EnumC6525d PROPERTY;
    public static final EnumC6525d PROPERTY_GETTER;
    public static final EnumC6525d PROPERTY_SETTER;

    static {
        EnumC6525d enumC6525d = new EnumC6525d("FUNCTION", 0);
        FUNCTION = enumC6525d;
        EnumC6525d enumC6525d2 = new EnumC6525d("PROPERTY", 1);
        PROPERTY = enumC6525d2;
        EnumC6525d enumC6525d3 = new EnumC6525d("PROPERTY_GETTER", 2);
        PROPERTY_GETTER = enumC6525d3;
        EnumC6525d enumC6525d4 = new EnumC6525d("PROPERTY_SETTER", 3);
        PROPERTY_SETTER = enumC6525d4;
        $VALUES = new EnumC6525d[]{enumC6525d, enumC6525d2, enumC6525d3, enumC6525d4};
    }

    private EnumC6525d() {
        throw null;
    }

    public static EnumC6525d valueOf(String str) {
        return (EnumC6525d) Enum.valueOf(EnumC6525d.class, str);
    }

    public static EnumC6525d[] values() {
        return (EnumC6525d[]) $VALUES.clone();
    }
}
