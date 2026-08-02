package ru.ozon.app.android.pdp.widgets.cartButtonV4.cart;

import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l10.i;
import l10.t;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.CartButtonActionHandlerFactory;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.CartButtonNotificationHandler;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.CartViewModel;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.cart.CartVO;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleCartVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "deeplink", "", "additionalBehavior", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class CartViewBinder$onContainerInitialized$3$1 extends AbstractC7737t implements Function2<String, AtomAction, Unit> {
    final /* synthetic */ i $container;
    final /* synthetic */ AbstractC6065b<?> $overlayWidgetViewHolder;
    final /* synthetic */ CartViewModel $viewModel;
    final /* synthetic */ Function0<CartVO> $voProvider;
    final /* synthetic */ CartViewBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartViewBinder$onContainerInitialized$3$1(i iVar, CartViewBinder cartViewBinder, CartViewModel cartViewModel, Function0<CartVO> function0, AbstractC6065b<?> abstractC6065b) {
        super(2);
        this.$container = iVar;
        this.this$0 = cartViewBinder;
        this.$viewModel = cartViewModel;
        this.$voProvider = function0;
        this.$overlayWidgetViewHolder = abstractC6065b;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, AtomAction atomAction) {
        invoke2(str, atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str, AtomAction atomAction) {
        CartButtonNotificationHandler cartButtonNotificationHandler;
        CartButtonActionHandlerFactory cartButtonActionHandlerFactory;
        ComposerViewExtensionKt.composerRecyclerView(this.$container.Y()).stopScroll();
        this.this$0.deeplinkRecommendation = str;
        CartViewModel.addToCart$default(this.$viewModel, this.$voProvider.invoke(), atomAction, (DoubleCartVO.CartMode) null, 4, (Object) null);
        CartVO.NotificationBar notificationBar = this.$voProvider.invoke().getNotificationBar();
        if (notificationBar != null) {
            CartViewBinder cartViewBinder = this.this$0;
            i iVar = this.$container;
            AbstractC6065b<?> abstractC6065b = this.$overlayWidgetViewHolder;
            cartButtonNotificationHandler = cartViewBinder.notificationHandler;
            t K11 = iVar.K();
            cartButtonActionHandlerFactory = cartViewBinder.actionHandlerFactory;
            cartButtonNotificationHandler.show(notificationBar, CartButtonActionHandlerFactory.builder$default(cartButtonActionHandlerFactory, iVar, null, null, new CartViewBinder$onContainerInitialized$3$1$1$1(abstractC6065b), 6, null).buildHandler(), K11);
        }
    }
}
