package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes3.dex */
final class zzamp extends zzams {
    private static final byte[] zza = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] zzb = {79, 112, 117, 115, 84, 97, 103, 115};
    private boolean zzc;

    zzamp() {
    }

    public static boolean zzd(zzes zzesVar) {
        return zzk(zzesVar, zza);
    }

    private static boolean zzk(zzes zzesVar, byte[] bArr) {
        if (zzesVar.zzd() < 8) {
            return false;
        }
        int zzg = zzesVar.zzg();
        byte[] bArr2 = new byte[8];
        zzesVar.zzm(bArr2, 0, 8);
        zzesVar.zzh(zzg);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzams
    protected final void zza(boolean z) {
        super.zza(z);
        if (z) {
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzams
    protected final long zzb(zzes zzesVar) {
        return zzi(zzgu.zzd(zzesVar.zzi()));
    }

    @Override // com.google.android.gms.internal.ads.zzams
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected final boolean zzc(zzes zzesVar, long j, zzamq zzamqVar) throws zzat {
        if (zzk(zzesVar, zza)) {
            byte[] copyOf = Arrays.copyOf(zzesVar.zzi(), zzesVar.zze());
            int i = copyOf[9] & 255;
            List zza2 = zzgu.zza(copyOf);
            if (zzamqVar.zza != null) {
                return true;
            }
            zzt zztVar = new zzt();
            zztVar.zzn(MimeTypes.AUDIO_OGG);
            zztVar.zzo(MimeTypes.AUDIO_OPUS);
            zztVar.zzG(i);
            zztVar.zzH(OpusUtil.SAMPLE_RATE);
            zztVar.zzr(zza2);
            zzamqVar.zza = zztVar.zzO();
            return true;
        }
        if (!zzk(zzesVar, zzb)) {
            zzamqVar.zza.getClass();
            return false;
        }
        zzamqVar.zza.getClass();
        if (this.zzc) {
            return true;
        }
        this.zzc = true;
        zzesVar.zzk(8);
        zzap zzc = zzahh.zzc(zzgvz.zzr(zzahh.zzb(zzesVar, false, false).zza));
        if (zzc == null) {
            return true;
        }
        zzt zza3 = zzamqVar.zza.zza();
        zza3.zzl(zzc.zzf(zzamqVar.zza.zzl));
        zzamqVar.zza = zza3.zzO();
        return true;
    }
}
