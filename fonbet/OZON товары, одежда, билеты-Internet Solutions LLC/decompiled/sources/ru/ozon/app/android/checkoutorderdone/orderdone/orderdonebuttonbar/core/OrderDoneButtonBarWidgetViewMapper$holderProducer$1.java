package ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.core;

import a00.h;
import android.view.View;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.presentation.OrderDoneButtonBarViewModel;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.presentation.OrderDoneButtonBarViewModelImpl;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.presentation.OrderDoneButtonBarWidgetViewHolder;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.orderdone.databinding.WidgetOrderDoneButtonBarBinding;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarWidgetViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class OrderDoneButtonBarWidgetViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, OrderDoneButtonBarWidgetViewHolder> {
    final /* synthetic */ OrderDoneButtonBarWidgetViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderDoneButtonBarWidgetViewMapper$holderProducer$1(OrderDoneButtonBarWidgetViewMapper orderDoneButtonBarWidgetViewMapper) {
        super(2);
        this.this$0 = orderDoneButtonBarWidgetViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final OrderDoneButtonBarWidgetViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        WidgetOrderDoneButtonBarBinding bind = WidgetOrderDoneButtonBarBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        h viewModelOwnerProvider = refs.getViewModelOwnerProvider();
        final OrderDoneButtonBarWidgetViewMapper orderDoneButtonBarWidgetViewMapper = this.this$0;
        OrderDoneButtonBarViewModel orderDoneButtonBarViewModel = (OrderDoneButtonBarViewModel) new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.core.OrderDoneButtonBarWidgetViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                OrderDoneButtonBarViewModelImpl viewModel = OrderDoneButtonBarWidgetViewMapper.this.component().getViewModel();
                Intrinsics.g(viewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return viewModel;
            }
        }).a(OrderDoneButtonBarViewModelImpl.class);
        h viewModelOwnerProvider2 = refs.getViewModelOwnerProvider();
        final OrderDoneButtonBarWidgetViewMapper orderDoneButtonBarWidgetViewMapper2 = this.this$0;
        return new OrderDoneButtonBarWidgetViewHolder(bind, refs, orderDoneButtonBarViewModel, (CreateAndPayViewModel) new z0(viewModelOwnerProvider2.a(), new z0.c() { // from class: ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.core.OrderDoneButtonBarWidgetViewMapper$holderProducer$1$invoke$$inlined$viewModel$2
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                CreateAndPayViewModel createAndPayViewModel = OrderDoneButtonBarWidgetViewMapper.this.component().getCreateAndPayViewModel();
                Intrinsics.g(createAndPayViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return createAndPayViewModel;
            }
        }).a(CreateAndPayViewModel.class), this.this$0.component().getApplicationInfoDataSource());
    }
}
