package androidx.compose.animation.graphics.vector;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Animator.kt */
/* loaded from: classes11.dex */
public final class Ordering {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Ordering[] $VALUES;
    public static final Ordering Sequentially;
    public static final Ordering Together;

    static {
        Ordering ordering = new Ordering("Together", 0);
        Together = ordering;
        Ordering ordering2 = new Ordering("Sequentially", 1);
        Sequentially = ordering2;
        Ordering[] orderingArr = {ordering, ordering2};
        $VALUES = orderingArr;
        $ENTRIES = new asp(orderingArr);
    }

    public Ordering() {
        throw null;
    }

    public static Ordering valueOf(String str) {
        return (Ordering) Enum.valueOf(Ordering.class, str);
    }

    public static Ordering[] values() {
        return (Ordering[]) $VALUES.clone();
    }
}
