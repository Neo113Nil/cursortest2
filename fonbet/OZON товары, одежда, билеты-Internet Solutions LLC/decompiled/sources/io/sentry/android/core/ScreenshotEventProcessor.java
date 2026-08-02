package io.sentry.android.core;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import io.sentry.C7125b;
import io.sentry.C7230z2;
import io.sentry.I2;
import io.sentry.ILogger;
import io.sentry.InterfaceC7227z;
import io.sentry.android.replay.viewhierarchy.b;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class ScreenshotEventProcessor implements InterfaceC7227z {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final SentryAndroidOptions f66970a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final I f66971b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final io.sentry.android.core.internal.util.g f66972c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f66973d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f66974e = new AtomicBoolean(false);

    public ScreenshotEventProcessor(@NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull I i11, boolean z11) {
        io.sentry.util.p.b(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f66970a = sentryAndroidOptions;
        this.f66971b = i11;
        this.f66972c = new io.sentry.android.core.internal.util.g(io.sentry.android.core.internal.util.b.a(), 2000L, 3);
        this.f66973d = z11;
        if (sentryAndroidOptions.isAttachScreenshot()) {
            io.sentry.util.j.a("Screenshot");
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

    private io.sentry.android.replay.viewhierarchy.b e(@NotNull Activity activity) {
        SentryAndroidOptions sentryAndroidOptions = this.f66970a;
        try {
            View rootView = (activity.getWindow() == null || activity.getWindow().peekDecorView() == null || activity.getWindow().peekDecorView().getRootView() == null) ? null : activity.getWindow().peekDecorView().getRootView();
            if (rootView == null) {
                return null;
            }
            io.sentry.android.replay.viewhierarchy.b a11 = b.a.a(rootView, null, sentryAndroidOptions.getScreenshot());
            io.sentry.android.replay.util.n.c(rootView, a11, sentryAndroidOptions.getScreenshot(), sentryAndroidOptions.getLogger());
            return a11;
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().a(I2.ERROR, "Failed to build view hierarchy", th2);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0141, code lost:
    
        if (r5 == null) goto L87;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013d  */
    /* JADX WARN: Type inference failed for: r8v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // io.sentry.InterfaceC7227z
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C7230z2 d(@NotNull C7230z2 c7230z2, @NotNull io.sentry.E e11) {
        Object obj;
        io.sentry.android.replay.viewhierarchy.b bVar;
        TimeUnit timeUnit;
        Bitmap bitmap;
        io.sentry.android.replay.util.g gVar;
        Bitmap bitmap2;
        if (c7230z2.w0()) {
            SentryAndroidOptions sentryAndroidOptions = this.f66970a;
            boolean z11 = false;
            if (!sentryAndroidOptions.isAttachScreenshot()) {
                sentryAndroidOptions.getLogger().c(I2.DEBUG, "attachScreenshot is disabled.", new Object[0]);
                return c7230z2;
            }
            boolean z12 = this.f66973d;
            if (z12 || sentryAndroidOptions.getScreenshot().b().isEmpty()) {
                final Activity b11 = L.c().b();
                if (b11 != null && !io.sentry.util.h.c(e11)) {
                    boolean a11 = this.f66972c.a();
                    sentryAndroidOptions.getBeforeScreenshotCaptureCallback();
                    if (!a11) {
                        sentryAndroidOptions.getThreadChecker();
                        Bitmap a12 = io.sentry.android.core.internal.util.o.a(b11, sentryAndroidOptions.getLogger(), this.f66971b);
                        if (a12 != null) {
                            if (!sentryAndroidOptions.getScreenshot().b().isEmpty() && z12) {
                                if (sentryAndroidOptions.getThreadChecker().a()) {
                                    bVar = e(b11);
                                } else {
                                    final AtomicReference atomicReference = new AtomicReference(null);
                                    final CountDownLatch countDownLatch = new CountDownLatch(1);
                                    try {
                                        b11.runOnUiThread(new Runnable() { // from class: io.sentry.android.core.h0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                Activity activity = b11;
                                                CountDownLatch countDownLatch2 = countDownLatch;
                                                ScreenshotEventProcessor.b(ScreenshotEventProcessor.this, atomicReference, activity, countDownLatch2);
                                            }
                                        });
                                        timeUnit = TimeUnit.MILLISECONDS;
                                    } catch (Throwable th2) {
                                        ILogger logger = sentryAndroidOptions.getLogger();
                                        I2 i22 = I2.ERROR;
                                        logger.a(i22, "Failed to capture view hierarchy", th2);
                                        obj = i22;
                                    }
                                    if (countDownLatch.await(2000L, timeUnit)) {
                                        bVar = (io.sentry.android.replay.viewhierarchy.b) atomicReference.get();
                                        bitmap = timeUnit;
                                    } else {
                                        sentryAndroidOptions.getLogger().c(I2.WARNING, "Timed out waiting for view hierarchy capture on main thread", new Object[0]);
                                        obj = "Timed out waiting for view hierarchy capture on main thread";
                                        bVar = null;
                                        bitmap = obj;
                                    }
                                }
                                if (bVar == null) {
                                    a12.recycle();
                                    return c7230z2;
                                }
                                try {
                                    try {
                                        gVar = new io.sentry.android.replay.util.g();
                                        try {
                                            bitmap = a12.isMutable();
                                            try {
                                            } catch (Throwable th3) {
                                                th = th3;
                                                try {
                                                    gVar.close();
                                                } catch (Throwable th4) {
                                                    th.addSuppressed(th4);
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            bitmap = a12;
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        sentryAndroidOptions.getLogger().a(I2.ERROR, "Failed to mask screenshot", th);
                                        if (0 != 0 && !bitmap.isRecycled()) {
                                            bitmap.recycle();
                                        }
                                        if (!a12.isRecycled()) {
                                            a12.recycle();
                                        }
                                        a12 = null;
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    bitmap = a12;
                                    sentryAndroidOptions.getLogger().a(I2.ERROR, "Failed to mask screenshot", th);
                                    if (0 != 0) {
                                        bitmap.recycle();
                                    }
                                    if (!a12.isRecycled()) {
                                    }
                                    a12 = null;
                                }
                                if (bitmap == 0) {
                                    bitmap2 = a12.copy(Bitmap.Config.ARGB_8888, true);
                                    if (bitmap2 == null) {
                                        a12.recycle();
                                        gVar.close();
                                        a12 = null;
                                    } else {
                                        z11 = true;
                                    }
                                } else {
                                    bitmap2 = a12;
                                }
                                gVar.k(bitmap2, bVar, null);
                                if (z11 && !a12.isRecycled()) {
                                    a12.recycle();
                                }
                                gVar.close();
                                a12 = bitmap2;
                            }
                            e11.m(C7125b.a(new g0(this, a12)));
                            e11.k(b11, "android:activity");
                        }
                    }
                }
            } else if (!this.f66974e.getAndSet(true)) {
                sentryAndroidOptions.getLogger().c(I2.WARNING, "Screenshot masking requires sentry-android-replay module", new Object[0]);
                return c7230z2;
            }
        }
        return c7230z2;
    }

    @Override // io.sentry.InterfaceC7227z
    @NotNull
    public final io.sentry.protocol.A j(@NotNull io.sentry.protocol.A a11, @NotNull io.sentry.E e11) {
        return a11;
    }
}
