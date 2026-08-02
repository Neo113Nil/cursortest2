package com.google.android.gms.internal.auth;

import android.util.Log;
import g.C6594f;

/* loaded from: classes9.dex */
final class zzcw extends zzdc {
    zzcw(zzcz zzczVar, String str, Boolean bool, boolean z11) {
        super(zzczVar, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.auth.zzdc
    final /* synthetic */ Object zza(Object obj) {
        if (zzcb.zzc.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (zzcb.zzd.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        StringBuilder b11 = C6594f.b("Invalid boolean value for ", this.zzc, ": ");
        b11.append((String) obj);
        Log.e("PhenotypeFlag", b11.toString());
        return null;
    }
}
