package de.appplant.cordova.plugin.notification;

import android.app.AlarmManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import androidx.collection.ArraySet;
import androidx.core.app.NotificationCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.work.Data;
import androidx.work.OneTimeWorkRequest;
import de.appplant.cordova.plugin.localnotification.LocalNotification;
import de.appplant.cordova.plugin.notification.util.PowerUtil;
import de.appplant.cordova.plugin.notification.worker.NotificationWorker;
import de.appplant.cordova.plugin.notification.worker.NotificationWorkerManager;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class Notification {
    public static final String EXTRA_ID = "NOTIFICATION_ID";
    public static final String EXTRA_UPDATE = "NOTIFICATION_UPDATE";
    static final String PREF_KEY_ID = "NOTIFICATION_ID";
    private static final String PREF_KEY_PID = "NOTIFICATION_PID";
    private static AudioManager audioMgr;
    private static SparseArray<NotificationCompat.Builder> cache;
    private static SharedPreferences settings;
    private final String TAG;
    private final NotificationCompat.Builder builder;
    private final Context context;
    private final Options options;

    public enum Type {
        ALL,
        SCHEDULED,
        TRIGGERED
    }

    Notification(Context context, Options options, NotificationCompat.Builder builder) {
        this.TAG = "Notification";
        this.context = context;
        this.options = options;
        this.builder = builder;
        settings = context.getSharedPreferences(context.getPackageName(), 0);
    }

    public Notification(Context context, Options options) {
        this.TAG = "Notification";
        this.context = context;
        this.options = options;
        this.builder = null;
        settings = context.getSharedPreferences(context.getPackageName(), 0);
    }

    public Context getContext() {
        return this.context;
    }

    public Options getOptions() {
        return this.options;
    }

    public int getId() {
        return this.options.getId().intValue();
    }

    public boolean isRepeating() {
        return getOptions().getTrigger().has("every");
    }

    public boolean isHighPrio() {
        return getOptions().getPrio() >= 1;
    }

    public Type getType() {
        StatusBarNotification[] activeNotifications = Manager.getInstance(this.context).getActiveNotifications();
        int id = getId();
        for (StatusBarNotification statusBarNotification : activeNotifications) {
            if (statusBarNotification.getId() == id) {
                return Type.TRIGGERED;
            }
        }
        return Type.SCHEDULED;
    }

    public boolean checkAlarmPermission() {
        return Build.VERSION.SDK_INT < 31 || getAlarmMgr().canScheduleExactAlarms();
    }

    void schedule(Request request, Class<?> cls) {
        PendingIntent broadcast;
        if (checkAlarmPermission()) {
            ArrayList<Pair> arrayList = new ArrayList();
            ArraySet arraySet = new ArraySet();
            AlarmManager alarmMgr = getAlarmMgr();
            cancelScheduledAlarms();
            do {
                Date triggerDate = request.getTriggerDate();
                Log.d("local-notification", "Next trigger at: " + triggerDate);
                if (triggerDate != null) {
                    Intent putExtra = new Intent(this.context, cls).setAction("NOTIFICATION_ID" + request.getIdentifier()).putExtra("NOTIFICATION_ID", this.options.getId()).putExtra("NOTIFICATION_OCCURRENCE", request.getOccurrence());
                    arraySet.add(putExtra.getAction());
                    arrayList.add(new Pair(triggerDate, putExtra));
                }
            } while (request.moveNext());
            if (arrayList.isEmpty()) {
                unpersist();
                return;
            }
            persist(arraySet);
            if (!this.options.isInfiniteTrigger()) {
                ((Intent) ((Pair) arrayList.get(arrayList.size() - 1)).second).putExtra(Request.EXTRA_LAST, true);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Pair pair : arrayList) {
                Date date = (Date) pair.first;
                long time = date.getTime();
                Intent intent = (Intent) pair.second;
                if (date.after(new Date()) || !trigger(intent, cls)) {
                    if (this.options.isWorker().booleanValue()) {
                        try {
                            arrayList2.add(new OneTimeWorkRequest.Builder(NotificationWorker.class).setInitialDelay(time - new Date().getTime(), TimeUnit.MILLISECONDS).setInputData(new Data.Builder().putInt("NOTIFICATION_ID", this.options.getId().intValue()).build()).build());
                        } catch (Exception e) {
                            Log.d("Notification", "Failed to build notification", e);
                        }
                    } else {
                        if (Build.VERSION.SDK_INT >= 31) {
                            broadcast = PendingIntent.getBroadcast(this.context, 0, intent, 301989888);
                        } else {
                            broadcast = PendingIntent.getBroadcast(this.context, 0, intent, 268435456);
                        }
                        try {
                            int prio = this.options.getPrio();
                            if (prio == -2) {
                                alarmMgr.setExact(1, time, broadcast);
                            } else if (prio == 2) {
                                alarmMgr.setAlarmClock(new AlarmManager.AlarmClockInfo(time, broadcast), broadcast);
                            } else {
                                alarmMgr.setExact(0, time, broadcast);
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            NotificationWorkerManager.beginWork(getContext(), arrayList2);
        }
    }

    private boolean trigger(Intent intent, Class<?> cls) {
        try {
            ((BroadcastReceiver) cls.newInstance()).onReceive(this.context, intent);
            return true;
        } catch (IllegalAccessException | InstantiationException unused) {
            return false;
        }
    }

    public void clear() {
        getNotMgr().cancel(getId());
        if (isRepeating()) {
            return;
        }
        unpersist();
    }

    public void cancel() {
        cancelScheduledAlarms();
        unpersist();
        getNotMgr().cancel(getId());
        clearCache();
    }

    private void cancelScheduledAlarms() {
        PendingIntent broadcast;
        Set<String> stringSet = getPrefs(PREF_KEY_PID).getStringSet(this.options.getIdentifier(), null);
        if (stringSet == null) {
            return;
        }
        Iterator<String> it = stringSet.iterator();
        while (it.hasNext()) {
            Intent intent = new Intent(it.next());
            if (Build.VERSION.SDK_INT >= 31) {
                broadcast = PendingIntent.getBroadcast(this.context, 0, intent, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            } else {
                broadcast = PendingIntent.getBroadcast(this.context, 0, intent, 0);
            }
            if (broadcast != null) {
                getAlarmMgr().cancel(broadcast);
            }
        }
    }

    public void show() {
        if (this.builder == null) {
            return;
        }
        if (this.options.showChronometer()) {
            cacheBuilder();
        }
        grantPermissionToPlaySoundFromExternal();
        adjustAlarmVolume(this.options);
        getNotMgr().notify(getId(), this.builder.build());
    }

    public void startShow(Bundle bundle) {
        boolean z = bundle.getBoolean(EXTRA_UPDATE, false);
        Context context = getContext();
        Options options = getOptions();
        Manager manager = Manager.getInstance(context);
        int badgeNumber = options.getBadgeNumber();
        if (badgeNumber > 0) {
            manager.setBadge(badgeNumber);
        }
        if (options.shallWakeUp()) {
            PowerUtil.wakeUp(context);
        }
        show();
        if (options.isInfiniteTrigger()) {
            manager.schedule(new Request(options), getClass());
        }
        if (z) {
            return;
        }
        LocalNotification.fireEvent("trigger", this);
    }

    void update(JSONObject jSONObject, Class<?> cls) {
        mergeJSONObjects(jSONObject);
        persist(null);
        if (getType() != Type.TRIGGERED) {
            return;
        }
        trigger(new Intent(this.context, cls).setAction("NOTIFICATION_ID" + this.options.getId()).putExtra("NOTIFICATION_ID", this.options.getId()).putExtra(EXTRA_UPDATE, true), cls);
    }

    public String toString() {
        JSONObject dict = this.options.getDict();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject = new JSONObject(dict.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    private void persist(Set<String> set) {
        String identifier = this.options.getIdentifier();
        SharedPreferences.Editor edit = getPrefs("NOTIFICATION_ID").edit();
        edit.putString(identifier, this.options.toString());
        edit.apply();
        if (set == null) {
            return;
        }
        SharedPreferences.Editor edit2 = getPrefs(PREF_KEY_PID).edit();
        edit2.putStringSet(identifier, set);
        edit2.apply();
    }

    private void unpersist() {
        String[] strArr = {"NOTIFICATION_ID", PREF_KEY_PID};
        String identifier = this.options.getIdentifier();
        for (int i = 0; i < 2; i++) {
            SharedPreferences.Editor edit = getPrefs(strArr[i]).edit();
            edit.remove(identifier);
            edit.apply();
        }
    }

    private void grantPermissionToPlaySoundFromExternal() {
        NotificationCompat.Builder builder = this.builder;
        if (builder == null) {
            return;
        }
        this.context.grantUriPermission("com.android.systemui", Uri.parse(builder.getExtras().getString("NOTIFICATION_SOUND")), 1);
    }

    private void mergeJSONObjects(JSONObject jSONObject) {
        JSONObject dict = this.options.getDict();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                dict.put(next, jSONObject.opt(next));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    private void cacheBuilder() {
        if (cache == null) {
            cache = new SparseArray<>();
        }
        cache.put(getId(), this.builder);
    }

    static NotificationCompat.Builder getCachedBuilder(int i) {
        SparseArray<NotificationCompat.Builder> sparseArray = cache;
        if (sparseArray != null) {
            return sparseArray.get(i);
        }
        return null;
    }

    private void clearCache() {
        SparseArray<NotificationCompat.Builder> sparseArray = cache;
        if (sparseArray != null) {
            sparseArray.delete(getId());
        }
    }

    private SharedPreferences getPrefs(String str) {
        return this.context.getSharedPreferences(str, 0);
    }

    private NotificationManager getNotMgr() {
        return (NotificationManager) this.context.getSystemService("notification");
    }

    private AlarmManager getAlarmMgr() {
        return (AlarmManager) this.context.getSystemService(NotificationCompat.CATEGORY_ALARM);
    }

    private void adjustAlarmVolume(Options options) {
        Integer volume = options.getVolume();
        if (volume.equals(Options.VOLUME_NOT_SET)) {
            return;
        }
        audioMgr = (AudioManager) this.context.getSystemService("audio");
        NotificationManager notificationManager = (NotificationManager) this.context.getSystemService("notification");
        Boolean valueOf = Boolean.valueOf(options.isWithVibration());
        Integer resetDelay = options.getResetDelay();
        if (resetDelay.intValue() <= 0) {
            resetDelay = Options.DEFAULT_RESET_DELAY;
        }
        Integer valueOf2 = Integer.valueOf(settings.getInt("alarmCount", 0));
        Integer valueOf3 = Integer.valueOf(audioMgr.getStreamVolume(5));
        Integer valueOf4 = Integer.valueOf(audioMgr.getRingerMode());
        if (valueOf2.equals(0)) {
            settings.edit().putInt("userVolume", valueOf3.intValue()).apply();
            settings.edit().putInt("userRingerMode", valueOf4.intValue()).apply();
        }
        Boolean valueOf5 = Boolean.valueOf(notificationManager.isNotificationPolicyAccessGranted() || audioMgr.getRingerMode() != 0);
        if (volume.intValue() > 0 && valueOf5.booleanValue()) {
            Double valueOf6 = Double.valueOf(Math.ceil(Integer.valueOf(audioMgr.getStreamMaxVolume(5)).intValue() * (volume.intValue() / 100.0d)));
            audioMgr.setRingerMode(2);
            audioMgr.setStreamVolume(5, valueOf6.intValue(), 8);
        } else if (valueOf5.booleanValue() && valueOf.booleanValue()) {
            audioMgr.setRingerMode(1);
        }
        new Timer().schedule(new TimerTask() { // from class: de.appplant.cordova.plugin.notification.Notification.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                Integer valueOf7 = Integer.valueOf(Integer.valueOf(Notification.settings.getInt("alarmCount", 0)).intValue() + (-1) > 0 ? r0.intValue() - 1 : 0);
                if (valueOf7.intValue() == 0) {
                    Integer valueOf8 = Integer.valueOf(Notification.settings.getInt("userRingerMode", -1));
                    Integer valueOf9 = Integer.valueOf(Notification.settings.getInt("userVolume", -1));
                    Notification.audioMgr.setRingerMode(valueOf8.intValue());
                    Notification.audioMgr.setStreamVolume(5, valueOf9.intValue(), 8);
                }
                Notification.settings.edit().putInt("alarmCount", valueOf7.intValue()).apply();
            }
        }, resetDelay.intValue() * 1000);
    }
}
