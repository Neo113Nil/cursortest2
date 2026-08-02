package com.google.android.gms.internal.measurement;

import android.net.Uri;
import xsna.dpj0;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes12.dex */
public final class zzhh {
    private final dpj0 zza;

    public zzhh(dpj0 dpj0Var) {
        this.zza = dpj0Var;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        if (uri == null) {
            return null;
        }
        dpj0 dpj0Var = (dpj0) this.zza.get(uri.toString());
        if (dpj0Var == null) {
            return null;
        }
        return (String) dpj0Var.get("".concat(String.valueOf(str3)));
    }
}
