package ru.ozon.app.android.storefront.widgets.naviCategories.presentation;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviCategories/presentation/BlockPositionVO;", "", "<init>", "(Ljava/lang/String;I)V", "TOP_LEFT", "TOP_MIDDLE", "TOP_RIGHT", "MIDDLE_LEFT", "MIDDLE_MIDDLE", "MIDDLE_RIGHT", "BOTTOM_LEFT", "BOTTOM_MIDDLE", "BOTTOM_RIGHT", "TOP_BOTTOM_LEFT", "TOP_BOTTOM_MIDDLE", "TOP_BOTTOM_RIGHT", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BlockPositionVO {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ BlockPositionVO[] $VALUES;
    public static final BlockPositionVO TOP_LEFT = new BlockPositionVO("TOP_LEFT", 0);
    public static final BlockPositionVO TOP_MIDDLE = new BlockPositionVO("TOP_MIDDLE", 1);
    public static final BlockPositionVO TOP_RIGHT = new BlockPositionVO("TOP_RIGHT", 2);
    public static final BlockPositionVO MIDDLE_LEFT = new BlockPositionVO("MIDDLE_LEFT", 3);
    public static final BlockPositionVO MIDDLE_MIDDLE = new BlockPositionVO("MIDDLE_MIDDLE", 4);
    public static final BlockPositionVO MIDDLE_RIGHT = new BlockPositionVO("MIDDLE_RIGHT", 5);
    public static final BlockPositionVO BOTTOM_LEFT = new BlockPositionVO("BOTTOM_LEFT", 6);
    public static final BlockPositionVO BOTTOM_MIDDLE = new BlockPositionVO("BOTTOM_MIDDLE", 7);
    public static final BlockPositionVO BOTTOM_RIGHT = new BlockPositionVO("BOTTOM_RIGHT", 8);
    public static final BlockPositionVO TOP_BOTTOM_LEFT = new BlockPositionVO("TOP_BOTTOM_LEFT", 9);
    public static final BlockPositionVO TOP_BOTTOM_MIDDLE = new BlockPositionVO("TOP_BOTTOM_MIDDLE", 10);
    public static final BlockPositionVO TOP_BOTTOM_RIGHT = new BlockPositionVO("TOP_BOTTOM_RIGHT", 11);

    private static final /* synthetic */ BlockPositionVO[] $values() {
        return new BlockPositionVO[]{TOP_LEFT, TOP_MIDDLE, TOP_RIGHT, MIDDLE_LEFT, MIDDLE_MIDDLE, MIDDLE_RIGHT, BOTTOM_LEFT, BOTTOM_MIDDLE, BOTTOM_RIGHT, TOP_BOTTOM_LEFT, TOP_BOTTOM_MIDDLE, TOP_BOTTOM_RIGHT};
    }

    static {
        BlockPositionVO[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private BlockPositionVO(String str, int i11) {
    }

    public static BlockPositionVO valueOf(String str) {
        return (BlockPositionVO) Enum.valueOf(BlockPositionVO.class, str);
    }

    public static BlockPositionVO[] values() {
        return (BlockPositionVO[]) $VALUES.clone();
    }
}
