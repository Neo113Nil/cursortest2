package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.measurement.zzcu;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.w5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3387w5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f34360a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzcu f34361b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Z5 f34362c;

    public RunnableC3387w5(Z5 z52, zzr zzrVar, zzcu zzcuVar) {
        this.f34360a = zzrVar;
        this.f34361b = zzcuVar;
        Objects.requireNonNull(z52);
        this.f34362c = z52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcu zzcuVar;
        b7 C10;
        Z5 z52;
        C3298l3 c3298l3;
        String str = null;
        try {
            try {
                z52 = this.f34362c;
                c3298l3 = z52.f33578a;
            } catch (RemoteException e10) {
                this.f34362c.f33578a.a().o().b("Failed to get app instance id", e10);
            }
            if (c3298l3.x().w().o(U3.ANALYTICS_STORAGE)) {
                InterfaceC3241e2 N10 = z52.N();
                if (N10 != null) {
                    zzr zzrVar = this.f34360a;
                    AbstractC3191o.m(zzrVar);
                    str = N10.S(zzrVar);
                    if (str != null) {
                        z52.f33578a.B().E(str);
                        c3298l3.x().f33518h.b(str);
                    }
                    z52.J();
                    Z5 z53 = this.f34362c;
                    zzcuVar = this.f34361b;
                    C10 = z53.f33578a.C();
                    C10.a0(zzcuVar, str);
                }
                c3298l3.a().o().a("Failed to get app instance id");
            } else {
                c3298l3.a().t().a("Analytics storage consent denied; will not get app instance id");
                z52.f33578a.B().E(null);
                c3298l3.x().f33518h.b(null);
            }
            C10 = c3298l3.C();
            zzcuVar = this.f34361b;
            C10.a0(zzcuVar, str);
        } catch (Throwable th2) {
            Z5 z54 = this.f34362c;
            z54.f33578a.C().a0(this.f34361b, null);
            throw th2;
        }
    }
}
