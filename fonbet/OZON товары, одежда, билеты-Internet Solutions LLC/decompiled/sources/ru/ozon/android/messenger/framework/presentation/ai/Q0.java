package ru.ozon.android.messenger.framework.presentation.ai;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
final class Q0 {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ Q0[] $VALUES;
    public static final Q0 HIDDEN;
    public static final Q0 SHOWN;

    static {
        Q0 q02 = new Q0("HIDDEN", 0);
        HIDDEN = q02;
        Q0 q03 = new Q0("SHOWN", 1);
        SHOWN = q03;
        Q0[] q0Arr = {q02, q03};
        $VALUES = q0Arr;
        $ENTRIES = Xc.b.a(q0Arr);
    }

    private Q0() {
        throw null;
    }

    public static Q0 valueOf(String str) {
        return (Q0) Enum.valueOf(Q0.class, str);
    }

    public static Q0[] values() {
        return (Q0[]) $VALUES.clone();
    }
}
