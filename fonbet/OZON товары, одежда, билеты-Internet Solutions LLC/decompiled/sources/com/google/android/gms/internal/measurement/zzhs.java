package com.google.android.gms.internal.measurement;

import android.util.Log;
import g.C6594f;

/* loaded from: classes.dex */
final class zzhs extends zzhy {
    zzhs(zzhv zzhvVar, String str, Boolean bool, boolean z11) {
        super(zzhvVar, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzhy
    final /* bridge */ /* synthetic */ Object zza(Object obj) {
        if (zzgz.zzc.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (zzgz.zzd.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        StringBuilder b11 = C6594f.b("Invalid boolean value for ", zzc(), ": ");
        b11.append((String) obj);
        Log.e("PhenotypeFlag", b11.toString());
        return null;
    }
}
