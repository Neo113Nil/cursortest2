package ru.ozon.uni.android.ds.compose.component.tabs;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/tabs/LayoutIds;", "", "<init>", "(Ljava/lang/String;I)V", "Left", "Center", "Right", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final class LayoutIds {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ LayoutIds[] $VALUES;
    public static final LayoutIds Left = new LayoutIds("Left", 0);
    public static final LayoutIds Center = new LayoutIds("Center", 1);
    public static final LayoutIds Right = new LayoutIds("Right", 2);

    private static final /* synthetic */ LayoutIds[] $values() {
        return new LayoutIds[]{Left, Center, Right};
    }

    static {
        LayoutIds[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private LayoutIds(String str, int i11) {
    }

    public static LayoutIds valueOf(String str) {
        return (LayoutIds) Enum.valueOf(LayoutIds.class, str);
    }

    public static LayoutIds[] values() {
        return (LayoutIds[]) $VALUES.clone();
    }
}
