package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.p4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3331p4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f34220a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W4 f34221b;

    public RunnableC3331p4(W4 w42, AtomicReference atomicReference) {
        this.f34220a = atomicReference;
        Objects.requireNonNull(w42);
        this.f34221b = w42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f34220a;
        synchronized (atomicReference) {
            try {
                try {
                    W4 w42 = this.f34221b;
                    atomicReference.set(Boolean.valueOf(w42.f33578a.w().H(w42.f33578a.L().q(), AbstractC3209a2.f33856b0)));
                } finally {
                    this.f34220a.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
