package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes9.dex */
final class zzlg implements zzls {
    final /* synthetic */ zzll zza;

    zzlg(zzll zzllVar) {
        this.zza = zzllVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzls
    public final void zza(String str, String str2, Bundle bundle) {
        zzgk zzgkVar;
        zzgk zzgkVar2;
        if (!TextUtils.isEmpty(str)) {
            this.zza.zzaz().zzp(new zzlf(this, str, "_err", bundle));
            return;
        }
        zzll zzllVar = this.zza;
        zzgkVar = zzllVar.zzn;
        if (zzgkVar != null) {
            zzgkVar2 = zzllVar.zzn;
            zzgkVar2.zzay().zzd().zzb("AppId not known when logging event", "_err");
        }
    }
}
