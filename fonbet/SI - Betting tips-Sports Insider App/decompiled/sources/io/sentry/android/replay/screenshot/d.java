package io.sentry.android.replay.screenshot;

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
import androidx.appcompat.widget.c1;
import gf.k;
import gf.l;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.c0;
import io.sentry.android.replay.n;
import io.sentry.android.replay.v;
import io.sentry.b5;
import io.sentry.b6;
import io.sentry.r;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d implements h {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f16077a;

    /* renamed from: b, reason: collision with root package name */
    public final ReplayIntegration f16078b;

    /* renamed from: c, reason: collision with root package name */
    public final b6 f16079c;

    /* renamed from: d, reason: collision with root package name */
    public final v f16080d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Bitmap f16081e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f16082f;

    /* renamed from: g, reason: collision with root package name */
    public final io.sentry.util.a f16083g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f16084h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f16085i;
    public final i j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicBoolean f16086k;

    /* renamed from: l, reason: collision with root package name */
    public final SurfaceTexture f16087l;

    /* renamed from: m, reason: collision with root package name */
    public final Surface f16088m;

    /* renamed from: n, reason: collision with root package name */
    public final b f16089n;

    public d(b6 options, ReplayIntegration replayIntegration, v config, c0 executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f16077a = executor;
        this.f16078b = replayIntegration;
        this.f16079c = options;
        this.f16080d = config;
        this.f16082f = new AtomicReference(null);
        this.f16083g = new io.sentry.util.a();
        this.f16084h = k.a(l.f10028b, new n(2, this));
        this.f16085i = new AtomicBoolean(false);
        this.j = new i();
        this.f16086k = new AtomicBoolean(false);
        SurfaceTexture a7 = a.a();
        a7.setDefaultBufferSize(config.f16137a, config.f16138b);
        this.f16087l = a7;
        this.f16088m = new Surface(a7);
        rh.g.a("ReplayCanvasStrategy");
        this.f16089n = new b(this, 0);
    }

    public static void d(final d dVar) {
        if (dVar.f16086k.get()) {
            dVar.f16079c.getLogger().h(b5.DEBUG, "Canvas Strategy already closed, skipping picture render", new Object[0]);
            return;
        }
        Picture picture = (Picture) dVar.f16082f.getAndSet(null);
        if (picture == null) {
            return;
        }
        try {
            Canvas lockHardwareCanvas = dVar.f16088m.lockHardwareCanvas();
            try {
                lockHardwareCanvas.drawColor(-16777216, PorterDuff.Mode.CLEAR);
                picture.draw(lockHardwareCanvas);
                dVar.f16088m.unlockCanvasAndPost(lockHardwareCanvas);
                if (dVar.f16081e == null) {
                    r a7 = dVar.f16083g.a();
                    try {
                        if (dVar.f16081e == null) {
                            v vVar = dVar.f16080d;
                            dVar.f16081e = Bitmap.createBitmap(vVar.f16137a, vVar.f16138b, Bitmap.Config.ARGB_8888);
                        }
                        Unit unit = Unit.f19194a;
                        u6.h.g(a7, null);
                    } finally {
                    }
                }
                if (dVar.f16086k.get()) {
                    dVar.f16079c.getLogger().h(b5.DEBUG, "Canvas Strategy already closed, skipping pixel copy request", new Object[0]);
                    return;
                }
                Surface surface = dVar.f16088m;
                Bitmap bitmap = dVar.f16081e;
                Intrinsics.checkNotNull(bitmap);
                PixelCopy.request(surface, bitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: io.sentry.android.replay.screenshot.c
                    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                    public final void onPixelCopyFinished(int i5) {
                        d dVar2 = d.this;
                        if (dVar2.f16086k.get()) {
                            dVar2.f16079c.getLogger().h(b5.DEBUG, "CanvasStrategy is closed, ignoring capture result", new Object[0]);
                            return;
                        }
                        if (i5 != 0) {
                            dVar2.f16079c.getLogger().h(b5.ERROR, c1.i(i5, "Canvas Strategy: PixelCopy failed with code "), new Object[0]);
                            dVar2.f16085i.set(false);
                            return;
                        }
                        dVar2.f16085i.set(true);
                        Bitmap bitmap2 = dVar2.f16081e;
                        if (bitmap2 == null || bitmap2.isRecycled()) {
                            return;
                        }
                        dVar2.f16078b.O(bitmap2);
                    }
                }, dVar.f16077a.n());
            } catch (Throwable th2) {
                dVar.f16088m.unlockCanvasAndPost(lockHardwareCanvas);
                throw th2;
            }
        } catch (Throwable th3) {
            dVar.f16079c.getLogger().e(b5.ERROR, "Canvas Strategy: picture render failed", th3);
            dVar.f16085i.set(false);
        }
    }

    @Override // io.sentry.android.replay.screenshot.h
    public final boolean a() {
        return this.f16085i.get();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [gf.i, java.lang.Object] */
    @Override // io.sentry.android.replay.screenshot.h
    public final void b(View root) {
        Intrinsics.checkNotNullParameter(root, "root");
        AtomicBoolean atomicBoolean = this.f16086k;
        if (atomicBoolean.get()) {
            return;
        }
        Picture picture = new Picture();
        v vVar = this.f16080d;
        Canvas beginRecording = picture.beginRecording(vVar.f16137a, vVar.f16138b);
        Intrinsics.checkNotNullExpressionValue(beginRecording, "beginRecording(...)");
        i iVar = this.j;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(beginRecording, "<set-?>");
        iVar.f16107a = beginRecording;
        iVar.setMatrix((Matrix) this.f16084h.getValue());
        root.draw(iVar);
        picture.endRecording();
        if (atomicBoolean.get()) {
            return;
        }
        this.f16082f.set(picture);
        e(this.f16077a.n(), new io.sentry.android.replay.util.g(this.f16089n, "screenshot_recorder.canvas"));
    }

    @Override // io.sentry.android.replay.screenshot.h
    public final void c() {
        Bitmap bitmap;
        if (!this.f16085i.get() || (bitmap = this.f16081e) == null || bitmap.isRecycled()) {
            return;
        }
        this.f16078b.O(bitmap);
    }

    @Override // io.sentry.android.replay.screenshot.h
    public final void close() {
        this.f16086k.set(true);
        e(this.f16077a.n(), new io.sentry.android.replay.util.g(new b(this, 1), "CanvasStrategy.close"));
        this.f16082f.getAndSet(null);
    }

    public final void e(Handler handler, io.sentry.android.replay.util.g runnable) {
        Intrinsics.checkNotNullParameter(handler, "<this>");
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        try {
            handler.post(runnable);
        } catch (Throwable th2) {
            this.f16079c.getLogger().e(b5.ERROR, "Canvas Strategy: failed to post runnable " + runnable.f16133a, th2);
        }
    }

    @Override // io.sentry.android.replay.screenshot.h
    public final void onContentChanged() {
    }
}
