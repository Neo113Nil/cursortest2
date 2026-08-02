package com.google.android.gms.internal.auth;

import android.util.Log;
import g.C6594f;

/* loaded from: classes9.dex */
final class zzcx extends zzdc {
    zzcx(zzcz zzczVar, String str, Double d11, boolean z11) {
        super(zzczVar, str, d11, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    final /* synthetic */ Object zza(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            StringBuilder b11 = C6594f.b("Invalid double value for ", this.zzc, ": ");
            b11.append((String) obj);
            Log.e("PhenotypeFlag", b11.toString());
            return null;
        }
    }
}
