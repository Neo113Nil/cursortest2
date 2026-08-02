package ru.ozon.app.android.cart.cartSplitV2.v2.util;

import hd.C6915b;
import kotlin.Metadata;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.uni.android.atom.productMedia.Ratio;
import ru.ozon.uni.android.atom.productMedia.RatioKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/util/ProductMediaSizeCalculator;", "", "<init>", "()V", "calculateImageSize", "Lru/ozon/app/android/pikazon/image/ImageSize;", "media", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProductMediaSizeCalculator {
    public final ImageSize calculateImageSize(ProductMediaDTO media) {
        ProductMediaDTO.Width width;
        if (media == null || (width = media.getWidth()) == null) {
            return null;
        }
        int px = ResourceExtKt.toPx(width.getDp());
        if (media.getRatio() == ProductMediaDTO.Ratio.RATIO_1_1) {
            return new ImageSize(px, px);
        }
        Ratio mapProductMediaRatio = RatioKt.mapProductMediaRatio(media.getRatio());
        return new ImageSize(px, C6915b.c(px * (mapProductMediaRatio.getHeightRatio() / mapProductMediaRatio.getWidthRatio())));
    }
}
