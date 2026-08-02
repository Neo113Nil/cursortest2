package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.InterfaceC3126e;
import com.google.android.gms.location.LocationSettingsResult;

/* loaded from: classes2.dex */
final class zzcr extends zzr {
    final /* synthetic */ InterfaceC3126e zza;

    public zzcr(InterfaceC3126e interfaceC3126e) {
        this.zza = interfaceC3126e;
    }

    @Override // com.google.android.gms.internal.location.zzs
    public final void zzb(LocationSettingsResult locationSettingsResult) {
        this.zza.setResult(locationSettingsResult);
    }
}
