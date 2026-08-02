package com.appboy.cordova;

import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import androidx.preference.PreferenceManager;
import com.braze.Constants;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.BrazeViewBounds;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.push.BrazeNotificationActionUtils;
import com.braze.push.BrazeNotificationUtils;
import com.braze.support.BrazeImageUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import de.appplant.cordova.plugin.notification.util.AssetUtil;
import java.util.HashMap;

/* loaded from: classes5.dex */
class NotificationHandler {
    private static final String SMALL_ICON_KEY = "com_braze_push_small_notification_icon";
    private static final String TAG = "NotificationHandler";
    private static final char UNICODE_NBSP = 160;

    private boolean appVersionLessAPI16(int i) {
        return i >= 11 && i < 16;
    }

    NotificationHandler() {
    }

    Notification createNotification(BrazeConfigurationProvider brazeConfigurationProvider, Context context, Bundle bundle, Bundle bundle2) {
        boolean z = PreferenceManager.getDefaultSharedPreferences(context).getBoolean("notificationsEnabled", true);
        Log.i(TAG, String.format("Appboy:notificationEnabled: %s", z ? "true" : "false"));
        if (z) {
            NotificationCompat.Builder autoCancel = new NotificationCompat.Builder(context, NotificationChannelProvider.getChannelId()).setAutoCancel(true);
            String stringValue = brazeConfigurationProvider.getRuntimeAppConfigurationProvider().getStringValue(SMALL_ICON_KEY, "");
            if (stringValue == "") {
                BrazeNotificationUtils.setSmallIcon(brazeConfigurationProvider, autoCancel);
            } else {
                autoCancel.setSmallIcon(AssetUtil.getInstance(context).getResId(stringValue));
            }
            BrazeNotificationPayload brazeNotificationPayload = new BrazeNotificationPayload(bundle, bundle2, context, brazeConfigurationProvider);
            setBaseNotificationConfigAPI11(autoCancel, bundle, brazeNotificationPayload);
            if (appVersionLessAPI16(Build.VERSION.SDK_INT)) {
                return null;
            }
            setBaseNotificationConfigAPI18(autoCancel, bundle, brazeNotificationPayload);
            if (getDataFromField(bundle, Constants.BRAZE_PUSH_TITLE_KEY).replace((char) 160, ' ').trim().length() <= 1) {
                autoCancel.setContentTitle(context.getApplicationInfo().loadLabel(context.getPackageManager()).toString());
            }
            return getCustomizableNotification(context, bundle, bundle2, autoCancel);
        }
        sendReceivedSilentNotificationEvent(bundle2);
        return null;
    }

