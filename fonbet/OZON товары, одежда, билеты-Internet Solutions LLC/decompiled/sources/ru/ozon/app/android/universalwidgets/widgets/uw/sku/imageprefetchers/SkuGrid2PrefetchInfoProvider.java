package ru.ozon.app.android.universalwidgets.widgets.uw.sku.imageprefetchers;

import Sc.InterfaceC4008j;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.product.common.core.GalleryItem;
import ru.ozon.app.android.product.common.product.ProductVO;
import ru.ozon.app.android.product.imagesswipeview.AdultImageView;
import ru.ozon.app.android.storefront.domain.image_prefetch.DecoratedImagePrefetchInfoProvider;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/imageprefetchers/SkuGrid2PrefetchInfoProvider;", "Lru/ozon/app/android/storefront/domain/image_prefetch/DecoratedImagePrefetchInfoProvider;", "Lru/ozon/app/android/product/common/product/ProductVO;", "<init>", "()V", "item", "Landroid/content/Context;", "context", "Lru/ozon/app/android/pikazon/image/ImageSize;", "getWidgetImageSize", "(Lru/ozon/app/android/product/common/product/ProductVO;Landroid/content/Context;)Lru/ozon/app/android/pikazon/image/ImageSize;", "", "getWidgetImageUrl", "(Lru/ozon/app/android/product/common/product/ProductVO;)Ljava/lang/String;", "", "canPrefetch", "(Lru/ozon/app/android/product/common/product/ProductVO;)Z", "", "offset$delegate", "LSc/j;", "getOffset", "()I", "offset", "displayWidth", "I", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SkuGrid2PrefetchInfoProvider extends DecoratedImagePrefetchInfoProvider<ProductVO> {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private int displayWidth;

    /* renamed from: offset$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j offset = LazyUtilsKt.unsafeLazy(SkuGrid2PrefetchInfoProvider$offset$2.INSTANCE);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/imageprefetchers/SkuGrid2PrefetchInfoProvider$Companion;", "", "<init>", "()V", "UNDEFINED_DISPLAY_WIDTH", "", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final int getOffset() {
        return ((Number) this.offset.getValue()).intValue();
    }

    @Override // ru.ozon.app.android.storefront.domain.image_prefetch.DecoratedImagePrefetchInfoProvider
    public boolean canPrefetch(@NotNull ProductVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return item.getType() == ProductVO.Type.GRID2;
    }

    @Override // ru.ozon.app.android.storefront.domain.image_prefetch.DecoratedImagePrefetchInfoProvider
    public ImageSize getWidgetImageSize(@NotNull ProductVO item, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.displayWidth == 0) {
            this.displayWidth = ResourceExtKt.getDisplaySizePx(context).e().intValue();
        }
        int offset = (this.displayWidth / 2) - getOffset();
        return new ImageSize(offset, (int) (item.getImageModel().getRatio() * offset));
    }

    @Override // ru.ozon.app.android.storefront.domain.image_prefetch.DecoratedImagePrefetchInfoProvider
    public String getWidgetImageUrl(@NotNull ProductVO item) {
        AdultImageView.Image image;
        Intrinsics.checkNotNullParameter(item, "item");
        GalleryItem.ImageItem imageItem = item.getImageModel().getImageItem();
        if (imageItem == null || (image = imageItem.getImage()) == null) {
            return null;
        }
        return image.getUrl();
    }
}
