package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@KeepForSdk
/* loaded from: classes3.dex */
public final class DeviceProperties {
    public static Boolean a;
    public static Boolean b;
    public static Boolean c;
    public static Boolean d;
    public static Boolean e;
    public static Boolean f;

    private DeviceProperties() {
    }

    public static boolean a(Context context) {
        Boolean bool = c;
        if (bool == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z = true;
            }
            bool = Boolean.valueOf(z);
            c = bool;
        }
        return bool.booleanValue();
    }

    public static boolean b(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Boolean bool = a;
        if (bool == null) {
            bool = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
            a = bool;
        }
        return bool.booleanValue();
    }

    public static boolean c(Context context) {
        b(context);
        return d(context) && PlatformVersion.a();
    }

    public static boolean d(Context context) {
        Boolean bool = b;
        if (bool == null) {
            bool = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
            b = bool;
        }
        return bool.booleanValue();
    }
}
