package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.mxn;
import defpackage.p8o;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfku extends zzccz {
    public final zzfkq a;
    public final zzfkh b;
    public final String c;
    public final zzflp d;
    public final Context e;
    public final VersionInfoParcel f;
    public final zzbbd g;
    public final zzeaj h;
    public zzdwk i;
    public boolean j;

    public zzfku(String str, zzfkq zzfkqVar, Context context, zzfkh zzfkhVar, zzflp zzflpVar, VersionInfoParcel versionInfoParcel, zzbbd zzbbdVar, zzeaj zzeajVar) {
        this.c = str;
        this.a = zzfkqVar;
        this.b = zzfkhVar;
        this.d = zzflpVar;
        this.e = context;
        this.f = versionInfoParcel;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.v1)).booleanValue() || Build.VERSION.SDK_INT < 35) {
            this.j = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.u1)).booleanValue();
        } else {
            this.j = true;
        }
        this.g = zzbbdVar;
        this.h = zzeajVar;
    }

    public final synchronized void E4(com.google.android.gms.ads.internal.client.zzm zzmVar, zzcdh zzcdhVar, int i) {
        try {
            if (!zzmVar.zzb()) {
                boolean z = false;
                if (((Boolean) zzblf.k.c()).booleanValue()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Oc)).booleanValue()) {
                        z = true;
                    }
                }
                if (this.f.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Pc)).intValue() || !z) {
                    Preconditions.e("#008 Must be called on the main UI thread.");
                }
            }
            zzfkh zzfkhVar = this.b;
            zzfkhVar.c.set(zzcdhVar);
            com.google.android.gms.ads.internal.zzt.zzc();
            if (com.google.android.gms.ads.internal.util.zzs.zzK(this.e) && zzmVar.zzs == null) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzf("Failed to load the ad because app ID is missing.");
                zzfkhVar.i0(zzfmy.d(4, null, null));
            } else {
                if (this.i != null) {
                    return;
                }
                zzfkj zzfkjVar = new zzfkj();
                zzfkq zzfkqVar = this.a;
                zzfkqVar.h.o.a = i;
                zzfkqVar.a(zzmVar, this.c, zzfkjVar, new mxn(this, 9));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final synchronized void zza(IObjectWrapper iObjectWrapper) {
        zzj(iObjectWrapper, this.j);
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final synchronized void zzb(com.google.android.gms.ads.internal.client.zzm zzmVar, zzcdh zzcdhVar) {
        E4(zzmVar, zzcdhVar, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final synchronized void zzc(com.google.android.gms.ads.internal.client.zzm zzmVar, zzcdh zzcdhVar) {
        E4(zzmVar, zzcdhVar, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final void zzd(zzcdd zzcddVar) {
        Preconditions.e("#008 Must be called on the main UI thread.");
        this.b.d.set(zzcddVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final void zze(com.google.android.gms.ads.internal.client.zzdn zzdnVar) {
        zzfkh zzfkhVar = this.b;
        if (zzdnVar == null) {
            zzfkhVar.b.set(null);
        } else {
            zzfkhVar.b.set(new p8o(this, zzdnVar, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final Bundle zzf() {
        Bundle bundle;
        Preconditions.e("#008 Must be called on the main UI thread.");
        zzdwk zzdwkVar = this.i;
        if (zzdwkVar == null) {
            return new Bundle();
        }
        zzdfj zzdfjVar = zzdwkVar.q;
        synchronized (zzdfjVar) {
            bundle = new Bundle(zzdfjVar.b);
        }
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final synchronized void zzg(zzcdo zzcdoVar) {
        Preconditions.e("#008 Must be called on the main UI thread.");
        zzflp zzflpVar = this.d;
        zzflpVar.a = zzcdoVar.a;
        zzflpVar.b = zzcdoVar.b;
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final boolean zzh() {
        Preconditions.e("#008 Must be called on the main UI thread.");
        zzdwk zzdwkVar = this.i;
        return (zzdwkVar == null || zzdwkVar.w) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final synchronized String zzi() {
        zzdwk zzdwkVar = this.i;
        if (zzdwkVar == null) {
            return null;
        }
        return zzdwkVar.f.a;
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final synchronized void zzj(IObjectWrapper iObjectWrapper, boolean z) {
        Preconditions.e("#008 Must be called on the main UI thread.");
        if (this.i == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi("Rewarded can not be shown before loaded");
            this.b.t(zzfmy.d(9, null, null));
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.L3)).booleanValue()) {
                this.g.b.zzi(new Throwable().getStackTrace());
            }
            this.i.c((Activity) ObjectWrapper.Z1(iObjectWrapper), z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final zzccx zzk() {
        Preconditions.e("#008 Must be called on the main UI thread.");
        zzdwk zzdwkVar = this.i;
        if (zzdwkVar != null) {
            return zzdwkVar.s;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final com.google.android.gms.ads.internal.client.zzdx zzl() {
        zzdwk zzdwkVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.O7)).booleanValue() && (zzdwkVar = this.i) != null) {
            return zzdwkVar.f;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final String zzm() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final void zzn(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        Preconditions.e("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!zzdqVar.zzf()) {
                this.h.b();
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zze("Error in making CSI ping for reporting paid event callback", e);
        }
        this.b.h.set(zzdqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final synchronized void zzo(boolean z) {
        Preconditions.e("setImmersiveMode must be called on the main UI thread.");
        this.j = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final synchronized long zzp() {
        zzdck zzdckVar;
        zzdwk zzdwkVar = this.i;
        if (zzdwkVar == null || (zzdckVar = zzdwkVar.j) == null) {
            return 0L;
        }
        return zzdckVar.a.get();
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final synchronized void zzq(long j) {
        zzdck zzdckVar;
        zzdwk zzdwkVar = this.i;
        if (zzdwkVar == null || (zzdckVar = zzdwkVar.j) == null) {
            return;
        }
        zzdckVar.a(j);
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final void zzr(zzcdi zzcdiVar) {
        Preconditions.e("#008 Must be called on the main UI thread.");
        this.b.f.set(zzcdiVar);
    }
}
