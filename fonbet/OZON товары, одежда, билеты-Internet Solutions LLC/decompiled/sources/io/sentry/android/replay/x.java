package io.sentry.android.replay;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Point;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;
import android.view.ViewTreeObserver;
import io.sentry.I2;
import io.sentry.ILogger;
import io.sentry.InterfaceC7097a0;
import io.sentry.W2;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.C;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@SuppressLint({"UseRequiresApi"})
@TargetApi(TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER)
/* loaded from: classes10.dex */
public final class x implements Closeable, f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final W2 f67731a;

    /* renamed from: b, reason: collision with root package name */
    private final ReplayIntegration f67732b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ReplayIntegration f67733c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final io.sentry.android.replay.util.f f67734d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final io.sentry.android.replay.util.h f67735e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f67736f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final ArrayList<WeakReference<View>> f67737g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private Point f67738h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f67739i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f67740j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f67741k;

    /* renamed from: l, reason: collision with root package name */
    private volatile a f67742l;

    /* renamed from: m, reason: collision with root package name */
    private volatile HandlerThread f67743m;

    /* renamed from: n, reason: collision with root package name */
    private volatile Handler f67744n;

    private static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final W2 f67745a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final io.sentry.android.replay.util.f f67746b;

        /* renamed from: c, reason: collision with root package name */
        private s f67747c;

        /* renamed from: d, reason: collision with root package name */
        private t f67748d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private final AtomicBoolean f67749e;

        public a(@NotNull W2 options, @NotNull io.sentry.android.replay.util.f mainLooperHandler) {
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(mainLooperHandler, "mainLooperHandler");
            this.f67745a = options;
            this.f67746b = mainLooperHandler;
            this.f67749e = new AtomicBoolean(true);
        }

        public final s a() {
            return this.f67747c;
        }

        public final void b() {
            s sVar = this.f67747c;
            if (sVar != null) {
                sVar.d();
            }
            this.f67749e.getAndSet(false);
        }

        public final void c() {
            W2 w22 = this.f67745a;
            if (w22.getSessionReplay().u()) {
                w22.getLogger().c(I2.DEBUG, "Resuming the capture runnable.", new Object[0]);
            }
            s sVar = this.f67747c;
            if (sVar != null) {
                sVar.e();
            }
            this.f67749e.getAndSet(true);
            io.sentry.android.replay.util.f fVar = this.f67746b;
            fVar.d(this);
            if (fVar.b(this)) {
                return;
            }
            w22.getLogger().c(I2.WARNING, "Failed to post the capture runnable, main looper is not ready.", new Object[0]);
        }

        public final void d(t tVar) {
            this.f67748d = tVar;
        }

        public final void e(s sVar) {
            this.f67747c = sVar;
        }

        public final void f() {
            s sVar = this.f67747c;
            if (sVar != null) {
                sVar.c();
            }
            this.f67747c = null;
            this.f67749e.getAndSet(false);
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z11 = this.f67749e.get();
            W2 w22 = this.f67745a;
            if (!z11) {
                if (w22.getSessionReplay().u()) {
                    w22.getLogger().c(I2.DEBUG, "Not capturing frames, recording is not running.", new Object[0]);
                    return;
                }
                return;
            }
            try {
                if (w22.getSessionReplay().u()) {
                    w22.getLogger().c(I2.DEBUG, "Capturing a frame.", new Object[0]);
                }
                s sVar = this.f67747c;
                if (sVar != null) {
                    sVar.b();
                }
            } catch (Throwable th2) {
                w22.getLogger().a(I2.ERROR, "Failed to capture a frame", th2);
            }
            if (w22.getSessionReplay().u()) {
                ILogger logger = w22.getLogger();
                I2 i22 = I2.DEBUG;
                StringBuilder sb2 = new StringBuilder("Posting the capture runnable again, frame rate is ");
                t tVar = this.f67748d;
                logger.c(i22, K00.b.e(tVar != null ? tVar.b() : 1, " fps.", sb2), new Object[0]);
            }
            if (this.f67746b.c(this, 1000 / (this.f67748d != null ? r0.b() : 1))) {
                return;
            }
            w22.getLogger().c(I2.WARNING, "Failed to post the capture runnable, main looper is shutting down.", new Object[0]);
        }
    }

    public static final class b implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f67751b;

        b(View view) {
            this.f67751b = view;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            x xVar = x.this;
            WeakReference weakReference = (WeakReference) C7714v.Z(xVar.f67737g);
            View view = weakReference != null ? (View) weakReference.get() : null;
            View view2 = this.f67751b;
            if (!Intrinsics.d(view2, view)) {
                io.sentry.android.replay.util.n.b(view2, this);
                return true;
            }
            Intrinsics.checkNotNullParameter(view2, "<this>");
            if (view2.getWidth() > 0 && view2.getHeight() > 0) {
                io.sentry.android.replay.util.n.b(view2, this);
                if (view2.getWidth() != xVar.f67738h.x && view2.getHeight() != xVar.f67738h.y) {
                    xVar.f67738h.set(view2.getWidth(), view2.getHeight());
                    ((ReplayIntegration) xVar.f67733c).x(view2.getWidth(), view2.getHeight());
                }
            }
            return true;
        }
    }

    static final class c extends AbstractC7737t implements Function1<WeakReference<View>, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f67752b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(View view) {
            super(1);
            this.f67752b = view;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(WeakReference<View> weakReference) {
            WeakReference<View> it = weakReference;
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(Intrinsics.d(it.get(), this.f67752b));
        }
    }

    public x(@NotNull W2 options, ReplayIntegration replayIntegration, @NotNull ReplayIntegration windowCallback, @NotNull io.sentry.android.replay.util.f mainLooperHandler, @NotNull io.sentry.android.replay.util.h replayExecutor) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(windowCallback, "windowCallback");
        Intrinsics.checkNotNullParameter(mainLooperHandler, "mainLooperHandler");
        Intrinsics.checkNotNullParameter(replayExecutor, "replayExecutor");
        this.f67731a = options;
        this.f67732b = replayIntegration;
        this.f67733c = windowCallback;
        this.f67734d = mainLooperHandler;
        this.f67735e = replayExecutor;
        this.f67736f = new AtomicBoolean(false);
        this.f67737g = new ArrayList<>();
        this.f67738h = new Point();
        this.f67739i = new io.sentry.util.a();
        this.f67740j = new io.sentry.util.a();
        this.f67741k = new io.sentry.util.a();
    }

    @Override // io.sentry.android.replay.f
    public final void c(@NotNull View root, boolean z11) {
        s a11;
        s a12;
        s a13;
        Intrinsics.checkNotNullParameter(root, "root");
        InterfaceC7097a0 a14 = this.f67739i.a();
        try {
            if (!z11) {
                a aVar = this.f67742l;
                if (aVar != null && (a12 = aVar.a()) != null) {
                    a12.f(root);
                }
                C.h(this.f67737g, new c(root));
                WeakReference weakReference = (WeakReference) C7714v.Z(this.f67737g);
                View view = weakReference != null ? (View) weakReference.get() : null;
                if (view != null && !Intrinsics.d(root, view)) {
                    a aVar2 = this.f67742l;
                    if (aVar2 != null && (a11 = aVar2.a()) != null) {
                        a11.a(view);
                    }
                    m(view);
                }
            } else {
                if (z.a(root) == null) {
                    this.f67731a.getLogger().c(I2.WARNING, "Root view does not have a phone window, skipping.", new Object[0]);
                    a14.close();
                    return;
                }
                this.f67737g.add(new WeakReference<>(root));
                a aVar3 = this.f67742l;
                if (aVar3 != null && (a13 = aVar3.a()) != null) {
                    a13.a(root);
                }
                m(root);
            }
            Unit unit = Unit.f71690a;
            a14.close();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                Jb.j.e(a14, th2);
                throw th3;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        t();
        this.f67734d.d(this.f67742l);
        InterfaceC7097a0 a11 = this.f67741k.a();
        try {
            Handler handler = this.f67744n;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            HandlerThread handlerThread = this.f67743m;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            a11.close();
            x();
        } finally {
        }
    }

    public final void m(@NotNull View root) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(root, "<this>");
        if (root.getWidth() <= 0 || root.getHeight() <= 0) {
            b listener = new b(root);
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
        Point point = this.f67738h;
        if (width == point.x || root.getHeight() == point.y) {
            return;
        }
        point.set(root.getWidth(), root.getHeight());
        this.f67733c.x(root.getWidth(), root.getHeight());
    }

    @NotNull
    public final Handler o() {
        if (this.f67744n == null) {
            InterfaceC7097a0 a11 = this.f67741k.a();
            try {
                if (this.f67744n == null) {
                    this.f67743m = new HandlerThread("SentryReplayBackgroundProcessing");
                    HandlerThread handlerThread = this.f67743m;
                    if (handlerThread != null) {
                        handlerThread.start();
                    }
                    HandlerThread handlerThread2 = this.f67743m;
                    Intrinsics.f(handlerThread2);
                    this.f67744n = new Handler(handlerThread2.getLooper());
                }
                Unit unit = Unit.f71690a;
                a11.close();
            } finally {
            }
        }
        Handler handler = this.f67744n;
        Intrinsics.f(handler);
        return handler;
    }

    @NotNull
    public final ScheduledExecutorService p() {
        return this.f67735e;
    }

    @NotNull
    public final io.sentry.android.replay.util.f q() {
        return this.f67734d;
    }

    public final void r(@NotNull t config) {
        a aVar;
        s a11;
        Intrinsics.checkNotNullParameter(config, "config");
        if (this.f67736f.get()) {
            if (this.f67742l == null) {
                InterfaceC7097a0 a12 = this.f67740j.a();
                try {
                    if (this.f67742l == null) {
                        this.f67742l = new a(this.f67731a, this.f67734d);
                    }
                    Unit unit = Unit.f71690a;
                    a12.close();
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        Jb.j.e(a12, th2);
                        throw th3;
                    }
                }
            }
            a aVar2 = this.f67742l;
            if (aVar2 != null) {
                aVar2.d(config);
            }
            a aVar3 = this.f67742l;
            if (aVar3 != null) {
                aVar3.e(new s(this.f67731a, this.f67732b, config, this));
            }
            WeakReference weakReference = (WeakReference) C7714v.Z(this.f67737g);
            View view = weakReference != null ? (View) weakReference.get() : null;
            if (view != null && (aVar = this.f67742l) != null && (a11 = aVar.a()) != null) {
                a11.a(view);
            }
            this.f67734d.d(this.f67742l);
            if (this.f67734d.c(this.f67742l, 100L)) {
                return;
            }
            this.f67731a.getLogger().c(I2.WARNING, "Failed to post the capture runnable, main looper is shutting down.", new Object[0]);
        }
    }

    public final void s() {
        a aVar = this.f67742l;
        if (aVar != null) {
            aVar.b();
        }
    }

    public final void t() {
        s a11;
        this.f67738h.set(0, 0);
        InterfaceC7097a0 a12 = this.f67739i.a();
        try {
            Iterator<T> it = this.f67737g.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                a aVar = this.f67742l;
                if (aVar != null && (a11 = aVar.a()) != null) {
                    a11.f((View) weakReference.get());
                }
            }
            this.f67737g.clear();
            Unit unit = Unit.f71690a;
            a12.close();
        } finally {
        }
    }

    public final void v() {
        a aVar = this.f67742l;
        if (aVar != null) {
            aVar.c();
        }
    }

    public final void w() {
        this.f67736f.getAndSet(true);
    }

    public final void x() {
        a aVar = this.f67742l;
        if (aVar != null) {
            aVar.f();
        }
        InterfaceC7097a0 a11 = this.f67740j.a();
        try {
            this.f67742l = null;
            Unit unit = Unit.f71690a;
            a11.close();
            this.f67736f.set(false);
        } finally {
        }
    }
}
