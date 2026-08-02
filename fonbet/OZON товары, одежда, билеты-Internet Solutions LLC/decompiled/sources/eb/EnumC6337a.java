package eb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: eb.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC6337a {
    private static final /* synthetic */ EnumC6337a[] $VALUES;
    public static final EnumC6337a DEEP_LINK;
    public static final EnumC6337a DEFAULT;

    static {
        EnumC6337a enumC6337a = new EnumC6337a("DEFAULT", 0);
        DEFAULT = enumC6337a;
        EnumC6337a enumC6337a2 = new EnumC6337a("DEEP_LINK", 1);
        DEEP_LINK = enumC6337a2;
        $VALUES = new EnumC6337a[]{enumC6337a, enumC6337a2};
    }

    private EnumC6337a() {
        throw null;
    }

    public static EnumC6337a valueOf(String str) {
        return (EnumC6337a) Enum.valueOf(EnumC6337a.class, str);
    }

    public static EnumC6337a[] values() {
        return (EnumC6337a[]) $VALUES.clone();
    }
}
