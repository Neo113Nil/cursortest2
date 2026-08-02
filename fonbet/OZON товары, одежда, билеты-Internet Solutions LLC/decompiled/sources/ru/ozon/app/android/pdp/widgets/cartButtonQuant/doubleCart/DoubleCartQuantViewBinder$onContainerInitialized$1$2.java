package ru.ozon.app.android.pdp.widgets.cartButtonQuant.doubleCart;

import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
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

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "mode", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO$CartMode;", "<unused var>", "", "additionalAction", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class DoubleCartQuantViewBinder$onContainerInitialized$1$2 extends AbstractC7737t implements InterfaceC6511n<DoubleCartQuantVO.CartMode, String, AtomAction, Unit> {
    final /* synthetic */ CartQuantViewModel $cartViewModel;
    final /* synthetic */ i $container;
    final /* synthetic */ DoubleCartQuantViewHolder $overlayWidgetViewHolder;
    final /* synthetic */ Function0<DoubleCartQuantVO> $voProvider;
    final /* synthetic */ DoubleCartQuantViewBinder this$0;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DoubleCartQuantVO.CartMode.values().length];
            try {
                iArr[DoubleCartQuantVO.CartMode.FIRST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DoubleCartQuantVO.CartMode.SECOND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DoubleCartQuantViewBinder$onContainerInitialized$1$2(Function0<DoubleCartQuantVO> function0, i iVar, CartQuantViewModel cartQuantViewModel, DoubleCartQuantViewBinder doubleCartQuantViewBinder, DoubleCartQuantViewHolder doubleCartQuantViewHolder) {
        super(3);
        this.$voProvider = function0;
        this.$container = iVar;
        this.$cartViewModel = cartQuantViewModel;
        this.this$0 = doubleCartQuantViewBinder;
        this.$overlayWidgetViewHolder = doubleCartQuantViewHolder;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(DoubleCartQuantVO.CartMode cartMode, String str, AtomAction atomAction) {
        invoke2(cartMode, str, atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(DoubleCartQuantVO.CartMode cartMode, String str, AtomAction atomAction) {
        CartButtonQuantNotificationHandler cartButtonQuantNotificationHandler;
        CartButtonQuantActionHandlerFactory cartButtonQuantActionHandlerFactory;
        DoubleCartQuantVO invoke = this.$voProvider.invoke();
        if (invoke != null) {
            i iVar = this.$container;
            CartQuantViewModel cartQuantViewModel = this.$cartViewModel;
            DoubleCartQuantViewBinder doubleCartQuantViewBinder = this.this$0;
            DoubleCartQuantViewHolder doubleCartQuantViewHolder = this.$overlayWidgetViewHolder;
            ComposerViewExtensionKt.composerRecyclerView(iVar.Z()).stopScroll();
            int i11 = cartMode == null ? -1 : WhenMappings.$EnumSwitchMapping$0[cartMode.ordinal()];
            if (i11 == 1) {
                cartQuantViewModel.addToCart(invoke.getFirstCartData(), atomAction, cartMode);
            } else if (i11 == 2) {
                cartQuantViewModel.addToCart(invoke.getSecondCartData(), atomAction, cartMode);
            }
            CartQuantVO.NotificationBar notificationBar = invoke.getNotificationBar();
            if (notificationBar != null) {
                cartButtonQuantNotificationHandler = doubleCartQuantViewBinder.notificationHandler;
                t K11 = iVar.K();
                cartButtonQuantActionHandlerFactory = doubleCartQuantViewBinder.actionHandlerFactory;
                cartButtonQuantNotificationHandler.show(notificationBar, CartButtonQuantActionHandlerFactory.builder$default(cartButtonQuantActionHandlerFactory, iVar, null, null, new DoubleCartQuantViewBinder$onContainerInitialized$1$2$1$1$1(doubleCartQuantViewHolder), 6, null).buildHandler(), K11);
            }
        }
    }
}
