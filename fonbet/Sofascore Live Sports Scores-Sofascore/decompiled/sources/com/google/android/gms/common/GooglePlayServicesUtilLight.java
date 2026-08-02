package com.google.android.gms.common;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes3.dex */
public class GooglePlayServicesUtilLight {
    public static boolean b = false;
    public static boolean c = false;
    public static final AtomicBoolean a = new AtomicBoolean();
    public static final AtomicBoolean d = new AtomicBoolean();

    @KeepForSdk
    public GooglePlayServicesUtilLight() {
    }

    public static void a(Context context) {
        GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.b;
        int b2 = googleApiAvailabilityLight.b(context, 11925000);
        if (b2 != 0) {
            Intent a2 = googleApiAvailabilityLight.a(context, b2, "e");
            new StringBuilder(String.valueOf(b2).length() + 46);
            if (a2 != null) {
                throw new GooglePlayServicesRepairableException("Google Play Services not available");
            }
            throw new GooglePlayServicesNotAvailableException();
        }
    }

    public static int b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    public static boolean c(Context context) {
        if (!c) {
            try {
                PackageInfo b2 = Wrappers.a(context).b(Build.VERSION.SDK_INT >= 28 ? 134217792 : 64, "com.google.android.gms");
                GoogleSignatureVerifier.a(context);
                if (b2 == null || GoogleSignatureVerifier.c(b2, false) || !GoogleSignatureVerifier.c(b2, true)) {
                    b = false;
                } else {
                    b = true;
                }
                c = true;
            } catch (PackageManager.NameNotFoundException unused) {
                c = true;
            } catch (Throwable th) {
                c = true;
                throw th;
            }
        }
        return b || !"user".equals(Build.TYPE);
    }

    public static boolean d(Context context) {
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            return context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }
}
