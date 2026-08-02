package com.google.android.gms.internal.ads;

import defpackage.fjn;
import defpackage.fsn;
import defpackage.hsn;
import defpackage.vlo;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdce implements zzddp, zzdlb, zzdir, zzdef, zzbfg {
    public final zzdeh a;
    public final zzdgi b;
    public final zzfld c;
    public final ScheduledExecutorService d;
    public final hsn e;
    public ScheduledFuture g;
    public final String i;
    public final zzhdr f = zzhdr.r();
    public final AtomicBoolean h = new AtomicBoolean();

    public zzdce(zzdeh zzdehVar, zzfld zzfldVar, ScheduledExecutorService scheduledExecutorService, hsn hsnVar, String str, zzdgi zzdgiVar) {
        this.a = zzdehVar;
        this.c = zzfldVar;
        this.d = scheduledExecutorService;
        this.e = hsnVar;
        this.i = str;
        this.b = zzdgiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final void A(zzbff zzbffVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.gd)).booleanValue() && this.i.equals("com.google.ads.mediation.admob.AdMobAdapter") && zzbffVar.j && this.h.compareAndSet(false, true) && this.c.e != 3) {
            com.google.android.gms.ads.internal.util.zze.zza("Full screen 1px impression occurred");
            this.a.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdir
    public final synchronized void D() {
        if (this.c.e == 4) {
            this.a.zza();
            return;
        }
        zzhdr zzhdrVar = this.f;
        if (zzhdrVar.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        zzhdrVar.d(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void L() {
        zzfld zzfldVar = this.c;
        if (zzfldVar.e == 3) {
            return;
        }
        int i = zzfldVar.Y;
        if (i == 0 || i == 1) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.gd)).booleanValue() && this.i.equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                return;
            }
            this.a.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdef
    public final synchronized void t(com.google.android.gms.ads.internal.client.zze zzeVar) {
        try {
            zzhdr zzhdrVar = this.f;
            if (zzhdrVar.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            zzhdrVar.e(new Exception());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlb
    public final void zzg() {
        zzfld zzfldVar = this.c;
        int i = zzfldVar.e;
        if (i == 3) {
            return;
        }
        if (i == 4) {
            this.b.zza();
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.m2)).booleanValue() && zzfldVar.Y == 2) {
            int i2 = zzfldVar.q;
            if (i2 == 0) {
                this.a.zza();
                return;
            }
            fjn fjnVar = new fjn(this, 7);
            zzhdr zzhdrVar = this.f;
            zzhdrVar.addListener(new vlo(0, zzhdrVar, fjnVar), this.e);
            this.g = this.d.schedule(new fsn(this, 16), i2, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void I() {
    }

    @Override // com.google.android.gms.internal.ads.zzdir
    public final void M() {
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void a0() {
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdlb
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void n(zzcce zzcceVar, String str, String str2) {
    }
}
