package ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart;

import d20.AbstractC6065b;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
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

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "mode", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO$CartMode;", "<unused var>", "", "additionalAction", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class DoubleCartViewBinder$onContainerInitialized$1$2 extends AbstractC7737t implements InterfaceC6511n<DoubleCartVO.CartMode, String, AtomAction, Unit> {
    final /* synthetic */ CartViewModel $cartViewModel;
    final /* synthetic */ i $container;
    final /* synthetic */ AbstractC6065b<DoubleCartVO> $overlayWidgetViewHolder;
    final /* synthetic */ Function0<DoubleCartVO> $voProvider;
    final /* synthetic */ DoubleCartViewBinder this$0;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DoubleCartVO.CartMode.values().length];
            try {
                iArr[DoubleCartVO.CartMode.FIRST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DoubleCartVO.CartMode.SECOND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DoubleCartViewBinder$onContainerInitialized$1$2(Function0<DoubleCartVO> function0, i iVar, CartViewModel cartViewModel, DoubleCartViewBinder doubleCartViewBinder, AbstractC6065b<DoubleCartVO> abstractC6065b) {
        super(3);
        this.$voProvider = function0;
        this.$container = iVar;
        this.$cartViewModel = cartViewModel;
        this.this$0 = doubleCartViewBinder;
        this.$overlayWidgetViewHolder = abstractC6065b;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(DoubleCartVO.CartMode cartMode, String str, AtomAction atomAction) {
        invoke2(cartMode, str, atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(DoubleCartVO.CartMode cartMode, String str, AtomAction atomAction) {
        CartButtonNotificationHandler cartButtonNotificationHandler;
        CartButtonActionHandlerFactory cartButtonActionHandlerFactory;
        DoubleCartVO invoke = this.$voProvider.invoke();
        if (invoke != null) {
            i iVar = this.$container;
            CartViewModel cartViewModel = this.$cartViewModel;
            DoubleCartViewBinder doubleCartViewBinder = this.this$0;
            AbstractC6065b<DoubleCartVO> abstractC6065b = this.$overlayWidgetViewHolder;
            ComposerViewExtensionKt.composerRecyclerView(iVar.Z()).stopScroll();
            int i11 = cartMode == null ? -1 : WhenMappings.$EnumSwitchMapping$0[cartMode.ordinal()];
            if (i11 == 1) {
                cartViewModel.addToCart(invoke.getFirstCartData(), atomAction, cartMode);
            } else if (i11 == 2) {
                cartViewModel.addToCart(invoke.getSecondCartData(), atomAction, cartMode);
            }
            CartVO.NotificationBar notificationBar = invoke.getNotificationBar();
            if (notificationBar != null) {
                cartButtonNotificationHandler = doubleCartViewBinder.notificationHandler;
                t K11 = iVar.K();
                cartButtonActionHandlerFactory = doubleCartViewBinder.actionHandlerFactory;
                cartButtonNotificationHandler.show(notificationBar, CartButtonActionHandlerFactory.builder$default(cartButtonActionHandlerFactory, iVar, null, null, new DoubleCartViewBinder$onContainerInitialized$1$2$1$1$1(abstractC6065b), 6, null).buildHandler(), K11);
            }
        }
    }
}
