package ru.ozon.uni.android.ds.compose.component.badge;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/badge/DsBadgeSize;", "", "<init>", "(Ljava/lang/String;I)V", "SIZE_200", "SIZE_300", "SIZE_400", "SIZE_500", "SIZE_600", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DsBadgeSize {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DsBadgeSize[] $VALUES;
    public static final DsBadgeSize SIZE_200 = new DsBadgeSize("SIZE_200", 0);
    public static final DsBadgeSize SIZE_300 = new DsBadgeSize("SIZE_300", 1);
    public static final DsBadgeSize SIZE_400 = new DsBadgeSize("SIZE_400", 2);
    public static final DsBadgeSize SIZE_500 = new DsBadgeSize("SIZE_500", 3);
    public static final DsBadgeSize SIZE_600 = new DsBadgeSize("SIZE_600", 4);

    private static final /* synthetic */ DsBadgeSize[] $values() {
        return new DsBadgeSize[]{SIZE_200, SIZE_300, SIZE_400, SIZE_500, SIZE_600};
    }

    static {
        DsBadgeSize[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private DsBadgeSize(String str, int i11) {
    }

    public static DsBadgeSize valueOf(String str) {
        return (DsBadgeSize) Enum.valueOf(DsBadgeSize.class, str);
    }

    public static DsBadgeSize[] values() {
        return (DsBadgeSize[]) $VALUES.clone();
    }
}
