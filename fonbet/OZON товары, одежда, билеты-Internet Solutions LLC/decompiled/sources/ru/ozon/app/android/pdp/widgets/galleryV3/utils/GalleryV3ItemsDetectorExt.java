package ru.ozon.app.android.pdp.widgets.galleryV3.utils;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v3.GalleryV3VO;
import ru.ozon.app.android.pdp.widgets.galleryV3.data.GalleryV3DTO;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001R\u000f\u0010\u0004\u001a\u00020\u0003*\u00020\u00028BX\u0082\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV3/utils/GalleryV3ItemsDetectorExt;", "", "Lru/ozon/app/android/pdp/widgets/galleryV3/data/GalleryV3DTO$GalleryItem;", "", "isDisplayedInGallery", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface GalleryV3ItemsDetectorExt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class DefaultImpls {
        public static boolean isDisplayedInGallery(@NotNull GalleryV3ItemsDetectorExt galleryV3ItemsDetectorExt, @NotNull GalleryV3VO.Item receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return (receiver instanceof GalleryV3VO.Item.Photo) || (receiver instanceof GalleryV3VO.Item.OzonVideo);
        }

        public static boolean isEmpty(@NotNull GalleryV3ItemsDetectorExt galleryV3ItemsDetectorExt, @NotNull GalleryV3DTO receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            List<GalleryV3DTO.GalleryItem> items = receiver.getItems();
            if ((items instanceof Collection) && items.isEmpty()) {
                return true;
            }
            Iterator<T> it = items.iterator();
            while (it.hasNext()) {
                if (isDisplayedInGallery(galleryV3ItemsDetectorExt, (GalleryV3DTO.GalleryItem) it.next())) {
                    return false;
                }
            }
            return true;
        }

        private static boolean isDisplayedInGallery(GalleryV3ItemsDetectorExt galleryV3ItemsDetectorExt, GalleryV3DTO.GalleryItem galleryItem) {
            return (galleryItem instanceof GalleryV3DTO.GalleryItem.Image) || (galleryItem instanceof GalleryV3DTO.GalleryItem.OzonVideo);
        }
    }
}
