package ru.ozon.app.android.fresh.main.widgets.product.common.events;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.widgets.product.common.ProductWidgetVO;
import ru.ozon.app.android.fresh.main.widgets.product.common.product.ProductVO;
import ru.ozon.app.android.product.imagesswipeview.AdultImageView;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0012\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¨\u0006\u0007"}, d2 = {"updateProductByAdultDialogSubmitedEvent", "Lru/ozon/app/android/fresh/main/widgets/product/common/ProductWidgetVO;", "update", "Lru/ozon/app/android/fresh/main/widgets/product/common/events/OnAdultDialogSubmited;", "updateAdultProductIfNeedIt", "Lru/ozon/app/android/fresh/main/widgets/product/common/product/ProductVO;", "updateProduct", "widgets-main_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OnAdultProductUpdateKt {
    @NotNull
    public static final ProductVO updateAdultProductIfNeedIt(@NotNull ProductVO productVO, @NotNull OnAdultDialogSubmited update) {
        Intrinsics.checkNotNullParameter(productVO, "<this>");
        Intrinsics.checkNotNullParameter(update, "update");
        return productVO.getIsAdult() ? updateProduct(productVO, update) : productVO;
    }

    private static final ProductVO updateProduct(ProductVO productVO, OnAdultDialogSubmited onAdultDialogSubmited) {
        Boolean isFavorite = onAdultDialogSubmited.getIsFavorite();
        if (isFavorite == null) {
            isFavorite = productVO.getIsFavorite();
        }
        return ProductVO.copy$default(productVO, 0L, null, 0L, AdultImageView.Image.copy$default(productVO.getImage(), null, null, 0.0f, false, false, false, null, null, null, false, null, false, 4063, null), null, false, false, isFavorite, null, null, null, null, null, null, null, false, null, 130871, null);
    }

    @NotNull
    public static final ProductWidgetVO updateProductByAdultDialogSubmitedEvent(@NotNull ProductWidgetVO productWidgetVO, @NotNull OnAdultDialogSubmited update) {
        Intrinsics.checkNotNullParameter(productWidgetVO, "<this>");
        Intrinsics.checkNotNullParameter(update, "update");
        List<ProductVO> products = productWidgetVO.getProducts();
        ArrayList arrayList = new ArrayList(C7714v.z(products, 10));
        Iterator<T> it = products.iterator();
        while (it.hasNext()) {
            arrayList.add(updateAdultProductIfNeedIt((ProductVO) it.next(), update));
        }
        return ProductWidgetVO.copy$default(productWidgetVO, 0L, arrayList, null, 5, null);
    }
}
