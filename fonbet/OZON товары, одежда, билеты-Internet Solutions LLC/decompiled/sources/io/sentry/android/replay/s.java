package io.sentry.android.replay;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewTreeObserver;
import io.sentry.C1;
import io.sentry.I2;
import io.sentry.W2;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@SuppressLint({"UseKtx", "UseRequiresApi"})
@TargetApi(TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER)
/* loaded from: classes10.dex */
public final class s implements ViewTreeObserver.OnDrawListener {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final W2 f67609a;

    /* renamed from: b, reason: collision with root package name */
    private WeakReference<View> f67610b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f67611c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f67612d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final io.sentry.android.replay.screenshot.g f67613e;

    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f67614a;

        static {
            int[] iArr = new int[C1.values().length];
            try {
                iArr[C1.CANVAS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C1.PIXEL_COPY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f67614a = iArr;
        }
    }

    public s(@NotNull W2 options, ReplayIntegration replayIntegration, @NotNull t config, @NotNull x executorProvider) {
        io.sentry.android.replay.screenshot.g cVar;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(executorProvider, "executorProvider");
        this.f67609a = options;
        this.f67611c = new AtomicBoolean(true);
        io.sentry.android.replay.util.c cVar2 = new io.sentry.android.replay.util.c();
        this.f67612d = new AtomicBoolean(false);
        int i11 = a.f67614a[options.getSessionReplay().p().ordinal()];
        if (i11 == 1) {
            cVar = new io.sentry.android.replay.screenshot.c(options, replayIntegration, config, executorProvider);
        } else {
            if (i11 != 2) {
                throw new Sc.o();
            }
            cVar = new io.sentry.android.replay.screenshot.f(executorProvider, replayIntegration, options, config, cVar2);
        }
        this.f67613e = cVar;
    }

    public final void a(@NotNull View root) {
        Intrinsics.checkNotNullParameter(root, "root");
        WeakReference<View> weakReference = this.f67610b;
        f(weakReference != null ? weakReference.get() : null);
        WeakReference<View> weakReference2 = this.f67610b;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.f67610b = new WeakReference<>(root);
        io.sentry.android.replay.util.n.a(root, this);
        this.f67612d.set(true);
        this.f67613e.onContentChanged();
    }

    public final void b() {
        W2 w22 = this.f67609a;
        boolean u11 = w22.getSessionReplay().u();
        AtomicBoolean atomicBoolean = this.f67611c;
        if (u11) {
            w22.getLogger().c(I2.DEBUG, "Capturing screenshot, isCapturing: %s", Boolean.valueOf(atomicBoolean.get()));
        }
        if (!atomicBoolean.get()) {
            if (w22.getSessionReplay().u()) {
                w22.getLogger().c(I2.DEBUG, "ScreenshotRecorder is paused, not capturing screenshot", new Object[0]);
                return;
            }
            return;
        }
        boolean u12 = w22.getSessionReplay().u();
        AtomicBoolean atomicBoolean2 = this.f67612d;
        io.sentry.android.replay.screenshot.g gVar = this.f67613e;
        if (u12) {
            w22.getLogger().c(I2.DEBUG, "Capturing screenshot, contentChanged: %s, lastCaptureSuccessful: %s", Boolean.valueOf(atomicBoolean2.get()), Boolean.valueOf(gVar.b()));
        }
        if (!atomicBoolean2.get()) {
            gVar.c();
            return;
        }
        WeakReference<View> weakReference = this.f67610b;
        View view = weakReference != null ? weakReference.get() : null;
        if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
            w22.getLogger().c(I2.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        if (z.a(view) == null) {
            w22.getLogger().c(I2.DEBUG, "Window is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        try {
            atomicBoolean2.set(false);
            gVar.a(view);
        } catch (Throwable th2) {
            w22.getLogger().a(I2.WARNING, "Failed to capture replay recording", th2);
        }
    }

    public final void c() {
        this.f67611c.set(false);
        WeakReference<View> weakReference = this.f67610b;
        f(weakReference != null ? weakReference.get() : null);
        WeakReference<View> weakReference2 = this.f67610b;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.f67613e.close();
    }

    public final void d() {
        this.f67611c.set(false);
        WeakReference<View> weakReference = this.f67610b;
        f(weakReference != null ? weakReference.get() : null);
    }

    public final void e() {
        View view;
        WeakReference<View> weakReference = this.f67610b;
        if (weakReference != null && (view = weakReference.get()) != null) {
            io.sentry.android.replay.util.n.a(view, this);
        }
        this.f67611c.set(true);
    }

    public final void f(View view) {
        this.f67609a.getReplayController().getClass();
        if (view != null) {
            Intrinsics.checkNotNullParameter(this, "listener");
            if (view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
                return;
            }
            try {
                view.getViewTreeObserver().removeOnDrawListener(this);
            } catch (IllegalStateException unused) {
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        if (this.f67611c.get()) {
            WeakReference<View> weakReference = this.f67610b;
            View view = weakReference != null ? weakReference.get() : null;
            if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
                this.f67609a.getLogger().c(I2.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
            } else {
                this.f67612d.set(true);
                this.f67613e.onContentChanged();
            }
        }
    }
}
