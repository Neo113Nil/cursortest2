package ru.ozon.app.android.account.orders;

import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006R\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/account/orders/OrderListChangeStateViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/account/orders/OrderChangePreferences;", "orderChangePreferences", "<init>", "(Lru/ozon/app/android/account/orders/OrderChangePreferences;)V", "Lru/ozon/app/android/account/orders/OrderChangePreferences;", "", "getLastUpdateTime", "()J", "lastUpdateTime", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderListChangeStateViewModel extends w0 {

    @NotNull
    private final OrderChangePreferences orderChangePreferences;

    public OrderListChangeStateViewModel(@NotNull OrderChangePreferences orderChangePreferences) {
        Intrinsics.checkNotNullParameter(orderChangePreferences, "orderChangePreferences");
        this.orderChangePreferences = orderChangePreferences;
    }

    public final long getLastUpdateTime() {
        return this.orderChangePreferences.getLastUpdated();
    }
}
