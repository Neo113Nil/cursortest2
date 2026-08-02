package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes9.dex */
final class zzsn extends zzsp {
    private final byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd;
    private int zze;

    public zzsn(ByteBuffer byteBuffer, boolean z11) {
        super(null);
        this.zza = byteBuffer.array();
        this.zzb = byteBuffer.position() + byteBuffer.arrayOffset();
        this.zzc = byteBuffer.limit() + byteBuffer.arrayOffset();
    }

    private final byte zzU() throws IOException {
        int i11 = this.zzb;
        if (i11 == this.zzc) {
            throw zzvk.zzj();
        }
        byte[] bArr = this.zza;
        this.zzb = i11 + 1;
        return bArr[i11];
    }

    private final int zzV() throws IOException {
        zzad(4);
        return zzW();
    }

    private final int zzW() {
        int i11 = this.zzb;
        byte[] bArr = this.zza;
        this.zzb = i11 + 4;
        return ((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
    }

    private final int zzX() throws IOException {
        int i11;
        int i12 = this.zzb;
        int i13 = this.zzc;
        if (i13 == i12) {
            throw zzvk.zzj();
        }
        byte[] bArr = this.zza;
        int i14 = i12 + 1;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            this.zzb = i14;
            return b11;
        }
        if (i13 - i14 < 9) {
            return (int) zzaa();
        }
        int i15 = i12 + 2;
        int i16 = (bArr[i14] << 7) ^ b11;
        if (i16 < 0) {
            i11 = i16 ^ (-128);
        } else {
            int i17 = i12 + 3;
            int i18 = (bArr[i15] << 14) ^ i16;
            if (i18 >= 0) {
                i11 = i18 ^ 16256;
            } else {
                int i19 = i12 + 4;
                int i21 = i18 ^ (bArr[i17] << 21);
                if (i21 < 0) {
                    i11 = (-2080896) ^ i21;
                } else {
                    i17 = i12 + 5;
                    byte b12 = bArr[i19];
                    int i22 = (i21 ^ (b12 << 28)) ^ 266354560;
                    if (b12 < 0) {
                        i19 = i12 + 6;
                        if (bArr[i17] < 0) {
                            i17 = i12 + 7;
                            if (bArr[i19] < 0) {
                                i19 = i12 + 8;
                                if (bArr[i17] < 0) {
                                    i17 = i12 + 9;
                                    if (bArr[i19] < 0) {
                                        int i23 = i12 + 10;
                                        if (bArr[i17] < 0) {
                                            throw zzvk.zze();
                                        }
                                        i15 = i23;
                                        i11 = i22;
                                    }
                                }
                            }
                        }
                        i11 = i22;
                    }
                    i11 = i22;
                }
                i15 = i19;
            }
            i15 = i17;
        }
        this.zzb = i15;
        return i11;
    }

    private final long zzY() throws IOException {
        zzad(8);
        return zzZ();
    }

    private final long zzZ() {
        int i11 = this.zzb;
        byte[] bArr = this.zza;
        this.zzb = i11 + 8;
        return ((bArr[i11 + 7] & 255) << 56) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16) | ((bArr[i11 + 3] & 255) << 24) | ((bArr[i11 + 4] & 255) << 32) | ((bArr[i11 + 5] & 255) << 40) | ((bArr[i11 + 6] & 255) << 48);
    }

    private final long zzaa() throws IOException {
        long j11 = 0;
        for (int i11 = 0; i11 < 64; i11 += 7) {
            j11 |= (r3 & Byte.MAX_VALUE) << i11;
            if ((zzU() & 128) == 0) {
                return j11;
            }
        }
        throw zzvk.zze();
    }

    private final <T> T zzab(zzwx<T> zzwxVar, zzuj zzujVar) throws IOException {
        int i11 = this.zze;
        this.zze = ((this.zzd >>> 3) << 3) | 4;
        try {
            T zze = zzwxVar.zze();
            zzwxVar.zzh(zze, this, zzujVar);
            zzwxVar.zzf(zze);
            if (this.zzd == this.zze) {
                return zze;
            }
            throw zzvk.zzg();
        } finally {
            this.zze = i11;
        }
    }

