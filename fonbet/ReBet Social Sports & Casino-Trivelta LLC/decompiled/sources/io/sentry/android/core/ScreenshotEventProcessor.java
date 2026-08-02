package io.sentry.android.core;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import com.reactnativecommunity.clipboard.ClipboardModule;
import io.sentry.C4724b;
import io.sentry.C4733c3;
import io.sentry.EnumC4788n3;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes3.dex */
public final class ScreenshotEventProcessor implements io.sentry.D {

    /* renamed from: a, reason: collision with root package name */
    public final SentryAndroidOptions f50786a;

    /* renamed from: b, reason: collision with root package name */
    public final C4683i0 f50787b;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f50789d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f50790e = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public final io.sentry.android.core.internal.util.o f50788c = new io.sentry.android.core.internal.util.o(io.sentry.android.core.internal.util.h.b(), 2000, 3);

    public ScreenshotEventProcessor(SentryAndroidOptions sentryAndroidOptions, C4683i0 c4683i0, boolean z10) {
        this.f50786a = (SentryAndroidOptions) io.sentry.util.w.c(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f50787b = (C4683i0) io.sentry.util.w.c(c4683i0, "BuildInfoProvider is required");
        this.f50789d = z10;
        if (sentryAndroidOptions.isAttachScreenshot()) {
            io.sentry.util.n.a("Screenshot");
        }
    }

    public static /* synthetic */ void b(ScreenshotEventProcessor screenshotEventProcessor, AtomicReference atomicReference, Activity activity, CountDownLatch countDownLatch) {
        screenshotEventProcessor.getClass();
        try {
            atomicReference.set(screenshotEventProcessor.e(activity));
        } finally {
            countDownLatch.countDown();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0062  */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap c(Bitmap bitmap, io.sentry.android.replay.viewhierarchy.c cVar) {
        Bitmap bitmap2;
        Bitmap bitmap3;
        boolean z10 = false;
        try {
            try {
                io.sentry.android.replay.util.i iVar = new io.sentry.android.replay.util.i();
                try {
                    bitmap2 = bitmap.isMutable();
                } catch (Throwable th2) {
                    th = th2;
                    bitmap2 = bitmap;
                }
                try {
                    if (bitmap2 == 0) {
                        bitmap3 = bitmap.copy(Bitmap.Config.ARGB_8888, true);
                        if (bitmap3 == null) {
                            bitmap.recycle();
                            iVar.close();
                            return null;
                        }
                        z10 = true;
                    } else {
                        bitmap3 = bitmap;
                    }
                    iVar.w0(bitmap3, cVar, null);
                    if (z10 && !bitmap.isRecycled()) {
                        bitmap.recycle();
                    }
                    iVar.close();
                    return bitmap3;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        iVar.close();
                    } catch (Throwable th4) {
                        th.addSuppressed(th4);
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                bitmap2 = bitmap;
                this.f50786a.getLogger().b(EnumC4788n3.ERROR, "Failed to mask screenshot", th);
                if (0 != 0 && !bitmap2.isRecycled()) {
                    bitmap2.recycle();
                }
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
                return null;
            }
        } catch (Throwable th6) {
            th = th6;
            this.f50786a.getLogger().b(EnumC4788n3.ERROR, "Failed to mask screenshot", th);
            if (0 != 0) {
                bitmap2.recycle();
            }
            if (!bitmap.isRecycled()) {
            }
            return null;
        }
    }

    public final io.sentry.android.replay.viewhierarchy.c e(Activity activity) {
        try {
            View rootView = (activity.getWindow() == null || activity.getWindow().peekDecorView() == null || activity.getWindow().peekDecorView().getRootView() == null) ? null : activity.getWindow().peekDecorView().getRootView();
            if (rootView == null) {
                return null;
            }
            io.sentry.android.replay.viewhierarchy.c a10 = io.sentry.android.replay.viewhierarchy.c.f51833m.a(rootView, null, 0, this.f50786a.getScreenshot());
            io.sentry.android.replay.util.r.k(rootView, a10, this.f50786a.getScreenshot(), this.f50786a.getLogger(), null);
            return a10;
        } catch (Throwable th2) {
            this.f50786a.getLogger().b(EnumC4788n3.ERROR, "Failed to build view hierarchy", th2);
            return null;
        }
    }

    public final io.sentry.android.replay.viewhierarchy.c f(final Activity activity) {
        if (this.f50786a.getThreadChecker().a()) {
            return e(activity);
        }
        final AtomicReference atomicReference = new AtomicReference(null);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            activity.runOnUiThread(new Runnable() { // from class: io.sentry.android.core.V0
                @Override // java.lang.Runnable
                public final void run() {
                    ScreenshotEventProcessor.b(ScreenshotEventProcessor.this, atomicReference, activity, countDownLatch);
                }
            });
            if (countDownLatch.await(2000L, TimeUnit.MILLISECONDS)) {
                return (io.sentry.android.replay.viewhierarchy.c) atomicReference.get();
            }
            this.f50786a.getLogger().c(EnumC4788n3.WARNING, "Timed out waiting for view hierarchy capture on main thread", new Object[0]);
            return null;
        } catch (Throwable th2) {
            this.f50786a.getLogger().b(EnumC4788n3.ERROR, "Failed to capture view hierarchy", th2);
            return null;
        }
    }

    public final boolean g() {
        return !this.f50786a.getScreenshot().c().isEmpty() && this.f50789d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0096, code lost:
    
        if (r2 == null) goto L38;
     */
    @Override // io.sentry.D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C4733c3 k(C4733c3 c4733c3, io.sentry.J j10) {
        final Bitmap c10;
        if (c4733c3.z0()) {
            if (!this.f50786a.isAttachScreenshot()) {
                this.f50786a.getLogger().c(EnumC4788n3.DEBUG, "attachScreenshot is disabled.", new Object[0]);
                return c4733c3;
            }
            if (this.f50789d || this.f50786a.getScreenshot().c().isEmpty()) {
                Activity b10 = C4705r0.c().b();
                if (b10 != null && !io.sentry.util.l.g(j10)) {
                    boolean a10 = this.f50788c.a();
                    this.f50786a.getBeforeScreenshotCaptureCallback();
                    if (!a10 && (c10 = io.sentry.android.core.internal.util.x.c(b10, this.f50786a.getThreadChecker(), this.f50786a.getLogger(), this.f50787b)) != null) {
                        if (g()) {
                            io.sentry.android.replay.viewhierarchy.c f10 = f(b10);
                            if (f10 == null) {
                                c10.recycle();
                                return c4733c3;
                            }
                            c10 = c(c10, f10);
                        }
                        j10.o(C4724b.a(new Callable() { // from class: io.sentry.android.core.U0
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                byte[] d10;
                                d10 = io.sentry.android.core.internal.util.x.d(c10, ScreenshotEventProcessor.this.f50786a.getLogger());
                                return d10;
                            }
                        }, "screenshot.png", ClipboardModule.MIMETYPE_PNG, false));
                        j10.m("android:activity", b10);
                    }
                }
            } else if (!this.f50790e.getAndSet(true)) {
                this.f50786a.getLogger().c(EnumC4788n3.WARNING, "Screenshot masking requires sentry-android-replay module", new Object[0]);
                return c4733c3;
            }
        }
        return c4733c3;
    }

    @Override // io.sentry.D
    public io.sentry.protocol.B r(io.sentry.protocol.B b10, io.sentry.J j10) {
        return b10;
    }
}
