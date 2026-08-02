package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzdop extends zzblo {
    private final zzdph zza;
    private IObjectWrapper zzb;

    public zzdop(zzdph zzdphVar) {
        this.zza = zzdphVar;
    }

    private static float zzb(IObjectWrapper iObjectWrapper) {
        Drawable drawable;
        if (iObjectWrapper == null || (drawable = (Drawable) ObjectWrapper.unwrap(iObjectWrapper)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final float zze() throws RemoteException {
        zzcms zzN;
        int i;
        int i2;
        zzdph zzdphVar = this.zza;
        if (zzdphVar.zzab() != 0.0f) {
            return zzdphVar.zzab();
        }
        if (zzdphVar.zzy() != null) {
            try {
                return zzdphVar.zzy().zzm();
            } catch (RemoteException e) {
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Remote exception getting video controller aspect ratio.", e);
                return 0.0f;
            }
        }
        IObjectWrapper iObjectWrapper = this.zzb;
        if (iObjectWrapper != null) {
            return zzb(iObjectWrapper);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zznN)).booleanValue() && zzdphVar.zzU() != null && (zzN = zzdphVar.zzU().zzN()) != null && (i = zzN.zzb) >= 0 && (i2 = zzN.zza) > 0) {
            return i / i2;
        }
        zzbls zzD = zzdphVar.zzD();
        if (zzD == null) {
            return 0.0f;
        }
        float zze = (zzD.zze() == -1 || zzD.zzf() == -1) ? 0.0f : zzD.zze() / zzD.zzf();
        return zze == 0.0f ? zzb(zzD.zzb()) : zze;
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final void zzf(IObjectWrapper iObjectWrapper) {
        this.zzb = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final IObjectWrapper zzg() throws RemoteException {
        IObjectWrapper iObjectWrapper = this.zzb;
        if (iObjectWrapper != null) {
            return iObjectWrapper;
        }
        zzbls zzD = this.zza.zzD();
        if (zzD == null) {
            return null;
        }
        return zzD.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final float zzh() throws RemoteException {
        zzdph zzdphVar = this.zza;
        if (zzdphVar.zzy() != null) {
            return zzdphVar.zzy().zzj();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final float zzi() throws RemoteException {
        zzdph zzdphVar = this.zza;
        if (zzdphVar.zzy() != null) {
            return zzdphVar.zzy().zzk();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final com.google.android.gms.ads.internal.client.zzea zzj() throws RemoteException {
        return this.zza.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final boolean zzk() throws RemoteException {
        return this.zza.zzy() != null;
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final boolean zzl() throws RemoteException {
        return this.zza.zzV();
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final void zzm(zzbmx zzbmxVar) {
        zzdph zzdphVar = this.zza;
        if (zzdphVar.zzy() instanceof zzclo) {
            ((zzclo) zzdphVar.zzy()).zzv(zzbmxVar);
        }
    }
}
