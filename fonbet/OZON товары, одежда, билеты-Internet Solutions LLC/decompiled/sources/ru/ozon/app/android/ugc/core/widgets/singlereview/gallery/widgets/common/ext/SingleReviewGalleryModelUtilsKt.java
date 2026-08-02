package ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.widgets.common.ext;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewMedia.data.MediaDTO;
import ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.SingleReviewDTO;
import ru.ozon.app.android.pdp.utils.CollectionsExtKt;
import ru.ozon.app.android.pdp.utils.Dimens;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"galleryType", "Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/common/ext/SingleReviewGalleryType;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO;", "getGalleryType", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO;)Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/common/ext/SingleReviewGalleryType;", "bottomMargin", "", "getBottomMargin", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO;)I", "core_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SingleReviewGalleryModelUtilsKt {
    public static final int getBottomMargin(@NotNull SingleReviewDTO singleReviewDTO) {
        Intrinsics.checkNotNullParameter(singleReviewDTO, "<this>");
        if (singleReviewDTO.getButtonBlocks() == null && singleReviewDTO.getUserLikes() == null && singleReviewDTO.getAspects() == null && singleReviewDTO.getContextReviews() == null) {
            return Dimens.INSTANCE.getDP_16();
        }
        return 0;
    }

    @NotNull
    public static final SingleReviewGalleryType getGalleryType(@NotNull SingleReviewDTO singleReviewDTO) {
        List<MediaDTO> photos;
        List<MediaDTO> photos2;
        Intrinsics.checkNotNullParameter(singleReviewDTO, "<this>");
        List<MediaDTO> videos = singleReviewDTO.getVideos();
        if ((videos == null || videos.isEmpty()) && ((photos = singleReviewDTO.getPhotos()) == null || photos.isEmpty())) {
            return SingleReviewGalleryType.EMPTY;
        }
        List<MediaDTO> videos2 = singleReviewDTO.getVideos();
        if (videos2 != null && videos2.size() == 1 && ((photos2 = singleReviewDTO.getPhotos()) == null || photos2.isEmpty())) {
            return SingleReviewGalleryType.SINGLE_VIDEO;
        }
        List<MediaDTO> videos3 = singleReviewDTO.getVideos();
        return ((videos3 == null || videos3.isEmpty()) && CollectionsExtKt.isNotNullOrEmpty(singleReviewDTO.getPhotos())) ? SingleReviewGalleryType.PHOTO_LIST : SingleReviewGalleryType.MEDIA_LIST;
    }
}
