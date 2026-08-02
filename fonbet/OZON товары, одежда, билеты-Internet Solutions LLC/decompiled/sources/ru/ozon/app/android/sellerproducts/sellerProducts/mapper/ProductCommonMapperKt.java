package ru.ozon.app.android.sellerproducts.sellerProducts.mapper;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductVO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"getVideoItem", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO$GalleryItem$VideoItem;", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO;", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductCommonMapperKt {
    public static final ProductVO.GalleryItem.VideoItem getVideoItem(@NotNull ProductVO productVO) {
        Intrinsics.checkNotNullParameter(productVO, "<this>");
        if (productVO.getImageModel().getCurrentItem() instanceof ProductVO.GalleryItem.ImageItem) {
            return null;
        }
        return productVO.getImageModel().getVideoItem();
    }
}
