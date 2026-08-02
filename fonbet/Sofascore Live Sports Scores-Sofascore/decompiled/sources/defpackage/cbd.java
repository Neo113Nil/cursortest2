package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class cbd {
    public static final /* synthetic */ int a = 0;

    static {
        rik.x("NetworkStateTracker");
    }

    public static final bbd a(ConnectivityManager connectivityManager, boolean z) {
        boolean z2;
        NetworkInfo activeNetworkInfo;
        boolean z3;
        boolean z4;
        NetworkCapabilities networkCapabilities;
        connectivityManager.getClass();
        try {
            activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            z3 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
            try {
                networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            } catch (SecurityException unused) {
                rik.o().getClass();
            }
        } catch (SecurityException unused2) {
            z2 = z;
        }
        try {
            if (networkCapabilities != null) {
                z4 = networkCapabilities.hasCapability(16);
                z2 = z;
                return new bbd(z3, z4, connectivityManager.isActiveNetworkMetered(), activeNetworkInfo == null && !activeNetworkInfo.isRoaming(), z2);
            }
            return new bbd(z3, z4, connectivityManager.isActiveNetworkMetered(), activeNetworkInfo == null && !activeNetworkInfo.isRoaming(), z2);
        } catch (SecurityException unused3) {
            rik.o().getClass();
            return new bbd(false, false, false, true, z2);
        }
        z4 = false;
        z2 = z;
    }
}
