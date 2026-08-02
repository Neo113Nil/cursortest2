package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
public final class zzapo implements zzapm {
    private static final double[] zzc = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String zza;
    private zzahb zzb;
    private final zzare zzd;
    private final String zze;
    private final zzes zzf;
    private final zzaqd zzg;
    private final boolean[] zzh = new boolean[4];
    private final zzapn zzi = new zzapn(128);
    private long zzj;
    private boolean zzk;
    private boolean zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private boolean zzq;
    private boolean zzr;

    zzapo(zzare zzareVar, String str) {
        zzes zzesVar;
        this.zzd = zzareVar;
        this.zze = str;
        if (zzareVar != null) {
            this.zzg = new zzaqd(178, 128);
            zzesVar = new zzes();
        } else {
            zzesVar = null;
            this.zzg = null;
        }
        this.zzf = zzesVar;
        this.zzn = C.TIME_UNSET;
        this.zzp = C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zza() {
        zzgo.zzj(this.zzh);
        this.zzi.zza();
        zzaqd zzaqdVar = this.zzg;
        if (zzaqdVar != null) {
            zzaqdVar.zza();
        }
        this.zzj = 0L;
        this.zzk = false;
        this.zzn = C.TIME_UNSET;
        this.zzp = C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzb(zzafs zzafsVar, zzara zzaraVar) {
        zzaraVar.zza();
        this.zza = zzaraVar.zzc();
        this.zzb = zzafsVar.zzu(zzaraVar.zzb(), 2);
        zzare zzareVar = this.zzd;
        if (zzareVar != null) {
            zzareVar.zza(zzafsVar, zzaraVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzc(long j, int i) {
        this.zzn = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01cf  */
    @Override // com.google.android.gms.internal.ads.zzapm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(zzes zzesVar) {
        int i;
        zzaqd zzaqdVar;
        int i2;
        long j;
        long j2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int i5;
        float f;
        int i6;
        long j3;
        byte b;
        int i7;
        this.zzb.getClass();
        int zzg = zzesVar.zzg();
        int zze = zzesVar.zze();
        byte[] zzi = zzesVar.zzi();
        this.zzj += zzesVar.zzd();
        this.zzb.zzc(zzesVar, zzesVar.zzd());
        while (true) {
            int zzi2 = zzgo.zzi(zzi, zzg, zze, this.zzh);
            if (zzi2 == zze) {
                break;
            }
            int i8 = zzi2 + 3;
            int i9 = zzesVar.zzi()[i8] & 255;
            int i10 = zzi2 - zzg;
            if (!this.zzl) {
                if (i10 > 0) {
                    this.zzi.zzc(zzi, zzg, zzi2);
                }
                int i11 = i10 < 0 ? -i10 : 0;
                zzapn zzapnVar = this.zzi;
                if (zzapnVar.zzb(i9, i11)) {
                    String str = this.zza;
                    str.getClass();
                    String str2 = this.zze;
                    byte[] copyOf = Arrays.copyOf(zzapnVar.zzc, zzapnVar.zza);
                    int i12 = copyOf[4] & 255;
                    byte b2 = copyOf[5];
                    i = zze;
                    int i13 = copyOf[6] & 255;
                    int i14 = (i12 << 4) | ((b2 & 255) >> 4);
                    int i15 = (copyOf[7] & 240) >> 4;
                    int i16 = ((b2 & Ascii.SI) << 8) | i13;
                    if (i15 == 2) {
                        i4 = i16 * 4;
                        i5 = i14 * 3;
                    } else if (i15 == 3) {
                        i4 = i16 * 16;
                        i5 = i14 * 9;
                    } else if (i15 != 4) {
                        f = 1.0f;
                        zzt zztVar = new zzt();
                        zztVar.zza(str);
                        zztVar.zzn(str2);
                        zztVar.zzo(MimeTypes.VIDEO_MPEG2);
                        zztVar.zzv(i14);
                        zztVar.zzw(i16);
                        zztVar.zzB(f);
                        zztVar.zzr(Collections.singletonList(copyOf));
                        zzv zzO = zztVar.zzO();
                        i6 = (copyOf[7] & Ascii.SI) - 1;
                        j3 = 0;
                        if (i6 >= 0 && i6 < 8) {
                            double d = zzc[i6];
                            b = copyOf[zzapnVar.zzb + 9];
                            i7 = (b & 96) >> 5;
                            if (i7 != (b & Ascii.US)) {
                                d *= (i7 + 1.0d) / (r11 + 1);
                            }
                            j3 = (long) (1000000.0d / d);
                        }
                        Pair create = Pair.create(zzO, Long.valueOf(j3));
                        this.zzb.zzA((zzv) create.first);
                        this.zzm = ((Long) create.second).longValue();
                        this.zzl = true;
                        zzaqdVar = this.zzg;
                        if (zzaqdVar != null) {
                            if (i10 > 0) {
                                zzaqdVar.zzd(zzi, zzg, zzi2);
                                i3 = 0;
                            } else {
                                i3 = -i10;
                            }
                            if (zzaqdVar.zze(i3)) {
                                int zza = zzgo.zza(zzaqdVar.zza, zzaqdVar.zzb);
                                zzes zzesVar2 = this.zzf;
                                String str3 = zzfk.zza;
                                zzesVar2.zzb(zzaqdVar.zza, zza);
                                this.zzd.zzb(this.zzp, zzesVar2);
                            }
                            if (i9 == 178) {
                                if (zzesVar.zzi()[zzi2 + 2] == 1) {
                                    zzaqdVar.zzc(178);
                                }
                                i9 = 178;
                            }
                        }
                        if (i9 != 0 || i9 == 179) {
                            i2 = i - zzi2;
                            if (this.zzr || !this.zzl) {
                                j = -9223372036854775807L;
                            } else {
                                j = -9223372036854775807L;
                                long j4 = this.zzp;
                                if (j4 != C.TIME_UNSET) {
                                    boolean z3 = this.zzq;
                                    int i17 = ((int) (this.zzj - this.zzo)) - i2;
                                    zzahb zzahbVar = this.zzb;
                                    j = C.TIME_UNSET;
                                    zzahbVar.zze(j4, z3 ? 1 : 0, i17, i2, null);
                                }
                            }
                            if (this.zzk || this.zzr) {
                                this.zzo = this.zzj - i2;
                                j2 = this.zzn;
                                if (j2 == j) {
                                    long j5 = this.zzp;
                                    j2 = j5 != j ? j5 + this.zzm : j;
                                }
                                this.zzp = j2;
                                z = false;
                                this.zzq = false;
                                this.zzn = j;
                                z2 = true;
                                this.zzk = true;
                            } else {
                                z2 = true;
                                z = false;
                            }
                            this.zzr = i9 == 0 ? z2 : z;
                        } else if (i9 == 184) {
                            this.zzq = true;
                        }
                        zzg = i8;
                        zze = i;
                    } else {
                        i4 = i16 * Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
                        i5 = i14 * 100;
                    }
                    f = i4 / i5;
                    zzt zztVar2 = new zzt();
                    zztVar2.zza(str);
                    zztVar2.zzn(str2);
                    zztVar2.zzo(MimeTypes.VIDEO_MPEG2);
                    zztVar2.zzv(i14);
                    zztVar2.zzw(i16);
                    zztVar2.zzB(f);
                    zztVar2.zzr(Collections.singletonList(copyOf));
                    zzv zzO2 = zztVar2.zzO();
                    i6 = (copyOf[7] & Ascii.SI) - 1;
                    j3 = 0;
                    if (i6 >= 0) {
                        double d2 = zzc[i6];
                        b = copyOf[zzapnVar.zzb + 9];
                        i7 = (b & 96) >> 5;
                        if (i7 != (b & Ascii.US)) {
                        }
                        j3 = (long) (1000000.0d / d2);
                    }
                    Pair create2 = Pair.create(zzO2, Long.valueOf(j3));
                    this.zzb.zzA((zzv) create2.first);
                    this.zzm = ((Long) create2.second).longValue();
                    this.zzl = true;
                    zzaqdVar = this.zzg;
                    if (zzaqdVar != null) {
                    }
                    if (i9 != 0) {
                    }
                    i2 = i - zzi2;
                    if (this.zzr) {
                    }
                    j = -9223372036854775807L;
                    if (this.zzk) {
                    }
                    this.zzo = this.zzj - i2;
                    j2 = this.zzn;
                    if (j2 == j) {
                    }
                    this.zzp = j2;
                    z = false;
                    this.zzq = false;
                    this.zzn = j;
                    z2 = true;
                    this.zzk = true;
                    this.zzr = i9 == 0 ? z2 : z;
                    zzg = i8;
                    zze = i;
                }
            }
            i = zze;
            zzaqdVar = this.zzg;
            if (zzaqdVar != null) {
            }
            if (i9 != 0) {
            }
            i2 = i - zzi2;
            if (this.zzr) {
            }
            j = -9223372036854775807L;
            if (this.zzk) {
            }
            this.zzo = this.zzj - i2;
            j2 = this.zzn;
            if (j2 == j) {
            }
            this.zzp = j2;
            z = false;
            this.zzq = false;
            this.zzn = j;
            z2 = true;
            this.zzk = true;
            this.zzr = i9 == 0 ? z2 : z;
            zzg = i8;
            zze = i;
        }
        if (!this.zzl) {
            this.zzi.zzc(zzi, zzg, zze);
        }
        zzaqd zzaqdVar2 = this.zzg;
        if (zzaqdVar2 != null) {
            zzaqdVar2.zzd(zzi, zzg, zze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zze(boolean z) {
        zzahb zzahbVar = this.zzb;
        zzahbVar.getClass();
        if (z) {
            boolean z2 = this.zzq;
            long j = this.zzj - this.zzo;
            zzahbVar.zze(this.zzp, z2 ? 1 : 0, (int) j, 0, null);
        }
    }
}
