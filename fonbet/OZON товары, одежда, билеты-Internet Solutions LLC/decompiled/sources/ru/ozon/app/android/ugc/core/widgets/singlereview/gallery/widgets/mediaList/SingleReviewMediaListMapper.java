package ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.widgets.mediaList;

import Kk.c;
import Tc.b;
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

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 !2*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001!B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u0005*\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010JC\u0010\u0018\u001a\u00020\u0017*\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\u001a\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u00120\u0001H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001eR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001fR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/mediaList/SingleReviewMediaListMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/mediaList/SingleReviewMediaListDO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/mediaList/SingleReviewMediaListVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/prefetch/SingleReviewPrefetcher;", "prefetcher", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/data/ReviewsMediaMapper;", "reviewsMediaMapper", "Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/common/SingleReviewGalleryItemSizeProvider;", "sizeProvider", "<init>", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/prefetch/SingleReviewPrefetcher;Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/data/ReviewsMediaMapper;Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/common/SingleReviewGalleryItemSizeProvider;)V", "createViewObject", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/mediaList/SingleReviewMediaListDO;)Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/mediaList/SingleReviewMediaListVO;", "", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/data/MediaDTO;", "listOfMedia", "", "map", "", "addMediaFromListOfDto", "(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function2;)V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/mediaList/SingleReviewMediaListDO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/prefetch/SingleReviewPrefetcher;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/data/ReviewsMediaMapper;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/common/SingleReviewGalleryItemSizeProvider;", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SingleReviewMediaListMapper implements Function2<SingleReviewMediaListDO, d, List<? extends SingleReviewMediaListVO>> {

    @NotNull
    private final SingleReviewPrefetcher prefetcher;

    @NotNull
    private final ReviewsMediaMapper reviewsMediaMapper;

    @NotNull
    private final SingleReviewGalleryItemSizeProvider sizeProvider;
    public static final int $stable = 8;

    public SingleReviewMediaListMapper(@NotNull SingleReviewPrefetcher prefetcher, @NotNull ReviewsMediaMapper reviewsMediaMapper, @NotNull SingleReviewGalleryItemSizeProvider sizeProvider) {
        Intrinsics.checkNotNullParameter(prefetcher, "prefetcher");
        Intrinsics.checkNotNullParameter(reviewsMediaMapper, "reviewsMediaMapper");
        Intrinsics.checkNotNullParameter(sizeProvider, "sizeProvider");
        this.prefetcher = prefetcher;
        this.reviewsMediaMapper = reviewsMediaMapper;
        this.sizeProvider = sizeProvider;
    }

    private final void addMediaFromListOfDto(List<MediaVO> list, List<MediaDTO> list2, Function2<? super MediaDTO, ? super Integer, MediaVO> function2) {
        int defaultItemSize = list.isEmpty() ? SingleReviewGalleryItemSizeProvider.INSTANCE.getDefaultItemSize() : this.sizeProvider.getSmallItemSize();
        int size = list2.size();
        for (int i11 = 0; i11 < size && list.size() < 3; i11++) {
            MediaDTO mediaDTO = list2.get(i11);
            this.prefetcher.prefetchSquareImage(mediaDTO.getUrl(), Integer.valueOf(defaultItemSize));
            list.add(function2.invoke(mediaDTO, Integer.valueOf(defaultItemSize)));
        }
    }

    private final SingleReviewMediaListVO createViewObject(SingleReviewMediaListDO singleReviewMediaListDO) {
        List<MediaDTO> videos = singleReviewMediaListDO.getVideos();
        int size = videos != null ? videos.size() : 0;
        List<MediaDTO> photos = singleReviewMediaListDO.getPhotos();
        int size2 = size + (photos != null ? photos.size() : 0);
        b builder = new b(3);
        List<MediaDTO> videos2 = singleReviewMediaListDO.getVideos();
        if (videos2 != null) {
            addMediaFromListOfDto(builder, videos2, new SingleReviewMediaListMapper$createViewObject$mediaItems$1$1$1(this.reviewsMediaMapper));
        }
        List<MediaDTO> photos2 = singleReviewMediaListDO.getPhotos();
        if (photos2 != null) {
            addMediaFromListOfDto(builder, photos2, new SingleReviewMediaListMapper$createViewObject$mediaItems$1$2$1(this));
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        b B11 = builder.B();
        long a11 = c.a(singleReviewMediaListDO.getUuid(), "_mediaList");
        SingleReviewGalleryItemSizeProvider.Companion companion = SingleReviewGalleryItemSizeProvider.INSTANCE;
        Rect rect = new Rect(companion.getHorizontalMargin(), companion.getTopMargin(), companion.getHorizontalMargin(), size2 <= 3 ? singleReviewMediaListDO.getBottomMargin() : 0);
        CornerRadius mediaPreviewCornerRadius = singleReviewMediaListDO.getMediaPreviewCornerRadius();
        SingleReviewDTO.MediaImageStickerDTO mediaImageSticker = singleReviewMediaListDO.getMediaImageSticker();
        return new SingleReviewMediaListVO(a11, rect, B11, mediaPreviewCornerRadius, mediaImageSticker != null ? MediaImageStickerVOKt.toVO(mediaImageSticker) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<SingleReviewMediaListVO> invoke(@NotNull SingleReviewMediaListDO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(createViewObject(state));
    }
}
