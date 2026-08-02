package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class B4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f33303a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W4 f33304b;

    public B4(W4 w42, AtomicReference atomicReference) {
        this.f33303a = atomicReference;
        Objects.requireNonNull(w42);
        this.f33304b = w42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f33303a;
        synchronized (atomicReference) {
            try {
                try {
                    W4 w42 = this.f33304b;
                    atomicReference.set(Double.valueOf(w42.f33578a.w().G(w42.f33578a.L().q(), AbstractC3209a2.f33868f0)));
                } finally {
                    this.f33303a.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
