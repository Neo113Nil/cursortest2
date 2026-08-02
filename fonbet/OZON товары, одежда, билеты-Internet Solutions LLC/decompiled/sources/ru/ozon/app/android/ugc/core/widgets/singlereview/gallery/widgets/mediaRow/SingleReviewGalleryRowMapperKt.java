package ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.widgets.mediaRow;

import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"&\u0010\u0005\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0006*\n\u0012\u0004\u0012\u0002H\u0006\u0018\u00010\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"fullMediaItemsCount", "", "Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/mediaRow/SingleReviewGalleryRowDO;", "getFullMediaItemsCount", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/mediaRow/SingleReviewGalleryRowDO;)I", "size", "T", "", "getSize", "(Ljava/util/List;)I", "core_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SingleReviewGalleryRowMapperKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int getFullMediaItemsCount(SingleReviewGalleryRowDO singleReviewGalleryRowDO) {
        return getSize(singleReviewGalleryRowDO.getPhotos()) + getSize(singleReviewGalleryRowDO.getVideos());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> int getSize(List<? extends T> list) {
        if (list != null) {
            return list.size();
        }
        return 0;
    }
}
