package com.appboy.cordova;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.core.internal.view.SupportMenu;

/* loaded from: classes8.dex */
class NotificationChannelProvider {
    private static final String TAG = "NotificationChannel";
    private static String channelDescription = "default channel description";
    private static String channelId = "default_channel_id";
    private static String channelName = "default channel name";
    private static boolean isChannelCreated;

    NotificationChannelProvider() {
    }

    static String getChannelId() {
        return channelId;
    }

    static String getChannelName() {
        return channelName;
    }

    static String getChannelDescription() {
        return channelDescription;
    }

    static void createDefaultNotificationChannelIfNeeded(Context context, String str, String str2, String str3, String str4) {
        if (isChannelCreated || Build.VERSION.SDK_INT < 26) {
            return;
        }
        isChannelCreated = true;
        if (str != null && !str.isEmpty()) {
            channelId = str;
        }
        if (str2 != null && !str2.isEmpty()) {
            channelName = str2;
        }
        if (str3 != null && !str3.isEmpty()) {
            channelDescription = str3;
        }
        NotificationChannel notificationChannel = new NotificationChannel(channelId, channelName, 4);
        notificationChannel.setDescription(channelDescription);
        long[] parseVibrationPattern = parseVibrationPattern(str4);
        if (parseVibrationPattern.length > 0) {
            notificationChannel.enableVibration(true);
            notificationChannel.setVibrationPattern(parseVibrationPattern);
        }
        notificationChannel.enableLights(true);
        notificationChannel.setLightColor(SupportMenu.CATEGORY_MASK);
        ((NotificationManager) context.getSystemService("notification")).createNotificationChannel(notificationChannel);
    }

    private static long[] parseVibrationPattern(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                String[] split = str.split(",");
                long[] jArr = new long[split.length];
                for (int i = 0; i < split.length; i++) {
                    jArr[i] = Long.parseLong(split[i]);
                }
                return jArr;
            } catch (Exception e) {
                Log.e(TAG, "Error parsing vibration pattern: " + str + "\n" + e.toString());
            }
        }
        return new long[0];
    }
}
