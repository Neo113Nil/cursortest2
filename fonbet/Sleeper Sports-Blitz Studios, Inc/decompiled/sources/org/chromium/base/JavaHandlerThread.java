package org.chromium.base;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import internal.org.jni_zero.JNINamespace;
import java.lang.Thread;

@JNINamespace("base::android")
/* loaded from: classes10.dex */
public class JavaHandlerThread {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final HandlerThread mThread;
    private Throwable mUnhandledException;

    interface Natives {
        void initializeThread(long nativeJavaHandlerThread, long nativeEvent);

        void onLooperStopped(long nativeJavaHandlerThread);
    }

    public JavaHandlerThread(String name, int priority) {
        this.mThread = new HandlerThread(name, priority);
    }

    private static JavaHandlerThread create(String name, int priority) {
        return new JavaHandlerThread(name, priority);
    }

    public Looper getLooper() {
        return this.mThread.getLooper();
    }

    public void maybeStart() {
        if (hasStarted()) {
            return;
        }
        this.mThread.start();
    }

    private void startAndInitialize(final long nativeThread, final long nativeEvent) {
        maybeStart();
        new Handler(this.mThread.getLooper()).post(new Runnable(this) { // from class: org.chromium.base.JavaHandlerThread.1
            final /* synthetic */ JavaHandlerThread this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                JavaHandlerThreadJni.get().initializeThread(nativeThread, nativeEvent);
            }
        });
    }

    private void quitThreadSafely(final long nativeThread) {
        new Handler(this.mThread.getLooper()).post(new Runnable(this) { // from class: org.chromium.base.JavaHandlerThread.2
            final /* synthetic */ JavaHandlerThread this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.this$0.mThread.quit();
                JavaHandlerThreadJni.get().onLooperStopped(nativeThread);
            }
        });
        this.mThread.getLooper().quitSafely();
    }

    private void joinThread() {
        boolean z = false;
        while (!z) {
            try {
                this.mThread.join();
                z = true;
            } catch (InterruptedException unused) {
            }
        }
    }

    private boolean hasStarted() {
        return this.mThread.getState() != Thread.State.NEW;
    }

    private boolean isAlive() {
        return this.mThread.isAlive();
    }

    private void listenForUncaughtExceptionsForTesting() {
        this.mThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: org.chromium.base.JavaHandlerThread.3
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread t, Throwable e) {
                JavaHandlerThread.this.mUnhandledException = e;
            }
        });
    }

    private Throwable getUncaughtExceptionIfAny() {
        return this.mUnhandledException;
    }
}
