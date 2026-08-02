package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.measurement.zzcu;
import java.util.List;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.q5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3340q5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f34250a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f34251b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzr f34252c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f34253d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzcu f34254e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Z5 f34255f;

    public RunnableC3340q5(Z5 z52, String str, String str2, zzr zzrVar, boolean z10, zzcu zzcuVar) {
        this.f34250a = str;
        this.f34251b = str2;
        this.f34252c = zzrVar;
        this.f34253d = z10;
        this.f34254e = zzcuVar;
        Objects.requireNonNull(z52);
        this.f34255f = z52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        RemoteException e10;
        Bundle bundle2 = new Bundle();
        try {
            Z5 z52 = this.f34255f;
            InterfaceC3241e2 N10 = z52.N();
            if (N10 == null) {
                C3298l3 c3298l3 = z52.f33578a;
                c3298l3.a().o().c("Failed to get user properties; not connected to service", this.f34250a, this.f34251b);
                c3298l3.C().f0(this.f34254e, bundle2);
                return;
            }
            zzr zzrVar = this.f34252c;
            AbstractC3191o.m(zzrVar);
            List<zzpl> y02 = N10.y0(this.f34250a, this.f34251b, this.f34253d, zzrVar);
            int i10 = b7.f33942i;
            bundle = new Bundle();
            if (y02 != null) {
                for (zzpl zzplVar : y02) {
                    String str = zzplVar.f34454e;
                    if (str != null) {
                        bundle.putString(zzplVar.f34451b, str);
                    } else {
                        Long l10 = zzplVar.f34453d;
                        if (l10 != null) {
                            bundle.putLong(zzplVar.f34451b, l10.longValue());
                        } else {
                            Double d10 = zzplVar.f34456g;
                            if (d10 != null) {
                                bundle.putDouble(zzplVar.f34451b, d10.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                try {
                    z52.J();
                    C3298l3 c3298l32 = z52.f33578a;
                    c3298l32.C().f0(this.f34254e, bundle);
                } catch (RemoteException e11) {
                    e10 = e11;
                    this.f34255f.f33578a.a().o().c("Failed to get user properties; remote exception", this.f34250a, e10);
                    Z5 z53 = this.f34255f;
                    z53.f33578a.C().f0(this.f34254e, bundle);
                }
            } catch (Throwable th2) {
                th = th2;
                bundle2 = bundle;
                Z5 z54 = this.f34255f;
                z54.f33578a.C().f0(this.f34254e, bundle2);
                throw th;
            }
        } catch (RemoteException e12) {
            bundle = bundle2;
            e10 = e12;
        } catch (Throwable th3) {
            th = th3;
            Z5 z542 = this.f34255f;
            z542.f33578a.C().f0(this.f34254e, bundle2);
            throw th;
        }
    }
}
