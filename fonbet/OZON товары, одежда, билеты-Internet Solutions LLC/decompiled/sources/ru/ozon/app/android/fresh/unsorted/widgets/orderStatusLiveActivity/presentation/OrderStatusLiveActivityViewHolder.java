package ru.ozon.app.android.fresh.unsorted.widgets.orderStatusLiveActivity.presentation;

import android.view.View;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\rR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/orderStatusLiveActivity/presentation/OrderStatusLiveActivityViewHolder;", "Ld20/b;", "Lru/ozon/app/android/fresh/unsorted/widgets/orderStatusLiveActivity/presentation/OrderStatusLiveActivityVO;", "Lru/ozon/app/android/fresh/unsorted/widgets/orderStatusLiveActivity/presentation/OrderStatusLiveActivityViewModel;", "viewModel", "<init>", "(Lru/ozon/app/android/fresh/unsorted/widgets/orderStatusLiveActivity/presentation/OrderStatusLiveActivityViewModel;)V", "item", "", "bind", "(Lru/ozon/app/android/fresh/unsorted/widgets/orderStatusLiveActivity/presentation/OrderStatusLiveActivityVO;)V", "onWidgetCreated", "()V", "Lru/ozon/app/android/fresh/unsorted/widgets/orderStatusLiveActivity/presentation/OrderStatusLiveActivityViewModel;", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OrderStatusLiveActivityViewHolder extends AbstractC6065b<OrderStatusLiveActivityVO> {
    private final View metricView;

    @NotNull
    private final OrderStatusLiveActivityViewModel viewModel;
    public static final int $stable = 8;

    public OrderStatusLiveActivityViewHolder(@NotNull OrderStatusLiveActivityViewModel viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.viewModel = viewModel;
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull OrderStatusLiveActivityVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        String orderId;
        super.onWidgetCreated();
        OrderStatusLiveActivityVO boundData = getBoundData();
        if (boundData == null || (orderId = boundData.getOrderId()) == null) {
            return;
        }
        this.viewModel.startLiveActivity("OrderStatusLiveActivity", orderId);
    }
}
