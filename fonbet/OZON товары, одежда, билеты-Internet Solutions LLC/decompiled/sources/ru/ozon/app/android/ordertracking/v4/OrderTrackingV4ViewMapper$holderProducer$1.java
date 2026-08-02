package ru.ozon.app.android.ordertracking.v4;

import a00.h;
import android.view.View;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.account.adult.presenter.AdultListDelegate;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.cscore.orderTracking.viewmodels.OrderTrackingV4ViewModel;
import ru.ozon.app.android.ordertracking.databinding.WidgetOrderTrackingV4Binding;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/ordertracking/v4/OrderTrackingV4ViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class OrderTrackingV4ViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, OrderTrackingV4ViewHolder> {
    final /* synthetic */ OrderTrackingV4ViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderTrackingV4ViewMapper$holderProducer$1(OrderTrackingV4ViewMapper orderTrackingV4ViewMapper) {
        super(2);
        this.this$0 = orderTrackingV4ViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final OrderTrackingV4ViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        WidgetOrderTrackingV4Binding bind = WidgetOrderTrackingV4Binding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        AdultListDelegate adultListDelegate = this.this$0.component().getAdultListDelegateProvider().get();
        h viewModelOwnerProvider = refs.getViewModelOwnerProvider();
        final OrderTrackingV4ViewMapper orderTrackingV4ViewMapper = this.this$0;
        OrderTrackingV4ViewModel orderTrackingV4ViewModel = (OrderTrackingV4ViewModel) new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.ordertracking.v4.OrderTrackingV4ViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                OrderTrackingV4ViewModel viewModel = OrderTrackingV4ViewMapper.this.component().getViewModel();
                Intrinsics.g(viewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return viewModel;
            }
        }).a(OrderTrackingV4ViewModel.class);
        B0 a11 = refs.getViewModelOwnerProvider().a();
        final OrderTrackingV4ViewMapper orderTrackingV4ViewMapper2 = this.this$0;
        return new OrderTrackingV4ViewHolder(bind, adultListDelegate, refs, orderTrackingV4ViewModel, (CreateAndPayViewModel) new z0(a11, new z0.c() { // from class: ru.ozon.app.android.ordertracking.v4.OrderTrackingV4ViewMapper$holderProducer$1$invoke$$inlined$viewModel$2
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                CreateAndPayViewModel createAndPayViewModel = OrderTrackingV4ViewMapper.this.component().getCreateAndPayViewModel();
                Intrinsics.g(createAndPayViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return createAndPayViewModel;
            }
        }).a(CreateAndPayViewModel.class), this.this$0.component().getCustomActionHandlersStoreFactory(), this.this$0.component().getAppType(), this.this$0.component().getTokenizedAnalytics(), this.this$0.component().getStartupArgsService());
    }
}
