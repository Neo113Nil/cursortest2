package n5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: n5.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC8444d {
    private static final /* synthetic */ EnumC8444d[] $VALUES;
    public static final EnumC8444d DISK;
    public static final EnumC8444d MEMORY;
    public static final EnumC8444d MEMORY_CACHE;
    public static final EnumC8444d NETWORK;

    static {
        EnumC8444d enumC8444d = new EnumC8444d("MEMORY_CACHE", 0);
        MEMORY_CACHE = enumC8444d;
        EnumC8444d enumC8444d2 = new EnumC8444d("MEMORY", 1);
        MEMORY = enumC8444d2;
        EnumC8444d enumC8444d3 = new EnumC8444d("DISK", 2);
        DISK = enumC8444d3;
        EnumC8444d enumC8444d4 = new EnumC8444d("NETWORK", 3);
        NETWORK = enumC8444d4;
        $VALUES = new EnumC8444d[]{enumC8444d, enumC8444d2, enumC8444d3, enumC8444d4};
    }

    private EnumC8444d() {
        throw null;
    }

    public static EnumC8444d valueOf(String str) {
        return (EnumC8444d) Enum.valueOf(EnumC8444d.class, str);
    }

    public static EnumC8444d[] values() {
        return (EnumC8444d[]) $VALUES.clone();
    }
}
