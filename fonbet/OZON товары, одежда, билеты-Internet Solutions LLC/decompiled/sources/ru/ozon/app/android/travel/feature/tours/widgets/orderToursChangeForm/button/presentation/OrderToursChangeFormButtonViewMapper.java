package ru.ozon.app.android.travel.feature.tours.widgets.orderToursChangeForm.button.presentation;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import c20.r;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import lx.C7972a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.travel.feature.tours.widgets.orderToursChangeForm.button.data.OrderToursChangeFormButtonMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.orderToursChangeForm.data.OrderToursChangeFormDTO;
import ru.ozon.app.android.travel.feature.tours.widgets.orderToursChangeForm.di.OrderToursChangeFormComponent;
import ru.ozon.app.android.travel.feature.tours.widgets.orderToursChangeForm.presentation.OrderToursChangeFormViewModel;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/orderToursChangeForm/button/presentation/OrderToursChangeFormButtonViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/travel/feature/tours/widgets/orderToursChangeForm/di/OrderToursChangeFormComponent;", "Lru/ozon/app/android/travel/feature/tours/widgets/orderToursChangeForm/data/OrderToursChangeFormDTO;", "Lru/ozon/app/android/travel/feature/tours/widgets/orderToursChangeForm/button/presentation/OrderToursChangeFormButtonVO;", "<init>", "()V", "Ll10/i;", "container", "Lru/ozon/app/android/travel/feature/tours/widgets/orderToursChangeForm/button/presentation/OrderToursChangeFormButtonViewHolder;", "createHolder", "(Ll10/i;)Lru/ozon/app/android/travel/feature/tours/widgets/orderToursChangeForm/button/presentation/OrderToursChangeFormButtonViewHolder;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/tours/widgets/orderToursChangeForm/data/OrderToursChangeFormDTO;Ll20/d;)Ljava/util/List;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lru/ozon/app/android/travel/feature/tours/widgets/orderToursChangeForm/button/data/OrderToursChangeFormButtonMapper;", "getMapper", "()Lru/ozon/app/android/travel/feature/tours/widgets/orderToursChangeForm/button/data/OrderToursChangeFormButtonMapper;", "mapper", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "viewType", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OrderToursChangeFormButtonViewMapper extends OverlayWidgetScreenViewItemMapper2<OrderToursChangeFormComponent, OrderToursChangeFormDTO, OrderToursChangeFormButtonVO> {
    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$3(LinearLayout parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int px = ResourceExtKt.toPx(16, context);
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int px2 = ResourceExtKt.toPx(20, context2);
        Context context3 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        float pxF = ResourceExtKt.toPxF(24, context3);
        RoundedBackgroundProducer roundedBackgroundProducer = new RoundedBackgroundProducer();
        Context context4 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        parent.setBackground(RoundedBackgroundProducer.produce$default(roundedBackgroundProducer, ThemeExtKt.themeColor(context4, R$attr.layerFloor1), pxF, pxF, 0.0f, 0.0f, 24, null));
        Context context5 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        LargeButtonView largeButtonView = new LargeButtonView(context5, null, 0, 0, 14, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(px, px, px, px2);
        largeButtonView.setLayoutParams(layoutParams);
        return largeButtonView;
    }

    private final OrderToursChangeFormButtonMapper getMapper() {
        return component().getOrderToursChangeFormButtonMapper();
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return r.a.SINGLE;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<OrderToursChangeFormComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return OrderToursChangeFormComponent.INSTANCE.create(storage);
    }

    @Override // c20.r
    @NotNull
    public OrderToursChangeFormButtonViewHolder createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        w0 a11 = new z0(container.b0().a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.tours.widgets.orderToursChangeForm.button.presentation.OrderToursChangeFormButtonViewMapper$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                OrderToursChangeFormViewModel orderToursChangeFormViewModel = OrderToursChangeFormButtonViewMapper.this.component().getOrderToursChangeFormViewModel().get();
                Intrinsics.g(orderToursChangeFormViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return orderToursChangeFormViewModel;
            }
        }).a(OrderToursChangeFormViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a11, "viewModel(...)");
        return new OrderToursChangeFormButtonViewHolder(container, (OrderToursChangeFormViewModel) a11, new C7972a(1));
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<OrderToursChangeFormButtonVO> map(@NotNull OrderToursChangeFormDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return getMapper().invoke(state, info);
    }
}
