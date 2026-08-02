package com.playtika.pras.c;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.hardware.display.DisplayManager;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.app.AppCompatActivity;
import com.playtika.pras.sdk.R;
import com.playtika.pras.sdk.network.ConnectionType;
import com.safedk.android.analytics.brandsafety.m;
import io.sentry.ProfilingTraceData;
import io.sentry.protocol.Device;
import java.util.Locale;
import org.apache.cordova.globalization.Globalization;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class a {
    public final int a;
    public final long b;
    public final ConnectionType c;
    public final Context d;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(Context context, String str) {
        PackageInfo packageInfo;
        ConnectivityManager connectivityManager;
        this.a = 0;
        this.b = 0L;
        this.c = ConnectionType.UNKNOWN;
        this.d = context;
        this.a = 7104;
        PackageManager packageManager = context.getPackageManager();
        try {
            if (packageManager != null) {
                try {
                    packageInfo = packageManager.getPackageInfo(str, 0);
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (packageInfo != null) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        this.b = packageInfo.getLongVersionCode();
                    } else {
                        this.b = packageInfo.versionCode;
                    }
                }
                this.c = ConnectionType.UNKNOWN;
                int i = Build.VERSION.SDK_INT;
                connectivityManager = (ConnectivityManager) this.d.getSystemService(ConnectivityManager.class);
                if (connectivityManager != null) {
                    if (i >= 29) {
                        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                        if (networkCapabilities != null) {
                            if (networkCapabilities.hasTransport(1)) {
                                this.c = ConnectionType.WIFI;
                            } else if (networkCapabilities.hasTransport(0)) {
                                this.c = ConnectionType.MOBILE;
                            }
                        }
                    } else {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo != null) {
                            if (activeNetworkInfo.getType() == 1) {
                                this.c = ConnectionType.WIFI;
                            } else if (activeNetworkInfo.getType() == 0) {
                                this.c = ConnectionType.MOBILE;
                            }
                        }
                    }
                }
                return;
            }
            int i2 = Build.VERSION.SDK_INT;
            connectivityManager = (ConnectivityManager) this.d.getSystemService(ConnectivityManager.class);
            if (connectivityManager != null) {
            }
            return;
        } catch (Exception unused2) {
            return;
        }
        packageInfo = null;
        if (packageInfo != null) {
        }
        this.c = ConnectionType.UNKNOWN;
    }

    public static String g() {
        return Build.MANUFACTURER;
    }

    public final Boolean a() {
        try {
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.d.getSystemService("accessibility");
            return Boolean.valueOf(accessibilityManager != null && accessibilityManager.isEnabled());
        } catch (Exception unused) {
            return null;
        }
    }

    public final String b() {
        return Settings.Secure.getString(this.d.getContentResolver(), "android_id");
    }

    public final String c() {
        try {
            Intent registerReceiver = this.d.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver == null) {
                return null;
            }
            int intExtra = registerReceiver.getIntExtra("level", -1);
            int intExtra2 = registerReceiver.getIntExtra("scale", -1);
            int intExtra3 = registerReceiver.getIntExtra("status", -1);
            if (intExtra3 == 5) {
                return Globalization.FULL;
            }
            if (intExtra3 == 2) {
                return Device.JsonKeys.CHARGING;
            }
            PowerManager powerManager = (PowerManager) this.d.getSystemService("power");
            if (powerManager != null && powerManager.isPowerSaveMode()) {
                return "lowPowerMode";
            }
            if (intExtra2 > 0) {
                if ((intExtra * 100) / intExtra2 <= 20) {
                    return m.aa;
                }
            }
            return ProfilingTraceData.TRUNCATION_REASON_NORMAL;
        } catch (Exception unused) {
            return null;
        }
    }

    public final JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = Build.MODEL;
            if (str != null) {
                jSONObject.put("model", str);
            }
            jSONObject.put("type", f());
            String str2 = Build.MANUFACTURER;
            if (str2 != null) {
                jSONObject.put("vendor", str2);
            }
            if (Settings.Secure.getString(this.d.getContentResolver(), "android_id") != null) {
                jSONObject.put("sdkAndroidId", Settings.Secure.getString(this.d.getContentResolver(), "android_id"));
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final Integer e() {
        try {
            ActivityManager activityManager = (ActivityManager) this.d.getSystemService("activity");
            if (activityManager == null) {
                return null;
            }
            activityManager.getMemoryInfo(new ActivityManager.MemoryInfo());
            double d = r2.totalMem / 1.073741824E9d;
            if (d >= 14.0d) {
                return 16;
            }
            if (d >= 10.0d) {
                return 12;
            }
            if (d >= 6.0d) {
                return 8;
            }
            return d >= 3.0d ? 4 : 2;
        } catch (Exception unused) {
            return null;
        }
    }

    public final b f() {
        return this.d.getResources().getBoolean(R.bool.is_tablet) ? b.ANDROID_TABLET : b.ANDROID_PHONE;
    }

    public final String h() {
        Display display;
        try {
            DisplayManager displayManager = (DisplayManager) this.d.getSystemService("display");
            if (displayManager == null || (display = displayManager.getDisplay(0)) == null) {
                return null;
            }
            display.getRealMetrics(new DisplayMetrics());
            return String.format(Locale.US, "%.1f", Double.valueOf(Math.sqrt(Math.pow(r3.widthPixels / r3.xdpi, 2.0d) + Math.pow(r3.heightPixels / r3.ydpi, 2.0d)))).concat("\"");
        } catch (Exception unused) {
            return null;
        }
    }

    public final Integer i() {
        Display display;
        try {
            DisplayManager displayManager = (DisplayManager) this.d.getSystemService("display");
            if (displayManager == null || (display = displayManager.getDisplay(0)) == null) {
                return null;
            }
            return Integer.valueOf(Math.round(display.getRefreshRate()));
        } catch (Exception unused) {
            return null;
        }
    }

    public final String j() {
        try {
            return (this.d.getResources().getConfiguration().uiMode & 48) == 32 ? "dark" : "light";
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean a(AppCompatActivity appCompatActivity) {
        try {
            WindowManager windowManager = (WindowManager) appCompatActivity.getSystemService("window");
            if (windowManager == null) {
                return appCompatActivity.getResources().getConfiguration().smallestScreenWidthDp >= 700;
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
            return Math.min(((float) displayMetrics.widthPixels) / (displayMetrics.xdpi / 160.0f), ((float) displayMetrics.heightPixels) / (displayMetrics.ydpi / 160.0f)) >= 700.0f;
        } catch (Exception unused) {
            return appCompatActivity.getResources().getConfiguration().smallestScreenWidthDp >= 700;
        }
    }
}
