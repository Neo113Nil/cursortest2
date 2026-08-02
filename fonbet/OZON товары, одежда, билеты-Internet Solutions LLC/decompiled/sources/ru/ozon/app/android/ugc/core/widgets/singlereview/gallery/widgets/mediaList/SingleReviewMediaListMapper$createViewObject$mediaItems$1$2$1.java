package ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.widgets.mediaList;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewMedia.data.MediaDTO;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewMedia.data.ReviewsMediaMapper;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewMedia.presentation.MediaVO;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO;", "media", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/data/MediaDTO;", "<unused var>", "", "invoke", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/data/MediaDTO;Ljava/lang/Integer;)Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SingleReviewMediaListMapper$createViewObject$mediaItems$1$2$1 extends AbstractC7737t implements Function2<MediaDTO, Integer, MediaVO> {
    final /* synthetic */ SingleReviewMediaListMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleReviewMediaListMapper$createViewObject$mediaItems$1$2$1(SingleReviewMediaListMapper singleReviewMediaListMapper) {
        super(2);
        this.this$0 = singleReviewMediaListMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final MediaVO invoke(MediaDTO media, Integer num) {
        ReviewsMediaMapper reviewsMediaMapper;
        Intrinsics.checkNotNullParameter(media, "media");
        reviewsMediaMapper = this.this$0.reviewsMediaMapper;
        return reviewsMediaMapper.toPhotoVO(media);
    }
}
