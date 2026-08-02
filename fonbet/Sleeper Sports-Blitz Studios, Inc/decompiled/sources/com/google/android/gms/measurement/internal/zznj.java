package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.1 */
/* loaded from: classes7.dex */
final class zznj implements zzns {
    final /* synthetic */ zznc zza;

    zznj(zznc zzncVar) {
        this.zza = zzncVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzns
    public final void zza(String str, String str2, Bundle bundle) {
        zzhj zzhjVar;
        zzhj zzhjVar2;
        if (!TextUtils.isEmpty(str)) {
            this.zza.zzl().zzb(new zzni(this, str, str2, bundle));
            return;
        }
        zzhjVar = this.zza.zzm;
        if (zzhjVar != null) {
            zzhjVar2 = this.zza.zzm;
            zzhjVar2.zzj().zzg().zza("AppId not known when logging event", str2);
        }
    }
}
