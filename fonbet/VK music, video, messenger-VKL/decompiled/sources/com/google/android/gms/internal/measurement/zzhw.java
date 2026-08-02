package com.google.android.gms.internal.measurement;

import android.util.Log;
import xsna.t33;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes12.dex */
final class zzhw extends zzib {
    public zzhw(zzhy zzhyVar, String str, Double d, boolean z) {
        super(zzhyVar, "measurement.test.double_flag", d, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            StringBuilder a = t33.a("Invalid double value for ", zzc(), ": ");
            a.append((String) obj);
            Log.e("PhenotypeFlag", a.toString());
            return null;
        }
    }
}
