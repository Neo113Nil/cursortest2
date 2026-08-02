package io.reactivex;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: io.reactivex.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC7093a {
    private static final /* synthetic */ EnumC7093a[] $VALUES;
    public static final EnumC7093a BUFFER;
    public static final EnumC7093a DROP;
    public static final EnumC7093a ERROR;
    public static final EnumC7093a LATEST;
    public static final EnumC7093a MISSING;

    static {
        EnumC7093a enumC7093a = new EnumC7093a("MISSING", 0);
        MISSING = enumC7093a;
        EnumC7093a enumC7093a2 = new EnumC7093a("ERROR", 1);
        ERROR = enumC7093a2;
        EnumC7093a enumC7093a3 = new EnumC7093a("BUFFER", 2);
        BUFFER = enumC7093a3;
        EnumC7093a enumC7093a4 = new EnumC7093a("DROP", 3);
        DROP = enumC7093a4;
        EnumC7093a enumC7093a5 = new EnumC7093a("LATEST", 4);
        LATEST = enumC7093a5;
        $VALUES = new EnumC7093a[]{enumC7093a, enumC7093a2, enumC7093a3, enumC7093a4, enumC7093a5};
    }

    private EnumC7093a() {
        throw null;
    }

    public static EnumC7093a valueOf(String str) {
        return (EnumC7093a) Enum.valueOf(EnumC7093a.class, str);
    }

    public static EnumC7093a[] values() {
        return (EnumC7093a[]) $VALUES.clone();
    }
}
