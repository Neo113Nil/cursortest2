package com.google.android.gms.internal.location;

import com.google.android.gms.location.LocationSettingsResult;
import xsna.ue6;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes12.dex */
final class zzcr extends zzr {
    final /* synthetic */ ue6 zza;

    public zzcr(ue6 ue6Var) {
        this.zza = ue6Var;
    }

    @Override // com.google.android.gms.internal.location.zzs
    public final void zzb(LocationSettingsResult locationSettingsResult) {
        this.zza.setResult(locationSettingsResult);
    }
}
