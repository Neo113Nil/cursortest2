package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.q3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3338q3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzah f34246a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzr f34247b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N3 f34248c;

    public RunnableC3338q3(N3 n32, zzah zzahVar, zzr zzrVar) {
        this.f34246a = zzahVar;
        this.f34247b = zzrVar;
        Objects.requireNonNull(n32);
        this.f34248c = n32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        N3 n32 = this.f34248c;
        n32.O0().E();
        zzah zzahVar = this.f34246a;
        if (zzahVar.f34424c.g() == null) {
            n32.O0().m0(zzahVar, this.f34247b);
        } else {
            n32.O0().k0(zzahVar, this.f34247b);
        }
    }
}
