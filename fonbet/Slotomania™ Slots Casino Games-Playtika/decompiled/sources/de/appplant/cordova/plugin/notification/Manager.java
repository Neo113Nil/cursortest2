package de.appplant.cordova.plugin.notification;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import androidx.core.app.NotificationManagerCompat;
import de.appplant.cordova.plugin.badge.BadgeImpl;
import de.appplant.cordova.plugin.notification.Notification;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class Manager {
    private Context context;

    private Manager(Context context) {
        this.context = context;
    }

    public static Manager getInstance(Context context) {
        return new Manager(context);
    }

    public boolean hasPermission() {
        return getNotCompMgr().areNotificationsEnabled();
    }

    public Notification schedule(Request request, Class<?> cls) {
        Notification notification = new Notification(this.context, request.getOptions());
        notification.schedule(request, cls);
        return notification;
    }

    public String buildChannelWithOptions(Uri uri, boolean z, boolean z2, CharSequence charSequence, String str) {
        CharSequence charSequence2;
        String str2;
        boolean z3 = true;
        if (z2 && z) {
            charSequence2 = Options.SOUND_VIBRATE_CHANNEL_NAME;
            str2 = "sound-vibrate-channel-id";
        } else {
            if (z2) {
                charSequence2 = Options.SOUND_CHANNEL_NAME;
                str2 = "sound-channel-id";
            } else if (z) {
                charSequence2 = Options.VIBRATE_CHANNEL_NAME;
                str2 = "vibrate-channel-id";
            } else {
                charSequence2 = Options.SILENT_CHANNEL_NAME;
                str2 = "silent-channel-id";
            }
            z3 = false;
        }
        String str3 = str != null ? str : str2;
        createChannel(str3, charSequence != null ? charSequence : charSequence2, 4, Boolean.valueOf(z3), uri);
        return str3;
    }

    public void createChannel(String str, CharSequence charSequence, int i, Boolean bool, Uri uri) {
        NotificationManager notMgr = getNotMgr();
        if (Build.VERSION.SDK_INT >= 26 && notMgr.getNotificationChannel(str) == null) {
            NotificationChannel notificationChannel = new NotificationChannel(str, charSequence, i);
            notificationChannel.enableVibration(bool.booleanValue());
            if (!uri.equals(Uri.EMPTY)) {
                notificationChannel.setSound(uri, new AudioAttributes.Builder().setUsage(5).build());
            }
            notMgr.createNotificationChannel(notificationChannel);
        }
    }

    public Notification update(int i, JSONObject jSONObject, Class<?> cls) {
        Notification notification = get(i);
        if (notification == null) {
            return null;
        }
        notification.update(jSONObject, cls);
        return notification;
    }

    public Notification clear(int i) {
        Notification notification = get(i);
        if (notification != null) {
            notification.clear();
        }
        return notification;
    }

    public void clearAll() {
        Iterator<Notification> it = getByType(Notification.Type.TRIGGERED).iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        getNotCompMgr().cancelAll();
        setBadge(0);
    }

    public Notification cancel(int i) {
        Notification notification = get(i);
        if (notification != null) {
            notification.cancel();
        }
        return notification;
    }

    public void cancelAll() {
        Iterator<Notification> it = getAll().iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
        getNotCompMgr().cancelAll();
        setBadge(0);
    }

    public List<Integer> getIds() {
        Set<String> keySet = getPrefs().getAll().keySet();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = keySet.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(Integer.valueOf(Integer.parseInt(it.next())));
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        return arrayList;
    }

    public List<Integer> getIdsByType(Notification.Type type) {
        if (type == Notification.Type.ALL) {
            return getIds();
        }
        StatusBarNotification[] activeNotifications = getActiveNotifications();
        ArrayList arrayList = new ArrayList();
        for (StatusBarNotification statusBarNotification : activeNotifications) {
            arrayList.add(Integer.valueOf(statusBarNotification.getId()));
        }
        if (type == Notification.Type.TRIGGERED) {
            return arrayList;
        }
        List<Integer> ids = getIds();
        ids.removeAll(arrayList);
        return ids;
    }

    private List<Notification> getByIds(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Notification notification = get(it.next().intValue());
            if (notification != null) {
                arrayList.add(notification);
            }
        }
        return arrayList;
    }

    public List<Notification> getAll() {
        return getByIds(getIds());
    }

    private List<Notification> getByType(Notification.Type type) {
        if (type == Notification.Type.ALL) {
            return getAll();
        }
        return getByIds(getIdsByType(type));
    }

    public List<JSONObject> getOptions() {
        return getOptionsById(getIds());
    }

    public List<JSONObject> getOptionsById(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Options options = getOptions(it.next().intValue());
            if (options != null) {
                arrayList.add(options.getDict());
            }
        }
        return arrayList;
    }

    public List<JSONObject> getOptionsByType(Notification.Type type) {
        ArrayList arrayList = new ArrayList();
        Iterator<Notification> it = getByType(type).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getOptions().getDict());
        }
        return arrayList;
    }

    public Options getOptions(int i) {
        SharedPreferences prefs = getPrefs();
        String num = Integer.toString(i);
        if (!prefs.contains(num)) {
            return null;
        }
        try {
            return new Options(this.context, new JSONObject(prefs.getString(num, null)));
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Notification get(int i) {
        Options options = getOptions(i);
        if (options == null) {
            return null;
        }
        return new Notification(this.context, options);
    }

    public void setBadge(int i) {
        if (i == 0) {
            new BadgeImpl(this.context).clearBadge();
        } else {
            new BadgeImpl(this.context).setBadge(i);
        }
    }

    StatusBarNotification[] getActiveNotifications() {
        return getNotMgr().getActiveNotifications();
    }

    private SharedPreferences getPrefs() {
        return this.context.getSharedPreferences(Notification.EXTRA_ID, 0);
    }

    private NotificationManager getNotMgr() {
        return (NotificationManager) this.context.getSystemService("notification");
    }

    private NotificationManagerCompat getNotCompMgr() {
        return NotificationManagerCompat.from(this.context);
    }
}
