package e2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: e2.v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC6278v {
    private static final /* synthetic */ EnumC6278v[] $VALUES;
    public static final EnumC6278v BOUNDS;
    public static final EnumC6278v NONE;

    static {
        EnumC6278v enumC6278v = new EnumC6278v("NONE", 0);
        NONE = enumC6278v;
        EnumC6278v enumC6278v2 = new EnumC6278v("BOUNDS", 1);
        BOUNDS = enumC6278v2;
        $VALUES = new EnumC6278v[]{enumC6278v, enumC6278v2};
    }

    private EnumC6278v() {
        throw null;
    }

    public static EnumC6278v valueOf(String str) {
        return (EnumC6278v) Enum.valueOf(EnumC6278v.class, str);
    }

    public static EnumC6278v[] values() {
        return (EnumC6278v[]) $VALUES.clone();
    }
}
