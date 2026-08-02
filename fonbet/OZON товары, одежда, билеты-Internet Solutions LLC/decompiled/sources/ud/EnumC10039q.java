package ud;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ud.q, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC10039q {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ EnumC10039q[] $VALUES;
    public static final EnumC10039q BINARY;
    public static final EnumC10039q RUNTIME;
    public static final EnumC10039q SOURCE;

    static {
        EnumC10039q enumC10039q = new EnumC10039q("RUNTIME", 0);
        RUNTIME = enumC10039q;
        EnumC10039q enumC10039q2 = new EnumC10039q("BINARY", 1);
        BINARY = enumC10039q2;
        EnumC10039q enumC10039q3 = new EnumC10039q("SOURCE", 2);
        SOURCE = enumC10039q3;
        EnumC10039q[] enumC10039qArr = {enumC10039q, enumC10039q2, enumC10039q3};
        $VALUES = enumC10039qArr;
        $ENTRIES = Xc.b.a(enumC10039qArr);
    }

    private EnumC10039q() {
        throw null;
    }

    public static EnumC10039q valueOf(String str) {
        return (EnumC10039q) Enum.valueOf(EnumC10039q.class, str);
    }

    public static EnumC10039q[] values() {
        return (EnumC10039q[]) $VALUES.clone();
    }
}
