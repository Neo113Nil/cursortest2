package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.AbstractC3191o;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.t5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3363t5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f34300a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f34301b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzpl f34302c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Z5 f34303d;

    public RunnableC3363t5(Z5 z52, zzr zzrVar, boolean z10, zzpl zzplVar) {
        this.f34300a = zzrVar;
        this.f34301b = z10;
        this.f34302c = zzplVar;
        Objects.requireNonNull(z52);
        this.f34303d = z52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Z5 z52 = this.f34303d;
        InterfaceC3241e2 N10 = z52.N();
        if (N10 == null) {
            z52.f33578a.a().o().a("Discarding data. Failed to set user property");
            return;
        }
        zzr zzrVar = this.f34300a;
        AbstractC3191o.m(zzrVar);
        z52.b0(N10, this.f34301b ? null : this.f34302c, zzrVar);
        z52.J();
    }
}
