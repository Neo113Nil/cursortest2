package ru.ozon.app.android.sellerproducts.sellerProducts.videocover;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductVO;
import ru.ozon.app.android.sellerproducts.sellerProducts.mapper.ProductCommonMapperKt;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u0004\u0018\u00010\u0003H\u0000\u001a\u000e\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u0003H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0007*\u00020\u0003H\u0000\u001a\f\u0010\b\u001a\u00020\u0007*\u00020\u0003H\u0000\u001a\u000e\u0010\t\u001a\u0004\u0018\u00010\u0002*\u00020\u0003H\u0000\u001a\f\u0010\n\u001a\u00020\u000b*\u00020\u0003H\u0000\u001a\f\u0010\f\u001a\u00020\u000b*\u00020\u0003H\u0000¨\u0006\r"}, d2 = {"listOfGalleryItems", "", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO$GalleryItem;", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO;", "getImageItem", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO$GalleryItem$ImageItem;", "hasVideoCover", "", "imageModelIsNotEmpty", "getCurrentItem", "setCurrentItemAsVideo", "", "setCurrentItemAsImage", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UtilsKt {
    public static final ProductVO.GalleryItem getCurrentItem(@NotNull ProductVO productVO) {
        Intrinsics.checkNotNullParameter(productVO, "<this>");
        return productVO.getImageModel().getCurrentItem();
    }

    public static final ProductVO.GalleryItem.ImageItem getImageItem(@NotNull ProductVO productVO) {
        Intrinsics.checkNotNullParameter(productVO, "<this>");
        return productVO.getImageModel().getImageItem();
    }

    public static final boolean hasVideoCover(@NotNull ProductVO productVO) {
        Intrinsics.checkNotNullParameter(productVO, "<this>");
        return productVO.getImageModel().getHasVideoCover();
    }

    public static final boolean imageModelIsNotEmpty(@NotNull ProductVO productVO) {
        Intrinsics.checkNotNullParameter(productVO, "<this>");
        return productVO.getImageModel().getImageItem() != null;
    }

    @NotNull
    public static final List<ProductVO.GalleryItem> listOfGalleryItems(ProductVO productVO) {
        ProductVO.GalleryItem[] elements = {productVO != null ? getImageItem(productVO) : null, productVO != null ? ProductCommonMapperKt.getVideoItem(productVO) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.B(elements);
    }

    public static final void setCurrentItemAsImage(@NotNull ProductVO productVO) {
        Intrinsics.checkNotNullParameter(productVO, "<this>");
        productVO.getImageModel().setCurrentItem(productVO.getImageModel().getImageItem());
    }

    public static final void setCurrentItemAsVideo(@NotNull ProductVO productVO) {
        Intrinsics.checkNotNullParameter(productVO, "<this>");
        productVO.getImageModel().setCurrentItem(productVO.getImageModel().getVideoItem());
    }
}
