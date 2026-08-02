package ru.ozon.app.android.pdp.widgets.cartButtonV4.cart;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l10.i;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.CartView;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.CartViewModel;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.ProductCountUpdateKey;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.ProductUpdateKey;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartViewModel$Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartViewModel$Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class CartViewBinder$onContainerInitialized$1 extends AbstractC7737t implements Function1<CartViewModel.Action, Unit> {
    final /* synthetic */ CartView $cartView;
    final /* synthetic */ i $container;
    final /* synthetic */ Function1<Boolean, Unit> $onShowLoader;
    final /* synthetic */ CartViewBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CartViewBinder$onContainerInitialized$1(i iVar, CartView cartView, Function1<? super Boolean, Unit> function1, CartViewBinder cartViewBinder) {
        super(1);
        this.$container = iVar;
        this.$cartView = cartView;
        this.$onShowLoader = function1;
        this.this$0 = cartViewBinder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CartViewModel.Action action) {
        invoke2(action);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CartViewModel.Action action) {
        Function1<Boolean, Unit> onShowRelatedProductsBottomSheet;
        Function1<AtomAction, Unit> buildHandler;
        if (action instanceof CartViewModel.Action.ProductCount) {
            CartViewModel.Action.ProductCount productCount = (CartViewModel.Action.ProductCount) action;
            this.$container.M().update(productCount.getIsUpdateAction() ? ProductUpdateKey.INSTANCE : new ProductCountUpdateKey(productCount.getProductId(), productCount.getQuantity(), null, null, 12, null));
            return;
        }
        if (action instanceof CartViewModel.Action.DoAction) {
            ActionHandler.Builder actionHandlerBuilder = this.$cartView.getActionHandlerBuilder();
            if (actionHandlerBuilder == null || (buildHandler = actionHandlerBuilder.buildHandler()) == null) {
                return;
            }
            buildHandler.invoke(((CartViewModel.Action.DoAction) action).getAtomAction());
            return;
        }
        if (action instanceof CartViewModel.Action.ShowLoader) {
            Function1<Boolean, Unit> function1 = this.$onShowLoader;
            if (function1 != null) {
                function1.invoke(Boolean.valueOf(((CartViewModel.Action.ShowLoader) action).getIsShowing()));
                return;
            }
            return;
        }
        if (!(action instanceof CartViewModel.Action.ShowRelatedProductsBottomSheet) || (onShowRelatedProductsBottomSheet = this.this$0.getOnShowRelatedProductsBottomSheet()) == null) {
            return;
        }
        onShowRelatedProductsBottomSheet.invoke(Boolean.valueOf(((CartViewModel.Action.ShowRelatedProductsBottomSheet) action).getIsInCart()));
    }
}
