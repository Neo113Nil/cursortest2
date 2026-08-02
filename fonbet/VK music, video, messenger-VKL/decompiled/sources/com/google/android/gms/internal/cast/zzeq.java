package com.google.android.gms.internal.cast;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import java.util.Objects;
import xsna.o100;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzeq extends zzeo {
    final /* synthetic */ zzer zza;

    public zzeq(zzer zzerVar) {
        Objects.requireNonNull(zzerVar);
        this.zza = zzerVar;
    }

    @Override // com.google.android.gms.internal.cast.zzeo, com.google.android.gms.internal.cast.zzey
    public final void zzd(int i, @Nullable ApiMetadata apiMetadata) throws RemoteException {
        o100 o100Var;
        int i2 = zzet.zza;
        Object[] objArr = {Integer.valueOf(i)};
        o100Var = zzet.zzb;
        o100Var.a("onError: %d", objArr);
        zzer zzerVar = this.zza;
        zzerVar.zzc.zza();
        zzerVar.setResult((zzer) new zzes(Status.h));
    }

    @Override // com.google.android.gms.internal.cast.zzeo, com.google.android.gms.internal.cast.zzey
    public final void zzf(@Nullable ApiMetadata apiMetadata) throws RemoteException {
        o100 o100Var;
        o100Var = zzet.zzb;
        o100Var.a("onDisconnected", new Object[0]);
        zzer zzerVar = this.zza;
        zzerVar.zzc.zza();
        zzerVar.setResult((zzer) new zzes(Status.f));
    }
}
