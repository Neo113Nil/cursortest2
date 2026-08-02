package ru.ozon.uni.android.ds.compose.component.input;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/input/DsInputLabelPosition;", "", "<init>", "(Ljava/lang/String;I)V", "INSIDE_TOP", "OUTSIDE", "INSIDE_LEFT", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DsInputLabelPosition {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DsInputLabelPosition[] $VALUES;
    public static final DsInputLabelPosition INSIDE_TOP = new DsInputLabelPosition("INSIDE_TOP", 0);
    public static final DsInputLabelPosition OUTSIDE = new DsInputLabelPosition("OUTSIDE", 1);
    public static final DsInputLabelPosition INSIDE_LEFT = new DsInputLabelPosition("INSIDE_LEFT", 2);

    private static final /* synthetic */ DsInputLabelPosition[] $values() {
        return new DsInputLabelPosition[]{INSIDE_TOP, OUTSIDE, INSIDE_LEFT};
    }

    static {
        DsInputLabelPosition[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private DsInputLabelPosition(String str, int i11) {
    }

    public static DsInputLabelPosition valueOf(String str) {
        return (DsInputLabelPosition) Enum.valueOf(DsInputLabelPosition.class, str);
    }

    public static DsInputLabelPosition[] values() {
        return (DsInputLabelPosition[]) $VALUES.clone();
    }
}
