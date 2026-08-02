package org.chromium.base;

import android.content.SharedPreferences;
import android.os.Process;
import android.os.SystemClock;
import internal.org.jni_zero.CalledByNative;
import java.util.ArrayList;
import org.chromium.base.e;

/* loaded from: classes6.dex */
public final class EarlyTraceEvent {

    /* renamed from: a, reason: collision with root package name */
    static volatile int f78467a;

    /* renamed from: b, reason: collision with root package name */
    static final Object f78468b = new Object();

    /* renamed from: c, reason: collision with root package name */
    static final ArrayList f78469c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    static final ArrayList f78470d = new ArrayList();

    /* loaded from: classes10.dex */
    static final class a {
    }

    /* loaded from: classes10.dex */
    static final class b {
    }

    public static void a() {
        if (b()) {
            Process.myTid();
            System.nanoTime();
            SystemClock.currentThreadTimeMillis();
            synchronized (f78468b) {
                try {
                    if (b()) {
                        throw null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    static boolean b() {
        return f78467a == 1;
    }

    public static void c() {
        if (b()) {
            Process.myTid();
            System.nanoTime();
            SystemClock.currentThreadTimeMillis();
            synchronized (f78468b) {
                try {
                    if (b()) {
                        throw null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @CalledByNative
    public static boolean getBackgroundStartupTracingFlag() {
        return false;
    }

    @CalledByNative
    static void setBackgroundStartupTracingFlag(boolean z11) {
        SharedPreferences sharedPreferences;
        o j11 = o.j();
        try {
            sharedPreferences = e.a.f78541a;
            sharedPreferences.edit().putBoolean("bg_startup_tracing", z11).apply();
            j11.close();
        } catch (Throwable th2) {
            try {
                j11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
