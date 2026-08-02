package ru.ozon.app.android.cart.domain;

import Ae.B0;
import Ae.InterfaceC2395h;
import Ae.M0;
import Ge.n;
import Mc.a;
import Sc.InterfaceC3999a;
import WZ.l;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.reactivex.AbstractC7094b;
import io.reactivex.p;
import io.reactivex.y;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.common.data.CartAddItemDTO;
import ru.ozon.app.android.cart.common.data.prefetch.state.CartPrefetchState;
import ru.ozon.app.android.cart.common.domain.AddToCartRequestState;
import ru.ozon.app.android.cart.common.domain.CartChangeSource;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.domain.CartState;
import ru.ozon.app.android.cart.common.domain.CartType;
import ru.ozon.app.android.cart.common.domain.local.CartSource;
import ru.ozon.app.android.cart.common.models.AddProductsToCartParams;
import ru.ozon.app.android.cart.common.models.AddProductsWithTokenizedAnalytics;
import ru.ozon.app.android.cart.common.models.CartAction;
import ru.ozon.app.android.cart.common.models.CartInfoUpdate;
import ru.ozon.app.android.cart.common.models.CartItemInfo;
import ru.ozon.app.android.cart.domain.CartDomainInteractor;
import ru.ozon.app.android.cart.domain.data.actions.CartActionDelegate;
import ru.ozon.app.android.cart.domain.delegate.AddToCartDelegate;
import ru.ozon.app.android.cart.domain.prefetch.CartManagerPrefetch;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import vc.j;

