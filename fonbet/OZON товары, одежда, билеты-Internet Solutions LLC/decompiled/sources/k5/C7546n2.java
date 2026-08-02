package k5;

import I0.C3173b;
import android.app.Activity;
import android.app.Activity$ScreenCaptureCallback;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.FileObserver;
import androidx.annotation.NonNull;
import java.io.File;
import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: k5.n2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7546n2 extends D0<Integer> {

    /* renamed from: f, reason: collision with root package name */
    private static boolean f70792f;

    /* renamed from: h, reason: collision with root package name */
    private static Activity$ScreenCaptureCallback f70794h;

    /* renamed from: j, reason: collision with root package name */
    private static FileObserver f70796j;

    /* renamed from: k, reason: collision with root package name */
    private static FileObserver f70797k;

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicInteger f70791e = new AtomicInteger(0);

    /* renamed from: g, reason: collision with root package name */
    private static final HashSet<Activity> f70793g = new HashSet<>();

    /* renamed from: i, reason: collision with root package name */
    private static final Application.ActivityLifecycleCallbacks f70795i = new b();

    /* renamed from: k5.n2$a */
    final class a extends FileObserver {
        @Override // android.os.FileObserver
        public final void onEvent(int i11, String str) {
            C7546n2.f70791e.getAndIncrement();
        }
    }

    /* renamed from: k5.n2$b */
    final class b implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(@NonNull Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(@NonNull Activity activity) {
            C7546n2.C(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(@NonNull Activity activity) {
            C7546n2.A(activity);
        }
    }

    /* renamed from: k5.n2$c */
    final class c extends FileObserver {
        @Override // android.os.FileObserver
        public final void onEvent(int i11, String str) {
            C7546n2.f70791e.getAndIncrement();
        }
    }

    /* renamed from: k5.n2$d */
    final class d extends FileObserver {
        d(File file) {
            super(file, 256);
        }

        @Override // android.os.FileObserver
        public final void onEvent(int i11, String str) {
            C7546n2.f70791e.getAndIncrement();
        }
    }

    /* renamed from: k5.n2$e */
    final class e extends FileObserver {
        e(File file) {
            super(file, 256);
        }

        @Override // android.os.FileObserver
        public final void onEvent(int i11, String str) {
            C7546n2.f70791e.getAndIncrement();
        }
    }

    static void A(Activity activity) {
        synchronized (C7546n2.class) {
            if (f70793g.remove(activity)) {
                activity.unregisterScreenCaptureCallback(f70794h);
            }
        }
    }

    static void C(Activity activity) {
        Executor mainExecutor;
        synchronized (C7546n2.class) {
            try {
                if (f70794h == null) {
                    f70794h = new C7550o2();
                }
                mainExecutor = activity.getMainExecutor();
                activity.registerScreenCaptureCallback(mainExecutor, f70794h);
                f70793g.add(activity);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void w() {
        String str;
        String str2;
        if (f70796j == null || f70797k == null) {
            if (Build.VERSION.SDK_INT >= 29) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Environment.getExternalStorageDirectory().getAbsolutePath());
                String str3 = File.separator;
                sb2.append(str3);
                sb2.append(Environment.DIRECTORY_PICTURES);
                sb2.append(str3);
                str = Environment.DIRECTORY_SCREENSHOTS;
                sb2.append(str);
                sb2.append(str3);
                File file = new File(sb2.toString());
                StringBuilder sb3 = new StringBuilder();
                sb3.append(Environment.getExternalStorageDirectory().getAbsolutePath());
                sb3.append(str3);
                sb3.append(Environment.DIRECTORY_DCIM);
                sb3.append(str3);
                str2 = Environment.DIRECTORY_SCREENSHOTS;
                sb3.append(str2);
                sb3.append(str3);
                File file2 = new File(sb3.toString());
                f70796j = new e(file);
                f70797k = new d(file2);
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(Environment.getExternalStorageDirectory().getAbsolutePath());
                String str4 = File.separator;
                sb4.append(str4);
                String c11 = C3173b.c(sb4, Environment.DIRECTORY_PICTURES, str4, "Screenshots", str4);
                StringBuilder sb5 = new StringBuilder();
                sb5.append(Environment.getExternalStorageDirectory().getAbsolutePath());
                sb5.append(str4);
                String c12 = C3173b.c(sb5, Environment.DIRECTORY_DCIM, str4, "Screenshots", str4);
                f70796j = new a(c11, 256);
                f70797k = new c(c12, 256);
            }
            f70796j.startWatching();
            f70797k.startWatching();
        }
    }

    public static synchronized void y(Context context) throws C7502c2 {
        synchronized (C7546n2.class) {
            if (f70792f) {
                return;
            }
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 34) {
                EnumC7578w enumC7578w = EnumC7578w.DETECT_SCREEN_CAPTURE;
                if (!Gf.d.l(context, enumC7578w.a())) {
                    throw new C7502c2(enumC7578w);
                }
            } else {
                EnumC7578w enumC7578w2 = EnumC7578w.READ_EXTERNAL_STORAGE;
                if (!Gf.d.l(context, enumC7578w2.a())) {
                    throw new C7502c2(enumC7578w2);
                }
            }
            f70791e.set(0);
            if (i11 >= 34) {
                synchronized (C7546n2.class) {
                    ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(f70795i);
                }
            } else {
                w();
            }
            f70792f = true;
        }
    }

    @Override // k5.D0
    @NonNull
    protected final Integer s() throws D1 {
        if (f70792f) {
            return Integer.valueOf(f70791e.intValue());
        }
        throw new P1("not started and/or permission denied");
    }
}
