package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC3191o;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.u5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3371u5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f34324a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Z5 f34325b;

    public RunnableC3371u5(Z5 z52, zzr zzrVar) {
        this.f34324a = zzrVar;
        Objects.requireNonNull(z52);
        this.f34325b = z52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Z5 z52 = this.f34325b;
        InterfaceC3241e2 N10 = z52.N();
        if (N10 == null) {
            z52.f33578a.a().o().a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            zzr zzrVar = this.f34324a;
            AbstractC3191o.m(zzrVar);
            N10.c0(zzrVar);
        } catch (RemoteException e10) {
            this.f34325b.f33578a.a().o().b("Failed to reset data on the service: remote exception", e10);
        }
        this.f34325b.J();
    }
}
