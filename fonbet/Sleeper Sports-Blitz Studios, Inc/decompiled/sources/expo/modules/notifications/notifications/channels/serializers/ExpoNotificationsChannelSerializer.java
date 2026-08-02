package expo.modules.notifications.notifications.channels.serializers;

import android.app.NotificationChannel;
import android.graphics.Color;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import expo.modules.notifications.notifications.enums.AudioContentType;
import expo.modules.notifications.notifications.enums.AudioUsage;
import expo.modules.notifications.notifications.enums.NotificationImportance;
import expo.modules.notifications.notifications.enums.NotificationVisibility;

/* loaded from: classes9.dex */
public class ExpoNotificationsChannelSerializer implements NotificationsChannelSerializer {
    @Override // expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer
    public Bundle toBundle(NotificationChannel notificationChannel) {
        CharSequence name;
        int importance;
        boolean canBypassDnd;
        String description;
        int lightColor;
        Color valueOf;
        int argb;
        int lockscreenVisibility;
        boolean canShowBadge;
        Uri sound;
        AudioAttributes audioAttributes;
        long[] vibrationPattern;
        boolean shouldShowLights;
        boolean shouldVibrate;
        Bundle bundle = new Bundle();
        bundle.putString("id", getChannelId(notificationChannel));
        name = notificationChannel.getName();
        bundle.putString("name", name.toString());
        importance = notificationChannel.getImportance();
        bundle.putInt("importance", NotificationImportance.fromNativeValue(importance).getEnumValue());
        canBypassDnd = notificationChannel.canBypassDnd();
        bundle.putBoolean("bypassDnd", canBypassDnd);
        description = notificationChannel.getDescription();
        bundle.putString("description", description);
        bundle.putString("groupId", getGroupId(notificationChannel));
        lightColor = notificationChannel.getLightColor();
        valueOf = Color.valueOf(lightColor);
        argb = valueOf.toArgb();
        bundle.putString("lightColor", String.format("#%08x", Integer.valueOf(argb)).toUpperCase());
        lockscreenVisibility = notificationChannel.getLockscreenVisibility();
        bundle.putInt("lockscreenVisibility", NotificationVisibility.fromNativeValue(lockscreenVisibility).getEnumValue());
        canShowBadge = notificationChannel.canShowBadge();
        bundle.putBoolean("showBadge", canShowBadge);
        sound = notificationChannel.getSound();
        bundle.putString("sound", toString(sound));
        audioAttributes = notificationChannel.getAudioAttributes();
        bundle.putBundle("audioAttributes", toBundle(audioAttributes));
        vibrationPattern = notificationChannel.getVibrationPattern();
        bundle.putLongArray("vibrationPattern", vibrationPattern);
        shouldShowLights = notificationChannel.shouldShowLights();
        bundle.putBoolean("enableLights", shouldShowLights);
        shouldVibrate = notificationChannel.shouldVibrate();
        bundle.putBoolean("enableVibrate", shouldVibrate);
        return bundle;
    }

    protected String getChannelId(NotificationChannel notificationChannel) {
        String id;
        id = notificationChannel.getId();
        return id;
    }

    protected String getGroupId(NotificationChannel notificationChannel) {
        String group;
        group = notificationChannel.getGroup();
        return group;
    }

    private String toString(Uri uri) {
        if (uri == null) {
            return null;
        }
        if (Settings.System.DEFAULT_NOTIFICATION_URI.equals(uri)) {
            return "default";
        }
        return "custom";
    }

    private Bundle toBundle(AudioAttributes audioAttributes) {
        if (audioAttributes == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("usage", AudioUsage.fromNativeValue(audioAttributes.getUsage()).getEnumValue());
        bundle.putInt("contentType", AudioContentType.fromNativeValue(audioAttributes.getContentType()).getEnumValue());
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("requestHardwareAudioVideoSynchronization", (audioAttributes.getFlags() & 16) > 0);
        bundle2.putBoolean("enforceAudibility", (audioAttributes.getFlags() & 1) > 0);
        bundle.putBundle("flags", bundle2);
        return bundle;
    }
}
