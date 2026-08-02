package org.chromium.base;

import android.app.Activity;
import internal.org.jni_zero.CalledByNative;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.chromium.base.task.PostTask;
import org.chromium.net.x;

/* loaded from: classes10.dex */
public final class ApplicationStatus {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<Activity, Object> f78453a = Collections.synchronizedMap(new HashMap());

    /* renamed from: b, reason: collision with root package name */
    public static final Map<Activity, Integer> f78454b = Collections.synchronizedMap(new HashMap());

    /* renamed from: c, reason: collision with root package name */
    private static b f78455c;

    /* renamed from: d, reason: collision with root package name */
    private static k<b> f78456d;

    final class a implements Runnable {

        /* renamed from: org.chromium.base.ApplicationStatus$a$a, reason: collision with other inner class name */
        final class C1334a implements b {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ApplicationStatus.f78455c != null) {
                return;
            }
            ApplicationStatus.f78455c = new C1334a();
            ApplicationStatus.d(ApplicationStatus.f78455c);
        }
    }

    public interface b {
    }

    private ApplicationStatus() {
    }

    public static void c() {
        synchronized (f78453a) {
        }
    }

    public static void d(b bVar) {
        if (f78456d == null) {
            f78456d = new k<>();
        }
        f78456d.c(bVar);
    }

    public static void e(x xVar) {
        k<b> kVar = f78456d;
        if (kVar == null) {
            return;
        }
        kVar.e(xVar);
    }

    @CalledByNative
    public static int getStateForApplication() {
        synchronized (f78453a) {
        }
        return 0;
    }

    @CalledByNative
    public static boolean hasVisibleActivities() {
        getStateForApplication();
        return false;
    }

    @CalledByNative
    private static void registerThreadSafeNativeApplicationStateListener() {
        PostTask.d(new a());
    }
}
