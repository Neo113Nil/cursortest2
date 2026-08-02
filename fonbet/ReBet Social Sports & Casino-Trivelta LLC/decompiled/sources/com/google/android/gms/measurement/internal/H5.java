package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.AbstractC3191o;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class H5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f33441a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f33442b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzah f33443c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Z5 f33444d;

    public H5(Z5 z52, boolean z10, zzr zzrVar, boolean z11, zzah zzahVar, zzah zzahVar2) {
        this.f33441a = zzrVar;
        this.f33442b = z11;
        this.f33443c = zzahVar;
        Objects.requireNonNull(z52);
        this.f33444d = z52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Z5 z52 = this.f33444d;
        InterfaceC3241e2 N10 = z52.N();
        if (N10 == null) {
            z52.f33578a.a().o().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        zzr zzrVar = this.f33441a;
        AbstractC3191o.m(zzrVar);
        z52.b0(N10, this.f33442b ? null : this.f33443c, zzrVar);
        z52.J();
    }
}
