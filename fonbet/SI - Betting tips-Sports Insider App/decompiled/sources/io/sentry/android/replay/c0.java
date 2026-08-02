package io.sentry.android.replay;

import android.graphics.Point;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;
import io.sentry.b5;
import io.sentry.b6;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c0 implements g, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final b6 f15954a;

    /* renamed from: b, reason: collision with root package name */
    public final ReplayIntegration f15955b;

    /* renamed from: c, reason: collision with root package name */
    public final ReplayIntegration f15956c;

    /* renamed from: d, reason: collision with root package name */
    public final f3.b f15957d;

    /* renamed from: e, reason: collision with root package name */
    public final ScheduledExecutorService f15958e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f15959f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f15960g;

    /* renamed from: h, reason: collision with root package name */
    public final Point f15961h;

    /* renamed from: i, reason: collision with root package name */
    public final io.sentry.util.a f15962i;
    public final io.sentry.util.a j;

    /* renamed from: k, reason: collision with root package name */
    public final io.sentry.util.a f15963k;

    /* renamed from: l, reason: collision with root package name */
    public volatile z f15964l;

    /* renamed from: m, reason: collision with root package name */
    public volatile HandlerThread f15965m;

    /* renamed from: n, reason: collision with root package name */
    public volatile Handler f15966n;

    public c0(b6 options, ReplayIntegration replayIntegration, ReplayIntegration windowCallback, f3.b mainLooperHandler, io.sentry.android.replay.util.f replayExecutor) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(windowCallback, "windowCallback");
        Intrinsics.checkNotNullParameter(mainLooperHandler, "mainLooperHandler");
        Intrinsics.checkNotNullParameter(replayExecutor, "replayExecutor");
        this.f15954a = options;
        this.f15955b = replayIntegration;
        this.f15956c = windowCallback;
        this.f15957d = mainLooperHandler;
        this.f15958e = replayExecutor;
        this.f15959f = new AtomicBoolean(false);
        this.f15960g = new ArrayList();
        this.f15961h = new Point();
        this.f15962i = new io.sentry.util.a();
        this.j = new io.sentry.util.a();
        this.f15963k = new io.sentry.util.a();
    }

    @Override // io.sentry.android.replay.g
    public final void c(View root, boolean z5) {
        u uVar;
        u uVar2;
        u uVar3;
        Intrinsics.checkNotNullParameter(root, "root");
        io.sentry.r a7 = this.f15962i.a();
        try {
            if (!z5) {
                z zVar = this.f15964l;
                if (zVar != null && (uVar2 = (u) zVar.f16176d) != null) {
                    uVar2.c(root);
                }
                kotlin.collections.z.q(this.f15960g, new b0(0, root));
                WeakReference weakReference = (WeakReference) CollectionsKt.L(this.f15960g);
                View view = weakReference != null ? (View) weakReference.get() : null;
                if (view != null && !Intrinsics.areEqual(root, view)) {
                    z zVar2 = this.f15964l;
                    if (zVar2 != null && (uVar = (u) zVar2.f16176d) != null) {
                        uVar.a(view);
                    }
                    k(view);
                }
            } else {
                if (rh.g.r(root) == null) {
                    this.f15954a.getLogger().h(b5.WARNING, "Root view does not have a phone window, skipping.", new Object[0]);
                    u6.h.g(a7, null);
                    return;
                }
                this.f15960g.add(new WeakReference(root));
                z zVar3 = this.f15964l;
                if (zVar3 != null && (uVar3 = (u) zVar3.f16176d) != null) {
                    uVar3.a(root);
                }
                k(root);
            }
            Unit unit = Unit.f19194a;
            u6.h.g(a7, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                u6.h.g(a7, th2);
                throw th3;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        reset();
        f3.b bVar = this.f15957d;
        z zVar = this.f15964l;
        Handler handler = bVar.f9329a;
        if (zVar != null) {
            handler.removeCallbacks(zVar);
        }
        io.sentry.r a7 = this.f15963k.a();
        try {
            Handler handler2 = this.f15966n;
            if (handler2 != null) {
                handler2.removeCallbacksAndMessages(null);
            }
            HandlerThread handlerThread = this.f15965m;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            u6.h.g(a7, null);
            w();
        } finally {
        }
    }

    public final void k(View root) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(root, "<this>");
        if (root.getWidth() <= 0 || root.getHeight() <= 0) {
            a0 listener = new a0(this, root, 0);
            Intrinsics.checkNotNullParameter(listener, "listener");
            if (root.getViewTreeObserver() == null || !root.getViewTreeObserver().isAlive()) {
                return;
            }
            try {
                root.getViewTreeObserver().addOnPreDrawListener(listener);
                return;
            } catch (IllegalStateException unused) {
                return;
            }
        }
        int width = root.getWidth();
        Point point = this.f15961h;
        if (width == point.x || root.getHeight() == point.y) {
            return;
        }
        point.set(root.getWidth(), root.getHeight());
        this.f15956c.R(root.getWidth(), root.getHeight());
    }

    public final Handler n() {
        if (this.f15966n == null) {
            io.sentry.r a7 = this.f15963k.a();
            try {
                if (this.f15966n == null) {
                    this.f15965m = new HandlerThread("SentryReplayBackgroundProcessing");
                    HandlerThread handlerThread = this.f15965m;
                    if (handlerThread != null) {
                        handlerThread.start();
                    }
                    HandlerThread handlerThread2 = this.f15965m;
                    Intrinsics.checkNotNull(handlerThread2);
                    this.f15966n = new Handler(handlerThread2.getLooper());
                }
                Unit unit = Unit.f19194a;
                u6.h.g(a7, null);
            } finally {
            }
        }
        Handler handler = this.f15966n;
        Intrinsics.checkNotNull(handler);
        return handler;
    }

    public final void r() {
        z zVar = this.f15964l;
        if (zVar != null) {
            u uVar = (u) zVar.f16176d;
            if (uVar != null) {
                uVar.f16117c.set(false);
                WeakReference weakReference = uVar.f16116b;
                uVar.c(weakReference != null ? (View) weakReference.get() : null);
            }
            ((AtomicBoolean) zVar.f16178f).getAndSet(false);
        }
    }

    public final void reset() {
        u uVar;
        this.f15961h.set(0, 0);
        io.sentry.r a7 = this.f15962i.a();
        try {
            Iterator it = this.f15960g.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                z zVar = this.f15964l;
                if (zVar != null && (uVar = (u) zVar.f16176d) != null) {
                    uVar.c((View) weakReference.get());
                }
            }
            this.f15960g.clear();
            Unit unit = Unit.f19194a;
            u6.h.g(a7, null);
        } finally {
        }
    }

    public final void t() {
        View view;
        z runnable = this.f15964l;
        if (runnable != null) {
            f3.b bVar = (f3.b) runnable.f16175c;
            b6 b6Var = (b6) runnable.f16174b;
            if (b6Var.getSessionReplay().f16410l) {
                b6Var.getLogger().h(b5.DEBUG, "Resuming the capture runnable.", new Object[0]);
            }
            u uVar = (u) runnable.f16176d;
            if (uVar != null) {
                WeakReference weakReference = uVar.f16116b;
                if (weakReference != null && (view = (View) weakReference.get()) != null) {
                    com.google.firebase.messaging.u.a(view, uVar);
                }
                uVar.f16117c.set(true);
            }
            ((AtomicBoolean) runnable.f16178f).getAndSet(true);
            bVar.f9329a.removeCallbacks(runnable);
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            if (bVar.f9329a.post(runnable)) {
                return;
            }
            b6Var.getLogger().h(b5.WARNING, "Failed to post the capture runnable, main looper is not ready.", new Object[0]);
        }
    }

    public final void w() {
        z zVar = this.f15964l;
        if (zVar != null) {
            u uVar = (u) zVar.f16176d;
            if (uVar != null) {
                uVar.f16117c.set(false);
                WeakReference weakReference = uVar.f16116b;
                uVar.c(weakReference != null ? (View) weakReference.get() : null);
                WeakReference weakReference2 = uVar.f16116b;
                if (weakReference2 != null) {
                    weakReference2.clear();
                }
                uVar.f16119e.close();
            }
            zVar.f16176d = null;
            ((AtomicBoolean) zVar.f16178f).getAndSet(false);
        }
        io.sentry.r a7 = this.j.a();
        try {
            this.f15964l = null;
            Unit unit = Unit.f19194a;
            u6.h.g(a7, null);
            this.f15959f.set(false);
        } finally {
        }
    }
}
