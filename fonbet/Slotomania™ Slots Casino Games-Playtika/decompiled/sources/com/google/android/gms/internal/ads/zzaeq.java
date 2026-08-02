package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes.dex */
public final class zzaeq {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 3, 6};
    private static final int[] zzc = {OpusUtil.SAMPLE_RATE, 44100, 32000};
    private static final int[] zzd = {24000, 22050, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND};
    private static final int[] zze = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] zzf = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, PsExtractor.AUDIO_STREAM, 224, 256, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, RendererCapabilities.MODE_SUPPORT_MASK, 448, 512, 576, 640};
    private static final int[] zzg = {69, 87, 104, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, 139, 174, Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static zzv zza(zzes zzesVar, String str, String str2, zzq zzqVar) {
        zzer zzerVar = new zzer();
        zzerVar.zza(zzesVar);
        int i = zzc[zzerVar.zzj(2)];
        zzerVar.zzh(8);
        int i2 = zze[zzerVar.zzj(3)];
        if (zzerVar.zzj(1) != 0) {
            i2++;
        }
        int i3 = zzf[zzerVar.zzj(5)] * 1000;
        zzerVar.zzm();
        zzesVar.zzh(zzerVar.zze());
        zzt zztVar = new zzt();
        zztVar.zza(str);
        zztVar.zzo(MimeTypes.AUDIO_AC3);
        zztVar.zzG(i2);
        zztVar.zzH(i);
        zztVar.zzs(zzqVar);
        zztVar.zze(str2);
        zztVar.zzi(i3);
        zztVar.zzj(i3);
        return zztVar.zzO();
    }

    public static zzv zzb(zzes zzesVar, String str, String str2, zzq zzqVar) {
        String str3;
        zzer zzerVar = new zzer();
        zzerVar.zza(zzesVar);
        int zzj = zzerVar.zzj(13) * 1000;
        zzerVar.zzh(3);
        int i = zzc[zzerVar.zzj(2)];
        zzerVar.zzh(10);
        int i2 = zze[zzerVar.zzj(3)];
        if (zzerVar.zzj(1) != 0) {
            i2++;
        }
        zzerVar.zzh(3);
        int zzj2 = zzerVar.zzj(4);
        zzerVar.zzh(1);
        if (zzj2 > 0) {
            zzerVar.zzh(6);
            if (zzerVar.zzj(1) != 0) {
                i2 += 2;
            }
            zzerVar.zzh(1);
        }
        if (zzerVar.zzc() > 7) {
            zzerVar.zzh(7);
            if (zzerVar.zzj(1) != 0) {
                str3 = MimeTypes.AUDIO_E_AC3_JOC;
                zzerVar.zzm();
                zzesVar.zzh(zzerVar.zze());
                zzt zztVar = new zzt();
                zztVar.zza(str);
                zztVar.zzo(str3);
                zztVar.zzG(i2);
                zztVar.zzH(i);
                zztVar.zzs(zzqVar);
                zztVar.zze(str2);
                zztVar.zzj(zzj);
                return zztVar.zzO();
            }
        }
        str3 = MimeTypes.AUDIO_E_AC3;
        zzerVar.zzm();
        zzesVar.zzh(zzerVar.zze());
        zzt zztVar2 = new zzt();
        zztVar2.zza(str);
        zztVar2.zzo(str3);
        zztVar2.zzG(i2);
        zztVar2.zzH(i);
        zztVar2.zzs(zzqVar);
        zztVar2.zze(str2);
        zztVar2.zzj(zzj);
        return zztVar2.zzO();
    }

    public static zzaep zzc(zzer zzerVar) {
        int zzf2;
        int i;
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int zzd2 = zzerVar.zzd();
        zzerVar.zzh(40);
        int zzj = zzerVar.zzj(5);
        zzerVar.zzf(zzd2);
        int i9 = -1;
        if (zzj > 10) {
            zzerVar.zzh(16);
            int zzj2 = zzerVar.zzj(2);
            if (zzj2 == 0) {
                i9 = 0;
            } else if (zzj2 == 1) {
                i9 = 1;
            } else if (zzj2 == 2) {
                i9 = 2;
            }
            zzerVar.zzh(3);
            int zzj3 = zzerVar.zzj(11) + 1;
            int zzj4 = zzerVar.zzj(2);
            if (zzj4 == 3) {
                i = zzd[zzerVar.zzj(2)];
                i6 = 6;
                i5 = 3;
            } else {
                int zzj5 = zzerVar.zzj(2);
                int i10 = zzb[zzj5];
                i5 = zzj5;
                i = zzc[zzj4];
                i6 = i10;
            }
            zzf2 = zzj3 + zzj3;
            int i11 = (zzf2 * i) / (i6 * 32);
            int zzj6 = zzerVar.zzj(3);
            boolean zzi = zzerVar.zzi();
            i2 = zze[zzj6] + (zzi ? 1 : 0);
            zzerVar.zzh(10);
            if (zzerVar.zzi()) {
                zzerVar.zzh(8);
            }
            if (zzj6 == 0) {
                zzerVar.zzh(5);
                if (zzerVar.zzi()) {
                    zzerVar.zzh(8);
                }
                i7 = 0;
                zzj6 = 0;
            } else {
                i7 = zzj6;
            }
            if (i9 == 1) {
                if (zzerVar.zzi()) {
                    zzerVar.zzh(16);
                }
                i8 = 1;
            } else {
                i8 = i9;
            }
            if (zzerVar.zzi()) {
                if (i7 > 2) {
                    zzerVar.zzh(2);
                }
                if ((i7 & 1) != 0 && i7 > 2) {
                    zzerVar.zzh(6);
                }
                if ((i7 & 4) != 0) {
                    zzerVar.zzh(6);
                }
                if (zzi && zzerVar.zzi()) {
                    zzerVar.zzh(5);
                }
                if (i8 == 0) {
                    if (zzerVar.zzi()) {
                        zzerVar.zzh(6);
                    }
                    if (i7 == 0 && zzerVar.zzi()) {
                        zzerVar.zzh(6);
                    }
                    if (zzerVar.zzi()) {
                        zzerVar.zzh(6);
                    }
                    int zzj7 = zzerVar.zzj(2);
                    if (zzj7 == 1) {
                        zzerVar.zzh(5);
                    } else if (zzj7 == 2) {
                        zzerVar.zzh(12);
                    } else if (zzj7 == 3) {
                        int zzj8 = zzerVar.zzj(5);
                        if (zzerVar.zzi()) {
                            zzerVar.zzh(5);
                            if (zzerVar.zzi()) {
                                zzerVar.zzh(4);
                            }
                            if (zzerVar.zzi()) {
                                zzerVar.zzh(4);
                            }
                            if (zzerVar.zzi()) {
                                zzerVar.zzh(4);
                            }
                            if (zzerVar.zzi()) {
                                zzerVar.zzh(4);
                            }
                            if (zzerVar.zzi()) {
                                zzerVar.zzh(4);
                            }
                            if (zzerVar.zzi()) {
                                zzerVar.zzh(4);
                            }
                            if (zzerVar.zzi()) {
                                zzerVar.zzh(4);
                            }
                            if (zzerVar.zzi()) {
                                if (zzerVar.zzi()) {
                                    zzerVar.zzh(4);
                                }
                                if (zzerVar.zzi()) {
                                    zzerVar.zzh(4);
                                }
                            }
                        }
                        if (zzerVar.zzi()) {
                            zzerVar.zzh(5);
                            if (zzerVar.zzi()) {
                                zzerVar.zzh(7);
                                if (zzerVar.zzi()) {
                                    zzerVar.zzh(8);
                                }
                            }
                        }
                        zzerVar.zzh((zzj8 + 2) * 8);
                        zzerVar.zzm();
                    }
                    if (i7 < 2) {
                        if (zzerVar.zzi()) {
                            zzerVar.zzh(14);
                        }
                        if (zzj6 == 0 && zzerVar.zzi()) {
                            zzerVar.zzh(14);
                        }
                    }
                    if (zzerVar.zzi()) {
                        if (i5 == 0) {
                            zzerVar.zzh(5);
                            i8 = 0;
                            i5 = 0;
                        } else {
                            for (int i12 = 0; i12 < i6; i12++) {
                                if (zzerVar.zzi()) {
                                    zzerVar.zzh(5);
                                }
                            }
                        }
                    }
                    i8 = 0;
                }
            }
            if (zzerVar.zzi()) {
                zzerVar.zzh(5);
                if (i7 == 2) {
                    zzerVar.zzh(4);
                    i7 = 2;
                }
                if (i7 >= 6) {
                    zzerVar.zzh(2);
                }
                if (zzerVar.zzi()) {
                    zzerVar.zzh(8);
                }
                if (i7 == 0 && zzerVar.zzi()) {
                    zzerVar.zzh(8);
                }
                if (zzj4 < 3) {
                    zzerVar.zzg();
                }
            }
            if (i8 == 0 && i5 != 3) {
                zzerVar.zzg();
            }
            if (i8 == 2 && (i5 == 3 || zzerVar.zzi())) {
                zzerVar.zzh(6);
            }
            i3 = i6 * 256;
            str = (zzerVar.zzi() && zzerVar.zzj(6) == 1 && zzerVar.zzj(8) == 1) ? MimeTypes.AUDIO_E_AC3_JOC : MimeTypes.AUDIO_E_AC3;
            i4 = i11;
        } else {
            zzerVar.zzh(32);
            int zzj9 = zzerVar.zzj(2);
            String str2 = zzj9 == 3 ? null : MimeTypes.AUDIO_AC3;
            int zzj10 = zzerVar.zzj(6);
            int i13 = zzf[zzj10 / 2] * 1000;
            zzf2 = zzf(zzj9, zzj10);
            zzerVar.zzh(8);
            int zzj11 = zzerVar.zzj(3);
            if ((zzj11 & 1) != 0 && zzj11 != 1) {
                zzerVar.zzh(2);
            }
            if ((zzj11 & 4) != 0) {
                zzerVar.zzh(2);
            }
            if (zzj11 == 2) {
                zzerVar.zzh(2);
            }
            i = zzj9 < 3 ? zzc[zzj9] : -1;
            i2 = zze[zzj11] + (zzerVar.zzi() ? 1 : 0);
            i3 = 1536;
            str = str2;
            i4 = i13;
        }
        return new zzaep(str, i9, i2, i, zzf2, i3, i4, null);
    }

    public static int zzd(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) <= 10) {
            byte b = bArr[4];
            return zzf((b & 192) >> 6, b & 63);
        }
        int i = bArr[2] & 7;
        int i2 = ((bArr[3] & 255) | (i << 8)) + 1;
        return i2 + i2;
    }

    public static int zze(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return zzb[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    private static int zzf(int i, int i2) {
        int i3;
        if (i < 0 || i >= 3 || i2 < 0 || (i3 = i2 >> 1) >= 19) {
            return -1;
        }
        int i4 = zzc[i];
        if (i4 == 44100) {
            int i5 = zzg[i3] + (i2 & 1);
            return i5 + i5;
        }
        int i6 = zzf[i3];
        return i4 == 32000 ? i6 * 6 : i6 * 4;
    }
}