    private final <T> T zzac(zzwx<T> zzwxVar, zzuj zzujVar) throws IOException {
        int zzX = zzX();
        zzad(zzX);
        int i11 = this.zzc;
        int i12 = this.zzb + zzX;
        this.zzc = i12;
        try {
            T zze = zzwxVar.zze();
            zzwxVar.zzh(zze, this, zzujVar);
            zzwxVar.zzf(zze);
            if (this.zzb == i12) {
                return zze;
            }
            throw zzvk.zzg();
        } finally {
            this.zzc = i11;
        }
    }

    private final void zzad(int i11) throws IOException {
        if (i11 < 0 || i11 > this.zzc - this.zzb) {
            throw zzvk.zzj();
        }
    }

    private final void zzae(int i11) throws IOException {
        if (this.zzb != i11) {
            throw zzvk.zzj();
        }
    }

    private final void zzaf(int i11) throws IOException {
        if ((this.zzd & 7) != i11) {
            throw zzvk.zza();
        }
    }

    private final void zzag(int i11) throws IOException {
        zzad(i11);
        this.zzb += i11;
    }

    private final void zzah(int i11) throws IOException {
        zzad(i11);
        if ((i11 & 3) != 0) {
            throw zzvk.zzg();
        }
    }

    private final void zzai(int i11) throws IOException {
        zzad(i11);
        if ((i11 & 7) != 0) {
            throw zzvk.zzg();
        }
    }

