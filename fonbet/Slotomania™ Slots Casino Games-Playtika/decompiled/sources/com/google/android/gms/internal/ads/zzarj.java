package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.nio.ByteOrder;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes3.dex */
public final class zzarj implements zzafp {
    private zzafs zza;
    private zzahb zzb;
    private zzarg zze;
    private int zzc = 0;
    private long zzd = -1;
    private int zzf = -1;
    private long zzg = -1;

    static {
        int i = zzari.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final boolean zza(zzafq zzafqVar) throws IOException {
        return zzarm.zza(zzafqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzc(zzafs zzafsVar) {
        this.zza = zzafsVar;
        this.zzb = zzafsVar.zzu(0, 1);
        zzafsVar.zzv();
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0100, code lost:
    
        if (r1 != 65534) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0107, code lost:
    
        if (r2 == 32) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0124  */
    @Override // com.google.android.gms.internal.ads.zzafp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzd(zzafq zzafqVar, zzagp zzagpVar) throws IOException {
        int i;
        this.zzb.getClass();
        String str = zzfk.zza;
        int i2 = this.zzc;
        int i3 = 4;
        if (i2 == 0) {
            zzgsw.zzi(zzafqVar.zzn() == 0);
            int i4 = this.zzf;
            if (i4 != -1) {
                zzafqVar.zzf(i4);
                this.zzc = 4;
            } else {
                if (!zzarm.zza(zzafqVar)) {
                    throw zzat.zzb("Unsupported or unrecognized wav file type.", null);
                }
                zzafqVar.zzf((int) (zzafqVar.zzm() - zzafqVar.zzn()));
                this.zzc = 1;
            }
            return 0;
        }
        long j = -1;
        if (i2 == 1) {
            int i5 = zzarm.zza;
            zzes zzesVar = new zzes(8);
            zzarl zza = zzarl.zza(zzafqVar, zzesVar);
            if (zza.zza != 1685272116) {
                zzafqVar.zzl();
            } else {
                zzafqVar.zzk(8);
                zzesVar.zzh(0);
                zzafqVar.zzi(zzesVar.zzi(), 0, 8);
                j = zzesVar.zzE();
                zzafqVar.zzf(((int) zza.zzb) + 8);
            }
            this.zzd = j;
            this.zzc = 2;
            return 0;
        }
        if (i2 == 2) {
            zzark zzb = zzarm.zzb(zzafqVar);
            int i6 = zzb.zza;
            if (i6 == 17) {
                this.zze = new zzarf(this.zza, this.zzb, zzb);
            } else if (i6 == 6) {
                this.zze = new zzarh(this.zza, this.zzb, zzb, MimeTypes.AUDIO_ALAW, -1);
            } else if (i6 == 7) {
                this.zze = new zzarh(this.zza, this.zzb, zzb, MimeTypes.AUDIO_MLAW, -1);
            } else {
                int i7 = zzb.zze;
                if (i6 != 1) {
                    if (i6 != 3) {
                    }
                    i = 0;
                    if (i != 0) {
                        StringBuilder sb = new StringBuilder(String.valueOf(i6).length() + 29);
                        sb.append("Unsupported WAV format type: ");
                        sb.append(i6);
                        throw zzat.zzc(sb.toString());
                    }
                    this.zze = new zzarh(this.zza, this.zzb, zzb, MimeTypes.AUDIO_RAW, i);
                }
                i3 = zzfk.zzB(i7, ByteOrder.LITTLE_ENDIAN);
                i = i3;
                if (i != 0) {
                }
            }
            this.zzc = 3;
            return 0;
        }
        if (i2 != 3) {
            zzgsw.zzi(this.zzg != -1);
            long zzn = this.zzg - zzafqVar.zzn();
            zzarg zzargVar = this.zze;
            zzargVar.getClass();
            return zzargVar.zzc(zzafqVar, zzn) ? -1 : 0;
        }
        Pair zzc = zzarm.zzc(zzafqVar);
        this.zzf = ((Long) zzc.first).intValue();
        long longValue = ((Long) zzc.second).longValue();
        long j2 = this.zzd;
        if (j2 != -1 && longValue == 4294967295L) {
            longValue = j2;
        }
        long j3 = this.zzf + longValue;
        this.zzg = j3;
        long zzo = zzafqVar.zzo();
        if (zzo != -1 && j3 > zzo) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(j3).length() + 29 + String.valueOf(zzo).length());
            sb2.append("Data exceeds input length: ");
            sb2.append(j3);
            sb2.append(", ");
            sb2.append(zzo);
            zzef.zzc("WavExtractor", sb2.toString());
            this.zzg = zzo;
            j3 = zzo;
        }
        zzarg zzargVar2 = this.zze;
        zzargVar2.getClass();
        zzargVar2.zzb(this.zzf, j3);
        this.zzc = 4;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zze(long j, long j2) {
        this.zzc = j == 0 ? 0 : 4;
        zzarg zzargVar = this.zze;
        if (zzargVar != null) {
            zzargVar.zza(j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzf() {
    }
}
