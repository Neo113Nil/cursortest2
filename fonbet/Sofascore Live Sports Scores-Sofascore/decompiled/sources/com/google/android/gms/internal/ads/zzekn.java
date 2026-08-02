package com.google.android.gms.internal.ads;

import defpackage.am0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzekn implements zzfqj {
    public final zzekb a;
    public final zzekf b;

    public zzekn(zzekb zzekbVar, zzekf zzekfVar) {
        this.a = zzekbVar;
        this.b = zzekfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfqj
    public final void D(zzfqc zzfqcVar, String str, Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.n7)).booleanValue() && zzfqc.RENDERER == zzfqcVar) {
            zzekb zzekbVar = this.a;
            if (zzekbVar.b() != 0) {
                long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - zzekbVar.b();
                synchronized (zzekbVar) {
                    synchronized (zzekbVar.j) {
                        zzekbVar.e = elapsedRealtime;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfqj
    public final void h(zzfqc zzfqcVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.n7)).booleanValue()) {
            if (zzfqc.RENDERER == zzfqcVar) {
                zzekb zzekbVar = this.a;
                long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
                synchronized (zzekbVar) {
                    synchronized (zzekbVar.i) {
                        zzekbVar.d = elapsedRealtime;
                    }
                }
                return;
            }
            if (zzfqc.PRELOADED_LOADER == zzfqcVar || zzfqc.SERVER_TRANSACTION == zzfqcVar) {
                zzekb zzekbVar2 = this.a;
                long elapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
                synchronized (zzekbVar2) {
                    synchronized (zzekbVar2.f) {
                        zzekbVar2.a = elapsedRealtime2;
                    }
                }
                zzekf zzekfVar = this.b;
                zzekfVar.b.a(new am0(zzekfVar, zzekbVar2.a(), 15));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfqj
    public final void t(zzfqc zzfqcVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.n7)).booleanValue() && zzfqc.RENDERER == zzfqcVar) {
            zzekb zzekbVar = this.a;
            if (zzekbVar.b() != 0) {
                long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - zzekbVar.b();
                synchronized (zzekbVar) {
                    synchronized (zzekbVar.j) {
                        zzekbVar.e = elapsedRealtime;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfqj
    public final void A(String str) {
    }
}
