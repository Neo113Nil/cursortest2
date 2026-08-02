package com.google.android.gms.internal.ads;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes4.dex */
public final class zzilv extends zzima {
    final String zza;

    public zzilv(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzima
    public final void zza(String str) {
        String str2 = this.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
        sb.append(str2);
        sb.append(":");
        sb.append(str);
        Log.d("isoparser", sb.toString());
    }
}
