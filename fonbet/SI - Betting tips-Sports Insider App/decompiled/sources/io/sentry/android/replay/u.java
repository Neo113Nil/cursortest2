package io.sentry.android.replay;

import android.view.View;
import android.view.ViewTreeObserver;
import io.sentry.b5;
import io.sentry.b6;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class u implements ViewTreeObserver.OnDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final b6 f16115a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f16116b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f16117c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f16118d;

    /* renamed from: e, reason: collision with root package name */
    public final io.sentry.android.replay.screenshot.h f16119e;

    public u(b6 options, ReplayIntegration replayIntegration, v config, c0 executorProvider) {
        io.sentry.android.replay.screenshot.h dVar;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(executorProvider, "executorProvider");
        this.f16115a = options;
        this.f16117c = new AtomicBoolean(true);
        io.sentry.android.replay.util.b bVar = new io.sentry.android.replay.util.b();
        this.f16118d = new AtomicBoolean(false);
        int i5 = t.$EnumSwitchMapping$0[options.getSessionReplay().f16411m.ordinal()];
        if (i5 == 1) {
            dVar = new io.sentry.android.replay.screenshot.d(options, replayIntegration, config, executorProvider);
        } else {
            if (i5 != 2) {
                throw new gf.m();
            }
            dVar = new io.sentry.android.replay.screenshot.g(executorProvider, replayIntegration, options, config, bVar);
        }
        this.f16119e = dVar;
    }

    public final void a(View root) {
        Intrinsics.checkNotNullParameter(root, "root");
        WeakReference weakReference = this.f16116b;
        c(weakReference != null ? (View) weakReference.get() : null);
        WeakReference weakReference2 = this.f16116b;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.f16116b = new WeakReference(root);
        com.google.firebase.messaging.u.a(root, this);
        this.f16118d.set(true);
        this.f16119e.onContentChanged();
    }

    public final void b() {
        b6 b6Var = this.f16115a;
        boolean z5 = b6Var.getSessionReplay().f16410l;
        AtomicBoolean atomicBoolean = this.f16117c;
        if (z5) {
            b6Var.getLogger().h(b5.DEBUG, "Capturing screenshot, isCapturing: %s", Boolean.valueOf(atomicBoolean.get()));
        }
        if (!atomicBoolean.get()) {
            if (b6Var.getSessionReplay().f16410l) {
                b6Var.getLogger().h(b5.DEBUG, "ScreenshotRecorder is paused, not capturing screenshot", new Object[0]);
                return;
            }
            return;
        }
        boolean z7 = b6Var.getSessionReplay().f16410l;
        io.sentry.android.replay.screenshot.h hVar = this.f16119e;
        AtomicBoolean atomicBoolean2 = this.f16118d;
        if (z7) {
            b6Var.getLogger().h(b5.DEBUG, "Capturing screenshot, contentChanged: %s, lastCaptureSuccessful: %s", Boolean.valueOf(atomicBoolean2.get()), Boolean.valueOf(hVar.a()));
        }
        if (!atomicBoolean2.get()) {
            hVar.c();
            return;
        }
        WeakReference weakReference = this.f16116b;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
            b6Var.getLogger().h(b5.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        if (rh.g.r(view) == null) {
            b6Var.getLogger().h(b5.DEBUG, "Window is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        try {
            atomicBoolean2.set(false);
            hVar.b(view);
        } catch (Throwable th2) {
            b6Var.getLogger().e(b5.WARNING, "Failed to capture replay recording", th2);
        }
    }

    public final void c(View view) {
        this.f16115a.getReplayController().getClass();
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
        if (this.f16117c.get()) {
            WeakReference weakReference = this.f16116b;
            View view = weakReference != null ? (View) weakReference.get() : null;
            if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
                this.f16115a.getLogger().h(b5.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
            } else {
                this.f16118d.set(true);
                this.f16119e.onContentChanged();
            }
        }
    }
}
