package ru.ozon.app.android.orders.cml.deliveryOrderList.presentation.views;

import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.orders.cml.deliveryOrderList.presentation.views.DeliveryOrderView;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class DeliveryOrderView$setupConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ DeliveryOrderView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeliveryOrderView$setupConstraints$1(DeliveryOrderView deliveryOrderView) {
        super(1);
        this.this$0 = deliveryOrderView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        DeliveryOrderView.Companion companion;
        DeliveryOrderView.Companion companion2;
        DeliveryOrderView.Companion companion3;
        DeliveryOrderView.Companion companion4;
        DeliveryOrderView.Companion companion5;
        DeliveryOrderView.Companion companion6;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        updateConstraints.s(this.this$0.getStatusTitleTextView().getId(), 6, 0, 6);
        updateConstraints.s(this.this$0.getStatusTitleTextView().getId(), 7, this.this$0.getStatusTitleSingleAtomView().getId(), 6);
        updateConstraints.s(this.this$0.getStatusTitleTextView().getId(), 3, 0, 3);
        updateConstraints.s(this.this$0.getStatusTitleSingleAtomView().getId(), 7, 0, 7);
        updateConstraints.s(this.this$0.getStatusTitleSingleAtomView().getId(), 3, this.this$0.getStatusTitleTextView().getId(), 3);
        updateConstraints.s(this.this$0.getStatusTitleSingleAtomView().getId(), 4, this.this$0.getStatusTitleTextView().getId(), 4);
        updateConstraints.s(this.this$0.getTitleTextView().getId(), 6, 0, 6);
        int id2 = this.this$0.getTitleTextView().getId();
        int id3 = this.this$0.getStatusTitleTextView().getId();
        companion = DeliveryOrderView.Companion;
        updateConstraints.t(id2, 3, id3, 4, companion.getTITLE_TOP_MARGIN());
        updateConstraints.s(this.this$0.getTitleTextView().getId(), 7, 0, 7);
        updateConstraints.s(this.this$0.getSubtitleTextView().getId(), 6, 0, 6);
        int id4 = this.this$0.getSubtitleTextView().getId();
        int id5 = this.this$0.getTitleTextView().getId();
        companion2 = DeliveryOrderView.Companion;
        updateConstraints.t(id4, 3, id5, 4, companion2.getSUBTITLE_TOP_MARGIN());
        updateConstraints.s(this.this$0.getSubtitleTextView().getId(), 7, 0, 7);
        updateConstraints.s(this.this$0.getBadgeInRowLayout().getId(), 6, 0, 6);
        int id6 = this.this$0.getBadgeInRowLayout().getId();
        int id7 = this.this$0.getSubtitleTextView().getId();
        companion3 = DeliveryOrderView.Companion;
        updateConstraints.t(id6, 3, id7, 4, companion3.getBADGE_IN_ROW_TOP_MARGIN());
        updateConstraints.s(this.this$0.getBadgeInRowLayout().getId(), 7, 0, 7);
        updateConstraints.s(this.this$0.getInputCellView().getId(), 6, 0, 6);
        int id8 = this.this$0.getInputCellView().getId();
        int id9 = this.this$0.getBadgeInRowLayout().getId();
        companion4 = DeliveryOrderView.Companion;
        updateConstraints.t(id8, 3, id9, 4, companion4.getINPUT_TOP_MARGIN());
        updateConstraints.s(this.this$0.getInputCellView().getId(), 7, 0, 7);
        updateConstraints.s(this.this$0.getDeliveryInfoView().getId(), 6, 0, 6);
        int id10 = this.this$0.getDeliveryInfoView().getId();
        int id11 = this.this$0.getInputCellView().getId();
        companion5 = DeliveryOrderView.Companion;
        updateConstraints.t(id10, 3, id11, 4, companion5.getDELIVERY_INFO_TOP_MARGIN());
        updateConstraints.s(this.this$0.getDeliveryInfoView().getId(), 7, 0, 7);
        updateConstraints.s(this.this$0.getGroupButtonsView().getId(), 6, 0, 6);
        int id12 = this.this$0.getGroupButtonsView().getId();
        int id13 = this.this$0.getDeliveryInfoView().getId();
        companion6 = DeliveryOrderView.Companion;
        updateConstraints.t(id12, 3, id13, 4, companion6.getBUTTONS_TOP_MARGIN());
        updateConstraints.s(this.this$0.getGroupButtonsView().getId(), 7, 0, 7);
    }
}
