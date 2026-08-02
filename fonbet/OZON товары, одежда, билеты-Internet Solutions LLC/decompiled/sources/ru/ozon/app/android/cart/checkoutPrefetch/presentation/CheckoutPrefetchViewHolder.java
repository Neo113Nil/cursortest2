package ru.ozon.app.android.cart.checkoutPrefetch.presentation;

import android.content.Context;
import android.view.View;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.checkoutPrefetch.presentation.viewModel.CheckoutPrefetchViewModel;
import ru.ozon.app.android.cart.checkoutPrefetch.presentation.vo.CheckoutPrefetchVO;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/cart/checkoutPrefetch/presentation/CheckoutPrefetchViewHolder;", "Ld20/b;", "Lru/ozon/app/android/cart/checkoutPrefetch/presentation/vo/CheckoutPrefetchVO;", "Lru/ozon/app/android/cart/checkoutPrefetch/presentation/viewModel/CheckoutPrefetchViewModel;", "viewModel", "Ll10/i;", "container", "<init>", "(Lru/ozon/app/android/cart/checkoutPrefetch/presentation/viewModel/CheckoutPrefetchViewModel;Ll10/i;)V", "item", "", "bind", "(Lru/ozon/app/android/cart/checkoutPrefetch/presentation/vo/CheckoutPrefetchVO;)V", "onWidgetCreated", "()V", "Lru/ozon/app/android/cart/checkoutPrefetch/presentation/viewModel/CheckoutPrefetchViewModel;", "Ll10/i;", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CheckoutPrefetchViewHolder extends AbstractC6065b<CheckoutPrefetchVO> {

    @NotNull
    private final i container;
    private final View metricView;

    @NotNull
    private final CheckoutPrefetchViewModel viewModel;

    public CheckoutPrefetchViewHolder(@NotNull CheckoutPrefetchViewModel viewModel, @NotNull i container) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(container, "container");
        this.viewModel = viewModel;
        this.container = container;
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        super.onWidgetCreated();
        this.viewModel.getWidgetUpdate().observe(this.container.K().f(), new CheckoutPrefetchViewHolder$sam$androidx_lifecycle_Observer$0(new CheckoutPrefetchViewHolder$onWidgetCreated$1(this)));
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull CheckoutPrefetchVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        CheckoutPrefetchViewModel checkoutPrefetchViewModel = this.viewModel;
        Context L11 = this.container.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        checkoutPrefetchViewModel.prefetchCheckout(item, L11);
        this.viewModel.updateWidgetIfNeed();
    }
}
