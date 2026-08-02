package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes9.dex */
public final class zzpq {
    private zzpe zza;

    public final zzpe zza() {
        return this.zza;
    }

    public final zzpq zzb(zzpe zzpeVar) throws IllegalArgumentException {
        Preconditions.checkNotNull(zzpeVar);
        this.zza = zzpeVar;
        return this;
    }

    public final String zzc() {
        zzpe zzpeVar = this.zza;
        return zzpeVar == null ? "" : zzpeVar.zzb();
    }
}
