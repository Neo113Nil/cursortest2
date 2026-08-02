package ru.ozon.app.android.checkoutorderdone.orderdone.orderdonestatus.v1.core;

import android.view.View;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonestatus.v1.presentation.OrderDonePaymentStatusViewHolder;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonestatus.v1.presentation.OrderDonePaymentStatusViewModel;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.csma.preload.PreferencesPreloadCache;
import ru.ozon.app.android.orderdone.databinding.WidgetOrderDonePaymentStatusBinding;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonestatus/v1/presentation/OrderDonePaymentStatusViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class OrderDonePaymentStatusViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, OrderDonePaymentStatusViewHolder> {
    final /* synthetic */ OrderDonePaymentStatusViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderDonePaymentStatusViewMapper$holderProducer$1(OrderDonePaymentStatusViewMapper orderDonePaymentStatusViewMapper) {
        super(2);
        this.this$0 = orderDonePaymentStatusViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final OrderDonePaymentStatusViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        WidgetOrderDonePaymentStatusBinding bind = WidgetOrderDonePaymentStatusBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        B0 a11 = refs.getViewModelOwnerProvider().a();
        final OrderDonePaymentStatusViewMapper orderDonePaymentStatusViewMapper = this.this$0;
        w0 a12 = new z0(a11, new z0.c() { // from class: ru.ozon.app.android.checkoutorderdone.orderdone.orderdonestatus.v1.core.OrderDonePaymentStatusViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                OrderDonePaymentStatusViewModel orderDonePaymentStatusViewModel = OrderDonePaymentStatusViewMapper.this.component().getViewModelProvider().get();
                Intrinsics.g(orderDonePaymentStatusViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return orderDonePaymentStatusViewModel;
            }
        }).a(OrderDonePaymentStatusViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a12, "viewModel(...)");
        return new OrderDonePaymentStatusViewHolder(bind, (OrderDonePaymentStatusViewModel) a12, refs, new PreferencesPreloadCache(this.this$0.component().getJsonSerializer(), this.this$0.component().getJsonDeserializer(), this.this$0.component().getContext()));
    }
}
