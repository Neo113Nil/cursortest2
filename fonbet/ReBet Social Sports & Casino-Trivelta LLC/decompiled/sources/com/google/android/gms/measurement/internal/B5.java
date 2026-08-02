package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC3191o;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class B5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f33305a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f33306b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzbe f33307c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f33308d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Z5 f33309e;

    public B5(Z5 z52, boolean z10, zzr zzrVar, boolean z11, zzbe zzbeVar, Bundle bundle) {
        this.f33305a = zzrVar;
        this.f33306b = z11;
        this.f33307c = zzbeVar;
        this.f33308d = bundle;
        Objects.requireNonNull(z52);
        this.f33309e = z52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Z5 z52 = this.f33309e;
        InterfaceC3241e2 N10 = z52.N();
        if (N10 == null) {
            z52.f33578a.a().o().a("Failed to send default event parameters to service");
            return;
        }
        if (z52.f33578a.w().H(null, AbstractC3209a2.f33860c1)) {
            zzr zzrVar = this.f33305a;
            AbstractC3191o.m(zzrVar);
            this.f33309e.b0(N10, this.f33306b ? null : this.f33307c, zzrVar);
            return;
        }
        try {
            zzr zzrVar2 = this.f33305a;
            AbstractC3191o.m(zzrVar2);
            N10.r0(this.f33308d, zzrVar2);
            z52.J();
        } catch (RemoteException e10) {
            this.f33309e.f33578a.a().o().b("Failed to send default event parameters to service", e10);
        }
    }
}
