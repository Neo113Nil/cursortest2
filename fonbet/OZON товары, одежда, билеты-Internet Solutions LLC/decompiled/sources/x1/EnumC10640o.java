package x1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: x1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC10640o {
    private static final /* synthetic */ EnumC10640o[] $VALUES;
    public static final EnumC10640o Final;
    public static final EnumC10640o Initial;
    public static final EnumC10640o Main;

    static {
        EnumC10640o enumC10640o = new EnumC10640o("Initial", 0);
        Initial = enumC10640o;
        EnumC10640o enumC10640o2 = new EnumC10640o("Main", 1);
        Main = enumC10640o2;
        EnumC10640o enumC10640o3 = new EnumC10640o("Final", 2);
        Final = enumC10640o3;
        $VALUES = new EnumC10640o[]{enumC10640o, enumC10640o2, enumC10640o3};
    }

    private EnumC10640o() {
        throw null;
    }

    public static EnumC10640o valueOf(String str) {
        return (EnumC10640o) Enum.valueOf(EnumC10640o.class, str);
    }

    public static EnumC10640o[] values() {
        return (EnumC10640o[]) $VALUES.clone();
    }
}
