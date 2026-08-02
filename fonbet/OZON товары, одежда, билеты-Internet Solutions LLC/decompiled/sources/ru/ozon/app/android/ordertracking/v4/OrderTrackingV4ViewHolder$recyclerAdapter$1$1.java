package ru.ozon.app.android.ordertracking.v4;

import androidx.lifecycle.V;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.cscore.orderTracking.viewmodels.OrderTrackingV4ViewModel;
import ru.ozon.app.android.csma.orderTracking.data.UpdateAction;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class OrderTrackingV4ViewHolder$recyclerAdapter$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ OrderTrackingV4ViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderTrackingV4ViewHolder$recyclerAdapter$1$1(OrderTrackingV4ViewHolder orderTrackingV4ViewHolder) {
        super(0);
        this.this$0 = orderTrackingV4ViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        OrderTrackingV4ViewModel orderTrackingV4ViewModel;
        UpdateAction updateAction;
        orderTrackingV4ViewModel = this.this$0.viewModel;
        V<OrderTrackingV4ViewModel.OrderTrackingV4ViewModelAction> actionObserver = orderTrackingV4ViewModel.getActionObserver();
        updateAction = this.this$0.updateActionName;
        actionObserver.setValue(updateAction != null ? new OrderTrackingV4ViewModel.OrderTrackingV4ViewModelAction.LoadNewItems(updateAction) : null);
    }
}
