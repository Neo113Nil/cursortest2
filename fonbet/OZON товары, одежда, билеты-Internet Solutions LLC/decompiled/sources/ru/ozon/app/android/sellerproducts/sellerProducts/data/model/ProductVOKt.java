package ru.ozon.app.android.sellerproducts.sellerProducts.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.events.AtomButtonUpdate;
import ru.ozon.app.android.product.imagesswipeview.AdultImageView;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductVO;
import ru.ozon.app.android.storefront.domain.events.OnAdultDialogSubmited;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO;", "Lru/ozon/app/android/common/events/AtomButtonUpdate;", "update", "updateButtonIfNeeded", "(Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO;Lru/ozon/app/android/common/events/AtomButtonUpdate;)Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO;", "Lru/ozon/app/android/storefront/domain/events/OnAdultDialogSubmited;", "updateAdultProductIfNeedIt", "(Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO;Lru/ozon/app/android/storefront/domain/events/OnAdultDialogSubmited;)Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO;", "updateProduct", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductVOKt {
    @NotNull
    public static final ProductVO updateAdultProductIfNeedIt(@NotNull ProductVO productVO, @NotNull OnAdultDialogSubmited update) {
        Intrinsics.checkNotNullParameter(productVO, "<this>");
        Intrinsics.checkNotNullParameter(update, "update");
        return productVO.getShouldBlur() ? updateProduct(productVO, update) : productVO;
    }

    public static final ProductVO updateButtonIfNeeded(@NotNull ProductVO productVO, @NotNull AtomButtonUpdate update) {
        Intrinsics.checkNotNullParameter(productVO, "<this>");
        Intrinsics.checkNotNullParameter(update, "update");
        Long y02 = h.y0(update.getId());
        long skuId = productVO.getSkuId();
        if (y02 != null && y02.longValue() == skuId) {
            return ProductVO.copy$default(productVO, 0L, null, 0L, null, null, false, false, null, null, null, update.getAtom(), null, null, null, null, null, false, null, null, null, 0.0f, 0, 0, null, null, 0L, null, 134216703, null);
        }
        return null;
    }

    private static final ProductVO updateProduct(ProductVO productVO, OnAdultDialogSubmited onAdultDialogSubmited) {
        Boolean isFavorite = onAdultDialogSubmited.getIsFavorite();
        if (isFavorite == null) {
            isFavorite = productVO.getIsFavorite();
        }
        Boolean bool = isFavorite;
        SkuImageModel imageModel = productVO.getImageModel();
        ProductVO.GalleryItem.VideoItem videoItem = productVO.getImageModel().getVideoItem();
        ProductVO.GalleryItem.VideoItem copy$default = videoItem != null ? ProductVO.GalleryItem.VideoItem.copy$default(videoItem, AdultImageView.Image.copy$default(videoItem.getImage(), null, null, 0.0f, false, false, false, null, null, null, false, null, false, 4079, null), null, null, null, null, 30, null) : null;
        ProductVO.GalleryItem.ImageItem imageItem = productVO.getImageModel().getImageItem();
        return ProductVO.copy$default(productVO, 0L, null, 0L, SkuImageModel.copy$default(imageModel, copy$default, imageItem != null ? imageItem.copy(AdultImageView.Image.copy$default(imageItem.getImage(), null, null, 0.0f, false, false, false, null, null, null, false, null, false, 4079, null)) : null, false, 0.0f, 12, null), null, false, false, bool, null, null, null, null, null, null, null, null, false, null, null, null, 0.0f, 0, 0, null, null, 0L, null, 134217559, null);
    }
}
