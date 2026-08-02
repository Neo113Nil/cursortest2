package io.sentry.android.core;

import android.os.Build;
import io.sentry.I2;
import io.sentry.ILogger;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    final ILogger f66914a;

    public I(@NotNull ILogger iLogger) {
        io.sentry.util.p.b(iLogger, "The ILogger object is required.");
        this.f66914a = iLogger;
    }

    public final Boolean a() {
        boolean z11;
        try {
            if (Build.BRAND.startsWith("generic")) {
                if (!Build.DEVICE.startsWith("generic")) {
                }
                z11 = true;
                return Boolean.valueOf(z11);
            }
            String str = Build.FINGERPRINT;
            if (!str.startsWith("generic") && !str.startsWith("unknown")) {
                String str2 = Build.HARDWARE;
                if (!str2.contains("goldfish") && !str2.contains("ranchu")) {
                    String str3 = Build.MODEL;
                    if (!str3.contains("google_sdk") && !str3.contains("Emulator") && !str3.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion")) {
                        String str4 = Build.PRODUCT;
                        if (!str4.contains("sdk_google") && !str4.contains("google_sdk") && !str4.contains("sdk") && !str4.contains("sdk_x86") && !str4.contains("vbox86p") && !str4.contains("emulator") && !str4.contains("simulator")) {
                            z11 = false;
                            return Boolean.valueOf(z11);
                        }
                    }
                }
            }
            z11 = true;
            return Boolean.valueOf(z11);
        } catch (Throwable th2) {
            this.f66914a.a(I2.ERROR, "Error checking whether application is running in an emulator.", th2);
            return null;
        }
    }
}
