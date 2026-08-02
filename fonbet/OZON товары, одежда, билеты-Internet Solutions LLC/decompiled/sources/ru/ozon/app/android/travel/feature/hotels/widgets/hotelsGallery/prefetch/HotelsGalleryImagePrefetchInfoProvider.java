package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.prefetch;

import Sc.o;
import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProvider;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.HotelsGalleryVO;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u000e\u0010\f\u001a\u00020\r*\u0004\u0018\u00010\u000bH\u0002¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/prefetch/HotelsGalleryImagePrefetchInfoProvider;", "Lru/ozon/app/android/pikazon/preload/ImagePrefetchInfoProvider;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO;", "<init>", "()V", "getSize", "Lru/ozon/app/android/pikazon/image/ImageSize;", "item", "context", "Landroid/content/Context;", "getUrl", "", "parseAspectRatio", "", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsGalleryImagePrefetchInfoProvider implements ImagePrefetchInfoProvider<HotelsGalleryVO> {
    private final float parseAspectRatio(String str) {
        Float v02;
        if (str == null) {
            return 1.0f;
        }
        List m11 = h.m(str, new String[]{ProductContainerDTO.RATIO_DELIMITER}, 0, 6);
        if (m11.size() != 2 || (v02 = h.v0((String) m11.get(0))) == null) {
            return 1.0f;
        }
        float floatValue = v02.floatValue();
        Float v03 = h.v0((String) m11.get(1));
        if (v03 == null) {
            return 1.0f;
        }
        float floatValue2 = v03.floatValue();
        if (floatValue <= 0.0f || floatValue2 <= 0.0f) {
            return 1.0f;
        }
        return floatValue / floatValue2;
    }

    @Override // ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProvider
    public ImageSize getSize(@NotNull HotelsGalleryVO item, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(context, "context");
        float parseAspectRatio = parseAspectRatio(item.getMobileSettings().getGalleryAspectRatio());
        int i11 = context.getResources().getDisplayMetrics().widthPixels;
        return new ImageSize(i11, (int) (i11 * parseAspectRatio));
    }

    @Override // ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProvider
    public String getUrl(@NotNull HotelsGalleryVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        HotelsGalleryVO.GalleryItem galleryItem = (HotelsGalleryVO.GalleryItem) C7714v.M(item.getItems());
        if (galleryItem == null) {
            return null;
        }
        if (galleryItem instanceof HotelsGalleryVO.Video) {
            return ((HotelsGalleryVO.Video) galleryItem).getPreviewImageUrl();
        }
        if (galleryItem instanceof HotelsGalleryVO.Photo) {
            return ((HotelsGalleryVO.Photo) galleryItem).getUrl();
        }
        throw new o();
    }
}
