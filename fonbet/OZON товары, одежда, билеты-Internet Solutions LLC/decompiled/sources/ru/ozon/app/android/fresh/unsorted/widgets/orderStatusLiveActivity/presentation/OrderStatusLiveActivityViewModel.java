package ru.ozon.app.android.fresh.unsorted.widgets.orderStatusLiveActivity.presentation;

import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.push.OzonPushManager;
import xe.C10727i;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/orderStatusLiveActivity/presentation/OrderStatusLiveActivityViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/push/OzonPushManager;", "ozonPushManager", "<init>", "(Lru/ozon/app/android/push/OzonPushManager;)V", "", "widgetName", "orderId", "", "startLiveActivity", "(Ljava/lang/String;Ljava/lang/String;)V", "Lru/ozon/app/android/push/OzonPushManager;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OrderStatusLiveActivityViewModel extends w0 {

    @NotNull
    private final OzonPushManager ozonPushManager;

    public OrderStatusLiveActivityViewModel(@NotNull OzonPushManager ozonPushManager) {
        Intrinsics.checkNotNullParameter(ozonPushManager, "ozonPushManager");
        this.ozonPushManager = ozonPushManager;
    }

    public final void startLiveActivity(@NotNull String widgetName, @NotNull String orderId) {
        Intrinsics.checkNotNullParameter(widgetName, "widgetName");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        C10727i.c(x0.a(this), null, null, new OrderStatusLiveActivityViewModel$startLiveActivity$1(this, widgetName, orderId, null), 3);
    }
}
