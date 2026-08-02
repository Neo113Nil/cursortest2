package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Choreographer;
import android.view.Display;
import android.view.FrameMetrics;
import android.view.Window;
import io.sentry.EnumC4788n3;
import io.sentry.ILogger;
import io.sentry.InterfaceC4765j0;
import io.sentry.T3;
import io.sentry.android.core.AbstractC4704q0;
import io.sentry.android.core.C4683i0;
import io.sentry.android.core.e1;
import io.sentry.util.C4843a;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class E implements Application.ActivityLifecycleCallbacks {

    /* renamed from: p, reason: collision with root package name */
    public static final long f51091p = TimeUnit.SECONDS.toNanos(1);

    /* renamed from: q, reason: collision with root package name */
    public static final long f51092q = TimeUnit.MILLISECONDS.toNanos(700);

    /* renamed from: a, reason: collision with root package name */
    public final C4683i0 f51093a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f51094b;

    /* renamed from: c, reason: collision with root package name */
    public final ILogger f51095c;

    /* renamed from: d, reason: collision with root package name */
    public volatile Handler f51096d;

    /* renamed from: e, reason: collision with root package name */
    public final C4843a f51097e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f51098f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f51099g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f51100h;

    /* renamed from: i, reason: collision with root package name */
    public final d f51101i;

    /* renamed from: j, reason: collision with root package name */
    public Window.OnFrameMetricsAvailableListener f51102j;

    /* renamed from: k, reason: collision with root package name */
    public Choreographer f51103k;

    /* renamed from: l, reason: collision with root package name */
    public Field f51104l;

    /* renamed from: m, reason: collision with root package name */
    public long f51105m;

    /* renamed from: n, reason: collision with root package name */
    public long f51106n;

    /* renamed from: o, reason: collision with root package name */
    public final ConcurrentSkipListSet f51107o;

    public class a implements d {
    }

    public static class b implements Comparable {

        /* renamed from: a, reason: collision with root package name */
        public final long f51108a;

        /* renamed from: b, reason: collision with root package name */
        public final long f51109b;

        /* renamed from: c, reason: collision with root package name */
        public final long f51110c;

        public b(long j10) {
            this(j10, j10, 0L);
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            int compare = Long.compare(this.f51109b, bVar.f51109b);
            return compare != 0 ? compare : Long.compare(this.f51108a, bVar.f51108a);
        }

        public b(long j10, long j11, long j12) {
            this.f51108a = j10;
            this.f51109b = j11;
            this.f51110c = j12;
        }
    }

    public interface c {
        void e(long j10, long j11, long j12, long j13, boolean z10, boolean z11, float f10);
    }

    public interface d {
        default void a(Window window, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener, Handler handler) {
            if (onFrameMetricsAvailableListener == null) {
                return;
            }
            window.addOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener, handler);
        }

        default void b(Window window, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener) {
            if (onFrameMetricsAvailableListener == null) {
                return;
            }
            window.removeOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener);
        }
    }

    public E(Context context, ILogger iLogger, C4683i0 c4683i0) {
        this(context, iLogger, c4683i0, new a());
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00af A[LOOP:0: B:22:0x00a9->B:24:0x00af, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(E e10, C4683i0 c4683i0, Window window, FrameMetrics frameMetrics, int i10) {
        float refreshRate;
        long j10;
        Iterator it;
        Display display;
        e10.getClass();
        long nanoTime = System.nanoTime();
        if (c4683i0.d() >= 30) {
            display = window.getContext().getDisplay();
            refreshRate = display.getRefreshRate();
        } else {
            refreshRate = window.getWindowManager().getDefaultDisplay().getRefreshRate();
        }
        float f10 = refreshRate;
        float f11 = f51091p;
        long g10 = e10.g(frameMetrics);
        long max = Math.max(0L, g10 - ((long) (f11 / f10)));
        long h10 = e10.h(frameMetrics);
        if (h10 < 0) {
            h10 = nanoTime - g10;
        }
        long max2 = Math.max(h10, e10.f51106n);
        if (max2 == e10.f51105m) {
            return;
        }
        e10.f51105m = max2;
        e10.f51106n = max2 + g10;
        boolean l10 = l(g10, (long) (f11 / (f10 - 1.0f)));
        boolean z10 = l10 && k(g10);
        if (max > 0) {
            e10.m(e10.f51106n);
            if (e10.f51107o.size() < 3600) {
                j10 = max2;
                e10.f51107o.add(new b(j10, e10.f51106n, max));
                it = e10.f51099g.values().iterator();
                while (it.hasNext()) {
                    ((c) it.next()).e(j10, e10.f51106n, g10, max, l10, z10, f10);
                }
            }
        }
        j10 = max2;
        it = e10.f51099g.values().iterator();
        while (it.hasNext()) {
        }
    }

    public static /* synthetic */ void c(E e10, Window window) {
        if (e10.f51094b.add(window)) {
            try {
                e10.f51101i.a(window, e10.f51102j, e10.f51096d);
            } catch (Throwable th2) {
                e10.f51095c.b(EnumC4788n3.ERROR, "Failed to add frameMetricsAvailableListener", th2);
            }
        }
    }

    public static /* synthetic */ void d(E e10, Window window) {
        e10.getClass();
        try {
            if (e10.f51094b.remove(window)) {
                e10.f51101i.b(window, e10.f51102j);
            }
        } catch (Throwable th2) {
            e10.f51095c.b(EnumC4788n3.ERROR, "Failed to remove frameMetricsAvailableListener", th2);
        }
    }

    public static /* synthetic */ void e(E e10, ILogger iLogger) {
        e10.getClass();
        try {
            e10.f51103k = Choreographer.getInstance();
        } catch (Throwable th2) {
            iLogger.b(EnumC4788n3.ERROR, "Error retrieving Choreographer instance. Slow and frozen frames will not be reported.", th2);
        }
    }

    public static boolean k(long j10) {
        return j10 > f51092q;
    }

    public static boolean l(long j10, long j11) {
        return j10 > j11;
    }

    public final void f() {
        if (this.f51096d != null) {
            return;
        }
        InterfaceC4765j0 d10 = this.f51097e.d();
        try {
            if (this.f51096d == null) {
                HandlerThread handlerThread = new HandlerThread("io.sentry.android.core.internal.util.SentryFrameMetricsCollector");
                handlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: io.sentry.android.core.internal.util.D
                    @Override // java.lang.Thread.UncaughtExceptionHandler
                    public final void uncaughtException(Thread thread, Throwable th2) {
                        E.this.f51095c.b(EnumC4788n3.ERROR, "Error during frames measurements.", th2);
                    }
                });
                handlerThread.start();
                this.f51096d = new Handler(handlerThread.getLooper());
            }
            if (d10 != null) {
                d10.close();
            }
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public final long g(FrameMetrics frameMetrics) {
        return frameMetrics.getMetric(0) + frameMetrics.getMetric(1) + frameMetrics.getMetric(2) + frameMetrics.getMetric(3) + frameMetrics.getMetric(4) + frameMetrics.getMetric(5);
    }

    public final long h(FrameMetrics frameMetrics) {
        return this.f51093a.d() >= 26 ? frameMetrics.getMetric(10) : j();
    }

    public e1 i(long j10, long j11) {
        int i10 = 0;
        if (!this.f51100h) {
            return new e1(-1.0d, 0);
        }
        if (j11 <= j10) {
            return new e1(-1.0d, 0);
        }
        long j12 = 0;
        if (!this.f51107o.isEmpty()) {
            for (b bVar : this.f51107o.tailSet((ConcurrentSkipListSet) new b(j10))) {
                if (bVar.f51108a >= j11) {
                    break;
                }
                long j13 = bVar.f51109b;
                long max = Math.max(j13 - bVar.f51110c, j10);
                long min = Math.min(j13, j11);
                if (min > max) {
                    j12 += min - max;
                    i10++;
                }
            }
        }
        return new e1(j12 / 1.0E9d, i10);
    }

    public long j() {
        Field field;
        Choreographer choreographer = this.f51103k;
        if (choreographer == null || (field = this.f51104l) == null) {
            return -1L;
        }
        try {
            Long l10 = (Long) field.get(choreographer);
            if (l10 != null) {
                return l10.longValue();
            }
            return -1L;
        } catch (IllegalAccessException unused) {
            return -1L;
        }
    }

    public final void m(long j10) {
        this.f51107o.headSet((ConcurrentSkipListSet) new b(j10 - 300000000000L)).clear();
    }

    public final void n(Window window) {
        WeakReference weakReference = this.f51098f;
        if (weakReference == null || weakReference.get() != window) {
            this.f51098f = new WeakReference(window);
            r();
        }
    }

    public String o(c cVar) {
        if (!this.f51100h) {
            return null;
        }
        f();
        String a10 = T3.a();
        this.f51099g.put(a10, cVar);
        r();
        return a10;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        n(activity.getWindow());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        q(activity.getWindow());
        WeakReference weakReference = this.f51098f;
        if (weakReference == null || weakReference.get() != activity.getWindow()) {
            return;
        }
        this.f51098f = null;
    }

    public void p(String str) {
        if (this.f51100h) {
            if (str != null) {
                this.f51099g.remove(str);
            }
            WeakReference weakReference = this.f51098f;
            Window window = weakReference != null ? (Window) weakReference.get() : null;
            if (window == null || !this.f51099g.isEmpty()) {
                return;
            }
            q(window);
        }
    }

    public final void q(final Window window) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.internal.util.A
            @Override // java.lang.Runnable
            public final void run() {
                E.d(E.this, window);
            }
        });
    }

    public final void r() {
        WeakReference weakReference = this.f51098f;
        final Window window = weakReference != null ? (Window) weakReference.get() : null;
        if (window == null || !this.f51100h || this.f51099g.isEmpty() || this.f51096d == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.internal.util.z
            @Override // java.lang.Runnable
            public final void run() {
                E.c(E.this, window);
            }
        });
    }

    public E(Context context, final ILogger iLogger, final C4683i0 c4683i0, d dVar) {
        this.f51094b = new CopyOnWriteArraySet();
        this.f51097e = new C4843a();
        this.f51099g = new ConcurrentHashMap();
        this.f51100h = false;
        this.f51105m = 0L;
        this.f51106n = 0L;
        this.f51107o = new ConcurrentSkipListSet();
        Context context2 = (Context) io.sentry.util.w.c(AbstractC4704q0.g(context), "The context is required");
        this.f51095c = (ILogger) io.sentry.util.w.c(iLogger, "Logger is required");
        this.f51093a = (C4683i0) io.sentry.util.w.c(c4683i0, "BuildInfoProvider is required");
        this.f51101i = (d) io.sentry.util.w.c(dVar, "WindowFrameMetricsManager is required");
        if ((context2 instanceof Application) && c4683i0.d() >= 24) {
            this.f51100h = true;
            ((Application) context2).registerActivityLifecycleCallbacks(this);
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.internal.util.B
                @Override // java.lang.Runnable
                public final void run() {
                    E.e(E.this, iLogger);
                }
            });
            try {
                Field declaredField = Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
                this.f51104l = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                iLogger.b(EnumC4788n3.ERROR, "Unable to get the frame timestamp from the choreographer: ", e10);
            }
            this.f51102j = new Window.OnFrameMetricsAvailableListener() { // from class: io.sentry.android.core.internal.util.C
                @Override // android.view.Window.OnFrameMetricsAvailableListener
                public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i10) {
                    E.a(E.this, c4683i0, window, frameMetrics, i10);
                }
            };
        }
    }
}
