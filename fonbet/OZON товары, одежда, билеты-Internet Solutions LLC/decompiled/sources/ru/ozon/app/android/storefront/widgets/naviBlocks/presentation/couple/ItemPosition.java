package ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.couple;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/couple/ItemPosition;", "", "<init>", "(Ljava/lang/String;I)V", "TOP", "BOTTOM", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ItemPosition {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ItemPosition[] $VALUES;
    public static final ItemPosition TOP = new ItemPosition("TOP", 0);
    public static final ItemPosition BOTTOM = new ItemPosition("BOTTOM", 1);

    private static final /* synthetic */ ItemPosition[] $values() {
        return new ItemPosition[]{TOP, BOTTOM};
    }

    static {
        ItemPosition[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private ItemPosition(String str, int i11) {
    }

    public static ItemPosition valueOf(String str) {
        return (ItemPosition) Enum.valueOf(ItemPosition.class, str);
    }

    public static ItemPosition[] values() {
        return (ItemPosition[]) $VALUES.clone();
    }
}
