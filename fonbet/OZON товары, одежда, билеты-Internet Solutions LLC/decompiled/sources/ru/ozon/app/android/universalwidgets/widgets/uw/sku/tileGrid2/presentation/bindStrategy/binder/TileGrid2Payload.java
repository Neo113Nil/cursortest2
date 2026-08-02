package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.bindStrategy.binder;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/bindStrategy/binder/TileGrid2Payload;", "", "<init>", "(Ljava/lang/String;I)V", "TOP_RIGHT_BUTTONS_CHANGED", "BADGES_CHANGED", "MAIN_STATE_CHANGED", "BRAND_LOGO_CHANGED", "GALLERY_CHANGED", "BACKGROUND_CHANGED", "COUNT_BUTTON_CHANGED", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TileGrid2Payload {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TileGrid2Payload[] $VALUES;
    public static final TileGrid2Payload TOP_RIGHT_BUTTONS_CHANGED = new TileGrid2Payload("TOP_RIGHT_BUTTONS_CHANGED", 0);
    public static final TileGrid2Payload BADGES_CHANGED = new TileGrid2Payload("BADGES_CHANGED", 1);
    public static final TileGrid2Payload MAIN_STATE_CHANGED = new TileGrid2Payload("MAIN_STATE_CHANGED", 2);
    public static final TileGrid2Payload BRAND_LOGO_CHANGED = new TileGrid2Payload("BRAND_LOGO_CHANGED", 3);
    public static final TileGrid2Payload GALLERY_CHANGED = new TileGrid2Payload("GALLERY_CHANGED", 4);
    public static final TileGrid2Payload BACKGROUND_CHANGED = new TileGrid2Payload("BACKGROUND_CHANGED", 5);
    public static final TileGrid2Payload COUNT_BUTTON_CHANGED = new TileGrid2Payload("COUNT_BUTTON_CHANGED", 6);

    private static final /* synthetic */ TileGrid2Payload[] $values() {
        return new TileGrid2Payload[]{TOP_RIGHT_BUTTONS_CHANGED, BADGES_CHANGED, MAIN_STATE_CHANGED, BRAND_LOGO_CHANGED, GALLERY_CHANGED, BACKGROUND_CHANGED, COUNT_BUTTON_CHANGED};
    }

    static {
        TileGrid2Payload[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private TileGrid2Payload(String str, int i11) {
    }

    public static TileGrid2Payload valueOf(String str) {
        return (TileGrid2Payload) Enum.valueOf(TileGrid2Payload.class, str);
    }

    public static TileGrid2Payload[] values() {
        return (TileGrid2Payload[]) $VALUES.clone();
    }
}
