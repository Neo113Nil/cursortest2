package ru.ozon.app.android.cart.common.presentation.throttleNotificationHandler;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.notificationbar.NotificationBar;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\u0003H&¨\u0006\n"}, d2 = {"Lru/ozon/app/android/cart/common/presentation/throttleNotificationHandler/CartThrottleNotificationHandler;", "", "show", "", "notificationId", "", "notificationBar", "Lru/ozon/uni/android/notificationbar/NotificationBar;", "timeMillis", "dismiss", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface CartThrottleNotificationHandler {
    void dismiss();

    void show(int notificationId, @NotNull NotificationBar notificationBar, int timeMillis);
}
