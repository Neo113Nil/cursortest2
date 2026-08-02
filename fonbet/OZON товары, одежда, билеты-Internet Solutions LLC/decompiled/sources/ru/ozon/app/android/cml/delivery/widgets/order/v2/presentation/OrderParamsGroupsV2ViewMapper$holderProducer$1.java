package ru.ozon.app.android.cml.delivery.widgets.order.v2.presentation;

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
import ru.ozon.app.android.cml.delivery.widgets.order.v2.di.OrderWidgetV2Component;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/cml/delivery/widgets/order/v2/presentation/OrderParamsGroupsV2ViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class OrderParamsGroupsV2ViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, OrderParamsGroupsV2ViewHolder> {
    final /* synthetic */ OrderParamsGroupsV2ViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderParamsGroupsV2ViewMapper$holderProducer$1(OrderParamsGroupsV2ViewMapper orderParamsGroupsV2ViewMapper) {
        super(2);
        this.this$0 = orderParamsGroupsV2ViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final OrderParamsGroupsV2ViewHolder invoke(View view, ComposerReferences refs) {
        OrderWidgetV2Component orderWidgetV2Component;
        OrderWidgetV2Component orderWidgetV2Component2;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        FrameLayout frameLayout = (FrameLayout) view;
        h viewModelOwnerProvider = refs.getViewModelOwnerProvider();
        final OrderParamsGroupsV2ViewMapper orderParamsGroupsV2ViewMapper = this.this$0;
        w0 a11 = new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.cml.delivery.widgets.order.v2.presentation.OrderParamsGroupsV2ViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                OrderWidgetV2Component orderWidgetV2Component3;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                orderWidgetV2Component3 = OrderParamsGroupsV2ViewMapper.this.component;
                OrderWidgetV2ViewModel orderWidgetV2ViewModel = orderWidgetV2Component3.getOrderWidgetV2ViewModelProvider().get();
                Intrinsics.g(orderWidgetV2ViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return orderWidgetV2ViewModel;
            }
        }).a(OrderWidgetV2ViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a11, "viewModel(...)");
        OrderWidgetV2ViewModel orderWidgetV2ViewModel = (OrderWidgetV2ViewModel) a11;
        orderWidgetV2Component = this.this$0.component;
        d actionHandlersStoreFactory = orderWidgetV2Component.getActionHandlersStoreFactory();
        orderWidgetV2Component2 = this.this$0.component;
        return new OrderParamsGroupsV2ViewHolder(orderWidgetV2Component2.getTokenizedAnalytics(), orderWidgetV2ViewModel, refs, frameLayout, actionHandlersStoreFactory);
    }
}
