package e6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.dieam.reactnativepushnotification.modules.RNPushNotification;

/* renamed from: e6.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4182c {

    /* renamed from: b, reason: collision with root package name */
    public static Bundle f45723b;

    /* renamed from: a, reason: collision with root package name */
    public Context f45724a;

    public C4182c(Context context) {
        this.f45724a = context;
        if (f45723b == null) {
            try {
                f45723b = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException e10) {
                e10.printStackTrace();
                Log.e(RNPushNotification.LOG_TAG, "Error reading application meta, falling back to defaults");
                f45723b = new Bundle();
            }
        }
    }

    public int a() {
        try {
            return androidx.core.content.res.k.d(this.f45724a.getResources(), f45723b.getInt("com.dieam.reactnativepushnotification.notification_color"), null);
        } catch (Exception unused) {
            Log.w(RNPushNotification.LOG_TAG, "Unable to find com.dieam.reactnativepushnotification.notification_color in manifest. Falling back to default");
            return -1;
        }
    }

    public String b() {
        try {
            return c("com.dieam.reactnativepushnotification.default_notification_channel_id", c("com.google.firebase.messaging.default_notification_channel_id", "fcm_fallback_notification_channel"));
        } catch (Exception unused) {
            Log.w(RNPushNotification.LOG_TAG, "Unable to find com.dieam.reactnativepushnotification.default_notification_channel_id in manifest. Falling back to default");
            return "fcm_fallback_notification_channel";
        }
    }

    public final String c(String str, String str2) {
        try {
            String string = f45723b.getString(str);
            if (string != null) {
                if (string.length() > 0) {
                    return string;
                }
            }
            return str2;
        } catch (Exception unused) {
            Log.w(RNPushNotification.LOG_TAG, "Unable to find " + str + " in manifest. Falling back to default");
            return str2;
        }
    }
}
