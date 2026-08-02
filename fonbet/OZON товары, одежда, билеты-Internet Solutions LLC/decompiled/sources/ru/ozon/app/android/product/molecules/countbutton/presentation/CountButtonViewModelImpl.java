package ru.ozon.app.android.product.molecules.countbutton.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.O0;
import Ae.x0;
import De.s;
import Ge.n;
import Gy.c;
import Sc.InterfaceC4008j;
import V.e;
import WZ.l;
import Wc.a;
import io.reactivex.p;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.sheet.DisposableActionHandler;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.models.CartItemInfo;
import ru.ozon.app.android.product.molecules.countbutton.presentation.CountButtonVO;
import ru.ozon.app.android.product.molecules.countbutton.presentation.CountButtonViewModel;
import ru.ozon.app.android.storefront.data.tiles.countbutton.UpdateCartMode;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.E0;
import xe.H0;
import xe.J;
import xe.L;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 62\u00020\u0001:\u00016B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\u000e\u001a\u00020\r2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0013\u001a\u00020\u00122\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001a\u001a\u00020\u0015*\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u00020\r2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R \u0010&\u001a\b\u0012\u0004\u0012\u00020\u00120%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u0013\u0010(R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001b\u00102\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00067"}, d2 = {"Lru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonViewModelImpl;", "Lru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonViewModel;", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokeneziedAnalytics", "<init>", "(Lru/ozon/app/android/cart/common/domain/CartService;LWZ/l;)V", "", "", "Lru/ozon/app/android/cart/common/models/CartItemInfo;", "items", "", "onCartItemsChanged", "(Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonVO;", "vo", "Lru/ozon/app/android/product/molecules/countbutton/presentation/ButtonState;", "getButtonState", "(Ljava/util/Map;Lru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonVO;)Lru/ozon/app/android/product/molecules/countbutton/presentation/ButtonState;", "", "count", "", "formatQuantity", "(I)Ljava/lang/String;", "toBadgeQuantity", "(ILru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonVO;)I", "attach", "(Lru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonVO;)V", "detach", "()V", "Lru/ozon/app/android/action/sheet/DisposableActionHandler;", "actionHandler", "onButtonClicked", "(Lru/ozon/app/android/action/sheet/DisposableActionHandler;)V", "Lru/ozon/app/android/cart/common/domain/CartService;", "LAe/x0;", "buttonState", "LAe/x0;", "()LAe/x0;", "Lru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonVO;", "Lxe/B0;", "subscribeToCartJob", "Lxe/B0;", "Lru/ozon/app/android/product/molecules/countbutton/presentation/UpdateCartStrategyFactory;", "updateCartStrategyFactory$delegate", "LSc/j;", "getUpdateCartStrategyFactory", "()Lru/ozon/app/android/product/molecules/countbutton/presentation/UpdateCartStrategyFactory;", "updateCartStrategyFactory", "Lxe/M;", "scope", "Lxe/M;", "Companion", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CountButtonViewModelImpl implements CountButtonViewModel {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final x0<ButtonState> buttonState;

    @NotNull
    private final CartService cartService;

    @NotNull
    private final M scope;
    private B0 subscribeToCartJob;

    /* renamed from: updateCartStrategyFactory$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j updateCartStrategyFactory;
    private CountButtonVO vo;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonViewModelImpl$Companion;", "", "<init>", "()V", "ZERO_QUANTITY", "", "MAX_COUNT", "MAX_COUNT_DISPLAY_PATTERN", "", "ADD_TO_CART_ACTION_ID", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public CountButtonViewModelImpl(@NotNull CartService cartService, @NotNull l tokeneziedAnalytics) {
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        Intrinsics.checkNotNullParameter(tokeneziedAnalytics, "tokeneziedAnalytics");
        this.cartService = cartService;
        this.buttonState = O0.a(new ButtonState(null, false, false, 7, null));
        this.updateCartStrategyFactory = LazyUtilsKt.unsafeLazy(new CountButtonViewModelImpl$updateCartStrategyFactory$2(this));
        B0 b11 = X0.b();
        C10720e0 c10720e0 = C10720e0.f105451a;
        CoroutineContext d11 = CoroutineContext.Element.a.d(s.f6650a.x(), (H0) b11);
        Intrinsics.checkNotNullExpressionValue("CountButtonViewModelImpl", "getSimpleName(...)");
        this.scope = N.a(d11.plus(new L("CountButtonViewModelImpl")).plus(new CountButtonViewModelImpl$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0)));
        cartService.attach(tokeneziedAnalytics);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map attach$lambda$1(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (Map) function1.invoke(p02);
    }

    private final String formatQuantity(int count) {
        if (count > 99) {
            return e.b(new Object[]{99}, 1, "%d+", "format(...)");
        }
        if (count == 0) {
            return null;
        }
        return String.valueOf(count);
    }

    private final UpdateCartStrategyFactory getUpdateCartStrategyFactory() {
        return (UpdateCartStrategyFactory) this.updateCartStrategyFactory.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onCartItemsChanged(Map<Long, CartItemInfo> map, d<? super Unit> dVar) {
        Object emit = getButtonState().emit(getButtonState(map, this.vo), dVar);
        return emit == a.COROUTINE_SUSPENDED ? emit : Unit.f71690a;
    }

    private final int toBadgeQuantity(int i11, CountButtonVO countButtonVO) {
        if (countButtonVO.getUpdateCart() == null) {
            return 0;
        }
        return i11;
    }

    @Override // ru.ozon.app.android.product.molecules.countbutton.presentation.CountButtonViewModel
    public void attach(CountButtonVO vo) {
        this.vo = vo;
        B0 b02 = this.subscribeToCartJob;
        if (b02 == null || !b02.isActive()) {
            p distinctUntilChanged = CartService.DefaultImpls.observeCartState$default(this.cartService, false, 1, null).map(new c(CountButtonViewModelImpl$attach$1.INSTANCE, 1)).distinctUntilChanged();
            Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "distinctUntilChanged(...)");
            this.subscribeToCartJob = C2399j.C(new C2408n0(n.a(distinctUntilChanged), new CountButtonViewModelImpl$attach$2(this)), this.scope);
        }
    }

    @Override // ru.ozon.app.android.product.molecules.countbutton.presentation.CountButtonViewModel
    public void detach() {
        B0 b02 = this.subscribeToCartJob;
        if (b02 != null) {
            b02.j(null);
        }
        E0.d(this.scope.getCoroutineContext());
        this.subscribeToCartJob = null;
    }

    @Override // ru.ozon.app.android.product.molecules.countbutton.presentation.CountButtonViewModel
    public void onButtonClicked(DisposableActionHandler actionHandler) {
        Function1<AtomAction, Unit> handler;
        CountButtonVO countButtonVO = this.vo;
        if (countButtonVO != null) {
            AtomAction commonAction = countButtonVO.getCommonAction();
            if (commonAction == null || Intrinsics.d(commonAction.getId(), "addToCart")) {
                CountButtonVO.UpdateCart updateCart = countButtonVO.getUpdateCart();
                if (updateCart == null) {
                    return;
                }
                C10727i.c(this.scope, null, null, new CountButtonViewModelImpl$onButtonClicked$1$1(getUpdateCartStrategyFactory().getStrategy(updateCart.getMode()), countButtonVO, updateCart, null), 3);
                return;
            }
            if (actionHandler == null || (handler = actionHandler.getHandler()) == null) {
                return;
            }
            handler.invoke(commonAction);
        }
    }

    @Override // h20.InterfaceC6786a
    public void onCleared() {
        CountButtonViewModel.DefaultImpls.onCleared(this);
    }

    @Override // ru.ozon.app.android.product.molecules.countbutton.presentation.CountButtonViewModel
    @NotNull
    public x0<ButtonState> getButtonState() {
        return this.buttonState;
    }

    private final ButtonState getButtonState(Map<Long, CartItemInfo> items, CountButtonVO vo) {
        if (vo == null) {
            return new ButtonState(null, false, false, 7, null);
        }
        CartItemInfo cartItemInfo = items.get(Long.valueOf(vo.getSku()));
        boolean z11 = false;
        int quantity = cartItemInfo != null ? cartItemInfo.getQuantity() : 0;
        Long selectedDeliverySchema = cartItemInfo != null ? cartItemInfo.getSelectedDeliverySchema() : null;
        CountButtonVO.UpdateCart updateCart = vo.getUpdateCart();
        int maxItems = updateCart != null ? updateCart.getMaxItems() : Integer.MAX_VALUE;
        CountButtonVO.UpdateCart updateCart2 = vo.getUpdateCart();
        boolean z12 = !Intrinsics.d(updateCart2 != null ? updateCart2.getSelectedDeliverySchema() : null, selectedDeliverySchema) && quantity > 0;
        CountButtonVO.UpdateCart updateCart3 = vo.getUpdateCart();
        boolean z13 = vo.getIsDisabled() || (quantity >= maxItems && !((updateCart3 != null ? updateCart3.getMode() : null) == UpdateCartMode.INCREMENT_DECREMENT && quantity > 0)) || z12;
        String formatQuantity = formatQuantity(toBadgeQuantity(quantity, vo));
        if (!z13 && vo.getUpdateCart() != null) {
            z11 = true;
        }
        return new ButtonState(formatQuantity, z13, z11);
    }
}
