package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.measurement.zzcu;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class J5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f33484a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f33485b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzr f33486c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzcu f33487d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Z5 f33488e;

    public J5(Z5 z52, String str, String str2, zzr zzrVar, zzcu zzcuVar) {
        this.f33484a = str;
        this.f33485b = str2;
        this.f33486c = zzrVar;
        this.f33487d = zzcuVar;
        Objects.requireNonNull(z52);
        this.f33488e = z52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcu zzcuVar;
        b7 C10;
        Z5 z52;
        InterfaceC3241e2 N10;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                z52 = this.f33488e;
                N10 = z52.N();
            } catch (RemoteException e10) {
                this.f33488e.f33578a.a().o().d("Failed to get conditional properties; remote exception", this.f33484a, this.f33485b, e10);
            }
            if (N10 == null) {
                C3298l3 c3298l3 = z52.f33578a;
                c3298l3.a().o().c("Failed to get conditional properties; not connected to service", this.f33484a, this.f33485b);
                C10 = c3298l3.C();
                zzcuVar = this.f33487d;
                C10.g0(zzcuVar, arrayList);
            }
            zzr zzrVar = this.f33486c;
            AbstractC3191o.m(zzrVar);
            arrayList = b7.h0(N10.F0(this.f33484a, this.f33485b, zzrVar));
            z52.J();
            Z5 z53 = this.f33488e;
            zzcuVar = this.f33487d;
            C10 = z53.f33578a.C();
            C10.g0(zzcuVar, arrayList);
        } catch (Throwable th2) {
            Z5 z54 = this.f33488e;
            z54.f33578a.C().g0(this.f33487d, arrayList);
            throw th2;
        }
    }
}