    private void sendReceivedSilentNotificationEvent(Bundle bundle) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("__silent", "1");
        appendExtras(hashMap, bundle);
        BrazePlugin.sendBroadcastMessage(hashMap);
    }

    private void appendExtras(HashMap<String, String> hashMap, Bundle bundle) {
        if (bundle == null || bundle.isEmpty()) {
            return;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !hashMap.containsKey(str)) {
                hashMap.put(str, obj.toString());
            }
        }
    }

    private Notification getCustomizableNotification(Context context, Bundle bundle, Bundle bundle2, NotificationCompat.Builder builder) {
        Bitmap imageByType = getImageByType(context, bundle2, Constants.BRAZE_PUSH_BIG_IMAGE_URL_KEY);
        Notification build = builder.build();
        build.contentView = getStandardNotificationView(context, bundle, bundle2);
        if (imageByType != null) {
            build.bigContentView = getContentView(context, bundle, imageByType, "expanded_push_notification", false);
        }
        build.defaults |= 2;
        return build;
    }

    private RemoteViews getStandardNotificationView(Context context, Bundle bundle, Bundle bundle2) {
        Bitmap imageByType = getImageByType(context, bundle2, "ab_sbg");
        if (imageByType == null) {
            imageByType = getImageByType(context, bundle2, Constants.BRAZE_PUSH_BIG_IMAGE_URL_KEY);
        }
        return getContentView(context, bundle, imageByType, "collapsed_push_notification", true);
    }

    private Bitmap getImageByType(Context context, Bundle bundle, String str) {
        if (bundle != null && bundle.containsKey(str)) {
            String string = bundle.getString(str);
            if (string == null || string.isEmpty()) {
                Log.e(TAG, "Empty URL for field " + str);
            } else {
                Bitmap bitmap = BrazeImageUtils.getBitmap(context, Uri.parse(string), BrazeViewBounds.NO_BOUNDS);
                if (bitmap != null) {
                    float max = 1024.0f / Math.max(bitmap.getWidth(), bitmap.getHeight());
                    if (max > 0.0f && max < 1.0f) {
                        bitmap = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * max), Math.round(bitmap.getHeight() * max), true);
                    }
                }
                if (bitmap != null) {
                    return bitmap;
                }
                Log.e(TAG, "Null bitmap for field " + str);
                Log.i(TAG, "Cannot get image from braze, setting default one.");
                return BitmapFactory.decodeResource(context.getResources(), context.getResources().getIdentifier("push_background", "drawable", context.getPackageName()));
            }
        }
        return null;
    }

    private RemoteViews getContentView(Context context, Bundle bundle, Bitmap bitmap, String str, boolean z) {
        Resources resources = context.getResources();
        String packageName = context.getPackageName();
        int identifier = resources.getIdentifier(str, TtmlNode.TAG_LAYOUT, packageName);
        int identifier2 = resources.getIdentifier("title", "id", packageName);
        int identifier3 = resources.getIdentifier("app_icon", "id", packageName);
        RemoteViews remoteViews = new RemoteViews(packageName, identifier);
        remoteViews.setTextViewText(identifier2, getDataFromField(bundle, Constants.BRAZE_PUSH_TITLE_KEY));
        int identifier4 = resources.getIdentifier("background", "id", packageName);
        if (bitmap != null) {
            remoteViews.setImageViewBitmap(identifier4, bitmap);
        }
        int identifier5 = resources.getIdentifier("message", "id", packageName);
        String dataFromField = getDataFromField(bundle, Constants.BRAZE_PUSH_CONTENT_KEY);
        if (z && bitmap == null) {
            remoteViews.setTextViewText(identifier5, dataFromField);
            remoteViews.setImageViewResource(identifier4, resources.getIdentifier("push_background_empty", "drawable", packageName));
        }
        Bitmap imageByType = getImageByType(context, bundle, Constants.BRAZE_PUSH_LARGE_ICON_KEY);
        if (imageByType != null) {
            Log.i(TAG, "Setup custom logo");
            remoteViews.setImageViewBitmap(identifier3, imageByType);
        }
        return remoteViews;
    }

    private String getDataFromField(Bundle bundle, String str) {
        String string;
        return (bundle == null || !bundle.containsKey(str) || (string = bundle.getString(str)) == null) ? "" : string;
    }

    private void setBaseNotificationConfigAPI11(NotificationCompat.Builder builder, Bundle bundle, BrazeNotificationPayload brazeNotificationPayload) {
        BrazeNotificationUtils.setTitleIfPresent(builder, brazeNotificationPayload);
        BrazeNotificationUtils.setContentIfPresent(builder, brazeNotificationPayload);
        BrazeNotificationUtils.setTickerIfPresent(builder, brazeNotificationPayload);
        BrazeNotificationUtils.setContentIntentIfPresent(brazeNotificationPayload.getContext(), builder, bundle);
        BrazeNotificationUtils.setSoundIfPresentAndSupported(builder, brazeNotificationPayload);
    }

    private void setBaseNotificationConfigAPI18(NotificationCompat.Builder builder, Bundle bundle, BrazeNotificationPayload brazeNotificationPayload) {
        BrazeNotificationUtils.setSummaryTextIfPresentAndSupported(builder, brazeNotificationPayload);
        BrazeNotificationUtils.setPriorityIfPresentAndSupported(builder, brazeNotificationPayload);
        BrazeNotificationActionUtils.addNotificationActions(builder, brazeNotificationPayload);
        BrazeNotificationUtils.setAccentColorIfPresentAndSupported(builder, brazeNotificationPayload);
        BrazeNotificationUtils.setCategoryIfPresentAndSupported(builder, brazeNotificationPayload);
        BrazeNotificationUtils.setVisibilityIfPresentAndSupported(builder, brazeNotificationPayload);
        BrazeNotificationUtils.setPublicVersionIfPresentAndSupported(builder, brazeNotificationPayload);
    }
}
