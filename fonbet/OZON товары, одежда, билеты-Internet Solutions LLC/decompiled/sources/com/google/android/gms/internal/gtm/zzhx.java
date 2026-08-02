package com.google.android.gms.internal.gtm;

import android.os.RemoteException;
import java.util.Map;

/* loaded from: classes9.dex */
final class zzhx implements zzne {
    final /* synthetic */ zzhz zza;

    /* synthetic */ zzhx(zzhz zzhzVar, zzhw zzhwVar) {
        this.zza = zzhzVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzne
    public final Object zza(String str, Map<String, Object> map) {
        try {
            return this.zza.zze.zzb(str, map);
        } catch (RemoteException e11) {
            String valueOf = String.valueOf(e11.getMessage());
            zzhl.zza(valueOf.length() != 0 ? "Error calling customEvaluator proxy:".concat(valueOf) : new String("Error calling customEvaluator proxy:"));
            return null;
        }
    }
}
