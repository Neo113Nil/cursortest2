package le;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: le.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC7939b {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ EnumC7939b[] $VALUES;
    public static final EnumC7939b ERROR_CLASS;
    public static final EnumC7939b ERROR_FUNCTION;
    public static final EnumC7939b ERROR_MODULE;
    public static final EnumC7939b ERROR_PROPERTY;
    public static final EnumC7939b ERROR_SCOPE;
    public static final EnumC7939b ERROR_TYPE;
    public static final EnumC7939b PARENT_OF_ERROR_SCOPE;

    @NotNull
    private final String debugText;

    static {
        EnumC7939b enumC7939b = new EnumC7939b("ERROR_CLASS", 0, "<Error class: %s>");
        ERROR_CLASS = enumC7939b;
        EnumC7939b enumC7939b2 = new EnumC7939b("ERROR_FUNCTION", 1, "<Error function>");
        ERROR_FUNCTION = enumC7939b2;
        EnumC7939b enumC7939b3 = new EnumC7939b("ERROR_SCOPE", 2, "<Error scope>");
        ERROR_SCOPE = enumC7939b3;
        EnumC7939b enumC7939b4 = new EnumC7939b("ERROR_MODULE", 3, "<Error module>");
        ERROR_MODULE = enumC7939b4;
        EnumC7939b enumC7939b5 = new EnumC7939b("ERROR_PROPERTY", 4, "<Error property>");
        ERROR_PROPERTY = enumC7939b5;
        EnumC7939b enumC7939b6 = new EnumC7939b("ERROR_TYPE", 5, "[Error type: %s]");
        ERROR_TYPE = enumC7939b6;
        EnumC7939b enumC7939b7 = new EnumC7939b("PARENT_OF_ERROR_SCOPE", 6, "<Fake parent for error lexical scope>");
        PARENT_OF_ERROR_SCOPE = enumC7939b7;
        EnumC7939b[] enumC7939bArr = {enumC7939b, enumC7939b2, enumC7939b3, enumC7939b4, enumC7939b5, enumC7939b6, enumC7939b7};
        $VALUES = enumC7939bArr;
        $ENTRIES = Xc.b.a(enumC7939bArr);
    }

    private EnumC7939b(String str, int i11, String str2) {
        this.debugText = str2;
    }

    public static EnumC7939b valueOf(String str) {
        return (EnumC7939b) Enum.valueOf(EnumC7939b.class, str);
    }

    public static EnumC7939b[] values() {
        return (EnumC7939b[]) $VALUES.clone();
    }

    @NotNull
    public final String a() {
        return this.debugText;
    }
}
