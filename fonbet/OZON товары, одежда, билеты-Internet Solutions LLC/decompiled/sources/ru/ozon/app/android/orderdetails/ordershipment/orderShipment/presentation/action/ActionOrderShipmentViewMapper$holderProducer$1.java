package ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.action;

import Vg.d;
import Vg.f;
import a00.h;
import android.view.View;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.orderdetails.databinding.ItemOrderShipmentLayoutActionBinding;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/action/ActionOrderShipmentWidgetViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ActionOrderShipmentViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, ActionOrderShipmentWidgetViewHolder> {
    final /* synthetic */ ActionOrderShipmentViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActionOrderShipmentViewMapper$holderProducer$1(ActionOrderShipmentViewMapper actionOrderShipmentViewMapper) {
        super(2);
        this.this$0 = actionOrderShipmentViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final ActionOrderShipmentWidgetViewHolder invoke(View view, ComposerReferences refs) {
        Set<? extends Class<? extends f>> supportedHandlers;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        ItemOrderShipmentLayoutActionBinding bind = ItemOrderShipmentLayoutActionBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        h viewModelOwnerProvider = refs.getViewModelOwnerProvider();
        final ActionOrderShipmentViewMapper actionOrderShipmentViewMapper = this.this$0;
        OrderShipmentViewModel orderShipmentViewModel = (OrderShipmentViewModel) new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.action.ActionOrderShipmentViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                OrderShipmentViewModel orderShipmentViewModel2 = ActionOrderShipmentViewMapper.this.component().getOrderShipmentViewModel();
                Intrinsics.g(orderShipmentViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return orderShipmentViewModel2;
            }
        }).a(OrderShipmentViewModel.class);
        d customActionHandlersStoreFactory = this.this$0.component().getCustomActionHandlersStoreFactory();
        supportedHandlers = this.this$0.getSupportedHandlers();
        return new ActionOrderShipmentWidgetViewHolder(bind, refs, orderShipmentViewModel, customActionHandlersStoreFactory.create(supportedHandlers));
    }
}
