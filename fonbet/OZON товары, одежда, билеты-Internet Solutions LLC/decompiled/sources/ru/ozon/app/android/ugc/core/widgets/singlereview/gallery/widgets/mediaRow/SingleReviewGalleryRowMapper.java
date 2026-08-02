package ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.widgets.mediaRow;

import Kk.c;
import android.graphics.Rect;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewMedia.data.MediaDTO;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewMedia.data.ReviewsMediaMapper;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewMedia.presentation.MediaVO;
import ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.widgets.common.SingleReviewGalleryItemSizeProvider;
import ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.widgets.common.ext.SingleReviewGalleryType;
import ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.widgets.mediaRow.SingleReviewGalleryRowVO;
import ru.ozon.app.android.ugc.core.widgets.singlereview.prefetch.SingleReviewPrefetcher;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u0000 /2*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001/B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0005*\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0005*\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0010JW\u0010\u001f\u001a\u00020\u001e*\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001c0\u001bH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b#\u0010$J&\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\u00020)2\u0006\u0010%\u001a\u00020\u0002¢\u0006\u0004\b*\u0010+R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010,R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010-R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010.¨\u00060"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/mediaRow/SingleReviewGalleryRowMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/mediaRow/SingleReviewGalleryRowDO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/mediaRow/SingleReviewGalleryRowVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/prefetch/SingleReviewPrefetcher;", "prefetcher", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/data/ReviewsMediaMapper;", "reviewsMediaMapper", "Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/common/SingleReviewGalleryItemSizeProvider;", "sizeProvider", "<init>", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/prefetch/SingleReviewPrefetcher;Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/data/ReviewsMediaMapper;Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/common/SingleReviewGalleryItemSizeProvider;)V", "createFirstRow", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/mediaRow/SingleReviewGalleryRowDO;)Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/mediaRow/SingleReviewGalleryRowVO;", "createSecondRow", "Ljava/util/ArrayList;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/mediaRow/SingleReviewGalleryRowVO$MediaItem;", "Lkotlin/collections/ArrayList;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/data/MediaDTO;", "listOfMedia", "", "startPosition", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "moreButton", "Lkotlin/Function1;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO;", "map", "", "addMediaFromListOfDto", "(Ljava/util/ArrayList;Ljava/util/List;ILru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;Lkotlin/jvm/functions/Function1;)V", "", ImagesContract.URL, "prefetchImage", "(Ljava/lang/String;)V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/mediaRow/SingleReviewGalleryRowDO;Ll20/d;)Ljava/util/List;", "", "hasGalleryBottomRow", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/mediaRow/SingleReviewGalleryRowDO;)Z", "Lru/ozon/app/android/ugc/core/widgets/singlereview/prefetch/SingleReviewPrefetcher;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/data/ReviewsMediaMapper;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/common/SingleReviewGalleryItemSizeProvider;", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SingleReviewGalleryRowMapper implements Function2<SingleReviewGalleryRowDO, d, List<? extends SingleReviewGalleryRowVO>> {

    @NotNull
    private final SingleReviewPrefetcher prefetcher;

    @NotNull
    private final ReviewsMediaMapper reviewsMediaMapper;

    @NotNull
    private final SingleReviewGalleryItemSizeProvider sizeProvider;
    public static final int $stable = 8;

    public SingleReviewGalleryRowMapper(@NotNull SingleReviewPrefetcher prefetcher, @NotNull ReviewsMediaMapper reviewsMediaMapper, @NotNull SingleReviewGalleryItemSizeProvider sizeProvider) {
        Intrinsics.checkNotNullParameter(prefetcher, "prefetcher");
        Intrinsics.checkNotNullParameter(reviewsMediaMapper, "reviewsMediaMapper");
        Intrinsics.checkNotNullParameter(sizeProvider, "sizeProvider");
        this.prefetcher = prefetcher;
        this.reviewsMediaMapper = reviewsMediaMapper;
        this.sizeProvider = sizeProvider;
    }

    private final void addMediaFromListOfDto(ArrayList<SingleReviewGalleryRowVO.MediaItem> arrayList, List<MediaDTO> list, int i11, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, Function1<? super MediaDTO, MediaVO> function1) {
        int P11 = C7714v.P(list);
        if (i11 <= P11) {
            while (arrayList.size() < 3) {
                MediaDTO mediaDTO = list.get(i11);
                prefetchImage(mediaDTO.getUrl());
                arrayList.add((arrayList.size() != 2 || largeBorderlessButton == null) ? new SingleReviewGalleryRowVO.MediaItem.Media(function1.invoke(mediaDTO)) : new SingleReviewGalleryRowVO.MediaItem.MoreButton(function1.invoke(mediaDTO), largeBorderlessButton));
                if (i11 == P11) {
                    return;
                } else {
                    i11++;
                }
            }
        }
    }

    private final SingleReviewGalleryRowVO createFirstRow(SingleReviewGalleryRowDO singleReviewGalleryRowDO) {
        List<MediaDTO> photos;
        if (singleReviewGalleryRowDO.getGalleryType() != SingleReviewGalleryType.PHOTO_LIST || (photos = singleReviewGalleryRowDO.getPhotos()) == null) {
            return null;
        }
        int min = Math.min(photos.size(), 3);
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            MediaDTO mediaDTO = (MediaDTO) C7714v.Q(i11, photos);
            if (mediaDTO != null) {
                prefetchImage(mediaDTO.getUrl());
                arrayList.add(new SingleReviewGalleryRowVO.MediaItem.Media(this.reviewsMediaMapper.toPhotoVO(mediaDTO)));
            }
        }
        long a11 = c.a(singleReviewGalleryRowDO.getUuid(), "_firstRow");
        SingleReviewGalleryItemSizeProvider.Companion companion = SingleReviewGalleryItemSizeProvider.INSTANCE;
        return new SingleReviewGalleryRowVO(a11, new Rect(companion.getHorizontalMargin(), companion.getTopMargin(), companion.getHorizontalMargin(), hasGalleryBottomRow(singleReviewGalleryRowDO) ? 0 : singleReviewGalleryRowDO.getBottomMargin()), arrayList, singleReviewGalleryRowDO.getMediaPreviewCornerRadius());
    }

    private final SingleReviewGalleryRowVO createSecondRow(SingleReviewGalleryRowDO singleReviewGalleryRowDO) {
        int fullMediaItemsCount;
        int size;
        int i11;
        SingleReviewGalleryRowMapper singleReviewGalleryRowMapper;
        int size2;
        if (!hasGalleryBottomRow(singleReviewGalleryRowDO)) {
            return null;
        }
        fullMediaItemsCount = SingleReviewGalleryRowMapperKt.getFullMediaItemsCount(singleReviewGalleryRowDO);
        int min = Math.min(fullMediaItemsCount - 3, 3);
        size = SingleReviewGalleryRowMapperKt.getSize(singleReviewGalleryRowDO.getVideos());
        if (size < 3) {
            size2 = SingleReviewGalleryRowMapperKt.getSize(singleReviewGalleryRowDO.getVideos());
            i11 = 3 - size2;
        } else {
            i11 = 0;
        }
        int i12 = i11;
        ArrayList<SingleReviewGalleryRowVO.MediaItem> arrayList = new ArrayList<>(min);
        int smallItemSize = this.sizeProvider.getSmallItemSize();
        List<MediaDTO> videos = singleReviewGalleryRowDO.getVideos();
        if (videos != null) {
            addMediaFromListOfDto(arrayList, videos, 3, singleReviewGalleryRowDO.getShowReviewGalleryButton(), new SingleReviewGalleryRowMapper$createSecondRow$mediaItems$1$1$1(this, smallItemSize));
            singleReviewGalleryRowMapper = this;
        } else {
            singleReviewGalleryRowMapper = this;
        }
        List<MediaDTO> photos = singleReviewGalleryRowDO.getPhotos();
        if (photos != null) {
            singleReviewGalleryRowMapper.addMediaFromListOfDto(arrayList, photos, i12, singleReviewGalleryRowDO.getShowReviewGalleryButton(), new SingleReviewGalleryRowMapper$createSecondRow$mediaItems$1$2$1(singleReviewGalleryRowMapper.reviewsMediaMapper));
        }
        long a11 = c.a(singleReviewGalleryRowDO.getUuid(), "_secondRow");
        SingleReviewGalleryItemSizeProvider.Companion companion = SingleReviewGalleryItemSizeProvider.INSTANCE;
        return new SingleReviewGalleryRowVO(a11, new Rect(companion.getHorizontalMargin(), companion.getDividerSize(), companion.getHorizontalMargin(), singleReviewGalleryRowDO.getBottomMargin()), arrayList, singleReviewGalleryRowDO.getMediaPreviewCornerRadius());
    }

    private final void prefetchImage(String url) {
        this.prefetcher.prefetchSquareImage(url, Integer.valueOf(this.sizeProvider.getSmallItemSize()));
    }

    public final boolean hasGalleryBottomRow(@NotNull SingleReviewGalleryRowDO state) {
        int fullMediaItemsCount;
        Intrinsics.checkNotNullParameter(state, "state");
        fullMediaItemsCount = SingleReviewGalleryRowMapperKt.getFullMediaItemsCount(state);
        return fullMediaItemsCount > 3;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<SingleReviewGalleryRowVO> invoke(@NotNull SingleReviewGalleryRowDO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        SingleReviewGalleryRowVO[] elements = {createFirstRow(state), createSecondRow(state)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.B(elements);
    }
}
