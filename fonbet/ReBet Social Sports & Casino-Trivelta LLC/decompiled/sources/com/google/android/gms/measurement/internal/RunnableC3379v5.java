package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC3191o;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.v5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3379v5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f34344a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzr f34345b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Z5 f34346c;

    public RunnableC3379v5(Z5 z52, AtomicReference atomicReference, zzr zzrVar) {
        this.f34344a = atomicReference;
        this.f34345b = zzrVar;
        Objects.requireNonNull(z52);
        this.f34346c = z52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        Z5 z52;
        C3298l3 c3298l3;
        AtomicReference atomicReference2 = this.f34344a;
        synchronized (atomicReference2) {
            try {
                try {
                    z52 = this.f34346c;
                    c3298l3 = z52.f33578a;
                } catch (RemoteException e10) {
                    this.f34346c.f33578a.a().o().b("Failed to get app instance id", e10);
                    atomicReference = this.f34344a;
                }
                if (c3298l3.x().w().o(U3.ANALYTICS_STORAGE)) {
                    InterfaceC3241e2 N10 = z52.N();
                    if (N10 != null) {
                        zzr zzrVar = this.f34345b;
                        AbstractC3191o.m(zzrVar);
                        atomicReference2.set(N10.S(zzrVar));
                        String str = (String) atomicReference2.get();
                        if (str != null) {
                            z52.f33578a.B().E(str);
                            c3298l3.x().f33518h.b(str);
                        }
                        z52.J();
                        atomicReference = this.f34344a;
                        atomicReference.notify();
                        return;
                    }
                    c3298l3.a().o().a("Failed to get app instance id");
                } else {
                    c3298l3.a().t().a("Analytics storage consent denied; will not get app instance id");
                    z52.f33578a.B().E(null);
                    c3298l3.x().f33518h.b(null);
                    atomicReference2.set(null);
                }
                atomicReference2.notify();
            } catch (Throwable th2) {
                this.f34344a.notify();
                throw th2;
            }
        }
    }
}
