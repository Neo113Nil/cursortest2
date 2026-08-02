package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories;

import Vg.d;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import jk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.BaseMultiFrameBindingViewHolder;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories.vm.AccessoriesViewModelV2;
import ru.ozon.app.android.cart.common.presentation.addToCart.AddToCartViewModel;
import ru.ozon.app.android.cart.feature.databinding.WidgetCartSplitV2ItemAccessoriesBinding;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.multiframebinder.BindStep;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.product.tiles.skuGrid2.BackgroundDrawBySkuGrid2DecoratorDisabled;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B;\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00130\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R \u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/accessories/CartSplitV2AccessoriesWidgetViewHolder;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/BaseMultiFrameBindingViewHolder;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/accessories/CartSplitV2AccessoriesVO;", "Lru/ozon/app/android/product/tiles/skuGrid2/BackgroundDrawBySkuGrid2DecoratorDisabled;", "Lru/ozon/app/android/cart/feature/databinding/WidgetCartSplitV2ItemAccessoriesBinding;", "binding", "Lru/ozon/app/android/cart/common/presentation/addToCart/AddToCartViewModel;", "addToCartViewModel", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/accessories/vm/AccessoriesViewModelV2;", "accessoriesViewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinder", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Lru/ozon/app/android/cart/feature/databinding/WidgetCartSplitV2ItemAccessoriesBinding;Lru/ozon/app/android/cart/common/presentation/addToCart/AddToCartViewModel;Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/accessories/vm/AccessoriesViewModelV2;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;LVg/d;)V", "", "bindAccessories", "()V", "Ljk0/q;", "info", "onVisibleAreaChanged", "(Ljk0/q;)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/accessories/CartSplitV2AccessoriesViewRender;", "accessories", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/accessories/CartSplitV2AccessoriesViewRender;", "", "Lru/ozon/app/android/composer/view/multiframebinder/BindStep;", "steps", "Ljava/util/List;", "getSteps", "()Ljava/util/List;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CartSplitV2AccessoriesWidgetViewHolder extends BaseMultiFrameBindingViewHolder<CartSplitV2AccessoriesVO> implements BackgroundDrawBySkuGrid2DecoratorDisabled {

    @NotNull
    private final CartSplitV2AccessoriesViewRender accessories;

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final List<BindStep> steps;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CartSplitV2AccessoriesWidgetViewHolder(@NotNull WidgetCartSplitV2ItemAccessoriesBinding binding, @NotNull AddToCartViewModel addToCartViewModel, @NotNull AccessoriesViewModelV2 accessoriesViewModel, @NotNull ComposerReferences composerReferences, @NotNull FrameBinder frameBinder, @NotNull d customActionHandlersStoreFactory) {
        super(r0, composerReferences, frameBinder);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(addToCartViewModel, "addToCartViewModel");
        Intrinsics.checkNotNullParameter(accessoriesViewModel, "accessoriesViewModel");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(frameBinder, "frameBinder");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(composerReferences, this).customActionHandlers(new CartSplitV2AccessoriesWidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        this.actionHandler = buildHandler;
        this.accessories = new CartSplitV2AccessoriesViewRender(composerReferences, binding, this, buildHandler, addToCartViewModel, accessoriesViewModel, this);
        this.steps = C7714v.a0(new WR.d(this, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void bindAccessories() {
        CartSplitV2AccessoriesVO cartSplitV2AccessoriesVO = (CartSplitV2AccessoriesVO) getBoundData();
        if (cartSplitV2AccessoriesVO == null) {
            return;
        }
        this.accessories.bind(cartSplitV2AccessoriesVO);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit steps$lambda$0(CartSplitV2AccessoriesWidgetViewHolder cartSplitV2AccessoriesWidgetViewHolder) {
        cartSplitV2AccessoriesWidgetViewHolder.bindAccessories();
        return Unit.f71690a;
    }

    @Override // ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.BaseMultiFrameBindingViewHolder
    @NotNull
    public List<BindStep> getSteps() {
        return this.steps;
    }

    @Override // jk0.j, jk0.n
    public void onVisibleAreaChanged(@NotNull q info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onVisibleAreaChanged(info);
        this.accessories.onVisibleAreaChanged(info);
    }
}
