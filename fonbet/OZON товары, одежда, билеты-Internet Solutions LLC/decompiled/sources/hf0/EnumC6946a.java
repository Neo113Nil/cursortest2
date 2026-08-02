package hf0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: hf0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC6946a {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ EnumC6946a[] $VALUES;
    public static final EnumC6946a BOOLEAN;
    public static final EnumC6946a FLOAT;
    public static final EnumC6946a INT;
    public static final EnumC6946a LONG;
    public static final EnumC6946a STRING;

    static {
        EnumC6946a enumC6946a = new EnumC6946a("BOOLEAN", 0);
        BOOLEAN = enumC6946a;
        EnumC6946a enumC6946a2 = new EnumC6946a("INT", 1);
        INT = enumC6946a2;
        EnumC6946a enumC6946a3 = new EnumC6946a("LONG", 2);
        LONG = enumC6946a3;
        EnumC6946a enumC6946a4 = new EnumC6946a("FLOAT", 3);
        FLOAT = enumC6946a4;
        EnumC6946a enumC6946a5 = new EnumC6946a("STRING", 4);
        STRING = enumC6946a5;
        EnumC6946a[] enumC6946aArr = {enumC6946a, enumC6946a2, enumC6946a3, enumC6946a4, enumC6946a5};
        $VALUES = enumC6946aArr;
        $ENTRIES = Xc.b.a(enumC6946aArr);
    }

    private EnumC6946a() {
        throw null;
    }

    public static EnumC6946a valueOf(String str) {
        return (EnumC6946a) Enum.valueOf(EnumC6946a.class, str);
    }

    public static EnumC6946a[] values() {
        return (EnumC6946a[]) $VALUES.clone();
    }
}
