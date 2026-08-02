package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzee;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.ddb;
import defpackage.e8o;
import defpackage.ewm;
import defpackage.f8o;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfhk extends com.google.android.gms.ads.internal.client.zzbt implements com.google.android.gms.ads.internal.overlay.zzr, zzbgt {
    public final zzcob a;
    public final Context b;
    public final String d;
    public final zzfhe e;
    public final zzfhc f;
    public final VersionInfoParcel g;
    public final zzeaj h;
    public zzcvk j;
    public zzcvx k;
    public AtomicBoolean c = new AtomicBoolean();
    public long i = -1;

    public zzfhk(zzcob zzcobVar, Context context, String str, zzfhe zzfheVar, zzfhc zzfhcVar, VersionInfoParcel versionInfoParcel, zzeaj zzeajVar) {
        this.a = zzcobVar;
        this.b = context;
        this.d = str;
        this.e = zzfheVar;
        this.f = zzfhcVar;
        this.g = versionInfoParcel;
        this.h = zzeajVar;
        zzfhcVar.f.set(this);
    }

    public final synchronized void E4(int i) {
        try {
            if (this.c.compareAndSet(false, true)) {
                this.f.n();
                zzcvk zzcvkVar = this.j;
                if (zzcvkVar != null) {
                    com.google.android.gms.ads.internal.zzt.zzg().c(zzcvkVar);
                }
                if (this.k != null) {
                    long j = -1;
                    if (this.i != -1) {
                        j = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.i;
                    }
                    this.k.e(i, j);
                }
                zzb();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final void b() {
        E4(3);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzA() {
        boolean z;
        ddb ddbVar = this.e.j;
        if (ddbVar != null) {
            z = ddbVar.isDone() ? false : true;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized com.google.android.gms.ads.internal.client.zzea zzE() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzF(com.google.android.gms.ads.internal.client.zzfw zzfwVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(com.google.android.gms.ads.internal.client.zzx zzxVar) {
        this.e.i.i = zzxVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(zzbhc zzbhcVar) {
        this.f.b.set(zzbhcVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final long zzT() {
        return 0L;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzX(com.google.android.gms.ads.internal.client.zzcp zzcpVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final IObjectWrapper zza() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzb() {
        Preconditions.e("destroy must be called on the main UI thread.");
        zzcvx zzcvxVar = this.k;
        if (zzcvxVar != null) {
            zzcvxVar.d();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzc() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzd(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        boolean z;
        try {
            if (!zzmVar.zzb()) {
                if (((Boolean) zzblf.d.c()).booleanValue()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Oc)).booleanValue()) {
                        z = true;
                        if (this.g.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Pc)).intValue() || !z) {
                            Preconditions.e("loadAd must be called on the main UI thread.");
                        }
                    }
                }
                z = false;
                if (this.g.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Pc)).intValue()) {
                }
                Preconditions.e("loadAd must be called on the main UI thread.");
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            if (com.google.android.gms.ads.internal.util.zzs.zzK(this.b) && zzmVar.zzs == null) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzf("Failed to load the ad because app ID is missing.");
                this.f.i0(zzfmy.d(4, null, null));
                return false;
            }
            if (zzA()) {
                return false;
            }
            this.c = new AtomicBoolean();
            return this.e.a(zzmVar, this.d, new e8o(), new ewm(this, 22));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdW(int i) {
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            E4(2);
            return;
        }
        if (i2 == 1) {
            E4(4);
        } else if (i2 != 2) {
            E4(6);
        } else {
            E4(3);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdv() {
        zzcvx zzcvxVar = this.k;
        if (zzcvxVar != null) {
            zzcvxVar.e(1, com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.i);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zze() {
        Preconditions.e("pause must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzf() {
        Preconditions.e("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzh() {
        if (this.k != null) {
            this.i = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
            int i = this.k.m;
            if (i > 0) {
                ScheduledExecutorService e = this.a.e();
                Clock zzk = com.google.android.gms.ads.internal.zzt.zzk();
                zzcvk zzcvkVar = new zzcvk(e, zzk);
                this.j = zzcvkVar;
                f8o f8oVar = new f8o(this, 0);
                synchronized (zzcvkVar) {
                    zzcvkVar.f = f8oVar;
                    long j = i;
                    zzcvkVar.d = zzk.elapsedRealtime() + j;
                    zzcvkVar.c = e.schedule(f8oVar, j, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzj() {
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzk() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzl() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized com.google.android.gms.ads.internal.client.zzr zzm() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzn(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        Preconditions.e("setAdSize must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzq() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzr() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized com.google.android.gms.ads.internal.client.zzdx zzs() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzt() {
        return this.d;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzcl zzu() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzbh zzv() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzw(zzbkb zzbkbVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzy(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzz() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdV() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdx() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzB(zzccn zzccnVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(zzee zzeeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzJ(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzO(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzQ(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzR(zzcs zzcsVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzS(long j) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzdU(com.google.android.gms.ads.internal.client.zzcl zzclVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzg(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzi(com.google.android.gms.ads.internal.client.zzby zzbyVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzo(zzcac zzcacVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzx(com.google.android.gms.ads.internal.client.zzbe zzbeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzp(zzcaf zzcafVar, String str) {
    }
}
