package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes9.dex */
public final class zznq implements zzjt {
    private final Context zza;

    public zznq(Context context) {
        this.zza = (Context) Preconditions.checkNotNull(context);
    }

    @Override // com.google.android.gms.internal.gtm.zzjt
    public final zzqw<?> zzd(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        String networkOperatorName;
        Preconditions.checkArgument(zzqwVarArr != null);
        Preconditions.checkArgument(zzqwVarArr.length == 0);
        TelephonyManager telephonyManager = (TelephonyManager) this.zza.getSystemService("phone");
        zzra zzraVar = zzra.zze;
        return (telephonyManager == null || (networkOperatorName = telephonyManager.getNetworkOperatorName()) == null) ? zzraVar : new zzrh(networkOperatorName);
    }
}
