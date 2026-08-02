package td;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: td.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC9840f {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ EnumC9840f[] $VALUES;
    public static final EnumC9840f ANNOTATION_CLASS;
    public static final EnumC9840f CLASS;
    public static final EnumC9840f ENUM_CLASS;
    public static final EnumC9840f ENUM_ENTRY;
    public static final EnumC9840f INTERFACE;
    public static final EnumC9840f OBJECT;
    private final String codeRepresentation;

    static {
        EnumC9840f enumC9840f = new EnumC9840f("CLASS", 0, "class");
        CLASS = enumC9840f;
        EnumC9840f enumC9840f2 = new EnumC9840f("INTERFACE", 1, "interface");
        INTERFACE = enumC9840f2;
        EnumC9840f enumC9840f3 = new EnumC9840f("ENUM_CLASS", 2, "enum class");
        ENUM_CLASS = enumC9840f3;
        EnumC9840f enumC9840f4 = new EnumC9840f("ENUM_ENTRY", 3, null);
        ENUM_ENTRY = enumC9840f4;
        EnumC9840f enumC9840f5 = new EnumC9840f("ANNOTATION_CLASS", 4, "annotation class");
        ANNOTATION_CLASS = enumC9840f5;
        EnumC9840f enumC9840f6 = new EnumC9840f("OBJECT", 5, "object");
        OBJECT = enumC9840f6;
        EnumC9840f[] enumC9840fArr = {enumC9840f, enumC9840f2, enumC9840f3, enumC9840f4, enumC9840f5, enumC9840f6};
        $VALUES = enumC9840fArr;
        $ENTRIES = Xc.b.a(enumC9840fArr);
    }

    private EnumC9840f(String str, int i11, String str2) {
        this.codeRepresentation = str2;
    }

    public static EnumC9840f valueOf(String str) {
        return (EnumC9840f) Enum.valueOf(EnumC9840f.class, str);
    }

    public static EnumC9840f[] values() {
        return (EnumC9840f[]) $VALUES.clone();
    }

    public final boolean a() {
        return this == OBJECT || this == ENUM_ENTRY;
    }
}
