package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.z4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3410z4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f34415a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W4 f34416b;

    public RunnableC3410z4(W4 w42, AtomicReference atomicReference) {
        this.f34415a = atomicReference;
        Objects.requireNonNull(w42);
        this.f34416b = w42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f34415a;
        synchronized (atomicReference) {
            try {
                try {
                    W4 w42 = this.f34416b;
                    atomicReference.set(Long.valueOf(w42.f33578a.w().D(w42.f33578a.L().q(), AbstractC3209a2.f33862d0)));
                } finally {
                    this.f34415a.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
