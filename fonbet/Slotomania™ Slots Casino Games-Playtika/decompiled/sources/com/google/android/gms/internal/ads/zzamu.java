package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes3.dex */
final class zzamu extends zzams {
    private zzamt zza;
    private int zzb;
    private boolean zzc;
    private zzahg zzd;
    private zzahe zze;

    zzamu() {
    }

    @Override // com.google.android.gms.internal.ads.zzams
    protected final void zza(boolean z) {
        super.zza(z);
        if (z) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzams
    protected final long zzb(zzes zzesVar) {
        if ((zzesVar.zzi()[0] & 1) == 1) {
            return -1L;
        }
        byte b = zzesVar.zzi()[0];
        zzamt zzamtVar = this.zza;
        zzamtVar.getClass();
        int i = !zzamtVar.zzd[(b >> 1) & (255 >>> (8 - zzamtVar.zze))].zza ? zzamtVar.zza.zze : zzamtVar.zza.zzf;
        int i2 = this.zzc ? (this.zzb + i) / 4 : 0;
        if (zzesVar.zzj() < zzesVar.zze() + 4) {
            byte[] copyOf = Arrays.copyOf(zzesVar.zzi(), zzesVar.zze() + 4);
            zzesVar.zzb(copyOf, copyOf.length);
        } else {
            zzesVar.zzf(zzesVar.zze() + 4);
        }
        long j = i2;
        byte[] zzi = zzesVar.zzi();
        zzi[zzesVar.zze() - 4] = (byte) (j & 255);
        zzi[zzesVar.zze() - 3] = (byte) ((j >>> 8) & 255);
        zzi[zzesVar.zze() - 2] = (byte) ((j >>> 16) & 255);
        zzi[zzesVar.zze() - 1] = (byte) ((j >>> 24) & 255);
        this.zzc = true;
        this.zzb = i;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzams
    protected final void zzj(long j) {
        super.zzj(j);
        this.zzc = j != 0;
        zzahg zzahgVar = this.zzd;
        this.zzb = zzahgVar != null ? zzahgVar.zze : 0;
    }

    @Override // com.google.android.gms.internal.ads.zzams
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected final boolean zzc(zzes zzesVar, long j, zzamq zzamqVar) throws IOException {
        zzamt zzamtVar;
        int i;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        long j2;
        if (this.zza != null) {
            zzamqVar.zza.getClass();
            return false;
        }
        zzahg zzahgVar = this.zzd;
        int i5 = 1;
        if (zzahgVar == null) {
            zzahh.zzd(1, zzesVar, false);
            int zzI = zzesVar.zzI();
            int zzs = zzesVar.zzs();
            int zzI2 = zzesVar.zzI();
            int zzC = zzesVar.zzC();
            int i6 = zzC <= 0 ? -1 : zzC;
            int zzC2 = zzesVar.zzC();
            int i7 = zzC2 <= 0 ? -1 : zzC2;
            int zzC3 = zzesVar.zzC();
            int i8 = zzC3 <= 0 ? -1 : zzC3;
            int zzs2 = zzesVar.zzs();
            this.zzd = new zzahg(zzI, zzs, zzI2, i6, i7, i8, (int) Math.pow(2.0d, zzs2 & 15), (int) Math.pow(2.0d, (zzs2 & PsExtractor.VIDEO_STREAM_MASK) >> 4), 1 == (zzesVar.zzs() & 1), Arrays.copyOf(zzesVar.zzi(), zzesVar.zze()));
        } else {
            int i9 = 4;
            zzahe zzaheVar = this.zze;
            if (zzaheVar == null) {
                this.zze = zzahh.zzb(zzesVar, true, true);
            } else {
                byte[] bArr = new byte[zzesVar.zze()];
                System.arraycopy(zzesVar.zzi(), 0, bArr, 0, zzesVar.zze());
                int i10 = zzahgVar.zza;
                int i11 = 5;
                zzahh.zzd(5, zzesVar, false);
                int zzs3 = zzesVar.zzs() + 1;
                zzahd zzahdVar = new zzahd(zzesVar.zzi());
                zzahdVar.zzc(zzesVar.zzg() * 8);
                int i12 = 0;
                while (true) {
                    int i13 = 2;
                    int i14 = 16;
                    if (i12 >= zzs3) {
                        int i15 = i5;
                        int i16 = 6;
                        int zzb = zzahdVar.zzb(6) + i15;
                        for (int i17 = 0; i17 < zzb; i17++) {
                            if (zzahdVar.zzb(16) != 0) {
                                throw zzat.zzb("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int zzb2 = zzahdVar.zzb(6) + i15;
                        int i18 = 0;
                        while (true) {
                            int i19 = 3;
                            if (i18 < zzb2) {
                                int zzb3 = zzahdVar.zzb(i14);
                                if (zzb3 == 0) {
                                    int i20 = 8;
                                    zzahdVar.zzc(8);
                                    zzahdVar.zzc(16);
                                    zzahdVar.zzc(16);
                                    zzahdVar.zzc(6);
                                    zzahdVar.zzc(8);
                                    int zzb4 = zzahdVar.zzb(4) + 1;
                                    int i21 = 0;
                                    while (i21 < zzb4) {
                                        zzahdVar.zzc(i20);
                                        i21++;
                                        i20 = 8;
                                    }
                                } else {
                                    if (zzb3 != i15) {
                                        StringBuilder sb = new StringBuilder(String.valueOf(zzb3).length() + 41);
                                        sb.append("floor type greater than 1 not decodable: ");
                                        sb.append(zzb3);
                                        throw zzat.zzb(sb.toString(), null);
                                    }
                                    int zzb5 = zzahdVar.zzb(5);
                                    int[] iArr2 = new int[zzb5];
                                    int i22 = -1;
                                    for (int i23 = 0; i23 < zzb5; i23++) {
                                        int zzb6 = zzahdVar.zzb(4);
                                        iArr2[i23] = zzb6;
                                        if (zzb6 > i22) {
                                            i22 = zzb6;
                                        }
                                    }
                                    int i24 = i22 + 1;
                                    int[] iArr3 = new int[i24];
                                    int i25 = 0;
                                    while (i25 < i24) {
                                        int i26 = 1;
                                        iArr3[i25] = zzahdVar.zzb(i19) + 1;
                                        int zzb7 = zzahdVar.zzb(2);
                                        if (zzb7 > 0) {
                                            i3 = 8;
                                            zzahdVar.zzc(8);
                                        } else {
                                            i3 = 8;
                                        }
                                        int i27 = i24;
                                        int i28 = 0;
                                        while (true) {
                                            int i29 = i26 << zzb7;
                                            iArr = iArr2;
                                            if (i28 < i29) {
                                                zzahdVar.zzc(i3);
                                                i28++;
                                                iArr2 = iArr;
                                                i3 = 8;
                                                i26 = 1;
                                            }
                                        }
                                        i25++;
                                        iArr2 = iArr;
                                        i24 = i27;
                                        i19 = 3;
                                    }
                                    int[] iArr4 = iArr2;
                                    zzahdVar.zzc(2);
                                    int zzb8 = zzahdVar.zzb(4);
                                    int i30 = 0;
                                    int i31 = 0;
                                    for (int i32 = 0; i32 < zzb5; i32++) {
                                        i30 += iArr3[iArr4[i32]];
                                        while (i31 < i30) {
                                            zzahdVar.zzc(zzb8);
                                            i31++;
                                        }
                                    }
                                }
                                i18++;
                                i16 = 6;
                                i14 = 16;
                                i15 = 1;
                            } else {
                                int i33 = 1;
                                int zzb9 = zzahdVar.zzb(i16) + 1;
                                int i34 = 0;
                                while (i34 < zzb9) {
                                    if (zzahdVar.zzb(16) > 2) {
                                        throw zzat.zzb("residueType greater than 2 is not decodable", null);
                                    }
                                    zzahdVar.zzc(24);
                                    zzahdVar.zzc(24);
                                    zzahdVar.zzc(24);
                                    int zzb10 = zzahdVar.zzb(i16) + i33;
                                    int i35 = 8;
                                    zzahdVar.zzc(8);
                                    int[] iArr5 = new int[zzb10];
                                    for (int i36 = 0; i36 < zzb10; i36++) {
                                        iArr5[i36] = ((zzahdVar.zza() ? zzahdVar.zzb(5) : 0) * 8) + zzahdVar.zzb(3);
                                    }
                                    int i37 = 0;
                                    while (i37 < zzb10) {
                                        int i38 = 0;
                                        while (i38 < i35) {
                                            if ((iArr5[i37] & (1 << i38)) != 0) {
                                                zzahdVar.zzc(i35);
                                            }
                                            i38++;
                                            i35 = 8;
                                        }
                                        i37++;
                                        i35 = 8;
                                    }
                                    i34++;
                                    i16 = 6;
                                    i33 = 1;
                                }
                                int zzb11 = zzahdVar.zzb(i16) + 1;
                                for (int i39 = 0; i39 < zzb11; i39++) {
                                    int zzb12 = zzahdVar.zzb(16);
                                    if (zzb12 != 0) {
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(zzb12).length() + 41);
                                        sb2.append("mapping type other than 0 not supported: ");
                                        sb2.append(zzb12);
                                        zzef.zze("VorbisUtil", sb2.toString());
                                    } else {
                                        if (zzahdVar.zza()) {
                                            i = 1;
                                            i2 = zzahdVar.zzb(4) + 1;
                                        } else {
                                            i = 1;
                                            i2 = 1;
                                        }
                                        if (zzahdVar.zza()) {
                                            int zzb13 = zzahdVar.zzb(8) + i;
                                            for (int i40 = 0; i40 < zzb13; i40++) {
                                                int i41 = i10 - 1;
                                                zzahdVar.zzc(zzahh.zza(i41));
                                                zzahdVar.zzc(zzahh.zza(i41));
                                            }
                                        }
                                        if (zzahdVar.zzb(2) != 0) {
                                            throw zzat.zzb("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (i2 > 1) {
                                            for (int i42 = 0; i42 < i10; i42++) {
                                                zzahdVar.zzc(4);
                                            }
                                        }
                                        for (int i43 = 0; i43 < i2; i43++) {
                                            zzahdVar.zzc(8);
                                            zzahdVar.zzc(8);
                                            zzahdVar.zzc(8);
                                        }
                                    }
                                }
                                int zzb14 = zzahdVar.zzb(6);
                                int i44 = zzb14 + 1;
                                zzahf[] zzahfVarArr = new zzahf[i44];
                                for (int i45 = 0; i45 < i44; i45++) {
                                    zzahfVarArr[i45] = new zzahf(zzahdVar.zza(), zzahdVar.zzb(16), zzahdVar.zzb(16), zzahdVar.zzb(8));
                                }
                                if (!zzahdVar.zza()) {
                                    throw zzat.zzb("framing bit after modes not set as expected", null);
                                }
                                zzamtVar = new zzamt(zzahgVar, zzaheVar, bArr, zzahfVarArr, zzahh.zza(zzb14));
                            }
                        }
                    } else {
                        if (zzahdVar.zzb(24) != 5653314) {
                            int zzd = zzahdVar.zzd();
                            StringBuilder sb3 = new StringBuilder(String.valueOf(zzd).length() + 55);
                            sb3.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                            sb3.append(zzd);
                            throw zzat.zzb(sb3.toString(), null);
                        }
                        int zzb15 = zzahdVar.zzb(16);
                        int zzb16 = zzahdVar.zzb(24);
                        if (zzahdVar.zza()) {
                            zzahdVar.zzc(i11);
                            for (int i46 = 0; i46 < zzb16; i46 += zzahdVar.zzb(zzahh.zza(zzb16 - i46))) {
                            }
                        } else {
                            boolean zza = zzahdVar.zza();
                            for (int i47 = 0; i47 < zzb16; i47++) {
                                if (!zza) {
                                    zzahdVar.zzc(i11);
                                } else if (zzahdVar.zza()) {
                                    zzahdVar.zzc(i11);
                                }
                            }
                        }
                        int i48 = i9;
                        int zzb17 = zzahdVar.zzb(i48);
                        if (zzb17 > 2) {
                            StringBuilder sb4 = new StringBuilder(String.valueOf(zzb17).length() + 42);
                            sb4.append("lookup type greater than 2 not decodable: ");
                            sb4.append(zzb17);
                            throw zzat.zzb(sb4.toString(), null);
                        }
                        if (zzb17 == i5) {
                            i13 = zzb17;
                        } else if (zzb17 != 2) {
                            i4 = i5;
                            i12++;
                            i5 = i4;
                            i9 = 4;
                            i11 = 5;
                        }
                        zzahdVar.zzc(32);
                        zzahdVar.zzc(32);
                        int zzb18 = zzahdVar.zzb(i48) + i5;
                        zzahdVar.zzc(i5);
                        if (i13 != i5) {
                            i4 = i5;
                            j2 = zzb15 * zzb16;
                        } else if (zzb15 != 0) {
                            i4 = i5;
                            j2 = (long) Math.floor(Math.pow(zzb16, 1.0d / zzb15));
                        } else {
                            i4 = i5;
                            j2 = 0;
                        }
                        zzahdVar.zzc((int) (j2 * zzb18));
                        i12++;
                        i5 = i4;
                        i9 = 4;
                        i11 = 5;
                    }
                }
            }
        }
        zzamtVar = null;
        this.zza = zzamtVar;
        if (zzamtVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        zzahg zzahgVar2 = zzamtVar.zza;
        arrayList.add(zzahgVar2.zzg);
        arrayList.add(zzamtVar.zzc);
        zzap zzc = zzahh.zzc(zzgvz.zzr(zzamtVar.zzb.zza));
        zzt zztVar = new zzt();
        zztVar.zzn(MimeTypes.AUDIO_OGG);
        zztVar.zzo(MimeTypes.AUDIO_VORBIS);
        zztVar.zzi(zzahgVar2.zzd);
        zztVar.zzj(zzahgVar2.zzc);
        zztVar.zzG(zzahgVar2.zza);
        zztVar.zzH(zzahgVar2.zzb);
        zztVar.zzr(arrayList);
        zztVar.zzl(zzc);
        zzamqVar.zza = zztVar.zzO();
        return true;
    }
}
