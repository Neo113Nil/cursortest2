package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes3.dex */
final class zzamj extends zzams {
    private zzagc zza;
    private zzami zzb;

    zzamj() {
    }

    private static boolean zzd(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.google.android.gms.internal.ads.zzams
    protected final void zza(boolean z) {
        super.zza(z);
        if (z) {
            this.zza = null;
            this.zzb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzams
    protected final long zzb(zzes zzesVar) {
        if (!zzd(zzesVar.zzi())) {
            return -1L;
        }
        int i = (zzesVar.zzi()[2] & 255) >> 4;
        if (i != 6) {
            if (i == 7) {
                i = 7;
            }
            int zzc = zzafx.zzc(zzesVar, i);
            zzesVar.zzh(0);
            return zzc;
        }
        zzesVar.zzk(4);
        zzesVar.zzO();
        int zzc2 = zzafx.zzc(zzesVar, i);
        zzesVar.zzh(0);
        return zzc2;
    }

    @Override // com.google.android.gms.internal.ads.zzams
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected final boolean zzc(zzes zzesVar, long j, zzamq zzamqVar) {
        byte[] zzi = zzesVar.zzi();
        zzagc zzagcVar = this.zza;
        if (zzagcVar == null) {
            zzagc zzagcVar2 = new zzagc(zzi, 17);
            this.zza = zzagcVar2;
            zzt zza = zzagcVar2.zzc(Arrays.copyOfRange(zzi, 9, zzesVar.zze()), null).zza();
            zza.zzn(MimeTypes.AUDIO_OGG);
            zzamqVar.zza = zza.zzO();
            return true;
        }
        if ((zzi[0] & Byte.MAX_VALUE) == 3) {
            zzagb zzc = zzafz.zzc(zzesVar);
            zzagc zze = zzagcVar.zze(zzc);
            this.zza = zze;
            this.zzb = new zzami(zze, zzc);
            return true;
        }
        if (!zzd(zzi)) {
            return true;
        }
        zzami zzamiVar = this.zzb;
        if (zzamiVar != null) {
            zzamiVar.zzd(j);
            zzamqVar.zzb = this.zzb;
        }
        zzamqVar.zza.getClass();
        return false;
    }
}
