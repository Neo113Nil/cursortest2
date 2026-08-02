package ne;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ne.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC8580b {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ EnumC8580b[] $VALUES;
    public static final EnumC8580b FOR_INCORPORATION;
    public static final EnumC8580b FOR_SUBTYPING;
    public static final EnumC8580b FROM_EXPRESSION;

    static {
        EnumC8580b enumC8580b = new EnumC8580b("FOR_SUBTYPING", 0);
        FOR_SUBTYPING = enumC8580b;
        EnumC8580b enumC8580b2 = new EnumC8580b("FOR_INCORPORATION", 1);
        FOR_INCORPORATION = enumC8580b2;
        EnumC8580b enumC8580b3 = new EnumC8580b("FROM_EXPRESSION", 2);
        FROM_EXPRESSION = enumC8580b3;
        EnumC8580b[] enumC8580bArr = {enumC8580b, enumC8580b2, enumC8580b3};
        $VALUES = enumC8580bArr;
        $ENTRIES = Xc.b.a(enumC8580bArr);
    }

    private EnumC8580b() {
        throw null;
    }

    public static EnumC8580b valueOf(String str) {
        return (EnumC8580b) Enum.valueOf(EnumC8580b.class, str);
    }

    public static EnumC8580b[] values() {
        return (EnumC8580b[]) $VALUES.clone();
    }
}
