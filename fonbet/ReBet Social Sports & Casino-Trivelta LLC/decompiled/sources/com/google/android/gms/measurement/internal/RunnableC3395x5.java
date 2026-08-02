package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC3191o;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.x5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3395x5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f34386a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Z5 f34387b;

    public RunnableC3395x5(Z5 z52, zzr zzrVar, boolean z10) {
        this.f34386a = zzrVar;
        Objects.requireNonNull(z52);
        this.f34387b = z52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Z5 z52 = this.f34387b;
        InterfaceC3241e2 N10 = z52.N();
        if (N10 == null) {
            z52.f33578a.a().o().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            zzr zzrVar = this.f34386a;
            AbstractC3191o.m(zzrVar);
            C3298l3 c3298l3 = z52.f33578a;
            C3286k w10 = c3298l3.w();
            Z1 z12 = AbstractC3209a2.f33860c1;
            if (w10.H(null, z12)) {
                z52.b0(N10, null, zzrVar);
            }
            N10.u0(zzrVar);
            z52.f33578a.E().v();
            c3298l3.w().H(null, z12);
            z52.b0(N10, null, zzrVar);
            z52.J();
        } catch (RemoteException e10) {
            this.f34387b.f33578a.a().o().b("Failed to send app launch to the service", e10);
        }
    }
}
