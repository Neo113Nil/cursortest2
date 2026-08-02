package ru.ozon.app.android.platform.notifications;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR$\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/platform/notifications/EnableNotificationsSuggestingHandlerImpl;", "Lru/ozon/app/android/platform/notifications/EnableNotificationsSuggestingHandler;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "Landroid/content/SharedPreferences;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "isEnablePushNotificationsOptionSuggestedByFirstTime", "()Z", "setEnablePushNotificationsOptionSuggestedByFirstTime", "(Z)V", "isPermissionForPushNotificationsForApiMoreThan32Requested", "setPermissionForPushNotificationsForApiMoreThan32Requested", "Companion", "android-platform_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EnableNotificationsSuggestingHandlerImpl implements EnableNotificationsSuggestingHandler {
    private final SharedPreferences sharedPreferences;

    public EnableNotificationsSuggestingHandlerImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.sharedPreferences = context.getSharedPreferences("SUGGEST_PUSH_ENABLE", 0);
    }

    @Override // ru.ozon.app.android.platform.notifications.EnableNotificationsSuggestingHandler
    public boolean isEnablePushNotificationsOptionSuggestedByFirstTime() {
        return this.sharedPreferences.getBoolean("IS_SUGGESTED_FIRST_TIME", false);
    }

    @Override // ru.ozon.app.android.platform.notifications.EnableNotificationsSuggestingHandler
    public boolean isPermissionForPushNotificationsForApiMoreThan32Requested() {
        if (Build.VERSION.SDK_INT >= 33) {
            return this.sharedPreferences.getBoolean("PERMISSION_REQUESTED", false);
        }
        return false;
    }

    @Override // ru.ozon.app.android.platform.notifications.EnableNotificationsSuggestingHandler
    public void setEnablePushNotificationsOptionSuggestedByFirstTime(boolean z11) {
        this.sharedPreferences.edit().putBoolean("IS_SUGGESTED_FIRST_TIME", z11).apply();
    }

    @Override // ru.ozon.app.android.platform.notifications.EnableNotificationsSuggestingHandler
    public void setPermissionForPushNotificationsForApiMoreThan32Requested(boolean z11) {
        if (Build.VERSION.SDK_INT >= 33) {
            this.sharedPreferences.edit().putBoolean("PERMISSION_REQUESTED", z11).apply();
        }
    }
}
