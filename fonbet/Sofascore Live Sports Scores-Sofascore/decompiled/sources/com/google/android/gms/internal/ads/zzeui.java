package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzee;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.fl5;
import defpackage.ohn;
import defpackage.qc4;
import defpackage.w00;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeui extends com.google.android.gms.ads.internal.client.zzbt {
    public final com.google.android.gms.ads.internal.client.zzr a;
    public final Context b;
    public final zzfjg c;
    public final String d;
    public final VersionInfoParcel e;
    public final zzeua f;
    public final zzfkh g;
    public final zzbbd h;
    public final zzeaj i;
    public zzdmx j;
    public boolean k;

    public zzeui(Context context, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, zzfjg zzfjgVar, zzeua zzeuaVar, zzfkh zzfkhVar, VersionInfoParcel versionInfoParcel, zzbbd zzbbdVar, zzeaj zzeajVar) {
        this.a = zzrVar;
        this.d = str;
        this.b = context;
        this.c = zzfjgVar;
        this.f = zzeuaVar;
        this.g = zzfkhVar;
        this.e = versionInfoParcel;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.v1)).booleanValue() || Build.VERSION.SDK_INT < 35) {
            this.k = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.u1)).booleanValue();
        } else {
            this.k = true;
        }
        this.h = zzbbdVar;
        this.i = zzeajVar;
    }

    public final synchronized boolean E4() {
        zzdmx zzdmxVar = this.j;
        if (zzdmxVar != null) {
            if (!zzdmxVar.p.b.get()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzA() {
        return this.c.b();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzB(zzccn zzccnVar) {
        this.g.e.set(zzccnVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzea zzE() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzJ(boolean z) {
        Preconditions.e("setImmersiveMode must be called on the main UI thread.");
        this.k = z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzO(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        Preconditions.e("setPaidEventListener must be called on the main UI thread.");
        try {
            if (!zzdqVar.zzf()) {
                this.i.b();
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zze("Error in making CSI ping for reporting paid event callback", e);
        }
        this.f.c.set(zzdqVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
        this.f.d.set(zzbkVar);
        zzd(zzmVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzQ(IObjectWrapper iObjectWrapper) {
        if (this.j == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi("Interstitial can not be shown before loaded.");
            this.f.t(zzfmy.d(9, null, null));
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.L3)).booleanValue()) {
                this.h.b.zzi(new Throwable().getStackTrace());
            }
            this.j.c((Activity) ObjectWrapper.Z1(iObjectWrapper), this.k);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzR(zzcs zzcsVar) {
        this.f.e.set(zzcsVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzS(long j) {
        zzdck zzdckVar;
        zzdmx zzdmxVar = this.j;
        if (zzdmxVar == null || (zzdckVar = zzdmxVar.j) == null) {
            return;
        }
        zzdckVar.a(j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized long zzT() {
        zzdck zzdckVar;
        zzdmx zzdmxVar = this.j;
        if (zzdmxVar == null || (zzdckVar = zzdmxVar.j) == null) {
            return 0L;
        }
        return zzdckVar.a.get();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final IObjectWrapper zza() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzb() {
        Preconditions.e("destroy must be called on the main UI thread.");
        zzdmx zzdmxVar = this.j;
        if (zzdmxVar != null) {
            zzdeo zzdeoVar = zzdmxVar.c;
            zzdeoVar.getClass();
            zzdeoVar.p0(new qc4(null, 4));
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzc() {
        Preconditions.e("isLoaded must be called on the main UI thread.");
        return E4();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzd(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        boolean z;
        try {
            if (!zzmVar.zzb()) {
                if (((Boolean) zzblf.i.c()).booleanValue()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Oc)).booleanValue()) {
                        z = true;
                        if (this.e.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Pc)).intValue() || !z) {
                            Preconditions.e("loadAd must be called on the main UI thread.");
                        }
                    }
                }
                z = false;
                if (this.e.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Pc)).intValue()) {
                }
                Preconditions.e("loadAd must be called on the main UI thread.");
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            Context context = this.b;
            if (com.google.android.gms.ads.internal.util.zzs.zzK(context) && zzmVar.zzs == null) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzf("Failed to load the ad because app ID is missing.");
                zzeua zzeuaVar = this.f;
                if (zzeuaVar != null) {
                    zzeuaVar.i0(zzfmy.d(4, null, null));
                }
            } else if (!E4()) {
                zzfmt.b(context, zzmVar.zzf);
                this.j = null;
                return this.c.a(zzmVar, this.d, new zzfiz(this.a), new ohn(this, 16));
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzdU(com.google.android.gms.ads.internal.client.zzcl zzclVar) {
        Preconditions.e("setAppEventListener must be called on the main UI thread.");
        this.f.A(zzclVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zze() {
        Preconditions.e("pause must be called on the main UI thread.");
        zzdmx zzdmxVar = this.j;
        if (zzdmxVar != null) {
            zzdeo zzdeoVar = zzdmxVar.c;
            zzdeoVar.getClass();
            zzdeoVar.p0(new fl5(null, false));
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzf() {
        Preconditions.e("resume must be called on the main UI thread.");
        zzdmx zzdmxVar = this.j;
        if (zzdmxVar != null) {
            zzdeo zzdeoVar = zzdmxVar.c;
            zzdeoVar.getClass();
            zzdeoVar.p0(new w00(null, 3));
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzg(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        Preconditions.e("setAdListener must be called on the main UI thread.");
        this.f.a.set(zzbhVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzi(com.google.android.gms.ads.internal.client.zzby zzbyVar) {
        Preconditions.e("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzj() {
        Preconditions.e("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzk() {
        Preconditions.e("showInterstitial must be called on the main UI thread.");
        if (this.j == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi("Interstitial can not be shown before loaded.");
            this.f.t(zzfmy.d(9, null, null));
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.L3)).booleanValue()) {
                this.h.b.zzi(new Throwable().getStackTrace());
            }
            this.j.c(null, this.k);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzr zzm() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzq() {
        zzdmx zzdmxVar = this.j;
        if (zzdmxVar == null) {
            return null;
        }
        return zzdmxVar.f.a;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzr() {
        zzdmx zzdmxVar = this.j;
        if (zzdmxVar == null) {
            return null;
        }
        return zzdmxVar.f.a;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized com.google.android.gms.ads.internal.client.zzdx zzs() {
        zzdmx zzdmxVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.O7)).booleanValue() && (zzdmxVar = this.j) != null) {
            return zzdmxVar.f;
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzt() {
        return this.d;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzcl zzu() {
        com.google.android.gms.ads.internal.client.zzcl zzclVar;
        zzeua zzeuaVar = this.f;
        synchronized (zzeuaVar) {
            zzclVar = (com.google.android.gms.ads.internal.client.zzcl) zzeuaVar.b.get();
        }
        return zzclVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzbh zzv() {
        return this.f.c();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzw(zzbkb zzbkbVar) {
        Preconditions.e("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.c.f = zzbkbVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzz() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzl() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzF(com.google.android.gms.ads.internal.client.zzfw zzfwVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(zzee zzeeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(com.google.android.gms.ads.internal.client.zzx zzxVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(zzbhc zzbhcVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzX(com.google.android.gms.ads.internal.client.zzcp zzcpVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzn(com.google.android.gms.ads.internal.client.zzr zzrVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzo(zzcac zzcacVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzx(com.google.android.gms.ads.internal.client.zzbe zzbeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzp(zzcaf zzcafVar, String str) {
    }
}
