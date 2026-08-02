package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC3191o;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class F5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f33406a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Z5 f33407b;

    public F5(Z5 z52, zzr zzrVar) {
        this.f33406a = zzrVar;
        Objects.requireNonNull(z52);
        this.f33407b = z52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Z5 z52 = this.f33407b;
        InterfaceC3241e2 N10 = z52.N();
        if (N10 == null) {
            z52.f33578a.a().o().a("Failed to send consent settings to service");
            return;
        }
        try {
            zzr zzrVar = this.f33406a;
            AbstractC3191o.m(zzrVar);
            N10.K0(zzrVar);
            z52.J();
        } catch (RemoteException e10) {
            this.f33407b.f33578a.a().o().b("Failed to send consent settings to the service", e10);
        }
    }
}
