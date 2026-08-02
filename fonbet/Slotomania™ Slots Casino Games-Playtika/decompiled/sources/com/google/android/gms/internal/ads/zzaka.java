package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
public final class zzaka {
    public byte[] zzO;
    public zzahc zzU;
    public boolean zzW;
    public zzahb zzY;
    public zzv zzZ;
    public boolean zza;
    public int zzaa;
    private int zzab;
    public String zzb;
    public String zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;
    public boolean zzh;
    public byte[] zzi;
    public zzaha zzj;
    public byte[] zzk;
    public zzq zzl;
    public int zzm = -1;
    public int zzn = -1;
    public int zzo = -1;
    public int zzp = -1;
    public int zzq = -1;
    public int zzr = 0;
    public int zzs = -1;
    public float zzt = 0.0f;
    public float zzu = 0.0f;
    public float zzv = 0.0f;
    public byte[] zzw = null;
    public int zzx = -1;
    public boolean zzy = false;
    public int zzz = -1;
    public int zzA = -1;
    public int zzB = -1;
    public int zzC = 1000;
    public int zzD = 200;
    public float zzE = -1.0f;
    public float zzF = -1.0f;
    public float zzG = -1.0f;
    public float zzH = -1.0f;
    public float zzI = -1.0f;
    public float zzJ = -1.0f;
    public float zzK = -1.0f;
    public float zzL = -1.0f;
    public float zzM = -1.0f;
    public float zzN = -1.0f;
    public int zzP = 1;
    public int zzQ = -1;
    public int zzR = 8000;
    public long zzS = 0;
    public long zzT = 0;
    public boolean zzV = false;
    public boolean zzX = true;
    private String zzac = "eng";

    protected zzaka() {
    }

