package ru.ozon.app.android.checkoutorderdone.orderdone.disclaimer.core;

import Pc.a;
import android.view.View;
import h20.InterfaceC6786a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutorderdone.orderdone.disclaimer.core.OrderDoneDisclaimerWidgetViewMapper;
import ru.ozon.app.android.checkoutorderdone.orderdone.disclaimer.data.OrderDoneDisclaimerDTO;
import ru.ozon.app.android.checkoutorderdone.orderdone.disclaimer.di.OrderDoneDisclaimerWidgetComponentV2;
import ru.ozon.app.android.checkoutorderdone.orderdone.disclaimer.presentation.DisclaimerWidgetViewHolder;
import ru.ozon.app.android.checkoutorderdone.orderdone.disclaimer.presentation.OrderDoneDisclaimerVO;
import ru.ozon.app.android.checkoutorderdone.orderdone.disclaimer.presentation.OrderDoneDisclaimerViewModel;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.orderdone.R$layout;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00020\nj\b\u0012\u0004\u0012\u00020\u0002`\u000b2\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R,\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010#\u001a\n\u0012\u0006\b\u0001\u0012\u00020 0\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/core/OrderDoneDisclaimerWidgetViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/di/OrderDoneDisclaimerWidgetComponentV2;", "Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/data/OrderDoneDisclaimerDTO;", "Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/presentation/OrderDoneDisclaimerVO;", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/presentation/DisclaimerWidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/core/OrderDoneDisclaimerWidgetMapper;", "getMapper", "()Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/core/OrderDoneDisclaimerWidgetMapper;", "mapper", "LPc/a;", "Lh20/a;", "getViewModelWidgetProvider", "()LPc/a;", "viewModelWidgetProvider", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrderDoneDisclaimerWidgetViewMapper extends WidgetViewMapper2<OrderDoneDisclaimerWidgetComponentV2, OrderDoneDisclaimerDTO, OrderDoneDisclaimerVO> {
    private final int layout = R$layout.widget_order_done_disclaimer;

    @NotNull
    private final Function2<View, ComposerReferences, DisclaimerWidgetViewHolder> holderProducer = new OrderDoneDisclaimerWidgetViewMapper$holderProducer$1(this);

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderDoneDisclaimerViewModel _get_viewModelWidgetProvider_$lambda$0(OrderDoneDisclaimerWidgetViewMapper orderDoneDisclaimerWidgetViewMapper) {
        return orderDoneDisclaimerWidgetViewMapper.component().getViewModel();
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, DisclaimerWidgetViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public a<? extends InterfaceC6786a> getViewModelWidgetProvider() {
        return new a() { // from class: qp.a
            @Override // Pc.a
            public final Object get() {
                OrderDoneDisclaimerViewModel _get_viewModelWidgetProvider_$lambda$0;
                _get_viewModelWidgetProvider_$lambda$0 = OrderDoneDisclaimerWidgetViewMapper._get_viewModelWidgetProvider_$lambda$0(OrderDoneDisclaimerWidgetViewMapper.this);
                return _get_viewModelWidgetProvider_$lambda$0;
            }
        };
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<OrderDoneDisclaimerWidgetComponentV2> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return OrderDoneDisclaimerWidgetComponentV2.INSTANCE.create(storage);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public OrderDoneDisclaimerWidgetMapper getMapper() {
        return component().getMapper();
    }
}
