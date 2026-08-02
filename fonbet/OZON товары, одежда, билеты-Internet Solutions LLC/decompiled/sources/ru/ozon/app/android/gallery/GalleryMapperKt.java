package ru.ozon.app.android.gallery;

import Sc.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.gallery.GalleryRequest;
import ru.ozon.app.android.gallery.ItemVO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toVO", "Lru/ozon/app/android/gallery/ItemVO;", "Lru/ozon/app/android/gallery/GalleryRequest$GalleryItem;", "gallery_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GalleryMapperKt {
    @NotNull
    public static final ItemVO toVO(@NotNull GalleryRequest.GalleryItem galleryItem) {
        Intrinsics.checkNotNullParameter(galleryItem, "<this>");
        if (galleryItem instanceof GalleryRequest.GalleryItem.Image) {
            GalleryRequest.GalleryItem.Image image = (GalleryRequest.GalleryItem.Image) galleryItem;
            return new ItemVO.Image(image.getImageUrl(), image.getIsApparel());
        }
        if (galleryItem instanceof GalleryRequest.GalleryItem.OzonVideo) {
            GalleryRequest.GalleryItem.OzonVideo ozonVideo = (GalleryRequest.GalleryItem.OzonVideo) galleryItem;
            return new ItemVO.OzonVideo(ozonVideo.getVideoUrl(), ozonVideo.getPreviewImageUrl(), ozonVideo.getFullScreen(), ozonVideo.getTokenizedEvent(), ozonVideo.getGalleryTokenizedVideoEvents(), ozonVideo.getIsApparel());
        }
        if (!(galleryItem instanceof GalleryRequest.GalleryItem.Photo360)) {
            throw new o();
        }
        GalleryRequest.GalleryItem.Photo360 photo360 = (GalleryRequest.GalleryItem.Photo360) galleryItem;
        return new ItemVO.Photo360(photo360.getImageUrl(), photo360.getDescription(), photo360.getButton(), photo360.getButtonEvent(), photo360.getIsApparel());
    }
}
