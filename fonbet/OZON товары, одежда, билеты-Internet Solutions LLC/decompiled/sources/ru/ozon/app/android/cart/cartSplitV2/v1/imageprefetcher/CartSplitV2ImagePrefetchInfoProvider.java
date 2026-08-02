package ru.ozon.app.android.cart.cartSplitV2.v1.imageprefetcher;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.CartSplitV2ItemVO;
import ru.ozon.app.android.cart.common.product.ProductVO;
import ru.ozon.app.android.cart.feature.R$dimen;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProvider;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v1/imageprefetcher/CartSplitV2ImagePrefetchInfoProvider;", "Lru/ozon/app/android/pikazon/preload/ImagePrefetchInfoProvider;", "Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/CartSplitV2ItemVO;", "<init>", "()V", "imageSize", "Lru/ozon/app/android/pikazon/image/ImageSize;", "getSize", "item", "context", "Landroid/content/Context;", "getUrl", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CartSplitV2ImagePrefetchInfoProvider implements ImagePrefetchInfoProvider<CartSplitV2ItemVO> {
    private ImageSize imageSize;

    @Override // ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProvider
    public ImageSize getSize(@NotNull CartSplitV2ItemVO item, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.imageSize == null) {
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R$dimen.cart_split_product_image_size);
            this.imageSize = new ImageSize(dimensionPixelSize, dimensionPixelSize);
        }
        return this.imageSize;
    }

    @Override // ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProvider
    public String getUrl(@NotNull CartSplitV2ItemVO item) {
        ProductVO.Image image;
        Intrinsics.checkNotNullParameter(item, "item");
        ProductVO product = item.getProduct();
        if (product == null || (image = product.getImage()) == null) {
            return null;
        }
        return image.getUrl();
    }
}
