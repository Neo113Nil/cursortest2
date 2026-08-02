package io.sentry.android.replay;

import android.view.View;
import android.view.ViewOverlay;
import android.view.ViewTreeObserver;
import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.Z1;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class q implements ViewTreeObserver.OnDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final s f51654a;

    /* renamed from: b, reason: collision with root package name */
    public final F3 f51655b;

    /* renamed from: c, reason: collision with root package name */
    public final io.sentry.android.replay.b f51656c;

    /* renamed from: d, reason: collision with root package name */
    public WeakReference f51657d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f51658e;

    /* renamed from: f, reason: collision with root package name */
    public final io.sentry.android.replay.util.c f51659f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f51660g;

    /* renamed from: h, reason: collision with root package name */
    public final io.sentry.android.replay.screenshot.n f51661h;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Z1.values().length];
            try {
                iArr[Z1.CANVAS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Z1.PIXEL_COPY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class b extends Lambda implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m137invoke();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m137invoke() {
            q.this.f51660g.set(true);
        }
    }

    public q(s config, F3 options, io.sentry.android.replay.b executorProvider, r rVar) {
        io.sentry.android.replay.screenshot.n eVar;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(executorProvider, "executorProvider");
        this.f51654a = config;
        this.f51655b = options;
        this.f51656c = executorProvider;
        this.f51658e = new AtomicBoolean(true);
        io.sentry.android.replay.util.c cVar = new io.sentry.android.replay.util.c();
        this.f51659f = cVar;
        this.f51660g = new AtomicBoolean(false);
        int i10 = a.$EnumSwitchMapping$0[options.getSessionReplay().w().ordinal()];
        if (i10 == 1) {
            eVar = new io.sentry.android.replay.screenshot.e(executorProvider, rVar, options, config);
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            eVar = new io.sentry.android.replay.screenshot.l(executorProvider, rVar, options, config, cVar, new b());
        }
        this.f51661h = eVar;
    }

    public final void b(View root) {
        Intrinsics.checkNotNullParameter(root, "root");
        WeakReference weakReference = this.f51657d;
        g(weakReference != null ? (View) weakReference.get() : null);
        WeakReference weakReference2 = this.f51657d;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.f51657d = new WeakReference(root);
        io.sentry.android.replay.util.r.a(root, this);
        this.f51660g.set(true);
        this.f51661h.onContentChanged();
    }

    public final void c() {
        if (this.f51655b.getSessionReplay().C()) {
            this.f51655b.getLogger().c(EnumC4788n3.DEBUG, "Capturing screenshot, isCapturing: %s", Boolean.valueOf(this.f51658e.get()));
        }
        if (!this.f51658e.get()) {
            if (this.f51655b.getSessionReplay().C()) {
                this.f51655b.getLogger().c(EnumC4788n3.DEBUG, "ScreenshotRecorder is paused, not capturing screenshot", new Object[0]);
                return;
            }
            return;
        }
        if (this.f51655b.getSessionReplay().C()) {
            this.f51655b.getLogger().c(EnumC4788n3.DEBUG, "Capturing screenshot, contentChanged: %s, lastCaptureSuccessful: %s", Boolean.valueOf(this.f51660g.get()), Boolean.valueOf(this.f51661h.a()));
        }
        if (!this.f51660g.get()) {
            this.f51661h.b();
            return;
        }
        WeakReference weakReference = this.f51657d;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
            this.f51655b.getLogger().c(EnumC4788n3.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        if (z.a(view) == null) {
            this.f51655b.getLogger().c(EnumC4788n3.DEBUG, "Window is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        try {
            this.f51660g.set(false);
            this.f51661h.c(view);
        } catch (Throwable th2) {
            this.f51655b.getLogger().b(EnumC4788n3.WARNING, "Failed to capture replay recording", th2);
        }
    }

    public final void d() {
        this.f51658e.set(false);
        WeakReference weakReference = this.f51657d;
        g(weakReference != null ? (View) weakReference.get() : null);
        WeakReference weakReference2 = this.f51657d;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.f51661h.close();
    }

    public final void e() {
        this.f51658e.set(false);
        WeakReference weakReference = this.f51657d;
        g(weakReference != null ? (View) weakReference.get() : null);
    }

    public final void f() {
        View view;
        WeakReference weakReference = this.f51657d;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            io.sentry.android.replay.util.r.a(view, this);
        }
        this.f51658e.set(true);
    }

    public final void g(View view) {
        ViewOverlay overlay;
        if (this.f51655b.getReplayController().m1() && view != null && (overlay = view.getOverlay()) != null) {
            overlay.remove(this.f51659f);
        }
        if (view != null) {
            io.sentry.android.replay.util.r.h(view, this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        if (this.f51658e.get()) {
            WeakReference weakReference = this.f51657d;
            View view = weakReference != null ? (View) weakReference.get() : null;
            if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
                this.f51655b.getLogger().c(EnumC4788n3.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
            } else {
                this.f51660g.set(true);
                this.f51661h.onContentChanged();
            }
        }
    }
}
