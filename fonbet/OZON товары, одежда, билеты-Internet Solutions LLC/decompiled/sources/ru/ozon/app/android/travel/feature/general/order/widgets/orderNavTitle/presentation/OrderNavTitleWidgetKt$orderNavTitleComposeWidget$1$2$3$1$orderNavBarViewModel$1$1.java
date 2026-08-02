package ru.ozon.app.android.travel.feature.general.order.widgets.orderNavTitle.presentation;

import Sc.InterfaceC4008j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.general.order.widgets.orderNavBar.presentation.OrderNavBarViewModel;
import ru.ozon.app.android.travel.feature.general.order.widgets.orderNavTitle.di.OrderNavTitleComponent;
import ru.ozon.app.android.travel.feature.general.order.widgets.orderNavTitle.presentation.OrderNavTitleWidgetKt$orderNavTitleComposeWidget$1;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/presentation/OrderNavBarViewModel;", "kotlin.jvm.PlatformType", "invoke", "()Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/presentation/OrderNavBarViewModel;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class OrderNavTitleWidgetKt$orderNavTitleComposeWidget$1$2$3$1$orderNavBarViewModel$1$1 extends AbstractC7737t implements Function0<OrderNavBarViewModel> {
    final /* synthetic */ InterfaceC4008j<OrderNavTitleComponent> $component$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderNavTitleWidgetKt$orderNavTitleComposeWidget$1$2$3$1$orderNavBarViewModel$1$1(InterfaceC4008j<OrderNavTitleComponent> interfaceC4008j) {
        super(0);
        this.$component$delegate = interfaceC4008j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final OrderNavBarViewModel invoke() {
        return OrderNavTitleWidgetKt$orderNavTitleComposeWidget$1.AnonymousClass2.invoke$lambda$0(this.$component$delegate).getViewModelProvider().get();
    }
}
