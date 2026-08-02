package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class A5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3268h5 f33279a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Z5 f33280b;

    public A5(Z5 z52, C3268h5 c3268h5) {
        this.f33279a = c3268h5;
        Objects.requireNonNull(z52);
        this.f33280b = z52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Z5 z52 = this.f33280b;
        InterfaceC3241e2 N10 = z52.N();
        if (N10 == null) {
            z52.f33578a.a().o().a("Failed to send current screen to service");
            return;
        }
        try {
            C3268h5 c3268h5 = this.f33279a;
            if (c3268h5 == null) {
                N10.a0(0L, null, null, z52.f33578a.d().getPackageName());
            } else {
                N10.a0(c3268h5.f34037c, c3268h5.f34035a, c3268h5.f34036b, z52.f33578a.d().getPackageName());
            }
            z52.J();
        } catch (RemoteException e10) {
            this.f33280b.f33578a.a().o().b("Failed to send current screen to the service", e10);
        }
    }
}
