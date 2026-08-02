package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
public final class zzga implements zzao {
    public final long zza;
    public final long zzb;
    public final long zzc;

    public zzga(long j, long j2, long j3) {
        this.zza = j;
        this.zzb = j2;
        this.zzc = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzga)) {
            return false;
        }
        zzga zzgaVar = (zzga) obj;
        return this.zza == zzgaVar.zza && this.zzb == zzgaVar.zzb && this.zzc == zzgaVar.zzc;
    }

    public final int hashCode() {
        return ((((Long.hashCode(this.zza) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Long.hashCode(this.zzb)) * 31) + Long.hashCode(this.zzc);
    }

    public final String toString() {
        long j = this.zza;
        int length = String.valueOf(j).length();
        long j2 = this.zzb;
        int length2 = String.valueOf(j2).length();
        long j3 = this.zzc;
        StringBuilder sb = new StringBuilder(length + 48 + length2 + 12 + String.valueOf(j3).length());
        sb.append("Mp4Timestamp: creation time=");
        sb.append(j);
        sb.append(", modification time=");
        sb.append(j2);
        sb.append(", timescale=");
        sb.append(j3);
        return sb.toString();
    }
}
