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
import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.InterfaceC4765j0;
import io.sentry.util.C4843a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class e implements n {

    /* renamed from: a, reason: collision with root package name */
    public final io.sentry.android.replay.b f51681a;

    /* renamed from: b, reason: collision with root package name */
    public final io.sentry.android.replay.r f51682b;

    /* renamed from: c, reason: collision with root package name */
    public final F3 f51683c;

    /* renamed from: d, reason: collision with root package name */
    public final io.sentry.android.replay.s f51684d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Bitmap f51685e;

    /* renamed from: f, reason: collision with root package name */
    public AtomicReference f51686f;

    /* renamed from: g, reason: collision with root package name */
    public final C4843a f51687g;

    /* renamed from: h, reason: collision with root package name */
    public final Lazy f51688h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f51689i;

    /* renamed from: j, reason: collision with root package name */
    public final B f51690j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicBoolean f51691k;

    /* renamed from: l, reason: collision with root package name */
    public final SurfaceTexture f51692l;

    /* renamed from: m, reason: collision with root package name */
    public final Surface f51693m;

    /* renamed from: n, reason: collision with root package name */
    public final Runnable f51694n;

    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Matrix invoke() {
            Matrix matrix = new Matrix();
            e eVar = e.this;
            matrix.preScale(eVar.f51684d.e(), eVar.f51684d.f());
            return matrix;
        }
    }

    public e(io.sentry.android.replay.b executor, io.sentry.android.replay.r rVar, F3 options, io.sentry.android.replay.s config) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f51681a = executor;
        this.f51682b = rVar;
        this.f51683c = options;
        this.f51684d = config;
        this.f51686f = new AtomicReference(null);
        this.f51687g = new C4843a();
        this.f51688h = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new a());
        this.f51689i = new AtomicBoolean(false);
        this.f51690j = new B();
        this.f51691k = new AtomicBoolean(false);
        SurfaceTexture a10 = AbstractC4722a.a(false);
        a10.setDefaultBufferSize(config.d(), config.c());
        this.f51692l = a10;
        this.f51693m = new Surface(a10);
        io.sentry.util.n.a("ReplayCanvasStrategy");
        this.f51694n = new Runnable() { // from class: io.sentry.android.replay.screenshot.b
            @Override // java.lang.Runnable
            public final void run() {
                e.j(e.this);
            }
        };
    }

    public static final void h(e eVar) {
        Bitmap bitmap = eVar.f51685e;
        if (bitmap != null) {
            synchronized (bitmap) {
                try {
                    if (!bitmap.isRecycled()) {
                        bitmap.recycle();
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        eVar.f51693m.release();
        eVar.f51692l.release();
    }

    public static final void j(final e eVar) {
        if (eVar.f51691k.get()) {
            eVar.f51683c.getLogger().c(EnumC4788n3.DEBUG, "Canvas Strategy already closed, skipping picture render", new Object[0]);
            return;
        }
        Picture picture = (Picture) eVar.f51686f.getAndSet(null);
        if (picture == null) {
            return;
        }
        try {
            Canvas lockHardwareCanvas = eVar.f51693m.lockHardwareCanvas();
            try {
                lockHardwareCanvas.drawColor(-16777216, PorterDuff.Mode.CLEAR);
                picture.draw(lockHardwareCanvas);
                eVar.f51693m.unlockCanvasAndPost(lockHardwareCanvas);
                if (eVar.f51685e == null) {
                    InterfaceC4765j0 d10 = eVar.f51687g.d();
                    try {
                        if (eVar.f51685e == null) {
                            eVar.f51685e = Bitmap.createBitmap(eVar.f51684d.d(), eVar.f51684d.c(), Bitmap.Config.ARGB_8888);
                        }
                        Unit unit = Unit.INSTANCE;
                        AutoCloseableKt.closeFinally(d10, null);
                    } finally {
                    }
                }
                if (eVar.f51691k.get()) {
                    eVar.f51683c.getLogger().c(EnumC4788n3.DEBUG, "Canvas Strategy already closed, skipping pixel copy request", new Object[0]);
                    return;
                }
                Surface surface = eVar.f51693m;
                Bitmap bitmap = eVar.f51685e;
                Intrinsics.checkNotNull(bitmap);
                PixelCopy.request(surface, bitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: io.sentry.android.replay.screenshot.d
                    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                    public final void onPixelCopyFinished(int i10) {
                        e.k(e.this, i10);
                    }
                }, eVar.f51681a.B());
            } catch (Throwable th2) {
                eVar.f51693m.unlockCanvasAndPost(lockHardwareCanvas);
                throw th2;
            }
        } catch (Throwable th3) {
            eVar.f51683c.getLogger().b(EnumC4788n3.ERROR, "Canvas Strategy: picture render failed", th3);
            eVar.f51689i.set(false);
        }
    }

    public static final void k(e eVar, int i10) {
        io.sentry.android.replay.r rVar;
        if (eVar.f51691k.get()) {
            eVar.f51683c.getLogger().c(EnumC4788n3.DEBUG, "CanvasStrategy is closed, ignoring capture result", new Object[0]);
            return;
        }
        if (i10 == 0) {
            eVar.f51689i.set(true);
            Bitmap bitmap = eVar.f51685e;
            if (bitmap == null || bitmap.isRecycled() || (rVar = eVar.f51682b) == null) {
                return;
            }
            rVar.w0(bitmap);
            return;
        }
        eVar.f51683c.getLogger().c(EnumC4788n3.ERROR, "Canvas Strategy: PixelCopy failed with code " + i10, new Object[0]);
        eVar.f51689i.set(false);
    }

    @Override // io.sentry.android.replay.screenshot.n
    public boolean a() {
        return this.f51689i.get();
    }

    @Override // io.sentry.android.replay.screenshot.n
    public void b() {
        Bitmap bitmap;
        io.sentry.android.replay.r rVar;
        if (!a() || (bitmap = this.f51685e) == null || bitmap.isRecycled() || (rVar = this.f51682b) == null) {
            return;
        }
        rVar.w0(bitmap);
    }

    @Override // io.sentry.android.replay.screenshot.n
    public void c(View root) {
        Intrinsics.checkNotNullParameter(root, "root");
        if (this.f51691k.get()) {
            return;
        }
        Picture picture = new Picture();
        Canvas beginRecording = picture.beginRecording(this.f51684d.d(), this.f51684d.c());
        Intrinsics.checkNotNullExpressionValue(beginRecording, "beginRecording(...)");
        this.f51690j.e(beginRecording);
        this.f51690j.setMatrix(i());
        root.draw(this.f51690j);
        picture.endRecording();
        if (this.f51691k.get()) {
            return;
        }
        this.f51686f.set(picture);
        l(this.f51681a.B(), new io.sentry.android.replay.util.m("screenshot_recorder.canvas", this.f51694n));
    }

    @Override // io.sentry.android.replay.screenshot.n
    public void close() {
        this.f51691k.set(true);
        l(this.f51681a.B(), new io.sentry.android.replay.util.m("CanvasStrategy.close", new Runnable() { // from class: io.sentry.android.replay.screenshot.c
            @Override // java.lang.Runnable
            public final void run() {
                e.h(e.this);
            }
        }));
        this.f51686f.getAndSet(null);
    }

    public final Matrix i() {
        return (Matrix) this.f51688h.getValue();
    }

    public final void l(Handler handler, io.sentry.android.replay.util.m runnable) {
        Intrinsics.checkNotNullParameter(handler, "<this>");
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        try {
            handler.post(runnable);
        } catch (Throwable th2) {
            this.f51683c.getLogger().b(EnumC4788n3.ERROR, "Canvas Strategy: failed to post runnable " + runnable.a(), th2);
        }
    }

    @Override // io.sentry.android.replay.screenshot.n
    public void onContentChanged() {
    }
}
