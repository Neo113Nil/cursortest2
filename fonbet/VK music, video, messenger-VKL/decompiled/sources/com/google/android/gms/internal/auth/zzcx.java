package com.google.android.gms.internal.auth;

import android.util.Log;
import xsna.t33;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes12.dex */
final class zzcx extends zzdc {
    public zzcx(zzcz zzczVar, String str, Double d, boolean z) {
        super(zzczVar, str, d, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    public final /* synthetic */ Object zza(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            StringBuilder a = t33.a("Invalid double value for ", this.zzc, ": ");
            a.append((String) obj);
            Log.e("PhenotypeFlag", a.toString());
            return null;
        }
    }
}