    private final boolean zzaj() {
        return this.zzb == this.zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final void zzA(List<Double> list) throws IOException {
        int i11;
        int i12;
        if (!(list instanceof zzug)) {
            int i13 = this.zzd & 7;
            if (i13 == 1) {
                do {
                    list.add(Double.valueOf(zza()));
                    if (zzaj()) {
                        return;
                    } else {
                        i11 = this.zzb;
                    }
                } while (zzX() == this.zzd);
                this.zzb = i11;
                return;
            }
            if (i13 != 2) {
                throw zzvk.zza();
            }
            int zzX = zzX();
            zzai(zzX);
            int i14 = this.zzb + zzX;
            while (this.zzb < i14) {
                list.add(Double.valueOf(Double.longBitsToDouble(zzZ())));
            }
            return;
        }
        zzug zzugVar = (zzug) list;
        int i15 = this.zzd & 7;
        if (i15 == 1) {
            do {
                zzugVar.zze(zza());
                if (zzaj()) {
                    return;
                } else {
                    i12 = this.zzb;
                }
            } while (zzX() == this.zzd);
            this.zzb = i12;
            return;
        }
        if (i15 != 2) {
            throw zzvk.zza();
        }
        int zzX2 = zzX();
        zzai(zzX2);
        int i16 = this.zzb + zzX2;
        while (this.zzb < i16) {
            zzugVar.zze(Double.longBitsToDouble(zzZ()));
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final void zzB(List<Integer> list) throws IOException {
        int i11;
        int i12;
        if (!(list instanceof zzva)) {
            int i13 = this.zzd & 7;
            if (i13 != 0) {
                if (i13 != 2) {
                    throw zzvk.zza();
                }
                int zzX = this.zzb + zzX();
                while (this.zzb < zzX) {
                    list.add(Integer.valueOf(zzX()));
                }
                return;
            }
            do {
                list.add(Integer.valueOf(zze()));
                if (zzaj()) {
                    return;
                } else {
                    i11 = this.zzb;
                }
            } while (zzX() == this.zzd);
            this.zzb = i11;
            return;
        }
        zzva zzvaVar = (zzva) list;
        int i14 = this.zzd & 7;
        if (i14 != 0) {
            if (i14 != 2) {
                throw zzvk.zza();
            }
            int zzX2 = this.zzb + zzX();
            while (this.zzb < zzX2) {
                zzvaVar.zzh(zzX());
            }
            return;
        }
        do {
            zzvaVar.zzh(zze());
            if (zzaj()) {
                return;
            } else {
                i12 = this.zzb;
            }
        } while (zzX() == this.zzd);
        this.zzb = i12;
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final void zzC(List<Integer> list) throws IOException {
        int i11;
        int i12;
        if (!(list instanceof zzva)) {
            int i13 = this.zzd & 7;
            if (i13 == 2) {
                int zzX = zzX();
                zzah(zzX);
                int i14 = this.zzb + zzX;
                while (this.zzb < i14) {
                    list.add(Integer.valueOf(zzW()));
                }
                return;
            }
            if (i13 != 5) {
                throw zzvk.zza();
            }
            do {
                list.add(Integer.valueOf(zzf()));
                if (zzaj()) {
                    return;
                } else {
                    i11 = this.zzb;
                }
            } while (zzX() == this.zzd);
            this.zzb = i11;
            return;
        }
        zzva zzvaVar = (zzva) list;
        int i15 = this.zzd & 7;
        if (i15 == 2) {
            int zzX2 = zzX();
            zzah(zzX2);
            int i16 = this.zzb + zzX2;
            while (this.zzb < i16) {
                zzvaVar.zzh(zzW());
            }
            return;
        }
        if (i15 != 5) {
            throw zzvk.zza();
        }
        do {
            zzvaVar.zzh(zzf());
            if (zzaj()) {
                return;
            } else {
                i12 = this.zzb;
            }
        } while (zzX() == this.zzd);
        this.zzb = i12;
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final void zzD(List<Long> list) throws IOException {
        int i11;
        int i12;
        if (!(list instanceof zzvz)) {
            int i13 = this.zzd & 7;
            if (i13 == 1) {
                do {
                    list.add(Long.valueOf(zzk()));
                    if (zzaj()) {
                        return;
                    } else {
                        i11 = this.zzb;
                    }
                } while (zzX() == this.zzd);
                this.zzb = i11;
                return;
            }
            if (i13 != 2) {
                throw zzvk.zza();
            }
            int zzX = zzX();
            zzai(zzX);
            int i14 = this.zzb + zzX;
            while (this.zzb < i14) {
                list.add(Long.valueOf(zzZ()));
            }
            return;
        }
        zzvz zzvzVar = (zzvz) list;
        int i15 = this.zzd & 7;
        if (i15 == 1) {
            do {
                zzvzVar.zzf(zzk());
                if (zzaj()) {
                    return;
                } else {
                    i12 = this.zzb;
                }
            } while (zzX() == this.zzd);
            this.zzb = i12;
            return;
        }
        if (i15 != 2) {
            throw zzvk.zza();
        }
        int zzX2 = zzX();
        zzai(zzX2);
        int i16 = this.zzb + zzX2;
        while (this.zzb < i16) {
            zzvzVar.zzf(zzZ());
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final void zzE(List<Float> list) throws IOException {
        int i11;
        int i12;
        if (!(list instanceof zzuq)) {
            int i13 = this.zzd & 7;
            if (i13 == 2) {
                int zzX = zzX();
                zzah(zzX);
                int i14 = this.zzb + zzX;
                while (this.zzb < i14) {
                    list.add(Float.valueOf(Float.intBitsToFloat(zzW())));
                }
                return;
            }
            if (i13 != 5) {
                throw zzvk.zza();
            }
            do {
                list.add(Float.valueOf(zzb()));
                if (zzaj()) {
                    return;
                } else {
                    i11 = this.zzb;
                }
            } while (zzX() == this.zzd);
            this.zzb = i11;
            return;
        }
        zzuq zzuqVar = (zzuq) list;
        int i15 = this.zzd & 7;
        if (i15 == 2) {
            int zzX2 = zzX();
            zzah(zzX2);
            int i16 = this.zzb + zzX2;
            while (this.zzb < i16) {
                zzuqVar.zze(Float.intBitsToFloat(zzW()));
            }
            return;
        }
        if (i15 != 5) {
            throw zzvk.zza();
        }
        do {
            zzuqVar.zze(zzb());
            if (zzaj()) {
                return;
            } else {
                i12 = this.zzb;
            }
        } while (zzX() == this.zzd);
        this.zzb = i12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.gtm.zzww
    public final <T> void zzF(List<T> list, zzwx<T> zzwxVar, zzuj zzujVar) throws IOException {
        int i11;
        int i12 = this.zzd;
        if ((i12 & 7) != 3) {
            throw zzvk.zza();
        }
        do {
            list.add(zzab(zzwxVar, zzujVar));
            if (zzaj()) {
                return;
            } else {
                i11 = this.zzb;
            }
        } while (zzX() == i12);
        this.zzb = i11;
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final void zzG(List<Integer> list) throws IOException {
        int i11;
        int i12;
        if (!(list instanceof zzva)) {
            int i13 = this.zzd & 7;
            if (i13 == 0) {
                do {
                    list.add(Integer.valueOf(zzg()));
                    if (zzaj()) {
                        return;
                    } else {
                        i11 = this.zzb;
                    }
                } while (zzX() == this.zzd);
                this.zzb = i11;
                return;
            }
            if (i13 != 2) {
                throw zzvk.zza();
            }
            int zzX = this.zzb + zzX();
            while (this.zzb < zzX) {
                list.add(Integer.valueOf(zzX()));
            }
            zzae(zzX);
            return;
        }
        zzva zzvaVar = (zzva) list;
        int i14 = this.zzd & 7;
        if (i14 == 0) {
            do {
                zzvaVar.zzh(zzg());
                if (zzaj()) {
                    return;
                } else {
                    i12 = this.zzb;
                }
            } while (zzX() == this.zzd);
            this.zzb = i12;
            return;
        }
        if (i14 != 2) {
            throw zzvk.zza();
        }
        int zzX2 = this.zzb + zzX();
        while (this.zzb < zzX2) {
            zzvaVar.zzh(zzX());
        }
        zzae(zzX2);
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final void zzH(List<Long> list) throws IOException {
        int i11;
        int i12;
        if (!(list instanceof zzvz)) {
            int i13 = this.zzd & 7;
            if (i13 == 0) {
                do {
                    list.add(Long.valueOf(zzl()));
                    if (zzaj()) {
                        return;
                    } else {
                        i11 = this.zzb;
                    }
                } while (zzX() == this.zzd);
                this.zzb = i11;
                return;
            }
            if (i13 != 2) {
                throw zzvk.zza();
            }
            int zzX = this.zzb + zzX();
            while (this.zzb < zzX) {
                list.add(Long.valueOf(zzp()));
            }
            zzae(zzX);
            return;
        }
        zzvz zzvzVar = (zzvz) list;
        int i14 = this.zzd & 7;
        if (i14 == 0) {
            do {
                zzvzVar.zzf(zzl());
                if (zzaj()) {
                    return;
                } else {
                    i12 = this.zzb;
                }
            } while (zzX() == this.zzd);
            this.zzb = i12;
            return;
        }
        if (i14 != 2) {
            throw zzvk.zza();
        }
        int zzX2 = this.zzb + zzX();
        while (this.zzb < zzX2) {
            zzvzVar.zzf(zzp());
        }
        zzae(zzX2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.gtm.zzww
    public final <T> void zzI(List<T> list, zzwx<T> zzwxVar, zzuj zzujVar) throws IOException {
        int i11;
        int i12 = this.zzd;
        if ((i12 & 7) != 2) {
            throw zzvk.zza();
        }
        do {
            list.add(zzac(zzwxVar, zzujVar));
            if (zzaj()) {
                return;
            } else {
                i11 = this.zzb;
            }
        } while (zzX() == i12);
        this.zzb = i11;
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final void zzJ(List<Integer> list) throws IOException {
        int i11;
        int i12;
        if (!(list instanceof zzva)) {
            int i13 = this.zzd & 7;
            if (i13 == 2) {
                int zzX = zzX();
                zzah(zzX);
                int i14 = this.zzb + zzX;
                while (this.zzb < i14) {
                    list.add(Integer.valueOf(zzW()));
                }
                return;
            }
            if (i13 != 5) {
                throw zzvk.zza();
            }
            do {
                list.add(Integer.valueOf(zzh()));
                if (zzaj()) {
                    return;
                } else {
                    i11 = this.zzb;
                }
            } while (zzX() == this.zzd);
            this.zzb = i11;
            return;
        }
        zzva zzvaVar = (zzva) list;
        int i15 = this.zzd & 7;
        if (i15 == 2) {
            int zzX2 = zzX();
            zzah(zzX2);
            int i16 = this.zzb + zzX2;
            while (this.zzb < i16) {
                zzvaVar.zzh(zzW());
            }
            return;
        }
        if (i15 != 5) {
            throw zzvk.zza();
        }
        do {
            zzvaVar.zzh(zzh());
            if (zzaj()) {
                return;
            } else {
                i12 = this.zzb;
            }
        } while (zzX() == this.zzd);
        this.zzb = i12;
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final void zzK(List<Long> list) throws IOException {
        int i11;
        int i12;
        if (!(list instanceof zzvz)) {
            int i13 = this.zzd & 7;
            if (i13 == 1) {
                do {
                    list.add(Long.valueOf(zzm()));
                    if (zzaj()) {
                        return;
                    } else {
                        i11 = this.zzb;
                    }
                } while (zzX() == this.zzd);
                this.zzb = i11;
                return;
            }
            if (i13 != 2) {
                throw zzvk.zza();
            }
            int zzX = zzX();
            zzai(zzX);
            int i14 = this.zzb + zzX;
            while (this.zzb < i14) {
                list.add(Long.valueOf(zzZ()));
            }
            return;
        }
        zzvz zzvzVar = (zzvz) list;
        int i15 = this.zzd & 7;
        if (i15 == 1) {
            do {
                zzvzVar.zzf(zzm());
                if (zzaj()) {
                    return;
                } else {
                    i12 = this.zzb;
                }
            } while (zzX() == this.zzd);
            this.zzb = i12;
            return;
        }
        if (i15 != 2) {
            throw zzvk.zza();
        }
        int zzX2 = zzX();
        zzai(zzX2);
        int i16 = this.zzb + zzX2;
        while (this.zzb < i16) {
            zzvzVar.zzf(zzZ());
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final void zzL(List<Integer> list) throws IOException {
        int i11;
        int i12;
        if (!(list instanceof zzva)) {
            int i13 = this.zzd & 7;
            if (i13 != 0) {
                if (i13 != 2) {
                    throw zzvk.zza();
                }
                int zzX = this.zzb + zzX();
                while (this.zzb < zzX) {
                    list.add(Integer.valueOf(zztj.zzs(zzX())));
                }
                return;
            }
            do {
                list.add(Integer.valueOf(zzi()));
                if (zzaj()) {
                    return;
                } else {
                    i11 = this.zzb;
                }
            } while (zzX() == this.zzd);
            this.zzb = i11;
            return;
        }
        zzva zzvaVar = (zzva) list;
        int i14 = this.zzd & 7;
        if (i14 != 0) {
            if (i14 != 2) {
                throw zzvk.zza();
            }
            int zzX2 = this.zzb + zzX();
            while (this.zzb < zzX2) {
                zzvaVar.zzh(zztj.zzs(zzX()));
            }
            return;
        }
        do {
            zzvaVar.zzh(zzi());
            if (zzaj()) {
                return;
            } else {
                i12 = this.zzb;
            }
        } while (zzX() == this.zzd);
        this.zzb = i12;
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final void zzM(List<Long> list) throws IOException {
        int i11;
        int i12;
        if (!(list instanceof zzvz)) {
            int i13 = this.zzd & 7;
            if (i13 != 0) {
                if (i13 != 2) {
                    throw zzvk.zza();
                }
                int zzX = this.zzb + zzX();
                while (this.zzb < zzX) {
                    list.add(Long.valueOf(zztj.zzt(zzp())));
                }
                return;
            }
            do {
                list.add(Long.valueOf(zzn()));
                if (zzaj()) {
                    return;
                } else {
                    i11 = this.zzb;
                }
            } while (zzX() == this.zzd);
            this.zzb = i11;
            return;
        }
        zzvz zzvzVar = (zzvz) list;
        int i14 = this.zzd & 7;
        if (i14 != 0) {
            if (i14 != 2) {
                throw zzvk.zza();
            }
            int zzX2 = this.zzb + zzX();
            while (this.zzb < zzX2) {
                zzvzVar.zzf(zztj.zzt(zzp()));
            }
            return;
        }
        do {
            zzvzVar.zzf(zzn());
            if (zzaj()) {
                return;
            } else {
                i12 = this.zzb;
            }
        } while (zzX() == this.zzd);
        this.zzb = i12;
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final void zzN(List<String> list) throws IOException {
        zzO(list, false);
    }

    public final void zzO(List<String> list, boolean z11) throws IOException {
        int i11;
        int i12;
        if ((this.zzd & 7) != 2) {
            throw zzvk.zza();
        }
        if (!(list instanceof zzvs) || z11) {
            do {
                list.add(zzw(z11));
                if (zzaj()) {
                    return;
                } else {
                    i11 = this.zzb;
                }
            } while (zzX() == this.zzd);
            this.zzb = i11;
            return;
        }
        zzvs zzvsVar = (zzvs) list;
        do {
            zzvsVar.zzi(zzq());
            if (zzaj()) {
                return;
            } else {
                i12 = this.zzb;
            }
        } while (zzX() == this.zzd);
        this.zzb = i12;
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final void zzP(List<String> list) throws IOException {
        zzO(list, true);
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final void zzQ(List<Integer> list) throws IOException {
        int i11;
        int i12;
        if (!(list instanceof zzva)) {
            int i13 = this.zzd & 7;
            if (i13 != 0) {
                if (i13 != 2) {
                    throw zzvk.zza();
                }
                int zzX = this.zzb + zzX();
                while (this.zzb < zzX) {
                    list.add(Integer.valueOf(zzX()));
                }
                return;
            }
            do {
                list.add(Integer.valueOf(zzj()));
                if (zzaj()) {
                    return;
                } else {
                    i11 = this.zzb;
                }
            } while (zzX() == this.zzd);
            this.zzb = i11;
            return;
        }
        zzva zzvaVar = (zzva) list;
        int i14 = this.zzd & 7;
        if (i14 != 0) {
            if (i14 != 2) {
                throw zzvk.zza();
            }
            int zzX2 = this.zzb + zzX();
            while (this.zzb < zzX2) {
                zzvaVar.zzh(zzX());
            }
            return;
        }
        do {
            zzvaVar.zzh(zzj());
            if (zzaj()) {
                return;
            } else {
                i12 = this.zzb;
            }
        } while (zzX() == this.zzd);
        this.zzb = i12;
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final void zzR(List<Long> list) throws IOException {
        int i11;
        int i12;
        if (!(list instanceof zzvz)) {
            int i13 = this.zzd & 7;
            if (i13 == 0) {
                do {
                    list.add(Long.valueOf(zzo()));
                    if (zzaj()) {
                        return;
                    } else {
                        i11 = this.zzb;
                    }
                } while (zzX() == this.zzd);
                this.zzb = i11;
                return;
            }
            if (i13 != 2) {
                throw zzvk.zza();
            }
            int zzX = this.zzb + zzX();
            while (this.zzb < zzX) {
                list.add(Long.valueOf(zzp()));
            }
            zzae(zzX);
            return;
        }
        zzvz zzvzVar = (zzvz) list;
        int i14 = this.zzd & 7;
        if (i14 == 0) {
            do {
                zzvzVar.zzf(zzo());
                if (zzaj()) {
                    return;
                } else {
                    i12 = this.zzb;
                }
            } while (zzX() == this.zzd);
            this.zzb = i12;
            return;
        }
        if (i14 != 2) {
            throw zzvk.zza();
        }
        int zzX2 = this.zzb + zzX();
        while (this.zzb < zzX2) {
            zzvzVar.zzf(zzp());
        }
        zzae(zzX2);
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final boolean zzS() throws IOException {
        zzaf(0);
        return zzX() != 0;
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final boolean zzT() throws IOException {
        int i11;
        int i12;
        if (zzaj() || (i11 = this.zzd) == (i12 = this.zze)) {
            return false;
        }
        int i13 = i11 & 7;
        if (i13 == 0) {
            int i14 = this.zzc;
            int i15 = this.zzb;
            if (i14 - i15 >= 10) {
                byte[] bArr = this.zza;
                int i16 = 0;
                while (i16 < 10) {
                    int i17 = i15 + 1;
                    if (bArr[i15] >= 0) {
                        this.zzb = i17;
                        break;
                    }
                    i16++;
                    i15 = i17;
                }
            }
            for (int i18 = 0; i18 < 10; i18++) {
                if (zzU() >= 0) {
                    return true;
                }
            }
            throw zzvk.zze();
        }
        if (i13 == 1) {
            zzag(8);
            return true;
        }
        if (i13 == 2) {
            zzag(zzX());
            return true;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw zzvk.zza();
            }
            zzag(4);
            return true;
        }
        this.zze = ((i11 >>> 3) << 3) | 4;
        while (zzc() != Integer.MAX_VALUE && zzT()) {
        }
        if (this.zzd != this.zze) {
            throw zzvk.zzg();
        }
        this.zze = i12;
        return true;
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final double zza() throws IOException {
        zzaf(1);
        return Double.longBitsToDouble(zzY());
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final float zzb() throws IOException {
        zzaf(5);
        return Float.intBitsToFloat(zzV());
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final int zzc() throws IOException {
        if (zzaj()) {
            return Integer.MAX_VALUE;
        }
        int zzX = zzX();
        this.zzd = zzX;
        if (zzX == this.zze) {
            return Integer.MAX_VALUE;
        }
        return zzX >>> 3;
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final int zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final int zze() throws IOException {
        zzaf(0);
        return zzX();
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final int zzf() throws IOException {
        zzaf(5);
        return zzV();
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final int zzg() throws IOException {
        zzaf(0);
        return zzX();
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final int zzh() throws IOException {
        zzaf(5);
        return zzV();
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final int zzi() throws IOException {
        zzaf(0);
        return zztj.zzs(zzX());
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final int zzj() throws IOException {
        zzaf(0);
        return zzX();
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final long zzk() throws IOException {
        zzaf(1);
        return zzY();
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final long zzl() throws IOException {
        zzaf(0);
        return zzp();
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final long zzm() throws IOException {
        zzaf(1);
        return zzY();
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final long zzn() throws IOException {
        zzaf(0);
        return zztj.zzt(zzp());
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final long zzo() throws IOException {
        zzaf(0);
        return zzp();
    }

    public final long zzp() throws IOException {
        long j11;
        long j12;
        int i11 = this.zzb;
        int i12 = this.zzc;
        if (i12 == i11) {
            throw zzvk.zzj();
        }
        byte[] bArr = this.zza;
        int i13 = i11 + 1;
        byte b11 = bArr[i11];
        if (b11 >= 0) {
            this.zzb = i13;
            return b11;
        }
        if (i12 - i13 < 9) {
            return zzaa();
        }
        int i14 = i11 + 2;
        int i15 = (bArr[i13] << 7) ^ b11;
        if (i15 < 0) {
            j11 = i15 ^ (-128);
        } else {
            int i16 = i11 + 3;
            int i17 = (bArr[i14] << 14) ^ i15;
            if (i17 >= 0) {
                j11 = i17 ^ 16256;
            } else {
                int i18 = i11 + 4;
                int i19 = i17 ^ (bArr[i16] << 21);
                if (i19 < 0) {
                    long j13 = (-2080896) ^ i19;
                    i14 = i18;
                    j11 = j13;
                } else {
                    i16 = i11 + 5;
                    long j14 = i19 ^ (bArr[i18] << 28);
                    if (j14 >= 0) {
                        j11 = j14 ^ 266354560;
                    } else {
                        i14 = i11 + 6;
                        long j15 = (bArr[i16] << 35) ^ j14;
                        if (j15 < 0) {
                            j12 = -34093383808L;
                        } else {
                            int i21 = i11 + 7;
                            long j16 = j15 ^ (bArr[i14] << 42);
                            if (j16 >= 0) {
                                j11 = j16 ^ 4363953127296L;
                            } else {
                                i14 = i11 + 8;
                                j15 = j16 ^ (bArr[i21] << 49);
                                if (j15 < 0) {
                                    j12 = -558586000294016L;
                                } else {
                                    i21 = i11 + 9;
                                    long j17 = (j15 ^ (bArr[i14] << 56)) ^ 71499008037633920L;
                                    if (j17 < 0) {
                                        i14 = i11 + 10;
                                        if (bArr[i21] < 0) {
                                            throw zzvk.zze();
                                        }
                                        j11 = j17;
                                    } else {
                                        j11 = j17;
                                    }
                                }
                            }
                            i14 = i21;
                        }
                        j11 = j15 ^ j12;
                    }
                }
            }
            i14 = i16;
        }
        this.zzb = i14;
        return j11;
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final zztd zzq() throws IOException {
        zzaf(2);
        int zzX = zzX();
        if (zzX == 0) {
            return zztd.zzb;
        }
        zzad(zzX);
        zztd zzq = zztd.zzq(this.zza, this.zzb, zzX);
        this.zzb += zzX;
        return zzq;
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final <T> T zzr(Class<T> cls, zzuj zzujVar) throws IOException {
        zzaf(3);
        return (T) zzab(zzwt.zza().zzb(cls), zzujVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final <T> T zzs(zzwx<T> zzwxVar, zzuj zzujVar) throws IOException {
        zzaf(3);
        return (T) zzab(zzwxVar, zzujVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final <T> T zzt(Class<T> cls, zzuj zzujVar) throws IOException {
        zzaf(2);
        return (T) zzac(zzwt.zza().zzb(cls), zzujVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final <T> T zzu(zzwx<T> zzwxVar, zzuj zzujVar) throws IOException {
        zzaf(2);
        return (T) zzac(zzwxVar, zzujVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final String zzv() throws IOException {
        return zzw(false);
    }

    public final String zzw(boolean z11) throws IOException {
        zzaf(2);
        int zzX = zzX();
        if (zzX == 0) {
            return "";
        }
        zzad(zzX);
        if (z11) {
            byte[] bArr = this.zza;
            int i11 = this.zzb;
            if (!zzyd.zzf(bArr, i11, i11 + zzX)) {
                throw zzvk.zzd();
            }
        }
        String str = new String(this.zza, this.zzb, zzX, zzvi.zza);
        this.zzb += zzX;
        return str;
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final String zzx() throws IOException {
        return zzw(true);
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final void zzy(List<Boolean> list) throws IOException {
        int i11;
        int i12;
        if (!(list instanceof zzsr)) {
            int i13 = this.zzd & 7;
            if (i13 != 0) {
                if (i13 != 2) {
                    throw zzvk.zza();
                }
                int zzX = this.zzb + zzX();
                while (this.zzb < zzX) {
                    list.add(Boolean.valueOf(zzX() != 0));
                }
                zzae(zzX);
                return;
            }
            do {
                list.add(Boolean.valueOf(zzS()));
                if (zzaj()) {
                    return;
                } else {
                    i11 = this.zzb;
                }
            } while (zzX() == this.zzd);
            this.zzb = i11;
            return;
        }
        zzsr zzsrVar = (zzsr) list;
        int i14 = this.zzd & 7;
        if (i14 != 0) {
            if (i14 != 2) {
                throw zzvk.zza();
            }
            int zzX2 = this.zzb + zzX();
            while (this.zzb < zzX2) {
                zzsrVar.zze(zzX() != 0);
            }
            zzae(zzX2);
            return;
        }
        do {
            zzsrVar.zze(zzS());
            if (zzaj()) {
                return;
            } else {
                i12 = this.zzb;
            }
        } while (zzX() == this.zzd);
        this.zzb = i12;
    }

    @Override // com.google.android.gms.internal.gtm.zzww
    public final void zzz(List<zztd> list) throws IOException {
        int i11;
        if ((this.zzd & 7) != 2) {
            throw zzvk.zza();
        }
        do {
            list.add(zzq());
            if (zzaj()) {
                return;
            } else {
                i11 = this.zzb;
            }
        } while (zzX() == this.zzd);
        this.zzb = i11;
    }
}
