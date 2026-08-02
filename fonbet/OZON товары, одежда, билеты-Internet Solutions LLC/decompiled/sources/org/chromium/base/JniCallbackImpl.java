package org.chromium.base;

import internal.J.N;
import internal.org.jni_zero.CalledByNative;

/* loaded from: classes10.dex */
final class JniCallbackImpl<T> implements Callback, Runnable {

    /* renamed from: a, reason: collision with root package name */
    private long f78514a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f78515b;

    @CalledByNative
    private JniCallbackImpl(boolean z11, long j11) {
        this.f78515b = z11;
        this.f78514a = j11;
    }

    @Override // org.chromium.base.Callback
    public final void onResult(T t2) {
        long j11 = this.f78514a;
        boolean z11 = this.f78515b;
        N.Mv1m4r87(z11, j11, t2);
        if (z11) {
            return;
        }
        this.f78514a = 0L;
    }

    @Override // java.lang.Runnable
    public final void run() {
        onResult(null);
    }
}
