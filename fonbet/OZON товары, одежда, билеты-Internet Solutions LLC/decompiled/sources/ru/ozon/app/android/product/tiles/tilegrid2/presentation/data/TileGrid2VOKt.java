package ru.ozon.app.android.product.tiles.tilegrid2.presentation.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileGrid2ItemDTO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"tileId", "", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2ItemDTO;", "getTileId", "(Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2ItemDTO;)Ljava/lang/String;", "product_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TileGrid2VOKt {
    @NotNull
    public static final String getTileId(@NotNull TileGrid2ItemDTO tileGrid2ItemDTO) {
        Intrinsics.checkNotNullParameter(tileGrid2ItemDTO, "<this>");
        String id2 = tileGrid2ItemDTO.getId();
        if (id2 != null) {
            return id2;
        }
        Long sku = tileGrid2ItemDTO.getSku();
        String l11 = sku != null ? sku.toString() : null;
        Intrinsics.f(l11);
        return l11;
    }
}
