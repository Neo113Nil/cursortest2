package com.google.android.gms.internal.location;

import V9.I;
import com.google.android.gms.common.api.internal.C3140l;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* loaded from: classes2.dex */
final class zzcw extends I {
    private final zzcs zza;

    public zzcw(zzcs zzcsVar) {
        this.zza = zzcsVar;
    }

    @Override // V9.J
    public final void zzd(LocationAvailability locationAvailability) {
        this.zza.zza().c(new zzcu(this, locationAvailability));
    }

    @Override // V9.J
    public final void zze(LocationResult locationResult) {
        this.zza.zza().c(new zzct(this, locationResult));
    }

    @Override // V9.J
    public final void zzf() {
        this.zza.zza().c(new zzcv(this));
    }

    public final zzcw zzg(C3140l c3140l) {
        this.zza.zzc(c3140l);
        return this;
    }

    public final void zzh() {
        this.zza.zza().a();
    }
}
