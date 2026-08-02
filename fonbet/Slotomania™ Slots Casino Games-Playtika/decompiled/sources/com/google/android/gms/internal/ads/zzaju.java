package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.firebase.FirebaseError;
import java.io.IOException;
import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
final class zzaju {
    private final byte[] zza = new byte[8];
    private final ArrayDeque zzb = new ArrayDeque();
    private final zzakd zzc = new zzakd();
    private zzajv zzd;
    private int zze;
    private int zzf;
    private long zzg;

    private final long zzd(zzafq zzafqVar, int i) throws IOException {
        zzafqVar.zzc(this.zza, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (r0[i2] & 255);
        }
        return j;
    }

    public final void zza(zzajv zzajvVar) {
        this.zzd = zzajvVar;
    }

    public final void zzb() {
        this.zze = 0;
        this.zzb.clear();
        this.zzc.zza();
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x008b, code lost:
    
        if (r1 == 1) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzc(zzafq zzafqVar) throws IOException {
        String str;
        int zzd;
        int zze;
        this.zzd.getClass();
        while (true) {
            ArrayDeque arrayDeque = this.zzb;
            zzajt zzajtVar = (zzajt) arrayDeque.peek();
            if (zzajtVar != null && zzafqVar.zzn() >= zzajtVar.zzb()) {
                ((zzajw) this.zzd).zza.zzi(((zzajt) arrayDeque.pop()).zza());
                return true;
            }
            int i = this.zze;
            if (i == 0) {
                long zzb = this.zzc.zzb(zzafqVar, true, false, 4);
                if (zzb == -2) {
                    zzafqVar.zzl();
                    while (true) {
                        byte[] bArr = this.zza;
                        zzafqVar.zzi(bArr, 0, 4);
                        zzd = zzakd.zzd(bArr[0]);
                        if (zzd != -1 && zzd <= 4) {
                            zze = (int) zzakd.zze(bArr, zzd, false);
                            zzakb zzakbVar = ((zzajw) this.zzd).zza;
                            if (zze != 357149030 && zze != 524531317 && zze != 475249515) {
                                if (zze == 374648427) {
                                    zze = 374648427;
                                }
                            }
                        }
                        zzafqVar.zzf(1);
                    }
                    zzafqVar.zzf(zzd);
                    zzb = zze;
                }
                if (zzb == -1) {
                    return false;
                }
                this.zzf = (int) zzb;
                this.zze = 1;
            }
            this.zzg = this.zzc.zzb(zzafqVar, false, true, 8);
            this.zze = 2;
            zzajv zzajvVar = this.zzd;
            int i2 = this.zzf;
            zzakb zzakbVar2 = ((zzajw) zzajvVar).zza;
            switch (i2) {
                case MRAID_JS_WRITE_FAILED_VALUE:
                case PRIVACY_URL_ERROR_VALUE:
                case 155:
                case 159:
                case 176:
                case 179:
                case 186:
                case AD_RESPONSE_EMPTY_VALUE:
                case 231:
                case 238:
                case PsExtractor.VIDEO_STREAM_MASK /* 240 */:
                case 241:
                case 247:
                case 251:
                case 16871:
                case 16980:
                case 17029:
                case 17143:
                case 18401:
                case 18408:
                case 20529:
                case 20530:
                case 21420:
                case 21432:
                case 21680:
                case 21682:
                case 21690:
                case 21930:
                case 21938:
                case 21945:
                case 21946:
                case 21947:
                case 21948:
                case 21949:
                case 21998:
                case 22186:
                case 22203:
                case 25188:
                case 30114:
                case 30321:
                case 2352003:
                case 2807729:
                    long j = this.zzg;
                    if (j <= 8) {
                        zzakbVar2.zzj(i2, zzd(zzafqVar, (int) j));
                        this.zze = 0;
                        return true;
                    }
                    StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 22);
                    sb.append("Invalid integer size: ");
                    sb.append(j);
                    throw zzat.zzb(sb.toString(), null);
                case 134:
                case FirebaseError.ERROR_WEAK_PASSWORD /* 17026 */:
                case 21358:
                case 2274716:
                    long j2 = this.zzg;
                    if (j2 > 2147483647L) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(j2).length() + 21);
                        sb2.append("String element size: ");
                        sb2.append(j2);
                        throw zzat.zzb(sb2.toString(), null);
                    }
                    int i3 = (int) j2;
                    if (i3 == 0) {
                        str = "";
                    } else {
                        byte[] bArr2 = new byte[i3];
                        zzafqVar.zzc(bArr2, 0, i3);
                        while (i3 > 0) {
                            int i4 = i3 - 1;
                            if (bArr2[i4] == 0) {
                                i3 = i4;
                            } else {
                                str = new String(bArr2, 0, i3);
                            }
                        }
                        str = new String(bArr2, 0, i3);
                    }
                    zzakbVar2.zzl(i2, str);
                    this.zze = 0;
                    return true;
                case 160:
                case 166:
                case 174:
                case 183:
                case 187:
                case 224:
                case AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE:
                case 16868:
                case 18407:
                case 19899:
                case 20532:
                case 20533:
                case 21936:
                case 21968:
                case 25152:
                case 28032:
                case 30113:
                case 30320:
                case 290298740:
                case 357149030:
                case 374648427:
                case 408125543:
                case 440786851:
                case 475249515:
                case 524531317:
                    long zzn = zzafqVar.zzn();
                    arrayDeque.push(new zzajt(i2, this.zzg + zzn, null));
                    ((zzajw) this.zzd).zza.zzh(this.zzf, zzn, this.zzg);
                    this.zze = 0;
                    return true;
                case 161:
                case 163:
                case 165:
                case 16877:
                case 16981:
                case 18402:
                case 21419:
                case 25506:
                case 30322:
                    zzakbVar2.zzm(i2, (int) this.zzg, zzafqVar);
                    this.zze = 0;
                    return true;
                case 181:
                case 17545:
                case 21969:
                case 21970:
                case 21971:
                case 21972:
                case 21973:
                case 21974:
                case 21975:
                case 21976:
                case 21977:
                case 21978:
                case 30323:
                case 30324:
                case 30325:
                    long j3 = this.zzg;
                    if (j3 != 4 && j3 != 8) {
                        StringBuilder sb3 = new StringBuilder(String.valueOf(j3).length() + 20);
                        sb3.append("Invalid float size: ");
                        sb3.append(j3);
                        throw zzat.zzb(sb3.toString(), null);
                    }
                    int i5 = (int) j3;
                    zzakbVar2.zzk(i2, i5 == 4 ? Float.intBitsToFloat((int) r6) : Double.longBitsToDouble(zzd(zzafqVar, i5)));
                    this.zze = 0;
                    return true;
                default:
                    zzafqVar.zzf((int) this.zzg);
                    this.zze = 0;
            }
        }
    }
}
