package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.view;

import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class HotelsGalleryView$setConstrains$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ HotelsGalleryView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsGalleryView$setConstrains$1(HotelsGalleryView hotelsGalleryView) {
        super(1);
        this.this$0 = hotelsGalleryView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, this.this$0.getHotelsGalleryVp());
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, this.this$0.getHotelsGalleryVp());
        ConstraintLayoutExtensionsKt.topToParent(updateConstraints, this.this$0.getHotelsGalleryVp());
        ConstraintLayoutExtensionsKt.bottomToBottom(updateConstraints, this.this$0.getHotelsGalleryIndicatorContainer(), this.this$0.getHotelsGalleryVp());
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, this.this$0.getHotelsGalleryIndicatorContainer());
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, this.this$0.getHotelsGalleryIndicatorContainer());
        ConstraintLayoutExtensionsKt.bottomToTop(updateConstraints, this.this$0.getHotelsGalleryButtonsRv(), this.this$0.getHotelsGalleryBadge());
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, this.this$0.getHotelsGalleryButtonsRv());
        ConstraintLayoutExtensionsKt.topToParent(updateConstraints, this.this$0.getHotelsGalleryButtonsRv());
        ConstraintLayoutExtensionsKt.bottomToTop(updateConstraints, this.this$0.getHotelsGalleryBadge(), this.this$0.getNestedContainerLL());
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, this.this$0.getHotelsGalleryBadge());
        ConstraintLayoutExtensionsKt.bottomToParent(updateConstraints, this.this$0.getNestedContainerLL());
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, this.this$0.getNestedContainerLL());
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, this.this$0.getNestedContainerLL());
        ConstraintLayoutExtensionsKt.topToBottom(updateConstraints, this.this$0.getNestedContainerLL(), this.this$0.getHotelsGalleryIndicatorContainer());
    }
}
