package u0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: u0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC9900i {
    private static final /* synthetic */ EnumC9900i[] $VALUES;
    public static final EnumC9900i Both;
    public static final EnumC9900i Horizontal;
    public static final EnumC9900i Vertical;

    static {
        EnumC9900i enumC9900i = new EnumC9900i("Vertical", 0);
        Vertical = enumC9900i;
        EnumC9900i enumC9900i2 = new EnumC9900i("Horizontal", 1);
        Horizontal = enumC9900i2;
        EnumC9900i enumC9900i3 = new EnumC9900i("Both", 2);
        Both = enumC9900i3;
        $VALUES = new EnumC9900i[]{enumC9900i, enumC9900i2, enumC9900i3};
    }

    private EnumC9900i() {
        throw null;
    }

    public static EnumC9900i valueOf(String str) {
        return (EnumC9900i) Enum.valueOf(EnumC9900i.class, str);
    }

    public static EnumC9900i[] values() {
        return (EnumC9900i[]) $VALUES.clone();
    }
}
