package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes3.dex */
public final class zzaql implements zzafp {
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private long zzh;
    private zzaqh zzi;
    private zzafs zzj;
    private boolean zzk;
    private final zzfh zza = new zzfh(0);
    private final zzes zzc = new zzes(4096);
    private final SparseArray zzb = new SparseArray();
    private final zzaqi zzd = new zzaqi();

    static {
        int i = zzaqk.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final boolean zza(zzafq zzafqVar) throws IOException {
        byte[] bArr = new byte[14];
        zzafg zzafgVar = (zzafg) zzafqVar;
        zzafgVar.zzh(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        zzafgVar.zzj(bArr[13] & 7, false);
        zzafgVar.zzh(bArr, 0, 3, false);
        return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzc(zzafs zzafsVar) {
        this.zzj = zzafsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x012f  */
    @Override // com.google.android.gms.internal.ads.zzafp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzd(zzafq zzafqVar, zzagp zzagpVar) throws IOException {
        zzapm zzapoVar;
        zzafs zzafsVar = this.zzj;
        zzafsVar.getClass();
        long zzo = zzafqVar.zzo();
        if (zzo != -1) {
            zzaqi zzaqiVar = this.zzd;
            if (!zzaqiVar.zza()) {
                return zzaqiVar.zzc(zzafqVar, zzagpVar);
            }
        }
        if (!this.zzk) {
            this.zzk = true;
            zzaqi zzaqiVar2 = this.zzd;
            if (zzaqiVar2.zzd() != C.TIME_UNSET) {
                zzaqh zzaqhVar = new zzaqh(zzaqiVar2.zzb(), zzaqiVar2.zzd(), zzo);
                this.zzi = zzaqhVar;
                this.zzj.zzw(zzaqhVar.zza());
            } else {
                zzafsVar.zzw(new zzagr(zzaqiVar2.zzd(), 0L));
            }
        }
        zzaqh zzaqhVar2 = this.zzi;
        if (zzaqhVar2 != null && zzaqhVar2.zzc()) {
            return zzaqhVar2.zzd(zzafqVar, zzagpVar);
        }
        zzafqVar.zzl();
        long zzm = zzo != -1 ? zzo - zzafqVar.zzm() : -1L;
        if (zzm != -1 && zzm < 4) {
            return -1;
        }
        zzes zzesVar = this.zzc;
        if (!zzafqVar.zzh(zzesVar.zzi(), 0, 4, true)) {
            return -1;
        }
        zzesVar.zzh(0);
        int zzB = zzesVar.zzB();
        if (zzB == 441) {
            return -1;
        }
        if (zzB == 442) {
            zzafqVar.zzi(zzesVar.zzi(), 0, 10);
            zzesVar.zzh(9);
            zzafqVar.zzf((zzesVar.zzs() & 7) + 14);
            return 0;
        }
        if (zzB == 443) {
            zzafqVar.zzi(zzesVar.zzi(), 0, 2);
            zzesVar.zzh(0);
            zzafqVar.zzf(zzesVar.zzt() + 6);
            return 0;
        }
        if ((zzB >> 8) != 1) {
            zzafqVar.zzf(1);
            return 0;
        }
        int i = zzB & 255;
        SparseArray sparseArray = this.zzb;
        zzaqj zzaqjVar = (zzaqj) sparseArray.get(i);
        if (!this.zze) {
            if (zzaqjVar == null) {
                zzapm zzapmVar = null;
                if (i == 189) {
                    zzapoVar = new zzapc(null, 0, MimeTypes.VIDEO_PS);
                    this.zzf = true;
                    this.zzh = zzafqVar.zzn();
                } else if ((zzB & 224) == 192) {
                    zzapoVar = new zzapy(null, 0, MimeTypes.VIDEO_PS);
                    this.zzf = true;
                    this.zzh = zzafqVar.zzn();
                } else {
                    if ((zzB & PsExtractor.VIDEO_STREAM_MASK) == 224) {
                        zzapoVar = new zzapo(null, MimeTypes.VIDEO_PS);
                        this.zzg = true;
                        this.zzh = zzafqVar.zzn();
                    }
                    if (zzapmVar != null) {
                        zzapmVar.zzb(this.zzj, new zzara(Integer.MIN_VALUE, i, 256));
                        zzaqjVar = new zzaqj(zzapmVar, this.zza);
                        sparseArray.put(i, zzaqjVar);
                    }
                }
                zzapmVar = zzapoVar;
                if (zzapmVar != null) {
                }
            }
            boolean z = this.zzf;
            long j = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            if (z && this.zzg) {
                j = PlaybackStateCompat.ACTION_PLAY_FROM_URI + this.zzh;
            }
            if (zzafqVar.zzn() > j) {
                this.zze = true;
                this.zzj.zzv();
            }
        }
        zzafqVar.zzi(zzesVar.zzi(), 0, 2);
        zzesVar.zzh(0);
        int zzt = zzesVar.zzt() + 6;
        if (zzaqjVar == null) {
            zzafqVar.zzf(zzt);
        } else {
            zzesVar.zza(zzt);
            zzafqVar.zzc(zzesVar.zzi(), 0, zzt);
            zzesVar.zzh(6);
            zzaqjVar.zzb(zzesVar);
            zzesVar.zzf(zzesVar.zzj());
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r0 != r7) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034 A[LOOP:0: B:13:0x002c->B:15:0x0034, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzafp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zze(long j, long j2) {
        zzaqh zzaqhVar;
        int i;
        SparseArray sparseArray;
        zzfh zzfhVar = this.zza;
        if (zzfhVar.zzc() != C.TIME_UNSET) {
            long zza = zzfhVar.zza();
            if (zza != C.TIME_UNSET) {
                if (zza != 0) {
                }
            }
            zzaqhVar = this.zzi;
            i = 0;
            if (zzaqhVar != null) {
                zzaqhVar.zzb(j2);
            }
            while (true) {
                sparseArray = this.zzb;
                if (i < sparseArray.size()) {
                    return;
                }
                ((zzaqj) sparseArray.valueAt(i)).zza();
                i++;
            }
        }
        zzfhVar.zzd(j2);
        zzaqhVar = this.zzi;
        i = 0;
        if (zzaqhVar != null) {
        }
        while (true) {
            sparseArray = this.zzb;
            if (i < sparseArray.size()) {
            }
            ((zzaqj) sparseArray.valueAt(i)).zza();
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzf() {
    }
}
