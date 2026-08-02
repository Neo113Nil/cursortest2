package we0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: we0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC10550f {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ EnumC10550f[] $VALUES;
    public static final EnumC10550f APPLICATION;
    public static final EnumC10550f USER_ACTION;

    static {
        EnumC10550f enumC10550f = new EnumC10550f("USER_ACTION", 0);
        USER_ACTION = enumC10550f;
        EnumC10550f enumC10550f2 = new EnumC10550f("APPLICATION", 1);
        APPLICATION = enumC10550f2;
        EnumC10550f[] enumC10550fArr = {enumC10550f, enumC10550f2};
        $VALUES = enumC10550fArr;
        $ENTRIES = Xc.b.a(enumC10550fArr);
    }

    private EnumC10550f() {
        throw null;
    }

    public static EnumC10550f valueOf(String str) {
        return (EnumC10550f) Enum.valueOf(EnumC10550f.class, str);
    }

    public static EnumC10550f[] values() {
        return (EnumC10550f[]) $VALUES.clone();
    }
}
