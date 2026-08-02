package ru.ozon.app.android.cart.common.domain;

import Ae.B0;
import Ae.InterfaceC2395h;
import Sc.InterfaceC3999a;
import WZ.l;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.reactivex.AbstractC7094b;
import io.reactivex.p;
import io.reactivex.y;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.common.data.CartAddItemDTO;
import ru.ozon.app.android.cart.common.data.prefetch.state.CartPrefetchState;
import ru.ozon.app.android.cart.common.domain.local.CartSource;
import ru.ozon.app.android.cart.common.models.AddProductsToCartParams;
import ru.ozon.app.android.cart.common.models.AddProductsWithTokenizedAnalytics;
import ru.ozon.app.android.cart.common.models.CartAction;
import ru.ozon.app.android.cart.common.models.CartInfoUpdate;
import ru.ozon.app.android.cart.common.models.CartItemInfo;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\f\u0010\rJO\u0010\u0018\u001a\u00020\u00042\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\b\b\u0002\u0010\u001b\u001a\u00020\u001aH'¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0 2\b\b\u0002\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001d0 2\b\b\u0002\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\b#\u0010\"J\u001f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\b\b\u0002\u0010\u0013\u001a\u00020\u0012H'¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u001cH'¢\u0006\u0004\b'\u0010(J\u008f\u0001\u00105\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\t2\u0006\u0010+\u001a\u00020*2\b\u0010,\u001a\u0004\u0018\u00010\u000f2\u0014\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020-\u0018\u00010\u000e2\b\u0010/\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u00100\u001a\u00020\t2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u001a2\u0016\b\u0002\u00104\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u000eH&¢\u0006\u0004\b5\u00106J¡\u0001\u0010;\u001a\b\u0012\u0004\u0012\u00020:092\u0006\u0010)\u001a\u00020\t2\u0006\u0010+\u001a\u00020*2\b\u0010,\u001a\u0004\u0018\u00010\u000f2\u0014\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020-\u0018\u00010\u000e2\b\u0010/\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u00100\u001a\u00020\t2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u001a2\u0016\b\u0002\u00104\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u000e2\n\b\u0002\u00108\u001a\u0004\u0018\u000107H&¢\u0006\u0004\b;\u0010<Jm\u0010=\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\t2\u0006\u0010+\u001a\u00020*2\b\u0010,\u001a\u0004\u0018\u00010\u000f2\u0014\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020-\u0018\u00010\u000e2\b\u0010/\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u001a2\u0016\b\u0002\u00104\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u000eH&¢\u0006\u0004\b=\u0010>J\u001d\u0010@\u001a\b\u0012\u0004\u0012\u00020:092\u0006\u00104\u001a\u00020?H&¢\u0006\u0004\b@\u0010AJ\u001d\u0010C\u001a\b\u0012\u0004\u0012\u00020:092\u0006\u00104\u001a\u00020BH&¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u001dH'¢\u0006\u0004\bE\u0010FJ\u0017\u0010G\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\bG\u0010HJ\u0017\u0010I\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\bI\u0010JJ!\u0010L\u001a\u00020\u001a2\u0006\u0010K\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\bL\u0010MJ!\u0010N\u001a\u00020*2\u0006\u0010K\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\bN\u0010OR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020Q0P8&X¦\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020U0P8&X¦\u0004¢\u0006\u0006\u001a\u0004\bV\u0010SR\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020&0 8&X¦\u0004¢\u0006\u0006\u001a\u0004\bX\u0010Y¨\u0006["}, d2 = {"Lru/ozon/app/android/cart/common/domain/CartService;", "", "LWZ/l;", "tokenizedAnalytics", "", "attach", "(LWZ/l;)V", "Lru/ozon/app/android/cart/common/data/prefetch/state/CartPrefetchState;", "cartPrefetchState", "", "miniAppName", "Lio/reactivex/b;", "updateCart", "(Lru/ozon/app/android/cart/common/data/prefetch/state/CartPrefetchState;Ljava/lang/String;)Lio/reactivex/b;", "", "", "Lru/ozon/app/android/cart/common/models/CartItemInfo;", "items", "Lru/ozon/app/android/cart/common/domain/local/CartSource;", "source", "Lru/ozon/app/android/cart/common/domain/CartChangeSource;", "cartChangeSource", "Lru/ozon/app/android/cart/common/domain/CartType;", "cartType", "setItems", "(Ljava/util/Map;Lru/ozon/app/android/cart/common/domain/local/CartSource;Lru/ozon/app/android/cart/common/domain/CartChangeSource;Lru/ozon/app/android/cart/common/data/prefetch/state/CartPrefetchState;Lru/ozon/app/android/cart/common/domain/CartType;)V", "", "allEvents", "Lio/reactivex/p;", "Lru/ozon/app/android/cart/common/domain/CartState;", "observeCartState", "(Z)Lio/reactivex/p;", "LAe/h;", "observeCartStateFlow", "(Z)LAe/h;", "observeFamilyCartStateFlow", "observeCartStateChanged", "(Lru/ozon/app/android/cart/common/domain/local/CartSource;)Lio/reactivex/p;", "Lru/ozon/app/android/cart/common/models/CartAction;", "observeCartActions", "()Lio/reactivex/p;", "productId", "", "quantity", "selectedDeliverySchema", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "widgetId", "actionId", "sortAfterSku", "forStars", "wholeQuant", "params", "addProductToCart", "(Ljava/lang/String;ILjava/lang/Long;Ljava/util/Map;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/Map;)Lio/reactivex/b;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "showErrorNotification", "Lio/reactivex/y;", "Lru/ozon/app/android/cart/common/data/CartAddItemDTO;", "addProductToCartWithResponseResult", "(Ljava/lang/String;ILjava/lang/Long;Ljava/util/Map;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/Map;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)Lio/reactivex/y;", "removeProductFromCart", "(Ljava/lang/String;ILjava/lang/Long;Ljava/util/Map;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/util/Map;)Lio/reactivex/b;", "Lru/ozon/app/android/cart/common/models/AddProductsWithTokenizedAnalytics;", "addMultipleProductsWithCustomAnalytics", "(Lru/ozon/app/android/cart/common/models/AddProductsWithTokenizedAnalytics;)Lio/reactivex/y;", "Lru/ozon/app/android/cart/common/models/AddProductsToCartParams;", "addMultipleProductsWithPrefetch", "(Lru/ozon/app/android/cart/common/models/AddProductsToCartParams;)Lio/reactivex/y;", "getCartState", "()Lru/ozon/app/android/cart/common/domain/CartState;", "getCartStateByCartType", "(Lru/ozon/app/android/cart/common/domain/CartType;)Lru/ozon/app/android/cart/common/domain/CartState;", "clearCart", "(Lru/ozon/app/android/cart/common/data/prefetch/state/CartPrefetchState;)V", "id", "isProductInCart", "(JLru/ozon/app/android/cart/common/domain/CartType;)Z", "getProductInCartCount", "(JLru/ozon/app/android/cart/common/domain/CartType;)I", "LAe/B0;", "Lru/ozon/app/android/cart/common/domain/AddToCartRequestState;", "getAddToCartRequestState", "()LAe/B0;", "addToCartRequestState", "Lru/ozon/app/android/cart/common/models/CartInfoUpdate;", "getCartInfoUpdateSharedFlow", "cartInfoUpdateSharedFlow", "getCartActionsFlow", "()LAe/h;", "cartActionsFlow", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CartService {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ AbstractC7094b addProductToCart$default(CartService cartService, String str, int i11, Long l11, Map map, Long l12, String str2, Long l13, Boolean bool, Boolean bool2, Map map2, int i12, Object obj) {
            Map map3;
            CartService cartService2;
            String str3;
            int i13;
            Long l14;
            Map map4;
            Long l15;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addProductToCart");
            }
            String str4 = (i12 & 32) != 0 ? "" : str2;
            Long l16 = (i12 & 64) != 0 ? null : l13;
            Boolean bool3 = (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : bool;
            Boolean bool4 = (i12 & 256) != 0 ? null : bool2;
            if ((i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                map3 = null;
                str3 = str;
                i13 = i11;
                l14 = l11;
                map4 = map;
                l15 = l12;
                cartService2 = cartService;
            } else {
                map3 = map2;
                cartService2 = cartService;
                str3 = str;
                i13 = i11;
                l14 = l11;
                map4 = map;
                l15 = l12;
            }
            return cartService2.addProductToCart(str3, i13, l14, map4, l15, str4, l16, bool3, bool4, map3);
        }

        public static /* synthetic */ y addProductToCartWithResponseResult$default(CartService cartService, String str, int i11, Long l11, Map map, Long l12, String str2, Long l13, Boolean bool, Boolean bool2, Map map2, NotificationDTO notificationDTO, int i12, Object obj) {
            NotificationDTO notificationDTO2;
            CartService cartService2;
            String str3;
            int i13;
            Long l14;
            Map map3;
            Long l15;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addProductToCartWithResponseResult");
            }
            String str4 = (i12 & 32) != 0 ? "" : str2;
            Long l16 = (i12 & 64) != 0 ? null : l13;
            Boolean bool3 = (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : bool;
            Boolean bool4 = (i12 & 256) != 0 ? null : bool2;
            Map map4 = (i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : map2;
            if ((i12 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                notificationDTO2 = null;
                str3 = str;
                i13 = i11;
                l14 = l11;
                map3 = map;
                l15 = l12;
                cartService2 = cartService;
            } else {
                notificationDTO2 = notificationDTO;
                cartService2 = cartService;
                str3 = str;
                i13 = i11;
                l14 = l11;
                map3 = map;
                l15 = l12;
            }
            return cartService2.addProductToCartWithResponseResult(str3, i13, l14, map3, l15, str4, l16, bool3, bool4, map4, notificationDTO2);
        }

        public static /* synthetic */ int getProductInCartCount$default(CartService cartService, long j11, CartType cartType, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getProductInCartCount");
            }
            if ((i11 & 2) != 0) {
                cartType = CartType.MAIN_CART;
            }
            return cartService.getProductInCartCount(j11, cartType);
        }

        public static /* synthetic */ boolean isProductInCart$default(CartService cartService, long j11, CartType cartType, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isProductInCart");
            }
            if ((i11 & 2) != 0) {
                cartType = CartType.MAIN_CART;
            }
            return cartService.isProductInCart(j11, cartType);
        }

        public static /* synthetic */ p observeCartState$default(CartService cartService, boolean z11, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observeCartState");
            }
            if ((i11 & 1) != 0) {
                z11 = false;
            }
            return cartService.observeCartState(z11);
        }

        public static /* synthetic */ p observeCartStateChanged$default(CartService cartService, CartSource cartSource, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observeCartStateChanged");
            }
            if ((i11 & 1) != 0) {
                cartSource = CartSource.REMOTE;
            }
            return cartService.observeCartStateChanged(cartSource);
        }

        public static /* synthetic */ InterfaceC2395h observeCartStateFlow$default(CartService cartService, boolean z11, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observeCartStateFlow");
            }
            if ((i11 & 1) != 0) {
                z11 = false;
            }
            return cartService.observeCartStateFlow(z11);
        }

        public static /* synthetic */ InterfaceC2395h observeFamilyCartStateFlow$default(CartService cartService, boolean z11, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observeFamilyCartStateFlow");
            }
            if ((i11 & 1) != 0) {
                z11 = false;
            }
            return cartService.observeFamilyCartStateFlow(z11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AbstractC7094b removeProductFromCart$default(CartService cartService, String str, int i11, Long l11, Map map, Long l12, Boolean bool, Map map2, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeProductFromCart");
            }
            if ((i12 & 32) != 0) {
                bool = null;
            }
            if ((i12 & 64) != 0) {
                map2 = null;
            }
            return cartService.removeProductFromCart(str, i11, l11, map, l12, bool, map2);
        }

        public static /* synthetic */ void setItems$default(CartService cartService, Map map, CartSource cartSource, CartChangeSource cartChangeSource, CartPrefetchState cartPrefetchState, CartType cartType, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setItems");
            }
            if ((i11 & 2) != 0) {
                cartSource = CartSource.LOCAL;
            }
            CartSource cartSource2 = cartSource;
            CartChangeSource cartChangeSource2 = (i11 & 4) != 0 ? null : cartChangeSource;
            CartPrefetchState cartPrefetchState2 = (i11 & 8) != 0 ? null : cartPrefetchState;
            if ((i11 & 16) != 0) {
                cartType = CartType.MAIN_CART;
            }
            cartService.setItems(map, cartSource2, cartChangeSource2, cartPrefetchState2, cartType);
        }

        public static /* synthetic */ AbstractC7094b updateCart$default(CartService cartService, CartPrefetchState cartPrefetchState, String str, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateCart");
            }
            if ((i11 & 1) != 0) {
                cartPrefetchState = null;
            }
            if ((i11 & 2) != 0) {
                str = null;
            }
            return cartService.updateCart(cartPrefetchState, str);
        }
    }

    @NotNull
    y<CartAddItemDTO> addMultipleProductsWithCustomAnalytics(@NotNull AddProductsWithTokenizedAnalytics params);

    @NotNull
    y<CartAddItemDTO> addMultipleProductsWithPrefetch(@NotNull AddProductsToCartParams params);

    @NotNull
    AbstractC7094b addProductToCart(@NotNull String productId, int quantity, Long selectedDeliverySchema, Map<String, TokenizedTrackingInfo> trackingInfo, Long widgetId, @NotNull String actionId, Long sortAfterSku, Boolean forStars, Boolean wholeQuant, Map<String, String> params);

    @NotNull
    y<CartAddItemDTO> addProductToCartWithResponseResult(@NotNull String productId, int quantity, Long selectedDeliverySchema, Map<String, TokenizedTrackingInfo> trackingInfo, Long widgetId, @NotNull String actionId, Long sortAfterSku, Boolean forStars, Boolean wholeQuant, Map<String, String> params, NotificationDTO showErrorNotification);

    void attach(@NotNull l tokenizedAnalytics);

    void clearCart(@NotNull CartPrefetchState cartPrefetchState);

    @NotNull
    B0<AddToCartRequestState> getAddToCartRequestState();

    @NotNull
    InterfaceC2395h<CartAction> getCartActionsFlow();

    @NotNull
    B0<CartInfoUpdate> getCartInfoUpdateSharedFlow();

    @InterfaceC3999a
    @NotNull
    CartState getCartState();

    @NotNull
    CartState getCartStateByCartType(@NotNull CartType cartType);

    int getProductInCartCount(long id2, @NotNull CartType cartType);

    boolean isProductInCart(long id2, @NotNull CartType cartType);

    @InterfaceC3999a
    @NotNull
    p<CartAction> observeCartActions();

    @InterfaceC3999a
    @NotNull
    p<CartState> observeCartState(boolean allEvents);

    @InterfaceC3999a
    @NotNull
    p<CartState> observeCartStateChanged(@NotNull CartSource source);

    @NotNull
    InterfaceC2395h<CartState> observeCartStateFlow(boolean allEvents);

    @NotNull
    InterfaceC2395h<CartState> observeFamilyCartStateFlow(boolean allEvents);

    @NotNull
    AbstractC7094b removeProductFromCart(@NotNull String productId, int quantity, Long selectedDeliverySchema, Map<String, TokenizedTrackingInfo> trackingInfo, Long widgetId, Boolean forStars, Map<String, String> params);

    void setItems(@NotNull Map<Long, CartItemInfo> items, @NotNull CartSource source, CartChangeSource cartChangeSource, CartPrefetchState cartPrefetchState, @NotNull CartType cartType);

    @NotNull
    AbstractC7094b updateCart(CartPrefetchState cartPrefetchState, String miniAppName);
}
