package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewHolders;

import Sc.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.ReviewGalleryOnScrollListener;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2MainViewModel;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "scrollEvent", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryOnScrollListener$ScrollEvent;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReviewGalleryNoUiViewHolder$onScrollListener$1 extends AbstractC7737t implements Function1<ReviewGalleryOnScrollListener.ScrollEvent, Unit> {
    final /* synthetic */ ReviewGalleryNoUiViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewGalleryNoUiViewHolder$onScrollListener$1(ReviewGalleryNoUiViewHolder reviewGalleryNoUiViewHolder) {
        super(1);
        this.this$0 = reviewGalleryNoUiViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ReviewGalleryOnScrollListener.ScrollEvent scrollEvent) {
        invoke2(scrollEvent);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ReviewGalleryOnScrollListener.ScrollEvent scrollEvent) {
        ReviewGalleryV2MainViewModel reviewGalleryV2MainViewModel;
        ReviewGalleryV2MainViewModel reviewGalleryV2MainViewModel2;
        Intrinsics.checkNotNullParameter(scrollEvent, "scrollEvent");
        if (scrollEvent instanceof ReviewGalleryOnScrollListener.ScrollEvent.DragEvent) {
            reviewGalleryV2MainViewModel2 = this.this$0.viewModel;
            reviewGalleryV2MainViewModel2.onScrollEvent(true);
        } else {
            if (!(scrollEvent instanceof ReviewGalleryOnScrollListener.ScrollEvent.PositionChanged)) {
                throw new o();
            }
            reviewGalleryV2MainViewModel = this.this$0.viewModel;
            reviewGalleryV2MainViewModel.setCurrentItemPosition(((ReviewGalleryOnScrollListener.ScrollEvent.PositionChanged) scrollEvent).getPosition());
        }
    }
}
