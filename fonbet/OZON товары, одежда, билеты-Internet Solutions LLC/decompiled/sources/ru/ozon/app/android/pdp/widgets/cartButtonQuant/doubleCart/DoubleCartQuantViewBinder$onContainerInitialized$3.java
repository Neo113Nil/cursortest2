package ru.ozon.app.android.pdp.widgets.cartButtonQuant.doubleCart;

import Sc.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l10.i;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartQuantViewModel;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.ProductCountUpdateKey;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.ProductUpdateKey;
import ru.ozon.app.android.utils.WhenExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartQuantViewModel$Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartQuantViewModel$Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class DoubleCartQuantViewBinder$onContainerInitialized$3 extends AbstractC7737t implements Function1<CartQuantViewModel.Action, Unit> {
    final /* synthetic */ i $container;
    final /* synthetic */ Function1<Boolean, Unit> $onShowLoader;
    final /* synthetic */ DoubleCartQuantView $view;
    final /* synthetic */ Function0<DoubleCartQuantVO> $voProvider;
    final /* synthetic */ DoubleCartQuantViewBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DoubleCartQuantViewBinder$onContainerInitialized$3(i iVar, Function0<DoubleCartQuantVO> function0, DoubleCartQuantView doubleCartQuantView, Function1<? super Boolean, Unit> function1, DoubleCartQuantViewBinder doubleCartQuantViewBinder) {
        super(1);
        this.$container = iVar;
        this.$voProvider = function0;
        this.$view = doubleCartQuantView;
        this.$onShowLoader = function1;
        this.this$0 = doubleCartQuantViewBinder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CartQuantViewModel.Action action) {
        invoke2(action);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CartQuantViewModel.Action action) {
        Unit unit;
        Function1<AtomAction, Unit> buildHandler;
        if (action instanceof CartQuantViewModel.Action.ProductCount) {
            CartQuantViewModel.Action.ProductCount productCount = (CartQuantViewModel.Action.ProductCount) action;
            this.$container.M().update(productCount.getIsUpdateAction() ? ProductUpdateKey.INSTANCE : new ProductCountUpdateKey(productCount.getProductId(), productCount.getQuantity(), productCount.getSelectedDeliverySchema(), productCount.getCartMode()));
            unit = Unit.f71690a;
        } else if (action instanceof CartQuantViewModel.Action.ExpressSheet) {
            DoubleCartQuantVO invoke = this.$voProvider.invoke();
            if (invoke != null) {
                this.this$0.showExpressSheet(invoke, ((CartQuantViewModel.Action.ExpressSheet) action).getSelectedDeliverySchema());
                unit = Unit.f71690a;
            }
            unit = null;
        } else if (action instanceof CartQuantViewModel.Action.DoAction) {
            ActionHandler.Builder actionHandlerBuilder = this.$view.getActionHandlerBuilder();
            if (actionHandlerBuilder != null && (buildHandler = actionHandlerBuilder.buildHandler()) != null) {
                buildHandler.invoke(((CartQuantViewModel.Action.DoAction) action).getAtomAction());
                unit = Unit.f71690a;
            }
            unit = null;
        } else {
            if (!(action instanceof CartQuantViewModel.Action.ShowLoader)) {
                throw new o();
            }
            Function1<Boolean, Unit> function1 = this.$onShowLoader;
            if (function1 != null) {
                function1.invoke(Boolean.valueOf(((CartQuantViewModel.Action.ShowLoader) action).getIsShowing()));
                unit = Unit.f71690a;
            }
            unit = null;
        }
        WhenExtKt.getExhaustive(unit);
    }
}
