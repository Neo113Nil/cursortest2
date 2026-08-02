package ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.core;

import AM.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import c20.r;
import d20.AbstractC6065b;
import d20.InterfaceC6068e;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.core.OrderDoneButtonBarStickyWidgetViewMapper;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.data.OrderDoneButtonBarDTO;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.di.OrderDoneButtonBarWidgetComponent;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.presentation.OrderDoneButtonBarStickyWidgetViewHolder;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.presentation.OrderDoneButtonBarVO;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.presentation.OrderDoneButtonBarViewModel;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.presentation.OrderDoneButtonBarViewModelImpl;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.orderdone.databinding.WidgetOrderDoneButtonBarBinding;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00192\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/core/OrderDoneButtonBarStickyWidgetViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/di/OrderDoneButtonBarWidgetComponent;", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/data/OrderDoneButtonBarDTO;", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarVO;", "<init>", "()V", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/data/OrderDoneButtonBarDTO;Ll20/d;)Ljava/util/List;", "", "", "canMap", "(Ljava/lang/Object;)Z", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrderDoneButtonBarStickyWidgetViewMapper extends OverlayWidgetScreenViewItemMapper2<OrderDoneButtonBarWidgetComponent, OrderDoneButtonBarDTO, OrderDoneButtonBarVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$2(WidgetOrderDoneButtonBarBinding widgetOrderDoneButtonBarBinding, LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ConstraintLayout constraintLayout = widgetOrderDoneButtonBarBinding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderDoneButtonBarWidgetComponent widgetComponent$lambda$3(C7475g c7475g) {
        return OrderDoneButtonBarWidgetComponent.INSTANCE.create(c7475g);
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return !((state instanceof OrderDoneButtonBarDTO ? (OrderDoneButtonBarDTO) state : null) != null ? Intrinsics.d(r2.isNotSticky(), Boolean.TRUE) : false);
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<OrderDoneButtonBarVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        final WidgetOrderDoneButtonBarBinding inflate = WidgetOrderDoneButtonBarBinding.inflate(LayoutInflater.from(container.L()), container.Z(), false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new OrderDoneButtonBarStickyWidgetViewHolder(inflate, (OrderDoneButtonBarViewModel) new z0(container.a0().a(), new z0.c() { // from class: ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.core.OrderDoneButtonBarStickyWidgetViewMapper$createHolder$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                OrderDoneButtonBarViewModelImpl viewModel = OrderDoneButtonBarStickyWidgetViewMapper.this.component().getViewModel();
                Intrinsics.g(viewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return viewModel;
            }
        }).a(OrderDoneButtonBarViewModelImpl.class), (CreateAndPayViewModel) new z0(container.a0().a(), new z0.c() { // from class: ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.core.OrderDoneButtonBarStickyWidgetViewMapper$createHolder$$inlined$createViewModel$2
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                CreateAndPayViewModel createAndPayViewModel = OrderDoneButtonBarStickyWidgetViewMapper.this.component().getCreateAndPayViewModel();
                Intrinsics.g(createAndPayViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return createAndPayViewModel;
            }
        }).a(CreateAndPayViewModel.class), component().getApplicationInfoDataSource(), component().getNavigator(), container, new InterfaceC6068e() { // from class: vp.a
            @Override // d20.InterfaceC6068e
            public final View create(ViewGroup viewGroup) {
                View createHolder$lambda$2;
                createHolder$lambda$2 = OrderDoneButtonBarStickyWidgetViewMapper.createHolder$lambda$2(WidgetOrderDoneButtonBarBinding.this, (LinearLayout) viewGroup);
                return createHolder$lambda$2;
            }
        });
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<OrderDoneButtonBarWidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(OrderDoneButtonBarWidgetComponent.class), new a(storage, 16));
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<OrderDoneButtonBarVO> map(@NotNull OrderDoneButtonBarDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return component().getMapper().invoke(state, info);
    }
}
