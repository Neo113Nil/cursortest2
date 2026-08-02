package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcvy extends zzbgy {
    public final zzcvx b;
    public final com.google.android.gms.ads.internal.client.zzbu c;
    public final zzfhc d;
    public boolean e;
    public final zzeaj f;

    public zzcvy(zzcvx zzcvxVar, com.google.android.gms.ads.internal.client.zzbu zzbuVar, zzfhc zzfhcVar, zzeaj zzeajVar) {
        this.b = zzcvxVar;
        this.c = zzbuVar;
        this.d = zzfhcVar;
        this.f = zzeajVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.v1)).booleanValue() && Build.VERSION.SDK_INT >= 35) {
            this.e = true;
        } else {
            this.e = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.w1)).booleanValue();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void L1(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        Preconditions.e("setOnPaidEventListener must be called on the main UI thread.");
        zzfhc zzfhcVar = this.d;
        if (zzfhcVar != null) {
            try {
                if (!zzdqVar.zzf()) {
                    this.f.b();
                }
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zze("Error in making CSI ping for reporting paid event callback", e);
            }
            zzfhcVar.g.set(zzdqVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void z0(IObjectWrapper iObjectWrapper, zzbhg zzbhgVar) {
        try {
            this.d.d.set(zzbhgVar);
            this.b.c((Activity) ObjectWrapper.Z1(iObjectWrapper), this.e);
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final com.google.android.gms.ads.internal.client.zzdx zzg() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.O7)).booleanValue()) {
            return this.b.f;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void zzh(boolean z) {
        this.e = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final String zzj() {
        try {
            return this.c.zzt();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final long zzk() {
        zzdck zzdckVar;
        zzcvx zzcvxVar = this.b;
        if (zzcvxVar == null || (zzdckVar = zzcvxVar.j) == null) {
            return 0L;
        }
        return zzdckVar.a.get();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void zzl(long j) {
        zzdck zzdckVar;
        zzcvx zzcvxVar = this.b;
        if (zzcvxVar == null || (zzdckVar = zzcvxVar.j) == null) {
            return;
        }
        zzdckVar.a(j);
    }
}
