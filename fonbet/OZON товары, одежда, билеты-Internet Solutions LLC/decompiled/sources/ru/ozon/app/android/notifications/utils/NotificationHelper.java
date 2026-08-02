package ru.ozon.app.android.notifications.utils;

import android.content.Context;
import android.content.Intent;
import androidx.core.app.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/notifications/utils/NotificationHelper;", "", "<init>", "()V", "Landroid/content/Intent;", "Landroid/content/Context;", "context", "", "setOpenSettingsIntentForApiLarger26", "(Landroid/content/Intent;Landroid/content/Context;)V", "", "isSystemNotificationsTurnedOn", "(Landroid/content/Context;)Z", "openNotificationsSettings", "(Landroid/content/Context;)V", "notifications_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NotificationHelper {

    @NotNull
    public static final NotificationHelper INSTANCE = new NotificationHelper();

    private NotificationHelper() {
    }

    private final void setOpenSettingsIntentForApiLarger26(Intent intent, Context context) {
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
    }

    public final boolean isSystemNotificationsTurnedOn(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return n.e(context).a();
    }

    public final void openNotificationsSettings(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent();
        setOpenSettingsIntentForApiLarger26(intent, context);
        context.startActivity(intent);
    }
}
