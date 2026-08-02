package io.sentry.android.replay.screenshot;

import B90.l0;
import Sc.k;
import Sc.n;
import W.d0;
import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import io.sentry.I2;
import io.sentry.ILogger;
import io.sentry.W2;
import io.sentry.Y2;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.t;
import io.sentry.android.replay.viewhierarchy.b;
import io.sentry.android.replay.x;
import io.sentry.android.replay.z;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@SuppressLint({"UseKtx"})
/* loaded from: classes10.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    private final ReplayIntegration f67634a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final W2 f67635b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final t f67636c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ScheduledExecutorService f67637d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final io.sentry.android.replay.util.f f67638e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Bitmap f67639f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Object f67640g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f67641h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final io.sentry.android.replay.util.g f67642i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f67643j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f67644k;

    public f(@NotNull x executorProvider, ReplayIntegration replayIntegration, @NotNull W2 options, @NotNull t config, @NotNull io.sentry.android.replay.util.c debugOverlayDrawable) {
        Intrinsics.checkNotNullParameter(executorProvider, "executorProvider");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(debugOverlayDrawable, "debugOverlayDrawable");
        this.f67634a = replayIntegration;
        this.f67635b = options;
        this.f67636c = config;
        this.f67637d = executorProvider.p();
        this.f67638e = executorProvider.q();
        Bitmap createBitmap = Bitmap.createBitmap(config.d(), config.c(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        this.f67639f = createBitmap;
        this.f67640g = k.a(n.NONE, new e(this));
        this.f67641h = new AtomicBoolean(false);
        this.f67642i = new io.sentry.android.replay.util.g();
        this.f67643j = new AtomicBoolean(false);
        this.f67644k = new AtomicBoolean(false);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [Sc.j, java.lang.Object] */
    public static void d(f fVar, io.sentry.android.replay.viewhierarchy.b bVar, View view) {
        boolean z11 = fVar.f67644k.get();
        W2 w22 = fVar.f67635b;
        if (!z11) {
            Bitmap bitmap = fVar.f67639f;
            if (!bitmap.isRecycled()) {
                fVar.f67642i.k(bitmap, bVar, (Matrix) fVar.f67640g.getValue());
                w22.getReplayController().getClass();
                fVar.f67634a.v(bitmap);
                fVar.f67641h.set(true);
                fVar.f67643j.set(false);
                return;
            }
        }
        w22.getLogger().c(I2.DEBUG, "PixelCopyStrategy is closed, skipping masking", new Object[0]);
    }

    public static void e(f fVar, View view, int i11) {
        boolean z11 = fVar.f67644k.get();
        W2 w22 = fVar.f67635b;
        if (z11) {
            w22.getLogger().c(I2.DEBUG, "PixelCopyStrategy is closed, ignoring capture result", new Object[0]);
            return;
        }
        AtomicBoolean atomicBoolean = fVar.f67641h;
        if (i11 != 0) {
            w22.getLogger().c(I2.INFO, "Failed to capture replay recording: %d", Integer.valueOf(i11));
            atomicBoolean.set(false);
            return;
        }
        if (fVar.f67643j.get()) {
            w22.getLogger().c(I2.INFO, "Failed to determine view hierarchy, not capturing", new Object[0]);
            atomicBoolean.set(false);
            return;
        }
        Y2 sessionReplay = w22.getSessionReplay();
        Intrinsics.checkNotNullExpressionValue(sessionReplay, "getSessionReplay(...)");
        io.sentry.android.replay.viewhierarchy.b a11 = b.a.a(view, null, sessionReplay);
        Y2 sessionReplay2 = w22.getSessionReplay();
        Intrinsics.checkNotNullExpressionValue(sessionReplay2, "getSessionReplay(...)");
        ILogger logger = w22.getLogger();
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(...)");
        io.sentry.android.replay.util.n.c(view, a11, sessionReplay2, logger);
        fVar.f67637d.submit(new io.sentry.android.replay.util.i(new d0(fVar, a11, view, 1), "screenshot_recorder.mask"));
    }

    public static void f(f fVar) {
        if (!fVar.f67639f.isRecycled()) {
            synchronized (fVar.f67639f) {
                try {
                    if (!fVar.f67639f.isRecycled()) {
                        fVar.f67639f.recycle();
                    }
                    Unit unit = Unit.f71690a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        fVar.f67642i.close();
    }

    @Override // io.sentry.android.replay.screenshot.g
    @SuppressLint({"NewApi"})
    public final void a(@NotNull final View root) {
        Intrinsics.checkNotNullParameter(root, "root");
        Window a11 = z.a(root);
        W2 w22 = this.f67635b;
        if (a11 == null) {
            w22.getLogger().c(I2.DEBUG, "Window is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        if (this.f67644k.get()) {
            w22.getLogger().c(I2.DEBUG, "PixelCopyStrategy is closed, not capturing screenshot", new Object[0]);
            return;
        }
        try {
            this.f67643j.set(false);
            PixelCopy.request(a11, this.f67639f, new PixelCopy.OnPixelCopyFinishedListener() { // from class: io.sentry.android.replay.screenshot.d
                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                public final void onPixelCopyFinished(int i11) {
                    f.e(f.this, root, i11);
                }
            }, this.f67638e.a());
        } catch (Throwable th2) {
            w22.getLogger().a(I2.WARNING, "Failed to capture replay recording", th2);
            this.f67641h.set(false);
        }
    }

    @Override // io.sentry.android.replay.screenshot.g
    public final boolean b() {
        return this.f67641h.get();
    }

    @Override // io.sentry.android.replay.screenshot.g
    public final void c() {
        if (this.f67641h.get()) {
            Bitmap bitmap = this.f67639f;
            if (bitmap.isRecycled()) {
                return;
            }
            this.f67634a.v(bitmap);
        }
    }

    @Override // io.sentry.android.replay.screenshot.g
    public final void close() {
        this.f67644k.set(true);
        this.f67637d.submit(new io.sentry.android.replay.util.i(new l0(this, 5), "PixelCopyStrategy.close"));
    }

    @Override // io.sentry.android.replay.screenshot.g
    public final void onContentChanged() {
        this.f67643j.set(true);
    }
}
