package ru.ozon.app.android.orderdetails.orderactions.v1.presentation;

import He.b;
import W10.c;
import WZ.l;
import WZ.t;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import h3.C6788a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.NonViewFilter;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.models.CartItemInfo;
import ru.ozon.app.android.cart.common.models.events.ProductTokenizedCartAnalyticsEvent;
import ru.ozon.app.android.cart.common.models.events.TokenizedCartAnalyticsEvent;
import ru.ozon.app.android.cart.common.models.events.TokenizedCartType;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.delivery.customActionsHandlers.fetchcancelreasons.data.CancelReasonsRepository;
import ru.ozon.app.android.orderdetails.orderactions.v1.data.DataForReorder;
import ru.ozon.app.android.orderdetails.orderactions.v1.data.ReorderProductItem;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B%\b\u0007\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001e*\u00020\u0018H\u0002¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b'\u0010\u0011J\u001f\u0010)\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020(2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b)\u0010*R\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010+R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010,R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010-R\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020/0.8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00064"}, d2 = {"Lru/ozon/app/android/orderdetails/orderactions/v1/presentation/OrderActionsViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/CancelReasonsRepository;", "cancelReasonsRepository", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Lru/ozon/app/android/cart/common/domain/CartService;Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/CancelReasonsRepository;)V", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "LW10/c;", "trackingData", "", "fetchCancelReasons", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;LW10/c;)V", "", "serializedData", "Lru/ozon/app/android/orderdetails/orderactions/v1/presentation/OrderActionVO;", "item", "processReorder", "(Ljava/lang/String;Lru/ozon/app/android/orderdetails/orderactions/v1/presentation/OrderActionVO;)V", "Lru/ozon/app/android/orderdetails/orderactions/v1/data/DataForReorder;", "data", "", "Lru/ozon/app/android/cart/common/models/events/ProductTokenizedCartAnalyticsEvent;", "mapToAnalyticEvents", "(Lru/ozon/app/android/orderdetails/orderactions/v1/data/DataForReorder;Lru/ozon/app/android/orderdetails/orderactions/v1/presentation/OrderActionVO;)Ljava/util/List;", "", "", "Lru/ozon/app/android/cart/common/models/CartItemInfo;", "toMap", "(Lru/ozon/app/android/orderdetails/orderactions/v1/data/DataForReorder;)Ljava/util/Map;", "LWZ/l;", "tokenizedAnalytics", "attachTokenizedAnalytics", "(LWZ/l;)V", "processComposerAction", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "processCustomActionClick", "(Lru/ozon/uni/atoms/af/AtomAction$Click;Lru/ozon/app/android/orderdetails/orderactions/v1/presentation/OrderActionVO;)V", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/cart/common/domain/CartService;", "Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/CancelReasonsRepository;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/orderdetails/orderactions/v1/presentation/Action;", "actions", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getActions", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrderActionsViewModel extends w0 {

    @NotNull
    private final SingleLiveEvent<Action> actions;

    @NotNull
    private final CancelReasonsRepository cancelReasonsRepository;

    @NotNull
    private final CartService cartService;

    @NotNull
    private final JsonParser jsonDeserializer;

    public OrderActionsViewModel(@NotNull JsonParser jsonDeserializer, @NotNull CartService cartService, @NotNull CancelReasonsRepository cancelReasonsRepository) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        Intrinsics.checkNotNullParameter(cancelReasonsRepository, "cancelReasonsRepository");
        this.jsonDeserializer = jsonDeserializer;
        this.cartService = cartService;
        this.cancelReasonsRepository = cancelReasonsRepository;
        this.actions = new SingleLiveEvent<>();
    }

    private final void fetchCancelReasons(AtomAction.ComposerAction action, c trackingData) {
        C10727i.c(x0.a(this), null, null, new OrderActionsViewModel$fetchCancelReasons$1(this, action, trackingData, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ProductTokenizedCartAnalyticsEvent> mapToAnalyticEvents(DataForReorder data, OrderActionVO item) {
        List<ReorderProductItem> products = data.getProducts();
        ArrayList arrayList = new ArrayList();
        for (ReorderProductItem reorderProductItem : products) {
            Map<String, TokenizedTrackingInfo> toCartTrackingInfo = reorderProductItem.getToCartTrackingInfo();
            ProductTokenizedCartAnalyticsEvent productTokenizedCartAnalyticsEvent = null;
            if (toCartTrackingInfo != null) {
                t tokenizedEvent$default = TrackingInfoMapperKt.toTokenizedEvent$default(toCartTrackingInfo, item != null ? Long.valueOf(item.getId()) : null, null, 2, null);
                if (tokenizedEvent$default != null) {
                    productTokenizedCartAnalyticsEvent = new ProductTokenizedCartAnalyticsEvent(Long.parseLong(reorderProductItem.getSku()), new TokenizedCartAnalyticsEvent(new TokenizedCartType.FilterCartType(NonViewFilter.INSTANCE), tokenizedEvent$default));
                }
            }
            if (productTokenizedCartAnalyticsEvent != null) {
                arrayList.add(productTokenizedCartAnalyticsEvent);
            }
        }
        return arrayList;
    }

    private final void processReorder(String serializedData, OrderActionVO item) {
        C6788a a11 = x0.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(a11, b.f10879b, null, new OrderActionsViewModel$processReorder$1(this, serializedData, item, null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<Long, CartItemInfo> toMap(DataForReorder dataForReorder) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (ReorderProductItem reorderProductItem : dataForReorder.getProducts()) {
            Long y02 = h.y0(reorderProductItem.getSku());
            if (y02 != null) {
                linkedHashMap.put(Long.valueOf(y02.longValue()), new CartItemInfo(reorderProductItem.getQuantity(), reorderProductItem.getSelectedDeliverySchema(), null, null, null, null, 60, null));
            }
        }
        return linkedHashMap;
    }

    public final void attachTokenizedAnalytics(@NotNull l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.cartService.attach(tokenizedAnalytics);
    }

    @NotNull
    public final SingleLiveEvent<Action> getActions() {
        return this.actions;
    }

    public final void processComposerAction(@NotNull AtomAction.ComposerAction action, @NotNull c trackingData) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        if (Intrinsics.d(action.getId(), "fetchCancelReasons")) {
            fetchCancelReasons(action, trackingData);
        }
    }

    public final void processCustomActionClick(@NotNull AtomAction.Click action, OrderActionVO item) {
        Map<String, String> params;
        Map<String, String> params2;
        String str;
        if (!Tl.b.i(action, "action", "reOrder") || (params = action.getParams()) == null || !params.containsKey("reOrderInfo") || (params2 = action.getParams()) == null || (str = params2.get("reOrderInfo")) == null) {
            return;
        }
        if (str.length() <= 0) {
            str = null;
        }
        if (str != null) {
            processReorder(str, item);
        }
    }
}
