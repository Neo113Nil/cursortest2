package ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation.pdp;

import Ae.I;
import Ae.InterfaceC2395h;
import Ge.n;
import WZ.l;
import WZ.t;
import WZ.x;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import h20.InterfaceC6786a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.domain.CartState;
import ru.ozon.app.android.cart.common.models.CartItemInfo;
import ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation.AddToCartParams;
import ru.ozon.tracker.sendEvent.ActionType;
import xe.C10727i;
import xe.E0;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u0000 02\u00020\u00012\u00020\u0002:\u00010B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\b\u0010\tJ=\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001d\u001a\u0004\u0018\u00010\f2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\u001f\u001a\u0004\u0018\u00010\n2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u0010¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010$\u001a\u0010\u0012\f\u0012\n #*\u0004\u0018\u00010\"0\"0!¢\u0006\u0004\b$\u0010%JM\u0010)\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u000e2\b\u0010(\u001a\u0004\u0018\u00010\n2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\n¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010-R\u0018\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010.R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010/¨\u00061"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/pdp/StickyTotalPDPViewModel;", "Landroidx/lifecycle/w0;", "Lh20/a;", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Lru/ozon/app/android/cart/common/domain/CartService;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "", "widgetId", "", "actionId", "", "quantity", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "", "sendImmediateAnalytics", "(JLjava/lang/String;ILjava/util/Map;)V", "onCleared", "()V", "LWZ/l;", "tokenizedAnalytics", "attachAnalyticsHandler", "(LWZ/l;)V", "params", "getSKU", "(Ljava/util/Map;)Ljava/lang/String;", "getDeliverySchema", "(Ljava/util/Map;)Ljava/lang/Long;", "LAe/h;", "Lru/ozon/app/android/cart/common/domain/CartState;", "kotlin.jvm.PlatformType", "observeCartState", "()LAe/h;", "sku", "desiredQuantity", "deliverySchema", "addToCart", "(JLjava/lang/String;Ljava/lang/String;ILjava/lang/Long;Ljava/util/Map;)V", "getProductInCartQuantity", "(J)I", "Lru/ozon/app/android/cart/common/domain/CartService;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "LWZ/l;", "Companion", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StickyTotalPDPViewModel extends w0 implements InterfaceC6786a {

    @NotNull
    private final CartService cartService;

    @NotNull
    private final JsonParser jsonDeserializer;
    private l tokenizedAnalytics;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/pdp/StickyTotalPDPViewModel$Companion;", "", "<init>", "()V", "ADD_TO_CART_PARAMS_KEY", "", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public StickyTotalPDPViewModel(@NotNull CartService cartService, @NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.cartService = cartService;
        this.jsonDeserializer = jsonDeserializer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendImmediateAnalytics(long widgetId, String actionId, int quantity, Map<String, TokenizedTrackingInfo> trackingInfo) {
        String type = (quantity == 0 || Intrinsics.d(actionId, "removeFromCart")) ? ActionType.REMOVE.INSTANCE.getType() : (quantity == 1 && Intrinsics.d(actionId, "plusButtonClick")) ? ActionType.TO_CART.INSTANCE.getType() : Intrinsics.d(actionId, "minusButtonClick") ? ActionType.DECREMENT.INSTANCE.getType() : (!Intrinsics.d(actionId, "plusButtonClick") || quantity <= 1) ? ActionType.TO_CART.INSTANCE.getType() : ActionType.INCREMENT.INSTANCE.getType();
        if (trackingInfo != null) {
            t b11 = x.b(trackingInfo, Long.valueOf(widgetId), type);
            l lVar = this.tokenizedAnalytics;
            if (lVar != null) {
                TokenizedAnalyticsExtensionsKt.processClickEvents$default(lVar, b11, null, 2, null);
            }
        }
    }

    public final void addToCart(long widgetId, @NotNull String actionId, @NotNull String sku, int desiredQuantity, Long deliverySchema, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        Intrinsics.checkNotNullParameter(sku, "sku");
        C10727i.c(x0.a(this), null, null, new StickyTotalPDPViewModel$addToCart$1(this, widgetId, actionId, desiredQuantity, trackingInfo, sku, deliverySchema, null), 3);
    }

    public final void attachAnalyticsHandler(@NotNull l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.cartService.attach(tokenizedAnalytics);
    }

    public final Long getDeliverySchema(@NotNull Map<String, String> params) {
        AddToCartParams.CartItem cartItem;
        Intrinsics.checkNotNullParameter(params, "params");
        String str = params.get("postData");
        if (str == null || (cartItem = (AddToCartParams.CartItem) C7714v.M(((AddToCartParams) this.jsonDeserializer.fromJson(str, AddToCartParams.class)).getItems())) == null) {
            return null;
        }
        return cartItem.getSelectedDeliverySchema();
    }

    public final int getProductInCartQuantity(long sku) {
        CartItemInfo cartItemInfo = this.cartService.getCartState().getItems().get(Long.valueOf(sku));
        if (cartItemInfo != null) {
            return cartItemInfo.getQuantity();
        }
        return 0;
    }

    public final String getSKU(@NotNull Map<String, String> params) {
        AddToCartParams.CartItem cartItem;
        Intrinsics.checkNotNullParameter(params, "params");
        String str = params.get("postData");
        if (str == null || (cartItem = (AddToCartParams.CartItem) C7714v.M(((AddToCartParams) this.jsonDeserializer.fromJson(str, AddToCartParams.class)).getItems())) == null) {
            return null;
        }
        return cartItem.getId();
    }

    @NotNull
    public final InterfaceC2395h<CartState> observeCartState() {
        return new I(n.a(CartService.DefaultImpls.observeCartState$default(this.cartService, false, 1, null)));
    }

    @Override // androidx.lifecycle.w0
    public void onCleared() {
        E0.d(x0.a(this).getCoroutineContext());
    }
}
