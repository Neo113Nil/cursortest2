package ru.ozon.app.android.product.tiles.utils;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.common.product.ProductDTO;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0010\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002\u001a\u001d\u0010\u0004\u001a\u0004\u0018\u0001H\u0005\"\u0004\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u0002H\u00050\u0002¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"isThinWidget", "", "", "Lru/ozon/app/android/product/common/product/ProductDTO;", "secondOrNull", "T", "(Ljava/util/List;)Ljava/lang/Object;", "product_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CollectionExtKt {
    public static final boolean isThinWidget(@NotNull List<ProductDTO> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<ProductDTO> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return true;
        }
        for (ProductDTO productDTO : list2) {
            if (productDTO.getButton() != null || productDTO.getImageOverlayTitle() != null || productDTO.getImageTheme() != null || productDTO.getImageOverlayPicture() != null) {
                return false;
            }
        }
        return true;
    }

    public static final <T> T secondOrNull(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return (T) C7714v.Q(1, list);
    }
}
