package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.extractor.avi.AviExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import java.nio.ByteOrder;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
final class zzahs implements zzahl {
    public final zzgvz zza;
    private final int zzb;

    private zzahs(int i, zzgvz zzgvzVar) {
        this.zzb = i;
        this.zza = zzgvzVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zzahs zzb(int i, zzes zzesVar) {
        zzahl zzahtVar;
        String str;
        zzgvw zzgvwVar = new zzgvw();
        int zze = zzesVar.zze();
        int i2 = -2;
        while (zzesVar.zzd() > 8) {
            int zzC = zzesVar.zzC();
            int zzg = zzesVar.zzg() + zzesVar.zzC();
            zzesVar.zzf(zzg);
            if (zzC != 1414744396) {
                zzaht zzahtVar2 = null;
                switch (zzC) {
                    case AviExtractor.FOURCC_strf /* 1718776947 */:
                        if (i2 == 2) {
                            zzesVar.zzk(4);
                            int zzC2 = zzesVar.zzC();
                            int zzC3 = zzesVar.zzC();
                            zzesVar.zzk(4);
                            int zzC4 = zzesVar.zzC();
                            switch (zzC4) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = MimeTypes.VIDEO_MP4V;
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = MimeTypes.VIDEO_MP42;
                                    break;
                                case 859066445:
                                    str = MimeTypes.VIDEO_MP43;
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = MimeTypes.VIDEO_MJPEG;
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str == null) {
                                StringBuilder sb = new StringBuilder(String.valueOf(zzC4).length() + 44);
                                sb.append("Ignoring track with unsupported compression ");
                                sb.append(zzC4);
                                zzef.zzc("StreamFormatChunk", sb.toString());
                            } else {
                                zzt zztVar = new zzt();
                                zztVar.zzv(zzC2);
                                zztVar.zzw(zzC3);
                                zztVar.zzo(str);
                                zzahtVar2 = new zzaht(zztVar.zzO());
                            }
                        } else if (i2 == 1) {
                            int zzu = zzesVar.zzu();
                            String str2 = zzu != 1 ? zzu != 85 ? zzu != 255 ? zzu != 8192 ? zzu != 8193 ? null : MimeTypes.AUDIO_DTS : MimeTypes.AUDIO_AC3 : MimeTypes.AUDIO_AAC : MimeTypes.AUDIO_MPEG : MimeTypes.AUDIO_RAW;
                            if (str2 != null) {
                                int zzu2 = zzesVar.zzu();
                                int zzC5 = zzesVar.zzC();
                                zzesVar.zzk(6);
                                int zzB = zzfk.zzB(zzesVar.zzu(), ByteOrder.LITTLE_ENDIAN);
                                int zzu3 = zzesVar.zzd() > 0 ? zzesVar.zzu() : 0;
                                zzt zztVar2 = new zzt();
                                zztVar2.zzo(str2);
                                zztVar2.zzG(zzu2);
                                zztVar2.zzH(zzC5);
                                if (str2.equals(MimeTypes.AUDIO_RAW) && zzB != 0) {
                                    zztVar2.zzI(zzB);
                                }
                                if (str2.equals(MimeTypes.AUDIO_AAC) && zzu3 > 0) {
                                    byte[] bArr = new byte[zzu3];
                                    zzesVar.zzm(bArr, 0, zzu3);
                                    zztVar2.zzr(zzgvz.zzj(bArr));
                                }
                                zzahtVar = new zzaht(zztVar2.zzO());
                                break;
                            } else {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(zzu).length() + 43);
                                sb2.append("Ignoring track with unsupported format tag ");
                                sb2.append(zzu);
                                zzef.zzc("StreamFormatChunk", sb2.toString());
                            }
                        } else {
                            zzef.zzc("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(zzfk.zzR(i2)));
                        }
                        zzahtVar = zzahtVar2;
                        break;
                    case AviExtractor.FOURCC_avih /* 1751742049 */:
                        zzahtVar = zzahp.zzb(zzesVar);
                        break;
                    case AviExtractor.FOURCC_strh /* 1752331379 */:
                        zzahtVar = zzahq.zzb(zzesVar);
                        break;
                    case AviExtractor.FOURCC_strn /* 1852994675 */:
                        zzahtVar = zzahu.zzb(zzesVar);
                        break;
                    default:
                        zzahtVar = zzahtVar2;
                        break;
                }
            } else {
                zzahtVar = zzb(zzesVar.zzC(), zzesVar);
            }
            if (zzahtVar != null) {
                if (zzahtVar.zza() == 1752331379) {
                    i2 = ((zzahq) zzahtVar).zzc();
                }
                zzgvwVar.zzf(zzahtVar);
            }
            zzesVar.zzh(zzg);
            zzesVar.zzf(zze);
        }
        return new zzahs(i, zzgvwVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzahl
    public final int zza() {
        return this.zzb;
    }

    public final zzahl zzc(Class cls) {
        zzgvz zzgvzVar = this.zza;
        int size = zzgvzVar.size();
        int i = 0;
        while (i < size) {
            zzahl zzahlVar = (zzahl) zzgvzVar.get(i);
            i++;
            if (zzahlVar.getClass() == cls) {
                return zzahlVar;
            }
        }
        return null;
    }
}
