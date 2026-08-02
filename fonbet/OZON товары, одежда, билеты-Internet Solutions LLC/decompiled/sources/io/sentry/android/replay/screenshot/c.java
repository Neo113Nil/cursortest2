package io.sentry.android.replay.screenshot;

import B90.i0;
import Ej.n;
import Sc.k;
import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.View;
import io.sentry.I2;
import io.sentry.InterfaceC7097a0;
import io.sentry.W2;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.t;
import io.sentry.android.replay.x;
import io.sentry.util.j;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@SuppressLint({"NewApi", "UseKtx"})
/* loaded from: classes10.dex */
public final class c implements g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final x f67617a;

    /* renamed from: b, reason: collision with root package name */
    private final ReplayIntegration f67618b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final W2 f67619c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final t f67620d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Bitmap f67621e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private AtomicReference<Picture> f67622f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f67623g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final Object f67624h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f67625i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final i f67626j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f67627k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final SurfaceTexture f67628l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final Surface f67629m;

    /* renamed from: n, reason: collision with root package name */
    @SuppressLint({"NewApi"})
    @NotNull
    private final n f67630n;

    public c(@NotNull W2 options, ReplayIntegration replayIntegration, @NotNull t config, @NotNull x executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f67617a = executor;
        this.f67618b = replayIntegration;
        this.f67619c = options;
        this.f67620d = config;
        this.f67622f = new AtomicReference<>(null);
        this.f67623g = new io.sentry.util.a();
        this.f67624h = k.a(Sc.n.NONE, new b(this));
        this.f67625i = new AtomicBoolean(false);
        this.f67626j = new i();
        this.f67627k = new AtomicBoolean(false);
        SurfaceTexture surfaceTexture = new SurfaceTexture(false);
        surfaceTexture.setDefaultBufferSize(config.d(), config.c());
        this.f67628l = surfaceTexture;
        this.f67629m = new Surface(surfaceTexture);
        j.a("ReplayCanvasStrategy");
        this.f67630n = new n(this, 4);
    }

    public static void d(c cVar) {
        Bitmap bitmap = cVar.f67621e;
        if (bitmap != null) {
            synchronized (bitmap) {
                try {
                    if (!bitmap.isRecycled()) {
                        bitmap.recycle();
                    }
                    Unit unit = Unit.f71690a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        cVar.f67629m.release();
        cVar.f67628l.release();
    }

    public static void e(c cVar, int i11) {
        if (cVar.f67627k.get()) {
            cVar.f67619c.getLogger().c(I2.DEBUG, "CanvasStrategy is closed, ignoring capture result", new Object[0]);
            return;
        }
        if (i11 != 0) {
            cVar.f67619c.getLogger().c(I2.ERROR, Ej.b.a(i11, "Canvas Strategy: PixelCopy failed with code "), new Object[0]);
            cVar.f67625i.set(false);
            return;
        }
        cVar.f67625i.set(true);
        Bitmap bitmap = cVar.f67621e;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        cVar.f67618b.v(bitmap);
    }

    public static void f(final c cVar) {
        if (cVar.f67627k.get()) {
            cVar.f67619c.getLogger().c(I2.DEBUG, "Canvas Strategy already closed, skipping picture render", new Object[0]);
            return;
        }
        Picture andSet = cVar.f67622f.getAndSet(null);
        if (andSet == null) {
            return;
        }
        try {
            Canvas lockHardwareCanvas = cVar.f67629m.lockHardwareCanvas();
            try {
                lockHardwareCanvas.drawColor(-16777216, PorterDuff.Mode.CLEAR);
                andSet.draw(lockHardwareCanvas);
                cVar.f67629m.unlockCanvasAndPost(lockHardwareCanvas);
                if (cVar.f67621e == null) {
                    InterfaceC7097a0 a11 = cVar.f67623g.a();
                    try {
                        if (cVar.f67621e == null) {
                            cVar.f67621e = Bitmap.createBitmap(cVar.f67620d.d(), cVar.f67620d.c(), Bitmap.Config.ARGB_8888);
                        }
                        Unit unit = Unit.f71690a;
                        a11.close();
                    } finally {
                    }
                }
                if (cVar.f67627k.get()) {
                    cVar.f67619c.getLogger().c(I2.DEBUG, "Canvas Strategy already closed, skipping pixel copy request", new Object[0]);
                    return;
                }
                Surface surface = cVar.f67629m;
                Bitmap bitmap = cVar.f67621e;
                Intrinsics.f(bitmap);
                PixelCopy.request(surface, bitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: io.sentry.android.replay.screenshot.a
                    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                    public final void onPixelCopyFinished(int i11) {
                        c.e(c.this, i11);
                    }
                }, cVar.f67617a.o());
            } catch (Throwable th2) {
                cVar.f67629m.unlockCanvasAndPost(lockHardwareCanvas);
                throw th2;
            }
        } catch (Throwable th3) {
            cVar.f67619c.getLogger().a(I2.ERROR, "Canvas Strategy: picture render failed", th3);
            cVar.f67625i.set(false);
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [Sc.j, java.lang.Object] */
    @Override // io.sentry.android.replay.screenshot.g
    @SuppressLint({"NewApi"})
    public final void a(@NotNull View root) {
        Intrinsics.checkNotNullParameter(root, "root");
        AtomicBoolean atomicBoolean = this.f67627k;
        if (atomicBoolean.get()) {
            return;
        }
        Picture picture = new Picture();
        t tVar = this.f67620d;
        Canvas beginRecording = picture.beginRecording(tVar.d(), tVar.c());
        Intrinsics.checkNotNullExpressionValue(beginRecording, "beginRecording(...)");
        i iVar = this.f67626j;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(beginRecording, "<set-?>");
        iVar.f67645a = beginRecording;
        iVar.setMatrix((Matrix) this.f67624h.getValue());
        root.draw(iVar);
        picture.endRecording();
        if (atomicBoolean.get()) {
            return;
        }
        this.f67622f.set(picture);
        h(this.f67617a.o(), new io.sentry.android.replay.util.i(this.f67630n, "screenshot_recorder.canvas"));
    }

    @Override // io.sentry.android.replay.screenshot.g
    public final boolean b() {
        return this.f67625i.get();
    }

    @Override // io.sentry.android.replay.screenshot.g
    public final void c() {
        Bitmap bitmap;
        if (!this.f67625i.get() || (bitmap = this.f67621e) == null || bitmap.isRecycled()) {
            return;
        }
        this.f67618b.v(bitmap);
    }

    @Override // io.sentry.android.replay.screenshot.g
    public final void close() {
        this.f67627k.set(true);
        h(this.f67617a.o(), new io.sentry.android.replay.util.i(new i0(this, 3), "CanvasStrategy.close"));
        this.f67622f.getAndSet(null);
    }

    public final void h(@NotNull Handler handler, @NotNull io.sentry.android.replay.util.i runnable) {
        Intrinsics.checkNotNullParameter(handler, "<this>");
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        try {
            handler.post(runnable);
        } catch (Throwable th2) {
            this.f67619c.getLogger().a(I2.ERROR, "Canvas Strategy: failed to post runnable " + runnable.a(), th2);
        }
    }

    @Override // io.sentry.android.replay.screenshot.g
    public final void onContentChanged() {
    }
}
