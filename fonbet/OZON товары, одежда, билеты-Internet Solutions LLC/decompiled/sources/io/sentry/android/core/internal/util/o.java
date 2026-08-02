package io.sentry.android.core.internal.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import io.sentry.I2;
import io.sentry.ILogger;
import io.sentry.android.core.I;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class o {
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a8 A[RETURN] */
    @SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap a(@NotNull Activity activity, @NotNull ILogger iLogger, @NotNull I i11) {
        boolean z11 = false;
        if (activity.isFinishing() || activity.isDestroyed()) {
            iLogger.c(I2.DEBUG, "Activity isn't valid, not taking screenshot.", new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            iLogger.c(I2.DEBUG, "Activity window is null, not taking screenshot.", new Object[0]);
            return null;
        }
        View peekDecorView = window.peekDecorView();
        if (peekDecorView == null) {
            iLogger.c(I2.DEBUG, "DecorView is null, not taking screenshot.", new Object[0]);
            return null;
        }
        View rootView = peekDecorView.getRootView();
        if (rootView == null) {
            iLogger.c(I2.DEBUG, "Root view is null, not taking screenshot.", new Object[0]);
            return null;
        }
        if (rootView.getWidth() <= 0 || rootView.getHeight() <= 0) {
            iLogger.c(I2.DEBUG, "View's width and height is zeroed, not taking screenshot.", new Object[0]);
            return null;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(rootView.getWidth(), rootView.getHeight(), Bitmap.Config.ARGB_8888);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            i11.getClass();
            HandlerThread handlerThread = new HandlerThread("SentryScreenshot");
            handlerThread.start();
            try {
                Handler handler = new Handler(handlerThread.getLooper());
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                PixelCopy.request(window, createBitmap, new Kg0.c(1, atomicBoolean, countDownLatch), handler);
                if (countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                    if (atomicBoolean.get()) {
                        z11 = true;
                    }
                }
            } finally {
                try {
                    if (z11) {
                    }
                } finally {
                }
            }
            if (z11) {
                return null;
            }
            return createBitmap;
        } catch (Throwable th2) {
            iLogger.a(I2.ERROR, "Taking screenshot failed.", th2);
            return null;
        }
    }

    public static byte[] b(Bitmap bitmap, @NotNull ILogger iLogger) {
        if (bitmap.isRecycled()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                bitmap.recycle();
                if (byteArrayOutputStream.size() <= 0) {
                    iLogger.c(I2.DEBUG, "Screenshot is 0 bytes, not attaching the image.", new Object[0]);
                    byteArrayOutputStream.close();
                    return null;
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (Throwable th2) {
            iLogger.a(I2.ERROR, "Compressing bitmap failed.", th2);
            return null;
        }
    }
}
