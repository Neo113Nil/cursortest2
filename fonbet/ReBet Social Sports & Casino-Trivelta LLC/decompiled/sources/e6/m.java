package e6;

import T3.AbstractC1585a0;
import android.R;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.Application;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.util.Log;
import androidx.core.app.o;
import androidx.core.app.x;
import com.dieam.reactnativepushnotification.modules.RNPushNotification;
import com.facebook.hermes.intl.Constants;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.ViewProps;
import com.twilio.voice.EventKeys;
import e6.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes2.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public Context f45725a;

    /* renamed from: b, reason: collision with root package name */
    public C4182c f45726b;

    /* renamed from: c, reason: collision with root package name */
    public final SharedPreferences f45727c;

    public class a implements o.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Bundle f45728a;

        public a(Bundle bundle) {
            this.f45728a = bundle;
        }

        @Override // e6.o.d
        public void a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3) {
            m.this.y(this.f45728a, bitmap, bitmap2, bitmap3);
        }
    }

    public m(Application application) {
        this.f45725a = application;
        this.f45726b = new C4182c(application);
        this.f45727c = application.getSharedPreferences("rn_push_notification", 0);
    }

    public void a() {
        Log.i(RNPushNotification.LOG_TAG, "Cancelling all notifications");
        Iterator<String> it = this.f45727c.getAll().keySet().iterator();
        while (it.hasNext()) {
            b(it.next());
        }
    }

    public void b(String str) {
        Log.i(RNPushNotification.LOG_TAG, "Cancelling notification: " + str);
        Bundle bundle = new Bundle();
        bundle.putString(StackTraceHelper.ID_KEY, str);
        PendingIntent z10 = z(bundle);
        if (z10 != null) {
            k().cancel(z10);
        }
        if (this.f45727c.contains(str)) {
            SharedPreferences.Editor edit = this.f45727c.edit();
            edit.remove(str);
            edit.apply();
        } else {
            Log.w(RNPushNotification.LOG_TAG, "Unable to find notification " + str);
        }
        try {
            t().cancel(Integer.parseInt(str));
        } catch (Exception e10) {
            Log.e(RNPushNotification.LOG_TAG, "Unable to parse Notification ID " + str, e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000f, code lost:
    
        r4 = r0.getNotificationChannel(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean c(String str) {
        NotificationChannel notificationChannel;
        int importance;
        if (Build.VERSION.SDK_INT < 26 || (r0 = t()) == null || notificationChannel == null) {
            return false;
        }
        importance = notificationChannel.getImportance();
        return importance == 0;
    }

    public boolean d(String str) {
        NotificationManager t10;
        NotificationChannel notificationChannel;
        if (Build.VERSION.SDK_INT < 26 || (t10 = t()) == null) {
            return false;
        }
        notificationChannel = t10.getNotificationChannel(str);
        return notificationChannel != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0021, code lost:
    
        if (r6.equals(r1) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002d, code lost:
    
        if (r7.equals(r0) == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(NotificationManager notificationManager, String str, String str2, String str3, Uri uri, int i10, long[] jArr) {
        NotificationChannel notificationChannel;
        String description;
        CharSequence name;
        if (Build.VERSION.SDK_INT < 26 || notificationManager == null) {
            return false;
        }
        notificationChannel = notificationManager.getNotificationChannel(str);
        if (notificationChannel != null || str2 == null || str3 == null) {
            if (notificationChannel != null) {
                if (str2 != null) {
                    name = notificationChannel.getName();
                }
                if (str3 != null) {
                    description = notificationChannel.getDescription();
                }
            }
            return false;
        }
        NotificationChannel a10 = AbstractC1585a0.a(str, str2, i10);
        a10.setDescription(str3);
        a10.enableLights(true);
        a10.enableVibration(jArr != null);
        a10.setVibrationPattern(jArr);
        if (uri != null) {
            a10.setSound(uri, new AudioAttributes.Builder().setContentType(4).setUsage(5).build());
        } else {
            a10.setSound(null, null);
        }
        notificationManager.createNotificationChannel(a10);
        return true;
    }

    public void f(ReadableArray readableArray) {
        NotificationManager t10 = t();
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            String string = readableArray.getString(i10);
            Log.i(RNPushNotification.LOG_TAG, "Removing notification with id " + string);
            t10.cancel(Integer.parseInt(string));
        }
    }

    public void g(String str, int i10) {
        Log.i(RNPushNotification.LOG_TAG, "Clearing notification: " + i10);
        NotificationManager t10 = t();
        if (str != null) {
            t10.cancel(str, i10);
        } else {
            t10.cancel(i10);
        }
    }

    public void h() {
        Log.i(RNPushNotification.LOG_TAG, "Clearing alerts from the notification centre");
        t().cancelAll();
    }

    public boolean i(ReadableMap readableMap) {
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        String string = readableMap.getString("channelId");
        String string2 = readableMap.getString("channelName");
        String string3 = readableMap.hasKey("channelDescription") ? readableMap.getString("channelDescription") : "";
        boolean z10 = !readableMap.hasKey("playSound") || readableMap.getBoolean("playSound");
        String string4 = readableMap.hasKey("soundName") ? readableMap.getString("soundName") : Constants.COLLATION_DEFAULT;
        return e(t(), string, string2, string3, z10 ? p(string4) : null, readableMap.hasKey("importance") ? readableMap.getInt("importance") : 4, (readableMap.hasKey("vibrate") && readableMap.getBoolean("vibrate")) ? new long[]{0, 300} : null);
    }

    public void j(String str) {
        NotificationManager t10;
        if (Build.VERSION.SDK_INT >= 26 && (t10 = t()) != null) {
            t10.deleteNotificationChannel(str);
        }
    }

    public final AlarmManager k() {
        return (AlarmManager) this.f45725a.getSystemService("alarm");
    }

    public WritableArray l() {
        WritableArray createArray = Arguments.createArray();
        StatusBarNotification[] activeNotifications = t().getActiveNotifications();
        Log.i(RNPushNotification.LOG_TAG, "Found " + activeNotifications.length + " delivered notifications");
        for (StatusBarNotification statusBarNotification : activeNotifications) {
            Notification notification = statusBarNotification.getNotification();
            Bundle bundle = notification.extras;
            WritableMap createMap = Arguments.createMap();
            createMap.putString("identifier", "" + statusBarNotification.getId());
            createMap.putString("title", bundle.getString("android.title"));
            createMap.putString("body", bundle.getString("android.text"));
            createMap.putString("tag", statusBarNotification.getTag());
            createMap.putString(EventKeys.EVENT_GROUP, notification.getGroup());
            createArray.pushMap(createMap);
        }
        return createArray;
    }

    public Class m() {
        try {
            return Class.forName(this.f45725a.getPackageManager().getLaunchIntentForPackage(this.f45725a.getPackageName()).getComponent().getClassName());
        } catch (ClassNotFoundException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public final int n(String str) {
        switch (str.hashCode()) {
            case -1074026988:
                return str.equals("minute") ? 12 : 5;
            case 99228:
                str.equals("day");
                return 5;
            case 3208676:
                return str.equals("hour") ? 10 : 5;
            case 3645428:
                return str.equals("week") ? 3 : 5;
            case 104080000:
                return str.equals("month") ? 2 : 5;
            default:
                return 5;
        }
    }

    public WritableArray o() {
        WritableArray createArray = Arguments.createArray();
        Iterator<Map.Entry<String, ?>> it = this.f45727c.getAll().entrySet().iterator();
        while (it.hasNext()) {
            try {
                C4181b a10 = C4181b.a(it.next().getValue().toString());
                WritableMap createMap = Arguments.createMap();
                createMap.putString("title", a10.h());
                createMap.putString("message", a10.d());
                createMap.putString("number", a10.e());
                createMap.putDouble("date", a10.b());
                createMap.putString(StackTraceHelper.ID_KEY, a10.c());
                createMap.putString("repeatInterval", a10.f());
                createMap.putString("soundName", a10.g());
                createMap.putString(EventKeys.DATA, a10.i());
                createArray.pushMap(createMap);
            } catch (JSONException e10) {
                Log.e(RNPushNotification.LOG_TAG, e10.getMessage());
            }
        }
        return createArray;
    }

    public final Uri p(String str) {
        int identifier;
        if (str == null || Constants.COLLATION_DEFAULT.equalsIgnoreCase(str)) {
            return RingtoneManager.getDefaultUri(2);
        }
        if (this.f45725a.getResources().getIdentifier(str, "raw", this.f45725a.getPackageName()) != 0) {
            identifier = this.f45725a.getResources().getIdentifier(str, "raw", this.f45725a.getPackageName());
        } else {
            identifier = this.f45725a.getResources().getIdentifier(str.substring(0, str.lastIndexOf(46)), "raw", this.f45725a.getPackageName());
        }
        return Uri.parse("android.resource://" + this.f45725a.getPackageName() + "/" + identifier);
    }

    public void q(Bundle bundle) {
        try {
            Intent intent = new Intent(this.f45725a, Class.forName(this.f45725a.getPackageManager().getLaunchIntentForPackage(this.f45725a.getPackageName()).getComponent().getClassName()));
            if (bundle != null) {
                intent.putExtra("notification", bundle);
            }
            intent.addFlags(268435456);
            this.f45725a.startActivity(intent);
        } catch (Exception e10) {
            Log.e(RNPushNotification.LOG_TAG, "Class not found", e10);
        }
    }

    public boolean r() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f45725a.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.processName.equals(this.f45725a.getPackageName()) && runningAppProcessInfo.importance == 100 && runningAppProcessInfo.pkgList.length > 0) {
                return true;
            }
        }
        return false;
    }

    public List s() {
        NotificationManager t10;
        List notificationChannels;
        String id2;
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 26 && (t10 = t()) != null) {
            notificationChannels = t10.getNotificationChannels();
            Iterator it = notificationChannels.iterator();
            while (it.hasNext()) {
                id2 = androidx.core.app.m.a(it.next()).getId();
                arrayList.add(id2);
            }
        }
        return arrayList;
    }

    public final NotificationManager t() {
        return (NotificationManager) this.f45725a.getSystemService("notification");
    }

    public final void u(Bundle bundle) {
        long timeInMillis;
        String string = bundle.getString("repeatType");
        long j10 = (long) bundle.getDouble("repeatTime");
        if (string != null) {
            long j11 = (long) bundle.getDouble("fireDate");
            if (!Arrays.asList("time", "month", "week", "day", "hour", "minute").contains(string)) {
                Log.w(RNPushNotification.LOG_TAG, String.format("Invalid repeatType specified as %s", string));
                return;
            }
            if ("time".equals(string) && j10 <= 0) {
                Log.w(RNPushNotification.LOG_TAG, "repeatType specified as time but no repeatTime has been mentioned");
                return;
            }
            if ("time".equals(string)) {
                timeInMillis = j11 + j10;
            } else {
                int n10 = n(string);
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(j11);
                calendar.add(n10, j10 > 0 ? (int) j10 : 1);
                timeInMillis = calendar.getTimeInMillis();
            }
            if (timeInMillis != 0) {
                String.format("Repeating notification with id %s at time %s", bundle.getString(StackTraceHelper.ID_KEY), Long.toString(timeInMillis));
                bundle.putDouble("fireDate", timeInMillis);
                v(bundle);
            }
        }
    }

    public void v(Bundle bundle) {
        if (m() == null) {
            Log.e(RNPushNotification.LOG_TAG, "No activity class found for the scheduled notification");
            return;
        }
        if (bundle.getString("message") == null) {
            Log.e(RNPushNotification.LOG_TAG, "No message specified for the scheduled notification");
            return;
        }
        if (bundle.getString(StackTraceHelper.ID_KEY) == null) {
            Log.e(RNPushNotification.LOG_TAG, "No notification ID specified for the scheduled notification");
            return;
        }
        if (bundle.getDouble("fireDate") == 0.0d) {
            Log.e(RNPushNotification.LOG_TAG, "No date specified for the scheduled notification");
            return;
        }
        C4181b c4181b = new C4181b(bundle);
        String c10 = c4181b.c();
        SharedPreferences.Editor edit = this.f45727c.edit();
        edit.putString(c10, c4181b.j().toString());
        edit.apply();
        if (!this.f45727c.contains(c10)) {
            Log.e(RNPushNotification.LOG_TAG, "Failed to save " + c10);
        }
        w(bundle);
    }

    public void w(Bundle bundle) {
        long j10 = (long) bundle.getDouble("fireDate");
        boolean z10 = bundle.getBoolean("allowWhileIdle");
        PendingIntent z11 = z(bundle);
        if (z11 == null) {
            return;
        }
        String.format("Setting a notification with id %s at time %s", bundle.getString(StackTraceHelper.ID_KEY), Long.toString(j10));
        if (z10) {
            k().setExactAndAllowWhileIdle(0, j10, z11);
        } else {
            k().setExact(0, j10, z11);
        }
    }

    public void x(Bundle bundle) {
        o oVar = new o(new a(bundle));
        oVar.h(this.f45725a, bundle.getString("largeIconUrl"));
        oVar.d(this.f45725a, bundle.getString("bigLargeIconUrl"));
        oVar.f(this.f45725a, bundle.getString("bigPictureUrl"));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(53:208|61|62|(1:66)|67|(3:69|(1:(1:204)(1:205))(2:73|(1:75)(1:202))|(47:77|(1:79)|80|(1:82)|(2:(1:197)(1:91)|92)(2:198|(1:200)(1:201))|93|94|(1:96)|97|(37:102|(26:104|(1:106)|107|108|(1:194)|112|(1:114)(2:191|(1:193))|115|(7:181|182|(1:184)(1:190)|185|(1:189)|187|188)|119|(4:121|(1:123)|124|(1:126))|127|(1:129)|130|131|132|133|(1:135)(1:176)|136|(3:138|(8:141|142|143|(1:145)|146|(2:148|149)(2:151|152)|150|139)|157)|158|(1:160)|161|(2:167|(1:169)(1:170))|165|166)|195|107|108|(1:110)|194|112|(0)(0)|115|(1:117)|181|182|(0)(0)|185|(0)|187|188|119|(0)|127|(0)|130|131|132|133|(0)(0)|136|(0)|158|(0)|161|(1:163)|167|(0)(0)|165|166)|196|(0)|195|107|108|(0)|194|112|(0)(0)|115|(0)|181|182|(0)(0)|185|(0)|187|188|119|(0)|127|(0)|130|131|132|133|(0)(0)|136|(0)|158|(0)|161|(0)|167|(0)(0)|165|166))|206|(0)|80|(0)|(0)(0)|93|94|(0)|97|(38:99|102|(0)|195|107|108|(0)|194|112|(0)(0)|115|(0)|181|182|(0)(0)|185|(0)|187|188|119|(0)|127|(0)|130|131|132|133|(0)(0)|136|(0)|158|(0)|161|(0)|167|(0)(0)|165|166)|196|(0)|195|107|108|(0)|194|112|(0)(0)|115|(0)|181|182|(0)(0)|185|(0)|187|188|119|(0)|127|(0)|130|131|132|133|(0)(0)|136|(0)|158|(0)|161|(0)|167|(0)(0)|165|166) */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0399, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x03a1, code lost:
    
        r12 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x03a3, code lost:
    
        android.util.Log.e(r12, "Exception while converting actions to JSON object.", r0);
        r5 = null;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02d1 A[Catch: Exception -> 0x0070, TryCatch #1 {Exception -> 0x0070, blocks: (B:235:0x0061, B:19:0x007c, B:21:0x0086, B:22:0x008e, B:24:0x0092, B:27:0x00cf, B:29:0x00d7, B:37:0x0114, B:39:0x011c, B:40:0x0122, B:42:0x0168, B:43:0x016b, B:45:0x0175, B:46:0x0178, B:48:0x017e, B:50:0x018b, B:52:0x0193, B:53:0x019a, B:56:0x01a6, B:58:0x01ac, B:60:0x01b2, B:64:0x01c8, B:67:0x01d1, B:69:0x01da, B:71:0x01e2, B:73:0x01e8, B:75:0x01ee, B:77:0x01ff, B:79:0x0208, B:80:0x020b, B:82:0x021a, B:85:0x0221, B:87:0x0229, B:89:0x022f, B:91:0x0235, B:92:0x023c, B:93:0x0272, B:96:0x029d, B:97:0x02a0, B:99:0x02a7, B:108:0x02cb, B:110:0x02d1, B:112:0x02de, B:114:0x02f1, B:115:0x02ff, B:117:0x0319, B:121:0x034e, B:123:0x0356, B:124:0x0359, B:126:0x0364, B:127:0x0367, B:129:0x0372, B:130:0x0375, B:133:0x0389, B:135:0x038f, B:182:0x0325, B:184:0x032d, B:188:0x033e, B:193:0x02fc, B:194:0x02d7, B:195:0x02c7, B:196:0x02b0, B:198:0x0252, B:200:0x025a, B:201:0x0264, B:204:0x01f7, B:208:0x01bb, B:210:0x0184, B:211:0x00f3, B:212:0x00fb, B:215:0x0105, B:220:0x009e, B:221:0x00a8, B:224:0x00b4, B:227:0x00c0), top: B:234:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02f1 A[Catch: Exception -> 0x0070, TryCatch #1 {Exception -> 0x0070, blocks: (B:235:0x0061, B:19:0x007c, B:21:0x0086, B:22:0x008e, B:24:0x0092, B:27:0x00cf, B:29:0x00d7, B:37:0x0114, B:39:0x011c, B:40:0x0122, B:42:0x0168, B:43:0x016b, B:45:0x0175, B:46:0x0178, B:48:0x017e, B:50:0x018b, B:52:0x0193, B:53:0x019a, B:56:0x01a6, B:58:0x01ac, B:60:0x01b2, B:64:0x01c8, B:67:0x01d1, B:69:0x01da, B:71:0x01e2, B:73:0x01e8, B:75:0x01ee, B:77:0x01ff, B:79:0x0208, B:80:0x020b, B:82:0x021a, B:85:0x0221, B:87:0x0229, B:89:0x022f, B:91:0x0235, B:92:0x023c, B:93:0x0272, B:96:0x029d, B:97:0x02a0, B:99:0x02a7, B:108:0x02cb, B:110:0x02d1, B:112:0x02de, B:114:0x02f1, B:115:0x02ff, B:117:0x0319, B:121:0x034e, B:123:0x0356, B:124:0x0359, B:126:0x0364, B:127:0x0367, B:129:0x0372, B:130:0x0375, B:133:0x0389, B:135:0x038f, B:182:0x0325, B:184:0x032d, B:188:0x033e, B:193:0x02fc, B:194:0x02d7, B:195:0x02c7, B:196:0x02b0, B:198:0x0252, B:200:0x025a, B:201:0x0264, B:204:0x01f7, B:208:0x01bb, B:210:0x0184, B:211:0x00f3, B:212:0x00fb, B:215:0x0105, B:220:0x009e, B:221:0x00a8, B:224:0x00b4, B:227:0x00c0), top: B:234:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0319 A[Catch: Exception -> 0x0070, TryCatch #1 {Exception -> 0x0070, blocks: (B:235:0x0061, B:19:0x007c, B:21:0x0086, B:22:0x008e, B:24:0x0092, B:27:0x00cf, B:29:0x00d7, B:37:0x0114, B:39:0x011c, B:40:0x0122, B:42:0x0168, B:43:0x016b, B:45:0x0175, B:46:0x0178, B:48:0x017e, B:50:0x018b, B:52:0x0193, B:53:0x019a, B:56:0x01a6, B:58:0x01ac, B:60:0x01b2, B:64:0x01c8, B:67:0x01d1, B:69:0x01da, B:71:0x01e2, B:73:0x01e8, B:75:0x01ee, B:77:0x01ff, B:79:0x0208, B:80:0x020b, B:82:0x021a, B:85:0x0221, B:87:0x0229, B:89:0x022f, B:91:0x0235, B:92:0x023c, B:93:0x0272, B:96:0x029d, B:97:0x02a0, B:99:0x02a7, B:108:0x02cb, B:110:0x02d1, B:112:0x02de, B:114:0x02f1, B:115:0x02ff, B:117:0x0319, B:121:0x034e, B:123:0x0356, B:124:0x0359, B:126:0x0364, B:127:0x0367, B:129:0x0372, B:130:0x0375, B:133:0x0389, B:135:0x038f, B:182:0x0325, B:184:0x032d, B:188:0x033e, B:193:0x02fc, B:194:0x02d7, B:195:0x02c7, B:196:0x02b0, B:198:0x0252, B:200:0x025a, B:201:0x0264, B:204:0x01f7, B:208:0x01bb, B:210:0x0184, B:211:0x00f3, B:212:0x00fb, B:215:0x0105, B:220:0x009e, B:221:0x00a8, B:224:0x00b4, B:227:0x00c0), top: B:234:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x034e A[Catch: Exception -> 0x0070, TryCatch #1 {Exception -> 0x0070, blocks: (B:235:0x0061, B:19:0x007c, B:21:0x0086, B:22:0x008e, B:24:0x0092, B:27:0x00cf, B:29:0x00d7, B:37:0x0114, B:39:0x011c, B:40:0x0122, B:42:0x0168, B:43:0x016b, B:45:0x0175, B:46:0x0178, B:48:0x017e, B:50:0x018b, B:52:0x0193, B:53:0x019a, B:56:0x01a6, B:58:0x01ac, B:60:0x01b2, B:64:0x01c8, B:67:0x01d1, B:69:0x01da, B:71:0x01e2, B:73:0x01e8, B:75:0x01ee, B:77:0x01ff, B:79:0x0208, B:80:0x020b, B:82:0x021a, B:85:0x0221, B:87:0x0229, B:89:0x022f, B:91:0x0235, B:92:0x023c, B:93:0x0272, B:96:0x029d, B:97:0x02a0, B:99:0x02a7, B:108:0x02cb, B:110:0x02d1, B:112:0x02de, B:114:0x02f1, B:115:0x02ff, B:117:0x0319, B:121:0x034e, B:123:0x0356, B:124:0x0359, B:126:0x0364, B:127:0x0367, B:129:0x0372, B:130:0x0375, B:133:0x0389, B:135:0x038f, B:182:0x0325, B:184:0x032d, B:188:0x033e, B:193:0x02fc, B:194:0x02d7, B:195:0x02c7, B:196:0x02b0, B:198:0x0252, B:200:0x025a, B:201:0x0264, B:204:0x01f7, B:208:0x01bb, B:210:0x0184, B:211:0x00f3, B:212:0x00fb, B:215:0x0105, B:220:0x009e, B:221:0x00a8, B:224:0x00b4, B:227:0x00c0), top: B:234:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0372 A[Catch: Exception -> 0x0070, TryCatch #1 {Exception -> 0x0070, blocks: (B:235:0x0061, B:19:0x007c, B:21:0x0086, B:22:0x008e, B:24:0x0092, B:27:0x00cf, B:29:0x00d7, B:37:0x0114, B:39:0x011c, B:40:0x0122, B:42:0x0168, B:43:0x016b, B:45:0x0175, B:46:0x0178, B:48:0x017e, B:50:0x018b, B:52:0x0193, B:53:0x019a, B:56:0x01a6, B:58:0x01ac, B:60:0x01b2, B:64:0x01c8, B:67:0x01d1, B:69:0x01da, B:71:0x01e2, B:73:0x01e8, B:75:0x01ee, B:77:0x01ff, B:79:0x0208, B:80:0x020b, B:82:0x021a, B:85:0x0221, B:87:0x0229, B:89:0x022f, B:91:0x0235, B:92:0x023c, B:93:0x0272, B:96:0x029d, B:97:0x02a0, B:99:0x02a7, B:108:0x02cb, B:110:0x02d1, B:112:0x02de, B:114:0x02f1, B:115:0x02ff, B:117:0x0319, B:121:0x034e, B:123:0x0356, B:124:0x0359, B:126:0x0364, B:127:0x0367, B:129:0x0372, B:130:0x0375, B:133:0x0389, B:135:0x038f, B:182:0x0325, B:184:0x032d, B:188:0x033e, B:193:0x02fc, B:194:0x02d7, B:195:0x02c7, B:196:0x02b0, B:198:0x0252, B:200:0x025a, B:201:0x0264, B:204:0x01f7, B:208:0x01bb, B:210:0x0184, B:211:0x00f3, B:212:0x00fb, B:215:0x0105, B:220:0x009e, B:221:0x00a8, B:224:0x00b4, B:227:0x00c0), top: B:234:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x038f A[Catch: Exception -> 0x0070, JSONException -> 0x0399, TRY_LEAVE, TryCatch #1 {Exception -> 0x0070, blocks: (B:235:0x0061, B:19:0x007c, B:21:0x0086, B:22:0x008e, B:24:0x0092, B:27:0x00cf, B:29:0x00d7, B:37:0x0114, B:39:0x011c, B:40:0x0122, B:42:0x0168, B:43:0x016b, B:45:0x0175, B:46:0x0178, B:48:0x017e, B:50:0x018b, B:52:0x0193, B:53:0x019a, B:56:0x01a6, B:58:0x01ac, B:60:0x01b2, B:64:0x01c8, B:67:0x01d1, B:69:0x01da, B:71:0x01e2, B:73:0x01e8, B:75:0x01ee, B:77:0x01ff, B:79:0x0208, B:80:0x020b, B:82:0x021a, B:85:0x0221, B:87:0x0229, B:89:0x022f, B:91:0x0235, B:92:0x023c, B:93:0x0272, B:96:0x029d, B:97:0x02a0, B:99:0x02a7, B:108:0x02cb, B:110:0x02d1, B:112:0x02de, B:114:0x02f1, B:115:0x02ff, B:117:0x0319, B:121:0x034e, B:123:0x0356, B:124:0x0359, B:126:0x0364, B:127:0x0367, B:129:0x0372, B:130:0x0375, B:133:0x0389, B:135:0x038f, B:182:0x0325, B:184:0x032d, B:188:0x033e, B:193:0x02fc, B:194:0x02d7, B:195:0x02c7, B:196:0x02b0, B:198:0x0252, B:200:0x025a, B:201:0x0264, B:204:0x01f7, B:208:0x01bb, B:210:0x0184, B:211:0x00f3, B:212:0x00fb, B:215:0x0105, B:220:0x009e, B:221:0x00a8, B:224:0x00b4, B:227:0x00c0), top: B:234:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0462 A[Catch: Exception -> 0x0026, TryCatch #3 {Exception -> 0x0026, blocks: (B:3:0x001a, B:5:0x0020, B:8:0x0029, B:10:0x002f, B:12:0x0033, B:14:0x003b, B:16:0x0041, B:139:0x03aa, B:142:0x03b0, B:143:0x03b4, B:145:0x03e8, B:146:0x03eb, B:148:0x03fb, B:150:0x044d, B:151:0x0430, B:155:0x0442, B:158:0x0457, B:160:0x0462, B:161:0x046e, B:163:0x0474, B:165:0x0499, B:167:0x047c, B:169:0x048e, B:170:0x0496, B:180:0x03a3, B:133:0x0389, B:135:0x038f), top: B:2:0x001a, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0474 A[Catch: Exception -> 0x0026, TryCatch #3 {Exception -> 0x0026, blocks: (B:3:0x001a, B:5:0x0020, B:8:0x0029, B:10:0x002f, B:12:0x0033, B:14:0x003b, B:16:0x0041, B:139:0x03aa, B:142:0x03b0, B:143:0x03b4, B:145:0x03e8, B:146:0x03eb, B:148:0x03fb, B:150:0x044d, B:151:0x0430, B:155:0x0442, B:158:0x0457, B:160:0x0462, B:161:0x046e, B:163:0x0474, B:165:0x0499, B:167:0x047c, B:169:0x048e, B:170:0x0496, B:180:0x03a3, B:133:0x0389, B:135:0x038f), top: B:2:0x001a, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x048e A[Catch: Exception -> 0x0026, TryCatch #3 {Exception -> 0x0026, blocks: (B:3:0x001a, B:5:0x0020, B:8:0x0029, B:10:0x002f, B:12:0x0033, B:14:0x003b, B:16:0x0041, B:139:0x03aa, B:142:0x03b0, B:143:0x03b4, B:145:0x03e8, B:146:0x03eb, B:148:0x03fb, B:150:0x044d, B:151:0x0430, B:155:0x0442, B:158:0x0457, B:160:0x0462, B:161:0x046e, B:163:0x0474, B:165:0x0499, B:167:0x047c, B:169:0x048e, B:170:0x0496, B:180:0x03a3, B:133:0x0389, B:135:0x038f), top: B:2:0x001a, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0496 A[Catch: Exception -> 0x0026, TryCatch #3 {Exception -> 0x0026, blocks: (B:3:0x001a, B:5:0x0020, B:8:0x0029, B:10:0x002f, B:12:0x0033, B:14:0x003b, B:16:0x0041, B:139:0x03aa, B:142:0x03b0, B:143:0x03b4, B:145:0x03e8, B:146:0x03eb, B:148:0x03fb, B:150:0x044d, B:151:0x0430, B:155:0x0442, B:158:0x0457, B:160:0x0462, B:161:0x046e, B:163:0x0474, B:165:0x0499, B:167:0x047c, B:169:0x048e, B:170:0x0496, B:180:0x03a3, B:133:0x0389, B:135:0x038f), top: B:2:0x001a, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x032d A[Catch: Exception -> 0x0070, TryCatch #1 {Exception -> 0x0070, blocks: (B:235:0x0061, B:19:0x007c, B:21:0x0086, B:22:0x008e, B:24:0x0092, B:27:0x00cf, B:29:0x00d7, B:37:0x0114, B:39:0x011c, B:40:0x0122, B:42:0x0168, B:43:0x016b, B:45:0x0175, B:46:0x0178, B:48:0x017e, B:50:0x018b, B:52:0x0193, B:53:0x019a, B:56:0x01a6, B:58:0x01ac, B:60:0x01b2, B:64:0x01c8, B:67:0x01d1, B:69:0x01da, B:71:0x01e2, B:73:0x01e8, B:75:0x01ee, B:77:0x01ff, B:79:0x0208, B:80:0x020b, B:82:0x021a, B:85:0x0221, B:87:0x0229, B:89:0x022f, B:91:0x0235, B:92:0x023c, B:93:0x0272, B:96:0x029d, B:97:0x02a0, B:99:0x02a7, B:108:0x02cb, B:110:0x02d1, B:112:0x02de, B:114:0x02f1, B:115:0x02ff, B:117:0x0319, B:121:0x034e, B:123:0x0356, B:124:0x0359, B:126:0x0364, B:127:0x0367, B:129:0x0372, B:130:0x0375, B:133:0x0389, B:135:0x038f, B:182:0x0325, B:184:0x032d, B:188:0x033e, B:193:0x02fc, B:194:0x02d7, B:195:0x02c7, B:196:0x02b0, B:198:0x0252, B:200:0x025a, B:201:0x0264, B:204:0x01f7, B:208:0x01bb, B:210:0x0184, B:211:0x00f3, B:212:0x00fb, B:215:0x0105, B:220:0x009e, B:221:0x00a8, B:224:0x00b4, B:227:0x00c0), top: B:234:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0252 A[Catch: Exception -> 0x0070, TryCatch #1 {Exception -> 0x0070, blocks: (B:235:0x0061, B:19:0x007c, B:21:0x0086, B:22:0x008e, B:24:0x0092, B:27:0x00cf, B:29:0x00d7, B:37:0x0114, B:39:0x011c, B:40:0x0122, B:42:0x0168, B:43:0x016b, B:45:0x0175, B:46:0x0178, B:48:0x017e, B:50:0x018b, B:52:0x0193, B:53:0x019a, B:56:0x01a6, B:58:0x01ac, B:60:0x01b2, B:64:0x01c8, B:67:0x01d1, B:69:0x01da, B:71:0x01e2, B:73:0x01e8, B:75:0x01ee, B:77:0x01ff, B:79:0x0208, B:80:0x020b, B:82:0x021a, B:85:0x0221, B:87:0x0229, B:89:0x022f, B:91:0x0235, B:92:0x023c, B:93:0x0272, B:96:0x029d, B:97:0x02a0, B:99:0x02a7, B:108:0x02cb, B:110:0x02d1, B:112:0x02de, B:114:0x02f1, B:115:0x02ff, B:117:0x0319, B:121:0x034e, B:123:0x0356, B:124:0x0359, B:126:0x0364, B:127:0x0367, B:129:0x0372, B:130:0x0375, B:133:0x0389, B:135:0x038f, B:182:0x0325, B:184:0x032d, B:188:0x033e, B:193:0x02fc, B:194:0x02d7, B:195:0x02c7, B:196:0x02b0, B:198:0x0252, B:200:0x025a, B:201:0x0264, B:204:0x01f7, B:208:0x01bb, B:210:0x0184, B:211:0x00f3, B:212:0x00fb, B:215:0x0105, B:220:0x009e, B:221:0x00a8, B:224:0x00b4, B:227:0x00c0), top: B:234:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x01bb A[Catch: Exception -> 0x0070, TRY_LEAVE, TryCatch #1 {Exception -> 0x0070, blocks: (B:235:0x0061, B:19:0x007c, B:21:0x0086, B:22:0x008e, B:24:0x0092, B:27:0x00cf, B:29:0x00d7, B:37:0x0114, B:39:0x011c, B:40:0x0122, B:42:0x0168, B:43:0x016b, B:45:0x0175, B:46:0x0178, B:48:0x017e, B:50:0x018b, B:52:0x0193, B:53:0x019a, B:56:0x01a6, B:58:0x01ac, B:60:0x01b2, B:64:0x01c8, B:67:0x01d1, B:69:0x01da, B:71:0x01e2, B:73:0x01e8, B:75:0x01ee, B:77:0x01ff, B:79:0x0208, B:80:0x020b, B:82:0x021a, B:85:0x0221, B:87:0x0229, B:89:0x022f, B:91:0x0235, B:92:0x023c, B:93:0x0272, B:96:0x029d, B:97:0x02a0, B:99:0x02a7, B:108:0x02cb, B:110:0x02d1, B:112:0x02de, B:114:0x02f1, B:115:0x02ff, B:117:0x0319, B:121:0x034e, B:123:0x0356, B:124:0x0359, B:126:0x0364, B:127:0x0367, B:129:0x0372, B:130:0x0375, B:133:0x0389, B:135:0x038f, B:182:0x0325, B:184:0x032d, B:188:0x033e, B:193:0x02fc, B:194:0x02d7, B:195:0x02c7, B:196:0x02b0, B:198:0x0252, B:200:0x025a, B:201:0x0264, B:204:0x01f7, B:208:0x01bb, B:210:0x0184, B:211:0x00f3, B:212:0x00fb, B:215:0x0105, B:220:0x009e, B:221:0x00a8, B:224:0x00b4, B:227:0x00c0), top: B:234:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d7 A[Catch: Exception -> 0x0070, TryCatch #1 {Exception -> 0x0070, blocks: (B:235:0x0061, B:19:0x007c, B:21:0x0086, B:22:0x008e, B:24:0x0092, B:27:0x00cf, B:29:0x00d7, B:37:0x0114, B:39:0x011c, B:40:0x0122, B:42:0x0168, B:43:0x016b, B:45:0x0175, B:46:0x0178, B:48:0x017e, B:50:0x018b, B:52:0x0193, B:53:0x019a, B:56:0x01a6, B:58:0x01ac, B:60:0x01b2, B:64:0x01c8, B:67:0x01d1, B:69:0x01da, B:71:0x01e2, B:73:0x01e8, B:75:0x01ee, B:77:0x01ff, B:79:0x0208, B:80:0x020b, B:82:0x021a, B:85:0x0221, B:87:0x0229, B:89:0x022f, B:91:0x0235, B:92:0x023c, B:93:0x0272, B:96:0x029d, B:97:0x02a0, B:99:0x02a7, B:108:0x02cb, B:110:0x02d1, B:112:0x02de, B:114:0x02f1, B:115:0x02ff, B:117:0x0319, B:121:0x034e, B:123:0x0356, B:124:0x0359, B:126:0x0364, B:127:0x0367, B:129:0x0372, B:130:0x0375, B:133:0x0389, B:135:0x038f, B:182:0x0325, B:184:0x032d, B:188:0x033e, B:193:0x02fc, B:194:0x02d7, B:195:0x02c7, B:196:0x02b0, B:198:0x0252, B:200:0x025a, B:201:0x0264, B:204:0x01f7, B:208:0x01bb, B:210:0x0184, B:211:0x00f3, B:212:0x00fb, B:215:0x0105, B:220:0x009e, B:221:0x00a8, B:224:0x00b4, B:227:0x00c0), top: B:234:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011c A[Catch: Exception -> 0x0070, TryCatch #1 {Exception -> 0x0070, blocks: (B:235:0x0061, B:19:0x007c, B:21:0x0086, B:22:0x008e, B:24:0x0092, B:27:0x00cf, B:29:0x00d7, B:37:0x0114, B:39:0x011c, B:40:0x0122, B:42:0x0168, B:43:0x016b, B:45:0x0175, B:46:0x0178, B:48:0x017e, B:50:0x018b, B:52:0x0193, B:53:0x019a, B:56:0x01a6, B:58:0x01ac, B:60:0x01b2, B:64:0x01c8, B:67:0x01d1, B:69:0x01da, B:71:0x01e2, B:73:0x01e8, B:75:0x01ee, B:77:0x01ff, B:79:0x0208, B:80:0x020b, B:82:0x021a, B:85:0x0221, B:87:0x0229, B:89:0x022f, B:91:0x0235, B:92:0x023c, B:93:0x0272, B:96:0x029d, B:97:0x02a0, B:99:0x02a7, B:108:0x02cb, B:110:0x02d1, B:112:0x02de, B:114:0x02f1, B:115:0x02ff, B:117:0x0319, B:121:0x034e, B:123:0x0356, B:124:0x0359, B:126:0x0364, B:127:0x0367, B:129:0x0372, B:130:0x0375, B:133:0x0389, B:135:0x038f, B:182:0x0325, B:184:0x032d, B:188:0x033e, B:193:0x02fc, B:194:0x02d7, B:195:0x02c7, B:196:0x02b0, B:198:0x0252, B:200:0x025a, B:201:0x0264, B:204:0x01f7, B:208:0x01bb, B:210:0x0184, B:211:0x00f3, B:212:0x00fb, B:215:0x0105, B:220:0x009e, B:221:0x00a8, B:224:0x00b4, B:227:0x00c0), top: B:234:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0168 A[Catch: Exception -> 0x0070, TryCatch #1 {Exception -> 0x0070, blocks: (B:235:0x0061, B:19:0x007c, B:21:0x0086, B:22:0x008e, B:24:0x0092, B:27:0x00cf, B:29:0x00d7, B:37:0x0114, B:39:0x011c, B:40:0x0122, B:42:0x0168, B:43:0x016b, B:45:0x0175, B:46:0x0178, B:48:0x017e, B:50:0x018b, B:52:0x0193, B:53:0x019a, B:56:0x01a6, B:58:0x01ac, B:60:0x01b2, B:64:0x01c8, B:67:0x01d1, B:69:0x01da, B:71:0x01e2, B:73:0x01e8, B:75:0x01ee, B:77:0x01ff, B:79:0x0208, B:80:0x020b, B:82:0x021a, B:85:0x0221, B:87:0x0229, B:89:0x022f, B:91:0x0235, B:92:0x023c, B:93:0x0272, B:96:0x029d, B:97:0x02a0, B:99:0x02a7, B:108:0x02cb, B:110:0x02d1, B:112:0x02de, B:114:0x02f1, B:115:0x02ff, B:117:0x0319, B:121:0x034e, B:123:0x0356, B:124:0x0359, B:126:0x0364, B:127:0x0367, B:129:0x0372, B:130:0x0375, B:133:0x0389, B:135:0x038f, B:182:0x0325, B:184:0x032d, B:188:0x033e, B:193:0x02fc, B:194:0x02d7, B:195:0x02c7, B:196:0x02b0, B:198:0x0252, B:200:0x025a, B:201:0x0264, B:204:0x01f7, B:208:0x01bb, B:210:0x0184, B:211:0x00f3, B:212:0x00fb, B:215:0x0105, B:220:0x009e, B:221:0x00a8, B:224:0x00b4, B:227:0x00c0), top: B:234:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0175 A[Catch: Exception -> 0x0070, TryCatch #1 {Exception -> 0x0070, blocks: (B:235:0x0061, B:19:0x007c, B:21:0x0086, B:22:0x008e, B:24:0x0092, B:27:0x00cf, B:29:0x00d7, B:37:0x0114, B:39:0x011c, B:40:0x0122, B:42:0x0168, B:43:0x016b, B:45:0x0175, B:46:0x0178, B:48:0x017e, B:50:0x018b, B:52:0x0193, B:53:0x019a, B:56:0x01a6, B:58:0x01ac, B:60:0x01b2, B:64:0x01c8, B:67:0x01d1, B:69:0x01da, B:71:0x01e2, B:73:0x01e8, B:75:0x01ee, B:77:0x01ff, B:79:0x0208, B:80:0x020b, B:82:0x021a, B:85:0x0221, B:87:0x0229, B:89:0x022f, B:91:0x0235, B:92:0x023c, B:93:0x0272, B:96:0x029d, B:97:0x02a0, B:99:0x02a7, B:108:0x02cb, B:110:0x02d1, B:112:0x02de, B:114:0x02f1, B:115:0x02ff, B:117:0x0319, B:121:0x034e, B:123:0x0356, B:124:0x0359, B:126:0x0364, B:127:0x0367, B:129:0x0372, B:130:0x0375, B:133:0x0389, B:135:0x038f, B:182:0x0325, B:184:0x032d, B:188:0x033e, B:193:0x02fc, B:194:0x02d7, B:195:0x02c7, B:196:0x02b0, B:198:0x0252, B:200:0x025a, B:201:0x0264, B:204:0x01f7, B:208:0x01bb, B:210:0x0184, B:211:0x00f3, B:212:0x00fb, B:215:0x0105, B:220:0x009e, B:221:0x00a8, B:224:0x00b4, B:227:0x00c0), top: B:234:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x017e A[Catch: Exception -> 0x0070, TryCatch #1 {Exception -> 0x0070, blocks: (B:235:0x0061, B:19:0x007c, B:21:0x0086, B:22:0x008e, B:24:0x0092, B:27:0x00cf, B:29:0x00d7, B:37:0x0114, B:39:0x011c, B:40:0x0122, B:42:0x0168, B:43:0x016b, B:45:0x0175, B:46:0x0178, B:48:0x017e, B:50:0x018b, B:52:0x0193, B:53:0x019a, B:56:0x01a6, B:58:0x01ac, B:60:0x01b2, B:64:0x01c8, B:67:0x01d1, B:69:0x01da, B:71:0x01e2, B:73:0x01e8, B:75:0x01ee, B:77:0x01ff, B:79:0x0208, B:80:0x020b, B:82:0x021a, B:85:0x0221, B:87:0x0229, B:89:0x022f, B:91:0x0235, B:92:0x023c, B:93:0x0272, B:96:0x029d, B:97:0x02a0, B:99:0x02a7, B:108:0x02cb, B:110:0x02d1, B:112:0x02de, B:114:0x02f1, B:115:0x02ff, B:117:0x0319, B:121:0x034e, B:123:0x0356, B:124:0x0359, B:126:0x0364, B:127:0x0367, B:129:0x0372, B:130:0x0375, B:133:0x0389, B:135:0x038f, B:182:0x0325, B:184:0x032d, B:188:0x033e, B:193:0x02fc, B:194:0x02d7, B:195:0x02c7, B:196:0x02b0, B:198:0x0252, B:200:0x025a, B:201:0x0264, B:204:0x01f7, B:208:0x01bb, B:210:0x0184, B:211:0x00f3, B:212:0x00fb, B:215:0x0105, B:220:0x009e, B:221:0x00a8, B:224:0x00b4, B:227:0x00c0), top: B:234:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0193 A[Catch: Exception -> 0x0070, TryCatch #1 {Exception -> 0x0070, blocks: (B:235:0x0061, B:19:0x007c, B:21:0x0086, B:22:0x008e, B:24:0x0092, B:27:0x00cf, B:29:0x00d7, B:37:0x0114, B:39:0x011c, B:40:0x0122, B:42:0x0168, B:43:0x016b, B:45:0x0175, B:46:0x0178, B:48:0x017e, B:50:0x018b, B:52:0x0193, B:53:0x019a, B:56:0x01a6, B:58:0x01ac, B:60:0x01b2, B:64:0x01c8, B:67:0x01d1, B:69:0x01da, B:71:0x01e2, B:73:0x01e8, B:75:0x01ee, B:77:0x01ff, B:79:0x0208, B:80:0x020b, B:82:0x021a, B:85:0x0221, B:87:0x0229, B:89:0x022f, B:91:0x0235, B:92:0x023c, B:93:0x0272, B:96:0x029d, B:97:0x02a0, B:99:0x02a7, B:108:0x02cb, B:110:0x02d1, B:112:0x02de, B:114:0x02f1, B:115:0x02ff, B:117:0x0319, B:121:0x034e, B:123:0x0356, B:124:0x0359, B:126:0x0364, B:127:0x0367, B:129:0x0372, B:130:0x0375, B:133:0x0389, B:135:0x038f, B:182:0x0325, B:184:0x032d, B:188:0x033e, B:193:0x02fc, B:194:0x02d7, B:195:0x02c7, B:196:0x02b0, B:198:0x0252, B:200:0x025a, B:201:0x0264, B:204:0x01f7, B:208:0x01bb, B:210:0x0184, B:211:0x00f3, B:212:0x00fb, B:215:0x0105, B:220:0x009e, B:221:0x00a8, B:224:0x00b4, B:227:0x00c0), top: B:234:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a6 A[Catch: Exception -> 0x0070, TRY_ENTER, TryCatch #1 {Exception -> 0x0070, blocks: (B:235:0x0061, B:19:0x007c, B:21:0x0086, B:22:0x008e, B:24:0x0092, B:27:0x00cf, B:29:0x00d7, B:37:0x0114, B:39:0x011c, B:40:0x0122, B:42:0x0168, B:43:0x016b, B:45:0x0175, B:46:0x0178, B:48:0x017e, B:50:0x018b, B:52:0x0193, B:53:0x019a, B:56:0x01a6, B:58:0x01ac, B:60:0x01b2, B:64:0x01c8, B:67:0x01d1, B:69:0x01da, B:71:0x01e2, B:73:0x01e8, B:75:0x01ee, B:77:0x01ff, B:79:0x0208, B:80:0x020b, B:82:0x021a, B:85:0x0221, B:87:0x0229, B:89:0x022f, B:91:0x0235, B:92:0x023c, B:93:0x0272, B:96:0x029d, B:97:0x02a0, B:99:0x02a7, B:108:0x02cb, B:110:0x02d1, B:112:0x02de, B:114:0x02f1, B:115:0x02ff, B:117:0x0319, B:121:0x034e, B:123:0x0356, B:124:0x0359, B:126:0x0364, B:127:0x0367, B:129:0x0372, B:130:0x0375, B:133:0x0389, B:135:0x038f, B:182:0x0325, B:184:0x032d, B:188:0x033e, B:193:0x02fc, B:194:0x02d7, B:195:0x02c7, B:196:0x02b0, B:198:0x0252, B:200:0x025a, B:201:0x0264, B:204:0x01f7, B:208:0x01bb, B:210:0x0184, B:211:0x00f3, B:212:0x00fb, B:215:0x0105, B:220:0x009e, B:221:0x00a8, B:224:0x00b4, B:227:0x00c0), top: B:234:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c8 A[Catch: Exception -> 0x0070, TRY_ENTER, TryCatch #1 {Exception -> 0x0070, blocks: (B:235:0x0061, B:19:0x007c, B:21:0x0086, B:22:0x008e, B:24:0x0092, B:27:0x00cf, B:29:0x00d7, B:37:0x0114, B:39:0x011c, B:40:0x0122, B:42:0x0168, B:43:0x016b, B:45:0x0175, B:46:0x0178, B:48:0x017e, B:50:0x018b, B:52:0x0193, B:53:0x019a, B:56:0x01a6, B:58:0x01ac, B:60:0x01b2, B:64:0x01c8, B:67:0x01d1, B:69:0x01da, B:71:0x01e2, B:73:0x01e8, B:75:0x01ee, B:77:0x01ff, B:79:0x0208, B:80:0x020b, B:82:0x021a, B:85:0x0221, B:87:0x0229, B:89:0x022f, B:91:0x0235, B:92:0x023c, B:93:0x0272, B:96:0x029d, B:97:0x02a0, B:99:0x02a7, B:108:0x02cb, B:110:0x02d1, B:112:0x02de, B:114:0x02f1, B:115:0x02ff, B:117:0x0319, B:121:0x034e, B:123:0x0356, B:124:0x0359, B:126:0x0364, B:127:0x0367, B:129:0x0372, B:130:0x0375, B:133:0x0389, B:135:0x038f, B:182:0x0325, B:184:0x032d, B:188:0x033e, B:193:0x02fc, B:194:0x02d7, B:195:0x02c7, B:196:0x02b0, B:198:0x0252, B:200:0x025a, B:201:0x0264, B:204:0x01f7, B:208:0x01bb, B:210:0x0184, B:211:0x00f3, B:212:0x00fb, B:215:0x0105, B:220:0x009e, B:221:0x00a8, B:224:0x00b4, B:227:0x00c0), top: B:234:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01da A[Catch: Exception -> 0x0070, TryCatch #1 {Exception -> 0x0070, blocks: (B:235:0x0061, B:19:0x007c, B:21:0x0086, B:22:0x008e, B:24:0x0092, B:27:0x00cf, B:29:0x00d7, B:37:0x0114, B:39:0x011c, B:40:0x0122, B:42:0x0168, B:43:0x016b, B:45:0x0175, B:46:0x0178, B:48:0x017e, B:50:0x018b, B:52:0x0193, B:53:0x019a, B:56:0x01a6, B:58:0x01ac, B:60:0x01b2, B:64:0x01c8, B:67:0x01d1, B:69:0x01da, B:71:0x01e2, B:73:0x01e8, B:75:0x01ee, B:77:0x01ff, B:79:0x0208, B:80:0x020b, B:82:0x021a, B:85:0x0221, B:87:0x0229, B:89:0x022f, B:91:0x0235, B:92:0x023c, B:93:0x0272, B:96:0x029d, B:97:0x02a0, B:99:0x02a7, B:108:0x02cb, B:110:0x02d1, B:112:0x02de, B:114:0x02f1, B:115:0x02ff, B:117:0x0319, B:121:0x034e, B:123:0x0356, B:124:0x0359, B:126:0x0364, B:127:0x0367, B:129:0x0372, B:130:0x0375, B:133:0x0389, B:135:0x038f, B:182:0x0325, B:184:0x032d, B:188:0x033e, B:193:0x02fc, B:194:0x02d7, B:195:0x02c7, B:196:0x02b0, B:198:0x0252, B:200:0x025a, B:201:0x0264, B:204:0x01f7, B:208:0x01bb, B:210:0x0184, B:211:0x00f3, B:212:0x00fb, B:215:0x0105, B:220:0x009e, B:221:0x00a8, B:224:0x00b4, B:227:0x00c0), top: B:234:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0208 A[Catch: Exception -> 0x0070, TryCatch #1 {Exception -> 0x0070, blocks: (B:235:0x0061, B:19:0x007c, B:21:0x0086, B:22:0x008e, B:24:0x0092, B:27:0x00cf, B:29:0x00d7, B:37:0x0114, B:39:0x011c, B:40:0x0122, B:42:0x0168, B:43:0x016b, B:45:0x0175, B:46:0x0178, B:48:0x017e, B:50:0x018b, B:52:0x0193, B:53:0x019a, B:56:0x01a6, B:58:0x01ac, B:60:0x01b2, B:64:0x01c8, B:67:0x01d1, B:69:0x01da, B:71:0x01e2, B:73:0x01e8, B:75:0x01ee, B:77:0x01ff, B:79:0x0208, B:80:0x020b, B:82:0x021a, B:85:0x0221, B:87:0x0229, B:89:0x022f, B:91:0x0235, B:92:0x023c, B:93:0x0272, B:96:0x029d, B:97:0x02a0, B:99:0x02a7, B:108:0x02cb, B:110:0x02d1, B:112:0x02de, B:114:0x02f1, B:115:0x02ff, B:117:0x0319, B:121:0x034e, B:123:0x0356, B:124:0x0359, B:126:0x0364, B:127:0x0367, B:129:0x0372, B:130:0x0375, B:133:0x0389, B:135:0x038f, B:182:0x0325, B:184:0x032d, B:188:0x033e, B:193:0x02fc, B:194:0x02d7, B:195:0x02c7, B:196:0x02b0, B:198:0x0252, B:200:0x025a, B:201:0x0264, B:204:0x01f7, B:208:0x01bb, B:210:0x0184, B:211:0x00f3, B:212:0x00fb, B:215:0x0105, B:220:0x009e, B:221:0x00a8, B:224:0x00b4, B:227:0x00c0), top: B:234:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x021a A[Catch: Exception -> 0x0070, TryCatch #1 {Exception -> 0x0070, blocks: (B:235:0x0061, B:19:0x007c, B:21:0x0086, B:22:0x008e, B:24:0x0092, B:27:0x00cf, B:29:0x00d7, B:37:0x0114, B:39:0x011c, B:40:0x0122, B:42:0x0168, B:43:0x016b, B:45:0x0175, B:46:0x0178, B:48:0x017e, B:50:0x018b, B:52:0x0193, B:53:0x019a, B:56:0x01a6, B:58:0x01ac, B:60:0x01b2, B:64:0x01c8, B:67:0x01d1, B:69:0x01da, B:71:0x01e2, B:73:0x01e8, B:75:0x01ee, B:77:0x01ff, B:79:0x0208, B:80:0x020b, B:82:0x021a, B:85:0x0221, B:87:0x0229, B:89:0x022f, B:91:0x0235, B:92:0x023c, B:93:0x0272, B:96:0x029d, B:97:0x02a0, B:99:0x02a7, B:108:0x02cb, B:110:0x02d1, B:112:0x02de, B:114:0x02f1, B:115:0x02ff, B:117:0x0319, B:121:0x034e, B:123:0x0356, B:124:0x0359, B:126:0x0364, B:127:0x0367, B:129:0x0372, B:130:0x0375, B:133:0x0389, B:135:0x038f, B:182:0x0325, B:184:0x032d, B:188:0x033e, B:193:0x02fc, B:194:0x02d7, B:195:0x02c7, B:196:0x02b0, B:198:0x0252, B:200:0x025a, B:201:0x0264, B:204:0x01f7, B:208:0x01bb, B:210:0x0184, B:211:0x00f3, B:212:0x00fb, B:215:0x0105, B:220:0x009e, B:221:0x00a8, B:224:0x00b4, B:227:0x00c0), top: B:234:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x029d A[Catch: Exception -> 0x0070, TRY_ENTER, TryCatch #1 {Exception -> 0x0070, blocks: (B:235:0x0061, B:19:0x007c, B:21:0x0086, B:22:0x008e, B:24:0x0092, B:27:0x00cf, B:29:0x00d7, B:37:0x0114, B:39:0x011c, B:40:0x0122, B:42:0x0168, B:43:0x016b, B:45:0x0175, B:46:0x0178, B:48:0x017e, B:50:0x018b, B:52:0x0193, B:53:0x019a, B:56:0x01a6, B:58:0x01ac, B:60:0x01b2, B:64:0x01c8, B:67:0x01d1, B:69:0x01da, B:71:0x01e2, B:73:0x01e8, B:75:0x01ee, B:77:0x01ff, B:79:0x0208, B:80:0x020b, B:82:0x021a, B:85:0x0221, B:87:0x0229, B:89:0x022f, B:91:0x0235, B:92:0x023c, B:93:0x0272, B:96:0x029d, B:97:0x02a0, B:99:0x02a7, B:108:0x02cb, B:110:0x02d1, B:112:0x02de, B:114:0x02f1, B:115:0x02ff, B:117:0x0319, B:121:0x034e, B:123:0x0356, B:124:0x0359, B:126:0x0364, B:127:0x0367, B:129:0x0372, B:130:0x0375, B:133:0x0389, B:135:0x038f, B:182:0x0325, B:184:0x032d, B:188:0x033e, B:193:0x02fc, B:194:0x02d7, B:195:0x02c7, B:196:0x02b0, B:198:0x0252, B:200:0x025a, B:201:0x0264, B:204:0x01f7, B:208:0x01bb, B:210:0x0184, B:211:0x00f3, B:212:0x00fb, B:215:0x0105, B:220:0x009e, B:221:0x00a8, B:224:0x00b4, B:227:0x00c0), top: B:234:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02a7 A[Catch: Exception -> 0x0070, TryCatch #1 {Exception -> 0x0070, blocks: (B:235:0x0061, B:19:0x007c, B:21:0x0086, B:22:0x008e, B:24:0x0092, B:27:0x00cf, B:29:0x00d7, B:37:0x0114, B:39:0x011c, B:40:0x0122, B:42:0x0168, B:43:0x016b, B:45:0x0175, B:46:0x0178, B:48:0x017e, B:50:0x018b, B:52:0x0193, B:53:0x019a, B:56:0x01a6, B:58:0x01ac, B:60:0x01b2, B:64:0x01c8, B:67:0x01d1, B:69:0x01da, B:71:0x01e2, B:73:0x01e8, B:75:0x01ee, B:77:0x01ff, B:79:0x0208, B:80:0x020b, B:82:0x021a, B:85:0x0221, B:87:0x0229, B:89:0x022f, B:91:0x0235, B:92:0x023c, B:93:0x0272, B:96:0x029d, B:97:0x02a0, B:99:0x02a7, B:108:0x02cb, B:110:0x02d1, B:112:0x02de, B:114:0x02f1, B:115:0x02ff, B:117:0x0319, B:121:0x034e, B:123:0x0356, B:124:0x0359, B:126:0x0364, B:127:0x0367, B:129:0x0372, B:130:0x0375, B:133:0x0389, B:135:0x038f, B:182:0x0325, B:184:0x032d, B:188:0x033e, B:193:0x02fc, B:194:0x02d7, B:195:0x02c7, B:196:0x02b0, B:198:0x0252, B:200:0x025a, B:201:0x0264, B:204:0x01f7, B:208:0x01bb, B:210:0x0184, B:211:0x00f3, B:212:0x00fb, B:215:0x0105, B:220:0x009e, B:221:0x00a8, B:224:0x00b4, B:227:0x00c0), top: B:234:0x0061 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void y(Bundle bundle, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3) {
        String str;
        String str2;
        int i10;
        String string;
        String str3;
        String str4;
        int i11;
        String string2;
        o.e z10;
        int i12;
        String string3;
        String string4;
        String string5;
        int i13;
        int identifier;
        Bitmap bitmap4;
        String string6;
        o.i a10;
        String string7;
        Uri p10;
        String string8;
        String str5;
        long j10;
        JSONArray jSONArray;
        String str6;
        JSONArray jSONArray2;
        String string9;
        int identifier2;
        int identifier3;
        String str7 = RNPushNotification.LOG_TAG;
        try {
            Class m10 = m();
            if (m10 == null) {
                Log.e(RNPushNotification.LOG_TAG, "No activity class found for the notification");
                return;
            }
            if (bundle.getString("message") == null) {
                bundle.toString();
                return;
            }
            String string10 = bundle.getString(StackTraceHelper.ID_KEY);
            if (string10 == null) {
                Log.e(RNPushNotification.LOG_TAG, "No notification ID specified for the notification");
                return;
            }
            Resources resources = this.f45725a.getResources();
            String packageName = this.f45725a.getPackageName();
            String string11 = bundle.getString("title");
            if (string11 == null) {
                try {
                    ApplicationInfo applicationInfo = this.f45725a.getApplicationInfo();
                    str = RNPushNotification.LOG_TAG;
                    try {
                        string11 = this.f45725a.getPackageManager().getApplicationLabel(applicationInfo).toString();
                    } catch (Exception e10) {
                        e = e10;
                        str7 = str;
                        Log.e(str7, "failed to send push notification", e);
                    }
                } catch (Exception e11) {
                    e = e11;
                    Log.e(str7, "failed to send push notification", e);
                }
            } else {
                str = RNPushNotification.LOG_TAG;
            }
            String string12 = bundle.getString(EventKeys.PRIORITY);
            if (string12 != null) {
                String lowerCase = string12.toLowerCase();
                switch (lowerCase.hashCode()) {
                    case 107348:
                        str2 = "actions";
                        if (lowerCase.equals("low")) {
                            i10 = -1;
                            break;
                        }
                        i10 = 1;
                        break;
                    case 107876:
                        str2 = "actions";
                        if (lowerCase.equals("max")) {
                            i10 = 2;
                            break;
                        }
                        i10 = 1;
                        break;
                    case 108114:
                        str2 = "actions";
                        if (lowerCase.equals("min")) {
                            i10 = -2;
                            break;
                        }
                        i10 = 1;
                        break;
                    case 3202466:
                        str2 = "actions";
                        lowerCase.equals("high");
                        i10 = 1;
                        break;
                    case 1544803905:
                        str2 = "actions";
                        if (lowerCase.equals(Constants.COLLATION_DEFAULT)) {
                            i10 = 0;
                            break;
                        }
                        i10 = 1;
                        break;
                }
                string = bundle.getString("visibility");
                if (string == null) {
                    String lowerCase2 = string.toLowerCase();
                    str3 = "vibration";
                    int hashCode = lowerCase2.hashCode();
                    str4 = "vibrate";
                    if (hashCode != -977423767) {
                        if (hashCode != -906277200) {
                            if (hashCode == -314497661) {
                                lowerCase2.equals(EventKeys.PRIVATE);
                            }
                        } else if (lowerCase2.equals("secret")) {
                            i11 = -1;
                            string2 = bundle.getString("channelId");
                            if (string2 == null) {
                                string2 = this.f45726b.b();
                            }
                            z10 = new o.e(this.f45725a, string2).m(string11).I(bundle.getString("ticker")).M(i11).A(i10).g(bundle.getBoolean("autoCancel", true)).z(bundle.getBoolean("onlyAlertOnce", false));
                            i12 = Build.VERSION.SDK_INT;
                            z10.D(bundle.getBoolean("showWhen", true));
                            if (i12 >= 26) {
                                z10.p(4);
                            }
                            string3 = bundle.getString(EventKeys.EVENT_GROUP);
                            if (string3 != null) {
                                z10.s(string3);
                            }
                            if (!bundle.containsKey("groupSummary") || bundle.getBoolean("groupSummary")) {
                                z10.t(bundle.getBoolean("groupSummary"));
                            }
                            string4 = bundle.getString("number");
                            if (string4 != null) {
                                z10.x(Integer.parseInt(string4));
                            }
                            string5 = bundle.getString("smallIcon");
                            if (string5 == null && !string5.isEmpty()) {
                                i13 = resources.getIdentifier(string5, "drawable", packageName);
                                if (i13 == 0) {
                                    identifier = resources.getIdentifier(string5, "mipmap", packageName);
                                    i13 = identifier;
                                }
                                if (i13 == 0) {
                                }
                                String str8 = string2;
                                z10.E(i13);
                                if (bitmap == null) {
                                }
                                bitmap4 = bitmap;
                                if (bitmap4 != null) {
                                }
                                String string13 = bundle.getString("message");
                                z10.l(string13);
                                string6 = bundle.getString("subText");
                                if (string6 != null) {
                                }
                                if (bitmap2 == null) {
                                }
                                z10.G(a10);
                                Intent intent = new Intent(this.f45725a, (Class<?>) m10);
                                intent.addFlags(PKIFailureInfo.duplicateCertReq);
                                bundle.putBoolean("foreground", r());
                                bundle.putBoolean("userInteraction", true);
                                intent.putExtra("notification", bundle);
                                string7 = bundle.getString("messageId");
                                if (string7 != null) {
                                }
                                if (bundle.containsKey("playSound")) {
                                }
                                p10 = p(bundle.getString("soundName"));
                                z10.F(p10);
                                if (p10 != null) {
                                }
                                z10.F(null);
                                if (!bundle.containsKey("ongoing")) {
                                }
                                z10.y(bundle.getBoolean("ongoing"));
                                z10.h("call");
                                string8 = bundle.getString(ViewProps.COLOR);
                                int a11 = this.f45726b.a();
                                if (string8 != null) {
                                }
                                int parseInt = Integer.parseInt(string10);
                                PendingIntent activity = PendingIntent.getActivity(this.f45725a, parseInt, intent, 201326592);
                                NotificationManager t10 = t();
                                str5 = str4;
                                if (bundle.containsKey(str5)) {
                                }
                                String str9 = str3;
                                if (bundle.containsKey(str9)) {
                                }
                                z10.L(new long[]{0, r12 != 0 ? r12 : 300L});
                                if (i12 >= 26) {
                                }
                                j10 = (long) bundle.getDouble("when");
                                if (j10 >= 0) {
                                }
                                str7 = null;
                                z10.K(bundle.getBoolean("usesChronometer", false));
                                z10.i(str8);
                                z10.k(activity);
                                String str10 = str2;
                                if (bundle.getString(str10) != null) {
                                }
                                str7 = str;
                                if (jSONArray != null) {
                                }
                                if (this.f45727c.getString(string10, null) != null) {
                                }
                                if (r()) {
                                }
                                Notification d10 = z10.d();
                                d10.defaults |= 4;
                                if (bundle.containsKey("tag")) {
                                }
                                u(bundle);
                                return;
                            }
                            if (string5 == null) {
                                i13 = 0;
                                if (i13 == 0) {
                                    i13 = R.drawable.ic_dialog_info;
                                }
                                String str82 = string2;
                                z10.E(i13);
                                if (bitmap == null) {
                                }
                                bitmap4 = bitmap;
                                if (bitmap4 != null) {
                                }
                                String string132 = bundle.getString("message");
                                z10.l(string132);
                                string6 = bundle.getString("subText");
                                if (string6 != null) {
                                }
                                if (bitmap2 == null) {
                                }
                                z10.G(a10);
                                Intent intent2 = new Intent(this.f45725a, (Class<?>) m10);
                                intent2.addFlags(PKIFailureInfo.duplicateCertReq);
                                bundle.putBoolean("foreground", r());
                                bundle.putBoolean("userInteraction", true);
                                intent2.putExtra("notification", bundle);
                                string7 = bundle.getString("messageId");
                                if (string7 != null) {
                                }
                                if (bundle.containsKey("playSound")) {
                                }
                                p10 = p(bundle.getString("soundName"));
                                z10.F(p10);
                                if (p10 != null) {
                                }
                                z10.F(null);
                                if (!bundle.containsKey("ongoing")) {
                                }
                                z10.y(bundle.getBoolean("ongoing"));
                                z10.h("call");
                                string8 = bundle.getString(ViewProps.COLOR);
                                int a112 = this.f45726b.a();
                                if (string8 != null) {
                                }
                                int parseInt2 = Integer.parseInt(string10);
                                PendingIntent activity2 = PendingIntent.getActivity(this.f45725a, parseInt2, intent2, 201326592);
                                NotificationManager t102 = t();
                                str5 = str4;
                                if (bundle.containsKey(str5)) {
                                }
                                String str92 = str3;
                                if (bundle.containsKey(str92)) {
                                }
                                z10.L(new long[]{0, r12 != 0 ? r12 : 300L});
                                if (i12 >= 26) {
                                }
                                j10 = (long) bundle.getDouble("when");
                                if (j10 >= 0) {
                                }
                                str7 = null;
                                z10.K(bundle.getBoolean("usesChronometer", false));
                                z10.i(str82);
                                z10.k(activity2);
                                String str102 = str2;
                                if (bundle.getString(str102) != null) {
                                }
                                str7 = str;
                                if (jSONArray != null) {
                                }
                                if (this.f45727c.getString(string10, null) != null) {
                                }
                                if (r()) {
                                }
                                Notification d102 = z10.d();
                                d102.defaults |= 4;
                                if (bundle.containsKey("tag")) {
                                }
                                u(bundle);
                                return;
                            }
                            identifier = resources.getIdentifier("ic_notification", "mipmap", packageName);
                            i13 = identifier;
                            if (i13 == 0 && (i13 = resources.getIdentifier("ic_launcher", "mipmap", packageName)) == 0) {
                                i13 = R.drawable.ic_dialog_info;
                            }
                            String str822 = string2;
                            z10.E(i13);
                            if (bitmap == null) {
                                String string14 = bundle.getString("largeIcon");
                                if (string14 == null || string14.isEmpty()) {
                                    identifier3 = string14 == null ? resources.getIdentifier("ic_launcher", "mipmap", packageName) : 0;
                                } else {
                                    int identifier4 = resources.getIdentifier(string14, "drawable", packageName);
                                    identifier3 = identifier4 == 0 ? resources.getIdentifier(string14, "mipmap", packageName) : identifier4;
                                }
                                if (identifier3 != 0) {
                                    bitmap4 = BitmapFactory.decodeResource(resources, identifier3);
                                    if (bitmap4 != null) {
                                        z10.u(bitmap4);
                                    }
                                    String string1322 = bundle.getString("message");
                                    z10.l(string1322);
                                    string6 = bundle.getString("subText");
                                    if (string6 != null) {
                                        z10.H(string6);
                                    }
                                    if (bitmap2 == null) {
                                        a10 = new o.b().b(bitmap2).c(string11).d(string1322).a((bitmap3 != null || (string9 = bundle.getString("bigLargeIcon")) == null || string9.isEmpty() || (identifier2 = resources.getIdentifier(string9, "mipmap", packageName)) == 0) ? bitmap3 : BitmapFactory.decodeResource(resources, identifier2));
                                    } else {
                                        String string15 = bundle.getString("bigText");
                                        a10 = string15 == null ? new o.c().a(string1322) : new o.c().a(w0.b.a(string15, 0));
                                    }
                                    z10.G(a10);
                                    Intent intent22 = new Intent(this.f45725a, (Class<?>) m10);
                                    intent22.addFlags(PKIFailureInfo.duplicateCertReq);
                                    bundle.putBoolean("foreground", r());
                                    bundle.putBoolean("userInteraction", true);
                                    intent22.putExtra("notification", bundle);
                                    string7 = bundle.getString("messageId");
                                    if (string7 != null) {
                                        intent22.putExtra("message_id", string7);
                                    }
                                    if (bundle.containsKey("playSound") && !bundle.getBoolean("playSound")) {
                                        p10 = null;
                                        if (p10 != null) {
                                            if (i12 < 26) {
                                            }
                                            if (!bundle.containsKey("ongoing") || bundle.getBoolean("ongoing")) {
                                                z10.y(bundle.getBoolean("ongoing"));
                                            }
                                            z10.h("call");
                                            string8 = bundle.getString(ViewProps.COLOR);
                                            int a1122 = this.f45726b.a();
                                            if (string8 != null) {
                                                z10.j(Color.parseColor(string8));
                                            } else if (a1122 != -1) {
                                                z10.j(a1122);
                                            }
                                            int parseInt22 = Integer.parseInt(string10);
                                            PendingIntent activity22 = PendingIntent.getActivity(this.f45725a, parseInt22, intent22, 201326592);
                                            NotificationManager t1022 = t();
                                            str5 = str4;
                                            if (bundle.containsKey(str5) || bundle.getBoolean(str5)) {
                                                String str922 = str3;
                                                long j11 = bundle.containsKey(str922) ? (long) bundle.getDouble(str922) : 300L;
                                                z10.L(new long[]{0, j11 != 0 ? j11 : 300L});
                                            }
                                            if (i12 >= 26) {
                                                String string16 = bundle.getString("shortcutId");
                                                if (string16 != null) {
                                                    z10.C(string16);
                                                }
                                                long j12 = (long) bundle.getDouble("timeoutAfter");
                                                if (j12 >= 0) {
                                                    z10.J(j12);
                                                }
                                            }
                                            j10 = (long) bundle.getDouble("when");
                                            if (j10 >= 0) {
                                                z10.N(j10);
                                            }
                                            str7 = null;
                                            z10.K(bundle.getBoolean("usesChronometer", false));
                                            z10.i(str822);
                                            z10.k(activity22);
                                            String str1022 = str2;
                                            jSONArray = bundle.getString(str1022) != null ? new JSONArray(bundle.getString(str1022)) : null;
                                            str7 = str;
                                            if (jSONArray != null) {
                                                int i14 = 0;
                                                while (i14 < jSONArray.length()) {
                                                    try {
                                                        String string17 = jSONArray.getString(i14);
                                                        jSONArray2 = jSONArray;
                                                        Intent intent3 = new Intent(this.f45725a, (Class<?>) AbstractC4180a.class);
                                                        intent3.setAction(packageName + ".ACTION_" + i14);
                                                        intent3.addFlags(PKIFailureInfo.duplicateCertReq);
                                                        bundle.putString("action", string17);
                                                        intent3.putExtra("notification", bundle);
                                                        intent3.setPackage(packageName);
                                                        if (string7 != null) {
                                                            intent22.putExtra("message_id", string7);
                                                        }
                                                        PendingIntent broadcast = PendingIntent.getBroadcast(this.f45725a, parseInt22, intent3, 201326592);
                                                        if (string17.equals("ReplyInput")) {
                                                            str6 = packageName;
                                                            z10.b(new o.a.C0359a(0, bundle.getString("reply_button_text"), broadcast).b(new x.d(RNPushNotification.KEY_TEXT_REPLY).b(bundle.getString("reply_placeholder_text")).a()).e(true).c());
                                                        } else {
                                                            str6 = packageName;
                                                            z10.b(new o.a.C0359a(0, string17, broadcast).c());
                                                        }
                                                    } catch (JSONException e12) {
                                                        str6 = packageName;
                                                        jSONArray2 = jSONArray;
                                                        Log.e(str7, "Exception while getting action from actionsArray.", e12);
                                                    }
                                                    i14++;
                                                    jSONArray = jSONArray2;
                                                    packageName = str6;
                                                }
                                            }
                                            if (this.f45727c.getString(string10, null) != null) {
                                                SharedPreferences.Editor edit = this.f45727c.edit();
                                                edit.remove(string10);
                                                edit.apply();
                                            }
                                            if (r() || !bundle.getBoolean("ignoreInForeground")) {
                                                Notification d1022 = z10.d();
                                                d1022.defaults |= 4;
                                                if (bundle.containsKey("tag")) {
                                                    t1022.notify(bundle.getString("tag"), parseInt22, d1022);
                                                } else {
                                                    t1022.notify(parseInt22, d1022);
                                                }
                                            }
                                            u(bundle);
                                            return;
                                        }
                                        z10.F(null);
                                        if (!bundle.containsKey("ongoing")) {
                                        }
                                        z10.y(bundle.getBoolean("ongoing"));
                                        z10.h("call");
                                        string8 = bundle.getString(ViewProps.COLOR);
                                        int a11222 = this.f45726b.a();
                                        if (string8 != null) {
                                        }
                                        int parseInt222 = Integer.parseInt(string10);
                                        PendingIntent activity222 = PendingIntent.getActivity(this.f45725a, parseInt222, intent22, 201326592);
                                        NotificationManager t10222 = t();
                                        str5 = str4;
                                        if (bundle.containsKey(str5)) {
                                        }
                                        String str9222 = str3;
                                        if (bundle.containsKey(str9222)) {
                                        }
                                        z10.L(new long[]{0, j11 != 0 ? j11 : 300L});
                                        if (i12 >= 26) {
                                        }
                                        j10 = (long) bundle.getDouble("when");
                                        if (j10 >= 0) {
                                        }
                                        str7 = null;
                                        z10.K(bundle.getBoolean("usesChronometer", false));
                                        z10.i(str822);
                                        z10.k(activity222);
                                        String str10222 = str2;
                                        if (bundle.getString(str10222) != null) {
                                        }
                                        str7 = str;
                                        if (jSONArray != null) {
                                        }
                                        if (this.f45727c.getString(string10, null) != null) {
                                        }
                                        if (r()) {
                                        }
                                        Notification d10222 = z10.d();
                                        d10222.defaults |= 4;
                                        if (bundle.containsKey("tag")) {
                                        }
                                        u(bundle);
                                        return;
                                    }
                                    p10 = p(bundle.getString("soundName"));
                                    z10.F(p10);
                                    if (p10 != null) {
                                    }
                                    z10.F(null);
                                    if (!bundle.containsKey("ongoing")) {
                                    }
                                    z10.y(bundle.getBoolean("ongoing"));
                                    z10.h("call");
                                    string8 = bundle.getString(ViewProps.COLOR);
                                    int a112222 = this.f45726b.a();
                                    if (string8 != null) {
                                    }
                                    int parseInt2222 = Integer.parseInt(string10);
                                    PendingIntent activity2222 = PendingIntent.getActivity(this.f45725a, parseInt2222, intent22, 201326592);
                                    NotificationManager t102222 = t();
                                    str5 = str4;
                                    if (bundle.containsKey(str5)) {
                                    }
                                    String str92222 = str3;
                                    if (bundle.containsKey(str92222)) {
                                    }
                                    z10.L(new long[]{0, j11 != 0 ? j11 : 300L});
                                    if (i12 >= 26) {
                                    }
                                    j10 = (long) bundle.getDouble("when");
                                    if (j10 >= 0) {
                                    }
                                    str7 = null;
                                    z10.K(bundle.getBoolean("usesChronometer", false));
                                    z10.i(str822);
                                    z10.k(activity2222);
                                    String str102222 = str2;
                                    if (bundle.getString(str102222) != null) {
                                    }
                                    str7 = str;
                                    if (jSONArray != null) {
                                    }
                                    if (this.f45727c.getString(string10, null) != null) {
                                    }
                                    if (r()) {
                                    }
                                    Notification d102222 = z10.d();
                                    d102222.defaults |= 4;
                                    if (bundle.containsKey("tag")) {
                                    }
                                    u(bundle);
                                    return;
                                }
                            }
                            bitmap4 = bitmap;
                            if (bitmap4 != null) {
                            }
                            String string13222 = bundle.getString("message");
                            z10.l(string13222);
                            string6 = bundle.getString("subText");
                            if (string6 != null) {
                            }
                            if (bitmap2 == null) {
                            }
                            z10.G(a10);
                            Intent intent222 = new Intent(this.f45725a, (Class<?>) m10);
                            intent222.addFlags(PKIFailureInfo.duplicateCertReq);
                            bundle.putBoolean("foreground", r());
                            bundle.putBoolean("userInteraction", true);
                            intent222.putExtra("notification", bundle);
                            string7 = bundle.getString("messageId");
                            if (string7 != null) {
                            }
                            if (bundle.containsKey("playSound")) {
                                p10 = null;
                                if (p10 != null) {
                                }
                                z10.F(null);
                                if (!bundle.containsKey("ongoing")) {
                                }
                                z10.y(bundle.getBoolean("ongoing"));
                                z10.h("call");
                                string8 = bundle.getString(ViewProps.COLOR);
                                int a1122222 = this.f45726b.a();
                                if (string8 != null) {
                                }
                                int parseInt22222 = Integer.parseInt(string10);
                                PendingIntent activity22222 = PendingIntent.getActivity(this.f45725a, parseInt22222, intent222, 201326592);
                                NotificationManager t1022222 = t();
                                str5 = str4;
                                if (bundle.containsKey(str5)) {
                                }
                                String str922222 = str3;
                                if (bundle.containsKey(str922222)) {
                                }
                                z10.L(new long[]{0, j11 != 0 ? j11 : 300L});
                                if (i12 >= 26) {
                                }
                                j10 = (long) bundle.getDouble("when");
                                if (j10 >= 0) {
                                }
                                str7 = null;
                                z10.K(bundle.getBoolean("usesChronometer", false));
                                z10.i(str822);
                                z10.k(activity22222);
                                String str1022222 = str2;
                                if (bundle.getString(str1022222) != null) {
                                }
                                str7 = str;
                                if (jSONArray != null) {
                                }
                                if (this.f45727c.getString(string10, null) != null) {
                                }
                                if (r()) {
                                }
                                Notification d1022222 = z10.d();
                                d1022222.defaults |= 4;
                                if (bundle.containsKey("tag")) {
                                }
                                u(bundle);
                                return;
                            }
                            p10 = p(bundle.getString("soundName"));
                            z10.F(p10);
                            if (p10 != null) {
                            }
                            z10.F(null);
                            if (!bundle.containsKey("ongoing")) {
                            }
                            z10.y(bundle.getBoolean("ongoing"));
                            z10.h("call");
                            string8 = bundle.getString(ViewProps.COLOR);
                            int a11222222 = this.f45726b.a();
                            if (string8 != null) {
                            }
                            int parseInt222222 = Integer.parseInt(string10);
                            PendingIntent activity222222 = PendingIntent.getActivity(this.f45725a, parseInt222222, intent222, 201326592);
                            NotificationManager t10222222 = t();
                            str5 = str4;
                            if (bundle.containsKey(str5)) {
                            }
                            String str9222222 = str3;
                            if (bundle.containsKey(str9222222)) {
                            }
                            z10.L(new long[]{0, j11 != 0 ? j11 : 300L});
                            if (i12 >= 26) {
                            }
                            j10 = (long) bundle.getDouble("when");
                            if (j10 >= 0) {
                            }
                            str7 = null;
                            z10.K(bundle.getBoolean("usesChronometer", false));
                            z10.i(str822);
                            z10.k(activity222222);
                            String str10222222 = str2;
                            if (bundle.getString(str10222222) != null) {
                            }
                            str7 = str;
                            if (jSONArray != null) {
                            }
                            if (this.f45727c.getString(string10, null) != null) {
                            }
                            if (r()) {
                            }
                            Notification d10222222 = z10.d();
                            d10222222.defaults |= 4;
                            if (bundle.containsKey("tag")) {
                            }
                            u(bundle);
                            return;
                        }
                    } else if (lowerCase2.equals("public")) {
                        i11 = 1;
                        string2 = bundle.getString("channelId");
                        if (string2 == null) {
                        }
                        z10 = new o.e(this.f45725a, string2).m(string11).I(bundle.getString("ticker")).M(i11).A(i10).g(bundle.getBoolean("autoCancel", true)).z(bundle.getBoolean("onlyAlertOnce", false));
                        i12 = Build.VERSION.SDK_INT;
                        z10.D(bundle.getBoolean("showWhen", true));
                        if (i12 >= 26) {
                        }
                        string3 = bundle.getString(EventKeys.EVENT_GROUP);
                        if (string3 != null) {
                        }
                        if (!bundle.containsKey("groupSummary")) {
                        }
                        z10.t(bundle.getBoolean("groupSummary"));
                        string4 = bundle.getString("number");
                        if (string4 != null) {
                        }
                        string5 = bundle.getString("smallIcon");
                        if (string5 == null) {
                        }
                        if (string5 == null) {
                        }
                    }
                } else {
                    str3 = "vibration";
                    str4 = "vibrate";
                }
                i11 = 0;
                string2 = bundle.getString("channelId");
                if (string2 == null) {
                }
                z10 = new o.e(this.f45725a, string2).m(string11).I(bundle.getString("ticker")).M(i11).A(i10).g(bundle.getBoolean("autoCancel", true)).z(bundle.getBoolean("onlyAlertOnce", false));
                i12 = Build.VERSION.SDK_INT;
                z10.D(bundle.getBoolean("showWhen", true));
                if (i12 >= 26) {
                }
                string3 = bundle.getString(EventKeys.EVENT_GROUP);
                if (string3 != null) {
                }
                if (!bundle.containsKey("groupSummary")) {
                }
                z10.t(bundle.getBoolean("groupSummary"));
                string4 = bundle.getString("number");
                if (string4 != null) {
                }
                string5 = bundle.getString("smallIcon");
                if (string5 == null) {
                }
                if (string5 == null) {
                }
            }
            str2 = "actions";
            i10 = 1;
            string = bundle.getString("visibility");
            if (string == null) {
            }
            i11 = 0;
            string2 = bundle.getString("channelId");
            if (string2 == null) {
            }
            z10 = new o.e(this.f45725a, string2).m(string11).I(bundle.getString("ticker")).M(i11).A(i10).g(bundle.getBoolean("autoCancel", true)).z(bundle.getBoolean("onlyAlertOnce", false));
            i12 = Build.VERSION.SDK_INT;
            z10.D(bundle.getBoolean("showWhen", true));
            if (i12 >= 26) {
            }
            string3 = bundle.getString(EventKeys.EVENT_GROUP);
            if (string3 != null) {
            }
            if (!bundle.containsKey("groupSummary")) {
            }
            z10.t(bundle.getBoolean("groupSummary"));
            string4 = bundle.getString("number");
            if (string4 != null) {
            }
            string5 = bundle.getString("smallIcon");
            if (string5 == null) {
            }
            if (string5 == null) {
            }
        } catch (Exception e13) {
            e = e13;
            Log.e(str7, "failed to send push notification", e);
        }
    }

    public final PendingIntent z(Bundle bundle) {
        try {
            int parseInt = Integer.parseInt(bundle.getString(StackTraceHelper.ID_KEY));
            Intent intent = new Intent(this.f45725a, (Class<?>) p.class);
            intent.putExtra("notificationId", parseInt);
            intent.putExtras(bundle);
            return PendingIntent.getBroadcast(this.f45725a, parseInt, intent, 201326592);
        } catch (Exception e10) {
            Log.e(RNPushNotification.LOG_TAG, "Unable to parse Notification ID", e10);
            return null;
        }
    }
}
