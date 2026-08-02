package com.google.android.gms.internal.location;

import V9.L;
import android.location.Location;
import com.google.android.gms.common.api.internal.C3140l;

/* loaded from: classes2.dex */
final class zzcz extends L {
    private final zzcs zza;

    public zzcz(zzcs zzcsVar) {
        this.zza = zzcsVar;
    }

    @Override // V9.M
    public final void zzd(Location location) {
        this.zza.zza().c(new zzcx(this, location));
    }

    @Override // V9.M
    public final void zze() {
        this.zza.zza().c(new zzcy(this));
    }

    public final zzcz zzf(C3140l c3140l) {
        this.zza.zzc(c3140l);
        return this;
    }

    public final void zzg() {
        this.zza.zza().a();
    }
}
