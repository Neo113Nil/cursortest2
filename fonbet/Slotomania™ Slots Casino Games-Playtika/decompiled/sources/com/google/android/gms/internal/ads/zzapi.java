package com.google.android.gms.internal.ads;

import androidx.core.view.MotionEventCompat;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
public final class zzapi implements zzapm {
    private static final byte[] zza = {73, 68, 51};
    private final boolean zzb;
    private final String zze;
    private final int zzf;
    private final String zzg;
    private String zzh;
    private zzahb zzi;
    private zzahb zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private int zzr;
    private boolean zzs;
    private int zzu;
    private zzahb zzw;
    private long zzx;
    private final zzer zzc = new zzer(new byte[7], 7);
    private final zzes zzd = new zzes(Arrays.copyOf(zza, 10));
    private int zzp = -1;
    private int zzq = -1;
    private long zzt = C.TIME_UNSET;
    private long zzv = C.TIME_UNSET;

    public zzapi(boolean z, String str, int i, String str2) {
        this.zzb = z;
        this.zze = str;
        this.zzf = i;
        this.zzg = str2;
        zzi();
    }

    public static boolean zzf(int i) {
        return (i & 65526) == 65520;
    }

    private final void zzg() {
        this.zzo = false;
        zzi();
    }

    private final boolean zzh(zzes zzesVar, byte[] bArr, int i) {
        int min = Math.min(zzesVar.zzd(), i - this.zzl);
        zzesVar.zzm(bArr, this.zzl, min);
        int i2 = this.zzl + min;
        this.zzl = i2;
        return i2 == i;
    }

    private final void zzi() {
        this.zzk = 0;
        this.zzl = 0;
        this.zzm = 256;
    }

    private final void zzj(zzahb zzahbVar, long j, int i, int i2) {
        this.zzk = 4;
        this.zzl = i;
        this.zzw = zzahbVar;
        this.zzx = j;
        this.zzu = i2;
    }

    private final void zzk() {
        this.zzk = 3;
        this.zzl = 0;
    }

    private static final boolean zzl(byte b, byte b2) {
        return zzf((b2 & 255) | MotionEventCompat.ACTION_POINTER_INDEX_MASK);
    }

