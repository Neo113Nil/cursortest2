package ru.ozon.app.android.storefront.feature.notifications.data;

import Ae.M0;
import Ae.O0;
import Ae.x0;
import Sc.InterfaceC4008j;
import Sc.k;
import android.app.Activity;
import android.app.Application;
import android.app.NotificationChannel;
import android.os.Bundle;
import androidx.core.app.n;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.core.notifications.domain.NotificationStatus;
import ru.ozon.app.android.storefront.core.notifications.domain.NotificationStatusManager;

@Metadata(d1 = {"\u0000?\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0016\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/storefront/feature/notifications/data/NotificationStatusManagerImpl;", "Lru/ozon/app/android/storefront/core/notifications/domain/NotificationStatusManager;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "Lru/ozon/app/android/storefront/core/notifications/domain/NotificationStatus;", "getCurrentStatus", "()Lru/ozon/app/android/storefront/core/notifications/domain/NotificationStatus;", "LAe/M0;", "getStatusFlow", "()LAe/M0;", "", "init", "()V", "Landroid/app/Application;", "Landroidx/core/app/n;", "notificationManager$delegate", "LSc/j;", "getNotificationManager", "()Landroidx/core/app/n;", "notificationManager", "ru/ozon/app/android/storefront/feature/notifications/data/NotificationStatusManagerImpl$notificationStatusCallback$1", "notificationStatusCallback", "Lru/ozon/app/android/storefront/feature/notifications/data/NotificationStatusManagerImpl$notificationStatusCallback$1;", "LAe/x0;", "notificationStatus", "LAe/x0;", "notifications_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NotificationStatusManagerImpl implements NotificationStatusManager {

    @NotNull
    private final Application application;

    /* renamed from: notificationManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j notificationManager;

    @NotNull
    private final x0<NotificationStatus> notificationStatus;

    @NotNull
    private final NotificationStatusManagerImpl$notificationStatusCallback$1 notificationStatusCallback;

    /* JADX WARN: Type inference failed for: r2v3, types: [ru.ozon.app.android.storefront.feature.notifications.data.NotificationStatusManagerImpl$notificationStatusCallback$1] */
    public NotificationStatusManagerImpl(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.application = application;
        this.notificationManager = k.b(new NotificationStatusManagerImpl$notificationManager$2(this));
        this.notificationStatusCallback = new Application.ActivityLifecycleCallbacks() { // from class: ru.ozon.app.android.storefront.feature.notifications.data.NotificationStatusManagerImpl$notificationStatusCallback$1
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                x0 x0Var;
                NotificationStatus currentStatus;
                Intrinsics.checkNotNullParameter(activity, "activity");
                x0Var = NotificationStatusManagerImpl.this.notificationStatus;
                currentStatus = NotificationStatusManagerImpl.this.getCurrentStatus();
                x0Var.setValue(currentStatus);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(outState, "outState");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }
        };
        this.notificationStatus = O0.a(getCurrentStatus());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NotificationStatus getCurrentStatus() {
        List<NotificationChannel> i11 = getNotificationManager().i();
        Intrinsics.checkNotNullExpressionValue(i11, "getNotificationChannels(...)");
        List<NotificationChannel> list = i11;
        boolean z11 = true;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((NotificationChannel) it.next()).getImportance() == 0) {
                    z11 = false;
                    break;
                }
            }
        }
        return new NotificationStatus(getNotificationManager().a(), z11);
    }

    private final n getNotificationManager() {
        return (n) this.notificationManager.getValue();
    }

    @Override // ru.ozon.app.android.storefront.core.notifications.domain.NotificationStatusProvider
    @NotNull
    public M0<NotificationStatus> getStatusFlow() {
        return this.notificationStatus;
    }

    @Override // ru.ozon.app.android.storefront.core.notifications.domain.NotificationStatusObserver
    public void init() {
        this.application.registerActivityLifecycleCallbacks(this.notificationStatusCallback);
    }
}
