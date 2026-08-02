package ru.ozon.app.android.cart.domain;

import AF.b;
import Ae.B0;
import Ae.C0;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.E0;
import Ae.I;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.M0;
import Ae.w0;
import Bc.h;
import Bc.i;
import Bc.r;
import Bc.t;
import De.C2862e;
import Fn.C3055d;
import Fn.C3056e;
import Sc.InterfaceC3999a;
import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import io.reactivex.AbstractC7094b;
import io.reactivex.y;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.app.android.cart.common.data.CartAddItemDTO;
import ru.ozon.app.android.cart.common.data.CartAddItemResponse;
import ru.ozon.app.android.cart.common.domain.AddToCartRequestState;
import ru.ozon.app.android.cart.common.domain.CartChangeAction;
import ru.ozon.app.android.cart.common.domain.CartChangeSource;
import ru.ozon.app.android.cart.common.domain.CartNavigationService;
import ru.ozon.app.android.cart.common.domain.CartState;
import ru.ozon.app.android.cart.common.domain.CartType;
import ru.ozon.app.android.cart.common.domain.CartTypeKt;
import ru.ozon.app.android.cart.common.domain.local.CartSource;
import ru.ozon.app.android.cart.common.models.AddProductsToCartParams;
import ru.ozon.app.android.cart.common.models.CartInfoUpdate;
import ru.ozon.app.android.cart.common.models.CartItemInfo;
import ru.ozon.app.android.cart.domain.CartManager;
import ru.ozon.app.android.cart.domain.CartManagerImpl;
import ru.ozon.app.android.cart.domain.delegate.CartChangeCheckerImpl;
import ru.ozon.app.android.cart.domain.local.LocalCartDataStorage;
import ru.ozon.app.android.cart.domain.network.CartSyncService;
import ru.ozon.app.android.navigation.miniapp.CurrentMiniAppHolder;
import vc.C10299d;
import xe.C10720e0;
import xe.H0;
import xe.J;
import xe.L;
import xe.M;
import xe.N;
import xe.X0;
import ze.EnumC11113a;

