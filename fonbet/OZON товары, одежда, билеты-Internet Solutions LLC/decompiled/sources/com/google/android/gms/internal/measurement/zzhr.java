package com.google.android.gms.internal.measurement;

import android.util.Log;
import g.C6594f;

/* loaded from: classes.dex */
final class zzhr extends zzhy {
    zzhr(zzhv zzhvVar, String str, Long l11, boolean z11) {
        super(zzhvVar, str, l11, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzhy
    final /* bridge */ /* synthetic */ Object zza(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            StringBuilder b11 = C6594f.b("Invalid long value for ", zzc(), ": ");
            b11.append((String) obj);
            Log.e("PhenotypeFlag", b11.toString());
            return null;
        }
    }
}
