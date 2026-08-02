package ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.widgets.singleVideo;

import Kk.c;
import android.graphics.Rect;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewMedia.data.MediaDTO;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewMedia.data.ReviewsMediaMapper;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewMedia.presentation.MediaVO;
import ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.SingleReviewDTO;
import ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.widgets.common.SingleReviewGalleryItemSizeProvider;
import ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.widgets.common.models.MediaImageStickerVOKt;
import ru.ozon.app.android.ugc.core.widgets.singlereview.prefetch.SingleReviewPrefetcher;
import ru.ozon.uni.atoms.data.common.CornerRadius;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/singleVideo/SingleReviewSingleVideoMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/singleVideo/SingleReviewSingleVideoDO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/singleVideo/SingleReviewSingleVideoVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/prefetch/SingleReviewPrefetcher;", "prefetcher", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/data/ReviewsMediaMapper;", "reviewsMediaMapper", "<init>", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/prefetch/SingleReviewPrefetcher;Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/data/ReviewsMediaMapper;)V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/singleVideo/SingleReviewSingleVideoDO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/prefetch/SingleReviewPrefetcher;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/data/ReviewsMediaMapper;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SingleReviewSingleVideoMapper implements Function2<SingleReviewSingleVideoDO, d, List<? extends SingleReviewSingleVideoVO>> {

    @NotNull
    private final SingleReviewPrefetcher prefetcher;

    @NotNull
    private final ReviewsMediaMapper reviewsMediaMapper;

    public SingleReviewSingleVideoMapper(@NotNull SingleReviewPrefetcher prefetcher, @NotNull ReviewsMediaMapper reviewsMediaMapper) {
        Intrinsics.checkNotNullParameter(prefetcher, "prefetcher");
        Intrinsics.checkNotNullParameter(reviewsMediaMapper, "reviewsMediaMapper");
        this.prefetcher = prefetcher;
        this.reviewsMediaMapper = reviewsMediaMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<SingleReviewSingleVideoVO> invoke(@NotNull SingleReviewSingleVideoDO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<MediaDTO> videos = state.getVideos();
        MediaDTO mediaDTO = videos != null ? (MediaDTO) C7714v.K(videos) : null;
        if (mediaDTO == null) {
            throw new IllegalStateException("Required value was null.");
        }
        SingleReviewPrefetcher singleReviewPrefetcher = this.prefetcher;
        String url = mediaDTO.getUrl();
        SingleReviewGalleryItemSizeProvider.Companion companion = SingleReviewGalleryItemSizeProvider.INSTANCE;
        singleReviewPrefetcher.prefetchSquareImage(url, Integer.valueOf(companion.getDefaultItemSize()));
        long a11 = c.a(state.getUuid(), "_singleVideo");
        MediaVO videoVO = this.reviewsMediaMapper.toVideoVO(mediaDTO, Integer.valueOf(companion.getDefaultItemSize()));
        Rect rect = new Rect(companion.getHorizontalMargin(), companion.getTopMargin(), companion.getHorizontalMargin(), state.getBottomMargin());
        CornerRadius mediaPreviewCornerRadius = state.getMediaPreviewCornerRadius();
        SingleReviewDTO.MediaImageStickerDTO mediaImageSticker = state.getMediaImageSticker();
        return C7714v.a0(new SingleReviewSingleVideoVO(a11, videoVO, rect, mediaPreviewCornerRadius, mediaImageSticker != null ? MediaImageStickerVOKt.toVO(mediaImageSticker) : null));
    }
}
