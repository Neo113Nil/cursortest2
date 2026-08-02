package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzcje implements zzhj {
    private final zzhj zza;
    private final long zzb;
    private final zzhj zzc;
    private long zzd;
    private Uri zze;

    zzcje(zzhj zzhjVar, int i, zzhj zzhjVar2) {
        this.zza = zzhjVar;
        this.zzb = i;
        this.zzc = zzhjVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        long j = this.zzd;
        long j2 = this.zzb;
        if (j < j2) {
            int zza = this.zza.zza(bArr, i, (int) Math.min(i2, j2 - j));
            long j3 = this.zzd + zza;
            this.zzd = j3;
            i3 = zza;
            j = j3;
        } else {
            i3 = 0;
        }
        if (j < j2) {
            return i3;
        }
        int zza2 = this.zzc.zza(bArr, i + i3, i2 - i3);
        int i4 = i3 + zza2;
        this.zzd += zza2;
        return i4;
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final long zzb(zzhn zzhnVar) throws IOException {
        Uri uri;
        zzhn zzhnVar2;
        Uri uri2 = zzhnVar.zza;
        this.zze = uri2;
        long j = zzhnVar.zze;
        long j2 = this.zzb;
        zzhn zzhnVar3 = null;
        if (j >= j2) {
            uri = uri2;
            zzhnVar2 = null;
        } else {
            long j3 = zzhnVar.zzf;
            long j4 = j2 - j;
            if (j3 != -1) {
                j4 = Math.min(j3, j4);
            }
            uri = uri2;
            zzhnVar2 = new zzhn(uri, j, j4, null);
        }
        long j5 = zzhnVar.zzf;
        if (j5 == -1 || j + j5 > j2) {
            zzhnVar3 = new zzhn(uri, Math.max(j2, j), j5 != -1 ? Math.min(j5, (j + j5) - j2) : -1L, null);
        }
        long zzb = zzhnVar2 != null ? this.zza.zzb(zzhnVar2) : 0L;
        long zzb2 = zzhnVar3 != null ? this.zzc.zzb(zzhnVar3) : 0L;
        this.zzd = j;
        if (zzb == -1 || zzb2 == -1) {
            return -1L;
        }
        return zzb + zzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final void zzd() throws IOException {
        this.zza.zzd();
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final void zze(zzih zzihVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzhj, com.google.android.gms.internal.ads.zzic
    public final Map zzj() {
        return zzgwc.zza();
    }
}
