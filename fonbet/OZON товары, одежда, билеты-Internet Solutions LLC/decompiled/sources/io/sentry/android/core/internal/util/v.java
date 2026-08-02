package io.sentry.android.core.internal.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Choreographer;
import android.view.Display;
import android.view.FrameMetrics;
import android.view.Window;
import io.sentry.I2;
import io.sentry.Z0;
import io.sentry.android.core.C7113n;
import io.sentry.android.core.I;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class v implements Application.ActivityLifecycleCallbacks {

    /* renamed from: n, reason: collision with root package name */
    private static final long f67230n = TimeUnit.SECONDS.toNanos(1);

    /* renamed from: o, reason: collision with root package name */
    private static final long f67231o = TimeUnit.MILLISECONDS.toNanos(700);

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f67232p = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final I f67233a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final CopyOnWriteArraySet f67234b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C7113n f67235c;

    /* renamed from: d, reason: collision with root package name */
    private Handler f67236d;

    /* renamed from: e, reason: collision with root package name */
    private WeakReference<Window> f67237e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap f67238f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f67239g;

    /* renamed from: h, reason: collision with root package name */
    private final b f67240h;

    /* renamed from: i, reason: collision with root package name */
    private t f67241i;

    /* renamed from: j, reason: collision with root package name */
    private Choreographer f67242j;

    /* renamed from: k, reason: collision with root package name */
    private Field f67243k;

    /* renamed from: l, reason: collision with root package name */
    private long f67244l;

    /* renamed from: m, reason: collision with root package name */
    private long f67245m;

    public interface a {
        void e(long j11, long j12, long j13, long j14, boolean z11, boolean z12, float f7);
    }

    public interface b {
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [io.sentry.android.core.internal.util.t] */
    @SuppressLint({"NewApi"})
    public v(@NotNull Context context, @NotNull final C7113n c7113n, @NotNull final I i11) {
        u uVar = new u();
        this.f67234b = new CopyOnWriteArraySet();
        this.f67238f = new ConcurrentHashMap();
        this.f67239g = false;
        this.f67244l = 0L;
        this.f67245m = 0L;
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        io.sentry.util.p.b(c7113n, "Logger is required");
        this.f67235c = c7113n;
        io.sentry.util.p.b(i11, "BuildInfoProvider is required");
        this.f67233a = i11;
        this.f67240h = uVar;
        if (context instanceof Application) {
            this.f67239g = true;
            HandlerThread handlerThread = new HandlerThread("io.sentry.android.core.internal.util.SentryFrameMetricsCollector");
            handlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: io.sentry.android.core.internal.util.r
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th2) {
                    C7113n.this.a(I2.ERROR, "Error during frames measurements.", th2);
                }
            });
            handlerThread.start();
            this.f67236d = new Handler(handlerThread.getLooper());
            ((Application) context).registerActivityLifecycleCallbacks(this);
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.internal.util.s
                @Override // java.lang.Runnable
                public final void run() {
                    v.a(v.this, c7113n);
                }
            });
            try {
                Field declaredField = Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
                this.f67243k = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e11) {
                c7113n.a(I2.ERROR, "Unable to get the frame timestamp from the choreographer: ", e11);
            }
            this.f67241i = new Window.OnFrameMetricsAvailableListener() { // from class: io.sentry.android.core.internal.util.t
                @Override // android.view.Window.OnFrameMetricsAvailableListener
                public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i12) {
                    v.d(v.this, i11, window, frameMetrics);
                }
            };
        }
    }

    public static /* synthetic */ void a(v vVar, C7113n c7113n) {
        vVar.getClass();
        try {
            vVar.f67242j = Choreographer.getInstance();
        } catch (Throwable th2) {
            c7113n.a(I2.ERROR, "Error retrieving Choreographer instance. Slow and frozen frames will not be reported.", th2);
        }
    }

    public static void b(v vVar, Window window) {
        if (vVar.f67234b.add(window)) {
            try {
                b bVar = vVar.f67240h;
                t tVar = vVar.f67241i;
                Handler handler = vVar.f67236d;
                bVar.getClass();
                if (tVar == null) {
                    return;
                }
                window.addOnFrameMetricsAvailableListener(tVar, handler);
            } catch (Throwable th2) {
                vVar.f67235c.a(I2.ERROR, "Failed to add frameMetricsAvailableListener", th2);
            }
        }
    }

    public static void c(v vVar, Window window) {
        vVar.getClass();
        try {
            if (vVar.f67234b.remove(window)) {
                b bVar = vVar.f67240h;
                t tVar = vVar.f67241i;
                bVar.getClass();
                if (tVar == null) {
                    return;
                }
                window.removeOnFrameMetricsAvailableListener(tVar);
            }
        } catch (Throwable th2) {
            vVar.f67235c.a(I2.ERROR, "Failed to remove frameMetricsAvailableListener", th2);
        }
    }

    public static void d(v vVar, I i11, Window window, FrameMetrics frameMetrics) {
        float refreshRate;
        Display display;
        vVar.getClass();
        long nanoTime = System.nanoTime();
        i11.getClass();
        if (Build.VERSION.SDK_INT >= 30) {
            display = window.getContext().getDisplay();
            refreshRate = display.getRefreshRate();
        } else {
            refreshRate = window.getWindowManager().getDefaultDisplay().getRefreshRate();
        }
        float f7 = refreshRate;
        float f11 = f67230n;
        long metric = frameMetrics.getMetric(5) + frameMetrics.getMetric(4) + frameMetrics.getMetric(3) + frameMetrics.getMetric(2) + frameMetrics.getMetric(1) + frameMetrics.getMetric(0);
        long max = Math.max(0L, metric - ((long) (f11 / f7)));
        vVar.f67233a.getClass();
        long metric2 = frameMetrics.getMetric(10);
        if (metric2 < 0) {
            metric2 = nanoTime - metric;
        }
        long max2 = Math.max(metric2, vVar.f67245m);
        if (max2 == vVar.f67244l) {
            return;
        }
        vVar.f67244l = max2;
        vVar.f67245m = max2 + metric;
        boolean z11 = metric > ((long) (f11 / (f7 - 1.0f)));
        boolean z12 = z11 && f(metric);
        Iterator it = vVar.f67238f.values().iterator();
        while (it.hasNext()) {
            long j11 = metric;
            long j12 = max;
            ((a) it.next()).e(max2, vVar.f67245m, j11, j12, z11, z12, f7);
            max = j12;
            metric = j11;
        }
    }

    public static boolean f(long j11) {
        return j11 > f67231o;
    }

    @SuppressLint({"NewApi"})
    private void i() {
        WeakReference<Window> weakReference = this.f67237e;
        final Window window = weakReference != null ? weakReference.get() : null;
        if (window == null || !this.f67239g || this.f67238f.isEmpty() || this.f67236d == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.internal.util.p
            @Override // java.lang.Runnable
            public final void run() {
                v.b(v.this, window);
            }
        });
    }

    public final long e() {
        Field field;
        Choreographer choreographer = this.f67242j;
        if (choreographer == null || (field = this.f67243k) == null) {
            return -1L;
        }
        try {
            Long l11 = (Long) field.get(choreographer);
            if (l11 != null) {
                return l11.longValue();
            }
            return -1L;
        } catch (IllegalAccessException unused) {
            return -1L;
        }
    }

    public final String g(@NotNull a aVar) {
        if (!this.f67239g) {
            return null;
        }
        String c11 = Z0.c();
        this.f67238f.put(c11, aVar);
        i();
        return c11;
    }

    public final void h(String str) {
        if (this.f67239g) {
            ConcurrentHashMap concurrentHashMap = this.f67238f;
            if (str != null) {
                concurrentHashMap.remove(str);
            }
            WeakReference<Window> weakReference = this.f67237e;
            Window window = weakReference != null ? weakReference.get() : null;
            if (window == null || !concurrentHashMap.isEmpty()) {
                return;
            }
            new Handler(Looper.getMainLooper()).post(new q(this, window));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NotNull Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NotNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NotNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NotNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NotNull Activity activity) {
        Window window = activity.getWindow();
        WeakReference<Window> weakReference = this.f67237e;
        if (weakReference == null || weakReference.get() != window) {
            this.f67237e = new WeakReference<>(window);
            i();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NotNull Activity activity) {
        new Handler(Looper.getMainLooper()).post(new q(this, activity.getWindow()));
        WeakReference<Window> weakReference = this.f67237e;
        if (weakReference == null || weakReference.get() != activity.getWindow()) {
            return;
        }
        this.f67237e = null;
    }
}
