package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzatb;
import com.google.android.gms.internal.ads.zzatg;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzbg implements zzatb {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbi zzb;

    zzbg(zzbl zzblVar, String str, zzbi zzbiVar) {
        this.zza = str;
        this.zzb = zzbiVar;
        Objects.requireNonNull(zzblVar);
    }

    @Override // com.google.android.gms.internal.ads.zzatb
    public final void zza(zzatg zzatgVar) {
        String str = this.zza;
        String zzatgVar2 = zzatgVar.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(zzatgVar2).length());
        sb.append("Failed to load URL: ");
        sb.append(str);
        sb.append("\n");
        sb.append(zzatgVar2);
        String sb2 = sb.toString();
        int i = zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2);
        this.zzb.zza((Object) null);
    }
}
