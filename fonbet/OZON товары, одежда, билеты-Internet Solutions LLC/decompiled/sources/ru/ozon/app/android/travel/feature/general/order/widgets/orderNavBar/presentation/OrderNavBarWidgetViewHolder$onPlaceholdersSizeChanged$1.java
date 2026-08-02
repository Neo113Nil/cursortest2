package ru.ozon.app.android.travel.feature.general.order.widgets.orderNavBar.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "height1", "", "height2", "invoke", "(Ljava/lang/Integer;Ljava/lang/Integer;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class OrderNavBarWidgetViewHolder$onPlaceholdersSizeChanged$1 extends AbstractC7737t implements Function2<Integer, Integer, Unit> {
    final /* synthetic */ OrderNavBarWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderNavBarWidgetViewHolder$onPlaceholdersSizeChanged$1(OrderNavBarWidgetViewHolder orderNavBarWidgetViewHolder) {
        super(2);
        this.this$0 = orderNavBarWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) {
        invoke2(num, num2);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Integer num, Integer num2) {
        OrderNavBarWidgetViewHolder orderNavBarWidgetViewHolder = this.this$0;
        orderNavBarWidgetViewHolder.fixedPlaceholderHeight = num != null ? num.intValue() : orderNavBarWidgetViewHolder.fixedPlaceholderHeight;
        OrderNavBarWidgetViewHolder orderNavBarWidgetViewHolder2 = this.this$0;
        orderNavBarWidgetViewHolder2.contentPlaceholderHeight = num2 != null ? num2.intValue() : orderNavBarWidgetViewHolder2.contentPlaceholderHeight;
        this.this$0.updateToolbarLayoutHeight();
    }
}
