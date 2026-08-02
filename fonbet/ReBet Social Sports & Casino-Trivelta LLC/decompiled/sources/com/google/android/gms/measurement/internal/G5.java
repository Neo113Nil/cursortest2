package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.AbstractC3191o;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class G5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f33418a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f33419b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzbg f33420c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Z5 f33421d;

    public G5(Z5 z52, boolean z10, zzr zzrVar, boolean z11, zzbg zzbgVar, String str) {
        this.f33418a = zzrVar;
        this.f33419b = z11;
        this.f33420c = zzbgVar;
        Objects.requireNonNull(z52);
        this.f33421d = z52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Z5 z52 = this.f33421d;
        InterfaceC3241e2 N10 = z52.N();
        if (N10 == null) {
            z52.f33578a.a().o().a("Discarding data. Failed to send event to service");
            return;
        }
        zzr zzrVar = this.f33418a;
        AbstractC3191o.m(zzrVar);
        z52.b0(N10, this.f33419b ? null : this.f33420c, zzrVar);
        z52.J();
    }
}
