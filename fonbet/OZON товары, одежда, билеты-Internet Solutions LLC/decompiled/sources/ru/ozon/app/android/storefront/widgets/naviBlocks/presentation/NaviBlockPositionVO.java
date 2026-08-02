package ru.ozon.app.android.storefront.widgets.naviBlocks.presentation;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/NaviBlockPositionVO;", "", "<init>", "(Ljava/lang/String;I)V", "FIRST", "SECOND", "MIDDLE_EVEN", "MIDDLE_ODD", "PENULTIMATE", "LAST", "FIRST_PENULTIMATE", "SECOND_LAST", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NaviBlockPositionVO {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ NaviBlockPositionVO[] $VALUES;
    public static final NaviBlockPositionVO FIRST = new NaviBlockPositionVO("FIRST", 0);
    public static final NaviBlockPositionVO SECOND = new NaviBlockPositionVO("SECOND", 1);
    public static final NaviBlockPositionVO MIDDLE_EVEN = new NaviBlockPositionVO("MIDDLE_EVEN", 2);
    public static final NaviBlockPositionVO MIDDLE_ODD = new NaviBlockPositionVO("MIDDLE_ODD", 3);
    public static final NaviBlockPositionVO PENULTIMATE = new NaviBlockPositionVO("PENULTIMATE", 4);
    public static final NaviBlockPositionVO LAST = new NaviBlockPositionVO("LAST", 5);
    public static final NaviBlockPositionVO FIRST_PENULTIMATE = new NaviBlockPositionVO("FIRST_PENULTIMATE", 6);
    public static final NaviBlockPositionVO SECOND_LAST = new NaviBlockPositionVO("SECOND_LAST", 7);

    private static final /* synthetic */ NaviBlockPositionVO[] $values() {
        return new NaviBlockPositionVO[]{FIRST, SECOND, MIDDLE_EVEN, MIDDLE_ODD, PENULTIMATE, LAST, FIRST_PENULTIMATE, SECOND_LAST};
    }

    static {
        NaviBlockPositionVO[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private NaviBlockPositionVO(String str, int i11) {
    }

    public static NaviBlockPositionVO valueOf(String str) {
        return (NaviBlockPositionVO) Enum.valueOf(NaviBlockPositionVO.class, str);
    }

    public static NaviBlockPositionVO[] values() {
        return (NaviBlockPositionVO[]) $VALUES.clone();
    }
}
