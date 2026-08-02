package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.prefetch;

import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.data.TileGrid2VO;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.views.galleryswipeview.data.TileGrid2GalleryModel;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"extractUrlToPrefetch", "", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TileGrid2ImagePrefetchInfoProviderKt {
    public static final String extractUrlToPrefetch(@NotNull TileGrid2VO tileGrid2VO) {
        TileGrid2GalleryModel.Image image;
        Intrinsics.checkNotNullParameter(tileGrid2VO, "<this>");
        TileGrid2GalleryModel.GalleryItem galleryItem = (TileGrid2GalleryModel.GalleryItem) C7714v.Q(tileGrid2VO.getGalleryModel().getGalleryPrefetchPosition(), tileGrid2VO.getGalleryModel().getAdultImagesModel().getImageItems());
        if (galleryItem == null || (image = galleryItem.getImage()) == null) {
            return null;
        }
        return image.getUrl();
    }
}
