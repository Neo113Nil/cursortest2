package org.chromium.net.impl;

import internal.org.jni_zero.JNINamespace;

@JNINamespace("cronet")
/* loaded from: classes10.dex */
final class CompletionOnceCallback implements AutoCloseable {
    private final long mCompletionOnceCallbackAdapter;
    private boolean mIsConsumed;

    interface Natives {
        void run(long nativeCompletionOnceCallbackAdapter, int result);
    }

    CompletionOnceCallback(long completionOnceCallbackAdapter) {
        this.mCompletionOnceCallbackAdapter = completionOnceCallbackAdapter;
    }

    public void run(int result) {
        if (this.mIsConsumed) {
            throw new IllegalStateException("This callback can only be run once");
        }
        CompletionOnceCallbackJni.get().run(this.mCompletionOnceCallbackAdapter, result);
        this.mIsConsumed = true;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        if (!this.mIsConsumed) {
            throw new AssertionError("run should always be called prior to close");
        }
    }
}
