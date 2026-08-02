package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.data;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/TileLayout;", "", "<init>", "(Ljava/lang/String;I)V", "LAYOUT_INVALID", "LAYOUT_GRID2", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TileLayout {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TileLayout[] $VALUES;
    public static final TileLayout LAYOUT_INVALID = new TileLayout("LAYOUT_INVALID", 0);
    public static final TileLayout LAYOUT_GRID2 = new TileLayout("LAYOUT_GRID2", 1);

    private static final /* synthetic */ TileLayout[] $values() {
        return new TileLayout[]{LAYOUT_INVALID, LAYOUT_GRID2};
    }

    static {
        TileLayout[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private TileLayout(String str, int i11) {
    }

    public static TileLayout valueOf(String str) {
        return (TileLayout) Enum.valueOf(TileLayout.class, str);
    }

    public static TileLayout[] values() {
        return (TileLayout[]) $VALUES.clone();
    }
}
