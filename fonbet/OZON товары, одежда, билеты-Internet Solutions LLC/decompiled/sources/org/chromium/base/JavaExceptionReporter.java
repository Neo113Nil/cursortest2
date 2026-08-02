package org.chromium.base;

import android.os.DeadSystemException;
import internal.J.N;
import internal.org.jni_zero.CalledByNative;
import java.lang.Thread;
import org.chromium.base.JniAndroid;

/* loaded from: classes10.dex */
public final class JavaExceptionReporter implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f78504a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f78505b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f78506c;

    private JavaExceptionReporter(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, boolean z11) {
        this.f78504a = uncaughtExceptionHandler;
        this.f78505b = z11;
    }

    @CalledByNative
    private static void installHandler(boolean z11) {
        Thread.setDefaultUncaughtExceptionHandler(new JavaExceptionReporter(Thread.getDefaultUncaughtExceptionHandler(), z11));
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        if (!this.f78506c && !(th2 instanceof DeadSystemException)) {
            this.f78506c = true;
            N.MLlibBXh(this.f78505b, th2 instanceof JniAndroid.a ? th2.getCause() : th2);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f78504a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th2);
        }
    }
}
