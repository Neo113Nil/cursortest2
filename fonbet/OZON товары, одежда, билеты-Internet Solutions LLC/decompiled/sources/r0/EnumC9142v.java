package r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: r0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC9142v {
    private static final /* synthetic */ EnumC9142v[] $VALUES;
    public static final EnumC9142v Horizontal;
    public static final EnumC9142v Vertical;

    static {
        EnumC9142v enumC9142v = new EnumC9142v("Vertical", 0);
        Vertical = enumC9142v;
        EnumC9142v enumC9142v2 = new EnumC9142v("Horizontal", 1);
        Horizontal = enumC9142v2;
        $VALUES = new EnumC9142v[]{enumC9142v, enumC9142v2};
    }

    private EnumC9142v() {
        throw null;
    }

    public static EnumC9142v valueOf(String str) {
        return (EnumC9142v) Enum.valueOf(EnumC9142v.class, str);
    }

    public static EnumC9142v[] values() {
        return (EnumC9142v[]) $VALUES.clone();
    }
}
