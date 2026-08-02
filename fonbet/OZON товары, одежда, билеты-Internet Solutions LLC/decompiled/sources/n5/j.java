package n5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class j {
    private static final /* synthetic */ j[] $VALUES;
    public static final j IGNORE;
    public static final j RESPECT_ALL;
    public static final j RESPECT_PERFORMANCE;

    static {
        j jVar = new j("IGNORE", 0);
        IGNORE = jVar;
        j jVar2 = new j("RESPECT_PERFORMANCE", 1);
        RESPECT_PERFORMANCE = jVar2;
        j jVar3 = new j("RESPECT_ALL", 2);
        RESPECT_ALL = jVar3;
        $VALUES = new j[]{jVar, jVar2, jVar3};
    }

    private j() {
        throw null;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
