package ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.widgets.singleVideo;

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

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0012R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010\u0014R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/singleVideo/SingleReviewSingleVideoDO;", "", "", "uuid", "", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/data/MediaDTO;", "videos", "", "bottomMargin", "Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/common/ext/SingleReviewGalleryType;", "galleryType", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "mediaPreviewCornerRadius", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$MediaImageStickerDTO;", "mediaImageSticker", "<init>", "(Ljava/lang/String;Ljava/util/List;ILru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/common/ext/SingleReviewGalleryType;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$MediaImageStickerDTO;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUuid", "Ljava/util/List;", "getVideos", "()Ljava/util/List;", "I", "getBottomMargin", "Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/common/ext/SingleReviewGalleryType;", "getGalleryType", "()Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/common/ext/SingleReviewGalleryType;", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "getMediaPreviewCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$MediaImageStickerDTO;", "getMediaImageSticker", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$MediaImageStickerDTO;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SingleReviewSingleVideoDO {
    private final int bottomMargin;

    @NotNull
    private final SingleReviewGalleryType galleryType;
    private final SingleReviewDTO.MediaImageStickerDTO mediaImageSticker;
    private final CornerRadius mediaPreviewCornerRadius;

    @NotNull
    private final String uuid;
    private final List<MediaDTO> videos;

    public SingleReviewSingleVideoDO(@NotNull String uuid, List<MediaDTO> list, int i11, @NotNull SingleReviewGalleryType galleryType, CornerRadius cornerRadius, SingleReviewDTO.MediaImageStickerDTO mediaImageStickerDTO) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(galleryType, "galleryType");
        this.uuid = uuid;
        this.videos = list;
        this.bottomMargin = i11;
        this.galleryType = galleryType;
        this.mediaPreviewCornerRadius = cornerRadius;
        this.mediaImageSticker = mediaImageStickerDTO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SingleReviewSingleVideoDO)) {
            return false;
        }
        SingleReviewSingleVideoDO singleReviewSingleVideoDO = (SingleReviewSingleVideoDO) other;
        return Intrinsics.d(this.uuid, singleReviewSingleVideoDO.uuid) && Intrinsics.d(this.videos, singleReviewSingleVideoDO.videos) && this.bottomMargin == singleReviewSingleVideoDO.bottomMargin && this.galleryType == singleReviewSingleVideoDO.galleryType && this.mediaPreviewCornerRadius == singleReviewSingleVideoDO.mediaPreviewCornerRadius && Intrinsics.d(this.mediaImageSticker, singleReviewSingleVideoDO.mediaImageSticker);
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

    @NotNull
    public final String getUuid() {
        return this.uuid;
    }

    public final List<MediaDTO> getVideos() {
        return this.videos;
    }

    public int hashCode() {
        int hashCode = this.uuid.hashCode() * 31;
        List<MediaDTO> list = this.videos;
        int hashCode2 = (this.galleryType.hashCode() + C2454a.a(this.bottomMargin, (hashCode + (list == null ? 0 : list.hashCode())) * 31, 31)) * 31;
        CornerRadius cornerRadius = this.mediaPreviewCornerRadius;
        int hashCode3 = (hashCode2 + (cornerRadius == null ? 0 : cornerRadius.hashCode())) * 31;
        SingleReviewDTO.MediaImageStickerDTO mediaImageStickerDTO = this.mediaImageSticker;
        return hashCode3 + (mediaImageStickerDTO != null ? mediaImageStickerDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.uuid;
        List<MediaDTO> list = this.videos;
        int i11 = this.bottomMargin;
        SingleReviewGalleryType singleReviewGalleryType = this.galleryType;
        CornerRadius cornerRadius = this.mediaPreviewCornerRadius;
        SingleReviewDTO.MediaImageStickerDTO mediaImageStickerDTO = this.mediaImageSticker;
        StringBuilder f7 = b.f("SingleReviewSingleVideoDO(uuid=", str, ", videos=", ", bottomMargin=", list);
        f7.append(i11);
        f7.append(", galleryType=");
        f7.append(singleReviewGalleryType);
        f7.append(", mediaPreviewCornerRadius=");
        f7.append(cornerRadius);
        f7.append(", mediaImageSticker=");
        f7.append(mediaImageStickerDTO);
        f7.append(")");
        return f7.toString();
    }
}
