package com.google.android.gms.internal.measurement;

import android.util.Log;
import xsna.t33;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes12.dex */
final class zzhu extends zzib {
    public zzhu(zzhy zzhyVar, String str, Long l, boolean z) {
        super(zzhyVar, str, l, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            StringBuilder a = t33.a("Invalid long value for ", zzc(), ": ");
            a.append((String) obj);
            Log.e("PhenotypeFlag", a.toString());
            return null;
        }
    }
}
