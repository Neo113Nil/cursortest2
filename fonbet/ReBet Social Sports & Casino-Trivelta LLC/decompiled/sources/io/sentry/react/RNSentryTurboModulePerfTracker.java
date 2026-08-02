package io.sentry.react;

import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public abstract class RNSentryTurboModulePerfTracker {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f52575a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f52576b = new AtomicBoolean(false);

    public static boolean a() {
        AtomicBoolean atomicBoolean = f52576b;
        if (atomicBoolean.get()) {
            return !f52575a.get();
        }
        synchronized (RNSentryTurboModulePerfTracker.class) {
            if (atomicBoolean.get()) {
                return !f52575a.get();
            }
            try {
                System.loadLibrary("sentry-tm-perf-logger");
                atomicBoolean.set(true);
                return true;
            } catch (UnsatisfiedLinkError e10) {
                f52575a.set(true);
                f52576b.set(true);
                Log.i(NativeRNSentrySpec.NAME, "libsentry-tm-perf-logger.so not loaded; TurboModule perf tracking unavailable: " + e10.getMessage());
                return false;
            }
        }
    }

    public static synchronized void b(boolean z10) {
        synchronized (RNSentryTurboModulePerfTracker.class) {
            if (f52575a.get()) {
                return;
            }
            if (z10 || f52576b.get()) {
                if (a()) {
                    try {
                        nativeSetEnabled(z10);
                    } catch (UnsatisfiedLinkError e10) {
                        f52575a.set(true);
                        Log.i(NativeRNSentrySpec.NAME, "TurboModule perf-logger native symbol not found; tracking disabled: " + e10.getMessage());
                    }
                }
            }
        }
    }

    private static native void nativeSetEnabled(boolean z10);
}
