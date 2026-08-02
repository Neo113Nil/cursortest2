package ru.ozon.app.android.cart.async.presentation;

import android.view.View;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.presentation.asyncCart.AsyncCartViewModel;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000bR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/cart/async/presentation/AsyncViewHolder;", "Ld20/b;", "Lru/ozon/app/android/cart/async/presentation/AsyncVI;", "Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModel;", "asyncCartViewModel", "<init>", "(Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModel;)V", "item", "", "bind", "(Lru/ozon/app/android/cart/async/presentation/AsyncVI;)V", "Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModel;", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AsyncViewHolder extends AbstractC6065b<AsyncVI> {

    @NotNull
    private final AsyncCartViewModel asyncCartViewModel;
    private final View metricView;

    public AsyncViewHolder(@NotNull AsyncCartViewModel asyncCartViewModel) {
        Intrinsics.checkNotNullParameter(asyncCartViewModel, "asyncCartViewModel");
        this.asyncCartViewModel = asyncCartViewModel;
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull AsyncVI item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.asyncCartViewModel.mo507setAsyncParams6Au4x4Y(item.getEnabled(), item.getOperationsDebounceDelay());
    }
}
