package ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.widgets.mediaRow;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewMedia.data.MediaDTO;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewMedia.data.ReviewsMediaMapper;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewMedia.presentation.MediaVO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class SingleReviewGalleryRowMapper$createSecondRow$mediaItems$1$2$1 extends C7735q implements Function1<MediaDTO, MediaVO> {
    SingleReviewGalleryRowMapper$createSecondRow$mediaItems$1$2$1(Object obj) {
        super(1, obj, ReviewsMediaMapper.class, "toPhotoVO", "toPhotoVO(Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/data/MediaDTO;)Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MediaVO invoke(MediaDTO p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return ((ReviewsMediaMapper) this.receiver).toPhotoVO(p02);
    }
}
