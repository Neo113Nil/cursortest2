package io.sentry.android.core;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import io.sentry.ILogger;
import io.sentry.b5;
import io.sentry.b6;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n0 implements io.sentry.transport.h {

    /* renamed from: b, reason: collision with root package name */
    public static final n0 f15781b = new n0();

    /* renamed from: a, reason: collision with root package name */
    public Object f15782a;

    public n0() {
        this.f15782a = new Handler(Looper.getMainLooper());
    }

    @Override // io.sentry.transport.h
    public boolean a() {
        int i5 = x.f15889a[((b6) this.f15782a).getConnectionStatusProvider().T().ordinal()];
        return i5 == 1 || i5 == 2 || i5 == 3;
    }

    public Boolean b() {
        boolean z5;
        try {
            if (Build.BRAND.startsWith("generic")) {
                if (!Build.DEVICE.startsWith("generic")) {
                }
                z5 = true;
                return Boolean.valueOf(z5);
            }
            String str = Build.FINGERPRINT;
            if (!str.startsWith("generic") && !str.startsWith("unknown")) {
                String str2 = Build.HARDWARE;
                if (!str2.contains("goldfish") && !str2.contains("ranchu")) {
                    String str3 = Build.MODEL;
                    if (!str3.contains("google_sdk") && !str3.contains("Emulator") && !str3.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion")) {
                        String str4 = Build.PRODUCT;
                        if (!str4.contains("sdk_google") && !str4.contains("google_sdk") && !str4.contains("sdk") && !str4.contains("sdk_x86") && !str4.contains("vbox86p") && !str4.contains("emulator") && !str4.contains("simulator")) {
                            z5 = false;
                            return Boolean.valueOf(z5);
                        }
                    }
                }
            }
            z5 = true;
            return Boolean.valueOf(z5);
        } catch (Throwable th2) {
            ((ILogger) this.f15782a).e(b5.ERROR, "Error checking whether application is running in an emulator.", th2);
            return null;
        }
    }

    public void c(Activity activity) {
        WeakReference weakReference = (WeakReference) this.f15782a;
        if (weakReference == null || weakReference.get() != activity) {
            this.f15782a = new WeakReference(activity);
        }
    }

    public n0(ILogger iLogger) {
        y4.a.C(iLogger, "The ILogger object is required.");
        this.f15782a = iLogger;
    }
}
