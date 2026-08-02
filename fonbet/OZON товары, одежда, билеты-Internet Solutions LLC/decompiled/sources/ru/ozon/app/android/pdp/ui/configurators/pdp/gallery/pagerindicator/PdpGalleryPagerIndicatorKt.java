package ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.pagerindicator;

import kotlin.Metadata;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0007\"\u0014\u0010\u0001\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0002\"\u0014\u0010\u0004\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0002\"\u0014\u0010\u0005\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0002\"\u0014\u0010\u0006\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0002¨\u0006\u0007"}, d2 = {"", "ITEMS_SPACING", "I", "ITEM_WIDTH_UNSELECTED_PX", "ITEM_WIDTH_SELECTED_PX", "ITEM_HEIGHT_PX", "SELECTED_ITEM_CORNER_RADIUS", "configurators_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PdpGalleryPagerIndicatorKt {
    private static final int ITEMS_SPACING = ResourceExtKt.toPx(3);
    private static final int ITEM_HEIGHT_PX;
    private static final int ITEM_WIDTH_SELECTED_PX;
    private static final int ITEM_WIDTH_UNSELECTED_PX;
    private static final int SELECTED_ITEM_CORNER_RADIUS;

    static {
        int px = ResourceExtKt.toPx(8);
        ITEM_WIDTH_UNSELECTED_PX = px;
        ITEM_WIDTH_SELECTED_PX = px * 2;
        ITEM_HEIGHT_PX = px;
        SELECTED_ITEM_CORNER_RADIUS = px / 2;
    }
}
