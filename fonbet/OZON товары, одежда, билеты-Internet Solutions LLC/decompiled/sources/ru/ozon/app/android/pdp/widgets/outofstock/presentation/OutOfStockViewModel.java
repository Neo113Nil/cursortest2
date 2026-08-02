package ru.ozon.app.android.pdp.widgets.outofstock.presentation;

import WZ.l;
import androidx.lifecycle.C5415f;
import androidx.lifecycle.w0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.utils.rx.RxExtKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJS\u0010\u0014\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdp/widgets/outofstock/presentation/OutOfStockViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "<init>", "(Lru/ozon/app/android/cart/common/domain/CartService;)V", "LWZ/l;", "tokenizedAnalytics", "", "attachTokenizedAnalytics", "(LWZ/l;)V", "", "widgetId", "productId", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "params", "selectedDeliverySchema", "addToCart", "(JJLjava/util/Map;Ljava/util/Map;Ljava/lang/Long;)V", "Lru/ozon/app/android/cart/common/domain/CartService;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OutOfStockViewModel extends w0 {

    @NotNull
    private final CartService cartService;

    public OutOfStockViewModel(@NotNull CartService cartService) {
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        this.cartService = cartService;
    }

    public final void addToCart(long widgetId, long productId, Map<String, TokenizedTrackingInfo> trackingInfo, Map<String, String> params, Long selectedDeliverySchema) {
        RxExtKt.plusAssign(C5415f.a(this), RxExtKt.subscribeBy$default(CartService.DefaultImpls.addProductToCart$default(this.cartService, String.valueOf(productId), 1, selectedDeliverySchema, trackingInfo, Long.valueOf(widgetId), null, null, null, null, params, 480, null), null, new OutOfStockViewModel$addToCart$1(Lm0.a.f17149a), 1, null));
    }

    public final void attachTokenizedAnalytics(@NotNull l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.cartService.attach(tokenizedAnalytics);
    }
}