@Metadata(d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B)\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0017\u001a\u00020\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018JG\u0010#\u001a\u00020\u000f2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00192\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010&\u001a\u00020%H\u0017¢\u0006\u0004\b)\u0010*J\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020(0+2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b,\u0010-J\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020(0+2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b.\u0010-J\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010\u001e\u001a\u00020\u001dH\u0017¢\u0006\u0004\b/\u00100J\u0015\u00102\u001a\b\u0012\u0004\u0012\u0002010'H\u0017¢\u0006\u0004\b2\u00103J\u0085\u0001\u0010@\u001a\u00020\u00162\u0006\u00104\u001a\u00020\u00142\u0006\u00106\u001a\u0002052\b\u00107\u001a\u0004\u0018\u00010\u001a2\u0014\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u000208\u0018\u00010\u00192\b\u0010:\u001a\u0004\u0018\u00010\u001a2\u0006\u0010;\u001a\u00020\u00142\b\u0010<\u001a\u0004\u0018\u00010\u001a2\b\u0010=\u001a\u0004\u0018\u00010%2\b\u0010>\u001a\u0004\u0018\u00010%2\u0014\u0010?\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0019H\u0016¢\u0006\u0004\b@\u0010AJ\u0095\u0001\u0010F\u001a\b\u0012\u0004\u0012\u00020E0D2\u0006\u00104\u001a\u00020\u00142\u0006\u00106\u001a\u0002052\b\u00107\u001a\u0004\u0018\u00010\u001a2\u0014\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u000208\u0018\u00010\u00192\b\u0010:\u001a\u0004\u0018\u00010\u001a2\u0006\u0010;\u001a\u00020\u00142\b\u0010<\u001a\u0004\u0018\u00010\u001a2\b\u0010=\u001a\u0004\u0018\u00010%2\b\u0010>\u001a\u0004\u0018\u00010%2\u0014\u0010?\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00192\b\u0010C\u001a\u0004\u0018\u00010BH\u0016¢\u0006\u0004\bF\u0010GJi\u0010H\u001a\u00020\u00162\u0006\u00104\u001a\u00020\u00142\u0006\u00106\u001a\u0002052\b\u00107\u001a\u0004\u0018\u00010\u001a2\u0014\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u000208\u0018\u00010\u00192\b\u0010:\u001a\u0004\u0018\u00010\u001a2\b\u0010=\u001a\u0004\u0018\u00010%2\u0014\u0010?\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0019H\u0016¢\u0006\u0004\bH\u0010IJ\u001d\u0010K\u001a\b\u0012\u0004\u0012\u00020E0D2\u0006\u0010?\u001a\u00020JH\u0016¢\u0006\u0004\bK\u0010LJ\u001d\u0010N\u001a\b\u0012\u0004\u0012\u00020E0D2\u0006\u0010?\u001a\u00020MH\u0016¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020(H\u0016¢\u0006\u0004\bP\u0010QJ\u0017\u0010R\u001a\u00020(2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\bR\u0010SJ\u0017\u0010T\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\bT\u0010UJ\u001f\u0010W\u001a\u00020%2\u0006\u0010V\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\bW\u0010XJ\u001f\u0010Y\u001a\u0002052\u0006\u0010V\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\bY\u0010ZR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010[R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\\R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010]R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010^R\u0014\u0010`\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR \u0010d\u001a\b\u0012\u0004\u0012\u00020c0b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR \u0010i\u001a\b\u0012\u0004\u0012\u0002050h8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR \u0010m\u001a\b\u0012\u0004\u0012\u0002050h8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bm\u0010j\u001a\u0004\bn\u0010lR\u001a\u0010q\u001a\b\u0012\u0004\u0012\u00020o0b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bp\u0010gR\u001a\u0010t\u001a\b\u0012\u0004\u0012\u0002010+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\br\u0010s¨\u0006u"}, d2 = {"Lru/ozon/app/android/cart/domain/CartServiceImpl;", "Lru/ozon/app/android/cart/common/domain/CartService;", "Lru/ozon/app/android/cart/domain/CartManagerImpl;", "cartManager", "Lru/ozon/app/android/cart/domain/prefetch/CartManagerPrefetch;", "cartManagerPrefetch", "Lru/ozon/app/android/cart/domain/CartDomainInteractor;", "cartDomainInteractor", "Lru/ozon/app/android/cart/domain/data/actions/CartActionDelegate;", "cartActionDelegate", "<init>", "(Lru/ozon/app/android/cart/domain/CartManagerImpl;Lru/ozon/app/android/cart/domain/prefetch/CartManagerPrefetch;Lru/ozon/app/android/cart/domain/CartDomainInteractor;Lru/ozon/app/android/cart/domain/data/actions/CartActionDelegate;)V", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "", "attach", "(LWZ/l;)V", "Lru/ozon/app/android/cart/common/data/prefetch/state/CartPrefetchState;", "cartPrefetchState", "", "miniAppName", "Lio/reactivex/b;", "updateCart", "(Lru/ozon/app/android/cart/common/data/prefetch/state/CartPrefetchState;Ljava/lang/String;)Lio/reactivex/b;", "", "", "Lru/ozon/app/android/cart/common/models/CartItemInfo;", "items", "Lru/ozon/app/android/cart/common/domain/local/CartSource;", "source", "Lru/ozon/app/android/cart/common/domain/CartChangeSource;", "cartChangeSource", "Lru/ozon/app/android/cart/common/domain/CartType;", "cartType", "setItems", "(Ljava/util/Map;Lru/ozon/app/android/cart/common/domain/local/CartSource;Lru/ozon/app/android/cart/common/domain/CartChangeSource;Lru/ozon/app/android/cart/common/data/prefetch/state/CartPrefetchState;Lru/ozon/app/android/cart/common/domain/CartType;)V", "", "allEvents", "Lio/reactivex/p;", "Lru/ozon/app/android/cart/common/domain/CartState;", "observeCartState", "(Z)Lio/reactivex/p;", "LAe/h;", "observeCartStateFlow", "(Z)LAe/h;", "observeFamilyCartStateFlow", "observeCartStateChanged", "(Lru/ozon/app/android/cart/common/domain/local/CartSource;)Lio/reactivex/p;", "Lru/ozon/app/android/cart/common/models/CartAction;", "observeCartActions", "()Lio/reactivex/p;", "productId", "", "quantity", "selectedDeliverySchema", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "widgetId", "actionId", "sortAfterSku", "forStars", "wholeQuant", "params", "addProductToCart", "(Ljava/lang/String;ILjava/lang/Long;Ljava/util/Map;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/Map;)Lio/reactivex/b;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "showErrorNotification", "Lio/reactivex/y;", "Lru/ozon/app/android/cart/common/data/CartAddItemDTO;", "addProductToCartWithResponseResult", "(Ljava/lang/String;ILjava/lang/Long;Ljava/util/Map;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/Map;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)Lio/reactivex/y;", "removeProductFromCart", "(Ljava/lang/String;ILjava/lang/Long;Ljava/util/Map;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/util/Map;)Lio/reactivex/b;", "Lru/ozon/app/android/cart/common/models/AddProductsWithTokenizedAnalytics;", "addMultipleProductsWithCustomAnalytics", "(Lru/ozon/app/android/cart/common/models/AddProductsWithTokenizedAnalytics;)Lio/reactivex/y;", "Lru/ozon/app/android/cart/common/models/AddProductsToCartParams;", "addMultipleProductsWithPrefetch", "(Lru/ozon/app/android/cart/common/models/AddProductsToCartParams;)Lio/reactivex/y;", "getCartState", "()Lru/ozon/app/android/cart/common/domain/CartState;", "getCartStateByCartType", "(Lru/ozon/app/android/cart/common/domain/CartType;)Lru/ozon/app/android/cart/common/domain/CartState;", "clearCart", "(Lru/ozon/app/android/cart/common/data/prefetch/state/CartPrefetchState;)V", "id", "isProductInCart", "(JLru/ozon/app/android/cart/common/domain/CartType;)Z", "getProductInCartCount", "(JLru/ozon/app/android/cart/common/domain/CartType;)I", "Lru/ozon/app/android/cart/domain/CartManagerImpl;", "Lru/ozon/app/android/cart/domain/prefetch/CartManagerPrefetch;", "Lru/ozon/app/android/cart/domain/CartDomainInteractor;", "Lru/ozon/app/android/cart/domain/data/actions/CartActionDelegate;", "Lru/ozon/app/android/cart/domain/delegate/AddToCartDelegate;", "addToCartDelegate", "Lru/ozon/app/android/cart/domain/delegate/AddToCartDelegate;", "LAe/B0;", "Lru/ozon/app/android/cart/common/domain/AddToCartRequestState;", "addToCartRequestState", "LAe/B0;", "getAddToCartRequestState", "()LAe/B0;", "LAe/M0;", "countMainCart", "LAe/M0;", "getCountMainCart", "()LAe/M0;", "countFamilyCart", "getCountFamilyCart", "Lru/ozon/app/android/cart/common/models/CartInfoUpdate;", "getCartInfoUpdateSharedFlow", "cartInfoUpdateSharedFlow", "getCartActionsFlow", "()LAe/h;", "cartActionsFlow", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartServiceImpl implements CartService {

    @NotNull
    private final AddToCartDelegate addToCartDelegate;

    @NotNull
    private final B0<AddToCartRequestState> addToCartRequestState;

    @NotNull
    private final CartActionDelegate cartActionDelegate;

    @NotNull
    private final CartDomainInteractor cartDomainInteractor;

    @NotNull
    private final CartManagerImpl cartManager;

    @NotNull
    private final CartManagerPrefetch cartManagerPrefetch;

    @NotNull
    private final M0<Integer> countFamilyCart;

    @NotNull
    private final M0<Integer> countMainCart;

    public CartServiceImpl(@NotNull CartManagerImpl cartManager, @NotNull CartManagerPrefetch cartManagerPrefetch, @NotNull CartDomainInteractor cartDomainInteractor, @NotNull CartActionDelegate cartActionDelegate) {
        Intrinsics.checkNotNullParameter(cartManager, "cartManager");
        Intrinsics.checkNotNullParameter(cartManagerPrefetch, "cartManagerPrefetch");
        Intrinsics.checkNotNullParameter(cartDomainInteractor, "cartDomainInteractor");
        Intrinsics.checkNotNullParameter(cartActionDelegate, "cartActionDelegate");
        this.cartManager = cartManager;
        this.cartManagerPrefetch = cartManagerPrefetch;
        this.cartDomainInteractor = cartDomainInteractor;
        this.cartActionDelegate = cartActionDelegate;
        this.addToCartDelegate = new AddToCartDelegate(cartManager, cartDomainInteractor);
        this.addToCartRequestState = cartManager.getAddToCartRequestState();
        this.countMainCart = cartManager.getCountMainCart();
        this.countFamilyCart = cartManager.getCountFamilyCart();
    }

    @Override // ru.ozon.app.android.cart.common.domain.CartService
    @NotNull
    public y<CartAddItemDTO> addMultipleProductsWithCustomAnalytics(@NotNull AddProductsWithTokenizedAnalytics params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return CartDomainInteractor.DefaultImpls.addProductsWithTokenizedAnalytics$default(this.cartDomainInteractor, params, null, 2, null);
    }

    @Override // ru.ozon.app.android.cart.common.domain.CartService
    @NotNull
    public y<CartAddItemDTO> addMultipleProductsWithPrefetch(@NotNull AddProductsToCartParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return this.cartManagerPrefetch.addProducts(params);
    }

    @Override // ru.ozon.app.android.cart.common.domain.CartService
    @NotNull
    public AbstractC7094b addProductToCart(@NotNull String productId, int quantity, Long selectedDeliverySchema, Map<String, TokenizedTrackingInfo> trackingInfo, Long widgetId, @NotNull String actionId, Long sortAfterSku, Boolean forStars, Boolean wholeQuant, Map<String, String> params) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        y addProductToCartWithResponseResult$default = AddToCartDelegate.addProductToCartWithResponseResult$default(this.addToCartDelegate, productId, quantity, selectedDeliverySchema, trackingInfo, widgetId, actionId, sortAfterSku, forStars, wholeQuant, params, null, UserVerificationMethods.USER_VERIFY_ALL, null);
        addProductToCartWithResponseResult$default.getClass();
        j jVar = new j(addProductToCartWithResponseResult$default);
        Intrinsics.checkNotNullExpressionValue(jVar, "ignoreElement(...)");
        return jVar;
    }

    @Override // ru.ozon.app.android.cart.common.domain.CartService
    @NotNull
    public y<CartAddItemDTO> addProductToCartWithResponseResult(@NotNull String productId, int quantity, Long selectedDeliverySchema, Map<String, TokenizedTrackingInfo> trackingInfo, Long widgetId, @NotNull String actionId, Long sortAfterSku, Boolean forStars, Boolean wholeQuant, Map<String, String> params, NotificationDTO showErrorNotification) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        return this.addToCartDelegate.addProductToCartWithResponseResult(productId, quantity, selectedDeliverySchema, trackingInfo, widgetId, actionId, sortAfterSku, forStars, wholeQuant, params, showErrorNotification);
    }

    @Override // ru.ozon.app.android.cart.common.domain.CartService
    public void attach(@NotNull l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.cartDomainInteractor.attach(tokenizedAnalytics);
    }

    @Override // ru.ozon.app.android.cart.common.domain.CartService
    public void clearCart(@NotNull CartPrefetchState cartPrefetchState) {
        Intrinsics.checkNotNullParameter(cartPrefetchState, "cartPrefetchState");
        this.cartManagerPrefetch.clearCart(cartPrefetchState);
    }

    @Override // ru.ozon.app.android.cart.common.domain.CartService
    @NotNull
    public B0<AddToCartRequestState> getAddToCartRequestState() {
        return this.addToCartRequestState;
    }

    @Override // ru.ozon.app.android.cart.common.domain.CartService
    @NotNull
    public InterfaceC2395h<CartAction> getCartActionsFlow() {
        return this.cartActionDelegate.getCartActionSharedFlow();
    }

    @Override // ru.ozon.app.android.cart.common.domain.CartService
    @NotNull
    public B0<CartInfoUpdate> getCartInfoUpdateSharedFlow() {
        return this.cartManagerPrefetch.getCartInfoUpdateSharedFlow();
    }

    @Override // ru.ozon.app.android.cart.common.domain.CartService
    @NotNull
    public CartState getCartState() {
        return this.cartManager.getCartState();
    }

    @Override // ru.ozon.app.android.cart.common.domain.CartService
    @NotNull
    public CartState getCartStateByCartType(@NotNull CartType cartType) {
        Intrinsics.checkNotNullParameter(cartType, "cartType");
        return this.cartManager.getCartStateByCartType(cartType);
    }

    @Override // ru.ozon.app.android.cart.common.domain.CartService
    public int getProductInCartCount(long id2, @NotNull CartType cartType) {
        Intrinsics.checkNotNullParameter(cartType, "cartType");
        return this.cartManager.getProductInCartCount(id2, cartType);
    }

    @Override // ru.ozon.app.android.cart.common.domain.CartService
    public boolean isProductInCart(long id2, @NotNull CartType cartType) {
        Intrinsics.checkNotNullParameter(cartType, "cartType");
        return this.cartManager.isProductInCart(id2, cartType);
    }

    @Override // ru.ozon.app.android.cart.common.domain.CartService
    @InterfaceC3999a
    @NotNull
    public p<CartAction> observeCartActions() {
        return n.b(this.cartActionDelegate.getCartActionSharedFlow());
    }

    @Override // ru.ozon.app.android.cart.common.domain.CartService
    @InterfaceC3999a
    @NotNull
    public p<CartState> observeCartState(boolean allEvents) {
        p<CartState> observeOn = n.b(allEvents ? this.cartManager.getCartStateFlow() : this.cartDomainInteractor.getCartStateFlow()).observeOn(a.a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "observeOn(...)");
        return observeOn;
    }

    @Override // ru.ozon.app.android.cart.common.domain.CartService
    @InterfaceC3999a
    @NotNull
    public p<CartState> observeCartStateChanged(@NotNull CartSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return n.b(this.cartManager.observeCartStateChangedFlow(source));
    }

    @Override // ru.ozon.app.android.cart.common.domain.CartService
    @NotNull
    public InterfaceC2395h<CartState> observeCartStateFlow(boolean allEvents) {
        return allEvents ? this.cartManager.getCartStateFlow() : this.cartDomainInteractor.getCartStateFlow();
    }

    @Override // ru.ozon.app.android.cart.common.domain.CartService
    @NotNull
    public InterfaceC2395h<CartState> observeFamilyCartStateFlow(boolean allEvents) {
        return allEvents ? this.cartManager.getFamilyCartStateFlow() : this.cartDomainInteractor.getFamilyCartStateFlow();
    }

    @Override // ru.ozon.app.android.cart.common.domain.CartService
    @NotNull
    public AbstractC7094b removeProductFromCart(@NotNull String productId, int quantity, Long selectedDeliverySchema, Map<String, TokenizedTrackingInfo> trackingInfo, Long widgetId, Boolean forStars, Map<String, String> params) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        return this.addToCartDelegate.removeProductFromCart(productId, quantity, selectedDeliverySchema, trackingInfo, widgetId, forStars, params);
    }

    @Override // ru.ozon.app.android.cart.common.domain.CartService
    public void setItems(@NotNull Map<Long, CartItemInfo> items, @NotNull CartSource source, CartChangeSource cartChangeSource, CartPrefetchState cartPrefetchState, @NotNull CartType cartType) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(cartType, "cartType");
        this.cartManagerPrefetch.setItems(items, source, cartChangeSource, cartPrefetchState, cartType);
    }

    @Override // ru.ozon.app.android.cart.common.domain.CartService
    @NotNull
    public AbstractC7094b updateCart(CartPrefetchState cartPrefetchState, String miniAppName) {
        return this.cartManagerPrefetch.updateCart(cartPrefetchState, miniAppName);
    }
}
