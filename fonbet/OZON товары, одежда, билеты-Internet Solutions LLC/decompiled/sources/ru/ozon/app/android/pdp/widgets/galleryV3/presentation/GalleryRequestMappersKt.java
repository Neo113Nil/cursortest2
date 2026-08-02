package ru.ozon.app.android.pdp.widgets.galleryV3.presentation;

import Sc.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.gallery.GalleryRequest;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v3.GalleryV3VO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toGalleryRequestItem", "Lru/ozon/app/android/gallery/GalleryRequest$GalleryItem;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Item;", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryRequestMappersKt {
    @NotNull
    public static final GalleryRequest.GalleryItem toGalleryRequestItem(@NotNull GalleryV3VO.Item item) {
        Intrinsics.checkNotNullParameter(item, "<this>");
        if (item instanceof GalleryV3VO.Item.Photo) {
            GalleryV3VO.Item.Photo photo = (GalleryV3VO.Item.Photo) item;
            return new GalleryRequest.GalleryItem.Image(photo.getUrl(), null, photo.getIsApparel(), 2, null);
        }
        if (item instanceof GalleryV3VO.Item.Photo360) {
            GalleryV3VO.Item.Photo360 photo360 = (GalleryV3VO.Item.Photo360) item;
            return new GalleryRequest.GalleryItem.Photo360(photo360.getCoverImage(), photo360.getDescription(), photo360.getButton(), photo360.getTokenizedEvent(), photo360.getIsApparel());
        }
        if (!(item instanceof GalleryV3VO.Item.OzonVideo)) {
            throw new o();
        }
        GalleryV3VO.Item.OzonVideo ozonVideo = (GalleryV3VO.Item.OzonVideo) item;
        return new GalleryRequest.GalleryItem.OzonVideo(ozonVideo.getPreviewImageUrl(), ozonVideo.getVideo().getLink(), false, ozonVideo.getTokenizedEvent(), ozonVideo.getGalleryTokenizedVideoEvents(), ozonVideo.getIsApparel(), 4, null);
    }
}