    private static final boolean zzm(zzes zzesVar, byte[] bArr, int i) {
        if (zzesVar.zzd() < i) {
            return false;
        }
        zzesVar.zzm(bArr, 0, i);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zza() {
        this.zzv = C.TIME_UNSET;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzb(zzafs zzafsVar, zzara zzaraVar) {
        zzaraVar.zza();
        this.zzh = zzaraVar.zzc();
        zzahb zzu = zzafsVar.zzu(zzaraVar.zzb(), 1);
        this.zzi = zzu;
        this.zzw = zzu;
        if (!this.zzb) {
            this.zzj = new zzafm();
            return;
        }
        zzaraVar.zza();
        zzahb zzu2 = zzafsVar.zzu(zzaraVar.zzb(), 5);
        this.zzj = zzu2;
        zzt zztVar = new zzt();
        zztVar.zza(zzaraVar.zzc());
        zztVar.zzn(this.zzg);
        zztVar.zzo(MimeTypes.APPLICATION_ID3);
        zzu2.zzA(zztVar.zzO());
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzc(long j, int i) {
        this.zzv = j;
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzd(zzes zzesVar) throws zzat {
        int i;
        byte b;
        char c;
        int i2;
        int i3;
        boolean z;
        int i4;
        this.zzi.getClass();
        String str = zzfk.zza;
        while (zzesVar.zzd() > 0) {
            int i5 = this.zzk;
            char c2 = 7;
            int i6 = 3;
            int i7 = 2;
            if (i5 == 0) {
                byte[] zzi = zzesVar.zzi();
                int zzg = zzesVar.zzg();
                int zze = zzesVar.zze();
                while (true) {
                    if (zzg >= zze) {
                        zzesVar.zzh(zzg);
                        break;
                    }
                    i = zzg + 1;
                    b = zzi[zzg];
                    int i8 = b & 255;
                    int i9 = i6;
                    if (this.zzm != 512 || !zzl((byte) -1, (byte) i8)) {
                        c = c2;
                    } else {
                        if (this.zzo) {
                            break;
                        }
                        int i10 = zzg - 1;
                        zzesVar.zzh(zzg);
                        zzer zzerVar = this.zzc;
                        if (zzm(zzesVar, zzerVar.zza, 1)) {
                            zzerVar.zzf(4);
                            int zzj = zzerVar.zzj(1);
                            int i11 = this.zzp;
                            if (i11 == -1 || zzj == i11) {
                                if (this.zzq != -1) {
                                    if (!zzm(zzesVar, zzerVar.zza, 1)) {
                                        break;
                                    }
                                    zzerVar.zzf(i7);
                                    if (zzerVar.zzj(4) == this.zzq) {
                                        zzesVar.zzh(zzg + 1);
                                    }
                                }
                                if (!zzm(zzesVar, zzerVar.zza, 4)) {
                                    break;
                                }
                                zzerVar.zzf(14);
                                int zzj2 = zzerVar.zzj(13);
                                c = 7;
                                if (zzj2 >= 7) {
                                    byte[] zzi2 = zzesVar.zzi();
                                    int zze2 = zzesVar.zze();
                                    int i12 = i10 + zzj2;
                                    if (i12 < zze2) {
                                        byte b2 = zzi2[i12];
                                        if (b2 != -1) {
                                            if (b2 == 73) {
                                                int i13 = i12 + 1;
                                                if (i13 == zze2) {
                                                    break;
                                                }
                                                if (zzi2[i13] == 68) {
                                                    int i14 = i12 + 2;
                                                    if (i14 == zze2) {
                                                        break;
                                                    } else if (zzi2[i14] == 51) {
                                                        break;
                                                    }
                                                }
                                            }
                                        } else {
                                            int i15 = i12 + 1;
                                            if (i15 == zze2) {
                                                break;
                                            }
                                            byte b3 = zzi2[i15];
                                            if (zzl((byte) -1, b3) && ((b3 & 8) >> 3) == zzj) {
                                                break;
                                            }
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                        }
                        c = 7;
                    }
                    int i16 = this.zzm;
                    int i17 = i16 | i8;
                    if (i17 == 329) {
                        i2 = i9;
                        i3 = 2;
                        z = false;
                        i4 = 768;
                    } else if (i17 == 511) {
                        i2 = i9;
                        i3 = 2;
                        z = false;
                        i4 = 512;
                    } else if (i17 == 836) {
                        i2 = i9;
                        i3 = 2;
                        z = false;
                        i4 = 1024;
                    } else {
                        if (i17 == 1075) {
                            this.zzk = 2;
                            this.zzl = i9;
                            this.zzu = 0;
                            this.zzd.zzh(0);
                            zzesVar.zzh(i);
                            break;
                        }
                        if (i16 != 256) {
                            this.zzm = 256;
                            c2 = c;
                            i6 = i9;
                            i7 = 2;
                        } else {
                            i2 = i9;
                            i3 = 2;
                            z = false;
                            zzg = i;
                            i6 = i2;
                            c2 = c;
                            i7 = i3;
                        }
                    }
                    this.zzm = i4;
                    zzg = i;
                    i6 = i2;
                    c2 = c;
                    i7 = i3;
                }
                this.zzr = (b & 8) >> 3;
                this.zzn = 1 == ((b & 1) ^ 1);
                if (this.zzo) {
                    zzk();
                } else {
                    this.zzk = 1;
                    this.zzl = 0;
                }
                zzesVar.zzh(i);
            } else if (i5 != 1) {
                if (i5 == 2) {
                    zzes zzesVar2 = this.zzd;
                    if (zzh(zzesVar, zzesVar2.zzi(), 10)) {
                        this.zzj.zzc(zzesVar2, 10);
                        zzesVar2.zzh(6);
                        zzj(this.zzj, 0L, 10, zzesVar2.zzG() + 10);
                    }
                } else if (i5 != 3) {
                    int min = Math.min(zzesVar.zzd(), this.zzu - this.zzl);
                    this.zzw.zzc(zzesVar, min);
                    int i18 = this.zzl + min;
                    this.zzl = i18;
                    if (i18 == this.zzu) {
                        zzgsw.zzi(this.zzv != C.TIME_UNSET);
                        this.zzw.zze(this.zzv, 1, this.zzu, 0, null);
                        this.zzv += this.zzx;
                        zzi();
                    }
                } else {
                    int i19 = true != this.zzn ? 5 : 7;
                    zzer zzerVar2 = this.zzc;
                    if (zzh(zzesVar, zzerVar2.zza, i19)) {
                        zzerVar2.zzf(0);
                        if (this.zzs) {
                            zzerVar2.zzh(10);
                        } else {
                            int zzj3 = zzerVar2.zzj(2) + 1;
                            if (zzj3 != 2) {
                                StringBuilder sb = new StringBuilder(String.valueOf(zzj3).length() + 50);
                                sb.append("Detected audio object type: ");
                                sb.append(zzj3);
                                sb.append(", but assuming AAC LC.");
                                zzef.zzc("AdtsReader", sb.toString());
                            }
                            zzerVar2.zzh(5);
                            int zzj4 = zzerVar2.zzj(3);
                            int i20 = this.zzq;
                            int i21 = zzaeo.zza;
                            byte[] bArr = {(byte) (((i20 >> 1) & 7) | 16), (byte) (((zzj4 << 3) & 120) | ((i20 << 7) & 128))};
                            zzaen zza2 = zzaeo.zza(bArr);
                            zzt zztVar = new zzt();
                            zztVar.zza(this.zzh);
                            zztVar.zzn(this.zzg);
                            zztVar.zzo(MimeTypes.AUDIO_AAC);
                            zztVar.zzk(zza2.zzc);
                            zztVar.zzG(zza2.zzb);
                            zztVar.zzH(zza2.zza);
                            zztVar.zzr(Collections.singletonList(bArr));
                            zztVar.zze(this.zze);
                            zztVar.zzg(this.zzf);
                            zzv zzO = zztVar.zzO();
                            this.zzt = 1024000000 / zzO.zzI;
                            this.zzi.zzA(zzO);
                            this.zzs = true;
                        }
                        zzerVar2.zzh(4);
                        int zzj5 = zzerVar2.zzj(13);
                        int i22 = zzj5 - 7;
                        if (this.zzn) {
                            i22 = zzj5 - 9;
                        }
                        zzj(this.zzi, this.zzt, 0, i22);
                    }
                }
            } else if (zzesVar.zzd() != 0) {
                zzer zzerVar3 = this.zzc;
                zzerVar3.zza[0] = zzesVar.zzi()[zzesVar.zzg()];
                zzerVar3.zzf(2);
                int zzj6 = zzerVar3.zzj(4);
                int i23 = this.zzq;
                if (i23 == -1 || zzj6 == i23) {
                    if (!this.zzo) {
                        this.zzo = true;
                        this.zzp = this.zzr;
                        this.zzq = zzj6;
                    }
                    zzk();
                } else {
                    zzg();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zze(boolean z) {
    }
}
