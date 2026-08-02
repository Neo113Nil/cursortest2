package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class y05 {
    public static Boolean a;
    public static Boolean b;
    public static final mqi c = ypa.b(new wc4(13));

    public static boolean a(Context context) {
        context.getClass();
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences = a5f.d(applicationContext);
                uic.j = sharedPreferences;
            }
            sharedPreferences.getClass();
        }
        if (sharedPreferences.getBoolean("DEV_MODE_SIMULATE_LOW_RAM", false)) {
            b = Boolean.TRUE;
            return true;
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService(ActivityManager.class);
        boolean isLowRamDevice = activityManager != null ? activityManager.isLowRamDevice() : false;
        b = Boolean.valueOf(isLowRamDevice);
        return isLowRamDevice;
    }
}
