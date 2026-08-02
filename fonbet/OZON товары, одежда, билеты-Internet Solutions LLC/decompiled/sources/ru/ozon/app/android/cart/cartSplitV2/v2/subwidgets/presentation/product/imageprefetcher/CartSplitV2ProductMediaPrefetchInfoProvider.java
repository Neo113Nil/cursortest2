package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.imageprefetcher;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.CartSplitV2ProductVO;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.ProductMediaSizeCalculator;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProvider;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/imageprefetcher/CartSplitV2ProductMediaPrefetchInfoProvider;", "Lru/ozon/app/android/pikazon/preload/ImagePrefetchInfoProvider;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/CartSplitV2ProductVO;", "sizeCalculator", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/ProductMediaSizeCalculator;", "<init>", "(Lru/ozon/app/android/cart/cartSplitV2/v2/util/ProductMediaSizeCalculator;)V", "getSize", "Lru/ozon/app/android/pikazon/image/ImageSize;", "item", "context", "Landroid/content/Context;", "getUrl", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CartSplitV2ProductMediaPrefetchInfoProvider implements ImagePrefetchInfoProvider<CartSplitV2ProductVO> {

    @NotNull
    private final ProductMediaSizeCalculator sizeCalculator;

    public CartSplitV2ProductMediaPrefetchInfoProvider(@NotNull ProductMediaSizeCalculator sizeCalculator) {
        Intrinsics.checkNotNullParameter(sizeCalculator, "sizeCalculator");
        this.sizeCalculator = sizeCalculator;
    }

    @Override // ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProvider
    public ImageSize getSize(@NotNull CartSplitV2ProductVO item, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(context, "context");
        return this.sizeCalculator.calculateImageSize(item.getProduct().getMedia());
    }

    @Override // ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProvider
    public String getUrl(@NotNull CartSplitV2ProductVO item) {
        ProductMediaDTO.Image image;
        Intrinsics.checkNotNullParameter(item, "item");
        ProductMediaDTO media = item.getProduct().getMedia();
        if (media == null || (image = media.getImage()) == null) {
            return null;
        }
        return image.getUrl();
    }
}
