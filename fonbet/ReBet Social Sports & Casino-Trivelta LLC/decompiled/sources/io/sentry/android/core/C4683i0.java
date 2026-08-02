package io.sentry.android.core;

import android.os.Build;
import io.sentry.EnumC4788n3;
import io.sentry.ILogger;

/* renamed from: io.sentry.android.core.i0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4683i0 {

    /* renamed from: a, reason: collision with root package name */
    public final ILogger f50997a;

    public C4683i0(ILogger iLogger) {
        this.f50997a = (ILogger) io.sentry.util.w.c(iLogger, "The ILogger object is required.");
    }

    public String a() {
        return Build.TAGS;
    }

    public String b() {
        return Build.MANUFACTURER;
    }

    public String c() {
        return Build.MODEL;
    }

    public int d() {
        return Build.VERSION.SDK_INT;
    }

    public String e() {
        return Build.VERSION.RELEASE;
    }

    public Boolean f() {
        boolean z10;
        try {
            if (Build.BRAND.startsWith("generic")) {
                if (!Build.DEVICE.startsWith("generic")) {
                }
                z10 = true;
                return Boolean.valueOf(z10);
            }
            String str = Build.FINGERPRINT;
            if (!str.startsWith("generic") && !str.startsWith("unknown")) {
                String str2 = Build.HARDWARE;
                if (!str2.contains("goldfish") && !str2.contains("ranchu")) {
                    String str3 = Build.MODEL;
                    if (!str3.contains("google_sdk") && !str3.contains("Emulator") && !str3.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion")) {
                        String str4 = Build.PRODUCT;
                        if (!str4.contains("sdk_google") && !str4.contains("google_sdk") && !str4.contains("sdk") && !str4.contains("sdk_x86") && !str4.contains("vbox86p") && !str4.contains("emulator") && !str4.contains("simulator")) {
                            z10 = false;
                            return Boolean.valueOf(z10);
                        }
                    }
                }
            }
            z10 = true;
            return Boolean.valueOf(z10);
        } catch (Throwable th2) {
            this.f50997a.b(EnumC4788n3.ERROR, "Error checking whether application is running in an emulator.", th2);
            return null;
        }
    }
}
