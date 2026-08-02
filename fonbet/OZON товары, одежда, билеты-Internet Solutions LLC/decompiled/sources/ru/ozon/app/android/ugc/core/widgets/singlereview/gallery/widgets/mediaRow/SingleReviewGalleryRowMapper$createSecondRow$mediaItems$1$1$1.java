package ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.widgets.mediaRow;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewMedia.data.MediaDTO;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewMedia.data.ReviewsMediaMapper;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewMedia.presentation.MediaVO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO;", "dto", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/data/MediaDTO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SingleReviewGalleryRowMapper$createSecondRow$mediaItems$1$1$1 extends AbstractC7737t implements Function1<MediaDTO, MediaVO> {
    final /* synthetic */ int $size;
    final /* synthetic */ SingleReviewGalleryRowMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleReviewGalleryRowMapper$createSecondRow$mediaItems$1$1$1(SingleReviewGalleryRowMapper singleReviewGalleryRowMapper, int i11) {
        super(1);
        this.this$0 = singleReviewGalleryRowMapper;
        this.$size = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final MediaVO invoke(MediaDTO dto) {
        ReviewsMediaMapper reviewsMediaMapper;
        Intrinsics.checkNotNullParameter(dto, "dto");
        reviewsMediaMapper = this.this$0.reviewsMediaMapper;
        return reviewsMediaMapper.toVideoVO(dto, Integer.valueOf(this.$size));
    }
}
