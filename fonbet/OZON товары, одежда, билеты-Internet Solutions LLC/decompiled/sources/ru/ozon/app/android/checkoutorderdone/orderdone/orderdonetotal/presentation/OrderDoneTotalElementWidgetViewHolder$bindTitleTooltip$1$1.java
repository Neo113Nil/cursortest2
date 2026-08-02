package ru.ozon.app.android.checkoutorderdone.orderdone.orderdonetotal.presentation;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class OrderDoneTotalElementWidgetViewHolder$bindTitleTooltip$1$1 extends AbstractC7737t implements Function1<View, Unit> {
    final /* synthetic */ AtomActionDTO $action;
    final /* synthetic */ TooltipVO $titleTooltip;
    final /* synthetic */ OrderDoneTotalElementWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderDoneTotalElementWidgetViewHolder$bindTitleTooltip$1$1(OrderDoneTotalElementWidgetViewHolder orderDoneTotalElementWidgetViewHolder, AtomActionDTO atomActionDTO, TooltipVO tooltipVO) {
        super(1);
        this.this$0 = orderDoneTotalElementWidgetViewHolder;
        this.$action = atomActionDTO;
        this.$titleTooltip = tooltipVO;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke2(view);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(View it) {
        Function1 function1;
        Intrinsics.checkNotNullParameter(it, "it");
        function1 = this.this$0.actionHandler;
        function1.invoke(AtomActionMapperKt.toAtomAction(this.$action, this.$titleTooltip.getCommon().getTrackingInfo()));
    }
}
