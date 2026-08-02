package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
public final class zzakb implements zzafp {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb;
    private static final byte[] zzc;
    private static final byte[] zzd;
    private static final byte[] zze;
    private static final UUID zzf;
    private static final Map zzg;
    private long zzA;
    private long zzB;
    private boolean zzC;
    private boolean zzD;
    private zzaka zzE;
    private boolean zzF;
    private int zzG;
    private long zzH;
    private final SparseArray zzI;
    private boolean zzJ;
    private long zzK;
    private int zzL;
    private long zzM;
    private long zzN;
    private int zzO;
    private boolean zzP;
    private long zzQ;
    private long zzR;
    private long zzS;
    private boolean zzT;
    private int zzU;
    private long zzV;
    private long zzW;
    private int zzX;
    private int zzY;
    private int[] zzZ;
    private int zzaa;
    private int zzab;
    private int zzac;
    private int zzad;
    private boolean zzae;
    private long zzaf;
    private int zzag;
    private int zzah;
    private int zzai;
    private boolean zzaj;
    private boolean zzak;
    private boolean zzal;
    private int zzam;
    private byte zzan;
    private boolean zzao;
    private zzafs zzap;
    private final zzaju zzaq;
    private final zzakd zzh;
    private final SparseArray zzi;
    private final boolean zzj;
    private final boolean zzk;
    private final zzanc zzl;
    private final zzes zzm;
    private final zzes zzn;
    private final zzes zzo;
    private final zzes zzp;
    private final zzes zzq;
    private final zzes zzr;
    private final zzes zzs;
    private final zzes zzt;
    private final zzes zzu;
    private final zzes zzv;
    private ByteBuffer zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        int i = zzajx.zza;
        zzb = new byte[]{49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
        String str = zzfk.zza;
        zzc = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        zzd = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        zze = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        zzf = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        zzg = Collections.unmodifiableMap(hashMap);
    }

    @Deprecated
    public zzakb() {
        this(new zzaju(), 2, zzanc.zza);
    }

    private static int[] zzA(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    private final void zzB() {
        if (!this.zzD) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.zzi;
            if (i >= sparseArray.size()) {
                zzafs zzafsVar = this.zzap;
                zzafsVar.getClass();
                zzafsVar.zzv();
                this.zzD = false;
                return;
            }
            if (((zzaka) sparseArray.valueAt(i)).zzV) {
                return;
            } else {
                i++;
            }
        }
    }

    @EnsuresNonNull({"currentTrack"})
    private final void zzq(int i) throws zzat {
        if (this.zzE != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 32);
        sb.append("Element ");
        sb.append(i);
        sb.append(" must be in a TrackEntry");
        throw zzat.zzb(sb.toString(), null);
    }

