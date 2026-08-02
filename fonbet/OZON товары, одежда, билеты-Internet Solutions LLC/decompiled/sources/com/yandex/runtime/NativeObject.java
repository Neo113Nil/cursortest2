package com.yandex.runtime;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes9.dex */
public final class NativeObject {
    private boolean canBeDeletedInBackground;
    private long nativeObject;

    private static final class Cleaner implements Runnable {
        private final long nativeObject;

        public Cleaner(long j11) {
            this.nativeObject = j11;
        }

        @Override // java.lang.Runnable
        public void run() {
            NativeObject.deleteNative(this.nativeObject);
        }
    }

    public NativeObject(long j11, boolean z11) {
        this.nativeObject = j11;
        this.canBeDeletedInBackground = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void deleteNative(long j11);

    public void finalize() throws Throwable {
        if (isEmpty()) {
            return;
        }
        if (this.canBeDeletedInBackground) {
            deleteNative(this.nativeObject);
        } else {
            new Handler(Looper.getMainLooper()).post(new Cleaner(this.nativeObject));
        }
        this.nativeObject = 0L;
    }

    public boolean isEmpty() {
        return this.nativeObject == 0;
    }

    public long release() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot release native object outside the UI thread");
        }
        long j11 = this.nativeObject;
        this.nativeObject = 0L;
        return j11;
    }

    public void reset() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot reset native object outside the UI thread");
        }
        deleteNative(this.nativeObject);
        this.nativeObject = 0L;
    }
}
