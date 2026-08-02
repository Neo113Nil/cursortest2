package ru.ozon.app.android.cml.delivery.widgets.order.v1.presentation;

import Vg.d;
import a00.h;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cml.delivery.widgets.order.v1.di.OrderWidgetV1Component;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/cml/delivery/widgets/order/v1/presentation/OrderParamsGroupsV1ViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class OrderParamsGroupsV1ViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, OrderParamsGroupsV1ViewHolder> {
    final /* synthetic */ OrderParamsGroupsV1ViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderParamsGroupsV1ViewMapper$holderProducer$1(OrderParamsGroupsV1ViewMapper orderParamsGroupsV1ViewMapper) {
        super(2);
        this.this$0 = orderParamsGroupsV1ViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final OrderParamsGroupsV1ViewHolder invoke(View view, ComposerReferences refs) {
        OrderWidgetV1Component orderWidgetV1Component;
        OrderWidgetV1Component orderWidgetV1Component2;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        FrameLayout frameLayout = (FrameLayout) view;
        h viewModelOwnerProvider = refs.getViewModelOwnerProvider();
        final OrderParamsGroupsV1ViewMapper orderParamsGroupsV1ViewMapper = this.this$0;
        w0 a11 = new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.cml.delivery.widgets.order.v1.presentation.OrderParamsGroupsV1ViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                OrderWidgetV1Component orderWidgetV1Component3;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                orderWidgetV1Component3 = OrderParamsGroupsV1ViewMapper.this.component;
                OrderWidgetV1ViewModel orderWidgetV1ViewModel = orderWidgetV1Component3.getOrderWidgetV1ViewModelProvider().get();
                Intrinsics.g(orderWidgetV1ViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return orderWidgetV1ViewModel;
            }
        }).a(OrderWidgetV1ViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a11, "viewModel(...)");
        OrderWidgetV1ViewModel orderWidgetV1ViewModel = (OrderWidgetV1ViewModel) a11;
        orderWidgetV1Component = this.this$0.component;
        d actionHandlersStoreFactory = orderWidgetV1Component.getActionHandlersStoreFactory();
        orderWidgetV1Component2 = this.this$0.component;
        return new OrderParamsGroupsV1ViewHolder(orderWidgetV1Component2.getTokenizedAnalytics(), orderWidgetV1ViewModel, refs, frameLayout, actionHandlersStoreFactory);
    }
}
