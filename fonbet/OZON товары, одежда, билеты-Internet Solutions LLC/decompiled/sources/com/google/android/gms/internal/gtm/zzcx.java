package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* loaded from: classes9.dex */
public final class zzcx extends zzbs {
    @VisibleForTesting
    zzcx(zzbv zzbvVar) {
        super(zzbvVar);
    }

    public final zzba zza() {
        zzW();
        return zzq().zzd();
    }

    public final String zzb() {
        zzW();
        zzba zza = zza();
        int i11 = zza.zza;
        int i12 = zza.zzb;
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append(i11);
        sb2.append("x");
        sb2.append(i12);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    protected final void zzd() {
    }
}
