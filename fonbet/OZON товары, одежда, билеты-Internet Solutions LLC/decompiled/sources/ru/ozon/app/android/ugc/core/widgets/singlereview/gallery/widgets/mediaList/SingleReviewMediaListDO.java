package ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.widgets.mediaList;

import B0.C2454a;
import Tl.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewMedia.data.MediaDTO;
import ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.SingleReviewDTO;
import ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.widgets.common.ext.SingleReviewGalleryType;
import ru.ozon.uni.atoms.data.common.CornerRadius;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0081\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0013R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010\u0015R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/mediaList/SingleReviewMediaListDO;", "", "", "uuid", "", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/data/MediaDTO;", "photos", "videos", "Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/common/ext/SingleReviewGalleryType;", "galleryType", "", "bottomMargin", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "mediaPreviewCornerRadius", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$MediaImageStickerDTO;", "mediaImageSticker", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/common/ext/SingleReviewGalleryType;ILru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$MediaImageStickerDTO;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUuid", "Ljava/util/List;", "getPhotos", "()Ljava/util/List;", "getVideos", "Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/common/ext/SingleReviewGalleryType;", "getGalleryType", "()Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/common/ext/SingleReviewGalleryType;", "I", "getBottomMargin", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "getMediaPreviewCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$MediaImageStickerDTO;", "getMediaImageSticker", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$MediaImageStickerDTO;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SingleReviewMediaListDO {
    private final int bottomMargin;

    @NotNull
    private final SingleReviewGalleryType galleryType;
    private final SingleReviewDTO.MediaImageStickerDTO mediaImageSticker;
    private final CornerRadius mediaPreviewCornerRadius;
    private final List<MediaDTO> photos;

    @NotNull
    private final String uuid;
    private final List<MediaDTO> videos;

    public SingleReviewMediaListDO(@NotNull String uuid, List<MediaDTO> list, List<MediaDTO> list2, @NotNull SingleReviewGalleryType galleryType, int i11, CornerRadius cornerRadius, SingleReviewDTO.MediaImageStickerDTO mediaImageStickerDTO) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(galleryType, "galleryType");
        this.uuid = uuid;
        this.photos = list;
        this.videos = list2;
        this.galleryType = galleryType;
        this.bottomMargin = i11;
        this.mediaPreviewCornerRadius = cornerRadius;
        this.mediaImageSticker = mediaImageStickerDTO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SingleReviewMediaListDO)) {
            return false;
        }
        SingleReviewMediaListDO singleReviewMediaListDO = (SingleReviewMediaListDO) other;
        return Intrinsics.d(this.uuid, singleReviewMediaListDO.uuid) && Intrinsics.d(this.photos, singleReviewMediaListDO.photos) && Intrinsics.d(this.videos, singleReviewMediaListDO.videos) && this.galleryType == singleReviewMediaListDO.galleryType && this.bottomMargin == singleReviewMediaListDO.bottomMargin && this.mediaPreviewCornerRadius == singleReviewMediaListDO.mediaPreviewCornerRadius && Intrinsics.d(this.mediaImageSticker, singleReviewMediaListDO.mediaImageSticker);
    }

    public final int getBottomMargin() {
        return this.bottomMargin;
    }

    @NotNull
    public final SingleReviewGalleryType getGalleryType() {
        return this.galleryType;
    }

    public final SingleReviewDTO.MediaImageStickerDTO getMediaImageSticker() {
        return this.mediaImageSticker;
    }

    public final CornerRadius getMediaPreviewCornerRadius() {
        return this.mediaPreviewCornerRadius;
    }

    public final List<MediaDTO> getPhotos() {
        return this.photos;
    }

    @NotNull
    public final String getUuid() {
        return this.uuid;
    }

    public final List<MediaDTO> getVideos() {
        return this.videos;
    }

    public int hashCode() {
        int hashCode = this.uuid.hashCode() * 31;
        List<MediaDTO> list = this.photos;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<MediaDTO> list2 = this.videos;
        int a11 = C2454a.a(this.bottomMargin, (this.galleryType.hashCode() + ((hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31)) * 31, 31);
        CornerRadius cornerRadius = this.mediaPreviewCornerRadius;
        int hashCode3 = (a11 + (cornerRadius == null ? 0 : cornerRadius.hashCode())) * 31;
        SingleReviewDTO.MediaImageStickerDTO mediaImageStickerDTO = this.mediaImageSticker;
        return hashCode3 + (mediaImageStickerDTO != null ? mediaImageStickerDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.uuid;
        List<MediaDTO> list = this.photos;
        List<MediaDTO> list2 = this.videos;
        SingleReviewGalleryType singleReviewGalleryType = this.galleryType;
        int i11 = this.bottomMargin;
        CornerRadius cornerRadius = this.mediaPreviewCornerRadius;
        SingleReviewDTO.MediaImageStickerDTO mediaImageStickerDTO = this.mediaImageSticker;
        StringBuilder f7 = b.f("SingleReviewMediaListDO(uuid=", str, ", photos=", ", videos=", list);
        f7.append(list2);
        f7.append(", galleryType=");
        f7.append(singleReviewGalleryType);
        f7.append(", bottomMargin=");
        f7.append(i11);
        f7.append(", mediaPreviewCornerRadius=");
        f7.append(cornerRadius);
        f7.append(", mediaImageSticker=");
        f7.append(mediaImageStickerDTO);
        f7.append(")");
        return f7.toString();
    }
}
