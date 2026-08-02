package kg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class k {
    private static final /* synthetic */ k[] $VALUES;
    public static final k FULL;
    public static final k FULL_STANDALONE;
    public static final k NARROW;
    public static final k NARROW_STANDALONE;
    public static final k SHORT;
    public static final k SHORT_STANDALONE;

    static {
        k kVar = new k("FULL", 0);
        FULL = kVar;
        k kVar2 = new k("FULL_STANDALONE", 1);
        FULL_STANDALONE = kVar2;
        k kVar3 = new k("SHORT", 2);
        SHORT = kVar3;
        k kVar4 = new k("SHORT_STANDALONE", 3);
        SHORT_STANDALONE = kVar4;
        k kVar5 = new k("NARROW", 4);
        NARROW = kVar5;
        k kVar6 = new k("NARROW_STANDALONE", 5);
        NARROW_STANDALONE = kVar6;
        $VALUES = new k[]{kVar, kVar2, kVar3, kVar4, kVar5, kVar6};
    }

    private k() {
        throw null;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
