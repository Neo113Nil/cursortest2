package ru.ozon.app.android.delivery.customActionsHandlers.reorder;

import WZ.b;
import WZ.t;
import androidx.lifecycle.K;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.cart.common.data.CartAddItemDTO;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.models.CartItemInfo;
import ru.ozon.app.android.cart.common.models.events.ProductTokenizedCartAnalyticsEvent;
import ru.ozon.app.android.cart.common.models.events.TokenizedCartAnalyticsEvent;
import ru.ozon.app.android.cart.common.models.events.TokenizedCartType;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.delivery.customActionsHandlers.reorder.DataForReorder;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10727i;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 +2\u00020\u0001:\u0001+B%\b\u0007\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ*\u0010\u0011\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001a0\u0019*\u00020\u0013H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010#R\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010$R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010%R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010&R\u001a\u0010'\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lru/ozon/app/android/delivery/customActionsHandlers/reorder/ReorderActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "coroutineDispatcherProvider", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Lru/ozon/app/android/cart/common/domain/CartService;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;)V", "", "reorderInfo", "", "voId", "Lru/ozon/app/android/cart/common/data/CartAddItemDTO;", "kotlin.jvm.PlatformType", "addToCart", "(Ljava/lang/String;Ljava/lang/Long;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/delivery/customActionsHandlers/reorder/DataForReorder;", "data", "", "Lru/ozon/app/android/cart/common/models/events/ProductTokenizedCartAnalyticsEvent;", "mapToAnalyticsEvents", "(Lru/ozon/app/android/delivery/customActionsHandlers/reorder/DataForReorder;Ljava/lang/Long;)Ljava/util/List;", "", "Lru/ozon/app/android/cart/common/models/CartItemInfo;", "toMap", "(Lru/ozon/app/android/delivery/customActionsHandlers/reorder/DataForReorder;)Ljava/util/Map;", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/cart/common/domain/CartService;", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "Companion", "custom-action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ReorderActionHandler extends CustomActionHandler {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final String actionId;

    @NotNull
    private final CartService cartService;

    @NotNull
    private final CoroutineDispatcherProvider coroutineDispatcherProvider;

    @NotNull
    private final JsonParser jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/delivery/customActionsHandlers/reorder/ReorderActionHandler$Companion;", "", "<init>", "()V", "PARAM_REORDER_INFO", "", "custom-action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ReorderActionHandler(@NotNull JsonParser jsonDeserializer, @NotNull CartService cartService, @NotNull CoroutineDispatcherProvider coroutineDispatcherProvider) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        Intrinsics.checkNotNullParameter(coroutineDispatcherProvider, "coroutineDispatcherProvider");
        this.jsonDeserializer = jsonDeserializer;
        this.cartService = cartService;
        this.coroutineDispatcherProvider = coroutineDispatcherProvider;
        this.actionId = "reOrder";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object addToCart(String str, Long l11, d<? super CartAddItemDTO> dVar) {
        return C10727i.f(this.coroutineDispatcherProvider.getIO(), new ReorderActionHandler$addToCart$2(this, str, l11, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ProductTokenizedCartAnalyticsEvent> mapToAnalyticsEvents(DataForReorder data, Long voId) {
        t tokenizedEvent$default;
        List<DataForReorder.ReorderProductItem> products = data.getProducts();
        ArrayList arrayList = new ArrayList();
        for (DataForReorder.ReorderProductItem reorderProductItem : products) {
            Map<String, TokenizedTrackingInfo> toCartTrackingInfo = reorderProductItem.getToCartTrackingInfo();
            ProductTokenizedCartAnalyticsEvent productTokenizedCartAnalyticsEvent = null;
            if (toCartTrackingInfo != null && (tokenizedEvent$default = TrackingInfoMapperKt.toTokenizedEvent$default(toCartTrackingInfo, voId, null, 2, null)) != null) {
                productTokenizedCartAnalyticsEvent = new ProductTokenizedCartAnalyticsEvent(Long.parseLong(reorderProductItem.getSku()), new TokenizedCartAnalyticsEvent(new TokenizedCartType.FilterCartType(b.f33354a), tokenizedEvent$default));
            }
            if (productTokenizedCartAnalyticsEvent != null) {
                arrayList.add(productTokenizedCartAnalyticsEvent);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<Long, CartItemInfo> toMap(DataForReorder dataForReorder) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (DataForReorder.ReorderProductItem reorderProductItem : dataForReorder.getProducts()) {
            Long y02 = h.y0(reorderProductItem.getSku());
            if (y02 != null) {
                linkedHashMap.put(Long.valueOf(y02.longValue()), new CartItemInfo(reorderProductItem.getQuantity(), reorderProductItem.getSelectedDeliverySchema(), null, null, null, null, 60, null));
            }
        }
        return linkedHashMap;
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    public void processAction(@NotNull AtomAction action, @NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        Map<String, String> params;
        String str;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        if (!(action instanceof AtomAction.Click) || (params = ((AtomAction.Click) action).getParams()) == null || (str = params.get("reOrderInfo")) == null) {
            return;
        }
        if (str.length() <= 0) {
            str = null;
        }
        if (str == null) {
            return;
        }
        C10727i.c(K.a(handlerRefs.getRefs().getContainer().g()), null, null, new ReorderActionHandler$processAction$1(this, str, handlerRefs, null), 3);
    }
}
