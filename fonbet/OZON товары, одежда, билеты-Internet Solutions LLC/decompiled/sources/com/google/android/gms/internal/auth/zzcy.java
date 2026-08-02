package com.google.android.gms.internal.auth;

import android.util.Base64;
import android.util.Log;
import g.C6594f;
import java.io.IOException;

/* loaded from: classes9.dex */
final class zzcy extends zzdc {
    final /* synthetic */ zzhy zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcy(zzcz zzczVar, String str, Object obj, boolean z11, zzhy zzhyVar) {
        super(zzczVar, "getTokenRefactor__blocked_packages", obj, true, null);
        this.zza = zzhyVar;
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    final Object zza(Object obj) {
        try {
            return zzhs.zzp(Base64.decode((String) obj, 3));
        } catch (IOException | IllegalArgumentException unused) {
            StringBuilder b11 = C6594f.b("Invalid byte[] value for ", this.zzc, ": ");
            b11.append((String) obj);
            Log.e("PhenotypeFlag", b11.toString());
            return null;
        }
    }
}
