package ru.ozon.app.android.product.tiles.tilegrid2.presentation.multibutton.data;

import kotlin.Metadata;
import l20.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00060\u0001j\u0002`\u0002\u0082\u0001\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/TileGrid2ButtonsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/TileGrid2BannerSeparatedButtonVO;", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/TileGrid2CartButtonVO;", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/TileGrid2EmptyButtonVO;", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/TileGrid2ReserveButtonVO;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface TileGrid2ButtonsVO extends c {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class DefaultImpls {
        public static Integer getScrollWidgetKey(@NotNull TileGrid2ButtonsVO tileGrid2ButtonsVO) {
            return null;
        }

        public static int getViewItemKey(@NotNull TileGrid2ButtonsVO tileGrid2ButtonsVO) {
            return tileGrid2ButtonsVO.hashCode();
        }
    }
}
