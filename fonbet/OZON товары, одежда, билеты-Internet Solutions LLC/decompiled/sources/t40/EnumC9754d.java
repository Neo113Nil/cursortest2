package t40;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: t40.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC9754d {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ EnumC9754d[] $VALUES;
    public static final EnumC9754d CENTER;
    public static final EnumC9754d FILL;
    public static final EnumC9754d FIT;

    static {
        EnumC9754d enumC9754d = new EnumC9754d("CENTER", 0);
        CENTER = enumC9754d;
        EnumC9754d enumC9754d2 = new EnumC9754d("FIT", 1);
        FIT = enumC9754d2;
        EnumC9754d enumC9754d3 = new EnumC9754d("FILL", 2);
        FILL = enumC9754d3;
        EnumC9754d[] enumC9754dArr = {enumC9754d, enumC9754d2, enumC9754d3};
        $VALUES = enumC9754dArr;
        $ENTRIES = Xc.b.a(enumC9754dArr);
    }

    private EnumC9754d() {
        throw null;
    }

    public static EnumC9754d valueOf(String str) {
        return (EnumC9754d) Enum.valueOf(EnumC9754d.class, str);
    }

    public static EnumC9754d[] values() {
        return (EnumC9754d[]) $VALUES.clone();
    }
}
