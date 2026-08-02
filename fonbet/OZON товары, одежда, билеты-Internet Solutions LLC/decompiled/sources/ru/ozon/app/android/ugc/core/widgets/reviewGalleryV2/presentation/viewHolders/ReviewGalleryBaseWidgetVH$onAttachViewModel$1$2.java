package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewHolders;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.ReviewGalleryVisibilityDelegate;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2WidgetState;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewmodel/ReviewGalleryV2WidgetState;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewmodel/ReviewGalleryV2WidgetState;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReviewGalleryBaseWidgetVH$onAttachViewModel$1$2 extends AbstractC7737t implements Function1<ReviewGalleryV2WidgetState, Unit> {
    final /* synthetic */ ReviewGalleryBaseWidgetVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewGalleryBaseWidgetVH$onAttachViewModel$1$2(ReviewGalleryBaseWidgetVH reviewGalleryBaseWidgetVH) {
        super(1);
        this.this$0 = reviewGalleryBaseWidgetVH;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ReviewGalleryV2WidgetState reviewGalleryV2WidgetState) {
        invoke2(reviewGalleryV2WidgetState);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ReviewGalleryV2WidgetState reviewGalleryV2WidgetState) {
        ReviewGalleryVisibilityDelegate reviewGalleryVisibilityDelegate;
        reviewGalleryVisibilityDelegate = this.this$0.reviewGalleryVisibilityDelegate;
        if (reviewGalleryVisibilityDelegate != null) {
            Intrinsics.f(reviewGalleryV2WidgetState);
            reviewGalleryVisibilityDelegate.onVisibilityChanged(reviewGalleryV2WidgetState);
        }
    }
}
