package org.chromium.base;

import internal.org.chromium.build.BuildConfig;

/* loaded from: classes10.dex */
public class CancelableRunnable implements Runnable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private Thread mExpectedThread;
    private Runnable mRunnable;

    public CancelableRunnable(Runnable runnable) {
        this.mRunnable = runnable;
    }

    public void cancel() {
        this.mRunnable = null;
        if (BuildConfig.ENABLE_ASSERTS) {
            this.mExpectedThread = Thread.currentThread();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Runnable runnable = this.mRunnable;
        if (runnable != null) {
            runnable.run();
        }
    }
}
