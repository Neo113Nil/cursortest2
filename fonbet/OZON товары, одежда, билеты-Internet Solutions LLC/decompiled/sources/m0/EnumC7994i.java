package m0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: m0.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC7994i {
    private static final /* synthetic */ EnumC7994i[] $VALUES;
    public static final EnumC7994i BoundReached;
    public static final EnumC7994i Finished;

    static {
        EnumC7994i enumC7994i = new EnumC7994i("BoundReached", 0);
        BoundReached = enumC7994i;
        EnumC7994i enumC7994i2 = new EnumC7994i("Finished", 1);
        Finished = enumC7994i2;
        $VALUES = new EnumC7994i[]{enumC7994i, enumC7994i2};
    }

    private EnumC7994i() {
        throw null;
    }

    public static EnumC7994i valueOf(String str) {
        return (EnumC7994i) Enum.valueOf(EnumC7994i.class, str);
    }

    public static EnumC7994i[] values() {
        return (EnumC7994i[]) $VALUES.clone();
    }
}
