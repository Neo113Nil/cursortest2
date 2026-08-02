package ru.ozon.app.android.orders.cml.deliveryOrderOnDetails.presentation.views;

import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.orders.cml.common.ext.Dimens;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class DeliveryOrderOnDetailsView$setupConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ DeliveryOrderOnDetailsView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeliveryOrderOnDetailsView$setupConstraints$1(DeliveryOrderOnDetailsView deliveryOrderOnDetailsView) {
        super(1);
        this.this$0 = deliveryOrderOnDetailsView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        updateConstraints.s(this.this$0.getTitleTextView().getId(), 6, 0, 6);
        int id2 = this.this$0.getTitleTextView().getId();
        int id3 = this.this$0.getBadgeView().getId();
        Dimens dimens = Dimens.INSTANCE;
        updateConstraints.t(id2, 7, id3, 6, dimens.getDp8());
        updateConstraints.s(this.this$0.getTitleTextView().getId(), 3, 0, 3);
        updateConstraints.t(this.this$0.getBadgeView().getId(), 7, this.this$0.getTitleIconView().getId(), 6, dimens.getDp8());
        updateConstraints.s(this.this$0.getBadgeView().getId(), 3, this.this$0.getTitleTextView().getId(), 3);
        updateConstraints.s(this.this$0.getBadgeView().getId(), 4, this.this$0.getTitleTextView().getId(), 4);
        updateConstraints.s(this.this$0.getTitleIconView().getId(), 7, 0, 7);
        updateConstraints.s(this.this$0.getTitleIconView().getId(), 3, this.this$0.getTitleTextView().getId(), 3);
        updateConstraints.s(this.this$0.getTitleIconView().getId(), 4, this.this$0.getTitleTextView().getId(), 4);
        updateConstraints.s(this.this$0.getTextAtomsVAL().getId(), 6, 0, 6);
        updateConstraints.t(this.this$0.getTextAtomsVAL().getId(), 3, this.this$0.getTitleTextView().getId(), 4, dimens.getDp4());
        updateConstraints.s(this.this$0.getTextAtomsVAL().getId(), 7, 0, 7);
        updateConstraints.s(this.this$0.getImagesView().getId(), 6, 0, 6);
        updateConstraints.s(this.this$0.getImagesView().getId(), 7, 0, 7);
        updateConstraints.t(this.this$0.getImagesView().getId(), 3, this.this$0.getTextAtomsVAL().getId(), 4, dimens.getDp12());
    }
}
