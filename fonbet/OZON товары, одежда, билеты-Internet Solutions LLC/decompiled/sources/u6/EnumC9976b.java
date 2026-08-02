package u6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: u6.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC9976b {
    private static final /* synthetic */ EnumC9976b[] $VALUES;
    public static final EnumC9976b ACTIVE;
    public static final EnumC9976b DISPOSED;
    public static final EnumC9976b PENDING;
    public static final EnumC9976b SUSPENDED;

    static {
        EnumC9976b enumC9976b = new EnumC9976b("PENDING", 0);
        PENDING = enumC9976b;
        EnumC9976b enumC9976b2 = new EnumC9976b("ACTIVE", 1);
        ACTIVE = enumC9976b2;
        EnumC9976b enumC9976b3 = new EnumC9976b("SUSPENDED", 2);
        SUSPENDED = enumC9976b3;
        EnumC9976b enumC9976b4 = new EnumC9976b("DISPOSED", 3);
        DISPOSED = enumC9976b4;
        $VALUES = new EnumC9976b[]{enumC9976b, enumC9976b2, enumC9976b3, enumC9976b4};
    }

    private EnumC9976b() {
        throw null;
    }

    public static EnumC9976b valueOf(String str) {
        return (EnumC9976b) Enum.valueOf(EnumC9976b.class, str);
    }

    public static EnumC9976b[] values() {
        return (EnumC9976b[]) $VALUES.clone();
    }
}
