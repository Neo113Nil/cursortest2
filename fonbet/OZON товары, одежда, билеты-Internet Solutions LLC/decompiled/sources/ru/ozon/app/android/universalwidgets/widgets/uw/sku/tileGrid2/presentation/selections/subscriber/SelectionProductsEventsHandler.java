package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.selections.subscriber;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.selections.subscriber.SelectionProductsTileKey;
import ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileGrid2DTO;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u0003H&¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/selections/subscriber/SelectionProductsEventsHandler;", "", "updateSelectionProductsData", "", "tileId", "", "overlayItem", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO$OverlayItem;", "subscribeToSelectionProductsEvents", "isRemovedFromSelectionProducts", "", "key", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/selections/subscriber/SelectionProductsTileKey;", "reset", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface SelectionProductsEventsHandler {
    boolean isRemovedFromSelectionProducts(@NotNull SelectionProductsTileKey key);

    void reset();

    void subscribeToSelectionProductsEvents();

    void updateSelectionProductsData(@NotNull String tileId, TileGrid2DTO.OverlayItem overlayItem);
}
