package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import xsna.ehz;
import xsna.qn01;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes12.dex */
final class zzcw extends qn01 {
    private final zzcs zza;

    public zzcw(zzcs zzcsVar) {
        this.zza = zzcsVar;
    }

    @Override // xsna.yo01
    public final void zzd(LocationAvailability locationAvailability) throws RemoteException {
        this.zza.zza().c(new zzcu(this, locationAvailability));
    }

    @Override // xsna.yo01
    public final void zze(LocationResult locationResult) throws RemoteException {
        this.zza.zza().c(new zzct(this, locationResult));
    }

    @Override // xsna.yo01
    public final void zzf() {
        this.zza.zza().c(new zzcv(this));
    }

    public final zzcw zzg(ehz ehzVar) {
        this.zza.zzc(ehzVar);
        return this;
    }

    public final void zzh() {
        this.zza.zza().b = null;
    }
}
