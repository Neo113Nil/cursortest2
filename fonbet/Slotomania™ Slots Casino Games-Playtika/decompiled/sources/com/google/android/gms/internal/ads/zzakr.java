package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
public final class zzakr implements zzagw {
    public final int zza;
    public final long zzb;
    public final int zzc;

    public zzakr(int i, long j, int i2) {
        this.zza = i;
        this.zzb = j;
        this.zzc = i2;
    }

    public final String toString() {
        String zzz = zzfk.zzz(this.zza);
        int length = zzz.length();
        long j = this.zzb;
        int length2 = String.valueOf(j).length();
        int i = this.zzc;
        StringBuilder sb = new StringBuilder(length + 29 + length2 + 16 + String.valueOf(i).length() + 1);
        sb.append("AtomSizeTooSmall{type=");
        sb.append(zzz);
        sb.append(", size=");
        sb.append(j);
        sb.append(", minHeaderSize=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
