package org.chromium.base;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import internal.org.jni_zero.CalledByNative;

/* loaded from: classes6.dex */
public final class DeviceInfo {

    /* renamed from: b, reason: collision with root package name */
    private static DeviceInfo f78464b;

    /* renamed from: c, reason: collision with root package name */
    private static final Object f78465c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final IDeviceInfo f78466a;

    private DeviceInfo() {
        PackageInfo packageInfo;
        String str;
        boolean z11;
        FeatureInfo[] systemAvailableFeatures;
        IDeviceInfo iDeviceInfo = new IDeviceInfo();
        this.f78466a = iDeviceInfo;
        int i11 = l.f78550b;
        int i12 = 0;
        try {
            packageInfo = e.b().getPackageManager().getPackageInfo("com.google.android.gms", 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        if (packageInfo != null) {
            str = String.valueOf(Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode);
        } else {
            str = "gms versionCode not available.";
        }
        iDeviceInfo.f78497a = str;
        Context b11 = e.b();
        PackageManager packageManager = b11.getPackageManager();
        UiModeManager uiModeManager = (UiModeManager) b11.getSystemService("uimode");
        iDeviceInfo.f78501e = uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
        try {
            z11 = packageManager.hasSystemFeature("android.hardware.type.automotive");
        } catch (SecurityException e11) {
            j.b("DeviceInfo", "Unable to query for Automotive system feature", e11);
            z11 = false;
        }
        IDeviceInfo iDeviceInfo2 = this.f78466a;
        iDeviceInfo2.f78498b = z11;
        int i13 = Build.VERSION.SDK_INT;
        iDeviceInfo2.f78500d = i13 >= 30 && packageManager.hasSystemFeature("android.hardware.sensor.hinge_angle");
        this.f78466a.f78499c = packageManager.hasSystemFeature("android.hardware.type.pc");
        if (i13 >= 33 && (systemAvailableFeatures = packageManager.getSystemAvailableFeatures()) != null) {
            int length = systemAvailableFeatures.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    break;
                }
                FeatureInfo featureInfo = systemAvailableFeatures[i14];
                if ("android.software.vulkan.deqp.level".equals(featureInfo.name)) {
                    i12 = featureInfo.version;
                    break;
                }
                i14++;
            }
        }
        this.f78466a.f78502f = i12;
    }

    private static DeviceInfo a() {
        DeviceInfo deviceInfo;
        synchronized (f78465c) {
            try {
                if (f78464b == null) {
                    f78464b = new DeviceInfo();
                }
                deviceInfo = f78464b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return deviceInfo;
    }

    public static void b() {
        int i11 = a().f78466a.f78502f;
    }

    public static void c() {
        boolean z11 = a().f78466a.f78498b;
    }

    public static void d() {
        boolean z11 = a().f78466a.f78499c;
    }

    public static void e() {
        boolean z11 = a().f78466a.f78500d;
    }

    public static void f() {
        boolean z11 = a().f78466a.f78501e;
    }

    @CalledByNative
    private static void nativeReadyForFields() {
        IDeviceInfo iDeviceInfo = a().f78466a;
        f.b().a(iDeviceInfo.f78497a, iDeviceInfo.f78502f, iDeviceInfo.f78501e, iDeviceInfo.f78498b, iDeviceInfo.f78500d, iDeviceInfo.f78499c);
    }
}
