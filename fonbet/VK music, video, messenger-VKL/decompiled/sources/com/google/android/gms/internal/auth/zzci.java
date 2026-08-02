package com.google.android.gms.internal.auth;

import android.net.Uri;
import xsna.dpj0;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes12.dex */
public final class zzci {
    private final dpj0 zza;

    public zzci(dpj0 dpj0Var) {
        this.zza = dpj0Var;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        dpj0 dpj0Var;
        if (uri != null) {
            dpj0Var = (dpj0) this.zza.get(uri.toString());
        } else {
            dpj0Var = null;
        }
        if (dpj0Var == null) {
            return null;
        }
        return (String) dpj0Var.get("".concat(str3));
    }
}
