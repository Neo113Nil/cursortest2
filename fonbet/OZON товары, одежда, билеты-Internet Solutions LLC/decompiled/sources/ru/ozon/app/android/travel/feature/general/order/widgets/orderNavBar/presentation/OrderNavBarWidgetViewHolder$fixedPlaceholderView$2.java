package ru.ozon.app.android.travel.feature.general.order.widgets.orderNavBar.presentation;

import android.content.Context;
import androidx.appcompat.widget.Toolbar;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import ru.ozon.app.android.travel.feature.general.order.widgets.orderNavBar.view.OrderNavBarTitlePlaceholderView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/view/OrderNavBarTitlePlaceholderView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class OrderNavBarWidgetViewHolder$fixedPlaceholderView$2 extends AbstractC7737t implements Function0<OrderNavBarTitlePlaceholderView> {
    final /* synthetic */ OrderNavBarWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderNavBarWidgetViewHolder$fixedPlaceholderView$2(OrderNavBarWidgetViewHolder orderNavBarWidgetViewHolder) {
        super(0);
        this.this$0 = orderNavBarWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final OrderNavBarTitlePlaceholderView invoke() {
        Context context;
        i iVar;
        context = this.this$0.context;
        Intrinsics.checkNotNullExpressionValue(context, "access$getContext$p(...)");
        OrderNavBarTitlePlaceholderView orderNavBarTitlePlaceholderView = new OrderNavBarTitlePlaceholderView(context);
        OrderNavBarWidgetViewHolder orderNavBarWidgetViewHolder = this.this$0;
        orderNavBarTitlePlaceholderView.setLayoutParams(new Toolbar.g(-1, -2));
        iVar = orderNavBarWidgetViewHolder.container;
        orderNavBarTitlePlaceholderView.setupNestedWidgetManager(iVar);
        return orderNavBarTitlePlaceholderView;
    }
}
