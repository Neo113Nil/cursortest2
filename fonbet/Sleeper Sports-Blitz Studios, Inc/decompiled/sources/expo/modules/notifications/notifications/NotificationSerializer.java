package expo.modules.notifications.notifications;

import android.os.Bundle;
import com.google.firebase.messaging.Constants;
import expo.modules.core.arguments.MapArguments;
import expo.modules.notifications.UtilsKt;
import expo.modules.notifications.notifications.interfaces.INotificationContent;
import expo.modules.notifications.notifications.interfaces.NotificationTrigger;
import expo.modules.notifications.notifications.interfaces.SchedulableNotificationTrigger;
import expo.modules.notifications.notifications.model.Notification;
import expo.modules.notifications.notifications.model.NotificationRequest;
import expo.modules.notifications.notifications.model.NotificationResponse;
import expo.modules.notifications.notifications.model.TextInputNotificationResponse;
import expo.modules.notifications.notifications.model.triggers.FirebaseNotificationTrigger;
import expo.modules.notifications.notifications.triggers.ChannelAwareTrigger;
import expo.modules.notifications.service.NotificationsService;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class NotificationSerializer {
    public static Bundle toBundle(NotificationResponse notificationResponse) {
        Bundle bundle = new Bundle();
        bundle.putString("actionIdentifier", notificationResponse.getActionIdentifier());
        bundle.putBundle(NotificationsService.NOTIFICATION_KEY, toBundle(notificationResponse.getNotification()));
        if (notificationResponse instanceof TextInputNotificationResponse) {
            bundle.putString("userText", ((TextInputNotificationResponse) notificationResponse).getUserText());
        }
        return bundle;
    }

    public static Bundle toBundle(Notification notification) {
        Bundle bundle = new Bundle();
        bundle.putBundle("request", toBundle(notification.getNotificationRequest()));
        bundle.putLong("date", notification.getOriginDate().getTime());
        return bundle;
    }

    public static Bundle toBundle(NotificationRequest notificationRequest) {
        JSONObject body;
        Bundle bundle = new Bundle();
        bundle.putString("identifier", notificationRequest.getIdentifier());
        NotificationTrigger trigger = notificationRequest.getTrigger();
        bundle.putBundle("trigger", trigger == null ? null : trigger.toBundle());
        Bundle bundle2 = toBundle(notificationRequest.getContent());
        if (bundle2.getBundle("data") == null) {
            if (trigger instanceof FirebaseNotificationTrigger) {
                Map<String, String> data = ((FirebaseNotificationTrigger) trigger).getRemoteMessage().getData();
                String str = data.get("body");
                if (!UtilsKt.isValidJSONString(str)) {
                    bundle2.putBundle("data", toBundle(data));
                } else {
                    bundle2.putString("dataString", str);
                }
            } else if (((trigger instanceof SchedulableNotificationTrigger) || (trigger instanceof ChannelAwareTrigger) || trigger == null) && (body = notificationRequest.getContent().getBody()) != null) {
                bundle2.putString("dataString", body.toString());
            }
        }
        bundle.putBundle("content", bundle2);
        return bundle;
    }

    public static Bundle toBundle(Map<String, String> map) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            bundle.putString(str, map.get(str));
        }
        return bundle;
    }

    public static Bundle toBundle(INotificationContent iNotificationContent) {
        Bundle bundle = new Bundle();
        bundle.putString("title", iNotificationContent.getTitle());
        bundle.putString("subtitle", iNotificationContent.getSubText());
        bundle.putString("body", iNotificationContent.getText());
        if (iNotificationContent.getColor() != null) {
            bundle.putString("color", String.format("#%08X", Integer.valueOf(iNotificationContent.getColor().intValue())));
        }
        if (iNotificationContent.getBadgeCount() != null) {
            bundle.putInt(MetricTracker.Object.BADGE, iNotificationContent.getBadgeCount().intValue());
        } else {
            bundle.putString(MetricTracker.Object.BADGE, null);
        }
        if (iNotificationContent.getShouldPlayDefaultSound()) {
            bundle.putString("sound", "default");
        } else if (iNotificationContent.getSoundName() != null) {
            bundle.putString("sound", "custom");
        } else {
            bundle.putString("sound", null);
        }
        if (iNotificationContent.getPriority() != null) {
            bundle.putString("priority", iNotificationContent.getPriority().getEnumValue());
        }
        if (iNotificationContent.getVibrationPattern() != null) {
            bundle.putLongArray("vibrationPattern", iNotificationContent.getVibrationPattern());
        }
        bundle.putBoolean("autoDismiss", iNotificationContent.getIsAutoDismiss());
        if (iNotificationContent.getCategoryId() != null) {
            bundle.putString("categoryIdentifier", iNotificationContent.getCategoryId());
        }
        bundle.putBoolean("sticky", iNotificationContent.getIsSticky());
        return bundle;
    }

    public static Bundle toBundle(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap hashMap = new HashMap(jSONObject.length());
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt instanceof JSONObject) {
                hashMap.put(next, toBundle((JSONObject) opt));
            } else if (opt instanceof JSONArray) {
                hashMap.put(next, toList((JSONArray) opt));
            } else if (JSONObject.NULL.equals(opt)) {
                hashMap.put(next, null);
            } else {
                hashMap.put(next, opt);
            }
        }
        try {
            return new MapArguments(hashMap).toBundle();
        } catch (NullPointerException unused) {
            for (String str : hashMap.keySet()) {
                if (hashMap.get(str) == null) {
                    hashMap.remove(str);
                }
            }
            return new MapArguments(hashMap).toBundle();
        }
    }

    private static List<Object> toList(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            if (jSONArray.isNull(i)) {
                arrayList.add(null);
            } else if (jSONArray.optJSONObject(i) != null) {
                arrayList.add(toBundle(jSONArray.optJSONObject(i)));
            } else if (jSONArray.optJSONArray(i) != null) {
                arrayList.add(toList(jSONArray.optJSONArray(i)));
            } else {
                arrayList.add(jSONArray.opt(i));
            }
        }
        return arrayList;
    }

    public static Bundle toResponseBundleFromExtras(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putString("title", bundle.getString("title"));
        String string = bundle.getString("body");
        if (UtilsKt.isValidJSONString(string)) {
            bundle2.putString("dataString", string);
            bundle2.putString("body", bundle.getString("message"));
        } else {
            bundle2.putBundle("data", UtilsKt.filteredBundleForJSTypeConverter(bundle));
        }
        Bundle bundle3 = new Bundle();
        bundle3.putString("type", MetricTracker.Place.PUSH);
        bundle3.putString("channelId", bundle.getString("channelId"));
        Bundle bundle4 = new Bundle();
        bundle4.putString("identifier", bundle.getString("google.message_id"));
        bundle4.putBundle("trigger", bundle3);
        bundle4.putBundle("content", bundle2);
        Bundle bundle5 = new Bundle();
        bundle5.putLong("date", bundle.getLong(Constants.MessagePayloadKeys.SENT_TIME));
        bundle5.putBundle("request", bundle4);
        Bundle bundle6 = new Bundle();
        bundle6.putString("actionIdentifier", NotificationResponse.DEFAULT_ACTION_IDENTIFIER);
        bundle6.putBundle(NotificationsService.NOTIFICATION_KEY, bundle5);
        return bundle6;
    }
}
