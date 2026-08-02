package com.google.android.gms.internal.measurement;

import android.net.Uri;
import z.r;

/* loaded from: classes2.dex */
public final class zzjt {
    private final r zza;

    public zzjt(r rVar) {
        this.zza = rVar;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        r rVar = uri != null ? (r) this.zza.get(uri.toString()) : null;
        if (rVar == null) {
            return null;
        }
        return (String) rVar.get("".concat(str3));
    }
}
