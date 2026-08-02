package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class A4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f33277a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W4 f33278b;

    public A4(W4 w42, AtomicReference atomicReference) {
        this.f33277a = atomicReference;
        Objects.requireNonNull(w42);
        this.f33278b = w42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f33277a;
        synchronized (atomicReference) {
            try {
                try {
                    W4 w42 = this.f33278b;
                    atomicReference.set(Integer.valueOf(w42.f33578a.w().E(w42.f33578a.L().q(), AbstractC3209a2.f33865e0)));
                } finally {
                    this.f33277a.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
