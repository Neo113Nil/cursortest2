package ru.ozon.app.android.account.orders.orderlist.v2;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.account.orders.orderlist.v2.presentation.viewHolder.OrderViewHolder;
import ru.ozon.app.android.account.orders.orderlist.v2.presentation.viewHolder.adapter.OrderListItemDecoration;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.cs_orders.databinding.ItemOrderListAtomBinding;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewHolder/OrderViewHolder;", "view", "Landroid/view/View;", "ref", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class OrderListViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, OrderViewHolder> {
    final /* synthetic */ OrderListViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderListViewMapper$holderProducer$1(OrderListViewMapper orderListViewMapper) {
        super(2);
        this.this$0 = orderListViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final OrderViewHolder invoke(View view, ComposerReferences ref) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(ref, "ref");
        ItemOrderListAtomBinding bind = ItemOrderListAtomBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        OrderListItemDecoration orderListItemDecoration = new OrderListItemDecoration(context);
        B0 a11 = ref.getViewModelOwnerProvider().a();
        final OrderListViewMapper orderListViewMapper = this.this$0;
        return new OrderViewHolder(bind, orderListItemDecoration, ref, (CreateAndPayViewModel) new z0(a11, new z0.c() { // from class: ru.ozon.app.android.account.orders.orderlist.v2.OrderListViewMapper$holderProducer$1$invoke$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                CreateAndPayViewModel viewModel = OrderListViewMapper.this.component().getViewModel();
                Intrinsics.g(viewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return viewModel;
            }
        }).a(CreateAndPayViewModel.class), this.this$0.component().getCustomActionHandlersStoreFactory().create(this.this$0.component().getButtonWidgetCustomActionHandlers().getActionHandlers()), this.this$0.component().getStartupArgsService());
    }
}
