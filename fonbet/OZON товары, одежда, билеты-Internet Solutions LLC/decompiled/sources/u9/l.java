package u9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class l {
    private static final /* synthetic */ l[] $VALUES;
    public static final l FORCE_NONE;
    public static final l FORCE_RECTANGLE;
    public static final l FORCE_SQUARE;

    static {
        l lVar = new l("FORCE_NONE", 0);
        FORCE_NONE = lVar;
        l lVar2 = new l("FORCE_SQUARE", 1);
        FORCE_SQUARE = lVar2;
        l lVar3 = new l("FORCE_RECTANGLE", 2);
        FORCE_RECTANGLE = lVar3;
        $VALUES = new l[]{lVar, lVar2, lVar3};
    }

    private l() {
        throw null;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
