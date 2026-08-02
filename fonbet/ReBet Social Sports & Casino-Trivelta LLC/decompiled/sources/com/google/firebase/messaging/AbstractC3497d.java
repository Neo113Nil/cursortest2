package com.google.firebase.messaging;

import T3.AbstractC1585a0;
import android.R;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.o;
import com.facebook.hermes.intl.Constants;
import io.agora.rtc2.internal.AudioRoutingController;
import java.util.concurrent.atomic.AtomicInteger;
import l0.AbstractC5338c;

/* renamed from: com.google.firebase.messaging.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3497d {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicInteger f37932a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* renamed from: com.google.firebase.messaging.d$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final o.e f37933a;

        /* renamed from: b, reason: collision with root package name */
        public final String f37934b;

        /* renamed from: c, reason: collision with root package name */
        public final int f37935c;

        public a(o.e eVar, String str, int i10) {
            this.f37933a = eVar;
            this.f37934b = str;
            this.f37935c = i10;
        }
    }

    public static PendingIntent a(Context context, O o10, String str, PackageManager packageManager) {
        Intent f10 = f(str, o10, packageManager);
        if (f10 == null) {
            return null;
        }
        f10.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        f10.putExtras(o10.y());
        if (q(o10)) {
            f10.putExtra("gcm.n.analytics_data", o10.x());
        }
        return PendingIntent.getActivity(context, g(), f10, l(1073741824));
    }

    public static PendingIntent b(Context context, Context context2, O o10) {
        if (q(o10)) {
            return c(context, context2, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(o10.x()));
        }
        return null;
    }

    public static PendingIntent c(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast(context, g(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(context2.getPackageName()).putExtra("wrapped_intent", intent), l(1073741824));
    }

    public static a d(Context context, Context context2, O o10, String str, Bundle bundle) {
        String packageName = context2.getPackageName();
        Resources resources = context2.getResources();
        PackageManager packageManager = context2.getPackageManager();
        o.e eVar = new o.e(context2, str);
        String n10 = o10.n(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(n10)) {
            eVar.m(n10);
        }
        String n11 = o10.n(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(n11)) {
            eVar.l(n11);
            eVar.G(new o.c().a(n11));
        }
        eVar.E(m(packageManager, resources, packageName, o10.p("gcm.n.icon"), bundle));
        Uri n12 = n(packageName, o10, resources);
        if (n12 != null) {
            eVar.F(n12);
        }
        eVar.k(a(context, o10, packageName, packageManager));
        PendingIntent b10 = b(context, context2, o10);
        if (b10 != null) {
            eVar.q(b10);
        }
        Integer h10 = h(context2, o10.p("gcm.n.color"), bundle);
        if (h10 != null) {
            eVar.j(h10.intValue());
        }
        eVar.g(!o10.a("gcm.n.sticky"));
        eVar.w(o10.a("gcm.n.local_only"));
        String p10 = o10.p("gcm.n.ticker");
        if (p10 != null) {
            eVar.I(p10);
        }
        Integer m10 = o10.m();
        if (m10 != null) {
            eVar.A(m10.intValue());
        }
        Integer r10 = o10.r();
        if (r10 != null) {
            eVar.M(r10.intValue());
        }
        Integer l10 = o10.l();
        if (l10 != null) {
            eVar.x(l10.intValue());
        }
        Long j10 = o10.j("gcm.n.event_time");
        if (j10 != null) {
            eVar.D(true);
            eVar.N(j10.longValue());
        }
        long[] q10 = o10.q();
        if (q10 != null) {
            eVar.L(q10);
        }
        int[] e10 = o10.e();
        if (e10 != null) {
            eVar.v(e10[0], e10[1], e10[2]);
        }
        eVar.p(i(o10));
        return new a(eVar, o(o10), 0);
    }

    public static a e(Context context, O o10) {
        Bundle j10 = j(context.getPackageManager(), context.getPackageName());
        return d(context, context, o10, k(context, o10.k(), j10), j10);
    }

    public static Intent f(String str, O o10, PackageManager packageManager) {
        String p10 = o10.p("gcm.n.click_action");
        if (!TextUtils.isEmpty(p10)) {
            Intent intent = new Intent(p10);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri f10 = o10.f();
        if (f10 != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(f10);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    public static int g() {
        return f37932a.incrementAndGet();
    }

    public static Integer h(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                Log.w("FirebaseMessaging", "Color is invalid: " + str + ". Notification will use default color.");
            }
        }
        int i10 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i10 == 0) {
            return null;
        }
        try {
            return Integer.valueOf(AbstractC5338c.getColor(context, i10));
        } catch (Resources.NotFoundException unused2) {
            Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int i(O o10) {
        boolean a10 = o10.a("gcm.n.default_sound");
        ?? r02 = a10;
        if (o10.a("gcm.n.default_vibrate_timings")) {
            r02 = (a10 ? 1 : 0) | 2;
        }
        return o10.a("gcm.n.default_light_settings") ? r02 | 4 : r02;
    }

    public static Bundle j(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle;
                }
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e10);
        }
        return Bundle.EMPTY;
    }

    public static String k(Context context, String str, Bundle bundle) {
        NotificationChannel notificationChannel;
        String string;
        NotificationChannel notificationChannel2;
        NotificationChannel notificationChannel3;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                notificationChannel3 = notificationManager.getNotificationChannel(str);
                if (notificationChannel3 != null) {
                    return str;
                }
                Log.w("FirebaseMessaging", "Notification Channel requested (" + str + ") has not been created by the app. Manifest configuration, or default, value will be used.");
            }
            String string2 = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
            if (TextUtils.isEmpty(string2)) {
                Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
            } else {
                notificationChannel2 = notificationManager.getNotificationChannel(string2);
                if (notificationChannel2 != null) {
                    return string2;
                }
                Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
            }
            notificationChannel = notificationManager.getNotificationChannel("fcm_fallback_notification_channel");
            if (notificationChannel == null) {
                int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                if (identifier == 0) {
                    Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                    string = "Misc";
                } else {
                    string = context.getString(identifier);
                }
                notificationManager.createNotificationChannel(AbstractC1585a0.a("fcm_fallback_notification_channel", string, 3));
            }
            return "fcm_fallback_notification_channel";
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static int l(int i10) {
        return i10 | AudioRoutingController.DEVICE_OUT_USB_HEADSET;
    }

    public static int m(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && p(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && p(resources, identifier2)) {
                return identifier2;
            }
            Log.w("FirebaseMessaging", "Icon resource " + str2 + " not found. Notification will use default icon.");
        }
        int i10 = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i10 == 0 || !p(resources, i10)) {
            try {
                i10 = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e10) {
                Log.w("FirebaseMessaging", "Couldn't get own application info: " + e10);
            }
        }
        return (i10 == 0 || !p(resources, i10)) ? R.drawable.sym_def_app_icon : i10;
    }

    public static Uri n(String str, O o10, Resources resources) {
        String o11 = o10.o();
        if (TextUtils.isEmpty(o11)) {
            return null;
        }
        if (Constants.COLLATION_DEFAULT.equals(o11) || resources.getIdentifier(o11, "raw", str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        return Uri.parse("android.resource://" + str + "/raw/" + o11);
    }

    public static String o(O o10) {
        String p10 = o10.p("gcm.n.tag");
        if (!TextUtils.isEmpty(p10)) {
            return p10;
        }
        return "FCM-Notification:" + SystemClock.uptimeMillis();
    }

    public static boolean p(Resources resources, int i10) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!AbstractC3496c.a(resources.getDrawable(i10, null))) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i10);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i10 + ", treating it as an invalid icon");
            return false;
        }
    }

    public static boolean q(O o10) {
        return o10.a("google.c.a.e");
    }
}
