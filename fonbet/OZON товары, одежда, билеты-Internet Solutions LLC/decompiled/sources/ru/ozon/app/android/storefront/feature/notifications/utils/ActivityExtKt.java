package ru.ozon.app.android.storefront.feature.notifications.utils;

import android.app.Activity;
import android.app.NotificationChannel;
import android.content.Intent;
import androidx.core.app.n;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.push.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"openNotificationChannelSetting", "", "Landroid/app/Activity;", "notifications_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ActivityExtKt {
    public static final void openNotificationChannelSetting(@NotNull Activity activity) {
        Object obj;
        Intrinsics.checkNotNullParameter(activity, "<this>");
        String string = StringProvider.getString(R$string.push_ozon_push_channel_name);
        List<NotificationChannel> i11 = n.e(activity).i();
        Intrinsics.checkNotNullExpressionValue(i11, "getNotificationChannels(...)");
        Iterator<T> it = i11.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.d(((NotificationChannel) obj).getName(), string)) {
                    break;
                }
            }
        }
        NotificationChannel notificationChannel = (NotificationChannel) obj;
        String id2 = notificationChannel != null ? notificationChannel.getId() : null;
        if (id2 != null) {
            Intent intent = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
            intent.putExtra("android.provider.extra.CHANNEL_ID", id2);
            activity.startActivity(intent);
        }
    }
}
