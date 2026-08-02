package com.google.android.gms.internal.measurement;

import android.util.Log;
import g.C6594f;

/* loaded from: classes.dex */
final class zzht extends zzhy {
    zzht(zzhv zzhvVar, String str, Double d11, boolean z11) {
        super(zzhvVar, "measurement.test.double_flag", d11, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzhy
    final /* bridge */ /* synthetic */ Object zza(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            StringBuilder b11 = C6594f.b("Invalid double value for ", zzc(), ": ");
            b11.append((String) obj);
            Log.e("PhenotypeFlag", b11.toString());
            return null;
        }
    }
}
