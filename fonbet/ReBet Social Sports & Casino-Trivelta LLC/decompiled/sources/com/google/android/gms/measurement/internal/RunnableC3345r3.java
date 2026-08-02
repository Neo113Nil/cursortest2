package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.r3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3345r3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzah f34262a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N3 f34263b;

    public RunnableC3345r3(N3 n32, zzah zzahVar) {
        this.f34262a = zzahVar;
        Objects.requireNonNull(n32);
        this.f34263b = n32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        N3 n32 = this.f34263b;
        n32.O0().E();
        zzah zzahVar = this.f34262a;
        if (zzahVar.f34424c.g() == null) {
            n32.O0().l0(zzahVar);
        } else {
            n32.O0().j0(zzahVar);
        }
    }
}
