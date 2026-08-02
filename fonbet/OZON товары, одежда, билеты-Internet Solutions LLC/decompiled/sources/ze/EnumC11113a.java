package ze;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ze.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC11113a {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ EnumC11113a[] $VALUES;
    public static final EnumC11113a DROP_LATEST;
    public static final EnumC11113a DROP_OLDEST;
    public static final EnumC11113a SUSPEND;

    static {
        EnumC11113a enumC11113a = new EnumC11113a("SUSPEND", 0);
        SUSPEND = enumC11113a;
        EnumC11113a enumC11113a2 = new EnumC11113a("DROP_OLDEST", 1);
        DROP_OLDEST = enumC11113a2;
        EnumC11113a enumC11113a3 = new EnumC11113a("DROP_LATEST", 2);
        DROP_LATEST = enumC11113a3;
        EnumC11113a[] enumC11113aArr = {enumC11113a, enumC11113a2, enumC11113a3};
        $VALUES = enumC11113aArr;
        $ENTRIES = Xc.b.a(enumC11113aArr);
    }

    private EnumC11113a() {
        throw null;
    }

    public static EnumC11113a valueOf(String str) {
        return (EnumC11113a) Enum.valueOf(EnumC11113a.class, str);
    }

    public static EnumC11113a[] values() {
        return (EnumC11113a[]) $VALUES.clone();
    }
}
