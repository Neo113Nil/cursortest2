package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.mp4.Atom;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
public final class zzald {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb;

    static {
        String str = zzfk.zza;
        zzb = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static int zza(int i) {
        return (i >> 24) & 255;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00eb, code lost:
    
        if (r24 == 0) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0de7  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0e1b  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x0c00  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x0c02  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:574:0x0d7a  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x0d7e  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x0242 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:592:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:594:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List zzb(zzfw zzfwVar, zzagi zzagiVar, long j, zzq zzqVar, boolean z, boolean z2, zzgsn zzgsnVar, boolean z3) throws zzat {
        int i;
        long j2;
        int i2;
        int i3;
        int i4;
        boolean z4;
        int i5;
        long j3;
        long j4;
        long zzv;
        int i6;
        int zza2;
        int i7;
        zzfw zzfwVar2;
        long j5;
        long j6;
        int i8;
        int i9;
        String str;
        zzfx zzc;
        ArrayList arrayList;
        zzfw zzfwVar3;
        long[] jArr;
        long[] jArr2;
        zzv zzvVar;
        zzgsn zzgsnVar2;
        zzamb zzambVar;
        Pair zzn;
        int i10;
        boolean z5;
        short s;
        int i11;
        short s2;
        int i12;
        long j7;
        zzes zzesVar;
        ArrayList arrayList2;
        String str2;
        zzq zzqVar2;
        int i13;
        String str3;
        long j8;
        int i14;
        int i15;
        char c;
        String str4;
        String str5;
        int i16;
        int i17;
        String str6;
        zzakz zzakzVar;
        int i18;
        int i19;
        int i20;
        boolean z6;
        String str7;
        String str8;
        zzakz zzakzVar2;
        int i21;
        int i22;
        int i23;
        int i24;
        zzgl zzglVar;
        boolean z7;
        int i25;
        boolean z8;
        int i26;
        String str9;
        boolean z9;
        boolean z10;
        boolean z11;
        zzq zzqVar3;
        int i27;
        zzgvz zzgvzVar;
        String str10;
        String str11;
        String str12;
        long j9;
        zzgvz zzgvzVar2;
        boolean z12;
        zzamb zzambVar2;
        ArrayList arrayList3;
        zzfw zzfwVar4 = zzfwVar;
        ArrayList arrayList4 = new ArrayList();
        int i28 = 0;
        while (true) {
            List list = zzfwVar4.zzc;
            if (i28 >= list.size()) {
                return arrayList4;
            }
            zzfw zzfwVar5 = (zzfw) list.get(i28);
            if (zzfwVar5.zzd != 1953653099) {
                arrayList3 = arrayList4;
                i = i28;
            } else {
                zzfx zzc2 = zzfwVar4.zzc(Atom.TYPE_mvhd);
                zzc2.getClass();
                zzfw zzd = zzfwVar5.zzd(Atom.TYPE_mdia);
                zzd.getClass();
                zzfx zzc3 = zzd.zzc(Atom.TYPE_hdlr);
                zzc3.getClass();
                int zzi = zzi(zzc3.zza);
                int i29 = zzi == 1936684398 ? 1 : zzi == 1986618469 ? 2 : (zzi == 1952807028 || zzi == 1935832172 || zzi == 1937072756 || zzi == 1668047728 || zzi == 1937072752) ? 3 : zzi == 1835365473 ? 5 : -1;
                if (i29 == -1) {
                    zzgsnVar2 = zzgsnVar;
                    arrayList = arrayList4;
                    i = i28;
                    zzfwVar3 = zzfwVar5;
                } else {
                    zzfx zzc4 = zzfwVar5.zzc(Atom.TYPE_tkhd);
                    zzc4.getClass();
                    zzes zzesVar2 = zzc4.zza;
                    int i30 = 8;
                    zzesVar2.zzh(8);
                    int zza3 = zza(zzesVar2.zzB());
                    zzesVar2.zzk(zza3 == 0 ? 8 : 16);
                    int zzB = zzesVar2.zzB();
                    char c2 = 0;
                    int i31 = 4;
                    zzesVar2.zzk(4);
                    int zzg = zzesVar2.zzg();
                    int i32 = 0;
                    while (true) {
                        if (zza3 == 0) {
                            i30 = i31;
                        }
                        i = i28;
                        if (i32 >= i30) {
                            zzesVar2.zzk(i30);
                            break;
                        }
                        if (zzesVar2.zzi()[zzg + i32] != -1) {
                            j2 = zza3 == 0 ? zzesVar2.zzz() : zzesVar2.zzJ();
                        } else {
                            i32++;
                            i28 = i;
                            i30 = 8;
                            i31 = 4;
                        }
                    }
                    j2 = C.TIME_UNSET;
                    zzesVar2.zzk(10);
                    int zzt = zzesVar2.zzt();
                    zzesVar2.zzk(4);
                    int zzB2 = zzesVar2.zzB();
                    int zzB3 = zzesVar2.zzB();
                    zzesVar2.zzk(4);
                    int zzB4 = zzesVar2.zzB();
                    int zzB5 = zzesVar2.zzB();
                    if (zzB2 == 0) {
                        if (zzB3 == 65536) {
                            if (zzB4 != -65536) {
                                if (zzB4 == 65536) {
                                    z12 = zzB5 != 0;
                                    zzB4 = 65536;
                                }
                                zzB3 = 65536;
                            } else {
                                z12 = zzB5 != 0;
                            }
                            if (true != z12) {
                                i5 = 90;
                                i4 = i5;
                                i2 = 1;
                                zzesVar2.zzk(16);
                                short zzv2 = zzesVar2.zzv();
                                zzesVar2.zzk(2);
                                short zzv3 = zzesVar2.zzv();
                                j3 = j == C.TIME_UNSET ? j2 : j;
                                long j10 = zzd(zzc2.zza).zzc;
                                if (j3 == C.TIME_UNSET) {
                                    j4 = j10;
                                    zzv = -9223372036854775807L;
                                } else {
                                    j4 = j10;
                                    zzv = zzfk.zzv(j3, 1000000L, j4, RoundingMode.DOWN);
                                }
                                zzfw zzd2 = zzd.zzd(Atom.TYPE_minf);
                                zzd2.getClass();
                                zzfw zzd3 = zzd2.zzd(Atom.TYPE_stbl);
                                zzd3.getClass();
                                zzfx zzc5 = zzd.zzc(Atom.TYPE_mdhd);
                                zzc5.getClass();
                                zzes zzesVar3 = zzc5.zza;
                                i6 = 8;
                                zzesVar3.zzh(8);
                                zza2 = zza(zzesVar3.zzB());
                                zzesVar3.zzk(zza2 == 0 ? 8 : 16);
                                long zzz = zzesVar3.zzz();
                                int zzg2 = zzesVar3.zzg();
                                i7 = 0;
                                while (true) {
                                    if (zza2 == 0) {
                                        i6 = 4;
                                    }
                                    if (i7 >= i6) {
                                        zzfwVar2 = zzfwVar5;
                                        j5 = zzz;
                                        zzesVar3.zzk(i6);
                                        j6 = -9223372036854775807L;
                                        break;
                                    }
                                    if (zzesVar3.zzi()[zzg2 + i7] != -1) {
                                        long zzz2 = zza2 == 0 ? zzesVar3.zzz() : zzesVar3.zzJ();
                                        if (zzz2 == 0) {
                                            zzfwVar2 = zzfwVar5;
                                            j6 = -9223372036854775807L;
                                        } else {
                                            j6 = zzfk.zzv(zzz2, 1000000L, zzz, RoundingMode.DOWN);
                                            zzfwVar2 = zzfwVar5;
                                        }
                                        j5 = zzz;
                                    } else {
                                        i7++;
                                        zzfwVar5 = zzfwVar5;
                                        i6 = 8;
                                    }
                                }
                                int zzt2 = zzesVar3.zzt();
                                char c3 = (char) (((zzt2 >> 10) & 31) + 96);
                                char c4 = (char) (((zzt2 >> 5) & 31) + 96);
                                char c5 = (char) ((zzt2 & 31) + 96);
                                char[] cArr = new char[3];
                                cArr[0] = c3;
                                cArr[i2] = c4;
                                char c6 = 2;
                                cArr[2] = c5;
                                i9 = 0;
                                for (i8 = 3; i9 < i8; i8 = 3) {
                                    char c7 = cArr[i9];
                                    if (c7 < 'a' || c7 > 'z') {
                                        str = null;
                                        break;
                                    }
                                    i9++;
                                }
                                str = new String(cArr);
                                zzc = zzd3.zzc(Atom.TYPE_stsd);
                                if (zzc == null) {
                                    zzef.zzc("BoxParsers", "Ignoring track where sample table (stbl) box is missing a sample description (stsd).");
                                    zzgsnVar2 = zzgsnVar;
                                    arrayList = arrayList4;
                                    zzfwVar3 = zzfwVar2;
                                } else {
                                    String zzc6 = zzakw.zzc(j5, j6, str);
                                    zzes zzesVar4 = zzc.zza;
                                    zzesVar4.zzh(12);
                                    int zzB6 = zzesVar4.zzB();
                                    zzakz zzakzVar3 = new zzakz(zzB6);
                                    int i33 = i29;
                                    int i34 = 0;
                                    while (i34 < zzB6) {
                                        int i35 = i34;
                                        int zzg3 = zzesVar4.zzg();
                                        int zzB7 = zzesVar4.zzB();
                                        if (zzB7 > 0) {
                                            i10 = zzg3;
                                            z5 = i2;
                                        } else {
                                            i10 = zzg3;
                                            z5 = c2;
                                        }
                                        int i36 = zzt;
                                        String str13 = "childAtomSize must be positive";
                                        zzaft.zza(z5, "childAtomSize must be positive");
                                        int zzB8 = zzesVar4.zzB();
                                        long j11 = j6;
                                        if (zzB8 == 1635148593 || zzB8 == 1635148595 || zzB8 == 1701733238 || zzB8 == 1831958048 || zzB8 == 1836070006 || zzB8 == 1752589105 || zzB8 == 1751479857 || zzB8 == 1987470129 || zzB8 == 1987471665 || zzB8 == 1932670515 || zzB8 == 1211250227 || zzB8 == 1748121139 || zzB8 == 1987063864 || zzB8 == 1987063865 || zzB8 == 1635135537 || zzB8 == 1685479798 || zzB8 == 1685479729 || zzB8 == 1685481573 || zzB8 == 1685481521 || zzB8 == 1634760241 || zzB8 == 1684108849) {
                                            s = zzv3;
                                            i11 = zzB6;
                                            zzakz zzakzVar4 = zzakzVar3;
                                            s2 = zzv2;
                                            int i37 = zzB7;
                                            i12 = i36;
                                            j7 = j11;
                                            String str14 = zzc6;
                                            int i38 = zzB8;
                                            int i39 = zzB;
                                            int i40 = i10;
                                            zzesVar = zzesVar4;
                                            zzesVar.zzh(i40 + 16);
                                            zzesVar.zzk(16);
                                            int zzt3 = zzesVar.zzt();
                                            i35 = i35;
                                            int zzt4 = zzesVar.zzt();
                                            arrayList2 = arrayList4;
                                            zzesVar.zzk(50);
                                            int zzg4 = zzesVar.zzg();
                                            str2 = str;
                                            int i41 = Atom.TYPE_encv;
                                            if (i38 == 1701733238) {
                                                Pair zzr = zzr(zzesVar, i40, i37);
                                                if (zzr != null) {
                                                    int intValue = ((Integer) zzr.first).intValue();
                                                    if (zzqVar == null) {
                                                        i27 = intValue;
                                                        zzqVar3 = null;
                                                    } else {
                                                        i27 = intValue;
                                                        zzqVar3 = zzqVar.zzb(((zzamc) zzr.second).zzb);
                                                    }
                                                    zzakzVar4.zza[i35] = (zzamc) zzr.second;
                                                    i41 = i27;
                                                } else {
                                                    zzqVar3 = zzqVar;
                                                }
                                                zzesVar.zzh(zzg4);
                                                i38 = i41;
                                                zzqVar2 = zzqVar3;
                                            } else {
                                                zzqVar2 = zzqVar;
                                            }
                                            if (i38 == 1831958048) {
                                                int i42 = i38;
                                                str3 = MimeTypes.VIDEO_MPEG;
                                                i13 = i42;
                                            } else {
                                                i13 = Atom.TYPE_H263;
                                                if (i38 == 1211250227) {
                                                    str3 = MimeTypes.VIDEO_H263;
                                                } else {
                                                    i13 = i38;
                                                    str3 = null;
                                                }
                                            }
                                            zzq zzqVar4 = zzqVar2;
                                            int i43 = zzg4;
                                            int i44 = i4;
                                            String str15 = str3;
                                            j8 = j5;
                                            float f = 1.0f;
                                            int i45 = 8;
                                            int i46 = -1;
                                            int i47 = 8;
                                            List list2 = null;
                                            int i48 = -1;
                                            zzgl zzglVar2 = null;
                                            int i49 = -1;
                                            ByteBuffer byteBuffer = null;
                                            String str16 = null;
                                            zzaks zzaksVar = null;
                                            zzaku zzakuVar = null;
                                            int i50 = -1;
                                            int i51 = -1;
                                            byte[] bArr = null;
                                            int i52 = -1;
                                            boolean z13 = false;
                                            int i53 = -1;
                                            zzft zzftVar = null;
                                            i14 = i40;
                                            int i54 = -1;
                                            while (i43 - i14 < i37) {
                                                zzesVar.zzh(i43);
                                                int zzg5 = zzesVar.zzg();
                                                int zzB9 = zzesVar.zzB();
                                                if (zzB9 == 0) {
                                                    i18 = i43;
                                                    if (zzesVar.zzg() - i14 == i37) {
                                                        break;
                                                    }
                                                    i19 = 0;
                                                } else {
                                                    i18 = i43;
                                                    i19 = zzB9;
                                                }
                                                if (i19 > 0) {
                                                    i20 = i37;
                                                    z6 = true;
                                                } else {
                                                    i20 = i37;
                                                    z6 = false;
                                                }
                                                zzaft.zza(z6, str13);
                                                int zzB10 = zzesVar.zzB();
                                                if (zzB10 == 1635148611) {
                                                    int i55 = zzg5 + 8;
                                                    zzaft.zza(str15 == null, null);
                                                    zzesVar.zzh(i55);
                                                    zzaeu zza4 = zzaeu.zza(zzesVar);
                                                    List list3 = zza4.zza;
                                                    zzakzVar4.zzc = zza4.zzb;
                                                    if (z13) {
                                                        z11 = true;
                                                    } else {
                                                        f = zza4.zzk;
                                                        z11 = false;
                                                    }
                                                    String str17 = zza4.zzl;
                                                    int i56 = zza4.zzj;
                                                    int i57 = zza4.zzg;
                                                    int i58 = zza4.zzh;
                                                    int i59 = zza4.zzi;
                                                    int i60 = zza4.zze;
                                                    i22 = i13;
                                                    z13 = z11;
                                                    str8 = str13;
                                                    i51 = i56;
                                                    zzakzVar2 = zzakzVar4;
                                                    i54 = i57;
                                                    str7 = "video/avc";
                                                    i47 = zza4.zzf;
                                                    str16 = str17;
                                                    i46 = i59;
                                                    i45 = i60;
                                                    i48 = i58;
                                                    list2 = list3;
                                                } else {
                                                    if (zzB10 == 1752589123) {
                                                        int i61 = zzg5 + 8;
                                                        zzaft.zza(str15 == null, null);
                                                        zzesVar.zzh(i61);
                                                        zzagj zza5 = zzagj.zza(zzesVar);
                                                        List list4 = zza5.zza;
                                                        zzakzVar4.zzc = zza5.zzb;
                                                        if (z13) {
                                                            z10 = true;
                                                        } else {
                                                            f = zza5.zzl;
                                                            z10 = false;
                                                        }
                                                        int i62 = zza5.zzm;
                                                        int i63 = zza5.zzc;
                                                        String str18 = zza5.zzn;
                                                        int i64 = zza5.zzk;
                                                        if (i64 == -1) {
                                                            i64 = i49;
                                                        }
                                                        int i65 = zza5.zzd;
                                                        int i66 = zza5.zze;
                                                        int i67 = zza5.zzh;
                                                        int i68 = zza5.zzi;
                                                        int i69 = zza5.zzj;
                                                        int i70 = zza5.zzf;
                                                        int i71 = zza5.zzg;
                                                        i22 = i13;
                                                        z13 = z10;
                                                        str8 = str13;
                                                        zzakzVar2 = zzakzVar4;
                                                        i53 = i65;
                                                        i48 = i68;
                                                        i54 = i67;
                                                        str7 = "video/hevc";
                                                        i49 = i64;
                                                        i52 = i66;
                                                        list2 = list4;
                                                        zzglVar2 = zza5.zzo;
                                                        str16 = str18;
                                                        i45 = i70;
                                                        i47 = i71;
                                                        i51 = i62;
                                                        i46 = i69;
                                                        i50 = i63;
                                                    } else {
                                                        if (zzB10 == 1818785347) {
                                                            int i72 = zzg5 + 8;
                                                            zzaft.zza("video/hevc".equals(str15), "lhvC must follow hvcC atom");
                                                            if (zzglVar2 != null) {
                                                                z9 = zzglVar2.zza.size() >= 2;
                                                            } else {
                                                                z9 = false;
                                                                zzglVar2 = null;
                                                            }
                                                            zzaft.zza(z9, "must have at least two layers");
                                                            zzesVar.zzh(i72);
                                                            zzglVar2.getClass();
                                                            zzagj zzb2 = zzagj.zzb(zzesVar, zzglVar2);
                                                            zzaft.zza(zzakzVar4.zzc == zzb2.zzb, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms");
                                                            int i73 = zzb2.zzh;
                                                            if (i73 != -1) {
                                                                zzaft.zza(i54 == i73, "colorSpace must be the same for both views");
                                                            }
                                                            int i74 = zzb2.zzi;
                                                            if (i74 != -1) {
                                                                zzaft.zza(i48 == i74, "colorRange must be the same for both views");
                                                            }
                                                            int i75 = zzb2.zzj;
                                                            if (i75 != -1) {
                                                                zzaft.zza(i46 == i75, "colorTransfer must be the same for both views");
                                                            }
                                                            zzaft.zza(i45 == zzb2.zzf, "bitdepthLuma must be the same for both views");
                                                            zzaft.zza(i47 == zzb2.zzg, "bitdepthChroma must be the same for both views");
                                                            if (list2 != null) {
                                                                int i76 = zzgvz.zzd;
                                                                zzgvw zzgvwVar = new zzgvw();
                                                                zzgvwVar.zzh(list2);
                                                                zzgvwVar.zzh(zzb2.zza);
                                                                list2 = zzgvwVar.zzi();
                                                            } else {
                                                                zzaft.zza(false, "initializationData must be already set from hvcC atom");
                                                            }
                                                            i22 = i13;
                                                            str16 = zzb2.zzn;
                                                            str8 = str13;
                                                            str7 = "video/mv-hevc";
                                                            zzakzVar2 = zzakzVar4;
                                                        } else {
                                                            if (zzB10 == 1987470147) {
                                                                int i77 = zzg5 + 8;
                                                                zzaft.zza(str15 == null, null);
                                                                zzesVar.zzh(i77);
                                                                zzahi zza6 = zzahi.zza(zzesVar);
                                                                List list5 = zza6.zza;
                                                                zzakzVar4.zzc = zza6.zzb;
                                                                String str19 = zza6.zzc;
                                                                i45 = zza6.zzd;
                                                                i22 = i13;
                                                                list2 = list5;
                                                                str8 = str13;
                                                                str16 = str19;
                                                                zzakzVar2 = zzakzVar4;
                                                                str7 = "video/vvc";
                                                                i51 = 16;
                                                                i47 = i45;
                                                            } else if (zzB10 == 1986361461) {
                                                                zzesVar.zzh(zzg5 + 8);
                                                                str7 = str15;
                                                                int zzg6 = zzesVar.zzg();
                                                                zzakv zzakvVar = null;
                                                                while (zzg6 - zzg5 < i19) {
                                                                    zzesVar.zzh(zzg6);
                                                                    int zzB11 = zzesVar.zzB();
                                                                    if (zzB11 > 0) {
                                                                        i25 = zzg6;
                                                                        z8 = true;
                                                                    } else {
                                                                        i25 = zzg6;
                                                                        z8 = false;
                                                                    }
                                                                    zzaft.zza(z8, str13);
                                                                    zzakz zzakzVar5 = zzakzVar4;
                                                                    if (zzesVar.zzB() == 1702454643) {
                                                                        zzesVar.zzh(i25 + 8);
                                                                        int zzg7 = zzesVar.zzg();
                                                                        while (true) {
                                                                            if (zzg7 - i25 >= zzB11) {
                                                                                i26 = zzB11;
                                                                                str9 = str13;
                                                                                zzakvVar = null;
                                                                                break;
                                                                            }
                                                                            zzesVar.zzh(zzg7);
                                                                            int zzB12 = zzesVar.zzB();
                                                                            zzaft.zza(zzB12 > 0, str13);
                                                                            i26 = zzB11;
                                                                            if (zzesVar.zzB() == 1937011305) {
                                                                                zzesVar.zzk(4);
                                                                                int zzs = zzesVar.zzs();
                                                                                str9 = str13;
                                                                                zzakvVar = new zzakv(new zzaky(1 == (zzs & 1), (zzs & 2) == 2, (zzs & 8) == 8));
                                                                            } else {
                                                                                zzg7 += zzB12;
                                                                                zzB11 = i26;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        i26 = zzB11;
                                                                        str9 = str13;
                                                                    }
                                                                    zzg6 = i25 + i26;
                                                                    zzakzVar4 = zzakzVar5;
                                                                    str13 = str9;
                                                                }
                                                                str8 = str13;
                                                                zzakzVar2 = zzakzVar4;
                                                                zzalc zzalcVar = zzakvVar == null ? null : new zzalc(zzakvVar);
                                                                if (zzalcVar != null) {
                                                                    if (zzglVar2 == null) {
                                                                        zzglVar2 = null;
                                                                    } else if (zzglVar2.zza.size() >= 2) {
                                                                        zzaft.zza(zzalcVar.zza(), "both eye views must be marked as available");
                                                                        zzaft.zza(!zzalcVar.zzb().zza().zzc(), "for MV-HEVC, eye_views_reversed must be set to false");
                                                                    }
                                                                    if (i49 == -1) {
                                                                        i22 = i13;
                                                                        i49 = true != zzalcVar.zzb().zza().zzc() ? 4 : 5;
                                                                    } else {
                                                                        i22 = i13;
                                                                    }
                                                                }
                                                                i21 = i45;
                                                                i22 = i13;
                                                                i23 = i47;
                                                                i24 = i48;
                                                                zzglVar = zzglVar2;
                                                                zzglVar2 = zzglVar;
                                                                i47 = i23;
                                                                i45 = i21;
                                                                i48 = i24;
                                                            } else {
                                                                str7 = str15;
                                                                str8 = str13;
                                                                zzakzVar2 = zzakzVar4;
                                                                if (zzB10 == 1685480259 || zzB10 == 1685485123 || zzB10 == 1685485379) {
                                                                    i21 = i45;
                                                                    i22 = i13;
                                                                    i23 = i47;
                                                                    i24 = i48;
                                                                    zzglVar = zzglVar2;
                                                                    zzftVar = zzft.zza(zzesVar);
                                                                } else if (zzB10 == 1987076931) {
                                                                    int i78 = zzg5 + 12;
                                                                    zzaft.zza(str7 == null, null);
                                                                    zzesVar.zzh(i78);
                                                                    byte zzs2 = (byte) zzesVar.zzs();
                                                                    byte zzs3 = (byte) zzesVar.zzs();
                                                                    int zzs4 = zzesVar.zzs();
                                                                    int i79 = zzs4 >> 4;
                                                                    int i80 = zzs4 >> 1;
                                                                    String str20 = i13 == 1987063864 ? MimeTypes.VIDEO_VP8 : MimeTypes.VIDEO_VP9;
                                                                    if (str20.equals(MimeTypes.VIDEO_VP9)) {
                                                                        list2 = zzdp.zza(zzs2, zzs3, (byte) i79, (byte) (i80 & 7));
                                                                    }
                                                                    int i81 = zzs4 & 1;
                                                                    int zzs5 = zzesVar.zzs();
                                                                    int zzs6 = zzesVar.zzs();
                                                                    int zzb3 = zzi.zzb(zzs5);
                                                                    int i82 = 1 != i81 ? 2 : 1;
                                                                    int zzc7 = zzi.zzc(zzs6);
                                                                    i22 = i13;
                                                                    i54 = zzb3;
                                                                    i47 = i79;
                                                                    i48 = i82;
                                                                    str7 = str20;
                                                                    i46 = zzc7;
                                                                    i45 = i47;
                                                                } else if (zzB10 == 1635135811) {
                                                                    int i83 = i19 - 8;
                                                                    byte[] bArr2 = new byte[i83];
                                                                    zzesVar.zzm(bArr2, 0, i83);
                                                                    zzgvz zzj = zzgvz.zzj(bArr2);
                                                                    zzesVar.zzh(zzg5 + 8);
                                                                    zzi zzk = zzk(zzesVar);
                                                                    list2 = zzj;
                                                                    i22 = i13;
                                                                    i45 = zzk.zzf;
                                                                    i47 = zzk.zzg;
                                                                    i54 = zzk.zzb;
                                                                    i48 = zzk.zzc;
                                                                    str7 = "video/av01";
                                                                    i46 = zzk.zzd;
                                                                } else if (zzB10 == 1668050025) {
                                                                    if (byteBuffer == null) {
                                                                        byteBuffer = zzm();
                                                                    }
                                                                    ByteBuffer byteBuffer2 = byteBuffer;
                                                                    byteBuffer2.position(21);
                                                                    byteBuffer2.putShort(zzesVar.zzv());
                                                                    byteBuffer2.putShort(zzesVar.zzv());
                                                                    i22 = i13;
                                                                    byteBuffer = byteBuffer2;
                                                                } else if (zzB10 == 1835295606) {
                                                                    if (byteBuffer == null) {
                                                                        byteBuffer = zzm();
                                                                    }
                                                                    ByteBuffer byteBuffer3 = byteBuffer;
                                                                    short zzv4 = zzesVar.zzv();
                                                                    short zzv5 = zzesVar.zzv();
                                                                    short zzv6 = zzesVar.zzv();
                                                                    short zzv7 = zzesVar.zzv();
                                                                    i22 = i13;
                                                                    short zzv8 = zzesVar.zzv();
                                                                    zzgl zzglVar3 = zzglVar2;
                                                                    short zzv9 = zzesVar.zzv();
                                                                    int i84 = i47;
                                                                    short zzv10 = zzesVar.zzv();
                                                                    int i85 = i45;
                                                                    short zzv11 = zzesVar.zzv();
                                                                    long zzz3 = zzesVar.zzz();
                                                                    long zzz4 = zzesVar.zzz();
                                                                    byteBuffer3.position(1);
                                                                    byteBuffer3.putShort(zzv8);
                                                                    byteBuffer3.putShort(zzv9);
                                                                    byteBuffer3.putShort(zzv4);
                                                                    byteBuffer3.putShort(zzv5);
                                                                    byteBuffer3.putShort(zzv6);
                                                                    byteBuffer3.putShort(zzv7);
                                                                    byteBuffer3.putShort(zzv10);
                                                                    byteBuffer3.putShort(zzv11);
                                                                    byteBuffer3.putShort((short) (zzz3 / 10000));
                                                                    byteBuffer3.putShort((short) (zzz4 / 10000));
                                                                    byteBuffer = byteBuffer3;
                                                                    zzglVar2 = zzglVar3;
                                                                    i47 = i84;
                                                                    i45 = i85;
                                                                    i48 = i48;
                                                                } else {
                                                                    i21 = i45;
                                                                    i22 = i13;
                                                                    i23 = i47;
                                                                    i24 = i48;
                                                                    zzglVar = zzglVar2;
                                                                    if (zzB10 == 1681012275) {
                                                                        zzaft.zza(str7 == null, null);
                                                                        str7 = MimeTypes.VIDEO_H263;
                                                                    } else if (zzB10 == 1702061171) {
                                                                        zzaft.zza(str7 == null, null);
                                                                        zzaku zzp = zzp(zzesVar, zzg5);
                                                                        String zza7 = zzp.zza();
                                                                        byte[] zzb4 = zzp.zzb();
                                                                        if (zzb4 != null) {
                                                                            zzakuVar = zzp;
                                                                            str7 = zza7;
                                                                            list2 = zzgvz.zzj(zzb4);
                                                                        } else {
                                                                            zzakuVar = zzp;
                                                                            str7 = zza7;
                                                                        }
                                                                    } else if (zzB10 == 1651798644) {
                                                                        zzaksVar = zzq(zzesVar, zzg5);
                                                                    } else if (zzB10 == 1885434736) {
                                                                        zzesVar.zzh(zzg5 + 8);
                                                                        f = zzesVar.zzH() / zzesVar.zzH();
                                                                        zzglVar2 = zzglVar;
                                                                        i47 = i23;
                                                                        i45 = i21;
                                                                        i48 = i24;
                                                                        z13 = true;
                                                                    } else if (zzB10 == 1937126244) {
                                                                        int i86 = zzg5 + 8;
                                                                        while (true) {
                                                                            if (i86 - zzg5 >= i19) {
                                                                                bArr = null;
                                                                                break;
                                                                            }
                                                                            zzesVar.zzh(i86);
                                                                            int zzB13 = zzesVar.zzB() + i86;
                                                                            if (zzesVar.zzB() == 1886547818) {
                                                                                bArr = Arrays.copyOfRange(zzesVar.zzi(), i86, zzB13);
                                                                                break;
                                                                            }
                                                                            i86 = zzB13;
                                                                        }
                                                                    } else if (zzB10 == 1936995172) {
                                                                        int zzs7 = zzesVar.zzs();
                                                                        zzesVar.zzk(3);
                                                                        if (zzs7 == 0) {
                                                                            int zzs8 = zzesVar.zzs();
                                                                            if (zzs8 == 0) {
                                                                                zzglVar2 = zzglVar;
                                                                                i47 = i23;
                                                                                i45 = i21;
                                                                                i48 = i24;
                                                                                i49 = 0;
                                                                            } else if (zzs8 == 1) {
                                                                                zzglVar2 = zzglVar;
                                                                                i47 = i23;
                                                                                i45 = i21;
                                                                                i48 = i24;
                                                                                i49 = 1;
                                                                            } else if (zzs8 == 2) {
                                                                                zzglVar2 = zzglVar;
                                                                                i47 = i23;
                                                                                i45 = i21;
                                                                                i48 = i24;
                                                                                i49 = 2;
                                                                            } else if (zzs8 == 3) {
                                                                                i49 = 3;
                                                                                zzglVar2 = zzglVar;
                                                                                i47 = i23;
                                                                                i45 = i21;
                                                                                i48 = i24;
                                                                            }
                                                                        }
                                                                    } else if (zzB10 == 1634760259) {
                                                                        int i87 = i19 - 12;
                                                                        byte[] bArr3 = new byte[i87];
                                                                        zzesVar.zzh(zzg5 + 12);
                                                                        zzesVar.zzm(bArr3, 0, i87);
                                                                        String zzd4 = zzdp.zzd(bArr3);
                                                                        zzgvz zzj2 = zzgvz.zzj(bArr3);
                                                                        zzi zzl = zzl(new zzes(bArr3));
                                                                        int i88 = zzl.zzf;
                                                                        int i89 = zzl.zzg;
                                                                        int i90 = zzl.zzb;
                                                                        str16 = zzd4;
                                                                        i45 = i88;
                                                                        i48 = zzl.zzc;
                                                                        str7 = "video/apv";
                                                                        zzglVar2 = zzglVar;
                                                                        i46 = zzl.zzd;
                                                                        list2 = zzj2;
                                                                        i47 = i89;
                                                                        i54 = i90;
                                                                    } else if (zzB10 == 1668246642) {
                                                                        if (i54 == -1) {
                                                                            if (i46 == -1) {
                                                                                int zzB14 = zzesVar.zzB();
                                                                                if (zzB14 == 1852009592 || zzB14 == 1852009571) {
                                                                                    int zzt5 = zzesVar.zzt();
                                                                                    int zzt6 = zzesVar.zzt();
                                                                                    zzesVar.zzk(2);
                                                                                    int i91 = 19;
                                                                                    if (i19 != 19) {
                                                                                        i91 = i19;
                                                                                    } else if ((zzesVar.zzs() & 128) != 0) {
                                                                                        z7 = true;
                                                                                        int zzb5 = zzi.zzb(zzt5);
                                                                                        int i92 = true == z7 ? 2 : 1;
                                                                                        i19 = i91;
                                                                                        i48 = i92;
                                                                                        zzglVar2 = zzglVar;
                                                                                        i47 = i23;
                                                                                        i46 = zzi.zzc(zzt6);
                                                                                        i54 = zzb5;
                                                                                        i45 = i21;
                                                                                    }
                                                                                    z7 = false;
                                                                                    int zzb52 = zzi.zzb(zzt5);
                                                                                    if (true == z7) {
                                                                                    }
                                                                                    i19 = i91;
                                                                                    i48 = i92;
                                                                                    zzglVar2 = zzglVar;
                                                                                    i47 = i23;
                                                                                    i46 = zzi.zzc(zzt6);
                                                                                    i54 = zzb52;
                                                                                    i45 = i21;
                                                                                } else {
                                                                                    zzef.zzc("BoxParsers", "Unsupported color type: ".concat(zzfy.zze(zzB14)));
                                                                                    i54 = -1;
                                                                                    i46 = -1;
                                                                                    zzglVar2 = zzglVar;
                                                                                    i47 = i23;
                                                                                    i45 = i21;
                                                                                    i48 = i24;
                                                                                }
                                                                            } else {
                                                                                i54 = -1;
                                                                            }
                                                                        }
                                                                    }
                                                                    zzglVar2 = zzglVar;
                                                                    i47 = i23;
                                                                    i45 = i21;
                                                                    i48 = i24;
                                                                }
                                                                zzglVar2 = zzglVar;
                                                                i47 = i23;
                                                                i45 = i21;
                                                                i48 = i24;
                                                            }
                                                            i43 = i18 + i19;
                                                            i37 = i20;
                                                            str15 = str7;
                                                            i13 = i22;
                                                            zzakzVar4 = zzakzVar2;
                                                            str13 = str8;
                                                        }
                                                        i43 = i18 + i19;
                                                        i37 = i20;
                                                        str15 = str7;
                                                        i13 = i22;
                                                        zzakzVar4 = zzakzVar2;
                                                        str13 = str8;
                                                    }
                                                    i43 = i18 + i19;
                                                    i37 = i20;
                                                    str15 = str7;
                                                    i13 = i22;
                                                    zzakzVar4 = zzakzVar2;
                                                    str13 = str8;
                                                }
                                                i43 = i18 + i19;
                                                i37 = i20;
                                                str15 = str7;
                                                i13 = i22;
                                                zzakzVar4 = zzakzVar2;
                                                str13 = str8;
                                            }
                                            int i93 = i45;
                                            String str21 = str15;
                                            i15 = i37;
                                            zzakz zzakzVar6 = zzakzVar4;
                                            int i94 = i47;
                                            int i95 = i48;
                                            c = 2;
                                            if (zzftVar != null) {
                                                str4 = zzftVar.zza;
                                                str5 = MimeTypes.VIDEO_DOLBY_VISION;
                                            } else {
                                                str4 = str16;
                                                str5 = str21;
                                            }
                                            if (str5 == null) {
                                                str6 = str14;
                                                i17 = i44;
                                                i16 = i39;
                                                zzakzVar = zzakzVar6;
                                            } else {
                                                zzt zztVar = new zzt();
                                                i16 = i39;
                                                zztVar.zzb(i16);
                                                zztVar.zzo(str5);
                                                zztVar.zzk(str4);
                                                zztVar.zzv(zzt3);
                                                zztVar.zzw(zzt4);
                                                zztVar.zzx(i53);
                                                zztVar.zzy(i52);
                                                zztVar.zzB(f);
                                                i17 = i44;
                                                zztVar.zzA(i17);
                                                zztVar.zzC(bArr);
                                                zztVar.zzD(i49);
                                                zztVar.zzr(list2);
                                                zztVar.zzq(i51);
                                                zztVar.zzF(i50);
                                                zztVar.zzs(zzqVar4);
                                                str6 = str14;
                                                zztVar.zze(str6);
                                                zzh zzhVar = new zzh();
                                                zzhVar.zza(i54);
                                                zzhVar.zzb(i95);
                                                zzhVar.zzc(i46);
                                                zzhVar.zzd(byteBuffer != null ? byteBuffer.array() : null);
                                                zzhVar.zze(i93);
                                                zzhVar.zzf(i94);
                                                zztVar.zzE(zzhVar.zzg());
                                                if (zzaksVar != null) {
                                                    zztVar.zzi(zzgzt.zzb(zzaksVar.zza()));
                                                    zztVar.zzj(zzgzt.zzb(zzaksVar.zzb()));
                                                } else if (zzakuVar != null) {
                                                    zztVar.zzi(zzgzt.zzb(zzakuVar.zzc()));
                                                    zztVar.zzj(zzgzt.zzb(zzakuVar.zzd()));
                                                }
                                                zzakzVar = zzakzVar6;
                                                zzakzVar.zzb = zztVar.zzO();
                                            }
                                        } else if (zzB8 == 1836069985 || zzB8 == 1701733217 || zzB8 == 1633889587 || zzB8 == 1700998451 || zzB8 == 1633889588 || zzB8 == 1835823201 || zzB8 == 1685353315 || zzB8 == 1685353317 || zzB8 == 1685353320 || zzB8 == 1685353324 || zzB8 == 1685353336 || zzB8 == 1935764850 || zzB8 == 1935767394 || zzB8 == 1819304813 || zzB8 == 1936684916 || zzB8 == 1953984371 || zzB8 == 778924082 || zzB8 == 778924083 || zzB8 == 1835557169 || zzB8 == 1835560241 || zzB8 == 1634492771 || zzB8 == 1634492791 || zzB8 == 1970037111 || zzB8 == 1332770163 || zzB8 == 1716281667 || zzB8 == 1767992678 || zzB8 == 1768973165 || zzB8 == 1718641517) {
                                            int i96 = zzB;
                                            s = zzv3;
                                            i11 = zzB6;
                                            zzakz zzakzVar7 = zzakzVar3;
                                            s2 = zzv2;
                                            i12 = i36;
                                            j7 = j11;
                                            String str22 = zzc6;
                                            int i97 = i10;
                                            zzo(zzesVar4, zzB8, i97, zzB7, i96, str22, z2, zzqVar, zzakzVar7, i35);
                                            zzesVar = zzesVar4;
                                            i16 = i96;
                                            str6 = str22;
                                            zzakzVar = zzakzVar7;
                                            str2 = str;
                                            i14 = i97;
                                            i15 = zzB7;
                                            i35 = i35;
                                            arrayList2 = arrayList4;
                                            i17 = i4;
                                            j8 = j5;
                                            c = 2;
                                        } else {
                                            if (zzB8 == 1414810956 || zzB8 == 1954034535 || zzB8 == 2004251764 || zzB8 == 1937010800 || zzB8 == 1664495672 || zzB8 == 1836070003) {
                                                zzesVar4.zzh(i10 + 16);
                                                if (zzB8 == 1414810956) {
                                                    str12 = MimeTypes.APPLICATION_TTML;
                                                } else {
                                                    if (zzB8 == 1954034535) {
                                                        int i98 = zzB7 - 16;
                                                        byte[] bArr4 = new byte[i98];
                                                        zzesVar4.zzm(bArr4, 0, i98);
                                                        zzgvzVar = zzgvz.zzj(bArr4);
                                                        str11 = MimeTypes.APPLICATION_TX3G;
                                                    } else if (zzB8 == 2004251764) {
                                                        str12 = MimeTypes.APPLICATION_MP4VTT;
                                                    } else if (zzB8 == 1937010800) {
                                                        str12 = MimeTypes.APPLICATION_TTML;
                                                        s = zzv3;
                                                        j9 = 0;
                                                        zzgvzVar2 = null;
                                                        if (str12 != null) {
                                                            zzt zztVar2 = new zzt();
                                                            zztVar2.zzb(zzB);
                                                            zztVar2.zzo(str12);
                                                            zztVar2.zze(zzc6);
                                                            zztVar2.zzt(j9);
                                                            zztVar2.zzr(zzgvzVar2);
                                                            zzakzVar3.zzb = zztVar2.zzO();
                                                        }
                                                        str2 = str;
                                                        zzesVar = zzesVar4;
                                                        str6 = zzc6;
                                                        i11 = zzB6;
                                                        zzakzVar = zzakzVar3;
                                                        i17 = i4;
                                                        s2 = zzv2;
                                                        j8 = j5;
                                                        c = c6;
                                                        i15 = zzB7;
                                                        i14 = i10;
                                                        i12 = i36;
                                                        j7 = j11;
                                                        i16 = zzB;
                                                        arrayList2 = arrayList4;
                                                    } else if (zzB8 == 1664495672) {
                                                        zzakzVar3.zzd = i2;
                                                        str12 = MimeTypes.APPLICATION_MP4CEA608;
                                                    } else {
                                                        int zzg8 = zzesVar4.zzg();
                                                        zzesVar4.zzk(4);
                                                        if (zzesVar4.zzB() == 1702061171) {
                                                            zzaku zzp2 = zzp(zzesVar4, zzg8);
                                                            if (zzp2.zzb() != null && zzp2.zzb().length == 64) {
                                                                String zzj3 = zzj(zzp2.zzb(), zzv2, zzv3);
                                                                String str23 = zzfk.zza;
                                                                zzgvzVar = zzgvz.zzj(zzj3.getBytes(StandardCharsets.UTF_8));
                                                                str10 = MimeTypes.APPLICATION_VOBSUB;
                                                            }
                                                        } else {
                                                            zzgvzVar = null;
                                                            str10 = null;
                                                        }
                                                        str11 = str10;
                                                    }
                                                    zzgvzVar2 = zzgvzVar;
                                                    str12 = str11;
                                                    s = zzv3;
                                                    j9 = Long.MAX_VALUE;
                                                    if (str12 != null) {
                                                    }
                                                    str2 = str;
                                                    zzesVar = zzesVar4;
                                                    str6 = zzc6;
                                                    i11 = zzB6;
                                                    zzakzVar = zzakzVar3;
                                                    i17 = i4;
                                                    s2 = zzv2;
                                                    j8 = j5;
                                                    c = c6;
                                                    i15 = zzB7;
                                                    i14 = i10;
                                                    i12 = i36;
                                                    j7 = j11;
                                                    i16 = zzB;
                                                    arrayList2 = arrayList4;
                                                }
                                                s = zzv3;
                                                j9 = Long.MAX_VALUE;
                                                zzgvzVar2 = null;
                                                if (str12 != null) {
                                                }
                                                str2 = str;
                                                zzesVar = zzesVar4;
                                                str6 = zzc6;
                                                i11 = zzB6;
                                                zzakzVar = zzakzVar3;
                                                i17 = i4;
                                                s2 = zzv2;
                                                j8 = j5;
                                                c = c6;
                                                i15 = zzB7;
                                                i14 = i10;
                                                i12 = i36;
                                                j7 = j11;
                                                i16 = zzB;
                                                arrayList2 = arrayList4;
                                            } else if (zzB8 == 1835365492) {
                                                zzesVar4.zzh(i10 + 16);
                                                char c8 = c2;
                                                zzesVar4.zzM(c8);
                                                String zzM = zzesVar4.zzM(c8);
                                                if (zzM != null) {
                                                    zzt zztVar3 = new zzt();
                                                    zztVar3.zzb(zzB);
                                                    zztVar3.zzo(zzM);
                                                    zzakzVar3.zzb = zztVar3.zzO();
                                                }
                                            } else if (zzB8 == 1667329389) {
                                                zzt zztVar4 = new zzt();
                                                zztVar4.zzb(zzB);
                                                zztVar4.zzo(MimeTypes.APPLICATION_CAMERA_MOTION);
                                                zzakzVar3.zzb = zztVar4.zzO();
                                            }
                                            str2 = str;
                                            zzesVar = zzesVar4;
                                            str6 = zzc6;
                                            s = zzv3;
                                            i11 = zzB6;
                                            zzakzVar = zzakzVar3;
                                            i17 = i4;
                                            s2 = zzv2;
                                            j8 = j5;
                                            c = c6;
                                            i15 = zzB7;
                                            i14 = i10;
                                            i12 = i36;
                                            j7 = j11;
                                            i16 = zzB;
                                            arrayList2 = arrayList4;
                                        }
                                        zzesVar.zzh(i14 + i15);
                                        i4 = i17;
                                        zzesVar4 = zzesVar;
                                        i34 = i35 + 1;
                                        zzc6 = str6;
                                        zzakzVar3 = zzakzVar;
                                        c6 = c;
                                        zzB = i16;
                                        zzv3 = s;
                                        zzB6 = i11;
                                        str = str2;
                                        arrayList4 = arrayList2;
                                        zzv2 = s2;
                                        j5 = j8;
                                        zzt = i12;
                                        j6 = j7;
                                        i2 = 1;
                                        c2 = 0;
                                    }
                                    String str24 = str;
                                    int i99 = zzB;
                                    int i100 = zzt;
                                    long j12 = j6;
                                    zzakz zzakzVar8 = zzakzVar3;
                                    arrayList = arrayList4;
                                    long j13 = j5;
                                    if (z) {
                                        zzfwVar3 = zzfwVar2;
                                    } else {
                                        zzfwVar3 = zzfwVar2;
                                        zzfw zzd5 = zzfwVar3.zzd(Atom.TYPE_edts);
                                        if (zzd5 != null && (zzn = zzn(zzd5)) != null) {
                                            long[] jArr3 = (long[]) zzn.first;
                                            jArr2 = (long[]) zzn.second;
                                            jArr = jArr3;
                                            zzvVar = zzakzVar8.zzb;
                                            if (zzvVar != null) {
                                                zzgsnVar2 = zzgsnVar;
                                                zzambVar = null;
                                            } else {
                                                if (i100 != 0) {
                                                    zzfv zzfvVar = new zzfv(i100);
                                                    zzt zza8 = zzvVar.zza();
                                                    zzap zzapVar = zzvVar.zzl;
                                                    zza8.zzl(zzapVar != null ? zzapVar.zzg(zzfvVar) : new zzap(C.TIME_UNSET, zzfvVar));
                                                    zzvVar = zza8.zzO();
                                                }
                                                zzamb zzambVar3 = new zzamb(i99, i33, zzakw.zza(j13, j12, str24), j4, zzv, zzakw.zzb(j13, j12, str24), zzvVar, zzakzVar8.zzd, zzakzVar8.zza, zzakzVar8.zzc, jArr, jArr2);
                                                zzgsnVar2 = zzgsnVar;
                                                zzambVar = zzambVar3;
                                            }
                                            zzambVar2 = (zzamb) zzgsnVar2.apply(zzambVar);
                                            if (zzambVar2 != null) {
                                                zzfw zzd6 = zzfwVar3.zzd(Atom.TYPE_mdia);
                                                zzd6.getClass();
                                                zzfw zzd7 = zzd6.zzd(Atom.TYPE_minf);
                                                zzd7.getClass();
                                                zzfw zzd8 = zzd7.zzd(Atom.TYPE_stbl);
                                                zzd8.getClass();
                                                zzame zzg9 = zzg(zzambVar2, zzd8, zzagiVar, false);
                                                arrayList3 = arrayList;
                                                arrayList3.add(zzg9);
                                                i28 = i + 1;
                                                zzfwVar4 = zzfwVar;
                                                arrayList4 = arrayList3;
                                            } else {
                                                arrayList3 = arrayList;
                                            }
                                        }
                                    }
                                    jArr = null;
                                    jArr2 = null;
                                    zzvVar = zzakzVar8.zzb;
                                    if (zzvVar != null) {
                                    }
                                    zzambVar2 = (zzamb) zzgsnVar2.apply(zzambVar);
                                    if (zzambVar2 != null) {
                                    }
                                }
                            }
                            zzB3 = 65536;
                        }
                        zzB2 = 0;
                    }
                    if (zzB2 == 0) {
                        if (zzB3 == -65536) {
                            if (zzB4 != 65536) {
                                if (zzB4 == -65536) {
                                    z4 = zzB5 != 0;
                                    zzB4 = -65536;
                                }
                                zzB3 = -65536;
                            } else {
                                z4 = zzB5 != 0;
                            }
                            if (true != z4) {
                                i5 = 270;
                                i4 = i5;
                                i2 = 1;
                                zzesVar2.zzk(16);
                                short zzv22 = zzesVar2.zzv();
                                zzesVar2.zzk(2);
                                short zzv32 = zzesVar2.zzv();
                                if (j == C.TIME_UNSET) {
                                }
                                long j102 = zzd(zzc2.zza).zzc;
                                if (j3 == C.TIME_UNSET) {
                                }
                                zzfw zzd22 = zzd.zzd(Atom.TYPE_minf);
                                zzd22.getClass();
                                zzfw zzd32 = zzd22.zzd(Atom.TYPE_stbl);
                                zzd32.getClass();
                                zzfx zzc52 = zzd.zzc(Atom.TYPE_mdhd);
                                zzc52.getClass();
                                zzes zzesVar32 = zzc52.zza;
                                i6 = 8;
                                zzesVar32.zzh(8);
                                zza2 = zza(zzesVar32.zzB());
                                zzesVar32.zzk(zza2 == 0 ? 8 : 16);
                                long zzz5 = zzesVar32.zzz();
                                int zzg22 = zzesVar32.zzg();
                                i7 = 0;
                                while (true) {
                                    if (zza2 == 0) {
                                    }
                                    if (i7 >= i6) {
                                    }
                                    i7++;
                                    zzfwVar5 = zzfwVar5;
                                    i6 = 8;
                                }
                                int zzt22 = zzesVar32.zzt();
                                char c32 = (char) (((zzt22 >> 10) & 31) + 96);
                                char c42 = (char) (((zzt22 >> 5) & 31) + 96);
                                char c52 = (char) ((zzt22 & 31) + 96);
                                char[] cArr2 = new char[3];
                                cArr2[0] = c32;
                                cArr2[i2] = c42;
                                char c62 = 2;
                                cArr2[2] = c52;
                                i9 = 0;
                                while (i9 < i8) {
                                }
                                str = new String(cArr2);
                                zzc = zzd32.zzc(Atom.TYPE_stsd);
                                if (zzc == null) {
                                }
                            }
                            zzB3 = -65536;
                        }
                        i2 = 1;
                        i3 = 0;
                    } else {
                        int i101 = zzB2;
                        i2 = 1;
                        i3 = i101;
                    }
                    i4 = ((i3 == -65536 || i3 == 65536) && zzB3 == 0 && zzB4 == 0 && zzB5 == -65536) ? 180 : 0;
                    zzesVar2.zzk(16);
                    short zzv222 = zzesVar2.zzv();
                    zzesVar2.zzk(2);
                    short zzv322 = zzesVar2.zzv();
                    if (j == C.TIME_UNSET) {
                    }
                    long j1022 = zzd(zzc2.zza).zzc;
                    if (j3 == C.TIME_UNSET) {
                    }
                    zzfw zzd222 = zzd.zzd(Atom.TYPE_minf);
                    zzd222.getClass();
                    zzfw zzd322 = zzd222.zzd(Atom.TYPE_stbl);
                    zzd322.getClass();
                    zzfx zzc522 = zzd.zzc(Atom.TYPE_mdhd);
                    zzc522.getClass();
                    zzes zzesVar322 = zzc522.zza;
                    i6 = 8;
                    zzesVar322.zzh(8);
                    zza2 = zza(zzesVar322.zzB());
                    zzesVar322.zzk(zza2 == 0 ? 8 : 16);
                    long zzz52 = zzesVar322.zzz();
                    int zzg222 = zzesVar322.zzg();
                    i7 = 0;
                    while (true) {
                        if (zza2 == 0) {
                        }
                        if (i7 >= i6) {
                        }
                        i7++;
                        zzfwVar5 = zzfwVar5;
                        i6 = 8;
                    }
                    int zzt222 = zzesVar322.zzt();
                    char c322 = (char) (((zzt222 >> 10) & 31) + 96);
                    char c422 = (char) (((zzt222 >> 5) & 31) + 96);
                    char c522 = (char) ((zzt222 & 31) + 96);
                    char[] cArr22 = new char[3];
                    cArr22[0] = c322;
                    cArr22[i2] = c422;
                    char c622 = 2;
                    cArr22[2] = c522;
                    i9 = 0;
                    while (i9 < i8) {
                    }
                    str = new String(cArr22);
                    zzc = zzd322.zzc(Atom.TYPE_stsd);
                    if (zzc == null) {
                    }
                }
                zzambVar = null;
                zzambVar2 = (zzamb) zzgsnVar2.apply(zzambVar);
                if (zzambVar2 != null) {
                }
            }
            i28 = i + 1;
            zzfwVar4 = zzfwVar;
            arrayList4 = arrayList3;
        }
    }

    public static zzap zzc(zzfx zzfxVar) {
        int zzF;
        zzes zzesVar = zzfxVar.zza;
        zzesVar.zzh(8);
        zzap zzapVar = new zzap(C.TIME_UNSET, new zzao[0]);
        while (zzesVar.zzd() >= 8) {
            int zzg = zzesVar.zzg();
            int zzB = zzesVar.zzB() + zzg;
            int zzB2 = zzesVar.zzB();
            zzap zzapVar2 = null;
            if (zzB2 == 1835365473) {
                zzesVar.zzh(zzg);
                zzesVar.zzk(8);
                zzf(zzesVar);
                while (true) {
                    if (zzesVar.zzg() >= zzB) {
                        break;
                    }
                    int zzg2 = zzesVar.zzg();
                    int zzB3 = zzesVar.zzB() + zzg2;
                    if (zzesVar.zzB() == 1768715124) {
                        zzesVar.zzh(zzg2);
                        zzesVar.zzk(8);
                        ArrayList arrayList = new ArrayList();
                        while (zzesVar.zzg() < zzB3) {
                            zzao zzc = zzalm.zzc(zzesVar);
                            if (zzc != null) {
                                arrayList.add(zzc);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            zzapVar2 = new zzap(arrayList);
                        }
                    } else {
                        zzesVar.zzh(zzB3);
                    }
                }
                zzapVar = zzapVar.zzf(zzapVar2);
            } else if (zzB2 == 1936553057) {
                zzesVar.zzh(zzg);
                zzesVar.zzk(12);
                while (true) {
                    if (zzesVar.zzg() >= zzB) {
                        break;
                    }
                    int zzg3 = zzesVar.zzg();
                    int zzB4 = zzesVar.zzB();
                    if (zzesVar.zzB() != 1935766900) {
                        zzesVar.zzh(zzg3 + zzB4);
                    } else if (zzB4 >= 16) {
                        zzesVar.zzk(4);
                        int i = -1;
                        int i2 = 0;
                        for (int i3 = 0; i3 < 2; i3++) {
                            int zzs = zzesVar.zzs();
                            int zzs2 = zzesVar.zzs();
                            if (zzs == 0) {
                                i = zzs2;
                            } else if (zzs == 1) {
                                i2 = zzs2;
                            }
                        }
                        if (i == 12) {
                            zzF = PsExtractor.VIDEO_STREAM_MASK;
                        } else if (i == 13) {
                            zzF = 120;
                        } else {
                            if (i == 21 && zzesVar.zzd() >= 8 && zzesVar.zzg() + 8 <= zzB) {
                                int zzB5 = zzesVar.zzB();
                                int zzB6 = zzesVar.zzB();
                                if (zzB5 >= 12 && zzB6 == 1936877170) {
                                    zzF = zzesVar.zzF();
                                }
                            }
                            zzF = -2147483647;
                        }
                        if (zzF != -2147483647) {
                            zzapVar2 = new zzap(C.TIME_UNSET, new zzajr(zzF, i2));
                        }
                    }
                }
                zzapVar = zzapVar.zzf(zzapVar2);
            } else if (zzB2 == -1451722374) {
                zzapVar = zzapVar.zzf(zzh(zzesVar));
            }
            zzesVar.zzh(zzB);
        }
        return zzapVar;
    }

    public static zzga zzd(zzes zzesVar) {
        long zzD;
        long zzD2;
        zzesVar.zzh(8);
        if (zza(zzesVar.zzB()) == 0) {
            zzD = zzesVar.zzz();
            zzD2 = zzesVar.zzz();
        } else {
            zzD = zzesVar.zzD();
            zzD2 = zzesVar.zzD();
        }
        return new zzga(zzD, zzD2, zzesVar.zzz());
    }

    public static zzap zze(zzfw zzfwVar) {
        zzfu zzfuVar;
        zzfx zzc = zzfwVar.zzc(Atom.TYPE_hdlr);
        zzfx zzc2 = zzfwVar.zzc(Atom.TYPE_keys);
        zzfx zzc3 = zzfwVar.zzc(Atom.TYPE_ilst);
        if (zzc != null && zzc2 != null && zzc3 != null && zzi(zzc.zza) == 1835299937) {
            zzes zzesVar = zzc2.zza;
            zzesVar.zzh(12);
            int zzB = zzesVar.zzB();
            String[] strArr = new String[zzB];
            for (int i = 0; i < zzB; i++) {
                int zzB2 = zzesVar.zzB();
                zzesVar.zzk(4);
                strArr[i] = zzesVar.zzK(zzB2 - 8, StandardCharsets.UTF_8);
            }
            zzes zzesVar2 = zzc3.zza;
            zzesVar2.zzh(8);
            ArrayList arrayList = new ArrayList();
            while (zzesVar2.zzd() > 8) {
                int zzg = zzesVar2.zzg() + zzesVar2.zzB();
                int zzB3 = zzesVar2.zzB() - 1;
                if (zzB3 < 0 || zzB3 >= zzB) {
                    StringBuilder sb = new StringBuilder(String.valueOf(zzB3).length() + 41);
                    sb.append("Skipped metadata with unknown key index: ");
                    sb.append(zzB3);
                    zzef.zzc("BoxParsers", sb.toString());
                } else {
                    String str = strArr[zzB3];
                    while (true) {
                        int zzg2 = zzesVar2.zzg();
                        if (zzg2 >= zzg) {
                            zzfuVar = null;
                            break;
                        }
                        int zzB4 = zzesVar2.zzB();
                        if (zzesVar2.zzB() == 1684108385) {
                            int zzB5 = zzesVar2.zzB();
                            int zzB6 = zzesVar2.zzB();
                            int i2 = zzB4 - 16;
                            byte[] bArr = new byte[i2];
                            zzesVar2.zzm(bArr, 0, i2);
                            zzfuVar = new zzfu(str, bArr, zzB6, zzB5);
                            break;
                        }
                        zzesVar2.zzh(zzg2 + zzB4);
                    }
                    if (zzfuVar != null) {
                        arrayList.add(zzfuVar);
                    }
                }
                zzesVar2.zzh(zzg);
            }
            if (!arrayList.isEmpty()) {
                return new zzap(arrayList);
            }
        }
        return null;
    }

    public static void zzf(zzes zzesVar) {
        int zzg = zzesVar.zzg();
        zzesVar.zzk(4);
        if (zzesVar.zzB() != 1751411826) {
            zzg += 4;
        }
        zzesVar.zzh(zzg);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:219:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x044d  */
    /* JADX WARN: Type inference failed for: r31v0 */
    /* JADX WARN: Type inference failed for: r31v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r31v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzame zzg(zzamb zzambVar, zzfw zzfwVar, zzagi zzagiVar, boolean z) throws zzat {
        zzakx zzalbVar;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        zzv zzvVar;
        long[] jArr;
        int[] iArr;
        int i7;
        long[] jArr2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        long j;
        long[] jArr3;
        int i15;
        int[] iArr2;
        long j2;
        long j3;
        int i16;
        int i17;
        int i18;
        long j4;
        long[] jArr4;
        long j5;
        int i19;
        boolean z3;
        long[] jArr5;
        int i20;
        int i21;
        boolean z4;
        int length;
        zzamb zzambVar2 = zzambVar;
        zzfx zzc = zzfwVar.zzc(Atom.TYPE_stsz);
        if (zzc != null) {
            zzalbVar = new zzala(zzc, zzambVar2.zzg);
        } else {
            zzfx zzc2 = zzfwVar.zzc(Atom.TYPE_stz2);
            if (zzc2 == null) {
                throw zzat.zzb("Track has no sample table size information", null);
            }
            zzalbVar = new zzalb(zzc2);
        }
        int zza2 = zzalbVar.zza();
        if (zza2 == 0) {
            return new zzame(zzambVar2, new long[0], new int[0], 0, new long[0], new int[0], new int[0], false, 0L, 0);
        }
        if (zzambVar2.zzb == 2) {
            long j6 = zzambVar2.zzf;
            if (j6 > 0) {
                zzt zza3 = zzambVar2.zzg.zza();
                zza3.zzz(zza2 / (j6 / 1000000.0f));
                zzambVar2 = zzambVar2.zzb(zza3.zzO());
            }
        }
        zzfx zzc3 = zzfwVar.zzc(Atom.TYPE_stco);
        if (zzc3 == null) {
            zzc3 = zzfwVar.zzc(Atom.TYPE_co64);
            zzc3.getClass();
            z2 = true;
        } else {
            z2 = false;
        }
        zzfx zzc4 = zzfwVar.zzc(Atom.TYPE_stsc);
        zzc4.getClass();
        zzes zzesVar = zzc4.zza;
        zzfx zzc5 = zzfwVar.zzc(Atom.TYPE_stts);
        zzc5.getClass();
        zzes zzesVar2 = zzc5.zza;
        zzfx zzc6 = zzfwVar.zzc(Atom.TYPE_stss);
        zzes zzesVar3 = zzc6 != null ? zzc6.zza : null;
        zzfx zzc7 = zzfwVar.zzc(Atom.TYPE_ctts);
        zzes zzesVar4 = zzc7 != null ? zzc7.zza : null;
        zzakt zzaktVar = new zzakt(zzesVar, zzc3.zza, z2);
        zzesVar2.zzh(12);
        int zzH = zzesVar2.zzH() - 1;
        int zzH2 = zzesVar2.zzH();
        int zzH3 = zzesVar2.zzH();
        if (zzesVar4 != null) {
            zzesVar4.zzh(12);
            i = zzesVar4.zzH();
        } else {
            i = 0;
        }
        if (zzesVar3 != null) {
            zzesVar3.zzh(12);
            i2 = zzesVar3.zzH();
            if (i2 > 0) {
                i4 = zzesVar3.zzH() - 1;
                i3 = 0;
            } else {
                i3 = 0;
                i4 = -1;
                zzesVar3 = null;
            }
        } else {
            i2 = 0;
            i3 = 0;
            i4 = -1;
        }
        int zzb2 = zzalbVar.zzb();
        zzv zzvVar2 = zzambVar2.zzg;
        if (zzb2 != -1) {
            String str = zzvVar2.zzp;
            i5 = 1;
            if ((MimeTypes.AUDIO_RAW.equals(str) || MimeTypes.AUDIO_MLAW.equals(str) || MimeTypes.AUDIO_ALAW.equals(str)) && zzH == 0) {
                if (i == 0 && i2 == 0) {
                    zzH = i3;
                    i6 = 1;
                } else {
                    i6 = i3;
                    zzH = i6;
                }
                ArrayList arrayList = new ArrayList();
                ?? r31 = zzesVar3 != null ? i5 : i3;
                if (i6 == 0) {
                    int i22 = zzaktVar.zza;
                    long[] jArr6 = new long[i22];
                    int[] iArr3 = new int[i22];
                    while (zzaktVar.zza()) {
                        int i23 = zzaktVar.zzb;
                        jArr6[i23] = zzaktVar.zzd;
                        iArr3[i23] = zzaktVar.zzc;
                    }
                    long j7 = zzH3;
                    int i24 = 8192 / zzb2;
                    int i25 = i3;
                    int i26 = i25;
                    while (i25 < i22) {
                        int i27 = iArr3[i25];
                        String str2 = zzfk.zza;
                        i26 += ((i27 + i24) - 1) / i24;
                        i25++;
                    }
                    jArr = new long[i26];
                    int[] iArr4 = new int[i26];
                    jArr3 = new long[i26];
                    iArr = new int[i26];
                    int i28 = i3;
                    int i29 = i28;
                    int i30 = i29;
                    int i31 = i30;
                    int i32 = i31;
                    while (i28 < i22) {
                        int i33 = iArr3[i28];
                        long j8 = jArr6[i28];
                        int i34 = i32;
                        int i35 = i22;
                        int i36 = i31;
                        int i37 = i34;
                        int i38 = i28;
                        int i39 = i33;
                        while (i39 > 0) {
                            int min = Math.min(i24, i39);
                            jArr[i37] = j8;
                            int i40 = i39;
                            int i41 = zzb2 * min;
                            iArr4[i37] = i41;
                            int i42 = i30 + i41;
                            i36 = Math.max(i36, i41);
                            long j9 = j7;
                            jArr3[i37] = j9 * i29;
                            iArr[i37] = i5;
                            j8 += iArr4[i37];
                            i29 += min;
                            i39 = i40 - min;
                            i37++;
                            i30 = i42;
                            j7 = j9;
                        }
                        long j10 = j7;
                        i28 = i38 + 1;
                        int i43 = i37;
                        i31 = i36;
                        i22 = i35;
                        i32 = i43;
                        j7 = j10;
                    }
                    j3 = i30;
                    j2 = j7 * i29;
                    zzvVar = zzvVar2;
                    i15 = i26;
                    iArr2 = iArr4;
                    i16 = i31;
                } else {
                    long[] jArr7 = new long[zza2];
                    int[] iArr5 = new int[zza2];
                    zzes zzesVar5 = zzesVar4;
                    long[] jArr8 = new long[zza2];
                    int i44 = i2;
                    int[] iArr6 = new int[zza2];
                    int i45 = i4;
                    zzakx zzakxVar = zzalbVar;
                    int i46 = i45;
                    zzvVar = zzvVar2;
                    int i47 = i;
                    int i48 = zzH;
                    long j11 = 0;
                    long j12 = 0;
                    long j13 = 0;
                    int i49 = i3;
                    int i50 = i49;
                    int i51 = i50;
                    int i52 = i51;
                    int i53 = zzH3;
                    int i54 = i52;
                    while (true) {
                        if (i49 >= zza2) {
                            jArr = jArr7;
                            iArr = iArr6;
                            break;
                        }
                        long j14 = j11;
                        int i55 = i5;
                        while (true) {
                            if (i51 != 0) {
                                i17 = i51;
                                i18 = i55;
                                break;
                            }
                            boolean zza4 = zzaktVar.zza();
                            if (zza4 == 0) {
                                i17 = i3;
                                i18 = zza4;
                                break;
                            }
                            j14 = zzaktVar.zzd;
                            i51 = zzaktVar.zzc;
                            zza2 = zza2;
                            i55 = zza4;
                        }
                        int i56 = zza2;
                        if (i18 == 0) {
                            zzef.zzc("BoxParsers", "Unexpected end of chunk data");
                            long[] copyOf = Arrays.copyOf(jArr7, i49);
                            int[] copyOf2 = Arrays.copyOf(iArr5, i49);
                            jArr8 = Arrays.copyOf(jArr8, i49);
                            jArr = copyOf;
                            iArr5 = copyOf2;
                            iArr = Arrays.copyOf(iArr6, i49);
                            zza2 = i49;
                            break;
                        }
                        if (zzesVar5 != null) {
                            while (true) {
                                if (i52 != 0) {
                                    break;
                                }
                                if (i47 <= 0) {
                                    i52 = i3;
                                    break;
                                }
                                i47--;
                                i52 = zzesVar5.zzH();
                                i54 = zzesVar5.zzB();
                            }
                            i52--;
                        }
                        int zzc8 = zzakxVar.zzc();
                        int[] iArr7 = iArr6;
                        long[] jArr9 = jArr7;
                        long j15 = zzc8;
                        j13 += j15;
                        if (zzc8 > i50) {
                            i50 = zzc8;
                        }
                        jArr9[i49] = j14;
                        iArr5[i49] = zzc8;
                        int i57 = i17;
                        jArr8[i49] = j12 + i54;
                        iArr7[i49] = r31;
                        if (i49 == i46) {
                            iArr7[i49] = i5;
                            arrayList.add(Integer.valueOf(i49));
                        }
                        if (zzesVar3 != null && i49 == i46) {
                            int i58 = i44 - 1;
                            if (i58 > 0) {
                                i44 = i58;
                                i46 = zzesVar3.zzH() - 1;
                            } else {
                                i44 = i58;
                            }
                        }
                        j12 += i53;
                        zzH2--;
                        if (zzH2 == 0) {
                            if (i48 > 0) {
                                i48--;
                                zzH2 = zzesVar2.zzH();
                                i53 = zzesVar2.zzB();
                            } else {
                                zzH2 = i3;
                            }
                        }
                        long j16 = j14 + j15;
                        i51 = i57 - 1;
                        i49++;
                        jArr7 = jArr9;
                        iArr6 = iArr7;
                        zza2 = i56;
                        j11 = j16;
                    }
                    long j17 = j12 + i54;
                    if (zzesVar5 != null) {
                        while (i47 > 0) {
                            if (zzesVar5.zzH() != 0) {
                                i7 = i3;
                                break;
                            }
                            zzesVar5.zzB();
                            i47--;
                        }
                    }
                    i7 = i5;
                    if (i44 == 0) {
                        if (zzH2 != 0) {
                            jArr2 = jArr8;
                            i8 = i7;
                            i9 = zza2;
                            i10 = zzH2;
                            i14 = i3;
                        } else if (i51 != 0) {
                            jArr2 = jArr8;
                            i8 = i7;
                            i9 = zza2;
                            i14 = i3;
                            i10 = i14;
                        } else if (i48 != 0) {
                            jArr2 = jArr8;
                            i8 = i7;
                            i9 = zza2;
                            i14 = i3;
                            i10 = i14;
                            i11 = i10;
                            i12 = i48;
                            i13 = i52;
                        } else if (i52 != 0) {
                            jArr2 = jArr8;
                            i8 = i7;
                            i9 = zza2;
                            i14 = i3;
                            i10 = i14;
                            i11 = i10;
                            i12 = i11;
                            i13 = i52;
                        } else if (i7 == 0) {
                            jArr2 = jArr8;
                            i9 = zza2;
                            i8 = i3;
                            i14 = i8;
                            i10 = i14;
                            i11 = i10;
                            i12 = i11;
                            i13 = i12;
                        } else {
                            jArr2 = jArr8;
                            i9 = zza2;
                            j = j17;
                            jArr3 = jArr2;
                            i15 = i9;
                            iArr2 = iArr5;
                            j2 = j;
                            j3 = j13;
                            i16 = i50;
                        }
                        i11 = i51;
                        i12 = i48;
                        i13 = i52;
                    } else {
                        jArr2 = jArr8;
                        i8 = i7;
                        i9 = zza2;
                        i10 = zzH2;
                        i11 = i51;
                        i12 = i48;
                        i13 = i52;
                        i14 = i44;
                    }
                    int i59 = zzambVar2.zza;
                    int length2 = String.valueOf(i59).length() + 66 + String.valueOf(i14).length() + 35 + String.valueOf(i10).length() + 26 + String.valueOf(i11).length() + 33 + String.valueOf(i12).length() + 36;
                    int length3 = String.valueOf(i13).length();
                    j = j17;
                    String str3 = i5 != i8 ? ", ctts invalid" : "";
                    StringBuilder sb = new StringBuilder(length2 + length3 + str3.length());
                    sb.append("Inconsistent stbl box for track ");
                    sb.append(i59);
                    sb.append(": remainingSynchronizationSamples ");
                    sb.append(i14);
                    sb.append(", remainingSamplesAtTimestampDelta ");
                    sb.append(i10);
                    sb.append(", remainingSamplesInChunk ");
                    sb.append(i11);
                    sb.append(", remainingTimestampDeltaChanges ");
                    sb.append(i12);
                    sb.append(", remainingSamplesAtTimestampOffset ");
                    sb.append(i13);
                    sb.append(str3);
                    zzef.zzc("BoxParsers", sb.toString());
                    jArr3 = jArr2;
                    i15 = i9;
                    iArr2 = iArr5;
                    j2 = j;
                    j3 = j13;
                    i16 = i50;
                }
                long[] jArr10 = jArr;
                j4 = zzambVar2.zzf;
                if (j4 > 0) {
                    long zzv = zzfk.zzv(j3 * 8, 1000000L, j4, RoundingMode.HALF_DOWN);
                    if (zzv > 0 && zzv < 2147483647L) {
                        zzt zza5 = zzvVar.zza();
                        zza5.zzi((int) zzv);
                        zzambVar2 = zzambVar2.zzb(zza5.zzO());
                    }
                }
                long j18 = zzambVar2.zzc;
                long zzv2 = zzfk.zzv(j2, 1000000L, j18, RoundingMode.DOWN);
                int[] zzf = zzgzt.zzf(arrayList);
                jArr4 = zzambVar2.zzi;
                if (jArr4 != null) {
                    zzfk.zzw(jArr3, 1000000L, j18);
                    return new zzame(zzambVar2, jArr10, iArr2, i16, jArr3, iArr, zzf, r31, zzv2, i15);
                }
                int[] iArr8 = iArr;
                int length4 = jArr4.length;
                if (length4 == 1) {
                    if (zzambVar2.zzb != 1 || (length = jArr3.length) < 2) {
                        j5 = j18;
                    } else {
                        long[] jArr11 = zzambVar2.zzj;
                        jArr11.getClass();
                        long j19 = jArr11[i3];
                        long j20 = jArr4[i3];
                        long j21 = zzambVar2.zzd;
                        long zzv3 = zzfk.zzv(j20, j18, j21, RoundingMode.DOWN) + j19;
                        int i60 = length - 1;
                        int i61 = i3;
                        int max = Math.max(i61, Math.min(4, i60));
                        int max2 = Math.max(i61, Math.min(length - 4, i60));
                        if (jArr3[i61] > j19 || j19 >= jArr3[max] || jArr3[max2] >= zzv3 || zzv3 > 2 + j2) {
                            j5 = j18;
                        } else {
                            long max3 = Math.max(0L, j2 - zzv3);
                            long j22 = j19 - jArr3[0];
                            long j23 = zzambVar2.zzg.zzI;
                            long zzv4 = zzfk.zzv(j22, j23, j18, RoundingMode.DOWN);
                            long zzv5 = zzfk.zzv(max3, j23, j18, RoundingMode.DOWN);
                            j5 = j18;
                            if (zzv4 == 0) {
                                if (zzv5 != 0) {
                                    zzv4 = 0;
                                }
                            }
                            if (zzv4 <= 2147483647L && zzv5 <= 2147483647L) {
                                zzagiVar.zza = (int) zzv4;
                                zzagiVar.zzb = (int) zzv5;
                                zzfk.zzw(jArr3, 1000000L, j5);
                                return new zzame(zzambVar2, jArr10, iArr2, i16, jArr3, iArr8, zzf, r31, zzfk.zzv(jArr4[0], 1000000L, j21, RoundingMode.DOWN), i15);
                            }
                        }
                    }
                    i19 = 1;
                    length4 = 1;
                } else {
                    j5 = j18;
                    i19 = 1;
                }
                if (length4 == i19 && jArr4[0] == 0) {
                    long[] jArr12 = zzambVar2.zzj;
                    jArr12.getClass();
                    long j24 = jArr12[0];
                    int i62 = 0;
                    while (i62 < jArr3.length) {
                        long j25 = j5;
                        jArr3[i62] = zzfk.zzv(jArr3[i62] - j24, 1000000L, j25, RoundingMode.DOWN);
                        i62++;
                        j5 = j25;
                    }
                    return new zzame(zzambVar2, jArr10, iArr2, i16, jArr3, iArr8, zzf, r31, zzfk.zzv(j2 - j24, 1000000L, j5, RoundingMode.DOWN), i15);
                }
                long j26 = j5;
                int[] iArr9 = iArr2;
                int i63 = i15;
                boolean z5 = zzambVar2.zzb == 1;
                long[] jArr13 = zzambVar2.zzj;
                int[] iArr10 = new int[length4];
                int[] iArr11 = new int[length4];
                jArr13.getClass();
                long[] jArr14 = jArr13;
                int i64 = 0;
                int i65 = 0;
                int i66 = 0;
                boolean z6 = false;
                while (i65 < jArr4.length) {
                    int[] iArr12 = iArr10;
                    long j27 = jArr14[i65];
                    if (j27 != -1) {
                        jArr5 = jArr14;
                        i20 = i65;
                        long j28 = j26;
                        j26 = j28;
                        long zzv6 = zzfk.zzv(jArr4[i65], j28, zzambVar2.zzd, RoundingMode.DOWN) + j27;
                        boolean z7 = z6;
                        iArr12[i20] = zzfk.zzo(jArr3, j27, true, true);
                        int zzq = zzfk.zzq(jArr3, zzv6, z5, false);
                        z3 = z5;
                        int i67 = zzq - 1;
                        int i68 = 0;
                        for (int i69 = zzq; i69 < jArr3.length; i69++) {
                            if (jArr3[i69] >= zzv6) {
                                i68++;
                                if (i68 > zzambVar2.zzg.zzr) {
                                    break;
                                }
                            } else {
                                i67 = i69;
                            }
                        }
                        iArr11[i20] = i67 + 1;
                        int i70 = iArr12[i20];
                        while (true) {
                            i21 = iArr12[i20];
                            if (i21 <= 0 || (iArr8[i21] & 1) != 0) {
                                break;
                            }
                            iArr12[i20] = i21 - 1;
                        }
                        if (i21 == 0) {
                            z4 = false;
                            if ((iArr8[0] & 1) == 0) {
                                iArr12[i20] = i70;
                                while (true) {
                                    i21 = iArr12[i20];
                                    if (i21 >= iArr11[i20] || (iArr8[i21] & 1) != 0) {
                                        break;
                                    }
                                    iArr12[i20] = i21 + 1;
                                }
                            }
                        } else {
                            z4 = false;
                        }
                        int i71 = iArr11[i20];
                        i66 += i71 - i21;
                        z6 = z7 | (i64 != i21 ? true : z4);
                        i64 = i71;
                    } else {
                        z3 = z5;
                        jArr5 = jArr14;
                        i20 = i65;
                    }
                    i65 = i20 + 1;
                    jArr14 = jArr5;
                    iArr10 = iArr12;
                    z5 = z3;
                }
                int[] iArr13 = iArr10;
                boolean z8 = z6 | (i66 != i63);
                long[] jArr15 = z8 ? new long[i66] : jArr10;
                int[] iArr14 = z8 ? new int[i66] : iArr9;
                if (true == z8) {
                    i16 = 0;
                }
                int[] iArr15 = z8 ? new int[i66] : iArr8;
                if (z8) {
                    arrayList = new ArrayList();
                }
                long[] jArr16 = new long[i66];
                int i72 = 0;
                boolean z9 = false;
                int i73 = 0;
                int i74 = i16;
                long j29 = 0;
                while (i72 < jArr4.length) {
                    long j30 = jArr13[i72];
                    int i75 = iArr13[i72];
                    long[] jArr17 = jArr4;
                    int i76 = iArr11[i72];
                    long[] jArr18 = jArr16;
                    if (z8) {
                        int i77 = i76 - i75;
                        System.arraycopy(jArr10, i75, jArr15, i73, i77);
                        System.arraycopy(iArr9, i75, iArr14, i73, i77);
                        System.arraycopy(iArr8, i75, iArr15, i73, i77);
                    }
                    while (i75 < i76) {
                        int[] iArr16 = iArr14;
                        int[] iArr17 = iArr15;
                        long zzv7 = zzfk.zzv(j29, 1000000L, zzambVar2.zzd, RoundingMode.DOWN);
                        long zzv8 = zzfk.zzv(jArr3[i75] - j30, 1000000L, j26, RoundingMode.DOWN);
                        z9 = (!(zzv8 >= 0)) | z9;
                        jArr18[i73] = zzv7 + zzv8;
                        if (z8 && iArr16[i73] > i74) {
                            i74 = iArr9[i75];
                        }
                        if (z8 && r31 == 0 && (iArr17[i73] & 1) != 0) {
                            arrayList.add(Integer.valueOf(i73));
                        }
                        i73++;
                        i75++;
                        iArr14 = iArr16;
                        iArr15 = iArr17;
                    }
                    j29 += jArr17[i72];
                    i72++;
                    iArr14 = iArr14;
                    jArr4 = jArr17;
                    jArr16 = jArr18;
                    iArr15 = iArr15;
                }
                int[] iArr18 = iArr15;
                long[] jArr19 = jArr16;
                int[] iArr19 = iArr14;
                long zzv9 = zzfk.zzv(j29, 1000000L, zzambVar2.zzd, RoundingMode.DOWN);
                if (z9) {
                    zzt zza6 = zzambVar2.zzg.zza();
                    zza6.zzu(true);
                    zzambVar2 = zzambVar2.zzb(zza6.zzO());
                }
                return new zzame(zzambVar2, jArr15, iArr19, i74, jArr19, iArr18, zzgzt.zzf(arrayList), r31, zzv9, jArr15.length);
            }
        } else {
            i5 = 1;
        }
        i6 = i3;
        ArrayList arrayList2 = new ArrayList();
        if (zzesVar3 != null) {
        }
        if (i6 == 0) {
        }
        long[] jArr102 = jArr;
        j4 = zzambVar2.zzf;
        if (j4 > 0) {
        }
        long j182 = zzambVar2.zzc;
        long zzv22 = zzfk.zzv(j2, 1000000L, j182, RoundingMode.DOWN);
        int[] zzf2 = zzgzt.zzf(arrayList2);
        jArr4 = zzambVar2.zzi;
        if (jArr4 != null) {
        }
    }

    private static zzap zzh(zzes zzesVar) {
        short zzv = zzesVar.zzv();
        zzesVar.zzk(2);
        String zzK = zzesVar.zzK(zzv, StandardCharsets.UTF_8);
        int max = Math.max(zzK.lastIndexOf(43), zzK.lastIndexOf(45));
        try {
            return new zzap(C.TIME_UNSET, new zzfz(Float.parseFloat(zzK.substring(0, max)), Float.parseFloat(zzK.substring(max, zzK.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static int zzi(zzes zzesVar) {
        zzesVar.zzh(16);
        return zzesVar.zzB();
    }

    private static String zzj(byte[] bArr, int i, int i2) {
        zzgsw.zzi(bArr.length == 64);
        ArrayList arrayList = new ArrayList(16);
        for (int i3 = 0; i3 < bArr.length - 3; i3 += 4) {
            int zze = zzgzt.zze(bArr[i3], bArr[i3 + 1], bArr[i3 + 2], bArr[i3 + 3]);
            String str = zzfk.zza;
            int i4 = ((zze >> 8) & 255) - 128;
            int i5 = (zze >> 16) & 255;
            int i6 = (zze & 255) - 128;
            arrayList.add(String.format("%06x", Integer.valueOf(Math.max(0, Math.min(i5 + ((i6 * 17790) / 10000), 255)) | (Math.max(0, Math.min(((i4 * 14075) / 10000) + i5, 255)) << 16) | (Math.max(0, Math.min((i5 - ((i6 * 3455) / 10000)) - ((i4 * 7169) / 10000), 255)) << 8))));
        }
        String zzd = zzgsq.zzd(arrayList, ", ");
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 7 + String.valueOf(i2).length() + 10 + zzd.length() + 1);
        sb.append("size: ");
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        sb.append("\npalette: ");
        sb.append(zzd);
        sb.append("\n");
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x014d, code lost:
    
        if (r6 == 1) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzi zzk(zzes zzesVar) {
        int i;
        int zzj;
        int zzj2;
        zzh zzhVar = new zzh();
        byte[] zzi = zzesVar.zzi();
        zzer zzerVar = new zzer(zzi, zzi.length);
        zzerVar.zzf(zzesVar.zzg() * 8);
        zzerVar.zzo(1);
        int zzj3 = zzerVar.zzj(3);
        zzerVar.zzh(6);
        boolean zzi2 = zzerVar.zzi();
        boolean zzi3 = zzerVar.zzi();
        boolean z = false;
        if (zzj3 == 2) {
            if (zzi2) {
                i = true == zzi3 ? 12 : 10;
                zzhVar.zze(i);
                zzhVar.zzf(i);
                int i2 = 13;
                zzerVar.zzh(13);
                zzerVar.zzg();
                zzj = zzerVar.zzj(4);
                if (zzj == 1) {
                    StringBuilder sb = new StringBuilder(String.valueOf(zzj).length() + 22);
                    sb.append("Unsupported obu_type: ");
                    sb.append(zzj);
                    zzef.zzb("BoxParsers", sb.toString());
                    return zzhVar.zzg();
                }
                if (zzerVar.zzi()) {
                    zzef.zzb("BoxParsers", "Unsupported obu_extension_flag");
                    return zzhVar.zzg();
                }
                boolean zzi4 = zzerVar.zzi();
                zzerVar.zzg();
                if (zzi4 && zzerVar.zzj(8) > 127) {
                    zzef.zzb("BoxParsers", "Excessive obu_size");
                    return zzhVar.zzg();
                }
                int zzj4 = zzerVar.zzj(3);
                zzerVar.zzg();
                if (zzerVar.zzi()) {
                    zzef.zzb("BoxParsers", "Unsupported reduced_still_picture_header");
                    return zzhVar.zzg();
                }
                if (zzerVar.zzi()) {
                    zzef.zzb("BoxParsers", "Unsupported timing_info_present_flag");
                    return zzhVar.zzg();
                }
                if (zzerVar.zzi()) {
                    zzef.zzb("BoxParsers", "Unsupported initial_display_delay_present_flag");
                    return zzhVar.zzg();
                }
                int zzj5 = zzerVar.zzj(5);
                for (int i3 = 0; i3 <= zzj5; i3++) {
                    zzerVar.zzh(12);
                    if (zzerVar.zzj(5) > 7) {
                        zzerVar.zzg();
                    }
                }
                int zzj6 = zzerVar.zzj(4);
                int zzj7 = zzerVar.zzj(4);
                zzerVar.zzh(zzj6 + 1);
                zzerVar.zzh(zzj7 + 1);
                if (zzerVar.zzi()) {
                    zzerVar.zzh(7);
                }
                zzerVar.zzh(7);
                boolean zzi5 = zzerVar.zzi();
                if (zzi5) {
                    zzerVar.zzh(2);
                }
                if ((zzerVar.zzi() || zzerVar.zzj(1) > 0) && !zzerVar.zzi()) {
                    zzerVar.zzh(1);
                }
                if (zzi5) {
                    zzerVar.zzh(3);
                }
                zzerVar.zzh(3);
                boolean zzi6 = zzerVar.zzi();
                if (zzj4 == 2) {
                    if (zzi6) {
                        zzerVar.zzg();
                    }
                }
                if (zzerVar.zzi()) {
                    z = true;
                }
                if (zzerVar.zzi()) {
                    int zzj8 = zzerVar.zzj(8);
                    int zzj9 = zzerVar.zzj(8);
                    int zzj10 = zzerVar.zzj(8);
                    if (!z && zzj8 == 1) {
                        if (zzj9 != 13) {
                            zzj8 = 1;
                        } else if (zzj10 == 0) {
                            zzj2 = 1;
                            zzj8 = 1;
                            zzhVar.zza(zzi.zzb(zzj8));
                            zzhVar.zzb(zzj2 != 1 ? 2 : 1);
                            zzhVar.zzc(zzi.zzc(i2));
                        } else {
                            zzj8 = 1;
                            zzj2 = zzerVar.zzj(1);
                            zzhVar.zza(zzi.zzb(zzj8));
                            zzhVar.zzb(zzj2 != 1 ? 2 : 1);
                            zzhVar.zzc(zzi.zzc(i2));
                        }
                    }
                    i2 = zzj9;
                    zzj2 = zzerVar.zzj(1);
                    zzhVar.zza(zzi.zzb(zzj8));
                    zzhVar.zzb(zzj2 != 1 ? 2 : 1);
                    zzhVar.zzc(zzi.zzc(i2));
                }
                return zzhVar.zzg();
            }
            zzi2 = false;
            zzj3 = 2;
        }
        if (zzj3 <= 2) {
            i = true != zzi2 ? 8 : 10;
            zzhVar.zze(i);
            zzhVar.zzf(i);
        }
        int i22 = 13;
        zzerVar.zzh(13);
        zzerVar.zzg();
        zzj = zzerVar.zzj(4);
        if (zzj == 1) {
        }
    }

    private static zzi zzl(zzes zzesVar) {
        zzh zzhVar = new zzh();
        byte[] zzi = zzesVar.zzi();
        zzer zzerVar = new zzer(zzi, zzi.length);
        zzerVar.zzf(zzesVar.zzg() * 8);
        zzerVar.zzo(1);
        int zzj = zzerVar.zzj(8);
        for (int i = 0; i < zzj; i++) {
            zzerVar.zzo(1);
            int zzj2 = zzerVar.zzj(8);
            for (int i2 = 0; i2 < zzj2; i2++) {
                zzerVar.zzh(6);
                boolean zzi2 = zzerVar.zzi();
                zzerVar.zzg();
                zzerVar.zzo(11);
                zzerVar.zzh(4);
                int zzj3 = zzerVar.zzj(4) + 8;
                zzhVar.zze(zzj3);
                zzhVar.zzf(zzj3);
                zzerVar.zzo(1);
                if (zzi2) {
                    int zzj4 = zzerVar.zzj(8);
                    int zzj5 = zzerVar.zzj(8);
                    zzerVar.zzo(1);
                    boolean zzi3 = zzerVar.zzi();
                    zzhVar.zza(zzi.zzb(zzj4));
                    zzhVar.zzb(true != zzi3 ? 2 : 1);
                    zzhVar.zzc(zzi.zzc(zzj5));
                }
            }
        }
        return zzhVar.zzg();
    }

    private static ByteBuffer zzm() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static Pair zzn(zzfw zzfwVar) {
        zzfx zzc = zzfwVar.zzc(Atom.TYPE_elst);
        if (zzc == null) {
            return null;
        }
        zzes zzesVar = zzc.zza;
        zzesVar.zzh(8);
        int zza2 = zza(zzesVar.zzB());
        int zzH = zzesVar.zzH();
        long[] jArr = new long[zzH];
        long[] jArr2 = new long[zzH];
        for (int i = 0; i < zzH; i++) {
            jArr[i] = zza2 == 1 ? zzesVar.zzJ() : zzesVar.zzz();
            jArr2[i] = zza2 == 1 ? zzesVar.zzD() : zzesVar.zzB();
            if (zzesVar.zzv() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            zzesVar.zzk(2);
        }
        return Pair.create(jArr, jArr2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x049e, code lost:
    
        r1.zzk(com.google.android.gms.internal.ads.zzgzt.zza(r1.zzP()));
     */
    /* JADX WARN: Removed duplicated region for block: B:222:0x06bd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:231:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zzo(zzes zzesVar, int i, int i2, int i3, int i4, String str, boolean z, zzq zzqVar, zzakz zzakzVar, int i5) throws zzat {
        int i6;
        int i7;
        int zzt;
        int zzF;
        int zzB;
        int i8;
        int i9;
        String str2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        String str3;
        int i16;
        int i17;
        int i18;
        boolean z2;
        int i19 = i;
        int i20 = i3;
        zzq zzqVar2 = zzqVar;
        zzesVar.zzh(i2 + 16);
        if (z) {
            i6 = zzesVar.zzt();
            zzesVar.zzk(6);
        } else {
            zzesVar.zzk(8);
            i6 = 0;
        }
        if (i6 == 0 || i6 == 1) {
            i7 = 2;
            zzt = zzesVar.zzt();
            zzesVar.zzk(6);
            zzF = zzesVar.zzF();
            zzesVar.zzh(zzesVar.zzg() - 4);
            zzB = zzesVar.zzB();
            i8 = 32;
            if (i6 == 1) {
                zzesVar.zzk(16);
            }
            i9 = -1;
        } else {
            if (i6 != 2) {
                return;
            }
            zzesVar.zzk(16);
            zzF = (int) Math.round(Double.longBitsToDouble(zzesVar.zzD()));
            int zzH = zzesVar.zzH();
            zzesVar.zzk(4);
            i7 = 2;
            int zzH2 = zzesVar.zzH();
            int zzH3 = zzesVar.zzH();
            int i21 = zzH3 & 1;
            int i22 = zzH3 & 2;
            if (i21 == 0) {
                if (zzH2 == 8) {
                    i9 = 3;
                } else if (zzH2 == 16) {
                    i9 = i22 != 0 ? 268435456 : 2;
                } else if (zzH2 == 24) {
                    i9 = i22 != 0 ? 1342177280 : 21;
                } else {
                    if (zzH2 == 32) {
                        i9 = i22 != 0 ? 1610612736 : 22;
                    }
                    i9 = -1;
                }
                zzesVar.zzk(8);
                zzt = zzH;
                i8 = 32;
                zzB = 0;
            } else {
                if (zzH2 == 32) {
                    i9 = 4;
                    zzesVar.zzk(8);
                    zzt = zzH;
                    i8 = 32;
                    zzB = 0;
                }
                i9 = -1;
                zzesVar.zzk(8);
                zzt = zzH;
                i8 = 32;
                zzB = 0;
            }
        }
        if (i19 == 1767992678) {
            zzt = -1;
            zzF = -1;
        } else {
            if (i19 == 1935764850) {
                zzF = 8000;
            } else if (i19 == 1935767394) {
                zzF = 16000;
                i19 = 1935767394;
            }
            zzt = 1;
        }
        int zzg = zzesVar.zzg();
        int i23 = Atom.TYPE_enca;
        if (i19 == 1701733217) {
            Pair zzr = zzr(zzesVar, i2, i20);
            if (zzr != null) {
                i23 = ((Integer) zzr.first).intValue();
                zzqVar2 = zzqVar2 == null ? null : zzqVar2.zzb(((zzamc) zzr.second).zzb);
                zzakzVar.zza[i5] = (zzamc) zzr.second;
            }
            i19 = i23;
            zzesVar.zzh(zzg);
        }
        if (i19 == 1633889587) {
            str2 = MimeTypes.AUDIO_AC3;
        } else if (i19 == 1700998451) {
            str2 = MimeTypes.AUDIO_E_AC3;
        } else if (i19 == 1633889588) {
            str2 = MimeTypes.AUDIO_AC4;
        } else if (i19 == 1685353315) {
            str2 = MimeTypes.AUDIO_DTS;
        } else if (i19 == 1685353320 || i19 == 1685353324) {
            str2 = MimeTypes.AUDIO_DTS_HD;
        } else if (i19 == 1685353317) {
            str2 = MimeTypes.AUDIO_DTS_EXPRESS;
        } else if (i19 == 1685353336) {
            str2 = MimeTypes.AUDIO_DTS_X;
        } else if (i19 == 1935764850) {
            str2 = MimeTypes.AUDIO_AMR_NB;
        } else {
            if (i19 != 1935767394) {
                if (i19 != 1936684916) {
                    if (i19 == 1953984371) {
                        i10 = i19;
                        str2 = MimeTypes.AUDIO_RAW;
                        i9 = 268435456;
                    } else if (i19 == 1819304813) {
                        if (i9 != -1) {
                            i10 = i19;
                            str2 = MimeTypes.AUDIO_RAW;
                        }
                    } else if (i19 == 778924082 || i19 == 778924083) {
                        str2 = MimeTypes.AUDIO_MPEG;
                    } else if (i19 == 1835557169) {
                        str2 = MimeTypes.AUDIO_MPEGH_MHA1;
                    } else if (i19 == 1835560241) {
                        i10 = i19;
                        str2 = MimeTypes.AUDIO_MPEGH_MHM1;
                    } else if (i19 == 1634492771) {
                        str2 = MimeTypes.AUDIO_ALAC;
                    } else if (i19 == 1634492791) {
                        str2 = MimeTypes.AUDIO_ALAW;
                    } else if (i19 == 1970037111) {
                        str2 = MimeTypes.AUDIO_MLAW;
                    } else if (i19 == 1332770163) {
                        str2 = MimeTypes.AUDIO_OPUS;
                    } else if (i19 == 1716281667) {
                        str2 = MimeTypes.AUDIO_FLAC;
                    } else if (i19 == 1835823201) {
                        str2 = MimeTypes.AUDIO_TRUEHD;
                    } else if (i19 == 1767992678) {
                        i10 = 1767992678;
                        str2 = "audio/iamf";
                    } else {
                        i10 = i19;
                        str2 = null;
                    }
                    int i24 = i9;
                    String str4 = null;
                    List list = null;
                    zzaku zzakuVar = null;
                    zzaks zzaksVar = null;
                    while (zzg - i2 < i20) {
                        zzesVar.zzh(zzg);
                        int zzB2 = zzesVar.zzB();
                        String str5 = str4;
                        String str6 = "childAtomSize must be positive";
                        zzaft.zza(zzB2 > 0, "childAtomSize must be positive");
                        int zzB3 = zzesVar.zzB();
                        int i25 = zzF;
                        if (zzB3 == 1835557187) {
                            zzesVar.zzh(zzg + 8);
                            zzesVar.zzk(1);
                            int zzs = zzesVar.zzs();
                            zzesVar.zzk(1);
                            String format = Objects.equals(str2, MimeTypes.AUDIO_MPEGH_MHM1) ? String.format("mhm1.%02X", Integer.valueOf(zzs)) : String.format("mha1.%02X", Integer.valueOf(zzs));
                            int zzt2 = zzesVar.zzt();
                            byte[] bArr = new byte[zzt2];
                            str5 = format;
                            zzesVar.zzm(bArr, 0, zzt2);
                            if (list == null) {
                                list = zzgvz.zzj(bArr);
                                zzF = i25;
                                i11 = zzB2;
                                i12 = zzg;
                                i13 = zzB;
                                str4 = str5;
                                zzg = i12 + i11;
                                zzB = i13;
                                i7 = 2;
                                i8 = 32;
                                i20 = i3;
                            } else {
                                list = zzgvz.zzk(bArr, (byte[]) list.get(0));
                                str4 = str5;
                                zzF = i25;
                                i11 = zzB2;
                                i12 = zzg;
                                i13 = zzB;
                            }
                        } else {
                            if (zzB3 == 1835557200) {
                                zzesVar.zzh(zzg + 8);
                                int zzs2 = zzesVar.zzs();
                                if (zzs2 > 0) {
                                    byte[] bArr2 = new byte[zzs2];
                                    zzesVar.zzm(bArr2, 0, zzs2);
                                    if (list == null) {
                                        list = zzgvz.zzj(bArr2);
                                        str4 = str5;
                                        i11 = zzB2;
                                        i12 = zzg;
                                        i13 = zzB;
                                        zzF = i25;
                                    } else {
                                        list = zzgvz.zzk((byte[]) list.get(0), bArr2);
                                        str4 = str5;
                                        zzF = i25;
                                        i11 = zzB2;
                                        i12 = zzg;
                                        i13 = zzB;
                                    }
                                }
                                zzF = i25;
                                i11 = zzB2;
                                i12 = zzg;
                                i13 = zzB;
                                str4 = str5;
                            } else {
                                if (zzB3 == 1702061171) {
                                    zzF = i25;
                                    i11 = zzB2;
                                    i12 = zzg;
                                    i13 = zzB;
                                    i14 = i12;
                                    i15 = -1;
                                } else if (z && zzB3 == 2002876005) {
                                    int zzg2 = zzesVar.zzg();
                                    zzaft.zza(zzg2 >= zzg, null);
                                    int i26 = zzg2;
                                    while (true) {
                                        if (i26 - zzg >= zzB2) {
                                            zzF = i25;
                                            i11 = zzB2;
                                            i12 = zzg;
                                            i13 = zzB;
                                            i14 = -1;
                                            i15 = -1;
                                            break;
                                        }
                                        zzesVar.zzh(i26);
                                        int zzB4 = zzesVar.zzB();
                                        if (zzB4 > 0) {
                                            i18 = i26;
                                            z2 = true;
                                        } else {
                                            i18 = i26;
                                            z2 = false;
                                        }
                                        zzaft.zza(z2, str6);
                                        String str7 = str6;
                                        if (zzesVar.zzB() == 1702061171) {
                                            zzF = i25;
                                            i12 = zzg;
                                            i13 = zzB;
                                            i14 = i18;
                                            i15 = -1;
                                            i11 = zzB2;
                                            break;
                                        }
                                        i26 = i18 + zzB4;
                                        str6 = str7;
                                    }
                                } else if (zzB3 == 1651798644) {
                                    zzaksVar = zzq(zzesVar, zzg);
                                    str4 = str5;
                                    zzF = i25;
                                    i11 = zzB2;
                                    i12 = zzg;
                                    i13 = zzB;
                                } else {
                                    if (zzB3 == 1684103987) {
                                        zzesVar.zzh(zzg + 8);
                                        zzakzVar.zzb = zzaeq.zza(zzesVar, Integer.toString(i4), str, zzqVar2);
                                    } else if (zzB3 == 1684366131) {
                                        zzesVar.zzh(zzg + 8);
                                        zzakzVar.zzb = zzaeq.zzb(zzesVar, Integer.toString(i4), str, zzqVar2);
                                    } else if (zzB3 == 1684103988) {
                                        zzesVar.zzh(zzg + 8);
                                        zzakzVar.zzb = zzaet.zza(zzesVar, Integer.toString(i4), str, zzqVar2);
                                    } else if (zzB3 != 1684892784) {
                                        if (zzB3 == 1684305011 || zzB3 == 1969517683) {
                                            i11 = zzB2;
                                            i12 = zzg;
                                            i13 = zzB;
                                            zzt zztVar = new zzt();
                                            zztVar.zzb(i4);
                                            zztVar.zzo(str2);
                                            zztVar.zzG(zzt);
                                            zzF = i25;
                                            zztVar.zzH(zzF);
                                            zztVar.zzs(zzqVar2);
                                            zztVar.zze(str);
                                            zzakzVar.zzb = zztVar.zzO();
                                        } else {
                                            if (zzB3 == 1682927731) {
                                                int i27 = zzB2 - 8;
                                                byte[] bArr3 = zzb;
                                                int length = bArr3.length;
                                                i11 = zzB2;
                                                byte[] copyOf = Arrays.copyOf(bArr3, length + i27);
                                                zzesVar.zzh(zzg + 8);
                                                zzesVar.zzm(copyOf, length, i27);
                                                list = zzgu.zza(copyOf);
                                            } else {
                                                i11 = zzB2;
                                                if (zzB3 == 1684425825) {
                                                    byte[] bArr4 = new byte[i11 - 8];
                                                    bArr4[0] = 102;
                                                    bArr4[1] = 76;
                                                    bArr4[i7] = 97;
                                                    bArr4[3] = 67;
                                                    zzesVar.zzh(zzg + 12);
                                                    zzesVar.zzm(bArr4, 4, i11 - 12);
                                                    list = zzgvz.zzj(bArr4);
                                                } else if (zzB3 == 1634492771) {
                                                    int i28 = i11 - 12;
                                                    byte[] bArr5 = new byte[i28];
                                                    zzesVar.zzh(zzg + 12);
                                                    zzesVar.zzm(bArr5, 0, i28);
                                                    int i29 = zzdp.zza;
                                                    zzes zzesVar2 = new zzes(bArr5);
                                                    zzesVar2.zzh(5);
                                                    int zzs3 = zzesVar2.zzs();
                                                    zzesVar2.zzh(9);
                                                    int zzs4 = zzesVar2.zzs();
                                                    zzesVar2.zzh(20);
                                                    int[] iArr = {zzesVar2.zzH(), zzs4, zzs3};
                                                    int i30 = iArr[0];
                                                    int i31 = iArr[1];
                                                    int zzB5 = zzfk.zzB(zzs3, ByteOrder.LITTLE_ENDIAN);
                                                    list = zzgvz.zzj(bArr5);
                                                    zzt = i31;
                                                    i24 = zzB5;
                                                    zzF = i30;
                                                    i12 = zzg;
                                                    i13 = zzB;
                                                    str4 = str5;
                                                } else if (zzB3 == 1767990114) {
                                                    zzesVar.zzh(zzg + 9);
                                                    int zza2 = zzgzt.zza(zzesVar.zzP());
                                                    byte[] bArr6 = new byte[zza2];
                                                    zzesVar.zzm(bArr6, 0, zza2);
                                                    int i32 = zzdp.zza;
                                                    zzes zzesVar3 = new zzes(bArr6);
                                                    String str8 = null;
                                                    String str9 = null;
                                                    while (zzesVar3.zzd() > 0 && (str8 == null || str9 == null)) {
                                                        int zzs5 = zzesVar3.zzs();
                                                        byte[] bArr7 = bArr6;
                                                        int i33 = zzs5 >> 3;
                                                        int i34 = zzs5 & 2;
                                                        int i35 = zzs5 & 1;
                                                        int zza3 = zzgzt.zza(zzesVar3.zzP());
                                                        if (i33 > 4 && i33 < 24 && i34 != 0) {
                                                            zzesVar3.zzQ();
                                                            zzesVar3.zzQ();
                                                        }
                                                        int zzg3 = zzesVar3.zzg() + zza3;
                                                        int i36 = zzg;
                                                        if (i33 == 31) {
                                                            zzesVar3.zzk(4);
                                                            Object[] objArr = {Integer.valueOf(zzesVar3.zzs()), Integer.valueOf(zzesVar3.zzs())};
                                                            String str10 = zzfk.zza;
                                                            str8 = String.format(Locale.US, "iamf.%03X.%03X", objArr);
                                                        } else if (i33 == 0) {
                                                            zzesVar3.zzQ();
                                                            String zzK = zzesVar3.zzK(4, StandardCharsets.UTF_8);
                                                            if (zzK.equals("mp4a")) {
                                                                zzesVar3.zzQ();
                                                                zzesVar3.zzk(i7);
                                                                zzer zzerVar = new zzer();
                                                                zzerVar.zza(zzesVar3);
                                                                int zzj = zzerVar.zzj(5);
                                                                i17 = zzB;
                                                                if (zzj == 31) {
                                                                    zzj = zzerVar.zzj(6) + 32;
                                                                }
                                                                StringBuilder sb = new StringBuilder(zzK.length() + 4 + String.valueOf(zzj).length());
                                                                sb.append(zzK);
                                                                sb.append(".40.");
                                                                sb.append(zzj);
                                                                zzK = sb.toString();
                                                            } else {
                                                                i17 = zzB;
                                                            }
                                                            str9 = zzK;
                                                            zzesVar3.zzh(zzg3);
                                                            bArr6 = bArr7;
                                                            zzg = i36;
                                                            zzB = i17;
                                                            i7 = 2;
                                                        }
                                                        i17 = zzB;
                                                        zzesVar3.zzh(zzg3);
                                                        bArr6 = bArr7;
                                                        zzg = i36;
                                                        zzB = i17;
                                                        i7 = 2;
                                                    }
                                                    byte[] bArr8 = bArr6;
                                                    i12 = zzg;
                                                    i13 = zzB;
                                                    if (str8 == null || str9 == null) {
                                                        str4 = null;
                                                    } else {
                                                        StringBuilder sb2 = new StringBuilder(str8.length() + 1 + str9.length());
                                                        sb2.append(str8);
                                                        sb2.append(".");
                                                        sb2.append(str9);
                                                        str4 = sb2.toString();
                                                    }
                                                    list = zzgvz.zzj(bArr8);
                                                    zzF = i25;
                                                } else {
                                                    i12 = zzg;
                                                    i13 = zzB;
                                                    if (zzB3 == 1885564227) {
                                                        zzesVar.zzh(i12 + 12);
                                                        ByteOrder byteOrder = (zzesVar.zzs() & 1) != 0 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
                                                        int zzs6 = zzesVar.zzs();
                                                        if (i10 == 1768973165) {
                                                            i16 = zzfk.zzB(zzs6, byteOrder);
                                                        } else {
                                                            if (i10 == 1718641517 && zzs6 == i8 && byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) {
                                                                i16 = 4;
                                                            }
                                                            i16 = i24;
                                                        }
                                                        zzF = i25;
                                                        i24 = i16;
                                                        if (i16 != -1) {
                                                            str2 = MimeTypes.AUDIO_RAW;
                                                        }
                                                    } else {
                                                        zzF = i25;
                                                    }
                                                }
                                            }
                                            str4 = str5;
                                            zzF = i25;
                                            i12 = zzg;
                                            i13 = zzB;
                                        }
                                        str4 = str5;
                                    } else {
                                        if (zzB <= 0) {
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(zzB).length() + 49);
                                            sb3.append("Invalid sample rate for Dolby TrueHD MLP stream: ");
                                            sb3.append(zzB);
                                            throw zzat.zzb(sb3.toString(), null);
                                        }
                                        str4 = str5;
                                        i11 = zzB2;
                                        i12 = zzg;
                                        zzF = zzB;
                                        i13 = zzF;
                                        zzt = i7;
                                    }
                                    zzF = i25;
                                    i11 = zzB2;
                                    i12 = zzg;
                                    i13 = zzB;
                                    str4 = str5;
                                }
                                if (i14 != i15) {
                                    zzakuVar = zzp(zzesVar, i14);
                                    String zza4 = zzakuVar.zza();
                                    byte[] zzb2 = zzakuVar.zzb();
                                    if (zzb2 != null) {
                                        if (MimeTypes.AUDIO_VORBIS.equals(zza4)) {
                                            zzes zzesVar4 = new zzes(zzb2);
                                            int i37 = 1;
                                            zzesVar4.zzk(1);
                                            int i38 = 0;
                                            while (zzesVar4.zzd() > 0 && zzesVar4.zzn() == 255) {
                                                zzesVar4.zzk(i37);
                                                i38 += 255;
                                                i37 = 1;
                                            }
                                            int zzs7 = i38 + zzesVar4.zzs();
                                            int i39 = 0;
                                            while (zzesVar4.zzd() > 0 && zzesVar4.zzn() == 255) {
                                                zzesVar4.zzk(1);
                                                i39 += 255;
                                            }
                                            int zzs8 = i39 + zzesVar4.zzs();
                                            byte[] bArr9 = new byte[zzs7];
                                            int zzg4 = zzesVar4.zzg();
                                            System.arraycopy(zzb2, zzg4, bArr9, 0, zzs7);
                                            int i40 = zzg4 + zzs7 + zzs8;
                                            int length2 = zzb2.length - i40;
                                            byte[] bArr10 = new byte[length2];
                                            System.arraycopy(zzb2, i40, bArr10, 0, length2);
                                            list = zzgvz.zzk(bArr9, bArr10);
                                        } else {
                                            if (MimeTypes.AUDIO_AAC.equals(zza4)) {
                                                zzaen zza5 = zzaeo.zza(zzb2);
                                                zzF = zza5.zza;
                                                zzt = zza5.zzb;
                                                str3 = zza5.zzc;
                                            } else {
                                                str3 = str5;
                                            }
                                            zzgvz zzj2 = zzgvz.zzj(zzb2);
                                            str2 = zza4;
                                            str4 = str3;
                                            list = zzj2;
                                        }
                                    }
                                    str2 = zza4;
                                    str4 = str5;
                                }
                                str4 = str5;
                            }
                            zzg = i12 + i11;
                            zzB = i13;
                            i7 = 2;
                            i8 = 32;
                            i20 = i3;
                        }
                        zzg = i12 + i11;
                        zzB = i13;
                        i7 = 2;
                        i8 = 32;
                        i20 = i3;
                    }
                    String str11 = str4;
                    if (zzakzVar.zzb != null || str2 == null) {
                        return;
                    }
                    zzt zztVar2 = new zzt();
                    zztVar2.zzb(i4);
                    zztVar2.zzo(str2);
                    zztVar2.zzk(str11);
                    zztVar2.zzG(zzt);
                    zztVar2.zzH(zzF);
                    zztVar2.zzI(i24);
                    zztVar2.zzr(list);
                    zztVar2.zzs(zzqVar2);
                    zztVar2.zze(str);
                    if (zzakuVar != null) {
                        zztVar2.zzi(zzgzt.zzb(zzakuVar.zzc()));
                        zztVar2.zzj(zzgzt.zzb(zzakuVar.zzd()));
                    } else if (zzaksVar != null) {
                        zztVar2.zzi(zzgzt.zzb(zzaksVar.zza()));
                        zztVar2.zzj(zzgzt.zzb(zzaksVar.zzb()));
                    }
                    zzakzVar.zzb = zztVar2.zzO();
                    return;
                }
                i10 = i19;
                i9 = i7;
                str2 = MimeTypes.AUDIO_RAW;
                int i242 = i9;
                String str42 = null;
                List list2 = null;
                zzaku zzakuVar2 = null;
                zzaks zzaksVar2 = null;
                while (zzg - i2 < i20) {
                }
                String str112 = str42;
                if (zzakzVar.zzb != null) {
                    return;
                } else {
                    return;
                }
            }
            str2 = MimeTypes.AUDIO_AMR_WB;
        }
        i10 = i19;
        int i2422 = i9;
        String str422 = null;
        List list22 = null;
        zzaku zzakuVar22 = null;
        zzaks zzaksVar22 = null;
        while (zzg - i2 < i20) {
        }
        String str1122 = str422;
        if (zzakzVar.zzb != null) {
        }
    }

    private static zzaku zzp(zzes zzesVar, int i) {
        zzesVar.zzh(i + 12);
        zzesVar.zzk(1);
        zzs(zzesVar);
        zzesVar.zzk(2);
        int zzs = zzesVar.zzs();
        if ((zzs & 128) != 0) {
            zzesVar.zzk(2);
        }
        if ((zzs & 64) != 0) {
            zzesVar.zzk(zzesVar.zzs());
        }
        if ((zzs & 32) != 0) {
            zzesVar.zzk(2);
        }
        zzesVar.zzk(1);
        zzs(zzesVar);
        String zze = zzas.zze(zzesVar.zzs());
        if (MimeTypes.AUDIO_MPEG.equals(zze) || MimeTypes.AUDIO_DTS.equals(zze) || MimeTypes.AUDIO_DTS_HD.equals(zze)) {
            return new zzaku(zze, null, -1L, -1L);
        }
        zzesVar.zzk(4);
        long zzz = zzesVar.zzz();
        long zzz2 = zzesVar.zzz();
        zzesVar.zzk(1);
        int zzs2 = zzs(zzesVar);
        long j = zzz2;
        byte[] bArr = new byte[zzs2];
        zzesVar.zzm(bArr, 0, zzs2);
        if (j <= 0) {
            j = -1;
        }
        return new zzaku(zze, bArr, j, zzz > 0 ? zzz : -1L);
    }

    private static zzaks zzq(zzes zzesVar, int i) {
        zzesVar.zzh(i + 8);
        zzesVar.zzk(4);
        return new zzaks(zzesVar.zzz(), zzesVar.zzz());
    }

    private static Pair zzr(zzes zzesVar, int i, int i2) throws zzat {
        Integer num;
        zzamc zzamcVar;
        Pair create;
        int i3;
        int i4;
        Integer num2;
        boolean z;
        int zzg = zzesVar.zzg();
        while (zzg - i < i2) {
            zzesVar.zzh(zzg);
            int zzB = zzesVar.zzB();
            zzaft.zza(zzB > 0, "childAtomSize must be positive");
            if (zzesVar.zzB() == 1936289382) {
                int i5 = zzg + 8;
                int i6 = 0;
                int i7 = -1;
                Integer num3 = null;
                String str = null;
                while (i5 - zzg < zzB) {
                    zzesVar.zzh(i5);
                    int zzB2 = zzesVar.zzB();
                    int zzB3 = zzesVar.zzB();
                    if (zzB3 == 1718775137) {
                        num3 = Integer.valueOf(zzesVar.zzB());
                    } else if (zzB3 == 1935894637) {
                        zzesVar.zzk(4);
                        str = zzesVar.zzK(4, StandardCharsets.UTF_8);
                    } else if (zzB3 == 1935894633) {
                        i7 = i5;
                        i6 = zzB2;
                    }
                    i5 += zzB2;
                }
                byte[] bArr = null;
                if (C.CENC_TYPE_cenc.equals(str) || C.CENC_TYPE_cbc1.equals(str) || C.CENC_TYPE_cens.equals(str) || C.CENC_TYPE_cbcs.equals(str)) {
                    zzaft.zza(num3 != null, "frma atom is mandatory");
                    zzaft.zza(i7 != -1, "schi atom is mandatory");
                    int i8 = i7 + 8;
                    while (true) {
                        if (i8 - i7 >= i6) {
                            num = num3;
                            zzamcVar = null;
                            break;
                        }
                        zzesVar.zzh(i8);
                        int zzB4 = zzesVar.zzB();
                        if (zzesVar.zzB() == 1952804451) {
                            int zza2 = zza(zzesVar.zzB());
                            zzesVar.zzk(1);
                            if (zza2 == 0) {
                                zzesVar.zzk(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int zzs = zzesVar.zzs();
                                i3 = zzs & 15;
                                i4 = (zzs & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                            }
                            if (zzesVar.zzs() == 1) {
                                num2 = num3;
                                z = true;
                            } else {
                                num2 = num3;
                                z = false;
                            }
                            int zzs2 = zzesVar.zzs();
                            byte[] bArr2 = new byte[16];
                            zzesVar.zzm(bArr2, 0, 16);
                            if (z && zzs2 == 0) {
                                int zzs3 = zzesVar.zzs();
                                byte[] bArr3 = new byte[zzs3];
                                zzesVar.zzm(bArr3, 0, zzs3);
                                bArr = bArr3;
                            }
                            num = num2;
                            zzamcVar = new zzamc(z, str, zzs2, bArr2, i4, i3, bArr);
                        } else {
                            i8 += zzB4;
                        }
                    }
                    zzaft.zza(zzamcVar != null, "tenc atom is mandatory");
                    String str2 = zzfk.zza;
                    create = Pair.create(num, zzamcVar);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            zzg += zzB;
        }
        return null;
    }

    private static int zzs(zzes zzesVar) {
        int zzs = zzesVar.zzs();
        int i = zzs & 127;
        while ((zzs & 128) == 128) {
            zzs = zzesVar.zzs();
            i = (i << 7) | (zzs & 127);
        }
        return i;
    }
}
