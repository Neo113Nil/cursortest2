package l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class O {
    private static final /* synthetic */ O[] $VALUES;
    public static final O PostExit;
    public static final O PreEnter;
    public static final O Visible;

    static {
        O o11 = new O("PreEnter", 0);
        PreEnter = o11;
        O o12 = new O("Visible", 1);
        Visible = o12;
        O o13 = new O("PostExit", 2);
        PostExit = o13;
        $VALUES = new O[]{o11, o12, o13};
    }

    private O() {
        throw null;
    }

    public static O valueOf(String str) {
        return (O) Enum.valueOf(O.class, str);
    }

    public static O[] values() {
        return (O[]) $VALUES.clone();
    }
}
