package com.google.android.gms.internal.auth;

import android.net.Uri;
import androidx.collection.Z;

/* loaded from: classes9.dex */
public final class zzci {
    private final Z zza;

    zzci(Z z11) {
        this.zza = z11;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        Z z11;
        if (uri != null) {
            z11 = (Z) this.zza.get(uri.toString());
        } else {
            z11 = null;
        }
        if (z11 == null) {
            return null;
        }
        return (String) z11.get("".concat(str3));
    }
}
