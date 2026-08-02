package ru.ozon.app.android.fresh.main.widgets.orderTracking.presentation;

import A00.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LA00/a$u$c;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(LA00/a$u$c;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class OrderTrackingViewHolder$trackRefresh$1 extends AbstractC7737t implements Function1<a.u.c, Unit> {
    final /* synthetic */ OrderTrackingViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderTrackingViewHolder$trackRefresh$1(OrderTrackingViewHolder orderTrackingViewHolder) {
        super(1);
        this.this$0 = orderTrackingViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(a.u.c cVar) {
        invoke2(cVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(a.u.c cVar) {
        OrderTrackingViewModel widgetViewModel;
        widgetViewModel = this.this$0.getWidgetViewModel();
        if (widgetViewModel != null) {
            widgetViewModel.onRefresh();
        }
    }
}
