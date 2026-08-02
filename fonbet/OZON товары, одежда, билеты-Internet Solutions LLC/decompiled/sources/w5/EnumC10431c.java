package w5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: w5.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC10431c {
    private static final /* synthetic */ EnumC10431c[] $VALUES;
    public static final EnumC10431c AUTOMATIC;
    public static final EnumC10431c EXACT;
    public static final EnumC10431c INEXACT;

    static {
        EnumC10431c enumC10431c = new EnumC10431c("EXACT", 0);
        EXACT = enumC10431c;
        EnumC10431c enumC10431c2 = new EnumC10431c("INEXACT", 1);
        INEXACT = enumC10431c2;
        EnumC10431c enumC10431c3 = new EnumC10431c("AUTOMATIC", 2);
        AUTOMATIC = enumC10431c3;
        $VALUES = new EnumC10431c[]{enumC10431c, enumC10431c2, enumC10431c3};
    }

    private EnumC10431c() {
        throw null;
    }

    public static EnumC10431c valueOf(String str) {
        return (EnumC10431c) Enum.valueOf(EnumC10431c.class, str);
    }

    public static EnumC10431c[] values() {
        return (EnumC10431c[]) $VALUES.clone();
    }
}
