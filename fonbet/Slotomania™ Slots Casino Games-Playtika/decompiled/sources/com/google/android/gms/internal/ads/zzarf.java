package com.google.android.gms.internal.ads;

import androidx.compose.ui.layout.LayoutKt;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.base.Ascii;
import com.ironsource.InterfaceC2517l1;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.math.RoundingMode;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes3.dex */
final class zzarf implements zzarg {
    private static final int[] zza = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] zzb = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 130, 143, 157, 173, FacebookRequestErrorClassification.EC_INVALID_TOKEN, Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, 230, 253, 279, 307, 337, 371, InterfaceC2517l1.a.b.h, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, LayoutKt.LargeDimension};
    private final zzafs zzc;
    private final zzahb zzd;
    private final zzark zze;
    private final int zzf;
    private final byte[] zzg;
    private final zzes zzh;
    private final int zzi;
    private final zzv zzj;
    private int zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    public zzarf(zzafs zzafsVar, zzahb zzahbVar, zzark zzarkVar) throws zzat {
        this.zzc = zzafsVar;
        this.zzd = zzahbVar;
        this.zze = zzarkVar;
        int max = Math.max(1, zzarkVar.zzc / 10);
        this.zzi = max;
        zzes zzesVar = new zzes(zzarkVar.zzf);
        zzesVar.zzu();
        int zzu = zzesVar.zzu();
        this.zzf = zzu;
        int i = zzarkVar.zzb;
        int i2 = (((zzarkVar.zzd - (i * 4)) * 8) / (zzarkVar.zze * i)) + 1;
        if (zzu != i2) {
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 34 + String.valueOf(zzu).length());
            sb.append("Expected frames per block: ");
            sb.append(i2);
            sb.append("; got: ");
            sb.append(zzu);
            throw zzat.zzb(sb.toString(), null);
        }
        String str = zzfk.zza;
        int i3 = ((max + zzu) - 1) / zzu;
        this.zzg = new byte[zzarkVar.zzd * i3];
        this.zzh = new zzes(i3 * (zzu + zzu) * i);
        int i4 = ((zzarkVar.zzc * zzarkVar.zzd) * 8) / zzu;
        zzt zztVar = new zzt();
        zztVar.zzo(MimeTypes.AUDIO_RAW);
        zztVar.zzi(i4);
        zztVar.zzj(i4);
        zztVar.zzp((max + max) * i);
        zztVar.zzG(zzarkVar.zzb);
        zztVar.zzH(zzarkVar.zzc);
        zztVar.zzI(2);
        this.zzj = zztVar.zzO();
    }

    private final void zzd(int i) {
        long zzv = this.zzl + zzfk.zzv(this.zzn, 1000000L, this.zze.zzc, RoundingMode.DOWN);
        int zzf = zzf(i);
        this.zzd.zze(zzv, 1, zzf, this.zzm - zzf, null);
        this.zzn += i;
        this.zzm -= zzf;
    }

    private final int zze(int i) {
        int i2 = this.zze.zzb;
        return i / (i2 + i2);
    }

    private final int zzf(int i) {
        return (i + i) * this.zze.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzarg
    public final void zza(long j) {
        this.zzk = 0;
        this.zzl = j;
        this.zzm = 0;
        this.zzn = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzarg
    public final void zzb(int i, long j) {
        zzarn zzarnVar = new zzarn(this.zze, this.zzf, i, j);
        this.zzc.zzw(zzarnVar);
        zzahb zzahbVar = this.zzd;
        zzahbVar.zzA(this.zzj);
        zzahbVar.zzO(zzarnVar.zza());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x003c -> B:3:0x0021). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.zzarg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzc(zzafq zzafqVar, long j) throws IOException {
        boolean z;
        int i;
        int zze;
        int zze2 = zze(this.zzm);
        int i2 = this.zzi;
        String str = zzfk.zza;
        int i3 = this.zzf;
        zzark zzarkVar = this.zze;
        int i4 = zzarkVar.zzd;
        int i5 = ((((i2 - zze2) + i3) - 1) / i3) * i4;
        if (j != 0) {
            z = false;
            while (!z) {
                if (this.zzk >= i5) {
                    break;
                }
                int zza2 = zzafqVar.zza(this.zzg, this.zzk, (int) Math.min(i5 - r12, j));
                if (zza2 != -1) {
                    this.zzk += zza2;
                }
            }
            i = this.zzk / i4;
            if (i > 0) {
                byte[] bArr = this.zzg;
                zzes zzesVar = this.zzh;
                for (int i6 = 0; i6 < i; i6++) {
                    int i7 = 0;
                    while (true) {
                        int i8 = zzarkVar.zzb;
                        if (i7 < i8) {
                            byte[] zzi = zzesVar.zzi();
                            int i9 = (i4 / i8) - 4;
                            int i10 = (i6 * i4) + (i7 * 4);
                            int i11 = bArr[i10 + 1] & 255;
                            int i12 = bArr[i10] & 255;
                            int i13 = i;
                            byte[] bArr2 = bArr;
                            int min = Math.min(bArr[i10 + 2] & 255, 88);
                            int[] iArr = zzb;
                            int i14 = iArr[min];
                            int i15 = (i6 * i3 * i8) + i7;
                            int i16 = (short) (i12 | (i11 << 8));
                            int i17 = i15 + i15;
                            zzi[i17] = (byte) (i16 & 255);
                            zzi[i17 + 1] = (byte) (i16 >> 8);
                            for (int i18 = 0; i18 < i9 + i9; i18++) {
                                byte b = bArr2[(i8 * 4) + i10 + ((i18 / 8) * i8 * 4) + ((i18 / 2) % 4)];
                                int i19 = min;
                                int i20 = i18 % 2 == 0 ? b & Ascii.SI : (b & 255) >> 4;
                                int i21 = i20 & 7;
                                int i22 = (((i21 + i21) + 1) * i14) >> 3;
                                if ((i20 & 8) != 0) {
                                    i22 = -i22;
                                }
                                i16 = Math.max(-32768, Math.min(i16 + i22, LayoutKt.LargeDimension));
                                i17 += i8 + i8;
                                zzi[i17] = (byte) (i16 & 255);
                                zzi[i17 + 1] = (byte) (i16 >> 8);
                                min = Math.max(0, Math.min(i19 + zza[i20], 88));
                                i14 = iArr[min];
                            }
                            i7++;
                            i = i13;
                            bArr = bArr2;
                        }
                    }
                }
                int i23 = i;
                int zzf = zzf(i3 * i23);
                zzesVar.zzh(0);
                zzesVar.zzf(zzf);
                this.zzk -= i23 * i4;
                int zze3 = zzesVar.zze();
                this.zzd.zzc(zzesVar, zze3);
                int i24 = this.zzm + zze3;
                this.zzm = i24;
                if (zze(i24) >= i2) {
                    zzd(i2);
                }
            }
            if (z && (zze = zze(this.zzm)) > 0) {
                zzd(zze);
            }
            return z;
        }
        z = true;
        while (!z) {
        }
        i = this.zzk / i4;
        if (i > 0) {
        }
        if (z) {
            zzd(zze);
        }
        return z;
    }
}
