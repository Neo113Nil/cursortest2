package com.google.android.gms.internal.auth;

import android.util.Log;
import g.C6594f;

/* loaded from: classes9.dex */
final class zzcv extends zzdc {
    zzcv(zzcz zzczVar, String str, Long l11, boolean z11) {
        super(zzczVar, str, l11, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    final /* synthetic */ Object zza(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            StringBuilder b11 = C6594f.b("Invalid long value for ", this.zzc, ": ");
            b11.append((String) obj);
            Log.e("PhenotypeFlag", b11.toString());
            return null;
        }
    }
}
