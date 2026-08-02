package m0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: m0.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC7987e0 {
    private static final /* synthetic */ EnumC7987e0[] $VALUES;
    public static final EnumC7987e0 Restart;
    public static final EnumC7987e0 Reverse;

    static {
        EnumC7987e0 enumC7987e0 = new EnumC7987e0("Restart", 0);
        Restart = enumC7987e0;
        EnumC7987e0 enumC7987e02 = new EnumC7987e0("Reverse", 1);
        Reverse = enumC7987e02;
        $VALUES = new EnumC7987e0[]{enumC7987e0, enumC7987e02};
    }

    private EnumC7987e0() {
        throw null;
    }

    public static EnumC7987e0 valueOf(String str) {
        return (EnumC7987e0) Enum.valueOf(EnumC7987e0.class, str);
    }

    public static EnumC7987e0[] values() {
        return (EnumC7987e0[]) $VALUES.clone();
    }
}
