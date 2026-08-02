package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdn;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.0.1 */
/* loaded from: classes7.dex */
final class zzdr extends zzdn.zzb {
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ Bundle zze;
    private final /* synthetic */ zzdn zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdr(zzdn zzdnVar, String str, String str2, Bundle bundle) {
        super(zzdnVar);
        this.zzc = str;
        this.zzd = str2;
        this.zze = bundle;
        this.zzf = zzdnVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdn.zzb
    final void zza() throws RemoteException {
        zzdc zzdcVar;
        zzdcVar = this.zzf.zzj;
        ((zzdc) Preconditions.checkNotNull(zzdcVar)).clearConditionalUserProperty(this.zzc, this.zzd, this.zze);
    }
}
