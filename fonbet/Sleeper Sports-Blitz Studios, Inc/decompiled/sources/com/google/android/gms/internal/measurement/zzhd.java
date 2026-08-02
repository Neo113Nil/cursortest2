package com.google.android.gms.internal.measurement;

import android.util.Log;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.1 */
/* loaded from: classes7.dex */
final class zzhd extends zzgw<Boolean> {
    @Override // com.google.android.gms.internal.measurement.zzgw
    @Nullable
    final /* synthetic */ Boolean zza(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (zzfv.zzc.matcher(str).matches()) {
                return true;
            }
            if (zzfv.zzd.matcher(str).matches()) {
                return false;
            }
        }
        Log.e("PhenotypeFlag", "Invalid boolean value for " + super.zzb() + ": " + String.valueOf(obj));
        return null;
    }

    zzhd(zzhe zzheVar, String str, Boolean bool, boolean z) {
        super(zzheVar, str, bool);
    }
}