    private final void zzr(int i) throws zzat {
        if (this.zzJ) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 26);
        sb.append("Element ");
        sb.append(i);
        sb.append(" must be in a Cues");
        throw zzat.zzb(sb.toString(), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ee  */
    @RequiresNonNull({"#1.output"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzs(zzaka zzakaVar, long j, int i, int i2, int i3) {
        char c;
        byte[] zzx;
        int i4;
        int zze2;
        zzahc zzahcVar = zzakaVar.zzU;
        if (zzahcVar != null) {
            zzahcVar.zzc(zzakaVar.zzY, j, i, i2, i3, zzakaVar.zzj);
        } else {
            String str = zzakaVar.zzc;
            if ("S_TEXT/UTF8".equals(str) || "S_TEXT/ASS".equals(str) || "S_TEXT/SSA".equals(str) || "S_TEXT/WEBVTT".equals(str)) {
                if (this.zzY > 1) {
                    zzef.zzc("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.zzW;
                    if (j2 == C.TIME_UNSET) {
                        zzef.zzc("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        zzes zzesVar = this.zzs;
                        byte[] zzi = zzesVar.zzi();
                        switch (str.hashCode()) {
                            case 738597099:
                                if (str.equals("S_TEXT/ASS")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 738614379:
                                if (str.equals("S_TEXT/SSA")) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1045209816:
                                if (str.equals("S_TEXT/WEBVTT")) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1422270023:
                                if (str.equals("S_TEXT/UTF8")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        if (c == 0) {
                            zzx = zzx(j2, "%02d:%02d:%02d,%03d", 1000L);
                            i4 = 19;
                        } else if (c == 1 || c == 2) {
                            zzx = zzx(j2, "%01d:%02d:%02d:%02d", 10000L);
                            i4 = 21;
                        } else {
                            if (c != 3) {
                                throw new IllegalArgumentException();
                            }
                            zzx = zzx(j2, "%02d:%02d:%02d.%03d", 1000L);
                            i4 = 25;
                        }
                        System.arraycopy(zzx, 0, zzi, i4, zzx.length);
                        int zzg2 = zzesVar.zzg();
                        while (true) {
                            if (zzg2 < zzesVar.zze()) {
                                if (zzesVar.zzi()[zzg2] == 0) {
                                    zzesVar.zzf(zzg2);
                                } else {
                                    zzg2++;
                                }
                            }
                        }
                        zzakaVar.zzY.zzc(zzesVar, zzesVar.zze());
                        zze2 = i2 + zzesVar.zze();
                        if ((i & 268435456) != 0) {
                            if (this.zzY > 1) {
                                this.zzv.zza(0);
                            } else {
                                zzes zzesVar2 = this.zzv;
                                int zze3 = zzesVar2.zze();
                                zzakaVar.zzY.zzd(zzesVar2, zze3, 2);
                                zze2 += zze3;
                            }
                        }
                        zzakaVar.zzY.zze(j, i, zze2, i3, zzakaVar.zzj);
                    }
                }
            }
            zze2 = i2;
            if ((i & 268435456) != 0) {
            }
            zzakaVar.zzY.zze(j, i, zze2, i3, zzakaVar.zzj);
        }
        this.zzT = true;
    }

    private final void zzt(zzafq zzafqVar, int i) throws IOException {
        zzes zzesVar = this.zzo;
        if (zzesVar.zze() >= i) {
            return;
        }
        if (zzesVar.zzj() < i) {
            int zzj = zzesVar.zzj();
            zzesVar.zzc(Math.max(zzj + zzj, i));
        }
        zzafqVar.zzc(zzesVar.zzi(), zzesVar.zze(), i - zzesVar.zze());
        zzesVar.zzf(i);
    }

    @RequiresNonNull({"#2.output"})
    private final int zzu(zzafq zzafqVar, zzaka zzakaVar, int i, boolean z) throws IOException {
        int i2;
        String str = zzakaVar.zzc;
        if ("S_TEXT/UTF8".equals(str)) {
            zzw(zzafqVar, zzb, i);
            int i3 = this.zzah;
            zzv();
            return i3;
        }
        if ("S_TEXT/ASS".equals(str) || "S_TEXT/SSA".equals(str)) {
            zzw(zzafqVar, zzd, i);
            int i4 = this.zzah;
            zzv();
            return i4;
        }
        if ("S_TEXT/WEBVTT".equals(str)) {
            zzw(zzafqVar, zze, i);
            int i5 = this.zzah;
            zzv();
            return i5;
        }
        if (zzakaVar.zzV) {
            zzakaVar.zzZ.getClass();
            int i6 = zzafo.zza;
            zzes zzesVar = new zzes(i);
            if (zzafqVar.zzh(zzesVar.zzi(), 0, i, true)) {
                zzafqVar.zzl();
                if (zzafo.zza(zzesVar.zzr()) == 1 && zzesVar.zzd() >= 10) {
                    byte[] bArr = new byte[10];
                    zzesVar.zzm(bArr, 0, 10);
                    zzesVar.zzh(0);
                    int zzc2 = zzafo.zzc(bArr);
                    if (zzesVar.zzd() >= zzc2 + 4) {
                        zzesVar.zzk(zzc2);
                        if (zzafo.zza(zzesVar.zzB()) == 2) {
                            zzt zza2 = zzakaVar.zzZ.zza();
                            zza2.zzo(MimeTypes.AUDIO_DTS_HD);
                            zzakaVar.zzZ = zza2.zzO();
                        }
                    }
                }
            }
            zzakaVar.zzY.zzA(zzakaVar.zzZ);
            zzakaVar.zzV = false;
            zzB();
        }
        zzahb zzahbVar = zzakaVar.zzY;
        if (!this.zzaj) {
            if (zzakaVar.zzh) {
                this.zzac &= -1073741825;
                if (!this.zzak) {
                    zzes zzesVar2 = this.zzo;
                    zzafqVar.zzc(zzesVar2.zzi(), 0, 1);
                    this.zzag++;
                    if ((zzesVar2.zzi()[0] & 128) == 128) {
                        throw zzat.zzb("Extension bit is set in signal byte", null);
                    }
                    this.zzan = zzesVar2.zzi()[0];
                    this.zzak = true;
                }
                byte b = this.zzan;
                if ((b & 1) == 1) {
                    int i7 = b & 2;
                    this.zzac |= 1073741824;
                    if (!this.zzao) {
                        zzes zzesVar3 = this.zzt;
                        zzafqVar.zzc(zzesVar3.zzi(), 0, 8);
                        this.zzag += 8;
                        this.zzao = true;
                        zzes zzesVar4 = this.zzo;
                        zzesVar4.zzi()[0] = (byte) ((i7 != 2 ? 0 : 128) | 8);
                        zzesVar4.zzh(0);
                        zzahbVar.zzd(zzesVar4, 1, 1);
                        this.zzah++;
                        zzesVar3.zzh(0);
                        zzahbVar.zzd(zzesVar3, 8, 1);
                        this.zzah += 8;
                    }
                    if (i7 == 2) {
                        if (!this.zzal) {
                            zzes zzesVar5 = this.zzo;
                            zzafqVar.zzc(zzesVar5.zzi(), 0, 1);
                            this.zzag++;
                            zzesVar5.zzh(0);
                            this.zzam = zzesVar5.zzs();
                            this.zzal = true;
                        }
                        int i8 = this.zzam * 4;
                        zzes zzesVar6 = this.zzo;
                        zzesVar6.zza(i8);
                        zzafqVar.zzc(zzesVar6.zzi(), 0, i8);
                        this.zzag += i8;
                        int i9 = (this.zzam >> 1) + 1;
                        int i10 = (i9 * 6) + 2;
                        ByteBuffer byteBuffer = this.zzw;
                        if (byteBuffer == null || byteBuffer.capacity() < i10) {
                            this.zzw = ByteBuffer.allocate(i10);
                        }
                        this.zzw.position(0);
                        this.zzw.putShort((short) i9);
                        int i11 = 0;
                        int i12 = 0;
                        while (true) {
                            i2 = this.zzam;
                            if (i11 >= i2) {
                                break;
                            }
                            int zzH = zzesVar6.zzH();
                            int i13 = zzH - i12;
                            if (i11 % 2 == 0) {
                                this.zzw.putShort((short) i13);
                            } else {
                                this.zzw.putInt(i13);
                            }
                            i11++;
                            i12 = zzH;
                        }
                        int i14 = (i - this.zzag) - i12;
                        if ((i2 & 1) == 1) {
                            this.zzw.putInt(i14);
                        } else {
                            this.zzw.putShort((short) i14);
                            this.zzw.putInt(0);
                        }
                        zzes zzesVar7 = this.zzu;
                        zzesVar7.zzb(this.zzw.array(), i10);
                        zzahbVar.zzd(zzesVar7, i10, 1);
                        this.zzah += i10;
                    }
                }
            } else {
                byte[] bArr2 = zzakaVar.zzi;
                if (bArr2 != null) {
                    this.zzr.zzb(bArr2, bArr2.length);
                }
            }
            if (!"A_OPUS".equals(zzakaVar.zzc) ? zzakaVar.zzg > 0 : z) {
                this.zzac |= 268435456;
                this.zzv.zza(0);
                int zze2 = (this.zzr.zze() + i) - this.zzag;
                zzes zzesVar8 = this.zzo;
                zzesVar8.zza(4);
                zzesVar8.zzi()[0] = (byte) ((zze2 >> 24) & 255);
                zzesVar8.zzi()[1] = (byte) ((zze2 >> 16) & 255);
                zzesVar8.zzi()[2] = (byte) ((zze2 >> 8) & 255);
                zzesVar8.zzi()[3] = (byte) (zze2 & 255);
                zzahbVar.zzd(zzesVar8, 4, 2);
                this.zzah += 4;
            }
            this.zzaj = true;
        }
        zzes zzesVar9 = this.zzr;
        int zze3 = i + zzesVar9.zze();
        String str2 = zzakaVar.zzc;
        if (!"V_MPEG4/ISO/AVC".equals(str2) && !"V_MPEGH/ISO/HEVC".equals(str2)) {
            if (zzakaVar.zzU != null) {
                zzgsw.zzi(zzesVar9.zze() == 0);
                zzakaVar.zzU.zzb(zzafqVar);
            }
            while (true) {
                int i15 = this.zzag;
                if (i15 >= zze3) {
                    break;
                }
                int zzy = zzy(zzafqVar, zzahbVar, zze3 - i15);
                this.zzag += zzy;
                this.zzah += zzy;
            }
        } else {
            zzes zzesVar10 = this.zzn;
            byte[] zzi = zzesVar10.zzi();
            zzi[0] = 0;
            zzi[1] = 0;
            zzi[2] = 0;
            int i16 = zzakaVar.zzaa;
            int i17 = 4 - i16;
            while (this.zzag < zze3) {
                int i18 = this.zzai;
                if (i18 == 0) {
                    int min = Math.min(i16, zzesVar9.zzd());
                    zzafqVar.zzc(zzi, i17 + min, i16 - min);
                    if (min > 0) {
                        zzesVar9.zzm(zzi, i17, min);
                    }
                    this.zzag += i16;
                    zzesVar10.zzh(0);
                    this.zzai = zzesVar10.zzH();
                    zzes zzesVar11 = this.zzm;
                    zzesVar11.zzh(0);
                    zzahbVar.zzc(zzesVar11, 4);
                    this.zzah += 4;
                } else {
                    int zzy2 = zzy(zzafqVar, zzahbVar, i18);
                    this.zzag += zzy2;
                    this.zzah += zzy2;
                    this.zzai -= zzy2;
                }
            }
        }
        if ("A_VORBIS".equals(zzakaVar.zzc)) {
            zzes zzesVar12 = this.zzp;
            zzesVar12.zzh(0);
            zzahbVar.zzc(zzesVar12, 4);
            this.zzah += 4;
        }
        int i19 = this.zzah;
        zzv();
        return i19;
    }

    private final void zzv() {
        this.zzag = 0;
        this.zzah = 0;
        this.zzai = 0;
        this.zzaj = false;
        this.zzak = false;
        this.zzal = false;
        this.zzam = 0;
        this.zzan = (byte) 0;
        this.zzao = false;
        this.zzr.zza(0);
    }

    private final void zzw(zzafq zzafqVar, byte[] bArr, int i) throws IOException {
        int length = bArr.length;
        int i2 = length + i;
        zzes zzesVar = this.zzs;
        if (zzesVar.zzj() < i2) {
            byte[] copyOf = Arrays.copyOf(bArr, i2 + i);
            zzesVar.zzb(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, zzesVar.zzi(), 0, length);
        }
        zzafqVar.zzc(zzesVar.zzi(), length, i);
        zzesVar.zzh(0);
        zzesVar.zzf(i2);
    }

    private static byte[] zzx(long j, String str, long j2) {
        zzgsw.zza(j != C.TIME_UNSET);
        Locale locale = Locale.US;
        int i = (int) (j / 3600000000L);
        Integer valueOf = Integer.valueOf(i);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        Integer valueOf2 = Integer.valueOf(i2);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        String format = String.format(locale, str, valueOf, valueOf2, Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2)));
        String str2 = zzfk.zza;
        return format.getBytes(StandardCharsets.UTF_8);
    }

    private final int zzy(zzafq zzafqVar, zzahb zzahbVar, int i) throws IOException {
        zzes zzesVar = this.zzr;
        int zzd2 = zzesVar.zzd();
        if (zzd2 <= 0) {
            return zzahbVar.zza(zzafqVar, i, false);
        }
        int min = Math.min(i, zzd2);
        zzahbVar.zzc(zzesVar, min);
        return min;
    }

    private final long zzz(long j) throws zzat {
        long j2 = this.zzz;
        if (j2 != C.TIME_UNSET) {
            return zzfk.zzv(j, j2, 1000L, RoundingMode.DOWN);
        }
        throw zzat.zzb("Can't scale timecode prior to timecodeScale being set.", null);
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final boolean zza(zzafq zzafqVar) throws IOException {
        return new zzakc().zza(zzafqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzc(zzafs zzafsVar) {
        if (this.zzk) {
            zzafsVar = new zzanf(zzafsVar, this.zzl);
        }
        this.zzap = zzafsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final int zzd(zzafq zzafqVar, zzagp zzagpVar) throws IOException {
        int i = 0;
        this.zzT = false;
        while (!this.zzT) {
            boolean zzc2 = this.zzaq.zzc(zzafqVar);
            if (zzc2) {
                long zzn = zzafqVar.zzn();
                if (this.zzP) {
                    this.zzR = zzn;
                    zzagpVar.zza = this.zzQ;
                    this.zzP = false;
                    return 1;
                }
                if (this.zzF) {
                    long j = this.zzR;
                    if (j != -1) {
                        zzagpVar.zza = j;
                        this.zzR = -1L;
                        return 1;
                    }
                }
            }
            if (!zzc2) {
                while (true) {
                    SparseArray sparseArray = this.zzi;
                    if (i >= sparseArray.size()) {
                        return -1;
                    }
                    zzaka zzakaVar = (zzaka) sparseArray.valueAt(i);
                    zzakaVar.zzb();
                    zzahc zzahcVar = zzakaVar.zzU;
                    if (zzahcVar != null) {
                        zzahcVar.zzd(zzakaVar.zzY, zzakaVar.zzj);
                    }
                    i++;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zze(long j, long j2) {
        this.zzS = C.TIME_UNSET;
        int i = 0;
        this.zzU = 0;
        this.zzaq.zzb();
        this.zzh.zza();
        zzv();
        this.zzJ = false;
        this.zzK = C.TIME_UNSET;
        this.zzL = -1;
        this.zzM = -1L;
        this.zzN = -1L;
        if (!this.zzF) {
            this.zzI.clear();
        }
        while (true) {
            SparseArray sparseArray = this.zzi;
            if (i >= sparseArray.size()) {
                return;
            }
            zzahc zzahcVar = ((zzaka) sparseArray.valueAt(i)).zzU;
            if (zzahcVar != null) {
                zzahcVar.zza();
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzf() {
    }

    zzakb(zzaju zzajuVar, int i, zzanc zzancVar) {
        this.zzy = -1L;
        this.zzz = C.TIME_UNSET;
        this.zzA = C.TIME_UNSET;
        this.zzB = C.TIME_UNSET;
        this.zzK = C.TIME_UNSET;
        this.zzL = -1;
        this.zzM = -1L;
        this.zzN = -1L;
        this.zzO = -1;
        this.zzQ = -1L;
        this.zzR = -1L;
        this.zzS = C.TIME_UNSET;
        this.zzaq = zzajuVar;
        zzajuVar.zza(new zzajw(this, null));
        this.zzl = zzancVar;
        this.zzI = new SparseArray();
        this.zzj = 1 == ((i & 1) ^ 1);
        this.zzk = (i & 2) == 0;
        this.zzh = new zzakd();
        this.zzi = new SparseArray();
        this.zzo = new zzes(4);
        this.zzp = new zzes(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzq = new zzes(4);
        this.zzm = new zzes(zzgo.zza);
        this.zzn = new zzes(4);
        this.zzr = new zzes();
        this.zzs = new zzes();
        this.zzt = new zzes(8);
        this.zzu = new zzes();
        this.zzv = new zzes();
        this.zzZ = new int[1];
        this.zzD = true;
    }

    protected final void zzh(int i, long j, long j2) throws zzat {
        zzafs zzafsVar = this.zzap;
        zzafsVar.getClass();
        if (i == 160) {
            this.zzae = false;
            this.zzaf = 0L;
            return;
        }
        if (i == 174) {
            zzaka zzakaVar = new zzaka();
            this.zzE = zzakaVar;
            zzakaVar.zza = this.zzC;
            return;
        }
        if (i == 183) {
            if (this.zzF) {
                return;
            }
            zzr(i);
            this.zzL = -1;
            this.zzM = -1L;
            this.zzN = -1L;
            return;
        }
        if (i == 187) {
            if (this.zzF) {
                return;
            }
            zzr(i);
            this.zzK = C.TIME_UNSET;
            return;
        }
        if (i == 19899) {
            this.zzG = -1;
            this.zzH = -1L;
            return;
        }
        if (i == 20533) {
            zzq(i);
            this.zzE.zzh = true;
            return;
        }
        if (i == 21968) {
            zzq(i);
            this.zzE.zzy = true;
            return;
        }
        if (i == 408125543) {
            long j3 = this.zzy;
            if (j3 != -1 && j3 != j) {
                throw zzat.zzb("Multiple Segment elements not supported", null);
            }
            this.zzy = j;
            this.zzx = j2;
            return;
        }
        if (i == 475249515) {
            if (this.zzF) {
                return;
            }
            this.zzJ = true;
        } else if (i == 524531317 && !this.zzF) {
            if (this.zzj && this.zzQ != -1) {
                this.zzP = true;
            } else {
                zzafsVar.zzw(new zzagr(this.zzB, 0L));
                this.zzF = true;
            }
        }
    }

    protected final void zzl(int i, String str) throws zzat {
        if (i == 134) {
            zzq(i);
            this.zzE.zzc = str;
            return;
        }
        if (i != 17026) {
            if (i == 21358) {
                zzq(i);
                this.zzE.zzb = str;
                return;
            } else {
                if (i != 2274716) {
                    return;
                }
                zzq(i);
                this.zzE.zze(str);
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            this.zzC = Objects.equals(str, "webm");
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 22);
        sb.append("DocType ");
        sb.append(str);
        sb.append(" not supported");
        throw zzat.zzb(sb.toString(), null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0279, code lost:
    
        throw com.google.android.gms.internal.ads.zzat.zzb("EBML lacing sample size out of range.", null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzm(int i, int i2, zzafq zzafqVar) throws IOException {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long j;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13 = i;
        zzafq zzafqVar2 = zzafqVar;
        int i14 = 2;
        int i15 = 0;
        if (i13 != 161 && i13 != 163) {
            if (i13 == 165) {
                if (this.zzU != 2) {
                    return;
                }
                zzaka zzakaVar = (zzaka) this.zzi.get(this.zzaa);
                if (this.zzad != 4 || !"V_VP9".equals(zzakaVar.zzc)) {
                    zzafqVar2.zzf(i2);
                    return;
                }
                zzes zzesVar = this.zzv;
                zzesVar.zza(i2);
                zzafqVar2.zzc(zzesVar.zzi(), 0, i2);
                return;
            }
            if (i13 == 16877) {
                zzq(i);
                zzaka zzakaVar2 = this.zzE;
                if (zzakaVar2.zzc() != 1685485123 && zzakaVar2.zzc() != 1685480259) {
                    zzafqVar2.zzf(i2);
                    return;
                } else {
                    zzakaVar2.zzO = new byte[i2];
                    zzafqVar2.zzc(zzakaVar2.zzO, 0, i2);
                    return;
                }
            }
            if (i13 == 16981) {
                zzq(i);
                zzaka zzakaVar3 = this.zzE;
                zzakaVar3.zzi = new byte[i2];
                zzafqVar2.zzc(zzakaVar3.zzi, 0, i2);
                return;
            }
            if (i13 == 18402) {
                byte[] bArr = new byte[i2];
                zzafqVar2.zzc(bArr, 0, i2);
                zzq(i);
                this.zzE.zzj = new zzaha(1, bArr, 0, 0);
                return;
            }
            if (i13 == 21419) {
                zzes zzesVar2 = this.zzq;
                Arrays.fill(zzesVar2.zzi(), (byte) 0);
                zzafqVar2.zzc(zzesVar2.zzi(), 4 - i2, i2);
                zzesVar2.zzh(0);
                this.zzG = (int) zzesVar2.zzz();
                return;
            }
            if (i13 == 25506) {
                zzq(i);
                zzaka zzakaVar4 = this.zzE;
                zzakaVar4.zzk = new byte[i2];
                zzafqVar2.zzc(zzakaVar4.zzk, 0, i2);
                return;
            }
            if (i13 != 30322) {
                StringBuilder sb = new StringBuilder(String.valueOf(i13).length() + 15);
                sb.append("Unexpected id: ");
                sb.append(i13);
                throw zzat.zzb(sb.toString(), null);
            }
            zzq(i);
            zzaka zzakaVar5 = this.zzE;
            zzakaVar5.zzw = new byte[i2];
            zzafqVar2.zzc(zzakaVar5.zzw, 0, i2);
            return;
        }
        int i16 = 8;
        if (this.zzU == 0) {
            zzakd zzakdVar = this.zzh;
            this.zzaa = (int) zzakdVar.zzb(zzafqVar2, false, true, 8);
            this.zzab = zzakdVar.zzc();
            this.zzW = C.TIME_UNSET;
            this.zzU = 1;
            this.zzo.zza(0);
        }
        zzaka zzakaVar6 = (zzaka) this.zzi.get(this.zzaa);
        if (zzakaVar6 == null) {
            zzafqVar2.zzf(i2 - this.zzab);
            this.zzU = 0;
            return;
        }
        zzakaVar6.zzb();
        if (this.zzU == 1) {
            zzt(zzafqVar2, 3);
            zzes zzesVar3 = this.zzo;
            int i17 = (zzesVar3.zzi()[2] & 6) >> 1;
            if (i17 == 0) {
                this.zzY = 1;
                int[] zzA = zzA(this.zzZ, 1);
                this.zzZ = zzA;
                zzA[0] = (i2 - this.zzab) - 3;
            } else {
                zzt(zzafqVar2, 4);
                int i18 = (zzesVar3.zzi()[3] & 255) + 1;
                this.zzY = i18;
                int[] zzA2 = zzA(this.zzZ, i18);
                this.zzZ = zzA2;
                if (i17 == 2) {
                    int i19 = (i2 - this.zzab) - 4;
                    int i20 = this.zzY;
                    Arrays.fill(zzA2, 0, i20, i19 / i20);
                } else if (i17 == 1) {
                    int i21 = 0;
                    int i22 = 0;
                    int i23 = 4;
                    while (true) {
                        i9 = this.zzY - 1;
                        if (i21 >= i9) {
                            break;
                        }
                        this.zzZ[i21] = 0;
                        while (true) {
                            i10 = i23 + 1;
                            zzt(zzafqVar2, i10);
                            int i24 = zzesVar3.zzi()[i23] & 255;
                            int[] iArr = this.zzZ;
                            i11 = iArr[i21] + i24;
                            iArr[i21] = i11;
                            if (i24 != 255) {
                                break;
                            } else {
                                i23 = i10;
                            }
                        }
                        i22 += i11;
                        i21++;
                        i23 = i10;
                    }
                    this.zzZ[i9] = ((i2 - this.zzab) - i23) - i22;
                } else {
                    if (i17 != 3) {
                        throw zzat.zzb("Unexpected lacing value: 2", null);
                    }
                    int i25 = 0;
                    int i26 = 0;
                    int i27 = 4;
                    while (true) {
                        int i28 = this.zzY - 1;
                        if (i25 >= i28) {
                            i4 = i14;
                            i5 = i15;
                            this.zzZ[i28] = ((i2 - this.zzab) - i27) - i26;
                            break;
                        }
                        this.zzZ[i25] = i15;
                        int i29 = i27 + 1;
                        zzt(zzafqVar2, i29);
                        if (zzesVar3.zzi()[i27] == 0) {
                            throw zzat.zzb("No valid varint length mask found", null);
                        }
                        int i30 = i15;
                        while (true) {
                            if (i15 >= i16) {
                                i6 = i14;
                                i7 = i16;
                                i8 = i26;
                                j = 0;
                                break;
                            }
                            i7 = i16;
                            int i31 = 1 << (7 - i15);
                            if ((zzesVar3.zzi()[i27] & i31) != 0) {
                                i29 += i15;
                                zzt(zzafqVar2, i29);
                                int i32 = i27 + 1;
                                int i33 = zzesVar3.zzi()[i27] & 255 & (~i31);
                                int i34 = i14;
                                j = i33;
                                while (true) {
                                    int i35 = i32;
                                    if (i35 >= i29) {
                                        break;
                                    }
                                    i32 = i35 + 1;
                                    j = (j << i7) | (zzesVar3.zzi()[i35] & 255);
                                    i26 = i26;
                                    i34 = i34;
                                }
                                i6 = i34;
                                i8 = i26;
                                if (i25 > 0) {
                                    j -= (1 << ((i15 * 7) + 6)) - 1;
                                }
                            } else {
                                i15++;
                                zzafqVar2 = zzafqVar;
                                i16 = i7;
                            }
                        }
                        i27 = i29;
                        if (j < -2147483648L || j > 2147483647L) {
                            break;
                        }
                        int[] iArr2 = this.zzZ;
                        int i36 = (int) j;
                        if (i25 != 0) {
                            i36 += iArr2[i25 - 1];
                        }
                        iArr2[i25] = i36;
                        i26 = i8 + i36;
                        i25++;
                        zzafqVar2 = zzafqVar;
                        i15 = i30;
                        i16 = i7;
                        i14 = i6;
                    }
                }
            }
            i4 = 2;
            i5 = 0;
            this.zzV = this.zzS + zzz((zzesVar3.zzi()[i5] << 8) | (zzesVar3.zzi()[1] & 255));
            if (zzakaVar6.zze == 1) {
                i12 = 1;
            } else if (i13 == 163) {
                i12 = (zzesVar3.zzi()[i4] & 128) == 128 ? 1 : i5;
                i13 = 163;
            } else {
                i12 = i5;
            }
            this.zzac = i12;
            this.zzU = i4;
            this.zzX = i5;
            i3 = 163;
        } else {
            i3 = 163;
        }
        if (i13 == i3) {
            while (true) {
                int i37 = this.zzX;
                if (i37 >= this.zzY) {
                    this.zzU = 0;
                    return;
                }
                int zzu = zzu(zzafqVar, zzakaVar6, this.zzZ[i37], false);
                zzaka zzakaVar7 = zzakaVar6;
                zzs(zzakaVar7, this.zzV + ((this.zzX * zzakaVar6.zzf) / 1000), this.zzac, zzu, 0);
                this.zzX++;
                zzakaVar6 = zzakaVar7;
            }
        } else {
            while (true) {
                int i38 = this.zzX;
                if (i38 >= this.zzY) {
                    return;
                }
                int[] iArr3 = this.zzZ;
                iArr3[i38] = zzu(zzafqVar, zzakaVar6, iArr3[i38], true);
                this.zzX++;
            }
        }
    }

    public zzakb(zzanc zzancVar, int i) {
        this(new zzaju(), 0, zzancVar);
    }

    protected final void zzk(int i, double d) throws zzat {
        if (i == 181) {
            zzq(i);
            this.zzE.zzR = (int) d;
            return;
        }
        if (i == 17545) {
            this.zzA = (long) d;
            return;
        }
        switch (i) {
            case 21969:
                zzq(i);
                this.zzE.zzE = (float) d;
                break;
            case 21970:
                zzq(i);
                this.zzE.zzF = (float) d;
                break;
            case 21971:
                zzq(i);
                this.zzE.zzG = (float) d;
                break;
            case 21972:
                zzq(i);
                this.zzE.zzH = (float) d;
                break;
            case 21973:
                zzq(i);
                this.zzE.zzI = (float) d;
                break;
            case 21974:
                zzq(i);
                this.zzE.zzJ = (float) d;
                break;
            case 21975:
                zzq(i);
                this.zzE.zzK = (float) d;
                break;
            case 21976:
                zzq(i);
                this.zzE.zzL = (float) d;
                break;
            case 21977:
                zzq(i);
                this.zzE.zzM = (float) d;
                break;
            case 21978:
                zzq(i);
                this.zzE.zzN = (float) d;
                break;
            default:
                switch (i) {
                    case 30323:
                        zzq(i);
                        this.zzE.zzt = (float) d;
                        break;
                    case 30324:
                        zzq(i);
                        this.zzE.zzu = (float) d;
                        break;
                    case 30325:
                        zzq(i);
                        this.zzE.zzv = (float) d;
                        break;
                }
        }
    }

    protected final void zzj(int i, long j) throws zzat {
        boolean z;
        if (i == 240) {
            if (this.zzF) {
                return;
            }
            zzr(i);
            if (this.zzN == -1) {
                this.zzN = j;
                return;
            }
            return;
        }
        if (i == 241) {
            if (this.zzF) {
                return;
            }
            zzr(i);
            if (this.zzM == -1) {
                this.zzM = j;
                return;
            }
            return;
        }
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 35);
            sb.append("ContentEncodingOrder ");
            sb.append(j);
            sb.append(" not supported");
            throw zzat.zzb(sb.toString(), null);
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(j).length() + 35);
            sb2.append("ContentEncodingScope ");
            sb2.append(j);
            sb2.append(" not supported");
            throw zzat.zzb(sb2.toString(), null);
        }
        switch (i) {
            case MRAID_JS_WRITE_FAILED_VALUE:
                int i2 = (int) j;
                if (i2 == 1) {
                    zzq(i);
                    this.zzE.zze = 2;
                    return;
                }
                if (i2 == 2) {
                    zzq(i);
                    this.zzE.zze = 1;
                    return;
                } else if (i2 == 17) {
                    zzq(i);
                    this.zzE.zze = 3;
                    return;
                } else if (i2 != 33) {
                    zzq(i);
                    this.zzE.zze = -1;
                    return;
                } else {
                    zzq(i);
                    this.zzE.zze = 5;
                    return;
                }
            case PRIVACY_URL_ERROR_VALUE:
                z = j == 1;
                zzq(i);
                this.zzE.zzX = z;
                return;
            case 155:
                this.zzW = zzz(j);
                return;
            case 159:
                zzq(i);
                this.zzE.zzP = (int) j;
                return;
            case 176:
                zzq(i);
                this.zzE.zzm = (int) j;
                return;
            case 179:
                if (this.zzF) {
                    return;
                }
                zzr(i);
                this.zzK = zzz(j);
                return;
            case 186:
                zzq(i);
                this.zzE.zzn = (int) j;
                return;
            case AD_RESPONSE_EMPTY_VALUE:
                zzq(i);
                this.zzE.zzd = (int) j;
                return;
            case 231:
                this.zzS = zzz(j);
                return;
            case 238:
                this.zzad = (int) j;
                return;
            case 247:
                if (this.zzF) {
                    return;
                }
                zzr(i);
                this.zzL = (int) j;
                return;
            case 251:
                this.zzae = true;
                return;
            case 16871:
                zzq(i);
                this.zzE.zzd((int) j);
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                StringBuilder sb3 = new StringBuilder(String.valueOf(j).length() + 30);
                sb3.append("ContentCompAlgo ");
                sb3.append(j);
                sb3.append(" not supported");
                throw zzat.zzb(sb3.toString(), null);
            case 17029:
                if (j < 1 || j > 2) {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(j).length() + 33);
                    sb4.append("DocTypeReadVersion ");
                    sb4.append(j);
                    sb4.append(" not supported");
                    throw zzat.zzb(sb4.toString(), null);
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                StringBuilder sb5 = new StringBuilder(String.valueOf(j).length() + 30);
                sb5.append("EBMLReadVersion ");
                sb5.append(j);
                sb5.append(" not supported");
                throw zzat.zzb(sb5.toString(), null);
            case 18401:
                if (j == 5) {
                    return;
                }
                StringBuilder sb6 = new StringBuilder(String.valueOf(j).length() + 29);
                sb6.append("ContentEncAlgo ");
                sb6.append(j);
                sb6.append(" not supported");
                throw zzat.zzb(sb6.toString(), null);
            case 18408:
                if (j == 1) {
                    return;
                }
                StringBuilder sb7 = new StringBuilder(String.valueOf(j).length() + 36);
                sb7.append("AESSettingsCipherMode ");
                sb7.append(j);
                sb7.append(" not supported");
                throw zzat.zzb(sb7.toString(), null);
            case 21420:
                this.zzH = j + this.zzy;
                return;
            case 21432:
                int i3 = (int) j;
                zzq(i);
                if (i3 == 0) {
                    this.zzE.zzx = 0;
                    return;
                }
                if (i3 == 1) {
                    this.zzE.zzx = 2;
                    return;
                } else if (i3 == 3) {
                    this.zzE.zzx = 1;
                    return;
                } else {
                    if (i3 != 15) {
                        return;
                    }
                    this.zzE.zzx = 3;
                    return;
                }
            case 21680:
                zzq(i);
                this.zzE.zzp = (int) j;
                return;
            case 21682:
                zzq(i);
                this.zzE.zzr = (int) j;
                return;
            case 21690:
                zzq(i);
                this.zzE.zzq = (int) j;
                return;
            case 21930:
                z = j == 1;
                zzq(i);
                this.zzE.zzW = z;
                return;
            case 21938:
                zzq(i);
                zzaka zzakaVar = this.zzE;
                zzakaVar.zzy = true;
                zzakaVar.zzo = (int) j;
                return;
            case 21998:
                zzq(i);
                this.zzE.zzg = (int) j;
                return;
            case 22186:
                zzq(i);
                this.zzE.zzS = j;
                return;
            case 22203:
                zzq(i);
                this.zzE.zzT = j;
                return;
            case 25188:
                zzq(i);
                this.zzE.zzQ = (int) j;
                return;
            case 30114:
                this.zzaf = j;
                return;
            case 30321:
                int i4 = (int) j;
                zzq(i);
                if (i4 == 0) {
                    this.zzE.zzs = 0;
                    return;
                }
                if (i4 == 1) {
                    this.zzE.zzs = 1;
                    return;
                } else if (i4 == 2) {
                    this.zzE.zzs = 2;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.zzE.zzs = 3;
                    return;
                }
            case 2352003:
                zzq(i);
                this.zzE.zzf = (int) j;
                return;
            case 2807729:
                this.zzz = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        int i5 = (int) j;
                        zzq(i);
                        if (i5 == 1) {
                            this.zzE.zzB = 2;
                            return;
                        } else {
                            if (i5 != 2) {
                                return;
                            }
                            this.zzE.zzB = 1;
                            return;
                        }
                    case 21946:
                        zzq(i);
                        int zzc2 = zzi.zzc((int) j);
                        if (zzc2 != -1) {
                            this.zzE.zzA = zzc2;
                            return;
                        }
                        return;
                    case 21947:
                        zzq(i);
                        this.zzE.zzy = true;
                        int zzb2 = zzi.zzb((int) j);
                        if (zzb2 != -1) {
                            this.zzE.zzz = zzb2;
                            return;
                        }
                        return;
                    case 21948:
                        zzq(i);
                        this.zzE.zzC = (int) j;
                        return;
                    case 21949:
                        zzq(i);
                        this.zzE.zzD = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x03ae, code lost:
    
        if (r2.equals("V_MPEGH/ISO/HEVC") != false) goto L286;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzi(int i) throws zzat {
        int i2;
        int i3;
        SparseArray sparseArray;
        long j;
        int i4;
        List list;
        int i5;
        int i6;
        SparseArray sparseArray2;
        long zza2;
        long j2;
        long zzb2;
        long zza3;
        zzap zzg2;
        this.zzap.getClass();
        char c = '\b';
        long j3 = 0;
        int i7 = 2;
        int i8 = 0;
        if (i == 160) {
            if (this.zzU == 2) {
                zzaka zzakaVar = (zzaka) this.zzi.get(this.zzaa);
                zzakaVar.zzb();
                if (this.zzaf > 0 && "A_OPUS".equals(zzakaVar.zzc)) {
                    zzes zzesVar = this.zzv;
                    byte[] array = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.zzaf).array();
                    zzesVar.zzb(array, array.length);
                }
                int i9 = 0;
                for (int i10 = 0; i10 < this.zzY; i10++) {
                    i9 += this.zzZ[i10];
                }
                int i11 = 0;
                while (i11 < this.zzY) {
                    long j4 = this.zzV + ((zzakaVar.zzf * i11) / 1000);
                    int i12 = this.zzac;
                    if (i11 == 0) {
                        if (!this.zzae) {
                            i12 |= 1;
                        }
                        i2 = 0;
                    } else {
                        i2 = i11;
                    }
                    int i13 = this.zzZ[i2];
                    int i14 = i9 - i13;
                    zzs(zzakaVar, j4, i12, i13, i14);
                    i11 = i2 + 1;
                    i9 = i14;
                }
                this.zzU = 0;
                return;
            }
            return;
        }
        int i15 = 20;
        if (i == 174) {
            zzaka zzakaVar2 = this.zzE;
            zzakaVar2.getClass();
            String str = zzakaVar2.zzc;
            if (str == null) {
                throw zzat.zzb("CodecId is missing in TrackEntry element", null);
            }
            switch (str.hashCode()) {
                case -2095576542:
                    if (str.equals("V_MPEG4/ISO/AP")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -2095575984:
                    if (str.equals("V_MPEG4/ISO/SP")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -1985379776:
                    if (str.equals("A_MS/ACM")) {
                        c = 23;
                        break;
                    }
                    c = 65535;
                    break;
                case -1784763192:
                    if (str.equals("A_TRUEHD")) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case -1730367663:
                    if (str.equals("A_VORBIS")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case -1482641358:
                    if (str.equals("A_MPEG/L2")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case -1482641357:
                    if (str.equals("A_MPEG/L3")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case -1373388978:
                    if (str.equals("V_MS/VFW/FOURCC")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case -933872740:
                    if (str.equals("S_DVBSUB")) {
                        c = '!';
                        break;
                    }
                    c = 65535;
                    break;
                case -538363189:
                    if (str.equals("V_MPEG4/ISO/ASP")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -538363109:
                    if (str.equals("V_MPEG4/ISO/AVC")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -425012669:
                    if (str.equals("S_VOBSUB")) {
                        c = 31;
                        break;
                    }
                    c = 65535;
                    break;
                case -356037306:
                    if (str.equals("A_DTS/LOSSLESS")) {
                        c = 21;
                        break;
                    }
                    c = 65535;
                    break;
                case 62923557:
                    if (str.equals("A_AAC")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 62923603:
                    if (str.equals("A_AC3")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case 62927045:
                    if (str.equals("A_DTS")) {
                        c = 19;
                        break;
                    }
                    c = 65535;
                    break;
                case 82318131:
                    if (str.equals("V_AV1")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 82338133:
                    if (str.equals("V_VP8")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 82338134:
                    if (str.equals("V_VP9")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 99146302:
                    if (str.equals("S_HDMV/PGS")) {
                        c = ' ';
                        break;
                    }
                    c = 65535;
                    break;
                case 444813526:
                    if (str.equals("V_THEORA")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 542569478:
                    if (str.equals("A_DTS/EXPRESS")) {
                        c = 20;
                        break;
                    }
                    c = 65535;
                    break;
                case 635596514:
                    if (str.equals("A_PCM/FLOAT/IEEE")) {
                        c = 26;
                        break;
                    }
                    c = 65535;
                    break;
                case 725948237:
                    if (str.equals("A_PCM/INT/BIG")) {
                        c = 25;
                        break;
                    }
                    c = 65535;
                    break;
                case 725957860:
                    if (str.equals("A_PCM/INT/LIT")) {
                        c = 24;
                        break;
                    }
                    c = 65535;
                    break;
                case 738597099:
                    if (str.equals("S_TEXT/ASS")) {
                        c = 28;
                        break;
                    }
                    c = 65535;
                    break;
                case 738614379:
                    if (str.equals("S_TEXT/SSA")) {
                        c = 29;
                        break;
                    }
                    c = 65535;
                    break;
                case 855502857:
                    break;
                case 1045209816:
                    if (str.equals("S_TEXT/WEBVTT")) {
                        c = 30;
                        break;
                    }
                    c = 65535;
                    break;
                case 1422270023:
                    if (str.equals("S_TEXT/UTF8")) {
                        c = 27;
                        break;
                    }
                    c = 65535;
                    break;
                case 1809237540:
                    if (str.equals("V_MPEG2")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1950749482:
                    if (str.equals("A_EAC3")) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case 1950789798:
                    if (str.equals("A_FLAC")) {
                        c = 22;
                        break;
                    }
                    c = 65535;
                    break;
                case 1951062397:
                    if (str.equals("A_OPUS")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case '\b':
                case '\t':
                case '\n':
                case 11:
                case '\f':
                case '\r':
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case ' ':
                case '!':
                    zzakaVar2.zza(zzakaVar2.zzd);
                    zzakaVar2.zzY = this.zzap.zzu(zzakaVar2.zzd, zzakaVar2.zze);
                    this.zzi.put(zzakaVar2.zzd, zzakaVar2);
                    break;
            }
            this.zzE = null;
            return;
        }
        if (i == 183) {
            if (this.zzF) {
                return;
            }
            zzr(i);
            if (this.zzK == C.TIME_UNSET || (i3 = this.zzL) == -1 || this.zzM == -1) {
                return;
            }
            SparseArray sparseArray3 = this.zzI;
            List list2 = (List) sparseArray3.get(i3);
            if (list2 == null) {
                list2 = new ArrayList();
                sparseArray3.put(this.zzL, list2);
            }
            list2.add(new zzajy(this.zzK, this.zzy + this.zzM, this.zzN, null));
            return;
        }
        if (i == 19899) {
            int i16 = this.zzG;
            if (i16 != -1) {
                long j5 = this.zzH;
                if (j5 != -1) {
                    if (i16 == 475249515) {
                        this.zzQ = j5;
                        return;
                    }
                    return;
                }
            }
            throw zzat.zzb("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i == 25152) {
            zzq(i);
            zzaka zzakaVar3 = this.zzE;
            if (zzakaVar3.zzh) {
                if (zzakaVar3.zzj == null) {
                    throw zzat.zzb("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                zzakaVar3.zzl = new zzq(null, new zzp(zzg.zza, null, "video/webm", this.zzE.zzj.zzb));
                return;
            }
            return;
        }
        if (i == 28032) {
            zzq(i);
            zzaka zzakaVar4 = this.zzE;
            if (zzakaVar4.zzh && zzakaVar4.zzi != null) {
                throw zzat.zzb("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i == 357149030) {
            if (this.zzz == C.TIME_UNSET) {
                this.zzz = 1000000L;
            }
            long j6 = this.zzA;
            if (j6 != C.TIME_UNSET) {
                this.zzB = zzz(j6);
                return;
            }
            return;
        }
        if (i == 374648427) {
            SparseArray sparseArray4 = this.zzi;
            if (sparseArray4.size() == 0) {
                throw zzat.zzb("No valid tracks were found", null);
            }
            boolean z = !this.zzj || this.zzQ == -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            for (int i21 = 0; i21 < sparseArray4.size(); i21++) {
                zzaka zzakaVar5 = (zzaka) sparseArray4.valueAt(i21);
                int i22 = zzakaVar5.zze;
                if (i22 == 2) {
                    if (zzakaVar5.zzX) {
                        i17 = zzakaVar5.zzd;
                    }
                    if (i18 == -1) {
                        i18 = zzakaVar5.zzd;
                    }
                } else if (i22 == 1) {
                    if (zzakaVar5.zzX) {
                        i19 = zzakaVar5.zzd;
                    }
                    if (i20 == -1) {
                        i20 = zzakaVar5.zzd;
                    }
                }
                if (z) {
                    zzakaVar5.zzb();
                    if (!zzakaVar5.zzV) {
                        zzahb zzahbVar = zzakaVar5.zzY;
                        zzv zzvVar = zzakaVar5.zzZ;
                        zzvVar.getClass();
                        zzahbVar.zzA(zzvVar);
                    }
                }
            }
            if (i17 != -1) {
                this.zzO = i17;
            } else if (i18 != -1) {
                this.zzO = i18;
            } else if (i19 != -1) {
                this.zzO = i19;
            } else if (i20 != -1) {
                this.zzO = i20;
            } else {
                this.zzO = sparseArray4.size() > 0 ? ((zzaka) sparseArray4.valueAt(0)).zzd : -1;
            }
            if (z) {
                zzB();
                return;
            }
            return;
        }
        if (i != 475249515 || this.zzF) {
            return;
        }
        int i23 = 0;
        while (true) {
            sparseArray = this.zzI;
            if (i23 >= sparseArray.size()) {
                break;
            }
            if (((List) sparseArray.valueAt(i23)).isEmpty()) {
                i23++;
            } else if (this.zzB != C.TIME_UNSET) {
                for (int i24 = 0; i24 < sparseArray.size(); i24++) {
                    Collections.sort((List) sparseArray.valueAt(i24));
                }
                j = -9223372036854775807L;
                i4 = -1;
                this.zzap.zzw(new zzajz(sparseArray, this.zzB, this.zzO, this.zzy, this.zzx));
            }
        }
        j = -9223372036854775807L;
        i4 = -1;
        this.zzap.zzw(new zzagr(this.zzB, 0L));
        this.zzF = true;
        this.zzJ = false;
        int i25 = 0;
        while (true) {
            SparseArray sparseArray5 = this.zzi;
            if (i25 >= sparseArray5.size()) {
                zzB();
                return;
            }
            zzaka zzakaVar6 = (zzaka) sparseArray5.valueAt(i25);
            long j7 = this.zzB;
            long j8 = this.zzy;
            long j9 = j3;
            long j10 = this.zzx;
            if (zzakaVar6.zze != i7 || (list = (List) sparseArray.get(zzakaVar6.zzd)) == null || list.isEmpty()) {
                i6 = i25;
                sparseArray2 = sparseArray;
                i5 = i8;
            } else {
                if (list.isEmpty()) {
                    i6 = i25;
                    sparseArray2 = sparseArray;
                    i5 = i8;
                } else {
                    int min = Math.min(list.size(), i15);
                    double d = 0.0d;
                    i5 = i8;
                    int i26 = i4;
                    while (i8 < min) {
                        zzajy zzajyVar = (zzajy) list.get(i8);
                        if (zzajyVar.zza() > 10000000) {
                            break;
                        }
                        int i27 = i8 + 1;
                        if (i8 < list.size() - 1) {
                            zzajy zzajyVar2 = (zzajy) list.get(i27);
                            j2 = zzajyVar2.zzb() + zzajyVar2.zzc();
                            zzb2 = zzajyVar.zzb() + zzajyVar.zzc();
                            zza3 = zzajyVar2.zza() - zzajyVar.zza();
                        } else {
                            j2 = j8 + j10;
                            zzb2 = zzajyVar.zzb() + zzajyVar.zzc();
                            zza3 = j7 - zzajyVar.zza();
                        }
                        long j11 = j2 - zzb2;
                        int i28 = i25;
                        SparseArray sparseArray6 = sparseArray;
                        long j12 = j10;
                        long j13 = zza3;
                        if (j13 > j9) {
                            double d2 = j11 / j13;
                            if (d2 > d) {
                                d = d2;
                                i26 = i8;
                            }
                        }
                        i8 = i27;
                        sparseArray = sparseArray6;
                        i25 = i28;
                        j10 = j12;
                    }
                    i6 = i25;
                    sparseArray2 = sparseArray;
                    if (i26 != i4) {
                        zza2 = ((zzajy) list.get(i26)).zza();
                        if (zza2 != j) {
                            zzv zzvVar2 = zzakaVar6.zzZ;
                            zzvVar2.getClass();
                            zzap zzapVar = zzvVar2.zzl;
                            zzais zzaisVar = new zzais(zza2);
                            if (zzapVar == null) {
                                zzao[] zzaoVarArr = new zzao[1];
                                zzaoVarArr[i5] = zzaisVar;
                                zzg2 = new zzap(j, zzaoVarArr);
                            } else {
                                zzao[] zzaoVarArr2 = new zzao[1];
                                zzaoVarArr2[i5] = zzaisVar;
                                zzg2 = zzapVar.zzg(zzaoVarArr2);
                            }
                            zzt zza4 = zzakaVar6.zzZ.zza();
                            zza4.zzl(zzg2);
                            zzakaVar6.zzZ = zza4.zzO();
                        }
                    }
                }
                zza2 = j;
                if (zza2 != j) {
                }
            }
            if (!zzakaVar6.zzV) {
                zzakaVar6.zzb();
                zzahb zzahbVar2 = zzakaVar6.zzY;
                zzv zzvVar3 = zzakaVar6.zzZ;
                zzvVar3.getClass();
                zzahbVar2.zzA(zzvVar3);
            }
            i25 = i6 + 1;
            sparseArray = sparseArray2;
            j3 = j9;
            i8 = i5;
            i7 = 2;
            i15 = 20;
            j = C.TIME_UNSET;
            i4 = -1;
        }
    }
}
