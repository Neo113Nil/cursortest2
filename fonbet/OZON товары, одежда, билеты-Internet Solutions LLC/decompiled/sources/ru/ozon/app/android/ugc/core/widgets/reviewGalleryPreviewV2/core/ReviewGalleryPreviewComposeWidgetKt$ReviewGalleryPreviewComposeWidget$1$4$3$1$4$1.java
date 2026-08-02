package ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.ReviewGalleryPreviewViewModelImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class ReviewGalleryPreviewComposeWidgetKt$ReviewGalleryPreviewComposeWidget$1$4$3$1$4$1 extends C7735q implements Function2<Integer, Integer, Unit> {
    ReviewGalleryPreviewComposeWidgetKt$ReviewGalleryPreviewComposeWidget$1$4$3$1$4$1(Object obj) {
        super(2, obj, ReviewGalleryPreviewViewModelImpl.class, "loadNextItemsIfNeed", "loadNextItemsIfNeed(II)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) {
        invoke(num.intValue(), num2.intValue());
        return Unit.f71690a;
    }

    public final void invoke(int i11, int i12) {
        ((ReviewGalleryPreviewViewModelImpl) this.receiver).loadNextItemsIfNeed(i11, i12);
    }
}
