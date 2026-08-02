package com.google.android.gms.internal.auth;

import android.net.Uri;
import z.r;

/* loaded from: classes2.dex */
public final class zzci {
    private final r zza;

    public zzci(r rVar) {
        this.zza = rVar;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        r rVar;
        if (uri != null) {
            rVar = (r) this.zza.get(uri.toString());
        } else {
            rVar = null;
        }
        if (rVar == null) {
            return null;
        }
        return (String) rVar.get("".concat(str3));
    }
}
