package je;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class L0 {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ L0[] $VALUES;
    public static final L0 INVARIANT;
    public static final L0 IN_VARIANCE;
    public static final L0 OUT_VARIANCE;
    private final boolean allowsInPosition;
    private final boolean allowsOutPosition;

    @NotNull
    private final String label;
    private final int superpositionFactor;

    static {
        L0 l02 = new L0("INVARIANT", 0, "", true, true, 0);
        INVARIANT = l02;
        L0 l03 = new L0("IN_VARIANCE", 1, "in", true, false, -1);
        IN_VARIANCE = l03;
        L0 l04 = new L0("OUT_VARIANCE", 2, "out", false, true, 1);
        OUT_VARIANCE = l04;
        L0[] l0Arr = {l02, l03, l04};
        $VALUES = l0Arr;
        $ENTRIES = Xc.b.a(l0Arr);
    }

    private L0(String str, int i11, String str2, boolean z11, boolean z12, int i12) {
        this.label = str2;
        this.allowsInPosition = z11;
        this.allowsOutPosition = z12;
        this.superpositionFactor = i12;
    }

    public static L0 valueOf(String str) {
        return (L0) Enum.valueOf(L0.class, str);
    }

    public static L0[] values() {
        return (L0[]) $VALUES.clone();
    }

    public final boolean a() {
        return this.allowsOutPosition;
    }

    @NotNull
    public final String b() {
        return this.label;
    }

    @Override // java.lang.Enum
    @NotNull
    public final String toString() {
        return this.label;
    }
}
