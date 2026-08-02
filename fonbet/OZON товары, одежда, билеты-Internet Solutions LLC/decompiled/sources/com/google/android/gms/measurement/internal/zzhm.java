package com.google.android.gms.measurement.internal;

import android.util.Log;

/* loaded from: classes.dex */
final class zzhm implements zzeu {
    final /* synthetic */ zzgk zza;

    zzhm(zzhn zzhnVar, zzgk zzgkVar) {
        this.zza = zzgkVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzeu
    public final boolean zza() {
        return this.zza.zzL() && Log.isLoggable(this.zza.zzay().zzq(), 3);
    }
}
