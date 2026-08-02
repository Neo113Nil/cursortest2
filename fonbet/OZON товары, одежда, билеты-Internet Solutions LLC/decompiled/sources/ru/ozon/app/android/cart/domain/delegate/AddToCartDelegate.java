package ru.ozon.app.android.cart.domain.delegate;

import Bc.l;
import Bc.w;
import Mc.a;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.reactivex.AbstractC7094b;
import io.reactivex.y;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.common.data.CartAddItemDTO;
import ru.ozon.app.android.cart.common.domain.CartType;
import ru.ozon.app.android.cart.common.domain.CartTypeKt;
import ru.ozon.app.android.cart.common.models.AddProductsWithTokenizedAnalytics;
import ru.ozon.app.android.cart.common.models.CartItemInfo;
import ru.ozon.app.android.cart.common.models.events.ProductTokenizedCartAnalyticsEvent;
import ru.ozon.app.android.cart.common.models.events.TokenizedCartAnalyticsEvent;
import ru.ozon.app.android.cart.common.models.events.TokenizedCartType;
import ru.ozon.app.android.cart.domain.CartDomainInteractor;
import ru.ozon.app.android.cart.domain.CartManager;
import ru.ozon.app.android.cart.domain.model.CartAnalyticModel;
import ru.ozon.app.android.cart.domain.model.RemoveProductWithTokenizedAnalyticsParams;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.tracker.sendEvent.ActionType;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import vc.C10301f;
import vc.j;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u009f\u0001\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00172\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\"\u001a\u00020\u00112\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010$2\u0016\b\u0002\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b,\u0010-Jk\u0010/\u001a\u00020.2\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00172\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\u0016\b\u0002\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e¢\u0006\u0004\b/\u00100R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00101R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102¨\u00063"}, d2 = {"Lru/ozon/app/android/cart/domain/delegate/AddToCartDelegate;", "", "Lru/ozon/app/android/cart/domain/CartManager;", "cartManager", "Lru/ozon/app/android/cart/domain/CartDomainInteractor;", "cartDomainInteractor", "<init>", "(Lru/ozon/app/android/cart/domain/CartManager;Lru/ozon/app/android/cart/domain/CartDomainInteractor;)V", "Lru/ozon/app/android/cart/domain/model/CartAnalyticModel;", "analyticModel", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "createCartTokenizedEvent", "(Lru/ozon/app/android/cart/domain/model/CartAnalyticModel;)LWZ/t;", "", "quantityFromRequest", "quantityInCart", "", "operationId", "computeQtyForAnalytic", "(IILjava/lang/String;)I", "Lru/ozon/app/android/cart/common/domain/CartType;", "cartType", "", "id", "getQuantityInCart", "(Lru/ozon/app/android/cart/common/domain/CartType;J)I", "productId", "quantity", "selectedDeliverySchema", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "widgetId", "actionId", "sortAfterSku", "", "forStars", "wholeQuant", "params", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "showErrorNotification", "Lio/reactivex/y;", "Lru/ozon/app/android/cart/common/data/CartAddItemDTO;", "addProductToCartWithResponseResult", "(Ljava/lang/String;ILjava/lang/Long;Ljava/util/Map;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/Map;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)Lio/reactivex/y;", "Lio/reactivex/b;", "removeProductFromCart", "(Ljava/lang/String;ILjava/lang/Long;Ljava/util/Map;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/util/Map;)Lio/reactivex/b;", "Lru/ozon/app/android/cart/domain/CartManager;", "Lru/ozon/app/android/cart/domain/CartDomainInteractor;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AddToCartDelegate {

    @NotNull
    private final CartDomainInteractor cartDomainInteractor;

    @NotNull
    private final CartManager cartManager;

    public AddToCartDelegate(@NotNull CartManager cartManager, @NotNull CartDomainInteractor cartDomainInteractor) {
        Intrinsics.checkNotNullParameter(cartManager, "cartManager");
        Intrinsics.checkNotNullParameter(cartDomainInteractor, "cartDomainInteractor");
        this.cartManager = cartManager;
        this.cartDomainInteractor = cartDomainInteractor;
    }

    public static /* synthetic */ y addProductToCartWithResponseResult$default(AddToCartDelegate addToCartDelegate, String str, int i11, Long l11, Map map, Long l12, String str2, Long l13, Boolean bool, Boolean bool2, Map map2, NotificationDTO notificationDTO, int i12, Object obj) {
        NotificationDTO notificationDTO2;
        AddToCartDelegate addToCartDelegate2;
        String str3;
        int i13;
        Long l14;
        Map map3;
        Long l15;
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
            addToCartDelegate2 = addToCartDelegate;
        } else {
            notificationDTO2 = notificationDTO;
            addToCartDelegate2 = addToCartDelegate;
            str3 = str;
            i13 = i11;
            l14 = l11;
            map3 = map;
            l15 = l12;
        }
        return addToCartDelegate2.addProductToCartWithResponseResult(str3, i13, l14, map3, l15, str4, l16, bool3, bool4, map4, notificationDTO2);
    }

    private final int computeQtyForAnalytic(int quantityFromRequest, int quantityInCart, String operationId) {
        return (Intrinsics.d(operationId, "removeFromCart") || Intrinsics.d(operationId, "minusButtonClick")) ? quantityInCart - quantityFromRequest : quantityFromRequest - quantityInCart;
    }

    private final t createCartTokenizedEvent(CartAnalyticModel analyticModel) {
        String type = (analyticModel.getQuantity() == 0 || Intrinsics.d(analyticModel.getOperationId(), "removeFromCart")) ? ActionType.REMOVE.INSTANCE.getType() : (analyticModel.getQuantity() == 1 && Intrinsics.d(analyticModel.getOperationId(), "plusButtonClick")) ? ActionType.TO_CART.INSTANCE.getType() : Intrinsics.d(analyticModel.getOperationId(), "minusButtonClick") ? ActionType.DECREMENT.INSTANCE.getType() : (!Intrinsics.d(analyticModel.getOperationId(), "plusButtonClick") || analyticModel.getQuantity() <= 1) ? ActionType.TO_CART.INSTANCE.getType() : ActionType.INCREMENT.INSTANCE.getType();
        Map<String, TokenizedTrackingInfo> event = analyticModel.getEvent();
        if (event != null) {
            return TrackingInfoMapperKt.toTokenizedEvent(event, analyticModel.getWidgetId(), type);
        }
        return null;
    }

    private final int getQuantityInCart(CartType cartType, long id2) {
        CartItemInfo cartItemInfo = this.cartManager.getCartStateByCartType(cartType).getItems().get(Long.valueOf(id2));
        if (cartItemInfo != null) {
            return cartItemInfo.getQuantity();
        }
        return 0;
    }

    @NotNull
    public final y<CartAddItemDTO> addProductToCartWithResponseResult(@NotNull String productId, int quantity, Long selectedDeliverySchema, Map<String, TokenizedTrackingInfo> trackingInfo, Long widgetId, @NotNull String actionId, Long sortAfterSku, Boolean forStars, Boolean wholeQuant, Map<String, String> params, NotificationDTO showErrorNotification) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        Long y02 = h.y0(productId);
        if (y02 == null) {
            l e11 = y.e(new NullPointerException("Product id must not be null"));
            Intrinsics.checkNotNullExpressionValue(e11, "error(...)");
            return e11;
        }
        long longValue = y02.longValue();
        CartType cartType = CartTypeKt.getCartType(params);
        int computeQtyForAnalytic = computeQtyForAnalytic(quantity, getQuantityInCart(cartType, longValue), actionId);
        t createCartTokenizedEvent = createCartTokenizedEvent(new CartAnalyticModel(quantity, actionId, widgetId, trackingInfo));
        w j11 = this.cartDomainInteractor.addProductsWithTokenizedAnalytics(new AddProductsWithTokenizedAnalytics(U.i(new Pair(y02, new CartItemInfo(quantity, selectedDeliverySchema, sortAfterSku, forStars, wholeQuant, params))), createCartTokenizedEvent != null ? C7714v.a0(new ProductTokenizedCartAnalyticsEvent(longValue, new TokenizedCartAnalyticsEvent(new TokenizedCartType.ChangeCartType(computeQtyForAnalytic), createCartTokenizedEvent))) : K.f71697a, null, widgetId, cartType, 4, null), showErrorNotification).j(a.b());
        Intrinsics.checkNotNullExpressionValue(j11, "subscribeOn(...)");
        return j11;
    }

    @NotNull
    public final AbstractC7094b removeProductFromCart(@NotNull String productId, int quantity, Long selectedDeliverySchema, Map<String, TokenizedTrackingInfo> trackingInfo, Long widgetId, Boolean forStars, Map<String, String> params) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Long y02 = h.y0(productId);
        if (y02 == null) {
            C10301f h11 = AbstractC7094b.h(new NullPointerException("Product id must not be null"));
            Intrinsics.checkNotNullExpressionValue(h11, "error(...)");
            return h11;
        }
        long longValue = y02.longValue();
        CartType cartType = CartTypeKt.getCartType(params);
        int quantityInCart = getQuantityInCart(cartType, longValue) - quantity;
        t createCartTokenizedEvent = createCartTokenizedEvent(new CartAnalyticModel(quantityInCart, "removeFromCart", widgetId, trackingInfo));
        j jVar = new j(this.cartDomainInteractor.removeProductWithTokenizedAnalytics(new RemoveProductWithTokenizedAnalyticsParams(longValue, selectedDeliverySchema, createCartTokenizedEvent != null ? C7714v.a0(new ProductTokenizedCartAnalyticsEvent(longValue, new TokenizedCartAnalyticsEvent(new TokenizedCartType.ChangeCartType(quantityInCart), createCartTokenizedEvent))) : K.f71697a, null, forStars, widgetId, params, cartType, 8, null)).j(a.b()));
        Intrinsics.checkNotNullExpressionValue(jVar, "ignoreElement(...)");
        return jVar;
    }
}
