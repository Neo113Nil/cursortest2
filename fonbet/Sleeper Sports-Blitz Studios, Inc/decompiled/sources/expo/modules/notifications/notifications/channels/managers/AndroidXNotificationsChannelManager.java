package expo.modules.notifications.notifications.channels.managers;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.content.Context;
import android.graphics.Color;
import android.media.AudioAttributes;
import android.net.Uri;
import android.provider.Settings;
import androidx.activity.ComponentDialog$$ExternalSyntheticApiModelOutline0;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.graphics.ColorKt$$ExternalSyntheticApiModelOutline0;
import expo.modules.core.arguments.MapArguments;
import expo.modules.core.arguments.ReadableArguments;
import expo.modules.filesystem.FileSystemPath$$ExternalSyntheticApiModelOutline0;
import expo.modules.notifications.notifications.SoundResolver;
import expo.modules.notifications.notifications.channels.InvalidVibrationPatternException;
import expo.modules.notifications.notifications.enums.AudioContentType;
import expo.modules.notifications.notifications.enums.AudioUsage;
import expo.modules.notifications.notifications.enums.NotificationVisibility;
import java.util.List;

/* loaded from: classes9.dex */
public class AndroidXNotificationsChannelManager implements NotificationsChannelManager {
    private final NotificationManagerCompat mNotificationManager;
    private NotificationsChannelGroupManager mNotificationsChannelGroupManager;
    private final SoundResolver mSoundResolver;

    public AndroidXNotificationsChannelManager(Context context, NotificationsChannelGroupManager notificationsChannelGroupManager) {
        this.mNotificationManager = NotificationManagerCompat.from(context);
        this.mSoundResolver = new SoundResolver(context);
        this.mNotificationsChannelGroupManager = notificationsChannelGroupManager;
    }

    @Override // expo.modules.notifications.notifications.channels.managers.NotificationsChannelManager
    public NotificationChannel getNotificationChannel(String str) {
        return this.mNotificationManager.getNotificationChannel(str);
    }

    @Override // expo.modules.notifications.notifications.channels.managers.NotificationsChannelManager
    public List<NotificationChannel> getNotificationChannels() {
        return this.mNotificationManager.getNotificationChannels();
    }

    @Override // expo.modules.notifications.notifications.channels.managers.NotificationsChannelManager
    public void deleteNotificationChannel(String str) {
        this.mNotificationManager.deleteNotificationChannel(str);
    }

    @Override // expo.modules.notifications.notifications.channels.managers.NotificationsChannelManager
    public NotificationChannel createNotificationChannel(String str, CharSequence charSequence, int i, ReadableArguments readableArguments) {
        NotificationChannel m = ComponentDialog$$ExternalSyntheticApiModelOutline0.m(str, charSequence, i);
        configureChannelWithOptions(m, readableArguments);
        this.mNotificationManager.createNotificationChannel(m);
        return this.mNotificationManager.getNotificationChannel(str);
    }

    protected void configureChannelWithOptions(Object obj, ReadableArguments readableArguments) {
        NotificationVisibility fromEnumValue;
        String id;
        if (FileSystemPath$$ExternalSyntheticApiModelOutline0.m$3(obj)) {
            NotificationChannel m = ColorKt$$ExternalSyntheticApiModelOutline0.m(obj);
            if (readableArguments.containsKey("bypassDnd")) {
                m.setBypassDnd(readableArguments.getBoolean("bypassDnd"));
            }
            if (readableArguments.containsKey("description")) {
                m.setDescription(readableArguments.getString("description"));
            }
            if (readableArguments.containsKey("lightColor")) {
                m.setLightColor(Color.parseColor(readableArguments.getString("lightColor")));
            }
            if (readableArguments.containsKey("groupId")) {
                String string = readableArguments.getString("groupId");
                NotificationChannelGroup notificationChannelGroup = this.mNotificationsChannelGroupManager.getNotificationChannelGroup(string);
                if (notificationChannelGroup == null) {
                    notificationChannelGroup = this.mNotificationsChannelGroupManager.createNotificationChannelGroup(string, string, new MapArguments());
                }
                id = notificationChannelGroup.getId();
                m.setGroup(id);
            }
            if (readableArguments.containsKey("lockscreenVisibility") && (fromEnumValue = NotificationVisibility.fromEnumValue(readableArguments.getInt("lockscreenVisibility"))) != null) {
                m.setLockscreenVisibility(fromEnumValue.getNativeValue());
            }
            if (readableArguments.containsKey("showBadge")) {
                m.setShowBadge(readableArguments.getBoolean("showBadge"));
            }
            if (readableArguments.containsKey("sound") || readableArguments.containsKey("audioAttributes")) {
                m.setSound(createSoundUriFromArguments(readableArguments), createAttributesFromArguments(readableArguments.getArguments("audioAttributes")));
            }
            if (readableArguments.containsKey("vibrationPattern")) {
                m.setVibrationPattern(createVibrationPatternFromList(readableArguments.getList("vibrationPattern")));
            }
            if (readableArguments.containsKey("enableLights")) {
                m.enableLights(readableArguments.getBoolean("enableLights"));
            }
            if (readableArguments.containsKey("enableVibrate")) {
                m.enableVibration(readableArguments.getBoolean("enableVibrate"));
            }
        }
    }

    @Override // expo.modules.notifications.notifications.channels.managers.NotificationsChannelManager
    public boolean customSoundExists(ReadableArguments readableArguments) {
        String string;
        if (readableArguments.containsKey("sound") && (string = readableArguments.getString("sound")) != null) {
            return this.mSoundResolver.resourceExists(string);
        }
        return true;
    }

    protected Uri createSoundUriFromArguments(ReadableArguments readableArguments) {
        if (!readableArguments.containsKey("sound")) {
            return Settings.System.DEFAULT_NOTIFICATION_URI;
        }
        String string = readableArguments.getString("sound");
        if (string == null) {
            return null;
        }
        return this.mSoundResolver.resolve(string);
    }

    protected long[] createVibrationPatternFromList(List list) throws InvalidVibrationPatternException {
        if (list == null) {
            return null;
        }
        long[] jArr = new long[list.size()];
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Number) {
                jArr[i] = ((Number) list.get(i)).longValue();
            } else {
                throw new InvalidVibrationPatternException(i, list.get(i));
            }
        }
        return jArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected AudioAttributes createAttributesFromArguments(ReadableArguments readableArguments) {
        if (readableArguments == null) {
            return null;
        }
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        if (readableArguments.containsKey("usage")) {
            builder.setUsage(AudioUsage.fromEnumValue(readableArguments.getInt("usage")).getNativeValue());
        }
        if (readableArguments.containsKey("contentType")) {
            builder.setContentType(AudioContentType.fromEnumValue(readableArguments.getInt("contentType")).getNativeValue());
        }
        if (readableArguments.containsKey("flags")) {
            ReadableArguments arguments = readableArguments.getArguments("flags");
            boolean z = arguments.getBoolean("enforceAudibility");
            int i = z;
            if (arguments.getBoolean("requestHardwareAudioVideoSynchronization")) {
                i = (z ? 1 : 0) | 16;
            }
            builder.setFlags(i);
        }
        return builder.build();
    }
}
