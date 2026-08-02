package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Choreographer;
import android.view.FrameMetrics;
import android.view.Window;
import android.view.Window$OnFrameMetricsAvailableListener;
import androidx.appcompat.app.t;
import io.sentry.android.core.n0;
import io.sentry.android.core.v;
import io.sentry.b5;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p implements Application.ActivityLifecycleCallbacks {

    /* renamed from: n, reason: collision with root package name */
    public static final long f15743n = TimeUnit.SECONDS.toNanos(1);

    /* renamed from: o, reason: collision with root package name */
    public static final long f15744o = TimeUnit.MILLISECONDS.toNanos(700);

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f15745p = 0;

    /* renamed from: a, reason: collision with root package name */
    public final n0 f15746a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArraySet f15747b;

    /* renamed from: c, reason: collision with root package name */
    public final v f15748c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f15749d;

    /* renamed from: e, reason: collision with root package name */
    public WeakReference f15750e;

    /* renamed from: f, reason: collision with root package name */
    public final ConcurrentHashMap f15751f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f15752g;

    /* renamed from: h, reason: collision with root package name */
    public final d f15753h;

    /* renamed from: i, reason: collision with root package name */
    public final n f15754i;
    public Choreographer j;

    /* renamed from: k, reason: collision with root package name */
    public final Field f15755k;

    /* renamed from: l, reason: collision with root package name */
    public long f15756l;

    /* renamed from: m, reason: collision with root package name */
    public long f15757m;

    /* JADX WARN: Type inference failed for: r4v5, types: [io.sentry.android.core.internal.util.n] */
    public p(Context context, final v vVar, final n0 n0Var) {
        d dVar = new d();
        this.f15747b = new CopyOnWriteArraySet();
        this.f15751f = new ConcurrentHashMap();
        this.f15752g = false;
        this.f15756l = 0L;
        this.f15757m = 0L;
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        this.f15748c = vVar;
        this.f15746a = n0Var;
        this.f15753h = dVar;
        if ((context instanceof Application) && Build.VERSION.SDK_INT >= 24) {
            this.f15752g = true;
            HandlerThread handlerThread = new HandlerThread("io.sentry.android.core.internal.util.SentryFrameMetricsCollector");
            handlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: io.sentry.android.core.internal.util.m
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th2) {
                    v.this.e(b5.ERROR, "Error during frames measurements.", th2);
                }
            });
            handlerThread.start();
            this.f15749d = new Handler(handlerThread.getLooper());
            ((Application) context).registerActivityLifecycleCallbacks(this);
            new Handler(Looper.getMainLooper()).post(new t(25, this, vVar));
            try {
                Field declaredField = Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
                this.f15755k = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e7) {
                vVar.e(b5.ERROR, "Unable to get the frame timestamp from the choreographer: ", e7);
            }
            this.f15754i = new Window$OnFrameMetricsAvailableListener() { // from class: io.sentry.android.core.internal.util.n
                public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i5) {
                    p.a(p.this, n0Var, window, frameMetrics);
                }
            };
        }
    }

    public static void a(p pVar, n0 n0Var, Window window, FrameMetrics frameMetrics) {
        long j;
        Field field;
        long nanoTime = System.nanoTime();
        int i5 = Build.VERSION.SDK_INT;
        float refreshRate = i5 >= 30 ? window.getContext().getDisplay().getRefreshRate() : window.getWindowManager().getDefaultDisplay().getRefreshRate();
        float f6 = f15743n;
        long metric = frameMetrics.getMetric(5) + frameMetrics.getMetric(4) + frameMetrics.getMetric(3) + frameMetrics.getMetric(2) + frameMetrics.getMetric(1) + frameMetrics.getMetric(0);
        long max = Math.max(0L, metric - ((long) (f6 / refreshRate)));
        pVar.f15746a.getClass();
        if (i5 >= 26) {
            j = frameMetrics.getMetric(10);
        } else {
            Choreographer choreographer = pVar.j;
            if (choreographer != null && (field = pVar.f15755k) != null) {
                try {
                    Long l6 = (Long) field.get(choreographer);
                    if (l6 != null) {
                        j = l6.longValue();
                    }
                } catch (IllegalAccessException unused) {
                }
            }
            j = -1;
        }
        if (j < 0) {
            j = nanoTime - metric;
        }
        long max2 = Math.max(j, pVar.f15757m);
        if (max2 == pVar.f15756l) {
            return;
        }
        pVar.f15756l = max2;
        pVar.f15757m = max2 + metric;
        boolean z5 = metric > ((long) (f6 / (refreshRate - 1.0f)));
        boolean z7 = z5 && metric > f15744o;
        Iterator it = pVar.f15751f.values().iterator();
        while (it.hasNext()) {
            long j6 = metric;
            long j10 = max;
            ((o) it.next()).b(max2, pVar.f15757m, j6, j10, z5, z7, refreshRate);
            max = j10;
            metric = j6;
        }
    }

    public final void b(String str) {
        if (this.f15752g) {
            ConcurrentHashMap concurrentHashMap = this.f15751f;
            if (str != null) {
                concurrentHashMap.remove(str);
            }
            WeakReference weakReference = this.f15750e;
            Window window = weakReference != null ? (Window) weakReference.get() : null;
            if (window == null || !concurrentHashMap.isEmpty()) {
                return;
            }
            new Handler(Looper.getMainLooper()).post(new l(this, window, 1));
        }
    }

    public final void c() {
        WeakReference weakReference = this.f15750e;
        Window window = weakReference != null ? (Window) weakReference.get() : null;
        if (window == null || !this.f15752g || this.f15751f.isEmpty() || this.f15749d == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new l(this, window, 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Window window = activity.getWindow();
        WeakReference weakReference = this.f15750e;
        if (weakReference == null || weakReference.get() != window) {
            this.f15750e = new WeakReference(window);
            c();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        new Handler(Looper.getMainLooper()).post(new l(this, activity.getWindow(), 1));
        WeakReference weakReference = this.f15750e;
        if (weakReference == null || weakReference.get() != activity.getWindow()) {
            return;
        }
        this.f15750e = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
