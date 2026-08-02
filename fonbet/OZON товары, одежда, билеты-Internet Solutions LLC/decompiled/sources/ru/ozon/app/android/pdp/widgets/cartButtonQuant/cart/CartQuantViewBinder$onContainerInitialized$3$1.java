package ru.ozon.app.android.pdp.widgets.cartButtonQuant.cart;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l10.i;
import l10.t;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartButtonQuantActionHandlerFactory;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartButtonQuantNotificationHandler;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartQuantViewModel;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.cart.CartQuantVO;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.doubleCart.DoubleCartQuantVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "deeplink", "", "additionalBehavior", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class CartQuantViewBinder$onContainerInitialized$3$1 extends AbstractC7737t implements Function2<String, AtomAction, Unit> {
    final /* synthetic */ i $container;
    final /* synthetic */ CartButtonQuantQuantOverlayViewHolder $overlayWidgetViewHolder;
    final /* synthetic */ CartQuantViewModel $viewModel;
    final /* synthetic */ Function0<CartQuantVO> $voProvider;
    final /* synthetic */ CartQuantViewBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartQuantViewBinder$onContainerInitialized$3$1(i iVar, CartQuantViewBinder cartQuantViewBinder, CartQuantViewModel cartQuantViewModel, Function0<CartQuantVO> function0, CartButtonQuantQuantOverlayViewHolder cartButtonQuantQuantOverlayViewHolder) {
        super(2);
        this.$container = iVar;
        this.this$0 = cartQuantViewBinder;
        this.$viewModel = cartQuantViewModel;
        this.$voProvider = function0;
        this.$overlayWidgetViewHolder = cartButtonQuantQuantOverlayViewHolder;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, AtomAction atomAction) {
        invoke2(str, atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str, AtomAction atomAction) {
        CartButtonQuantNotificationHandler cartButtonQuantNotificationHandler;
        CartButtonQuantActionHandlerFactory cartButtonQuantActionHandlerFactory;
        ComposerViewExtensionKt.composerRecyclerView(this.$container.Y()).stopScroll();
        this.this$0.deeplinkRecommendation = str;
        CartQuantViewModel.addToCart$default(this.$viewModel, this.$voProvider.invoke(), atomAction, (DoubleCartQuantVO.CartMode) null, 4, (Object) null);
        CartQuantVO.NotificationBar notificationBar = this.$voProvider.invoke().getNotificationBar();
        if (notificationBar != null) {
            CartQuantViewBinder cartQuantViewBinder = this.this$0;
            i iVar = this.$container;
            CartButtonQuantQuantOverlayViewHolder cartButtonQuantQuantOverlayViewHolder = this.$overlayWidgetViewHolder;
            cartButtonQuantNotificationHandler = cartQuantViewBinder.notificationHandler;
            t K11 = iVar.K();
            cartButtonQuantActionHandlerFactory = cartQuantViewBinder.actionHandlerFactory;
            cartButtonQuantNotificationHandler.show(notificationBar, CartButtonQuantActionHandlerFactory.builder$default(cartButtonQuantActionHandlerFactory, iVar, null, null, new CartQuantViewBinder$onContainerInitialized$3$1$1$1(cartButtonQuantQuantOverlayViewHolder), 6, null).buildHandler(), K11);
        }
    }
}
