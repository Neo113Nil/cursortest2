package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC3191o;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class E5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f33387a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Z5 f33388b;

    public E5(Z5 z52, zzr zzrVar) {
        this.f33387a = zzrVar;
        Objects.requireNonNull(z52);
        this.f33388b = z52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Z5 z52 = this.f33388b;
        InterfaceC3241e2 N10 = z52.N();
        if (N10 == null) {
            z52.f33578a.a().o().a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            zzr zzrVar = this.f33387a;
            AbstractC3191o.m(zzrVar);
            N10.F(zzrVar);
            z52.J();
        } catch (RemoteException e10) {
            this.f33388b.f33578a.a().o().b("Failed to send measurementEnabled to the service", e10);
        }
    }
}
