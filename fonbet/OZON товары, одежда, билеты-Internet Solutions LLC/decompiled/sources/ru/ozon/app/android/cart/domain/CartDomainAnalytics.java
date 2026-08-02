package ru.ozon.app.android.cart.domain;

import Lm0.a;
import Sc.o;
import UZ.d;
import WZ.e;
import WZ.g;
import WZ.l;
import WZ.t;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.cart.common.data.Cart;
import ru.ozon.app.android.cart.common.data.CartItemResponse;
import ru.ozon.app.android.cart.common.data.CartItemTracking;
import ru.ozon.app.android.cart.common.models.events.ProductTokenizedCartAnalyticsEvent;
import ru.ozon.app.android.cart.common.models.events.TokenizedCartAnalyticsEvent;
import ru.ozon.app.android.cart.common.models.events.TokenizedCartType;
import ru.ozon.app.android.cart.common.presentation.utils.ExtensionsKt;
import ru.ozon.app.android.cart.domain.CartDomainAnalytics;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 )2\u00020\u0001:\u0001)B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000b\u001a\u00060\bj\u0002`\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0016\u001a\u00020\u00102\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014¢\u0006\u0004\b\u0016\u0010\u0017J;\u0010\u001d\u001a\u00020\u00102\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\r\u0018\u00010\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u001b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ5\u0010&\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010!¢\u0006\u0004\b&\u0010'R\u001e\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010(¨\u0006*"}, d2 = {"Lru/ozon/app/android/cart/domain/CartDomainAnalytics;", "", "<init>", "()V", "", "deliverySchema", "", "totalQuantity", "LWZ/g;", "Lru/ozon/app/android/analytics/modules/tokenized/CustomizedEventParams;", "customizedEventParams", "modifyTrackerEvent", "(Ljava/lang/Long;ILWZ/g;)LWZ/g;", "Lru/ozon/app/android/cart/common/data/CartItemTracking;", "cartItemTracking", "widgetId", "", "processTrackingItem", "(Lru/ozon/app/android/cart/common/data/CartItemTracking;Ljava/lang/Long;)V", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "attach", "(LWZ/l;)V", "", "", "trackingInfo", "", "addProductSetId", "trackPreToCart", "(Ljava/util/Map;Ljava/util/Set;Ljava/lang/Long;)V", "Lru/ozon/app/android/cart/common/data/Cart;", "cart", "", "Lru/ozon/app/android/cart/common/models/events/ProductTokenizedCartAnalyticsEvent;", "events", "Lru/ozon/app/android/cart/common/models/events/TokenizedCartAnalyticsEvent;", "additionalAnalyticsEvent", "trackToCart", "(Lru/ozon/app/android/cart/common/data/Cart;Ljava/util/List;Ljava/util/List;)V", "LWZ/l;", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartDomainAnalytics {
    private l tokenizedAnalytics;

    private final g modifyTrackerEvent(Long deliverySchema, int totalQuantity, g customizedEventParams) {
        Map<String, Object> b11 = customizedEventParams.b();
        if (b11 == null) {
            b11 = U.c();
        }
        LinkedHashMap u11 = U.u(b11);
        u11.put("total_quantity", Integer.valueOf(totalQuantity));
        if (deliverySchema != null) {
            u11.put("selectedDeliverySchema", Long.valueOf(deliverySchema.longValue()));
        }
        return g.a(customizedEventParams, u11, null, 2);
    }

    private final void processTrackingItem(CartItemTracking cartItemTracking, Long widgetId) {
        t mapToTokenizedEvent$default;
        l lVar;
        try {
            Map<String, TokenizedTrackingInfo> trackingInfo = cartItemTracking.getTrackingInfo();
            if (trackingInfo == null || (mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, widgetId, null, 2, null)) == null || (lVar = this.tokenizedAnalytics) == null) {
                return;
            }
            TokenizedAnalyticsExtensionsKt.processAnyEvents$default(lVar, mapToTokenizedEvent$default, null, 2, null);
        } catch (Exception e11) {
            a.f17149a.e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g trackToCart$lambda$3$lambda$2(CartDomainAnalytics cartDomainAnalytics, Long l11, int i11, UZ.a event, g params) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(params, "params");
        if (event instanceof d) {
            return cartDomainAnalytics.modifyTrackerEvent(l11, i11, params);
        }
        return null;
    }

    public final void attach(@NotNull l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.tokenizedAnalytics = tokenizedAnalytics;
    }

    public final void trackPreToCart(Map<String, CartItemTracking> trackingInfo, @NotNull Set<Long> addProductSetId, Long widgetId) {
        Intrinsics.checkNotNullParameter(addProductSetId, "addProductSetId");
        if (trackingInfo == null || trackingInfo.isEmpty() || addProductSetId.isEmpty()) {
            return;
        }
        for (Map.Entry<String, CartItemTracking> entry : trackingInfo.entrySet()) {
            String key = entry.getKey();
            CartItemTracking value = entry.getValue();
            Long y02 = h.y0(key);
            if (y02 != null && addProductSetId.contains(y02)) {
                processTrackingItem(value, widgetId);
            }
        }
    }

    public final void trackToCart(Cart cart, @NotNull List<ProductTokenizedCartAnalyticsEvent> events, List<TokenizedCartAnalyticsEvent> additionalAnalyticsEvent) {
        CartItemResponse cartItemResponse;
        List<CartItemResponse> cartItems;
        Object obj;
        Intrinsics.checkNotNullParameter(events, "events");
        l lVar = this.tokenizedAnalytics;
        if (lVar == null) {
            return;
        }
        for (ProductTokenizedCartAnalyticsEvent productTokenizedCartAnalyticsEvent : events) {
            if (cart == null || (cartItems = cart.getCartItems()) == null) {
                cartItemResponse = null;
            } else {
                Iterator<T> it = cartItems.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((CartItemResponse) obj).getId() == productTokenizedCartAnalyticsEvent.getProductId()) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                cartItemResponse = (CartItemResponse) obj;
            }
            final Long selectedDeliverySchema = cartItemResponse != null ? cartItemResponse.getSelectedDeliverySchema() : null;
            final int qty = cartItemResponse != null ? cartItemResponse.getQty() : 0;
            TokenizedCartType type = productTokenizedCartAnalyticsEvent.getEvent().getType();
            if (type instanceof TokenizedCartType.ChangeCartType) {
                HashMap hashMap = new HashMap();
                if (selectedDeliverySchema != null) {
                    hashMap.put("selectedDeliverySchema", selectedDeliverySchema);
                }
                hashMap.put("total_quantity", Integer.valueOf(qty));
                ExtensionsKt.processChangeCart$default(lVar, productTokenizedCartAnalyticsEvent.getEvent().getTokenizedEvent(), ((TokenizedCartType.ChangeCartType) type).getQuantity(), hashMap, null, 8, null);
            } else {
                if (!(type instanceof TokenizedCartType.FilterCartType)) {
                    throw new o();
                }
                lVar.f(productTokenizedCartAnalyticsEvent.getEvent().getTokenizedEvent(), ((TokenizedCartType.FilterCartType) type).getFilter(), new e() { // from class: Fn.a
                    @Override // WZ.e
                    public final g modifyParams(UZ.a aVar, g gVar) {
                        g trackToCart$lambda$3$lambda$2;
                        trackToCart$lambda$3$lambda$2 = CartDomainAnalytics.trackToCart$lambda$3$lambda$2(CartDomainAnalytics.this, selectedDeliverySchema, qty, (UZ.d) aVar, gVar);
                        return trackToCart$lambda$3$lambda$2;
                    }
                });
            }
        }
        if (additionalAnalyticsEvent != null) {
            for (TokenizedCartAnalyticsEvent tokenizedCartAnalyticsEvent : additionalAnalyticsEvent) {
                TokenizedCartType type2 = tokenizedCartAnalyticsEvent.getType();
                if (type2 instanceof TokenizedCartType.ChangeCartType) {
                    ExtensionsKt.processChangeCart$default(lVar, tokenizedCartAnalyticsEvent.getTokenizedEvent(), ((TokenizedCartType.ChangeCartType) type2).getQuantity(), null, null, 12, null);
                } else {
                    if (!(type2 instanceof TokenizedCartType.FilterCartType)) {
                        throw new o();
                    }
                    lVar.f(tokenizedCartAnalyticsEvent.getTokenizedEvent(), ((TokenizedCartType.FilterCartType) type2).getFilter(), null);
                }
            }
        }
    }
}
