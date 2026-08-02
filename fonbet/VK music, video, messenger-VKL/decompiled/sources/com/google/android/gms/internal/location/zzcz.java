package com.google.android.gms.internal.location;

import android.location.Location;
import xsna.ehz;
import xsna.qp01;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes12.dex */
final class zzcz extends qp01 {
    private final zzcs zza;

    public zzcz(zzcs zzcsVar) {
        this.zza = zzcsVar;
    }

    @Override // xsna.sq01
    public final void zzd(Location location) {
        this.zza.zza().c(new zzcx(this, location));
    }

    @Override // xsna.sq01
    public final void zze() {
        this.zza.zza().c(new zzcy(this));
    }

    public final zzcz zzf(ehz ehzVar) {
        this.zza.zzc(ehzVar);
        return this;
    }

    public final void zzg() {
        this.zza.zza().b = null;
    }
}
