package ru.ozon.app.android.cart.common.presentation.throttleNotificationHandler;

import android.os.SystemClock;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.notificationbar.NotificationBar;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\tH\u0016J\b\u0010\u0010\u001a\u00020\fH\u0016J\b\u0010\u0011\u001a\u00020\fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/cart/common/presentation/throttleNotificationHandler/CartThrottleNotificationHandlerImpl;", "Lru/ozon/app/android/cart/common/presentation/throttleNotificationHandler/CartThrottleNotificationHandler;", "<init>", "()V", "lastActionTime", "", "currentNotificationBar", "Lru/ozon/uni/android/notificationbar/NotificationBar;", "currentNotificationId", "", "Ljava/lang/Integer;", "show", "", "notificationId", "notificationBar", "timeMillis", "dismiss", "clearThrottleTime", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CartThrottleNotificationHandlerImpl implements CartThrottleNotificationHandler {
    private NotificationBar currentNotificationBar;
    private Integer currentNotificationId;
    private long lastActionTime;

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearThrottleTime() {
        this.lastActionTime = 0L;
    }

    @Override // ru.ozon.app.android.cart.common.presentation.throttleNotificationHandler.CartThrottleNotificationHandler
    public void dismiss() {
        NotificationBar notificationBar = this.currentNotificationBar;
        if (notificationBar != null) {
            notificationBar.dismiss();
        }
        this.currentNotificationBar = null;
        this.currentNotificationId = null;
    }

    @Override // ru.ozon.app.android.cart.common.presentation.throttleNotificationHandler.CartThrottleNotificationHandler
    public void show(int notificationId, @NotNull NotificationBar notificationBar, int timeMillis) {
        Intrinsics.checkNotNullParameter(notificationBar, "notificationBar");
        Integer num = this.currentNotificationId;
        if (num == null || num.intValue() != notificationId) {
            this.currentNotificationBar = notificationBar;
            this.currentNotificationId = Integer.valueOf(notificationId);
            clearThrottleTime();
        }
        if (SystemClock.elapsedRealtime() - this.lastActionTime < timeMillis) {
            return;
        }
        this.lastActionTime = SystemClock.elapsedRealtime();
        notificationBar.show();
        notificationBar.addCallback(new NotificationBar.Callback() { // from class: ru.ozon.app.android.cart.common.presentation.throttleNotificationHandler.CartThrottleNotificationHandlerImpl$show$1
            @Override // ru.ozon.uni.android.notificationbar.NotificationBar.Callback
            public void onDismissed(NotificationBar notificationBar2, NotificationBar.DismissReason reason) {
                NotificationBar notificationBar3;
                Intrinsics.checkNotNullParameter(notificationBar2, "notificationBar");
                Intrinsics.checkNotNullParameter(reason, "reason");
                notificationBar2.removeCallback(this);
                notificationBar3 = CartThrottleNotificationHandlerImpl.this.currentNotificationBar;
                if (notificationBar2.equals(notificationBar3)) {
                    CartThrottleNotificationHandlerImpl.this.currentNotificationBar = null;
                    CartThrottleNotificationHandlerImpl.this.currentNotificationId = null;
                    CartThrottleNotificationHandlerImpl.this.clearThrottleTime();
                }
            }

            @Override // ru.ozon.uni.android.notificationbar.NotificationBar.Callback
            public void onShown(NotificationBar notificationBar2) {
                NotificationBar.Callback.DefaultImpls.onShown(this, notificationBar2);
            }
        });
    }
}
