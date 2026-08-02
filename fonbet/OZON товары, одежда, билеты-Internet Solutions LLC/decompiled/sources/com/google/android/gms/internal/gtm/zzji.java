package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: classes9.dex */
public final class zzji extends zzhi {
    private final Map<String, zzgq> zza;
    private final ExecutorService zzb;
    private final zzgr zzc;
    private final com.google.android.gms.tagmanager.zzcp zzd;
    private final Context zze;

    public zzji(Context context, com.google.android.gms.tagmanager.zzcp zzcpVar, com.google.android.gms.tagmanager.zzcg zzcgVar) {
        zzgr zzgrVar = new zzgr(context, zzcpVar, zzcgVar);
        ExecutorService zza = zzjk.zza(context);
        this.zza = new HashMap(1);
        Preconditions.checkNotNull(zzcpVar);
        this.zzd = zzcpVar;
        this.zzc = zzgrVar;
        this.zzb = zza;
        this.zze = context;
    }

    @Override // com.google.android.gms.internal.gtm.zzhj
    public final void zze() {
        this.zzb.execute(new zzjh(this));
    }

    @Override // com.google.android.gms.internal.gtm.zzhj
    public final void zzf(String str, Bundle bundle, String str2, long j11, boolean z11) throws RemoteException {
        this.zzb.execute(new zzjg(this, new zzgx(str, bundle, str2, new Date(j11), z11, this.zzd)));
    }

    @Override // com.google.android.gms.internal.gtm.zzhj
    public final void zzg(String str, String str2, String str3) throws RemoteException {
        zzh(str, str2, str3, null);
    }

    @Override // com.google.android.gms.internal.gtm.zzhj
    public final void zzh(String str, String str2, String str3, zzhg zzhgVar) throws RemoteException {
        this.zzb.execute(new zzjf(this, str, str2, str3, zzhgVar));
    }

    @Override // com.google.android.gms.internal.gtm.zzhj
    public final void zzi() throws RemoteException {
        this.zza.clear();
    }
}
