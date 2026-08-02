package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzee;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.ewm;
import defpackage.fl5;
import defpackage.qc4;
import defpackage.w00;
import java.util.Collections;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzete extends com.google.android.gms.ads.internal.client.zzbt implements zzdgl {
    public final Context a;
    public final zzfhq b;
    public final String c;
    public final zzeua d;
    public com.google.android.gms.ads.internal.client.zzr e;
    public final zzflv f;
    public final VersionInfoParcel g;
    public final zzeaj h;
    public zzcwd i;

    public zzete(Context context, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, zzfhq zzfhqVar, zzeua zzeuaVar, VersionInfoParcel versionInfoParcel, zzeaj zzeajVar) {
        this.a = context;
        this.b = zzfhqVar;
        this.e = zzrVar;
        this.c = str;
        this.d = zzeuaVar;
        this.f = zzfhqVar.k;
        this.g = versionInfoParcel;
        this.h = zzeajVar;
        zzfhqVar.h.n0(this, zzfhqVar.b);
    }

    public final synchronized boolean E4(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        try {
            if (F4()) {
                Preconditions.e("loadAd must be called on the main UI thread.");
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            Context context = this.a;
            if (!com.google.android.gms.ads.internal.util.zzs.zzK(context) || zzmVar.zzs != null) {
                zzfmt.b(context, zzmVar.zzf);
                return this.b.a(zzmVar, this.c, null, new ewm(this, 21));
            }
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzf("Failed to load the ad because app ID is missing.");
            zzeua zzeuaVar = this.d;
            if (zzeuaVar != null) {
                zzeuaVar.i0(zzfmy.d(4, null, null));
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean F4() {
        boolean z;
        if (((Boolean) zzblf.f.c()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Oc)).booleanValue()) {
                z = true;
                return this.g.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Pc)).intValue() || !z;
            }
        }
        z = false;
        if (this.g.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Pc)).intValue()) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgl
    public final synchronized void b() {
        boolean zzab;
        int i;
        try {
            Object parent = this.b.f.getParent();
            if (parent instanceof View) {
                View view = (View) parent;
                com.google.android.gms.ads.internal.zzt.zzc();
                zzab = com.google.android.gms.ads.internal.util.zzs.zzab(view, view.getContext());
            } else {
                zzab = false;
            }
            if (!zzab) {
                zzfhq zzfhqVar = this.b;
                zzdiv zzdivVar = zzfhqVar.j;
                zzdgq zzdgqVar = zzfhqVar.h;
                synchronized (zzdivVar) {
                    i = zzdivVar.a;
                }
                zzdgqVar.q0(i);
                return;
            }
            zzflv zzflvVar = this.f;
            com.google.android.gms.ads.internal.client.zzr zzrVar = zzflvVar.b;
            zzcwd zzcwdVar = this.i;
            if (zzcwdVar != null && zzflvVar.q) {
                zzrVar = zzfmc.a(this.a, Collections.singletonList(zzcwdVar.g()));
            }
            synchronized (this) {
                zzflv zzflvVar2 = this.f;
                zzflvVar2.b = zzrVar;
                zzflvVar2.q = this.e.zzn;
                zzflvVar.p = true;
                try {
                    E4(zzflvVar.a);
                } catch (RemoteException unused) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzi("Failed to refresh the banner ad.");
                }
                this.f.p = false;
            }
            return;
        } catch (Throwable th) {
            throw th;
        }
        throw th;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzA() {
        return this.b.b();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized com.google.android.gms.ads.internal.client.zzea zzE() {
        Preconditions.e("getVideoController must be called from the main thread.");
        zzcwd zzcwdVar = this.i;
        if (zzcwdVar == null) {
            return null;
        }
        return zzcwdVar.e();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzF(com.google.android.gms.ads.internal.client.zzfw zzfwVar) {
        try {
            if (F4()) {
                Preconditions.e("setVideoOptions must be called on the main UI thread.");
            }
            this.f.d = zzfwVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgl
    public final synchronized void zzL() {
        boolean zzab;
        int i;
        zzfhq zzfhqVar = this.b;
        Object parent = zzfhqVar.f.getParent();
        if (parent instanceof View) {
            View view = (View) parent;
            com.google.android.gms.ads.internal.zzt.zzc();
            zzab = com.google.android.gms.ads.internal.util.zzs.zzab(view, view.getContext());
        } else {
            zzab = false;
        }
        if (zzab) {
            zzfhqVar.c();
            return;
        }
        zzdiv zzdivVar = zzfhqVar.j;
        zzdgq zzdgqVar = zzfhqVar.h;
        synchronized (zzdivVar) {
            i = zzdivVar.b;
        }
        zzdgqVar.r0(i);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzO(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        if (F4()) {
            Preconditions.e("setPaidEventListener must be called on the main UI thread.");
        }
        try {
            if (!zzdqVar.zzf()) {
                this.h.b();
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zze("Error in making CSI ping for reporting paid event callback", e);
        }
        this.d.c.set(zzdqVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzS(long j) {
        zzdck zzdckVar;
        this.f.u.set(j);
        zzcwd zzcwdVar = this.i;
        if (zzcwdVar == null || (zzdckVar = zzcwdVar.j) == null) {
            return;
        }
        zzdckVar.a(j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized long zzT() {
        zzdck zzdckVar;
        zzcwd zzcwdVar = this.i;
        return (zzcwdVar == null || (zzdckVar = zzcwdVar.j) == null) ? this.f.u.get() : zzdckVar.a.get();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzX(com.google.android.gms.ads.internal.client.zzcp zzcpVar) {
        Preconditions.e("setCorrelationIdProvider must be called on the main UI thread");
        this.f.x = zzcpVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final IObjectWrapper zza() {
        if (F4()) {
            Preconditions.e("getAdFrame must be called on the main UI thread.");
        }
        return new ObjectWrapper(this.b.f);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003f, B:12:0x0043, B:19:0x003a), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0054 A[DONT_GENERATE] */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzb() {
        zzcwd zzcwdVar;
        try {
            if (((Boolean) zzblf.e.c()).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Lc)).booleanValue()) {
                    if (this.g.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Qc)).intValue()) {
                    }
                    zzcwdVar = this.i;
                    if (zzcwdVar == null) {
                        zzdeo zzdeoVar = zzcwdVar.c;
                        zzdeoVar.getClass();
                        zzdeoVar.p0(new qc4(null, 4));
                        return;
                    }
                    return;
                }
            }
            Preconditions.e("destroy must be called on the main UI thread.");
            zzcwdVar = this.i;
            if (zzcwdVar == null) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzc() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzd(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        com.google.android.gms.ads.internal.client.zzr zzrVar = this.e;
        synchronized (this) {
            zzflv zzflvVar = this.f;
            zzflvVar.b = zzrVar;
            zzflvVar.q = this.e.zzn;
        }
        return E4(zzmVar);
        return E4(zzmVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzdU(com.google.android.gms.ads.internal.client.zzcl zzclVar) {
        if (F4()) {
            Preconditions.e("setAppEventListener must be called on the main UI thread.");
        }
        this.d.A(zzclVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003f, B:12:0x0043, B:19:0x003a), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0054 A[DONT_GENERATE] */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zze() {
        zzcwd zzcwdVar;
        try {
            if (((Boolean) zzblf.g.c()).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Mc)).booleanValue()) {
                    if (this.g.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Qc)).intValue()) {
                    }
                    zzcwdVar = this.i;
                    if (zzcwdVar == null) {
                        zzdeo zzdeoVar = zzcwdVar.c;
                        zzdeoVar.getClass();
                        zzdeoVar.p0(new fl5(null, false));
                        return;
                    }
                    return;
                }
            }
            Preconditions.e("pause must be called on the main UI thread.");
            zzcwdVar = this.i;
            if (zzcwdVar == null) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003f, B:12:0x0043, B:19:0x003a), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0054 A[DONT_GENERATE] */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzf() {
        zzcwd zzcwdVar;
        try {
            if (((Boolean) zzblf.h.c()).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Kc)).booleanValue()) {
                    if (this.g.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Qc)).intValue()) {
                    }
                    zzcwdVar = this.i;
                    if (zzcwdVar == null) {
                        zzdeo zzdeoVar = zzcwdVar.c;
                        zzdeoVar.getClass();
                        zzdeoVar.p0(new w00(null, 3));
                        return;
                    }
                    return;
                }
            }
            Preconditions.e("resume must be called on the main UI thread.");
            zzcwdVar = this.i;
            if (zzcwdVar == null) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzg(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        if (F4()) {
            Preconditions.e("setAdListener must be called on the main UI thread.");
        }
        this.d.a.set(zzbhVar);
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
    public final synchronized void zzl() {
        Preconditions.e("recordManualImpression must be called on the main UI thread.");
        zzcwd zzcwdVar = this.i;
        if (zzcwdVar != null) {
            zzcwdVar.j();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized com.google.android.gms.ads.internal.client.zzr zzm() {
        Preconditions.e("getAdSize must be called on the main UI thread.");
        zzcwd zzcwdVar = this.i;
        if (zzcwdVar != null) {
            return zzfmc.a(this.a, Collections.singletonList(zzcwdVar.f()));
        }
        return this.f.b;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzn(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        Preconditions.e("setAdSize must be called on the main UI thread.");
        this.f.b = zzrVar;
        this.e = zzrVar;
        zzcwd zzcwdVar = this.i;
        if (zzcwdVar != null) {
            zzcwdVar.d(this.b.f, zzrVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzq() {
        zzcwd zzcwdVar = this.i;
        if (zzcwdVar == null) {
            return null;
        }
        return zzcwdVar.f.a;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzr() {
        zzcwd zzcwdVar = this.i;
        if (zzcwdVar == null) {
            return null;
        }
        return zzcwdVar.f.a;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized com.google.android.gms.ads.internal.client.zzdx zzs() {
        zzcwd zzcwdVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.O7)).booleanValue() && (zzcwdVar = this.i) != null) {
            return zzcwdVar.f;
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzt() {
        return this.c;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzcl zzu() {
        com.google.android.gms.ads.internal.client.zzcl zzclVar;
        zzeua zzeuaVar = this.d;
        synchronized (zzeuaVar) {
            zzclVar = (com.google.android.gms.ads.internal.client.zzcl) zzeuaVar.b.get();
        }
        return zzclVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzbh zzv() {
        return this.d.c();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzw(zzbkb zzbkbVar) {
        Preconditions.e("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.b.g = zzbkbVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzx(com.google.android.gms.ads.internal.client.zzbe zzbeVar) {
        if (F4()) {
            Preconditions.e("setAdListener must be called on the main UI thread.");
        }
        zzeue zzeueVar = this.b.e;
        synchronized (zzeueVar) {
            zzeueVar.a = zzbeVar;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzy(boolean z) {
        try {
            if (F4()) {
                Preconditions.e("setManualImpressionsEnabled must be called from the main thread.");
            }
            this.f.e = z;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzz() {
        zzcwd zzcwdVar = this.i;
        if (zzcwdVar != null) {
            if (zzcwdVar.b.q0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzk() {
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
    public final void zzH(com.google.android.gms.ads.internal.client.zzx zzxVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(zzbhc zzbhcVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzJ(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzQ(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzR(zzcs zzcsVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzo(zzcac zzcacVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzp(zzcaf zzcafVar, String str) {
    }
}
