package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzfjq extends zzcbf {
    private final zzfjg zza;
    private final zzfix zzb;
    private final zzfkf zzc;
    private zzdva zzd;
    private boolean zze = false;

    public zzfjq(zzfjg zzfjgVar, zzfix zzfixVar, zzfkf zzfkfVar) {
        this.zza = zzfjgVar;
        this.zzb = zzfixVar;
        this.zzc = zzfkfVar;
    }

    private final synchronized boolean zzy() {
        zzdva zzdvaVar = this.zzd;
        if (zzdvaVar != null) {
            if (!zzdvaVar.zze()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0043, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbie.zzgy)).booleanValue() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (java.util.regex.Pattern.matches(r1, r0) != false) goto L16;
     */
    @Override // com.google.android.gms.internal.ads.zzcbg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzb(zzcbk zzcbkVar) throws RemoteException {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        String str = zzcbkVar.zzb;
        String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgw);
        if (str2 != null && str != null) {
            try {
            } catch (RuntimeException e) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "NonagonUtil.isPatternMatched");
            }
        }
        if (zzy()) {
        }
        zzfiz zzfizVar = new zzfiz(null);
        this.zzd = null;
        zzfjg zzfjgVar = this.zza;
        zzfjgVar.zzj(1);
        zzfjgVar.zza(zzcbkVar.zza, zzcbkVar.zzb, zzfizVar, new zzfjo(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final synchronized void zzc() throws RemoteException {
        zzp(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzd(zzcbj zzcbjVar) throws RemoteException {
        Preconditions.checkMainThread("setRewardedVideoAdListener can only be called from the UI thread.");
        this.zzb.zzn(zzcbjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final boolean zze() throws RemoteException {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzf() {
        zzi(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzg() {
        zzj(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzh() throws RemoteException {
        zzk(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzl().zza(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final synchronized void zzj(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzl().zzb(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final synchronized void zzk(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        Context context = null;
        this.zzb.zzk(null);
        if (this.zzd != null) {
            if (iObjectWrapper != null) {
                context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
            }
            this.zzd.zzl().zzc(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final synchronized String zzl() throws RemoteException {
        zzdva zzdvaVar = this.zzd;
        if (zzdvaVar == null || zzdvaVar.zzn() == null) {
            return null;
        }
        return zzdvaVar.zzn().zze();
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final synchronized void zzm(String str) throws RemoteException {
        Preconditions.checkMainThread("setUserId must be called on the main UI thread.");
        this.zzc.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzn(com.google.android.gms.ads.internal.client.zzby zzbyVar) {
        Preconditions.checkMainThread("setAdMetadataListener can only be called from the UI thread.");
        if (zzbyVar == null) {
            this.zzb.zzk(null);
        } else {
            this.zzb.zzk(new zzfjp(this, zzbyVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final Bundle zzo() {
        Preconditions.checkMainThread("getAdMetadata can only be called from the UI thread.");
        zzdva zzdvaVar = this.zzd;
        return zzdvaVar != null ? zzdvaVar.zzg() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final synchronized void zzp(IObjectWrapper iObjectWrapper) throws RemoteException {
        Preconditions.checkMainThread("showAd must be called on the main UI thread.");
        if (this.zzd != null) {
            Activity activity = null;
            if (iObjectWrapper != null) {
                Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
                if (unwrap instanceof Activity) {
                    activity = (Activity) unwrap;
                }
            }
            this.zzd.zza(this.zze, activity);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final synchronized void zzq(String str) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setCustomData");
        this.zzc.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final synchronized void zzr(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zze = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final boolean zzs() {
        zzdva zzdvaVar = this.zzd;
        return zzdvaVar != null && zzdvaVar.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final synchronized com.google.android.gms.ads.internal.client.zzdx zzt() throws RemoteException {
        zzdva zzdvaVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhI)).booleanValue() && (zzdvaVar = this.zzd) != null) {
            return zzdvaVar.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzu(zzcbe zzcbeVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.zzb.zzq(zzcbeVar);
    }

    final /* synthetic */ zzfkf zzv() {
        return this.zzc;
    }

    final /* synthetic */ zzdva zzw() {
        return this.zzd;
    }

    final /* synthetic */ void zzx(zzdva zzdvaVar) {
        this.zzd = zzdvaVar;
    }
}
