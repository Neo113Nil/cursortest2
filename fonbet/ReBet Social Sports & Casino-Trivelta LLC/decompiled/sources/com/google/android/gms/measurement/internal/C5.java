package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcu;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class C5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzbg f33319a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f33320b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzcu f33321c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Z5 f33322d;

    public C5(Z5 z52, zzbg zzbgVar, String str, zzcu zzcuVar) {
        this.f33319a = zzbgVar;
        this.f33320b = str;
        this.f33321c = zzcuVar;
        Objects.requireNonNull(z52);
        this.f33322d = z52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcu zzcuVar;
        b7 C10;
        Z5 z52;
        InterfaceC3241e2 N10;
        byte[] bArr = null;
        try {
            try {
                z52 = this.f33322d;
                N10 = z52.N();
            } catch (RemoteException e10) {
                this.f33322d.f33578a.a().o().b("Failed to send event to the service to bundle", e10);
            }
            if (N10 == null) {
                C3298l3 c3298l3 = z52.f33578a;
                c3298l3.a().o().a("Discarding data. Failed to send event to service to bundle");
                C10 = c3298l3.C();
                zzcuVar = this.f33321c;
                C10.d0(zzcuVar, bArr);
            }
            bArr = N10.J(this.f33319a, this.f33320b);
            z52.J();
            Z5 z53 = this.f33322d;
            zzcuVar = this.f33321c;
            C10 = z53.f33578a.C();
            C10.d0(zzcuVar, bArr);
        } catch (Throwable th2) {
            Z5 z54 = this.f33322d;
            z54.f33578a.C().d0(this.f33321c, null);
            throw th2;
        }
    }
}
