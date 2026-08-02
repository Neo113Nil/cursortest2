package ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.ReviewGalleryPreviewViewModelImpl;
import v0.I;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lv0/I;", "invoke", "()Lv0/I;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class ReviewGalleryPreviewComposeWidgetKt$ReviewGalleryPreviewComposeWidget$1$4$3$1$listState$1$1 extends AbstractC7737t implements Function0<I> {
    final /* synthetic */ ReviewGalleryPreviewViewModelImpl $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewGalleryPreviewComposeWidgetKt$ReviewGalleryPreviewComposeWidget$1$4$3$1$listState$1$1(ReviewGalleryPreviewViewModelImpl reviewGalleryPreviewViewModelImpl) {
        super(0);
        this.$viewModel = reviewGalleryPreviewViewModelImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final I invoke() {
        return new I(this.$viewModel.getScrollPosition().e().intValue(), this.$viewModel.getScrollPosition().f().intValue());
    }
}
