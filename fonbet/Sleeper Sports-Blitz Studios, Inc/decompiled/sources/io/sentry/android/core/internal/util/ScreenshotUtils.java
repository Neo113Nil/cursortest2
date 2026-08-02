package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.android.core.BuildInfoProvider;
import io.sentry.util.thread.IThreadChecker;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes9.dex */
public class ScreenshotUtils {
    private static final long CAPTURE_TIMEOUT_MS = 1000;

    public static byte[] takeScreenshot(Activity activity, ILogger iLogger, BuildInfoProvider buildInfoProvider) {
        return takeScreenshot(activity, AndroidThreadChecker.getInstance(), iLogger, buildInfoProvider);
    }

    public static byte[] takeScreenshot(Activity activity, IThreadChecker iThreadChecker, ILogger iLogger, BuildInfoProvider buildInfoProvider) {
        return compressBitmapToPng(captureScreenshot(activity, iThreadChecker, iLogger, buildInfoProvider), iLogger);
    }

    public static Bitmap captureScreenshot(Activity activity, ILogger iLogger, BuildInfoProvider buildInfoProvider) {
        return captureScreenshot(activity, AndroidThreadChecker.getInstance(), iLogger, buildInfoProvider);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ac A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap captureScreenshot(Activity activity, IThreadChecker iThreadChecker, final ILogger iLogger, BuildInfoProvider buildInfoProvider) {
        boolean z = false;
        if (!isActivityValid(activity)) {
            iLogger.log(SentryLevel.DEBUG, "Activity isn't valid, not taking screenshot.", new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            iLogger.log(SentryLevel.DEBUG, "Activity window is null, not taking screenshot.", new Object[0]);
            return null;
        }
        View peekDecorView = window.peekDecorView();
        if (peekDecorView == null) {
            iLogger.log(SentryLevel.DEBUG, "DecorView is null, not taking screenshot.", new Object[0]);
            return null;
        }
        final View rootView = peekDecorView.getRootView();
        if (rootView == null) {
            iLogger.log(SentryLevel.DEBUG, "Root view is null, not taking screenshot.", new Object[0]);
            return null;
        }
        if (rootView.getWidth() <= 0 || rootView.getHeight() <= 0) {
            iLogger.log(SentryLevel.DEBUG, "View's width and height is zeroed, not taking screenshot.", new Object[0]);
            return null;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(rootView.getWidth(), rootView.getHeight(), Bitmap.Config.ARGB_8888);
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            if (buildInfoProvider.getSdkInfoVersion() >= 26) {
                HandlerThread handlerThread = new HandlerThread("SentryScreenshot");
                handlerThread.start();
                try {
                    Handler handler = new Handler(handlerThread.getLooper());
                    final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                    PixelCopy.request(window, createBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: io.sentry.android.core.internal.util.ScreenshotUtils$$ExternalSyntheticLambda1
                        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                        public final void onPixelCopyFinished(int i) {
                            ScreenshotUtils.lambda$captureScreenshot$0(atomicBoolean, countDownLatch, i);
                        }
                    }, handler);
                    if (countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                        if (atomicBoolean.get()) {
                            z = true;
                        }
                    }
                } finally {
                    try {
                        if (z) {
                        }
                    } finally {
                    }
                }
                if (z) {
                    return null;
                }
            } else {
                final Canvas canvas = new Canvas(createBitmap);
                if (iThreadChecker.isMainThread()) {
                    rootView.draw(canvas);
                    countDownLatch.countDown();
                } else {
                    activity.runOnUiThread(new Runnable() { // from class: io.sentry.android.core.internal.util.ScreenshotUtils$$ExternalSyntheticLambda2
                        @Override // java.lang.Runnable
                        public final void run() {
                            ScreenshotUtils.lambda$captureScreenshot$1(rootView, canvas, iLogger, countDownLatch);
                        }
                    });
                }
                if (!countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                    return null;
                }
            }
            return createBitmap;
        } catch (Throwable th) {
            iLogger.log(SentryLevel.ERROR, "Taking screenshot failed.", th);
            return null;
        }
    }

    static /* synthetic */ void lambda$captureScreenshot$0(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch, int i) {
        atomicBoolean.set(i == 0);
        countDownLatch.countDown();
    }

    static /* synthetic */ void lambda$captureScreenshot$1(View view, Canvas canvas, ILogger iLogger, CountDownLatch countDownLatch) {
        try {
            view.draw(canvas);
        } catch (Throwable th) {
            try {
                iLogger.log(SentryLevel.ERROR, "Taking screenshot failed (view.draw).", th);
            } finally {
                countDownLatch.countDown();
            }
        }
    }

    public static byte[] compressBitmapToPng(Bitmap bitmap, ILogger iLogger) {
        if (bitmap != null && !bitmap.isRecycled()) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                    bitmap.recycle();
                    if (byteArrayOutputStream.size() <= 0) {
                        iLogger.log(SentryLevel.DEBUG, "Screenshot is 0 bytes, not attaching the image.", new Object[0]);
                        byteArrayOutputStream.close();
                        return null;
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                } finally {
                }
            } catch (Throwable th) {
                iLogger.log(SentryLevel.ERROR, "Compressing bitmap failed.", th);
            }
        }
        return null;
    }

    private static boolean isActivityValid(Activity activity) {
        return (activity.isFinishing() || activity.isDestroyed()) ? false : true;
    }
}
