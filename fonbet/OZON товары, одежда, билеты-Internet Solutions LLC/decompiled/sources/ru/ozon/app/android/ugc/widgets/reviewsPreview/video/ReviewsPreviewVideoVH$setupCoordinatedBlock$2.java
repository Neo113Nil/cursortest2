package ru.ozon.app.android.ugc.widgets.reviewsPreview.video;

import android.os.Handler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.data.ReviewsPreviewVO;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.video.ReviewsPreviewVideoVH$setupCoordinatedBlock$2;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReviewsPreviewVideoVH$setupCoordinatedBlock$2 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ ReviewsPreviewVO.ReviewsPreviewVideoVO $item;
    final /* synthetic */ ReviewsPreviewVideoVH this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.ugc.widgets.reviewsPreview.video.ReviewsPreviewVideoVH$setupCoordinatedBlock$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ ReviewsPreviewVO.ReviewsPreviewVideoVO $item;
        final /* synthetic */ ReviewsPreviewVideoVH this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ReviewsPreviewVideoVH reviewsPreviewVideoVH, ReviewsPreviewVO.ReviewsPreviewVideoVO reviewsPreviewVideoVO) {
            super(0);
            this.this$0 = reviewsPreviewVideoVH;
            this.$item = reviewsPreviewVideoVO;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(ReviewsPreviewVideoVH reviewsPreviewVideoVH, ReviewsPreviewVO.ReviewsPreviewVideoVO reviewsPreviewVideoVO) {
            reviewsPreviewVideoVH.viewModel.onVideoLooped(reviewsPreviewVideoVO.getPairId(), reviewsPreviewVideoVO.getBlockIndex(), 1 - reviewsPreviewVideoVO.getBlockIndex());
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ReviewsPreviewVideoDelegate reviewsPreviewVideoDelegate;
            Handler handler;
            reviewsPreviewVideoDelegate = this.this$0.videoDelegate;
            reviewsPreviewVideoDelegate.setOnVideoLooped(null);
            handler = this.this$0.handler;
            final ReviewsPreviewVideoVH reviewsPreviewVideoVH = this.this$0;
            final ReviewsPreviewVO.ReviewsPreviewVideoVO reviewsPreviewVideoVO = this.$item;
            handler.post(new Runnable() { // from class: ru.ozon.app.android.ugc.widgets.reviewsPreview.video.b
                @Override // java.lang.Runnable
                public final void run() {
                    ReviewsPreviewVideoVH$setupCoordinatedBlock$2.AnonymousClass1.invoke$lambda$0(ReviewsPreviewVideoVH.this, reviewsPreviewVideoVO);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewsPreviewVideoVH$setupCoordinatedBlock$2(ReviewsPreviewVideoVH reviewsPreviewVideoVH, ReviewsPreviewVO.ReviewsPreviewVideoVO reviewsPreviewVideoVO) {
        super(0);
        this.this$0 = reviewsPreviewVideoVH;
        this.$item = reviewsPreviewVideoVO;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ReviewsPreviewVideoDelegate reviewsPreviewVideoDelegate;
        ReviewsPreviewVideoDelegate reviewsPreviewVideoDelegate2;
        reviewsPreviewVideoDelegate = this.this$0.videoDelegate;
        reviewsPreviewVideoDelegate.setOnVideoLooped(new AnonymousClass1(this.this$0, this.$item));
        reviewsPreviewVideoDelegate2 = this.this$0.videoDelegate;
        reviewsPreviewVideoDelegate2.onViewInOverlapBounds(this.$item.getVideoInfo(), this.this$0.view.getPlayerView(), this.this$0.view);
    }
}
