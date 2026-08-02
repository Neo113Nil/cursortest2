package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC3191o;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.y5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3403y5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f34402a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Z5 f34403b;

    public RunnableC3403y5(Z5 z52, zzr zzrVar) {
        this.f34402a = zzrVar;
        Objects.requireNonNull(z52);
        this.f34403b = z52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Z5 z52 = this.f34403b;
        InterfaceC3241e2 N10 = z52.N();
        if (N10 == null) {
            z52.f33578a.a().r().a("Failed to send app backgrounded");
            return;
        }
        try {
            zzr zzrVar = this.f34402a;
            AbstractC3191o.m(zzrVar);
            N10.x0(zzrVar);
            z52.J();
        } catch (RemoteException e10) {
            this.f34403b.f33578a.a().o().b("Failed to send app backgrounded to the service", e10);
        }
    }
}
