package org.chromium.base;

import android.os.Handler;
import android.os.HandlerThread;
import internal.J.N;
import internal.org.jni_zero.CalledByNative;
import java.lang.Thread;

/* loaded from: classes10.dex */
public final class JavaHandlerThread {

    /* renamed from: a, reason: collision with root package name */
    private final HandlerThread f78507a;

    /* renamed from: b, reason: collision with root package name */
    private Throwable f78508b;

    final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f78509a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f78510b;

        a(long j11, long j12) {
            this.f78509a = j11;
            this.f78510b = j12;
        }

        @Override // java.lang.Runnable
        public final void run() {
            new h();
            N.MJcct7gJ(this.f78509a, this.f78510b);
        }
    }

    final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f78511a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JavaHandlerThread f78512b;

        b(JavaHandlerThread javaHandlerThread, long j11) {
            this.f78511a = j11;
            this.f78512b = javaHandlerThread;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f78512b.f78507a.quit();
            new h();
            N.MYwg$x8E(this.f78511a);
        }
    }

    final class c implements Thread.UncaughtExceptionHandler {
        c() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(Thread thread, Throwable th2) {
            JavaHandlerThread.this.f78508b = th2;
        }
    }

    public JavaHandlerThread(String str, int i11) {
        this.f78507a = new HandlerThread(str, i11);
    }

    @CalledByNative
    private static JavaHandlerThread create(String str, int i11) {
        return new JavaHandlerThread(str, i11);
    }

    @CalledByNative
    private Throwable getUncaughtExceptionIfAny() {
        return this.f78508b;
    }

    @CalledByNative
    private boolean isAlive() {
        return this.f78507a.isAlive();
    }

    @CalledByNative
    private void joinThread() {
        boolean z11 = false;
        while (!z11) {
            try {
                this.f78507a.join();
                z11 = true;
            } catch (InterruptedException unused) {
            }
        }
    }

    @CalledByNative
    private void listenForUncaughtExceptionsForTesting() {
        this.f78507a.setUncaughtExceptionHandler(new c());
    }

    @CalledByNative
    private void quitThreadSafely(long j11) {
        HandlerThread handlerThread = this.f78507a;
        new Handler(handlerThread.getLooper()).post(new b(this, j11));
        handlerThread.getLooper().quitSafely();
    }

    @CalledByNative
    private void startAndInitialize(long j11, long j12) {
        HandlerThread handlerThread = this.f78507a;
        if (handlerThread.getState() == Thread.State.NEW) {
            handlerThread.start();
        }
        new Handler(handlerThread.getLooper()).post(new a(j11, j12));
    }
}
