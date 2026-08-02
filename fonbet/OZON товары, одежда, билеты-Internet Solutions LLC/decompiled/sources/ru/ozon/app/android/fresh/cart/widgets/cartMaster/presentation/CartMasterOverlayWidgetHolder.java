package ru.ozon.app.android.fresh.cart.widgets.cartMaster.presentation;

import WZ.l;
import android.view.View;
import androidx.fragment.app.r;
import androidx.lifecycle.AbstractC5434v;
import d20.AbstractC6065b;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import l10.t;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.cart.common.domain.CartChangeSource;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.domain.local.CartSource;
import ru.ozon.app.android.cart.common.models.CartItemInfo;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\u0010\u000b\u001a\u00060\tj\u0002`\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u0018\u0010\u000b\u001a\u00060\tj\u0002`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartMaster/presentation/CartMasterOverlayWidgetHolder;", "Ld20/b;", "Lru/ozon/app/android/fresh/cart/widgets/cartMaster/presentation/CartMasterVO;", "Ll10/t;", "container", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Lru/ozon/app/android/fresh/cart/widgets/cartMaster/presentation/CartMasterViewModel;", "viewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Ll10/t;Lru/ozon/app/android/cart/common/domain/CartService;Lru/ozon/app/android/fresh/cart/widgets/cartMaster/presentation/CartMasterViewModel;LWZ/l;)V", "vo", "", "needUpdateCart", "(Lru/ozon/app/android/fresh/cart/widgets/cartMaster/presentation/CartMasterVO;)Z", "", "onRefresh", "()V", "item", "bind", "(Lru/ozon/app/android/fresh/cart/widgets/cartMaster/presentation/CartMasterVO;)V", "Ll10/t;", "Lru/ozon/app/android/cart/common/domain/CartService;", "Lru/ozon/app/android/fresh/cart/widgets/cartMaster/presentation/CartMasterViewModel;", "LWZ/l;", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "wasRefresh", "Z", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CartMasterOverlayWidgetHolder extends AbstractC6065b<CartMasterVO> {

    @NotNull
    private final CartService cartService;

    @NotNull
    private final t container;
    private final View metricView;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final CartMasterViewModel viewModel;
    private boolean wasRefresh;

    public CartMasterOverlayWidgetHolder(@NotNull t container, @NotNull CartService cartService, @NotNull CartMasterViewModel viewModel, @NotNull l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.container = container;
        this.cartService = cartService;
        this.viewModel = viewModel;
        this.tokenizedAnalytics = tokenizedAnalytics;
    }

    private final boolean needUpdateCart(CartMasterVO vo) {
        AbstractC5434v lifecycle;
        AbstractC5434v.b b11;
        boolean z11 = this.wasRefresh || !this.viewModel.checkIfFirstLoadProcessedAndReset();
        r a11 = this.container.a();
        return (vo != null ? vo.getSummary() : null) != null && z11 && (a11 != null && (lifecycle = a11.getLifecycle()) != null && (b11 = lifecycle.b()) != null && b11.a(AbstractC5434v.b.RESUMED));
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void onRefresh() {
        super.onRefresh();
        this.wasRefresh = true;
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull CartMasterVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        Map map = null;
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, item.getTokenizedEvent(), null, 2, null);
        if (needUpdateCart(item)) {
            this.wasRefresh = false;
            List<CartSummaryItemVO> summary = item.getSummary();
            if (summary != null) {
                List<CartSummaryItemVO> list = summary;
                int h11 = U.h(C7714v.z(list, 10));
                if (h11 < 16) {
                    h11 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
                for (CartSummaryItemVO cartSummaryItemVO : list) {
                    Pair pair = new Pair(Long.valueOf(cartSummaryItemVO.getId()), new CartItemInfo((int) cartSummaryItemVO.getQuantity(), cartSummaryItemVO.getSelectedDeliverySchema() != null ? Long.valueOf(r0.intValue()) : null, null, null, null, null, 60, null));
                    linkedHashMap.put(pair.e(), pair.f());
                }
                map = linkedHashMap;
            }
            if (map == null) {
                map = U.c();
            }
            Map map2 = map;
            if (Intrinsics.d(this.cartService.getCartState().getItems(), map2)) {
                return;
            }
            CartService.DefaultImpls.setItems$default(this.cartService, map2, CartSource.REMOTE, CartChangeSource.MASTER, null, null, 24, null);
        }
    }
}
