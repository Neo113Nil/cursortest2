package eb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: eb.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC6339c {
    private static final /* synthetic */ EnumC6339c[] $VALUES;
    public static final EnumC6339c DEFAULT_SDK;
    public static final EnumC6339c MANIFEST;
    public static final EnumC6339c PAYLOAD;
    public static final EnumC6339c STUB;

    static {
        EnumC6339c enumC6339c = new EnumC6339c("MANIFEST", 0);
        MANIFEST = enumC6339c;
        EnumC6339c enumC6339c2 = new EnumC6339c("DEFAULT_SDK", 1);
        DEFAULT_SDK = enumC6339c2;
        EnumC6339c enumC6339c3 = new EnumC6339c("PAYLOAD", 2);
        PAYLOAD = enumC6339c3;
        EnumC6339c enumC6339c4 = new EnumC6339c("STUB", 3);
        STUB = enumC6339c4;
        $VALUES = new EnumC6339c[]{enumC6339c, enumC6339c2, enumC6339c3, enumC6339c4};
    }

    private EnumC6339c() {
        throw null;
    }

    public static EnumC6339c valueOf(String str) {
        return (EnumC6339c) Enum.valueOf(EnumC6339c.class, str);
    }

    public static EnumC6339c[] values() {
        return (EnumC6339c[]) $VALUES.clone();
    }
}
