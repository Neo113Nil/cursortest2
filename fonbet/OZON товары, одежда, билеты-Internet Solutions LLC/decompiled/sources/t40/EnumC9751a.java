package t40;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: t40.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC9751a {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ EnumC9751a[] $VALUES;
    public static final EnumC9751a LEFT_RIGHT;
    public static final EnumC9751a TOP_BOTTOM;

    static {
        EnumC9751a enumC9751a = new EnumC9751a("TOP_BOTTOM", 0);
        TOP_BOTTOM = enumC9751a;
        EnumC9751a enumC9751a2 = new EnumC9751a("LEFT_RIGHT", 1);
        LEFT_RIGHT = enumC9751a2;
        EnumC9751a[] enumC9751aArr = {enumC9751a, enumC9751a2};
        $VALUES = enumC9751aArr;
        $ENTRIES = Xc.b.a(enumC9751aArr);
    }

    private EnumC9751a() {
        throw null;
    }

    public static EnumC9751a valueOf(String str) {
        return (EnumC9751a) Enum.valueOf(EnumC9751a.class, str);
    }

    public static EnumC9751a[] values() {
        return (EnumC9751a[]) $VALUES.clone();
    }
}
