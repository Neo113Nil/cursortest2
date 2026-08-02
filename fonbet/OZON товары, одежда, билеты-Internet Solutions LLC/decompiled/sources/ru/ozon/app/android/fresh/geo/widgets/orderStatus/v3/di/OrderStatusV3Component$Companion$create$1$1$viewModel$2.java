package ru.ozon.app.android.fresh.geo.widgets.orderStatus.v3.di;

import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;
import ru.ozon.app.android.fresh.geo.widgets.orderStatus.v3.presentation.OrderStatusV3ViewModel;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/presentation/OrderStatusV3ViewModel;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class OrderStatusV3Component$Companion$create$1$1$viewModel$2 extends AbstractC7737t implements Function0<OrderStatusV3ViewModel> {
    final /* synthetic */ C7475g $storage;
    final /* synthetic */ OrderStatusV3Component$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderStatusV3Component$Companion$create$1$1$viewModel$2(C7475g c7475g, OrderStatusV3Component$Companion$create$1$1 orderStatusV3Component$Companion$create$1$1) {
        super(0);
        this.$storage = c7475g;
        this.this$0 = orderStatusV3Component$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final OrderStatusV3ViewModel invoke() {
        return new OrderStatusV3ViewModel(((ComposerWidgetAsyncComponentApi) this.$storage.getComponent(ComposerWidgetAsyncComponentApi.class)).getComposerAsyncWidgetRepository(), this.this$0.getMapper(), this.this$0.getTimerDelegate());
    }
}
