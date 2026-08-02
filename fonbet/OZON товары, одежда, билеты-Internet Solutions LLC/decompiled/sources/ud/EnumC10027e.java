package ud;

import org.jetbrains.annotations.NotNull;
import re.C9257a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ud.e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC10027e {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ EnumC10027e[] $VALUES;
    public static final EnumC10027e CONSTRUCTOR_PARAMETER;
    public static final EnumC10027e FIELD;
    public static final EnumC10027e FILE;
    public static final EnumC10027e PROPERTY;
    public static final EnumC10027e PROPERTY_DELEGATE_FIELD;
    public static final EnumC10027e PROPERTY_GETTER;
    public static final EnumC10027e PROPERTY_SETTER;
    public static final EnumC10027e RECEIVER;
    public static final EnumC10027e SETTER_PARAMETER;

    @NotNull
    private final String renderName;

    static {
        EnumC10027e enumC10027e = new EnumC10027e("FIELD", 0, null);
        FIELD = enumC10027e;
        EnumC10027e enumC10027e2 = new EnumC10027e("FILE", 1, null);
        FILE = enumC10027e2;
        EnumC10027e enumC10027e3 = new EnumC10027e("PROPERTY", 2, null);
        PROPERTY = enumC10027e3;
        EnumC10027e enumC10027e4 = new EnumC10027e("PROPERTY_GETTER", 3, "get");
        PROPERTY_GETTER = enumC10027e4;
        EnumC10027e enumC10027e5 = new EnumC10027e("PROPERTY_SETTER", 4, "set");
        PROPERTY_SETTER = enumC10027e5;
        EnumC10027e enumC10027e6 = new EnumC10027e("RECEIVER", 5, null);
        RECEIVER = enumC10027e6;
        EnumC10027e enumC10027e7 = new EnumC10027e("CONSTRUCTOR_PARAMETER", 6, "param");
        CONSTRUCTOR_PARAMETER = enumC10027e7;
        EnumC10027e enumC10027e8 = new EnumC10027e("SETTER_PARAMETER", 7, "setparam");
        SETTER_PARAMETER = enumC10027e8;
        EnumC10027e enumC10027e9 = new EnumC10027e("PROPERTY_DELEGATE_FIELD", 8, "delegate");
        PROPERTY_DELEGATE_FIELD = enumC10027e9;
        EnumC10027e[] enumC10027eArr = {enumC10027e, enumC10027e2, enumC10027e3, enumC10027e4, enumC10027e5, enumC10027e6, enumC10027e7, enumC10027e8, enumC10027e9};
        $VALUES = enumC10027eArr;
        $ENTRIES = Xc.b.a(enumC10027eArr);
    }

    private EnumC10027e(String str, int i11, String str2) {
        this.renderName = str2 == null ? C9257a.d(name()) : str2;
    }

    public static EnumC10027e valueOf(String str) {
        return (EnumC10027e) Enum.valueOf(EnumC10027e.class, str);
    }

    public static EnumC10027e[] values() {
        return (EnumC10027e[]) $VALUES.clone();
    }

    @NotNull
    public final String a() {
        return this.renderName;
    }
}
