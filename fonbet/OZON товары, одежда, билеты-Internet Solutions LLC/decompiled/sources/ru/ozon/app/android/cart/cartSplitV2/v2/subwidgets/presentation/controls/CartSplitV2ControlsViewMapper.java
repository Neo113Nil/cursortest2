package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls;

import Pc.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import h20.InterfaceC6786a;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.cartSplitV2.v2.data.CartSplitV2ControlsDTOV2;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.view.CartSplitControlsView;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.view.SwipeableWrapperViewV2;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewHolderKt;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0018j\b\u0012\u0004\u0012\u00020\u0002`\u00192\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR<\u0010 \u001a$\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001d\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u001ej\b\u0012\u0004\u0012\u00020\u0004`\u001f0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010)\u001a\u000e\u0012\n\b\u0001\u0012\u00060%j\u0002`&0$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R,\u0010-\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020*\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040+0\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010#¨\u0006."}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/controls/CartSplitV2ControlsViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/controls/CartSplitV2ControlsWidgetComponent;", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2ControlsDTOV2;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/controls/CartSplitV2ControlsVO;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "oldItem", "newItem", "getPayload", "(Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/controls/CartSplitV2ControlsVO;Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/controls/CartSplitV2ControlsVO;)Ljava/lang/Object;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "LPc/a;", "Lh20/a;", "Lru/ozon/app/android/composer/viewmodel/ComposerWidgetViewModel;", "getViewModelWidgetProvider", "()LPc/a;", "viewModelWidgetProvider", "Ll20/d;", "", "getMapper", "mapper", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartSplitV2ControlsViewMapper extends WidgetViewMapper2<CartSplitV2ControlsWidgetComponent, CartSplitV2ControlsDTOV2, CartSplitV2ControlsVO> {

    @NotNull
    private final Function2<View, ComposerReferences, k<CartSplitV2ControlsVO>> holderProducer = new CartSplitV2ControlsViewMapper$holderProducer$1(this);

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof CartSplitV2ControlsDTOV2;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CartSplitControlsView cartSplitControlsView = new CartSplitControlsView(context, null, 0, 6, null);
        cartSplitControlsView.getFavBtn().setSelectApp(component().getAppType() == AppType.SELECT);
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        SwipeableWrapperViewV2 swipeableWrapperViewV2 = new SwipeableWrapperViewV2(context2, null, 0, 6, null);
        swipeableWrapperViewV2.setContent(cartSplitControlsView);
        return swipeableWrapperViewV2;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<CartSplitV2ControlsVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<CartSplitV2ControlsDTOV2, d, List<CartSplitV2ControlsVO>> getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public a<? extends InterfaceC6786a> getViewModelWidgetProvider() {
        return component().getViewModelProvider();
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<CartSplitV2ControlsWidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return CartSplitV2ControlsWidgetComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Object getPayload(@NotNull CartSplitV2ControlsVO oldItem, @NotNull CartSplitV2ControlsVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        WidgetViewHolderKt.getEMPTY_PAYLOAD();
        return Unit.f71690a;
    }
}
