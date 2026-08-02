package ru.ozon.app.android.account.orders.selectPayment.presentation;

import android.view.View;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.cs_orders.databinding.WidgetSelectPaymentLayoutBinding;
import ru.ozon.app.android.delivery.customActionsHandlers.addcard.SelectPaymentViewModel;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/account/orders/selectPayment/presentation/SelectPaymentWidgetViewHolder;", "view", "Landroid/view/View;", "ref", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SelectPaymentViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, SelectPaymentWidgetViewHolder> {
    final /* synthetic */ SelectPaymentViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectPaymentViewMapper$holderProducer$1(SelectPaymentViewMapper selectPaymentViewMapper) {
        super(2);
        this.this$0 = selectPaymentViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final SelectPaymentWidgetViewHolder invoke(View view, ComposerReferences ref) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(ref, "ref");
        WidgetSelectPaymentLayoutBinding bind = WidgetSelectPaymentLayoutBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        B0 a11 = ref.getViewModelOwnerProvider().a();
        final SelectPaymentViewMapper selectPaymentViewMapper = this.this$0;
        return new SelectPaymentWidgetViewHolder(bind, ref, (SelectPaymentViewModel) new z0(a11, new z0.c() { // from class: ru.ozon.app.android.account.orders.selectPayment.presentation.SelectPaymentViewMapper$holderProducer$1$invoke$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                SelectPaymentViewModel selectPaymentViewModel = SelectPaymentViewMapper.this.component().getSelectPaymentViewModel();
                Intrinsics.g(selectPaymentViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return selectPaymentViewModel;
            }
        }).a(SelectPaymentViewModel.class));
    }
}
