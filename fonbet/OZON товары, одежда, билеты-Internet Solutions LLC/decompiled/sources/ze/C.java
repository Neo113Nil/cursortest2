package ze;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class C {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ C[] $VALUES;
    public static final C FIXED_DELAY;
    public static final C FIXED_PERIOD;

    static {
        C c11 = new C("FIXED_PERIOD", 0);
        FIXED_PERIOD = c11;
        C c12 = new C("FIXED_DELAY", 1);
        FIXED_DELAY = c12;
        C[] cArr = {c11, c12};
        $VALUES = cArr;
        $ENTRIES = Xc.b.a(cArr);
    }

    private C() {
        throw null;
    }

    public static C valueOf(String str) {
        return (C) Enum.valueOf(C.class, str);
    }

    public static C[] values() {
        return (C[]) $VALUES.clone();
    }
}
