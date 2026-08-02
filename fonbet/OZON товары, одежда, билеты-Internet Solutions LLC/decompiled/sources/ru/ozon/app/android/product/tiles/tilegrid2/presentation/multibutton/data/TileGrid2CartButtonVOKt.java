package ru.ozon.app.android.product.tiles.tilegrid2.presentation.multibutton.data;

import Sc.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.multibutton.data.TileGrid2CartButtonVO;
import ru.ozon.app.android.storefront.data.tiles.addtocart.AddToCartButtonDTO;
import ru.ozon.app.android.storefront.data.tiles.addtocart.likezone.AddToCartContainerDTO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"getSkuId", "", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/TileGrid2CartButtonVO;", "product_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TileGrid2CartButtonVOKt {
    public static final String getSkuId(@NotNull TileGrid2CartButtonVO tileGrid2CartButtonVO) {
        AddToCartButtonDTO button;
        Intrinsics.checkNotNullParameter(tileGrid2CartButtonVO, "<this>");
        if (tileGrid2CartButtonVO instanceof TileGrid2CartButtonVO.TileGrid2SingleCartContainerVO) {
            AddToCartContainerDTO container = ((TileGrid2CartButtonVO.TileGrid2SingleCartContainerVO) tileGrid2CartButtonVO).getFirstButton().getContainer();
            button = container != null ? container.getAddToCart() : null;
        } else if (tileGrid2CartButtonVO instanceof TileGrid2CartButtonVO.TileGrid2CartButtonSingleVO) {
            button = ((TileGrid2CartButtonVO.TileGrid2CartButtonSingleVO) tileGrid2CartButtonVO).getFirstButton().getButton();
        } else {
            if (!(tileGrid2CartButtonVO instanceof TileGrid2CartButtonVO.TileGrid2DoubleCartButtonVO)) {
                throw new o();
            }
            button = ((TileGrid2CartButtonVO.TileGrid2DoubleCartButtonVO) tileGrid2CartButtonVO).getFirstButton().getButton();
        }
        if (button != null) {
            return button.getSkuId();
        }
        return null;
    }
}
