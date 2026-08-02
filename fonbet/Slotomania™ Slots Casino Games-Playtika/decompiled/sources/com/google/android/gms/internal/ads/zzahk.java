package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
public final class zzahk implements zzafp {
    private static final int[] zza;
    private static final int[] zzb;
    private static final byte[] zzc;
    private static final byte[] zzd;
    private final byte[] zze;
    private final zzahb zzf;
    private boolean zzg;
    private long zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private zzafs zzn;
    private zzahb zzo;
    private zzahb zzp;
    private zzags zzq;
    private long zzr;
    private boolean zzs;

    static {
        int i = zzahj.zza;
        zza = new int[]{13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
        zzb = new int[]{18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        String str = zzfk.zza;
        zzc = "#!AMR\n".getBytes(StandardCharsets.UTF_8);
        zzd = "#!AMR-WB\n".getBytes(StandardCharsets.UTF_8);
    }

    public zzahk() {
        throw null;
    }

    public zzahk(int i) {
        this.zze = new byte[1];
        this.zzk = -1;
        zzafm zzafmVar = new zzafm();
        this.zzf = zzafmVar;
        this.zzp = zzafmVar;
    }

    private final boolean zzh(zzafq zzafqVar) throws IOException {
        byte[] bArr = zzc;
        if (zzi(zzafqVar, bArr)) {
            this.zzg = false;
            zzafqVar.zzf(bArr.length);
            return true;
        }
        byte[] bArr2 = zzd;
        if (!zzi(zzafqVar, bArr2)) {
            return false;
        }
        this.zzg = true;
        zzafqVar.zzf(bArr2.length);
        return true;
    }

    private static boolean zzi(zzafq zzafqVar, byte[] bArr) throws IOException {
        zzafqVar.zzl();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        zzafqVar.zzi(bArr2, 0, length);
        return Arrays.equals(bArr2, bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003a A[Catch: EOFException -> 0x009f, TryCatch #0 {EOFException -> 0x009f, blocks: (B:13:0x0007, B:15:0x0018, B:23:0x003a, B:24:0x0043, B:30:0x003f, B:40:0x005d, B:41:0x0080, B:42:0x0081, B:43:0x009e), top: B:12:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003f A[Catch: EOFException -> 0x009f, TryCatch #0 {EOFException -> 0x009f, blocks: (B:13:0x0007, B:15:0x0018, B:23:0x003a, B:24:0x0043, B:30:0x003f, B:40:0x005d, B:41:0x0080, B:42:0x0081, B:43:0x009e), top: B:12:0x0007 }] */
    @RequiresNonNull({"realTrackOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int zzj(zzafq zzafqVar) throws IOException {
        int i;
        int i2 = this.zzj;
        if (i2 == 0) {
            try {
                zzafqVar.zzl();
                byte[] bArr = this.zze;
                zzafqVar.zzi(bArr, 0, 1);
                byte b = bArr[0];
                if ((b & 131) > 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf((int) b).length() + 38);
                    sb.append("Invalid padding bits for frame header ");
                    sb.append((int) b);
                    throw zzat.zzb(sb.toString(), null);
                }
                boolean z = this.zzg;
                int i3 = (b >> 3) & 15;
                if (z) {
                    if (i3 >= 10) {
                        if (i3 > 13) {
                        }
                    }
                    i2 = !z ? zzb[i3] : zza[i3];
                    this.zzi = i2;
                    this.zzj = i2;
                    i = this.zzk;
                    if (i == -1) {
                        this.zzk = i2;
                        i = i2;
                    }
                    if (i == i2) {
                        this.zzl++;
                    }
                }
                if (!z) {
                    if (i3 >= 12 && i3 <= 14) {
                    }
                    if (!z) {
                    }
                    this.zzi = i2;
                    this.zzj = i2;
                    i = this.zzk;
                    if (i == -1) {
                    }
                    if (i == i2) {
                    }
                }
                String str = true != z ? "NB" : "WB";
                StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 26);
                sb2.append("Illegal AMR ");
                sb2.append(str);
                sb2.append(" frame type ");
                sb2.append(i3);
                throw zzat.zzb(sb2.toString(), null);
            } catch (EOFException unused) {
                return -1;
            }
        }
        int zza2 = this.zzp.zza(zzafqVar, i2, true);
        if (zza2 == -1) {
            return -1;
        }
        int i4 = this.zzj - zza2;
        this.zzj = i4;
        if (i4 > 0) {
            return 0;
        }
        this.zzp.zze(this.zzh, 1, this.zzi, 0, null);
        this.zzh += SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final boolean zza(zzafq zzafqVar) throws IOException {
        return zzh(zzafqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzc(zzafs zzafsVar) {
        this.zzn = zzafsVar;
        zzahb zzu = zzafsVar.zzu(0, 1);
        this.zzo = zzu;
        this.zzp = zzu;
        zzafsVar.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final int zzd(zzafq zzafqVar, zzagp zzagpVar) throws IOException {
        this.zzo.getClass();
        String str = zzfk.zza;
        if (zzafqVar.zzn() == 0 && !zzh(zzafqVar)) {
            throw zzat.zzb("Could not find AMR header.", null);
        }
        if (!this.zzs) {
            this.zzs = true;
            boolean z = this.zzg;
            String str2 = MimeTypes.AUDIO_AMR_WB;
            String str3 = true != z ? MimeTypes.AUDIO_AMR : MimeTypes.AUDIO_AMR_WB;
            if (true != z) {
                str2 = MimeTypes.AUDIO_AMR_NB;
            }
            int i = true != z ? 8000 : AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND;
            int i2 = z ? zzb[8] : zza[7];
            zzahb zzahbVar = this.zzo;
            zzt zztVar = new zzt();
            zztVar.zzn(str3);
            zztVar.zzo(str2);
            zztVar.zzp(i2);
            zztVar.zzG(1);
            zztVar.zzH(i);
            zzahbVar.zzA(zztVar.zzO());
        }
        int zzj = zzj(zzafqVar);
        if (this.zzq == null) {
            zzagr zzagrVar = new zzagr(C.TIME_UNSET, 0L);
            this.zzq = zzagrVar;
            this.zzn.zzw(zzagrVar);
        }
        return zzj == -1 ? -1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zze(long j, long j2) {
        this.zzh = 0L;
        this.zzi = 0;
        this.zzj = 0;
        this.zzr = j2;
        this.zzm = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzf() {
    }
}
