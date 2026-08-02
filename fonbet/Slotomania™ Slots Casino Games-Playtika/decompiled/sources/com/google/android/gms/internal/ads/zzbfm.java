package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzbfm {
    final long zza;
    final String zzb;
    final int zzc;

    zzbfm(long j, String str, int i) {
        this.zza = j;
        this.zzb = str;
        this.zzc = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbfm)) {
            return false;
        }
        zzbfm zzbfmVar = (zzbfm) obj;
        return zzbfmVar.zza == this.zza && zzbfmVar.zzc == this.zzc;
    }

    public final int hashCode() {
        return (int) this.zza;
    }
}
