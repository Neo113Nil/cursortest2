package u0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: u0.t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC9910t {
    private static final /* synthetic */ EnumC9910t[] $VALUES;
    public static final EnumC9910t Horizontal;
    public static final EnumC9910t Vertical;

    static {
        EnumC9910t enumC9910t = new EnumC9910t("Horizontal", 0);
        Horizontal = enumC9910t;
        EnumC9910t enumC9910t2 = new EnumC9910t("Vertical", 1);
        Vertical = enumC9910t2;
        $VALUES = new EnumC9910t[]{enumC9910t, enumC9910t2};
    }

    private EnumC9910t() {
        throw null;
    }

    public static EnumC9910t valueOf(String str) {
        return (EnumC9910t) Enum.valueOf(EnumC9910t.class, str);
    }

    public static EnumC9910t[] values() {
        return (EnumC9910t[]) $VALUES.clone();
    }
}
