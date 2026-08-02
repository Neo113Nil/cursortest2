package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.presentation.prefetcher;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.storefront.domain.image_prefetch.DecoratedImagePrefetchInfoProvider;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.vo.SmallTileModelImage;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.presentation.data.TileGrid3VO;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/presentation/prefetcher/TileGrid3PrefetchInfoProvider;", "Lru/ozon/app/android/storefront/domain/image_prefetch/DecoratedImagePrefetchInfoProvider;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/presentation/data/TileGrid3VO;", "<init>", "()V", "getWidgetImageSize", "Lru/ozon/app/android/pikazon/image/ImageSize;", "item", "context", "Landroid/content/Context;", "getWidgetImageUrl", "", "canPrefetch", "", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TileGrid3PrefetchInfoProvider extends DecoratedImagePrefetchInfoProvider<TileGrid3VO> {
    @Override // ru.ozon.app.android.storefront.domain.image_prefetch.DecoratedImagePrefetchInfoProvider
    public boolean canPrefetch(@NotNull TileGrid3VO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return true;
    }

    @Override // ru.ozon.app.android.storefront.domain.image_prefetch.DecoratedImagePrefetchInfoProvider
    @NotNull
    public ImageSize getWidgetImageSize(@NotNull TileGrid3VO item, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(context, "context");
        SmallTileModelImage image = item.getModel().getImageComponent().getImageModel().getImage();
        return new ImageSize(image.getWidthImage(), image.getHeightImage());
    }

    @Override // ru.ozon.app.android.storefront.domain.image_prefetch.DecoratedImagePrefetchInfoProvider
    @NotNull
    public String getWidgetImageUrl(@NotNull TileGrid3VO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return item.getModel().getImageComponent().getImageModel().getImage().getUrl();
    }
}
