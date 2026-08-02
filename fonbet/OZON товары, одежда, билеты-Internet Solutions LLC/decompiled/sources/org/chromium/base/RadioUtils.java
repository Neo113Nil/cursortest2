package org.chromium.base;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Process;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import internal.org.jni_zero.CalledByNative;

/* loaded from: classes10.dex */
public final class RadioUtils {

    /* renamed from: a, reason: collision with root package name */
    private static Boolean f78517a;

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f78518b;

    private RadioUtils() {
    }

    @CalledByNative
    private static int getCellDataActivity() {
        TraceEvent r11 = TraceEvent.r("RadioUtils::getCellDataActivity");
        try {
            try {
                int dataActivity = ((TelephonyManager) e.b().getSystemService("phone")).getDataActivity();
                if (r11 != null) {
                    r11.close();
                }
                return dataActivity;
            } catch (SecurityException unused) {
                if (r11 == null) {
                    return -1;
                }
                r11.close();
                return -1;
            }
        } catch (Throwable th2) {
            if (r11 != null) {
                try {
                    r11.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @CalledByNative
    private static int getCellSignalLevel() {
        SignalStrength signalStrength;
        TraceEvent r11 = TraceEvent.r("RadioUtils::getCellSignalLevel");
        try {
            int i11 = -1;
            try {
                signalStrength = ((TelephonyManager) e.b().getSystemService("phone")).getSignalStrength();
                if (signalStrength != null) {
                    i11 = signalStrength.getLevel();
                }
            } catch (SecurityException unused) {
            }
            if (r11 != null) {
                r11.close();
            }
            return i11;
        } catch (Throwable th2) {
            if (r11 != null) {
                try {
                    r11.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @CalledByNative
    private static boolean isSupported() {
        int i11;
        if (Build.VERSION.SDK_INT >= 28) {
            int i12 = -1;
            if (f78517a == null) {
                try {
                    i11 = e.b().checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid());
                } catch (RuntimeException unused) {
                    i11 = -1;
                }
                f78517a = Boolean.valueOf(i11 == 0);
            }
            if (f78517a.booleanValue()) {
                if (f78518b == null) {
                    try {
                        i12 = e.b().checkPermission("android.permission.ACCESS_WIFI_STATE", Process.myPid(), Process.myUid());
                    } catch (RuntimeException unused2) {
                    }
                    f78518b = Boolean.valueOf(i12 == 0);
                }
                if (f78518b.booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    @CalledByNative
    private static boolean isWifiConnected() {
        TraceEvent r11 = TraceEvent.r("RadioUtils::isWifiConnected");
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) e.b().getSystemService("connectivity");
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null) {
                if (r11 != null) {
                    r11.close();
                }
                return false;
            }
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            if (networkCapabilities == null) {
                if (r11 != null) {
                    r11.close();
                }
                return false;
            }
            boolean hasTransport = networkCapabilities.hasTransport(1);
            if (r11 != null) {
                r11.close();
            }
            return hasTransport;
        } catch (Throwable th2) {
            if (r11 != null) {
                try {
                    r11.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
