package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.y4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3402y4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f34400a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W4 f34401b;

    public RunnableC3402y4(W4 w42, AtomicReference atomicReference) {
        this.f34400a = atomicReference;
        Objects.requireNonNull(w42);
        this.f34401b = w42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f34400a;
        synchronized (atomicReference) {
            try {
                try {
                    W4 w42 = this.f34401b;
                    atomicReference.set(w42.f33578a.w().C(w42.f33578a.L().q(), AbstractC3209a2.f33859c0));
                } finally {
                    this.f34400a.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
