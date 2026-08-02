package ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.widgets.mediaList;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewMedia.data.MediaDTO;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewMedia.data.ReviewsMediaMapper;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewMedia.presentation.MediaVO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class SingleReviewMediaListMapper$createViewObject$mediaItems$1$1$1 extends C7735q implements Function2<MediaDTO, Integer, MediaVO> {
    SingleReviewMediaListMapper$createViewObject$mediaItems$1$1$1(Object obj) {
        super(2, obj, ReviewsMediaMapper.class, "toVideoVO", "toVideoVO(Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/data/MediaDTO;Ljava/lang/Integer;)Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final MediaVO invoke(MediaDTO p02, Integer num) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return ((ReviewsMediaMapper) this.receiver).toVideoVO(p02, num);
    }
}
