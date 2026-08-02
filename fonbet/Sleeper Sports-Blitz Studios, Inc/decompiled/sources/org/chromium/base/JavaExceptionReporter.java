package org.chromium.base;

import android.os.DeadSystemException;
import internal.org.jni_zero.JNINamespace;
import java.lang.Thread;
import org.chromium.base.JniAndroid;

@JNINamespace("base::android")
/* loaded from: classes10.dex */
public class JavaExceptionReporter implements Thread.UncaughtExceptionHandler {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final boolean mCrashAfterReport;
    private boolean mHandlingException;
    private final Thread.UncaughtExceptionHandler mParent;

    interface Natives {
        void reportJavaException(boolean crashAfterReport, Throwable e);

        void reportJavaStackTrace(String stackTrace);
    }

    private JavaExceptionReporter(Thread.UncaughtExceptionHandler parent, boolean crashAfterReport) {
        this.mParent = parent;
        this.mCrashAfterReport = crashAfterReport;
    }

    public static boolean shouldReportThrowable(Throwable e) {
        return !(e instanceof DeadSystemException);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread t, Throwable e) {
        if (!this.mHandlingException && shouldReportThrowable(e)) {
            this.mHandlingException = true;
            JavaExceptionReporterJni.get().reportJavaException(this.mCrashAfterReport, e instanceof JniAndroid.UncaughtExceptionException ? e.getCause() : e);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.mParent;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(t, e);
        }
    }

    public static void reportStackTrace(String stackTrace) {
        JavaExceptionReporterJni.get().reportJavaStackTrace(PiiElider.sanitizeStacktrace(stackTrace));
    }

    public static void reportException(Throwable exception) {
        JavaExceptionReporterJni.get().reportJavaException(false, exception);
    }

    private static void installHandler(boolean crashAfterReport) {
        Thread.setDefaultUncaughtExceptionHandler(new JavaExceptionReporter(Thread.getDefaultUncaughtExceptionHandler(), crashAfterReport));
    }
}
