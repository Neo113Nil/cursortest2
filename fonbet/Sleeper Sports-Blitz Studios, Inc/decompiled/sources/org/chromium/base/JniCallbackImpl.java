package org.chromium.base;

import internal.org.jni_zero.JNINamespace;
import org.chromium.base.lifetime.LifetimeAssert;

@JNINamespace("base::android")
/* loaded from: classes10.dex */
final class JniCallbackImpl<T> implements JniOnceCallback<T>, JniOnceRunnable, JniRepeatingCallback<T>, JniRepeatingRunnable {
    private final boolean mIsRepeating;
    private final LifetimeAssert mLifetimeAssert = LifetimeAssert.create(this);
    private long mNativePointer;

    interface Natives {
        void destroy(boolean isRepeating, long callbackPtr);

        void onResult(boolean isRepeating, long callbackPtr, Object result);
    }

    private JniCallbackImpl(boolean isRepeating, long nativePointer) {
        this.mIsRepeating = isRepeating;
        this.mNativePointer = nativePointer;
    }

    @Override // java.lang.Runnable
    public void run() {
        lambda$bind$0(null);
    }

    @Override // org.chromium.base.Callback
    /* renamed from: onResult */
    public void lambda$bind$0(T result) {
        if (this.mNativePointer == 0) {
            throw null;
        }
        JniCallbackImplJni.get().onResult(this.mIsRepeating, this.mNativePointer, result);
        if (this.mIsRepeating) {
            return;
        }
        this.mNativePointer = 0L;
        LifetimeAssert.destroy(this.mLifetimeAssert);
    }

    @Override // org.chromium.base.lifetime.Destroyable
    public void destroy() {
        if (this.mNativePointer != 0) {
            JniCallbackImplJni.get().destroy(this.mIsRepeating, this.mNativePointer);
            this.mNativePointer = 0L;
            LifetimeAssert.destroy(this.mLifetimeAssert);
        }
    }
}
