package ru.ozon.uni.android.notificationbar;

import Gk0.d;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.notificationbar.NotificationBar;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\u0003J\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\nJ\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0014\u0010\u000eJ\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/uni/android/notificationbar/NotificationBarManager;", "", "<init>", "()V", "Lru/ozon/uni/android/notificationbar/NotificationBar;", "notificationBar", "Lru/ozon/uni/android/notificationbar/NotificationBar$DismissReason;", "reason", "", "dismissNotification", "(Lru/ozon/uni/android/notificationbar/NotificationBar;Lru/ozon/uni/android/notificationbar/NotificationBar$DismissReason;)V", "showNext", "dismissCurrentAndShowNext", "cancelPendingTimeout", "(Lru/ozon/uni/android/notificationbar/NotificationBar;)V", "scheduleDismiss", "show", "dismiss", "onDismissed$uni_release", "onDismissed", "onShown$uni_release", "onShown", "", "isCurrentOrNext$uni_release", "(Lru/ozon/uni/android/notificationbar/NotificationBar;)Z", "isCurrentOrNext", "currentNotificationBar", "Lru/ozon/uni/android/notificationbar/NotificationBar;", "nextNotificationBar", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationBarManager {
    private static NotificationBar currentNotificationBar;
    private static NotificationBar nextNotificationBar;

    @NotNull
    public static final NotificationBarManager INSTANCE = new NotificationBarManager();

    @NotNull
    private static final Handler handler = new Handler(Looper.getMainLooper(), new d());
    public static final int $stable = 8;

    private NotificationBarManager() {
    }

    private final void cancelPendingTimeout(NotificationBar notificationBar) {
        handler.removeCallbacksAndMessages(notificationBar);
    }

    private final void dismissCurrentAndShowNext() {
        NotificationBar notificationBar = currentNotificationBar;
        if (notificationBar == null) {
            showNext();
        } else {
            dismissNotification(notificationBar, NotificationBar.DismissReason.CONSECUTIVE);
        }
    }

    private final void dismissNotification(NotificationBar notificationBar, NotificationBar.DismissReason reason) {
        cancelPendingTimeout(notificationBar);
        notificationBar.requestDismiss$uni_release(reason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean handler$lambda$0(Message message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (message.what != 0) {
            return false;
        }
        NotificationBarManager notificationBarManager = INSTANCE;
        Object obj = message.obj;
        Intrinsics.g(obj, "null cannot be cast to non-null type ru.ozon.uni.android.notificationbar.NotificationBar");
        notificationBarManager.dismiss((NotificationBar) obj, NotificationBar.DismissReason.TIMEOUT);
        return true;
    }

    private final void scheduleDismiss(NotificationBar notificationBar) {
        cancelPendingTimeout(notificationBar);
        if (notificationBar.getDuration() != null) {
            Handler handler2 = handler;
            handler2.sendMessageDelayed(handler2.obtainMessage(0, notificationBar), notificationBar.getDuration().longValue());
        }
    }

    private final void showNext() {
        NotificationBar notificationBar = nextNotificationBar;
        if (notificationBar != null) {
            currentNotificationBar = notificationBar;
            nextNotificationBar = null;
            notificationBar.requestShow$uni_release();
        }
    }

    public final void dismiss(@NotNull NotificationBar notificationBar, @NotNull NotificationBar.DismissReason reason) {
        Intrinsics.checkNotNullParameter(notificationBar, "notificationBar");
        Intrinsics.checkNotNullParameter(reason, "reason");
        if (isCurrentOrNext$uni_release(notificationBar)) {
            dismissNotification(notificationBar, reason);
        }
    }

    public final boolean isCurrentOrNext$uni_release(@NotNull NotificationBar notificationBar) {
        Intrinsics.checkNotNullParameter(notificationBar, "notificationBar");
        return notificationBar == currentNotificationBar || notificationBar == nextNotificationBar;
    }

    public final void onDismissed$uni_release(@NotNull NotificationBar notificationBar) {
        Intrinsics.checkNotNullParameter(notificationBar, "notificationBar");
        if (notificationBar == currentNotificationBar) {
            currentNotificationBar = null;
            showNext();
        }
    }

    public final void onShown$uni_release(@NotNull NotificationBar notificationBar) {
        Intrinsics.checkNotNullParameter(notificationBar, "notificationBar");
        if (currentNotificationBar == notificationBar) {
            scheduleDismiss(notificationBar);
        }
    }

    public final void show(@NotNull NotificationBar notificationBar) {
        Intrinsics.checkNotNullParameter(notificationBar, "notificationBar");
        if (currentNotificationBar == notificationBar) {
            scheduleDismiss(notificationBar);
        } else {
            nextNotificationBar = notificationBar;
            dismissCurrentAndShowNext();
        }
    }
}