    private static Pair zzf(zzes zzesVar) throws zzat {
        try {
            zzesVar.zzk(16);
            long zzA = zzesVar.zzA();
            if (zzA == 1482049860) {
                return new Pair(MimeTypes.VIDEO_DIVX, null);
            }
            if (zzA == 859189832) {
                return new Pair(MimeTypes.VIDEO_H263, null);
            }
            if (zzA != 826496599) {
                zzef.zzc("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair(MimeTypes.VIDEO_UNKNOWN, null);
            }
            int zzg = zzesVar.zzg() + 20;
            byte[] zzi = zzesVar.zzi();
            while (true) {
                int length = zzi.length;
                if (zzg >= length - 4) {
                    throw zzat.zzb("Failed to find FourCC VC1 initialization data", null);
                }
                int i = zzg + 1;
                if (zzi[zzg] == 0 && zzi[i] == 0 && zzi[zzg + 2] == 1 && zzi[zzg + 3] == 15) {
                    return new Pair(MimeTypes.VIDEO_VC1, Collections.singletonList(Arrays.copyOfRange(zzi, zzg, length)));
                }
                zzg = i;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzat.zzb("Error parsing FourCC private data", null);
        }
    }

    private static List zzg(byte[] bArr) throws zzat {
        int i;
        int i2;
        try {
            if (bArr[0] != 2) {
                throw zzat.zzb("Error parsing vorbis codec private", null);
            }
            int i3 = 0;
            int i4 = 1;
            while (true) {
                int i5 = bArr[i4];
                i4++;
                i = i5 & 255;
                if (i != 255) {
                    break;
                }
                i3 += 255;
            }
            int i6 = i3 + i;
            int i7 = 0;
            while (true) {
                int i8 = bArr[i4];
                i4++;
                i2 = i8 & 255;
                if (i2 != 255) {
                    break;
                }
                i7 += 255;
            }
            int i9 = i7 + i2;
            if (bArr[i4] != 1) {
                throw zzat.zzb("Error parsing vorbis codec private", null);
            }
            byte[] bArr2 = new byte[i6];
            System.arraycopy(bArr, i4, bArr2, 0, i6);
            int i10 = i4 + i6;
            if (bArr[i10] != 3) {
                throw zzat.zzb("Error parsing vorbis codec private", null);
            }
            int i11 = i10 + i9;
            if (bArr[i11] != 5) {
                throw zzat.zzb("Error parsing vorbis codec private", null);
            }
            int length = bArr.length - i11;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, i11, bArr3, 0, length);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzat.zzb("Error parsing vorbis codec private", null);
        }
    }

    private static boolean zzh(zzes zzesVar) throws zzat {
        UUID uuid;
        UUID uuid2;
        try {
            int zzu = zzesVar.zzu();
            if (zzu == 1) {
                return true;
            }
            if (zzu == 65534) {
                zzesVar.zzh(24);
                long zzD = zzesVar.zzD();
                uuid = zzakb.zzf;
                if (zzD == uuid.getMostSignificantBits()) {
                    long zzD2 = zzesVar.zzD();
                    uuid2 = zzakb.zzf;
                    if (zzD2 == uuid2.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzat.zzb("Error parsing MS/ACM codec private", null);
        }
    }

    @EnsuresNonNull({"codecPrivate"})
    private final byte[] zzi(String str) throws zzat {
        byte[] bArr = this.zzk;
        if (bArr != null) {
            return bArr;
        }
        String.valueOf(str);
        throw zzat.zzb("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:119:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x044d  */
    @RequiresNonNull({"codecId"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(int i) throws zzat {
        char c;
        List zzj;
        List list;
        String str;
        String str2;
        int i2;
        List zzg;
        int i3;
        byte[] bArr;
        String str3;
        zzi zziVar;
        Map map;
        Map map2;
        byte[] bArr2;
        int i4;
        Map map3;
        zzft zza;
        String str4 = this.zzc;
        int i5 = 3;
        int i6 = 0;
        int i7 = -1;
        switch (str4.hashCode()) {
            case -2095576542:
                if (str4.equals("V_MPEG4/ISO/AP")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -2095575984:
                if (str4.equals("V_MPEG4/ISO/SP")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1985379776:
                if (str4.equals("A_MS/ACM")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -1784763192:
                if (str4.equals("A_TRUEHD")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -1730367663:
                if (str4.equals("A_VORBIS")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -1482641358:
                if (str4.equals("A_MPEG/L2")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1482641357:
                if (str4.equals("A_MPEG/L3")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -1373388978:
                if (str4.equals("V_MS/VFW/FOURCC")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -933872740:
                if (str4.equals("S_DVBSUB")) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case -538363189:
                if (str4.equals("V_MPEG4/ISO/ASP")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -538363109:
                if (str4.equals("V_MPEG4/ISO/AVC")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -425012669:
                if (str4.equals("S_VOBSUB")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case -356037306:
                if (str4.equals("A_DTS/LOSSLESS")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 62923557:
                if (str4.equals("A_AAC")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 62923603:
                if (str4.equals("A_AC3")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 62927045:
                if (str4.equals("A_DTS")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 82318131:
                if (str4.equals("V_AV1")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 82338133:
                if (str4.equals("V_VP8")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 82338134:
                if (str4.equals("V_VP9")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 99146302:
                if (str4.equals("S_HDMV/PGS")) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case 444813526:
                if (str4.equals("V_THEORA")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 542569478:
                if (str4.equals("A_DTS/EXPRESS")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 635596514:
                if (str4.equals("A_PCM/FLOAT/IEEE")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 725948237:
                if (str4.equals("A_PCM/INT/BIG")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 725957860:
                if (str4.equals("A_PCM/INT/LIT")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 738597099:
                if (str4.equals("S_TEXT/ASS")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 738614379:
                if (str4.equals("S_TEXT/SSA")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 855502857:
                if (str4.equals("V_MPEGH/ISO/HEVC")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1045209816:
                if (str4.equals("S_TEXT/WEBVTT")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case 1422270023:
                if (str4.equals("S_TEXT/UTF8")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 1809237540:
                if (str4.equals("V_MPEG2")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1950749482:
                if (str4.equals("A_EAC3")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 1950789798:
                if (str4.equals("A_FLAC")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 1951062397:
                if (str4.equals("A_OPUS")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        String str5 = MimeTypes.AUDIO_RAW;
        switch (c) {
            case 0:
                str5 = MimeTypes.VIDEO_VP8;
                i2 = -1;
                i5 = -1;
                list = null;
                str2 = null;
                if (this.zzO != null && (zza = zzft.zza(new zzes(this.zzO))) != null) {
                    str2 = zza.zza;
                    str5 = MimeTypes.VIDEO_DOLBY_VISION;
                }
                str3 = str5;
                int i8 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzt zztVar = new zzt();
                if (!zzas.zza(str3)) {
                    zztVar.zzG(this.zzP);
                    zztVar.zzH(this.zzR);
                    zztVar.zzI(i5);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        int i9 = this.zzp;
                        if (i9 == -1) {
                            i9 = this.zzm;
                        }
                        this.zzp = i9;
                        int i10 = this.zzq;
                        if (i10 == -1) {
                            i10 = this.zzn;
                        }
                        this.zzq = i10;
                    }
                    float f = (this.zzp == -1 || (i4 = this.zzq) == -1) ? -1.0f : (this.zzn * r7) / (this.zzm * i4);
                    if (this.zzy) {
                        if (this.zzE == -1.0f || this.zzF == -1.0f || this.zzG == -1.0f || this.zzH == -1.0f || this.zzI == -1.0f || this.zzJ == -1.0f || this.zzK == -1.0f || this.zzL == -1.0f || this.zzM == -1.0f || this.zzN == -1.0f) {
                            bArr2 = null;
                        } else {
                            bArr2 = new byte[25];
                            ByteBuffer order = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                            order.put((byte) 0);
                            order.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                            order.putShort((short) (this.zzM + 0.5f));
                            order.putShort((short) (this.zzN + 0.5f));
                            order.putShort((short) this.zzC);
                            order.putShort((short) this.zzD);
                        }
                        zzh zzhVar = new zzh();
                        zzhVar.zza(this.zzz);
                        zzhVar.zzb(this.zzB);
                        zzhVar.zzc(this.zzA);
                        zzhVar.zzd(bArr2);
                        zzhVar.zze(this.zzo);
                        zzhVar.zzf(this.zzo);
                        zziVar = zzhVar.zzg();
                    } else {
                        zziVar = null;
                    }
                    if (this.zzb != null) {
                        int i11 = zzakb.zza;
                        String str6 = this.zzb;
                        map = zzakb.zzg;
                        if (map.containsKey(str6)) {
                            String str7 = this.zzb;
                            map2 = zzakb.zzg;
                            i7 = ((Integer) map2.get(str7)).intValue();
                        }
                    }
                    if (this.zzs == 0 && Float.compare(this.zzt, 0.0f) == 0 && Float.compare(this.zzu, 0.0f) == 0) {
                        if (Float.compare(this.zzv, 0.0f) != 0) {
                            if (Float.compare(this.zzv, 90.0f) == 0) {
                                i6 = 90;
                            } else if (Float.compare(this.zzv, -180.0f) == 0 || Float.compare(this.zzv, 180.0f) == 0) {
                                i6 = 180;
                            } else if (Float.compare(this.zzv, -90.0f) == 0) {
                                i6 = 270;
                            }
                        }
                        zztVar.zzv(this.zzm);
                        zztVar.zzw(this.zzn);
                        zztVar.zzB(f);
                        zztVar.zzA(i6);
                        zztVar.zzC(this.zzw);
                        zztVar.zzD(this.zzx);
                        zztVar.zzE(zziVar);
                    }
                    i6 = i7;
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f);
                    zztVar.zzA(i6);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVar);
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str3) && !MimeTypes.TEXT_SSA.equals(str3) && !MimeTypes.TEXT_VTT.equals(str3) && !MimeTypes.APPLICATION_VOBSUB.equals(str3) && !MimeTypes.APPLICATION_PGS.equals(str3) && !MimeTypes.APPLICATION_DVBSUBS.equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                if (this.zzb != null) {
                    int i12 = zzakb.zza;
                    String str8 = this.zzb;
                    map3 = zzakb.zzg;
                    if (!map3.containsKey(str8)) {
                        zztVar.zzc(this.zzb);
                    }
                }
                zztVar.zzb(i);
                zztVar.zzn(true == this.zza ? MimeTypes.VIDEO_MATROSKA : "video/webm");
                zztVar.zzo(str3);
                zztVar.zzp(i2);
                zztVar.zze(this.zzac);
                zztVar.zzf(i8);
                zztVar.zzr(list);
                zztVar.zzk(str2);
                zztVar.zzs(this.zzl);
                this.zzZ = zztVar.zzO();
                return;
            case 1:
                byte[] bArr3 = this.zzk;
                zzj = bArr3 == null ? null : zzgvz.zzj(bArr3);
                str5 = MimeTypes.VIDEO_VP9;
                list = zzj;
                i2 = -1;
                i5 = -1;
                str2 = null;
                if (this.zzO != null) {
                    str2 = zza.zza;
                    str5 = MimeTypes.VIDEO_DOLBY_VISION;
                    break;
                }
                str3 = str5;
                int i82 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzt zztVar2 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar2.zzb(i);
                zztVar2.zzn(true == this.zza ? MimeTypes.VIDEO_MATROSKA : "video/webm");
                zztVar2.zzo(str3);
                zztVar2.zzp(i2);
                zztVar2.zze(this.zzac);
                zztVar2.zzf(i82);
                zztVar2.zzr(list);
                zztVar2.zzk(str2);
                zztVar2.zzs(this.zzl);
                this.zzZ = zztVar2.zzO();
                return;
            case 2:
                byte[] bArr4 = this.zzk;
                zzj = bArr4 == null ? null : zzgvz.zzj(bArr4);
                str5 = "video/av01";
                list = zzj;
                i2 = -1;
                i5 = -1;
                str2 = null;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i822 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzt zztVar22 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar22.zzb(i);
                zztVar22.zzn(true == this.zza ? MimeTypes.VIDEO_MATROSKA : "video/webm");
                zztVar22.zzo(str3);
                zztVar22.zzp(i2);
                zztVar22.zze(this.zzac);
                zztVar22.zzf(i822);
                zztVar22.zzr(list);
                zztVar22.zzk(str2);
                zztVar22.zzs(this.zzl);
                this.zzZ = zztVar22.zzO();
                return;
            case 3:
                str5 = MimeTypes.VIDEO_MPEG2;
                i2 = -1;
                i5 = -1;
                list = null;
                str2 = null;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i8222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzt zztVar222 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar222.zzb(i);
                zztVar222.zzn(true == this.zza ? MimeTypes.VIDEO_MATROSKA : "video/webm");
                zztVar222.zzo(str3);
                zztVar222.zzp(i2);
                zztVar222.zze(this.zzac);
                zztVar222.zzf(i8222);
                zztVar222.zzr(list);
                zztVar222.zzk(str2);
                zztVar222.zzs(this.zzl);
                this.zzZ = zztVar222.zzO();
                return;
            case 4:
            case 5:
            case 6:
                byte[] bArr5 = this.zzk;
                zzj = bArr5 == null ? null : Collections.singletonList(bArr5);
                str5 = MimeTypes.VIDEO_MP4V;
                list = zzj;
                i2 = -1;
                i5 = -1;
                str2 = null;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i82222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzt zztVar2222 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar2222.zzb(i);
                zztVar2222.zzn(true == this.zza ? MimeTypes.VIDEO_MATROSKA : "video/webm");
                zztVar2222.zzo(str3);
                zztVar2222.zzp(i2);
                zztVar2222.zze(this.zzac);
                zztVar2222.zzf(i82222);
                zztVar2222.zzr(list);
                zztVar2222.zzk(str2);
                zztVar2222.zzs(this.zzl);
                this.zzZ = zztVar2222.zzO();
                return;
            case 7:
                zzaeu zza2 = zzaeu.zza(new zzes(zzi(this.zzc)));
                list = zza2.zza;
                this.zzaa = zza2.zzb;
                str = zza2.zzl;
                str5 = "video/avc";
                str2 = str;
                i2 = -1;
                i5 = -1;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i822222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzt zztVar22222 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar22222.zzb(i);
                zztVar22222.zzn(true == this.zza ? MimeTypes.VIDEO_MATROSKA : "video/webm");
                zztVar22222.zzo(str3);
                zztVar22222.zzp(i2);
                zztVar22222.zze(this.zzac);
                zztVar22222.zzf(i822222);
                zztVar22222.zzr(list);
                zztVar22222.zzk(str2);
                zztVar22222.zzs(this.zzl);
                this.zzZ = zztVar22222.zzO();
                return;
            case '\b':
                zzagj zza3 = zzagj.zza(new zzes(zzi(this.zzc)));
                list = zza3.zza;
                this.zzaa = zza3.zzb;
                str = zza3.zzn;
                str5 = "video/hevc";
                str2 = str;
                i2 = -1;
                i5 = -1;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i8222222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzt zztVar222222 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar222222.zzb(i);
                zztVar222222.zzn(true == this.zza ? MimeTypes.VIDEO_MATROSKA : "video/webm");
                zztVar222222.zzo(str3);
                zztVar222222.zzp(i2);
                zztVar222222.zze(this.zzac);
                zztVar222222.zzf(i8222222);
                zztVar222222.zzr(list);
                zztVar222222.zzk(str2);
                zztVar222222.zzs(this.zzl);
                this.zzZ = zztVar222222.zzO();
                return;
            case '\t':
                Pair zzf = zzf(new zzes(zzi(this.zzc)));
                str5 = (String) zzf.first;
                zzj = (List) zzf.second;
                list = zzj;
                i2 = -1;
                i5 = -1;
                str2 = null;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i82222222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzt zztVar2222222 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar2222222.zzb(i);
                zztVar2222222.zzn(true == this.zza ? MimeTypes.VIDEO_MATROSKA : "video/webm");
                zztVar2222222.zzo(str3);
                zztVar2222222.zzp(i2);
                zztVar2222222.zze(this.zzac);
                zztVar2222222.zzf(i82222222);
                zztVar2222222.zzr(list);
                zztVar2222222.zzk(str2);
                zztVar2222222.zzs(this.zzl);
                this.zzZ = zztVar2222222.zzO();
                return;
            case '\n':
                str5 = MimeTypes.VIDEO_UNKNOWN;
                i2 = -1;
                i5 = -1;
                list = null;
                str2 = null;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i822222222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzt zztVar22222222 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar22222222.zzb(i);
                zztVar22222222.zzn(true == this.zza ? MimeTypes.VIDEO_MATROSKA : "video/webm");
                zztVar22222222.zzo(str3);
                zztVar22222222.zzp(i2);
                zztVar22222222.zze(this.zzac);
                zztVar22222222.zzf(i822222222);
                zztVar22222222.zzr(list);
                zztVar22222222.zzk(str2);
                zztVar22222222.zzs(this.zzl);
                this.zzZ = zztVar22222222.zzO();
                return;
            case 11:
                zzg = zzg(zzi(str4));
                i3 = 8192;
                str5 = MimeTypes.AUDIO_VORBIS;
                list = zzg;
                i5 = -1;
                i2 = i3;
                str2 = null;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i8222222222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzt zztVar222222222 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar222222222.zzb(i);
                zztVar222222222.zzn(true == this.zza ? MimeTypes.VIDEO_MATROSKA : "video/webm");
                zztVar222222222.zzo(str3);
                zztVar222222222.zzp(i2);
                zztVar222222222.zze(this.zzac);
                zztVar222222222.zzf(i8222222222);
                zztVar222222222.zzr(list);
                zztVar222222222.zzk(str2);
                zztVar222222222.zzs(this.zzl);
                this.zzZ = zztVar222222222.zzO();
                return;
            case '\f':
                zzg = new ArrayList(3);
                zzg.add(zzi(this.zzc));
                zzg.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.zzS).array());
                zzg.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.zzT).array());
                i3 = 5760;
                str5 = MimeTypes.AUDIO_OPUS;
                list = zzg;
                i5 = -1;
                i2 = i3;
                str2 = null;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i82222222222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzt zztVar2222222222 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar2222222222.zzb(i);
                zztVar2222222222.zzn(true == this.zza ? MimeTypes.VIDEO_MATROSKA : "video/webm");
                zztVar2222222222.zzo(str3);
                zztVar2222222222.zzp(i2);
                zztVar2222222222.zze(this.zzac);
                zztVar2222222222.zzf(i82222222222);
                zztVar2222222222.zzr(list);
                zztVar2222222222.zzk(str2);
                zztVar2222222222.zzs(this.zzl);
                this.zzZ = zztVar2222222222.zzO();
                return;
            case '\r':
                List singletonList = Collections.singletonList(zzi(str4));
                zzaen zza4 = zzaeo.zza(this.zzk);
                this.zzR = zza4.zza;
                this.zzP = zza4.zzb;
                String str9 = zza4.zzc;
                str5 = MimeTypes.AUDIO_AAC;
                str2 = str9;
                i5 = -1;
                list = singletonList;
                i2 = -1;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i822222222222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzt zztVar22222222222 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar22222222222.zzb(i);
                zztVar22222222222.zzn(true == this.zza ? MimeTypes.VIDEO_MATROSKA : "video/webm");
                zztVar22222222222.zzo(str3);
                zztVar22222222222.zzp(i2);
                zztVar22222222222.zze(this.zzac);
                zztVar22222222222.zzf(i822222222222);
                zztVar22222222222.zzr(list);
                zztVar22222222222.zzk(str2);
                zztVar22222222222.zzs(this.zzl);
                this.zzZ = zztVar22222222222.zzO();
                return;
            case 14:
                str5 = MimeTypes.AUDIO_MPEG_L2;
                i5 = -1;
                i2 = 4096;
                list = null;
                str2 = null;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i8222222222222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzt zztVar222222222222 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar222222222222.zzb(i);
                zztVar222222222222.zzn(true == this.zza ? MimeTypes.VIDEO_MATROSKA : "video/webm");
                zztVar222222222222.zzo(str3);
                zztVar222222222222.zzp(i2);
                zztVar222222222222.zze(this.zzac);
                zztVar222222222222.zzf(i8222222222222);
                zztVar222222222222.zzr(list);
                zztVar222222222222.zzk(str2);
                zztVar222222222222.zzs(this.zzl);
                this.zzZ = zztVar222222222222.zzO();
                return;
            case 15:
                str5 = MimeTypes.AUDIO_MPEG;
                i5 = -1;
                i2 = 4096;
                list = null;
                str2 = null;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i82222222222222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzt zztVar2222222222222 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar2222222222222.zzb(i);
                zztVar2222222222222.zzn(true == this.zza ? MimeTypes.VIDEO_MATROSKA : "video/webm");
                zztVar2222222222222.zzo(str3);
                zztVar2222222222222.zzp(i2);
                zztVar2222222222222.zze(this.zzac);
                zztVar2222222222222.zzf(i82222222222222);
                zztVar2222222222222.zzr(list);
                zztVar2222222222222.zzk(str2);
                zztVar2222222222222.zzs(this.zzl);
                this.zzZ = zztVar2222222222222.zzO();
                return;
            case 16:
                str5 = MimeTypes.AUDIO_AC3;
                i2 = -1;
                i5 = -1;
                list = null;
                str2 = null;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i822222222222222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzt zztVar22222222222222 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar22222222222222.zzb(i);
                zztVar22222222222222.zzn(true == this.zza ? MimeTypes.VIDEO_MATROSKA : "video/webm");
                zztVar22222222222222.zzo(str3);
                zztVar22222222222222.zzp(i2);
                zztVar22222222222222.zze(this.zzac);
                zztVar22222222222222.zzf(i822222222222222);
                zztVar22222222222222.zzr(list);
                zztVar22222222222222.zzk(str2);
                zztVar22222222222222.zzs(this.zzl);
                this.zzZ = zztVar22222222222222.zzO();
                return;
            case 17:
                str5 = MimeTypes.AUDIO_E_AC3;
                i2 = -1;
                i5 = -1;
                list = null;
                str2 = null;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i8222222222222222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzt zztVar222222222222222 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar222222222222222.zzb(i);
                zztVar222222222222222.zzn(true == this.zza ? MimeTypes.VIDEO_MATROSKA : "video/webm");
                zztVar222222222222222.zzo(str3);
                zztVar222222222222222.zzp(i2);
                zztVar222222222222222.zze(this.zzac);
                zztVar222222222222222.zzf(i8222222222222222);
                zztVar222222222222222.zzr(list);
                zztVar222222222222222.zzk(str2);
                zztVar222222222222222.zzs(this.zzl);
                this.zzZ = zztVar222222222222222.zzO();
                return;
            case 18:
                this.zzU = new zzahc();
                str5 = MimeTypes.AUDIO_TRUEHD;
                i2 = -1;
                i5 = -1;
                list = null;
                str2 = null;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i82222222222222222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzt zztVar2222222222222222 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar2222222222222222.zzb(i);
                zztVar2222222222222222.zzn(true == this.zza ? MimeTypes.VIDEO_MATROSKA : "video/webm");
                zztVar2222222222222222.zzo(str3);
                zztVar2222222222222222.zzp(i2);
                zztVar2222222222222222.zze(this.zzac);
                zztVar2222222222222222.zzf(i82222222222222222);
                zztVar2222222222222222.zzr(list);
                zztVar2222222222222222.zzk(str2);
                zztVar2222222222222222.zzs(this.zzl);
                this.zzZ = zztVar2222222222222222.zzO();
                return;
            case 19:
            case 20:
                this.zzV = true;
                str5 = MimeTypes.AUDIO_DTS;
                i2 = -1;
                i5 = -1;
                list = null;
                str2 = null;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i822222222222222222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzt zztVar22222222222222222 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar22222222222222222.zzb(i);
                zztVar22222222222222222.zzn(true == this.zza ? MimeTypes.VIDEO_MATROSKA : "video/webm");
                zztVar22222222222222222.zzo(str3);
                zztVar22222222222222222.zzp(i2);
                zztVar22222222222222222.zze(this.zzac);
                zztVar22222222222222222.zzf(i822222222222222222);
                zztVar22222222222222222.zzr(list);
                zztVar22222222222222222.zzk(str2);
                zztVar22222222222222222.zzs(this.zzl);
                this.zzZ = zztVar22222222222222222.zzO();
                return;
            case 21:
                str5 = MimeTypes.AUDIO_DTS_HD;
                i2 = -1;
                i5 = -1;
                list = null;
                str2 = null;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i8222222222222222222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzt zztVar222222222222222222 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar222222222222222222.zzb(i);
                zztVar222222222222222222.zzn(true == this.zza ? MimeTypes.VIDEO_MATROSKA : "video/webm");
                zztVar222222222222222222.zzo(str3);
                zztVar222222222222222222.zzp(i2);
                zztVar222222222222222222.zze(this.zzac);
                zztVar222222222222222222.zzf(i8222222222222222222);
                zztVar222222222222222222.zzr(list);
                zztVar222222222222222222.zzk(str2);
                zztVar222222222222222222.zzs(this.zzl);
                this.zzZ = zztVar222222222222222222.zzO();
                return;
            case 22:
                zzj = Collections.singletonList(zzi(str4));
                str5 = MimeTypes.AUDIO_FLAC;
                list = zzj;
                i2 = -1;
                i5 = -1;
                str2 = null;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i82222222222222222222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzt zztVar2222222222222222222 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar2222222222222222222.zzb(i);
                zztVar2222222222222222222.zzn(true == this.zza ? MimeTypes.VIDEO_MATROSKA : "video/webm");
                zztVar2222222222222222222.zzo(str3);
                zztVar2222222222222222222.zzp(i2);
                zztVar2222222222222222222.zze(this.zzac);
                zztVar2222222222222222222.zzf(i82222222222222222222);
                zztVar2222222222222222222.zzr(list);
                zztVar2222222222222222222.zzk(str2);
                zztVar2222222222222222222.zzs(this.zzl);
                this.zzZ = zztVar2222222222222222222.zzO();
                return;
            case 23:
                if (zzh(new zzes(zzi(this.zzc)))) {
                    i5 = zzfk.zzB(this.zzQ, ByteOrder.LITTLE_ENDIAN);
                    if (i5 == 0) {
                        int i13 = this.zzQ;
                        StringBuilder sb = new StringBuilder(String.valueOf(i13).length() + 64);
                        sb.append("Unsupported PCM bit depth: ");
                        sb.append(i13);
                        sb.append(". Setting mimeType to audio/x-unknown");
                        zzef.zzc("MatroskaExtractor", sb.toString());
                    }
                    i2 = -1;
                    list = null;
                    str2 = null;
                    if (this.zzO != null) {
                    }
                    str3 = str5;
                    int i822222222222222222222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                    zzt zztVar22222222222222222222 = new zzt();
                    if (!zzas.zza(str3)) {
                    }
                    if (this.zzb != null) {
                    }
                    zztVar22222222222222222222.zzb(i);
                    zztVar22222222222222222222.zzn(true == this.zza ? MimeTypes.VIDEO_MATROSKA : "video/webm");
                    zztVar22222222222222222222.zzo(str3);
                    zztVar22222222222222222222.zzp(i2);
                    zztVar22222222222222222222.zze(this.zzac);
                    zztVar22222222222222222222.zzf(i822222222222222222222);
                    zztVar22222222222222222222.zzr(list);
                    zztVar22222222222222222222.zzk(str2);
                    zztVar22222222222222222222.zzs(this.zzl);
                    this.zzZ = zztVar22222222222222222222.zzO();
                    return;
                }
                zzef.zzc("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                i2 = -1;
                i5 = -1;
                str5 = MimeTypes.AUDIO_UNKNOWN;
                list = null;
                str2 = null;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i8222222222222222222222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzt zztVar222222222222222222222 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar222222222222222222222.zzb(i);
                zztVar222222222222222222222.zzn(true == this.zza ? MimeTypes.VIDEO_MATROSKA : "video/webm");
                zztVar222222222222222222222.zzo(str3);
                zztVar222222222222222222222.zzp(i2);
                zztVar222222222222222222222.zze(this.zzac);
                zztVar222222222222222222222.zzf(i8222222222222222222222);
                zztVar222222222222222222222.zzr(list);
                zztVar222222222222222222222.zzk(str2);
                zztVar222222222222222222222.zzs(this.zzl);
                this.zzZ = zztVar222222222222222222222.zzO();
                return;
            case 24:
                i5 = zzfk.zzB(this.zzQ, ByteOrder.LITTLE_ENDIAN);
                if (i5 == 0) {
                    int i14 = this.zzQ;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i14).length() + 78);
                    sb2.append("Unsupported little endian PCM bit depth: ");
                    sb2.append(i14);
                    sb2.append(". Setting mimeType to audio/x-unknown");
                    zzef.zzc("MatroskaExtractor", sb2.toString());
                    i2 = -1;
                    i5 = -1;
                    str5 = MimeTypes.AUDIO_UNKNOWN;
                    list = null;
                    str2 = null;
                    if (this.zzO != null) {
                    }
                    str3 = str5;
                    int i82222222222222222222222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                    zzt zztVar2222222222222222222222 = new zzt();
                    if (!zzas.zza(str3)) {
                    }
                    if (this.zzb != null) {
                    }
                    zztVar2222222222222222222222.zzb(i);
                    zztVar2222222222222222222222.zzn(true == this.zza ? MimeTypes.VIDEO_MATROSKA : "video/webm");
                    zztVar2222222222222222222222.zzo(str3);
                    zztVar2222222222222222222222.zzp(i2);
                    zztVar2222222222222222222222.zze(this.zzac);
                    zztVar2222222222222222222222.zzf(i82222222222222222222222);
                    zztVar2222222222222222222222.zzr(list);
                    zztVar2222222222222222222222.zzk(str2);
                    zztVar2222222222222222222222.zzs(this.zzl);
                    this.zzZ = zztVar2222222222222222222222.zzO();
                    return;
                }
                i2 = -1;
                list = null;
                str2 = null;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i822222222222222222222222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzt zztVar22222222222222222222222 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar22222222222222222222222.zzb(i);
                zztVar22222222222222222222222.zzn(true == this.zza ? MimeTypes.VIDEO_MATROSKA : "video/webm");
                zztVar22222222222222222222222.zzo(str3);
                zztVar22222222222222222222222.zzp(i2);
                zztVar22222222222222222222222.zze(this.zzac);
                zztVar22222222222222222222222.zzf(i822222222222222222222222);
                zztVar22222222222222222222222.zzr(list);
                zztVar22222222222222222222222.zzk(str2);
                zztVar22222222222222222222222.zzs(this.zzl);
                this.zzZ = zztVar22222222222222222222222.zzO();
                return;
            case 25:
                int i15 = this.zzQ;
                if (i15 != 8) {
                    if (i15 == 16) {
                        i5 = 268435456;
                    } else if (i15 == 24) {
                        i5 = 1342177280;
                    } else {
                        if (i15 != 32) {
                            StringBuilder sb3 = new StringBuilder(String.valueOf(i15).length() + 75);
                            sb3.append("Unsupported big endian PCM bit depth: ");
                            sb3.append(i15);
                            sb3.append(". Setting mimeType to audio/x-unknown");
                            zzef.zzc("MatroskaExtractor", sb3.toString());
                            i2 = -1;
                            i5 = -1;
                            str5 = MimeTypes.AUDIO_UNKNOWN;
                            list = null;
                            str2 = null;
                            if (this.zzO != null) {
                            }
                            str3 = str5;
                            int i8222222222222222222222222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                            zzt zztVar222222222222222222222222 = new zzt();
                            if (!zzas.zza(str3)) {
                            }
                            if (this.zzb != null) {
                            }
                            zztVar222222222222222222222222.zzb(i);
                            zztVar222222222222222222222222.zzn(true == this.zza ? MimeTypes.VIDEO_MATROSKA : "video/webm");
                            zztVar222222222222222222222222.zzo(str3);
                            zztVar222222222222222222222222.zzp(i2);
                            zztVar222222222222222222222222.zze(this.zzac);
                            zztVar222222222222222222222222.zzf(i8222222222222222222222222);
                            zztVar222222222222222222222222.zzr(list);
                            zztVar222222222222222222222222.zzk(str2);
                            zztVar222222222222222222222222.zzs(this.zzl);
                            this.zzZ = zztVar222222222222222222222222.zzO();
                            return;
                        }
                        i5 = 1610612736;
                    }
                }
                i2 = -1;
                list = null;
                str2 = null;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i82222222222222222222222222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzt zztVar2222222222222222222222222 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar2222222222222222222222222.zzb(i);
                zztVar2222222222222222222222222.zzn(true == this.zza ? MimeTypes.VIDEO_MATROSKA : "video/webm");
                zztVar2222222222222222222222222.zzo(str3);
                zztVar2222222222222222222222222.zzp(i2);
                zztVar2222222222222222222222222.zze(this.zzac);
                zztVar2222222222222222222222222.zzf(i82222222222222222222222222);
                zztVar2222222222222222222222222.zzr(list);
                zztVar2222222222222222222222222.zzk(str2);
                zztVar2222222222222222222222222.zzs(this.zzl);
                this.zzZ = zztVar2222222222222222222222222.zzO();
                return;
            case 26:
                int i16 = this.zzQ;
                if (i16 == 32) {
                    i5 = 4;
                    i2 = -1;
                    list = null;
                    str2 = null;
                    if (this.zzO != null) {
                    }
                    str3 = str5;
                    int i822222222222222222222222222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                    zzt zztVar22222222222222222222222222 = new zzt();
                    if (!zzas.zza(str3)) {
                    }
                    if (this.zzb != null) {
                    }
                    zztVar22222222222222222222222222.zzb(i);
                    zztVar22222222222222222222222222.zzn(true == this.zza ? MimeTypes.VIDEO_MATROSKA : "video/webm");
                    zztVar22222222222222222222222222.zzo(str3);
                    zztVar22222222222222222222222222.zzp(i2);
                    zztVar22222222222222222222222222.zze(this.zzac);
                    zztVar22222222222222222222222222.zzf(i822222222222222222222222222);
                    zztVar22222222222222222222222222.zzr(list);
                    zztVar22222222222222222222222222.zzk(str2);
                    zztVar22222222222222222222222222.zzs(this.zzl);
                    this.zzZ = zztVar22222222222222222222222222.zzO();
                    return;
                }
                StringBuilder sb4 = new StringBuilder(String.valueOf(i16).length() + 79);
                sb4.append("Unsupported floating point PCM bit depth: ");
                sb4.append(i16);
                sb4.append(". Setting mimeType to audio/x-unknown");
                zzef.zzc("MatroskaExtractor", sb4.toString());
                i2 = -1;
                i5 = -1;
                str5 = MimeTypes.AUDIO_UNKNOWN;
                list = null;
                str2 = null;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i8222222222222222222222222222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzt zztVar222222222222222222222222222 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar222222222222222222222222222.zzb(i);
                zztVar222222222222222222222222222.zzn(true == this.zza ? MimeTypes.VIDEO_MATROSKA : "video/webm");
                zztVar222222222222222222222222222.zzo(str3);
                zztVar222222222222222222222222222.zzp(i2);
                zztVar222222222222222222222222222.zze(this.zzac);
                zztVar222222222222222222222222222.zzf(i8222222222222222222222222222);
                zztVar222222222222222222222222222.zzr(list);
                zztVar222222222222222222222222222.zzk(str2);
                zztVar222222222222222222222222222.zzs(this.zzl);
                this.zzZ = zztVar222222222222222222222222222.zzO();
                return;
            case 27:
                i2 = -1;
                i5 = -1;
                str5 = MimeTypes.APPLICATION_SUBRIP;
                list = null;
                str2 = null;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i82222222222222222222222222222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzt zztVar2222222222222222222222222222 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar2222222222222222222222222222.zzb(i);
                zztVar2222222222222222222222222222.zzn(true == this.zza ? MimeTypes.VIDEO_MATROSKA : "video/webm");
                zztVar2222222222222222222222222222.zzo(str3);
                zztVar2222222222222222222222222222.zzp(i2);
                zztVar2222222222222222222222222222.zze(this.zzac);
                zztVar2222222222222222222222222222.zzf(i82222222222222222222222222222);
                zztVar2222222222222222222222222222.zzr(list);
                zztVar2222222222222222222222222222.zzk(str2);
                zztVar2222222222222222222222222222.zzs(this.zzl);
                this.zzZ = zztVar2222222222222222222222222222.zzO();
                return;
            case 28:
            case 29:
                int i17 = zzakb.zza;
                byte[] zzi = zzi(this.zzc);
                bArr = zzakb.zzc;
                list = zzgvz.zzk(bArr, zzi);
                i2 = -1;
                i5 = -1;
                str5 = MimeTypes.TEXT_SSA;
                str2 = null;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i822222222222222222222222222222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzt zztVar22222222222222222222222222222 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar22222222222222222222222222222.zzb(i);
                zztVar22222222222222222222222222222.zzn(true == this.zza ? MimeTypes.VIDEO_MATROSKA : "video/webm");
                zztVar22222222222222222222222222222.zzo(str3);
                zztVar22222222222222222222222222222.zzp(i2);
                zztVar22222222222222222222222222222.zze(this.zzac);
                zztVar22222222222222222222222222222.zzf(i822222222222222222222222222222);
                zztVar22222222222222222222222222222.zzr(list);
                zztVar22222222222222222222222222222.zzk(str2);
                zztVar22222222222222222222222222222.zzs(this.zzl);
                this.zzZ = zztVar22222222222222222222222222222.zzO();
                return;
            case 30:
                str5 = MimeTypes.TEXT_VTT;
                i2 = -1;
                i5 = -1;
                list = null;
                str2 = null;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i8222222222222222222222222222222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzt zztVar222222222222222222222222222222 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar222222222222222222222222222222.zzb(i);
                zztVar222222222222222222222222222222.zzn(true == this.zza ? MimeTypes.VIDEO_MATROSKA : "video/webm");
                zztVar222222222222222222222222222222.zzo(str3);
                zztVar222222222222222222222222222222.zzp(i2);
                zztVar222222222222222222222222222222.zze(this.zzac);
                zztVar222222222222222222222222222222.zzf(i8222222222222222222222222222222);
                zztVar222222222222222222222222222222.zzr(list);
                zztVar222222222222222222222222222222.zzk(str2);
                zztVar222222222222222222222222222222.zzs(this.zzl);
                this.zzZ = zztVar222222222222222222222222222222.zzO();
                return;
            case 31:
                zzj = zzgvz.zzj(zzi(str4));
                str5 = MimeTypes.APPLICATION_VOBSUB;
                list = zzj;
                i2 = -1;
                i5 = -1;
                str2 = null;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i82222222222222222222222222222222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzt zztVar2222222222222222222222222222222 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar2222222222222222222222222222222.zzb(i);
                zztVar2222222222222222222222222222222.zzn(true == this.zza ? MimeTypes.VIDEO_MATROSKA : "video/webm");
                zztVar2222222222222222222222222222222.zzo(str3);
                zztVar2222222222222222222222222222222.zzp(i2);
                zztVar2222222222222222222222222222222.zze(this.zzac);
                zztVar2222222222222222222222222222222.zzf(i82222222222222222222222222222222);
                zztVar2222222222222222222222222222222.zzr(list);
                zztVar2222222222222222222222222222222.zzk(str2);
                zztVar2222222222222222222222222222222.zzs(this.zzl);
                this.zzZ = zztVar2222222222222222222222222222222.zzO();
                return;
            case ' ':
                str5 = MimeTypes.APPLICATION_PGS;
                i2 = -1;
                i5 = -1;
                list = null;
                str2 = null;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i822222222222222222222222222222222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzt zztVar22222222222222222222222222222222 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar22222222222222222222222222222222.zzb(i);
                zztVar22222222222222222222222222222222.zzn(true == this.zza ? MimeTypes.VIDEO_MATROSKA : "video/webm");
                zztVar22222222222222222222222222222222.zzo(str3);
                zztVar22222222222222222222222222222222.zzp(i2);
                zztVar22222222222222222222222222222222.zze(this.zzac);
                zztVar22222222222222222222222222222222.zzf(i822222222222222222222222222222222);
                zztVar22222222222222222222222222222222.zzr(list);
                zztVar22222222222222222222222222222222.zzk(str2);
                zztVar22222222222222222222222222222222.zzs(this.zzl);
                this.zzZ = zztVar22222222222222222222222222222222.zzO();
                return;
            case '!':
                byte[] bArr6 = new byte[4];
                System.arraycopy(zzi(str4), 0, bArr6, 0, 4);
                zzj = zzgvz.zzj(bArr6);
                str5 = MimeTypes.APPLICATION_DVBSUBS;
                list = zzj;
                i2 = -1;
                i5 = -1;
                str2 = null;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i8222222222222222222222222222222222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzt zztVar222222222222222222222222222222222 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar222222222222222222222222222222222.zzb(i);
                zztVar222222222222222222222222222222222.zzn(true == this.zza ? MimeTypes.VIDEO_MATROSKA : "video/webm");
                zztVar222222222222222222222222222222222.zzo(str3);
                zztVar222222222222222222222222222222222.zzp(i2);
                zztVar222222222222222222222222222222222.zze(this.zzac);
                zztVar222222222222222222222222222222222.zzf(i8222222222222222222222222222222222);
                zztVar222222222222222222222222222222222.zzr(list);
                zztVar222222222222222222222222222222222.zzk(str2);
                zztVar222222222222222222222222222222222.zzs(this.zzl);
                this.zzZ = zztVar222222222222222222222222222222222.zzO();
                return;
            default:
                throw zzat.zzb("Unrecognized codec identifier.", null);
        }
    }

    final /* synthetic */ void zzb() {
        this.zzY.getClass();
    }

    final /* synthetic */ int zzc() {
        return this.zzab;
    }

    final /* synthetic */ void zzd(int i) {
        this.zzab = i;
    }

    final /* synthetic */ void zze(String str) {
        this.zzac = str;
    }
}
