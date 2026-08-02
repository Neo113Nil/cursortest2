package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsHorizontalShelves.prefetch;

import android.content.Context;
import hd.C6915b;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProvider;
import ru.ozon.app.android.travel.feature.hotels.shared.shelfCard.ShelfCardVO;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/prefetch/ShelfCardImagePrefetchInfoProvider;", "Lru/ozon/app/android/pikazon/preload/ImagePrefetchInfoProvider;", "Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/ShelfCardVO;", "<init>", "()V", "getSize", "Lru/ozon/app/android/pikazon/image/ImageSize;", "item", "context", "Landroid/content/Context;", "getUrl", "", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ShelfCardImagePrefetchInfoProvider implements ImagePrefetchInfoProvider<ShelfCardVO> {
    @Override // ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProvider
    public ImageSize getSize(@NotNull ShelfCardVO item, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(context, "context");
        Integer galleryWidth = item.getSettings().getGalleryWidth();
        if (galleryWidth == null) {
            return null;
        }
        int intValue = galleryWidth.intValue();
        Float galleryAspectRatio = item.getSettings().getGalleryAspectRatio();
        if (galleryAspectRatio == null) {
            return null;
        }
        return new ImageSize(intValue, C6915b.c(intValue / galleryAspectRatio.floatValue()));
    }

    @Override // ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProvider
    public String getUrl(@NotNull ShelfCardVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ShelfCardVO.Image image = (ShelfCardVO.Image) C7714v.M(item.getGallery().getImages());
        if (image != null) {
            return image.getUrl();
        }
        return null;
    }
}
