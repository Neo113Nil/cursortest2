package ru.ozon.app.android.product.common.product;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.events.AtomButtonUpdate;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"updateButtonIfNeeded", "Lru/ozon/app/android/product/common/product/ProductVO;", "update", "Lru/ozon/app/android/common/events/AtomButtonUpdate;", "product_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ProductVOKt {
    public static final ProductVO updateButtonIfNeeded(@NotNull ProductVO productVO, @NotNull AtomButtonUpdate update) {
        Intrinsics.checkNotNullParameter(productVO, "<this>");
        Intrinsics.checkNotNullParameter(update, "update");
        Long y02 = h.y0(update.getId());
        long skuId = productVO.getSkuId();
        if (y02 != null && y02.longValue() == skuId) {
            return ProductVO.copy$default(productVO, 0L, null, 0L, null, false, false, null, null, null, null, update.getAtom(), null, null, null, null, false, null, null, null, 0.0f, 0, 0, null, null, 0L, null, null, null, null, null, null, 0, -1025, null);
        }
        return null;
    }
}