@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001BE\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b$\u0010%J=\u0010/\u001a\u00020.2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0&2\u0006\u0010!\u001a\u00020 2\b\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b/\u00100J\u001f\u00103\u001a\u0002022\u0006\u00101\u001a\u00020'2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020#H\u0017¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020#2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020.2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b9\u0010:J\u001f\u0010<\u001a\u00020;2\u0006\u00101\u001a\u00020'2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b<\u0010=R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010>R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010?R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010?R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010@R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010AR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010BR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020H0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR \u0010L\u001a\b\u0012\u0004\u0012\u00020H0K8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR \u0010Q\u001a\b\u0012\u0004\u0012\u00020P0K8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bQ\u0010M\u001a\u0004\bR\u0010OR \u0010S\u001a\b\u0012\u0004\u0012\u00020P0K8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bS\u0010M\u001a\u0004\bT\u0010OR \u0010U\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR \u0010Y\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bY\u0010V\u001a\u0004\bZ\u0010XR\u0016\u0010]\u001a\u0004\u0018\u00010\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u001a\u0010a\u001a\b\u0012\u0004\u0012\u0002020^8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`R\u001a\u0010c\u001a\b\u0012\u0004\u0012\u0002020^8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u0010`¨\u0006d"}, d2 = {"Lru/ozon/app/android/cart/domain/CartManagerImpl;", "Lru/ozon/app/android/cart/domain/CartManager;", "Lru/ozon/app/android/cart/domain/network/CartSyncService;", "cartSyncService", "Lru/ozon/app/android/cart/domain/local/LocalCartDataStorage;", "localCartDataStorage", "localFamilyCartDataStorage", "Lru/ozon/app/android/cart/common/domain/CartNavigationService;", "cartNavigationService", "Lru/ozon/app/android/navigation/miniapp/CurrentMiniAppHolder;", "currentMiniAppHolder", "Lru/ozon/app/android/cart/domain/VersionCartState;", "versionCartState", "Lru/ozon/app/android/cart/domain/delegate/CartChangeCheckerImpl;", "cartChangeChecker", "<init>", "(Lru/ozon/app/android/cart/domain/network/CartSyncService;Lru/ozon/app/android/cart/domain/local/LocalCartDataStorage;Lru/ozon/app/android/cart/domain/local/LocalCartDataStorage;Lru/ozon/app/android/cart/common/domain/CartNavigationService;Lru/ozon/app/android/navigation/miniapp/CurrentMiniAppHolder;Lru/ozon/app/android/cart/domain/VersionCartState;Lru/ozon/app/android/cart/domain/delegate/CartChangeCheckerImpl;)V", "Lru/ozon/app/android/cart/common/data/CartAddItemResponse;", "response", "Lru/ozon/app/android/cart/common/data/CartAddItemDTO;", "mapAddToCart", "(Lru/ozon/app/android/cart/common/data/CartAddItemResponse;)Lru/ozon/app/android/cart/common/data/CartAddItemDTO;", "Lru/ozon/app/android/cart/common/models/AddProductsToCartParams;", "params", "Lio/reactivex/y;", "addProducts", "(Lru/ozon/app/android/cart/common/models/AddProductsToCartParams;)Lio/reactivex/y;", "", "miniAppName", "Lio/reactivex/b;", "updateCart", "(Ljava/lang/String;)Lio/reactivex/b;", "Lru/ozon/app/android/cart/common/domain/local/CartSource;", "source", "LAe/h;", "Lru/ozon/app/android/cart/common/domain/CartState;", "observeCartStateChangedFlow", "(Lru/ozon/app/android/cart/common/domain/local/CartSource;)LAe/h;", "", "", "Lru/ozon/app/android/cart/common/models/CartItemInfo;", "items", "Lru/ozon/app/android/cart/common/domain/CartChangeSource;", "cartChangeSource", "Lru/ozon/app/android/cart/common/domain/CartType;", "cartType", "", "setItems", "(Ljava/util/Map;Lru/ozon/app/android/cart/common/domain/local/CartSource;Lru/ozon/app/android/cart/common/domain/CartChangeSource;Lru/ozon/app/android/cart/common/domain/CartType;)V", "id", "", "getProductInCartCount", "(JLru/ozon/app/android/cart/common/domain/CartType;)I", "getCartState", "()Lru/ozon/app/android/cart/common/domain/CartState;", "getCartStateByCartType", "(Lru/ozon/app/android/cart/common/domain/CartType;)Lru/ozon/app/android/cart/common/domain/CartState;", "clearCart", "(Lru/ozon/app/android/cart/common/domain/CartType;)V", "", "isProductInCart", "(JLru/ozon/app/android/cart/common/domain/CartType;)Z", "Lru/ozon/app/android/cart/domain/network/CartSyncService;", "Lru/ozon/app/android/cart/domain/local/LocalCartDataStorage;", "Lru/ozon/app/android/cart/common/domain/CartNavigationService;", "Lru/ozon/app/android/navigation/miniapp/CurrentMiniAppHolder;", "Lru/ozon/app/android/cart/domain/VersionCartState;", "Lru/ozon/app/android/cart/domain/delegate/CartChangeCheckerImpl;", "Lxe/M;", "coroutineScope", "Lxe/M;", "LAe/w0;", "Lru/ozon/app/android/cart/common/domain/AddToCartRequestState;", "_addToCartRequestState", "LAe/w0;", "LAe/B0;", "addToCartRequestState", "LAe/B0;", "getAddToCartRequestState", "()LAe/B0;", "Lru/ozon/app/android/cart/common/models/CartInfoUpdate;", "cartInfoUpdateSharedFlow", "getCartInfoUpdateSharedFlow", "familyCartInfoUpdateSharedFlow", "getFamilyCartInfoUpdateSharedFlow", "cartStateFlow", "LAe/h;", "getCartStateFlow", "()LAe/h;", "familyCartStateFlow", "getFamilyCartStateFlow", "getMiniApp", "()Ljava/lang/String;", "miniApp", "LAe/M0;", "getCountMainCart", "()LAe/M0;", "countMainCart", "getCountFamilyCart", "countFamilyCart", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartManagerImpl implements CartManager {

    @NotNull
    private final w0<AddToCartRequestState> _addToCartRequestState;

    @NotNull
    private final B0<AddToCartRequestState> addToCartRequestState;

    @NotNull
    private final CartChangeCheckerImpl cartChangeChecker;

    @NotNull
    private final B0<CartInfoUpdate> cartInfoUpdateSharedFlow;

    @NotNull
    private final CartNavigationService cartNavigationService;

    @NotNull
    private final InterfaceC2395h<CartState> cartStateFlow;

    @NotNull
    private final CartSyncService cartSyncService;

    @NotNull
    private final M coroutineScope;

    @NotNull
    private final CurrentMiniAppHolder currentMiniAppHolder;

    @NotNull
    private final B0<CartInfoUpdate> familyCartInfoUpdateSharedFlow;

    @NotNull
    private final InterfaceC2395h<CartState> familyCartStateFlow;

    @NotNull
    private final LocalCartDataStorage localCartDataStorage;

    @NotNull
    private final LocalCartDataStorage localFamilyCartDataStorage;

    @NotNull
    private final VersionCartState versionCartState;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/cart/common/models/CartInfoUpdate;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.cart.domain.CartManagerImpl$1", f = "CartManager.kt", l = {147}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.cart.domain.CartManagerImpl$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<CartInfoUpdate, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = CartManagerImpl.this.new AnonymousClass1(dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                CartInfoUpdate cartInfoUpdate = (CartInfoUpdate) this.L$0;
                if (cartInfoUpdate.getCartChangeSource() == CartChangeSource.ADD_TO_CART && !cartInfoUpdate.getHasDiff()) {
                    w0 w0Var = CartManagerImpl.this._addToCartRequestState;
                    AddToCartRequestState.HideLoading hideLoading = AddToCartRequestState.HideLoading.INSTANCE;
                    this.label = 1;
                    if (w0Var.emit(hideLoading, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CartInfoUpdate cartInfoUpdate, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(cartInfoUpdate, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    public CartManagerImpl(@NotNull CartSyncService cartSyncService, @NotNull LocalCartDataStorage localCartDataStorage, @NotNull LocalCartDataStorage localFamilyCartDataStorage, @NotNull CartNavigationService cartNavigationService, @NotNull CurrentMiniAppHolder currentMiniAppHolder, @NotNull VersionCartState versionCartState, @NotNull CartChangeCheckerImpl cartChangeChecker) {
        Intrinsics.checkNotNullParameter(cartSyncService, "cartSyncService");
        Intrinsics.checkNotNullParameter(localCartDataStorage, "localCartDataStorage");
        Intrinsics.checkNotNullParameter(localFamilyCartDataStorage, "localFamilyCartDataStorage");
        Intrinsics.checkNotNullParameter(cartNavigationService, "cartNavigationService");
        Intrinsics.checkNotNullParameter(currentMiniAppHolder, "currentMiniAppHolder");
        Intrinsics.checkNotNullParameter(versionCartState, "versionCartState");
        Intrinsics.checkNotNullParameter(cartChangeChecker, "cartChangeChecker");
        this.cartSyncService = cartSyncService;
        this.localCartDataStorage = localCartDataStorage;
        this.localFamilyCartDataStorage = localFamilyCartDataStorage;
        this.cartNavigationService = cartNavigationService;
        this.currentMiniAppHolder = currentMiniAppHolder;
        this.versionCartState = versionCartState;
        this.cartChangeChecker = cartChangeChecker;
        CoroutineContext d11 = CoroutineContext.Element.a.d(C10720e0.a(), (H0) X0.b());
        Intrinsics.checkNotNullExpressionValue("CartManagerImpl", "getSimpleName(...)");
        C2862e a11 = N.a(d11.plus(new L("CartManagerImpl")).plus(new CartManagerImpl$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0)));
        this.coroutineScope = a11;
        C0 b11 = E0.b(0, 2, EnumC11113a.DROP_OLDEST, 1);
        this._addToCartRequestState = b11;
        this.addToCartRequestState = C2399j.a(b11);
        this.cartInfoUpdateSharedFlow = localCartDataStorage.getCartInfoUpdateSharedFlow();
        this.familyCartInfoUpdateSharedFlow = localFamilyCartDataStorage.getCartInfoUpdateSharedFlow();
        this.cartStateFlow = localCartDataStorage.getCartStateFlow();
        this.familyCartStateFlow = localFamilyCartDataStorage.getCartStateFlow();
        cartSyncService.startSync();
        C2399j.C(new C2408n0(C2399j.E(C7714v.b0(getCartInfoUpdateSharedFlow(), getFamilyCartInfoUpdateSharedFlow())), new AnonymousClass1(null)), a11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CartAddItemDTO addProducts$lambda$4(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (CartAddItemDTO) function1.invoke(p02);
    }

    private final String getMiniApp() {
        return this.currentMiniAppHolder.getCurrentMiniAppExceptMain();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CartAddItemDTO mapAddToCart(CartAddItemResponse response) {
        return new CartAddItemDTO(response.getSuccess(), response.getDeeplink(), response.getRestriction(), response.getCart(), response.getAction(), response.getNotificationBar(), response.getParams(), response.getItemsTrackingInfo());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateCart$lambda$5(CartManagerImpl cartManagerImpl) {
        cartManagerImpl.cartChangeChecker.setCartWasChangedInAnotherMiniApp(false);
    }

    @NotNull
    public y<CartAddItemDTO> addProducts(@NotNull AddProductsToCartParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.cartChangeChecker.setCartWasChangedInAnotherMiniApp(getMiniApp() != null);
        Long versionId = params.getVersionId();
        t g10 = new r(new h(new Bc.j(new i(this.cartSyncService.sendActionWithResult(new CartChangeAction(versionId != null ? versionId.longValue() : this.versionCartState.next(params.getCartType()), params.getItems(), getMiniApp(), params.getCartType())).j(Mc.a.b()), new b(new CartManagerImpl$addProducts$1(this), 1)), new C3055d(new CartManagerImpl$addProducts$2(this), 0)), new AF.d(new CartManagerImpl$addProducts$3(this), 1)), new C3056e(new CartManagerImpl$addProducts$4(this), 0)).g(C8125a.a());
        Intrinsics.checkNotNullExpressionValue(g10, "observeOn(...)");
        return g10;
    }

    @Override // ru.ozon.app.android.cart.domain.CartManager
    public void clearCart(@NotNull CartType cartType) {
        Intrinsics.checkNotNullParameter(cartType, "cartType");
        CartManager.DefaultImpls.setItems$default(this, U.c(), null, null, cartType, 6, null);
    }

    @NotNull
    public B0<AddToCartRequestState> getAddToCartRequestState() {
        return this.addToCartRequestState;
    }

    @NotNull
    public B0<CartInfoUpdate> getCartInfoUpdateSharedFlow() {
        return this.cartInfoUpdateSharedFlow;
    }

    @InterfaceC3999a
    @NotNull
    public CartState getCartState() {
        return this.localCartDataStorage.getCartState();
    }

    @Override // ru.ozon.app.android.cart.domain.CartManager
    @NotNull
    public CartState getCartStateByCartType(@NotNull CartType cartType) {
        Intrinsics.checkNotNullParameter(cartType, "cartType");
        return (CartTypeKt.isFamilyCart(cartType) ? this.localFamilyCartDataStorage : this.localCartDataStorage).getCartState();
    }

    @NotNull
    public InterfaceC2395h<CartState> getCartStateFlow() {
        return this.cartStateFlow;
    }

    @NotNull
    public M0<Integer> getCountFamilyCart() {
        return this.localFamilyCartDataStorage.getCountCart();
    }

    @NotNull
    public M0<Integer> getCountMainCart() {
        return this.localCartDataStorage.getCountCart();
    }

    @NotNull
    public B0<CartInfoUpdate> getFamilyCartInfoUpdateSharedFlow() {
        return this.familyCartInfoUpdateSharedFlow;
    }

    @NotNull
    public InterfaceC2395h<CartState> getFamilyCartStateFlow() {
        return this.familyCartStateFlow;
    }

    public int getProductInCartCount(long id2, @NotNull CartType cartType) {
        Intrinsics.checkNotNullParameter(cartType, "cartType");
        Integer num = null;
        if (CartTypeKt.isFamilyCart(cartType)) {
            CartItemInfo cartItemInfo = this.localFamilyCartDataStorage.getCartState().getItems().get(Long.valueOf(id2));
            if (cartItemInfo != null) {
                num = Integer.valueOf(cartItemInfo.getQuantity());
            }
        } else {
            CartItemInfo cartItemInfo2 = this.localCartDataStorage.getCartState().getItems().get(Long.valueOf(id2));
            if (cartItemInfo2 != null) {
                num = Integer.valueOf(cartItemInfo2.getQuantity());
            }
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public boolean isProductInCart(long id2, @NotNull CartType cartType) {
        Intrinsics.checkNotNullParameter(cartType, "cartType");
        return getProductInCartCount(id2, cartType) > 0;
    }

    @NotNull
    public InterfaceC2395h<CartState> observeCartStateChangedFlow(@NotNull final CartSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        final I i11 = new I(getCartStateFlow());
        return new InterfaceC2395h<CartState>() { // from class: ru.ozon.app.android.cart.domain.CartManagerImpl$observeCartStateChangedFlow$$inlined$filter$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.cart.domain.CartManagerImpl$observeCartStateChangedFlow$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ CartSource $source$inlined;
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.cart.domain.CartManagerImpl$observeCartStateChangedFlow$$inlined$filter$1$2", f = "CartManager.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.cart.domain.CartManagerImpl$observeCartStateChangedFlow$$inlined$filter$1$2$1, reason: invalid class name */
                /* loaded from: classes11.dex */
                public static final class AnonymousClass1 extends c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= LinearLayoutManager.INVALID_OFFSET;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2397i interfaceC2397i, CartSource cartSource) {
                    this.$this_unsafeFlow = interfaceC2397i;
                    this.$source$inlined = cartSource;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            a aVar = a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                if (((CartState) obj).getSource() == this.$source$inlined) {
                                    anonymousClass1.label = 1;
                                    if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
                                        return aVar;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(dVar);
                    Object obj22 = anonymousClass1.result;
                    a aVar2 = a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super CartState> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, source), dVar);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        };
    }

    @Override // ru.ozon.app.android.cart.domain.CartManager
    public void setItems(@NotNull Map<Long, CartItemInfo> items, @NotNull CartSource source, CartChangeSource cartChangeSource, @NotNull CartType cartType) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(cartType, "cartType");
        this.cartChangeChecker.setCartWasChangedInAnotherMiniApp(getMiniApp() != null);
        if (CartTypeKt.isFamilyCart(cartType)) {
            this.localFamilyCartDataStorage.setCartItems(items, this.versionCartState.next(cartType), source, cartChangeSource);
        } else {
            this.localCartDataStorage.setCartItems(items, VersionCartState.next$default(this.versionCartState, null, 1, null), source, cartChangeSource);
        }
    }

    @NotNull
    public AbstractC7094b updateCart(String miniAppName) {
        CartSyncService cartSyncService = this.cartSyncService;
        if (miniAppName == null) {
            miniAppName = getMiniApp();
        }
        AbstractC7094b updateCart = cartSyncService.updateCart(miniAppName, VersionCartState.next$default(this.versionCartState, null, 1, null), this.versionCartState.next(CartType.FAMILY_CART));
        InterfaceC9019a interfaceC9019a = new InterfaceC9019a() { // from class: Fn.c
            @Override // qc.InterfaceC9019a
            public final void run() {
                CartManagerImpl.updateCart$lambda$5(CartManagerImpl.this);
            }
        };
        updateCart.getClass();
        C10299d c10299d = new C10299d(updateCart, interfaceC9019a);
        Intrinsics.checkNotNullExpressionValue(c10299d, "doFinally(...)");
        return c10299d;
    }
}
