package androidx.constraintlayout.compose;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ConstraintLayout.kt */
/* loaded from: classes11.dex */
public final class LayoutInfoFlags {
    private static final /* synthetic */ LayoutInfoFlags[] $VALUES;
    public static final LayoutInfoFlags BOUNDS;
    public static final LayoutInfoFlags NONE;

    static {
        LayoutInfoFlags layoutInfoFlags = new LayoutInfoFlags("NONE", 0);
        NONE = layoutInfoFlags;
        LayoutInfoFlags layoutInfoFlags2 = new LayoutInfoFlags("BOUNDS", 1);
        BOUNDS = layoutInfoFlags2;
        $VALUES = new LayoutInfoFlags[]{layoutInfoFlags, layoutInfoFlags2};
    }

    public LayoutInfoFlags() {
        throw null;
    }

    public static LayoutInfoFlags valueOf(String str) {
        return (LayoutInfoFlags) Enum.valueOf(LayoutInfoFlags.class, str);
    }

    public static LayoutInfoFlags[] values() {
        return (LayoutInfoFlags[]) $VALUES.clone();
    }
}
