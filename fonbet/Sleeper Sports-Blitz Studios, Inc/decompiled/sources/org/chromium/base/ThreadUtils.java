package org.chromium.base;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import internal.org.chromium.build.BuildConfig;
import java.util.concurrent.Callable;
import org.chromium.base.task.PostTask;

/* loaded from: classes10.dex */
public class ThreadUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static Thread sInstrumentationThreadForTesting;
    private static final Object sLock = new Object();
    private static boolean sThreadAssertsDisabledForTesting;
    private static volatile Handler sUiThreadHandler;
    private static Throwable sUiThreadInitializer;
    private static volatile boolean sWillOverride;

    public static void assertOnBackgroundThread() {
    }

    public static void assertOnUiThread() {
    }

    public static class ThreadChecker {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private Thread mThread;

        public ThreadChecker() {
            resetThreadId();
        }

        public void resetThreadId() {
            if (BuildConfig.ENABLE_ASSERTS) {
                this.mThread = Thread.currentThread();
            }
        }

        public void assertOnValidThread() {
            assertOnValidThreadHelper(false);
        }

        public void assertOnValidOrInstrumentationThread() {
            assertOnValidThreadHelper(true);
        }

        private void assertOnValidThreadHelper(boolean allowInstrThread) {
            Thread currentThread;
            if (!BuildConfig.ENABLE_ASSERTS || ThreadUtils.sThreadAssertsDisabledForTesting || (currentThread = Thread.currentThread()) == this.mThread) {
                return;
            }
            if (allowInstrThread && currentThread == ThreadUtils.sInstrumentationThreadForTesting) {
                return;
            }
            ThreadUtils.getUiThreadLooper().getThread();
        }
    }

    public static void setWillOverrideUiThread() {
        sWillOverride = true;
        if (BuildConfig.ENABLE_ASSERTS && sUiThreadHandler != null) {
            throw new AssertionError("UI Thread already set", sUiThreadInitializer);
        }
    }

    public static void clearUiThreadForTesting() {
        sWillOverride = false;
        PostTask.resetUiThreadForTesting();
        sUiThreadHandler = null;
        sUiThreadInitializer = null;
    }

    public static void setUiThread(Looper looper) {
        synchronized (sLock) {
            if (sUiThreadHandler == null) {
                if (BuildConfig.ENABLE_ASSERTS) {
                    sUiThreadInitializer = new Throwable("This is who set sUiThreadHandler.");
                }
                sUiThreadHandler = new Handler(looper);
                TraceEvent.onUiThreadReady();
            } else if (sUiThreadHandler.getLooper() != looper) {
                RuntimeException runtimeException = new RuntimeException("UI thread looper is already set to " + String.valueOf(sUiThreadHandler.getLooper()) + " (Main thread looper is " + String.valueOf(Looper.getMainLooper()) + "), cannot set to new looper " + String.valueOf(looper));
                if (BuildConfig.ENABLE_ASSERTS) {
                    runtimeException.initCause(sUiThreadInitializer);
                    throw runtimeException;
                }
                throw runtimeException;
            }
        }
    }

    public static void recordInstrumentationThreadForTesting() {
        sInstrumentationThreadForTesting = Thread.currentThread();
    }

    public static Handler getUiThreadHandler() {
        if (sUiThreadHandler != null) {
            return sUiThreadHandler;
        }
        if (sWillOverride) {
            throw new RuntimeException("Did not yet override the UI thread");
        }
        setUiThread(Looper.getMainLooper());
        return sUiThreadHandler;
    }

    public static void runOnUiThreadBlocking(Runnable r) {
        PostTask.runSynchronously(7, r);
    }

    public static <T> T runOnUiThreadBlocking(Callable<T> callable) {
        return (T) PostTask.runSynchronously(7, callable);
    }

    public static void runOnUiThread(Runnable r) {
        PostTask.runOrPostTask(7, r);
    }

    public static void postOnUiThread(Runnable r) {
        PostTask.postTask(7, r);
    }

    public static void postOnUiThreadDelayed(Runnable r, long delayMillis) {
        PostTask.postDelayedTask(7, r, delayMillis);
    }

    public static void checkUiThread() {
        if (!sThreadAssertsDisabledForTesting && !runningOnUiThread()) {
            throw new IllegalStateException("Must be called on the UI thread.");
        }
    }

    public static void hasSubtleSideEffectsSetThreadAssertsDisabledForTesting(boolean disabled) {
        sThreadAssertsDisabledForTesting = disabled;
        ResettersForTesting.register(new Runnable() { // from class: org.chromium.base.ThreadUtils$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                ThreadUtils.sThreadAssertsDisabledForTesting = false;
            }
        });
    }

    @Deprecated
    public static void setThreadAssertsDisabledForTesting(boolean disabled) {
        sThreadAssertsDisabledForTesting = disabled;
        ResettersForTesting.register(new Runnable() { // from class: org.chromium.base.ThreadUtils$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ThreadUtils.sThreadAssertsDisabledForTesting = false;
            }
        });
    }

    public static boolean runningOnUiThread() {
        return getUiThreadHandler().getLooper() == Looper.myLooper();
    }

    public static boolean runningOnInstrumentationThread() {
        Thread thread = sInstrumentationThreadForTesting;
        return thread != null && thread == Thread.currentThread();
    }

    public static Looper getUiThreadLooper() {
        return getUiThreadHandler().getLooper();
    }

    public static void setThreadPriorityAudio(int tid) {
        Process.setThreadPriority(tid, -16);
    }

    private static boolean isThreadPriorityAudio(int tid) {
        return Process.getThreadPriority(tid) == -16;
    }
}
